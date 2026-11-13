package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class v85 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ Object q;

    public /* synthetic */ v85(Object obj, boolean z, boolean z2, int i) {
        this.n = i;
        this.q = obj;
        this.o = z;
        this.p = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        boolean z = this.p;
        boolean z2 = this.o;
        y10 y10Var = (y10) this.q;
        switch (i) {
            case 0:
                xc5.l((xc5) y10Var.d, z2, z);
                break;
            default:
                ((rf2) y10Var.d).n(z2, z);
                break;
        }
    }
}
