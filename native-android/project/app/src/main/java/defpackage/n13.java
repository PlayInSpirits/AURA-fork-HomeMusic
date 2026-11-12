package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class n13 extends u94 implements l13 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater w = null;
    public static final /* synthetic */ long x = 0;
    private volatile /* synthetic */ Object owner$volatile;

    static {
        w = AtomicReferenceFieldUpdater.newUpdater(n13.class, Object.class, "owner$volatile");
        x = dz.a.objectFieldOffset(n13.class.getDeclaredField("owner$volatile"));
    }

    public n13() {
        super(1);
        this.owner$volatile = q05.b;
    }

    @Override // defpackage.l13
    public final Object b(wd0 r6) {
        int r0 = e();
        j15 r1 = j15.a;
        if (r0 != 0) goto L5;
    L29:
        return r1;
    L5:
        if (r0 != 1) goto L7;
        cz r7 = zz1.s(ya4.x(r6));
        m13 r2 = new m13(this, r7);     // Catch: Throwable -> L26
    L14:
        int r3 = u94.t.getAndDecrement(this);     // Catch: Throwable -> L26
        if (r3 > this.n) goto L14;
        if (r3 > 0) goto L17;
        if (a(r2) == false) goto L14;
    L20:
        Object r5 = r7.q();
        xe0 r8 = xe0.n;
        if (r5 == r8) goto L24;
        r5 = r1;
    L24:
        if (r5 != r8) goto L29;
        return r5;
    L17:
        AtomicReferenceFieldUpdater r9 = w;     // Catch: Throwable -> L26
        n13 r4 = r2.o;     // Catch: Throwable -> L26
        r9.set(r4, null);     // Catch: Throwable -> L26
        cz r10 = r2.n;     // Catch: Throwable -> L26
        x r11 = new x(25, r4, r2);     // Catch: Throwable -> L26
        r10.D(r1, r10.p, new bz(0, r11));     // Catch: Throwable -> L26
    L26:
        th = move-exception;
        r7.B();
        throw th;
    L7:
        if (r0 == 2) goto L10;
        kf2.o("unexpected");
        return null;
    L10:
        kf2.o("This mutex is already locked by the specified owner: null");
        return null;
    }

    public final int e() {
    L2:
        AtomicIntegerFieldUpdater r0 = u94.t;
        int r1 = r0.get(this);
        int r2 = this.n;
        if (r1 > r2) goto L4;
        if (r1 <= 0) goto L10;
        if (r0.compareAndSet(this, r1, r1 - 1) == false) goto L2;
        w.getClass();
        dz.a.putObjectVolatile(this, x, null);
        return 0;
    L10:
        return 1;
    L4:
        int r3 = r0.get(this);
        if (r3 <= r2) goto L2;
        if (r0.compareAndSet(this, r3, r2) == false) goto L4;
        goto L2
    }

    @Override // defpackage.l13
    public final void f(Object r10) {
    L3:
        if (Math.max(u94.t.get(this), 0) != 0) goto L19;
        w.getClass();
        Unsafe r0 = dz.a;
        long r1 = x;
        Object r7 = r0.getObjectVolatile(this, r1);
        f01 r8 = q05.b;
        if (r7 == r8) goto L3;
        if (r7 == r10) goto L11;
        if (r10 == null) goto L11;
        nz2.p("This mutex is locked by ", r7, ", but ", r10, " is expected");
        return;
    L11:
        Unsafe r3 = dz.a;
        n13 r4 = this;
        if (r3.compareAndSwapObject(r4, x, r7, r8) == true) goto L13;
        if (r3.getObjectVolatile(r4, r1) != r7) goto L17;
        n13 this = r4;
        goto L11
    L17:
        this = r4;
        goto L3
    L13:
        r4.c();
        return;
    L19:
        kf2.o("This mutex is not locked");
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("Mutex@");
        r0.append(si0.x(this));
        r0.append("[isLocked=");
        boolean r2 = false;
        if (Math.max(u94.t.get(this), 0) != 0) goto L5;
        r2 = true;
    L5:
        r0.append(r2);
        r0.append(",owner=");
        w.getClass();
        r0.append(dz.a.getObjectVolatile(this, x));
        r0.append(']');
        return r0.toString();
    }
}
