package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ic0 {
    public static final String a = cx.i("ConstraintTrkngWrkr");

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(c52 c52Var, dd5 dd5Var, wd0 wd0Var) {
        hc0 hc0Var;
        if (wd0Var instanceof hc0) {
            hc0Var = (hc0) wd0Var;
            int i = hc0Var.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                hc0Var.o = i - Integer.MIN_VALUE;
            } else {
                hc0Var = new hc0(wd0Var);
            }
        } else {
            hc0Var = new hc0(wd0Var);
        }
        Object objP = hc0Var.n;
        int i2 = hc0Var.o;
        vd0 vd0Var = null;
        if (i2 == 0) {
            kb4.X(objP);
            gc0 gc0Var = new gc0(0, new x81(c52Var.f(dd5Var), new w(dd5Var, vd0Var, 2), 2));
            hc0Var.o = 1;
            objP = ya4.p(gc0Var, hc0Var);
            xe0 xe0Var = xe0.n;
            if (objP == xe0Var) {
                return xe0Var;
            }
        } else {
            if (i2 != 1) {
                kf2.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kb4.X(objP);
        }
        return new Integer(((sc0) objP).a);
    }
}
