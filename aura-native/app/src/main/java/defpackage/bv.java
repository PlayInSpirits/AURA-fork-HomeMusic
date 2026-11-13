package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class bv extends ep4 implements wf1 {
    public /* synthetic */ Object o;
    public final /* synthetic */ cv p;
    public final /* synthetic */ f63 q;
    public final /* synthetic */ fa r;
    public final /* synthetic */ jo s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bv(cv cvVar, f63 f63Var, fa faVar, jo joVar, vd0 vd0Var) {
        super(2, vd0Var);
        this.p = cvVar;
        this.q = f63Var;
        this.r = faVar;
        this.s = joVar;
    }

    @Override // defpackage.jp
    public final vd0 create(Object obj, vd0 vd0Var) {
        bv bvVar = new bv(this.p, this.q, this.r, this.s, vd0Var);
        bvVar.o = obj;
        return bvVar;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object obj, Object obj2) {
        return ((bv) create((we0) obj, (vd0) obj2)).invokeSuspend(j15.a);
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object obj) {
        kb4.X(obj);
        we0 we0Var = (we0) this.o;
        fa faVar = this.r;
        cv cvVar = this.p;
        fu.G(we0Var, null, null, new r(cvVar, this.q, faVar, null, 1), 3);
        return fu.G(we0Var, null, null, new p(cvVar, this.s, null, 3), 3);
    }
}
