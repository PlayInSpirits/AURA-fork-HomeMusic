package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class vd5 extends ep4 implements wf1 {
    public final /* synthetic */ int o;
    public int p;
    public final /* synthetic */ wd5 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vd5(wd5 wd5Var, vd0 vd0Var, int i) {
        super(2, vd0Var);
        this.o = i;
        this.q = wd5Var;
    }

    @Override // defpackage.jp
    public final vd0 create(Object obj, vd0 vd0Var) {
        int i = this.o;
        wd5 wd5Var = this.q;
        switch (i) {
            case 0:
                return new vd5(wd5Var, vd0Var, 0);
            default:
                return new vd5(wd5Var, vd0Var, 1);
        }
    }

    @Override // defpackage.wf1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.o;
        j15 j15Var = j15.a;
        we0 we0Var = (we0) obj;
        vd0 vd0Var = (vd0) obj2;
        switch (i) {
        }
        return ((vd5) create(we0Var, vd0Var)).invokeSuspend(j15Var);
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object obj) {
        int i = this.o;
        wd5 wd5Var = this.q;
        xe0 xe0Var = xe0.n;
        j15 j15Var = j15.a;
        switch (i) {
            case 0:
                int i2 = this.p;
                if (i2 == 0) {
                    kb4.X(obj);
                    ra raVar = wd5Var.n;
                    this.p = 1;
                    Object l = raVar.J.l(this);
                    if (l != xe0Var) {
                        l = j15Var;
                    }
                    if (l == xe0Var) {
                        break;
                    }
                } else if (i2 != 1) {
                    kf2.o("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    kb4.X(obj);
                }
                break;
            default:
                int i3 = this.p;
                if (i3 == 0) {
                    kb4.X(obj);
                    ra raVar2 = wd5Var.n;
                    this.p = 1;
                    Object a = raVar2.K.a(this);
                    if (a != xe0Var) {
                        a = j15Var;
                    }
                    if (a == xe0Var) {
                        break;
                    }
                } else if (i3 != 1) {
                    kf2.o("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    kb4.X(obj);
                }
                break;
        }
        return xe0Var;
    }
}
