package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class il0 extends x21 implements Executor {
    public static final il0 p = null;
    public static final pe0 q = null;

    static {
        p = new il0();
        n15 r0 = n15.p;
        int r1 = eq4.a;
        if (64 < r1) goto L6;
        r1 = 64;
    L6:
        q = r0.Z(kb4.W("kotlinx.coroutines.io.parallelism", r1, 12));
    }

    @Override // defpackage.pe0
    public final void W(ne0 r1, Runnable r2) {
        q.W(r1, r2);
    }

    @Override // defpackage.pe0
    public final void X(ne0 r1, Runnable r2) {
        q.X(r1, r2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable r2) {
        W(q01.n, r2);
    }

    @Override // defpackage.pe0
    public final String toString() {
        return "Dispatchers.IO";
    }
}
