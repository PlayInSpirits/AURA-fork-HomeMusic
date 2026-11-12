package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ve0 implements Executor, Closeable {
    public static final /* synthetic */ AtomicLongFieldUpdater u = null;
    public static final /* synthetic */ AtomicLongFieldUpdater v = null;
    public static final /* synthetic */ AtomicIntegerFieldUpdater w = null;
    public static final f01 x = null;
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    public final int n;
    public final int o;
    public final long p;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;
    public final String q;
    public final wi1 r;
    public final wi1 s;
    public final m04 t;

    static {
        u = AtomicLongFieldUpdater.newUpdater(ve0.class, "parkedWorkersStack$volatile");
        v = AtomicLongFieldUpdater.newUpdater(ve0.class, "controlState$volatile");
        w = AtomicIntegerFieldUpdater.newUpdater(ve0.class, "_isTerminated$volatile");
        x = new f01(1, "NOT_IN_STACK");
    }

    public ve0(int r3, int r4, long r5, String r7) {
        this.n = r3;
        this.o = r4;
        this.p = r5;
        this.q = r7;
        if (r3 >= 1) goto L5;
        kf2.e(b11.j(r3, "Core pool size ", " should be at least 1"));
        throw null;
    L5:
        if (r4 >= r3) goto L7;
        kf2.e(xa3.e(r4, r3, "Max pool size ", " should be greater than or equals to core pool size "));
        throw null;
    L7:
        if (r4 <= 2097150) goto L9;
        kf2.e(b11.j(r4, "Max pool size ", " should not exceed maximal supported number of threads 2097150"));
        throw null;
    L9:
        if (r5 <= 0) goto L13;
        this.r = new wi1();
        this.s = new wi1();
        this.t = new m04((r3 + 1) * 2);
        this.controlState$volatile = ((long) r3) << 42;
        this._isTerminated$volatile = 0;
        return;
    L13:
        throw new IllegalArgumentException(("Idle worker keep alive time " + r5 + " must be positive").toString());
    }

    public static /* synthetic */ void j(ve0 r1, Runnable r2, int r3) {
        if ((r3 & 4) == 0) goto L5;
        boolean r4 = false;
    L6:
        r1.f(r2, false, r4);
        return;
    L5:
        r4 = true;
        goto L6
    }

    public final int b() {
        m04 r0 = this.t;
        monitor-enter(r0);
    L37:
        th = move-exception;
        throw th;
    L6:
        if (w.get(this) == 0) goto L8;
        boolean r1 = true;
    L9:
        if (r1 == false) goto L13;
        monitor-exit(r0);
        return -1;
    L13:
        AtomicLongFieldUpdater r2 = v;     // Catch: Throwable -> L37
        long r4 = r2.get(this);     // Catch: Throwable -> L37
        int r8 = (int) (r4 & 2097151);     // Catch: Throwable -> L37
        int r5 = r8 - ((int) ((r4 & 4398044413952L) >> 21));     // Catch: Throwable -> L37
        if (r5 >= 0) goto L17;
        r5 = 0;
    L17:
        if (r5 < this.n) goto L21;
        monitor-exit(r0);
        return 0;
    L21:
        if (r8 < this.o) goto L24;
        monitor-exit(r0);
        return 0;
    L24:
        int r3 = ((int) (r2.get(this) & 2097151)) + 1;     // Catch: Throwable -> L37
        if (r3 <= 0) goto L40;
        if (this.t.b(r3) != null) goto L40;
        te0 r6 = new te0(this, r3);     // Catch: Throwable -> L37
        this.t.c(r3, r6);     // Catch: Throwable -> L37
        if (r3 != ((int) (2097151 & r2.incrementAndGet(this)))) goto L36;
        int r7 = r5 + 1;
        monitor-exit(r0);
        r6.start();
        return r7;
    L36:
        throw new IllegalArgumentException("Failed requirement.");     // Catch: Throwable -> L37
    L40:
        throw new IllegalArgumentException("Failed requirement.");     // Catch: Throwable -> L37
    L8:
        r1 = false;
        goto L9
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (w.compareAndSet(this, 0, 1) == true) goto L5;
        return;
    L5:
        Thread r0 = Thread.currentThread();
        te0 r3 = null;
        if ((r0 instanceof te0) == false) goto L8;
        te0 r1 = (te0) r0;
    L9:
        if (r1 != null) goto L11;
    L14:
        m04 r2 = this.t;
        monitor-enter(r2);
        int r4 = (int) (v.get(this) & 2097151);
        monitor-exit(r2);
        if (1 > r4) goto L29;
        int r5 = 1;
    L21:
        Object r6 = this.t.b(r5);
        r6.getClass();
        te0 r7 = (te0) r6;
        if (r7 != r3) goto L24;
    L27:
        if (r5 == r4) goto L29;
        r5 = r5 + 1;
    L24:
        if (r7.getState() == Thread.State.TERMINATED) goto L26;
        LockSupport.unpark(r7);
        r7.join(10000);
        goto L24
    L26:
        r7.n.d(this.s);
    L29:
        this.s.b();
        this.r.b();
    L30:
        if (r3 == null) goto L33;
        br4 r8 = r3.a(true);
        if (r8 == null) goto L33;
    L50:
        r8.run();     // Catch: Throwable -> L43
    L43:
        th = move-exception;
        Thread r9 = Thread.currentThread();
        r9.getUncaughtExceptionHandler().uncaughtException(r9, th);
    L33:
        r8 = (br4) this.r.d();
        if (r8 != null) goto L50;
        r8 = (br4) this.s.d();
        if (r8 != null) goto L50;
        if (r3 == null) goto L39;
        r3.h(ue0.r);
    L39:
        u.set(this, 0);
        v.set(this, 0);
        return;
    L45:
        th = move-exception;
        throw th;
    L11:
        if (r1.u != this) goto L14;
        r3 = r1;
        goto L14
    L8:
        r1 = null;
        goto L9
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable r2) {
        j(this, r2, 6);
    }

    public final void f(Runnable r8, boolean r9, boolean r10) {
        ir4.f.getClass();
        long r0 = System.nanoTime();
        if ((r8 instanceof br4) == false) goto L5;
        br4 r11 = (br4) r8;
        r11.n = r0;
        r11.o = r9;
    L6:
        boolean r12 = r11.o;
        AtomicLongFieldUpdater r1 = v;
        if (r12 == false) goto L9;
        long r2 = r1.addAndGet(this, 2097152);
    L10:
        Thread r3 = Thread.currentThread();
        te0 r5 = null;
        if ((r3 instanceof te0) == false) goto L13;
        te0 r4 = (te0) r3;
    L14:
        if (r4 != null) goto L16;
    L19:
        boolean r6 = true;
        if (r5 == null) goto L31;
        ue0 r7 = r5.p;
        if (r7 == ue0.r) goto L31;
        if (r11.o == false) goto L28;
    L30:
        r5.t = true;
        r11 = r5.n.a(r11, r10);
        goto L31
    L28:
        if (r7 != ue0.o) goto L30;
    L31:
        if (r11 != null) goto L33;
    L40:
        if (r10 == false) goto L43;
        if (r5 == null) goto L43;
    L44:
        if (r12 == false) goto L55;
        if (r6 == false) goto L48;
        return;
    L48:
        if (s() == false) goto L51;
        return;
    L51:
        if (q(r2) == true) goto L67;
        s();
        return;
    L67:
        return;
    L55:
        if (r6 == false) goto L58;
        return;
    L58:
        if (s() == false) goto L61;
        return;
    L61:
        if (q(r1.get(this)) == false) goto L63;
        return;
    L63:
        s();
        return;
    L43:
        r6 = false;
        goto L44
    L33:
        if (r11.o == false) goto L35;
        boolean r13 = this.s.a(r11);
    L36:
        if (r13 == true) goto L40;
        throw new RejectedExecutionException(b11.q(new StringBuilder(), this.q, " was terminated"));
    L35:
        r13 = this.r.a(r11);
        goto L36
    L16:
        if (r4.u != this) goto L19;
        r5 = r4;
        goto L19
    L13:
        r4 = null;
        goto L14
    L9:
        r2 = 0;
        goto L10
    L5:
        r11 = new er4(r8, r0, r9);
        goto L6
    }

    public final void n(te0 r8, int r9, int r10) {
    L2:
        long r3 = u.get(this);
        int r0 = (int) (2097151 & r3);
        long r1 = (2097152 + r3) & (-2097152);
        if (r0 != r9) goto L16;
        if (r10 != 0) goto L15;
        Object r2 = r8.c();
    L7:
        if (r2 == x) goto L8;
        if (r2 == null) goto L10;
        te0 r4 = (te0) r2;
        int r5 = r4.b();
        if (r5 != 0) goto L13;
        r2 = r4.c();
        goto L7
    L13:
        r0 = r5;
        goto L16
    L10:
        r0 = 0;
        goto L16
    L8:
        r0 = -1;
        goto L16
    L15:
        r0 = r10;
    L16:
        if (r0 < 0) goto L2;
        long r6 = ((long) r0) | r1;
        ve0 r7 = this;
        if (u.compareAndSet(r7, r3, r6) == true) goto L19;
        ve0 this = r7;
        goto L2
    }

    public final boolean q(long r4) {
        int r0 = ((int) (2097151 & r4)) - ((int) ((r4 & 4398044413952L) >> 21));
        if (r0 >= 0) goto L5;
        r0 = 0;
    L5:
        int r5 = this.n;
        if (r0 >= r5) goto L13;
        int r1 = b();
        if (r1 != 1) goto L11;
        if (r5 <= 1) goto L11;
        b();
    L11:
        if (r1 <= 0) goto L13;
        return true;
    L13:
        return false;
    }

    public final boolean s() {
    L2:
        long r3 = u.get(this);
        te0 r0 = (te0) this.t.b((int) (2097151 & r3));
        if (r0 == null) goto L4;
        long r1 = (2097152 + r3) & (-2097152);
        Object r5 = r0.c();
    L6:
        f01 r9 = x;
        if (r5 == r9) goto L8;
        if (r5 == null) goto L10;
        te0 r6 = (te0) r5;
        int r7 = r6.b();
        if (r7 != 0) goto L13;
        r5 = r6.c();
        r3 = r3;
    L13:
        if (r7 < 0) goto L2;
        ve0 r2 = this;
        boolean r11 = u.compareAndSet(r2, r3, ((long) r7) | r1);
        ve0 r4 = r2;
        if (r11 == false) goto L23;
        r0.g(r9);
    L17:
        if (r0 == null) goto L18;
        if (te0.v.compareAndSet(r0, -1, 0) == false) goto L23;
        LockSupport.unpark(r0);
        return true;
    L18:
        return false;
    L23:
        ve0 this = r4;
        goto L2
    L10:
        r7 = 0;
        goto L13
    L8:
        r7 = -1;
        goto L13
    L4:
        r0 = null;
        r4 = this;
        goto L17
    }

    public final String toString() {
        ArrayList r0 = new ArrayList();
        m04 r1 = this.t;
        int r2 = r1.a();
        int r3 = 0;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        int r8 = 0;
        int r9 = 1;
    L3:
        if (r9 >= r2) goto L26;
        te0 r10 = (te0) r1.b(r9);
        if (r10 == null) goto L25;
        int r11 = r10.n.c();
        int r12 = r10.p.ordinal();
        if (r12 == 0) goto L24;
        if (r12 != 1) goto L11;
        r5 = r5 + 1;
        StringBuilder r13 = new StringBuilder();
        r13.append(r11);
        r13.append('b');
        r0.add(r13.toString());
        goto L25
    L11:
        if (r12 != 2) goto L13;
        r6 = r6 + 1;
        goto L25
    L13:
        if (r12 != 3) goto L15;
        r7 = r7 + 1;
        if (r11 <= 0) goto L25;
        StringBuilder r14 = new StringBuilder();
        r14.append(r11);
        r14.append('d');
        r0.add(r14.toString());
        goto L25
    L15:
        if (r12 != 4) goto L17;
        r8 = r8 + 1;
        goto L25
    L17:
        er1.n();
        return null;
    L24:
        r3 = r3 + 1;
        StringBuilder r15 = new StringBuilder();
        r15.append(r11);
        r15.append('c');
        r0.add(r15.toString());
    L25:
        r9 = r9 + 1;
        goto L3
    L26:
        long r4 = v.get(this);
        StringBuilder r16 = new StringBuilder();
        r16.append(this.q);
        r16.append('@');
        r16.append(si0.x(this));
        r16.append("[Pool Size {core = ");
        int r17 = this.n;
        r16.append(r17);
        r16.append(", max = ");
        r16.append(this.o);
        r16.append("}, Worker States {CPU = ");
        r16.append(r3);
        r16.append(", blocking = ");
        r16.append(r5);
        r16.append(", parked = ");
        r16.append(r6);
        r16.append(", dormant = ");
        r16.append(r7);
        r16.append(", terminated = ");
        r16.append(r8);
        r16.append("}, running workers queues = ");
        r16.append(r0);
        r16.append(", global CPU queue size = ");
        r16.append(this.r.c());
        r16.append(", global blocking queue size = ");
        r16.append(this.s.c());
        r16.append(", Control State {created workers= ");
        r16.append((int) (2097151 & r4));
        r16.append(", blocking tasks = ");
        r16.append((int) ((4398044413952L & r4) >> 21));
        r16.append(", CPUs acquired = ");
        r16.append(r17 - ((int) ((r4 & 9223367638808264704L) >> 42)));
        r16.append("}]");
        return r16.toString();
    }
}
