package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
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
        String str;
        int i = this.n;
        String str2 = this.p;
        d7 d7Var = this.o;
        switch (i) {
            case 0:
                try {
                    str = jt1.b(str2);
                } catch (Exception unused) {
                    str = null;
                }
                io1.b.post(new it1(d7Var, str));
                break;
            default:
                d7Var.accept(str2);
                break;
        }
    }

    public /* synthetic */ it1(String str, d7 d7Var) {
        this.p = str;
        this.o = d7Var;
    }
}
