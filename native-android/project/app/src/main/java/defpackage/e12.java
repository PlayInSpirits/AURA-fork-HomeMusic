package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e12 extends AtomicReference implements Runnable {
    public static final wz0 n = null;
    public static final wz0 o = null;

    static {
        int r1 = 1;
        n = new wz0(r1);
        o = new wz0(r1);
    }

    public abstract void a(Throwable r1);

    public abstract void b(Object r1);

    public final void c() {
        wz0 r0 = o;
        wz0 r1 = n;
        Runnable r2 = (Runnable) get();
        if ((r2 instanceof Thread) == false) goto L16;
        d12 r3 = new d12(this);
        d12.a(r3, Thread.currentThread());
        if (compareAndSet(r2, r3) == false) goto L19;
        ((Thread) r2).interrupt();     // Catch: Throwable -> L11
        if (((Runnable) getAndSet(r1)) != r0) goto L20;
        LockSupport.unpark((Thread) r2);
        return;
    L20:
        return;
    L11:
        th = move-exception;
        if (((Runnable) getAndSet(r1)) != r0) goto L15;
        LockSupport.unpark((Thread) r2);
    L15:
        throw th;
    L19:
        return;
    }

    public abstract boolean d();

    public abstract Object e();

    public abstract String f();

    public final void g(Thread r9) {
        Runnable r0 = (Runnable) get();
        d12 r2 = null;
        boolean r3 = false;
        int r4 = 0;
    L3:
        boolean r5 = r0 instanceof d12;
        wz0 r6 = o;
        if (r5 == true) goto L10;
        if (r0 == r6) goto L10;
        if (r3 == false) goto L30;
        r9.interrupt();
        return;
    L30:
        return;
    L10:
        if (r5 == false) goto L12;
        r2 = (d12) r0;
    L12:
        r4 = r4 + 1;
        if (r4 <= 1000) goto L24;
        if (r0 == r6) goto L18;
        if (compareAndSet(r0, r6) == true) goto L18;
    L25:
        r0 = (Runnable) get();
    L18:
        if (Thread.interrupted() == true) goto L22;
        if (r3 == true) goto L22;
        r3 = false;
    L23:
        LockSupport.park(r2);
    L22:
        r3 = true;
        goto L23
    L24:
        Thread.yield();
        goto L25
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread r0 = Thread.currentThread();
        Object r1 = null;
        if (compareAndSet(null, r0) == false) goto L38;
        boolean r2 = d();
        wz0 r3 = n;
        if (r2 == true) goto L26;
        r1 = e();     // Catch: Throwable -> L9
    L9:
        th = move-exception;
    L18:
        th = move-exception;
        if (compareAndSet(r0, r3) == true) goto L22;
        g(r0);
    L22:
        if (r2 == true) goto L24;
        b(null);
    L24:
        throw th;
    L11:
        if ((th instanceof InterruptedException) == false) goto L14;
        Thread.currentThread().interrupt();     // Catch: Throwable -> L18
    L14:
        if (compareAndSet(r0, r3) == true) goto L16;
        g(r0);
    L16:
        if (r2 == true) goto L35;
        a(th);
        return;
    L35:
        return;
    L26:
        if (compareAndSet(r0, r3) == true) goto L28;
        g(r0);
    L28:
        if (r2 == true) goto L37;
        b(r1);
        return;
    L37:
        return;
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        Runnable r0 = (Runnable) get();
        if (r0 != n) goto L6;
        String r1 = "running=[DONE]";
    L12:
        StringBuilder r2 = b11.s(r1, ", ");
        r2.append(f());
        return r2.toString();
    L6:
        if ((r0 instanceof d12) == false) goto L9;
        r1 = "running=[INTERRUPTED]";
        goto L12
    L9:
        if ((r0 instanceof Thread) == false) goto L11;
        r1 = "running=[RUNNING ON " + ((Thread) r0).getName() + "]";
        goto L12
    L11:
        r1 = "running=[NOT STARTED YET]";
        goto L12
    }
}
