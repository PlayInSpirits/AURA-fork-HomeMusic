package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kc3 extends ep4 implements wf1 {
    public final /* synthetic */ int o;
    public int p;
    public final /* synthetic */ lm0 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kc3(lm0 lm0Var, vd0 vd0Var, int i) {
        super(2, vd0Var);
        this.o = i;
        this.q = lm0Var;
    }

    @Override // defpackage.jp
    public final vd0 create(Object obj, vd0 vd0Var) {
        int i = this.o;
        lm0 lm0Var = this.q;
        switch (i) {
            case 0:
                return new kc3(lm0Var, vd0Var, 0);
            case 1:
                return new kc3(lm0Var, vd0Var, 1);
            default:
                return new kc3(lm0Var, vd0Var, 2);
        }
    }

    @Override // defpackage.wf1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.o;
        j15 j15Var = j15.a;
        we0 we0Var = (we0) obj;
        vd0 vd0Var = (vd0) obj2;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((kc3) create(we0Var, vd0Var)).invokeSuspend(j15Var);
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object obj) {
        Object objG;
        Object objG2;
        int i = this.o;
        lm0 lm0Var = this.q;
        xe0 xe0Var = xe0.n;
        j15 j15Var = j15.a;
        int i2 = 1;
        vd0 vd0Var = null;
        switch (i) {
            case 0:
                int i3 = this.p;
                if (i3 == 0) {
                    kb4.X(obj);
                    this.p = 1;
                    dd3 dd3Var = ed3.a;
                    if (lm0Var.k() - 1 < 0 || (objG = ad3.g(lm0Var, lm0Var.k() - 1, null, this, 6)) != xe0Var) {
                        objG = j15Var;
                    }
                    if (objG == xe0Var) {
                        return xe0Var;
                    }
                } else {
                    if (i3 != 1) {
                        kf2.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kb4.X(obj);
                }
                return j15Var;
            case 1:
                int i4 = this.p;
                if (i4 == 0) {
                    kb4.X(obj);
                    this.p = 1;
                    dd3 dd3Var2 = ed3.a;
                    if (lm0Var.k() + 1 >= lm0Var.n() || (objG2 = ad3.g(lm0Var, lm0Var.k() + 1, null, this, 6)) != xe0Var) {
                        objG2 = j15Var;
                    }
                    if (objG2 == xe0Var) {
                        return xe0Var;
                    }
                } else {
                    if (i4 != 1) {
                        kf2.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kb4.X(obj);
                }
                return j15Var;
            default:
                int i5 = this.p;
                if (i5 == 0) {
                    kb4.X(obj);
                    this.p = 1;
                    Object objS = ad3.s(lm0Var, h13.n, new yc(2, vd0Var, i2), this);
                    if (objS != xe0Var) {
                        objS = j15Var;
                    }
                    if (objS == xe0Var) {
                        return xe0Var;
                    }
                } else {
                    if (i5 != 1) {
                        kf2.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kb4.X(obj);
                }
                return j15Var;
        }
    }
}
