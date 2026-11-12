package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yy3 implements we0, vy3 {
    public static final iz q = null;
    public final ne0 n;
    public final yy3 o;
    public volatile ne0 p;

    static {
        q = new iz(0);
    }

    public yy3(ne0 r1) {
        this.n = r1;
        this.o = this;
    }

    @Override // defpackage.vy3
    public final void a() {
        b();
    }

    public final void b() {
        yy3 r0 = this.o;
        monitor-enter(r0);
        ne0 r1 = this.p;     // Catch: Throwable -> L7
        if (r1 != null) goto L9;
        this.p = q;     // Catch: Throwable -> L7
    L12:
        monitor-exit(r0);
        return;
    L9:
        pb1 r3 = new pb1(0);     // Catch: Throwable -> L7
        s22 r2 = (s22) r1.K(fz0.h0);     // Catch: Throwable -> L7
        if (r2 == null) goto L12;
        r2.f(r3);     // Catch: Throwable -> L7
    L7:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.vy3
    public final void c() {
        b();
    }

    @Override // defpackage.vy3
    public final void d() {
    }

    @Override // defpackage.we0
    public final ne0 e() {
        ne0 r0 = this.p;
        if (r0 != null) goto L5;
    L6:
        x80 r1 = (x80) this.n.K(x80.o);
        if (r1 == null) goto L9;
        ne0 r2 = new xy3(r1, this);
    L10:
        yy3 r3 = this.o;
        monitor-enter(r3);
        ne0 r4 = this.p;     // Catch: Throwable -> L15
        if (r4 != null) goto L18;
        ne0 r5 = this.n;     // Catch: Throwable -> L15
        ne0 r6 = r5.J(new t22((s22) r5.K(fz0.h0))).J(q01.n).J(r2);     // Catch: Throwable -> L15
    L21:
        this.p = r6;     // Catch: Throwable -> L15
        monitor-exit(r3);
        r0 = r6;
    L24:
        r0.getClass();
        return r0;
    L18:
        if (r4 != q) goto L20;
        ne0 r7 = this.n;     // Catch: Throwable -> L15
        t22 r8 = new t22((s22) r7.K(fz0.h0));     // Catch: Throwable -> L15
        r8.o(new pb1(0));     // Catch: Throwable -> L15
        r6 = r7.J(r8).J(q01.n).J(r2);     // Catch: Throwable -> L15
        goto L21
    L20:
        r6 = r4;
    L15:
        th = move-exception;
        throw th;
    L9:
        r2 = q01.n;
        goto L10
    L5:
        if (r0 != q) goto L24;
        goto L6
    }
}
