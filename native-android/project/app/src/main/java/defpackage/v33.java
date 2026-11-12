package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v33 {
    public bq4 a;
    public boolean b;

    public final void a() {
        bq4 bq4Var = this.a;
        if (bq4Var == null) {
            kf2.o("This input is not added to any dispatcher.");
            return;
        }
        if (!this.b) {
            bq4Var.g(this, null);
        }
        w33 w33Var = (w33) bq4Var.o;
        ss2 ss2Var = (ss2) bq4Var.n;
        w33Var.getClass();
        if (equals(w33Var.h) && -1 == w33Var.g) {
            u83 u83VarC = w33Var.f;
            if (u83VarC == null) {
                u83VarC = w33Var.c(-1);
            }
            w33Var.f = null;
            w33Var.g = 0;
            w33Var.h = null;
            if (u83VarC == null) {
                ((a93) ss2Var.o).a.run();
            } else {
                u83VarC.d.a();
            }
            nl4 nl4Var = w33Var.a;
            x33 x33Var = x33.p;
            nl4Var.getClass();
            nl4Var.j(null, x33Var);
        }
        this.b = false;
    }

    public void b(boolean z) {
    }
}
