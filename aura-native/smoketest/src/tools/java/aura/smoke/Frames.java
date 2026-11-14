package aura.smoke;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;

import java.io.*;
import java.util.*;
import java.util.zip.*;

/**
 * Frames <out.jar> <in.jar> <lib.jar>... : rewrites dex2jar output as Java 8 bytecode with
 * StackMapTable frames (computed with ASM over the app + library class hierarchy), so the
 * JVM can verify and run it under Robolectric. Classes ASM cannot frame fall back to major 50.
 */
public final class Frames {
    static final Map<String, String[]> H = new HashMap<>(); // name -> {super, isInterface}

    static void index(File jar) throws IOException {
        try (ZipInputStream z = new ZipInputStream(new FileInputStream(jar))) {
            for (ZipEntry e; (e = z.getNextEntry()) != null; ) {
                if (!e.getName().endsWith(".class")) continue;
                ClassReader r = new ClassReader(z.readAllBytes());
                H.putIfAbsent(r.getClassName(), new String[]{r.getSuperName(), (r.getAccess() & Opcodes.ACC_INTERFACE) != 0 ? "1" : "0"});
            }
        }
    }

    static List<String> chain(String n) {
        List<String> l = new ArrayList<>();
        while (n != null) { l.add(n); String[] h = H.get(n); n = h == null ? (n.equals("java/lang/Object") ? null : "java/lang/Object") : h[0]; }
        return l;
    }

    public static void main(String[] a) throws Exception {
        for (int i = 1; i < a.length; i++) index(new File(a[i]));
        int ok = 0, fallback = 0;
        try (ZipInputStream z = new ZipInputStream(new FileInputStream(a[1]));
             ZipOutputStream out = new ZipOutputStream(new FileOutputStream(a[0]))) {
            for (ZipEntry e; (e = z.getNextEntry()) != null; ) {
                byte[] b = z.readAllBytes();
                if (e.getName().endsWith(".class")) {
                    try {
                        ClassReader r = new ClassReader(b);
                        ClassWriter w = new ClassWriter(ClassWriter.COMPUTE_FRAMES) {
                            @Override protected String getCommonSuperClass(String t1, String t2) {
                                String[] h1 = H.get(t1), h2 = H.get(t2);
                                if ((h1 != null && "1".equals(h1[1])) || (h2 != null && "1".equals(h2[1]))) return "java/lang/Object";
                                List<String> c1 = chain(t1);
                                for (String s : chain(t2)) if (c1.contains(s)) return s;
                                return "java/lang/Object";
                            }
                        };
                        r.accept(new org.objectweb.asm.ClassVisitor(Opcodes.ASM9, w) {
                            @Override public void visit(int v, int acc, String n, String sig, String sup, String[] itf) {
                                super.visit(Opcodes.V1_8, acc, n, sig, sup, itf);
                            }
                        }, ClassReader.SKIP_FRAMES);
                        b = w.toByteArray();
                        ok++;
                    } catch (Throwable t) {
                        if (((b[6] & 0xff) << 8 | (b[7] & 0xff)) > 50) { b[6] = 0; b[7] = 50; }
                        fallback++;
                    }
                }
                out.putNextEntry(new ZipEntry(e.getName()));
                out.write(b);
                out.closeEntry();
            }
        }
        System.out.println("framed " + ok + ", fallback " + fallback + " -> " + a[0]);
    }
}
