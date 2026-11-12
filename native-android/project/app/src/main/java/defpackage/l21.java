package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l21 extends g21 implements ao0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater t = null;
    public static final /* synthetic */ AtomicReferenceFieldUpdater u = null;
    public static final /* synthetic */ AtomicIntegerFieldUpdater v = null;
    public static final /* synthetic */ long w = 0;
    public static final /* synthetic */ long x = 0;
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    static {
        t = AtomicReferenceFieldUpdater.newUpdater(l21.class, Object.class, "_queue$volatile");
        Unsafe r3 = dz.a;
        x = r3.objectFieldOffset(l21.class.getDeclaredField("_queue$volatile"));
        u = AtomicReferenceFieldUpdater.newUpdater(l21.class, Object.class, "_delayed$volatile");
        w = r3.objectFieldOffset(l21.class.getDeclaredField("_delayed$volatile"));
        v = AtomicIntegerFieldUpdater.newUpdater(l21.class, "_isCompleted$volatile");
    }

    public l21() {
        this._isCompleted$volatile = 0;
    }

    @Override // defpackage.ao0
    public as0 F(long r1, gu4 r3, ne0 r4) {
        return qk0.a.F(r1, r3, r4);
    }

    @Override // defpackage.ao0
    public final void H(long r4, cz r6) {
        long r0 = 0;
        if (r4 <= 0) goto L10;
        if (r4 < 9223372036854L) goto L8;
        r0 = Long.MAX_VALUE;
        goto L10
    L8:
        r0 = 1000000 * r4;
    L10:
        if (r0 >= 4611686018427387903L) goto L13;
        long r5 = System.nanoTime();
        h21 r2 = new h21(this, r0 + r5, r6);
        q0(r5, r2);
        r6.x(new wy(2, r2));
        return;
    }

    @Override // defpackage.pe0
    public final void W(ne0 r1, Runnable r2) {
        h0(r2);
    }

    @Override // defpackage.g21
    public final long d0() {
        if (e0() == false) goto L5;
        return 0;
    L5:
        i0();
        Runnable r0 = g0();
        if (r0 == null) goto L10;
        r0.run();
        return 0;
    L10:
        return k0();
    }

    public final void f0() {
        f01 r5 = hw.c;
    L3:
        t.getClass();
        Unsafe r0 = dz.a;
        long r6 = x;
        Object r12 = r0.getObjectVolatile(this, r6);
        if (r12 != null) goto L12;
    L5:
        Unsafe r1 = dz.a;
        l21 r2 = this;
        if (r1.compareAndSwapObject(r2, x, null, r5) == true) goto L21;
        if (r1.getObjectVolatile(r2, r6) != null) goto L24;
        l21 this = r2;
    L24:
        this = r2;
        goto L3
    L21:
        return;
    L12:
        r2 = this;
        if ((r12 instanceof ce2) == true) goto L14;
        if (r12 == r5) goto L32;
        ce2 r13 = new ce2(8, true);
        r13.a((Runnable) r12);
    L19:
        Unsafe r8 = dz.a;
        if (r8.compareAndSwapObject(r2, x, r12, r13) == true) goto L33;
        if (r8.getObjectVolatile(r2, r6) == r12) goto L19;
    L33:
        return;
    L32:
        return;
    L14:
        ((ce2) r12).c();
    }

    public final Runnable g0() {
    L2:
        t.getClass();
        Unsafe r0 = dz.a;
        long r1 = x;
        Object r7 = r0.getObjectVolatile(this, r1);
        if (r7 == null) goto L21;
        if ((r7 instanceof ce2) == false) goto L19;
        ce2 r2 = (ce2) r7;
        Object r3 = r2.e();
        if (r3 != ce2.g) goto L10;
        ce2 r8 = r2.d();
    L12:
        Unsafe r4 = dz.a;
        l21 r5 = this;
        if (r4.compareAndSwapObject(r5, x, r7, r8) == true) goto L29;
        if (r4.getObjectVolatile(r5, r1) != r7) goto L29;
        l21 this = r5;
    L29:
        this = r5;
        goto L2
    L10:
        return (Runnable) r3;
    L19:
        r5 = this;
        if (r7 == hw.c) goto L38;
    L23:
        Unsafe r6 = dz.a;
        if (r6.compareAndSwapObject(r5, x, r7, null) == true) goto L26;
        if (r6.getObjectVolatile(r5, r1) == r7) goto L23;
    L26:
        return (Runnable) r7;
    L38:
        return null;
    L21:
        return null;
    }

    public void h0(Runnable r2) {
        i0();
        if (j0(r2) == false) goto L8;
        Thread r1 = l0();
        if (Thread.currentThread() == r1) goto L10;
        LockSupport.unpark(r1);
        return;
    L10:
        return;
    L8:
        pk0.y.h0(r2);
    }

    public final void i0() {
        u.getClass();
        k21 r0 = (k21) dz.a.getObjectVolatile(this, w);
        if (r0 != null) goto L5;
        return;
    L5:
        if (lt4.b.get(r0) != 0) goto L7;
        return;
    L7:
        long r1 = System.nanoTime();
    L8:
        monitor-enter(r0);
        j21[] r3 = r0.a;     // Catch: Throwable -> L20
        j21 r4 = null;
        if (r3 == null) goto L13;
        j21 r5 = r3[0];     // Catch: Throwable -> L20
    L14:
        if (r5 != null) goto L18;
        monitor-exit(r0);
    L26:
        if (r4 != null) goto L8;
        return;
    L18:
        if ((r1 - r5.n) < 0) goto L22;
        boolean r6 = j0(r5);     // Catch: Throwable -> L20
    L23:
        if (r6 == false) goto L25;
        r4 = r0.b(0);     // Catch: Throwable -> L20
    L25:
        monitor-exit(r0);
        goto L26
    L22:
        r6 = false;
        goto L23
    L13:
        r5 = null;
    L20:
        th = move-exception;
        throw th;
    }

    public final boolean j0(Runnable r15) {
    L2:
        t.getClass();
        Unsafe r0 = dz.a;
        long r1 = x;
        Object r7 = r0.getObjectVolatile(this, r1);
        if (v.get(this) != 0) goto L4;
        if (r7 != null) goto L14;
    L7:
        Unsafe r8 = dz.a;
        l21 r9 = this;
        Runnable r13 = r15;
        l21 r4 = r9;
        if (r8.compareAndSwapObject(r9, x, null, r13) == true) goto L35;
        if (r8.getObjectVolatile(r4, r1) != null) goto L38;
        l21 this = r4;
        r15 = r13;
    L38:
        this = r4;
        r15 = r13;
    L35:
        return true;
    L14:
        r4 = this;
        r13 = r15;
        if ((r7 instanceof ce2) == false) goto L30;
        ce2 r14 = (ce2) r7;
        int r16 = r14.a(r13);
        if (r16 == 0) goto L35;
        if (r16 != 1) goto L20;
        ce2 r10 = r14.d();
    L23:
        Unsafe r3 = dz.a;
        if (r3.compareAndSwapObject(r4, x, r7, r10) == true) goto L38;
        if (r3.getObjectVolatile(r4, r1) == r7) goto L23;
    L20:
        if (r16 != 2) goto L38;
    L31:
        return false;
    L30:
        if (r7 == hw.c) goto L31;
        ce2 r11 = new ce2(8, true);
        r11.a((Runnable) r7);
        r11.a(r13);
    L33:
        Unsafe r5 = dz.a;
        if (r5.compareAndSwapObject(r4, x, r7, r11) == true) goto L35;
        if (r5.getObjectVolatile(r4, r1) == r7) goto L33;
    L4:
        return false;
    }

    public final long k0() {
        ii r0 = this.r;
        if (r0 != null) goto L6;
    L4:
        long r5 = Long.MAX_VALUE;
    L10:
        if (r5 == 0) goto L38;
        t.getClass();
        Unsafe r1 = dz.a;
        Object r6 = r1.getObjectVolatile(this, x);
        if (r6 != null) goto L15;
    L23:
        u.getClass();
        k21 r10 = (k21) r1.getObjectVolatile(this, w);
        if (r10 == null) goto L42;
        monitor-enter(r10);
        j21[] r2 = r10.a;     // Catch: Throwable -> L30
        if (r2 == null) goto L32;
        j21 r3 = r2[0];     // Catch: Throwable -> L30
    L33:
        monitor-exit(r10);
        if (r3 == null) goto L42;
        long r4 = r3.n - System.nanoTime();
        if (r4 < 0) goto L38;
        return r4;
    L32:
        r3 = null;
    L30:
        th = move-exception;
        throw th;
    L42:
        return Long.MAX_VALUE;
    L15:
        if ((r6 instanceof ce2) == false) goto L21;
        long r7 = ce2.f.get((ce2) r6);
        if (((int) (1073741823 & r7)) == ((int) ((r7 & 1152921503533105152L) >> 30))) goto L23;
        return 0;
    L21:
        if (r6 == hw.c) goto L42;
    L38:
        return 0;
    L6:
        if (r0.isEmpty() == true) goto L4;
        r5 = 0;
        goto L10
    }

    public abstract Thread l0();

    public final boolean m0() {
        ii r0 = this.r;
        if (r0 == null) goto L5;
        boolean r1 = r0.isEmpty();
    L7:
        if (r1 == false) goto L27;
        u.getClass();
        Unsafe r2 = dz.a;
        k21 r3 = (k21) r2.getObjectVolatile(this, w);
        if (r3 != null) goto L12;
    L15:
        t.getClass();
        Object r7 = r2.getObjectVolatile(this, x);
        if (r7 != null) goto L19;
    L26:
        return true;
    L19:
        if ((r7 instanceof ce2) == false) goto L25;
        long r4 = ce2.f.get((ce2) r7);
        if (((int) (1073741823 & r4)) != ((int) ((r4 & 1152921503533105152L) >> 30))) goto L23;
        return true;
    L23:
        return false;
    L25:
        if (r7 != hw.c) goto L27;
    L12:
        if (lt4.b.get(r3) == 0) goto L15;
        return false;
    L27:
        return false;
    L5:
        r1 = true;
        goto L7
    }

    public void n0(long r1, j21 r3) {
        pk0.y.q0(r1, r3);
    }

    public final void o0() {
        long r0 = System.nanoTime();
    L3:
        u.getClass();
        k21 r2 = (k21) dz.a.getObjectVolatile(this, w);
        if (r2 == null) goto L19;
        monitor-enter(r2);
    L10:
        th = move-exception;
        throw th;
    L7:
        if (lt4.b.get(r2) <= 0) goto L12;
        j21 r3 = r2.b(0);     // Catch: Throwable -> L10
    L13:
        monitor-exit(r2);
        if (r3 == null) goto L24;
        n0(r0, r3);
        goto L3
    L24:
        return;
    L12:
        r3 = null;
        goto L13
    }

    public final void p0() {
        t.getClass();
        Unsafe r0 = dz.a;
        r0.putObjectVolatile(this, x, null);
        u.getClass();
        r0.putObjectVolatile(this, w, null);
    }

    public final void q0(long r3, j21 r5) {
        int r0 = r0(r3, r5);
        if (r0 == 0) goto L14;
        if (r0 != 1) goto L7;
        n0(r3, r5);
        return;
    L7:
        if (r0 == 2) goto L21;
        kf2.o("unexpected result");
        return;
    L21:
        return;
    L14:
        if (s0(r5) == false) goto L19;
        Thread r2 = l0();
        if (Thread.currentThread() == r2) goto L20;
        LockSupport.unpark(r2);
        return;
    L20:
        return;
    }

    public final int r0(long r10, j21 r12) {
        if (v.get(this) == 0) goto L6;
        return 1;
    L6:
        u.getClass();
        Unsafe r0 = dz.a;
        long r1 = w;
        k21 r2 = (k21) r0.getObjectVolatile(this, r1);
        if (r2 != null) goto L16;
        k21 r8 = new k21();
        r8.c = r10;
    L9:
        Unsafe r3 = dz.a;
        l21 r4 = this;
        if (r3.compareAndSwapObject(r4, w, null, r8) == true) goto L14;
        if (r3.getObjectVolatile(r4, r1) != null) goto L14;
        l21 this = r4;
    L14:
        Object r9 = r3.getObjectVolatile(r4, r1);
        r9.getClass();
        r2 = (k21) r9;
    L18:
        return r12.b(r10, r2, r4);
    L16:
        r4 = this;
        goto L18
    }

    public final boolean s0(j21 r4) {
        u.getClass();
        k21 r3 = (k21) dz.a.getObjectVolatile(this, w);
        j21 r0 = null;
        if (r3 == null) goto L15;
        monitor-enter(r3);
        j21[] r2 = r3.a;     // Catch: Throwable -> L9
        if (r2 == null) goto L11;
        r0 = r2[0];     // Catch: Throwable -> L9
    L11:
        monitor-exit(r3);
    L9:
        th = move-exception;
        throw th;
    L15:
        if (r0 != r4) goto L18;
        return true;
    L18:
        return false;
    }

    @Override // defpackage.g21
    public void shutdown() {
        it4.a.set(null);
        v.set(this, 1);
        f0();
    L4:
        if (d0() <= 0) goto L4;
        o0();
    }
}
