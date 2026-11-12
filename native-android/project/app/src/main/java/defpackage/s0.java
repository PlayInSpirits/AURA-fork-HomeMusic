package defpackage;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 extends g12 {
    public static final Unsafe i;
    public static final long j;
    public static final long k;
    public static final long l;
    public static final long m;
    public static final long n;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new r0());
            }
            try {
                k = unsafe.objectFieldOffset(u0.class.getDeclaredField("p"));
                j = unsafe.objectFieldOffset(u0.class.getDeclaredField("o"));
                l = unsafe.objectFieldOffset(u0.class.getDeclaredField("n"));
                m = unsafe.objectFieldOffset(t0.class.getDeclaredField("a"));
                n = unsafe.objectFieldOffset(t0.class.getDeclaredField("b"));
                i = unsafe;
            } catch (NoSuchFieldException e) {
                er1.m(e);
            }
        } catch (PrivilegedActionException e2) {
            nz2.s("Could not initialize intrinsics", e2.getCause());
        }
    }

    @Override // defpackage.g12
    public final void K(t0 t0Var, t0 t0Var2) {
        i.putObject(t0Var, n, t0Var2);
    }

    @Override // defpackage.g12
    public final void L(t0 t0Var, Thread thread) {
        i.putObject(t0Var, m, thread);
    }

    @Override // defpackage.g12
    public final boolean g(u0 u0Var, i0 i0Var, i0 i0Var2) {
        return p0.a(i, u0Var, j, i0Var, i0Var2);
    }

    @Override // defpackage.g12
    public final boolean h(u0 u0Var, Object obj, Object obj2) {
        return q0.a(i, u0Var, l, obj, obj2);
    }

    @Override // defpackage.g12
    public final boolean i(u0 u0Var, t0 t0Var, t0 t0Var2) {
        return o0.a(i, u0Var, k, t0Var, t0Var2);
    }

    @Override // defpackage.g12
    public final i0 p(u0 u0Var) {
        i0 i0Var;
        i0 i0Var2 = i0.d;
        do {
            i0Var = u0Var.o;
            if (i0Var2 == i0Var) {
                break;
            }
        } while (!g(u0Var, i0Var, i0Var2));
        return i0Var;
    }

    @Override // defpackage.g12
    public final t0 q(u0 u0Var) {
        t0 t0Var;
        t0 t0Var2 = t0.c;
        do {
            t0Var = u0Var.p;
            if (t0Var2 == t0Var) {
                break;
            }
        } while (!i(u0Var, t0Var, t0Var2));
        return t0Var;
    }
}
