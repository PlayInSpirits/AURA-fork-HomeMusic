package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class lm implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;
    public final /* synthetic */ long p;
    public final /* synthetic */ long q;
    public final /* synthetic */ Object r;

    public /* synthetic */ lm(Object obj, int i, long j, long j2, int i2) {
        this.n = i2;
        this.r = obj;
        this.o = i;
        this.p = j;
        this.q = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        Object obj = this.r;
        switch (i) {
            case 0:
                qm qmVar = (qm) ((xc5) obj).p;
                String str = f35.a;
                qmVar.S(this.o, this.p, this.q);
                break;
            default:
                nj0 nj0Var = ((bp) obj).b;
                ml3 ml3Var = nj0Var.q;
                q9 X = nj0Var.X(((yw1) ml3Var.b).isEmpty() ? null : (mt2) te5.w((yw1) ml3Var.b));
                nj0Var.b0(X, 1006, new lj0(X, this.o, this.p, this.q));
                break;
        }
    }
}
