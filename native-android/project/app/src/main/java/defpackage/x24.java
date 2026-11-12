package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class x24 extends ep4 implements wf1 {
    public final /* synthetic */ int o;
    public int p;
    public final /* synthetic */ t24 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x24(t24 t24Var, vd0 vd0Var, int i) {
        super(2, vd0Var);
        this.o = i;
        this.q = t24Var;
    }

    @Override // defpackage.jp
    public final vd0 create(Object obj, vd0 vd0Var) {
        int i = this.o;
        t24 t24Var = this.q;
        switch (i) {
            case 0:
                return new x24(t24Var, vd0Var, 0);
            default:
                return new x24(t24Var, vd0Var, 1);
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
        return ((x24) create(we0Var, vd0Var)).invokeSuspend(j15Var);
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object obj) {
        int i = this.o;
        j15 j15Var = j15.a;
        t24 t24Var = this.q;
        xe0 xe0Var = xe0.n;
        switch (i) {
            case 0:
                int i2 = this.p;
                if (i2 == 0) {
                    kb4.X(obj);
                    this.p = 1;
                    return t24.l(t24Var, this) == xe0Var ? xe0Var : j15Var;
                }
                if (i2 == 1) {
                    kb4.X(obj);
                    return j15Var;
                }
                kf2.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                int i3 = this.p;
                if (i3 == 0) {
                    kb4.X(obj);
                    this.p = 1;
                    return t24.l(t24Var, this) == xe0Var ? xe0Var : j15Var;
                }
                if (i3 == 1) {
                    kb4.X(obj);
                    return j15Var;
                }
                kf2.o("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
