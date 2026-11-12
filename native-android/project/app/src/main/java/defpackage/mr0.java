package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mr0 extends or0 implements ye0, vd0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater u = null;
    public static final /* synthetic */ long v = 0;
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public final pe0 q;
    public final wd0 r;
    public Object s;
    public final Object t;

    static {
        u = AtomicReferenceFieldUpdater.newUpdater(mr0.class, Object.class, "_reusableCancellableContinuation$volatile");
        v = dz.a.objectFieldOffset(mr0.class.getDeclaredField("_reusableCancellableContinuation$volatile"));
    }

    public mr0(pe0 r2, wd0 r3) {
        super(-1);
        this.q = r2;
        this.r = r3;
        this.s = uc5.a;
        this.t = te5.O(r3.getContext());
    }

    @Override // defpackage.or0
    public final vd0 d() {
        return this;
    }

    @Override // defpackage.ye0
    public final ye0 getCallerFrame() {
        return this.r;
    }

    @Override // defpackage.vd0
    public final ne0 getContext() {
        return this.r.getContext();
    }

    @Override // defpackage.or0
    public final Object h() {
        Object r0 = this.s;
        this.s = uc5.a;
        return r0;
    }

    public final void i() {
    L2:
        u.getClass();
        if (dz.a.getObjectVolatile(this, v) == uc5.b) goto L2;
    }

    public final cz j() {
        f01 r5 = uc5.b;
    L3:
        u.getClass();
        Unsafe r0 = dz.a;
        long r6 = v;
        Object r4 = r0.getObjectVolatile(this, r6);
        if (r4 == null) goto L5;
        if ((r4 instanceof cz) == false) goto L17;
    L9:
        Unsafe r1 = dz.a;
        mr0 r2 = this;
        boolean r9 = r1.compareAndSwapObject(r2, v, r4, r5);
        mr0 r3 = r2;
        if (r9 == true) goto L12;
        if (r1.getObjectVolatile(r3, r6) != r4) goto L24;
        mr0 this = r3;
    L24:
        this = r3;
        goto L3
    L12:
        return (cz) r4;
    L17:
        r3 = this;
        if (r4 == r5) goto L24;
        if ((r4 instanceof Throwable) == true) goto L24;
        mj0.g(r4, "Inconsistent state ");
        return null;
    L5:
        r0.putObjectVolatile(this, r6, r5);
        return null;
    }

    public final cz l() {
        u.getClass();
        Object r3 = dz.a.getObjectVolatile(this, v);
        if ((r3 instanceof cz) == true) goto L5;
        return null;
    L5:
        return (cz) r3;
    }

    public final boolean m() {
        u.getClass();
        if (dz.a.getObjectVolatile(this, v) == null) goto L6;
        return true;
    L6:
        return false;
    }

    public final boolean n(Throwable r15) {
    L2:
        u.getClass();
        Unsafe r0 = dz.a;
        long r1 = v;
        Object r7 = r0.getObjectVolatile(this, r1);
        f01 r12 = uc5.b;
        if (h12.c(r7, r12) == false) goto L11;
    L4:
        Unsafe r8 = dz.a;
        mr0 r9 = this;
        Throwable r13 = r15;
        mr0 r4 = r9;
        if (r8.compareAndSwapObject(r9, v, r12, r13) == true) goto L13;
        if (r8.getObjectVolatile(r4, r1) != r12) goto L21;
        mr0 this = r4;
        r15 = r13;
    L21:
        this = r4;
        r15 = r13;
        goto L2
    L13:
        return true;
    L11:
        r4 = this;
        r13 = r15;
        if ((r7 instanceof Throwable) == true) goto L28;
    L15:
        Unsafe r3 = dz.a;
        if (r3.compareAndSwapObject(r4, v, r7, null) == true) goto L17;
        if (r3.getObjectVolatile(r4, r1) == r7) goto L15;
    L17:
        return false;
    L28:
        return true;
    }

    public final Throwable o(cz r15) {
    L2:
        u.getClass();
        Unsafe r0 = dz.a;
        long r1 = v;
        Object r7 = r0.getObjectVolatile(this, r1);
        f01 r12 = uc5.b;
        if (r7 != r12) goto L11;
    L4:
        Unsafe r8 = dz.a;
        mr0 r9 = this;
        cz r13 = r15;
        if (r8.compareAndSwapObject(r9, v, r12, r13) == true) goto L6;
        if (r8.getObjectVolatile(r9, r1) != r12) goto L9;
        mr0 this = r9;
        r15 = r13;
        goto L4
    L9:
        this = r9;
        r15 = r13;
        goto L2
    L6:
        return null;
    L11:
        mr0 r4 = this;
        if ((r7 instanceof Throwable) == false) goto L22;
    L13:
        Unsafe r3 = dz.a;
        if (r3.compareAndSwapObject(r4, v, r7, null) == true) goto L16;
        if (r3.getObjectVolatile(r4, r1) == r7) goto L13;
        kf2.n("Failed requirement.");
        return null;
    L16:
        return (Throwable) r7;
    L22:
        mj0.g(r7, "Inconsistent state ");
        return null;
    }

    @Override // defpackage.vd0
    public final void resumeWith(Object r9) {
        Throwable r0 = bb3.a(r9);
        if (r0 != null) goto L5;
        Object r2 = r9;
    L6:
        wd0 r1 = this.r;
        ne0 r3 = r1.getContext();
        pe0 r4 = this.q;
        if (r4.Y(r3) == false) goto L10;
        this.s = r2;
        this.p = 0;
        r4.W(r1.getContext(), this);
        return;
    L10:
        g21 r5 = it4.a();
        if (r5.p < 4294967296L) goto L14;
        this.s = r2;
        this.p = 0;
        r5.b0(this);
        return;
    L14:
        r5.c0(true);
        ne0 r6 = r1.getContext();     // Catch: Throwable -> L21
        Object r7 = te5.R(r6, this.t);     // Catch: Throwable -> L21
        r1.resumeWith(r9);     // Catch: Throwable -> L23
        te5.K(r6, r7);     // Catch: Throwable -> L21
    L19:
        if (r5.e0() == true) goto L19;
    L20:
        r5.a0(true);
        return;
    L23:
        th = move-exception;
        te5.K(r6, r7);     // Catch: Throwable -> L21
        throw th;     // Catch: Throwable -> L21
    L21:
        th = move-exception;
        g(th);     // Catch: Throwable -> L29
    L29:
        th = move-exception;
        r5.a0(true);
        throw th;
    L5:
        r2 = new a70(r0, false);
        goto L6
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.q + ", " + si0.P(this.r) + ']';
    }
}
