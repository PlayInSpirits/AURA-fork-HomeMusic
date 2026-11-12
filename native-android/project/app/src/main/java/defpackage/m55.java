package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m55 implements Runnable {
    public final /* synthetic */ int n = 0;
    public final /* synthetic */ rf2 o;
    public final /* synthetic */ long p;
    public final /* synthetic */ int q;

    public /* synthetic */ m55(rf2 rf2Var, int i, long j) {
        this.o = rf2Var;
        this.q = i;
        this.p = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        int i2 = this.q;
        long j = this.p;
        rf2 rf2Var = this.o;
        switch (i) {
            case 0:
                o55 o55Var = (o55) rf2Var.o;
                String str = f35.a;
                o55Var.m(i2, j);
                break;
            default:
                o55 o55Var2 = (o55) rf2Var.o;
                String str2 = f35.a;
                o55Var2.i(i2, j);
                break;
        }
    }

    public /* synthetic */ m55(rf2 rf2Var, long j, int i) {
        this.o = rf2Var;
        this.p = j;
        this.q = i;
    }
}
