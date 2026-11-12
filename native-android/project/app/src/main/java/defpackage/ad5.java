package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ad5 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = null;
    public static final /* synthetic */ AtomicIntegerFieldUpdater c = null;
    public static final /* synthetic */ AtomicIntegerFieldUpdater d = null;
    public static final /* synthetic */ AtomicIntegerFieldUpdater e = null;
    public static final /* synthetic */ long f = 0;
    public final AtomicReferenceArray a;
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    static {
        b = AtomicReferenceFieldUpdater.newUpdater(ad5.class, Object.class, "lastScheduledTask$volatile");
        f = dz.a.objectFieldOffset(ad5.class.getDeclaredField("lastScheduledTask$volatile"));
        c = AtomicIntegerFieldUpdater.newUpdater(ad5.class, "producerIndex$volatile");
        d = AtomicIntegerFieldUpdater.newUpdater(ad5.class, "consumerIndex$volatile");
        e = AtomicIntegerFieldUpdater.newUpdater(ad5.class, "blockingTasksInBuffer$volatile");
    }

    public ad5() {
        this.a = new AtomicReferenceArray(128);
    }

    public final br4 a(br4 r3, boolean r4) {
        if (r4 == true) goto L4;
        b.getClass();
        br4 r5 = (br4) dz.a.getAndSetObject(this, f, r3);
        if (r5 != null) goto L10;
        return null;
    L10:
        return b(r5);
    L4:
        return b(r3);
    }

    public final br4 b(br4 r5) {
        AtomicIntegerFieldUpdater r0 = c;
        if ((r0.get(this) - d.get(this)) != 127) goto L6;
        return r5;
    L6:
        if (r5.o == false) goto L8;
        e.incrementAndGet(this);
    L8:
        int r1 = r0.get(this) & 127;
    L9:
        AtomicReferenceArray r2 = this.a;
        if (r2.get(r1) == null) goto L12;
        Thread.yield();
        goto L9
    L12:
        r2.lazySet(r1, r5);
        r0.incrementAndGet(this);
        return null;
    }

    public final int c() {
        b.getClass();
        Object r0 = dz.a.getObjectVolatile(this, f);
        AtomicIntegerFieldUpdater r1 = d;
        AtomicIntegerFieldUpdater r2 = c;
        if (r0 == null) goto L7;
        return (r2.get(this) - r1.get(this)) + 1;
    L7:
        return r2.get(this) - r1.get(this);
    }

    public final void d(wi1 r5) {
        b.getClass();
        br4 r0 = (br4) dz.a.getAndSetObject(this, f, null);
        if (r0 == null) goto L5;
        r5.a(r0);
    L5:
        br4 r1 = f();
        if (r1 == null) goto L7;
        r5.a(r1);
        goto L5
    }

    public final br4 e() {
        b.getClass();
        br4 r0 = (br4) dz.a.getAndSetObject(this, f, null);
        if (r0 == null) goto L5;
        return r0;
    L5:
        return f();
    }

    public final br4 f() {
    L2:
        AtomicIntegerFieldUpdater r0 = d;
        int r1 = r0.get(this);
        if ((r1 - c.get(this)) == 0) goto L4;
        int r2 = r1 & 127;
        if (r0.compareAndSet(this, r1, r1 + 1) == false) goto L2;
        br4 r3 = (br4) this.a.getAndSet(r2, null);
        if (r3 == null) goto L2;
        if (r3.o == false) goto L13;
        e.decrementAndGet(this);
    L13:
        return r3;
    L4:
        return null;
    }

    public final br4 g() {
    L2:
        b.getClass();
        Unsafe r0 = dz.a;
        long r1 = f;
        br4 r7 = (br4) r0.getObjectVolatile(this, r1);
        if (r7 == null) goto L4;
        if (r7.o != true) goto L4;
    L7:
        Unsafe r3 = dz.a;
        ad5 r4 = this;
        if (r3.compareAndSwapObject(r4, f, r7, null) == true) goto L9;
        if (r3.getObjectVolatile(r4, r1) != r7) goto L12;
        ad5 this = r4;
        goto L7
    L12:
        this = r4;
        goto L2
    L9:
        return r7;
    L4:
        ad5 r5 = this;
        int r9 = d.get(r5);
        int r2 = c.get(r5);
    L15:
        if (r9 == r2) goto L32;
        if (e.get(r5) == 0) goto L22;
        r2 = r2 - 1;
        br4 r6 = r5.h(r2, true);
        if (r6 == null) goto L15;
        return r6;
    L22:
        return null;
    L32:
        return null;
    }

    public final br4 h(int r5, boolean r6) {
        int r7 = r5 & 127;
        AtomicReferenceArray r0 = this.a;
        br4 r1 = (br4) r0.get(r7);
        if (r1 != null) goto L5;
    L13:
        return null;
    L5:
        if (r1.o != r6) goto L13;
    L7:
        if (r0.compareAndSet(r7, r1, null) == true) goto L8;
        if (r0.get(r7) == r1) goto L7;
    L8:
        if (r6 == false) goto L10;
        e.decrementAndGet(this);
    L10:
        return r1;
    }

    public final long i(int r10, jx3 r11) {
    L2:
        b.getClass();
        Unsafe r0 = dz.a;
        long r1 = f;
        br4 r7 = (br4) r0.getObjectVolatile(this, r1);
        if (r7 == null) goto L11;
        if (r7.o == false) goto L8;
        int r2 = 1;
    L10:
        if ((r2 & r10) == 0) goto L30;
        ir4.f.getClass();
        long r3 = System.nanoTime() - r7.n;
        long r5 = ir4.b;
        if (r3 < r5) goto L16;
    L17:
        Unsafe r4 = dz.a;
        ad5 r6 = this;
        if (r4.compareAndSwapObject(r6, f, r7, null) == true) goto L19;
        if (r4.getObjectVolatile(r6, r1) != r7) goto L23;
        ad5 this = r6;
        goto L17
    L23:
        this = r6;
        goto L2
    L19:
        r11.n = r7;
        return -1;
    L16:
        return r5 - r3;
    L30:
        return -2;
    L8:
        r2 = 2;
        goto L10
    L11:
        return -2;
    }
}
