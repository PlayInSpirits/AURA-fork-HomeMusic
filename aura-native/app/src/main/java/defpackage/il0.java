package defpackage;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class il0 extends x21 implements Executor {
    public static final il0 p = new il0();
    public static final pe0 q;

    static {
        n15 n15Var = n15.p;
        int i = eq4.a;
        if (64 >= i) {
            i = 64;
        }
        q = n15Var.Z(kb4.W("kotlinx.coroutines.io.parallelism", i, 12));
    }

    @Override // defpackage.pe0
    public final void W(ne0 ne0Var, Runnable runnable) {
        q.W(ne0Var, runnable);
    }

    @Override // defpackage.pe0
    public final void X(ne0 ne0Var, Runnable runnable) {
        q.X(ne0Var, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        W(q01.n, runnable);
    }

    @Override // defpackage.pe0
    public final String toString() {
        return "Dispatchers.IO";
    }
}
