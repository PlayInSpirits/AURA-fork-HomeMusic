package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class f15 extends e64 {
    public final ThreadLocal t;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public f15(ne0 ne0Var, wd0 wd0Var) {
        iz izVar = iz.p;
        super(wd0Var, ne0Var.K(izVar) == null ? ne0Var.J(izVar) : ne0Var);
        this.t = new ThreadLocal();
        if (wd0Var.getContext().K(fz0.R) instanceof pe0) {
            return;
        }
        Object objR = te5.R(ne0Var, null);
        te5.K(ne0Var, objR);
        n0(ne0Var, objR);
    }

    @Override // defpackage.e64, defpackage.a32
    public final void m(Object obj) {
        if (this.threadLocalIsSet) {
            kd3 kd3Var = (kd3) this.t.get();
            if (kd3Var != null) {
                te5.K((ne0) kd3Var.n, kd3Var.o);
            }
            this.t.remove();
        }
        Object objI = hw.I(obj);
        vd0 vd0Var = this.s;
        ne0 context = vd0Var.getContext();
        Object objR = te5.R(context, null);
        f15 f15VarQ = objR != te5.b ? jz4.Q(vd0Var, context, objR) : null;
        try {
            this.s.resumeWith(objI);
        } finally {
            if (f15VarQ == null || f15VarQ.m0()) {
                te5.K(context, objR);
            }
        }
    }

    public final boolean m0() {
        boolean z = this.threadLocalIsSet && this.t.get() == null;
        this.t.remove();
        return !z;
    }

    public final void n0(ne0 ne0Var, Object obj) {
        this.threadLocalIsSet = true;
        this.t.set(new kd3(ne0Var, obj));
    }
}
