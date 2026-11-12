package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class fq implements qi3 {
    public final bu4 b = new bu4();

    @Override // defpackage.qi3
    public final void A() {
        Y0(6);
    }

    @Override // defpackage.qi3
    public final void B0(gn2 gn2Var) {
        L0(yw1.o(gn2Var));
    }

    @Override // defpackage.qi3
    public final void C() {
        X0(o0(), 4, -9223372036854775807L, false);
    }

    @Override // defpackage.qi3
    public final void H0() {
        if (x0().p() || k()) {
            W0(9);
            return;
        }
        if (!f0()) {
            if (V0() && T0()) {
                X0(o0(), 9, -9223372036854775807L, false);
                return;
            } else {
                W0(9);
                return;
            }
        }
        int iJ0 = j0();
        if (iJ0 == -1) {
            W0(9);
        } else if (iJ0 == o0()) {
            X0(o0(), 9, -9223372036854775807L, true);
        } else {
            X0(iJ0, 9, -9223372036854775807L, false);
        }
    }

    @Override // defpackage.qi3
    public final boolean I() {
        return w() != -1;
    }

    @Override // defpackage.qi3
    public final void I0() {
        long jM0 = M0() + X();
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            jM0 = Math.min(jM0, duration);
        }
        X0(o0(), 12, Math.max(jM0, 0L), false);
    }

    @Override // defpackage.qi3
    public final void J0() {
        long jM0 = M0() + (-O0());
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            jM0 = Math.min(jM0, duration);
        }
        X0(o0(), 11, Math.max(jM0, 0L), false);
    }

    @Override // defpackage.qi3
    public final void N(int i) {
        P(i, i + 1);
    }

    @Override // defpackage.qi3
    public final void O(long j) {
        X0(o0(), 5, j, false);
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
        cu4 cu4VarX0 = x0();
        return !cu4VarX0.p() && cu4VarX0.m(o0(), this.b, 0L).g;
    }

    @Override // defpackage.qi3
    public final void S() {
        if (x0().p() || k()) {
            W0(7);
            return;
        }
        boolean zI = I();
        if (V0() && !R0()) {
            if (zI) {
                Y0(7);
                return;
            } else {
                W0(7);
                return;
            }
        }
        if (!zI || M0() > u()) {
            X0(o0(), 7, 0L, false);
        } else {
            Y0(7);
        }
    }

    @Override // defpackage.qi3
    public final boolean S0(int i) {
        return o().a(i);
    }

    @Override // defpackage.qi3
    public final boolean T0() {
        cu4 cu4VarX0 = x0();
        return !cu4VarX0.p() && cu4VarX0.m(o0(), this.b, 0L).h;
    }

    @Override // defpackage.qi3
    public final boolean V0() {
        cu4 cu4VarX0 = x0();
        return !cu4VarX0.p() && cu4VarX0.m(o0(), this.b, 0L).a();
    }

    @Override // defpackage.qi3
    public final void W(int i) {
        X0(i, 10, -9223372036854775807L, false);
    }

    public final void W0(int i) {
        X0(-1, i, -9223372036854775807L, false);
    }

    public abstract void X0(int i, int i2, long j, boolean z);

    @Override // defpackage.qi3
    public final gn2 Y(int i) {
        return x0().m(i, this.b, 0L).b;
    }

    public final void Y0(int i) {
        int iW = w();
        if (iW == -1) {
            W0(i);
        } else if (iW == o0()) {
            X0(o0(), i, -9223372036854775807L, true);
        } else {
            X0(iW, i, -9223372036854775807L, false);
        }
    }

    @Override // defpackage.qi3
    public final gn2 a() {
        cu4 cu4VarX0 = x0();
        if (cu4VarX0.p()) {
            return null;
        }
        return cu4VarX0.m(o0(), this.b, 0L).b;
    }

    @Override // defpackage.qi3
    public final void c() {
        V(false);
    }

    @Override // defpackage.qi3
    public final void c0() {
        int iJ0 = j0();
        if (iJ0 == -1) {
            W0(8);
        } else if (iJ0 == o0()) {
            X0(o0(), 8, -9223372036854775807L, true);
        } else {
            X0(iJ0, 8, -9223372036854775807L, false);
        }
    }

    @Override // defpackage.qi3
    public final void e(float f) {
        d(new qh3(f, i().b));
    }

    @Override // defpackage.qi3
    public final boolean f0() {
        return j0() != -1;
    }

    @Override // defpackage.qi3
    public final boolean h0() {
        return g() == 3 && q() && v0() == 0;
    }

    @Override // defpackage.qi3
    public final int j0() {
        cu4 cu4VarX0 = x0();
        if (cu4VarX0.p()) {
            return -1;
        }
        int iO0 = o0();
        int iH = h();
        if (iH == 1) {
            iH = 0;
        }
        return cu4VarX0.e(iO0, iH, D0());
    }

    @Override // defpackage.qi3
    public final long l() {
        cu4 cu4VarX0 = x0();
        if (cu4VarX0.p()) {
            return -9223372036854775807L;
        }
        int iO0 = o0();
        bu4 bu4Var = this.b;
        if (cu4VarX0.m(iO0, bu4Var, 0L).e == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return (f35.B(bu4Var.f) - bu4Var.e) - Z();
    }

    @Override // defpackage.qi3
    public final void m0() {
        V(true);
    }

    @Override // defpackage.qi3
    public final void n(int i, long j) {
        X0(i, 10, j, false);
    }

    @Override // defpackage.qi3
    public final void p(gn2 gn2Var, long j) {
        T(yw1.o(gn2Var), 0, j);
    }

    @Override // defpackage.qi3
    public final void r() {
        P(0, Integer.MAX_VALUE);
    }

    @Override // defpackage.qi3
    public final void s0(gn2 gn2Var) {
        L0(yw1.o(gn2Var));
    }

    @Override // defpackage.qi3
    public final int t() {
        if (!S0(16)) {
            return 0;
        }
        long jB0 = b0();
        long duration = getDuration();
        if (jB0 == -9223372036854775807L || duration == -9223372036854775807L) {
            return 0;
        }
        if (duration == 0) {
            return 100;
        }
        return f35.j(f35.V(jB0, duration), 0, 100);
    }

    @Override // defpackage.qi3
    public final void t0(int i, int i2) {
        if (i != i2) {
            u0(i, i + 1, i2);
        }
    }

    @Override // defpackage.qi3
    public final int w() {
        cu4 cu4VarX0 = x0();
        if (cu4VarX0.p()) {
            return -1;
        }
        int iO0 = o0();
        int iH = h();
        if (iH == 1) {
            iH = 0;
        }
        return cu4VarX0.k(iO0, iH, D0());
    }

    @Override // defpackage.qi3
    public final void w0(List list) {
        N0(list, Integer.MAX_VALUE);
    }

    @Override // defpackage.qi3
    public final long x() {
        cu4 cu4VarX0 = x0();
        if (cu4VarX0.p()) {
            return -9223372036854775807L;
        }
        return f35.i0(cu4VarX0.m(o0(), this.b, 0L).l);
    }

    @Override // defpackage.qi3
    public final void z0(int i, gn2 gn2Var) {
        L(i, i + 1, yw1.o(gn2Var));
    }
}
