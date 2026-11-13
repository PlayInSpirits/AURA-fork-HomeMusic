package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class nm implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ xc5 o;
    public final /* synthetic */ pa p;

    public /* synthetic */ nm(xc5 xc5Var, pa paVar, int i) {
        this.n = i;
        this.o = xc5Var;
        this.p = paVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        pa paVar = this.p;
        xc5 xc5Var = this.o;
        switch (i) {
            case 0:
                qm qmVar = (qm) xc5Var.p;
                String str = f35.a;
                qmVar.f(paVar);
                break;
            default:
                qm qmVar2 = (qm) xc5Var.p;
                String str2 = f35.a;
                qmVar2.j(paVar);
                break;
        }
    }
}
