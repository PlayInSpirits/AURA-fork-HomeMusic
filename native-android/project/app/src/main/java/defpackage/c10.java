package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class c10 extends ep4 implements wf1 {
    public final /* synthetic */ int o = 0;
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ f10 r;
    public final /* synthetic */ q81 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c10(f10 f10Var, q81 q81Var, Object obj, vd0 vd0Var) {
        super(2, vd0Var);
        this.r = f10Var;
        this.s = q81Var;
        this.q = obj;
    }

    @Override // defpackage.jp
    public final vd0 create(Object obj, vd0 vd0Var) {
        int i = this.o;
        q81 q81Var = this.s;
        f10 f10Var = this.r;
        switch (i) {
            case 0:
                return new c10(f10Var, q81Var, this.q, vd0Var);
            default:
                c10 c10Var = new c10(f10Var, q81Var, vd0Var);
                c10Var.q = obj;
                return c10Var;
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
        return ((c10) create(we0Var, vd0Var)).invokeSuspend(j15Var);
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object obj) {
        int i = this.o;
        j15 j15Var = j15.a;
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
                xf1 xf1Var = this.r.r;
                Object obj2 = this.q;
                this.p = 1;
                return xf1Var.a(this.s, obj2, this) == xe0Var ? xe0Var : j15Var;
            default:
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
                we0 we0Var = (we0) this.q;
                jx3 jx3Var = new jx3();
                f10 f10Var = this.r;
                p81 p81Var = f10Var.q;
                e10 e10Var = new e10(jx3Var, we0Var, f10Var, this.s, 0);
                this.p = 1;
                return p81Var.a(e10Var, this) == xe0Var ? xe0Var : j15Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c10(f10 f10Var, q81 q81Var, vd0 vd0Var) {
        super(2, vd0Var);
        this.r = f10Var;
        this.s = q81Var;
    }
}
