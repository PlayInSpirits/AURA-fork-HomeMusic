package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class te0 extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater v = AtomicIntegerFieldUpdater.newUpdater(te0.class, "workerCtl$volatile");
    private volatile int indexInArray;
    public final ad5 n;
    private volatile Object nextParkedWorker;
    public final jx3 o;
    public ue0 p;
    public long q;
    public long r;
    public int s;
    public boolean t;
    public final /* synthetic */ ve0 u;
    private volatile /* synthetic */ int workerCtl$volatile;

    public te0(ve0 ve0Var, int i) {
        this.u = ve0Var;
        setDaemon(true);
        setContextClassLoader(ve0.class.getClassLoader());
        this.n = new ad5();
        this.o = new jx3();
        this.p = ue0.q;
        this.nextParkedWorker = ve0.x;
        int iNanoTime = (int) System.nanoTime();
        this.s = iNanoTime == 0 ? 42 : iNanoTime;
        f(i);
    }

    public final br4 a(boolean z) {
        br4 br4VarE;
        br4 br4VarE2;
        long j;
        ue0 ue0Var = this.p;
        ve0 ve0Var = this.u;
        ad5 ad5Var = this.n;
        ue0 ue0Var2 = ue0.n;
        if (ue0Var != ue0Var2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = ve0.v;
            do {
                j = atomicLongFieldUpdater.get(ve0Var);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    br4 br4VarG = ad5Var.g();
                    return (br4VarG == null && (br4VarG = (br4) ve0Var.s.d()) == null) ? i(1) : br4VarG;
                }
            } while (!ve0.v.compareAndSet(ve0Var, j, j - 4398046511104L));
            this.p = ue0Var2;
        }
        if (z) {
            boolean z2 = d(ve0Var.n * 2) == 0;
            if (z2 && (br4VarE2 = e()) != null) {
                return br4VarE2;
            }
            br4 br4VarE3 = ad5Var.e();
            if (br4VarE3 != null) {
                return br4VarE3;
            }
            if (!z2 && (br4VarE = e()) != null) {
                return br4VarE;
            }
        } else {
            br4 br4VarE4 = e();
            if (br4VarE4 != null) {
                return br4VarE4;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i) {
        int i2 = this.s;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.s = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i6 & i5 : (Integer.MAX_VALUE & i5) % i;
    }

    public final br4 e() {
        int iD = d(2);
        ve0 ve0Var = this.u;
        wi1 wi1Var = ve0Var.s;
        wi1 wi1Var2 = ve0Var.r;
        if (iD == 0) {
            br4 br4Var = (br4) wi1Var2.d();
            return br4Var != null ? br4Var : (br4) wi1Var.d();
        }
        br4 br4Var2 = (br4) wi1Var.d();
        return br4Var2 != null ? br4Var2 : (br4) wi1Var2.d();
    }

    public final void f(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.u.q);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(ue0 ue0Var) {
        ue0 ue0Var2 = this.p;
        boolean z = ue0Var2 == ue0.n;
        if (z) {
            ve0.v.addAndGet(this.u, 4398046511104L);
        }
        if (ue0Var2 != ue0Var) {
            this.p = ue0Var;
        }
        return z;
    }

    public final br4 i(int i) {
        br4 br4VarH;
        long jI;
        AtomicLongFieldUpdater atomicLongFieldUpdater = ve0.v;
        ve0 ve0Var = this.u;
        int i2 = (int) (atomicLongFieldUpdater.get(ve0Var) & 2097151);
        if (i2 < 2) {
            return null;
        }
        int iD = d(i2);
        long jMin = Long.MAX_VALUE;
        for (int i3 = 0; i3 < i2; i3++) {
            iD++;
            if (iD > i2) {
                iD = 1;
            }
            te0 te0Var = (te0) ve0Var.t.b(iD);
            if (te0Var != null && te0Var != this) {
                ad5 ad5Var = te0Var.n;
                if (i != 3) {
                    ad5Var.getClass();
                    int i4 = ad5.d.get(ad5Var);
                    int i5 = ad5.c.get(ad5Var);
                    boolean z = i == 1;
                    while (true) {
                        if (i4 == i5 || (z && ad5.e.get(ad5Var) == 0)) {
                            br4VarH = null;
                            break;
                        }
                        int i6 = i4 + 1;
                        br4VarH = ad5Var.h(i4, z);
                        if (br4VarH != null) {
                            break;
                        }
                        i4 = i6;
                    }
                } else {
                    br4VarH = ad5Var.f();
                }
                jx3 jx3Var = this.o;
                if (br4VarH != null) {
                    jx3Var.n = br4VarH;
                    jI = -1;
                } else {
                    jI = ad5Var.i(i, jx3Var);
                }
                if (jI == -1) {
                    br4 br4Var = (br4) jx3Var.n;
                    jx3Var.n = null;
                    return br4Var;
                }
                if (jI > 0) {
                    jMin = Math.min(jMin, jI);
                }
            }
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = 0;
        }
        this.r = jMin;
        return null;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        long j;
        loop0: while (true) {
            boolean z = false;
            while (true) {
                if (ve0.w.get(this.u) == 0) {
                    ue0 ue0Var = this.p;
                    ue0 ue0Var2 = ue0.r;
                    if (ue0Var == ue0Var2) {
                        break loop0;
                    }
                    br4 br4VarA = a(this.t);
                    if (br4VarA != null) {
                        this.r = 0L;
                        ve0 ve0Var = this.u;
                        this.q = 0L;
                        if (this.p == ue0.p) {
                            this.p = ue0.o;
                        }
                        if (!br4VarA.o) {
                            try {
                                br4VarA.run();
                                break;
                            } catch (Throwable th) {
                                Thread threadCurrentThread = Thread.currentThread();
                                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                                break;
                            }
                        }
                        if (h(ue0.o) && !ve0Var.s() && !ve0Var.q(ve0.v.get(ve0Var))) {
                            ve0Var.s();
                        }
                        try {
                            br4VarA.run();
                        } catch (Throwable th2) {
                            Thread threadCurrentThread2 = Thread.currentThread();
                            threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
                        }
                        ve0.v.addAndGet(ve0Var, -2097152L);
                        if (this.p == ue0Var2) {
                            break;
                        }
                        this.p = ue0.q;
                        break;
                    }
                    this.t = false;
                    if (this.r == 0) {
                        Object obj = this.nextParkedWorker;
                        f01 f01Var = ve0.x;
                        if (obj != f01Var) {
                            v.set(this, -1);
                            while (this.nextParkedWorker != ve0.x) {
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = v;
                                if (atomicIntegerFieldUpdater.get(this) != -1) {
                                    break;
                                }
                                ve0 ve0Var2 = this.u;
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = ve0.w;
                                if (atomicIntegerFieldUpdater2.get(ve0Var2) != 0) {
                                    break;
                                }
                                ue0 ue0Var3 = this.p;
                                ue0 ue0Var4 = ue0.r;
                                if (ue0Var3 == ue0Var4) {
                                    break;
                                }
                                h(ue0.p);
                                Thread.interrupted();
                                if (this.q == 0) {
                                    j = 2097151;
                                    this.q = System.nanoTime() + this.u.p;
                                } else {
                                    j = 2097151;
                                }
                                LockSupport.parkNanos(this.u.p);
                                if (System.nanoTime() - this.q >= 0) {
                                    this.q = 0L;
                                    ve0 ve0Var3 = this.u;
                                    synchronized (ve0Var3.t) {
                                        try {
                                            if (!(atomicIntegerFieldUpdater2.get(ve0Var3) != 0)) {
                                                AtomicLongFieldUpdater atomicLongFieldUpdater = ve0.v;
                                                if (((int) (atomicLongFieldUpdater.get(ve0Var3) & j)) > ve0Var3.n) {
                                                    if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                        int i = this.indexInArray;
                                                        f(0);
                                                        ve0Var3.n(this, i, 0);
                                                        int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(ve0Var3) & j);
                                                        if (andDecrement != i) {
                                                            Object objB = ve0Var3.t.b(andDecrement);
                                                            objB.getClass();
                                                            te0 te0Var = (te0) objB;
                                                            ve0Var3.t.c(i, te0Var);
                                                            te0Var.f(i);
                                                            ve0Var3.n(te0Var, andDecrement, i);
                                                        }
                                                        ve0Var3.t.c(andDecrement, null);
                                                        this.p = ue0Var4;
                                                    }
                                                }
                                            }
                                        } catch (Throwable th3) {
                                            throw th3;
                                        }
                                    }
                                }
                            }
                        } else {
                            ve0 ve0Var4 = this.u;
                            if (this.nextParkedWorker == f01Var) {
                                AtomicLongFieldUpdater atomicLongFieldUpdater2 = ve0.u;
                                while (true) {
                                    long j2 = atomicLongFieldUpdater2.get(ve0Var4);
                                    int i2 = this.indexInArray;
                                    this.nextParkedWorker = ve0Var4.t.b((int) (j2 & 2097151));
                                    ve0 ve0Var5 = ve0Var4;
                                    if (ve0.u.compareAndSet(ve0Var5, j2, ((j2 + 2097152) & (-2097152)) | ((long) i2))) {
                                        break;
                                    } else {
                                        ve0Var4 = ve0Var5;
                                    }
                                }
                            }
                        }
                    } else {
                        if (z) {
                            h(ue0.p);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.r);
                            this.r = 0L;
                            break;
                        }
                        z = true;
                    }
                } else {
                    break loop0;
                }
            }
        }
        h(ue0.r);
    }
}
