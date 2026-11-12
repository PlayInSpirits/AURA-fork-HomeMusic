package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jm implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ xc5 o;
    public final /* synthetic */ Exception p;

    public /* synthetic */ jm(xc5 xc5Var, Exception exc, int i) {
        this.n = i;
        this.o = xc5Var;
        this.p = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        Exception exc = this.p;
        xc5 xc5Var = this.o;
        switch (i) {
            case 0:
                qm qmVar = (qm) xc5Var.p;
                String str = f35.a;
                qmVar.I(exc);
                break;
            default:
                qm qmVar2 = (qm) xc5Var.p;
                String str2 = f35.a;
                qmVar2.g(exc);
                break;
        }
    }
}
