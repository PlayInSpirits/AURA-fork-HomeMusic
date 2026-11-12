package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends wd0 {
    public a44 n;
    public /* synthetic */ Object o;
    public final /* synthetic */ gc0 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(gc0 gc0Var, vd0 vd0Var) {
        super(vd0Var);
        this.p = gc0Var;
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.a(null, this);
    }
}
