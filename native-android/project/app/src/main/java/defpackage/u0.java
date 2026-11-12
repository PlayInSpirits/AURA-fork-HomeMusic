package defpackage;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u0 implements ic2 {
    public static final boolean q = false;
    public static final y82 r = null;
    public static final g12 s = null;
    public static final Object t = null;
    public volatile Object n;
    public volatile i0 o;
    public volatile t0 p;

    static {
        boolean r0 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));     // Catch: SecurityException -> L5
    L6:
        q = r0;
        r = new y82(u0.class);
        Throwable r3 = null;
        g12 r1 = new s0();     // Catch: Error -> L9 Throwable -> L11
        Throwable r4 = null;
    L20:
        s = r1;
        if (r3 == null) goto L23;
        y82 r2 = r;
        Logger r5 = r2.a();
        Level r6 = Level.SEVERE;
        r5.log(r6, "UnsafeAtomicHelper is broken!", r4);
        r2.a().log(r6, "SafeAtomicHelper is broken!", r3);
    L23:
        t = new Object();
        return;
    L11:
        e = move-exception;
        r4 = e;
        r1 = new j0(AtomicReferenceFieldUpdater.newUpdater(t0.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(t0.class, t0.class, "b"), AtomicReferenceFieldUpdater.newUpdater(u0.class, t0.class, "p"), AtomicReferenceFieldUpdater.newUpdater(u0.class, i0.class, "o"), AtomicReferenceFieldUpdater.newUpdater(u0.class, Object.class, "n"));     // Catch: Error -> L15 Throwable -> L17
    L17:
        e = move-exception;
        r3 = e;
        r1 = new l0();
    L5:
        r0 = false;
        goto L6
    }

    public static void d(u0 r6, boolean r7) {
        i0 r1 = null;
    L3:
        t0 r2 = s.q(r6);
    L4:
        if (r2 == null) goto L9;
        Thread r3 = r2.a;
        if (r3 == null) goto L8;
        r2.a = null;
        LockSupport.unpark(r3);
    L8:
        r2 = r2.b;
        goto L4
    L9:
        if (r7 == false) goto L11;
        r6.i();
        r7 = false;
    L11:
        r6.b();
        i0 r5 = r1;
        i0 r4 = s.p(r6);
        i0 r8 = r5;
    L12:
        if (r4 == null) goto L14;
        i0 r9 = r4.c;
        r4.c = r8;
        r8 = r4;
        r4 = r9;
    L14:
        if (r8 == null) goto L24;
        r1 = r8.c;
        Runnable r10 = r8.a;
        Objects.requireNonNull(r10);
        if ((r10 instanceof k0) == false) goto L22;
        k0 r11 = (k0) r10;
        r6 = r11.n;
        if (r6.n != r11) goto L23;
        if (s.h(r6, r11, h(r11.o)) == true) goto L3;
    L23:
        r8 = r1;
        goto L14
    L22:
        Executor r12 = r8.b;
        Objects.requireNonNull(r12);
        e(r10, r12);
        goto L23
    }

    public static void e(Runnable r5, Executor r6) {
        r6.execute(r5);     // Catch: Exception -> L4
        return;
    L4:
        e = move-exception;
        r.a().log(Level.SEVERE, "RuntimeException while executing runnable " + r5 + " with executor " + r6, e);
    }

    public static Object g(Object r2) {
        if ((r2 instanceof f0) == false) goto L5;
        Throwable r3 = ((f0) r2).b;
        CancellationException r0 = new CancellationException("Task was cancelled.");
        r0.initCause(r3);
        throw r0;
    L5:
        if ((r2 instanceof h0) == true) goto L11;
        if (r2 != t) goto L14;
        return null;
    L14:
        return r2;
    L11:
        throw new ExecutionException(((h0) r2).a);
    }

    public static Object h(ic2 r6) {
        if ((r6 instanceof m0) == false) goto L15;
        Object r7 = ((u0) r6).n;
        if ((r7 instanceof f0) == false) goto L12;
        f0 r0 = (f0) r7;
        if (r0.a == false) goto L12;
        if (r0.b == null) goto L11;
        r7 = new f0(r0.b, false);
        goto L12
    L11:
        r7 = f0.d;
    L12:
        Objects.requireNonNull(r7);
        return r7;
    L15:
        if ((r6 instanceof u0) == false) goto L20;
        Throwable r1 = ((u0) r6).o();
        if (r1 == null) goto L20;
        return new h0(r1);
    L20:
        boolean r2 = r6.isCancelled();
        boolean r4 = true;
        if (((!q) & r2) == false) goto L24;
        f0 r8 = f0.d;
        Objects.requireNonNull(r8);
        return r8;
    L24:
        boolean r3 = false;
    L59:
        Object r5 = r6.get();     // Catch: Throwable -> L41 InterruptedException -> L58
    L26:
        if (r3 == false) goto L28;
        Thread.currentThread().interrupt();     // Catch: CancellationException -> L31 ExecutionException -> L33 Throwable -> L38 Error -> L45
    L28:
        if (r2 == true) goto L30;
        if (r5 == null) goto L37;
        return r5;
    L37:
        return t;
    L30:
        return new f0(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + r6), false);
    L45:
        e = e;
    L47:
        return new h0(e);
    L58:
        r3 = r4;
    L41:
        th = move-exception;
        if (r3 == false) goto L44;
        Thread.currentThread().interrupt();     // Catch: CancellationException -> L31 ExecutionException -> L33 Throwable -> L38 Error -> L45
    L44:
        throw th;     // Catch: CancellationException -> L31 ExecutionException -> L33 Throwable -> L38 Error -> L45
    L38:
        e = e;
    L31:
        e = move-exception;
        if (r2 == true) goto L52;
        return new h0(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + r6, e));
    L52:
        return new f0(e, false);
    L33:
        e = move-exception;
        if (r2 == false) goto L57;
        return new f0(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + r6, e), false);
    L57:
        return new h0(e.getCause());
    }

    public final void a(StringBuilder r4) {
        boolean r1 = false;
    L21:
        Object r2 = get();     // Catch: Throwable -> L12 InterruptedException -> L20
    L4:
        if (r1 == false) goto L6;
        Thread.currentThread().interrupt();     // Catch: Exception -> L8 ExecutionException -> L10 CancellationException -> L17
    L6:
        r4.append("SUCCESS, result=[");     // Catch: Exception -> L8 ExecutionException -> L10 CancellationException -> L17
        c(r2, r4);     // Catch: Exception -> L8 ExecutionException -> L10 CancellationException -> L17
        r4.append("]");     // Catch: Exception -> L8 ExecutionException -> L10 CancellationException -> L17
        return;
    L20:
        r1 = true;
    L12:
        th = move-exception;
        if (r1 == false) goto L15;
        Thread.currentThread().interrupt();     // Catch: Exception -> L8 ExecutionException -> L10 CancellationException -> L17
    L15:
        throw th;     // Catch: Exception -> L8 ExecutionException -> L10 CancellationException -> L17
    L17:
        r4.append("CANCELLED");
        return;
    L10:
        e = move-exception;
        r4.append("FAILURE, cause=[");
        r4.append(e.getCause());
        r4.append("]");
        return;
    L8:
        e = move-exception;
        r4.append("UNKNOWN, cause=[");
        r4.append(e.getClass());
        r4.append(" thrown from get()]");
    }

    public void b() {
    }

    public final void c(Object r1, StringBuilder r2) {
        if (r1 != null) goto L5;
        r2.append("null");
        return;
    L5:
        if (r1 != this) goto L8;
        r2.append("this future");
        return;
    L8:
        r2.append(r1.getClass().getName());
        r2.append("@");
        r2.append(Integer.toHexString(System.identityHashCode(r1)));
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean r7) {
        Object r0 = this.n;
        if (r0 != null) goto L5;
        boolean r3 = true;
    L7:
        if ((r3 | (r0 instanceof k0)) == true) goto L9;
        return false;
    L9:
        if (q == false) goto L11;
        f0 r4 = new f0(new CancellationException("Future.cancel() was called."), r7);
    L15:
        boolean r5 = false;
    L17:
        if (s.h(this, r0, r4) == true) goto L18;
        r0 = this.n;
        if ((r0 instanceof k0) == true) goto L17;
        return r5;
    L18:
        d(this, r7);
        if ((r0 instanceof k0) == false) goto L30;
        ic2 r6 = ((k0) r0).o;
        if ((r6 instanceof m0) == false) goto L29;
        u0 this = (u0) r6;
        r0 = this.n;
        if (r0 != null) goto L25;
        boolean r8 = true;
    L27:
        if ((r8 | (r0 instanceof k0)) == false) goto L30;
        r5 = true;
        goto L17
    L25:
        r8 = false;
        goto L27
    L29:
        r6.cancel(r7);
    L30:
        return true;
    L11:
        if (r7 == false) goto L13;
        r4 = f0.c;
    L14:
        Objects.requireNonNull(r4);
        goto L15
    L13:
        r4 = f0.d;
        goto L14
    L5:
        r3 = false;
        goto L7
    }

    @Override // defpackage.ic2
    public void f(Runnable r5, Executor r6) {
        i0 r0 = i0.d;
        rr2.s(r6, "Executor was null.");
        if (isDone() == true) goto L12;
        i0 r1 = this.o;
        if (r1 == r0) goto L12;
        i0 r2 = new i0(r5, r6);
    L7:
        r2.c = r1;
        if (s.g(this, r1, r2) == true) goto L9;
        r1 = this.o;
        if (r1 != r0) goto L7;
    L9:
        return;
    L12:
        e(r5, r6);
    }

    @Override // java.util.concurrent.Future
    public Object get(long r21, TimeUnit r23) {
        t0 r4 = t0.c;
        long r5 = r23.toNanos(r21);
        if (Thread.interrupted() == true) goto L85;
        Object r7 = this.n;
        if (r7 == null) goto L7;
        boolean r10 = true;
    L9:
        if ((r10 & (!(r7 instanceof k0))) == true) goto L11;
        long r11 = 0;
        if (r5 <= 0) goto L15;
        long r12 = System.nanoTime() + r5;
    L17:
        if (r5 < 1000) goto L45;
        t0 r8 = this.p;
        if (r8 == r4) goto L43;
        t0 r9 = new t0();
        boolean r17 = true;
    L21:
        g12 r13 = s;
        r13.K(r9, r8);
        if (r13.i(this, r8, r9) == true) goto L23;
        long r18 = r11;
        r8 = this.p;
        if (r8 == r4) goto L43;
        r11 = r18;
        goto L21
    L23:
        long r19 = r11;
    L24:
        LockSupport.parkNanos(this, Math.min(r5, 2147483647999999999L));
        if (Thread.interrupted() == true) goto L37;
        Object r6 = this.n;
        if (r6 == null) goto L29;
        boolean r14 = true;
    L31:
        if ((r14 & (!(r6 instanceof k0))) == true) goto L33;
        r5 = r12 - System.nanoTime();
        if (r5 >= 1000) goto L24;
        k(r9);
    L47:
        if (r5 <= r19) goto L61;
        Object r15 = this.n;
        if (r15 == null) goto L51;
        boolean r16 = r17;
    L53:
        if ((r16 & (!(r15 instanceof k0))) == true) goto L55;
        if (Thread.interrupted() == true) goto L60;
        r5 = r12 - System.nanoTime();
        goto L47
    L60:
        throw new InterruptedException();
    L55:
        return g(r15);
    L51:
        r16 = false;
        goto L53
    L61:
        String r20 = toString();
        String r22 = r23.toString();
        Locale r24 = Locale.ROOT;
        String r25 = r22.toLowerCase(r24);
        String r2 = "Waited " + r21 + " " + r23.toString().toLowerCase(r24);
        if ((r5 + 1000) >= r19) goto L79;
        String r3 = r2.concat(" (plus ");
        long r26 = -r5;
        long r27 = r23.convert(r26, TimeUnit.NANOSECONDS);
        long r28 = r26 - r23.toNanos(r27);
        if (r27 != r19) goto L66;
    L69:
        boolean r110 = r17;
    L70:
        if (r27 <= r19) goto L75;
        String r29 = r3 + r27 + " " + r25;
        if (r110 == false) goto L74;
        r29 = r29.concat(",");
    L74:
        r3 = r29.concat(" ");
    L75:
        if (r110 == false) goto L77;
        r3 = r3 + r28 + " nanoseconds ";
    L77:
        r2 = r3.concat("delay)");
        goto L79
    L66:
        if (r28 > 1000) goto L69;
        r110 = false;
    L79:
        if (isDone() == false) goto L83;
        throw new TimeoutException(r2.concat(" but future completed as timeout expired"));
    L83:
        throw new TimeoutException(b11.o(r2, " for ", r20));
    L33:
        return g(r6);
    L29:
        r14 = false;
        goto L31
    L37:
        k(r9);
        throw new InterruptedException();
    L43:
        Object r0 = this.n;
        Objects.requireNonNull(r0);
        return g(r0);
    L45:
        r17 = true;
        r19 = 0;
        goto L47
    L15:
        r12 = 0;
        goto L17
    L11:
        return g(r7);
    L7:
        r10 = false;
        goto L9
    L85:
        throw new InterruptedException();
    }

    public void i() {
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.n instanceof f0;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object r2 = this.n;
        if (r2 == null) goto L5;
        boolean r1 = true;
    L7:
        return (!(r2 instanceof k0)) & r1;
    L5:
        r1 = false;
        goto L7
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String j() {
        if ((this instanceof ScheduledFuture) == true) goto L5;
        return null;
    L5:
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void k(t0 r5) {
        r5.a = null;
    L3:
        t0 r6 = this.p;
        if (r6 == t0.c) goto L19;
        t0 r1 = null;
    L7:
        if (r6 == null) goto L28;
        t0 r2 = r6.b;
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
        if (s.i(this, r6, r2) == true) goto L18;
    L28:
        return;
    }

    public boolean l(Object r3) {
        if (r3 != null) goto L5;
        r3 = t;
    L5:
        if (s.h(this, null, r3) == false) goto L8;
        d(this, false);
        return true;
    L8:
        return false;
    }

    public boolean m(Throwable r3) {
        r3.getClass();
        h0 r0 = new h0(r3);
        if (s.h(this, null, r0) == false) goto L6;
        d(this, false);
        return true;
    L6:
        return false;
    }

    public boolean n(ic2 r6) {
        r6.getClass();
        Object r0 = this.n;
        if (r0 != null) goto L22;
        if (r6.isDone() == false) goto L10;
        Object r7 = h(r6);
        if (s.h(this, null, r7) == false) goto L24;
        d(this, false);
        return true;
    L24:
        return false;
    L10:
        k0 r1 = new k0(this, r6);
        if (s.h(this, null, r1) == true) goto L25;
        r0 = this.n;
        goto L22
    L25:
        r6.f(r1, gq0.n);     // Catch: Throwable -> L14
        return true;
    L14:
        th = move-exception;
        h0 r2 = new h0(th);     // Catch: Throwable -> L17
    L18:
        s.h(this, r1, r2);
        return true;
    L17:
        r2 = h0.b;
    L22:
        if ((r0 instanceof f0) == false) goto L24;
        r6.cancel(((f0) r0).a);
        goto L24
    }

    public final Throwable o() {
        if ((this instanceof m0) == false) goto L8;
        Object r1 = this.n;
        if ((r1 instanceof h0) == true) goto L7;
        return null;
    L7:
        return ((h0) r1).a;
    L8:
        return null;
    }

    public final boolean p() {
        Object r1 = this.n;
        if ((r1 instanceof f0) == true) goto L5;
        return false;
    L5:
        if (((f0) r1).a == false) goto L10;
        return true;
    L10:
        return false;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.") == false) goto L5;
        r0.append(getClass().getSimpleName());
    L6:
        r0.append('@');
        r0.append(Integer.toHexString(System.identityHashCode(this)));
        r0.append("[status=");
        if (isCancelled() == false) goto L10;
        r0.append("CANCELLED");
    L41:
        r0.append("]");
        return r0.toString();
    L10:
        if (isDone() == false) goto L12;
        a(r0);
        goto L41
    L12:
        int r1 = r0.length();
        r0.append("PENDING");
        Object r3 = this.n;
        if ((r3 instanceof k0) == false) goto L43;
        r0.append(", setFuture=[");
        ic2 r4 = ((k0) r3).o;
        if (r4 != this) goto L21;
        r0.append("this future");     // Catch: StackOverflowError -> L17 Exception -> L19
    L45:
    L24:
        r0.append("]");
    L39:
        if (isDone() == false) goto L41;
        r0.delete(r1, r0.length());
        a(r0);
        goto L41
    L21:
        r0.append(r4);     // Catch: StackOverflowError -> L17 Exception -> L19
    L19:
        e = e;
    L23:
        r0.append("Exception thrown from implementation: ");
        r0.append(e.getClass());
    L17:
        e = e;
        goto L23
    L43:
        String r5 = j();     // Catch: Throwable -> L30 Exception -> L32
        if (r5 == null) goto L34;
        if (r5.isEmpty() == true) goto L34;
    L36:
        if (r5 == null) goto L39;
        r0.append(", info=[");
        r0.append(r5);
        r0.append("]");
    L34:
        r5 = null;
    L30:
        e = move-exception;
        r5 = "Exception thrown from implementation: " + e.getClass();
        goto L36
    L5:
        r0.append(getClass().getName());
        goto L6
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        t0 r0 = t0.c;
        if (Thread.interrupted() == true) goto L34;
        Object r1 = this.n;
        if (r1 == null) goto L7;
        boolean r4 = true;
    L9:
        if ((r4 & (!(r1 instanceof k0))) == true) goto L11;
        t0 r2 = this.p;
        if (r2 == r0) goto L31;
        t0 r5 = new t0();
    L15:
        g12 r6 = s;
        r6.K(r5, r2);
        if (r6.i(this, r2, r5) == true) goto L17;
        r2 = this.p;
        if (r2 != r0) goto L15;
    L17:
        LockSupport.park(this);
        if (Thread.interrupted() == true) goto L27;
        Object r3 = this.n;
        if (r3 == null) goto L22;
        boolean r7 = true;
    L24:
        if ((r7 & (!(r3 instanceof k0))) == false) goto L17;
        return g(r3);
    L22:
        r7 = false;
        goto L24
    L27:
        k(r5);
        throw new InterruptedException();
    L31:
        Object r8 = this.n;
        Objects.requireNonNull(r8);
        return g(r8);
    L11:
        return g(r1);
    L7:
        r4 = false;
        goto L9
    L34:
        throw new InterruptedException();
    }
}
