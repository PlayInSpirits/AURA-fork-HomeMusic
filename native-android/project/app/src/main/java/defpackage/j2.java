package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class j2 extends ep4 implements wf1 {
    public final /* synthetic */ int o;
    public int p;
    public final /* synthetic */ z64 q;
    public /* synthetic */ long r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j2(z64 z64Var, long j, vd0 vd0Var, int i) {
        super(2, vd0Var);
        this.o = i;
        this.q = z64Var;
        this.r = j;
    }

    @Override // defpackage.jp
    public final vd0 create(Object obj, vd0 vd0Var) {
        switch (this.o) {
            case 0:
                j2 j2Var = new j2(this.q, vd0Var);
                j2Var.r = ((g83) obj).a;
                return j2Var;
            case 1:
                return new j2(this.q, this.r, vd0Var, 1);
            case 2:
                return new j2(this.q, this.r, vd0Var, 2);
            default:
                return new j2(this.q, this.r, vd0Var, 3);
        }
    }

    @Override // defpackage.wf1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.o;
        j15 j15Var = j15.a;
        switch (i) {
            case 0:
                long j = ((g83) obj).a;
                j2 j2Var = new j2(this.q, (vd0) obj2);
                j2Var.r = j;
                return j2Var.invokeSuspend(j15Var);
            case 1:
                return ((j2) create((we0) obj, (vd0) obj2)).invokeSuspend(j15Var);
            case 2:
                return ((j2) create((we0) obj, (vd0) obj2)).invokeSuspend(j15Var);
            default:
                return ((j2) create((we0) obj, (vd0) obj2)).invokeSuspend(j15Var);
        }
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object obj) {
        int i = this.o;
        j15 j15Var = j15.a;
        z64 z64Var = this.q;
        xe0 xe0Var = xe0.n;
        switch (i) {
            case 0:
                int i2 = this.p;
                if (i2 != 0) {
                    if (i2 == 1) {
                        kb4.X(obj);
                        return obj;
                    }
                    kf2.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kb4.X(obj);
                long j = this.r;
                this.p = 1;
                Object objA = v64.a(z64Var.e0, j, this);
                return objA == xe0Var ? xe0Var : objA;
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
                g74 g74Var = z64Var.e0;
                y64 y64Var = new y64(this.r, null);
                this.p = 1;
                return g74Var.g(h13.o, y64Var, this) == xe0Var ? xe0Var : j15Var;
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
                g74 g74Var2 = z64Var.e0;
                long j2 = this.r;
                this.p = 1;
                return g74Var2.c(j2, true, this) == xe0Var ? xe0Var : j15Var;
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
                g74 g74Var3 = z64Var.e0;
                long j3 = this.r;
                this.p = 1;
                return g74Var3.c(j3, false, this) == xe0Var ? xe0Var : j15Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(z64 z64Var, vd0 vd0Var) {
        super(2, vd0Var);
        this.o = 0;
        this.q = z64Var;
    }
}
