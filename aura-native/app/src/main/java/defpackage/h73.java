package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class h73 extends ep4 implements wf1 {
    public int o;
    public final /* synthetic */ lm0 p;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ b13 r;
    public final /* synthetic */ b13 s;
    public final /* synthetic */ b13 t;
    public final /* synthetic */ b13 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h73(lm0 lm0Var, boolean z, b13 b13Var, b13 b13Var2, b13 b13Var3, b13 b13Var4, vd0 vd0Var) {
        super(2, vd0Var);
        this.p = lm0Var;
        this.q = z;
        this.r = b13Var;
        this.s = b13Var2;
        this.t = b13Var3;
        this.u = b13Var4;
    }

    @Override // defpackage.jp
    public final vd0 create(Object obj, vd0 vd0Var) {
        return new h73(this.p, this.q, this.r, this.s, this.t, this.u, vd0Var);
    }

    @Override // defpackage.wf1
    public final Object invoke(Object obj, Object obj2) {
        return ((h73) create((we0) obj, (vd0) obj2)).invokeSuspend(j15.a);
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object obj) {
        int i = this.o;
        if (i == 0) {
            kb4.X(obj);
            lm0 lm0Var = this.p;
            gc0 gc0Var = new gc0(1, new qv3(new h82(lm0Var, 2), null));
            g73 g73Var = new g73(lm0Var, this.q, this.r, this.s, this.t, this.u);
            this.o = 1;
            Object a = gc0Var.a(g73Var, this);
            xe0 xe0Var = xe0.n;
            if (a == xe0Var) {
                return xe0Var;
            }
        } else {
            if (i != 1) {
                kf2.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kb4.X(obj);
        }
        return j15.a;
    }
}
