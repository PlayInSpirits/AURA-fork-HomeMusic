package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mw1 implements ic2 {
    public static final mw1 o = null;
    public static final y82 p = null;
    public final Object n;

    static {
        o = new mw1(null);
        p = new y82(mw1.class);
    }

    public mw1(Object r1) {
        this.n = r1;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean r1) {
        return false;
    }

    @Override // defpackage.ic2
    public final void f(Runnable r5, Executor r6) {
        rr2.s(r6, "Executor was null.");
        r6.execute(r5);     // Catch: Exception -> L5
        return;
    L5:
        e = move-exception;
        p.a().log(Level.SEVERE, "RuntimeException while executing runnable " + r5 + " with executor " + r6, e);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long r1, TimeUnit r3) {
        r3.getClass();
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
