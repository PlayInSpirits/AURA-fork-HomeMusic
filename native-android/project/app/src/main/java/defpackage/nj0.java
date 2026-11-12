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

    public nj0(vp4 r2) {
        r2.getClass();
        this.n = r2;
        this.s = new tc2(f35.x().getThread());
        zt4 r3 = new zt4();
        this.o = r3;
        this.p = new bu4();
        this.q = new ml3(r3);
        this.r = new SparseArray();
    }

    @Override // defpackage.oi3
    public final void A(jw4 r3) {
        b0(W(), 2, new oi0(11));
    }

    @Override // defpackage.oi3
    public final void B(qi3 r1, ni3 r2) {
    }

    @Override // defpackage.oi3
    public final void C(int r2, boolean r3) {
        b0(W(), 30, new oi0(10));
    }

    @Override // defpackage.tw0
    public final void D(int r1, mt2 r2, tv1 r3) {
        b0(Z(r1, r2), 1023, new jj0(23));
    }

    @Override // defpackage.oi3
    public final void E(long r2) {
        b0(W(), 16, new oi0(27));
    }

    @Override // defpackage.oi3
    public final void F(do2 r3) {
        b0(W(), 14, new oi0(28));
    }

    @Override // defpackage.oi3
    public final void G(do2 r3) {
        b0(W(), 15, new oi0(19));
    }

    @Override // defpackage.oi3
    public final void H(long r2) {
        b0(W(), 17, new jj0(4));
    }

    @Override // defpackage.oi3
    public final void I(cu4 r4, int r5) {
        qi3 r6 = this.t;
        r6.getClass();
        ml3 r7 = this.q;
        r7.d = ml3.k(r6, (yw1) r7.b, (mt2) r7.e, (zt4) r7.a);
        r7.v(r6.x0());
        b0(W(), 0, new jj0(29));
    }

    @Override // defpackage.oi3
    public final void J() {
    }

    @Override // defpackage.oi3
    public final void K(List r3) {
        b0(W(), 27, new oi0(14));
    }

    @Override // defpackage.oi3
    public final void L(int r2, boolean r3) {
        b0(W(), -1, new oi0(2));
    }

    @Override // defpackage.tw0
    public final void M(int r2, mt2 r3) {
        b0(Z(r2, r3), 1027, new jj0(20));
    }

    @Override // defpackage.oi3
    public final void N(qh3 r3) {
        b0(W(), 12, new oi0(1));
    }

    @Override // defpackage.oi3
    public final void O(mi3 r3) {
        b0(W(), 13, new jj0(27));
    }

    @Override // defpackage.oi3
    public final void P(PlaybackException r3) {
        if ((r3 instanceof ExoPlaybackException) == false) goto L7;
        mt2 r4 = ((ExoPlaybackException) r3).B;
        if (r4 == null) goto L7;
        q9 r5 = X(r4);
    L8:
        b0(r5, 10, new oi0(9));
        return;
    L7:
        r5 = W();
        goto L8
    }

    @Override // defpackage.oi3
    public final void Q(hp0 r3) {
        b0(W(), 29, new oi0(17));
    }

    @Override // defpackage.oi3
    public final void R(long r2) {
        b0(W(), 18, new jj0(0));
    }

    @Override // defpackage.oi3
    public final void S(PlaybackException r3) {
        if ((r3 instanceof ExoPlaybackException) == false) goto L7;
        mt2 r0 = ((ExoPlaybackException) r3).B;
        if (r0 == null) goto L7;
        q9 r1 = X(r0);
    L8:
        b0(r1, 10, new hj0(r1, r3));
        return;
    L7:
        r1 = W();
        goto L8
    }

    @Override // defpackage.oi3
    public final void T(int r2, int r3) {
        b0(a0(), 24, new oi0(26));
    }

    @Override // defpackage.st2
    public final void U(int r1, mt2 r2, ed2 r3, un2 r4, int r5) {
        b0(Z(r1, r2), 1000, new oi0(29));
    }

    @Override // defpackage.oi3
    public final void V(boolean r3) {
        b0(W(), 7, new oi0(5));
    }

    public final q9 W() {
        return X((mt2) this.q.d);
    }

    public final q9 X(mt2 r4) {
        this.t.getClass();
        if (r4 != null) goto L5;
        cu4 r1 = null;
    L6:
        if (r4 == null) goto L11;
        if (r1 == null) goto L11;
        return Y(r1, r1.g(r4.a, this.o).c, r4);
    L11:
        int r5 = this.t.o0();
        cu4 r2 = this.t.x0();
        if (r5 < r2.o()) goto L16;
        r2 = cu4.a;
    L16:
        return Y(r2, r5, null);
    L5:
        r1 = (cu4) ((ly3) this.q.c).get(r4);
        goto L6
    }

    public final q9 Y(cu4 r17, int r18, mt2 r19) {
        if (r17.p() == false) goto L5;
        mt2 r5 = null;
    L6:
        this.n.getClass();
        long r1 = SystemClock.elapsedRealtime();
        if (r17.equals(this.t.x0()) == true) goto L9;
    L11:
        boolean r6 = false;
    L12:
        long r7 = 0;
        if (r5 != null) goto L15;
    L23:
        if (r6 == false) goto L26;
        r7 = this.t.Z();
    L30:
        return new q9(r1, r17, r18, r5, r7, this.t.x0(), this.t.o0(), (mt2) this.q.d, this.t.M0(), this.t.m());
    L26:
        if (r17.p() == true) goto L30;
        r7 = f35.i0(r17.m(r18, this.p, 0).k);
        goto L30
    L15:
        if (r5.b() == false) goto L23;
        if (r6 == false) goto L30;
        if (this.t.n0() != r5.b) goto L30;
        if (this.t.K() != r5.c) goto L30;
        r7 = this.t.M0();
        goto L30
    L9:
        if (r18 != this.t.o0()) goto L11;
        r6 = true;
        goto L12
    L5:
        r5 = r19;
        goto L6
    }

    public final q9 Z(int r2, mt2 r3) {
        this.t.getClass();
        if (r3 != null) goto L5;
        cu4 r4 = this.t.x0();
        if (r2 < r4.o()) goto L15;
        r4 = cu4.a;
    L15:
        return Y(r4, r2, null);
    L5:
        if (((cu4) ((ly3) this.q.c).get(r3)) == null) goto L9;
        return X(r3);
    L9:
        return Y(cu4.a, r2, r3);
    }

    @Override // defpackage.oi3
    public final void a(s55 r3) {
        q9 r0 = a0();
        b0(r0, 25, new kj0(r0, r3));
    }

    public final q9 a0() {
        return X((mt2) this.q.f);
    }

    @Override // defpackage.oi3
    public final void b(int r3) {
        b0(a0(), 21, new oi0(18));
    }

    public final void b0(q9 r2, int r3, qc2 r4) {
        this.r.put(r3, r2);
        this.s.f(r3, r4);
    }

    @Override // defpackage.tw0
    public final void c(int r1, mt2 r2, Exception r3) {
        b0(Z(r1, r2), 1024, new jj0(12));
    }

    public final void c0(i41 r11, Looper r12) {
        boolean r1 = true;
        char r2 = 1;
        if (this.t != null) goto L5;
    L8:
        boolean r0 = true;
    L9:
        rr2.w(r0);
        r11.getClass();
        this.t = r11;
        this.u = this.n.a(r12, null);
        tc2 r3 = this.s;
        ef0 r8 = new ef0(r2 == true ? 1 : 0, this, r11);
        r3.getClass();
        vp4 r7 = this.n;
        if (r7 != null) goto L12;
        r1 = false;
    L12:
        rr2.w(r1);
        this.s = new tc2(r3.d, r12, r12.getThread(), r7, r8, r3.i);
        return;
    L5:
        if (((yw1) this.q.b).isEmpty() == true) goto L8;
        r0 = false;
        goto L9
    }

    @Override // defpackage.oi3
    public final void d(boolean r3) {
        b0(a0(), 23, new jj0(22));
    }

    @Override // defpackage.oi3
    public final void e(jg0 r3) {
        b0(W(), 27, new oi0(21));
    }

    @Override // defpackage.oi3
    public final void f(int r3) {
        b0(W(), 8, new oi0(22));
    }

    @Override // defpackage.oi3
    public final void g(int r3) {
        b0(W(), 6, new oi0(7));
    }

    @Override // defpackage.oi3
    public final void h(qv2 r3) {
        b0(W(), 28, new oi0(4));
    }

    @Override // defpackage.oi3
    public final void i(boolean r1) {
    }

    @Override // defpackage.oi3
    public final void j(int r1) {
    }

    @Override // defpackage.oi3
    public final void k(pi3 r6, pi3 r7, int r8) {
        if (r8 != 1) goto L5;
        this.v = false;
    L5:
        qi3 r0 = this.t;
        r0.getClass();
        ml3 r1 = this.q;
        r1.d = ml3.k(r0, (yw1) r1.b, (mt2) r1.e, (zt4) r1.a);
        q9 r2 = W();
        b0(r2, 11, new ij0(r2, r8, r6, r7));
    }

    @Override // defpackage.st2
    public final void l(int r2, mt2 r3, un2 r4) {
        q9 r5 = Z(r2, r3);
        b0(r5, 1004, new ef0(2, r5, r4));
    }

    @Override // defpackage.st2
    public final void m(int r1, mt2 r2, un2 r3) {
        b0(Z(r1, r2), 1005, new jj0(19));
    }

    @Override // defpackage.oi3
    public final void n(il r3) {
        b0(a0(), 20, new oi0(3));
    }

    @Override // defpackage.oi3
    public final void o(cw4 r3) {
        b0(W(), 19, new jj0(1));
    }

    @Override // defpackage.tw0
    public final void p(int r1, mt2 r2, int r3) {
        b0(Z(r1, r2), 1022, new jj0(11));
    }

    @Override // defpackage.oi3
    public final void q(boolean r3) {
        b0(W(), 3, new jj0(8));
    }

    @Override // defpackage.oi3
    public final void r(int r2, boolean r3) {
        b0(W(), 5, new oi0(12));
    }

    @Override // defpackage.oi3
    public final void s(float r3) {
        b0(a0(), 22, new jj0(5));
    }

    @Override // defpackage.oi3
    public final void t(int r2, gn2 r3) {
        b0(W(), 1, new mj0(0));
    }

    @Override // defpackage.st2
    public final void u(int r1, mt2 r2, ed2 r3, un2 r4) {
        b0(Z(r1, r2), 1002, new jj0(9));
    }

    @Override // defpackage.oi3
    public final void v(int r3) {
        b0(W(), 4, new oi0(16));
    }

    @Override // defpackage.st2
    public final void w(int r1, mt2 r2, ed2 r3, un2 r4) {
        b0(Z(r1, r2), 1001, new jj0(13));
    }

    @Override // defpackage.oi3
    public final void x(boolean r3) {
        b0(W(), 9, new oi0(25));
    }

    @Override // defpackage.st2
    public final void y(int r1, mt2 r2, ed2 r3, un2 r4, IOException r5, boolean r6) {
        q9 r7 = Z(r1, r2);
        b0(r7, 1003, new cn(r7, r3, r4, r5, r6));
    }

    @Override // defpackage.tw0
    public final void z(int r2, mt2 r3) {
        b0(Z(r2, r3), 1025, new jj0(24));
    }
}
