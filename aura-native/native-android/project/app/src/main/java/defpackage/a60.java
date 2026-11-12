package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class a60 implements q81 {
    public final /* synthetic */ aw n;
    public final /* synthetic */ int o;

    public a60(aw awVar, int i) {
        this.n = awVar;
        this.o = i;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.q81
    public final Object b(Object obj, vd0 vd0Var) {
        z50 z50Var;
        Object obj2;
        if (vd0Var instanceof z50) {
            z50Var = (z50) vd0Var;
            int i = z50Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                z50Var.p = i - Integer.MIN_VALUE;
            } else {
                z50Var = new z50(this, vd0Var);
            }
        } else {
            z50Var = new z50(this, vd0Var);
        }
        Object obj3 = z50Var.n;
        int i2 = z50Var.p;
        j15 j15Var = j15.a;
        xe0 xe0Var = xe0.n;
        if (i2 == 0) {
            kb4.X(obj3);
            yx1 yx1Var = new yx1(this.o, obj);
            z50Var.p = 1;
            if (this.n.a(z50Var, yx1Var) != xe0Var) {
            }
        }
        if (i2 == 1) {
            kb4.X(obj3);
        } else {
            if (i2 != 2) {
                kf2.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kb4.X(obj3);
        }
        z50Var.p = 2;
        ne0 context = z50Var.getContext();
        gb.u(context);
        vd0 vd0VarX = ya4.x(z50Var);
        mr0 mr0Var = vd0VarX instanceof mr0 ? (mr0) vd0VarX : null;
        if (mr0Var == null) {
            obj2 = j15Var;
        } else {
            pe0 pe0Var = mr0Var.q;
            if (pe0Var.Y(context)) {
                mr0Var.s = j15Var;
                mr0Var.p = 1;
                pe0Var.X(context, mr0Var);
            } else {
                ne0 ne0VarJ = context.J(new le5(le5.o));
                mr0Var.s = j15Var;
                mr0Var.p = 1;
                pe0Var.X(ne0VarJ, mr0Var);
            }
            obj2 = xe0Var;
        }
        if (obj2 != xe0Var) {
            obj2 = j15Var;
        }
        return obj2 == xe0Var ? xe0Var : j15Var;
    }
}
