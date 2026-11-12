package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class i91 extends wd0 {
    public /* synthetic */ Object n;
    public int o;
    public q81 p;
    public final /* synthetic */ z81 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i91(z81 z81Var, vd0 vd0Var) {
        super(vd0Var);
        this.q = z81Var;
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.o |= Integer.MIN_VALUE;
        return this.q.b(null, this);
    }
}
