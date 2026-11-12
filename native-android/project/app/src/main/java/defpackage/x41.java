package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Surface;
import androidx.media3.decoder.DecoderException;
import androidx.media3.exoplayer.ExoPlaybackException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class x41 extends kq {
    public final long F;
    public final rf2 G;
    public final tu H;
    public final cj0 I;
    public tb1 J;
    public int K;
    public Surface L;
    public Surface M;
    public pw0 N;
    public pw0 O;
    public int P;
    public long Q;
    public boolean R;
    public s55 S;
    public long T;
    public int U;
    public bj0 V;

    public x41(long j, Handler handler, o55 o55Var, int i) {
        super(2);
        this.F = j;
        this.Q = -9223372036854775807L;
        this.H = new tu();
        this.I = new cj0(0, 0);
        this.G = new rf2(handler, o55Var);
        this.K = -1;
        this.P = 0;
        this.V = new bj0();
    }

    @Override // defpackage.kq
    public final void A(long j, long j2) throws ExoPlaybackException {
        if (this.R) {
            return;
        }
        if (this.J == null) {
            gp3 gp3Var = this.p;
            gp3Var.d();
            cj0 cj0Var = this.I;
            cj0Var.r();
            int iZ = z(gp3Var, cj0Var, 2);
            if (iZ != -5) {
                if (iZ == -4) {
                    rr2.w(cj0Var.d(4));
                    this.R = true;
                    return;
                }
                return;
            }
            tb1 tb1Var = (tb1) gp3Var.p;
            tb1Var.getClass();
            pw0 pw0Var = (pw0) gp3Var.o;
            pw0.b(this.O, pw0Var);
            this.O = pw0Var;
            this.J = tb1Var;
            H();
            tb1 tb1Var2 = this.J;
            tb1Var2.getClass();
            rf2 rf2Var = this.G;
            Handler handler = (Handler) rf2Var.n;
            if (handler != null) {
                handler.post(new qo2(rf2Var, tb1Var2, null, 19));
            }
        }
        H();
    }

    @Override // defpackage.kq
    public final int E(tb1 tb1Var) {
        return kq.a(0, 0, 0, 0);
    }

    public final void H() throws ExoPlaybackException {
        pw0 pw0Var = this.O;
        pw0.b(this.N, pw0Var);
        this.N = pw0Var;
        if (pw0Var != null && pw0Var.h() == null && this.N.g() == null) {
            return;
        }
        try {
            SystemClock.elapsedRealtime();
            this.J.getClass();
            Trace.beginSection("createFfmpegVideoDecoder");
            Trace.endSection();
            throw null;
        } catch (DecoderException e) {
            l93.G("DecoderVideoRenderer", "Video codec error", e);
            rf2 rf2Var = this.G;
            Handler handler = (Handler) rf2Var.n;
            if (handler != null) {
                handler.post(new ur2(28, rf2Var, e));
            }
            throw b(e, this.J, false, 4001);
        } catch (OutOfMemoryError e2) {
            throw b(e2, this.J, false, 4001);
        }
    }

    @Override // defpackage.kq, defpackage.rk3
    public final void c(int i, Object obj) {
        Surface surface;
        if (i != 1) {
            if (i == 7) {
                return;
            }
            return;
        }
        if (obj instanceof Surface) {
            this.M = (Surface) obj;
            this.K = 1;
        } else {
            this.M = null;
            this.K = -1;
            obj = null;
        }
        Surface surface2 = this.L;
        rf2 rf2Var = this.G;
        if (surface2 == obj) {
            if (obj != null) {
                s55 s55Var = this.S;
                if (s55Var != null) {
                    rf2Var.o(s55Var);
                }
                if (this.P != 3 || (surface = this.L) == null) {
                    return;
                }
                rf2Var.j(surface);
                return;
            }
            return;
        }
        this.L = (Surface) obj;
        if (obj == null) {
            this.S = null;
            this.P = Math.min(this.P, 1);
            return;
        }
        s55 s55Var2 = this.S;
        if (s55Var2 != null) {
            rf2Var.o(s55Var2);
        }
        this.P = Math.min(this.P, 1);
        if (this.u == 2) {
            long j = this.F;
            this.Q = j > 0 ? SystemClock.elapsedRealtime() + j : -9223372036854775807L;
        }
    }

    @Override // defpackage.kq
    public final void e() {
        if (this.P == 0) {
            this.P = 1;
        }
    }

    @Override // defpackage.kq
    public final String h() {
        return "ExperimentalFfmpegVideoRenderer";
    }

    @Override // defpackage.kq
    public final boolean m() {
        return this.R;
    }

    @Override // defpackage.kq
    public final boolean o() {
        boolean zC;
        if (this.J != null) {
            if (l()) {
                zC = this.A;
            } else {
                q44 q44Var = this.v;
                q44Var.getClass();
                zC = q44Var.c();
            }
            if (zC && (this.P == 3 || this.K == -1)) {
                this.Q = -9223372036854775807L;
                return true;
            }
        }
        if (this.Q == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.Q) {
            return true;
        }
        this.Q = -9223372036854775807L;
        return false;
    }

    @Override // defpackage.kq
    public final void p() {
        rf2 rf2Var = this.G;
        this.J = null;
        this.S = null;
        this.P = Math.min(this.P, 0);
        try {
            pw0.b(this.O, null);
            this.O = null;
            pw0.b(this.N, null);
            this.N = null;
        } finally {
            rf2Var.a(this.V);
        }
    }

    @Override // defpackage.kq
    public final void q(boolean z, boolean z2) {
        bj0 bj0Var = new bj0();
        this.V = bj0Var;
        rf2 rf2Var = this.G;
        Handler handler = (Handler) rf2Var.n;
        if (handler != null) {
            handler.post(new n55(rf2Var, bj0Var, 0));
        }
        this.P = z2 ? 1 : 0;
    }

    @Override // defpackage.kq
    public final void r(long j, boolean z, boolean z2) {
        this.R = false;
        this.P = Math.min(this.P, 1);
        if (z) {
            long j2 = this.F;
            this.Q = j2 > 0 ? SystemClock.elapsedRealtime() + j2 : -9223372036854775807L;
        } else {
            this.Q = -9223372036854775807L;
        }
        tu tuVar = this.H;
        tuVar.h();
        tuVar.b();
    }

    @Override // defpackage.kq
    public final void v() {
        this.U = 0;
        this.T = SystemClock.elapsedRealtime();
        SystemClock.elapsedRealtime();
        String str = f35.a;
    }

    @Override // defpackage.kq
    public final void w() {
        this.Q = -9223372036854775807L;
        if (this.U > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.T;
            int i = this.U;
            rf2 rf2Var = this.G;
            Handler handler = (Handler) rf2Var.n;
            if (handler != null) {
                handler.post(new m55(rf2Var, i, j));
            }
            this.U = 0;
            this.T = jElapsedRealtime;
        }
    }

    @Override // defpackage.kq
    public final void x(tb1[] tb1VarArr, long j, long j2, mt2 mt2Var) {
    }
}
