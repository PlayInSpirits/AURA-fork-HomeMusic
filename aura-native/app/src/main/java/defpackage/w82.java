package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class w82 extends ep4 implements wf1 {
    public final /* synthetic */ int o;
    public int p;
    public final /* synthetic */ int q;
    public final /* synthetic */ Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w82(Object obj, int i, vd0 vd0Var, int i2) {
        super(2, vd0Var);
        this.o = i2;
        this.r = obj;
        this.q = i;
    }

    @Override // defpackage.jp
    public final vd0 create(Object obj, vd0 vd0Var) {
        int i = this.o;
        int i2 = this.q;
        Object obj2 = this.r;
        switch (i) {
            case 0:
                return new w82((x82) obj2, i2, vd0Var, 0);
            default:
                return new w82((lm0) obj2, i2, vd0Var, 1);
        }
    }

    @Override // defpackage.wf1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.o;
        j15 j15Var = j15.a;
        switch (i) {
            case 0:
                return ((w82) create((we0) obj, (vd0) obj2)).invokeSuspend(j15Var);
            default:
                return ((w82) create((q64) obj, (vd0) obj2)).invokeSuspend(j15Var);
        }
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object obj) {
        int i = this.o;
        j15 j15Var = j15.a;
        int i2 = this.q;
        xe0 xe0Var = xe0.n;
        Object obj2 = this.r;
        vd0 vd0Var = null;
        int i3 = 1;
        switch (i) {
            case 0:
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
                s82 s82Var = ((x82) obj2).C;
                this.p = 1;
                lm0 lm0Var = s82Var.a;
                Object s = ad3.s(lm0Var, h13.n, new w82(lm0Var, i2, vd0Var, i3), this);
                if (s != xe0Var) {
                    s = j15Var;
                }
                if (s != xe0Var) {
                    s = j15Var;
                }
                return s == xe0Var ? xe0Var : j15Var;
            default:
                lm0 lm0Var2 = (lm0) obj2;
                int i5 = this.p;
                if (i5 == 0) {
                    kb4.X(obj);
                    this.p = 1;
                    if (lm0Var2.i(this) == xe0Var) {
                        return xe0Var;
                    }
                } else {
                    if (i5 != 1) {
                        kf2.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kb4.X(obj);
                }
                lm0Var2.t(0.0f, lm0Var2.j(i2), true);
                return j15Var;
        }
    }
}
