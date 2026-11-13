package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class ds2 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ ls2 o;
    public final /* synthetic */ al3 p;

    public /* synthetic */ ds2(ls2 ls2Var, al3 al3Var, int i) {
        this.n = i;
        this.o = ls2Var;
        this.p = al3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        al3 al3Var = this.p;
        ls2 ls2Var = this.o;
        switch (i) {
            case 0:
                ls2Var.m.v(ls2Var.H(al3Var));
                ls2Var.i.y(al3Var.o().a(17) ? al3Var.x0() : cu4.a);
                break;
            default:
                ls2Var.m.v(ls2Var.H(al3Var));
                break;
        }
    }
}
