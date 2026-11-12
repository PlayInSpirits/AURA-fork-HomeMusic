package defpackage;

import com.eddyizm.tempus.homemusic.HubAppRelease;
import com.eddyizm.tempus.homemusic.HubUpdateFile;
import com.eddyizm.tempus.homemusic.HubUpdatePatch;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d25 {
    public static final ux3 a = null;

    static {
        a = new ux3("[0-9a-f]{64}");
    }

    public static long a(int r8, byte[] r9) {
        int r0 = r8 + 7;
        long r1 = r9[r0] & 127;
        int r3 = 6;
    L4:
        if ((-1) >= r3) goto L7;
        r1 = (r1 << 8) | (((long) r9[r8 + r3]) & 255);
        r3 = r3 - 1;
        goto L4
    L7:
        if ((r9[r0] & 128) != 0) goto L9;
        return r1;
    L9:
        mj0.i("Negative patch header");
        return 0;
    }

    public static void b(File r16, File r17, File r18, HubUpdatePatch r19, HubUpdateFile r20) {
        if (e(r20, "apk") == true) goto L5;
    L85:
        mj0.i("Invalid target description");
        return;
    L5:
        if (r20.getSize() > 33554432) goto L85;
        long r2 = r16.length();
        if (1 <= r2) goto L9;
    L83:
        mj0.i("База обновления изменилась");
        return;
    L9:
        if (r2 >= 33554433) goto L83;
        if (d(r16).equalsIgnoreCase(r19.getBaseSha256()) == false) goto L83;
        if (r17.length() == r19.getSize()) goto L15;
    L81:
        mj0.i("Неверный размер обновления");
        return;
    L15:
        if (r19.getSize() > 16777216) goto L81;
        if (d(r17).equalsIgnoreCase(r19.getSha256()) == false) goto L79;
        byte[] r0 = ji2.F(r17);
        long r3 = r20.getSize();
        if (r0.length < 32) goto L77;
        byte[] r6 = ti.d0(r0, 0, 8);
        byte[] r9 = "BSDIFF40".getBytes(w10.a);
        r9.getClass();
        if (Arrays.equals(r6, r9) == false) goto L77;
        long r8 = a(8, r0);
        long r10 = a(16, r0);
        long r12 = a(24, r0);
        if (r3 > 0) goto L25;
    L75:
        mj0.i("Invalid patch sizes");
        return;
    L25:
        if (r3 > 33554432) goto L75;
        if (r12 != r3) goto L75;
        if (r8 < 4) goto L75;
        if (r10 < 4) goto L75;
        if (r8 > (((long) r0.length) - 32)) goto L75;
        if (r10 > ((((long) r0.length) - 32) - r8)) goto L75;
        if ((((((long) r0.length) - 32) - r8) - r10) < 4) goto L75;
        int r4 = ((int) r8) + 32;
        Iterator r5 = gb.P(new Integer[]{32, Integer.valueOf(r4), Integer.valueOf(r4 + ((int) r10))}).iterator();
    L40:
        if (r5.hasNext() == false) goto L91;
        int r7 = ((Number) r5.next()).intValue();
        if (r0[r7] != 66) goto L52;
        if (r0[r7 + 1] != 90) goto L52;
        if (r0[r7 + 2] != 104) goto L52;
        byte r11 = r0[r7 + 3];
        if (49 > r11) goto L52;
        if (r11 < 58) goto L40;
    L52:
        mj0.i("Unsupported patch compression");
        return;
    L91:
        FileOutputStream r13 = new FileOutputStream(r18);     // Catch: Exception -> L70 IOException -> L73
        hw.G(ji2.F(r16), r0, r13);     // Catch: Throwable -> L64
        r13.close();     // Catch: Exception -> L70 IOException -> L73
        if (r18.length() == r20.getSize()) goto L60;
    L62:
        mj0.i("Повреждённый APK");
        return;
    L60:
        if (d(r18).equalsIgnoreCase(r20.getSha256()) == false) goto L62;
        return;
    L64:
        th = move-exception;
        throw th;     // Catch: Throwable -> L67
    L67:
        th = move-exception;
        q05.h(r13, th);     // Catch: Exception -> L70 IOException -> L73
        throw th;     // Catch: Exception -> L70 IOException -> L73
    L73:
        e = move-exception;
        throw e;
    L70:
        e = move-exception;
        throw new IOException("Обновление не применилось", e);
    L77:
        mj0.i("Invalid patch header");
        return;
    L79:
        mj0.i("Контрольная сумма не совпала");
    }

    public static HubUpdatePatch c(HubAppRelease r9, String r10) {
        HubUpdateFile r0 = r9.getFull();
        Object r2 = null;
        if (e(r0, "apk") == false) goto L53;
        r0.getClass();
        if (r0.getSize() > 33554432) goto L54;
        List<HubUpdatePatch> r11 = r9.getPatches();
        if (r11 != null) goto L10;
        r11 = u01.n;
    L10:
        ArrayList r1 = new ArrayList();
        Iterator<T> r12 = r11.iterator();
    L12:
        if (r12.hasNext() == false) goto L24;
        Object r3 = r12.next();
        HubUpdatePatch r4 = (HubUpdatePatch) r3;
        if (h12.c(r4.getFormat(), "bsdiff40-v1") == false) goto L12;
        if (r4.getBaseVersionCode() != 43) goto L12;
        if (h12.c(r4.getBaseSha256(), r10) == false) goto L12;
        if (e(r4, "patch") == false) goto L12;
        if (r4.getSize() >= r0.getSize()) goto L12;
        r1.add(r3);
        goto L12
    L24:
        Iterator r13 = r1.iterator();
        if (r13.hasNext() == false) goto L37;
        r2 = r13.next();
        if (r13.hasNext() == false) goto L37;
        long r5 = ((HubUpdatePatch) r2).getSize();
    L31:
        Object r14 = r13.next();
        long r6 = ((HubUpdatePatch) r14).getSize();
        if (r5 <= r6) goto L35;
        r2 = r14;
        r5 = r6;
    L35:
        if (r13.hasNext() == true) goto L31;
    L37:
        return (HubUpdatePatch) r2;
    L54:
        return null;
    L53:
        return null;
    }

    public static String d(File r7) {
        MessageDigest r0 = MessageDigest.getInstance("SHA-256");
        FileInputStream r1 = new FileInputStream(r7);
        byte[] r8 = new byte[65536];     // Catch: Throwable -> L8
    L4:
        int r2 = r1.read(r8);     // Catch: Throwable -> L8
        int r3 = 0;
        if (r2 < 0) goto L10;
        r0.update(r8, 0, r2);     // Catch: Throwable -> L8
        goto L4
    L10:
        r1.close();
        byte[] r9 = r0.digest();
        r9.getClass();
        StringBuilder r4 = new StringBuilder();
        r4.append("");
        int r5 = r9.length;
        int r6 = 0;
    L11:
        if (r3 >= r5) goto L16;
        byte r10 = r9[r3];
        r6 = r6 + 1;
        if (r6 <= 1) goto L15;
        r4.append("");
    L15:
        r4.append(String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(r10)}, 1)));
        r3 = r3 + 1;
        goto L11
    L16:
        r4.append("");
        return r4.toString();
    L8:
        th = move-exception;
        throw th;     // Catch: Throwable -> L19
    L19:
        th = move-exception;
        q05.h(r1, th);
        throw th;
    }

    public static boolean e(HubUpdateFile r5, String r6) {
        if (r5 != null) goto L4;
        return false;
    L4:
        if (r5.getSize() <= 0) goto L32;
        long r0 = r5.getSize();
        String r2 = "apk";
        if (r6.equals("apk") == false) goto L8;
        long r3 = 134217728;
    L10:
        if (r0 > r3) goto L33;
        String r1 = r5.getSha256();
        if (r1 != null) goto L16;
        return false;
    L16:
        if (a.a(r1) == true) goto L19;
        return false;
    L19:
        if (r6.equals("apk") == true) goto L22;
        r2 = "bsdiff";
    L22:
        String r7 = r5.getUrl();
        if (r6.equals("apk") == true) goto L25;
    L28:
        StringBuilder r8 = b11.u("/app/artifacts/", r6, "-", r1, ".");
        r8.append(r2);
        return h12.c(r7, r8.toString());
    L25:
        if (r7.startsWith("https://github.com/PlayInSpirits/HomeMusic-Fork/releases/download/") == false) goto L28;
        return r7.endsWith(".apk");
    L33:
        return false;
    L8:
        r3 = 16777216;
        goto L10
    L32:
        return false;
    }
}
