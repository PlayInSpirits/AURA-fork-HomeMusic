package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class b70 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ nc1 o;

    public /* synthetic */ b70(nc1 nc1Var, int i) {
        this.n = i;
        this.o = nc1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        nc1 nc1Var = this.o;
        switch (i) {
            case 0:
                l70.e(nc1Var);
                break;
            default:
                nc1Var.invalidateOptionsMenu();
                break;
        }
    }
}
