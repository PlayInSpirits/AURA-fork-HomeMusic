package defpackage;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 extends g12 {
    public static final Unsafe i = null;
    public static final long j = 0;
    public static final long k = 0;
    public static final long l = 0;
    public static final long m = 0;
    public static final long n = 0;

    static {
        Unsafe r1 = Unsafe.getUnsafe();     // Catch: SecurityException -> L5
    L17:
        k = r1.objectFieldOffset(u0.class.getDeclaredField("p"));     // Catch: NoSuchFieldException -> L8
        j = r1.objectFieldOffset(u0.class.getDeclaredField("o"));     // Catch: NoSuchFieldException -> L8
        l = r1.objectFieldOffset(u0.class.getDeclaredField("n"));     // Catch: NoSuchFieldException -> L8
        m = r1.objectFieldOffset(t0.class.getDeclaredField("a"));     // Catch: NoSuchFieldException -> L8
        n = r1.objectFieldOffset(t0.class.getDeclaredField("b"));     // Catch: NoSuchFieldException -> L8
        i = r1;     // Catch: NoSuchFieldException -> L8
        return;
    L8:
        e = move-exception;
        er1.m(e);
        return;
    L5:
        r1 = (Unsafe) AccessController.doPrivileged(new r0());     // Catch: PrivilegedActionException -> L11
    L11:
        e = move-exception;
        nz2.s("Could not initialize intrinsics", e.getCause());
    }

    @Override // defpackage.g12
    public final void K(t0 r3, t0 r4) {
        i.putObject(r3, n, r4);
    }

    @Override // defpackage.g12
    public final void L(t0 r3, Thread r4) {
        i.putObject(r3, m, r4);
    }

    @Override // defpackage.g12
    public final boolean g(u0 r7, i0 r8, i0 r9) {
        return p0.a(i, r7, j, r8, r9);
    }

    @Override // defpackage.g12
    public final boolean h(u0 r7, Object r8, Object r9) {
        return q0.a(i, r7, l, r8, r9);
    }

    @Override // defpackage.g12
    public final boolean i(u0 r7, t0 r8, t0 r9) {
        return o0.a(i, r7, k, r8, r9);
    }

    @Override // defpackage.g12
    public final i0 p(u0 r4) {
        i0 r0 = i0.d;
    L3:
        i0 r1 = r4.o;
        if (r0 == r1) goto L8;
        if (g(r4, r1, r0) == false) goto L3;
    L8:
        return r1;
    }

    @Override // defpackage.g12
    public final t0 q(u0 r4) {
        t0 r0 = t0.c;
    L3:
        t0 r1 = r4.p;
        if (r0 == r1) goto L8;
        if (i(r4, r1, r0) == false) goto L3;
    L8:
        return r1;
    }
}
