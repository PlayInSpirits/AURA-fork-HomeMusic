package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Surface;
import androidx.media3.decoder.DecoderException;

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

    public x41(long r1, Handler r3, o55 r4, int r5) {
        super(2);
        this.F = r1;
        this.Q = -9223372036854775807L;
        this.H = new tu();
        this.I = new cj0(0, 0);
        this.G = new rf2(r3, r4);
        this.K = -1;
        this.P = 0;
        this.V = new bj0();
    }

    @Override // defpackage.kq
    public final void A(long r3, long r5) {
        if (this.R == false) goto L6;
        return;
    L6:
        if (this.J != null) goto L16;
        gp3 r4 = this.p;
        r4.d();
        cj0 r6 = this.I;
        r6.r();
        int r7 = z(r4, r6, 2);
        if (r7 != (-5)) goto L13;
        tb1 r8 = (tb1) r4.p;
        r8.getClass();
        pw0 r9 = (pw0) r4.o;
        pw0.b(this.O, r9);
        this.O = r9;
        this.J = r8;
        H();
        tb1 r10 = this.J;
        r10.getClass();
        rf2 r11 = this.G;
        Handler r12 = (Handler) r11.n;
        if (r12 == null) goto L16;
        Object r1 = null;
        r12.post(new qo2(r11, r10, r1, 19));
        goto L16
    L13:
        if (r7 != (-4)) goto L18;
        rr2.w(r6.d(4));
        this.R = true;
        return;
    L18:
        return;
    L16:
        H();
    }

    @Override // defpackage.kq
    public final int E(tb1 r1) {
        return kq.a(0, 0, 0, 0);
    }

    public final void H() {
        pw0 r0 = this.O;
        pw0.b(this.N, r0);
        this.N = r0;
        if (r0 == null) goto L24;
        if (r0.h() != null) goto L24;
        if (this.N.g() != null) goto L24;
        return;
    L24:
        SystemClock.elapsedRealtime();     // Catch: OutOfMemoryError -> L13 DecoderException -> L15
        this.J.getClass();     // Catch: OutOfMemoryError -> L13 DecoderException -> L15
        Trace.beginSection("createFfmpegVideoDecoder");     // Catch: OutOfMemoryError -> L13 DecoderException -> L15
        Trace.endSection();     // Catch: OutOfMemoryError -> L13 DecoderException -> L15
    L12:
        throw null;
    L15:
        e = move-exception;
        l93.G("DecoderVideoRenderer", "Video codec error", e);
        rf2 r3 = this.G;
        Handler r4 = (Handler) r3.n;
        if (r4 == null) goto L23;
        r4.post(new ur2(28, r3, e));
    L23:
        throw b(e, this.J, false, 4001);
    L13:
        e = move-exception;
        throw b(e, this.J, false, 4001);
    }

    @Override // defpackage.kq, defpackage.rk3
    public final void c(int r4, Object r5) {
        if (r4 != 1) goto L36;
        if ((r5 instanceof Surface) == false) goto L7;
        this.M = (Surface) r5;
        this.K = 1;
    L8:
        Surface r6 = this.L;
        rf2 r2 = this.G;
        if (r6 == r5) goto L25;
        this.L = (Surface) r5;
        if (r5 == null) goto L23;
        s55 r7 = this.S;
        if (r7 == null) goto L15;
        r2.o(r7);
    L15:
        this.P = Math.min(this.P, 1);
        if (this.u != 2) goto L39;
        long r0 = this.F;
        if (r0 <= 0) goto L20;
        long r8 = SystemClock.elapsedRealtime() + r0;
    L21:
        this.Q = r8;
        return;
    L20:
        r8 = -9223372036854775807L;
        goto L21
    L39:
        return;
    L23:
        this.S = null;
        this.P = Math.min(this.P, 1);
        return;
    L25:
        if (r5 == null) goto L40;
        s55 r9 = this.S;
        if (r9 == null) goto L30;
        r2.o(r9);
    L30:
        if (this.P != 3) goto L41;
        Surface r3 = this.L;
        if (r3 == null) goto L42;
        r2.j(r3);
        return;
    L42:
        return;
    L41:
        return;
    L40:
        return;
    L7:
        this.M = null;
        this.K = -1;
        r5 = null;
        goto L8
    L36:
        if (r4 != 7) goto L43;
        c55 r10 = (c55) r5;
        return;
    }

    @Override // defpackage.kq
    public final void e() {
        if (this.P != 0) goto L6;
        this.P = 1;
        return;
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
        if (this.J == null) goto L18;
        if (l() == false) goto L7;
        boolean r0 = this.A;
    L8:
        if (r0 == false) goto L18;
        if (this.P != 3) goto L13;
    L15:
        this.Q = -9223372036854775807L;
        return true;
    L13:
        if (this.K == (-1)) goto L15;
    L7:
        q44 r1 = this.v;
        r1.getClass();
        r0 = r1.c();
    L18:
        if (this.Q != (-9223372036854775807L)) goto L21;
        return false;
    L21:
        if (SystemClock.elapsedRealtime() >= this.Q) goto L23;
        return true;
    L23:
        this.Q = -9223372036854775807L;
        return false;
    }

    @Override // defpackage.kq
    public final void p() {
        rf2 r0 = this.G;
        this.J = null;
        this.S = null;
        this.P = Math.min(this.P, 0);
        pw0.b(this.O, null);     // Catch: Throwable -> L6
        this.O = null;     // Catch: Throwable -> L6
        pw0.b(this.N, null);     // Catch: Throwable -> L6
        this.N = null;     // Catch: Throwable -> L6
        r0.a(this.V);
        return;
    L6:
        th = move-exception;
        r0.a(this.V);
        throw th;
    }

    @Override // defpackage.kq
    public final void q(boolean r5, boolean r6) {
        bj0 r7 = new bj0();
        this.V = r7;
        rf2 r0 = this.G;
        Handler r1 = (Handler) r0.n;
        if (r1 == null) goto L5;
        r1.post(new n55(r0, r7, 0));
    L5:
        this.P = r6 ? 1 : 0;
    }

    @Override // defpackage.kq
    public final void r(long r3, boolean r5, boolean r6) {
        this.R = false;
        this.P = Math.min(this.P, 1);
        long r4 = -9223372036854775807L;
        if (r5 == false) goto L8;
        long r0 = this.F;
        if (r0 <= 0) goto L7;
        r4 = SystemClock.elapsedRealtime() + r0;
    L7:
        this.Q = r4;
    L9:
        tu r2 = this.H;
        r2.h();
        r2.b();
        return;
    L8:
        this.Q = -9223372036854775807L;
        goto L9
    }

    @Override // defpackage.kq
    public final void v() {
        this.U = 0;
        this.T = SystemClock.elapsedRealtime();
        SystemClock.elapsedRealtime();
        String r2 = f35.a;
    }

    @Override // defpackage.kq
    public final void w() {
        this.Q = -9223372036854775807L;
        if (this.U <= 0) goto L9;
        long r0 = SystemClock.elapsedRealtime();
        long r2 = r0 - this.T;
        int r4 = this.U;
        rf2 r5 = this.G;
        Handler r6 = (Handler) r5.n;
        if (r6 == null) goto L7;
        r6.post(new m55(r5, r4, r2));
    L7:
        this.U = 0;
        this.T = r0;
        return;
    }

    @Override // defpackage.kq
    public final void x(tb1[] r1, long r2, long r4, mt2 r6) {
    }
}
