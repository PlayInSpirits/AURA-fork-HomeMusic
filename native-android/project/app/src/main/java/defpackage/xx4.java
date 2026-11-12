package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xx4 {
    public static final xx4 e = null;
    public int a;
    public int b;
    public final tv1 c;
    public Object[] d;

    static {
        e = new xx4(0, 0, new Object[0], null);
    }

    public xx4(int r1, int r2, Object[] r3, tv1 r4) {
        this.a = r1;
        this.b = r2;
        this.c = r4;
        this.d = r3;
    }

    public static xx4 j(int r11, Object r12, Object r13, int r14, Object r15, Object r16, int r17, tv1 r18) {
        if (r17 > 30) goto L5;
        int r9 = si0.A(r11, r17);
        int r1 = si0.A(r14, r17);
        if (r9 == r1) goto L15;
        if (r9 >= r1) goto L11;
        Object[] r0 = {r12, r13, r15, r16};
    L13:
        return new xx4((1 << r9) | (1 << r1), 0, r0, r18);
    L11:
        r0 = new Object[]{r15, r16, r12, r13};
        goto L13
    L15:
        return new xx4(0, 1 << r9, new Object[]{j(r11, r12, r13, r14, r15, r16, r17 + 5, r18)}, r18);
    L5:
        return new xx4(0, 0, new Object[]{r12, r13, r15, r16}, r18);
    }

    public final Object[] a(int r10, int r11, int r12, Object r13, Object r14, int r15, tv1 r16) {
        Object r2 = this.d[r10];
        if (r2 == null) goto L5;
        int r1 = r2.hashCode();
    L6:
        xx4 r17 = j(r1, r2, x(r10), r12, r13, r14, r15 + 5, r16);
        int r18 = t(r11);
        int r19 = r18 + 1;
        Object[] r9 = this.d;
        Object[] r3 = new Object[r9.length - 1];
        ti.c0(0, r10, 6, r9, r3);
        ti.Z(r10, r10 + 2, r19, r9, r3);
        r3[r18 - 1] = r17;
        ti.Z(r18, r19, r9.length, r9, r3);
        return r3;
    L5:
        r1 = 0;
        goto L6
    }

    public final int b() {
        if (this.b == 0) goto L5;
        int r0 = Integer.bitCount(this.a);
        int r1 = r0 * 2;
        int r2 = this.d.length;
    L7:
        if (r1 >= r2) goto L9;
        r0 = r0 + s(r1).b();
        r1 = r1 + 1;
        goto L7
    L9:
        return r0;
    L5:
        return this.d.length / 2;
    }

    public final boolean c(Object r6) {
        h02 r0 = gb.b0(gb.g0(0, this.d.length), 2);
        int r2 = r0.n;
        int r3 = r0.o;
        int r1 = r0.p;
        if (r1 <= 0) goto L5;
        if (r2 > r3) goto L5;
    L8:
        if (h12.c(r6, this.d[r2]) == true) goto L9;
        if (r2 == r3) goto L13;
        r2 = r2 + r1;
    L13:
        return false;
    L9:
        return true;
    L5:
        if (r1 >= 0) goto L13;
        if (r3 > r2) goto L13;
        goto L13
    }

    public final boolean d(int r3, int r4, Object r5) {
        int r0 = 1 << si0.A(r3, r4);
        if (h(r0) == false) goto L7;
        int r6 = f(r0);
        return h12.c(r5, this.d[r6]);
    L7:
        if (i(r0) == false) goto L14;
        xx4 r2 = s(t(r0));
        if (r4 != 30) goto L13;
        return r2.c(r5);
    L13:
        return r2.d(r3, r4 + 5, r5);
    L14:
        return false;
    }

    public final boolean e(xx4 r6) {
        if (this != r6) goto L5;
        return true;
    L5:
        if (this.b == r6.b) goto L8;
    L14:
        return false;
    L8:
        if (this.a != r6.a) goto L14;
        int r0 = this.d.length;
        int r1 = 0;
    L11:
        if (r1 >= r0) goto L20;
        if (this.d[r1] != r6.d[r1]) goto L14;
        r1 = r1 + 1;
        goto L11
    L20:
        return true;
    }

    public final int f(int r1) {
        return Integer.bitCount(this.a & (r1 - 1)) * 2;
    }

    public final Object g(int r3, int r4, Object r5) {
        int r0 = 1 << si0.A(r3, r4);
        if (h(r0) == false) goto L9;
        int r6 = f(r0);
        if (h12.c(r5, this.d[r6]) == true) goto L7;
        return null;
    L7:
        return x(r6);
    L9:
        if (i(r0) == false) goto L30;
        xx4 r2 = s(t(r0));
        if (r4 != 30) goto L24;
        h02 r7 = gb.b0(gb.g0(0, r2.d.length), 2);
        int r8 = r7.n;
        int r1 = r7.o;
        int r9 = r7.p;
        if (r9 <= 0) goto L15;
        if (r8 > r1) goto L15;
    L18:
        if (h12.c(r5, r2.d[r8]) == true) goto L20;
        if (r8 == r1) goto L33;
        r8 = r8 + r9;
        goto L18
    L33:
        return null;
    L20:
        return r2.x(r8);
    L15:
        if (r9 >= 0) goto L31;
        if (r1 <= r8) goto L18;
        return null;
    L31:
        return null;
    L24:
        return r2.g(r3, r4 + 5, r5);
    L30:
        return null;
    }

    public final boolean h(int r1) {
        if ((this.a & r1) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public final boolean i(int r1) {
        if ((this.b & r1) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public final xx4 k(int r4, lf3 r5) {
        r5.e(r5.r - 1);
        r5.p = x(r4);
        Object[] r0 = this.d;
        if (r0.length != 2) goto L7;
        return null;
    L7:
        if (this.c != r5.n) goto L11;
        this.d = si0.g(r4, r0);
        return this;
    L11:
        return new xx4(0, 0, si0.g(r4, r0), r5.n);
    }

    public final xx4 l(int r11, Object r12, Object r13, int r14, lf3 r15) {
        int r4 = 1 << si0.A(r11, r14);
        boolean r0 = h(r4);
        tv1 r2 = this.c;
        if (r0 == false) goto L22;
        int r3 = f(r4);
        if (h12.c(r12, this.d[r3]) == false) goto L15;
        r15.p = x(r3);
        if (x(r3) != r13) goto L10;
        return this;
    L10:
        if (r2 != r15.n) goto L13;
        this.d[r3 + 1] = r13;
        return this;
    L13:
        r15.q++;
        Object[] r16 = this.d;
        Object[] r17 = Arrays.copyOf(r16, r16.length);
        r17[r3 + 1] = r13;
        return new xx4(this.a, this.b, r17, r15.n);
    L15:
        r15.e(r15.r + 1);
        tv1 r9 = r15.n;
        if (r2 != r9) goto L20;
        this.d = a(r3, r4, r11, r12, r13, r14, r9);
        this.a ^= r4;
        this.b |= r4;
        return this;
    L20:
        return new xx4(this.a ^ r4, this.b | r4, a(r3, r4, r11, r12, r13, r14, r9), r9);
    L22:
        if (i(r4) == false) goto L45;
        int r10 = t(r4);
        xx4 r1 = s(r10);
        if (r14 != 30) goto L40;
        h02 r18 = gb.b0(gb.g0(0, r1.d.length), 2);
        int r19 = r18.n;
        int r5 = r18.o;
        int r110 = r18.p;
        if (r110 <= 0) goto L28;
        if (r19 > r5) goto L28;
    L31:
        if (h12.c(r12, r1.d[r19]) == true) goto L32;
        if (r19 == r5) goto L38;
        r19 = r19 + r110;
    L38:
        r15.e(r15.r + 1);
        xx4 r111 = new xx4(0, 0, si0.f(r1.d, 0, r12, r13), r15.n);
    L39:
        lf3 r6 = r15;
    L41:
        if (r1 != r111) goto L44;
        return this;
    L44:
        return r(r10, r111, r6.n);
    L32:
        r15.p = r1.x(r19);
        if (r1.c != r15.n) goto L35;
        r1.d[r19 + 1] = r13;
        r111 = r1;
        goto L39
    L35:
        r15.q++;
        Object[] r112 = r1.d;
        Object[] r113 = Arrays.copyOf(r112, r112.length);
        r113[r19 + 1] = r13;
        r111 = new xx4(0, 0, r113, r15.n);
    L28:
        if (r110 >= 0) goto L38;
        if (r5 > r19) goto L38;
    L40:
        r6 = r15;
        r111 = r1.l(r11, r12, r13, r14 + 5, r6);
        goto L41
    L45:
        r15.e(r15.r + 1);
        tv1 r114 = r15.n;
        int r115 = f(r4);
        Object[] r116 = this.d;
        if (r2 != r114) goto L50;
        this.d = si0.f(r116, r115, r12, r13);
        this.a |= r4;
        return this;
    L50:
        return new xx4(this.a | r4, this.b, si0.f(r116, r115, r12, r13), r114);
    }

    public final xx4 m(xx4 r28, int r29, no0 r30, lf3 r31) {
        if (this != r28) goto L6;
        r30.a += b();
        return this;
    L6:
        int r10 = 0;
        if (r29 <= 30) goto L31;
        tv1 r2 = r31.n;
        int r4 = r28.b;
        Object[] r5 = this.d;
        Object[] r6 = Arrays.copyOf(r5, r5.length + r28.d.length);
        int r7 = this.d.length;
        h02 r8 = gb.b0(gb.g0(0, r28.d.length), 2);
        int r9 = r8.n;
        int r11 = r8.o;
        int r12 = r8.p;
        if (r12 <= 0) goto L11;
        if (r9 > r11) goto L11;
    L14:
        if (c(r28.d[r9]) == true) goto L16;
        Object[] r13 = r28.d;
        r6[r7] = r13[r9];
        r6[r7 + 1] = r13[r9 + 1];
        r7 = r7 + 2;
    L17:
        if (r9 == r11) goto L20;
        r9 = r9 + r12;
    L20:
        if (r7 != this.d.length) goto L23;
    L104:
        return this;
    L23:
        if (r7 != r28.d.length) goto L26;
        return r28;
    L26:
        if (r7 != r6.length) goto L30;
        return new xx4(0, 0, r6, r2);
    L30:
        return new xx4(0, 0, Arrays.copyOf(r6, r7), r2);
    L16:
        r30.a++;
    L11:
        if (r12 >= 0) goto L20;
        if (r11 > r9) goto L20;
    L31:
        int r14 = this.b | r28.b;
        int r15 = this.a;
        int r16 = r28.a;
        int r17 = (r15 ^ r16) & (~r14);
        int r18 = r15 & r16;
        int r19 = r17;
    L32:
        if (r18 == 0) goto L39;
        int r20 = Integer.lowestOneBit(r18);
        if (h12.c(this.d[f(r20)], r28.d[r28.f(r20)]) == false) goto L36;
        r19 = r19 | r20;
    L37:
        r18 = r18 ^ r20;
        goto L32
    L36:
        r14 = r14 | r20;
        goto L37
    L39:
        if ((r14 & r19) == 0) goto L43;
        oo3.b("Check failed.");
    L43:
        if (h12.c(this.c, r31.n) == true) goto L45;
    L49:
        xx4 r110 = new xx4(r19, r14, new Object[Integer.bitCount(r14) + (Integer.bitCount(r19) * 2)], null);
    L50:
        int r111 = r14;
        int r112 = 0;
    L51:
        if (r111 == 0) goto L93;
        int r113 = Integer.lowestOneBit(r111);
        Object[] r21 = r110.d;
        int r114 = (r21.length - 1) - r112;
        if (i(r113) == false) goto L67;
        xx4 r22 = s(t(r113));
        if (r28.i(r113) == false) goto L58;
        r22 = r22.m(r28.s(r28.t(r113)), r29 + 5, r30, r31);
        Object[] r115 = r21;
    L92:
        r115[r114] = r22;
        r112 = r112 + 1;
        r111 = r111 ^ r113;
        r10 = 0;
        goto L51
    L58:
        if (r28.h(r113) == false) goto L66;
        int r23 = r28.f(r113);
        Object r24 = r28.d[r23];
        Object r25 = r28.x(r23);
        int r26 = r31.r;
        if (r24 == null) goto L62;
        int r116 = r24.hashCode();
    L63:
        int r117 = r116;
        r115 = r21;
        r22 = r22.l(r117, r24, r25, r29 + 5, r31);
        if (r31.r != r26) goto L92;
        r30.a++;
        goto L92
    L62:
        r116 = r10;
        goto L63
    L66:
        r115 = r21;
        goto L92
    L67:
        r115 = r21;
        if (r28.i(r113) == false) goto L84;
        xx4 r27 = r28.s(r28.t(r113));
        if (h(r113) == false) goto L78;
        int r32 = f(r113);
        Object r33 = this.d[r32];
        if (r33 == null) goto L74;
        int r34 = r33.hashCode();
    L75:
        int r35 = r29 + 5;
        if (r27.d(r34, r35, r33) == false) goto L79;
        r30.a++;
        goto L78
    L79:
        Object r36 = x(r32);
        if (r33 == null) goto L82;
        int r37 = r33.hashCode();
    L83:
        r22 = r27.l(r37, r33, r36, r35, r31);
        goto L92
    L82:
        r37 = 0;
        goto L83
    L74:
        r34 = 0;
    L78:
        r22 = r27;
        goto L92
    L84:
        int r38 = f(r113);
        Object r210 = this.d[r38];
        Object r211 = x(r38);
        int r39 = r28.f(r113);
        Object r212 = r28.d[r39];
        Object r213 = r28.x(r39);
        if (r210 == null) goto L87;
        int r118 = r210.hashCode();
    L88:
        if (r212 == null) goto L90;
        int r214 = r212.hashCode();
    L91:
        r22 = j(r118, r210, r211, r214, r212, r213, r29 + 5, r31.n);
        goto L92
    L90:
        r214 = 0;
        goto L91
    L87:
        r118 = 0;
        goto L88
    L93:
        int r119 = 0;
    L94:
        if (r19 == 0) goto L103;
        int r3 = Integer.lowestOneBit(r19);
        int r40 = r119 * 2;
        if (r28.h(r3) == true) goto L98;
        int r41 = f(r3);
        Object[] r42 = r110.d;
        r42[r40] = this.d[r41];
        r42[r40 + 1] = x(r41);
    L101:
        r119 = r119 + 1;
        r19 = r19 ^ r3;
        goto L94
    L98:
        int r43 = r28.f(r3);
        Object[] r44 = r110.d;
        r44[r40] = r28.d[r43];
        r44[r40 + 1] = r28.x(r43);
        if (h(r3) == false) goto L101;
        r30.a++;
        goto L101
    L103:
        if (e(r110) == true) goto L104;
        if (r28.e(r110) == false) goto L108;
        return r28;
    L108:
        return r110;
    L45:
        if (this.a != r19) goto L49;
        if (this.b != r14) goto L49;
        r110 = this;
        goto L50
    }

    public final xx4 n(int r9, Object r10, int r11, lf3 r12) {
        int r6 = 1 << si0.A(r9, r11);
        if (h(r6) == false) goto L10;
        int r13 = f(r6);
        if (h12.c(r10, this.d[r13]) == false) goto L28;
        return p(r13, r6, r12);
    L28:
        return this;
    L10:
        if (i(r6) == false) goto L28;
        int r5 = t(r6);
        xx4 r3 = s(r5);
        if (r11 != 30) goto L25;
        h02 r14 = gb.b0(gb.g0(0, r3.d.length), 2);
        int r15 = r14.n;
        int r0 = r14.o;
        int r16 = r14.p;
        if (r16 <= 0) goto L16;
        if (r15 > r0) goto L16;
    L19:
        if (h12.c(r10, r3.d[r15]) == true) goto L20;
        if (r15 == r0) goto L23;
        r15 = r15 + r16;
    L23:
        xx4 r17 = r3;
    L24:
        xx4 r4 = r17;
        return q(r3, r4, r5, r6, r12.n);
    L20:
        r17 = r3.k(r15, r12);
    L16:
        if (r16 >= 0) goto L23;
        if (r0 > r15) goto L23;
    L25:
        r17 = r3.n(r9, r10, r11 + 5, r12);
        goto L24
    }

    public final xx4 o(int r8, Object r9, Object r10, int r11, lf3 r12) {
        int r0 = 1 << si0.A(r8, r11);
        if (h(r0) == false) goto L11;
        int r13 = f(r0);
        if (h12.c(r9, this.d[r13]) == true) goto L7;
        return this;
    L7:
        if (h12.c(r10, x(r13)) == true) goto L9;
        return this;
    L9:
        return p(r13, r0, r12);
    L11:
        if (i(r0) == false) goto L37;
        int r14 = t(r0);
        xx4 r1 = s(r14);
        if (r11 != 30) goto L29;
        h02 r15 = gb.b0(gb.g0(0, r1.d.length), 2);
        int r16 = r15.n;
        int r2 = r15.o;
        int r17 = r15.p;
        if (r17 <= 0) goto L17;
        if (r16 > r2) goto L17;
    L20:
        if (h12.c(r9, r1.d[r16]) == true) goto L22;
    L24:
        if (r16 == r2) goto L26;
        r16 = r16 + r17;
    L26:
        xx4 r18 = r1;
    L27:
        lf3 r6 = r12;
    L28:
        xx4 r19 = r18;
        return q(r1, r19, r14, r0, r6.n);
    L22:
        if (h12.c(r10, r1.x(r16)) == false) goto L24;
        r18 = r1.k(r16, r12);
    L17:
        if (r17 >= 0) goto L26;
        if (r2 > r16) goto L26;
    L29:
        r6 = r12;
        r18 = r1.o(r8, r9, r10, r11 + 5, r6);
        goto L28
    L37:
        return this;
    }

    public final xx4 p(int r4, int r5, lf3 r6) {
        r6.e(r6.r - 1);
        r6.p = x(r4);
        Object[] r0 = this.d;
        if (r0.length != 2) goto L7;
        return null;
    L7:
        if (this.c != r6.n) goto L11;
        this.d = si0.g(r4, r0);
        this.a ^= r5;
        return this;
    L11:
        return new xx4(r5 ^ this.a, this.b, si0.g(r4, r0), r6.n);
    }

    public final xx4 q(xx4 r3, xx4 r4, int r5, int r6, tv1 r7) {
        tv1 r0 = this.c;
        if (r4 != null) goto L13;
        Object[] r8 = this.d;
        if (r8.length != 1) goto L8;
        return null;
    L8:
        if (r0 != r7) goto L12;
        this.d = si0.h(r5, r8);
        this.b ^= r6;
        return this;
    L12:
        return new xx4(this.a, this.b ^ r6, si0.h(r5, r8), r7);
    L13:
        if (r0 == r7) goto L18;
        if (r3 != r4) goto L18;
        return this;
    L18:
        return r(r5, r4, r7);
    }

    public final xx4 r(int r4, xx4 r5, tv1 r6) {
        Object[] r0 = this.d;
        if (r0.length != 1) goto L11;
        if (r5.d.length != 2) goto L11;
        if (r5.b != 0) goto L11;
        r5.a = this.b;
        return r5;
    L11:
        if (this.c != r6) goto L14;
        r0[r4] = r5;
        return this;
    L14:
        Object[] r1 = Arrays.copyOf(r0, r0.length);
        r1[r4] = r5;
        return new xx4(this.a, this.b, r1, r6);
    }

    public final xx4 s(int r1) {
        Object r0 = this.d[r1];
        r0.getClass();
        return (xx4) r0;
    }

    public final int t(int r2) {
        return (this.d.length - 1) - Integer.bitCount(this.b & (r2 - 1));
    }

    public final x7 u(Object r15, int r16, Object r17, int r18) {
        int r8 = 1;
        int r2 = 1 << si0.A(r16, r18);
        int r9 = 15;
        int r1 = 0;
        if (h(r2) == false) goto L14;
        int r0 = f(r2);
        if (h12.c(r15, this.d[r0]) == false) goto L12;
        if (x(r0) == r17) goto L35;
        Object[] r19 = this.d;
        Object[] r110 = Arrays.copyOf(r19, r19.length);
        r110[r0 + 1] = r17;
        return new x7(r1, r9, new xx4(this.a, this.b, r110, null));
    L35:
        return null;
    L12:
        return new x7(r8, r9, new xx4(this.a ^ r2, this.b | r2, a(r0, r2, r16, r15, r17, r18, null), null));
    L14:
        if (i(r2) == false) goto L39;
        int r7 = t(r2);
        xx4 r11 = s(r7);
        if (r18 != 30) goto L33;
        h02 r3 = gb.b0(gb.g0(0, r11.d.length), 2);
        int r6 = r3.n;
        int r12 = r3.o;
        int r4 = r3.p;
        if (r4 <= 0) goto L20;
        if (r6 > r12) goto L20;
    L23:
        if (h12.c(r15, r11.d[r6]) == true) goto L25;
        if (r6 == r12) goto L30;
        r6 = r6 + r4;
    L30:
        x7 r111 = new x7(r8, r9, new xx4(0, 0, si0.f(r11.d, 0, r15, r17), null));
    L31:
        if (r111 == null) goto L35;
    L36:
        r111.p = w(r7, r2, (xx4) r111.p);
        return r111;
    L25:
        if (r17 != r11.x(r6)) goto L27;
        r111 = null;
        goto L31
    L27:
        Object[] r112 = r11.d;
        Object[] r113 = Arrays.copyOf(r112, r112.length);
        r113[r6 + 1] = r17;
        r111 = new x7(r1, r9, new xx4(0, 0, r113, null));
    L20:
        if (r4 >= 0) goto L30;
        if (r12 > r6) goto L30;
    L33:
        r111 = r11.u(r15, r16, r17, r18 + 5);
        if (r111 != null) goto L36;
    L39:
        return new x7(r8, r9, new xx4(r2 | this.a, this.b, si0.f(this.d, f(r2), r15, r17), null));
    }

    public final xx4 v(int r10, int r11, Object r12) {
        int r0 = 1 << si0.A(r10, r11);
        if (h(r0) == false) goto L12;
        int r13 = f(r0);
        if (h12.c(r12, this.d[r13]) == false) goto L42;
        Object[] r14 = this.d;
        if (r14.length != 2) goto L10;
    L33:
        return null;
    L10:
        return new xx4(this.a ^ r0, this.b, si0.g(r13, r14), null);
    L42:
        return this;
    L12:
        if (i(r0) == false) goto L43;
        int r2 = t(r0);
        xx4 r5 = s(r2);
        if (r11 != 30) goto L29;
        h02 r15 = gb.b0(gb.g0(0, r5.d.length), 2);
        int r6 = r15.n;
        int r7 = r15.o;
        int r16 = r15.p;
        if (r16 <= 0) goto L18;
        if (r6 > r7) goto L18;
    L21:
        if (h12.c(r12, r5.d[r6]) == true) goto L22;
        if (r6 == r7) goto L28;
        r6 = r6 + r16;
    L28:
        xx4 r17 = r5;
    L30:
        if (r17 != null) goto L36;
        Object[] r18 = this.d;
        if (r18.length == 1) goto L33;
        return new xx4(this.a, this.b ^ r0, si0.h(r2, r18), null);
    L36:
        if (r5 != r17) goto L38;
        return this;
    L38:
        return w(r2, r0, r17);
    L22:
        Object[] r19 = r5.d;
        if (r19.length != 2) goto L25;
        r17 = null;
        goto L30
    L25:
        r17 = new xx4(0, 0, si0.g(r6, r19), null);
    L18:
        if (r16 >= 0) goto L28;
        if (r7 > r6) goto L28;
    L29:
        r17 = r5.v(r10, r11 + 5, r12);
        goto L30
    L43:
        return this;
    }

    public final xx4 w(int r9, int r10, xx4 r11) {
        Object[] r0 = r11.d;
        if (r0.length == 2) goto L5;
    L12:
        Object[] r12 = this.d;
        Object[] r13 = Arrays.copyOf(r12, r12.length);
        r13[r9] = r11;
        return new xx4(this.a, this.b, r13, null);
    L5:
        if (r11.b != 0) goto L12;
        if (this.d.length != 1) goto L10;
        r11.a = this.b;
        return r11;
    L10:
        int r14 = f(r10);
        Object[] r1 = this.d;
        Object r4 = r0[0];
        Object r2 = r0[1];
        Object[] r5 = Arrays.copyOf(r1, r1.length + 1);
        ti.Z(r9 + 2, r9 + 1, r1.length, r5, r5);
        ti.Z(r14 + 2, r14, r9, r5, r5);
        r5[r14] = r4;
        r5[r14 + 1] = r2;
        return new xx4(this.a ^ r10, this.b ^ r10, r5, null);
    }

    public final Object x(int r1) {
        return this.d[r1 + 1];
    }
}
