package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fv0 extends wd0 {
    public yu0 n;
    public jv0 o;
    public /* synthetic */ Object p;
    public final /* synthetic */ z64 q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fv0(z64 z64Var, wd0 wd0Var) {
        super(wd0Var);
        this.q = z64Var;
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return z64.u0(this.q, null, this);
    }
}
