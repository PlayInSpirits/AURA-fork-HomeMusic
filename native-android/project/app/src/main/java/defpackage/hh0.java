package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hh0 extends ep4 implements wf1 {
    public final /* synthetic */ int o;
    public /* synthetic */ Object p;
    public final /* synthetic */ if1 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hh0(vd0 vd0Var, if1 if1Var, int i) {
        super(2, vd0Var);
        this.o = i;
        this.q = if1Var;
    }

    @Override // defpackage.jp
    public final vd0 create(Object obj, vd0 vd0Var) {
        int i = this.o;
        if1 if1Var = this.q;
        switch (i) {
            case 0:
                hh0 hh0Var = new hh0(vd0Var, if1Var, 0);
                hh0Var.p = obj;
                return hh0Var;
            default:
                hh0 hh0Var2 = new hh0(vd0Var, if1Var, 1);
                hh0Var2.p = obj;
                return hh0Var2;
        }
    }

    @Override // defpackage.wf1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.o;
        j15 j15Var = j15.a;
        ao3 ao3Var = (ao3) obj;
        vd0 vd0Var = (vd0) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((hh0) create(ao3Var, vd0Var)).invokeSuspend(j15Var);
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object obj) {
        int i = this.o;
        if1 if1Var = this.q;
        kb4.X(obj);
        ao3 ao3Var = (ao3) this.p;
        switch (i) {
            case 0:
                ao3Var.getClass();
                break;
            default:
                ao3Var.getClass();
                break;
        }
        return if1Var.invoke(ao3Var.c());
    }
}
