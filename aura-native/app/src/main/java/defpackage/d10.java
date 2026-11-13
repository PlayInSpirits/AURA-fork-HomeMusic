package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class d10 extends wd0 {
    public e10 n;
    public Object o;
    public /* synthetic */ Object p;
    public final /* synthetic */ e10 q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d10(e10 e10Var, vd0 vd0Var) {
        super(vd0Var);
        this.q = e10Var;
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.b(null, this);
    }
}
