package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ad5 {
    public final AtomicReferenceArray a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(ad5.class, Object.class, "lastScheduledTask$volatile");
    public static final /* synthetic */ long f = dz.a.objectFieldOffset(ad5.class.getDeclaredField("lastScheduledTask$volatile"));
    public static final /* synthetic */ AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(ad5.class, "producerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(ad5.class, "consumerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(ad5.class, "blockingTasksInBuffer$volatile");

    public final br4 a(br4 br4Var, boolean z) {
        if (z) {
            return b(br4Var);
        }
        b.getClass();
        br4 br4Var2 = (br4) dz.a.getAndSetObject(this, f, br4Var);
        if (br4Var2 == null) {
            return null;
        }
        return b(br4Var2);
    }

    public final br4 b(br4 br4Var) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = c;
        if (atomicIntegerFieldUpdater.get(this) - d.get(this) == 127) {
            return br4Var;
        }
        if (br4Var.o) {
            e.incrementAndGet(this);
        }
        int i = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.a;
            if (atomicReferenceArray.get(i) == null) {
                atomicReferenceArray.lazySet(i, br4Var);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final int c() {
        b.getClass();
        Object objectVolatile = dz.a.getObjectVolatile(this, f);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = c;
        return objectVolatile != null ? (atomicIntegerFieldUpdater2.get(this) - atomicIntegerFieldUpdater.get(this)) + 1 : atomicIntegerFieldUpdater2.get(this) - atomicIntegerFieldUpdater.get(this);
    }

    public final void d(wi1 wi1Var) {
        b.getClass();
        br4 br4Var = (br4) dz.a.getAndSetObject(this, f, (Object) null);
        if (br4Var != null) {
            wi1Var.a(br4Var);
        }
        while (true) {
            br4 br4VarF = f();
            if (br4VarF == null) {
                return;
            } else {
                wi1Var.a(br4VarF);
            }
        }
    }

    public final br4 e() {
        b.getClass();
        br4 br4Var = (br4) dz.a.getAndSetObject(this, f, (Object) null);
        return br4Var == null ? f() : br4Var;
    }

    public final br4 f() {
        br4 br4Var;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - c.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (br4Var = (br4) this.a.getAndSet(i2, null)) != null) {
                if (br4Var.o) {
                    e.decrementAndGet(this);
                }
                return br4Var;
            }
        }
    }

    public final br4 g() {
        ad5 ad5Var;
        while (true) {
            b.getClass();
            Unsafe unsafe = dz.a;
            long j = f;
            br4 br4Var = (br4) unsafe.getObjectVolatile(this, j);
            if (br4Var == null || !br4Var.o) {
                break;
            }
            while (true) {
                Unsafe unsafe2 = dz.a;
                ad5Var = this;
                if (unsafe2.compareAndSwapObject(ad5Var, f, br4Var, (Object) null)) {
                    return br4Var;
                }
                if (unsafe2.getObjectVolatile(ad5Var, j) != br4Var) {
                    break;
                }
                this = ad5Var;
            }
            this = ad5Var;
        }
        ad5 ad5Var2 = this;
        int i = d.get(ad5Var2);
        int i2 = c.get(ad5Var2);
        while (i != i2 && e.get(ad5Var2) != 0) {
            i2--;
            br4 br4VarH = ad5Var2.h(i2, true);
            if (br4VarH != null) {
                return br4VarH;
            }
        }
        return null;
    }

    public final br4 h(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.a;
        br4 br4Var = (br4) atomicReferenceArray.get(i2);
        if (br4Var != null && br4Var.o == z) {
            while (!atomicReferenceArray.compareAndSet(i2, br4Var, null)) {
                if (atomicReferenceArray.get(i2) != br4Var) {
                }
            }
            if (z) {
                e.decrementAndGet(this);
            }
            return br4Var;
        }
        return null;
    }

    public final long i(int i, jx3 jx3Var) {
        ad5 ad5Var;
        while (true) {
            b.getClass();
            Unsafe unsafe = dz.a;
            long j = f;
            br4 br4Var = (br4) unsafe.getObjectVolatile(this, j);
            if (br4Var == null) {
                return -2L;
            }
            if (((br4Var.o ? 1 : 2) & i) == 0) {
                return -2L;
            }
            ir4.f.getClass();
            long jNanoTime = System.nanoTime() - br4Var.n;
            long j2 = ir4.b;
            if (jNanoTime < j2) {
                return j2 - jNanoTime;
            }
            while (true) {
                Unsafe unsafe2 = dz.a;
                ad5Var = this;
                if (unsafe2.compareAndSwapObject(ad5Var, f, br4Var, (Object) null)) {
                    jx3Var.n = br4Var;
                    return -1L;
                }
                if (unsafe2.getObjectVolatile(ad5Var, j) != br4Var) {
                    break;
                }
                this = ad5Var;
            }
            this = ad5Var;
        }
    }
}
