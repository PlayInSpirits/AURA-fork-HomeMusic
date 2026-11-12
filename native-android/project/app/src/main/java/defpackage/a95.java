package defpackage;

import androidx.media3.common.ParserException;
import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class a95 implements b95 {
    public static final int[] m = null;
    public static final int[] n = null;
    public final m51 a;
    public final wv4 b;
    public final uu c;
    public final int d;
    public final byte[] e;
    public final be3 f;
    public final int g;
    public final tb1 h;
    public int i;
    public long j;
    public int k;
    public long l;

    static {
        m = new int[]{-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
        n = new int[]{7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    }

    public a95(m51 r6, wv4 r7, uu r8) {
        this.a = r6;
        this.b = r7;
        this.c = r8;
        int r9 = r8.o;
        int r10 = Math.max(1, r9 / 10);
        this.g = r10;
        be3 r1 = new be3((byte[]) r8.r);
        r1.t();
        int r2 = r1.t();
        this.d = r2;
        int r3 = r8.n;
        int r4 = r8.p;
        int r5 = (((r4 - (r3 * 4)) * 8) / (r8.q * r3)) + 1;
        if (r2 != r5) goto L7;
        int r11 = f35.g(r10, r2);
        this.e = new byte[r11 * r4];
        this.f = new be3(((r2 * 2) * r3) * r11);
        int r12 = ((r4 * r9) * 8) / r2;
        sb1 r13 = new sb1();
        r13.m = lw2.m("audio/raw");
        r13.h = r12;
        r13.i = r12;
        r13.n = (r10 * 2) * r3;
        r13.E = r3;
        r13.F = r9;
        r13.G = 2;
        this.h = new tb1(r13);
        return;
    L7:
        throw ParserException.a(null, "Expected frames per block: " + r5 + "; got: " + r2);
    }

    @Override // defpackage.b95
    public final void a(long r2) {
        this.i = 0;
        this.j = r2;
        this.k = 0;
        this.l = 0;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003c -> B:4:0x0020). Please report as a decompilation issue!!! */
    @Override // defpackage.b95
    public final boolean b(l51 r25, long r26) {
        int r3 = this.k;
        uu r4 = this.c;
        int r5 = r3 / (r4.n * 2);
        int r6 = this.g;
        int r7 = this.d;
        int r8 = f35.g(r6 - r5, r7);
        int r9 = r4.p;
        int r10 = r8 * r9;
        if (r26 != 0) goto L5;
    L4:
        boolean r11 = true;
    L6:
        byte[] r12 = this.e;
        if (r11 == true) goto L14;
        int r13 = this.i;
        if (r13 >= r10) goto L14;
        int r14 = r25.read(r12, this.i, (int) Math.min(r10 - r13, r26));
        if (r14 == (-1)) goto L4;
        this.i += r14;
    L14:
        int r1 = this.i / r9;
        if (r1 <= 0) goto L38;
        int r2 = 0;
    L17:
        be3 r15 = this.f;
        if (r2 >= r1) goto L35;
        int r16 = 0;
    L20:
        int r17 = r4.n;
        if (r16 >= r17) goto L34;
        byte[] r18 = r15.a;
        int r19 = (r16 * 4) + (r2 * r9);
        int r110 = (r17 * 4) + r19;
        int r111 = (r9 / r17) - 4;
        int r20 = (short) ((r12[r19] & 255) | ((r12[r19 + 1] & 255) << 8));
        int r27 = r1;
        int r112 = Math.min(r12[r19 + 2] & 255, 88);
        int[] r113 = n;
        int r21 = r113[r112];
        int r22 = (((r2 * r7) * r17) + r16) * 2;
        r18[r22] = (byte) (r20 & 255);
        r18[r22 + 1] = (byte) (r20 >> 8);
        int r28 = r2;
        int r23 = 0;
    L24:
        if (r23 >= (r111 * 2)) goto L33;
        byte r24 = r12[((((r23 / 8) * r17) * 4) + r110) + ((r23 / 2) % 4)];
        int r29 = r23;
        int r30 = r24 & 255;
        if ((r29 % 2) != 0) goto L28;
        int r31 = r24 & 15;
    L29:
        int r32 = ((((r31 & 7) * 2) + 1) * r21) >> 3;
        if ((r31 & 8) == 0) goto L32;
        r32 = -r32;
    L32:
        r20 = f35.j(r20 + r32, -32768, 32767);
        r22 = (r17 * 2) + r22;
        r18[r22] = (byte) (r20 & 255);
        r18[r22 + 1] = (byte) (r20 >> 8);
        r112 = f35.j(r112 + m[r31], 0, 88);
        r21 = r113[r112];
        r23 = r29 + 1;
        goto L24
    L28:
        r31 = r30 >> 4;
        goto L29
    L33:
        r16 = r16 + 1;
        r1 = r27;
        r2 = r28;
        goto L20
    L34:
        r2 = r2 + 1;
        goto L17
    L35:
        int r210 = r1;
        int r33 = ((r7 * r210) * 2) * r4.n;
        r15.N(0);
        r15.M(r33);
        this.i -= r210 * r9;
        int r34 = r15.c;
        this.b.e(r34, r15);
        int r35 = this.k + r34;
        this.k = r35;
        if ((r35 / (r4.n * 2)) < r6) goto L38;
        d(r6);
    L38:
        if (r11 == false) goto L42;
        int r36 = this.k / (r4.n * 2);
        if (r36 <= 0) goto L42;
        d(r36);
    L42:
        return r11;
    L5:
        r11 = false;
        goto L6
    }

    @Override // defpackage.b95
    public final void c(int r8, long r9) {
        e95 r0 = new e95(this.c, this.d, r8, r9);
        this.a.w(r0);
        tb1 r10 = this.h;
        wv4 r7 = this.b;
        r7.g(r10);
        r7.d(r0.e);
    }

    public final void d(int r20) {
        long r2 = this.j;
        long r4 = this.l;
        uu r11 = this.c;
        long r8 = r11.o;
        String r6 = f35.a;
        long r13 = r2 + f35.a0(r4, 1000000, r8, RoundingMode.DOWN);
        int r16 = (r20 * 2) * r11.n;
        this.b.a(r13, 1, r16, this.k - r16, null);
        this.l += (long) r20;
        this.k -= r16;
    }
}
