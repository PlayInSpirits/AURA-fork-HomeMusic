package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class mw1 implements ic2 {
    public static final mw1 o = new mw1(null);
    public static final y82 p = new y82(mw1.class);
    public final Object n;

    public mw1(Object obj) {
        this.n = obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // defpackage.ic2
    public final void f(Runnable runnable, Executor executor) {
        rr2.s(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            p.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.n;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        return super.toString() + "[status=SUCCESS, result=[" + this.n + "]]";
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.n;
    }
}
