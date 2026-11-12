package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class it1 implements Runnable {
    public final /* synthetic */ int n = 1;
    public final /* synthetic */ d7 o;
    public final /* synthetic */ String p;

    public /* synthetic */ it1(d7 d7Var, String str) {
        this.o = d7Var;
        this.p = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String strB;
        int i = this.n;
        String str = this.p;
        d7 d7Var = this.o;
        switch (i) {
            case 0:
                try {
                    strB = jt1.b(str);
                } catch (Exception unused) {
                    strB = null;
                }
                io1.b.post(new it1(d7Var, strB));
                break;
            default:
                d7Var.accept(str);
                break;
        }
    }

    public /* synthetic */ it1(String str, d7 d7Var) {
        this.p = str;
        this.o = d7Var;
    }
}
