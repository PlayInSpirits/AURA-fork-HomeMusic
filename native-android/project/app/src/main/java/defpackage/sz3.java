package defpackage;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sz3 {
    public static we5 a(hu2 r7, byte[] r8, int r9, int r10) {
        r8.getClass();
        xe5.a(r8.length, r9, r10);
        return new we5(r7, r8, r10, r9);
    }

    public static we5 b(String r2, hu2 r3) {
        r2.getClass();
        kd3 r4 = ud3.d(r3);
        Charset r0 = (Charset) r4.n;
        hu2 r5 = (hu2) r4.o;
        byte[] r6 = r2.getBytes(r0);
        r6.getClass();
        return a(r5, r6, 0, r6.length);
    }

    public static /* synthetic */ we5 c(sz3 r1, byte[] r2, hu2 r3, int r4, int r5) {
        if ((r5 & 1) == 0) goto L6;
        r3 = null;
    L6:
        if ((r5 & 2) == 0) goto L8;
        r4 = 0;
    L8:
        int r6 = r2.length;
        r1.getClass();
        return a(r3, r2, r4, r6);
    }
}
