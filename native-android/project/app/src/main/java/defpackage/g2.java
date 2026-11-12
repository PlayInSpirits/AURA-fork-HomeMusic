package defpackage;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g2 implements ic2 {
    public static final boolean q = false;
    public static final Logger r = null;
    public static final ji2 s = null;
    public static final Object t = null;
    public volatile Object n;
    public volatile c2 o;
    public volatile f2 p;

    static {
        q = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        r = Logger.getLogger(g2.class.getName());
        ji2 r3 = new d2(AtomicReferenceFieldUpdater.newUpdater(f2.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(f2.class, f2.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g2.class, f2.class, "p"), AtomicReferenceFieldUpdater.newUpdater(g2.class, c2.class, "o"), AtomicReferenceFieldUpdater.newUpdater(g2.class, Object.class, "n"));     // Catch: Throwable -> L5
        th = null;
    L7:
        s = r3;
        if (th == null) goto L10;
        r.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
    L10:
        t = new Object();
        return;
    L5:
        th = th;
        r3 = new e2();
        goto L7
    }

    public static void b(g2 r4) {
    L2:
        f2 r0 = r4.p;
        if (s.f(r4, r0, f2.c) == false) goto L2;
    L4:
        c2 r1 = null;
        if (r0 == null) goto L10;
        Thread r2 = r0.a;
        if (r2 == null) goto L9;
        r0.a = null;
        LockSupport.unpark(r2);
    L9:
        r0 = r0.b;
    L10:
        c2 r3 = r4.o;
        if (s.d(r4, r3, c2.d) == false) goto L10;
    L12:
        c2 r5 = r1;
        r1 = r3;
        if (r1 == null) goto L15;
        r3 = r1.c;
        r1.c = r5;
    L15:
        if (r5 == null) goto L17;
        c2 r6 = r5.c;
        c(r5.a, r5.b);
        r5 = r6;
        goto L15
    }

    public static void c(Runnable r4, Executor r5) {
        r5.execute(r4);     // Catch: RuntimeException -> L4
        return;
    L4:
        e = move-exception;
        r.log(Level.SEVERE, "RuntimeException while executing runnable " + r4 + " with executor " + r5, e);
    }

    public static Object d(Object r2) {
        if ((r2 instanceof a2) == false) goto L5;
        Throwable r3 = ((a2) r2).a;
        CancellationException r0 = new CancellationException("Task was cancelled.");
        r0.initCause(r3);
        throw r0;
    L5:
        if ((r2 instanceof b2) == true) goto L11;
        if (r2 != t) goto L14;
        return null;
    L14:
        return r2;
    L11:
        throw new ExecutionException(((b2) r2).a);
    }

    public static Object e(Future r1) {
        boolean r0 = false;
    L12:
        Object r2 = r1.get();     // Catch: Throwable -> L7 InterruptedException -> L11
    L4:
        if (r0 == false) goto L6;
        Thread.currentThread().interrupt();
    L6:
        return r2;
    L11:
        r0 = true;
    L7:
        th = move-exception;
        if (r0 == false) goto L10;
        Thread.currentThread().interrupt();
    L10:
        throw th;
    }

    public final void a(StringBuilder r4) {
        Object r1 = e(this);     // Catch: RuntimeException -> L9 ExecutionException -> L11 CancellationException -> L14
        r4.append("SUCCESS, result=[");     // Catch: RuntimeException -> L9 ExecutionException -> L11 CancellationException -> L14
        if (r1 != this) goto L6;
        String r3 = "this future";
    L7:
        r4.append(r3);     // Catch: RuntimeException -> L9 ExecutionException -> L11 CancellationException -> L14
        r4.append("]");     // Catch: RuntimeException -> L9 ExecutionException -> L11 CancellationException -> L14
        return;
    L6:
        r3 = String.valueOf(r1);     // Catch: RuntimeException -> L9 ExecutionException -> L11 CancellationException -> L14
    L14:
        r4.append("CANCELLED");
        return;
    L9:
        e = move-exception;
        r4.append("UNKNOWN, cause=[");
        r4.append(e.getClass());
        r4.append(" thrown from get()]");
        return;
    L11:
        e = move-exception;
        r4.append("FAILURE, cause=[");
        r4.append(e.getCause());
        r4.append("]");
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean r5) {
        Object r0 = this.n;
        if (r0 == null) goto L5;
        return false;
    L5:
        if (q == false) goto L7;
        a2 r1 = new a2(new CancellationException("Future.cancel() was called."), r5);
    L11:
        if (s.e(this, r0, r1) == false) goto L16;
        b(this);
        return true;
    L16:
        return false;
    L7:
        if (r5 == false) goto L9;
        r1 = a2.b;
        goto L11
    L9:
        r1 = a2.c;
        goto L11
    }

    @Override // defpackage.ic2
    public final void f(Runnable r5, Executor r6) {
        r6.getClass();
        c2 r0 = this.o;
        c2 r1 = c2.d;
        if (r0 == r1) goto L10;
        c2 r2 = new c2(r5, r6);
    L5:
        r2.c = r0;
        if (s.d(this, r0, r2) == true) goto L7;
        r0 = this.o;
        if (r0 != r1) goto L5;
    L7:
        return;
    L10:
        c(r5, r6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String g() {
        if ((this instanceof ScheduledFuture) == true) goto L5;
        return null;
    L5:
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final Object get(long r18, TimeUnit r20) {
        f2 r4 = f2.c;
        long r5 = r20.toNanos(r18);
        if (Thread.interrupted() == true) goto L69;
        Object r7 = this.n;
        if (r7 == null) goto L9;
        return d(r7);
    L9:
        if (r5 <= 0) goto L11;
        long r9 = System.nanoTime() + r5;
    L13:
        if (r5 < 1000) goto L35;
        f2 r13 = this.p;
        if (r13 == r4) goto L33;
        f2 r14 = new f2();
    L17:
        ji2 r15 = s;
        r15.B(r14, r13);
        if (r15.f(this, r13, r14) == true) goto L19;
        r13 = this.p;
        if (r13 != r4) goto L17;
    L19:
        LockSupport.parkNanos(this, r5);
        if (Thread.interrupted() == true) goto L28;
        Object r6 = this.n;
        if (r6 != null) goto L24;
        r5 = r9 - System.nanoTime();
        if (r5 >= 1000) goto L19;
        h(r14);
        goto L35
    L24:
        return d(r6);
    L28:
        h(r14);
        throw new InterruptedException();
    L33:
        return d(this.n);
    L35:
        if (r5 <= 0) goto L45;
        Object r8 = this.n;
        if (r8 != null) goto L39;
        if (Thread.interrupted() == true) goto L44;
        r5 = r9 - System.nanoTime();
        goto L35
    L44:
        throw new InterruptedException();
    L39:
        return d(r8);
    L45:
        String r10 = toString();
        String r11 = r20.toString();
        Locale r12 = Locale.ROOT;
        String r16 = r11.toLowerCase(r12);
        String r2 = "Waited " + r18 + " " + r20.toString().toLowerCase(r12);
        if ((r5 + 1000) >= 0) goto L63;
        String r3 = r2.concat(" (plus ");
        long r17 = -r5;
        long r19 = r20.convert(r17, TimeUnit.NANOSECONDS);
        long r21 = r17 - r20.toNanos(r19);
        if (r19 != 0) goto L50;
    L53:
        boolean r22 = true;
    L54:
        if (r19 <= 0) goto L59;
        String r23 = r3 + r19 + " " + r16;
        if (r22 == false) goto L58;
        r23 = r23.concat(",");
    L58:
        r3 = r23.concat(" ");
    L59:
        if (r22 == false) goto L61;
        r3 = r3 + r21 + " nanoseconds ";
    L61:
        r2 = r3.concat("delay)");
        goto L63
    L50:
        if (r21 > 1000) goto L53;
        r22 = false;
    L63:
        if (isDone() == false) goto L67;
        throw new TimeoutException(r2.concat(" but future completed as timeout expired"));
    L67:
        throw new TimeoutException(b11.o(r2, " for ", r10));
    L11:
        r9 = 0;
        goto L13
    L69:
        throw new InterruptedException();
    }

    public final void h(f2 r5) {
        r5.a = null;
    L3:
        f2 r6 = this.p;
        if (r6 == f2.c) goto L19;
        f2 r1 = null;
    L7:
        if (r6 == null) goto L28;
        f2 r2 = r6.b;
        if (r6.a == null) goto L11;
        r1 = r6;
    L18:
        r6 = r2;
        goto L7
    L11:
        if (r1 == null) goto L16;
        r1.b = r2;
        if (r1.a != null) goto L18;
    L16:
        if (s.f(this, r6, r2) == true) goto L18;
    L28:
        return;
    }

    public boolean i(Throwable r3) {
        b2 r0 = new b2(r3);
        if (s.e(this, null, r0) == false) goto L6;
        b(this);
        return true;
    L6:
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.n instanceof a2;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        if (this.n == null) goto L5;
        return true;
    L5:
        return false;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append(super.toString());
        r0.append("[status=");
        if ((this.n instanceof a2) == false) goto L6;
        r0.append("CANCELLED");
    L20:
        r0.append("]");
        return r0.toString();
    L6:
        if (isDone() == false) goto L22;
        a(r0);
        goto L20
    L22:
        String r1 = g();     // Catch: RuntimeException -> L10
    L12:
        if (r1 == null) goto L17;
        if (r1.isEmpty() == true) goto L17;
        r0.append("PENDING, info=[");
        r0.append(r1);
        r0.append("]");
    L17:
        if (isDone() == false) goto L19;
        a(r0);
        goto L20
    L19:
        r0.append("PENDING");
    L10:
        e = move-exception;
        r1 = "Exception thrown from implementation: " + e.getClass();
        goto L12
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        f2 r0 = f2.c;
        if (Thread.interrupted() == true) goto L26;
        Object r1 = this.n;
        if (r1 != null) goto L7;
        f2 r2 = this.p;
        if (r2 == r0) goto L24;
        f2 r3 = new f2();
    L11:
        ji2 r4 = s;
        r4.B(r3, r2);
        if (r4.f(this, r2, r3) == true) goto L13;
        r2 = this.p;
        if (r2 != r0) goto L11;
    L13:
        LockSupport.park(this);
        if (Thread.interrupted() == true) goto L19;
        Object r5 = this.n;
        if (r5 == null) goto L13;
        return d(r5);
    L19:
        h(r3);
        throw new InterruptedException();
    L24:
        return d(this.n);
    L7:
        return d(r1);
    L26:
        throw new InterruptedException();
    }
}
