package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class y81 extends wd0 {
    public z81 n;
    public Object o;
    public /* synthetic */ Object p;
    public final /* synthetic */ z81 q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y81(z81 z81Var, vd0 vd0Var) {
        super(vd0Var);
        this.q = z81Var;
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.b(null, this);
    }
}
