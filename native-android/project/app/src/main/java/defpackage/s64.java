package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class s64 extends fo0 implements a90, b83 {
    public a74 D;
    public hb3 E;
    public boolean F;
    public y71 G;
    public rm2 H;
    public fv I;
    public tb J;
    public z64 K;
    public eo0 L;
    public ub M;
    public boolean N;

    @Override // defpackage.eo0
    public final void C() {
        boolean r0 = u0();
        if (this.N == r0) goto L6;
        this.N = r0;
        v0(this.D, this.E, this.J, this.F, this.G, this.H, this.I);
        return;
    }

    @Override // defpackage.b83
    public final void Q() {
        ub r0 = (ub) kb4.q(this, sb3.a);
        if (h12.c(r0, this.M) == true) goto L11;
        this.M = r0;
        eo0 r1 = this.L;
        if (r1 == null) goto L7;
        r0(r1);
    L7:
        this.L = null;
        t0();
        z64 r2 = this.K;
        if (r2 == null) goto L12;
        a74 r7 = this.D;
        hb3 r6 = this.E;
        tb r3 = this.J;
        boolean r8 = this.F;
        boolean r9 = this.N;
        y71 r4 = this.G;
        rm2 r5 = this.H;
        r2.G0(r3, this.I, r4, r5, r6, r7, r8, r9);
        return;
    L12:
        return;
    }

    @Override // defpackage.cx2
    public final boolean f0() {
        return false;
    }

    @Override // defpackage.cx2
    public final void i0() {
        this.N = u0();
        t0();
        if (this.K != null) goto L6;
        a74 r7 = this.D;
        tb r2 = this.J;
        y71 r4 = this.G;
        hb3 r6 = this.E;
        boolean r8 = this.F;
        boolean r9 = this.N;
        rm2 r5 = this.H;
        z64 r1 = new z64(r2, this.I, r4, r5, r6, r7, r8, r9);
        q0(r1);
        this.K = r1;
        return;
    }

    @Override // defpackage.cx2
    public final void j0() {
        eo0 r0 = this.L;
        if (r0 == null) goto L6;
        r0(r0);
        return;
    }

    public final void t0() {
        eo0 r0 = this.L;
        if (r0 != null) goto L11;
        tb r1 = this.J;
        if (r1 == null) goto L14;
        fo0 r2 = r1.i;
        if (r2.n.A == true) goto L15;
        q0(r2);
        this.L = r2;
        return;
    L15:
        return;
    L14:
        return;
    L11:
        if (((cx2) r0).n.A == true) goto L16;
        q0(r0);
        return;
    }

    public final boolean u0() {
        if (this.A == false) goto L5;
        r62 r0 = j51.O(this).K;
    L6:
        hb3 r2 = this.E;
        if (r0 == r62.o) goto L9;
        return true;
    L9:
        if (r2 == hb3.n) goto L14;
        return false;
    L14:
        return true;
    L5:
        r0 = r62.n;
        goto L6
    }

    public final void v0(a74 r10, hb3 r11, tb r12, boolean r13, y71 r14, rm2 r15, fv r16) {
        this.D = r10;
        this.E = r11;
        if (h12.c(this.J, r12) == true) goto L8;
        this.J = r12;
        eo0 r17 = this.L;
        if (r17 == null) goto L7;
        r0(r17);
    L7:
        this.L = null;
        t0();
    L8:
        this.F = r13;
        this.G = r14;
        this.H = r15;
        this.I = r16;
        boolean r8 = u0();
        this.N = r8;
        z64 r0 = this.K;
        if (r0 == null) goto L12;
        r0.G0(this.J, r16, r14, r15, r11, r10, r13, r8);
        return;
    }
}
