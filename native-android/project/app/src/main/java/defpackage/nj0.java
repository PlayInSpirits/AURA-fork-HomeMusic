package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.ExoPlaybackException;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nj0 implements oi3, st2, tw0 {
    public final vp4 n;
    public final zt4 o;
    public final bu4 p;
    public final ml3 q;
    public final SparseArray r;
    public tc2 s;
    public qi3 t;
    public yp4 u;
    public boolean v;

    public nj0(vp4 vp4Var) {
        vp4Var.getClass();
        this.n = vp4Var;
        this.s = new tc2(f35.x().getThread());
        zt4 zt4Var = new zt4();
        this.o = zt4Var;
        this.p = new bu4();
        this.q = new ml3(zt4Var);
        this.r = new SparseArray();
    }

    @Override // defpackage.oi3
    public final void A(jw4 jw4Var) {
        b0(W(), 2, new oi0(11));
    }

    @Override // defpackage.oi3
    public final void B(qi3 qi3Var, ni3 ni3Var) {
    }

    @Override // defpackage.oi3
    public final void C(int i, boolean z) {
        b0(W(), 30, new oi0(10));
    }

    @Override // defpackage.tw0
    public final void D(int i, mt2 mt2Var, tv1 tv1Var) {
        b0(Z(i, mt2Var), 1023, new jj0(23));
    }

    @Override // defpackage.oi3
    public final void E(long j) {
        b0(W(), 16, new oi0(27));
    }

    @Override // defpackage.oi3
    public final void F(do2 do2Var) {
        b0(W(), 14, new oi0(28));
    }

    @Override // defpackage.oi3
    public final void G(do2 do2Var) {
        b0(W(), 15, new oi0(19));
    }

    @Override // defpackage.oi3
    public final void H(long j) {
        b0(W(), 17, new jj0(4));
    }

    @Override // defpackage.oi3
    public final void I(cu4 cu4Var, int i) {
        qi3 qi3Var = this.t;
        qi3Var.getClass();
        ml3 ml3Var = this.q;
        ml3Var.d = ml3.k(qi3Var, (yw1) ml3Var.b, (mt2) ml3Var.e, (zt4) ml3Var.a);
        ml3Var.v(qi3Var.x0());
        b0(W(), 0, new jj0(29));
    }

    @Override // defpackage.oi3
    public final void J() {
    }

    @Override // defpackage.oi3
    public final void K(List list) {
        b0(W(), 27, new oi0(14));
    }

    @Override // defpackage.oi3
    public final void L(int i, boolean z) {
        b0(W(), -1, new oi0(2));
    }

    @Override // defpackage.tw0
    public final void M(int i, mt2 mt2Var) {
        b0(Z(i, mt2Var), 1027, new jj0(20));
    }

    @Override // defpackage.oi3
    public final void N(qh3 qh3Var) {
        b0(W(), 12, new oi0(1));
    }

    @Override // defpackage.oi3
    public final void O(mi3 mi3Var) {
        b0(W(), 13, new jj0(27));
    }

    @Override // defpackage.oi3
    public final void P(PlaybackException playbackException) {
        mt2 mt2Var;
        b0((!(playbackException instanceof ExoPlaybackException) || (mt2Var = ((ExoPlaybackException) playbackException).B) == null) ? W() : X(mt2Var), 10, new oi0(9));
    }

    @Override // defpackage.oi3
    public final void Q(hp0 hp0Var) {
        b0(W(), 29, new oi0(17));
    }

    @Override // defpackage.oi3
    public final void R(long j) {
        b0(W(), 18, new jj0(0));
    }

    @Override // defpackage.oi3
    public final void S(PlaybackException playbackException) {
        mt2 mt2Var;
        q9 q9VarW = (!(playbackException instanceof ExoPlaybackException) || (mt2Var = ((ExoPlaybackException) playbackException).B) == null) ? W() : X(mt2Var);
        b0(q9VarW, 10, new hj0(q9VarW, playbackException));
    }

    @Override // defpackage.oi3
    public final void T(int i, int i2) {
        b0(a0(), 24, new oi0(26));
    }

    @Override // defpackage.st2
    public final void U(int i, mt2 mt2Var, ed2 ed2Var, un2 un2Var, int i2) {
        b0(Z(i, mt2Var), 1000, new oi0(29));
    }

    @Override // defpackage.oi3
    public final void V(boolean z) {
        b0(W(), 7, new oi0(5));
    }

    public final q9 W() {
        return X((mt2) this.q.d);
    }

    public final q9 X(mt2 mt2Var) {
        this.t.getClass();
        cu4 cu4Var = mt2Var == null ? null : (cu4) ((ly3) this.q.c).get(mt2Var);
        if (mt2Var != null && cu4Var != null) {
            return Y(cu4Var, cu4Var.g(mt2Var.a, this.o).c, mt2Var);
        }
        int iO0 = this.t.o0();
        cu4 cu4VarX0 = this.t.x0();
        if (iO0 >= cu4VarX0.o()) {
            cu4VarX0 = cu4.a;
        }
        return Y(cu4VarX0, iO0, null);
    }

    public final q9 Y(cu4 cu4Var, int i, mt2 mt2Var) {
        mt2 mt2Var2 = cu4Var.p() ? null : mt2Var;
        this.n.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = cu4Var.equals(this.t.x0()) && i == this.t.o0();
        long jI0 = 0;
        if (mt2Var2 == null || !mt2Var2.b()) {
            if (z) {
                jI0 = this.t.Z();
            } else if (!cu4Var.p()) {
                jI0 = f35.i0(cu4Var.m(i, this.p, 0L).k);
            }
        } else if (z && this.t.n0() == mt2Var2.b && this.t.K() == mt2Var2.c) {
            jI0 = this.t.M0();
        }
        return new q9(jElapsedRealtime, cu4Var, i, mt2Var2, jI0, this.t.x0(), this.t.o0(), (mt2) this.q.d, this.t.M0(), this.t.m());
    }

    public final q9 Z(int i, mt2 mt2Var) {
        this.t.getClass();
        if (mt2Var != null) {
            return ((cu4) ((ly3) this.q.c).get(mt2Var)) != null ? X(mt2Var) : Y(cu4.a, i, mt2Var);
        }
        cu4 cu4VarX0 = this.t.x0();
        if (i >= cu4VarX0.o()) {
            cu4VarX0 = cu4.a;
        }
        return Y(cu4VarX0, i, null);
    }

    @Override // defpackage.oi3
    public final void a(s55 s55Var) {
        q9 q9VarA0 = a0();
        b0(q9VarA0, 25, new kj0(q9VarA0, s55Var));
    }

    public final q9 a0() {
        return X((mt2) this.q.f);
    }

    @Override // defpackage.oi3
    public final void b(int i) {
        b0(a0(), 21, new oi0(18));
    }

    public final void b0(q9 q9Var, int i, qc2 qc2Var) {
        this.r.put(i, q9Var);
        this.s.f(i, qc2Var);
    }

    @Override // defpackage.tw0
    public final void c(int i, mt2 mt2Var, Exception exc) {
        b0(Z(i, mt2Var), 1024, new jj0(12));
    }

    public final void c0(i41 i41Var, Looper looper) {
        char c = 1;
        rr2.w(this.t == null || ((yw1) this.q.b).isEmpty());
        i41Var.getClass();
        this.t = i41Var;
        this.u = this.n.a(looper, null);
        tc2 tc2Var = this.s;
        ef0 ef0Var = new ef0(c == true ? 1 : 0, this, i41Var);
        tc2Var.getClass();
        vp4 vp4Var = this.n;
        rr2.w(vp4Var != null);
        this.s = new tc2(tc2Var.d, looper, looper.getThread(), vp4Var, ef0Var, tc2Var.i);
    }

    @Override // defpackage.oi3
    public final void d(boolean z) {
        b0(a0(), 23, new jj0(22));
    }

    @Override // defpackage.oi3
    public final void e(jg0 jg0Var) {
        b0(W(), 27, new oi0(21));
    }

    @Override // defpackage.oi3
    public final void f(int i) {
        b0(W(), 8, new oi0(22));
    }

    @Override // defpackage.oi3
    public final void g(int i) {
        b0(W(), 6, new oi0(7));
    }

    @Override // defpackage.oi3
    public final void h(qv2 qv2Var) {
        b0(W(), 28, new oi0(4));
    }

    @Override // defpackage.oi3
    public final void i(boolean z) {
    }

    @Override // defpackage.oi3
    public final void j(int i) {
    }

    @Override // defpackage.oi3
    public final void k(pi3 pi3Var, pi3 pi3Var2, int i) {
        if (i == 1) {
            this.v = false;
        }
        qi3 qi3Var = this.t;
        qi3Var.getClass();
        ml3 ml3Var = this.q;
        ml3Var.d = ml3.k(qi3Var, (yw1) ml3Var.b, (mt2) ml3Var.e, (zt4) ml3Var.a);
        q9 q9VarW = W();
        b0(q9VarW, 11, new ij0(q9VarW, i, pi3Var, pi3Var2));
    }

    @Override // defpackage.st2
    public final void l(int i, mt2 mt2Var, un2 un2Var) {
        q9 q9VarZ = Z(i, mt2Var);
        b0(q9VarZ, 1004, new ef0(2, q9VarZ, un2Var));
    }

    @Override // defpackage.st2
    public final void m(int i, mt2 mt2Var, un2 un2Var) {
        b0(Z(i, mt2Var), 1005, new jj0(19));
    }

    @Override // defpackage.oi3
    public final void n(il ilVar) {
        b0(a0(), 20, new oi0(3));
    }

    @Override // defpackage.oi3
    public final void o(cw4 cw4Var) {
        b0(W(), 19, new jj0(1));
    }

    @Override // defpackage.tw0
    public final void p(int i, mt2 mt2Var, int i2) {
        b0(Z(i, mt2Var), 1022, new jj0(11));
    }

    @Override // defpackage.oi3
    public final void q(boolean z) {
        b0(W(), 3, new jj0(8));
    }

    @Override // defpackage.oi3
    public final void r(int i, boolean z) {
        b0(W(), 5, new oi0(12));
    }

    @Override // defpackage.oi3
    public final void s(float f) {
        b0(a0(), 22, new jj0(5));
    }

    @Override // defpackage.oi3
    public final void t(int i, gn2 gn2Var) {
        b0(W(), 1, new mj0(0));
    }

    @Override // defpackage.st2
    public final void u(int i, mt2 mt2Var, ed2 ed2Var, un2 un2Var) {
        b0(Z(i, mt2Var), 1002, new jj0(9));
    }

    @Override // defpackage.oi3
    public final void v(int i) {
        b0(W(), 4, new oi0(16));
    }

    @Override // defpackage.st2
    public final void w(int i, mt2 mt2Var, ed2 ed2Var, un2 un2Var) {
        b0(Z(i, mt2Var), 1001, new jj0(13));
    }

    @Override // defpackage.oi3
    public final void x(boolean z) {
        b0(W(), 9, new oi0(25));
    }

    @Override // defpackage.st2
    public final void y(int i, mt2 mt2Var, ed2 ed2Var, un2 un2Var, IOException iOException, boolean z) {
        q9 q9VarZ = Z(i, mt2Var);
        b0(q9VarZ, 1003, new cn(q9VarZ, ed2Var, un2Var, iOException, z));
    }

    @Override // defpackage.tw0
    public final void z(int i, mt2 mt2Var) {
        b0(Z(i, mt2Var), 1025, new jj0(24));
    }
}
