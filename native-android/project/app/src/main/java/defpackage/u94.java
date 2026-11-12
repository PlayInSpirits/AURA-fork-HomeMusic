package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class u94 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater p = AtomicReferenceFieldUpdater.newUpdater(u94.class, Object.class, "head$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater q;
    public static final /* synthetic */ AtomicReferenceFieldUpdater r;
    public static final /* synthetic */ AtomicLongFieldUpdater s;
    public static final /* synthetic */ AtomicIntegerFieldUpdater t;
    public static final /* synthetic */ long u;
    public static final /* synthetic */ long v;
    private volatile /* synthetic */ int _availablePermits$volatile;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    public final int n;
    public final bz o;
    private volatile /* synthetic */ Object tail$volatile;

    static {
        Unsafe unsafe = dz.a;
        u = unsafe.objectFieldOffset(u94.class.getDeclaredField("head$volatile"));
        q = AtomicLongFieldUpdater.newUpdater(u94.class, "deqIdx$volatile");
        r = AtomicReferenceFieldUpdater.newUpdater(u94.class, Object.class, "tail$volatile");
        v = unsafe.objectFieldOffset(u94.class.getDeclaredField("tail$volatile"));
        s = AtomicLongFieldUpdater.newUpdater(u94.class, "enqIdx$volatile");
        t = AtomicIntegerFieldUpdater.newUpdater(u94.class, "_availablePermits$volatile");
    }

    public u94(int i) {
        this.n = i;
        if (i <= 0) {
            kf2.e(f34.f(i, "Semaphore should have at least 1 permit, but had "));
            throw null;
        }
        if (i < 0) {
            kf2.e(f34.f(i, "The number of acquired permits should be in 0.."));
            throw null;
        }
        x94 x94Var = new x94(0L, null, 2);
        this.head$volatile = x94Var;
        this.tail$volatile = x94Var;
        this._availablePermits$volatile = i;
        this.o = new bz(2, this);
    }

    public final boolean a(t85 t85Var) {
        Object objJ;
        Unsafe unsafe;
        u94 u94Var = this;
        r.getClass();
        Unsafe unsafe2 = dz.a;
        long j = v;
        x94 x94Var = (x94) unsafe2.getObjectVolatile(u94Var, j);
        long andIncrement = s.getAndIncrement(u94Var);
        s94 s94Var = s94.n;
        long j2 = andIncrement / ((long) w94.f);
        loop0: while (true) {
            objJ = ud3.j(x94Var, j2, s94Var);
            if (xl.x(objJ)) {
                break;
            }
            u84 u84VarV = xl.v(objJ);
            while (true) {
                u84 u84Var = (u84) dz.a.getObjectVolatile(u94Var, j);
                if (u84Var.e >= u84VarV.e) {
                    u94Var = this;
                    break loop0;
                }
                if (!u84VarV.n()) {
                    break;
                }
                do {
                    unsafe = dz.a;
                    u94Var = this;
                    if (unsafe.compareAndSwapObject(u94Var, v, u84Var, u84VarV)) {
                        if (!u84Var.j()) {
                            break loop0;
                        }
                        u84Var.h();
                        break loop0;
                    }
                } while (unsafe.getObjectVolatile(u94Var, j) == u84Var);
                if (u84VarV.j()) {
                    u84VarV.h();
                }
            }
            u94Var = this;
        }
        x94 x94Var2 = (x94) xl.v(objJ);
        AtomicReferenceArray atomicReferenceArray = x94Var2.g;
        int i = (int) (andIncrement % ((long) w94.f));
        while (!atomicReferenceArray.compareAndSet(i, null, t85Var)) {
            if (atomicReferenceArray.get(i) != null) {
                f01 f01Var = w94.b;
                f01 f01Var2 = w94.c;
                while (!atomicReferenceArray.compareAndSet(i, f01Var, f01Var2)) {
                    if (atomicReferenceArray.get(i) != f01Var) {
                        return false;
                    }
                }
                ((az) t85Var).k(j15.a, u94Var.o);
                return true;
            }
        }
        t85Var.a(x94Var2, i);
        return true;
    }

    public final void c() {
        int i;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = t;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i2 = this.n;
            if (andIncrement >= i2) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= i2) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i2));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i2).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!d());
    }

    public final boolean d() {
        Object objJ;
        Unsafe unsafe;
        p.getClass();
        Unsafe unsafe2 = dz.a;
        long j = u;
        x94 x94Var = (x94) unsafe2.getObjectVolatile(this, j);
        long andIncrement = q.getAndIncrement(this);
        long j2 = andIncrement / ((long) w94.f);
        t94 t94Var = t94.n;
        loop0: while (true) {
            objJ = ud3.j(x94Var, j2, t94Var);
            if (xl.x(objJ)) {
                break;
            }
            u84 u84VarV = xl.v(objJ);
            while (true) {
                u84 u84Var = (u84) dz.a.getObjectVolatile(this, j);
                if (u84Var.e >= u84VarV.e) {
                    break loop0;
                }
                if (!u84VarV.n()) {
                    break;
                }
                do {
                    unsafe = dz.a;
                    if (unsafe.compareAndSwapObject(this, u, u84Var, u84VarV)) {
                        if (!u84Var.j()) {
                            break loop0;
                        }
                        u84Var.h();
                        break loop0;
                    }
                } while (unsafe.getObjectVolatile(this, j) == u84Var);
                if (u84VarV.j()) {
                    u84VarV.h();
                }
            }
        }
        x94 x94Var2 = (x94) xl.v(objJ);
        AtomicReferenceArray atomicReferenceArray = x94Var2.g;
        x94Var2.a();
        boolean z = false;
        if (x94Var2.e <= j2) {
            int i = (int) (andIncrement % ((long) w94.f));
            Object andSet = atomicReferenceArray.getAndSet(i, w94.b);
            if (andSet == null) {
                int i2 = w94.a;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (atomicReferenceArray.get(i) == w94.c) {
                        return true;
                    }
                }
                f01 f01Var = w94.b;
                f01 f01Var2 = w94.d;
                while (!atomicReferenceArray.compareAndSet(i, f01Var, f01Var2)) {
                    if (atomicReferenceArray.get(i) != f01Var) {
                        return !z;
                    }
                }
                z = true;
                return !z;
            }
            if (andSet != w94.e) {
                if (!(andSet instanceof az)) {
                    mj0.g(andSet, "unexpected: ");
                    return false;
                }
                az azVar = (az) andSet;
                f01 f01VarC = azVar.c(j15.a, this.o);
                if (f01VarC != null) {
                    azVar.t(f01VarC);
                    return true;
                }
            }
        }
        return false;
    }
}
