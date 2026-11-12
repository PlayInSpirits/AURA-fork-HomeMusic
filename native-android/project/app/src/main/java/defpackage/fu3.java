package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fu3 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ gu3 o;

    public /* synthetic */ fu3(gu3 gu3Var, int i) {
        this.n = i;
        this.o = gu3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        gu3 gu3Var = this.o;
        switch (i) {
            case 0:
                gu3Var.f.k(Boolean.TRUE);
                break;
            case 1:
                gu3Var.f.k(Boolean.TRUE);
                break;
            default:
                gu3Var.f.k(Boolean.TRUE);
                break;
        }
    }
}
