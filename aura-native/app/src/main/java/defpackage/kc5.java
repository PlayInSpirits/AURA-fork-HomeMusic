package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class kc5 extends ep4 implements xf1 {
    public kc5(int a0, defpackage.vd0 a1) {
        super(a0, a1);
    }

    public int o;
    public /* synthetic */ q81 p;
    public /* synthetic */ Object[] q;

    @Override // defpackage.xf1
    public final Object a(Object obj, Object obj2, Object obj3) {
        kc5 kc5Var = new kc5(3, (vd0) obj3);
        kc5Var.p = (q81) obj;
        kc5Var.q = (Object[]) obj2;
        return kc5Var.invokeSuspend(j15.a);
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object obj) {
        tc0 tc0Var;
        int i = this.o;
        tc0 tc0Var2 = null;
        if (i == 0) {
            kb4.X(obj);
            q81 q81Var = this.p;
            tc0[] tc0VarArr = (tc0[]) this.q;
            int length = tc0VarArr.length;
            int i2 = 0;
            while (true) {
                tc0Var = rc0.a;
                if (i2 >= length) {
                    break;
                }
                tc0 tc0Var3 = tc0VarArr[i2];
                if (!h12.c(tc0Var3, tc0Var)) {
                    tc0Var2 = tc0Var3;
                    break;
                }
                i2++;
            }
            if (tc0Var2 != null) {
                tc0Var = tc0Var2;
            }
            this.o = 1;
            Object b = q81Var.b(tc0Var, this);
            xe0 xe0Var = xe0.n;
            if (b == xe0Var) {
                return xe0Var;
            }
        } else {
            if (i != 1) {
                kf2.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kb4.X(obj);
        }
        return j15.a;
    }
}
