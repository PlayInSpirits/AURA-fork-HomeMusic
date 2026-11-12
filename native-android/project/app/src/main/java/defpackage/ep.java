package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ep extends jc0 {
    public jc0[] p0;
    public int q0;
    public int r0;
    public boolean s0;
    public int t0;
    public boolean u0;

    public final void N(int r6, aa5 r7, ArrayList r8) {
        int r0 = 0;
        int r1 = 0;
    L4:
        if (r1 >= this.q0) goto L11;
        jc0 r2 = this.p0[r1];
        ArrayList r3 = r7.a;
        if (r3.contains(r2) == true) goto L9;
        r3.add(r2);
    L9:
        r1 = r1 + 1;
    L11:
        if (r0 >= this.q0) goto L13;
        gi1.n(this.p0[r0], r6, r8, r7);
        r0 = r0 + 1;
        goto L11
    }

    public final boolean O() {
        int r1 = 0;
        boolean r3 = true;
        int r2 = 0;
    L3:
        int r4 = this.q0;
        if (r2 >= r4) goto L23;
        jc0 r5 = this.p0[r2];
        if (this.s0 == false) goto L8;
    L10:
        int r7 = this.r0;
        if (r7 == 0) goto L14;
        if (r7 == 1) goto L14;
    L16:
        int r8 = this.r0;
        if (r8 == 2) goto L20;
        if (r8 == 3) goto L20;
    L22:
        r2 = r2 + 1;
    L20:
        if (r5.z() == true) goto L22;
    L15:
        r3 = false;
    L14:
        if (r5.y() == true) goto L16;
    L8:
        if (r5.c() == true) goto L10;
    L23:
        if (r3 == false) goto L63;
        if (r4 <= 0) goto L63;
        int r6 = 0;
        boolean r9 = false;
    L27:
        if (r1 >= this.q0) goto L55;
        jc0 r10 = this.p0[r1];
        if (this.s0 == true) goto L34;
        if (r10.c() == true) goto L34;
    L54:
        r1 = r1 + 1;
    L34:
        if (r9 == true) goto L45;
        int r11 = this.r0;
        if (r11 != 0) goto L38;
        r6 = r10.g(2).c();
    L44:
        r9 = true;
        goto L45
    L38:
        if (r11 != 1) goto L40;
        r6 = r10.g(4).c();
        goto L44
    L40:
        if (r11 != 2) goto L42;
        r6 = r10.g(3).c();
        goto L44
    L42:
        if (r11 != 3) goto L44;
        r6 = r10.g(5).c();
    L45:
        int r12 = this.r0;
        if (r12 != 0) goto L48;
        r6 = Math.min(r6, r10.g(2).c());
        goto L54
    L48:
        if (r12 != 1) goto L50;
        r6 = Math.max(r6, r10.g(4).c());
        goto L54
    L50:
        if (r12 != 2) goto L52;
        r6 = Math.min(r6, r10.g(3).c());
        goto L54
    L52:
        if (r12 != 3) goto L54;
        r6 = Math.max(r6, r10.g(5).c());
        goto L54
    L55:
        int r13 = r6 + this.t0;
        int r14 = this.r0;
        if (r14 == 0) goto L60;
        if (r14 == 1) goto L60;
        G(r13, r13);
    L61:
        this.u0 = true;
        return true;
    L60:
        F(r13, r13);
    L63:
        return false;
    }

    public final int P() {
        int r2 = this.r0;
        if (r2 != 0) goto L5;
        return 0;
    L5:
        if (r2 != 1) goto L7;
        return 0;
    L7:
        if (r2 != 2) goto L9;
    L12:
        return 1;
    L9:
        if (r2 == 3) goto L12;
        return -1;
    }

    @Override // defpackage.jc0
    public final void b(eb2 r17, boolean r18) {
        hb0[] r2 = this.P;
        hb0 r4 = this.H;
        r2[0] = r4;
        int r5 = 2;
        hb0 r6 = this.I;
        r2[2] = r6;
        hb0 r8 = this.J;
        r2[1] = r8;
        hb0 r10 = this.K;
        r2[3] = r10;
        int r11 = 0;
    L4:
        if (r11 >= r2.length) goto L6;
        hb0 r12 = r2[r11];
        r12.i = r17.k(r12);
        r11 = r11 + 1;
        goto L4
    L6:
        int r13 = this.r0;
        if (r13 >= 0) goto L9;
        return;
    L9:
        if (r13 >= 4) goto L133;
        hb0 r3 = r2[r13];
        if (this.u0 == true) goto L14;
        O();
    L14:
        if (this.u0 == false) goto L25;
        this.u0 = false;
        int r7 = this.r0;
        if (r7 == 0) goto L23;
        if (r7 == 1) goto L23;
        if (r7 == 2) goto L21;
        if (r7 == 3) goto L21;
        return;
    L21:
        r17.d(r6.i, this.Y);
        r17.d(r10.i, this.Y);
        return;
    L23:
        r17.d(r4.i, this.X);
        r17.d(r8.i, this.X);
        return;
    L25:
        int r14 = 0;
    L27:
        if (r14 >= this.q0) goto L53;
        jc0 r15 = this.p0[r14];
        if (this.s0 == false) goto L31;
    L33:
        int r16 = this.r0;
        if (r16 == 0) goto L37;
        if (r16 == 1) goto L37;
    L43:
        if (r16 == 2) goto L46;
        if (r16 == 3) goto L46;
    L52:
        r14 = r14 + 1;
    L46:
        if (r15.o0[1] != 3) goto L52;
        if (r15.I.f == null) goto L52;
        if (r15.K.f == null) goto L52;
    L42:
        boolean r19 = true;
    L55:
        if (r4.e() == false) goto L57;
    L60:
        boolean r110 = true;
    L62:
        if (r6.e() == false) goto L64;
    L67:
        boolean r111 = true;
    L68:
        if (r19 == true) goto L79;
        int r112 = this.r0;
        if (r112 != 0) goto L72;
        if (r110 == false) goto L72;
    L78:
        boolean r113 = true;
    L80:
        if (r113 == true) goto L82;
        int r114 = 4;
    L83:
        int r115 = 0;
    L85:
        if (r115 >= this.q0) goto L104;
        jc0 r116 = this.p0[r115];
        if (this.s0 == false) goto L89;
    L91:
        ai4 r9 = r17.k(r116.P[this.r0]);
        hb0[] r117 = r116.P;
        int r118 = this.r0;
        hb0 r119 = r117[r118];
        r119.i = r9;
        hb0 r20 = r119.f;
        if (r20 != null) goto L94;
    L96:
        int r21 = 0;
    L97:
        if (r118 == 0) goto L101;
        if (r118 == r5) goto L101;
        ai4 r120 = r3.i;
        int r121 = this.t0 + r21;
        pi r22 = r17.l();
        ai4 r122 = r17.m();
        r122.q = 0;
        r22.b(r120, r9, r122, r121);
        r17.c(r22);
    L102:
        r17.e(r3.i, r9, this.t0 + r21, r114);
    L103:
        r115 = r115 + 1;
        r5 = 2;
    L101:
        ai4 r23 = r3.i;
        int r123 = this.t0 - r21;
        pi r124 = r17.l();
        ai4 r125 = r17.m();
        r125.q = 0;
        r124.c(r23, r9, r125, r123);
        r17.c(r124);
        goto L102
    L94:
        if (r20.d != this) goto L96;
        r21 = r119.g;
        goto L97
    L89:
        if (r116.c() == true) goto L91;
    L104:
        int r24 = this.r0;
        if (r24 != 0) goto L109;
        r17.e(r8.i, r4.i, 0, 8);
        r17.e(r4.i, this.S.J.i, 0, 4);
        r17.e(r4.i, this.S.H.i, 0, 0);
        return;
    L109:
        if (r24 != 1) goto L113;
        r17.e(r4.i, r8.i, 0, 8);
        r17.e(r4.i, this.S.H.i, 0, 4);
        r17.e(r4.i, this.S.J.i, 0, 0);
        return;
    L113:
        if (r24 != 2) goto L117;
        r17.e(r10.i, r6.i, 0, 8);
        r17.e(r6.i, this.S.K.i, 0, 4);
        r17.e(r6.i, this.S.I.i, 0, 0);
        return;
    L117:
        if (r24 != 3) goto L135;
        r17.e(r6.i, r10.i, 0, 8);
        r17.e(r6.i, this.S.I.i, 0, 4);
        r17.e(r6.i, this.S.K.i, 0, 0);
        return;
    L135:
        return;
    L82:
        r114 = 5;
    L72:
        if (r112 != 2) goto L74;
        if (r111 == true) goto L78;
    L74:
        if (r112 != 1) goto L76;
        if (r110 == true) goto L78;
    L76:
        if (r112 != 3) goto L79;
        if (r111 == true) goto L78;
    L79:
        r113 = false;
        goto L80
    L64:
        if (r10.e() == true) goto L67;
        r111 = false;
        goto L68
    L57:
        if (r8.e() == true) goto L60;
        r110 = false;
    L37:
        if (r15.o0[0] != 3) goto L43;
        if (r15.H.f == null) goto L43;
        if (r15.J.f == null) goto L43;
    L31:
        if (r15.c() == true) goto L33;
    L53:
        r19 = false;
        goto L55
    }

    @Override // defpackage.jc0
    public final boolean c() {
        return true;
    }

    @Override // defpackage.jc0
    public final String toString() {
        String r0 = b11.q(new StringBuilder("[Barrier] "), this.g0, " {");
        int r1 = 0;
    L4:
        if (r1 >= this.q0) goto L10;
        jc0 r2 = this.p0[r1];
        if (r1 <= 0) goto L8;
        r0 = r0.concat(", ");
    L8:
        StringBuilder r3 = xa3.i(r0);
        r3.append(r2.g0);
        r0 = r3.toString();
        r1 = r1 + 1;
        goto L4
    L10:
        return r0.concat("}");
    }

    @Override // defpackage.jc0
    public final boolean y() {
        return this.u0;
    }

    @Override // defpackage.jc0
    public final boolean z() {
        return this.u0;
    }
}
