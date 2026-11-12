package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ch4 {
    public gh4 a;
    public long b;
    public boolean c;
    public int d;

    public ch4(long r8, gh4 r10) {
        this.a = r10;
        this.b = r8;
        o54 r11 = jh4.a;
        if (r8 == 0) goto L22;
        gh4 r12 = d();
        long r2 = r12.p;
        long[] r4 = r12.q;
        if (r4 == null) goto L7;
        r8 = r4[0];
    L14:
        Object r13 = jh4.c;
        monitor-enter(r13);
        int r9 = jh4.f.a(r8);     // Catch: Throwable -> L19
        monitor-exit(r13);
    L23:
        this.d = r9;
        return;
    L19:
        th = move-exception;
        throw th;
    L7:
        long r5 = r12.o;
        if (r5 == 0) goto L11;
        int r14 = Long.numberOfTrailingZeros(r5);
    L10:
        r8 = ((long) r14) + r2;
        goto L14
    L11:
        long r6 = r12.n;
        if (r6 == 0) goto L14;
        r2 = r2 + 64;
        r14 = Long.numberOfTrailingZeros(r6);
        goto L10
    L22:
        r9 = -1;
        goto L23
    }

    public static void q(ch4 r1) {
        jh4.b.n(r1);
    }

    public final void a() {
        Object r0 = jh4.c;
        monitor-enter(r0);
        b();     // Catch: Throwable -> L7
        p();     // Catch: Throwable -> L7
        monitor-exit(r0);
        return;
    L7:
        th = move-exception;
        throw th;
    }

    public void b() {
        jh4.d = jh4.d.b(g());
    }

    public abstract void c();

    public gh4 d() {
        return this.a;
    }

    public abstract if1 e();

    public abstract boolean f();

    public long g() {
        return this.b;
    }

    public int h() {
        return 0;
    }

    public abstract if1 i();

    public final ch4 j() {
        z05 r0 = jh4.b;
        ch4 r1 = (ch4) r0.f();
        r0.n(this);
        return r1;
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(rl4 r1);

    public final void o() {
        int r0 = this.d;
        if (r0 < 0) goto L6;
        jh4.u(r0);
        this.d = -1;
        return;
    }

    public void p() {
        o();
    }

    public void r(gh4 r1) {
        this.a = r1;
    }

    public void s(long r1) {
        this.b = r1;
    }

    public void t(int r1) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract ch4 u(if1 r1);
}
