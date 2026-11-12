package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zv extends wd0 {
    public /* synthetic */ Object n;
    public final /* synthetic */ aw o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zv(aw awVar, wd0 wd0Var) {
        super(wd0Var);
        this.o = awVar;
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        Object objJ = this.o.J(null, 0, 0L, this);
        return objJ == xe0.n ? objJ : new j10(objJ);
    }
}
