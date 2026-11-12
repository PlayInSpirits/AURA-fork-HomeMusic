package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class aw2 implements AutoCloseable {
    public final hw2 n;

    public aw2(hw2 r1) {
        this.n = r1;
    }

    public final n0 b() {
        hw2 r6 = this.n;
        Object r0 = r6.p;
        monitor-enter(r0);
    L9:
        th = move-exception;
        throw th;
    L5:
        if (r6.t == false) goto L11;
        IllegalStateException r7 = new IllegalStateException("Retriever is released.");     // Catch: Throwable -> L9
        lw1 r1 = new lw1();     // Catch: Throwable -> L9
        r1.m(r7);     // Catch: Throwable -> L9
        monitor-exit(r0);     // Catch: Throwable -> L9
        return r1;
    L11:
        r6.b();     // Catch: Throwable -> L9
        lb4 r2 = new lb4();     // Catch: Throwable -> L9
        r6.q.add(r2);     // Catch: Throwable -> L9
        lb4 r8 = r6.r;     // Catch: Throwable -> L9
        r8.getClass();     // Catch: Throwable -> L9
        pz1 r3 = new pz1(8, r2);     // Catch: Throwable -> L9
        gq0 r4 = gq0.n;     // Catch: Throwable -> L9
        r8.f(new lg1(0, r8, r3), r4);     // Catch: Throwable -> L9
        monitor-exit(r0);     // Catch: Throwable -> L9
        return r2;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.n.close();
    }
}
