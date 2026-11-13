package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class e45 extends hd3 {
    public final zd3 e = uc5.B(new qf4(0));
    public final zd3 f = uc5.B(Boolean.FALSE);
    public final n35 g;
    public final zd3 h;
    public float i;
    public dt j;

    public e45(gk1 gk1Var) {
        n35 n35Var = new n35(gk1Var);
        n35Var.f = new e25(1, this);
        this.g = n35Var;
        this.h = new zd3(j15.a, rv2.s);
        this.i = 1.0f;
    }

    @Override // defpackage.hd3
    public final void a(float f) {
        this.i = f;
    }

    @Override // defpackage.hd3
    public final void b(dt dtVar) {
        this.j = dtVar;
    }

    @Override // defpackage.hd3
    public final long d() {
        return ((qf4) this.e.getValue()).a;
    }

    @Override // defpackage.hd3
    public final void e(e72 e72Var) {
        mz mzVar = e72Var.n;
        dt dtVar = this.j;
        n35 n35Var = this.g;
        if (dtVar == null) {
            dtVar = (dt) n35Var.g.getValue();
        }
        if (((Boolean) this.f.getValue()).booleanValue() && e72Var.getLayoutDirection() == r62.o) {
            long W = mzVar.W();
            i61 i61Var = mzVar.o;
            long j = i61Var.j();
            i61Var.g().e();
            try {
                ((zg5) i61Var.o).B(-1.0f, 1.0f, W);
                n35Var.e(e72Var, this.i, dtVar);
            } finally {
                i61Var.g().k();
                i61Var.t(j);
            }
        } else {
            n35Var.e(e72Var, this.i, dtVar);
        }
        this.h.getValue();
    }
}
