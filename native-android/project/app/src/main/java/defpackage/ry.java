package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ry implements ic2 {
    public final WeakReference n;
    public final qy o = new qy(this);

    public ry(oy oyVar) {
        this.n = new WeakReference(oyVar);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        oy oyVar = (oy) this.n.get();
        boolean zCancel = this.o.cancel(z);
        if (zCancel && oyVar != null) {
            oyVar.a = null;
            oyVar.b = null;
            oyVar.c.j(null);
        }
        return zCancel;
    }

    @Override // defpackage.ic2
    public final void f(Runnable runnable, Executor executor) {
        this.o.f(runnable, executor);
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
    public final Object get(long j, TimeUnit timeUnit) {
        return this.o.get(j, timeUnit);
    }
}
