package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class km implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ xc5 o;
    public final /* synthetic */ bj0 p;

    public /* synthetic */ km(xc5 xc5Var, bj0 bj0Var, int i) {
        this.n = i;
        this.o = xc5Var;
        this.p = bj0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.n) {
            case 0:
                xc5 xc5Var = this.o;
                bj0 bj0Var = this.p;
                synchronized (bj0Var) {
                }
                qm qmVar = (qm) xc5Var.p;
                String str = f35.a;
                qmVar.o(bj0Var);
                break;
            default:
                xc5 xc5Var2 = this.o;
                bj0 bj0Var2 = this.p;
                qm qmVar2 = (qm) xc5Var2.p;
                String str2 = f35.a;
                qmVar2.T(bj0Var2);
                break;
        }
    }
}
