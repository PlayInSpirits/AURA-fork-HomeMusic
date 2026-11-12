package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class w45 extends ba5 {
    public yo0 k;
    public gr l;

    @Override // defpackage.uo0
    public final void a(uo0 r11) {
        if (xa3.w(this.j) == 3) goto L81;
        eq0 r12 = this.e;
        if (r12.c == true) goto L7;
    L32:
        yo0 r2 = this.h;
        boolean r5 = r2.c;
        ArrayList r6 = r2.l;
        if (r5 == false) goto L83;
        yo0 r7 = this.i;
        boolean r8 = r7.c;
        ArrayList r9 = r7.l;
        if (r8 == true) goto L38;
        return;
    L38:
        if (r2.j == false) goto L45;
        if (r7.j == false) goto L45;
        if (r12.j == false) goto L45;
        return;
    L45:
        if (r12.j == true) goto L55;
        if (this.d != 3) goto L55;
        jc0 r10 = this.b;
        if (r10.r != 0) goto L55;
        if (r10.w() == true) goto L55;
        yo0 r13 = (yo0) r6.get(0);
        yo0 r0 = (yo0) r9.get(0);
        int r14 = r13.g + r2.f;
        int r1 = r0.g + r7.f;
        r2.d(r14);
        r7.d(r1);
        r12.d(r1 - r14);
        return;
    L55:
        if (r12.j == true) goto L69;
        if (this.d != 3) goto L69;
        if (this.a != 1) goto L69;
        if (r6.size() <= 0) goto L69;
        if (r9.size() <= 0) goto L69;
        yo0 r3 = (yo0) r6.get(0);
        yo0 r4 = (yo0) r9.get(0);
        int r15 = (r4.g + r7.f) - (r3.g + r2.f);
        int r16 = r12.m;
        if (r15 >= r16) goto L67;
        r12.d(r15);
        goto L69
    L67:
        r12.d(r16);
    L69:
        if (r12.j == true) goto L72;
        return;
    L72:
        if (r6.size() > 0) goto L74;
        return;
    L74:
        if (r9.size() <= 0) goto L85;
        yo0 r17 = (yo0) r6.get(0);
        yo0 r18 = (yo0) r9.get(0);
        int r19 = r17.g;
        int r20 = r2.f + r19;
        int r21 = r18.g;
        int r22 = r7.f + r21;
        float r110 = this.b.d0;
        if (r17 != r18) goto L78;
        r110 = 0.5f;
    L79:
        r2.d((int) ((((r21 - r19) - r12.g) * r110) + (r19 + 0.5f)));
        r7.d(r2.g + r12.g);
        return;
    L78:
        r19 = r20;
        r21 = r22;
        goto L79
    L85:
        return;
    L83:
        return;
    L7:
        if (r12.j == true) goto L32;
        if (this.d != 3) goto L32;
        jc0 r23 = this.b;
        int r24 = r23.s;
        if (r24 == 2) goto L27;
        if (r24 != 3) goto L32;
        eq0 r25 = r23.d.e;
        if (r25.j == false) goto L32;
        int r26 = r23.W;
        if (r26 == (-1)) goto L25;
        if (r26 == 0) goto L24;
        if (r26 == 1) goto L21;
        int r27 = 0;
    L26:
        r12.d(r27);
        goto L32
    L21:
        float r28 = r25.g;
        float r29 = r23.V;
    L22:
        float r30 = r28 / r29;
    L23:
        r27 = (int) (r30 + 0.5f);
        goto L26
    L24:
        r30 = r25.g * r23.V;
        goto L23
    L25:
        r28 = r25.g;
        r29 = r23.V;
        goto L22
    L27:
        jc0 r31 = r23.S;
        if (r31 == null) goto L32;
        eq0 r32 = r31.e.e;
        if (r32.j == false) goto L32;
        r12.d((int) ((r32.g * r23.z) + 0.5f));
        goto L32
    L81:
        jc0 r111 = this.b;
        l(r111.I, r111.K, 1);
    }

    @Override // defpackage.ba5
    public final void d() {
        yo0 r0 = this.k;
        jc0 r1 = this.b;
        boolean r2 = r1.a;
        eq0 r3 = this.e;
        if (r2 == false) goto L5;
        r3.d(r1.i());
    L5:
        boolean r4 = r3.j;
        ArrayList r5 = r3.k;
        ArrayList r6 = r3.l;
        yo0 r8 = this.i;
        yo0 r9 = this.h;
        if (r4 == true) goto L22;
        jc0 r7 = this.b;
        this.d = r7.o0[1];
        if (r7.E == false) goto L10;
        this.l = new gr(this);
    L10:
        int r10 = this.d;
        if (r10 == 3) goto L29;
        if (r10 != 4) goto L19;
        jc0 r11 = this.b.S;
        if (r11 == null) goto L19;
        if (r11.o0[1] != 1) goto L19;
        int r12 = (r11.i() - this.b.I.d()) - this.b.K.d();
        ba5.b(r9, r11.e.h, this.b.I.d());
        ba5.b(r8, r11.e.i, -this.b.K.d());
        r3.d(r12);
        return;
    L19:
        if (r10 != 1) goto L29;
        r3.d(this.b.i());
    L29:
        boolean r13 = r3.j;
        if (r13 == false) goto L83;
        jc0 r14 = this.b;
        if (r14.a == false) goto L83;
        hb0[] r15 = r14.P;
        hb0 r16 = r15[2];
        hb0 r17 = r16.f;
        if (r17 != null) goto L36;
    L51:
        if (r17 == null) goto L58;
        yo0 r18 = ba5.h(r16);
        if (r18 == null) goto L162;
        ba5.b(r9, r18, this.b.P[2].d());
        ba5.b(r8, r9, r3.g);
        jc0 r19 = this.b;
        if (r19.E == false) goto L163;
        ba5.b(r0, r9, r19.Z);
        return;
    L163:
        return;
    L162:
        return;
    L58:
        hb0 r20 = r15[3];
        if (r20.f == null) goto L67;
        yo0 r21 = ba5.h(r20);
        if (r21 == null) goto L63;
        ba5.b(r8, r21, -this.b.P[3].d());
        ba5.b(r9, r8, -r3.g);
    L63:
        jc0 r110 = this.b;
        if (r110.E == false) goto L164;
        ba5.b(r0, r9, r110.Z);
        return;
    L164:
        return;
    L67:
        hb0 r22 = r15[4];
        if (r22.f == null) goto L74;
        yo0 r23 = ba5.h(r22);
        if (r23 == null) goto L165;
        ba5.b(r0, r23, 0);
        ba5.b(r9, r0, -this.b.Z);
        ba5.b(r8, r9, r3.g);
        return;
    L165:
        return;
    L74:
        if ((r14 instanceof ep) == false) goto L76;
        return;
    L76:
        if (r14.S != null) goto L78;
        return;
    L78:
        if (r14.g(7).f != null) goto L168;
        jc0 r24 = this.b;
        ba5.b(r9, r24.S.e.h, r24.q());
        ba5.b(r8, r9, r3.g);
        jc0 r111 = this.b;
        if (r111.E == false) goto L169;
        ba5.b(r0, r9, r111.Z);
        return;
    L169:
        return;
    L168:
        return;
    L36:
        if (r15[3].f == null) goto L51;
        boolean r25 = r14.w();
        jc0 r26 = this.b;
        if (r25 == false) goto L40;
        r9.f = r26.P[2].d();
        r8.f = -this.b.P[3].d();
    L47:
        jc0 r112 = this.b;
        if (r112.E == false) goto L161;
        ba5.b(r0, r9, r112.Z);
        return;
    L161:
        return;
    L40:
        yo0 r27 = ba5.h(r26.P[2]);
        if (r27 == null) goto L43;
        ba5.b(r9, r27, this.b.P[2].d());
    L43:
        yo0 r28 = ba5.h(this.b.P[3]);
        if (r28 == null) goto L46;
        ba5.b(r8, r28, -this.b.P[3].d());
    L46:
        r9.b = true;
        r8.b = true;
    L83:
        if (r13 == false) goto L85;
    L100:
        r3.b(this);
    L101:
        jc0 r29 = this.b;
        hb0[] r30 = r29.P;
        hb0 r113 = r30[2];
        hb0 r114 = r113.f;
        if (r114 == null) goto L118;
        if (r30[3].f == null) goto L118;
        boolean r31 = r29.w();
        jc0 r32 = this.b;
        if (r31 == false) goto L108;
        r9.f = r32.P[2].d();
        r8.f = -this.b.P[3].d();
    L115:
        if (this.b.E == false) goto L158;
        c(r0, r9, 1, this.l);
    L158:
        if (r6.size() != 0) goto L170;
        r3.c = true;
        return;
    L170:
        return;
    L108:
        yo0 r33 = ba5.h(r32.P[2]);
        yo0 r34 = ba5.h(this.b.P[3]);
        if (r33 == null) goto L111;
        r33.b(this);
    L111:
        if (r34 == null) goto L113;
        r34.b(this);
    L113:
        this.j = 4;
    L118:
        if (r114 == null) goto L131;
        yo0 r35 = ba5.h(r113);
        if (r35 == null) goto L158;
        ba5.b(r9, r35, this.b.P[2].d());
        c(r8, r9, 1, r3);
        if (this.b.E == false) goto L125;
        c(r0, r9, 1, this.l);
    L125:
        if (this.d != 3) goto L158;
        jc0 r36 = this.b;
        if (r36.V <= 0.0f) goto L158;
        up1 r37 = r36.d;
        if (r37.d != 3) goto L158;
        r37.e.k.add(r3);
        r6.add(this.b.d.e);
        r3.a = this;
        goto L158
    L131:
        hb0 r115 = r30[3];
        if (r115.f == null) goto L138;
        yo0 r38 = ba5.h(r115);
        if (r38 == null) goto L158;
        ba5.b(r8, r38, -this.b.P[3].d());
        c(r9, r8, -1, r3);
        if (this.b.E == false) goto L158;
        c(r0, r9, 1, this.l);
        goto L158
    L138:
        hb0 r39 = r30[4];
        if (r39.f == null) goto L144;
        yo0 r40 = ba5.h(r39);
        if (r40 == null) goto L158;
        ba5.b(r0, r40, 0);
        c(r9, r0, -1, this.l);
        c(r8, r9, 1, r3);
        goto L158
    L144:
        if ((r29 instanceof ep) == true) goto L158;
        jc0 r41 = r29.S;
        if (r41 == null) goto L158;
        ba5.b(r9, r41.e.h, r29.q());
        c(r8, r9, 1, r3);
        if (this.b.E == false) goto L151;
        c(r0, r9, 1, this.l);
    L151:
        if (this.d != 3) goto L158;
        jc0 r42 = this.b;
        if (r42.V <= 0.0f) goto L158;
        up1 r43 = r42.d;
        if (r43.d != 3) goto L158;
        r43.e.k.add(r3);
        r6.add(this.b.d.e);
        r3.a = this;
        goto L158
    L85:
        if (this.d != 3) goto L100;
        jc0 r44 = this.b;
        int r116 = r44.s;
        if (r116 == 2) goto L96;
        if (r116 != 3) goto L101;
        if (r44.w() == true) goto L101;
        jc0 r45 = this.b;
        if (r45.r == 3) goto L101;
        eq0 r46 = r45.d.e;
        r6.add(r46);
        r46.k.add(r3);
        r3.b = true;
        r5.add(r9);
        r5.add(r8);
        goto L101
    L96:
        jc0 r47 = r44.S;
        if (r47 == null) goto L101;
        eq0 r48 = r47.e.e;
        r6.add(r48);
        r48.k.add(r3);
        r3.b = true;
        r5.add(r9);
        r5.add(r8);
        goto L101
    L22:
        if (this.d != 4) goto L29;
        jc0 r49 = this.b;
        jc0 r117 = r49.S;
        if (r117 == null) goto L29;
        if (r117.o0[1] != 1) goto L29;
        ba5.b(r9, r117.e.h, r49.I.d());
        ba5.b(r8, r117.e.i, -this.b.K.d());
    }

    @Override // defpackage.ba5
    public final void e() {
        yo0 r0 = this.h;
        if (r0.j == false) goto L6;
        jc0 r2 = this.b;
        r2.Y = r0.g;
        return;
    }

    @Override // defpackage.ba5
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.k.c();
        this.e.c();
        this.g = false;
    }

    @Override // defpackage.ba5
    public final boolean k() {
        if (this.d == 3) goto L5;
        return true;
    L5:
        if (this.b.s == 0) goto L11;
        return false;
    L11:
        return true;
    }

    public final void m() {
        this.g = false;
        yo0 r1 = this.h;
        r1.c();
        r1.j = false;
        yo0 r2 = this.i;
        r2.c();
        r2.j = false;
        yo0 r3 = this.k;
        r3.c();
        r3.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.b.g0;
    }
}
