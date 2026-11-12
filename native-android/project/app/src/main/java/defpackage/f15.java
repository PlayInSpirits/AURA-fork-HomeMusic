package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class f15 extends e64 {
    public final ThreadLocal t;
    private volatile boolean threadLocalIsSet;

    public f15(ne0 r3, wd0 r4) {
        iz r0 = iz.p;
        if (r3.K(r0) != null) goto L5;
        ne0 r1 = r3.J(r0);
    L6:
        super(r4, r1);
        this.t = new ThreadLocal();
        if ((r4.getContext().K(fz0.R) instanceof pe0) == true) goto L10;
        Object r5 = te5.R(r3, null);
        te5.K(r3, r5);
        n0(r3, r5);
        return;
    L10:
        return;
    L5:
        r1 = r3;
        goto L6
    }

    @Override // defpackage.e64, defpackage.a32
    public final void m(Object r6) {
        if (this.threadLocalIsSet == false) goto L8;
        kd3 r0 = (kd3) this.t.get();
        if (r0 == null) goto L7;
        te5.K((ne0) r0.n, r0.o);
    L7:
        this.t.remove();
    L8:
        Object r7 = hw.I(r6);
        vd0 r1 = this.s;
        ne0 r2 = r1.getContext();
        f15 r3 = null;
        Object r4 = te5.R(r2, null);
        if (r4 == te5.b) goto L25;
        r3 = jz4.Q(r1, r2, r4);
    L25:
        this.s.resumeWith(r7);     // Catch: Throwable -> L19
        if (r3 != null) goto L14;
    L17:
        te5.K(r2, r4);
        return;
    L14:
        if (r3.m0() == true) goto L17;
        return;
    L19:
        th = move-exception;
        if (r3 != null) goto L22;
    L23:
        te5.K(r2, r4);
    L24:
        throw th;
    L22:
        if (r3.m0() == false) goto L24;
        goto L23
    }

    public final boolean m0() {
        if (this.threadLocalIsSet == true) goto L5;
    L7:
        boolean r0 = false;
    L8:
        this.t.remove();
        return !r0;
    L5:
        if (this.t.get() != null) goto L7;
        r0 = true;
        goto L8
    }

    public final void n0(ne0 r2, Object r3) {
        this.threadLocalIsSet = true;
        this.t.set(new kd3(r2, r3));
    }
}
