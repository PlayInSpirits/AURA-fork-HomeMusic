package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ry implements ic2 {
    public final WeakReference n;
    public final qy o;

    public ry(oy r2) {
        this.o = new qy(this);
        this.n = new WeakReference(r2);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean r2) {
        oy r0 = (oy) this.n.get();
        boolean r1 = this.o.cancel(r2);
        if (r1 == false) goto L6;
        if (r0 == null) goto L6;
        r0.a = null;
        r0.b = null;
        r0.c.j(null);
    L6:
        return r1;
    }

    @Override // defpackage.ic2
    public final void f(Runnable r1, Executor r2) {
        this.o.f(r1, r2);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.o.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.o.n instanceof a2;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.o.isDone();
    }

    public final String toString() {
        return this.o.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long r1, TimeUnit r3) {
        return this.o.get(r1, r3);
    }
}
