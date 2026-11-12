package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hp4 implements oo0, vd0 {
    public final /* synthetic */ ip4 n;
    public final cz o;
    public cz p;
    public ln3 q;
    public final q01 r;
    public final /* synthetic */ ip4 s;

    public hp4(ip4 r1, cz r2) {
        this.s = r1;
        this.n = r1;
        this.o = r2;
        this.q = ln3.o;
        this.r = q01.n;
    }

    @Override // defpackage.oo0
    public final float D(float r1) {
        return r1 / this.n.g();
    }

    @Override // defpackage.oo0
    public final float J() {
        return this.n.J();
    }

    @Override // defpackage.oo0
    public final float M(float r1) {
        return this.n.g() * r1;
    }

    @Override // defpackage.oo0
    public final int V(float r1) {
        return this.n.V(r1);
    }

    @Override // defpackage.oo0
    public final long Y(long r1) {
        return this.n.Y(r1);
    }

    public final Object a(ln3 r3, jp r4) {
        cz r0 = new cz(1, ya4.x(r4));
        r0.u();
        this.q = r3;
        this.p = r0;
        return r0.q();
    }

    @Override // defpackage.oo0
    public final float a0(long r1) {
        return this.n.a0(r1);
    }

    @Override // defpackage.oo0
    public final float g() {
        return this.n.g();
    }

    @Override // defpackage.vd0
    public final ne0 getContext() {
        return this.r;
    }

    @Override // defpackage.oo0
    public final long h(float r1) {
        return this.n.h(r1);
    }

    @Override // defpackage.oo0
    public final long i(long r1) {
        return this.n.i(r1);
    }

    @Override // defpackage.oo0
    public final float o(long r1) {
        return this.n.o(r1);
    }

    @Override // defpackage.vd0
    public final void resumeWith(Object r3) {
        ip4 r0 = this.s;
        f13 r1 = r0.H;
        monitor-enter(r1);
        r0.G.j(this);     // Catch: Throwable -> L8
        monitor-exit(r1);
        this.o.resumeWith(r3);
        return;
    L8:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.oo0
    public final long w(float r1) {
        return this.n.w(r1);
    }
}
