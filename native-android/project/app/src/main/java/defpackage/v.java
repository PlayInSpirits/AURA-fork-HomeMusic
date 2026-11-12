package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends ep4 implements wf1 {
    public final /* synthetic */ int o;
    public int p;
    public final /* synthetic */ u30 q;
    public final /* synthetic */ bq3 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(u30 u30Var, bq3 bq3Var, vd0 vd0Var, int i) {
        super(2, vd0Var);
        this.o = i;
        this.q = u30Var;
        this.r = bq3Var;
    }

    @Override // defpackage.jp
    public final vd0 create(Object obj, vd0 vd0Var) {
        int i = this.o;
        bq3 bq3Var = this.r;
        u30 u30Var = this.q;
        switch (i) {
            case 0:
                return new v(u30Var, bq3Var, vd0Var, 0);
            case 1:
                return new v(u30Var, bq3Var, vd0Var, 1);
            case 2:
                return new v(u30Var, bq3Var, vd0Var, 2);
            default:
                return new v(u30Var, bq3Var, vd0Var, 3);
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
            case 2:
                break;
        }
        return ((v) create(we0Var, vd0Var)).invokeSuspend(j15Var);
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object obj) {
        int i = this.o;
        j15 j15Var = j15.a;
        u30 u30Var = this.q;
        xe0 xe0Var = xe0.n;
        switch (i) {
            case 0:
                int i2 = this.p;
                if (i2 != 0) {
                    if (i2 == 1) {
                        kb4.X(obj);
                        return j15Var;
                    }
                    kf2.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kb4.X(obj);
                rm2 rm2Var = u30Var.D;
                if (rm2Var == null) {
                    return j15Var;
                }
                aq3 aq3Var = new aq3();
                this.p = 1;
                return rm2Var.e(aq3Var, this) == xe0Var ? xe0Var : j15Var;
            case 1:
                int i3 = this.p;
                if (i3 != 0) {
                    if (i3 == 1) {
                        kb4.X(obj);
                        return j15Var;
                    }
                    kf2.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kb4.X(obj);
                rm2 rm2Var2 = u30Var.D;
                if (rm2Var2 == null) {
                    return j15Var;
                }
                aq3 aq3Var2 = new aq3();
                this.p = 1;
                return rm2Var2.e(aq3Var2, this) == xe0Var ? xe0Var : j15Var;
            case 2:
                int i4 = this.p;
                if (i4 != 0) {
                    if (i4 == 1) {
                        kb4.X(obj);
                        return j15Var;
                    }
                    kf2.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kb4.X(obj);
                rm2 rm2Var3 = u30Var.D;
                if (rm2Var3 == null) {
                    return j15Var;
                }
                this.p = 1;
                return rm2Var3.e(this.r, this) == xe0Var ? xe0Var : j15Var;
            default:
                int i5 = this.p;
                if (i5 != 0) {
                    if (i5 == 1) {
                        kb4.X(obj);
                        return j15Var;
                    }
                    kf2.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kb4.X(obj);
                rm2 rm2Var4 = u30Var.D;
                if (rm2Var4 == null) {
                    return j15Var;
                }
                cq3 cq3Var = new cq3();
                this.p = 1;
                return rm2Var4.e(cq3Var, this) == xe0Var ? xe0Var : j15Var;
        }
    }
}
