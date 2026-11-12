package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l21 extends g21 implements ao0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater t = AtomicReferenceFieldUpdater.newUpdater(l21.class, Object.class, "_queue$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater u;
    public static final /* synthetic */ AtomicIntegerFieldUpdater v;
    public static final /* synthetic */ long w;
    public static final /* synthetic */ long x;
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    static {
        Unsafe unsafe = dz.a;
        x = unsafe.objectFieldOffset(l21.class.getDeclaredField("_queue$volatile"));
        u = AtomicReferenceFieldUpdater.newUpdater(l21.class, Object.class, "_delayed$volatile");
        w = unsafe.objectFieldOffset(l21.class.getDeclaredField("_delayed$volatile"));
        v = AtomicIntegerFieldUpdater.newUpdater(l21.class, "_isCompleted$volatile");
    }

    @Override // defpackage.ao0
    public as0 F(long j, gu4 gu4Var, ne0 ne0Var) {
        return qk0.a.F(j, gu4Var, ne0Var);
    }

    @Override // defpackage.ao0
    public final void H(long j, cz czVar) {
        long j2 = 0;
        if (j > 0) {
            j2 = j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j;
        }
        if (j2 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            h21 h21Var = new h21(this, j2 + jNanoTime, czVar);
            q0(jNanoTime, h21Var);
            czVar.x(new wy(2, h21Var));
        }
    }

    @Override // defpackage.pe0
    public final void W(ne0 ne0Var, Runnable runnable) {
        h0(runnable);
    }

    @Override // defpackage.g21
    public final long d0() {
        if (e0()) {
            return 0L;
        }
        i0();
        Runnable runnableG0 = g0();
        if (runnableG0 == null) {
            return k0();
        }
        runnableG0.run();
        return 0L;
    }

    public final void f0() {
        l21 l21Var;
        Unsafe unsafe;
        f01 f01Var = hw.c;
        while (true) {
            t.getClass();
            Unsafe unsafe2 = dz.a;
            long j = x;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                while (true) {
                    Unsafe unsafe3 = dz.a;
                    l21Var = this;
                    if (unsafe3.compareAndSwapObject(l21Var, x, (Object) null, f01Var)) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(l21Var, j) != null) {
                        break;
                    } else {
                        this = l21Var;
                    }
                }
            } else {
                l21Var = this;
                if (objectVolatile instanceof ce2) {
                    ((ce2) objectVolatile).c();
                    return;
                }
                if (objectVolatile == f01Var) {
                    return;
                }
                ce2 ce2Var = new ce2(8, true);
                ce2Var.a((Runnable) objectVolatile);
                do {
                    unsafe = dz.a;
                    if (unsafe.compareAndSwapObject(l21Var, x, objectVolatile, ce2Var)) {
                        return;
                    }
                } while (unsafe.getObjectVolatile(l21Var, j) == objectVolatile);
            }
            this = l21Var;
        }
    }

    public final Runnable g0() {
        l21 l21Var;
        Unsafe unsafe;
        while (true) {
            t.getClass();
            Unsafe unsafe2 = dz.a;
            long j = x;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                return null;
            }
            if (objectVolatile instanceof ce2) {
                ce2 ce2Var = (ce2) objectVolatile;
                Object objE = ce2Var.e();
                if (objE == ce2.g) {
                    ce2 ce2VarD = ce2Var.d();
                    while (true) {
                        Unsafe unsafe3 = dz.a;
                        l21Var = this;
                        if (unsafe3.compareAndSwapObject(l21Var, x, objectVolatile, ce2VarD) || unsafe3.getObjectVolatile(l21Var, j) != objectVolatile) {
                            break;
                        }
                        this = l21Var;
                    }
                } else {
                    return (Runnable) objE;
                }
            } else {
                l21Var = this;
                if (objectVolatile == hw.c) {
                    return null;
                }
                do {
                    unsafe = dz.a;
                    if (unsafe.compareAndSwapObject(l21Var, x, objectVolatile, (Object) null)) {
                        return (Runnable) objectVolatile;
                    }
                } while (unsafe.getObjectVolatile(l21Var, j) == objectVolatile);
            }
            this = l21Var;
        }
    }

    public void h0(Runnable runnable) {
        i0();
        if (!j0(runnable)) {
            pk0.y.h0(runnable);
            return;
        }
        Thread threadL0 = l0();
        if (Thread.currentThread() != threadL0) {
            LockSupport.unpark(threadL0);
        }
    }

    public final void i0() {
        j21 j21VarB;
        u.getClass();
        k21 k21Var = (k21) dz.a.getObjectVolatile(this, w);
        if (k21Var == null || lt4.b.get(k21Var) == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (k21Var) {
                try {
                    j21[] j21VarArr = k21Var.a;
                    j21VarB = null;
                    j21 j21Var = j21VarArr != null ? j21VarArr[0] : null;
                    if (j21Var != null) {
                        j21VarB = ((jNanoTime - j21Var.n) > 0L ? 1 : ((jNanoTime - j21Var.n) == 0L ? 0 : -1)) >= 0 ? j0(j21Var) : false ? k21Var.b(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (j21VarB != null);
    }

    public final boolean j0(Runnable runnable) {
        l21 l21Var;
        Runnable runnable2;
        Unsafe unsafe;
        Unsafe unsafe2;
        while (true) {
            t.getClass();
            Unsafe unsafe3 = dz.a;
            long j = x;
            Object objectVolatile = unsafe3.getObjectVolatile(this, j);
            if (v.get(this) != 0) {
                return false;
            }
            if (objectVolatile == null) {
                while (true) {
                    Unsafe unsafe4 = dz.a;
                    l21 l21Var2 = this;
                    runnable2 = runnable;
                    l21Var = l21Var2;
                    if (unsafe4.compareAndSwapObject(l21Var2, x, (Object) null, runnable2)) {
                        return true;
                    }
                    if (unsafe4.getObjectVolatile(l21Var, j) != null) {
                        break;
                    }
                    this = l21Var;
                    runnable = runnable2;
                }
                this = l21Var;
                runnable = runnable2;
            } else {
                l21Var = this;
                runnable2 = runnable;
                if (objectVolatile instanceof ce2) {
                    ce2 ce2Var = (ce2) objectVolatile;
                    int iA = ce2Var.a(runnable2);
                    if (iA == 0) {
                        return true;
                    }
                    if (iA == 1) {
                        ce2 ce2VarD = ce2Var.d();
                        do {
                            unsafe2 = dz.a;
                            if (unsafe2.compareAndSwapObject(l21Var, x, objectVolatile, ce2VarD)) {
                                break;
                            }
                        } while (unsafe2.getObjectVolatile(l21Var, j) == objectVolatile);
                    } else if (iA == 2) {
                        return false;
                    }
                    this = l21Var;
                    runnable = runnable2;
                } else {
                    if (objectVolatile == hw.c) {
                        return false;
                    }
                    ce2 ce2Var2 = new ce2(8, true);
                    ce2Var2.a((Runnable) objectVolatile);
                    ce2Var2.a(runnable2);
                    do {
                        unsafe = dz.a;
                        if (unsafe.compareAndSwapObject(l21Var, x, objectVolatile, ce2Var2)) {
                            return true;
                        }
                    } while (unsafe.getObjectVolatile(l21Var, j) == objectVolatile);
                    this = l21Var;
                    runnable = runnable2;
                }
            }
        }
    }

    public final long k0() {
        j21 j21Var;
        ii iiVar = this.r;
        if (((iiVar == null || iiVar.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
            t.getClass();
            Unsafe unsafe = dz.a;
            Object objectVolatile = unsafe.getObjectVolatile(this, x);
            if (objectVolatile != null) {
                if (objectVolatile instanceof ce2) {
                    long j = ce2.f.get((ce2) objectVolatile);
                    if (((int) (1073741823 & j)) != ((int) ((j & 1152921503533105152L) >> 30))) {
                        return 0L;
                    }
                } else if (objectVolatile == hw.c) {
                    return Long.MAX_VALUE;
                }
            }
            u.getClass();
            k21 k21Var = (k21) unsafe.getObjectVolatile(this, w);
            if (k21Var != null) {
                synchronized (k21Var) {
                    j21[] j21VarArr = k21Var.a;
                    j21Var = j21VarArr != null ? j21VarArr[0] : null;
                }
                if (j21Var != null) {
                    long jNanoTime = j21Var.n - System.nanoTime();
                    if (jNanoTime >= 0) {
                        return jNanoTime;
                    }
                }
            }
            return Long.MAX_VALUE;
        }
        return 0L;
    }

    public abstract Thread l0();

    public final boolean m0() {
        ii iiVar = this.r;
        if (iiVar != null ? iiVar.isEmpty() : true) {
            u.getClass();
            Unsafe unsafe = dz.a;
            k21 k21Var = (k21) unsafe.getObjectVolatile(this, w);
            if (k21Var != null && lt4.b.get(k21Var) != 0) {
                return false;
            }
            t.getClass();
            Object objectVolatile = unsafe.getObjectVolatile(this, x);
            if (objectVolatile != null) {
                if (objectVolatile instanceof ce2) {
                    long j = ce2.f.get((ce2) objectVolatile);
                    return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
                }
                if (objectVolatile == hw.c) {
                }
            }
            return true;
        }
        return false;
    }

    public void n0(long j, j21 j21Var) {
        pk0.y.q0(j, j21Var);
    }

    public final void o0() {
        j21 j21VarB;
        long jNanoTime = System.nanoTime();
        while (true) {
            u.getClass();
            k21 k21Var = (k21) dz.a.getObjectVolatile(this, w);
            if (k21Var == null) {
                return;
            }
            synchronized (k21Var) {
                j21VarB = lt4.b.get(k21Var) > 0 ? k21Var.b(0) : null;
            }
            if (j21VarB == null) {
                return;
            } else {
                n0(jNanoTime, j21VarB);
            }
        }
    }

    public final void p0() {
        t.getClass();
        Unsafe unsafe = dz.a;
        unsafe.putObjectVolatile(this, x, (Object) null);
        u.getClass();
        unsafe.putObjectVolatile(this, w, (Object) null);
    }

    public final void q0(long j, j21 j21Var) {
        Thread threadL0;
        int iR0 = r0(j, j21Var);
        if (iR0 == 0) {
            if (!s0(j21Var) || Thread.currentThread() == (threadL0 = l0())) {
                return;
            }
            LockSupport.unpark(threadL0);
            return;
        }
        if (iR0 == 1) {
            n0(j, j21Var);
        } else {
            if (iR0 == 2) {
                return;
            }
            kf2.o("unexpected result");
        }
    }

    public final int r0(long j, j21 j21Var) {
        l21 l21Var;
        Unsafe unsafe;
        if (v.get(this) != 0) {
            return 1;
        }
        u.getClass();
        Unsafe unsafe2 = dz.a;
        long j2 = w;
        k21 k21Var = (k21) unsafe2.getObjectVolatile(this, j2);
        if (k21Var == null) {
            k21 k21Var2 = new k21();
            k21Var2.c = j;
            while (true) {
                unsafe = dz.a;
                l21Var = this;
                if (unsafe.compareAndSwapObject(l21Var, w, (Object) null, k21Var2) || unsafe.getObjectVolatile(l21Var, j2) != null) {
                    break;
                }
                this = l21Var;
            }
            Object objectVolatile = unsafe.getObjectVolatile(l21Var, j2);
            objectVolatile.getClass();
            k21Var = (k21) objectVolatile;
        } else {
            l21Var = this;
        }
        return j21Var.b(j, k21Var, l21Var);
    }

    public final boolean s0(j21 j21Var) {
        u.getClass();
        k21 k21Var = (k21) dz.a.getObjectVolatile(this, w);
        j21 j21Var2 = null;
        if (k21Var != null) {
            synchronized (k21Var) {
                j21[] j21VarArr = k21Var.a;
                j21Var2 = j21VarArr != null ? j21VarArr[0] : null;
            }
        }
        return j21Var2 == j21Var;
    }

    @Override // defpackage.g21
    public void shutdown() {
        it4.a.set(null);
        v.set(this, 1);
        f0();
        while (d0() <= 0) {
        }
        o0();
    }
}
