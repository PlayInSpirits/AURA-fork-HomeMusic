package aura.build;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.Enumeration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/**
 * Adds the prebuilt dex as the next classesN.dex of an unsigned APK produced by AGP.
 * The result must still be zipaligned and signed (done by the release workflow).
 */
public final class DexInjector {
    private DexInjector() {}

    private static final Pattern DEX = Pattern.compile("classes(\\d*)\\.dex");

    public static String inject(File inApk, File dex, File outApk) throws IOException {
        int max = 0;
        try (ZipFile zip = new ZipFile(inApk)) {
            for (Enumeration<? extends ZipEntry> en = zip.entries(); en.hasMoreElements(); ) {
                Matcher m = DEX.matcher(en.nextElement().getName());
                if (m.matches()) max = Math.max(max, m.group(1).isEmpty() ? 1 : Integer.parseInt(m.group(1)));
            }
            if (max == 0) throw new IOException("no classes.dex in " + inApk);
            String name = "classes" + (max + 1) + ".dex";
            Files.createDirectories(outApk.getParentFile().toPath());
            try (ZipOutputStream out = new ZipOutputStream(new FileOutputStream(outApk))) {
                for (Enumeration<? extends ZipEntry> en = zip.entries(); en.hasMoreElements(); ) {
                    ZipEntry e = en.nextElement();
                    if (e.getName().startsWith("META-INF/") && (e.getName().endsWith(".SF") || e.getName().endsWith(".RSA") || e.getName().endsWith(".EC") || e.getName().endsWith(".MF"))) continue;
                    byte[] data;
                    try (InputStream in = zip.getInputStream(e)) { data = readAll(in); }
                    putEntry(out, e.getName(), data, e.getMethod() == ZipEntry.STORED);
                }
                byte[] dexBytes;
                try (InputStream in = new FileInputStream(dex)) { dexBytes = readAll(in); }
                putEntry(out, name, dexBytes, true);
            }
            return name;
        }
    }

    private static void putEntry(ZipOutputStream out, String name, byte[] data, boolean stored) throws IOException {
        ZipEntry n = new ZipEntry(name);
        n.setTime(0L);
        if (stored) {
            CRC32 crc = new CRC32();
            crc.update(data);
            n.setMethod(ZipEntry.STORED);
            n.setSize(data.length);
            n.setCompressedSize(data.length);
            n.setCrc(crc.getValue());
        } else {
            n.setMethod(ZipEntry.DEFLATED);
        }
        out.putNextEntry(n);
        out.write(data);
        out.closeEntry();
    }

    private static byte[] readAll(InputStream in) throws IOException {
        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        byte[] buf = new byte[1 << 16];
        int r;
        while ((r = in.read(buf)) > 0) bo.write(buf, 0, r);
        return bo.toByteArray();
    }
}
