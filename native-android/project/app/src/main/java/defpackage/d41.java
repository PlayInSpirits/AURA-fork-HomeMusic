package defpackage;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class d41 implements o55, qm, rs4, xv2, SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public final /* synthetic */ i41 n;

    public d41(i41 r1) {
        this.n = r1;
    }

    @Override // defpackage.qm
    public final void F(long r2) {
        nj0 r1 = this.n.t;
        r1.b0(r1.a0(), 1010, new jj0(26));
    }

    @Override // defpackage.qm
    public final void I(Exception r3) {
        nj0 r2 = this.n.t;
        r2.b0(r2.a0(), 1029, new oi0(23));
    }

    @Override // defpackage.qm
    public final void K(h40 r1) {
        qr2.b(this.n.G, r1);
    }

    @Override // defpackage.qm
    public final void S(int r1, long r2, long r4) {
        nj0 r0 = this.n.t;
        r0.b0(r0.a0(), 1011, new jj0(25));
    }

    @Override // defpackage.qm
    public final void T(bj0 r3) {
        nj0 r2 = this.n.t;
        r2.b0(r2.a0(), 1007, new jj0(3));
    }

    @Override // defpackage.qm
    public final void V(long r1, long r3, String r5) {
        nj0 r0 = this.n.t;
        r0.b0(r0.a0(), 1008, new oi0(6));
    }

    @Override // defpackage.o55
    public final void a(s55 r2) {
        i41 r1 = this.n;
        r1.k0 = r2;
        r1.n.f(25, new kj0(r2));
    }

    @Override // defpackage.qm
    public final void b(int r5) {
        c6 r4 = this.n.D;
        ij0 r0 = new ij0(r5, 3);
        r4.getClass();
        if (Looper.myLooper() != ((yp4) r4.c).a.getLooper()) goto L5;
        boolean r1 = true;
    L6:
        rr2.w(r1);
        r4.a++;
        r4.v(new k6(9, r4, r0));
        Integer r2 = (Integer) r4.e;
        r4.C(Integer.valueOf(r5));
        return;
    L5:
        r1 = false;
        goto L6
    }

    @Override // defpackage.o55
    public final void c(String r3) {
        nj0 r2 = this.n.t;
        r2.b0(r2.a0(), 1019, new oi0(8));
    }

    @Override // defpackage.qm
    public final void d(boolean r3) {
        i41 r2 = this.n;
        if (r2.d0 != r3) goto L5;
        return;
    L5:
        r2.d0 = r3;
        r2.n.f(23, new t31(1, r3));
    }

    @Override // defpackage.rs4
    public final void e(jg0 r3) {
        i41 r2 = this.n;
        r2.e0 = r3;
        r2.n.f(27, new cn(9, r3));
    }

    @Override // defpackage.qm
    public final void f(pa r3) {
        nj0 r2 = this.n.t;
        r2.b0(r2.a0(), 1032, new jj0(28));
    }

    @Override // defpackage.qm
    public final void g(Exception r3) {
        nj0 r2 = this.n.t;
        r2.b0(r2.a0(), 1014, new jj0(21));
    }

    @Override // defpackage.xv2
    public final void h(qv2 r7) {
        i41 r0 = this.n;
        tc2 r1 = r0.n;
        co2 r2 = r0.o0.a();
        int r3 = 0;
    L3:
        pv2[] r4 = r7.a;
        if (r3 >= r4.length) goto L6;
        r4[r3].b(r2);
        r3 = r3 + 1;
        goto L3
    L6:
        r0.o0 = new do2(r2);
        do2 r5 = r0.a1();
        if (r5.equals(r0.S) == true) goto L9;
        r0.S = r5;
        r1.c(14, new cn(10, this));
    L9:
        r1.c(28, new cn(11, r7));
        r1.b();
    }

    @Override // defpackage.o55
    public final void i(int r1, long r2) {
        nj0 r0 = this.n.t;
        r0.b0(r0.X((mt2) r0.q.e), 1021, new jj0(7));
    }

    @Override // defpackage.qm
    public final void j(pa r3) {
        nj0 r2 = this.n.t;
        r2.b0(r2.a0(), 1031, new jj0(15));
    }

    @Override // defpackage.o55
    public final void k(bj0 r3) {
        nj0 r2 = this.n.t;
        q9 r0 = r2.X((mt2) r2.q.e);
        r2.b0(r0, 1020, new cn(r0, r3));
    }

    @Override // defpackage.o55
    public final void l(bj0 r3) {
        nj0 r2 = this.n.t;
        r2.b0(r2.a0(), 1015, new jj0(17));
    }

    @Override // defpackage.o55
    public final void m(int r1, long r2) {
        nj0 r0 = this.n.t;
        r0.b0(r0.X((mt2) r0.q.e), 1018, new jj0(6));
    }

    @Override // defpackage.rs4
    public final void n(gy3 r3) {
        this.n.n.f(27, new c41(r3, 0));
    }

    @Override // defpackage.qm
    public final void o(bj0 r3) {
        nj0 r2 = this.n.t;
        r2.b0(r2.X((mt2) r2.q.e), 1013, new jj0(10));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture r2, int r3, int r4) {
        Surface r0 = new Surface(r2);
        i41 r1 = this.n;
        r1.t1(r0);
        r1.V = r0;
        r1.n1(r3, r4);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture r1) {
        i41 r0 = this.n;
        r0.t1(null);
        r0.n1(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture r1, int r2, int r3) {
        this.n.n1(r2, r3);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture r1) {
    }

    @Override // defpackage.qm
    public final void q(String r3) {
        nj0 r2 = this.n.t;
        r2.b0(r2.a0(), 1012, new jj0(18));
    }

    @Override // defpackage.o55
    public final void r(h40 r1) {
        qr2.b(this.n.H, r1);
    }

    @Override // defpackage.o55
    public final void s(tb1 r2, ej0 r3) {
        nj0 r1 = this.n.t;
        r1.b0(r1.a0(), 1017, new jj0(14));
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder r1, int r2, int r3, int r4) {
        this.n.n1(r3, r4);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder r2) {
        i41 r1 = this.n;
        if (r1.X == false) goto L6;
        r1.t1(r2.getSurface());
        return;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder r1) {
        i41 r0 = this.n;
        if (r0.X == false) goto L5;
        r0.t1(null);
    L5:
        r0.n1(0, 0);
    }

    @Override // defpackage.o55
    public final void t(Exception r3) {
        nj0 r2 = this.n.t;
        r2.b0(r2.a0(), 1030, new mj0(1));
    }

    @Override // defpackage.o55
    public final void u(long r4, Object r6) {
        i41 r3 = this.n;
        nj0 r0 = r3.t;
        q9 r1 = r0.a0();
        r0.b0(r1, 26, new cn(r1, r6, r4));
        if (r3.U != r6) goto L6;
        r3.n.f(26, new mj0(18));
        return;
    }

    @Override // defpackage.o55
    public final void x(long r1, long r3, String r5) {
        nj0 r0 = this.n.t;
        r0.b0(r0.a0(), 1016, new oi0(24));
    }

    @Override // defpackage.qm
    public final void y(tb1 r2, ej0 r3) {
        nj0 r1 = this.n.t;
        r1.b0(r1.a0(), 1009, new jj0(16));
    }
}
