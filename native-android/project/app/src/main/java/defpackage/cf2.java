package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class cf2 extends jg3 implements wi2, yx2, vb3 {
    public static final k52 F = null;
    public static final k52 G = null;
    public boolean A;
    public boolean B;
    public final df2 C;
    public c6 D;
    public w03 E;
    public af2 s;
    public if1 t;
    public wf1 u;
    public if1 v;
    public lg3 w;
    public w03 x;
    public boolean y;
    public w03 z;

    static {
        F = new k52(9);
        G = new k52(10);
    }

    public cf2() {
        this.C = new df2(0, this);
    }

    public static void l0(f63 r1) {
        f63 r0 = r1.I;
        c72 r2 = r1.H;
        if (r0 == null) goto L5;
        c72 r3 = r0.H;
    L7:
        if (h12.c(r3, r2) == true) goto L10;
        r2.R.p.H.f();
        return;
    L10:
        k9 r4 = r2.R.p.e();
        if (r4 == null) goto L16;
        d72 r5 = ((ti2) r4).H;
        if (r5 == null) goto L17;
        r5.f();
        return;
    L17:
        return;
    L16:
        return;
    L5:
        r3 = null;
        goto L7
    }

    @Override // defpackage.wi2
    public boolean K() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void S(c72 r32, rp1 r33) {
        w03 r2 = this.E;
        char r7 = 7;
        long r8 = -9187201950435737472L;
        int r10 = 8;
        if (r2 == null) goto L47;
        Object[] r12 = r2.c;
        long[] r3 = r2.a;
        int r13 = r3.length - 2;
        if (r13 < 0) goto L47;
        int r14 = 0;
        long r15 = 128;
    L7:
        long r4 = r3[r14];
        long r17 = 255;
        if (((((~r4) << r7) & r4) & r8) == r8) goto L44;
        int r5 = 8 - ((~(r14 - r13)) >>> 31);
        int r6 = 0;
    L10:
        if (r6 >= r5) goto L41;
        if ((r4 & 255) >= r15) goto L39;
        char r20 = r7;
        x03 r9 = (x03) r12[(r14 << 3) + r6];
        long r21 = r8;
        Object[] r11 = r9.b;
        long[] r16 = r9.a;
        int r18 = r16.length - 2;
        if (r18 < 0) goto L37;
        long r23 = r15;
        int r19 = 0;
        int r110 = r10;
    L16:
        int r25 = r18;
        long r111 = r16[r19];
        long[] r26 = r3;
        long r27 = r4;
        if (((((~r111) << r20) & r111) & r21) == r21) goto L34;
        int r22 = 8 - ((~(r19 - r25)) >>> 31);
        int r24 = 0;
    L19:
        if (r24 >= r22) goto L31;
        if ((r111 & 255) >= r23) goto L29;
        int r28 = (r19 << 3) + r24;
        c72 r29 = (c72) ((g95) r11[r28]).get();
        int r30 = r24;
        if (r29 == null) goto L27;
        boolean r31 = r29.G();
        int r210 = r6;
        if (r31 == true) goto L30;
    L28:
        r9.m(r28);
    L30:
        r111 = r111 >> r110;
        r24 = r30 + 1;
        r6 = r210;
        goto L19
    L27:
        r210 = r6;
        goto L28
    L29:
        r30 = r24;
        r210 = r6;
        goto L30
    L31:
        int r211 = r6;
        if (r22 != r110) goto L38;
    L33:
        r18 = r25;
        if (r19 == r18) goto L38;
        r19 = r19 + 1;
        r3 = r26;
        r4 = r27;
        r6 = r211;
        r110 = 8;
    L38:
        int r34 = 8;
    L40:
        r10 = r34;
        r4 = r27 >> r34;
        r7 = r20;
        r8 = r21;
        r15 = r23;
        r6 = r211 + 1;
        r3 = r26;
        goto L10
    L34:
        r211 = r6;
        goto L33
    L37:
        r26 = r3;
        r27 = r4;
        r211 = r6;
        r23 = r15;
        goto L38
    L39:
        r26 = r3;
        r27 = r4;
        r211 = r6;
        r20 = r7;
        r21 = r8;
        r23 = r15;
        r34 = r10;
        goto L40
    L41:
        long[] r212 = r3;
        char r213 = r7;
        long r214 = r8;
        long r215 = r15;
        if (r5 != r10) goto L48;
    L45:
        if (r14 == r13) goto L48;
        r14 = r14 + 1;
        r7 = r213;
        r8 = r214;
        r15 = r215;
        r3 = r212;
        r10 = 8;
    L48:
        w03 r35 = this.E;
        if (r35 == null) goto L69;
        long[] r36 = r35.a;
        int r37 = r36.length - 2;
        if (r37 < 0) goto L69;
        int r38 = 0;
    L53:
        long r39 = r36[r38];
        if (((((~r39) << r213) & r39) & r214) == r214) goto L67;
        int r112 = 8 - ((~(r38 - r37)) >>> 31);
        int r40 = 0;
    L56:
        if (r40 >= r112) goto L64;
        if ((r39 & r17) >= r215) goto L62;
        int r41 = (r38 << 3) + r40;
        rp1 r113 = (rp1) r35.b[r41];
        if (((x03) r35.c[r41]).g() == false) goto L62;
        r35.k(r41);
    L62:
        r39 = r39 >> 8;
        r40 = r40 + 1;
        goto L56
    L64:
        if (r112 != 8) goto L69;
    L67:
        if (r38 == r37) goto L69;
        r38 = r38 + 1;
    L69:
        w03 r42 = this.E;
        if (r42 != null) goto L72;
        r42 = new w03();
        this.E = r42;
    L72:
        Object r0 = r42.g(r33);
        if (r0 != null) goto L75;
        r0 = new x03();
        r42.l(r33, r0);
    L75:
        ((x03) r0).k(new g95(r32));
        return;
    L44:
        r212 = r3;
        r213 = r7;
        r214 = r8;
        r215 = r15;
    L47:
        r213 = 7;
        r214 = -9187201950435737472L;
        r17 = 255;
        r215 = 128;
        goto L48
    }

    @Override // defpackage.wi2
    public final vi2 T(int r9, int r10, Map r11, if1 r12, if1 r13) {
        if ((r9 & (-16777216)) == 0) goto L5;
    L7:
        cz1.b("Size(" + r9 + " x " + r10 + ") is out of range. Each dimension must be between 0 and 16777215.");
    L9:
        return new bf2(r9, r10, r11, r12, r13, this);
    L5:
        if (((-16777216) & r10) != 0) goto L7;
        goto L7
    }

    public abstract int X(pp1 r1);

    /* JADX WARN: Multi-variable type inference failed */
    public final void Z(final lg3 r23, final long r24, final long r26) {
        w03 r7 = this.E;
        c6 r0 = this.D;
        if (r0 != null) goto L5;
        r0 = new c6();
        this.D = r0;
    L5:
        c6 r8 = r0;
        ub3 r1 = g0().A;
        if (r1 == null) goto L10;
        wb3 r9 = ((ra) r1).getSnapshotObserver();
        if (r9 == null) goto L10;
        r9.a.e(r23, F, new ze2(this, r24, r26, r23));
    L10:
        boolean r2 = K();
        x03 r3 = (x03) r8.e;
        x03 r4 = (x03) r8.f;
        int r5 = r8.a;
        int r6 = 0;
    L11:
        if (r6 >= r5) goto L21;
        byte r10 = ((byte[]) r8.d)[r6];
        if (r10 != 3) goto L15;
        rp1 r11 = ((rp1[]) r8.b)[r6];
        r11.getClass();
        r4.k(r11);
    L20:
        r6 = r6 + 1;
        goto L11
    L15:
        if (r10 == 0) goto L20;
        if (r7 == null) goto L20;
        rp1 r12 = ((rp1[]) r8.b)[r6];
        r12.getClass();
        x03 r13 = (x03) r7.j(r12);
        if (r13 == null) goto L20;
        r3.j(r13);
        goto L20
    L21:
        int r14 = r8.a;
        int r15 = 0;
        int r16 = 0;
    L23:
        if (r15 >= r14) goto L30;
        byte[] r17 = (byte[]) r8.d;
        if (r17[r15] != 2) goto L27;
        r16 = r16 + 1;
    L29:
        r17[r15] = 2;
        r15 = r15 + 1;
        goto L23
    L27:
        if (r16 <= 0) goto L29;
        rp1[] r18 = (rp1[]) r8.b;
        r18[r15 - r16] = r18[r15];
        goto L29
    L30:
        int r19 = r8.a;
        int r20 = r19 - r16;
    L32:
        if (r20 >= r19) goto L34;
        ((rp1[]) r8.b)[r20] = null;
        r20 = r20 + 1;
        goto L32
    L34:
        r8.a -= r16;
        cf2 r21 = i0();
        Object[] r22 = r4.b;
        long[] r25 = r4.a;
        int r27 = r25.length - 2;
        char r110 = 7;
        long r111 = -9187201950435737472L;
        int r28 = 8;
        if (r27 < 0) goto L70;
        long r29 = 128;
        int r30 = 0;
    L37:
        long r112 = r25[r30];
        long r113 = 255;
        if (((((~r112) << r110) & r112) & r111) == r111) goto L67;
        int r114 = 8 - ((~(r30 - r27)) >>> 31);
        int r115 = 0;
    L40:
        if (r115 >= r114) goto L64;
        if ((r112 & 255) >= 128) goto L62;
        char r210 = r110;
        rp1 r116 = (rp1) r22[(r30 << 3) + r115];
        long r117 = r111;
        if (r21 != null) goto L46;
        cf2 r118 = this;
    L47:
        int r211 = r28;
        cf2 r31 = r118;
    L48:
        c6 r32 = r31.D;
        if (r32 != null) goto L51;
    L53:
        cf2 r33 = r31.i0();
        if (r33 == null) goto L55;
        r31 = r33;
    L55:
        w03 r34 = r31.E;
        if (r34 == null) goto L58;
        x03 r35 = (x03) r34.j(r116);
    L59:
        if (r35 == null) goto L63;
        r118.m0(r35);
    L63:
        r112 = r112 >> r211;
        r115 = r115 + 1;
        r110 = r210;
        r111 = r117;
        r28 = r211;
        goto L40
    L58:
        r35 = null;
        goto L59
    L51:
        if (ti.m0((rp1[]) r32.b, r116) < 0) goto L53;
    L46:
        r118 = r21;
        goto L47
    L62:
        r211 = r28;
        r210 = r110;
        r117 = r111;
        goto L63
    L64:
        char r212 = r110;
        long r119 = r111;
        if (r114 != r28) goto L71;
    L68:
        if (r30 == r27) goto L71;
        r30 = r30 + 1;
        r110 = r212;
        r111 = r119;
        r28 = 8;
    L71:
        r4.b();
        Object[] r36 = r3.b;
        long[] r37 = r3.a;
        int r38 = r37.length - 2;
        if (r38 < 0) goto L94;
        int r39 = 0;
    L74:
        long r40 = r37[r39];
        if (((((~r40) << r212) & r40) & r119) == r119) goto L92;
        int r41 = 8 - ((~(r39 - r38)) >>> 31);
        int r42 = 0;
    L77:
        if (r42 >= r41) goto L89;
        if ((r40 & r113) >= r29) goto L87;
        c72 r120 = (c72) ((g95) r36[(r39 << 3) + r42]).get();
        if (r120 == null) goto L87;
        if (r2 == false) goto L84;
        r120.T(false);
        goto L87
    L84:
        r120.V(false);
    L87:
        r40 = r40 >> 8;
        r42 = r42 + 1;
        goto L77
    L89:
        if (r41 != 8) goto L94;
    L92:
        if (r39 == r38) goto L94;
        r39 = r39 + 1;
    L94:
        r3.b();
        return;
    L67:
        r212 = r110;
        r119 = r111;
        goto L68
    L70:
        r212 = 7;
        r119 = -9187201950435737472L;
        r29 = 128;
        r113 = 255;
        goto L71
    }

    public final void b0(vi2 r28) {
        if (this.B == true) goto L130;
        if1 r1 = r28.g();
        wf1 r2 = r28.f();
        if1 r3 = r28.e();
        long r4 = 0;
        if (r2 != null) goto L8;
        long r5 = 9223372034707292159L;
        if (r1 != null) goto L91;
        o0();
        this.t = null;
        this.u = null;
        this.v = null;
        af2 r0 = this.s;
        if (r0 == null) goto L88;
        r0.n = false;
    L88:
        if (r0 == null) goto L128;
        r0.o = 9223372034707292159L;
        return;
    L128:
        return;
    L91:
        boolean r7 = false;
        this.u = null;
        this.v = null;
        if (this.t == r1) goto L94;
        boolean r6 = true;
    L95:
        if (r6 == false) goto L97;
    L104:
        if (r6 == false) goto L129;
        lg3 r8 = this.w;
        if (r8 == null) goto L108;
        r8.n = r28;
    L109:
        Z(r8, r5, r4);
        this.t = r28.g();
        return;
    L108:
        r8 = new lg3(r28, this, null);
        this.w = r8;
        goto L109
    L129:
        return;
    L97:
        if (k0().n == false) goto L104;
        q62 r9 = e0();
        r5 = ji2.K(r9.q(0));
        r4 = r9.k();
        if (g02.a(r5, k0().o) == true) goto L101;
    L102:
        r7 = true;
    L103:
        r6 = r7;
        goto L104
    L101:
        if (n02.a(r4, k0().p) == true) goto L103;
    L94:
        r6 = false;
        goto L95
    L8:
        if (r2 == this.u) goto L10;
    L81:
        this.u = r2;
        this.v = r3;
        o0();
        return;
    L10:
        if (r3 != this.v) goto L81;
        w03 r10 = this.z;
        long r12 = -9187201950435737472L;
        int r14 = 8;
        if (r10 == null) goto L36;
        Object[] r15 = r10.c;
        long[] r11 = r10.a;
        long r16 = 128;
        int r13 = r11.length - 2;
        if (r13 < 0) goto L34;
        char r29 = 7;
        int r17 = 0;
        af2 r18 = null;
    L17:
        long r19 = r11[r17];
        long r110 = 255;
        if (((((~r19) << 7) & r19) & r12) == r12) goto L31;
        int r111 = 8 - ((~(r17 - r13)) >>> 31);
        int r112 = 0;
    L20:
        if (r112 >= r111) goto L28;
        if ((r19 & 255) >= 128) goto L26;
        long r22 = r12;
        af2 r113 = (af2) r15[(r17 << 3) + r112];
        if (r113.n == false) goto L27;
        r18 = r113;
    L27:
        r19 = r19 >> 8;
        r112 = r112 + 1;
        r12 = r22;
        goto L20
    L26:
        r22 = r12;
        goto L27
    L28:
        long r23 = r12;
        if (r111 != 8) goto L35;
    L32:
        if (r17 == r13) goto L35;
        r17 = r17 + 1;
        r12 = r23;
    L35:
        af2 r20 = r18;
    L37:
        if (r20 == null) goto L124;
        q62 r21 = e0();
        long r24 = ji2.K(r21.q(0));
        long r25 = r21.k();
        if (g02.a(r24, r20.o) == true) goto L41;
    L42:
        w03 r26 = this.z;
        if (r26 == null) goto L126;
        Object[] r27 = r26.b;
        Object[] r30 = r26.c;
        long[] r31 = r26.a;
        int r114 = r31.length - 2;
        if (r114 < 0) goto L127;
        int r115 = 0;
    L47:
        long r116 = r31[r115];
        int r117 = r114;
        if (((((~r116) << r29) & r116) & r23) == r23) goto L78;
        int r32 = 8 - ((~(r115 - r117)) >>> 31);
        int r118 = 0;
    L50:
        if (r118 >= r32) goto L75;
        if ((r116 & r110) >= r16) goto L73;
        int r210 = (r115 << 3) + r118;
        Object r211 = r27[r210];
        af2 r119 = (af2) r30[r210];
        int r212 = r14;
        rp1 r120 = (rp1) r211;
        long[] r213 = r31;
        if (r119.n == false) goto L60;
        Object[] r33 = r27;
        if (n02.a(r119.p, r25) == true) goto L58;
    L59:
        boolean r34 = true;
    L62:
        r119.p = r25;
        r119.o = r24;
        r119.n = false;
        if (r34 == false) goto L74;
        c6 r35 = this.D;
        if (r35 == null) goto L67;
        r35.u(r120);
    L67:
        w03 r36 = this.E;
        if (r36 == null) goto L70;
        x03 r121 = (x03) r36.g(r120);
    L71:
        if (r121 == null) goto L74;
        m0(r121);
        r121.b();
        goto L74
    L70:
        r121 = null;
    L74:
        r116 = r116 >> r212;
        r118 = r118 + 1;
        r27 = r33;
        r14 = r212;
        r31 = r213;
        goto L50
    L58:
        if (g02.a(r119.o, r24) == false) goto L59;
    L61:
        r34 = false;
        goto L62
    L60:
        r33 = r27;
        goto L61
    L73:
        r213 = r31;
        r33 = r27;
        r212 = r14;
        goto L74
    L75:
        long[] r214 = r31;
        Object[] r37 = r27;
        int r38 = r14;
        if (r32 != r38) goto L131;
    L77:
        r114 = r117;
        if (r115 == r114) goto L132;
        r115 = r115 + 1;
        r14 = r38;
        r27 = r37;
        r31 = r214;
        goto L47
    L132:
        return;
    L131:
        return;
    L78:
        r214 = r31;
        r37 = r27;
        r38 = r14;
        goto L77
    L127:
        return;
    L126:
        return;
    L41:
        if (n02.a(r25, r20.p) == false) goto L42;
        return;
    L124:
        return;
    L31:
        r23 = r12;
        goto L32
    L34:
        r23 = -9187201950435737472L;
        r29 = 7;
        r110 = 255;
        r18 = null;
        goto L35
    L36:
        r23 = -9187201950435737472L;
        r29 = 7;
        r16 = 128;
        r110 = 255;
        r20 = null;
        goto L37
    }

    public final int c0(pp1 r5) {
        if (f0() == false) goto L7;
        int r6 = X(r5);
        if (r6 == Integer.MIN_VALUE) goto L7;
        return r6 + ((int) (this.r & 4294967295L));
    L7:
        return Integer.MIN_VALUE;
    }

    public abstract cf2 d0();

    public abstract q62 e0();

    public abstract boolean f0();

    public abstract c72 g0();

    public abstract vi2 h0();

    public abstract cf2 i0();

    @Override // defpackage.vb3
    public boolean j() {
        return g0().G();
    }

    public abstract long j0();

    public final af2 k0() {
        af2 r0 = this.s;
        if (r0 != null) goto L6;
        af2 r1 = new af2(this);
        this.s = r1;
        return r1;
    L6:
        return r0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m0(x03 r14) {
        Object[] r0 = r14.b;
        long[] r15 = r14.a;
        int r1 = r15.length - 2;
        if (r1 < 0) goto L21;
        int r3 = 0;
    L5:
        long r4 = r15[r3];
        if (((((~r4) << 7) & r4) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L19;
        int r6 = 8 - ((~(r3 - r1)) >>> 31);
        int r8 = 0;
    L8:
        if (r8 >= r6) goto L18;
        if ((255 & r4) >= 128) goto L17;
        c72 r9 = (c72) ((g95) r0[(r3 << 3) + r8]).get();
        if (r9 == null) goto L17;
        if (K() == false) goto L16;
        r9.T(false);
        goto L17
    L16:
        r9.V(false);
    L17:
        r4 = r4 >> 8;
        r8 = r8 + 1;
        goto L8
    L18:
        if (r6 == 8) goto L19;
        return;
    L19:
        if (r3 == r1) goto L30;
        r3 = r3 + 1;
        goto L5
    L30:
        return;
    }

    public abstract void n0();

    public final void o0() {
        c6 r0 = this.D;
        if (r0 == null) goto L8;
        int r2 = r0.a;
        int r3 = 0;
    L5:
        if (r3 >= r2) goto L7;
        ((rp1[]) r0.b)[r3] = null;
        ((float[]) r0.c)[r3] = Float.NaN;
        ((byte[]) r0.d)[r3] = 0;
        r3 = r3 + 1;
        goto L5
    L7:
        r0.a = 0;
    L8:
        w03 r1 = this.E;
        if (r1 != null) goto L11;
        return;
    L11:
        Object[] r4 = r1.c;
        long[] r5 = r1.a;
        int r6 = r5.length - 2;
        if (r6 < 0) goto L25;
        int r7 = 0;
    L14:
        long r8 = r5[r7];
        if (((((~r8) << 7) & r8) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L23;
        int r9 = 8 - ((~(r7 - r6)) >>> 31);
        int r10 = 0;
    L17:
        if (r10 >= r9) goto L22;
        if ((255 & r8) >= 128) goto L21;
        m0((x03) r4[(r7 << 3) + r10]);
    L21:
        r8 = r8 >> 8;
        r10 = r10 + 1;
        goto L17
    L22:
        if (r9 != 8) goto L25;
    L23:
        if (r7 == r6) goto L25;
        r7 = r7 + 1;
    L25:
        r1.a();
    }

    @Override // defpackage.yx2
    public final void x(boolean r5) {
        cf2 r0 = i0();
        y62 r1 = null;
        if (r0 == null) goto L5;
        c72 r2 = r0.g0();
    L7:
        if (h12.c(r2, g0()) == false) goto L10;
        this.y = r5;
        return;
    L10:
        if (r2 == null) goto L12;
        y62 r3 = r2.R.d;
    L14:
        if (r3 == y62.p) goto L21;
        if (r2 == null) goto L18;
        r1 = r2.R.d;
    L18:
        if (r1 == y62.q) goto L21;
        return;
    L21:
        this.y = r5;
        return;
    L12:
        r3 = null;
        goto L14
    L5:
        r2 = null;
        goto L7
    }
}
