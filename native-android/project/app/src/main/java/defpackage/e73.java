package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class e73 extends ep4 implements wf1 {
    public final /* synthetic */ int o = 0;
    public /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e73(b13 b13Var, b13 b13Var2, vd0 vd0Var) {
        super(2, vd0Var);
        this.p = b13Var;
        this.q = b13Var2;
    }

    @Override // defpackage.jp
    public final vd0 create(Object obj, vd0 vd0Var) {
        int i = this.o;
        Object obj2 = this.q;
        switch (i) {
            case 0:
                return new e73((b13) this.p, (b13) obj2, vd0Var);
            default:
                e73 e73Var = new e73((wf1) obj2, vd0Var);
                e73Var.p = obj;
                return e73Var;
        }
    }

    @Override // defpackage.wf1
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.o;
        j15 j15Var = j15.a;
        we0 we0Var = (we0) obj;
        vd0 vd0Var = (vd0) obj2;
        switch (i) {
            case 0:
                ((e73) create(we0Var, vd0Var)).invokeSuspend(j15Var);
                return j15Var;
            default:
                return ((e73) create(we0Var, vd0Var)).invokeSuspend(j15Var);
        }
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.o;
        Object obj2 = this.q;
        switch (i) {
            case 0:
                kb4.X(obj);
                if (((Boolean) ((b13) this.p).getValue()).booleanValue()) {
                    ((b13) obj2).setValue(Boolean.TRUE);
                }
                return j15.a;
            default:
                kb4.X(obj);
                ne0 ne0VarE = ((we0) this.p).e();
                fz0 fz0Var = fz0.R;
                le0 le0VarK = ne0VarE.K(fz0Var);
                le0VarK.getClass();
                pe0 pe0Var = (pe0) le0VarK;
                x60 x60Var = new x60(true);
                vd0 vd0Var = null;
                x60Var.N(null);
                r rVar = new r(x60Var, (wf1) obj2, vd0Var, 11);
                ne0 ne0VarT = jz4.t(q01.n, pe0Var, true);
                rm0 rm0Var = rr0.a;
                if (ne0VarT != rm0Var && ne0VarT.K(fz0Var) == null) {
                    ne0VarT = ne0VarT.J(rm0Var);
                }
                c0 sk4Var = new sk4(ne0VarT, true);
                sk4Var.l0(ze0.q, sk4Var, rVar);
                while (x60Var.H() instanceof mx1) {
                    try {
                        return fu.L(pe0Var, new ac0(x60Var, vd0Var, 6));
                    } catch (InterruptedException unused) {
                    }
                }
                Object objH = x60Var.H();
                if (objH instanceof mx1) {
                    kf2.o("This job has not completed yet");
                    return vd0Var;
                }
                if (objH instanceof a70) {
                    throw ((a70) objH).a;
                }
                return zz1.M(objH);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e73(wf1 wf1Var, vd0 vd0Var) {
        super(2, vd0Var);
        this.q = wf1Var;
    }
}
