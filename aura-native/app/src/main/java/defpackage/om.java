package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class om implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ String o;
    public final /* synthetic */ long p;
    public final /* synthetic */ long q;
    public final /* synthetic */ Object r;

    public /* synthetic */ om(Object obj, String str, long j, long j2, int i) {
        this.n = i;
        this.r = obj;
        this.o = str;
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
                qmVar.V(this.p, this.q, this.o);
                break;
            default:
                o55 o55Var = (o55) ((rf2) obj).o;
                String str2 = f35.a;
                o55Var.x(this.p, this.q, this.o);
                break;
        }
    }
}
