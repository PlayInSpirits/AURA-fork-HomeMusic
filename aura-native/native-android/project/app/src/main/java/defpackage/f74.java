package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class f74 extends ep4 implements wf1 {
    public long o;
    public int p;
    public /* synthetic */ long q;
    public final /* synthetic */ g74 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f74(g74 g74Var, vd0 vd0Var) {
        super(2, vd0Var);
        this.r = g74Var;
    }

    @Override // defpackage.jp
    public final vd0 create(Object obj, vd0 vd0Var) {
        f74 f74Var = new f74(this.r, vd0Var);
        f74Var.q = ((k45) obj).a;
        return f74Var;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object obj, Object obj2) {
        long j = ((k45) obj).a;
        f74 f74Var = new f74(this.r, (vd0) obj2);
        f74Var.q = j;
        return f74Var.invokeSuspend(j15.a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006e  */
    @Override // defpackage.jp
    public final Object invokeSuspend(Object obj) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        int i = this.p;
        g74 g74Var = this.r;
        xe0 xe0Var = xe0.n;
        if (i == 0) {
            kb4.X(obj);
            j = this.q;
            na4 na4Var = g74Var.f;
            this.q = j;
            this.p = 1;
            obj = na4Var.m(j, this);
            if (obj != xe0Var) {
            }
            return xe0Var;
        }
        if (i == 1) {
            j = this.q;
            kb4.X(obj);
        } else {
            if (i == 2) {
                j2 = this.o;
                j = this.q;
                kb4.X(obj);
                j3 = ((k45) obj).a;
                na4 na4Var2 = g74Var.f;
                long jD = k45.d(j2, j3);
                this.q = j;
                this.o = j3;
                this.p = 3;
                obj = na4Var2.l(jD, j3, this);
                if (obj != xe0Var) {
                    j4 = j;
                    j5 = j3;
                }
                return xe0Var;
            }
            if (i != 3) {
                kf2.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j5 = this.o;
            j4 = this.q;
            kb4.X(obj);
        }
        return new k45(k45.d(j4, k45.d(j5, ((k45) obj).a)));
        long jD2 = k45.d(j, ((k45) obj).a);
        this.q = j;
        this.o = jD2;
        this.p = 2;
        obj = g74Var.a(jD2, this);
        if (obj != xe0Var) {
            j2 = jD2;
            j3 = ((k45) obj).a;
            na4 na4Var3 = g74Var.f;
            long jD3 = k45.d(j2, j3);
            this.q = j;
            this.o = j3;
            this.p = 3;
            obj = na4Var3.l(jD3, j3, this);
            if (obj != xe0Var) {
                j4 = j;
                j5 = j3;
                return new k45(k45.d(j4, k45.d(j5, ((k45) obj).a)));
            }
        }
        return xe0Var;
    }
}
