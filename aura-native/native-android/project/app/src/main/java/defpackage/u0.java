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
    public static final boolean q;
    public static final y82 r;
    public static final g12 s;
    public static final Object t;
    public volatile Object n;
    public volatile i0 o;
    public volatile t0 p;

    static {
        boolean z;
        Throwable th;
        g12 l0Var;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        q = z;
        r = new y82(u0.class);
        Throwable th2 = null;
        try {
            l0Var = new s0();
            th = null;
        } catch (Error | Exception e) {
            th = e;
            try {
                l0Var = new j0(AtomicReferenceFieldUpdater.newUpdater(t0.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(t0.class, t0.class, "b"), AtomicReferenceFieldUpdater.newUpdater(u0.class, t0.class, "p"), AtomicReferenceFieldUpdater.newUpdater(u0.class, i0.class, "o"), AtomicReferenceFieldUpdater.newUpdater(u0.class, Object.class, "n"));
            } catch (Error | Exception e2) {
                th2 = e2;
                l0Var = new l0();
            }
        }
        s = l0Var;
        if (th2 != null) {
            y82 y82Var = r;
            Logger loggerA = y82Var.a();
            Level level = Level.SEVERE;
            loggerA.log(level, "UnsafeAtomicHelper is broken!", th);
            y82Var.a().log(level, "SafeAtomicHelper is broken!", th2);
        }
        t = new Object();
    }

    public static void d(u0 u0Var, boolean z) {
        i0 i0Var = null;
        while (true) {
            for (t0 t0VarQ = s.q(u0Var); t0VarQ != null; t0VarQ = t0VarQ.b) {
                Thread thread = t0VarQ.a;
                if (thread != null) {
                    t0VarQ.a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z) {
                u0Var.i();
                z = false;
            }
            u0Var.b();
            i0 i0Var2 = i0Var;
            i0 i0VarP = s.p(u0Var);
            i0 i0Var3 = i0Var2;
            while (i0VarP != null) {
                i0 i0Var4 = i0VarP.c;
                i0VarP.c = i0Var3;
                i0Var3 = i0VarP;
                i0VarP = i0Var4;
            }
            while (i0Var3 != null) {
                i0Var = i0Var3.c;
                Runnable runnable = i0Var3.a;
                Objects.requireNonNull(runnable);
                if (runnable instanceof k0) {
                    k0 k0Var = (k0) runnable;
                    u0Var = k0Var.n;
                    if (u0Var.n == k0Var) {
                        if (s.h(u0Var, k0Var, h(k0Var.o))) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = i0Var3.b;
                    Objects.requireNonNull(executor);
                    e(runnable, executor);
                }
                i0Var3 = i0Var;
            }
            return;
        }
    }

    public static void e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            r.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    public static Object g(Object obj) throws ExecutionException {
        if (obj instanceof f0) {
            Throwable th = ((f0) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof h0) {
            throw new ExecutionException(((h0) obj).a);
        }
        if (obj == t) {
            return null;
        }
        return obj;
    }

    public static Object h(ic2 ic2Var) {
        Object obj;
        Throwable thO;
        if (ic2Var instanceof m0) {
            Object f0Var = ((u0) ic2Var).n;
            if (f0Var instanceof f0) {
                f0 f0Var2 = (f0) f0Var;
                if (f0Var2.a) {
                    f0Var = f0Var2.b != null ? new f0(f0Var2.b, false) : f0.d;
                }
            }
            Objects.requireNonNull(f0Var);
            return f0Var;
        }
        if ((ic2Var instanceof u0) && (thO = ((u0) ic2Var).o()) != null) {
            return new h0(thO);
        }
        boolean zIsCancelled = ic2Var.isCancelled();
        boolean z = true;
        if ((!q) && zIsCancelled) {
            f0 f0Var3 = f0.d;
            Objects.requireNonNull(f0Var3);
            return f0Var3;
        }
        boolean z2 = false;
        while (true) {
            try {
                try {
                    try {
                        obj = ic2Var.get();
                        break;
                    } catch (Error e) {
                        e = e;
                        return new h0(e);
                    }
                } catch (InterruptedException unused) {
                    z2 = z;
                } catch (Throwable th) {
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (Error | Exception e2) {
                e = e2;
                return new h0(e);
            } catch (CancellationException e3) {
                if (zIsCancelled) {
                    return new f0(e3, false);
                }
                return new h0(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + ic2Var, e3));
            } catch (ExecutionException e4) {
                if (!zIsCancelled) {
                    return new h0(e4.getCause());
                }
                return new f0(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + ic2Var, e4), false);
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        if (!zIsCancelled) {
            return obj == null ? t : obj;
        }
        return new f0(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + ic2Var), false);
    }

    public final void a(StringBuilder sb) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (ExecutionException e) {
                sb.append("FAILURE, cause=[");
                sb.append(e.getCause());
                sb.append("]");
                return;
            } catch (Exception e2) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e2.getClass());
                sb.append(" thrown from get()]");
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        c(obj, sb);
        sb.append("]");
    }

    public void b() {
    }

    public final void c(Object obj, StringBuilder sb) {
        if (obj == null) {
            sb.append("null");
        } else {
            if (obj == this) {
                sb.append("this future");
                return;
            }
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        f0 f0Var;
        Object obj = this.n;
        if (!(obj == null) && !(obj instanceof k0)) {
            return false;
        }
        if (q) {
            f0Var = new f0(new CancellationException("Future.cancel() was called."), z);
        } else {
            f0Var = z ? f0.c : f0.d;
            Objects.requireNonNull(f0Var);
        }
        boolean z2 = false;
        while (true) {
            if (s.h(this, obj, f0Var)) {
                d(this, z);
                if (obj instanceof k0) {
                    ic2 ic2Var = ((k0) obj).o;
                    if (ic2Var instanceof m0) {
                        this = (u0) ic2Var;
                        obj = this.n;
                        if ((obj == null) | (obj instanceof k0)) {
                            z2 = true;
                        }
                    } else {
                        ic2Var.cancel(z);
                    }
                }
                return true;
            }
            obj = this.n;
            if (!(obj instanceof k0)) {
                return z2;
            }
        }
    }

    @Override // defpackage.ic2
    public void f(Runnable runnable, Executor executor) {
        i0 i0Var;
        i0 i0Var2 = i0.d;
        rr2.s(executor, "Executor was null.");
        if (!isDone() && (i0Var = this.o) != i0Var2) {
            i0 i0Var3 = new i0(runnable, executor);
            do {
                i0Var3.c = i0Var;
                if (s.g(this, i0Var, i0Var3)) {
                    return;
                } else {
                    i0Var = this.o;
                }
            } while (i0Var != i0Var2);
        }
        e(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        boolean z;
        long j2;
        t0 t0Var = t0.c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.n;
        if ((obj != null) && (!(obj instanceof k0))) {
            return g(obj);
        }
        long j3 = 0;
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            t0 t0Var2 = this.p;
            if (t0Var2 != t0Var) {
                t0 t0Var3 = new t0();
                z = true;
                while (true) {
                    g12 g12Var = s;
                    g12Var.K(t0Var3, t0Var2);
                    if (g12Var.i(this, t0Var2, t0Var3)) {
                        j2 = j3;
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                k(t0Var3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.n;
                            if ((obj2 != null) && (!(obj2 instanceof k0))) {
                                return g(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        k(t0Var3);
                        break;
                    }
                    long j4 = j3;
                    t0Var2 = this.p;
                    if (t0Var2 != t0Var) {
                        j3 = j4;
                    }
                }
            }
            Object obj3 = this.n;
            Objects.requireNonNull(obj3);
            return g(obj3);
        }
        z = true;
        j2 = 0;
        while (nanos > j2) {
            Object obj4 = this.n;
            if ((obj4 != null ? z : false) && (!(obj4 instanceof k0))) {
                return g(obj4);
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
        if (nanos + 1000 < j2) {
            String strConcat2 = strConcat.concat(" (plus ");
            long j5 = -nanos;
            long jConvert = timeUnit.convert(j5, TimeUnit.NANOSECONDS);
            long nanos2 = j5 - timeUnit.toNanos(jConvert);
            boolean z2 = (jConvert == j2 || nanos2 > 1000) ? z : false;
            if (jConvert > j2) {
                String strConcat3 = strConcat2 + jConvert + " " + lowerCase;
                if (z2) {
                    strConcat3 = strConcat3.concat(",");
                }
                strConcat2 = strConcat3.concat(" ");
            }
            if (z2) {
                strConcat2 = strConcat2 + nanos2 + " nanoseconds ";
            }
            strConcat = strConcat2.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(strConcat.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(b11.o(strConcat, " for ", string));
    }

    public void i() {
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.n instanceof f0;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.n;
        return (!(obj instanceof k0)) & (obj != null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String j() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void k(t0 t0Var) {
        t0Var.a = null;
        while (true) {
            t0 t0Var2 = this.p;
            if (t0Var2 == t0.c) {
                return;
            }
            t0 t0Var3 = null;
            while (t0Var2 != null) {
                t0 t0Var4 = t0Var2.b;
                if (t0Var2.a != null) {
                    t0Var3 = t0Var2;
                } else if (t0Var3 != null) {
                    t0Var3.b = t0Var4;
                    if (t0Var3.a == null) {
                    }
                } else if (!s.i(this, t0Var2, t0Var4)) {
                }
                t0Var2 = t0Var4;
            }
            return;
        }
    }

    public boolean l(Object obj) {
        if (obj == null) {
            obj = t;
        }
        if (!s.h(this, null, obj)) {
            return false;
        }
        d(this, false);
        return true;
    }

    public boolean m(Throwable th) {
        th.getClass();
        if (!s.h(this, null, new h0(th))) {
            return false;
        }
        d(this, false);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    public boolean n(ic2 ic2Var) {
        h0 h0Var;
        ic2Var.getClass();
        Object obj = this.n;
        if (obj != null) {
            if (obj instanceof f0) {
                ic2Var.cancel(((f0) obj).a);
            }
        } else if (ic2Var.isDone()) {
            if (s.h(this, null, h(ic2Var))) {
                d(this, false);
                return true;
            }
        } else {
            k0 k0Var = new k0(this, ic2Var);
            if (s.h(this, null, k0Var)) {
                try {
                    ic2Var.f(k0Var, gq0.n);
                    return true;
                } catch (Throwable th) {
                    try {
                        h0Var = new h0(th);
                    } catch (Error | Exception unused) {
                        h0Var = h0.b;
                    }
                    s.h(this, k0Var, h0Var);
                    return true;
                }
            }
            obj = this.n;
            if (obj instanceof f0) {
                ic2Var.cancel(((f0) obj).a);
            }
        }
        return false;
    }

    public final Throwable o() {
        if (!(this instanceof m0)) {
            return null;
        }
        Object obj = this.n;
        if (obj instanceof h0) {
            return ((h0) obj).a;
        }
        return null;
    }

    public final boolean p() {
        Object obj = this.n;
        return (obj instanceof f0) && ((f0) obj).a;
    }

    public final String toString() {
        String strJ;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.n;
            if (obj instanceof k0) {
                sb.append(", setFuture=[");
                ic2 ic2Var = ((k0) obj).o;
                try {
                    if (ic2Var == this) {
                        sb.append("this future");
                    } else {
                        sb.append(ic2Var);
                    }
                } catch (Exception e) {
                    e = e;
                    sb.append("Exception thrown from implementation: ");
                    sb.append(e.getClass());
                } catch (StackOverflowError e2) {
                    e = e2;
                    sb.append("Exception thrown from implementation: ");
                    sb.append(e.getClass());
                }
                sb.append("]");
            } else {
                try {
                    strJ = j();
                    if (strJ == null || strJ.isEmpty()) {
                        strJ = null;
                    }
                } catch (Exception | StackOverflowError e3) {
                    strJ = "Exception thrown from implementation: " + e3.getClass();
                }
                if (strJ != null) {
                    sb.append(", info=[");
                    sb.append(strJ);
                    sb.append("]");
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                a(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public Object get() throws InterruptedException {
        Object obj;
        t0 t0Var = t0.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.n;
            if ((obj2 != null) & (!(obj2 instanceof k0))) {
                return g(obj2);
            }
            t0 t0Var2 = this.p;
            if (t0Var2 != t0Var) {
                t0 t0Var3 = new t0();
                do {
                    g12 g12Var = s;
                    g12Var.K(t0Var3, t0Var2);
                    if (g12Var.i(this, t0Var2, t0Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.n;
                            } else {
                                k(t0Var3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof k0))));
                        return g(obj);
                    }
                    t0Var2 = this.p;
                } while (t0Var2 != t0Var);
            }
            Object obj3 = this.n;
            Objects.requireNonNull(obj3);
            return g(obj3);
        }
        throw new InterruptedException();
    }
}
