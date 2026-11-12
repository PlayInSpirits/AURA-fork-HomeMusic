package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tj2 extends sj2 {
    public final /* synthetic */ pn2 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tj2(pn2 pn2Var) {
        super(pn2Var);
        this.t = pn2Var;
    }

    @Override // defpackage.bq4
    public final ms2 j() {
        pn2 pn2Var = this.t;
        oj2 oj2Var = pn2Var.s;
        if (oj2Var == null) {
            kf2.o("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
            return null;
        }
        if (oj2Var != pn2Var.p) {
            return oj2Var.d;
        }
        qj2 qj2Var = (qj2) this.o;
        qj2Var.getClass();
        return new ms2(qj2Var.getCurrentBrowserInfo());
    }
}
