package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qw0 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ sw0 o;
    public final /* synthetic */ tw0 p;

    public /* synthetic */ qw0(sw0 sw0Var, tw0 tw0Var, int i) {
        this.n = i;
        this.o = sw0Var;
        this.p = tw0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        tw0 tw0Var = this.p;
        sw0 sw0Var = this.o;
        switch (i) {
            case 0:
                tw0Var.M(sw0Var.a, sw0Var.b);
                break;
            default:
                tw0Var.z(sw0Var.a, sw0Var.b);
                break;
        }
    }
}
