package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class jh0 extends ep4 implements wf1 {
    public int o;
    public final /* synthetic */ s24 p;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ if1 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jh0(vd0 vd0Var, if1 if1Var, s24 s24Var, boolean z, boolean z2) {
        super(2, vd0Var);
        this.p = s24Var;
        this.q = z;
        this.r = z2;
        this.s = if1Var;
    }

    @Override // defpackage.jp
    public final vd0 create(Object obj, vd0 vd0Var) {
        return new jh0(vd0Var, this.s, this.p, this.q, this.r);
    }

    @Override // defpackage.wf1
    public final Object invoke(Object obj, Object obj2) {
        return ((jh0) create((we0) obj, (vd0) obj2)).invokeSuspend(j15.a);
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object obj) {
        int i = this.o;
        if (i != 0) {
            if (i == 1) {
                kb4.X(obj);
                return obj;
            }
            kf2.o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kb4.X(obj);
        if1 if1Var = this.s;
        s24 s24Var = this.p;
        boolean z = this.r;
        boolean z2 = this.q;
        ih0 ih0Var = new ih0(null, if1Var, s24Var, z, z2);
        this.o = 1;
        Object u = s24Var.u(z2, ih0Var, this);
        xe0 xe0Var = xe0.n;
        return u == xe0Var ? xe0Var : u;
    }
}
