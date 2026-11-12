package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ve0 implements Executor, Closeable {
    public static final /* synthetic */ AtomicLongFieldUpdater u = AtomicLongFieldUpdater.newUpdater(ve0.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater v = AtomicLongFieldUpdater.newUpdater(ve0.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater w = AtomicIntegerFieldUpdater.newUpdater(ve0.class, "_isTerminated$volatile");
    public static final f01 x = new f01(1, "NOT_IN_STACK");
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    public final int n;
    public final int o;
    public final long p;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;
    public final String q;
    public final wi1 r;
    public final wi1 s;
    public final m04 t;

    public ve0(int i, int i2, long j, String str) {
        this.n = i;
        this.o = i2;
        this.p = j;
        this.q = str;
        if (i < 1) {
            kf2.e(b11.j(i, "Core pool size ", " should be at least 1"));
            throw null;
        }
        if (i2 < i) {
            kf2.e(xa3.e(i2, i, "Max pool size ", " should be greater than or equals to core pool size "));
            throw null;
        }
        if (i2 > 2097150) {
            kf2.e(b11.j(i2, "Max pool size ", " should not exceed maximal supported number of threads 2097150"));
            throw null;
        }
        if (j <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.r = new wi1();
        this.s = new wi1();
        this.t = new m04((i + 1) * 2);
        this.controlState$volatile = ((long) i) << 42;
        this._isTerminated$volatile = 0;
    }

    public static /* synthetic */ void j(ve0 ve0Var, Runnable runnable, int i) {
        ve0Var.f(runnable, false, (i & 4) == 0);
    }

    public final int b() {
        synchronized (this.t) {
            try {
                if (w.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = v;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.n) {
                    return 0;
                }
                if (i >= this.o) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.t.b(i3) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                te0 te0Var = new te0(this, i3);
                this.t.c(i3, te0Var);
                if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i4 = i2 + 1;
                te0Var.start();
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x006e  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws InterruptedException {
        int i;
        br4 br4VarA;
        if (w.compareAndSet(this, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            te0 te0Var = null;
            te0 te0Var2 = threadCurrentThread instanceof te0 ? (te0) threadCurrentThread : null;
            if (te0Var2 != null && te0Var2.u == this) {
                te0Var = te0Var2;
            }
            synchronized (this.t) {
                i = (int) (v.get(this) & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    Object objB = this.t.b(i2);
                    objB.getClass();
                    te0 te0Var3 = (te0) objB;
                    if (te0Var3 != te0Var) {
                        while (te0Var3.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(te0Var3);
                            te0Var3.join(10000L);
                        }
                        te0Var3.n.d(this.s);
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.s.b();
            this.r.b();
            while (true) {
                if (te0Var != null) {
                    br4VarA = te0Var.a(true);
                    if (br4VarA == null) {
                        br4VarA = (br4) this.r.d();
                        if (br4VarA == null) {
                            break;
                            break;
                        }
                    }
                } else {
                    br4VarA = (br4) this.r.d();
                    if (br4VarA == null && (br4VarA = (br4) this.s.d()) == null) {
                        break;
                    }
                }
                try {
                    br4VarA.run();
                } catch (Throwable th) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
                }
            }
            if (te0Var != null) {
                te0Var.h(ue0.r);
            }
            u.set(this, 0L);
            v.set(this, 0L);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        j(this, runnable, 6);
    }

    public final void f(Runnable runnable, boolean z, boolean z2) {
        br4 er4Var;
        ue0 ue0Var;
        ir4.f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof br4) {
            er4Var = (br4) runnable;
            er4Var.n = jNanoTime;
            er4Var.o = z;
        } else {
            er4Var = new er4(runnable, jNanoTime, z);
        }
        boolean z3 = er4Var.o;
        AtomicLongFieldUpdater atomicLongFieldUpdater = v;
        long jAddAndGet = z3 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        te0 te0Var = null;
        te0 te0Var2 = threadCurrentThread instanceof te0 ? (te0) threadCurrentThread : null;
        if (te0Var2 != null && te0Var2.u == this) {
            te0Var = te0Var2;
        }
        if (te0Var != null && (ue0Var = te0Var.p) != ue0.r && (er4Var.o || ue0Var != ue0.o)) {
            te0Var.t = true;
            er4Var = te0Var.n.a(er4Var, z2);
        }
        if (er4Var != null) {
            if (!(er4Var.o ? this.s.a(er4Var) : this.r.a(er4Var))) {
                throw new RejectedExecutionException(b11.q(new StringBuilder(), this.q, " was terminated"));
            }
        }
        boolean z4 = z2 && te0Var != null;
        if (z3) {
            if (z4 || s() || q(jAddAndGet)) {
                return;
            }
            s();
            return;
        }
        if (z4 || s() || q(atomicLongFieldUpdater.get(this))) {
            return;
        }
        s();
    }

    public final void n(te0 te0Var, int i, int i2) {
        while (true) {
            long j = u.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object objC = te0Var.c();
                    while (true) {
                        if (objC == x) {
                            i3 = -1;
                            break;
                        }
                        if (objC == null) {
                            i3 = 0;
                            break;
                        }
                        te0 te0Var2 = (te0) objC;
                        int iB = te0Var2.b();
                        if (iB != 0) {
                            i3 = iB;
                            break;
                        }
                        objC = te0Var2.c();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                ve0 ve0Var = this;
                if (u.compareAndSet(ve0Var, j, ((long) i3) | j2)) {
                    return;
                } else {
                    this = ve0Var;
                }
            }
        }
    }

    public final boolean q(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.n;
        if (i < i2) {
            int iB = b();
            if (iB == 1 && i2 > 1) {
                b();
            }
            if (iB > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean s() {
        ve0 ve0Var;
        f01 f01Var;
        int iB;
        while (true) {
            long j = u.get(this);
            te0 te0Var = (te0) this.t.b((int) (2097151 & j));
            if (te0Var == null) {
                te0Var = null;
                ve0Var = this;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object objC = te0Var.c();
                while (true) {
                    f01Var = x;
                    if (objC == f01Var) {
                        iB = -1;
                        break;
                    }
                    if (objC == null) {
                        iB = 0;
                        break;
                    }
                    te0 te0Var2 = (te0) objC;
                    iB = te0Var2.b();
                    if (iB != 0) {
                        break;
                    }
                    objC = te0Var2.c();
                    j = j;
                }
                if (iB >= 0) {
                    ve0 ve0Var2 = this;
                    boolean zCompareAndSet = u.compareAndSet(ve0Var2, j, ((long) iB) | j2);
                    ve0Var = ve0Var2;
                    if (zCompareAndSet) {
                        te0Var.g(f01Var);
                    }
                    this = ve0Var;
                } else {
                    continue;
                }
            }
            if (te0Var == null) {
                return false;
            }
            if (te0.v.compareAndSet(te0Var, -1, 0)) {
                LockSupport.unpark(te0Var);
                return true;
            }
            this = ve0Var;
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        m04 m04Var = this.t;
        int iA = m04Var.a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < iA; i6++) {
            te0 te0Var = (te0) m04Var.b(i6);
            if (te0Var != null) {
                int iC = te0Var.n.c();
                int iOrdinal = te0Var.p.ordinal();
                if (iOrdinal == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(iC);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iOrdinal == 1) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(iC);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iOrdinal == 2) {
                    i3++;
                } else if (iOrdinal == 3) {
                    i4++;
                    if (iC > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(iC);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (iOrdinal != 4) {
                        er1.n();
                        return null;
                    }
                    i5++;
                }
            }
        }
        long j = v.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.q);
        sb4.append('@');
        sb4.append(si0.x(this));
        sb4.append("[Pool Size {core = ");
        int i7 = this.n;
        sb4.append(i7);
        sb4.append(", max = ");
        sb4.append(this.o);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i);
        sb4.append(", blocking = ");
        sb4.append(i2);
        sb4.append(", parked = ");
        sb4.append(i3);
        sb4.append(", dormant = ");
        sb4.append(i4);
        sb4.append(", terminated = ");
        sb4.append(i5);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.r.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.s.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i7 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
