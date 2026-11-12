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
    public static final boolean q = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger r = Logger.getLogger(g2.class.getName());
    public static final ji2 s;
    public static final Object t;
    public volatile Object n;
    public volatile c2 o;
    public volatile f2 p;

    static {
        ji2 e2Var;
        try {
            e2Var = new d2(AtomicReferenceFieldUpdater.newUpdater(f2.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(f2.class, f2.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g2.class, f2.class, "p"), AtomicReferenceFieldUpdater.newUpdater(g2.class, c2.class, "o"), AtomicReferenceFieldUpdater.newUpdater(g2.class, Object.class, "n"));
            th = null;
        } catch (Throwable th) {
            th = th;
            e2Var = new e2();
        }
        s = e2Var;
        if (th != null) {
            r.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        t = new Object();
    }

    public static void b(g2 g2Var) {
        f2 f2Var;
        c2 c2Var;
        c2 c2Var2;
        c2 c2Var3;
        do {
            f2Var = g2Var.p;
        } while (!s.f(g2Var, f2Var, f2.c));
        while (true) {
            c2Var = null;
            if (f2Var == null) {
                break;
            }
            Thread thread = f2Var.a;
            if (thread != null) {
                f2Var.a = null;
                LockSupport.unpark(thread);
            }
            f2Var = f2Var.b;
        }
        do {
            c2Var2 = g2Var.o;
        } while (!s.d(g2Var, c2Var2, c2.d));
        while (true) {
            c2Var3 = c2Var;
            c2Var = c2Var2;
            if (c2Var == null) {
                break;
            }
            c2Var2 = c2Var.c;
            c2Var.c = c2Var3;
        }
        while (c2Var3 != null) {
            c2 c2Var4 = c2Var3.c;
            c(c2Var3.a, c2Var3.b);
            c2Var3 = c2Var4;
        }
    }

    public static void c(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            r.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    public static Object d(Object obj) throws ExecutionException {
        if (obj instanceof a2) {
            Throwable th = ((a2) obj).a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof b2) {
            throw new ExecutionException(((b2) obj).a);
        }
        if (obj == t) {
            return null;
        }
        return obj;
    }

    public static Object e(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void a(StringBuilder sb) {
        try {
            Object objE = e(this);
            sb.append("SUCCESS, result=[");
            sb.append(objE == this ? "this future" : String.valueOf(objE));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        a2 a2Var;
        Object obj = this.n;
        if (obj != null) {
            return false;
        }
        if (q) {
            a2Var = new a2(new CancellationException("Future.cancel() was called."), z);
        } else {
            a2Var = z ? a2.b : a2.c;
        }
        if (!s.e(this, obj, a2Var)) {
            return false;
        }
        b(this);
        return true;
    }

    @Override // defpackage.ic2
    public final void f(Runnable runnable, Executor executor) {
        executor.getClass();
        c2 c2Var = this.o;
        c2 c2Var2 = c2.d;
        if (c2Var != c2Var2) {
            c2 c2Var3 = new c2(runnable, executor);
            do {
                c2Var3.c = c2Var;
                if (s.d(this, c2Var, c2Var3)) {
                    return;
                } else {
                    c2Var = this.o;
                }
            } while (c2Var != c2Var2);
        }
        c(runnable, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String g() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        f2 f2Var = f2.c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.n;
        if (obj != null) {
            return d(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            f2 f2Var2 = this.p;
            if (f2Var2 != f2Var) {
                f2 f2Var3 = new f2();
                while (true) {
                    ji2 ji2Var = s;
                    ji2Var.B(f2Var3, f2Var2);
                    if (ji2Var.f(this, f2Var2, f2Var3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                h(f2Var3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.n;
                            if (obj2 != null) {
                                return d(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        h(f2Var3);
                        break;
                    }
                    f2Var2 = this.p;
                    if (f2Var2 == f2Var) {
                    }
                }
            }
            return d(this.n);
        }
        while (nanos > 0) {
            Object obj3 = this.n;
            if (obj3 != null) {
                return d(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String strConcat = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String strConcat2 = strConcat.concat(" (plus ");
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strConcat3 = strConcat2 + jConvert + " " + lowerCase;
                if (z) {
                    strConcat3 = strConcat3.concat(",");
                }
                strConcat2 = strConcat3.concat(" ");
            }
            if (z) {
                strConcat2 = strConcat2 + nanos2 + " nanoseconds ";
            }
            strConcat = strConcat2.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(strConcat.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(b11.o(strConcat, " for ", string));
    }

    public final void h(f2 f2Var) {
        f2Var.a = null;
        while (true) {
            f2 f2Var2 = this.p;
            if (f2Var2 == f2.c) {
                return;
            }
            f2 f2Var3 = null;
            while (f2Var2 != null) {
                f2 f2Var4 = f2Var2.b;
                if (f2Var2.a != null) {
                    f2Var3 = f2Var2;
                } else if (f2Var3 != null) {
                    f2Var3.b = f2Var4;
                    if (f2Var3.a == null) {
                    }
                } else if (!s.f(this, f2Var2, f2Var4)) {
                }
                f2Var2 = f2Var4;
            }
            return;
        }
    }

    public boolean i(Throwable th) {
        if (!s.e(this, null, new b2(th))) {
            return false;
        }
        b(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.n instanceof a2;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.n != null;
    }

    public final String toString() {
        String strG;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.n instanceof a2) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                strG = g();
            } catch (RuntimeException e) {
                strG = "Exception thrown from implementation: " + e.getClass();
            }
            if (strG != null && !strG.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strG);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        f2 f2Var = f2.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.n;
            if (obj2 != null) {
                return d(obj2);
            }
            f2 f2Var2 = this.p;
            if (f2Var2 != f2Var) {
                f2 f2Var3 = new f2();
                do {
                    ji2 ji2Var = s;
                    ji2Var.B(f2Var3, f2Var2);
                    if (ji2Var.f(this, f2Var2, f2Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.n;
                            } else {
                                h(f2Var3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return d(obj);
                    }
                    f2Var2 = this.p;
                } while (f2Var2 != f2Var);
            }
            return d(this.n);
        }
        throw new InterruptedException();
    }
}
