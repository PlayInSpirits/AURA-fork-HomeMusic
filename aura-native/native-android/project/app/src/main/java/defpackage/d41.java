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

    public d41(i41 i41Var) {
        this.n = i41Var;
    }

    @Override // defpackage.qm
    public final void F(long j) {
        nj0 nj0Var = this.n.t;
        nj0Var.b0(nj0Var.a0(), 1010, new jj0(26));
    }

    @Override // defpackage.qm
    public final void I(Exception exc) {
        nj0 nj0Var = this.n.t;
        nj0Var.b0(nj0Var.a0(), 1029, new oi0(23));
    }

    @Override // defpackage.qm
    public final void K(h40 h40Var) {
        qr2.b(this.n.G, h40Var);
    }

    @Override // defpackage.qm
    public final void S(int i, long j, long j2) {
        nj0 nj0Var = this.n.t;
        nj0Var.b0(nj0Var.a0(), 1011, new jj0(25));
    }

    @Override // defpackage.qm
    public final void T(bj0 bj0Var) {
        nj0 nj0Var = this.n.t;
        nj0Var.b0(nj0Var.a0(), 1007, new jj0(3));
    }

    @Override // defpackage.qm
    public final void V(long j, long j2, String str) {
        nj0 nj0Var = this.n.t;
        nj0Var.b0(nj0Var.a0(), 1008, new oi0(6));
    }

    @Override // defpackage.o55
    public final void a(s55 s55Var) {
        i41 i41Var = this.n;
        i41Var.k0 = s55Var;
        i41Var.n.f(25, new kj0(s55Var));
    }

    @Override // defpackage.qm
    public final void b(int i) {
        c6 c6Var = this.n.D;
        ij0 ij0Var = new ij0(i, 3);
        c6Var.getClass();
        rr2.w(Looper.myLooper() == ((yp4) c6Var.c).a.getLooper());
        c6Var.a++;
        c6Var.v(new k6(9, c6Var, ij0Var));
        c6Var.C(Integer.valueOf(i));
    }

    @Override // defpackage.o55
    public final void c(String str) {
        nj0 nj0Var = this.n.t;
        nj0Var.b0(nj0Var.a0(), 1019, new oi0(8));
    }

    @Override // defpackage.qm
    public final void d(boolean z) {
        i41 i41Var = this.n;
        if (i41Var.d0 == z) {
            return;
        }
        i41Var.d0 = z;
        i41Var.n.f(23, new t31(1, z));
    }

    @Override // defpackage.rs4
    public final void e(jg0 jg0Var) {
        i41 i41Var = this.n;
        i41Var.e0 = jg0Var;
        i41Var.n.f(27, new cn(9, jg0Var));
    }

    @Override // defpackage.qm
    public final void f(pa paVar) {
        nj0 nj0Var = this.n.t;
        nj0Var.b0(nj0Var.a0(), 1032, new jj0(28));
    }

    @Override // defpackage.qm
    public final void g(Exception exc) {
        nj0 nj0Var = this.n.t;
        nj0Var.b0(nj0Var.a0(), 1014, new jj0(21));
    }

    @Override // defpackage.xv2
    public final void h(qv2 qv2Var) {
        i41 i41Var = this.n;
        tc2 tc2Var = i41Var.n;
        co2 co2VarA = i41Var.o0.a();
        int i = 0;
        while (true) {
            pv2[] pv2VarArr = qv2Var.a;
            if (i >= pv2VarArr.length) {
                break;
            }
            pv2VarArr[i].b(co2VarA);
            i++;
        }
        i41Var.o0 = new do2(co2VarA);
        do2 do2VarA1 = i41Var.a1();
        if (!do2VarA1.equals(i41Var.S)) {
            i41Var.S = do2VarA1;
            tc2Var.c(14, new cn(10, this));
        }
        tc2Var.c(28, new cn(11, qv2Var));
        tc2Var.b();
    }

    @Override // defpackage.o55
    public final void i(int i, long j) {
        nj0 nj0Var = this.n.t;
        nj0Var.b0(nj0Var.X((mt2) nj0Var.q.e), 1021, new jj0(7));
    }

    @Override // defpackage.qm
    public final void j(pa paVar) {
        nj0 nj0Var = this.n.t;
        nj0Var.b0(nj0Var.a0(), 1031, new jj0(15));
    }

    @Override // defpackage.o55
    public final void k(bj0 bj0Var) {
        nj0 nj0Var = this.n.t;
        q9 q9VarX = nj0Var.X((mt2) nj0Var.q.e);
        nj0Var.b0(q9VarX, 1020, new cn(q9VarX, bj0Var));
    }

    @Override // defpackage.o55
    public final void l(bj0 bj0Var) {
        nj0 nj0Var = this.n.t;
        nj0Var.b0(nj0Var.a0(), 1015, new jj0(17));
    }

    @Override // defpackage.o55
    public final void m(int i, long j) {
        nj0 nj0Var = this.n.t;
        nj0Var.b0(nj0Var.X((mt2) nj0Var.q.e), 1018, new jj0(6));
    }

    @Override // defpackage.rs4
    public final void n(gy3 gy3Var) {
        this.n.n.f(27, new c41(gy3Var, 0));
    }

    @Override // defpackage.qm
    public final void o(bj0 bj0Var) {
        nj0 nj0Var = this.n.t;
        nj0Var.b0(nj0Var.X((mt2) nj0Var.q.e), 1013, new jj0(10));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Surface surface = new Surface(surfaceTexture);
        i41 i41Var = this.n;
        i41Var.t1(surface);
        i41Var.V = surface;
        i41Var.n1(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        i41 i41Var = this.n;
        i41Var.t1(null);
        i41Var.n1(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.n.n1(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // defpackage.qm
    public final void q(String str) {
        nj0 nj0Var = this.n.t;
        nj0Var.b0(nj0Var.a0(), 1012, new jj0(18));
    }

    @Override // defpackage.o55
    public final void r(h40 h40Var) {
        qr2.b(this.n.H, h40Var);
    }

    @Override // defpackage.o55
    public final void s(tb1 tb1Var, ej0 ej0Var) {
        nj0 nj0Var = this.n.t;
        nj0Var.b0(nj0Var.a0(), 1017, new jj0(14));
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.n.n1(i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        i41 i41Var = this.n;
        if (i41Var.X) {
            i41Var.t1(surfaceHolder.getSurface());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        i41 i41Var = this.n;
        if (i41Var.X) {
            i41Var.t1(null);
        }
        i41Var.n1(0, 0);
    }

    @Override // defpackage.o55
    public final void t(Exception exc) {
        nj0 nj0Var = this.n.t;
        nj0Var.b0(nj0Var.a0(), 1030, new mj0(1));
    }

    @Override // defpackage.o55
    public final void u(long j, Object obj) {
        i41 i41Var = this.n;
        nj0 nj0Var = i41Var.t;
        q9 q9VarA0 = nj0Var.a0();
        nj0Var.b0(q9VarA0, 26, new cn(q9VarA0, obj, j));
        if (i41Var.U == obj) {
            i41Var.n.f(26, new mj0(18));
        }
    }

    @Override // defpackage.o55
    public final void x(long j, long j2, String str) {
        nj0 nj0Var = this.n.t;
        nj0Var.b0(nj0Var.a0(), 1016, new oi0(24));
    }

    @Override // defpackage.qm
    public final void y(tb1 tb1Var, ej0 ej0Var) {
        nj0 nj0Var = this.n.t;
        nj0Var.b0(nj0Var.a0(), 1009, new jj0(16));
    }
}
