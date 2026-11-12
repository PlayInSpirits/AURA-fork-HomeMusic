package defpackage;

import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class cu1 implements Closeable {
    public static final short[] s = null;
    public static final int[] t = null;
    public static final int[] u = null;
    public static final int[] v = null;
    public static final int[] w = null;
    public boolean n;
    public fh0 o;
    public qs p;
    public final ByteArrayInputStream q;
    public final i r;

    static {
        s = new short[]{96, 128, 160, 192, 224, 256, 288, 320, 353, 417, 481, 545, 610, 738, 866, 994, 1123, 1379, 1635, 1891, 2148, 2660, 3172, 3684, 4197, 5221, 6245, 7269, 112};
        t = new int[]{16, 32, 48, 64, 81, 113, 146, 210, 275, 403, 532, 788, 1045, 1557, 2070, 3094, 4119, 6167, 8216, 12312, 16409, 24601, 32794, 49178, 65563, 98331, 131100, 196636, 262173, 393245, 524318, 786462};
        u = new int[]{16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, 13, 2, 14, 1, 15};
        int[] r2 = new int[288];
        v = r2;
        Arrays.fill(r2, 0, 144, 8);
        Arrays.fill(r2, 144, 256, 9);
        Arrays.fill(r2, 256, 280, 7);
        Arrays.fill(r2, 280, 288, 8);
        int[] r0 = new int[32];
        w = r0;
        Arrays.fill(r0, 5);
    }

    public cu1(ByteArrayInputStream r3) {
        this.n = false;
        i r0 = new i();
        r0.c = new byte[65536];
        this.r = r0;
        this.p = new qs(r3, ByteOrder.LITTLE_ENDIAN);
        this.q = r3;
        this.o = new au1();
    }

    public static tu b(int[] r11) {
        int[] r0 = new int[65];
        int r1 = r11.length;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
    L4:
        if (r3 >= r1) goto L6;
        int r6 = r11[r3];
        r4 = Math.max(r4, r6);
        r0[r6] = r0[r6] + 1;
        r3 = r3 + 1;
        goto L4
    L6:
        int r5 = r4 + 1;
        int[] r7 = Arrays.copyOf(r0, r5);
        int[] r8 = new int[r5];
        int r9 = 0;
        int r10 = 0;
    L7:
        if (r9 > r4) goto L9;
        r10 = (r10 + r7[r9]) << 1;
        r8[r9] = r10;
        r9 = r9 + 1;
        goto L7
    L9:
        tu r12 = new tu(0, 2);
    L11:
        if (r2 >= r11.length) goto L33;
        int r13 = r11[r2];
        if (r13 == 0) goto L32;
        int r14 = r13 - 1;
        int r15 = r8[r14];
        tu r16 = r12;
        int r17 = r14;
    L15:
        if (r17 < 0) goto L31;
        if (((1 << r17) & r15) != 0) goto L25;
        if (((tu) r16.c) == null) goto L21;
    L23:
        Object r18 = r16.c;
    L30:
        r16 = (tu) r18;
        r17 = r17 - 1;
        goto L15
    L21:
        if (r16.b != (-1)) goto L23;
        r16.c = new tu(r16.a + 1, 2);
        goto L23
    L25:
        if (((tu) r16.d) == null) goto L27;
    L29:
        r18 = r16.d;
        goto L30
    L27:
        if (r16.b != (-1)) goto L29;
        r16.d = new tu(r16.a + 1, 2);
        goto L29
    L31:
        r16.b = r2;
        r16.c = null;
        r16.d = null;
        r8[r14] = r8[r14] + 1;
    L32:
        r2 = r2 + 1;
        goto L11
    L33:
        return r12;
    }

    public static int f(qs r4, tu r5) {
    L3:
        if (r5 == null) goto L11;
        if (r5.b != (-1)) goto L11;
        if (j(r4, 1) != 0) goto L10;
        Object r6 = r5.c;
    L9:
        r5 = (tu) r6;
        goto L3
    L10:
        r6 = r5.d;
    L11:
        if (r5 != null) goto L13;
        return -1;
    L13:
        return r5.b;
    }

    public static long j(qs r2, int r3) {
        long r4 = r2.b(r3);
        if (r4 == (-1)) goto L6;
        return r4;
    L6:
        throw new EOFException("Truncated Deflate64 Stream");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.o = new au1();
        this.p = null;
    }
}
