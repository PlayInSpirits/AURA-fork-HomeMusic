package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p90 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = null;
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = null;
    public static final /* synthetic */ long c = 0;
    public static final /* synthetic */ long d = 0;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    static {
        a = AtomicReferenceFieldUpdater.newUpdater(p90.class, Object.class, "_next$volatile");
        Unsafe r3 = dz.a;
        c = r3.objectFieldOffset(p90.class.getDeclaredField("_next$volatile"));
        b = AtomicReferenceFieldUpdater.newUpdater(p90.class, Object.class, "_prev$volatile");
        d = r3.objectFieldOffset(p90.class.getDeclaredField("_prev$volatile"));
    }

    public p90(u84 r1) {
        this._prev$volatile = r1;
    }

    public final void a() {
        b.getClass();
        dz.a.putObjectVolatile(this, d, null);
    }

    public final p90 b() {
        p90 r3 = e();
    L3:
        if (r3 == null) goto L7;
        if (r3.f() == false) goto L7;
        b.getClass();
        r3 = (p90) dz.a.getObjectVolatile(r3, d);
    L7:
        return r3;
    }

    public final p90 c() {
        Object r1 = d();
        if (r1 != ud3.a) goto L7;
        return null;
    L7:
        return (p90) r1;
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
        f01 r5 = ud3.a;
    L3:
        a.getClass();
        Unsafe r0 = dz.a;
        long r2 = c;
        p90 r1 = this;
        if (r0.compareAndSwapObject(r1, r2, null, r5) == true) goto L5;
        if (r0.getObjectVolatile(r1, r2) != null) goto L9;
        p90 this = r1;
        goto L3
    L9:
        return false;
    L5:
        return true;
    }

    public final void h() {
        if (c() != null) goto L5;
        return;
    L5:
        p90 r0 = b();
        p90 r1 = c();
        r1.getClass();
    L6:
        p90 r3 = r1;
        if (r3.f() == false) goto L10;
        r1 = r3.c();
        if (r1 != null) goto L6;
    L10:
        b.getClass();
        Unsafe r2 = dz.a;
        long r8 = d;
        Object r6 = r2.getObjectVolatile(r3, r8);
        if (((p90) r6) != null) goto L13;
        p90 r7 = null;
    L14:
        Unsafe r4 = dz.a;
        if (r4.compareAndSwapObject(r3, d, r6, r7) == true) goto L16;
        if (r4.getObjectVolatile(r3, r8) == r6) goto L14;
    L16:
        if (r0 == null) goto L19;
        a.getClass();
        r4.putObjectVolatile(r0, c, r3);
    L19:
        if (r3.f() == false) goto L22;
        if (r3.c() != null) goto L5;
    L22:
        if (r0 == null) goto L25;
        if (r0.f() == true) goto L5;
        return;
    L25:
        return;
    L13:
        r7 = r0;
        goto L14
    }

    public final boolean i(u84 r8) {
    L2:
        a.getClass();
        Unsafe r1 = dz.a;
        long r3 = c;
        p90 r2 = this;
        u84 r6 = r8;
        if (r1.compareAndSwapObject(r2, r3, null, r6) == true) goto L4;
        if (r1.getObjectVolatile(r2, r3) != null) goto L8;
        p90 this = r2;
        r8 = r6;
        goto L2
    L8:
        return false;
    L4:
        return true;
    }
}
