package defpackage;

import android.database.SQLException;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ia0 implements fa0 {
    public final wn3 n;
    public final wn3 o;
    public final ThreadLocal p;
    public final AtomicBoolean q;
    public final long r;

    public ia0(final rf2 r5, final String r6, int r7) {
        r6.getClass();
        this.p = new ThreadLocal();
        final int r1 = 0;
        this.q = new AtomicBoolean(false);
        om0 r0 = mx0.n;
        this.r = e35.V(30);
        if (r7 <= 0) goto L6;
        this.n = new wn3(r7, new ga0(r5, r6, r1));
        final int r2 = 1;
        this.o = new wn3(1, new ga0(r5, r6, r2));
        return;
    L6:
        kf2.n("Maximum number of readers must be greater than 0");
        throw null;
    }

    public final void b(boolean r4) {
        if (r4 == false) goto L4;
        String r5 = "reader";
    L5:
        StringBuilder r0 = new StringBuilder();
        r0.append("Timed out attempting to acquire a " + r5 + " connection.");
        r0.append("\n\nWriter pool:\n");
        this.o.c(r0);
        r0.append("Reader pool:");
        r0.append('\n');
        this.n.c(r0);
        h12.P(5, r0.toString());
        throw null;
    L4:
        r5 = "writer";
        goto L5
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.q.compareAndSet(false, true) == false) goto L6;
        this.n.b();
        this.o.b();
        return;
    }

    @Override // defpackage.fa0
    public final Object k(boolean r18, wf1 r19, wd0 r20) {
        ia0 r1 = this;
        boolean r2 = r18;
        wf1 r3 = r19;
        if ((r20 instanceof ha0) == false) goto L7;
        ha0 r4 = (ha0) r20;
        int r5 = r4.w;
        if ((r5 & Integer.MIN_VALUE) == 0) goto L7;
        r4.w = r5 - Integer.MIN_VALUE;
    L8:
        Object r0 = r4.u;
        int r6 = r4.w;
        int r9 = 3;
        vd0 r12 = null;
        xe0 r13 = xe0.n;
        if (r6 == 0) goto L31;
        if (r6 == 1) goto L29;
        if (r6 == 2) goto L27;
        if (r6 == 3) goto L22;
        if (r6 != 4) goto L20;
        jx3 r7 = (jx3) r4.o;
        wn3 r8 = (wn3) r4.n;
        kb4.X(r0);     // Catch: Throwable -> L17
    L128:
        go3 r10 = (go3) r7.n;     // Catch: Throwable -> L119
        if (r10 == null) goto L95;
        if (r10.d.compareAndSet(false, true) == true) goto L136;
    L94:
        sa0 r11 = r10.a;     // Catch: Throwable -> L119
        r11.p = null;     // Catch: Throwable -> L119
        r11.q = null;     // Catch: Throwable -> L119
        r8.d(r11);     // Catch: Throwable -> L119
        goto L95
    L136:
        h12.n(r10.a, "ROLLBACK TRANSACTION");     // Catch: SQLException -> L118 Throwable -> L119
    L95:
        return r0;
    L17:
        th = th;
        jx3 r14 = r7;
    L19:
        Throwable r15 = th;
    L130:
        throw r15;     // Catch: Throwable -> L104
    L104:
        th = move-exception;
        go3 r16 = (go3) r14.n;     // Catch: Throwable -> L113
        if (r16 != null) goto L109;
        throw th;
    L109:
        if (r16.d.compareAndSet(false, true) == true) goto L138;
    L111:
        sa0 r17 = r16.a;     // Catch: Throwable -> L113
        r17.p = null;     // Catch: Throwable -> L113
        r17.q = null;     // Catch: Throwable -> L113
        r8.d(r17);     // Catch: Throwable -> L113
        throw th;
    L138:
        h12.n(r16.a, "ROLLBACK TRANSACTION");     // Catch: SQLException -> L120 Throwable -> L113
    L113:
        th = move-exception;
        j51.d(r15, th);
        throw th;
    L20:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L22:
        boolean r21 = r4.t;
        jx3 r22 = r4.s;
        ne0 r23 = r4.r;
        jx3 r24 = r4.q;
        wn3 r25 = r4.p;
        wf1 r110 = (wf1) r4.o;
        ia0 r111 = (ia0) r4.n;
        kb4.X(r0);     // Catch: Throwable -> L25
        ne0 r26 = r23;
        r3 = r110;
    L66:
        jx3 r112 = r22;
        r2 = r21;
        r7 = r24;
        ia0 r27 = r111;
        ne0 r113 = r26;
        th = null;
    L125:
        sa0 r28 = (sa0) r112.n;     // Catch: Throwable -> L78
        if (r28 == null) goto L80;
        r113.getClass();     // Catch: Throwable -> L78
        r28.p = r113;     // Catch: Throwable -> L78
        r28.q = new Throwable();     // Catch: Throwable -> L78
        if (r27.n == r27.o) goto L76;
        if (r2 == false) goto L76;
        boolean r114 = true;
    L77:
        go3 r29 = new go3(r28, r114);     // Catch: Throwable -> L78
    L81:
        r7.n = r29;     // Catch: Throwable -> L78
        if ((th instanceof TimeoutCancellationException) == true) goto L99;
        if (th != null) goto L98;
        if (r29 == null) goto L97;
        r27.getClass();     // Catch: Throwable -> L78
        da0 r30 = new da0(r29);     // Catch: Throwable -> L78
        ThreadLocal r31 = r27.p;     // Catch: Throwable -> L78
        r31.getClass();     // Catch: Throwable -> L78
        ne0 r32 = ya4.F(r30, new ht4(r29, r31));     // Catch: Throwable -> L78
        p r33 = new p(r3, r7, r12, 8);     // Catch: Throwable -> L78
        r4.n = r25;     // Catch: Throwable -> L78
        r4.o = r7;     // Catch: Throwable -> L78
        r4.p = null;     // Catch: Throwable -> L78
        r4.q = null;     // Catch: Throwable -> L78
        r4.r = null;     // Catch: Throwable -> L78
        r4.s = null;     // Catch: Throwable -> L78
        r4.w = 4;     // Catch: Throwable -> L78
        r0 = fu.P(r32, r33, r4);     // Catch: Throwable -> L78
        if (r0 != r13) goto L88;
    L87:
        return r13;
    L88:
        r8 = r25;
        goto L128
    L97:
        throw new IllegalArgumentException("Required value was null.");     // Catch: Throwable -> L78
    L98:
        throw th;     // Catch: Throwable -> L78
    L99:
        r27.b(r2);     // Catch: Throwable -> L78
        throw null;     // Catch: Throwable -> L78
    L76:
        r114 = false;
        goto L77
    L80:
        r29 = null;
    L78:
        th = th;
        r14 = r7;
        r8 = r25;
    L25:
        th = th;
        r112 = r22;
        r2 = r21;
        r1 = r111;
        r113 = r23;
        r3 = r110;
    L69:
        jx3 r115 = r24;
        r27 = r1;
        r7 = r115;
        goto L125
    L27:
        kb4.X(r0);
        return r0;
    L29:
        kb4.X(r0);
        return r0;
    L31:
        kb4.X(r0);
        if (r1.q.get() == true) goto L116;
        ThreadLocal r34 = r1.p;
        go3 r35 = (go3) r34.get();
        i80 r116 = da0.o;
        if (r35 != null) goto L39;
        da0 r36 = (da0) r4.getContext().K(r116);
        if (r36 == null) goto L38;
        r35 = r36.n;
        goto L39
    L38:
        r35 = null;
    L39:
        if (r35 == null) goto L56;
        if (r2 == true) goto L47;
        if (r35.b == false) goto L47;
        h12.P(1, "Cannot upgrade connection from reader to writer");
        throw null;
    L47:
        if (r4.getContext().K(r116) != null) goto L52;
        da0 r37 = new da0(r35);
        r34.getClass();
        ne0 r38 = ya4.F(r37, new ht4(r35, r34));
        p r39 = new p(r3, r35, r12, 7);
        r4.w = 1;
        Object r40 = fu.P(r38, r39, r4);
        if (r40 == r13) goto L87;
        return r40;
    L52:
        r4.w = 2;
        Object r41 = r3.invoke(r35, r4);
        if (r41 == r13) goto L87;
        return r41;
    L56:
        if (r2 == false) goto L59;
        wn3 r42 = r1.n;
    L58:
        wn3 r43 = r42;
        r14 = new jx3();
        r113 = r4.getContext();     // Catch: Throwable -> L101
        r112 = new jx3();     // Catch: Throwable -> L101
        long r44 = r1.r;     // Catch: Throwable -> L67
        r r45 = new r(r112, r43, r12, r9);     // Catch: Throwable -> L67
        r4.n = r1;     // Catch: Throwable -> L67
        r4.o = (Serializable) r3;     // Catch: Throwable -> L67
        r4.p = r43;     // Catch: Throwable -> L67
        r4.q = r14;     // Catch: Throwable -> L67
        r4.r = r113;     // Catch: Throwable -> L67
        r4.s = r112;     // Catch: Throwable -> L67
        r4.t = r2;     // Catch: Throwable -> L67
        r4.w = 3;     // Catch: Throwable -> L67
        if (gb.i0(r44, r45, r4) == r13) goto L87;
        r25 = r43;
        r24 = r14;
        r26 = r113;
        r111 = r1;
        r21 = r2;
        r22 = r112;
    L67:
        th = th;
        r25 = r43;
        r24 = r14;
    L101:
        th = move-exception;
        r15 = th;
        r8 = r43;
        goto L130
    L59:
        r42 = r1.o;
        goto L58
    L116:
        h12.P(21, "Connection pool is closed");
        throw null;
    L7:
        r4 = new ha0(r1, r20);
        goto L8
    }

    public ia0(rf2 r4) {
        this.p = new ThreadLocal();
        this.q = new AtomicBoolean(false);
        om0 r0 = mx0.n;
        this.r = e35.V(30);
        wn3 r1 = new wn3(1, new wc(3, r4));
        this.n = r1;
        this.o = r1;
    }
}
