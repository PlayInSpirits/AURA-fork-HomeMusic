package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends ep4 implements wf1 {
    public final /* synthetic */ int o;
    public int p;
    public final /* synthetic */ long q;
    public Object r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(Object obj, long j, Object obj2, vd0 vd0Var, int i) {
        super(2, vd0Var);
        this.o = i;
        this.s = obj;
        this.q = j;
        this.t = obj2;
    }

    @Override // defpackage.jp
    public final vd0 create(Object obj, vd0 vd0Var) {
        int i = this.o;
        Object obj2 = this.t;
        Object obj3 = this.s;
        switch (i) {
            case 0:
                return new s((s22) obj3, this.q, (rm2) obj2, vd0Var, 0);
            default:
                s sVar = new s((g74) obj3, this.q, (gx3) obj2, vd0Var, 1);
                sVar.r = obj;
                return sVar;
        }
    }

    @Override // defpackage.wf1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.o;
        j15 j15Var = j15.a;
        switch (i) {
            case 0:
                return ((s) create((we0) obj, (vd0) obj2)).invokeSuspend(j15Var);
            default:
                return ((s) create((e74) obj, (vd0) obj2)).invokeSuspend(j15Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.jp
    public final Object invokeSuspend(Object obj) {
        cq3 cq3Var;
        int i = this.o;
        j15 j15Var = j15.a;
        Object obj2 = this.t;
        xe0 xe0Var = xe0.n;
        Object obj3 = this.s;
        int i2 = 1;
        switch (i) {
            case 0:
                rm2 rm2Var = (rm2) obj2;
                int i3 = this.p;
                if (i3 == 0) {
                    kb4.X(obj);
                    this.p = 1;
                    if (((s22) obj3).R(this) != xe0Var) {
                    }
                    return xe0Var;
                }
                if (i3 == 1) {
                    kb4.X(obj);
                } else {
                    if (i3 != 2) {
                        if (i3 == 3) {
                            kb4.X(obj);
                            return j15Var;
                        }
                        kf2.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cq3Var = (cq3) this.r;
                    kb4.X(obj);
                }
                this.r = null;
                this.p = 3;
                if (rm2Var.e(cq3Var, this) != xe0Var) {
                    return j15Var;
                }
                return xe0Var;
                bq3 bq3Var = new bq3();
                cq3Var = new cq3();
                this.r = cq3Var;
                this.p = 2;
                if (rm2Var.e(bq3Var, this) != xe0Var) {
                    this.r = null;
                    this.p = 3;
                    if (rm2Var.e(cq3Var, this) != xe0Var) {
                        return j15Var;
                    }
                }
                return xe0Var;
            default:
                g74 g74Var = (g74) obj3;
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
                e74 e74Var = (e74) this.r;
                float fH = g74Var.h(this.q);
                d90 d90Var = new d90((gx3) obj2, g74Var, e74Var, i2);
                this.p = 1;
                return j51.f(fH, null, d90Var, this, 12) == xe0Var ? xe0Var : j15Var;
        }
    }
}
