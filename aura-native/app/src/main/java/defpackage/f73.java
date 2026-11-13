package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class f73 extends ep4 implements wf1 {
    public int o;
    public final /* synthetic */ int p;
    public final /* synthetic */ int q;
    public final /* synthetic */ lm0 r;
    public final /* synthetic */ b13 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f73(int i, int i2, lm0 lm0Var, b13 b13Var, vd0 vd0Var) {
        super(2, vd0Var);
        this.p = i;
        this.q = i2;
        this.r = lm0Var;
        this.s = b13Var;
    }

    @Override // defpackage.jp
    public final vd0 create(Object obj, vd0 vd0Var) {
        return new f73(this.p, this.q, this.r, this.s, vd0Var);
    }

    @Override // defpackage.wf1
    public final Object invoke(Object obj, Object obj2) {
        return ((f73) create((we0) obj, (vd0) obj2)).invokeSuspend(j15.a);
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2 = this.o;
        if (i2 == 0) {
            kb4.X(obj);
            if (!((Boolean) this.s.getValue()).booleanValue() && (i = this.p) >= 0 && i < this.q) {
                lm0 lm0Var = this.r;
                if (i != ((Number) lm0Var.s.getValue()).intValue()) {
                    yy4 T = au0.T(300, null, 6);
                    this.o = 1;
                    Object g = ad3.g(lm0Var, i, T, this, 2);
                    xe0 xe0Var = xe0.n;
                    if (g == xe0Var) {
                        return xe0Var;
                    }
                }
            }
        } else {
            if (i2 != 1) {
                kf2.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kb4.X(obj);
        }
        return j15.a;
    }
}
