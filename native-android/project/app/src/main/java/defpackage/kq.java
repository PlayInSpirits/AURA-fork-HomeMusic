package defpackage;

import androidx.media3.exoplayer.ExoPlaybackException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class kq implements rk3 {
    public boolean A;
    public boolean B;
    public cu4 C;
    public mt2 D;
    public pn0 E;
    public final Object n;
    public final int o;
    public final gp3 p;
    public dz3 q;
    public int r;
    public ik3 s;
    public vp4 t;
    public int u;
    public q44 v;
    public tb1[] w;
    public long x;
    public long y;
    public long z;

    public kq(int r3) {
        this.n = new Object();
        this.o = r3;
        this.p = new gp3(9, false);
        this.z = Long.MIN_VALUE;
        this.C = cu4.a;
    }

    public static int a(int r0, int r1, int r2, int r3) {
        return (((r0 | r1) | r2) | 128) | r3;
    }

    public static boolean n(int r1, boolean r2) {
        int r3 = r1 & 7;
        if (r3 == 4) goto L10;
        if (r2 == true) goto L6;
        return false;
    L6:
        if (r3 == 3) goto L13;
        return false;
    L13:
        return true;
    L10:
        return true;
    }

    public abstract void A(long r1, long r3);

    public final void B(tb1[] r8, q44 r9, long r10, long r12, mt2 r14) {
        rr2.w(!this.A);
        this.v = r9;
        this.D = r14;
        if (this.z != Long.MIN_VALUE) goto L5;
        this.z = r10;
    L5:
        this.w = r8;
        this.x = r12;
        x(r8, r10, r12, r14);
    }

    public final void C(long r4, boolean r6, boolean r7) {
        this.A = false;
        this.y = r4;
        this.z = r4;
        if (r7 == true) goto L8;
        q44 r8 = this.v;
        r8.getClass();
        if (r8.u(r4 - this.x) == 0) goto L7;
        r7 = true;
        goto L8
    L7:
        r7 = false;
    L8:
        r(r4, r6, r7);
    }

    public void D(float r1, float r2) {
    }

    public abstract int E(tb1 r1);

    public int F() {
        return 0;
    }

    public boolean G(long r1) {
        return false;
    }

    public final ExoPlaybackException b(Throwable r11, tb1 r12, boolean r13, int r14) {
        if (r12 != null) goto L5;
    L13:
        int r3 = 4;
    L14:
        String r4 = h();
        int r5 = this.r;
        mt2 r8 = this.D;
        if (r12 != null) goto L17;
        int r7 = 4;
    L19:
        return new ExoPlaybackException(1, r11, r14, r4, r5, r12, r7, r8, r13);
    L17:
        r7 = r3;
        goto L19
    L5:
        if (this.B == true) goto L13;
        this.B = true;
        r3 = E(r12) & 7;
        this.B = false;
        goto L14
    L12:
        this.B = false;
    L9:
        th = move-exception;
        this.B = false;
        throw th;
    }

    @Override // defpackage.rk3
    public void c(int r1, Object r2) {
    }

    public void e() {
    }

    public long f(long r1, long r3) {
        if (this.u == 1) goto L5;
        return 10000;
    L5:
        if (o() == false) goto L7;
        return 1000000;
    L7:
        if (m() == false) goto L13;
        return 1000000;
    L13:
        return 10000;
    }

    public yj2 g() {
        return null;
    }

    public abstract String h();

    public final boolean l() {
        if (this.z != Long.MIN_VALUE) goto L6;
        return true;
    L6:
        return false;
    }

    public abstract boolean m();

    public abstract boolean o();

    public abstract void p();

    public void q(boolean r1, boolean r2) {
    }

    public abstract void r(long r1, boolean r3, boolean r4);

    public void s() {
    }

    public final void t() {
        Object r0 = this.n;
        monitor-enter(r0);
        pn0 r1 = this.E;     // Catch: Throwable -> L16
        monitor-exit(r0);     // Catch: Throwable -> L16
        if (r1 == null) goto L15;
        Object r2 = r1.c;
        monitor-enter(r2);
        r1.f.getClass();     // Catch: Throwable -> L12
        monitor-exit(r2);     // Catch: Throwable -> L12
        return;
    L12:
        th = move-exception;
        throw th;
    L15:
        return;
    L16:
        th = move-exception;
        throw th;
    }

    public void u() {
    }

    public void v() {
    }

    public void w() {
    }

    public void x(tb1[] r1, long r2, long r4, mt2 r6) {
    }

    public void y() {
    }

    public final int z(gp3 r5, cj0 r6, int r7) {
        q44 r0 = this.v;
        r0.getClass();
        int r8 = r0.t(r5, r6, r7);
        if (r8 != (-4)) goto L14;
        if (r6.d(4) == false) goto L11;
        this.z = Long.MIN_VALUE;
        if (this.A == false) goto L9;
        return -4;
    L9:
        return -3;
    L11:
        long r1 = r6.t + this.x;
        r6.t = r1;
        this.z = Math.max(this.z, r1);
        return r8;
    L14:
        if (r8 != (-5)) goto L18;
        tb1 r9 = (tb1) r5.p;
        r9.getClass();
        long r2 = r9.s;
        if (r2 == Long.MAX_VALUE) goto L18;
        sb1 r10 = r9.a();
        r10.r = r2 + this.x;
        r5.p = new tb1(r10);
    L18:
        return r8;
    }
}
