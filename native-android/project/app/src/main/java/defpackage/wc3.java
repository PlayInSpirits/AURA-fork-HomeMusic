package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wc3 extends wd0 {
    public int n;
    public wd o;
    public /* synthetic */ Object p;
    public final /* synthetic */ ad3 q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wc3(ad3 ad3Var, wd0 wd0Var) {
        super(wd0Var);
        this.q = ad3Var;
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.f(0, null, this);
    }
}
