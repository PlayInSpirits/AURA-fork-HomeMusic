package defpackage;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class m14 {
    public static fv3 a(String r7, hu2 r8) {
        r7.getClass();
        kd3 r9 = ud3.d(r8);
        Charset r0 = (Charset) r9.n;
        hu2 r2 = (hu2) r9.o;
        tv r5 = new tv();
        r0.getClass();
        int r10 = r7.length();
        r7.getClass();
        r0.getClass();
        if (r10 >= 0) goto L5;
        kf2.e(xa3.e(r10, 0, "endIndex < beginIndex: ", " < "));
    L14:
        return new fv3(r2, r5.o, r5, 1);
    L5:
        if (r10 <= r7.length()) goto L7;
        StringBuilder r11 = f34.j(r10, "endIndex > string.length: ", " > ");
        r11.append(r7.length());
        throw new IllegalArgumentException(r11.toString().toString());
    L7:
        if (r0.equals(w10.a) == false) goto L9;
        r5.e0(r7, 0, r10);
        goto L14
    L9:
        byte[] r12 = r7.substring(0, r10).getBytes(r0);
        r12.getClass();
        r5.m78write(r12, 0, r12.length);
        goto L14
    }

    public static fv3 b(byte[] r7, hu2 r8) {
        r7.getClass();
        m14 r0 = n14.Companion;
        tv r5 = new tv();
        r5.m78write(r7, 0, r7.length);
        long r3 = r7.length;
        r0.getClass();
        return new fv3(r8, r3, r5, 1);
    }
}
