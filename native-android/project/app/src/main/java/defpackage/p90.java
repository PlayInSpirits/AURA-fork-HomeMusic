package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p90 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(p90.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b;
    public static final /* synthetic */ long c;
    public static final /* synthetic */ long d;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    static {
        Unsafe unsafe = dz.a;
        c = unsafe.objectFieldOffset(p90.class.getDeclaredField("_next$volatile"));
        b = AtomicReferenceFieldUpdater.newUpdater(p90.class, Object.class, "_prev$volatile");
        d = unsafe.objectFieldOffset(p90.class.getDeclaredField("_prev$volatile"));
    }

    public p90(u84 u84Var) {
        this._prev$volatile = u84Var;
    }

    public final void a() {
        b.getClass();
        dz.a.putObjectVolatile(this, d, (Object) null);
    }

    public final p90 b() {
        p90 p90VarE = e();
        while (p90VarE != null && p90VarE.f()) {
            b.getClass();
            p90VarE = (p90) dz.a.getObjectVolatile(p90VarE, d);
        }
        return p90VarE;
    }

    public final p90 c() {
        Object objD = d();
        if (objD == ud3.a) {
            return null;
        }
        return (p90) objD;
    }

    public final Object d() {
        a.getClass();
        return dz.a.getObjectVolatile(this, c);
    }

    public final p90 e() {
        b.getClass();
        return (p90) dz.a.getObjectVolatile(this, d);
    }

    public abstract boolean f();

    public final boolean g() {
        f01 f01Var = ud3.a;
        while (true) {
            a.getClass();
            Unsafe unsafe = dz.a;
            long j = c;
            p90 p90Var = this;
            if (unsafe.compareAndSwapObject(p90Var, j, (Object) null, f01Var)) {
                return true;
            }
            if (unsafe.getObjectVolatile(p90Var, j) != null) {
                return false;
            }
            this = p90Var;
        }
    }

    public final void h() {
        p90 p90Var;
        Unsafe unsafe;
        if (c() == null) {
            return;
        }
        while (true) {
            p90 p90VarB = b();
            p90 p90VarC = c();
            p90VarC.getClass();
            do {
                p90Var = p90VarC;
                if (!p90Var.f()) {
                    break;
                } else {
                    p90VarC = p90Var.c();
                }
            } while (p90VarC != null);
            while (true) {
                b.getClass();
                Unsafe unsafe2 = dz.a;
                long j = d;
                Object objectVolatile = unsafe2.getObjectVolatile(p90Var, j);
                p90 p90Var2 = ((p90) objectVolatile) == null ? null : p90VarB;
                while (true) {
                    unsafe = dz.a;
                    if (unsafe.compareAndSwapObject(p90Var, d, objectVolatile, p90Var2)) {
                        break;
                    } else if (unsafe.getObjectVolatile(p90Var, j) != objectVolatile) {
                    }
                }
            }
            if (p90VarB != null) {
                a.getClass();
                unsafe.putObjectVolatile(p90VarB, c, p90Var);
            }
            if (!p90Var.f() || p90Var.c() == null) {
                if (p90VarB == null || !p90VarB.f()) {
                    return;
                }
            }
        }
    }

    public final boolean i(u84 u84Var) {
        while (true) {
            a.getClass();
            Unsafe unsafe = dz.a;
            long j = c;
            p90 p90Var = this;
            u84 u84Var2 = u84Var;
            if (unsafe.compareAndSwapObject(p90Var, j, (Object) null, u84Var2)) {
                return true;
            }
            if (unsafe.getObjectVolatile(p90Var, j) != null) {
                return false;
            }
            this = p90Var;
            u84Var = u84Var2;
        }
    }
}
