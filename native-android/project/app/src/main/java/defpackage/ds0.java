package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ds0 implements gf1 {
    public final /* synthetic */ boolean n;
    public final /* synthetic */ rm3 o;
    public final /* synthetic */ String p;

    public /* synthetic */ ds0(boolean z, rm3 rm3Var, String str) {
        this.n = z;
        this.o = rm3Var;
        this.p = str;
    }

    @Override // defpackage.gf1
    public final Object invoke() {
        boolean z = this.n;
        rm3 rm3Var = this.o;
        String str = this.p;
        if (z) {
            xm2 xm2Var = (xm2) rm3Var.n;
            synchronized (((xi4) xm2Var.f)) {
            }
        }
        return j15.a;
    }
}
