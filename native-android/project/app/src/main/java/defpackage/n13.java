package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class n13 extends u94 implements l13 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater w = AtomicReferenceFieldUpdater.newUpdater(n13.class, Object.class, "owner$volatile");
    public static final /* synthetic */ long x = dz.a.objectFieldOffset(n13.class.getDeclaredField("owner$volatile"));
    private volatile /* synthetic */ Object owner$volatile;

    public n13() {
        super(1);
        this.owner$volatile = q05.b;
    }

    @Override // defpackage.l13
    public final Object b(wd0 wd0Var) {
        int iE = e();
        j15 j15Var = j15.a;
        if (iE != 0) {
            if (iE != 1) {
                if (iE != 2) {
                    kf2.o("unexpected");
                    return null;
                }
                kf2.o("This mutex is already locked by the specified owner: null");
                return null;
            }
            cz czVarS = zz1.s(ya4.x(wd0Var));
            try {
                m13 m13Var = new m13(this, czVarS);
                while (true) {
                    int andDecrement = u94.t.getAndDecrement(this);
                    if (andDecrement <= this.n) {
                        if (andDecrement > 0) {
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = w;
                            n13 n13Var = m13Var.o;
                            atomicReferenceFieldUpdater.set(n13Var, null);
                            cz czVar = m13Var.n;
                            czVar.D(j15Var, czVar.p, new bz(0, new x(25, n13Var, m13Var)));
                            break;
                        }
                        if (a(m13Var)) {
                            break;
                        }
                    }
                }
                Object objQ = czVarS.q();
                xe0 xe0Var = xe0.n;
                if (objQ != xe0Var) {
                    objQ = j15Var;
                }
                if (objQ == xe0Var) {
                    return objQ;
                }
            } catch (Throwable th) {
                czVarS.B();
                throw th;
            }
        }
        return j15Var;
    }

    public final int e() {
        int i;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = u94.t;
            int i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = this.n;
            if (i2 > i3) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= i3) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i3));
            } else {
                if (i2 <= 0) {
                    return 1;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i2, i2 - 1)) {
                    w.getClass();
                    dz.a.putObjectVolatile(this, x, (Object) null);
                    return 0;
                }
            }
        }
    }

    @Override // defpackage.l13
    public final void f(Object obj) {
        while (Math.max(u94.t.get(this), 0) == 0) {
            w.getClass();
            Unsafe unsafe = dz.a;
            long j = x;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            f01 f01Var = q05.b;
            if (objectVolatile != f01Var) {
                if (objectVolatile != obj && obj != null) {
                    nz2.p("This mutex is locked by ", objectVolatile, ", but ", obj, " is expected");
                    return;
                }
                while (true) {
                    Unsafe unsafe2 = dz.a;
                    n13 n13Var = this;
                    if (unsafe2.compareAndSwapObject(n13Var, x, objectVolatile, f01Var)) {
                        n13Var.c();
                        return;
                    } else {
                        if (unsafe2.getObjectVolatile(n13Var, j) != objectVolatile) {
                            this = n13Var;
                            break;
                        }
                        this = n13Var;
                    }
                }
            }
        }
        kf2.o("This mutex is not locked");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(si0.x(this));
        sb.append("[isLocked=");
        sb.append(Math.max(u94.t.get(this), 0) == 0);
        sb.append(",owner=");
        w.getClass();
        sb.append(dz.a.getObjectVolatile(this, x));
        sb.append(']');
        return sb.toString();
    }
}
