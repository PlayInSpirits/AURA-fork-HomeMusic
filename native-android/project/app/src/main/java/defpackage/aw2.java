package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class aw2 implements AutoCloseable {
    public final hw2 n;

    public aw2(hw2 hw2Var) {
        this.n = hw2Var;
    }

    public final n0 b() {
        hw2 hw2Var = this.n;
        synchronized (hw2Var.p) {
            try {
                if (hw2Var.t) {
                    IllegalStateException illegalStateException = new IllegalStateException("Retriever is released.");
                    lw1 lw1Var = new lw1();
                    lw1Var.m(illegalStateException);
                    return lw1Var;
                }
                hw2Var.b();
                lb4 lb4Var = new lb4();
                hw2Var.q.add(lb4Var);
                lb4 lb4Var2 = hw2Var.r;
                lb4Var2.getClass();
                pz1 pz1Var = new pz1(8, lb4Var);
                lb4Var2.f(new lg1(0, lb4Var2, pz1Var), gq0.n);
                return lb4Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.n.close();
    }
}
