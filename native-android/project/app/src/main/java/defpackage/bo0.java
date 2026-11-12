package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bo0 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ co0 o;

    public /* synthetic */ bo0(co0 co0Var, int i) {
        this.n = i;
        this.o = co0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        co0 co0Var = this.o;
        switch (i) {
            case 0:
                co0.b(co0Var);
                break;
            default:
                co0.c(co0Var);
                break;
        }
    }
}
