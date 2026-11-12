package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xy3 extends d0 implements qe0 {
    public final /* synthetic */ x80 o;
    public final /* synthetic */ yy3 p;

    /* JADX WARN: Illegal instructions before constructor call */
    public xy3(x80 x80Var, yy3 yy3Var) {
        fz0 fz0Var = fz0.S;
        this.o = x80Var;
        this.p = yy3Var;
        super(fz0Var);
    }

    @Override // defpackage.qe0
    public final void n(ne0 ne0Var, Throwable th) throws Throwable {
        x80 x80Var = this.o;
        yy3 yy3Var = this.p;
        si0.T(th, new fa(4, x80Var, yy3Var));
        qe0 qe0Var = (qe0) yy3Var.n.K(fz0.S);
        if (qe0Var == null) {
            throw th;
        }
        qe0Var.n(ne0Var, th);
    }
}
