package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class y64 extends ep4 implements wf1 {
    public /* synthetic */ Object o;
    public final /* synthetic */ long p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y64(long j, vd0 vd0Var) {
        super(2, vd0Var);
        this.p = j;
    }

    @Override // defpackage.jp
    public final vd0 create(Object obj, vd0 vd0Var) {
        y64 y64Var = new y64(this.p, vd0Var);
        y64Var.o = obj;
        return y64Var;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object obj, Object obj2) {
        y64 y64Var = (y64) create((e74) obj, (vd0) obj2);
        j15 j15Var = j15.a;
        y64Var.invokeSuspend(j15Var);
        return j15Var;
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object obj) {
        kb4.X(obj);
        g74 g74Var = ((e74) this.o).a;
        g74Var.d(g74Var.k, this.p, 1);
        return j15.a;
    }
}
