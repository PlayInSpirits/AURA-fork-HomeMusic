package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xm implements qc2, wc0, ne4 {
    public final /* synthetic */ long n;

    @Override // defpackage.wc0
    public void accept(Object obj) {
        ((al3) obj).O(this.n);
    }

    @Override // defpackage.ne4
    public long get() {
        return this.n;
    }

    @Override // defpackage.qc2
    public void invoke(Object obj) {
        rm rmVar;
        pj0 pj0Var = (pj0) obj;
        tj0 tj0Var = pj0Var.b;
        if (pj0Var == tj0Var.j && (rmVar = tj0Var.n) != null) {
            rmVar.a(this.n);
        }
    }
}
