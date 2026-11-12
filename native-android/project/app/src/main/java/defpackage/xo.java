package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xo extends cx2 implements u62, rv0, g94, rn3, fx2, o62, vi1, vb3, eo0 {
    public bx2 B;

    @Override // defpackage.fx2
    public final fz0 E() {
        return fz0.Y;
    }

    @Override // defpackage.vi1
    public final void L(f63 r1) {
        this.B.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.rv0
    public final void S(e72 r1) {
        this.B.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.rn3
    public final boolean X() {
        this.B.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.o62, defpackage.yi2
    public final void a(long r1) {
    }

    @Override // defpackage.eo0, defpackage.rn3
    public final void b() {
    }

    @Override // defpackage.g94
    public final void c0(q94 r17) {
        bx2 r0 = this.B;
        r0.getClass();
        e94 r1 = new e94();
        int r2 = 0;
        r1.p = false;
        ((zh) r0).a.invoke(r1);
        r17.getClass();
        e94 r3 = (e94) r17;
        w03 r4 = r3.n;
        if (r1.p == false) goto L6;
        r3.p = true;
    L6:
        if (r1.q == false) goto L8;
        r3.q = true;
    L8:
        w03 r5 = r1.n;
        Object[] r6 = r5.b;
        Object[] r7 = r5.c;
        long[] r8 = r5.a;
        int r9 = r8.length - 2;
        if (r9 < 0) goto L33;
        int r10 = 0;
    L11:
        long r11 = r8[r10];
        if (((((~r11) << 7) & r11) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L31;
        int r12 = 8 - ((~(r10 - r9)) >>> 31);
        int r13 = r2;
    L14:
        if (r13 >= r12) goto L30;
        if ((255 & r11) >= 128) goto L29;
        int r14 = (r10 << 3) + r13;
        Object r15 = r6[r14];
        Object r16 = r7[r14];
        p94 r18 = (p94) r15;
        if (r4.b(r18) == true) goto L21;
        r4.l(r18, r16);
        goto L29
    L21:
        if ((r16 instanceof w2) == false) goto L29;
        Object r19 = r4.g(r18);
        r19.getClass();
        w2 r110 = (w2) r19;
        String r20 = r110.a;
        if (r20 != null) goto L25;
        r20 = ((w2) r16).a;
    L25:
        sf1 r111 = r110.b;
        if (r111 != null) goto L28;
        r111 = ((w2) r16).b;
    L28:
        r4.l(r18, new w2(r20, r111));
    L29:
        r11 = r11 >> 8;
        r13 = r13 + 1;
        goto L14
    L30:
        if (r12 == 8) goto L31;
        return;
    L31:
        if (r10 == r9) goto L42;
        r10 = r10 + 1;
        r2 = 0;
        goto L11
    L42:
        return;
    }

    @Override // defpackage.o62
    public final void e(q62 r1) {
    }

    @Override // defpackage.cx2
    public final void i0() {
        q0(true);
    }

    @Override // defpackage.vb3
    public final boolean j() {
        return this.A;
    }

    @Override // defpackage.cx2
    public final void j0() {
        if (this.A == true) goto L6;
        cz1.b("unInitializeModifier called on unattached node");
    L6:
        if ((this.p & 8) == 0) goto L9;
        ((ra) j51.P(this)).w();
        return;
    }

    @Override // defpackage.rn3
    public final void n(kn3 r1, ln3 r2, long r3) {
        this.B.getClass();
        throw new ClassCastException();
    }

    public final void q0(boolean r5) {
        if (this.A == true) goto L5;
        cz1.b("initializeModifier called on unattached node");
    L5:
        bx2 r0 = this.B;
        if ((this.p & 4) == 0) goto L10;
        if (r5 == true) goto L10;
        j51.M(this, 2).I0();
    L10:
        if ((this.p & 2) == 0) goto L19;
        sq4 r1 = (sq4) j51.O(this).Q.f;
        r1.getClass();
        if (r1.B == false) goto L16;
        f63 r2 = this.u;
        r2.getClass();
        ((w62) r2).b1(this);
        tb3 r3 = r2.g0;
        if (r3 == null) goto L16;
        ((vj1) r3).c();
    L16:
        if (r5 == true) goto L19;
        j51.M(this, 2).I0();
        j51.O(this).D();
    L19:
        if ((r0 instanceof yc3) == false) goto L22;
        c72 r6 = j51.O(this);
        ((yc3) r0).a.x.setValue(r6);
    L22:
        if ((this.p & 8) == 0) goto L25;
        ((ra) j51.P(this)).w();
        return;
    }

    @Override // defpackage.u62
    public final vi2 r(cf2 r1, pi2 r2, long r3) {
        this.B.getClass();
        throw new ClassCastException();
    }

    public final void r0() {
        bx2 r1 = this.B;
        cz1.b("onFocusEvent called on wrong node");
        r1.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.rn3
    public final void t() {
        this.B.getClass();
        throw new ClassCastException();
    }

    public final String toString() {
        return this.B.toString();
    }

    @Override // defpackage.rv0
    public final void y() {
        jz4.z(this);
    }

    @Override // defpackage.rn3
    public final boolean z() {
        this.B.getClass();
        throw new ClassCastException();
    }
}
