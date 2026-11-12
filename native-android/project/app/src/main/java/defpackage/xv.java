package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xv implements t85 {
    public Object n;
    public cz o;
    public final /* synthetic */ aw p;

    public xv(aw r1) {
        this.p = r1;
        this.n = cw.p;
    }

    @Override // defpackage.t85
    public final void a(u84 r1, int r2) {
        cz r0 = this.o;
        if (r0 == null) goto L6;
        r0.a(r1, r2);
        return;
    }

    public final Object b(wd0 r15) {
        Object r0 = this.n;
        boolean r2 = true;
        if (r0 != cw.p) goto L5;
    L7:
        AtomicReferenceFieldUpdater r1 = aw.t;
        aw r6 = this.p;
        k10 r3 = (k10) r1.get(r6);
    L9:
        if (r6.B() == true) goto L10;
        long r4 = aw.p.getAndIncrement(r6);
        long r7 = cw.b;
        long r9 = r4 / r7;
        int r8 = (int) (r4 % r7);
        if (r3.e == r9) goto L20;
        k10 r5 = r6.q(r9, r3);
        if (r5 == null) goto L9;
    L21:
        Object r10 = r6.P(r5, r8, r4, null);
        f01 r11 = cw.m;
        if (r10 == r11) goto L77;
        f01 r12 = cw.o;
        if (r10 != r12) goto L30;
        if (r4 >= r6.v()) goto L28;
        r5.a();
    L28:
        r3 = r5;
        goto L9
    L30:
        if (r10 != cw.n) goto L74;
        aw r13 = this.p;
        cz r14 = zz1.s(ya4.x(r15));
        this.o = r14;     // Catch: Throwable -> L35
        Object r16 = r13.P(r5, r8, r4, this);     // Catch: Throwable -> L35
        if (r16 != r11) goto L37;
        a(r5, r8);     // Catch: Throwable -> L35
    L71:
        return r14.q();
    L37:
        if (r16 == r12) goto L39;
        r5.a();     // Catch: Throwable -> L35
        this.n = r16;     // Catch: Throwable -> L35
        this.o = null;     // Catch: Throwable -> L35
    L65:
        r14.k(Boolean.TRUE, null);     // Catch: Throwable -> L35
        goto L71
    L39:
        if (r4 >= r13.v()) goto L41;
        r5.a();     // Catch: Throwable -> L35
    L41:
        k10 r17 = (k10) aw.t.get(r13);     // Catch: Throwable -> L35
    L43:
        if (r13.B() == true) goto L44;
        long r18 = aw.p.getAndIncrement(r13);     // Catch: Throwable -> L35
        long r19 = cw.b;     // Catch: Throwable -> L35
        long r110 = r18 / r19;     // Catch: Throwable -> L35
        int r20 = (int) (r18 % r19);     // Catch: Throwable -> L35
        if (r17.e == r110) goto L54;
        k10 r21 = r13.q(r110, r17);     // Catch: Throwable -> L35
        if (r21 == null) goto L43;
        r17 = r21;
    L54:
        Object r22 = r13.P(r17, r20, r18, this);     // Catch: Throwable -> L35
        if (r22 == cw.m) goto L56;
        if (r22 != cw.o) goto L63;
        if (r18 >= r13.v()) goto L43;
        r17.a();     // Catch: Throwable -> L35
        goto L43
    L63:
        if (r22 == cw.n) goto L67;
        r17.a();     // Catch: Throwable -> L35
        this.n = r22;     // Catch: Throwable -> L35
        this.o = null;     // Catch: Throwable -> L35
        goto L65
    L67:
        throw new IllegalStateException("unexpected");     // Catch: Throwable -> L35
    L56:
        a(r17, r20);     // Catch: Throwable -> L35
        goto L71
    L44:
        cz r23 = this.o;     // Catch: Throwable -> L35
        r23.getClass();     // Catch: Throwable -> L35
        this.o = null;     // Catch: Throwable -> L35
        this.n = cw.l;     // Catch: Throwable -> L35
        Throwable r24 = r6.s();     // Catch: Throwable -> L35
        if (r24 != null) goto L47;
        r23.resumeWith(Boolean.FALSE);     // Catch: Throwable -> L35
        goto L71
    L47:
        r23.resumeWith(new s14(r24));     // Catch: Throwable -> L35
    L35:
        th = move-exception;
        r14.B();
        throw th;
    L74:
        r5.a();
        this.n = r10;
    L76:
        return Boolean.valueOf(r2);
    L77:
        kf2.o("unreachable");
        return null;
    L20:
        r5 = r3;
        goto L21
    L10:
        this.n = cw.l;
        Throwable r25 = r6.s();
        if (r25 != null) goto L13;
        r2 = false;
        goto L76
    L13:
        int r26 = mk4.a;
        throw r25;
    L5:
        if (r0 == cw.l) goto L7;
        goto L7
    }

    public final Object c() {
        Object r0 = this.n;
        f01 r1 = cw.p;
        if (r0 == r1) goto L9;
        this.n = r1;
        if (r0 == cw.l) goto L7;
        return r0;
    L7:
        Throwable r2 = this.p.t();
        int r3 = mk4.a;
        throw r2;
    L9:
        kf2.o("`hasNext()` has not been invoked");
        return null;
    }
}
