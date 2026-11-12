package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class r12 extends ep4 implements wf1 {
    public final /* synthetic */ int o;
    public int p;
    public final /* synthetic */ s12 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r12(s12 s12Var, vd0 vd0Var, int i) {
        super(2, vd0Var);
        this.o = i;
        this.q = s12Var;
    }

    @Override // defpackage.jp
    public final vd0 create(Object obj, vd0 vd0Var) {
        int i = this.o;
        s12 s12Var = this.q;
        switch (i) {
            case 0:
                return new r12(s12Var, vd0Var, 0);
            case 1:
                return new r12(s12Var, vd0Var, 1);
            default:
                return new r12(s12Var, vd0Var, 2);
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
        return ((r12) create(we0Var, vd0Var)).invokeSuspend(j15Var);
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object obj) {
        int i = this.o;
        j15 j15Var = j15.a;
        s12 s12Var = this.q;
        xe0 xe0Var = xe0.n;
        switch (i) {
            case 0:
                int i2 = this.p;
                if (i2 == 0) {
                    kb4.X(obj);
                    jy4 jy4Var = s12Var.b;
                    this.p = 1;
                    return jy4Var.f(this) == xe0Var ? xe0Var : j15Var;
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
                    jy4 jy4Var2 = s12Var.b;
                    this.p = 1;
                    return jy4Var2.f(this) == xe0Var ? xe0Var : j15Var;
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
                    return s12Var.b(this) == xe0Var ? xe0Var : j15Var;
                }
                if (i4 == 1) {
                    kb4.X(obj);
                    return j15Var;
                }
                kf2.o("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
