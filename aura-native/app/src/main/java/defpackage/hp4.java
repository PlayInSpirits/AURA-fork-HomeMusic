package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class hp4 implements oo0, vd0 {
    public final /* synthetic */ ip4 n;
    public final cz o;
    public cz p;
    public ln3 q = ln3.o;
    public final q01 r = q01.n;
    public final /* synthetic */ ip4 s;

    public hp4(ip4 ip4Var, cz czVar) {
        this.s = ip4Var;
        this.n = ip4Var;
        this.o = czVar;
    }

    @Override // defpackage.oo0
    public final float D(float f) {
        return f / this.n.g();
    }

    @Override // defpackage.oo0
    public final float J() {
        return this.n.J();
    }

    @Override // defpackage.oo0
    public final float M(float f) {
        return this.n.g() * f;
    }

    @Override // defpackage.oo0
    public final int V(float f) {
        return this.n.V(f);
    }

    @Override // defpackage.oo0
    public final long Y(long j) {
        return this.n.Y(j);
    }

    public final Object a(ln3 ln3Var, jp jpVar) {
        cz czVar = new cz(1, ya4.x(jpVar));
        czVar.u();
        this.q = ln3Var;
        this.p = czVar;
        return czVar.q();
    }

    @Override // defpackage.oo0
    public final float a0(long j) {
        return this.n.a0(j);
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
    public final long h(float f) {
        return this.n.h(f);
    }

    @Override // defpackage.oo0
    public final long i(long j) {
        return this.n.i(j);
    }

    @Override // defpackage.oo0
    public final float o(long j) {
        return this.n.o(j);
    }

    @Override // defpackage.vd0
    public final void resumeWith(Object obj) {
        ip4 ip4Var = this.s;
        synchronized (ip4Var.H) {
            ip4Var.G.j(this);
        }
        this.o.resumeWith(obj);
    }

    @Override // defpackage.oo0
    public final long w(float f) {
        return this.n.w(f);
    }
}
