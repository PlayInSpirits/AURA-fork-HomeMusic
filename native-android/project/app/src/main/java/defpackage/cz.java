package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.CompletionHandlerException;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class cz extends or0 implements az, ye0, t85 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater s = null;
    public static final /* synthetic */ AtomicReferenceFieldUpdater t = null;
    public static final /* synthetic */ AtomicReferenceFieldUpdater u = null;
    public static final /* synthetic */ long v = 0;
    public static final /* synthetic */ long w = 0;
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    public final vd0 q;
    public final ne0 r;

    static {
        s = AtomicIntegerFieldUpdater.newUpdater(cz.class, "_decisionAndIndex$volatile");
        t = AtomicReferenceFieldUpdater.newUpdater(cz.class, Object.class, "_state$volatile");
        Unsafe r3 = dz.a;
        w = r3.objectFieldOffset(cz.class.getDeclaredField("_state$volatile"));
        u = AtomicReferenceFieldUpdater.newUpdater(cz.class, Object.class, "_parentHandle$volatile");
        v = r3.objectFieldOffset(cz.class.getDeclaredField("_parentHandle$volatile"));
    }

    public cz(int r1, vd0 r2) {
        super(r1);
        this.q = r2;
        this.r = r2.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = f5.a;
    }

    public static Object F(o63 r6, Object r7, int r8, xf1 r9) {
        if ((r7 instanceof a70) == false) goto L6;
        return r7;
    L6:
        if (r8 != 1) goto L8;
    L11:
        if (r9 != null) goto L16;
        if ((r6 instanceof wy) == true) goto L16;
        return r7;
    L16:
        if ((r6 instanceof wy) == false) goto L19;
        wy r10 = (wy) r6;
    L21:
        return new y60(r7, r10, r9, null, 16);
    L19:
        r10 = null;
        goto L21
    L8:
        if (r8 == 2) goto L11;
        return r7;
    }

    public static void z(Object r3, Object r4) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + r3 + ", already has " + r4).toString());
    }

    public String A() {
        return "CancellableContinuation";
    }

    public final void B() {
        vd0 r0 = this.q;
        if ((r0 instanceof mr0) == false) goto L5;
        mr0 r1 = (mr0) r0;
    L6:
        if (r1 == null) goto L12;
        Throwable r2 = r1.o(this);
        if (r2 == null) goto L13;
        m();
        r(r2);
        return;
    L13:
        return;
    L12:
        return;
    L5:
        r1 = null;
        goto L6
    }

    public final boolean C() {
        t.getClass();
        Unsafe r0 = dz.a;
        long r1 = w;
        Object r3 = r0.getObjectVolatile(this, r1);
        if ((r3 instanceof y60) == true) goto L5;
    L8:
        s.set(this, 536870911);
        r0.putObjectVolatile(this, r1, f5.a);
        return true;
    L5:
        if (((y60) r3).d == null) goto L8;
        m();
        return false;
    }

    public final void D(Object r10, int r11, xf1 r12) {
    L2:
        t.getClass();
        Unsafe r0 = dz.a;
        long r1 = w;
        Object r7 = r0.getObjectVolatile(this, r1);
        if ((r7 instanceof o63) == false) goto L16;
        Object r8 = F((o63) r7, r10, r11, r12);
    L5:
        Unsafe r3 = dz.a;
        cz r4 = this;
        if (r3.compareAndSwapObject(r4, w, r7, r8) == true) goto L8;
        if (r3.getObjectVolatile(r4, r1) != r7) goto L14;
        cz this = r4;
        goto L5
    L14:
        this = r4;
        goto L2
    L8:
        if (r4.y() == true) goto L10;
        r4.m();
    L10:
        r4.n(r11);
        return;
    L16:
        cz r5 = this;
        if ((r7 instanceof hz) == false) goto L23;
        hz r9 = (hz) r7;
        if (hz.c.compareAndSet(r9, 0, 1) == false) goto L23;
        if (r12 == null) goto L28;
        r5.j(r12, r9.a, r10);
        return;
    L28:
        return;
    L23:
        mj0.g(r10, "Already resumed, but proposed with update ");
    }

    public final void E(pe0 r4) {
        vd0 r0 = this.q;
        if ((r0 instanceof mr0) == false) goto L5;
        mr0 r1 = (mr0) r0;
    L6:
        if (r1 == null) goto L8;
        pe0 r2 = r1.q;
    L9:
        if (r2 != r4) goto L11;
        int r5 = 4;
    L12:
        D(j15.a, r5, null);
        return;
    L11:
        r5 = this.p;
        goto L12
    L8:
        r2 = null;
        goto L9
    L5:
        r1 = null;
        goto L6
    }

    public final f01 G(Object r11, xf1 r12) {
        f01 r0 = vr1.a;
    L3:
        t.getClass();
        Unsafe r1 = dz.a;
        long r2 = w;
        Object r8 = r1.getObjectVolatile(this, r2);
        if ((r8 instanceof o63) == false) goto L16;
        Object r9 = F((o63) r8, r11, this.p, r12);
    L6:
        Unsafe r4 = dz.a;
        cz r5 = this;
        if (r4.compareAndSwapObject(r5, w, r8, r9) == true) goto L9;
        if (r4.getObjectVolatile(r5, r2) != r8) goto L14;
        cz this = r5;
        goto L6
    L14:
        this = r5;
        goto L3
    L9:
        if (r5.y() == true) goto L11;
        r5.m();
    L11:
        return r0;
    L16:
        return null;
    }

    @Override // defpackage.t85
    public final void a(u84 r5, int r6) {
    L2:
        AtomicIntegerFieldUpdater r0 = s;
        int r1 = r0.get(this);
        if ((r1 & 536870911) != 536870911) goto L8;
        if (r0.compareAndSet(this, r1, ((r1 >> 29) << 29) + r6) == false) goto L2;
        x(r5);
        return;
    L8:
        kf2.o("invokeOnCancellation should be called at most once");
    }

    @Override // defpackage.or0
    public final void b(CancellationException r11) {
    L2:
        t.getClass();
        Unsafe r0 = dz.a;
        long r1 = w;
        Object r7 = r0.getObjectVolatile(this, r1);
        if ((r7 instanceof o63) == true) goto L35;
        if ((r7 instanceof a70) == true) goto L45;
        if ((r7 instanceof y60) == false) goto L27;
        y60 r2 = (y60) r7;
        if (r2.e != null) goto L25;
        y60 r8 = y60.a(r2, null, r11, 15);
    L12:
        Unsafe r3 = dz.a;
        cz r4 = this;
        if (r3.compareAndSwapObject(r4, w, r7, r8) == true) goto L14;
        if (r3.getObjectVolatile(r4, r1) != r7) goto L23;
        cz this = r4;
        goto L12
    L23:
        CancellationException r10 = r11;
        cz r5 = r4;
    L33:
        r11 = r10;
        this = r5;
        goto L2
    L14:
        wy r12 = r2.b;
        if (r12 == null) goto L17;
        r4.i(r12, r11);
    L17:
        xf1 r13 = r2.c;
        if (r13 == null) goto L30;
        r4.j(r13, r11, r2.a);
        return;
    L30:
        return;
    L25:
        kf2.o("Must be called at most once");
        return;
    L27:
        cz r9 = this;
        wy r6 = null;
        CancellationException r14 = r11;
        y60 r15 = new y60(r7, r6, null, r14, 14);
        r10 = r14;
    L28:
        y60 r16 = r15;
        Unsafe r17 = dz.a;
        r5 = r9;
        boolean r18 = r17.compareAndSwapObject(r5, w, r7, r16);
        r15 = r16;
        if (r18 == true) goto L46;
        if (r17.getObjectVolatile(r5, r1) != r7) goto L33;
        r9 = r5;
        goto L28
    L46:
        return;
    L45:
        return;
    L35:
        kf2.o("Not completed");
    }

    @Override // defpackage.az
    public final f01 c(Object r1, xf1 r2) {
        return G(r1, r2);
    }

    @Override // defpackage.or0
    public final vd0 d() {
        return this.q;
    }

    @Override // defpackage.or0
    public final Throwable e(Object r1) {
        Throwable r0 = super.e(r1);
        if (r0 == null) goto L5;
        return r0;
    L5:
        return null;
    }

    @Override // defpackage.or0
    public final Object f(Object r1) {
        if ((r1 instanceof y60) == true) goto L5;
        return r1;
    L5:
        return ((y60) r1).a;
    }

    @Override // defpackage.ye0
    public final ye0 getCallerFrame() {
        vd0 r1 = this.q;
        if ((r1 instanceof ye0) == true) goto L5;
        return null;
    L5:
        return (ye0) r1;
    }

    @Override // defpackage.vd0
    public final ne0 getContext() {
        return this.r;
    }

    @Override // defpackage.or0
    public final Object h() {
        return s();
    }

    public final void i(wy r3, Throwable r4) {
    L8:
        th = move-exception;
        uc5.s(this.r, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th));
        return;
    L3:
        switch(r3.a) {
            case 0: goto L6;
            case 1: goto L5;
            default: goto L4;
        };     // Catch: Throwable -> L8
    L4:
        ((as0) r3.b).a();     // Catch: Throwable -> L8
        return;
    L5:
        ((if1) r3.b).invoke(r4);     // Catch: Throwable -> L8
        return;
    L6:
        ((ScheduledFuture) r3.b).cancel(false);     // Catch: Throwable -> L8
    }

    public final void j(xf1 r3, Throwable r4, Object r5) {
        ne0 r0 = this.r;
        r3.a(r4, r5, r0);     // Catch: Throwable -> L5
        return;
    L5:
        th = move-exception;
        uc5.s(r0, new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th));
    }

    @Override // defpackage.az
    public final void k(Object r2, xf1 r3) {
        D(r2, this.p, r3);
    }

    public final void l(u84 r4, Throwable r5) {
        ne0 r6 = this.r;
        int r0 = s.get(this) & 536870911;
        if (r0 != 536870911) goto L11;
        kf2.o("The index for Segment.onCancellation(..) is broken");
        return;
    L11:
        r4.l(r0, r6);     // Catch: Throwable -> L6
        return;
    L6:
        th = move-exception;
        uc5.s(r6, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th));
    }

    public final void m() {
        as0 r0 = p();
        if (r0 != null) goto L5;
        return;
    L5:
        r0.a();
        u.getClass();
        dz.a.putObjectVolatile(this, v, k63.n);
    }

    public final void n(int r7) {
    L2:
        AtomicIntegerFieldUpdater r0 = s;
        int r1 = r0.get(this);
        int r2 = r1 >> 29;
        if (r2 != 0) goto L5;
        if (r0.compareAndSet(this, r1, 1073741824 + (536870911 & r1)) == false) goto L2;
        return;
    L5:
        if (r2 != 1) goto L46;
        boolean r3 = false;
        if (r7 != 4) goto L9;
        boolean r4 = true;
    L10:
        vd0 r5 = this.q;
        if (r4 == false) goto L13;
    L44:
        wr1.P(this, r5, r4);
        return;
    L13:
        if ((r5 instanceof mr0) == false) goto L44;
        if (r7 == 1) goto L19;
        if (r7 == 2) goto L19;
        boolean r8 = false;
    L20:
        int r6 = this.p;
        if (r6 == 1) goto L23;
        if (r6 == 2) goto L23;
    L24:
        if (r8 != r3) goto L44;
        mr0 r9 = (mr0) r5;
        pe0 r10 = r9.q;
        ne0 r11 = r9.r.getContext();
        if (r10.Y(r11) == false) goto L29;
        r10.W(r11, this);
        return;
    L29:
        g21 r12 = it4.a();
        if (r12.p < 4294967296L) goto L33;
        r12.b0(this);
        return;
    L33:
        r12.c0(true);
        wr1.P(this, r5, true);     // Catch: Throwable -> L38
    L35:
        if (r12.e0() == true) goto L35;
    L37:
        r12.a0(true);
        return;
    L38:
        th = move-exception;
        g(th);     // Catch: Throwable -> L41
    L41:
        th = move-exception;
        r12.a0(true);
        throw th;
    L23:
        r3 = true;
    L19:
        r8 = true;
        goto L20
    L9:
        r4 = false;
        goto L10
    L46:
        kf2.o("Already resumed");
    }

    public Throwable o(a32 r1) {
        return r1.q();
    }

    public final as0 p() {
        u.getClass();
        return (as0) dz.a.getObjectVolatile(this, v);
    }

    public final Object q() {
        boolean r0 = y();
    L3:
        AtomicIntegerFieldUpdater r1 = s;
        int r2 = r1.get(this);
        int r3 = r2 >> 29;
        if (r3 != 0) goto L6;
        if (r1.compareAndSet(this, r2, 536870912 + (536870911 & r2)) == false) goto L3;
        if (p() != null) goto L32;
        v();
    L32:
        if (r0 == false) goto L35;
        B();
    L35:
        return xe0.n;
    L6:
        if (r3 != 2) goto L25;
        if (r0 == false) goto L9;
        B();
    L9:
        Object r4 = s();
        if ((r4 instanceof a70) == true) goto L24;
        int r5 = this.p;
        if (r5 == 1) goto L14;
        if (r5 == 2) goto L14;
    L22:
        return f(r4);
    L14:
        s22 r6 = (s22) this.r.K(fz0.h0);
        if (r6 == null) goto L22;
        if (r6.b() == true) goto L22;
        CancellationException r7 = r6.q();
        b(r7);
        throw r7;
    L24:
        throw ((a70) r4).a;
    L25:
        kf2.o("Already suspended");
        return null;
    }

    @Override // defpackage.az
    public final boolean r(Throwable r11) {
    L2:
        t.getClass();
        Unsafe r0 = dz.a;
        long r1 = w;
        Object r7 = r0.getObjectVolatile(this, r1);
        boolean r3 = false;
        if ((r7 instanceof o63) == false) goto L4;
        if ((r7 instanceof wy) == false) goto L8;
    L9:
        r3 = true;
    L10:
        hz r8 = new hz(this, r11, r3);
    L11:
        Unsafe r4 = dz.a;
        cz r5 = this;
        if (r4.compareAndSwapObject(r5, w, r7, r8) == true) goto L13;
        if (r4.getObjectVolatile(r5, r1) != r7) goto L26;
        cz this = r5;
        goto L11
    L26:
        this = r5;
        goto L2
    L13:
        o63 r10 = (o63) r7;
        if ((r10 instanceof wy) == false) goto L17;
        r5.i((wy) r7, r11);
    L20:
        if (r5.y() == true) goto L22;
        r5.m();
    L22:
        r5.n(r5.p);
        return true;
    L17:
        if ((r10 instanceof u84) == false) goto L20;
        r5.l((u84) r7, r11);
        goto L20
    L8:
        if ((r7 instanceof u84) == false) goto L10;
    L4:
        return false;
    }

    @Override // defpackage.vd0
    public final void resumeWith(Object r3) {
        Throwable r0 = bb3.a(r3);
        if (r0 == null) goto L6;
        r3 = new a70(r0, false);
    L6:
        D(r3, this.p, null);
    }

    public final Object s() {
        t.getClass();
        return dz.a.getObjectVolatile(this, w);
    }

    @Override // defpackage.az
    public final void t(Object r1) {
        n(this.p);
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append(A());
        r0.append('(');
        r0.append(si0.P(this.q));
        r0.append("){");
        Object r1 = s();
        if ((r1 instanceof o63) == false) goto L6;
        String r2 = "Active";
    L9:
        r0.append(r2);
        r0.append("}@");
        r0.append(si0.x(this));
        return r0.toString();
    L6:
        if ((r1 instanceof hz) == false) goto L8;
        r2 = "Cancelled";
        goto L9
    L8:
        r2 = "Completed";
        goto L9
    }

    public final void u() {
        as0 r0 = v();
        if (r0 != null) goto L6;
        return;
    L6:
        if ((s() instanceof o63) == true) goto L9;
        r0.a();
        u.getClass();
        dz.a.putObjectVolatile(this, v, k63.n);
        return;
    }

    public final as0 v() {
        s22 r0 = (s22) this.r.K(fz0.h0);
        if (r0 != null) goto L6;
        return null;
    L6:
        as0 r8 = gb.K(r0, true, new b20(this));
    L7:
        u.getClass();
        Unsafe r3 = dz.a;
        long r5 = v;
        cz r4 = this;
        if (r3.compareAndSwapObject(r4, r5, null, r8) == true) goto L12;
        if (r3.getObjectVolatile(r4, r5) != null) goto L12;
        cz this = r4;
    L12:
        return r8;
    }

    public final void w(if1 r3) {
        x(new wy(1, r3));
    }

    public final void x(o63 r11) {
    L2:
        t.getClass();
        Unsafe r0 = dz.a;
        long r1 = w;
        Object r7 = r0.getObjectVolatile(this, r1);
        if ((r7 instanceof f5) == false) goto L11;
    L4:
        Unsafe r3 = dz.a;
        cz r4 = this;
        if (r3.compareAndSwapObject(r4, w, r7, r11) == true) goto L76;
        if (r3.getObjectVolatile(r4, r1) != r7) goto L58;
        cz this = r4;
    L58:
        this = r4;
        goto L2
    L76:
        return;
    L11:
        r4 = this;
        if ((r7 instanceof wy) == true) goto L60;
        if ((r7 instanceof u84) == true) goto L60;
        if ((r7 instanceof a70) == true) goto L17;
        if ((r7 instanceof y60) == false) goto L49;
        y60 r10 = (y60) r7;
        if (r10.b != null) goto L47;
        if ((r11 instanceof u84) == true) goto L35;
        r11.getClass();
        wy r5 = (wy) r11;
        Throwable r6 = r10.e;
        if (r6 != null) goto L38;
        y60 r8 = y60.a(r10, r5, null, 29);
    L41:
        Unsafe r9 = dz.a;
        cz r12 = r4;
        if (r9.compareAndSwapObject(r4, w, r7, r8) == true) goto L77;
        r4 = r12;
        if (r9.getObjectVolatile(r12, r1) == r7) goto L41;
    L77:
        return;
    L38:
        r4.i(r5, r6);
        return;
    L35:
        return;
    L47:
        z(r11, r7);
        throw null;
    L49:
        cz r13 = r4;
        if ((r11 instanceof u84) == true) goto L51;
        r11.getClass();
        xf1 r14 = null;
        y60 r15 = new y60(r7, (wy) r11, r14, null, 28);
    L53:
        y60 r16 = r15;
        Unsafe r17 = dz.a;
        r4 = r13;
        boolean r18 = r17.compareAndSwapObject(r4, w, r7, r16);
        r15 = r16;
        if (r18 == true) goto L78;
        if (r17.getObjectVolatile(r4, r1) != r7) goto L58;
        r13 = r4;
        goto L53
    L78:
        return;
    L51:
        return;
    L17:
        a70 r19 = (a70) r7;
        if (a70.b.compareAndSet(r19, 0, 1) == true) goto L20;
        z(r11, r7);
        throw null;
    L20:
        if ((r7 instanceof hz) == false) goto L55;
        Throwable r110 = r19.a;
        if ((r11 instanceof wy) == false) goto L25;
        r4.i((wy) r11, r110);
        return;
    L25:
        r11.getClass();
        r4.l((u84) r11, r110);
        return;
    L55:
        return;
    L60:
        z(r11, r7);
        throw null;
    }

    public final boolean y() {
        if (this.p == 2) goto L5;
        return false;
    L5:
        if (((mr0) this.q).m() == false) goto L10;
        return true;
    L10:
        return false;
    }
}
