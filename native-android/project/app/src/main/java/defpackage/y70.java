package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class y70 extends wd0 {
    public Object n;
    public k02 o;
    public int p;
    public int q;
    public /* synthetic */ Object r;
    public final /* synthetic */ a80 s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y70(a80 a80Var, wd0 wd0Var) {
        super(wd0Var);
        this.s = a80Var;
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return a80.a(this.s, null, null, this);
    }
}
