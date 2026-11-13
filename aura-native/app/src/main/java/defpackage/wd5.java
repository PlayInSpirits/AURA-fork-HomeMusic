package defpackage;

import app.homemusic.R;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class wd5 implements t80, w92 {
    public final ra n;
    public final z80 o;
    public boolean p;
    public ea2 q;
    public r70 r = rr2.a;

    public wd5(ra raVar, z80 z80Var) {
        this.n = raVar;
        this.o = z80Var;
    }

    public final void a() {
        if (!this.p) {
            this.p = true;
            ra raVar = this.n;
            raVar.getView().setTag(R.id.wrapped_composition_tag, null);
            ea2 ea2Var = this.q;
            if (ea2Var != null) {
                ea2Var.f(this);
            }
            this.q = null;
            bs0 bs0Var = raVar.t;
            if (bs0Var != null) {
                bs0Var.o.invoke();
            }
            raVar.t = null;
        }
        this.o.m();
    }

    @Override // defpackage.w92
    public final void b(ba2 ba2Var, q92 q92Var) {
        if (q92Var == q92.ON_DESTROY) {
            a();
        } else {
            if (q92Var != q92.ON_CREATE || this.p) {
                return;
            }
            c(this.r);
        }
    }

    public final void c(wf1 wf1Var) {
        this.n.setOnReadyForComposition(new z15(this, (r70) wf1Var, 1));
    }
}
