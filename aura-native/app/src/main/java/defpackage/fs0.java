package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class fs0 extends wd0 {
    public /* synthetic */ Object n;
    public final /* synthetic */ gs0 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fs0(gs0 gs0Var, vd0 vd0Var) {
        super(vd0Var);
        this.o = gs0Var;
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.b(null, this);
    }
}
