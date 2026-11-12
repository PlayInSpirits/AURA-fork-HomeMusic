package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qo4 implements fa0 {
    public final pz1 n;

    public qo4(pz1 r1) {
        this.n = r1;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        ((so4) this.n.o).close();
    }

    @Override // defpackage.fa0
    public final Object k(boolean r2, wf1 r3, wd0 r4) {
        so4 r1 = (so4) this.n.o;
        r1.getClass();
        return r3.invoke(new uo4(new po4(r1.z())), r4);
    }
}
