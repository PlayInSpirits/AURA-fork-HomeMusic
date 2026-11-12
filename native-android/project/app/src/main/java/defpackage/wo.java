package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wo implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ c6 o;
    public final /* synthetic */ Object p;

    public /* synthetic */ wo(c6 c6Var, Object obj, int i) {
        this.n = i;
        this.o = c6Var;
        this.p = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        Object obj = this.p;
        c6 c6Var = this.o;
        switch (i) {
            case 0:
                if (c6Var.a == 0) {
                    c6Var.C(obj);
                }
                break;
            default:
                int i2 = c6Var.a - 1;
                c6Var.a = i2;
                if (i2 == 0) {
                    c6Var.C(obj);
                }
                break;
        }
    }
}
