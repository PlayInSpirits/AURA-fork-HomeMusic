package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class up1 extends ba5 {
    public static final int[] k = null;

    static {
        k = new int[2];
    }

    public static void m(int[] r2, int r3, int r4, int r5, int r6, float r7, int r8) {
        int r9 = r4 - r3;
        int r10 = r6 - r5;
        if (r8 == (-1)) goto L11;
        if (r8 == 0) goto L9;
        if (r8 != 1) goto L19;
        r2[0] = r9;
        r2[1] = (int) ((r9 * r7) + 0.5f);
        return;
    L19:
        return;
    L9:
        r2[0] = (int) ((r10 * r7) + 0.5f);
        r2[1] = r10;
        return;
    L11:
        int r11 = (int) ((r10 * r7) + 0.5f);
        int r12 = (int) ((r9 / r7) + 0.5f);
        if (r11 > r9) goto L15;
        r2[0] = r11;
        r2[1] = r10;
        return;
    L15:
        if (r12 > r10) goto L18;
        r2[0] = r9;
        r2[1] = r12;
        return;
    }

    @Override // defpackage.uo0
    public final void a(uo0 r24) {
        if (xa3.w(this.j) == 3) goto L170;
        eq0 r1 = this.e;
        boolean r4 = r1.j;
        yo0 r7 = this.h;
        yo0 r8 = this.i;
        if (r4 == false) goto L7;
    L11:
        float r25 = 0.5f;
    L125:
        boolean r5 = r7.c;
        ArrayList r6 = r7.l;
        if (r5 == false) goto L179;
        boolean r9 = r8.c;
        ArrayList r10 = r8.l;
        if (r9 == true) goto L131;
        return;
    L131:
        if (r7.j == false) goto L138;
        if (r8.j == false) goto L138;
        if (r1.j == false) goto L138;
        return;
    L138:
        if (r1.j == true) goto L148;
        if (this.d != 3) goto L148;
        jc0 r11 = this.b;
        if (r11.r != 0) goto L148;
        if (r11.v() == true) goto L148;
        yo0 r0 = (yo0) r6.get(0);
        yo0 r2 = (yo0) r10.get(0);
        int r3 = r0.g + r7.f;
        int r12 = r2.g + r8.f;
        r7.d(r3);
        r8.d(r12);
        r1.d(r12 - r3);
        return;
    L148:
        if (r1.j == true) goto L162;
        if (this.d != 3) goto L162;
        if (this.a != 1) goto L162;
        if (r6.size() <= 0) goto L162;
        if (r10.size() <= 0) goto L162;
        yo0 r13 = (yo0) r6.get(0);
        yo0 r14 = (yo0) r10.get(0);
        int r15 = Math.min((r14.g + r8.f) - (r13.g + r7.f), r1.m);
        jc0 r16 = this.b;
        int r17 = r16.v;
        int r18 = Math.max(r16.u, r15);
        if (r17 <= 0) goto L160;
        r18 = Math.min(r17, r18);
    L160:
        r1.d(r18);
    L162:
        if (r1.j == false) goto L187;
        yo0 r19 = (yo0) r6.get(0);
        yo0 r20 = (yo0) r10.get(0);
        int r21 = r19.g;
        int r22 = r7.f + r21;
        int r23 = r20.g;
        int r26 = r8.f + r23;
        float r27 = this.b.c0;
        if (r19 != r20) goto L167;
        r27 = r25;
    L168:
        r7.d((int) ((((r23 - r21) - r1.g) * r27) + (r21 + r25)));
        r8.d(r7.g + r1.g);
        return;
    L167:
        r21 = r22;
        r23 = r26;
        goto L168
    L187:
        return;
    L179:
        return;
    L7:
        if (this.d != 3) goto L11;
        jc0 r28 = this.b;
        int r29 = r28.r;
        if (r29 == 2) goto L120;
        if (r29 != 3) goto L11;
        int r30 = r28.s;
        if (r30 == 0) goto L27;
        if (r30 == 3) goto L27;
        int r31 = r28.W;
        if (r31 == (-1)) goto L25;
        if (r31 == 0) goto L24;
        if (r31 == 1) goto L21;
        int r32 = 0;
    L26:
        r1.d(r32);
        goto L11
    L21:
        float r33 = r28.e.e.g;
        float r34 = r28.V;
    L22:
        float r35 = r33 * r34;
    L23:
        r32 = (int) (r35 + 0.5f);
        goto L26
    L24:
        r35 = r28.e.e.g / r28.V;
        goto L23
    L25:
        r33 = r28.e.e.g;
        r34 = r28.V;
    L27:
        w45 r36 = r28.e;
        yo0 r110 = r36.h;
        yo0 r37 = r36.i;
        if (r28.H.f == null) goto L30;
        boolean r111 = true;
    L32:
        if (r28.I.f == null) goto L34;
        boolean r112 = true;
    L36:
        if (r28.J.f == null) goto L38;
        boolean r113 = true;
    L40:
        if (r28.K.f == null) goto L43;
        boolean r114 = true;
    L42:
        r25 = 0.5f;
        int r38 = r28.W;
        if (r111 == false) goto L80;
        if (r112 == false) goto L80;
        if (r113 == false) goto L80;
        if (r114 == false) goto L80;
        float r39 = r28.V;
        boolean r115 = r110.j;
        ArrayList r116 = r110.l;
        int[] r117 = k;
        if (r115 == false) goto L61;
        if (r37.j == false) goto L61;
        if (r7.c == true) goto L56;
        return;
    L56:
        if (r8.c == false) goto L180;
        m(r117, ((yo0) r7.l.get(0)).g + r7.f, ((yo0) r8.l.get(0)).g - r8.f, r110.g + r110.f, r37.g - r37.f, r39, r38);
        r1.d(r117[0]);
        this.b.e.e.d(r117[1]);
        return;
    L180:
        return;
    L61:
        if (r7.j == false) goto L71;
        if (r8.j == false) goto L71;
        if (r110.c == true) goto L67;
        return;
    L67:
        if (r37.c == false) goto L181;
        m(r117, r7.g + r7.f, r8.g - r8.f, ((yo0) r116.get(0)).g + r110.f, ((yo0) r37.l.get(0)).g - r37.f, r39, r38);
        r1.d(r117[0]);
        this.b.e.e.d(r117[1]);
        goto L71
    L181:
        return;
    L71:
        if (r7.c == true) goto L73;
        return;
    L73:
        if (r8.c == true) goto L75;
        return;
    L75:
        if (r110.c == true) goto L77;
        return;
    L77:
        if (r37.c == false) goto L182;
        m(r117, ((yo0) r7.l.get(0)).g + r7.f, ((yo0) r8.l.get(0)).g - r8.f, ((yo0) r116.get(0)).g + r110.f, ((yo0) r37.l.get(0)).g - r37.f, r39, r38);
        r1.d(r117[0]);
        this.b.e.e.d(r117[1]);
        goto L125
    L182:
        return;
    L80:
        if (r111 == false) goto L100;
        if (r113 == false) goto L100;
        if (r7.c == true) goto L85;
        return;
    L85:
        if (r8.c == false) goto L183;
        float r40 = r28.V;
        int r41 = ((yo0) r7.l.get(0)).g + r7.f;
        int r118 = ((yo0) r8.l.get(0)).g - r8.f;
        if (r38 == (-1)) goto L96;
        if (r38 == 0) goto L96;
        if (r38 != 1) goto L125;
        int r42 = g(r118 - r41, 0);
        int r43 = (int) ((r42 / r40) + 0.5f);
        int r119 = g(r43, 1);
        if (r43 == r119) goto L95;
        r42 = (int) ((r119 * r40) + 0.5f);
    L95:
        r1.d(r42);
        this.b.e.e.d(r119);
    L96:
        int r44 = g(r118 - r41, 0);
        int r45 = (int) ((r44 * r40) + 0.5f);
        int r120 = g(r45, 1);
        if (r45 == r120) goto L99;
        r44 = (int) ((r120 / r40) + 0.5f);
    L99:
        r1.d(r44);
        this.b.e.e.d(r120);
        goto L125
    L183:
        return;
    L100:
        if (r112 == false) goto L125;
        if (r114 == false) goto L125;
        if (r110.c == true) goto L105;
        return;
    L105:
        if (r37.c == false) goto L184;
        float r46 = r28.V;
        int r121 = ((yo0) r110.l.get(0)).g + r110.f;
        int r122 = ((yo0) r37.l.get(0)).g - r37.f;
        if (r38 == (-1)) goto L116;
        if (r38 == 0) goto L112;
        if (r38 == 1) goto L116;
    L112:
        int r47 = g(r122 - r121, 1);
        int r48 = (int) ((r47 * r46) + 0.5f);
        int r123 = g(r48, 0);
        if (r48 == r123) goto L115;
        r47 = (int) ((r123 / r46) + 0.5f);
    L115:
        r1.d(r123);
        this.b.e.e.d(r47);
    L116:
        int r49 = g(r122 - r121, 1);
        int r50 = (int) ((r49 / r46) + 0.5f);
        int r124 = g(r50, 0);
        if (r50 == r124) goto L119;
        r49 = (int) ((r124 * r46) + 0.5f);
    L119:
        r1.d(r124);
        this.b.e.e.d(r49);
        goto L125
    L184:
        return;
    L43:
        r114 = false;
        goto L42
    L38:
        r113 = false;
        goto L40
    L34:
        r112 = false;
        goto L36
    L30:
        r111 = false;
        goto L32
    L120:
        r25 = 0.5f;
        jc0 r51 = r28.S;
        if (r51 == null) goto L125;
        eq0 r52 = r51.d.e;
        if (r52.j == false) goto L125;
        r1.d((int) ((r52.g * r28.w) + 0.5f));
        goto L125
    L170:
        jc0 r53 = this.b;
        l(r53.H, r53.J, 0);
    }

    @Override // defpackage.ba5
    public final void d() {
        jc0 r0 = this.b;
        boolean r1 = r0.a;
        eq0 r2 = this.e;
        if (r1 == false) goto L5;
        r2.d(r0.o());
    L5:
        boolean r3 = r2.j;
        ArrayList r4 = r2.k;
        ArrayList r5 = r2.l;
        yo0 r8 = this.i;
        yo0 r9 = this.h;
        if (r3 == true) goto L20;
        jc0 r6 = this.b;
        int r10 = r6.o0[0];
        this.d = r10;
        if (r10 == 3) goto L29;
        if (r10 != 4) goto L17;
        jc0 r11 = r6.S;
        if (r11 == null) goto L17;
        int r12 = r11.o0[0];
        if (r12 == 1) goto L15;
        if (r12 != 4) goto L17;
    L15:
        int r7 = (r11.o() - this.b.H.d()) - this.b.J.d();
        ba5.b(r9, r11.d.h, this.b.H.d());
        ba5.b(r8, r11.d.i, -this.b.J.d());
        r2.d(r7);
        return;
    L17:
        if (r10 != 1) goto L29;
        r2.d(r6.o());
    L29:
        if (r2.j == false) goto L68;
        jc0 r13 = this.b;
        if (r13.a == false) goto L68;
        hb0[] r14 = r13.P;
        hb0 r15 = r14[0];
        hb0 r16 = r15.f;
        if (r16 != null) goto L35;
    L48:
        if (r16 == null) goto L53;
        yo0 r17 = ba5.h(r15);
        if (r17 == null) goto L119;
        ba5.b(r9, r17, this.b.P[0].d());
        ba5.b(r8, r9, r2.g);
        return;
    L119:
        return;
    L53:
        hb0 r18 = r14[1];
        if (r18.f == null) goto L60;
        yo0 r19 = ba5.h(r18);
        if (r19 == null) goto L120;
        ba5.b(r8, r19, -this.b.P[1].d());
        ba5.b(r9, r8, -r2.g);
        return;
    L120:
        return;
    L60:
        if ((r13 instanceof ep) == false) goto L62;
        return;
    L62:
        if (r13.S != null) goto L64;
        return;
    L64:
        if (r13.g(7).f != null) goto L123;
        jc0 r110 = this.b;
        ba5.b(r9, r110.S.d.h, r110.p());
        ba5.b(r8, r9, r2.g);
        return;
    L123:
        return;
    L35:
        if (r14[1].f == null) goto L48;
        boolean r20 = r13.v();
        jc0 r21 = this.b;
        if (r20 == false) goto L40;
        r9.f = r21.P[0].d();
        r8.f = -this.b.P[1].d();
        return;
    L40:
        yo0 r22 = ba5.h(r21.P[0]);
        if (r22 == null) goto L43;
        ba5.b(r9, r22, this.b.P[0].d());
    L43:
        yo0 r23 = ba5.h(this.b.P[1]);
        if (r23 == null) goto L46;
        ba5.b(r8, r23, -this.b.P[1].d());
    L46:
        r9.b = true;
        r8.b = true;
        return;
    L68:
        if (this.d != 3) goto L87;
        jc0 r24 = this.b;
        int r111 = r24.r;
        if (r111 == 2) goto L83;
        if (r111 != 3) goto L87;
        if (r24.s != 3) goto L82;
        r9.a = this;
        r8.a = this;
        w45 r25 = r24.e;
        r25.h.a = this;
        r25.i.a = this;
        r2.a = this;
        if (r24.w() == false) goto L78;
        r5.add(this.b.e.e);
        this.b.e.e.k.add(r2);
        w45 r26 = this.b.e;
        r26.e.a = this;
        r5.add(r26.h);
        r5.add(this.b.e.i);
        this.b.e.h.k.add(r2);
        this.b.e.i.k.add(r2);
        goto L87
    L78:
        boolean r27 = this.b.v();
        jc0 r28 = this.b;
        if (r27 == false) goto L81;
        r28.e.e.l.add(r2);
        r4.add(this.b.e.e);
        goto L87
    L81:
        r28.e.e.l.add(r2);
        goto L87
    L82:
        eq0 r29 = r24.e.e;
        r5.add(r29);
        r29.k.add(r2);
        this.b.e.h.k.add(r2);
        this.b.e.i.k.add(r2);
        r2.b = true;
        r4.add(r9);
        r4.add(r8);
        r9.l.add(r2);
        r8.l.add(r2);
        goto L87
    L83:
        jc0 r30 = r24.S;
        if (r30 == null) goto L87;
        eq0 r31 = r30.e.e;
        r5.add(r31);
        r31.k.add(r2);
        r2.b = true;
        r4.add(r9);
        r4.add(r8);
    L87:
        jc0 r32 = this.b;
        hb0[] r33 = r32.P;
        hb0 r34 = r33[0];
        hb0 r35 = r34.f;
        if (r35 != null) goto L90;
    L102:
        if (r35 == null) goto L107;
        yo0 r36 = ba5.h(r34);
        if (r36 == null) goto L124;
        ba5.b(r9, r36, this.b.P[0].d());
        c(r8, r9, 1, r2);
        return;
    L124:
        return;
    L107:
        hb0 r37 = r33[1];
        if (r37.f == null) goto L114;
        yo0 r38 = ba5.h(r37);
        if (r38 == null) goto L125;
        ba5.b(r8, r38, -this.b.P[1].d());
        c(r9, r8, -1, r2);
        return;
    L125:
        return;
    L114:
        if ((r32 instanceof ep) == true) goto L126;
        jc0 r39 = r32.S;
        if (r39 == null) goto L127;
        ba5.b(r9, r39.d.h, r32.p());
        c(r8, r9, 1, r2);
        return;
    L127:
        return;
    L126:
        return;
    L90:
        if (r33[1].f == null) goto L102;
        boolean r40 = r32.v();
        jc0 r41 = this.b;
        if (r40 == false) goto L95;
        r9.f = r41.P[0].d();
        r8.f = -this.b.P[1].d();
        return;
    L95:
        yo0 r42 = ba5.h(r41.P[0]);
        yo0 r43 = ba5.h(this.b.P[1]);
        if (r42 == null) goto L98;
        r42.b(this);
    L98:
        if (r43 == null) goto L100;
        r43.b(this);
    L100:
        this.j = 4;
        return;
    L20:
        if (this.d != 4) goto L29;
        jc0 r44 = this.b;
        jc0 r112 = r44.S;
        if (r112 == null) goto L29;
        int r113 = r112.o0[0];
        if (r113 == 1) goto L26;
        if (r113 != 4) goto L29;
    L26:
        ba5.b(r9, r112.d.h, r44.H.d());
        ba5.b(r8, r112.d.i, -this.b.J.d());
    }

    @Override // defpackage.ba5
    public final void e() {
        yo0 r0 = this.h;
        if (r0.j == false) goto L6;
        jc0 r2 = this.b;
        r2.X = r0.g;
        return;
    }

    @Override // defpackage.ba5
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.e.c();
        this.g = false;
    }

    @Override // defpackage.ba5
    public final boolean k() {
        if (this.d == 3) goto L5;
        return true;
    L5:
        if (this.b.r == 0) goto L11;
        return false;
    L11:
        return true;
    }

    public final void n() {
        this.g = false;
        yo0 r1 = this.h;
        r1.c();
        r1.j = false;
        yo0 r2 = this.i;
        r2.c();
        r2.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.b.g0;
    }
}
