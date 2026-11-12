package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class u94 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater p = null;
    public static final /* synthetic */ AtomicLongFieldUpdater q = null;
    public static final /* synthetic */ AtomicReferenceFieldUpdater r = null;
    public static final /* synthetic */ AtomicLongFieldUpdater s = null;
    public static final /* synthetic */ AtomicIntegerFieldUpdater t = null;
    public static final /* synthetic */ long u = 0;
    public static final /* synthetic */ long v = 0;
    private volatile /* synthetic */ int _availablePermits$volatile;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    public final int n;
    public final bz o;
    private volatile /* synthetic */ Object tail$volatile;

    static {
        p = AtomicReferenceFieldUpdater.newUpdater(u94.class, Object.class, "head$volatile");
        Unsafe r3 = dz.a;
        u = r3.objectFieldOffset(u94.class.getDeclaredField("head$volatile"));
        q = AtomicLongFieldUpdater.newUpdater(u94.class, "deqIdx$volatile");
        r = AtomicReferenceFieldUpdater.newUpdater(u94.class, Object.class, "tail$volatile");
        v = r3.objectFieldOffset(u94.class.getDeclaredField("tail$volatile"));
        s = AtomicLongFieldUpdater.newUpdater(u94.class, "enqIdx$volatile");
        t = AtomicIntegerFieldUpdater.newUpdater(u94.class, "_availablePermits$volatile");
    }

    public u94(int r6) {
        this.n = r6;
        if (r6 <= 0) goto L9;
        if (r6 < 0) goto L7;
        x94 r0 = new x94(0, null, 2);
        this.head$volatile = r0;
        this.tail$volatile = r0;
        this._availablePermits$volatile = r6;
        this.o = new bz(2, this);
        return;
    L7:
        kf2.e(f34.f(r6, "The number of acquired permits should be in 0.."));
        throw null;
    L9:
        kf2.e(f34.f(r6, "Semaphore should have at least 1 permit, but had "));
        throw null;
    }

    public final boolean a(t85 r17) {
        u94 r1 = this;
        r.getClass();
        Unsafe r0 = dz.a;
        long r7 = v;
        x94 r9 = (x94) r0.getObjectVolatile(r1, r7);
        long r10 = s.getAndIncrement(r1);
        s94 r12 = s94.n;
        long r13 = r10 / ((long) w94.f);
    L3:
        Object r15 = ud3.j(r9, r13, r12);
        if (xl.x(r15) == true) goto L22;
        u84 r5 = xl.v(r15);
    L6:
        u84 r4 = (u84) dz.a.getObjectVolatile(r1, r7);
        if (r4.e >= r5.e) goto L8;
        if (r5.n() == false) goto L11;
    L12:
        Unsafe r2 = dz.a;
        r1 = this;
        if (r2.compareAndSwapObject(r1, v, r4, r5) == true) goto L15;
        if (r2.getObjectVolatile(r1, r7) == r4) goto L12;
        if (r5.j() == false) goto L6;
        r5.h();
        goto L6
    L15:
        if (r4.j() == false) goto L22;
        r4.h();
        goto L22
    L11:
        r1 = this;
        goto L3
    L8:
        r1 = this;
    L22:
        x94 r3 = (x94) xl.v(r15);
        AtomicReferenceArray r6 = r3.g;
        int r8 = (int) (r10 % ((long) w94.f));
    L24:
        if (r6.compareAndSet(r8, null, r17) == true) goto L25;
        if (r6.get(r8) == null) goto L24;
        f01 r11 = w94.b;
        f01 r14 = w94.c;
    L31:
        if (r6.compareAndSet(r8, r11, r14) == true) goto L32;
        if (r6.get(r8) == r11) goto L31;
        return false;
    L32:
        ((az) r17).k(j15.a, r1.o);
        return true;
    L25:
        r17.a(r3, r8);
        return true;
    }

    public final void c() {
    L2:
        AtomicIntegerFieldUpdater r0 = t;
        int r1 = r0.getAndIncrement(this);
        int r2 = this.n;
        if (r1 >= r2) goto L9;
        if (r1 >= 0) goto L8;
        if (d() == false) goto L2;
        return;
    L8:
        return;
    L9:
        int r3 = r0.get(this);
        if (r3 <= r2) goto L15;
        if (r0.compareAndSet(this, r3, r2) == false) goto L9;
    L15:
        throw new IllegalStateException(("The number of released permits cannot be greater than " + r2).toString());
    }

    public final boolean d() {
        p.getClass();
        Unsafe r0 = dz.a;
        long r6 = u;
        x94 r8 = (x94) r0.getObjectVolatile(this, r6);
        long r9 = q.getAndIncrement(this);
        long r11 = r9 / ((long) w94.f);
        t94 r13 = t94.n;
    L3:
        Object r14 = ud3.j(r8, r11, r13);
        if (xl.x(r14) == true) goto L22;
        u84 r5 = xl.v(r14);
    L6:
        u84 r4 = (u84) dz.a.getObjectVolatile(this, r6);
        if (r4.e >= r5.e) goto L22;
        if (r5.n() == false) goto L3;
    L12:
        Unsafe r1 = dz.a;
        if (r1.compareAndSwapObject(this, u, r4, r5) == true) goto L15;
        if (r1.getObjectVolatile(this, r6) == r4) goto L12;
        if (r5.j() == false) goto L6;
        r5.h();
        goto L6
    L15:
        if (r4.j() == false) goto L22;
        r4.h();
    L22:
        x94 r2 = (x94) xl.v(r14);
        AtomicReferenceArray r3 = r2.g;
        r2.a();
        boolean r7 = false;
        if (r2.e > r11) goto L50;
        int r10 = (int) (r9 % ((long) w94.f));
        Object r12 = r3.getAndSet(r10, w94.b);
        if (r12 != null) goto L42;
        int r15 = w94.a;
        int r16 = 0;
    L28:
        if (r16 >= r15) goto L33;
        if (r3.get(r10) == w94.c) goto L31;
        r16 = r16 + 1;
        goto L28
    L31:
        return true;
    L33:
        f01 r17 = w94.b;
        f01 r18 = w94.d;
    L35:
        if (r3.compareAndSet(r10, r17, r18) == true) goto L36;
        if (r3.get(r10) == r17) goto L35;
    L40:
        return !r7;
    L36:
        r7 = true;
        goto L40
    L42:
        if (r12 == w94.e) goto L50;
        if ((r12 instanceof az) == false) goto L51;
        az r19 = (az) r12;
        f01 r20 = r19.c(j15.a, this.o);
        if (r20 == null) goto L50;
        r19.t(r20);
        return true;
    L51:
        mj0.g(r12, "unexpected: ");
        return false;
    L50:
        return false;
    }
}
