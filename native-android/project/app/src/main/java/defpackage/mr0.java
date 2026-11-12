package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mr0 extends or0 implements ye0, vd0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater u = AtomicReferenceFieldUpdater.newUpdater(mr0.class, Object.class, "_reusableCancellableContinuation$volatile");
    public static final /* synthetic */ long v = dz.a.objectFieldOffset(mr0.class.getDeclaredField("_reusableCancellableContinuation$volatile"));
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public final pe0 q;
    public final wd0 r;
    public Object s;
    public final Object t;

    public mr0(pe0 pe0Var, wd0 wd0Var) {
        super(-1);
        this.q = pe0Var;
        this.r = wd0Var;
        this.s = uc5.a;
        this.t = te5.O(wd0Var.getContext());
    }

    @Override // defpackage.or0
    public final vd0 d() {
        return this;
    }

    @Override // defpackage.ye0
    public final ye0 getCallerFrame() {
        return this.r;
    }

    @Override // defpackage.vd0
    public final ne0 getContext() {
        return this.r.getContext();
    }

    @Override // defpackage.or0
    public final Object h() {
        Object obj = this.s;
        this.s = uc5.a;
        return obj;
    }

    public final void i() {
        do {
            u.getClass();
        } while (dz.a.getObjectVolatile(this, v) == uc5.b);
    }

    public final cz j() {
        mr0 mr0Var;
        f01 f01Var = uc5.b;
        while (true) {
            u.getClass();
            Unsafe unsafe = dz.a;
            long j = v;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                unsafe.putObjectVolatile(this, j, f01Var);
                return null;
            }
            if (objectVolatile instanceof cz) {
                while (true) {
                    Unsafe unsafe2 = dz.a;
                    mr0 mr0Var2 = this;
                    boolean zCompareAndSwapObject = unsafe2.compareAndSwapObject(mr0Var2, v, objectVolatile, f01Var);
                    mr0Var = mr0Var2;
                    if (zCompareAndSwapObject) {
                        return (cz) objectVolatile;
                    }
                    if (unsafe2.getObjectVolatile(mr0Var, j) != objectVolatile) {
                        break;
                    }
                    this = mr0Var;
                }
            } else {
                mr0Var = this;
                if (objectVolatile != f01Var && !(objectVolatile instanceof Throwable)) {
                    mj0.g(objectVolatile, "Inconsistent state ");
                    return null;
                }
            }
            this = mr0Var;
        }
    }

    public final cz l() {
        u.getClass();
        Object objectVolatile = dz.a.getObjectVolatile(this, v);
        if (objectVolatile instanceof cz) {
            return (cz) objectVolatile;
        }
        return null;
    }

    public final boolean m() {
        u.getClass();
        return dz.a.getObjectVolatile(this, v) != null;
    }

    public final boolean n(Throwable th) {
        mr0 mr0Var;
        Throwable th2;
        Unsafe unsafe;
        while (true) {
            u.getClass();
            Unsafe unsafe2 = dz.a;
            long j = v;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            f01 f01Var = uc5.b;
            if (h12.c(objectVolatile, f01Var)) {
                while (true) {
                    Unsafe unsafe3 = dz.a;
                    mr0 mr0Var2 = this;
                    th2 = th;
                    mr0Var = mr0Var2;
                    if (unsafe3.compareAndSwapObject(mr0Var2, v, f01Var, th2)) {
                        return true;
                    }
                    if (unsafe3.getObjectVolatile(mr0Var, j) != f01Var) {
                        break;
                    }
                    this = mr0Var;
                    th = th2;
                }
            } else {
                mr0Var = this;
                th2 = th;
                if (objectVolatile instanceof Throwable) {
                    return true;
                }
                do {
                    unsafe = dz.a;
                    if (unsafe.compareAndSwapObject(mr0Var, v, objectVolatile, (Object) null)) {
                        return false;
                    }
                } while (unsafe.getObjectVolatile(mr0Var, j) == objectVolatile);
            }
            this = mr0Var;
            th = th2;
        }
    }

    public final Throwable o(cz czVar) {
        Unsafe unsafe;
        mr0 mr0Var;
        cz czVar2;
        while (true) {
            u.getClass();
            Unsafe unsafe2 = dz.a;
            long j = v;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            f01 f01Var = uc5.b;
            if (objectVolatile != f01Var) {
                mr0 mr0Var2 = this;
                if (!(objectVolatile instanceof Throwable)) {
                    mj0.g(objectVolatile, "Inconsistent state ");
                    return null;
                }
                do {
                    unsafe = dz.a;
                    if (unsafe.compareAndSwapObject(mr0Var2, v, objectVolatile, (Object) null)) {
                        return (Throwable) objectVolatile;
                    }
                } while (unsafe.getObjectVolatile(mr0Var2, j) == objectVolatile);
                kf2.n("Failed requirement.");
                return null;
            }
            while (true) {
                Unsafe unsafe3 = dz.a;
                mr0Var = this;
                czVar2 = czVar;
                if (unsafe3.compareAndSwapObject(mr0Var, v, f01Var, czVar2)) {
                    return null;
                }
                if (unsafe3.getObjectVolatile(mr0Var, j) != f01Var) {
                    break;
                }
                this = mr0Var;
                czVar = czVar2;
            }
            this = mr0Var;
            czVar = czVar2;
        }
    }

    @Override // defpackage.vd0
    public final void resumeWith(Object obj) {
        Throwable thA = bb3.a(obj);
        Object a70Var = thA == null ? obj : new a70(thA, false);
        wd0 wd0Var = this.r;
        ne0 context = wd0Var.getContext();
        pe0 pe0Var = this.q;
        if (pe0Var.Y(context)) {
            this.s = a70Var;
            this.p = 0;
            pe0Var.W(wd0Var.getContext(), this);
            return;
        }
        g21 g21VarA = it4.a();
        if (g21VarA.p >= 4294967296L) {
            this.s = a70Var;
            this.p = 0;
            g21VarA.b0(this);
            return;
        }
        g21VarA.c0(true);
        try {
            ne0 context2 = wd0Var.getContext();
            Object objR = te5.R(context2, this.t);
            try {
                wd0Var.resumeWith(obj);
                te5.K(context2, objR);
                while (g21VarA.e0()) {
                }
            } catch (Throwable th) {
                te5.K(context2, objR);
                throw th;
            }
        } catch (Throwable th2) {
            try {
                g(th2);
            } finally {
                g21VarA.a0(true);
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.q + ", " + si0.P(this.r) + ']';
    }
}
