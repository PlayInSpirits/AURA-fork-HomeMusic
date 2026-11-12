package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends ep4 implements wf1 {
    public final /* synthetic */ int o;
    public int p;
    public final /* synthetic */ rm2 q;
    public final /* synthetic */ bq3 r;
    public final /* synthetic */ u30 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(rm2 rm2Var, bq3 bq3Var, u30 u30Var, vd0 vd0Var, int i) {
        super(2, vd0Var);
        this.o = i;
        this.q = rm2Var;
        this.r = bq3Var;
        this.s = u30Var;
    }

    @Override // defpackage.jp
    public final vd0 create(Object obj, vd0 vd0Var) {
        switch (this.o) {
            case 0:
                return new u(this.q, this.r, this.s, vd0Var, 0);
            default:
                return new u(this.q, this.r, this.s, vd0Var, 1);
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
        }
        return ((u) create(we0Var, vd0Var)).invokeSuspend(j15Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (r3.e(r9, r10) == r6) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006d, code lost:
    
        if (r3.e(r9, r10) == r6) goto L31;
     */
    @Override // defpackage.jp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.o;
        j15 j15Var = j15.a;
        u30 u30Var = this.s;
        rm2 rm2Var = this.q;
        xe0 xe0Var = xe0.n;
        bq3 bq3Var = this.r;
        switch (i) {
            case 0:
                int i2 = this.p;
                if (i2 == 0) {
                    kb4.X(obj);
                    long j = v30.a;
                    this.p = 1;
                    if (au0.j(j, this) != xe0Var) {
                    }
                    return xe0Var;
                }
                if (i2 == 1) {
                    kb4.X(obj);
                } else {
                    if (i2 != 2) {
                        kf2.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kb4.X(obj);
                }
                u30Var.P = bq3Var;
                return j15Var;
                this.p = 2;
                break;
            default:
                int i3 = this.p;
                if (i3 == 0) {
                    kb4.X(obj);
                    long j2 = v30.a;
                    this.p = 1;
                    if (au0.j(j2, this) != xe0Var) {
                    }
                    return xe0Var;
                }
                if (i3 == 1) {
                    kb4.X(obj);
                } else {
                    if (i3 != 2) {
                        kf2.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kb4.X(obj);
                }
                u30Var.M = bq3Var;
                return j15Var;
                this.p = 2;
                break;
        }
    }
}
