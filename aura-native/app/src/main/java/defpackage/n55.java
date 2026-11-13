package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class n55 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ rf2 o;
    public final /* synthetic */ bj0 p;

    public /* synthetic */ n55(rf2 rf2Var, bj0 bj0Var, int i) {
        this.n = i;
        this.o = rf2Var;
        this.p = bj0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.n) {
            case 0:
                rf2 rf2Var = this.o;
                bj0 bj0Var = this.p;
                o55 o55Var = (o55) rf2Var.o;
                String str = f35.a;
                o55Var.l(bj0Var);
                break;
            default:
                rf2 rf2Var2 = this.o;
                bj0 bj0Var2 = this.p;
                synchronized (bj0Var2) {
                }
                o55 o55Var2 = (o55) rf2Var2.o;
                String str2 = f35.a;
                o55Var2.k(bj0Var2);
                break;
        }
    }
}
