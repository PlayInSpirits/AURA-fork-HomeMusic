package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class te0 extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater v = null;
    private volatile int indexInArray;
    public final ad5 n;
    private volatile Object nextParkedWorker;
    public final jx3 o;
    public ue0 p;
    public long q;
    public long r;
    public int s;
    public boolean t;
    public final /* synthetic */ ve0 u;
    private volatile /* synthetic */ int workerCtl$volatile;

    static {
        v = AtomicIntegerFieldUpdater.newUpdater(te0.class, "workerCtl$volatile");
    }

    public te0(ve0 r3, int r4) {
        this.u = r3;
        setDaemon(true);
        setContextClassLoader(ve0.class.getClassLoader());
        this.n = new ad5();
        this.o = new jx3();
        this.p = ue0.q;
        this.nextParkedWorker = ve0.x;
        int r5 = (int) System.nanoTime();
        if (r5 != 0) goto L6;
        r5 = 42;
    L6:
        this.s = r5;
        f(r4);
    }

    public final br4 a(boolean r11) {
        ue0 r0 = this.p;
        ve0 r2 = this.u;
        boolean r7 = true;
        ad5 r8 = this.n;
        ue0 r9 = ue0.n;
        if (r0 == r9) goto L18;
        AtomicLongFieldUpdater r1 = ve0.v;
    L6:
        long r3 = r1.get(r2);
        if (((int) ((9223367638808264704L & r3) >> 42)) == 0) goto L8;
        AtomicLongFieldUpdater r4 = ve0.v;
        if (r4.compareAndSet(r2, r3, r3 - 4398046511104L) == false) goto L6;
        this.p = r9;
        goto L18
    L8:
        br4 r12 = r8.g();
        if (r12 != null) goto L14;
        r12 = (br4) r2.s.d();
        if (r12 != null) goto L14;
        return i(1);
    L14:
        return r12;
    L18:
        if (r11 == true) goto L20;
        br4 r13 = e();
        if (r13 == null) goto L38;
        return r13;
    L38:
        return i(3);
    L20:
        if (d(r2.n * 2) == 0) goto L23;
        r7 = false;
    L23:
        if (r7 == false) goto L27;
        br4 r14 = e();
        if (r14 == null) goto L27;
        return r14;
    L27:
        br4 r15 = r8.e();
        if (r15 == null) goto L30;
        return r15;
    L30:
        if (r7 == true) goto L38;
        br4 r16 = e();
        if (r16 == null) goto L38;
        return r16;
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int r3) {
        int r0 = this.s;
        int r1 = r0 ^ (r0 << 13);
        int r2 = r1 ^ (r1 >> 17);
        int r4 = r2 ^ (r2 << 5);
        this.s = r4;
        int r5 = r3 - 1;
        if ((r5 & r3) != 0) goto L7;
        return r5 & r4;
    L7:
        return (Integer.MAX_VALUE & r4) % r3;
    }

    public final br4 e() {
        int r0 = d(2);
        ve0 r2 = this.u;
        wi1 r1 = r2.s;
        wi1 r3 = r2.r;
        if (r0 != 0) goto L9;
        br4 r4 = (br4) r3.d();
        if (r4 == null) goto L8;
        return r4;
    L8:
        return (br4) r1.d();
    L9:
        br4 r5 = (br4) r1.d();
        if (r5 == null) goto L13;
        return r5;
    L13:
        return (br4) r3.d();
    }

    public final void f(int r3) {
        StringBuilder r0 = new StringBuilder();
        r0.append(this.u.q);
        r0.append("-worker-");
        if (r3 != 0) goto L5;
        String r1 = "TERMINATED";
    L6:
        r0.append(r1);
        setName(r0.toString());
        this.indexInArray = r3;
        return;
    L5:
        r1 = String.valueOf(r3);
        goto L6
    }

    public final void g(Object r1) {
        this.nextParkedWorker = r1;
    }

    public final boolean h(ue0 r7) {
        ue0 r0 = this.p;
        if (r0 != ue0.n) goto L5;
        boolean r1 = true;
    L6:
        if (r1 == false) goto L8;
        ve0.v.addAndGet(this.u, 4398046511104L);
    L8:
        if (r0 == r7) goto L10;
        this.p = r7;
    L10:
        return r1;
    L5:
        r1 = false;
        goto L6
    }

    public final br4 i(int r23) {
        AtomicLongFieldUpdater r2 = ve0.v;
        ve0 r3 = this.u;
        int r4 = (int) (r2.get(r3) & 2097151);
        if (r4 >= 2) goto L5;
        return null;
    L5:
        int r5 = d(r4);
        int r9 = 0;
        long r10 = Long.MAX_VALUE;
    L7:
        if (r9 >= r4) goto L44;
        boolean r14 = true;
        r5 = r5 + 1;
        if (r5 <= r4) goto L11;
        r5 = 1;
    L11:
        te0 r15 = (te0) r3.t.b(r5);
        if (r15 == null) goto L42;
        if (r15 == this) goto L42;
        ad5 r16 = r15.n;
        if (r23 != 3) goto L17;
        br4 r6 = r16.f();
    L29:
        jx3 r17 = this.o;
        if (r6 == null) goto L33;
        r17.n = r6;
        long r7 = -1;
    L35:
        if (r7 == (-1)) goto L36;
        if (r7 <= 0) goto L42;
        r10 = Math.min(r10, r7);
        goto L42
    L36:
        br4 r0 = (br4) r17.n;
        r17.n = null;
        return r0;
    L33:
        r7 = r16.i(r23, r17);
        goto L35
    L17:
        r16.getClass();
        int r8 = ad5.d.get(r16);
        int r11 = ad5.c.get(r16);
        if (r23 == 1) goto L21;
        r14 = false;
    L21:
        if (r8 == r11) goto L25;
        if (r14 == true) goto L24;
    L26:
        int r12 = r8 + 1;
        r6 = r16.h(r8, r14);
        if (r6 != null) goto L29;
        r8 = r12;
        goto L21
    L24:
        if (ad5.e.get(r16) != 0) goto L26;
    L25:
        r6 = null;
    L42:
        r9 = r9 + 1;
        goto L7
    L44:
        if (r10 != Long.MAX_VALUE) goto L47;
        r10 = 0;
    L47:
        this.r = r10;
        return null;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
    L3:
        boolean r0 = false;
    L5:
        if (ve0.w.get(this.u) != 0) goto L95;
        ue0 r3 = this.p;
        ue0 r4 = ue0.r;
        if (r3 == r4) goto L95;
        br4 r5 = a(this.t);
        if (r5 != null) goto L11;
        this.t = false;
        if (this.r != 0) goto L38;
        Object r6 = this.nextParkedWorker;
        f01 r9 = ve0.x;
        if (r6 != r9) goto L43;
        ve0 r7 = this.u;
        if (this.nextParkedWorker != r9) goto L5;
        AtomicLongFieldUpdater r8 = ve0.u;
    L91:
        long r19 = r8.get(r7);
        int r10 = this.indexInArray;
        this.nextParkedWorker = r7.t.b((int) (r19 & 2097151));
        ve0 r18 = r7;
        if (ve0.u.compareAndSet(r18, r19, ((r19 + 2097152) & (-2097152)) | ((long) r10)) == true) goto L5;
        r7 = r18;
        goto L91
    L43:
        v.set(this, -1);
    L45:
        if (this.nextParkedWorker == ve0.x) goto L5;
        AtomicIntegerFieldUpdater r11 = v;
        if (r11.get(this) != (-1)) goto L5;
        ve0 r12 = this.u;
        AtomicIntegerFieldUpdater r13 = ve0.w;
        if (r13.get(r12) != 0) goto L5;
        ue0 r14 = this.p;
        ue0 r15 = ue0.r;
        if (r14 == r15) goto L5;
        h(ue0.p);
        Thread.interrupted();
        if (this.q != 0) goto L57;
        long r16 = 2097151;
        this.q = System.nanoTime() + this.u.p;
    L58:
        LockSupport.parkNanos(this.u.p);
        if ((System.nanoTime() - this.q) < 0) goto L45;
        this.q = 0;
        ve0 r17 = this.u;
        m04 r110 = r17.t;
        monitor-enter(r110);
        if (r13.get(r17) == 0) goto L65;
        boolean r20 = true;
    L66:
        if (r20 == true) goto L67;
        AtomicLongFieldUpdater r21 = ve0.v;     // Catch: Throwable -> L80
        if (((int) (r21.get(r17) & r16)) <= r17.n) goto L71;
        if (r11.compareAndSet(this, -1, 1) == false) goto L75;
        int r22 = this.indexInArray;     // Catch: Throwable -> L80
        f(0);     // Catch: Throwable -> L80
        r17.n(this, r22, 0);     // Catch: Throwable -> L80
        int r23 = (int) (r21.getAndDecrement(r17) & r16);     // Catch: Throwable -> L80
        if (r23 == r22) goto L82;
        Object r111 = r17.t.b(r23);     // Catch: Throwable -> L80
        r111.getClass();     // Catch: Throwable -> L80
        te0 r112 = (te0) r111;     // Catch: Throwable -> L80
        r17.t.c(r22, r112);     // Catch: Throwable -> L80
        r112.f(r22);     // Catch: Throwable -> L80
        r17.n(r112, r23, r22);     // Catch: Throwable -> L80
    L82:
        r17.t.c(r23, null);     // Catch: Throwable -> L80
        monitor-exit(r110);
        this.p = r15;
        goto L45
    L75:
        monitor-exit(r110);
        goto L45
    L71:
        monitor-exit(r110);
        goto L45
    L67:
        monitor-exit(r110);
        goto L45
    L65:
        r20 = false;
    L80:
        th = move-exception;
        throw th;
    L57:
        r16 = 2097151;
        goto L58
    L38:
        if (r0 == true) goto L40;
        r0 = true;
        goto L5
    L40:
        h(ue0.p);
        Thread.interrupted();
        LockSupport.parkNanos(this.r);
        this.r = 0;
        goto L3
    L11:
        this.r = 0;
        ve0 r24 = this.u;
        this.q = 0;
        if (this.p != ue0.p) goto L15;
        this.p = ue0.o;
    L15:
        if (r5.o == true) goto L17;
        r5.run();     // Catch: Throwable -> L34
    L34:
        th = move-exception;
        Thread r25 = Thread.currentThread();
        r25.getUncaughtExceptionHandler().uncaughtException(r25, th);
        goto L3
    L17:
        if (h(ue0.o) == true) goto L19;
    L101:
        r5.run();     // Catch: Throwable -> L27
    L29:
        ve0.v.addAndGet(r24, -2097152);
        if (this.p == r4) goto L3;
        this.p = ue0.q;
    L27:
        th = move-exception;
        Thread r26 = Thread.currentThread();
        r26.getUncaughtExceptionHandler().uncaughtException(r26, th);
        goto L29
    L19:
        if (r24.s() == true) goto L101;
        if (r24.q(ve0.v.get(r24)) == true) goto L101;
        r24.s();
    L95:
        h(ue0.r);
    }
}
