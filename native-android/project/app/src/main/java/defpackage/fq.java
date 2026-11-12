package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class fq implements qi3 {
    public final bu4 b;

    public fq() {
        this.b = new bu4();
    }

    @Override // defpackage.qi3
    public final void A() {
        Y0(6);
    }

    @Override // defpackage.qi3
    public final void B0(gn2 r1) {
        L0(yw1.o(r1));
    }

    @Override // defpackage.qi3
    public final void C() {
        X0(o0(), 4, -9223372036854775807L, false);
    }

    @Override // defpackage.qi3
    public final void H0() {
        if (x0().p() == true) goto L27;
        if (k() == true) goto L27;
        if (f0() == false) goto L20;
        int r2 = j0();
        if (r2 != (-1)) goto L14;
        W0(9);
        return;
    L14:
        if (r2 != o0()) goto L17;
        X0(o0(), 9, -9223372036854775807L, true);
        return;
    L17:
        X0(r2, 9, -9223372036854775807L, false);
        return;
    L20:
        if (V0() == true) goto L22;
    L25:
        W0(9);
        return;
    L22:
        if (T0() == false) goto L25;
        X0(o0(), 9, -9223372036854775807L, false);
        return;
    L27:
        W0(9);
    }

    @Override // defpackage.qi3
    public final boolean I() {
        if (w() == (-1)) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // defpackage.qi3
    public final void I0() {
        long r0 = X();
        long r2 = M0() + r0;
        long r1 = getDuration();
        if (r1 == (-9223372036854775807L)) goto L5;
        r2 = Math.min(r2, r1);
    L5:
        long r7 = Math.max(r2, 0);
        X0(o0(), 12, r7, false);
    }

    @Override // defpackage.qi3
    public final void J0() {
        long r0 = -O0();
        long r2 = M0() + r0;
        long r1 = getDuration();
        if (r1 == (-9223372036854775807L)) goto L5;
        r2 = Math.min(r2, r1);
    L5:
        long r7 = Math.max(r2, 0);
        X0(o0(), 11, r7, false);
    }

    @Override // defpackage.qi3
    public final void N(int r2) {
        P(r2, r2 + 1);
    }

    @Override // defpackage.qi3
    public final void O(long r7) {
        X0(o0(), 5, r7, false);
    }

    @Override // defpackage.qi3
    public final boolean P0() {
        return true;
    }

    @Override // defpackage.qi3
    public final int Q0() {
        return x0().o();
    }

    @Override // defpackage.qi3
    public final boolean R0() {
        cu4 r0 = x0();
        if (r0.p() == false) goto L5;
        return false;
    L5:
        if (r0.m(o0(), this.b, 0).g == false) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // defpackage.qi3
    public final void S() {
        if (x0().p() == true) goto L23;
        if (k() == true) goto L23;
        boolean r0 = I();
        if (V0() == true) goto L10;
    L16:
        if (r0 == true) goto L18;
    L21:
        X0(o0(), 7, 0, false);
        return;
    L18:
        if (M0() > u()) goto L21;
        Y0(7);
        return;
    L10:
        if (R0() == true) goto L16;
        if (r0 == false) goto L14;
        Y0(7);
        return;
    L14:
        W0(7);
        return;
    L23:
        W0(7);
    }

    @Override // defpackage.qi3
    public final boolean S0(int r1) {
        return o().a(r1);
    }

    @Override // defpackage.qi3
    public final boolean T0() {
        cu4 r0 = x0();
        if (r0.p() == false) goto L5;
        return false;
    L5:
        if (r0.m(o0(), this.b, 0).h == false) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // defpackage.qi3
    public final boolean V0() {
        cu4 r0 = x0();
        if (r0.p() == false) goto L5;
        return false;
    L5:
        if (r0.m(o0(), this.b, 0).a() == false) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // defpackage.qi3
    public final void W(int r7) {
        X0(r7, 10, -9223372036854775807L, false);
    }

    public final void W0(int r7) {
        X0(-1, r7, -9223372036854775807L, false);
    }

    public abstract void X0(int r1, int r2, long r3, boolean r5);

    @Override // defpackage.qi3
    public final gn2 Y(int r4) {
        return x0().m(r4, this.b, 0).b;
    }

    public final void Y0(int r9) {
        int r1 = w();
        if (r1 != (-1)) goto L7;
        W0(r9);
        return;
    L7:
        if (r1 != o0()) goto L10;
        X0(o0(), r9, -9223372036854775807L, true);
        return;
    L10:
        X0(r1, r9, -9223372036854775807L, false);
    }

    @Override // defpackage.qi3
    public final gn2 a() {
        cu4 r0 = x0();
        if (r0.p() == false) goto L7;
        return null;
    L7:
        return r0.m(o0(), this.b, 0).b;
    }

    @Override // defpackage.qi3
    public final void c() {
        V(false);
    }

    @Override // defpackage.qi3
    public final void c0() {
        int r1 = j0();
        if (r1 != (-1)) goto L7;
        W0(8);
        return;
    L7:
        if (r1 != o0()) goto L10;
        X0(o0(), 8, -9223372036854775807L, true);
        return;
    L10:
        X0(r1, 8, -9223372036854775807L, false);
    }

    @Override // defpackage.qi3
    public final void e(float r3) {
        d(new qh3(r3, i().b));
    }

    @Override // defpackage.qi3
    public final boolean f0() {
        if (j0() == (-1)) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // defpackage.qi3
    public final boolean h0() {
        if (g() == 3) goto L5;
        return false;
    L5:
        if (q() == true) goto L7;
        return false;
    L7:
        if (v0() != 0) goto L13;
        return true;
    L13:
        return false;
    }

    @Override // defpackage.qi3
    public final int j0() {
        cu4 r0 = x0();
        if (r0.p() == false) goto L6;
        return -1;
    L6:
        int r1 = o0();
        int r2 = h();
        if (r2 != 1) goto L10;
        r2 = 0;
    L10:
        return r0.e(r1, r2, D0());
    }

    @Override // defpackage.qi3
    public final long l() {
        cu4 r0 = x0();
        if (r0.p() == false) goto L5;
        return -9223372036854775807L;
    L5:
        int r1 = o0();
        bu4 r6 = this.b;
        if (r0.m(r1, r6, 0).e != (-9223372036854775807L)) goto L9;
        return -9223372036854775807L;
    L9:
        return (f35.B(r6.f) - r6.e) - Z();
    }

    @Override // defpackage.qi3
    public final void m0() {
        V(true);
    }

    @Override // defpackage.qi3
    public final void n(int r7, long r8) {
        X0(r7, 10, r8, false);
    }

    @Override // defpackage.qi3
    public final void p(gn2 r2, long r3) {
        T(yw1.o(r2), 0, r3);
    }

    @Override // defpackage.qi3
    public final void r() {
        P(0, Integer.MAX_VALUE);
    }

    @Override // defpackage.qi3
    public final void s0(gn2 r1) {
        L0(yw1.o(r1));
    }

    @Override // defpackage.qi3
    public final int t() {
        if (S0(16) == true) goto L5;
        return 0;
    L5:
        long r2 = b0();
        long r4 = getDuration();
        if (r2 != (-9223372036854775807L)) goto L8;
    L15:
        return 0;
    L8:
        if (r4 == (-9223372036854775807L)) goto L15;
        if (r4 != 0) goto L14;
        return 100;
    L14:
        return f35.j(f35.V(r2, r4), 0, 100);
    }

    @Override // defpackage.qi3
    public final void t0(int r2, int r3) {
        if (r2 == r3) goto L5;
        u0(r2, r2 + 1, r3);
        return;
    }

    @Override // defpackage.qi3
    public final int w() {
        cu4 r0 = x0();
        if (r0.p() == false) goto L6;
        return -1;
    L6:
        int r1 = o0();
        int r2 = h();
        if (r2 != 1) goto L10;
        r2 = 0;
    L10:
        return r0.k(r1, r2, D0());
    }

    @Override // defpackage.qi3
    public final void w0(List r2) {
        N0(r2, Integer.MAX_VALUE);
    }

    @Override // defpackage.qi3
    public final long x() {
        cu4 r0 = x0();
        if (r0.p() == false) goto L7;
        return -9223372036854775807L;
    L7:
        return f35.i0(r0.m(o0(), this.b, 0).l);
    }

    @Override // defpackage.qi3
    public final void z0(int r2, gn2 r3) {
        L(r2, r2 + 1, yw1.o(r3));
    }
}
