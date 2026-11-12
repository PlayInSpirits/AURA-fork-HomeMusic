package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xn0 extends i90 {
    public ByteArrayInputStream o;
    public cu1 p;
    public final byte[] q;

    public xn0(ByteArrayInputStream r3) {
        cu1 r0 = new cu1(r3);
        this.q = new byte[1];
        this.p = r0;
        this.o = r3;
    }

    @Override // java.io.InputStream
    public final int available() {
        cu1 r0 = this.p;
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.o.e();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        cu1 r1 = this.p;     // Catch: Throwable -> L11
        if (r1 != null) goto L17;
    L6:
        this.p = null;     // Catch: Throwable -> L11
        ByteArrayInputStream r2 = this.o;
        if (r2 == null) goto L21;
        r2.close();
        this.o = null;
        return;
    L21:
        return;
    L17:
        r1.close();     // Catch: IOException -> L16 Throwable -> L11
    L11:
        th = move-exception;
        ByteArrayInputStream r3 = this.o;
        if (r3 == null) goto L15;
        r3.close();
        this.o = null;
    L15:
        throw th;
    }

    @Override // java.io.InputStream
    public final int read(byte[] r25, int r26, int r27) {
        if (r27 != 0) goto L5;
        return 0;
    L5:
        cu1 r3 = this.p;
        if (r3 != null) goto L8;
        return -1;
    L8:
        if (r3.n == true) goto L10;
    L13:
        boolean r6 = true;
        if (r3.o.x() == 1) goto L16;
        int r4 = r3.o.r(r25, r26, r27);
        if (r4 == 0) goto L8;
    L61:
        long r1 = this.p.p.n.n;
        b(r4);
        if (r4 != (-1)) goto L67;
        cu1 r2 = this.p;
        if (r2 != null) goto L71;
    L66:
        this.p = null;
        goto L67
    L71:
        r2.close();     // Catch: IOException -> L70
    L67:
        return r4;
    L16:
        if (cu1.j(r3.p, 1) != 1) goto L18;
        boolean r5 = true;
    L19:
        r3.n = r5;
        int r7 = 2;
        int r8 = (int) cu1.j(r3.p, 2);
        int r9 = 16;
        if (r8 != 0) goto L22;
        qs r10 = r3.p;
        int r11 = r10.q % 8;
        if (r11 <= 0) goto L54;
        r10.f(r11);
    L54:
        long r12 = cu1.j(r3.p, 16);
        if ((65535 & (r12 ^ 65535)) != cu1.j(r3.p, 16)) goto L57;
        r3.o = new bu1(r3, r12);
        goto L8
    L57:
        kf2.o("Illegal LEN / NLEN values");
        return 0;
    L22:
        if (r8 != 1) goto L23;
        r3.o = new zt1(r3, 4, cu1.v, cu1.w);
        goto L8
    L23:
        if (r8 != 2) goto L48;
        int[][] r13 = {new int[(int) (cu1.j(r3.p, 5) + 257)], new int[(int) (cu1.j(r3.p, 5) + 1)]};
        qs r14 = r3.p;
        int[] r15 = r13[0];
        int[] r16 = r13[1];
        int r17 = (int) (cu1.j(r14, 4) + 4);
        int[] r18 = new int[19];
        int r19 = 0;
    L26:
        if (r19 >= r17) goto L28;
        r18[cu1.u[r19]] = (int) cu1.j(r14, 3);
        r19 = r19 + 1;
        r13 = r13;
        goto L26
    L28:
        int[][] r110 = r13;
        tu r20 = cu1.b(r18);
        int r21 = r15.length + r16.length;
        int[] r111 = new int[r21];
        int r112 = 0;
        int r113 = 0;
        int r114 = -1;
    L29:
        if (r112 >= r21) goto L47;
        if (r113 > 0) goto L31;
        boolean r115 = r6;
        int r22 = cu1.f(r14, r20);
        if (r22 >= r9) goto L35;
        r111[r112] = r22;
        r112 = r112 + 1;
        r114 = r22;
    L46:
        r6 = r115;
        r7 = 2;
        r9 = 16;
        goto L29
    L35:
        long r23 = 3;
        if (r22 != r9) goto L40;
        int r24 = (int) (cu1.j(r14, r7) + 3);
    L38:
        r113 = r24;
        goto L46
    L40:
        if (r22 != 17) goto L44;
        long r28 = cu1.j(r14, 3);
    L42:
        r24 = (int) (r28 + r23);
        r114 = 0;
        goto L38
    L44:
        if (r22 != 18) goto L46;
        r28 = cu1.j(r14, 7);
        r23 = 11;
        goto L42
    L31:
        r111[r112] = r114;
        r113 = r113 - 1;
        r112 = r112 + 1;
        goto L29
    L47:
        System.arraycopy(r111, 0, r15, 0, r15.length);
        System.arraycopy(r111, r15.length, r16, 0, r16.length);
        r3.o = new zt1(r3, 3, r110[0], r110[r6 ? 1 : 0]);
        goto L8
    L48:
        kf2.o(f34.f(r8, "Unsupported compression: "));
        return 0;
    L18:
        r5 = false;
        goto L19
    L10:
        if (r3.o.o() == true) goto L13;
        r4 = -1;
        goto L61
    }

    @Override // java.io.InputStream
    public final int read() {
    L2:
        byte[] r0 = this.q;
        int r1 = read(r0);
        if (r1 == (-1)) goto L11;
        if (r1 == 0) goto L2;
        if (r1 == 1) goto L8;
        kf2.o(f34.f(r1, "Invalid return value from read: "));
        return 0;
    L8:
        return r0[0] & 255;
    L11:
        return -1;
    }
}
