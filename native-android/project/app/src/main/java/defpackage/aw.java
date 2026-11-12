package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.channels.ClosedReceiveChannelException;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class aw implements y00 {
    public static final /* synthetic */ long A = 0;
    public static final /* synthetic */ long B = 0;
    public static final /* synthetic */ AtomicLongFieldUpdater o = null;
    public static final /* synthetic */ AtomicLongFieldUpdater p = null;
    public static final /* synthetic */ AtomicLongFieldUpdater q = null;
    public static final /* synthetic */ AtomicLongFieldUpdater r = null;
    public static final /* synthetic */ AtomicReferenceFieldUpdater s = null;
    public static final /* synthetic */ AtomicReferenceFieldUpdater t = null;
    public static final /* synthetic */ AtomicReferenceFieldUpdater u = null;
    public static final /* synthetic */ AtomicReferenceFieldUpdater v = null;
    public static final /* synthetic */ AtomicReferenceFieldUpdater w = null;
    public static final /* synthetic */ long x = 0;
    public static final /* synthetic */ long y = 0;
    public static final /* synthetic */ long z = 0;
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    public final int n;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    static {
        o = AtomicLongFieldUpdater.newUpdater(aw.class, "sendersAndCloseStatus$volatile");
        p = AtomicLongFieldUpdater.newUpdater(aw.class, "receivers$volatile");
        q = AtomicLongFieldUpdater.newUpdater(aw.class, "bufferEnd$volatile");
        r = AtomicLongFieldUpdater.newUpdater(aw.class, "completedExpandBuffersAndPauseFlag$volatile");
        s = AtomicReferenceFieldUpdater.newUpdater(aw.class, Object.class, "sendSegment$volatile");
        Unsafe r3 = dz.a;
        B = r3.objectFieldOffset(aw.class.getDeclaredField("sendSegment$volatile"));
        t = AtomicReferenceFieldUpdater.newUpdater(aw.class, Object.class, "receiveSegment$volatile");
        A = r3.objectFieldOffset(aw.class.getDeclaredField("receiveSegment$volatile"));
        u = AtomicReferenceFieldUpdater.newUpdater(aw.class, Object.class, "bufferEndSegment$volatile");
        y = r3.objectFieldOffset(aw.class.getDeclaredField("bufferEndSegment$volatile"));
        v = AtomicReferenceFieldUpdater.newUpdater(aw.class, Object.class, "_closeCause$volatile");
        x = r3.objectFieldOffset(aw.class.getDeclaredField("_closeCause$volatile"));
        w = AtomicReferenceFieldUpdater.newUpdater(aw.class, Object.class, "closeHandler$volatile");
        z = r3.objectFieldOffset(aw.class.getDeclaredField("closeHandler$volatile"));
    }

    public aw(int r9) {
        this.n = r9;
        if (r9 < 0) goto L16;
        k10 r0 = cw.a;
        if (r9 != 0) goto L7;
        long r1 = 0;
    L11:
        this.bufferEnd$volatile = r1;
        this.completedExpandBuffersAndPauseFlag$volatile = q.get(this);
        k10 r2 = new k10(0, null, this, 3);
        this.sendSegment$volatile = r2;
        this.receiveSegment$volatile = r2;
        if (E() == false) goto L14;
        r2 = cw.a;
        r2.getClass();
    L14:
        this.bufferEndSegment$volatile = r2;
        this._closeCause$volatile = cw.s;
        return;
    L7:
        if (r9 == Integer.MAX_VALUE) goto L9;
        r1 = r9;
        goto L11
    L9:
        r1 = Long.MAX_VALUE;
        goto L11
    L16:
        kf2.e(b11.j(r9, "Invalid channel capacity: ", ", should be >=0"));
        throw null;
    }

    public static Object H(aw r13, ep4 r14) {
        AtomicReferenceFieldUpdater r0 = t;
        r0.getClass();
        if (r13 == null) goto L81;
        k10 r2 = (k10) dz.a.getObjectVolatile(r13, A);
    L6:
        if (r13.B() == true) goto L79;
        AtomicLongFieldUpdater r3 = p;
        long r7 = r3.getAndIncrement(r13);
        long r4 = cw.b;
        long r9 = r7 / r4;
        int r6 = (int) (r7 % r4);
        if (r2.e == r9) goto L13;
        k10 r5 = r13.q(r9, r2);
        if (r5 == null) goto L6;
        k10 r8 = r5;
    L14:
        aw r10 = r13;
        Object r15 = r10.P(r8, r6, r7, null);
        f01 r11 = cw.m;
        if (r15 == r11) goto L77;
        f01 r12 = cw.o;
        if (r15 != r12) goto L23;
        if (r7 >= r10.v()) goto L21;
        r8.a();
    L21:
        r13 = r10;
        r2 = r8;
        goto L6
    L23:
        if (r15 != cw.n) goto L75;
        cz r16 = zz1.s(ya4.x(r14));
        Object r17 = r10.P(r8, r6, r7, r16);     // Catch: Throwable -> L28
        if (r17 != r11) goto L30;
        r16.a(r8, r6);     // Catch: Throwable -> L28
    L72:
        return r16.q();
    L30:
        if (r17 == r12) goto L32;
        r8.a();     // Catch: Throwable -> L28
    L70:
        r16.k(r17, null);     // Catch: Throwable -> L28
        goto L72
    L32:
        if (r7 >= r10.v()) goto L34;
        r8.a();     // Catch: Throwable -> L28
    L34:
        k10 r18 = (k10) r0.get(r10);     // Catch: Throwable -> L28
    L36:
        if (r10.B() == true) goto L37;
        cz r19 = r16;
        long r20 = r3.getAndIncrement(r10);     // Catch: Throwable -> L67
        long r21 = cw.b;     // Catch: Throwable -> L67
        long r22 = r20 / r21;     // Catch: Throwable -> L67
        int r110 = (int) (r20 % r21);     // Catch: Throwable -> L67
        if (r18.e == r22) goto L50;
        k10 r1 = r10.q(r22, r18);     // Catch: Throwable -> L48
        if (r1 != null) goto L46;
        r16 = r19;
        goto L36
    L46:
        k10 r23 = r1;
    L47:
        aw r24 = r10;
        r17 = r24.P(r23, r110, r20, r19);     // Catch: Throwable -> L67
        r10 = r24;
        k10 r25 = r23;
        r16 = r19;
        if (r17 == cw.m) goto L55;
        if (r17 != cw.o) goto L63;
        if (r20 >= r10.v()) goto L61;
        r25.a();     // Catch: Throwable -> L28
    L61:
        r18 = r25;
        goto L36
    L63:
        if (r17 == cw.n) goto L66;
        r25.a();     // Catch: Throwable -> L28
        goto L70
    L66:
        throw new IllegalStateException("unexpected");     // Catch: Throwable -> L28
    L55:
        r16.a(r25, r110);     // Catch: Throwable -> L28
    L48:
        th = move-exception;
        Throwable r111 = th;
        r16 = r19;
    L73:
        r16.B();
        throw r111;
    L50:
        r23 = r18;
    L67:
        th = th;
        r16 = r19;
    L29:
        r111 = th;
        goto L73
    L37:
        r16.resumeWith(new s14(r10.t()));     // Catch: Throwable -> L28
    L28:
        th = th;
        goto L29
    L75:
        r8.a();
        return r15;
    L77:
        kf2.o("unexpected");
        return null;
    L13:
        r8 = r2;
        goto L14
    L79:
        Throwable r112 = r13.t();
        int r113 = mk4.a;
        throw r112;
    L81:
        kf2.k();
        return null;
    }

    public static Object I(aw r13, wd0 r14) {
        if ((r14 instanceof yv) == false) goto L8;
        yv r0 = (yv) r14;
        int r1 = r0.p;
        if ((r1 & Integer.MIN_VALUE) == 0) goto L8;
        r0.p = r1 - Integer.MIN_VALUE;
    L7:
        yv r6 = r0;
        Object r15 = r6.n;
        int r2 = r6.p;
        if (r2 == 0) goto L16;
        if (r2 != 1) goto L14;
        kb4.X(r15);
        return ((j10) r15).a;
    L14:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L16:
        kb4.X(r15);
        t.getClass();
        k10 r16 = (k10) dz.a.getObjectVolatile(r13, A);
    L18:
        if (r13.B() == true) goto L20;
        long r4 = p.getAndIncrement(r13);
        long r7 = cw.b;
        long r9 = r4 / r7;
        int r3 = (int) (r4 % r7);
        if (r16.e == r9) goto L27;
        k10 r5 = r13.q(r9, r16);
        if (r5 == null) goto L18;
        k10 r8 = r5;
    L28:
        aw r10 = r13;
        Object r17 = r10.P(r8, r3, r4, null);
        if (r17 == cw.m) goto L44;
        if (r17 != cw.o) goto L37;
        if (r4 >= r10.v()) goto L35;
        r8.a();
    L35:
        r13 = r10;
        r16 = r8;
        goto L18
    L37:
        if (r17 != cw.n) goto L42;
        r6.p = 1;
        Object r18 = r10.J(r8, r3, r4, r6);
        xe0 r19 = xe0.n;
        if (r18 != r19) goto L41;
        return r19;
    L41:
        return r18;
    L42:
        r8.a();
        return r17;
    L44:
        kf2.o("unexpected");
        return null;
    L27:
        r8 = r16;
        goto L28
    L20:
        return new h10(r13.s());
    L8:
        r0 = new yv(r13, r14);
        goto L7
    }

    public static Object L(aw r26, Object r27, vd0 r28) {
        AtomicReferenceFieldUpdater r9 = s;
        r9.getClass();
        k10 r1 = (k10) dz.a.getObjectVolatile(r26, B);
    L3:
        AtomicLongFieldUpdater r10 = o;
        long r4 = r10.getAndIncrement(r26);
        long r6 = r4 & 1152921504606846975L;
        boolean r2 = r26.A(false, r4);
        int r14 = cw.b;
        long r5 = r14;
        long r11 = r6 / r5;
        int r7 = (int) (r6 % r5);
        long r13 = r1.e;
        xe0 r15 = xe0.n;
        j15 r16 = j15.a;
        if (r13 == r11) goto L12;
        k10 r8 = r26.r(r11, r1);
        if (r8 == null) goto L7;
        r1 = r8;
        goto L12
    L7:
        if (r2 == false) goto L3;
        Object r0 = r26.G(r28, r27);
        if (r0 != r15) goto L97;
        return r0;
    L97:
        return r16;
    L12:
        int r12 = c(r26, r1, r7, r27, r6, null, r2);
        if (r12 == 0) goto L98;
        if (r12 == 1) goto L97;
        if (r12 == 2) goto L93;
        AtomicLongFieldUpdater r17 = p;
        if (r12 == 3) goto L30;
        if (r12 == 4) goto L25;
        if (r12 != 5) goto L3;
        r1.a();
        goto L3
    L25:
        if (r6 >= r17.get(r26)) goto L27;
        r1.a();
    L27:
        Object r3 = r26.G(r28, r27);
        if (r3 != r15) goto L97;
        return r3;
    L30:
        cz r18 = zz1.s(ya4.x(r28));
        int r19 = c(r26, r1, r7, r27, r6, r18, false);     // Catch: Throwable -> L47
        if (r19 != 0) goto L34;
        r15 = r15;
        r1.a();     // Catch: Throwable -> L47
    L73:
        r18.resumeWith(r16);     // Catch: Throwable -> L47
    L84:
        Object r20 = r18.q();
        xe0 r21 = r15;
        if (r20 == r21) goto L88;
        r20 = r16;
    L88:
        if (r20 != r21) goto L97;
        return r20;
    L34:
        if (r19 != 1) goto L36;
        r15 = r15;
        r18.resumeWith(r16);     // Catch: Throwable -> L47
        goto L84
    L36:
        if (r19 == 2) goto L80;
        if (r19 != 4) goto L39;
        r15 = r15;
        if (r6 < r17.get(r26)) goto L79;
    L46:
        b(r26, r27, r18);     // Catch: Throwable -> L47
        goto L84
    L79:
        r1.a();     // Catch: Throwable -> L47
        goto L46
    L39:
        if (r19 != 5) goto L76;
        r1.a();     // Catch: Throwable -> L47
        k10 r22 = (k10) r9.get(r26);     // Catch: Throwable -> L47
    L41:
        long r23 = r10.getAndIncrement(r26);     // Catch: Throwable -> L47
        long r24 = r23 & 1152921504606846975L;     // Catch: Throwable -> L47
        boolean r25 = r26.A(false, r23);     // Catch: Throwable -> L47
        int r29 = cw.b;     // Catch: Throwable -> L47
        long r30 = r29;
        r10 = r10;
        long r31 = r24 / r30;     // Catch: Throwable -> L47
        int r32 = (int) (r24 % r30);     // Catch: Throwable -> L47
        r15 = r15;
        if (r22.e == r31) goto L51;
        k10 r33 = r26.r(r31, r22);     // Catch: Throwable -> L47
        if (r33 == null) goto L45;
        r22 = r33;
        goto L51
    L45:
        if (r25 == false) goto L41;
    L51:
        int r110 = c(r26, r22, r32, r27, r24, r18, r25);     // Catch: Throwable -> L47
        if (r110 == 0) goto L74;
        if (r110 == 1) goto L73;
        if (r110 == 2) goto L70;
        if (r110 == 3) goto L69;
        if (r110 == 4) goto L66;
        if (r110 != 5) goto L41;
        r22.a();     // Catch: Throwable -> L47
        goto L41
    L66:
        if (r24 >= r17.get(r26)) goto L46;
        r22.a();     // Catch: Throwable -> L47
        goto L46
    L69:
        throw new IllegalStateException("unexpected");     // Catch: Throwable -> L47
    L70:
        if (r25 == false) goto L72;
        r22.m();     // Catch: Throwable -> L47
        goto L46
    L72:
        r18.a(r22, r32 + r29);     // Catch: Throwable -> L47
        goto L84
    L74:
        r22.a();     // Catch: Throwable -> L47
        goto L73
    L76:
        throw new IllegalStateException("unexpected");     // Catch: Throwable -> L47
    L80:
        r15 = r15;
        r18.a(r1, r7 + r14);     // Catch: Throwable -> L47
    L47:
        th = move-exception;
        r18.B();
        throw th;
    L93:
        if (r2 == false) goto L97;
        r1.m();
        Object r34 = r26.G(r28, r27);
        if (r34 != r15) goto L97;
        return r34;
    L98:
        r1.a();
        return r16;
    }

    public static boolean N(Object r2) {
        if ((r2 instanceof az) == true) goto L5;
        mj0.g(r2, "Unexpected waiter: ");
        return false;
    L5:
        return cw.a((az) r2, j15.a, null);
    }

    public static final void b(aw r0, Object r1, cz r2) {
        r2.resumeWith(new s14(r0.u()));
    }

    public static final int c(aw r4, k10 r5, int r6, Object r7, long r8, Object r10, boolean r11) {
        r5.r(r6, r7);
        if (r11 == true) goto L5;
        Object r0 = r5.p(r6);
        if (r0 != null) goto L21;
        if (r4.e(r8) == true) goto L11;
        if (r10 != null) goto L17;
        return 3;
    L17:
        if (r5.o(r6, null, r10) == false) goto L32;
        return 2;
    L32:
        return r4.Q(r5, r6, r7, r8, r10, r11);
    L11:
        if (r5.o(r6, null, cw.d) == false) goto L32;
        return 1;
    L21:
        if ((r0 instanceof t85) == false) goto L32;
        r5.r(r6, null);
        if (r4.M(r0, r7) == false) goto L26;
        r5.s(r6, cw.i);
        return 0;
    L26:
        f01 r9 = cw.k;
        if (r5.h.getAndSet((r6 * 2) + 1, r9) == r9) goto L33;
        r5.q(r6, true);
        return 5;
    L33:
        return 5;
    L5:
        return r4.Q(r5, r6, r7, r8, r10, r11);
    }

    public static void x(aw r7) {
        AtomicLongFieldUpdater r0 = r;
        if ((r0.addAndGet(r7, 1) & 4611686018427387904L) != 0) goto L5;
        return;
    L5:
        if ((r0.get(r7) & 4611686018427387904L) != 0) goto L5;
    }

    public final boolean A(boolean r10, long r11) {
        int r0 = (int) (r11 >> 60);
        if (r0 != 0) goto L5;
    L69:
        return false;
    L5:
        if (r0 == 1) goto L69;
        if (r0 != 2) goto L9;
        m(r11 & 1152921504606846975L);
        if (r10 == true) goto L67;
    L68:
        return true;
    L67:
        if (w() == true) goto L69;
    L9:
        if (r0 != 3) goto L62;
        k10 r12 = m(r11 & 1152921504606846975L);
        Object r13 = null;
    L11:
        int r1 = cw.b - 1;
    L13:
        if ((-1) >= r1) goto L53;
        long r4 = (r12.e * ((long) cw.b)) + ((long) r1);
    L15:
        Object r6 = r12.p(r1);
        if (r6 == cw.i) goto L55;
        f01 r7 = cw.d;
        AtomicLongFieldUpdater r8 = p;
        if (r6 == r7) goto L20;
        if (r6 == cw.e) goto L50;
        if (r6 == null) goto L50;
        if ((r6 instanceof t85) == true) goto L41;
        if ((r6 instanceof u85) == true) goto L41;
        f01 r9 = cw.g;
        if (r6 == r9) goto L55;
        if (r6 == cw.f) goto L55;
        if (r6 == r9) goto L15;
    L52:
        r1 = r1 - 1;
    L41:
        if (r4 < r8.get(this)) goto L55;
        if ((r6 instanceof u85) == false) goto L45;
        t85 r14 = ((u85) r6).a;
    L47:
        if (r12.o(r1, r6, cw.l) == false) goto L15;
        r13 = g12.J(r13, r14);
        r12.r(r1, null);
        r12.m();
        goto L52
    L45:
        r14 = (t85) r6;
    L50:
        if (r12.o(r1, r6, cw.l) == false) goto L15;
        r12.m();
        goto L52
    L20:
        if (r4 < r8.get(this)) goto L55;
        if (r12.o(r1, r6, cw.l) == false) goto L15;
        r12.r(r1, null);
        r12.m();
    L55:
        if (r13 == null) goto L68;
        if ((r13 instanceof ArrayList) == true) goto L59;
        K((t85) r13, false);
        goto L68
    L59:
        ArrayList r15 = (ArrayList) r13;
        int r16 = r15.size() - 1;
    L60:
        if ((-1) >= r16) goto L68;
        K((t85) r15.get(r16), false);
        r16 = r16 - 1;
        goto L60
    L53:
        r12 = (k10) r12.e();
        if (r12 != null) goto L11;
    L62:
        nz2.f(f34.f(r0, "unexpected close status: "));
        return false;
    }

    public final boolean B() {
        return A(true, o.get(this));
    }

    public final boolean C() {
        return A(false, o.get(this));
    }

    public boolean D() {
        return false;
    }

    public final boolean E() {
        long r0 = q.get(this);
        if (r0 != 0) goto L5;
        return true;
    L5:
        if (r0 == Long.MAX_VALUE) goto L11;
        return false;
    L11:
        return true;
    }

    public final void F(long r7, k10 r9) {
    L3:
        if (r9.e >= r7) goto L8;
        k10 r0 = (k10) r9.c();
        if (r0 == null) goto L8;
        r9 = r0;
    L8:
        k10 r5 = r9;
    L10:
        if (r5.f() == false) goto L15;
        k10 r8 = (k10) r5.c();
        if (r8 == null) goto L15;
        r5 = r8;
    L15:
        u.getClass();
        Unsafe r10 = dz.a;
        long r11 = y;
        u84 r4 = (u84) r10.getObjectVolatile(this, r11);
        if (r4.e >= r5.e) goto L47;
        if (r5.n() == false) goto L20;
    L21:
        Unsafe r1 = dz.a;
        aw r2 = this;
        if (r1.compareAndSwapObject(r2, y, r4, r5) == true) goto L24;
        if (r1.getObjectVolatile(r2, r11) != r4) goto L30;
        aw this = r2;
        goto L21
    L30:
        if (r5.j() == false) goto L32;
        r5.h();
    L32:
        this = r2;
        goto L15
    L24:
        if (r4.j() == false) goto L46;
        r4.h();
        return;
    L46:
        return;
    L20:
        r9 = r5;
        goto L8
    }

    public final Object G(vd0 r2, Object r3) {
        cz r4 = new cz(1, ya4.x(r2));
        r4.u();
        r4.resumeWith(new s14(u()));
        Object r1 = r4.q();
        if (r1 != xe0.n) goto L6;
        return r1;
    L6:
        return j15.a;
    }

    public final Object J(k10 r10, int r11, long r12, wd0 r14) {
        if ((r14 instanceof zv) == false) goto L7;
        zv r0 = (zv) r14;
        int r1 = r0.p;
        if ((r1 & Integer.MIN_VALUE) == 0) goto L7;
        r0.p = r1 - Integer.MIN_VALUE;
    L8:
        Object r15 = r0.n;
        int r2 = r0.p;
        if (r2 == 0) goto L14;
        if (r2 != 1) goto L12;
        kb4.X(r15);
    L56:
        return ((j10) r15).a;
    L12:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L14:
        kb4.X(r15);
        r0.p = 1;
        cz r16 = zz1.s(ya4.x(r0));
        hv3 r8 = new hv3(r16);     // Catch: Throwable -> L18
        Object r9 = P(r10, r11, r12, r8);     // Catch: Throwable -> L18
        if (r9 != cw.m) goto L21;
        r8.a(r10, r11);     // Catch: Throwable -> L18
    L52:
        r15 = r16.q();
        xe0 r13 = xe0.n;
        if (r15 != r13) goto L56;
        return r13;
    L21:
        if (r9 == cw.o) goto L23;
        r10.a();     // Catch: Throwable -> L18
        j10 r17 = new j10(r9);     // Catch: Throwable -> L18
    L51:
        r16.k(r17, null);     // Catch: Throwable -> L18
        goto L52
    L23:
        if (r12 >= v()) goto L25;
        r10.a();     // Catch: Throwable -> L18
    L25:
        k10 r18 = (k10) t.get(this);     // Catch: Throwable -> L18
    L27:
        if (B() == true) goto L28;
        long r6 = p.getAndIncrement(this);     // Catch: Throwable -> L18
        long r19 = cw.b;     // Catch: Throwable -> L18
        long r110 = r6 / r19;     // Catch: Throwable -> L18
        int r5 = (int) (r6 % r19);     // Catch: Throwable -> L18
        if (r18.e == r110) goto L35;
        k10 r111 = q(r110, r18);     // Catch: Throwable -> L18
        if (r111 == null) goto L27;
        k10 r4 = r111;
    L36:
        Object r20 = P(r4, r5, r6, r8);     // Catch: Throwable -> L18
        k10 r112 = r4;
        if (r20 == cw.m) goto L38;
        if (r20 != cw.o) goto L46;
        if (r6 >= v()) goto L44;
        r112.a();     // Catch: Throwable -> L18
    L44:
        r18 = r112;
        goto L27
    L46:
        if (r20 == cw.n) goto L49;
        r112.a();     // Catch: Throwable -> L18
        r17 = new j10(r20);     // Catch: Throwable -> L18
        goto L51
    L49:
        throw new IllegalStateException("unexpected");     // Catch: Throwable -> L18
    L38:
        r8.a(r112, r5);     // Catch: Throwable -> L18
        goto L52
    L35:
        r4 = r18;
        goto L36
    L28:
        r16.resumeWith(new j10(new h10(s())));     // Catch: Throwable -> L18
    L18:
        th = move-exception;
        r16.B();
        throw th;
    L7:
        r0 = new zv(this, r14);
        goto L8
    }

    public final void K(t85 r2, boolean r3) {
        if ((r2 instanceof az) == false) goto L11;
        vd0 r4 = (vd0) r2;
        if (r3 == false) goto L7;
        Throwable r1 = t();
    L8:
        r4.resumeWith(new s14(r1));
        return;
    L7:
        r1 = u();
        goto L8
    L11:
        if ((r2 instanceof hv3) == false) goto L15;
        ((hv3) r2).n.resumeWith(new j10(new h10(s())));
        return;
    L15:
        if ((r2 instanceof xv) == false) goto L22;
        xv r5 = (xv) r2;
        cz r6 = r5.o;
        r6.getClass();
        r5.o = null;
        r5.n = cw.l;
        Throwable r7 = r5.p.s();
        if (r7 != null) goto L20;
        r6.resumeWith(Boolean.FALSE);
        return;
    L20:
        r6.resumeWith(new s14(r7));
        return;
    L22:
        mj0.g(r2, "Unexpected waiter: ");
    }

    public final boolean M(Object r2, Object r3) {
        if ((r2 instanceof hv3) == false) goto L7;
        return cw.a(((hv3) r2).n, new j10(r3), null);
    L7:
        if ((r2 instanceof xv) == false) goto L11;
        xv r4 = (xv) r2;
        cz r1 = r4.o;
        r1.getClass();
        r4.o = null;
        r4.n = r3;
        Boolean r5 = Boolean.TRUE;
        r4.p.getClass();
        return cw.a(r1, r5, null);
    L11:
        if ((r2 instanceof az) == true) goto L13;
        mj0.g(r2, "Unexpected receiver type: ");
        return false;
    L13:
        return cw.a((az) r2, r3, null);
    }

    public final Object O(Object r14) {
        e01 r6 = cw.d;
        s.getClass();
        k10 r0 = (k10) dz.a.getObjectVolatile(this, B);
    L3:
        long r1 = o.getAndIncrement(this);
        long r4 = r1 & 1152921504606846975L;
        boolean r7 = this.A(false, r1);
        int r8 = cw.b;
        long r9 = r8;
        long r2 = r4 / r9;
        int r3 = (int) (r4 % r9);
        if (r0.e == r2) goto L12;
        k10 r5 = this.r(r2, r0);
        if (r5 == null) goto L7;
    L11:
        Object r10 = r14;
        int r13 = c(this, r5, r3, r10, r4, r6, r7);
        aw r15 = this;
        r0 = r5;
        j15 r11 = j15.a;
        if (r13 == 0) goto L45;
        if (r13 == 1) goto L44;
        t85 r12 = null;
        if (r13 == 2) goto L35;
        if (r13 == 3) goto L33;
        if (r13 == 4) goto L29;
        if (r13 != 5) goto L27;
        r0.a();
    L27:
        aw this = r15;
        r14 = r10;
        goto L3
    L29:
        if (r4 >= p.get(r15)) goto L32;
        r0.a();
    L32:
        return new h10(r15.u());
    L33:
        kf2.o("unexpected");
        return null;
    L35:
        if (r7 == false) goto L39;
        r0.m();
        return new h10(r15.u());
    L39:
        if ((r6 instanceof t85) == false) goto L41;
        r12 = (t85) r6;
    L41:
        if (r12 == null) goto L43;
        r12.a(r0, r3 + r8);
    L43:
        r15.n((r0.e * r9) + ((long) r3));
    L44:
        return r11;
    L45:
        r0.a();
        return r11;
    L7:
        if (r7 == false) goto L3;
        return new h10(this.u());
    L12:
        r5 = r0;
        goto L11
    }

    public final Object P(k10 r9, int r10, long r11, Object r13) {
        Object r0 = r9.p(r10);
        AtomicReferenceArray r1 = r9.h;
        AtomicLongFieldUpdater r5 = o;
        if (r0 != null) goto L14;
        if (r11 < (r5.get(this) & 1152921504606846975L)) goto L19;
        if (r13 != null) goto L10;
        return cw.n;
    L10:
        if (r9.o(r10, r0, r13) == false) goto L19;
        o();
        return cw.m;
    L19:
        Object r2 = r9.p(r10);
        if (r2 == null) goto L59;
        if (r2 == cw.e) goto L59;
        if (r2 == cw.d) goto L27;
        f01 r6 = cw.j;
        if (r2 == r6) goto L33;
        if (r2 == cw.h) goto L37;
        if (r2 == cw.l) goto L40;
        if (r2 == cw.g) goto L19;
        if (r9.o(r10, r2, cw.f) == false) goto L19;
        boolean r12 = r2 instanceof u85;
        if (r12 == false) goto L50;
        r2 = ((u85) r2).a;
    L50:
        if (N(r2) == false) goto L53;
        r9.s(r10, cw.i);
        o();
        Object r8 = r1.get(r10 * 2);
        r9.r(r10, null);
        return r8;
    L53:
        r9.s(r10, r6);
        r9.m();
        if (r12 == false) goto L57;
        o();
    L57:
        return cw.o;
    L40:
        o();
        return cw.o;
    L37:
        return cw.o;
    L33:
        return cw.o;
    L27:
        if (r9.o(r10, r2, cw.i) == false) goto L19;
        o();
        Object r14 = r1.get(r10 * 2);
        r9.r(r10, null);
        return r14;
    L59:
        if (r11 < (r5.get(this) & 1152921504606846975L)) goto L61;
        if (r13 == null) goto L66;
        if (r9.o(r10, r2, r13) == false) goto L19;
        o();
        return cw.m;
    L66:
        return cw.n;
    L61:
        if (r9.o(r10, r2, cw.h) == false) goto L19;
        o();
        return cw.o;
    L14:
        if (r0 != cw.d) goto L19;
        if (r9.o(r10, r0, cw.i) == false) goto L19;
        o();
        Object r15 = r1.get(r10 * 2);
        r9.r(r10, null);
        return r15;
    }

    public final int Q(k10 r6, int r7, Object r8, long r9, Object r11, boolean r12) {
    L2:
        Object r0 = r6.p(r7);
        if (r0 == null) goto L5;
        if (r0 != cw.e) goto L27;
        if (r6.o(r7, r0, cw.d) == false) goto L2;
    L26:
        return 1;
    L27:
        f01 r10 = cw.k;
        if (r0 != r10) goto L32;
        r6.r(r7, null);
        return 5;
    L32:
        if (r0 != cw.h) goto L36;
        r6.r(r7, null);
        return 5;
    L36:
        if (r0 != cw.l) goto L39;
        r6.r(r7, null);
        C();
        return 4;
    L39:
        r6.r(r7, null);
        if ((r0 instanceof u85) == false) goto L43;
        r0 = ((u85) r0).a;
    L43:
        if (M(r0, r8) == false) goto L47;
        r6.s(r7, cw.i);
        return 0;
    L47:
        if (r6.h.getAndSet((r7 * 2) + 1, r10) == r10) goto L49;
        r6.q(r7, true);
    L49:
        return 5;
    L5:
        if (e(r9) == false) goto L10;
        if (r12 == true) goto L10;
        if (r6.o(r7, null, cw.d) == false) goto L2;
    L10:
        if (r12 == true) goto L12;
        if (r11 == null) goto L16;
        if (r6.o(r7, null, r11) == false) goto L2;
        return 2;
    L16:
        return 3;
    L12:
        if (r6.o(r7, null, cw.j) == false) goto L2;
        r6.m();
        return 4;
    }

    public final void R(long r19) {
        aw r1 = this;
        if (r1.E() == true) goto L29;
    L5:
        AtomicLongFieldUpdater r6 = q;
        if (r6.get(r1) > r19) goto L7;
        r1 = this;
        goto L5
    L7:
        int r0 = cw.c;
        int r2 = 0;
    L8:
        AtomicLongFieldUpdater r3 = r;
        if (r2 >= r0) goto L17;
        long r4 = r6.get(r1);
        if (r4 != (4611686018427387903L & r3.get(r1))) goto L15;
        if (r4 != r6.get(r1)) goto L15;
        return;
    L15:
        r2 = r2 + 1;
    L17:
        long r5 = r3.get(r1);
        if (r3.compareAndSet(r1, r5, (r5 & 4611686018427387903L) + 4611686018427387904L) == true) goto L19;
        r1 = this;
    L19:
        long r7 = r6.get(r1);
        long r8 = r3.get(r1);
        long r12 = r8 & 4611686018427387903L;
        if ((r8 & 4611686018427387904L) == 0) goto L22;
        boolean r14 = true;
    L24:
        if (r7 == r12) goto L26;
    L31:
        if (r14 == false) goto L32;
        r1 = this;
        goto L19
    L32:
        r1 = this;
        r3.compareAndSet(r1, r8, 4611686018427387904L + r12);
        goto L19
    L26:
        if (r7 != r6.get(r1)) goto L31;
    L27:
        long r9 = r3.get(r1);
        if (r3.compareAndSet(r1, r9, r9 & 4611686018427387903L) == true) goto L50;
        r1 = this;
        goto L27
    L50:
        return;
    L22:
        r14 = false;
        goto L24
    }

    @Override // defpackage.y94
    public Object a(vd0 r1, Object r2) {
        return L(this, r2, r1);
    }

    @Override // defpackage.y94
    public Object d(Object r16) {
        AtomicLongFieldUpdater r8 = o;
        long r1 = r8.get(this);
        boolean r9 = false;
        long r11 = 1152921504606846975L;
        if (A(false, r1) == false) goto L5;
        boolean r2 = false;
    L6:
        i10 r13 = j10.b;
        if (r2 == false) goto L9;
        return r13;
    L9:
        e01 r6 = cw.j;
        s.getClass();
        k10 r3 = (k10) dz.a.getObjectVolatile(this, B);
    L10:
        long r4 = r8.getAndIncrement(this);
        long r5 = r4 & r11;
        boolean r7 = A(r9, r4);
        int r14 = cw.b;
        long r10 = r14;
        long r12 = r5 / r10;
        int r15 = (int) (r5 % r10);
        if (r3.e == r12) goto L20;
        k10 r17 = r(r12, r3);
        if (r17 != null) goto L19;
        if (r7 == true) goto L16;
        r9 = false;
    L18:
        r11 = 1152921504606846975L;
        goto L10
    L16:
        return new h10(u());
    L19:
        r3 = r17;
    L20:
        int r18 = c(this, r3, r15, r16, r5, r6, r7);
        j15 r19 = j15.a;
        if (r18 == 0) goto L53;
        if (r18 == 1) goto L52;
        t85 r110 = null;
        if (r18 == 2) goto L42;
        if (r18 == 3) goto L40;
        if (r18 == 4) goto L36;
        if (r18 != 5) goto L34;
        r3.a();
    L34:
        r9 = false;
        goto L18
    L36:
        if (r5 >= p.get(this)) goto L39;
        r3.a();
    L39:
        return new h10(u());
    L40:
        kf2.o("unexpected");
        return null;
    L42:
        if (r7 == false) goto L46;
        r3.m();
        return new h10(u());
    L46:
        if ((r6 instanceof t85) == false) goto L48;
        r110 = (t85) r6;
    L48:
        if (r110 == null) goto L50;
        r110.a(r3, r15 + r14);
    L50:
        r3.m();
        return r13;
    L52:
        return r19;
    L53:
        r3.a();
        return r19;
    L5:
        r2 = !e(r1 & 1152921504606846975L);
        goto L6
    }

    public final boolean e(long r5) {
        if (r5 >= q.get(this)) goto L5;
        return true;
    L5:
        if (r5 < (p.get(this) + ((long) this.n))) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // defpackage.y00
    public final void f(CancellationException r2) {
        if (r2 != null) goto L4;
        r2 = new CancellationException("Channel was cancelled");
    L4:
        l(r2, true);
    }

    @Override // defpackage.y00
    public final Object g() {
        AtomicLongFieldUpdater r0 = p;
        long r1 = r0.get(this);
        long r3 = o.get(this);
        if (A(true, r3) == true) goto L5;
        long r4 = r3 & 1152921504606846975L;
        i10 r2 = j10.b;
        if (r1 < r4) goto L9;
        return r2;
    L9:
        Object r8 = cw.k;
        t.getClass();
        k10 r5 = (k10) dz.a.getObjectVolatile(this, A);
    L11:
        if (this.B() == true) goto L13;
        long r6 = r0.getAndIncrement(this);
        long r7 = cw.b;
        long r9 = r6 / r7;
        int r10 = (int) (r6 % r7);
        if (r5.e == r9) goto L21;
        k10 r11 = this.q(r9, r5);
        if (r11 == null) goto L11;
        k10 r12 = r11;
    L20:
        aw r13 = this;
        Object r14 = r13.P(r12, r10, r6, r8);
        r5 = r12;
        t85 r15 = null;
        if (r14 == cw.m) goto L25;
        if (r14 != cw.o) goto L38;
        if (r6 >= r13.v()) goto L36;
        r5.a();
    L36:
        aw this = r13;
        goto L11
    L38:
        if (r14 == cw.n) goto L41;
        r5.a();
        return r14;
    L41:
        kf2.o("unexpected");
        return null;
    L25:
        if ((r8 instanceof t85) == false) goto L27;
        r15 = (t85) r8;
    L27:
        if (r15 == null) goto L29;
        r15.a(r5, r10);
    L29:
        r13.R(r6);
        r5.m();
        return r2;
    L21:
        r12 = r5;
        goto L20
    L13:
        return new h10(this.s());
    L5:
        return new h10(s());
    }

    @Override // defpackage.y00
    public final Object h(ep4 r1) {
        return H(this, r1);
    }

    @Override // defpackage.y00
    public final Object i(c60 r1) {
        return I(this, r1);
    }

    @Override // defpackage.y00
    public final xv iterator() {
        return new xv(this);
    }

    public final boolean j(Throwable r2) {
        return l(r2, false);
    }

    public final k10 k() {
        u.getClass();
        Unsafe r0 = dz.a;
        Object r1 = r0.getObjectVolatile(this, y);
        s.getClass();
        k10 r2 = (k10) r0.getObjectVolatile(this, B);
        if (r2.e <= ((k10) r1).e) goto L5;
        r1 = r2;
    L5:
        t.getClass();
        k10 r7 = (k10) r0.getObjectVolatile(this, A);
        if (r7.e <= ((k10) r1).e) goto L8;
        r1 = r7;
    L8:
        p90 r3 = (p90) r1;
    L9:
        AtomicReferenceFieldUpdater r8 = p90.a;
        Object r9 = r3.d();
        if (r9 == ud3.a) goto L17;
        p90 r10 = (p90) r9;
        if (r10 == null) goto L15;
        r3 = r10;
        goto L9
    L15:
        if (r3.g() == false) goto L9;
    L17:
        return (k10) r3;
    }

    public final boolean l(Throwable r14, boolean r15) {
        AtomicLongFieldUpdater r3 = o;
        if (r15 == false) goto L10;
    L4:
        long r5 = r3.get(this);
        if (((int) (r5 >> 60)) != 0) goto L10;
        k10 r4 = cw.a;
        aw r6 = this;
        if (r3.compareAndSet(r6, r5, (r5 & 1152921504606846975L) + 1152921504606846976L) == true) goto L11;
        aw this = r6;
    L11:
        f01 r8 = cw.s;
    L12:
        v.getClass();
        aw r7 = r6;
        Unsafe r9 = dz.a;
        long r10 = x;
        Throwable r11 = r14;
        boolean r13 = r9.compareAndSwapObject(r7, r10, r8, r11);
        r6 = r7;
        if (r13 == true) goto L14;
        if (r9.getObjectVolatile(r6, r10) != r8) goto L17;
        r14 = r11;
        goto L12
    L17:
        boolean r16 = false;
    L19:
        if (r15 == false) goto L23;
    L20:
        long r12 = r3.get(r6);
        if (r3.compareAndSet(r6, r12, 3458764513820540928L + (r12 & 1152921504606846975L)) == false) goto L20;
    L32:
        r6.C();
        if (r16 == false) goto L35;
        r6.y();
    L35:
        return r16;
    L23:
        long r17 = r3.get(r6);
        int r18 = (int) (r17 >> 60);
        if (r18 == 0) goto L29;
        if (r18 != 1) goto L32;
        long r19 = (r17 & 1152921504606846975L) + 3458764513820540928L;
    L31:
        if (r3.compareAndSet(r6, r17, r19) == false) goto L23;
    L29:
        r19 = (r17 & 1152921504606846975L) + 2305843009213693952L;
        goto L31
    L14:
        r16 = true;
    L10:
        r6 = this;
        goto L11
    }

    public final k10 m(long r12) {
        k10 r0 = k();
        if (D() == false) goto L29;
        k10 r1 = r0;
    L5:
        int r4 = cw.b - 1;
    L7:
        if ((-1) >= r4) goto L23;
        long r7 = (r1.e * ((long) cw.b)) + ((long) r4);
        if (r7 < p.get(this)) goto L10;
    L11:
        Object r9 = r1.p(r4);
        if (r9 == null) goto L20;
        if (r9 == cw.e) goto L20;
        if (r9 != cw.d) goto L22;
    L27:
        if (r7 == (-1)) goto L29;
        n(r7);
    L22:
        r4 = r4 - 1;
    L20:
        if (r1.o(r4, r9, cw.l) == false) goto L11;
        r1.m();
    L10:
        r7 = -1;
        goto L27
    L23:
        r1 = (k10) r1.e();
        if (r1 != null) goto L5;
    L29:
        Object r2 = null;
        k10 r5 = r0;
    L30:
        if (r5 == null) goto L55;
        int r6 = cw.b - 1;
    L32:
        if ((-1) >= r6) goto L54;
        if (((r5.e * ((long) cw.b)) + ((long) r6)) < r12) goto L55;
    L35:
        Object r8 = r5.p(r6);
        if (r8 == null) goto L51;
        if (r8 == cw.e) goto L51;
        if ((r8 instanceof u85) == true) goto L43;
        if ((r8 instanceof t85) == false) goto L53;
        if (r5.o(r6, r8, cw.l) == false) goto L35;
        r2 = g12.J(r2, r8);
        r5.q(r6, true);
    L53:
        r6 = r6 - 1;
        goto L32
    L43:
        if (r5.o(r6, r8, cw.l) == false) goto L35;
        r2 = g12.J(r2, ((u85) r8).a);
        r5.q(r6, true);
    L51:
        if (r5.o(r6, r8, cw.l) == false) goto L35;
        r5.m();
        goto L53
    L54:
        r5 = (k10) r5.e();
    L55:
        if (r2 != null) goto L57;
    L63:
        return r0;
    L57:
        if ((r2 instanceof ArrayList) == true) goto L60;
        K((t85) r2, true);
        return r0;
    L60:
        ArrayList r3 = (ArrayList) r2;
        int r13 = r3.size() - 1;
    L61:
        if ((-1) >= r13) goto L63;
        K((t85) r3.get(r13), true);
        r13 = r13 - 1;
        goto L61
    }

    public final void n(long r10) {
        t.getClass();
        k10 r0 = (k10) dz.a.getObjectVolatile(this, A);
    L3:
        AtomicLongFieldUpdater r1 = p;
        long r3 = r1.get(this);
        if (r10 < Math.max(((long) this.n) + r3, q.get(this))) goto L5;
        aw this = this;
        if (r1.compareAndSet(this, r3, 1 + r3) == false) goto L3;
        long r5 = cw.b;
        long r7 = r3 / r5;
        int r9 = (int) (r3 % r5);
        if (r0.e == r7) goto L14;
        k10 r2 = this.q(r7, r0);
        if (r2 == null) goto L3;
        r0 = r2;
    L14:
        k10 r4 = r0;
        if (this.P(r4, r9, r3, null) == cw.o) goto L17;
        r4.a();
    L20:
        r0 = r4;
        goto L3
    L17:
        if (r3 >= this.v()) goto L20;
        r4.a();
        goto L20
    }

    public final void o() {
        if (E() == false) goto L5;
        return;
    L5:
        u.getClass();
        k10 r4 = (k10) dz.a.getObjectVolatile(this, y);
    L6:
        long r5 = q.getAndIncrement(this);
        long r7 = cw.b;
        long r2 = r5 / r7;
        if (this.v() <= r5) goto L9;
        aw r1 = this;
        if (r4.e == r2) goto L21;
        k10 r9 = r1.p(r2, r4, r5);
        if (r9 == null) goto L19;
        r4 = r9;
    L19:
        aw this = r1;
    L21:
        int r10 = (int) (r5 % r7);
        Object r0 = r4.p(r10);
        boolean r3 = r0 instanceof t85;
        AtomicLongFieldUpdater r6 = p;
        if (r3 == false) goto L31;
        if (r5 < r6.get(r1)) goto L31;
        if (r4.o(r10, r0, cw.g) == false) goto L31;
        if (N(r0) == true) goto L29;
        r4.s(r10, cw.j);
        r4.m();
    L46:
        x(r1);
        goto L19
    L29:
        r4.s(r10, cw.d);
    L69:
        x(r1);
        return;
    L31:
        Object r8 = r4.p(r10);
        if ((r8 instanceof t85) == true) goto L34;
        if (r8 == cw.j) goto L46;
        if (r8 == null) goto L49;
        if (r8 == cw.d) goto L69;
        if (r8 == cw.h) goto L69;
        if (r8 == cw.i) goto L69;
        if (r8 == cw.k) goto L69;
        if (r8 == cw.l) goto L69;
        if (r8 == cw.f) goto L31;
        mj0.g(r8, "Unexpected cell state: ");
        return;
    L49:
        if (r4.o(r10, r8, cw.e) == false) goto L31;
    L34:
        if (r5 < r6.get(r1)) goto L36;
        if (r4.o(r10, r8, cw.g) == false) goto L31;
        if (N(r8) == true) goto L42;
        r4.s(r10, cw.j);
        r4.m();
        goto L46
    L42:
        r4.s(r10, cw.d);
        goto L69
    L36:
        if (r4.o(r10, r8, new u85((t85) r8)) == false) goto L31;
    L9:
        if (r4.e < r2) goto L11;
    L13:
        x(this);
        return;
    L11:
        if (r4.c() == null) goto L13;
        this.F(r2, r4);
        goto L13
    }

    public final k10 p(long r18, k10 r20, long r21) {
        k10 r0 = cw.a;
        bw r8 = bw.n;
    L3:
        Object r10 = ud3.j(r20, r18, r8);
        if (xl.x(r10) == true) goto L23;
        u84 r5 = xl.v(r10);
    L6:
        u.getClass();
        Unsafe r1 = dz.a;
        long r11 = y;
        u84 r4 = (u84) r1.getObjectVolatile(this, r11);
        if (r4.e >= r5.e) goto L23;
        if (r5.n() == false) goto L3;
    L12:
        Unsafe r2 = dz.a;
        if (r2.compareAndSwapObject(this, y, r4, r5) == true) goto L15;
        if (r2.getObjectVolatile(this, r11) == r4) goto L12;
        if (r5.j() == false) goto L6;
        r5.h();
        goto L6
    L15:
        if (r4.j() == false) goto L23;
        r4.h();
    L23:
        if (xl.x(r10) == false) goto L26;
        C();
        F(r18, r20);
        x(this);
        return null;
    L26:
        k10 r3 = (k10) xl.v(r10);
        long r6 = r3.e;
        if (r6 <= r18) goto L38;
        long r7 = r6 * ((long) cw.b);
        AtomicLongFieldUpdater r9 = q;
        if (r9.compareAndSet(this, r21 + 1, r7) == false) goto L36;
        AtomicLongFieldUpdater r12 = r;
        if ((r12.addAndGet(this, r7 - r21) & 4611686018427387904L) != 0) goto L33;
    L35:
        return null;
    L33:
        if ((r12.get(this) & 4611686018427387904L) == 0) goto L35;
    L36:
        x(this);
        return null;
    L38:
        return r3;
    }

    public final k10 q(long r16, k10 r18) {
        k10 r0 = cw.a;
        bw r9 = bw.n;
    L3:
        Object r10 = ud3.j(r18, r16, r9);
        if (xl.x(r10) == true) goto L23;
        u84 r5 = xl.v(r10);
    L6:
        t.getClass();
        Unsafe r1 = dz.a;
        long r11 = A;
        u84 r4 = (u84) r1.getObjectVolatile(this, r11);
        if (r4.e >= r5.e) goto L23;
        if (r5.n() == false) goto L3;
    L12:
        Unsafe r2 = dz.a;
        if (r2.compareAndSwapObject(this, A, r4, r5) == true) goto L15;
        if (r2.getObjectVolatile(this, r11) == r4) goto L12;
        if (r5.j() == false) goto L6;
        r5.h();
        goto L6
    L15:
        if (r4.j() == false) goto L23;
        r4.h();
    L23:
        if (xl.x(r10) == false) goto L28;
        C();
        if ((r18.e * ((long) cw.b)) >= v()) goto L60;
        r18.a();
        return null;
    L60:
        return null;
    L28:
        k10 r6 = (k10) xl.v(r10);
        long r12 = r6.e;
        if (E() == false) goto L31;
    L48:
        k10 r8 = r6;
    L50:
        if (r12 <= r16) goto L61;
        long r7 = r12 * ((long) cw.b);
    L52:
        long r3 = p.get(this);
        if (r3 >= r7) goto L58;
        if (p.compareAndSet(this, r3, r7) == false) goto L52;
    L58:
        if ((r12 * ((long) cw.b)) >= v()) goto L60;
        r8.a();
        goto L60
    L61:
        return r8;
    L31:
        if (r16 > (q.get(this) / ((long) cw.b))) goto L48;
    L32:
        u.getClass();
        Unsafe r13 = dz.a;
        long r14 = y;
        u84 r15 = (u84) r13.getObjectVolatile(this, r14);
        if (r15.e >= r12) goto L48;
        if (r6.n() == false) goto L48;
    L36:
        Unsafe r17 = dz.a;
        r8 = r6;
        if (r17.compareAndSwapObject(this, y, r15, r6) == true) goto L39;
        if (r17.getObjectVolatile(this, r14) != r15) goto L44;
        r6 = r8;
        goto L36
    L44:
        if (r8.j() == false) goto L46;
        r8.h();
    L46:
        r6 = r8;
        goto L32
    L39:
        if (r15.j() == false) goto L50;
        r15.h();
        goto L50
    }

    public final k10 r(long r17, k10 r19) {
        k10 r0 = cw.a;
        bw r9 = bw.n;
    L3:
        Object r10 = ud3.j(r19, r17, r9);
        if (xl.x(r10) == true) goto L22;
        u84 r5 = xl.v(r10);
    L6:
        s.getClass();
        Unsafe r1 = dz.a;
        long r11 = B;
        u84 r4 = (u84) r1.getObjectVolatile(this, r11);
        if (r4.e >= r5.e) goto L22;
        if (r5.n() == false) goto L3;
    L12:
        Unsafe r2 = dz.a;
        if (r2.compareAndSwapObject(this, B, r4, r5) == true) goto L15;
        if (r2.getObjectVolatile(this, r11) == r4) goto L12;
        if (r5.j() == false) goto L6;
        r5.h();
        goto L6
    L15:
        if (r4.j() == false) goto L22;
        r4.h();
    L22:
        boolean r3 = xl.x(r10);
        AtomicLongFieldUpdater r12 = p;
        if (r3 == false) goto L28;
        C();
        if ((r19.e * ((long) cw.b)) >= r12.get(this)) goto L39;
        r19.a();
        return null;
    L39:
        return null;
    L28:
        k10 r8 = (k10) xl.v(r10);
        long r13 = r8.e;
        if (r13 <= r17) goto L40;
        long r6 = r13 * ((long) cw.b);
    L31:
        long r7 = o.get(this);
        long r14 = 1152921504606846975L & r7;
        if (r14 >= r6) goto L37;
        AtomicLongFieldUpdater r15 = o;
        if (r15.compareAndSet(this, r7, r14 + (((long) ((int) (r7 >> 60))) << 60)) == false) goto L31;
    L37:
        if ((r13 * ((long) cw.b)) >= r12.get(this)) goto L39;
        r8.a();
        goto L39
    L40:
        return r8;
    }

    public final Throwable s() {
        v.getClass();
        return (Throwable) dz.a.getObjectVolatile(this, x);
    }

    public final Throwable t() {
        Throwable r1 = s();
        if (r1 == null) goto L5;
        return r1;
    L5:
        return new ClosedReceiveChannelException("Channel was closed");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        StringBuilder r1 = new StringBuilder();
        int r2 = (int) (o.get(this) >> 60);
        if (r2 == 2) goto L7;
        if (r2 != 3) goto L8;
        r1.append("cancelled,");
    L8:
        r1.append("capacity=" + this.n + ',');
        r1.append("data=[");
        t.getClass();
        Unsafe r3 = dz.a;
        int r7 = 0;
        s.getClass();
        Object r6 = r3.getObjectVolatile(this, B);
        int r8 = 1;
        u.getClass();
        List r4 = gb.P(new k10[]{r3.getObjectVolatile(this, A), r6, r3.getObjectVolatile(this, y)});
        ArrayList r5 = new ArrayList();
        Iterator r9 = r4.iterator();
    L10:
        if (r9.hasNext() == false) goto L14;
        Object r10 = r9.next();
        if (((k10) r10) == cw.a) goto L10;
        r5.add(r10);
        goto L10
    L14:
        Iterator r11 = r5.iterator();
        if (r11.hasNext() == false) goto L87;
        Object r12 = r11.next();
        if (r11.hasNext() == false) goto L25;
        long r13 = ((k10) r12).e;
    L20:
        Object r14 = r11.next();
        long r15 = ((k10) r14).e;
        if (r13 <= r15) goto L24;
        r12 = r14;
        r13 = r15;
    L24:
        if (r11.hasNext() == true) goto L20;
    L25:
        k10 r16 = (k10) r12;
        long r17 = p.get(this);
        long r18 = v();
    L26:
        int r0 = cw.b;
        int r19 = r7;
    L27:
        if (r19 >= r0) goto L75;
        int r110 = r8;
        long r20 = (r16.e * ((long) cw.b)) + ((long) r19);
        if (r20 >= r18) goto L31;
    L34:
        Object r21 = r16.p(r19);
        Object r22 = r16.h.get(r19 * 2);
        if ((r21 instanceof az) == false) goto L45;
        if (r20 >= r17) goto L40;
        if (r20 < r18) goto L40;
        String r23 = "receive";
    L71:
        if (r22 == null) goto L73;
        r1.append("(" + r23 + ',' + r22 + "),");
    L74:
        r19 = r19 + 1;
        r8 = r110;
        goto L27
    L73:
        r1.append(r23 + ',');
    L40:
        if (r20 >= r18) goto L43;
        if (r20 < r17) goto L43;
        r23 = "send";
    L43:
        r23 = "cont";
        goto L71
    L45:
        if ((r21 instanceof hv3) == false) goto L48;
        r23 = "receiveCatching";
        goto L71
    L48:
        if ((r21 instanceof u85) == false) goto L51;
        r23 = "EB(" + r21 + ')';
        goto L71
    L51:
        if (h12.c(r21, cw.f) == false) goto L53;
    L70:
        r23 = "resuming_sender";
        goto L71
    L53:
        if (h12.c(r21, cw.g) == true) goto L70;
        if (r21 == null) goto L74;
        if (r21.equals(cw.e) == true) goto L74;
        if (r21.equals(cw.i) == true) goto L74;
        if (r21.equals(cw.h) == true) goto L74;
        if (r21.equals(cw.k) == true) goto L74;
        if (r21.equals(cw.j) == true) goto L74;
        if (r21.equals(cw.l) == true) goto L74;
        r23 = r21.toString();
        goto L71
    L31:
        if (r20 < r17) goto L34;
        String r111 = null;
    L78:
        if (r1.length() != 0) goto L80;
        kf2.m("Char sequence is empty.");
        return r111;
    L80:
        if (r1.charAt(r1.length() - r110) != ',') goto L82;
        r1.deleteCharAt(r1.length() - r110).getClass();
    L82:
        r1.append("]");
        return r1.toString();
    L75:
        r110 = r8;
        r111 = null;
        r16 = (k10) r16.c();
        if (r16 == null) goto L78;
        r8 = r110;
        r7 = 0;
        goto L26
    L87:
        tb4.k();
        return null;
    L7:
        r1.append("closed,");
        goto L8
    }

    public final Throwable u() {
        Throwable r1 = s();
        if (r1 == null) goto L5;
        return r1;
    L5:
        return new ClosedSendChannelException("Channel was closed");
    }

    public final long v() {
        return o.get(this) & 1152921504606846975L;
    }

    public final boolean w() {
    L2:
        t.getClass();
        Unsafe r0 = dz.a;
        long r1 = A;
        k10 r3 = (k10) r0.getObjectVolatile(this, r1);
        AtomicLongFieldUpdater r4 = p;
        long r7 = r4.get(this);
        if (v() <= r7) goto L11;
        long r5 = cw.b;
        long r9 = r7 / r5;
        if (r3.e == r9) goto L13;
        r3 = q(r9, r3);
        if (r3 != null) goto L13;
        if (((k10) r0.getObjectVolatile(this, r1)).e >= r9) goto L2;
        return false;
    L13:
        r3.a();
        int r2 = (int) (r7 % r5);
    L14:
        Object r6 = r3.p(r2);
        if (r6 == null) goto L45;
        if (r6 == cw.e) goto L45;
        if (r6 == cw.d) goto L42;
        if (r6 != cw.j) goto L26;
    L47:
        p.compareAndSet(this, r7, r7 + 1);
        goto L2
    L26:
        if (r6 == cw.l) goto L47;
        if (r6 == cw.i) goto L47;
        if (r6 == cw.h) goto L47;
        if (r6 == cw.g) goto L63;
        if (r6 == cw.f) goto L47;
        if (r7 != r4.get(this)) goto L47;
        return true;
    L63:
        return true;
    L42:
        return true;
    L45:
        if (r3.o(r2, r6, cw.h) == false) goto L14;
        o();
        goto L47
    L11:
        return false;
    }

    public final void y() {
    L2:
        w.getClass();
        Unsafe r0 = dz.a;
        long r1 = z;
        Object r7 = r0.getObjectVolatile(this, r1);
        if (r7 != null) goto L6;
        f01 r2 = cw.q;
    L5:
        f01 r8 = r2;
    L7:
        Unsafe r3 = dz.a;
        aw r4 = this;
        if (r3.compareAndSwapObject(r4, z, r7, r8) == true) goto L9;
        if (r3.getObjectVolatile(r4, r1) != r7) goto L15;
        aw this = r4;
        goto L7
    L15:
        this = r4;
        goto L2
    L9:
        if (r7 != null) goto L11;
        return;
    L11:
        jz4.j(1, r7);
        ((if1) r7).invoke(r4.s());
        return;
    L6:
        r2 = cw.r;
        goto L5
    }

    public final void z(kv r11) {
    L2:
        w.getClass();
        Unsafe r1 = dz.a;
        aw r2 = this;
        if (r1.compareAndSwapObject(r2, z, null, r11) == true) goto L4;
        long r8 = z;
        if (r1.getObjectVolatile(r2, r8) != null) goto L7;
        aw this = r2;
    L7:
        Object r10 = dz.a.getObjectVolatile(r2, r8);
        f01 r6 = cw.q;
        if (r10 != r6) goto L18;
        f01 r7 = cw.r;
    L10:
        aw r3 = r2;
        Unsafe r4 = dz.a;
        boolean r12 = r4.compareAndSwapObject(r3, z, r6, r7);
        r2 = r3;
        if (r12 == true) goto L12;
        if (r4.getObjectVolatile(r2, r8) == r6) goto L10;
    L12:
        r11.invoke(r2.s());
        return;
    L18:
        if (r10 != cw.r) goto L21;
        kf2.o("Another handler was already registered and successfully invoked");
        return;
    L21:
        mj0.g(r10, "Another handler is already registered: ");
        return;
    }
}
