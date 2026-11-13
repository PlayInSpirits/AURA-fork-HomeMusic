package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class ar3 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ hr3 o;

    public /* synthetic */ ar3(hr3 hr3Var, int i) {
        this.n = i;
        this.o = hr3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        hr3 hr3Var = this.o;
        switch (i) {
            case 0:
                hr3Var.X = true;
                break;
            case 1:
                hr3Var.A();
                break;
            default:
                if (!hr3Var.d0) {
                    mo2 mo2Var = hr3Var.F;
                    mo2Var.getClass();
                    mo2Var.j(hr3Var);
                    break;
                }
                break;
        }
    }
}
