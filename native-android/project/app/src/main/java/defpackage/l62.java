package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class l62 implements vy3, qe0 {
    public final ne0 n;
    public final wf1 o;
    public final we0 p;
    public sk4 q;

    public l62(ne0 ne0Var, wf1 wf1Var) {
        this.n = ne0Var;
        this.o = wf1Var;
        this.p = te5.a(ne0Var.J(this));
    }

    @Override // defpackage.ne0
    public final ne0 J(ne0 ne0Var) {
        return ya4.F(this, ne0Var);
    }

    @Override // defpackage.ne0
    public final le0 K(me0 me0Var) {
        return ya4.r(this, me0Var);
    }

    @Override // defpackage.vy3
    public final void a() {
        sk4 sk4Var = this.q;
        if (sk4Var != null) {
            sk4Var.p(new pb1(1));
        }
        this.q = null;
    }

    @Override // defpackage.vy3
    public final void c() {
        sk4 sk4Var = this.q;
        if (sk4Var != null) {
            sk4Var.p(new pb1(1));
        }
        this.q = null;
    }

    @Override // defpackage.vy3
    public final void d() {
        sk4 sk4Var = this.q;
        if (sk4Var != null) {
            CancellationException cancellationException = new CancellationException("Old job was still running!");
            cancellationException.initCause(null);
            sk4Var.f(cancellationException);
        }
        this.q = fu.G(this.p, null, null, this.o, 3);
    }

    @Override // defpackage.le0
    public final me0 getKey() {
        return fz0.S;
    }

    @Override // defpackage.qe0
    public final void n(ne0 ne0Var, Throwable th) throws Throwable {
        x80 x80Var = (x80) ne0Var.K(x80.o);
        if (x80Var != null) {
            si0.T(th, new fa(4, x80Var, this));
        }
        qe0 qe0Var = (qe0) this.n.K(fz0.S);
        if (qe0Var == null) {
            throw th;
        }
        qe0Var.n(ne0Var, th);
    }

    @Override // defpackage.ne0
    public final Object s(wf1 wf1Var, Object obj) {
        return wf1Var.invoke(obj, this);
    }

    @Override // defpackage.ne0
    public final ne0 u(me0 me0Var) {
        return ya4.C(this, me0Var);
    }
}
