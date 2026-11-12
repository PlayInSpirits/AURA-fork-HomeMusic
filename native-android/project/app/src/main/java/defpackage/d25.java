package defpackage;

import com.eddyizm.tempus.homemusic.HubAppRelease;
import com.eddyizm.tempus.homemusic.HubUpdateFile;
import com.eddyizm.tempus.homemusic.HubUpdatePatch;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d25 {
    public static final ux3 a = new ux3("[0-9a-f]{64}");

    public static long a(int i, byte[] bArr) throws IOException {
        int i2 = i + 7;
        long j = bArr[i2] & 127;
        for (int i3 = 6; -1 < i3; i3--) {
            j = (j << 8) | (((long) bArr[i + i3]) & 255);
        }
        if ((bArr[i2] & 128) == 0) {
            return j;
        }
        mj0.i("Negative patch header");
        return 0L;
    }

    public static void b(File file, File file2, File file3, HubUpdatePatch hubUpdatePatch, HubUpdateFile hubUpdateFile) throws IOException {
        byte b;
        if (!e(hubUpdateFile, "apk") || hubUpdateFile.getSize() > 33554432) {
            mj0.i("Invalid target description");
            return;
        }
        long length = file.length();
        if (1 > length || length >= 33554433 || !d(file).equalsIgnoreCase(hubUpdatePatch.getBaseSha256())) {
            mj0.i("База обновления изменилась");
            return;
        }
        if (file2.length() != hubUpdatePatch.getSize() || hubUpdatePatch.getSize() > 16777216) {
            mj0.i("Неверный размер обновления");
            return;
        }
        if (!d(file2).equalsIgnoreCase(hubUpdatePatch.getSha256())) {
            mj0.i("Контрольная сумма не совпала");
            return;
        }
        byte[] bArrF = ji2.F(file2);
        long size = hubUpdateFile.getSize();
        if (bArrF.length >= 32) {
            byte[] bArrD0 = ti.d0(bArrF, 0, 8);
            byte[] bytes = "BSDIFF40".getBytes(w10.a);
            bytes.getClass();
            if (Arrays.equals(bArrD0, bytes)) {
                long jA = a(8, bArrF);
                long jA2 = a(16, bArrF);
                long jA3 = a(24, bArrF);
                if (size <= 0 || size > 33554432 || jA3 != size || jA < 4 || jA2 < 4 || jA > ((long) bArrF.length) - 32 || jA2 > (((long) bArrF.length) - 32) - jA || ((((long) bArrF.length) - 32) - jA) - jA2 < 4) {
                    mj0.i("Invalid patch sizes");
                    return;
                }
                int i = ((int) jA) + 32;
                Iterator it = gb.P(32, Integer.valueOf(i), Integer.valueOf(i + ((int) jA2))).iterator();
                while (it.hasNext()) {
                    int iIntValue = ((Number) it.next()).intValue();
                    if (bArrF[iIntValue] != 66 || bArrF[iIntValue + 1] != 90 || bArrF[iIntValue + 2] != 104 || 49 > (b = bArrF[iIntValue + 3]) || b >= 58) {
                        mj0.i("Unsupported patch compression");
                        return;
                    }
                }
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file3);
                    try {
                        hw.G(ji2.F(file), bArrF, fileOutputStream);
                        fileOutputStream.close();
                        if (file3.length() == hubUpdateFile.getSize() && d(file3).equalsIgnoreCase(hubUpdateFile.getSha256())) {
                            return;
                        }
                        mj0.i("Повреждённый APK");
                        return;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            q05.h(fileOutputStream, th);
                            throw th2;
                        }
                    }
                } catch (IOException e) {
                    throw e;
                } catch (Exception e2) {
                    throw new IOException("Обновление не применилось", e2);
                }
            }
        }
        mj0.i("Invalid patch header");
    }

    public static HubUpdatePatch c(HubAppRelease hubAppRelease, String str) {
        HubUpdateFile full = hubAppRelease.getFull();
        Object next = null;
        if (!e(full, "apk")) {
            return null;
        }
        full.getClass();
        if (full.getSize() > 33554432) {
            return null;
        }
        List<HubUpdatePatch> patches = hubAppRelease.getPatches();
        if (patches == null) {
            patches = u01.n;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : patches) {
            HubUpdatePatch hubUpdatePatch = (HubUpdatePatch) obj;
            if (h12.c(hubUpdatePatch.getFormat(), "bsdiff40-v1") && hubUpdatePatch.getBaseVersionCode() == 43 && h12.c(hubUpdatePatch.getBaseSha256(), str) && e(hubUpdatePatch, "patch") && hubUpdatePatch.getSize() < full.getSize()) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                long size = ((HubUpdatePatch) next).getSize();
                do {
                    Object next2 = it.next();
                    long size2 = ((HubUpdatePatch) next2).getSize();
                    if (size > size2) {
                        next = next2;
                        size = size2;
                    }
                } while (it.hasNext());
            }
        }
        return (HubUpdatePatch) next;
    }

    public static String d(File file) throws NoSuchAlgorithmException, IOException {
        int i;
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            byte[] bArr = new byte[65536];
            while (true) {
                int i2 = fileInputStream.read(bArr);
                if (i2 < 0) {
                    break;
                }
                messageDigest.update(bArr, 0, i2);
            }
            fileInputStream.close();
            byte[] bArrDigest = messageDigest.digest();
            bArrDigest.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append((CharSequence) "");
            int i3 = 0;
            for (byte b : bArrDigest) {
                i3++;
                if (i3 > 1) {
                    sb.append((CharSequence) "");
                }
                sb.append((CharSequence) String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1)));
            }
            sb.append((CharSequence) "");
            return sb.toString();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                q05.h(fileInputStream, th);
                throw th2;
            }
        }
    }

    public static boolean e(HubUpdateFile hubUpdateFile, String str) {
        String sha256;
        if (hubUpdateFile == null || hubUpdateFile.getSize() <= 0) {
            return false;
        }
        if (hubUpdateFile.getSize() > (str.equals("apk") ? 134217728L : 16777216L) || (sha256 = hubUpdateFile.getSha256()) == null || !a.a(sha256)) {
            return false;
        }
        String str2 = str.equals("apk") ? "apk" : "bsdiff";
        String url = hubUpdateFile.getUrl();
        if (str.equals("apk") && url.startsWith("https://github.com/PlayInSpirits/HomeMusic-Fork/releases/download/")) {
            return url.endsWith(".apk");
        }
        StringBuilder sbU = b11.u("/app/artifacts/", str, "-", sha256, ".");
        sbU.append(str2);
        return h12.c(url, sbU.toString());
    }
}
