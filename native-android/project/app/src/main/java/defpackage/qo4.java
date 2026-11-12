package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qo4 implements fa0 {
    public final pz1 n;

    public qo4(pz1 pz1Var) {
        this.n = pz1Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        ((so4) this.n.o).close();
    }

    @Override // defpackage.fa0
    public final Object k(boolean z, wf1 wf1Var, wd0 wd0Var) {
        so4 so4Var = (so4) this.n.o;
        so4Var.getClass();
        return wf1Var.invoke(new uo4(new po4(so4Var.z())), wd0Var);
    }
}
