package defpackage;

import android.os.Trace;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ba1 extends cx2 implements a90, b83, fx2, eo0 {
    public final wf1 B;
    public boolean C;
    public boolean D;
    public final int E;
    public c12 F;

    public ba1(int r1, wf1 r2, int r3) {
        if ((r3 & 4) == 0) goto L5;
        r2 = null;
    L5:
        this.B = r2;
        this.E = r1;
    }

    @Override // defpackage.b83
    public final void Q() {
        w0();
    }

    @Override // defpackage.cx2
    public final boolean f0() {
        return false;
    }

    @Override // defpackage.cx2
    public final void i0() {
    }

    @Override // defpackage.cx2
    public final void j0() {
        int r0 = v0().ordinal();
        if (r0 == 0) goto L13;
        if (r0 != 1) goto L6;
        ((ra) j51.P(this)).getFocusOwner();
        te5.p(this);
    L14:
        c12 r1 = this.F;
        if (r1 == null) goto L17;
        r1.k();
    L17:
        this.F = null;
        return;
    L6:
        if (r0 == 2) goto L13;
        if (r0 == 3) goto L14;
        er1.n();
        return;
    L13:
        ey r2 = (ey) ((ra) j51.P(this)).getFocusOwner();
        r2.b(8, true, false);
        ((s91) r2.d).a();
        goto L14
    }

    @Override // defpackage.cx2
    public final void k0() {
        if (v0().a() == false) goto L6;
        ((ey) ((ra) j51.P(this)).getFocusOwner()).b(8, true, true);
        return;
    }

    public final boolean q0() {
        int r1 = uc5.O(this).ordinal();
        if (r1 == 0) goto L11;
        if (r1 == 1) goto L181;
        if (r1 == 2) goto L220;
        if (r1 == 3) goto L181;
        er1.n();
        return false;
    L220:
        return true;
    L181:
        return false;
    L11:
        ey r2 = (ey) ((ra) j51.P(this)).getFocusOwner();
        ba1 r6 = r2.f();
        z91 r7 = v0();
        if (r6 != this) goto L15;
        r0(r7, r7);
        return true;
    L15:
        if (r6 != null) goto L21;
        if (((ra) ((ey) ((ra) j51.P(this)).getFocusOwner()).a).B() == false) goto L181;
    L21:
        if (r6 == null) goto L65;
        f13 r11 = new f13(new ba1[16]);
        if (r6.n.A == true) goto L25;
        cz1.b("visitAncestors called on an unattached node");
    L25:
        cx2 r12 = r6.n.r;
        c72 r13 = j51.O(r6);
    L26:
        if (r13 == null) goto L66;
        if ((((cx2) r13.Q.g).q & 1024) == 0) goto L58;
    L29:
        if (r12 == null) goto L58;
        if ((r12.p & 1024) == 0) goto L57;
        cx2 r14 = r12;
        f13 r15 = null;
    L33:
        if (r14 == null) goto L57;
        if ((r14 instanceof ba1) == false) goto L38;
        r11.b((ba1) r14);
    L56:
        r14 = j51.c(r15);
        goto L33
    L38:
        if ((r14.p & 1024) == 0) goto L56;
        if ((r14 instanceof fo0) == false) goto L56;
        cx2 r10 = ((fo0) r14).C;
        int r3 = 0;
    L42:
        if (r10 == null) goto L54;
        if ((r10.p & 1024) == 0) goto L53;
        r3 = r3 + 1;
        if (r3 != 1) goto L48;
        r14 = r10;
        goto L53
    L48:
        if (r15 != null) goto L50;
        r15 = new f13(new cx2[16]);
    L50:
        if (r14 == null) goto L52;
        r15.b(r14);
        r14 = null;
    L52:
        r15.b(r10);
    L53:
        r10 = r10.s;
        goto L42
    L54:
        if (r3 != 1) goto L56;
    L57:
        r12 = r12.r;
    L58:
        r13 = r13.t();
        if (r13 == null) goto L63;
        w12 r4 = r13.Q;
        if (r4 == null) goto L63;
        r12 = (sq4) r4.f;
    L63:
        r12 = null;
    L66:
        Object[] r5 = new ba1[16];
        Object[] r8 = new ba1[16];
        if (this.n.A == true) goto L69;
        cz1.b("visitAncestors called on an unattached node");
    L69:
        cx2 r9 = this.n.r;
        c72 r16 = j51.O(this);
        int r17 = 0;
        int r18 = 0;
        boolean r19 = true;
    L70:
        if (r16 == null) goto L134;
        if ((((cx2) r16.Q.g).q & 1024) == 0) goto L127;
    L73:
        if (r9 == null) goto L127;
        if ((r9.p & 1024) == 0) goto L126;
        cx2 r110 = r9;
        f13 r111 = null;
    L77:
        if (r110 == null) goto L126;
        if ((r110 instanceof ba1) == false) goto L99;
        ba1 r20 = (ba1) r110;
        if (r11 == null) goto L83;
        Boolean r21 = Boolean.valueOf(r11.j(r20));
    L85:
        if (h12.c(r21, Boolean.TRUE) == false) goto L91;
        int r22 = r17 + 1;
        if (r5.length >= r22) goto L90;
        int r23 = r5.length;
        Object[] r24 = new Object[Math.max(r22, r23 * 2)];
        System.arraycopy(r5, 0, r24, 0, r23);
        r5 = r24;
    L90:
        r5[r17] = r20;
        r17 = r22;
    L96:
        if (r20 != r6) goto L98;
        r19 = false;
    L98:
        boolean r25 = false;
    L100:
        if (r25 == false) goto L125;
        if ((r110.p & 1024) == 0) goto L125;
        if ((r110 instanceof fo0) == false) goto L125;
        cx2 r26 = ((fo0) r110).C;
        int r27 = 0;
    L106:
        if (r26 == null) goto L122;
        if ((r26.p & 1024) == 0) goto L120;
        int r28 = r27 + 1;
        if (r28 != 1) goto L112;
        r110 = r26;
        r28 = r28;
    L118:
        r27 = r28;
        goto L120
    L112:
        if (r111 != null) goto L114;
        f13 r29 = new f13(new cx2[16]);
    L115:
        if (r110 == null) goto L117;
        r29.b(r110);
        r110 = null;
    L117:
        r29.b(r26);
        r111 = r29;
        goto L118
    L114:
        r29 = r111;
    L120:
        r26 = r26.s;
        goto L106
    L122:
        if (r27 == 1) goto L77;
    L125:
        r110 = j51.c(r111);
        goto L77
    L91:
        r2 = r2;
        int r30 = r18 + 1;
        if (r8.length >= r30) goto L95;
        int r31 = r8.length;
        Object[] r32 = new Object[Math.max(r30, r31 * 2)];
        System.arraycopy(r8, 0, r32, 0, r31);
        r8 = r32;
    L95:
        r8[r18] = r20;
        r18 = r30;
        goto L96
    L83:
        r21 = null;
        goto L85
    L99:
        r2 = r2;
        r25 = true;
    L126:
        r9 = r9.r;
        r2 = r2;
    L127:
        ey r210 = r2;
        r16 = r16.t();
        if (r16 == null) goto L132;
        w12 r33 = r16.Q;
        if (r33 == null) goto L132;
        r9 = (sq4) r33.f;
    L133:
        r2 = r210;
    L132:
        r9 = null;
        goto L133
    L134:
        ey r211 = r2;
        if (r19 == false) goto L140;
        if (r6 == null) goto L140;
        if (uc5.P(r6, false) == true) goto L140;
    L139:
        return false;
    L140:
        j51.F(this, new wc(4, this));
        int r34 = v0().ordinal();
        if (r34 != 0) goto L143;
    L152:
        z91 r35 = z91.p;
        z91 r36 = z91.n;
        if (r19 == false) goto L156;
        if (r6 == null) goto L156;
        r6.r0(r36, r35);
    L156:
        z91 r37 = z91.o;
        if (r11 == null) goto L165;
        int r38 = r11.p - 1;
        Object[] r39 = r11.n;
        if (r38 >= r39.length) goto L165;
    L160:
        if (r38 < 0) goto L165;
        ba1 r40 = (ba1) r39[r38];
        if (r211.f() != this) goto L139;
        r40.r0(r37, r35);
        r38 = r38 - 1;
    L165:
        int r112 = r18 - 1;
        if (r112 >= r8.length) goto L176;
    L167:
        if (r112 < 0) goto L176;
        ba1 r41 = (ba1) r8[r112];
        if (r211.f() != this) goto L139;
        if (r41 != r6) goto L173;
        z91 r42 = r36;
    L174:
        r41.r0(r42, r37);
        r112 = r112 - 1;
        goto L167
    L173:
        r42 = r35;
    L176:
        if (r211.f() != this) goto L139;
        r0(r7, r36);
        if (r211.f() != this) goto L139;
        return true;
    L143:
        if (r34 != 1) goto L145;
    L151:
        ((ey) ((ra) j51.P(this)).getFocusOwner()).h(this);
        goto L152
    L145:
        if (r34 == 2) goto L152;
        if (r34 == 3) goto L151;
        er1.n();
        return false;
    L65:
        r11 = null;
        goto L66
    }

    public final void r0(z91 r10, z91 r11) {
        ey r0 = (ey) ((ra) j51.P(this)).getFocusOwner();
        ba1 r1 = r0.f();
        if (r10.equals(r11) == true) goto L7;
        wf1 r2 = this.B;
        if (r2 == null) goto L7;
        r2.invoke(r10, r11);
    L7:
        cx2 r12 = this.n;
        if (r12.A == true) goto L10;
        cz1.b("visitAncestors called on an unattached node");
    L10:
        cx2 r13 = this.n;
        c72 r9 = j51.O(this);
    L11:
        if (r9 == null) goto L60;
        if ((((cx2) r9.Q.g).q & 5120) == 0) goto L54;
    L14:
        if (r13 == null) goto L54;
        int r3 = r13.p;
        if ((r3 & 5120) == 0) goto L53;
        if (r13 == r12) goto L22;
        if ((r3 & 1024) == 0) goto L22;
        return;
    L22:
        if ((r3 & 4096) == 0) goto L53;
        cx2 r4 = r13;
        f13 r5 = null;
    L24:
        if (r4 == null) goto L53;
        if ((r4 instanceof xo) == true) goto L27;
        if ((r4.p & 4096) == 0) goto L52;
        if ((r4 instanceof fo0) == false) goto L52;
        cx2 r6 = ((fo0) r4).C;
        int r7 = 0;
    L38:
        if (r6 == null) goto L50;
        if ((r6.p & 4096) == 0) goto L49;
        r7 = r7 + 1;
        if (r7 != 1) goto L44;
        r4 = r6;
        goto L49
    L44:
        if (r5 != null) goto L46;
        r5 = new f13(new cx2[16]);
    L46:
        if (r4 == null) goto L48;
        r5.b(r4);
        r4 = null;
    L48:
        r5.b(r6);
    L49:
        r6 = r6.s;
        goto L38
    L50:
        if (r7 == 1) goto L24;
    L52:
        r4 = j51.c(r5);
        goto L24
    L27:
        xo r8 = (xo) r4;
        if (r1 != r0.f()) goto L52;
        r8.r0();
        throw null;
    L53:
        r13 = r13.r;
    L54:
        r9 = r9.t();
        if (r9 == null) goto L59;
        w12 r14 = r9.Q;
        if (r14 == null) goto L59;
        r13 = (sq4) r14.f;
    L59:
        r13 = null;
        goto L11
    }

    public final x91 s0() {
        x91 r0 = new x91();
        r0.a = true;
        y91 r2 = y91.b;
        r0.b = r2;
        r0.c = r2;
        r0.d = r2;
        r0.e = r2;
        r0.f = r2;
        r0.g = r2;
        r0.h = r2;
        r0.i = r2;
        r0.j = new k2(18, (byte) 0);
        r0.k = new k2(18, (byte) 0);
        r0.l = fz0.a0;
        int r3 = this.E;
        if (r3 != 1) goto L5;
        boolean r4 = true;
    L14:
        r0.a = r4;
        cx2 r5 = this.n;
        if (r5.A == true) goto L17;
        cz1.b("visitAncestors called on an unattached node");
    L17:
        cx2 r6 = this.n;
        c72 r11 = j51.O(this);
    L18:
        if (r11 == null) goto L63;
        if ((((cx2) r11.Q.g).q & 3072) == 0) goto L57;
    L21:
        if (r6 == null) goto L57;
        int r7 = r6.p;
        if ((r7 & 3072) == 0) goto L56;
        if (r6 == r5) goto L29;
        if ((r7 & 1024) != 0) goto L63;
    L29:
        if ((r7 & 2048) == 0) goto L56;
        f13 r8 = null;
        cx2 r9 = r6;
    L31:
        if (r9 == null) goto L56;
        if ((r9 instanceof xo) == true) goto L54;
        if ((r9.p & 2048) == 0) goto L53;
        if ((r9 instanceof fo0) == false) goto L53;
        cx2 r10 = ((fo0) r9).C;
        int r12 = 0;
    L39:
        if (r10 == null) goto L51;
        if ((r10.p & 2048) == 0) goto L50;
        r12 = r12 + 1;
        if (r12 != 1) goto L45;
        r9 = r10;
        goto L50
    L45:
        if (r8 != null) goto L47;
        r8 = new f13(new cx2[16]);
    L47:
        if (r9 == null) goto L49;
        r8.b(r9);
        r9 = null;
    L49:
        r8.b(r10);
    L50:
        r10 = r10.s;
        goto L39
    L51:
        if (r12 == 1) goto L31;
    L53:
        r9 = j51.c(r8);
        goto L31
    L54:
        bx2 r13 = ((xo) r9).B;
        cz1.b("applyFocusProperties called on wrong node");
        r13.getClass();
        kf2.k();
        return null;
    L56:
        r6 = r6.r;
    L57:
        r11 = r11.t();
        if (r11 == null) goto L62;
        w12 r14 = r11.Q;
        if (r14 == null) goto L62;
        r6 = (sq4) r14.f;
    L62:
        r6 = null;
    L63:
        return r0;
    L5:
        if (r3 != 0) goto L12;
        if (((qz1) ((sz1) ((rz1) kb4.q(this, g90.m))).a.getValue()).a != 1) goto L9;
        boolean r15 = true;
    L10:
        r4 = !r15;
        goto L14
    L9:
        r15 = false;
        goto L10
    L12:
        if (r3 != 2) goto L64;
        r4 = false;
        goto L14
    L64:
        kf2.o("Unknown Focusability");
        return null;
    }

    public final wv3 t0(q62 r5) {
        wv3 r0 = s0().l;
        if (r0 == fz0.a0) goto L8;
        if (r5 != null) goto L7;
        return r0;
    L7:
        return r0.f(r5.A(j51.N(this), 0));
    L8:
        if (r5 == null) goto L12;
        return r5.C(j51.N(this), false);
    L12:
        return bu.d(0, l93.o0(j51.N(this).p));
    }

    public final z72 u0() {
        if (this.n.A == true) goto L5;
        cz1.b("visitAncestors called on an unattached node");
    L5:
        cx2 r0 = this.n.r;
        c72 r6 = j51.O(this);
    L7:
        if (r6 == null) goto L54;
        if ((((cx2) r6.Q.g).q & 8388640) == 0) goto L48;
    L10:
        if (r0 == null) goto L48;
        int r2 = r0.p;
        if ((r2 & 8388640) == 0) goto L47;
        if ((8388608 & r2) != 0) goto L16;
        if ((r2 & 32) == 0) goto L47;
        if ((r0 instanceof fx2) == false) goto L36;
        Object r4 = r0;
    L44:
        fx2 r5 = (fx2) r4;
        if (r5 == null) goto L47;
        r5.E();
        goto L47
    L36:
        if ((r0 instanceof fo0) == false) goto L43;
        cx2 r3 = ((fo0) r0).C;
        r4 = null;
    L38:
        if (r3 == null) goto L44;
        if ((r3 instanceof fx2) == false) goto L42;
        r4 = r3;
    L42:
        r3 = r3.s;
        goto L38
    L43:
        r4 = null;
        goto L44
    L16:
        if ((r0 instanceof z72) == false) goto L19;
    L27:
        z72 r1 = (z72) r0;
        if (r1 == null) goto L54;
        return r1;
    L19:
        if ((r0 instanceof fo0) == false) goto L26;
        cx2 r7 = ((fo0) r0).C;
        r0 = null;
    L21:
        if (r7 == null) goto L27;
        if ((r7 instanceof z72) == false) goto L25;
        r0 = r7;
    L25:
        r7 = r7.s;
        goto L21
    L26:
        r0 = null;
    L47:
        r0 = r0.r;
    L48:
        r6 = r6.t();
        if (r6 == null) goto L53;
        w12 r8 = r6.Q;
        if (r8 == null) goto L53;
        r0 = (sq4) r8.f;
    L53:
        r0 = null;
    L54:
        return null;
    }

    public final z91 v0() {
        boolean r0 = this.A;
        z91 r1 = z91.p;
        if (r0 == true) goto L5;
        return r1;
    L5:
        ba1 r2 = ((ey) ((ra) j51.P(this)).getFocusOwner()).f();
        if (r2 != null) goto L8;
        return r1;
    L8:
        if (this != r2) goto L12;
        return z91.n;
    L12:
        if (r2.A == true) goto L14;
    L59:
        return r1;
    L14:
        if (r2.n.A == true) goto L16;
        cz1.b("visitAncestors called on an unattached node");
    L16:
        cx2 r3 = r2.n.r;
        c72 r4 = j51.O(r2);
    L17:
        if (r4 == null) goto L59;
        if ((((cx2) r4.Q.g).q & 1024) == 0) goto L53;
    L20:
        if (r3 == null) goto L53;
        if ((r3.p & 1024) == 0) goto L52;
        cx2 r5 = r3;
        f13 r6 = null;
    L24:
        if (r5 == null) goto L52;
        if ((r5 instanceof ba1) == true) goto L28;
        if ((r5.p & 1024) == 0) goto L51;
        if ((r5 instanceof fo0) == false) goto L51;
        cx2 r7 = ((fo0) r5).C;
        int r8 = 0;
    L37:
        if (r7 == null) goto L49;
        if ((r7.p & 1024) == 0) goto L48;
        r8 = r8 + 1;
        if (r8 != 1) goto L43;
        r5 = r7;
        goto L48
    L43:
        if (r6 != null) goto L45;
        r6 = new f13(new cx2[16]);
    L45:
        if (r5 == null) goto L47;
        r6.b(r5);
        r5 = null;
    L47:
        r6.b(r7);
    L48:
        r7 = r7.s;
        goto L37
    L49:
        if (r8 == 1) goto L24;
    L51:
        r5 = j51.c(r6);
        goto L24
    L28:
        if (this != ((ba1) r5)) goto L51;
        return z91.o;
    L52:
        r3 = r3.r;
    L53:
        r4 = r4.t();
        if (r4 == null) goto L58;
        w12 r9 = r4.Q;
        if (r9 == null) goto L58;
        r3 = (sq4) r9.f;
    L58:
        r3 = null;
        goto L17
    }

    public final void w0() {
        int r0 = v0().ordinal();
        if (r0 == 0) goto L12;
        if (r0 != 1) goto L6;
        return;
    L6:
        if (r0 == 2) goto L12;
        if (r0 == 3) goto L22;
        er1.n();
        return;
    L22:
        return;
    L12:
        jx3 r1 = new jx3();
        j51.F(this, new fa(5, r1, this));
        Object r2 = r1.n;
        if (r2 != null) goto L15;
        h12.Q("focusProperties");
        throw null;
    L15:
        if (((x91) r2).a == true) goto L21;
        ((ey) ((ra) j51.P(this)).getFocusOwner()).b(8, true, true);
        return;
    }

    public final void x0() {
    }

    public final boolean y0(int r2) {
        Trace.beginSection("FocusTransactions:requestFocus");
    L11:
        th = move-exception;
        Trace.endSection();
        throw th;
    L4:
        if (s0().a == false) goto L8;
        boolean r1 = q0();     // Catch: Throwable -> L11
        Trace.endSection();
        return r1;
    L8:
        boolean r3 = kb4.v(this, r2, new k2(r2));     // Catch: Throwable -> L11
        Trace.endSection();
        return r3;
    }
}
