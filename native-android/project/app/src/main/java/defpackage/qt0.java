package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qt0 implements Runnable {
    public final /* synthetic */ int n;
    public final ss0 o;
    public final String p;

    public /* synthetic */ qt0(ss0 ss0Var, String str, int i) {
        this.n = i;
        this.o = ss0Var;
        this.p = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.n) {
            case 0:
                xl.E((s24) this.o.n, false, true, new rs0(1, this.p));
                break;
            default:
                xl.E((s24) this.o.n, false, true, new rs0(2, this.p));
                break;
        }
    }
}
