package defpackage;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ly3 extends bx1 {
    public static final ly3 t = null;
    public final transient Object q;
    public final transient Object[] r;
    public final transient int s;

    static {
        t = new ly3(0, null, new Object[0]);
    }

    public ly3(int r1, Object r2, Object[] r3) {
        this.q = r2;
        this.r = r3;
        this.s = r1;
    }

    public static ly3 g(int r4, Object[] r5, ue1 r6) {
        if (r4 != 0) goto L6;
        return t;
    L6:
        if (r4 != 1) goto L9;
        Objects.requireNonNull(r5[0]);
        Objects.requireNonNull(r5[1]);
        return new ly3(1, null, r5);
    L9:
        rr2.t(r4, r5.length >> 1);
        Object r2 = h(r5, r4, jx1.i(r4), 0);
        if ((r2 instanceof Object[]) == false) goto L17;
        Object[] r3 = (Object[]) r2;
        ax1 r7 = (ax1) r3[2];
        if (r6 == null) goto L15;
        r6.q = r7;
        Object r8 = r3[0];
        int r9 = ((Integer) r3[1]).intValue();
        r5 = Arrays.copyOf(r5, r9 * 2);
        r2 = r8;
        r4 = r9;
        goto L17
    L15:
        throw r7.a();
    L17:
        return new ly3(r4, r2, r5);
    }

    public static Object h(Object[] r12, int r13, int r14, int r15) {
        ax1 r0 = null;
        if (r13 != 1) goto L6;
        Objects.requireNonNull(r12[r15]);
        Objects.requireNonNull(r12[r15 ^ 1]);
        return null;
    L6:
        int r2 = r14 - 1;
        int r5 = 0;
        if (r14 > 128) goto L27;
        byte[] r16 = new byte[r14];
        Arrays.fill(r16, (byte) -1);
        int r3 = 0;
    L9:
        if (r5 >= r13) goto L22;
        int r4 = (r5 * 2) + r15;
        int r6 = (r3 * 2) + r15;
        Object r7 = r12[r4];
        Objects.requireNonNull(r7);
        Object r8 = r12[r4 ^ 1];
        Objects.requireNonNull(r8);
        int r9 = g12.T(r7.hashCode());
    L11:
        int r10 = r9 & r2;
        int r11 = r16[r10] & 255;
        if (r11 == 255) goto L13;
        if (r7.equals(r12[r11]) == true) goto L19;
        r9 = r10 + 1;
        goto L11
    L19:
        int r17 = r11 ^ 1;
        Object r18 = r12[r17];
        Objects.requireNonNull(r18);
        r0 = new ax1(r7, r8, r18);
        r12[r17] = r8;
    L20:
        r5 = r5 + 1;
        goto L9
    L13:
        r16[r10] = (byte) r6;
        if (r3 >= r5) goto L16;
        r12[r6] = r7;
        r12[r6 ^ 1] = r8;
    L16:
        r3 = r3 + 1;
        goto L20
    L22:
        if (r3 != r13) goto L25;
        return r16;
    L25:
        return new Object[]{r16, Integer.valueOf(r3), r0};
    L27:
        if (r14 > 32768) goto L46;
        short[] r19 = new short[r14];
        Arrays.fill(r19, -1);
        int r20 = 0;
    L29:
        if (r5 >= r13) goto L42;
        int r21 = (r5 * 2) + r15;
        int r22 = (r20 * 2) + r15;
        Object r23 = r12[r21];
        Objects.requireNonNull(r23);
        Object r24 = r12[r21 ^ 1];
        Objects.requireNonNull(r24);
        int r25 = g12.T(r23.hashCode());
    L31:
        int r26 = r25 & r2;
        int r27 = r19[r26] & 65535;
        if (r27 == 65535) goto L33;
        if (r23.equals(r12[r27]) == true) goto L39;
        r25 = r26 + 1;
        goto L31
    L39:
        int r28 = r27 ^ 1;
        Object r29 = r12[r28];
        Objects.requireNonNull(r29);
        r0 = new ax1(r23, r24, r29);
        r12[r28] = r24;
    L40:
        r5 = r5 + 1;
        goto L29
    L33:
        r19[r26] = (short) r22;
        if (r20 >= r5) goto L36;
        r12[r22] = r23;
        r12[r22 ^ 1] = r24;
    L36:
        r20 = r20 + 1;
        goto L40
    L42:
        if (r20 != r13) goto L45;
        return r19;
    L45:
        return new Object[]{r19, Integer.valueOf(r20), r0};
    L46:
        int[] r110 = new int[r14];
        Arrays.fill(r110, -1);
        int r30 = 0;
    L47:
        if (r5 >= r13) goto L60;
        int r31 = (r5 * 2) + r15;
        int r32 = (r30 * 2) + r15;
        Object r33 = r12[r31];
        Objects.requireNonNull(r33);
        Object r34 = r12[r31 ^ 1];
        Objects.requireNonNull(r34);
        int r35 = g12.T(r33.hashCode());
    L49:
        int r36 = r35 & r2;
        int r111 = r110[r36];
        if (r111 == (-1)) goto L51;
        if (r33.equals(r12[r111]) == true) goto L57;
        r35 = r36 + 1;
        goto L49
    L57:
        int r37 = r111 ^ 1;
        Object r38 = r12[r37];
        Objects.requireNonNull(r38);
        r0 = new ax1(r33, r34, r38);
        r12[r37] = r34;
    L58:
        r5 = r5 + 1;
        goto L47
    L51:
        r110[r36] = r32;
        if (r30 >= r5) goto L54;
        r12[r32] = r33;
        r12[r32 ^ 1] = r34;
    L54:
        r30 = r30 + 1;
        goto L58
    L60:
        if (r30 != r13) goto L63;
        return r110;
    L63:
        return new Object[]{r110, Integer.valueOf(r30), r0};
    }

    public static Object i(Object r3, Object[] r4, int r5, int r6, Object r7) {
        if (r7 != null) goto L5;
        return null;
    L5:
        if (r5 != 1) goto L10;
        Object r8 = r4[r6];
        Objects.requireNonNull(r8);
        if (r8.equals(r7) == false) goto L37;
        Object r9 = r4[r6 ^ 1];
        Objects.requireNonNull(r9);
        return r9;
    L37:
        return null;
    L10:
        if (r3 != null) goto L13;
        return null;
    L13:
        if ((r3 instanceof byte[]) == false) goto L24;
        byte[] r10 = (byte[]) r3;
        int r11 = r10.length - 1;
        int r12 = g12.T(r7.hashCode());
    L15:
        int r13 = r12 & r11;
        int r1 = r10[r13] & 255;
        if (r1 == 255) goto L52;
        if (r7.equals(r4[r1]) == true) goto L21;
        r12 = r13 + 1;
        goto L15
    L21:
        return r4[r1 ^ 1];
    L52:
        return null;
    L24:
        if ((r3 instanceof short[]) == false) goto L34;
        short[] r14 = (short[]) r3;
        int r15 = r14.length - 1;
        int r16 = g12.T(r7.hashCode());
    L26:
        int r17 = r16 & r15;
        int r2 = r14[r17] & 65535;
        if (r2 == 65535) goto L53;
        if (r7.equals(r4[r2]) == true) goto L32;
        r16 = r17 + 1;
        goto L26
    L32:
        return r4[r2 ^ 1];
    L53:
        return null;
    L34:
        int[] r18 = (int[]) r3;
        int r19 = r18.length - 1;
        int r20 = g12.T(r7.hashCode());
    L35:
        int r21 = r20 & r19;
        int r22 = r18[r21];
        if (r22 == (-1)) goto L54;
        if (r7.equals(r4[r22]) == true) goto L42;
        r20 = r21 + 1;
        goto L35
    L42:
        return r4[r22 ^ 1];
    L54:
        return null;
    }

    @Override // defpackage.bx1
    public final iy3 c() {
        int r2 = this.s;
        return new iy3(this, this.r, 0, r2);
    }

    @Override // defpackage.bx1
    public final jy3 d() {
        int r2 = this.s;
        return new jy3(this, new ky3(this.r, 0, r2));
    }

    @Override // defpackage.bx1
    public final rw1 e() {
        int r2 = this.s;
        return new ky3(this.r, 1, r2);
    }

    @Override // defpackage.bx1, java.util.Map
    public final Object get(Object r4) {
        int r0 = this.s;
        Object r3 = i(this.q, this.r, r0, 0, r4);
        if (r3 != null) goto L6;
        return null;
    L6:
        return r3;
    }

    @Override // java.util.Map
    public final int size() {
        return this.s;
    }
}
