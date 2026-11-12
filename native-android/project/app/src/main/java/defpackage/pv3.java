package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pv3 extends ep4 implements wf1 {
    public final /* synthetic */ int o;
    public /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pv3(int i, vd0 vd0Var, int i2) {
        super(i, vd0Var);
        this.o = i2;
    }

    @Override // defpackage.jp
    public final vd0 create(Object obj, vd0 vd0Var) {
        switch (this.o) {
            case 0:
                pv3 pv3Var = new pv3(2, vd0Var, 0);
                pv3Var.p = obj;
                return pv3Var;
            default:
                pv3 pv3Var2 = new pv3(2, vd0Var, 1);
                pv3Var2.p = obj;
                return pv3Var2;
        }
    }

    @Override // defpackage.wf1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.o;
        j15 j15Var = j15.a;
        switch (i) {
            case 0:
                return ((pv3) create((ov3) obj, (vd0) obj2)).invokeSuspend(j15Var);
            default:
                return ((pv3) create((gd4) obj, (vd0) obj2)).invokeSuspend(j15Var);
        }
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object obj) {
        switch (this.o) {
            case 0:
                kb4.X(obj);
                return Boolean.valueOf(((ov3) this.p) == ov3.n);
            default:
                kb4.X(obj);
                return Boolean.valueOf(((gd4) this.p) != gd4.n);
        }
    }
}
