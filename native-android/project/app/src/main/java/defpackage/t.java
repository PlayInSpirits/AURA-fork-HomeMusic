package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends ep4 implements wf1 {
    public final /* synthetic */ int o;
    public int p;
    public final /* synthetic */ rm2 q;
    public final /* synthetic */ bq3 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(bq3 bq3Var, rm2 rm2Var, vd0 vd0Var) {
        super(2, vd0Var);
        this.o = 0;
        this.r = bq3Var;
        this.q = rm2Var;
    }

    @Override // defpackage.jp
    public final vd0 create(Object obj, vd0 vd0Var) {
        int i = this.o;
        bq3 bq3Var = this.r;
        rm2 rm2Var = this.q;
        switch (i) {
            case 0:
                return new t(bq3Var, rm2Var, vd0Var);
            case 1:
                return new t(rm2Var, bq3Var, vd0Var, 1);
            default:
                return new t(rm2Var, bq3Var, vd0Var, 2);
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
        return ((t) create(we0Var, vd0Var)).invokeSuspend(j15Var);
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object obj) {
        int i = this.o;
        bq3 bq3Var = this.r;
        j15 j15Var = j15.a;
        rm2 rm2Var = this.q;
        xe0 xe0Var = xe0.n;
        switch (i) {
            case 0:
                int i2 = this.p;
                if (i2 == 0) {
                    kb4.X(obj);
                    cq3 cq3Var = new cq3();
                    this.p = 1;
                    return rm2Var.e(cq3Var, this) == xe0Var ? xe0Var : j15Var;
                }
                if (i2 == 1) {
                    kb4.X(obj);
                    return j15Var;
                }
                kf2.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                int i3 = this.p;
                if (i3 == 0) {
                    kb4.X(obj);
                    this.p = 1;
                    return rm2Var.e(bq3Var, this) == xe0Var ? xe0Var : j15Var;
                }
                if (i3 == 1) {
                    kb4.X(obj);
                    return j15Var;
                }
                kf2.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                int i4 = this.p;
                if (i4 == 0) {
                    kb4.X(obj);
                    this.p = 1;
                    return rm2Var.e(bq3Var, this) == xe0Var ? xe0Var : j15Var;
                }
                if (i4 == 1) {
                    kb4.X(obj);
                    return j15Var;
                }
                kf2.o("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(rm2 rm2Var, bq3 bq3Var, vd0 vd0Var, int i) {
        super(2, vd0Var);
        this.o = i;
        this.q = rm2Var;
        this.r = bq3Var;
    }
}
