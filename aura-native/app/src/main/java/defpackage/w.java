package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class w extends ep4 implements wf1 {
    public final /* synthetic */ int o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(Object obj, vd0 vd0Var, int i) {
        super(2, vd0Var);
        this.o = i;
        this.p = obj;
    }

    @Override // defpackage.jp
    public final vd0 create(Object obj, vd0 vd0Var) {
        int i = this.o;
        Object obj2 = this.p;
        switch (i) {
            case 0:
                return new w((u30) obj2, vd0Var, 0);
            case 1:
                return new w((u30) obj2, vd0Var, 1);
            default:
                return new w((dd5) obj2, vd0Var, 2);
        }
    }

    @Override // defpackage.wf1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.o;
        j15 j15Var = j15.a;
        switch (i) {
            case 0:
                ((w) create((we0) obj, (vd0) obj2)).invokeSuspend(j15Var);
                break;
            case 1:
                ((w) create((we0) obj, (vd0) obj2)).invokeSuspend(j15Var);
                break;
            default:
                ((w) create((tc0) obj, (vd0) obj2)).invokeSuspend(j15Var);
                break;
        }
        return j15Var;
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object obj) {
        int i = this.o;
        vd0 vd0Var = null;
        j15 j15Var = j15.a;
        Object obj2 = this.p;
        switch (i) {
            case 0:
                kb4.X(obj);
                u30 u30Var = (u30) obj2;
                if (u30Var.N == null) {
                    wp1 wp1Var = new wp1();
                    rm2 rm2Var = u30Var.D;
                    if (rm2Var != null) {
                        fu.G(u30Var.e0(), null, null, new p(rm2Var, wp1Var, vd0Var, 0), 3);
                    }
                    u30Var.N = wp1Var;
                    break;
                }
                break;
            case 1:
                kb4.X(obj);
                u30 u30Var2 = (u30) obj2;
                if (u30Var2.N != null) {
                    xp1 xp1Var = new xp1();
                    rm2 rm2Var2 = u30Var2.D;
                    if (rm2Var2 != null) {
                        fu.G(u30Var2.e0(), null, null, new p(rm2Var2, xp1Var, vd0Var, 1), 3);
                    }
                    u30Var2.N = null;
                    break;
                }
                break;
            default:
                kb4.X(obj);
                String str = ic0.a;
                cx.f().b(str, "Constraints changed for " + ((dd5) obj2));
                break;
        }
        return j15Var;
    }
}
