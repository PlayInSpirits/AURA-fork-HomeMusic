package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class z24 extends wd0 {
    public t24 n;
    public int o;
    public /* synthetic */ Object p;
    public final /* synthetic */ t24 q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z24(t24 t24Var, wd0 wd0Var) {
        super(wd0Var);
        this.q = t24Var;
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return t24.l(this.q, this);
    }
}
