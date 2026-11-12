package defpackage;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.StuckPlayerException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import com.eddyizm.tempus.homemusic.WaveRetry;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class q41 implements Handler.Callback, mo2, dw4, c55 {
    public static final long u0 = f35.i0(10000);
    public final boolean A;
    public final xl0 B;
    public final ArrayList C;
    public final vp4 D;
    public final u31 E;
    public final ro2 F;
    public final fo1 G;
    public final ul0 H;
    public final long I;
    public final ik3 J;
    public final nj0 K;
    public final yp4 L;
    public final boolean M;
    public final tl N;
    public final boolean O;
    public n84 P;
    public i74 Q;
    public boolean R;
    public boolean S;
    public p41 T;
    public int U;
    public ph3 V;
    public n41 W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public boolean a0;
    public long b0;
    public boolean c0;
    public int d0;
    public boolean e0;
    public boolean f0;
    public boolean g0;
    public boolean h0;
    public int i0;
    public p41 j0;
    public long k0;
    public long l0;
    public int m0;
    public final ez3[] n;
    public boolean n0;
    public final kq[] o;
    public ExoPlaybackException o0;
    public final boolean[] p;
    public long p0;
    public final pn0 q;
    public p31 q0;
    public final ew4 r;
    public long r0;
    public final cd2 s;
    public boolean s0;
    public final cp t;
    public float t0;
    public final yp4 u;
    public final gc v;
    public final Looper w;
    public final bu4 x;
    public final zt4 y;
    public final long z;

    public q41(Context context, kq[] kqVarArr, kq[] kqVarArr2, pn0 pn0Var, ew4 ew4Var, cd2 cd2Var, cp cpVar, int i, boolean z, nj0 nj0Var, n84 n84Var, ul0 ul0Var, long j, Looper looper, vp4 vp4Var, u31 u31Var, ik3 ik3Var, final c55 c55Var, boolean z2) {
        Looper looper2;
        p31 p31Var = p31.a;
        this.r0 = -9223372036854775807L;
        this.E = u31Var;
        this.q = pn0Var;
        this.r = ew4Var;
        this.s = cd2Var;
        this.t = cpVar;
        this.d0 = i;
        this.e0 = z;
        this.P = n84Var;
        this.H = ul0Var;
        this.I = j;
        boolean z3 = false;
        this.Y = false;
        this.D = vp4Var;
        this.J = ik3Var;
        this.q0 = p31Var;
        this.K = nj0Var;
        this.t0 = 1.0f;
        this.Q = i74.b;
        this.O = z2;
        this.p0 = -9223372036854775807L;
        this.b0 = -9223372036854775807L;
        this.z = cd2Var.i(ik3Var);
        this.A = cd2Var.d(ik3Var);
        yt4 yt4Var = cu4.a;
        ph3 ph3VarK = ph3.k(ew4Var);
        this.V = ph3VarK;
        this.W = new n41(ph3VarK);
        this.o = new kq[kqVarArr.length];
        this.p = new boolean[kqVarArr.length];
        pn0Var.getClass();
        this.n = new ez3[kqVarArr.length];
        boolean z4 = false;
        for (int i2 = 0; i2 < kqVarArr.length; i2++) {
            kq kqVar = kqVarArr[i2];
            kqVar.r = i2;
            kqVar.s = ik3Var;
            kqVar.t = vp4Var;
            this.o[i2] = kqVar;
            kq kqVar2 = this.o[i2];
            synchronized (kqVar2.n) {
                kqVar2.E = pn0Var;
            }
            kq kqVar3 = kqVarArr2[i2];
            if (kqVar3 != null) {
                kqVar3.r = i2;
                kqVar3.s = ik3Var;
                kqVar3.t = vp4Var;
                z4 = true;
            }
            ez3[] ez3VarArr = this.n;
            kq kqVar4 = kqVarArr[i2];
            ez3 ez3Var = new ez3();
            ez3Var.e = kqVar4;
            ez3Var.c = i2;
            ez3Var.f = kqVar3;
            ez3Var.d = 0;
            ez3Var.a = false;
            ez3Var.b = false;
            ez3VarArr[i2] = ez3Var;
        }
        this.M = z4;
        this.B = new xl0(this, vp4Var);
        this.C = new ArrayList();
        this.x = new bu4();
        this.y = new zt4();
        rr2.w(pn0Var.a == null);
        pn0Var.a = this;
        pn0Var.b = cpVar;
        this.n0 = true;
        yp4 yp4VarA = vp4Var.a(looper, null);
        this.L = yp4VarA;
        this.F = new ro2(nj0Var, yp4VarA, new cn(12, this));
        this.G = new fo1(this, nj0Var, yp4VarA, ik3Var);
        gc gcVar = new gc();
        this.v = gcVar;
        synchronized (gcVar.b) {
            try {
                if (((Looper) gcVar.c) == null) {
                    if (gcVar.a == 0 && ((HandlerThread) gcVar.d) == null) {
                        z3 = true;
                    }
                    rr2.w(z3);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    gcVar.d = handlerThread;
                    handlerThread.start();
                    gcVar.c = ((HandlerThread) gcVar.d).getLooper();
                }
                gcVar.a++;
                looper2 = (Looper) gcVar.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.w = looper2;
        yp4 yp4VarA2 = vp4Var.a(looper2, this);
        this.u = yp4VarA2;
        this.N = new tl(context, looper2, this);
        yp4VarA2.b(35, new c55() { // from class: j41
            @Override // defpackage.c55
            public final void d(long j2, long j3, tb1 tb1Var, MediaFormat mediaFormat) {
                c55Var.d(j2, j3, tb1Var, mediaFormat);
                this.n.d(j2, j3, tb1Var, mediaFormat);
            }
        }).b();
    }

    public static boolean A(oo2 oo2Var) {
        if (oo2Var != null) {
            try {
                no2 no2Var = oo2Var.a;
                if (oo2Var.e) {
                    for (q44 q44Var : oo2Var.c) {
                        if (q44Var != null) {
                            q44Var.s();
                        }
                    }
                } else {
                    no2Var.h();
                }
                if ((!oo2Var.e ? 0L : no2Var.d()) != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public static Pair T(cu4 cu4Var, p41 p41Var, boolean z, int i, boolean z2, bu4 bu4Var, zt4 zt4Var) {
        int iU;
        cu4 cu4Var2 = p41Var.a;
        if (cu4Var.p()) {
            return null;
        }
        cu4 cu4Var3 = cu4Var2.p() ? cu4Var : cu4Var2;
        try {
            Pair pairI = cu4Var3.i(bu4Var, zt4Var, p41Var.b, p41Var.c);
            if (!cu4Var.equals(cu4Var3)) {
                if (cu4Var.b(pairI.first) == -1) {
                    if (!z || (iU = U(bu4Var, zt4Var, i, z2, pairI.first, cu4Var3, cu4Var)) == -1) {
                        return null;
                    }
                    return cu4Var.i(bu4Var, zt4Var, iU, -9223372036854775807L);
                }
                if (cu4Var3.g(pairI.first, zt4Var).f && cu4Var3.m(zt4Var.c, bu4Var, 0L).m == cu4Var3.b(pairI.first)) {
                    return cu4Var.i(bu4Var, zt4Var, cu4Var.g(pairI.first, zt4Var).c, p41Var.c);
                }
            }
            return pairI;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public static int U(bu4 bu4Var, zt4 zt4Var, int i, boolean z, Object obj, cu4 cu4Var, cu4 cu4Var2) {
        cu4 cu4Var3 = cu4Var;
        Object obj2 = cu4Var3.m(cu4Var3.g(obj, zt4Var).c, bu4Var, 0L).a;
        for (int i2 = 0; i2 < cu4Var2.o(); i2++) {
            if (cu4Var2.m(i2, bu4Var, 0L).a.equals(obj2)) {
                return i2;
            }
        }
        int iB = cu4Var3.b(obj);
        int iH = cu4Var3.h();
        int iB2 = -1;
        int i3 = 0;
        while (i3 < iH && iB2 == -1) {
            cu4 cu4Var4 = cu4Var3;
            int iD = cu4Var4.d(iB, zt4Var, bu4Var, i, z);
            if (iD == -1) {
                break;
            }
            iB2 = cu4Var2.b(cu4Var4.l(iD));
            i3++;
            cu4Var3 = cu4Var4;
            iB = iD;
        }
        if (iB2 == -1) {
            return -1;
        }
        return cu4Var2.f(iB2, zt4Var, false).c;
    }

    public final void A0(int i, int i2, int i3, boolean z) {
        boolean z2 = z && i != -1;
        if (i == -1) {
            i3 = 2;
        } else if (i3 == 2) {
            i3 = 1;
        }
        boolean z3 = this.R;
        if (i == 0) {
            i2 = 1;
        } else if (i2 == 1) {
            i2 = z3 ? 4 : 0;
        }
        ph3 ph3Var = this.V;
        if (ph3Var.l == z2 && ph3Var.n == i2 && ph3Var.m == i3) {
            return;
        }
        this.V = ph3Var.e(i3, i2, z2);
        D0(false, false);
        ro2 ro2Var = this.F;
        for (oo2 oo2Var = ro2Var.i; oo2Var != null; oo2Var = oo2Var.m) {
            for (t41 t41Var : (t41[]) oo2Var.o.q) {
                if (t41Var != null) {
                    t41Var.f(z2);
                }
            }
        }
        if (!r0()) {
            v0();
            B0();
            ph3 ph3Var2 = this.V;
            if (ph3Var2.p) {
                this.V = ph3Var2.i(false);
            }
            ro2Var.n(this.k0);
            return;
        }
        int i4 = this.V.e;
        yp4 yp4Var = this.u;
        if (i4 != 3) {
            if (i4 == 2) {
                yp4Var.g(2);
            }
        } else {
            xl0 xl0Var = this.B;
            xl0Var.s = true;
            xl0Var.n.g();
            t0();
            yp4Var.g(2);
        }
    }

    public final boolean B(int i, mt2 mt2Var) {
        ro2 ro2Var = this.F;
        oo2 oo2Var = ro2Var.k;
        if (oo2Var != null && oo2Var.g.a.equals(mt2Var)) {
            ez3 ez3Var = this.n[i];
            oo2 oo2Var2 = ro2Var.k;
            int i2 = ez3Var.d;
            boolean z = (i2 == 2 || i2 == 4) && ez3Var.d(oo2Var2) == ((kq) ez3Var.e);
            boolean z2 = ez3Var.d == 3 && ez3Var.d(oo2Var2) == ((kq) ez3Var.f);
            if (z || z2) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00c2  */
    public final void B0() {
        qh3 qh3VarI;
        long j;
        float f;
        oo2 oo2Var = this.F.i;
        if (oo2Var == null) {
            return;
        }
        long jL = oo2Var.e ? oo2Var.a.l() : -9223372036854775807L;
        if (jL != -9223372036854775807L) {
            if (!oo2Var.g()) {
                this.F.o(oo2Var);
                v(false);
                D();
            }
            R(true, jL);
            if (jL != this.V.s) {
                ph3 ph3Var = this.V;
                this.V = z(ph3Var.b, jL, ph3Var.c, jL, true, 5);
            }
        } else {
            xl0 xl0Var = this.B;
            boolean z = oo2Var != this.F.j;
            zq2 zq2Var = xl0Var.n;
            kq kqVar = xl0Var.p;
            if (kqVar == null || kqVar.m() || ((z && xl0Var.p.u != 2) || (!xl0Var.p.o() && (z || xl0Var.p.l())))) {
                xl0Var.r = true;
                if (xl0Var.s) {
                    zq2Var.g();
                }
            } else {
                yj2 yj2Var = xl0Var.q;
                yj2Var.getClass();
                long j2 = yj2Var.j();
                if (!xl0Var.r) {
                    zq2Var.f(j2);
                    qh3VarI = yj2Var.i();
                    if (!qh3VarI.equals((qh3) zq2Var.r)) {
                        zq2Var.d(qh3VarI);
                        xl0Var.o.u.b(16, qh3VarI).b();
                    }
                } else if (j2 >= zq2Var.j()) {
                    xl0Var.r = false;
                    if (xl0Var.s) {
                        zq2Var.g();
                    }
                    zq2Var.f(j2);
                    qh3VarI = yj2Var.i();
                    if (!qh3VarI.equals((qh3) zq2Var.r)) {
                        zq2Var.d(qh3VarI);
                        xl0Var.o.u.b(16, qh3VarI).b();
                    }
                } else if (zq2Var.p) {
                    zq2Var.f(zq2Var.j());
                    zq2Var.p = false;
                }
            }
            long j3 = xl0Var.j();
            this.k0 = j3;
            long j4 = j3 - oo2Var.p;
            long j5 = this.V.s;
            if (!this.C.isEmpty() && !this.V.b.b()) {
                if (this.n0) {
                    this.n0 = false;
                }
                ph3 ph3Var2 = this.V;
                ph3Var2.a.b(ph3Var2.b.a);
                int iMin = Math.min(this.m0, this.C.size());
                if (iMin > 0 && this.C.get(iMin - 1) != null) {
                    kf2.k();
                    return;
                } else {
                    if (iMin < this.C.size() && this.C.get(iMin) != null) {
                        kf2.k();
                        return;
                    }
                    this.m0 = iMin;
                }
            }
            if (this.B.k()) {
                boolean z2 = !this.W.e;
                ph3 ph3Var3 = this.V;
                this.V = z(ph3Var3.b, j4, ph3Var3.c, j4, z2, 6);
            } else {
                ph3 ph3Var4 = this.V;
                ph3Var4.s = j4;
                ph3Var4.t = SystemClock.elapsedRealtime();
            }
        }
        this.V.q = this.F.l.d();
        ph3 ph3Var5 = this.V;
        ph3Var5.r = q(ph3Var5.q);
        ph3 ph3Var6 = this.V;
        if (ph3Var6.l && ph3Var6.e == 3 && s0(ph3Var6.a, ph3Var6.b)) {
            ph3 ph3Var7 = this.V;
            float f2 = 1.0f;
            if (ph3Var7.o.a == 1.0f) {
                ul0 ul0Var = this.H;
                long jN = n(ph3Var7.a, ph3Var7.b.a, ph3Var7.s);
                long j6 = this.V.r;
                if (ul0Var.c != -9223372036854775807L) {
                    long j7 = jN - j6;
                    long j8 = ul0Var.m;
                    if (j8 == -9223372036854775807L) {
                        ul0Var.m = j7;
                        ul0Var.n = 0L;
                    } else {
                        long jMax = Math.max(j7, (long) ((j7 * 9.999871E-4f) + (j8 * 0.999f)));
                        ul0Var.m = jMax;
                        ul0Var.n = (long) ((9.999871E-4f * Math.abs(j7 - jMax)) + (ul0Var.n * 0.999f));
                    }
                    if (ul0Var.l != -9223372036854775807L) {
                        j = 1000;
                        if (SystemClock.elapsedRealtime() - ul0Var.l < 1000) {
                            f2 = ul0Var.k;
                        }
                    } else {
                        j = 1000;
                    }
                    ul0Var.l = SystemClock.elapsedRealtime();
                    long j9 = (ul0Var.n * 3) + ul0Var.m;
                    if (ul0Var.h > j9) {
                        float fQ = f35.Q(j);
                        f = 1.0E-7f;
                        long[] jArr = {j9, ul0Var.e, ul0Var.h - (((long) ((ul0Var.k - 1.0f) * fQ)) + ((long) ((ul0Var.i - 1.0f) * fQ)))};
                        long j10 = jArr[0];
                        for (int i = 1; i < 3; i++) {
                            long j11 = jArr[i];
                            if (j11 > j10) {
                                j10 = j11;
                            }
                        }
                        ul0Var.h = j10;
                    } else {
                        f = 1.0E-7f;
                        long jK = f35.k(jN - ((long) (Math.max(0.0f, ul0Var.k - 1.0f) / 1.0E-7f)), ul0Var.h, j9);
                        ul0Var.h = jK;
                        long j12 = ul0Var.g;
                        if (j12 != -9223372036854775807L && jK > j12) {
                            ul0Var.h = j12;
                        }
                    }
                    long j13 = jN - ul0Var.h;
                    if (Math.abs(j13) < ul0Var.a) {
                        ul0Var.k = 1.0f;
                    } else {
                        ul0Var.k = f35.i((f * j13) + 1.0f, ul0Var.j, ul0Var.i);
                    }
                    f2 = ul0Var.k;
                }
                if (this.B.i().a != f2) {
                    qh3 qh3Var = new qh3(f2, this.V.o.b);
                    this.u.f(16);
                    this.B.d(qh3Var);
                    y(this.V.o, this.B.i().a, false, false);
                }
            }
        }
    }

    public final boolean C() {
        oo2 oo2Var = this.F.i;
        long j = oo2Var.g.e;
        if (oo2Var.e) {
            return j == -9223372036854775807L || this.V.s < j || !r0();
        }
        return false;
    }

    public final void C0(cu4 cu4Var, mt2 mt2Var, cu4 cu4Var2, mt2 mt2Var2, long j, boolean z) {
        boolean zS0 = s0(cu4Var, mt2Var);
        Object obj = mt2Var.a;
        if (!zS0) {
            qh3 qh3Var = mt2Var.b() ? qh3.d : this.V.o;
            xl0 xl0Var = this.B;
            if (xl0Var.i().equals(qh3Var)) {
                return;
            }
            this.u.f(16);
            xl0Var.d(qh3Var);
            y(this.V.o, qh3Var.a, false, false);
            return;
        }
        zt4 zt4Var = this.y;
        int i = cu4Var.g(obj, zt4Var).c;
        bu4 bu4Var = this.x;
        cu4Var.n(i, bu4Var);
        an2 an2Var = bu4Var.i;
        ul0 ul0Var = this.H;
        ul0Var.getClass();
        ul0Var.c = f35.Q(an2Var.a);
        ul0Var.f = f35.Q(an2Var.b);
        ul0Var.g = f35.Q(an2Var.c);
        float f = an2Var.d;
        if (f == -3.4028235E38f) {
            f = 0.97f;
        }
        ul0Var.j = f;
        float f2 = an2Var.e;
        if (f2 == -3.4028235E38f) {
            f2 = 1.03f;
        }
        ul0Var.i = f2;
        if (f == 1.0f && f2 == 1.0f) {
            ul0Var.c = -9223372036854775807L;
        }
        ul0Var.a();
        if (j != -9223372036854775807L) {
            ul0Var.d = n(cu4Var, obj, j);
            ul0Var.a();
            return;
        }
        if (!Objects.equals(!cu4Var2.p() ? cu4Var2.m(cu4Var2.g(mt2Var2.a, zt4Var).c, bu4Var, 0L).a : null, bu4Var.a) || z) {
            ul0Var.d = -9223372036854775807L;
            ul0Var.a();
        }
    }

    public final void D() {
        boolean zH;
        if (A(this.F.l)) {
            oo2 oo2Var = this.F.l;
            long jQ = q(!oo2Var.e ? 0L : oo2Var.a.d());
            oo2 oo2Var2 = this.F.i;
            long j = this.k0;
            long j2 = oo2Var.p;
            if (oo2Var != oo2Var2) {
                j -= j2;
                j2 = oo2Var.g.b;
            }
            long j3 = j - j2;
            long j4 = s0(this.V.a, oo2Var.g.a) ? this.H.h : -9223372036854775807L;
            ik3 ik3Var = this.J;
            cu4 cu4Var = this.V.a;
            mt2 mt2Var = oo2Var.g.a;
            float f = this.B.i().a;
            boolean z = this.V.l;
            bd2 bd2Var = new bd2(ik3Var, cu4Var, mt2Var, j3, jQ, f, this.a0, j4);
            zH = this.s.h(bd2Var);
            oo2 oo2Var3 = this.F.i;
            if (!zH && oo2Var3.e && jQ < 500000 && (this.z > 0 || this.A)) {
                oo2Var3.a.k(false, this.V.s);
                zH = this.s.h(bd2Var);
            }
        } else {
            zH = false;
        }
        this.c0 = zH;
        if (zH) {
            oo2 oo2Var4 = this.F.l;
            oo2Var4.getClass();
            od2 od2Var = new od2();
            od2Var.a = this.k0 - oo2Var4.p;
            float f2 = this.B.i().a;
            rr2.l(f2 > 0.0f || f2 == -3.4028235E38f);
            od2Var.b = f2;
            long j5 = this.b0;
            rr2.l(j5 >= 0 || j5 == -9223372036854775807L);
            od2Var.c = j5;
            pd2 pd2Var = new pd2(od2Var);
            rr2.w(oo2Var4.m == null);
            oo2Var4.a.o(pd2Var);
        }
        w0();
    }

    public final void D0(boolean z, boolean z2) {
        long jElapsedRealtime;
        this.a0 = z;
        if (!z || z2) {
            jElapsedRealtime = -9223372036854775807L;
        } else {
            this.D.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.b0 = jElapsedRealtime;
    }

    public final void E() {
        ro2 ro2Var = this.F;
        ro2Var.l();
        oo2 oo2Var = ro2Var.m;
        if (oo2Var != null) {
            no2 no2Var = oo2Var.a;
            if ((!oo2Var.d || oo2Var.e) && !no2Var.f()) {
                if (this.s.a(this.J, this.V.a, oo2Var.g.a, oo2Var.e ? no2Var.q() : 0L)) {
                    if (!oo2Var.d) {
                        long j = oo2Var.g.b;
                        oo2Var.d = true;
                        no2Var.m(this, j);
                        return;
                    }
                    od2 od2Var = new od2();
                    od2Var.a = this.k0 - oo2Var.p;
                    float f = this.B.i().a;
                    rr2.l(f > 0.0f || f == -3.4028235E38f);
                    od2Var.b = f;
                    long j2 = this.b0;
                    rr2.l(j2 >= 0 || j2 == -9223372036854775807L);
                    od2Var.c = j2;
                    pd2 pd2Var = new pd2(od2Var);
                    rr2.w(oo2Var.m == null);
                    no2Var.o(pd2Var);
                }
            }
        }
    }

    public final void F() {
        n41 n41Var = this.W;
        ph3 ph3Var = this.V;
        boolean z = n41Var.d | (((ph3) n41Var.f) != ph3Var);
        n41Var.d = z;
        n41Var.f = ph3Var;
        if (z) {
            i41 i41Var = this.E.o;
            i41Var.k.d(new k6(24, i41Var, n41Var));
            this.W = new n41(this.V);
        }
    }

    public final void G(int i) {
        ez3 ez3Var = this.n[i];
        try {
            oo2 oo2Var = this.F.i;
            oo2Var.getClass();
            kq kqVarD = ez3Var.d(oo2Var);
            kqVarD.getClass();
            q44 q44Var = kqVarD.v;
            q44Var.getClass();
            q44Var.s();
        } catch (IOException | RuntimeException e) {
            int i2 = ((kq) ez3Var.e).o;
            if (i2 != 3 && i2 != 5) {
                throw e;
            }
            ew4 ew4Var = this.F.i.o;
            l93.G("ExoPlayerImplInternal", "Disabling track due to error: ".concat(tb1.c(((t41[]) ew4Var.q)[i].m())), e);
            ew4 ew4Var2 = new ew4((dz3[]) ((dz3[]) ew4Var.p).clone(), (t41[]) ((t41[]) ew4Var.q).clone(), (jw4) ew4Var.r, ew4Var.s);
            ((dz3[]) ew4Var2.p)[i] = null;
            ((t41[]) ew4Var2.q)[i] = null;
            i(i);
            oo2 oo2Var2 = this.F.i;
            oo2Var2.a(ew4Var2, this.V.s, false, new boolean[oo2Var2.j.length]);
        }
    }

    public final void H(int i, boolean z) {
        boolean[] zArr = this.p;
        if (zArr[i] != z) {
            zArr[i] = z;
            this.L.d(new ul(this, i, z));
        }
    }

    public final void I() throws Throwable {
        w(this.G.f(), true);
    }

    public final void J(m41 m41Var) throws Throwable {
        cu4 cu4VarF;
        this.W.e(1);
        int i = m41Var.a;
        int i2 = m41Var.b;
        int i3 = m41Var.c;
        pd4 pd4Var = m41Var.d;
        fo1 fo1Var = this.G;
        ArrayList arrayList = (ArrayList) fo1Var.c;
        rr2.l(i >= 0 && i <= i2 && i2 <= arrayList.size() && i3 >= 0);
        fo1Var.k = pd4Var;
        if (i == i2 || i == i3) {
            cu4VarF = fo1Var.f();
        } else {
            int iMin = Math.min(i, i3);
            int iMax = Math.max(((i2 - i) + i3) - 1, i2 - 1);
            int iO = ((bu2) arrayList.get(iMin)).d;
            f35.P(arrayList, i, i2, i3);
            while (iMin <= iMax) {
                bu2 bu2Var = (bu2) arrayList.get(iMin);
                bu2Var.d = iO;
                iO += bu2Var.a.o.e.o();
                iMin++;
            }
            cu4VarF = fo1Var.f();
        }
        w(cu4VarF, false);
    }

    public final void K() {
        this.W.e(1);
        P(false, false, false, true);
        this.s.e(this.J);
        n0(this.V.a.p() ? 4 : 2);
        ph3 ph3Var = this.V;
        boolean z = ph3Var.l;
        A0(this.N.c(ph3Var.e, z), ph3Var.n, ph3Var.m, z);
        rw4 rw4VarZ = this.t.z();
        fo1 fo1Var = this.G;
        ArrayList arrayList = (ArrayList) fo1Var.c;
        rr2.w(!fo1Var.a);
        fo1Var.l = rw4VarZ;
        for (int i = 0; i < arrayList.size(); i++) {
            bu2 bu2Var = (bu2) arrayList.get(i);
            fo1Var.l(bu2Var);
            ((HashSet) fo1Var.h).add(bu2Var);
        }
        fo1Var.a = true;
        this.u.g(2);
    }

    public final void L(q90 q90Var) {
        gc gcVar = this.v;
        yp4 yp4Var = this.u;
        try {
            P(true, false, true, false);
            M();
            this.s.b(this.J);
            tl tlVar = this.N;
            tlVar.c = null;
            tlVar.a();
            tlVar.b(0);
            this.q.g();
            n0(1);
        } finally {
            yp4Var.e();
            gcVar.c();
            q90Var.d();
        }
    }

    public final void M() {
        for (int i = 0; i < this.n.length; i++) {
            kq kqVar = this.o[i];
            synchronized (kqVar.n) {
                kqVar.E = null;
            }
            ez3 ez3Var = this.n[i];
            kq kqVar2 = (kq) ez3Var.e;
            rr2.w(kqVar2.u == 0);
            kqVar2.s();
            ez3Var.a = false;
            kq kqVar3 = (kq) ez3Var.f;
            if (kqVar3 != null) {
                rr2.w(kqVar3.u == 0);
                kqVar3.s();
                ez3Var.b = false;
            }
        }
    }

    public final void N(int i, int i2, pd4 pd4Var) throws Throwable {
        this.W.e(1);
        fo1 fo1Var = this.G;
        fo1Var.getClass();
        rr2.l(i >= 0 && i <= i2 && i2 <= ((ArrayList) fo1Var.c).size());
        fo1Var.k = pd4Var;
        fo1Var.o(i, i2);
        w(fo1Var.f(), false);
    }

    /* JADX WARN: Code duplicated, block: B:78:0x0170  */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
    public final void O() {
        int i;
        int i2;
        float f = this.B.i().a;
        ro2 ro2Var = this.F;
        oo2 oo2Var = ro2Var.i;
        oo2 oo2Var2 = ro2Var.j;
        ew4 ew4Var = null;
        oo2 oo2Var3 = oo2Var;
        boolean z = true;
        while (oo2Var3 != null && oo2Var3.e) {
            ph3 ph3Var = this.V;
            ew4 ew4VarJ = oo2Var3.j(f, ph3Var.a, ph3Var.l);
            ew4 ew4Var2 = oo2Var3 == this.F.i ? ew4VarJ : ew4Var;
            ew4 ew4Var3 = oo2Var3.o;
            t41[] t41VarArr = (t41[]) ew4VarJ.q;
            if (ew4Var3 != null && ((t41[]) ew4Var3.q).length == t41VarArr.length) {
                int i3 = 0;
                while (true) {
                    if (i3 >= t41VarArr.length) {
                        if (oo2Var3 == oo2Var2) {
                            z = false;
                        }
                        oo2Var3 = oo2Var3.m;
                        ew4Var = ew4Var2;
                    } else if (ew4VarJ.m(ew4Var3, i3)) {
                        i3++;
                    }
                }
            }
            ro2 ro2Var2 = this.F;
            if (!z) {
                i = 4;
                ro2Var2.o(oo2Var3);
                if (oo2Var3.e) {
                    long jMax = Math.max(oo2Var3.g.b, this.k0 - oo2Var3.p);
                    if (this.M && f() && this.F.k == oo2Var3) {
                        h();
                    }
                    i2 = 4;
                    oo2Var3.a(ew4VarJ, jMax, false, new boolean[oo2Var3.j.length]);
                }
                v(true);
                if (this.V.e != i2) {
                    D();
                    B0();
                    this.u.g(2);
                    return;
                }
                return;
            }
            oo2 oo2Var4 = ro2Var2.i;
            boolean z2 = (ro2Var2.o(oo2Var4) & 1) != 0;
            boolean[] zArr = new boolean[this.n.length];
            ew4Var2.getClass();
            long jA = oo2Var4.a(ew4Var2, this.V.s, z2, zArr);
            ph3 ph3Var2 = this.V;
            boolean z3 = (ph3Var2.e == 4 || jA == ph3Var2.s) ? false : true;
            ph3 ph3Var3 = this.V;
            i = 4;
            this.V = z(ph3Var3.b, jA, ph3Var3.c, ph3Var3.d, z3, 5);
            if (z3) {
                R(true, jA);
            }
            h();
            boolean[] zArr2 = new boolean[this.n.length];
            int i4 = 0;
            while (true) {
                ez3[] ez3VarArr = this.n;
                if (i4 >= ez3VarArr.length) {
                    break;
                }
                int iC = ez3VarArr[i4].c();
                zArr2[i4] = this.n[i4].g();
                ez3 ez3Var = this.n[i4];
                q44 q44Var = oo2Var4.c[i4];
                xl0 xl0Var = this.B;
                long j = this.k0;
                boolean z4 = zArr[i4];
                kq kqVar = (kq) ez3Var.e;
                if (ez3.h(kqVar)) {
                    if (q44Var != kqVar.v) {
                        ez3Var.a(kqVar, xl0Var);
                    } else if (z4) {
                        kqVar.C(j, false, true);
                    }
                }
                kq kqVar2 = (kq) ez3Var.f;
                if (kqVar2 != null && ez3.h(kqVar2)) {
                    if (q44Var != kqVar2.v) {
                        ez3Var.a(kqVar2, xl0Var);
                    } else if (z4) {
                        kqVar2.C(j, false, true);
                    }
                }
                if (iC - this.n[i4].c() > 0) {
                    H(i4, false);
                }
                this.i0 -= iC - this.n[i4].c();
                i4++;
            }
            m(zArr2, this.k0);
            oo2Var4.h = true;
            i2 = i;
            v(true);
            if (this.V.e != i2) {
                D();
                B0();
                this.u.g(2);
                return;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x009d  */
    /* JADX WARN: Code duplicated, block: B:61:0x0137  */
    /* JADX WARN: Code duplicated, block: B:62:0x0139  */
    /* JADX WARN: Code duplicated, block: B:64:0x013e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0143  */
    /* JADX WARN: Code duplicated, block: B:68:0x0148  */
    /* JADX WARN: Code duplicated, block: B:70:0x014d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0152  */
    /* JADX WARN: Code duplicated, block: B:74:0x0159  */
    /* JADX WARN: Code duplicated, block: B:77:0x0180  */
    /* JADX WARN: Code duplicated, block: B:79:0x018a  */
    /* JADX WARN: Code duplicated, block: B:82:0x0198 A[LOOP:3: B:80:0x0190->B:82:0x0198, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:87:0x01c2  */
    public final void P(boolean z, boolean z2, boolean z3, boolean z4) {
        long j;
        long j2;
        long j3;
        boolean z5;
        cu4 tm3Var;
        mt2 mt2Var;
        ph3 ph3Var;
        ExoPlaybackException exoPlaybackException;
        tv4 tv4Var;
        ew4 ew4Var;
        List list;
        ro2 ro2Var;
        int i;
        this.u.f(2);
        this.S = false;
        if (this.T != null) {
            this.W.e(1);
            this.T = null;
        }
        this.o0 = null;
        D0(false, true);
        xl0 xl0Var = this.B;
        xl0Var.s = false;
        zq2 zq2Var = xl0Var.n;
        if (zq2Var.p) {
            zq2Var.f(zq2Var.j());
            zq2Var.p = false;
        }
        this.k0 = 1000000000000L;
        for (int i2 = 0; i2 < this.n.length; i2++) {
            try {
                i(i2);
            } catch (ExoPlaybackException e) {
                e = e;
                l93.G("ExoPlayerImplInternal", "Disable failed.", e);
            } catch (RuntimeException e2) {
                e = e2;
                l93.G("ExoPlayerImplInternal", "Disable failed.", e);
            }
        }
        this.r0 = -9223372036854775807L;
        if (z) {
            for (ez3 ez3Var : this.n) {
                try {
                    ez3Var.k();
                } catch (RuntimeException e3) {
                    l93.G("ExoPlayerImplInternal", "Reset failed.", e3);
                }
            }
        }
        this.i0 = 0;
        ph3 ph3Var2 = this.V;
        mt2 mt2Var2 = ph3Var2.b;
        long j4 = ph3Var2.s;
        if (this.V.b.b()) {
            j = this.V.c;
        } else {
            ph3 ph3Var3 = this.V;
            zt4 zt4Var = this.y;
            mt2 mt2Var3 = ph3Var3.b;
            cu4 cu4Var = ph3Var3.a;
            if (cu4Var.p() || cu4Var.g(mt2Var3.a, zt4Var).f) {
                j = this.V.c;
            } else {
                j = this.V.s;
            }
        }
        if (z2) {
            this.j0 = null;
            Pair pairP = p(this.V.a);
            mt2Var2 = (mt2) pairP.first;
            long jLongValue = ((Long) pairP.second).longValue();
            z5 = mt2Var2.equals(this.V.b) ? false : true;
            j2 = jLongValue;
            j3 = -9223372036854775807L;
        } else {
            j2 = j4;
            j3 = j;
            z5 = false;
        }
        this.F.b();
        this.c0 = false;
        cu4 cu4Var2 = this.V.a;
        if (z3 && (cu4Var2 instanceof tm3)) {
            tm3 tm3Var2 = (tm3) cu4Var2;
            pd4 pd4Var = (pd4) this.G.k;
            cu4[] cu4VarArr = tm3Var2.k;
            cu4[] cu4VarArr2 = new cu4[cu4VarArr.length];
            for (int i3 = 0; i3 < cu4VarArr.length; i3++) {
                cu4VarArr2[i3] = new sm3(cu4VarArr[i3]);
            }
            tm3Var = new tm3(cu4VarArr2, tm3Var2.l, pd4Var);
            if (mt2Var2.b != -1) {
                tm3Var.g(mt2Var2.a, this.y);
                int i4 = this.y.c;
                bu4 bu4Var = this.x;
                tm3Var.m(i4, bu4Var, 0L);
                if (bu4Var.a()) {
                    mt2Var = new mt2(mt2Var2.d, mt2Var2.a);
                }
            }
            ph3Var = this.V;
            int i5 = ph3Var.e;
            if (z4) {
                exoPlaybackException = null;
            } else {
                exoPlaybackException = ph3Var.f;
            }
            if (z5) {
                tv4Var = tv4.d;
            } else {
                tv4Var = ph3Var.h;
            }
            tv4 tv4Var2 = tv4Var;
            if (z5) {
                ew4Var = this.r;
            } else {
                ew4Var = ph3Var.i;
            }
            ew4 ew4Var2 = ew4Var;
            if (z5) {
                vw1 vw1Var = yw1.o;
                list = gy3.r;
            } else {
                list = ph3Var.j;
            }
            this.V = new ph3(tm3Var, mt2Var, j3, j2, i5, exoPlaybackException, false, tv4Var2, ew4Var2, list, mt2Var, ph3Var.l, ph3Var.m, ph3Var.n, ph3Var.o, j2, 0L, j2, 0L, false);
            if (z3) {
                ro2Var = this.F;
                if (!ro2Var.q.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    for (i = 0; i < ro2Var.q.size(); i++) {
                        ((oo2) ro2Var.q.get(i)).i();
                    }
                    ro2Var.q = arrayList;
                    ro2Var.m = null;
                    ro2Var.l();
                }
                fo1 fo1Var = this.G;
                HashMap map = (HashMap) fo1Var.g;
                for (au2 au2Var : map.values()) {
                    try {
                        au2Var.a.o(au2Var.b);
                    } catch (RuntimeException e4) {
                        l93.G("MediaSourceList", "Failed to release child source.", e4);
                    }
                    bq bqVar = au2Var.a;
                    zt2 zt2Var = au2Var.c;
                    bqVar.r(zt2Var);
                    au2Var.a.q(zt2Var);
                }
                map.clear();
                ((HashSet) fo1Var.h).clear();
                fo1Var.a = false;
            }
        }
        tm3Var = cu4Var2;
        mt2Var = mt2Var2;
        ph3Var = this.V;
        int i6 = ph3Var.e;
        if (z4) {
            exoPlaybackException = null;
        } else {
            exoPlaybackException = ph3Var.f;
        }
        if (z5) {
            tv4Var = tv4.d;
        } else {
            tv4Var = ph3Var.h;
        }
        tv4 tv4Var3 = tv4Var;
        if (z5) {
            ew4Var = this.r;
        } else {
            ew4Var = ph3Var.i;
        }
        ew4 ew4Var3 = ew4Var;
        if (z5) {
            vw1 vw1Var2 = yw1.o;
            list = gy3.r;
        } else {
            list = ph3Var.j;
        }
        this.V = new ph3(tm3Var, mt2Var, j3, j2, i6, exoPlaybackException, false, tv4Var3, ew4Var3, list, mt2Var, ph3Var.l, ph3Var.m, ph3Var.n, ph3Var.o, j2, 0L, j2, 0L, false);
        if (z3) {
            ro2Var = this.F;
            if (!ro2Var.q.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                while (i < ro2Var.q.size()) {
                    ((oo2) ro2Var.q.get(i)).i();
                }
                ro2Var.q = arrayList2;
                ro2Var.m = null;
                ro2Var.l();
            }
            fo1 fo1Var2 = this.G;
            HashMap map2 = (HashMap) fo1Var2.g;
            while (r4.hasNext()) {
                au2Var.a.o(au2Var.b);
                bq bqVar2 = au2Var.a;
                zt2 zt2Var2 = au2Var.c;
                bqVar2.r(zt2Var2);
                au2Var.a.q(zt2Var2);
            }
            map2.clear();
            ((HashSet) fo1Var2.h).clear();
            fo1Var2.a = false;
        }
    }

    public final void Q() {
        oo2 oo2Var = this.F.i;
        this.Z = oo2Var != null && oo2Var.g.i && this.Y;
    }

    public final void R(boolean z, long j) {
        oo2 oo2Var = this.F.i;
        long j2 = j + (oo2Var == null ? 1000000000000L : oo2Var.p);
        this.k0 = j2;
        this.B.n.f(j2);
        for (ez3 ez3Var : this.n) {
            long j3 = this.k0;
            kq kqVarD = ez3Var.d(oo2Var);
            if (kqVarD != null) {
                kqVarD.C(j3, false, z);
            }
        }
        for (oo2 oo2Var2 = r0.i; oo2Var2 != null; oo2Var2 = oo2Var2.m) {
            for (t41 t41Var : (t41[]) oo2Var2.o.q) {
                if (t41Var != null) {
                    t41Var.r();
                }
            }
        }
    }

    public final void S(cu4 cu4Var, cu4 cu4Var2) {
        if (cu4Var.p() && cu4Var2.p()) {
            return;
        }
        ArrayList arrayList = this.C;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            xa3.r(arrayList.get(size));
            throw null;
        }
    }

    public final void V(long j) {
        boolean z;
        if (this.R) {
            this.Q.getClass();
            z = true;
        } else {
            z = false;
        }
        ph3 ph3Var = this.V;
        long jMin = 1000;
        long j2 = u0;
        if (z) {
            jMin = ph3Var.e != 3 ? j2 : 1000L;
            for (ez3 ez3Var : this.n) {
                long j3 = this.k0;
                long j4 = this.l0;
                kq kqVar = (kq) ez3Var.f;
                kq kqVar2 = (kq) ez3Var.e;
                long jF = ez3.h(kqVar2) ? kqVar2.f(j3, j4) : Long.MAX_VALUE;
                if (kqVar != null && kqVar.u != 0) {
                    jF = Math.min(jF, kqVar.f(j3, j4));
                }
                jMin = Math.min(jMin, f35.i0(jF));
            }
            if (this.V.m()) {
                oo2 oo2Var = this.F.i;
                oo2 oo2Var2 = oo2Var != null ? oo2Var.m : null;
                if (oo2Var2 != null) {
                    if ((f35.Q(jMin) * this.V.o.a) + this.k0 >= oo2Var2.e()) {
                        jMin = Math.min(jMin, j2);
                    }
                }
            }
        } else if (ph3Var.e != 3 || r0()) {
            jMin = j2;
        }
        this.u.a.sendEmptyMessageAtTime(2, j + jMin);
    }

    public final void W(boolean z) {
        mt2 mt2Var = this.F.i.g.a;
        long jY = Y(mt2Var, this.V.s, true, false);
        if (jY != this.V.s) {
            ph3 ph3Var = this.V;
            this.V = z(mt2Var, jY, ph3Var.c, ph3Var.d, z, 5);
        }
    }

    public final void X(p41 p41Var) throws Throwable {
        long jLongValue;
        mt2 mt2VarQ;
        long j;
        long j2;
        boolean z;
        long j3;
        long j4;
        long jE;
        long j5;
        ph3 ph3Var;
        int i;
        long j6;
        mt2 mt2Var;
        int i2;
        long j7;
        q41 q41Var = this;
        if (q41Var.S) {
            if (q41Var.T != null) {
                q41Var.U++;
                q41Var.W.e(1);
            }
            q41Var.T = p41Var;
            return;
        }
        q41Var.W.e(1);
        Pair pairT = T(q41Var.V.a, p41Var, true, q41Var.d0, q41Var.e0, q41Var.x, q41Var.y);
        if (pairT == null) {
            Pair pairP = q41Var.p(q41Var.V.a);
            mt2VarQ = (mt2) pairP.first;
            jLongValue = ((Long) pairP.second).longValue();
            z = !q41Var.V.a.p();
            j = -9223372036854775807L;
            j2 = 0;
            j3 = -9223372036854775807L;
        } else {
            Object obj = pairT.first;
            jLongValue = ((Long) pairT.second).longValue();
            long jMax = p41Var.c == -9223372036854775807L ? -9223372036854775807L : jLongValue;
            mt2VarQ = q41Var.F.q(q41Var.V.a, obj, jLongValue);
            if (mt2VarQ.b()) {
                q41Var.V.a.g(mt2VarQ.a, q41Var.y);
                jLongValue = q41Var.y.f(mt2VarQ.b) == mt2VarQ.c ? q41Var.y.g.b : 0L;
                x5 x5VarA = q41Var.y.g.a(mt2VarQ.b);
                j2 = 0;
                j = -9223372036854775807L;
                jMax = Math.max(jMax, x5VarA.a + x5VarA.j);
            } else {
                j = -9223372036854775807L;
                j2 = 0;
                if (p41Var.c != -9223372036854775807L) {
                    z = false;
                }
                j3 = jMax;
            }
            z = true;
            j3 = jMax;
        }
        try {
            try {
                if (!q41Var.V.a.p()) {
                    ph3 ph3Var2 = q41Var.V;
                    if (pairT == null) {
                        if (ph3Var2.e != 1) {
                            q41Var.n0(4);
                        }
                        q41Var.P(false, true, false, true);
                    } else {
                        if (mt2VarQ.equals(ph3Var2.b)) {
                            try {
                                oo2 oo2Var = q41Var.F.i;
                                if (oo2Var == null || !oo2Var.e || jLongValue == j2) {
                                    jE = jLongValue;
                                } else {
                                    no2 no2Var = oo2Var.a;
                                    long j8 = q41Var.x.l;
                                    if (q41Var.R && j8 != j) {
                                        q41Var.Q.getClass();
                                    }
                                    jE = no2Var.e(jLongValue, q41Var.P);
                                }
                                j5 = j3;
                                try {
                                    if (f35.i0(jE) == f35.i0(q41Var.V.s) && ((i = (ph3Var = q41Var.V).e) == 2 || i == 3)) {
                                        j6 = ph3Var.s;
                                        z = z;
                                        mt2Var = mt2VarQ;
                                        i2 = 2;
                                        j7 = j6;
                                        j3 = j5;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    z = z;
                                    mt2VarQ = mt2VarQ;
                                    z = z;
                                    j4 = jLongValue;
                                    j3 = j5;
                                    q41Var.V = q41Var.z(mt2VarQ, j4, j3, j4, z, 2);
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                mt2VarQ = mt2VarQ;
                                j4 = jLongValue;
                                q41Var.V = q41Var.z(mt2VarQ, j4, j3, j4, z, 2);
                                throw th;
                            }
                        } else {
                            j5 = j3;
                            jE = jLongValue;
                        }
                        try {
                            if (q41Var.R) {
                                try {
                                    for (ez3 ez3Var : q41Var.n) {
                                        if (ez3Var.g() && ((kq) ez3Var.e).o == 2) {
                                            q41Var.S = true;
                                            break;
                                        }
                                        q41Var.V = q41Var.z(mt2VarQ, j4, j3, j4, z, 2);
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    z = z;
                                    j4 = jLongValue;
                                    j3 = j5;
                                }
                            }
                            boolean z2 = q41Var.V.e == 4;
                            ro2 ro2Var = q41Var.F;
                            long jY = q41Var.Y(mt2VarQ, jE, ro2Var.i != ro2Var.j, z2);
                            z = (jLongValue != jY) | z;
                            try {
                                ph3 ph3Var3 = q41Var.V;
                                mt2 mt2Var2 = mt2VarQ;
                                try {
                                    cu4 cu4Var = ph3Var3.a;
                                    long j9 = j5;
                                    try {
                                        q41Var.C0(cu4Var, mt2Var2, cu4Var, ph3Var3.b, j9, true);
                                        mt2Var = mt2Var2;
                                        j3 = j9;
                                        j6 = jY;
                                        i2 = 2;
                                        j7 = j6;
                                        q41Var = this;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        mt2VarQ = mt2Var2;
                                        j3 = j9;
                                        j4 = jY;
                                        q41Var.V = q41Var.z(mt2VarQ, j4, j3, j4, z, 2);
                                        throw th;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    mt2VarQ = mt2Var2;
                                    j3 = j5;
                                    j4 = jY;
                                    q41Var.V = q41Var.z(mt2VarQ, j4, j3, j4, z, 2);
                                    throw th;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            j3 = j5;
                            j4 = jLongValue;
                        }
                    }
                    q41Var.V = q41Var.z(mt2Var, j6, j3, j7, z, i2);
                }
                q41Var.j0 = p41Var;
                z = z;
                mt2Var = mt2VarQ;
                j6 = jLongValue;
                i2 = 2;
                j7 = j6;
                q41Var = this;
                q41Var.V = q41Var.z(mt2Var, j6, j3, j7, z, i2);
            } catch (Throwable th8) {
                th = th8;
                mt2VarQ = mt2VarQ;
                j4 = jLongValue;
            }
        } catch (Throwable th9) {
            th = th9;
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00f2  */
    public final long Y(mt2 mt2Var, long j, boolean z, boolean z2) {
        ro2 ro2Var;
        v0();
        boolean z3 = true;
        D0(false, true);
        if (z2 || this.V.e == 3) {
            n0(2);
        }
        oo2 oo2Var = this.F.i;
        oo2 oo2Var2 = oo2Var;
        while (oo2Var2 != null && !mt2Var.equals(oo2Var2.g.a)) {
            oo2Var2 = oo2Var2.m;
        }
        if (z || oo2Var != oo2Var2 || (oo2Var2 != null && oo2Var2.p + j < 0)) {
            for (int i = 0; i < this.n.length; i++) {
                i(i);
            }
            this.r0 = -9223372036854775807L;
            if (oo2Var2 != null) {
                while (true) {
                    ro2Var = this.F;
                    if (ro2Var.i == oo2Var2) {
                        break;
                    }
                    ro2Var.a();
                }
                ro2Var.o(oo2Var2);
                oo2Var2.p = 1000000000000L;
                m(new boolean[this.n.length], this.F.j.e());
                oo2Var2.h = true;
            }
        }
        h();
        ro2 ro2Var2 = this.F;
        if (oo2Var2 != null) {
            ro2Var2.o(oo2Var2);
            if (!oo2Var2.e) {
                oo2Var2.g = oo2Var2.g.b(j);
            } else if (oo2Var2.f) {
                if (this.R) {
                    this.Q.getClass();
                    if (this.V.a.p() || !oo2Var2.g.a.equals(this.V.b)) {
                        j = oo2Var2.a.i(j);
                        oo2Var2.a.k(this.A, j - this.z);
                    } else {
                        long j2 = oo2Var2.p + j;
                        boolean z4 = true;
                        for (ez3 ez3Var : this.n) {
                            if (ez3Var.g()) {
                                kq kqVarD = ez3Var.d(oo2Var2);
                                z4 &= kqVarD != null && kqVarD.G(j2);
                            }
                        }
                        if (z4) {
                            no2 no2Var = oo2Var2.a;
                            long j3 = this.V.s;
                            n84 n84Var = n84.c;
                            if (no2Var.e(j3, n84Var) == oo2Var2.a.e(j, n84Var)) {
                                z3 = false;
                            } else {
                                j = oo2Var2.a.i(j);
                                oo2Var2.a.k(this.A, j - this.z);
                            }
                        } else {
                            j = oo2Var2.a.i(j);
                            oo2Var2.a.k(this.A, j - this.z);
                        }
                    }
                } else {
                    j = oo2Var2.a.i(j);
                    oo2Var2.a.k(this.A, j - this.z);
                }
            }
            R(z3, j);
            D();
        } else {
            ro2Var2.b();
            R(true, j);
        }
        v(false);
        this.u.g(2);
        return j;
    }

    public final void Z(sk3 sk3Var) {
        sk3Var.getClass();
        yp4 yp4Var = this.u;
        if (sk3Var.e != this.w) {
            yp4Var.b(15, sk3Var).b();
            return;
        }
        synchronized (sk3Var) {
        }
        try {
            sk3Var.a.c(sk3Var.c, sk3Var.d);
            sk3Var.a(true);
            int i = this.V.e;
            if (i == 3 || i == 2) {
                yp4Var.g(2);
            }
        } catch (Throwable th) {
            sk3Var.a(true);
            throw th;
        }
    }

    public final void a(l41 l41Var, int i) throws Throwable {
        this.W.e(1);
        fo1 fo1Var = this.G;
        if (i == -1) {
            i = ((ArrayList) fo1Var.c).size();
        }
        w(fo1Var.b(i, l41Var.a, l41Var.b), false);
    }

    public final void a0(sk3 sk3Var) {
        Looper looper = sk3Var.e;
        if (looper.getThread().isAlive()) {
            this.D.a(looper, null).d(new a0(this, sk3Var));
        } else {
            l93.q0("TAG", "Trying to send message on a dead thread.");
            sk3Var.a(false);
        }
    }

    @Override // defpackage.mo2
    public final void b(no2 no2Var) {
        this.u.b(8, no2Var).b();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    /* JADX WARN: Code duplicated, block: B:20:0x003b  */
    public final void b0(il ilVar, boolean z) {
        int i;
        pn0 pn0Var = this.q;
        if (!pn0Var.i.equals(ilVar)) {
            pn0Var.i = ilVar;
            pn0Var.e();
        }
        if (!z) {
            ilVar = null;
        }
        tl tlVar = this.N;
        if (!Objects.equals(tlVar.d, ilVar)) {
            tlVar.d = ilVar;
            if (ilVar != null) {
                int i2 = ilVar.c;
                i = 3;
                switch (i2) {
                    case 0:
                        l93.q0("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                        i = 1;
                        break;
                    case 1:
                    case 14:
                        i = 1;
                        break;
                    case 2:
                    case 4:
                        i = 2;
                        break;
                    case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                        i = 0;
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 13:
                        break;
                    case 11:
                        if (ilVar.a == 1) {
                            i = 2;
                        }
                        break;
                    case 15:
                    default:
                        xa3.m(i2, "Unidentified audio usage: ", "AudioFocusManager");
                        i = 0;
                        break;
                    case WaveRetry.MAX_FAILURES /* 16 */:
                        i = 4;
                        break;
                }
            } else {
                i = 0;
            }
            tlVar.f = i;
            rr2.k("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", i == 1 || i == 0);
        }
        ph3 ph3Var = this.V;
        boolean z2 = ph3Var.l;
        A0(tlVar.c(ph3Var.e, z2), ph3Var.n, ph3Var.m, z2);
    }

    @Override // defpackage.dw4
    public final void c() {
        this.u.g(10);
    }

    public final void c0(boolean z, q90 q90Var) {
        if (this.f0 != z) {
            this.f0 = z;
            if (!z) {
                for (ez3 ez3Var : this.n) {
                    ez3Var.k();
                }
            }
        }
        if (q90Var != null) {
            q90Var.d();
        }
    }

    @Override // defpackage.c55
    public final void d(long j, long j2, tb1 tb1Var, MediaFormat mediaFormat) {
        if (this.S) {
            this.u.a(37).b();
        }
    }

    public final void d0(l41 l41Var) throws Throwable {
        this.W.e(1);
        int i = l41Var.c;
        pd4 pd4Var = l41Var.b;
        ArrayList arrayList = l41Var.a;
        if (i != -1) {
            this.j0 = new p41(l41Var.c, l41Var.d, new tm3(arrayList, pd4Var));
        }
        fo1 fo1Var = this.G;
        ArrayList arrayList2 = (ArrayList) fo1Var.c;
        fo1Var.o(0, arrayList2.size());
        w(fo1Var.b(arrayList2.size(), arrayList, pd4Var), false);
    }

    public final void e() {
        for (ez3 ez3Var : this.n) {
            i74 i74Var = this.R ? this.Q : null;
            ((kq) ez3Var.e).c(18, i74Var);
            kq kqVar = (kq) ez3Var.f;
            if (kqVar != null) {
                kqVar.c(18, i74Var);
            }
        }
    }

    public final void e0(boolean z) {
        this.Y = z;
        Q();
        if (this.Z) {
            ro2 ro2Var = this.F;
            if (ro2Var.j != ro2Var.i) {
                W(true);
                v(false);
            }
        }
    }

    public final boolean f() {
        if (!this.M) {
            return false;
        }
        for (ez3 ez3Var : this.n) {
            if (ez3Var.f()) {
                return true;
            }
        }
        return false;
    }

    public final void f0(qh3 qh3Var) {
        this.u.f(16);
        xl0 xl0Var = this.B;
        xl0Var.d(qh3Var);
        qh3 qh3VarI = xl0Var.i();
        y(qh3VarI, qh3VarI.a, true, true);
    }

    public final void g() {
        O();
        W(true);
    }

    public final void g0(p31 p31Var) {
        this.q0 = p31Var;
        cu4 cu4Var = this.V.a;
        ro2 ro2Var = this.F;
        ro2Var.getClass();
        p31Var.getClass();
        if (ro2Var.q.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < ro2Var.q.size(); i++) {
            ((oo2) ro2Var.q.get(i)).i();
        }
        ro2Var.q = arrayList;
        ro2Var.m = null;
        ro2Var.l();
    }

    public final void h() {
        kq kqVar;
        if (this.M && f()) {
            for (ez3 ez3Var : this.n) {
                int iC = ez3Var.c();
                if (ez3Var.f()) {
                    int i = ez3Var.d;
                    boolean z = i == 4 || i == 2;
                    int i2 = i != 4 ? 0 : 1;
                    if (z) {
                        kqVar = (kq) ez3Var.e;
                    } else {
                        kqVar = (kq) ez3Var.f;
                        kqVar.getClass();
                    }
                    ez3Var.a(kqVar, this.B);
                    ez3Var.i(z);
                    ez3Var.d = i2;
                }
                this.i0 -= iC - ez3Var.c();
            }
            this.r0 = -9223372036854775807L;
        }
    }

    public final void h0(int i) {
        this.d0 = i;
        cu4 cu4Var = this.V.a;
        ro2 ro2Var = this.F;
        ro2Var.g = i;
        int iS = ro2Var.s(cu4Var);
        if ((iS & 1) != 0) {
            W(true);
        } else if ((iS & 2) != 0) {
            h();
        }
        v(false);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        int i;
        oo2 oo2Var;
        mt2 mt2Var;
        oo2 oo2Var2;
        int i2;
        int i3 = 1000;
        try {
            switch (message.what) {
                case 1:
                    boolean z = message.arg1 != 0;
                    int i4 = message.arg2;
                    this.W.e(1);
                    A0(this.N.c(this.V.e, z), i4 >> 4, i4 & 15, z);
                    break;
                case 2:
                    k();
                    break;
                case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                    X((p41) message.obj);
                    break;
                case 4:
                    f0((qh3) message.obj);
                    break;
                case 5:
                    k0((n84) message.obj);
                    break;
                case 6:
                    u0(false, true);
                    break;
                case 7:
                    L((q90) message.obj);
                    return true;
                case 8:
                    x((no2) message.obj);
                    break;
                case 9:
                    t((no2) message.obj);
                    break;
                case 10:
                    O();
                    break;
                case 11:
                    h0(message.arg1);
                    break;
                case 12:
                    l0(message.arg1 != 0);
                    break;
                case 13:
                    c0(message.arg1 != 0, (q90) message.obj);
                    break;
                case 14:
                    Z((sk3) message.obj);
                    break;
                case 15:
                    a0((sk3) message.obj);
                    break;
                case WaveRetry.MAX_FAILURES /* 16 */:
                    qh3 qh3Var = (qh3) message.obj;
                    y(qh3Var, qh3Var.a, true, false);
                    break;
                case 17:
                    d0((l41) message.obj);
                    break;
                case 18:
                    a((l41) message.obj, message.arg1);
                    break;
                case 19:
                    J((m41) message.obj);
                    break;
                case 20:
                    N(message.arg1, message.arg2, (pd4) message.obj);
                    break;
                case 21:
                    m0((pd4) message.obj);
                    break;
                case 22:
                    I();
                    break;
                case 23:
                    e0(message.arg1 != 0);
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    g();
                    break;
                case 26:
                    O();
                    W(true);
                    break;
                case 27:
                    y0(message.arg1, message.arg2, (List) message.obj);
                    break;
                case 28:
                    g0((p31) message.obj);
                    break;
                case 29:
                    K();
                    break;
                case 30:
                    Pair pair = (Pair) message.obj;
                    p0(pair.first, (q90) pair.second);
                    break;
                case 31:
                    b0((il) message.obj, message.arg1 != 0);
                    break;
                case 32:
                    q0(((Float) message.obj).floatValue());
                    break;
                case 33:
                    r(message.arg1);
                    break;
                case 34:
                    s();
                    break;
                case 35:
                    o0((c55) message.obj);
                    break;
                case 36:
                    i0(((Boolean) message.obj).booleanValue());
                    break;
                case 37:
                    this.S = false;
                    p41 p41Var = this.T;
                    if (p41Var != null) {
                        X(p41Var);
                        this.T = null;
                    }
                    break;
                case 38:
                    j0((i74) message.obj);
                    break;
            }
        } catch (ParserException e) {
            boolean z2 = e.n;
            int i5 = e.o;
            if (i5 == 1) {
                i2 = z2 ? 3001 : 3003;
            } else {
                if (i5 == 4) {
                    i2 = z2 ? 3002 : 3004;
                }
                u(e, i3);
            }
            i3 = i2;
            u(e, i3);
        } catch (DataSourceException e2) {
            u(e2, e2.n);
        } catch (ExoPlaybackException e3) {
            e = e3;
            int i6 = e.w;
            ro2 ro2Var = this.F;
            if (i6 == 1 && (oo2Var2 = ro2Var.j) != null && e.B == null) {
                e = e.b(oo2Var2.g.a);
            }
            int i7 = e.w;
            yp4 yp4Var = this.u;
            if (i7 == 1 && (mt2Var = e.B) != null && B(e.y, mt2Var)) {
                this.s0 = true;
                h();
                oo2 oo2VarH = ro2Var.h();
                oo2 oo2Var3 = ro2Var.i;
                if (oo2Var3 != oo2VarH) {
                    while (oo2Var3 != null) {
                        oo2 oo2Var4 = oo2Var3.m;
                        if (oo2Var4 == oo2VarH) {
                            break;
                        }
                        oo2Var3 = oo2Var4;
                    }
                }
                ro2Var.o(oo2Var3);
                if (this.V.e != 4) {
                    D();
                    yp4Var.g(2);
                }
            } else {
                ExoPlaybackException exoPlaybackException = this.o0;
                if (exoPlaybackException != null) {
                    exoPlaybackException.addSuppressed(e);
                    e = this.o0;
                }
                if (e.w == 1 && ro2Var.i != ro2Var.j) {
                    while (true) {
                        oo2Var = ro2Var.i;
                        if (oo2Var == ro2Var.j) {
                            break;
                        }
                        ro2Var.a();
                    }
                    rr2.r(oo2Var);
                    F();
                    po2 po2Var = oo2Var.g;
                    mt2 mt2Var2 = po2Var.a;
                    long j = po2Var.b;
                    this.V = z(mt2Var2, j, po2Var.c, j, true, 0);
                }
                if (e.C && (this.o0 == null || (i = e.n) == 5004 || i == 5003)) {
                    l93.r0("ExoPlayerImplInternal", "Recoverable renderer error", e);
                    if (this.o0 == null) {
                        this.o0 = e;
                    }
                    xp4 xp4VarB = yp4Var.b(25, e);
                    Handler handler = yp4Var.a;
                    Message message2 = xp4VarB.a;
                    message2.getClass();
                    handler.sendMessageAtFrontOfQueue(message2);
                    xp4VarB.a();
                } else {
                    l93.G("ExoPlayerImplInternal", "Playback error", e);
                    u0(true, false);
                    this.V = this.V.f(e);
                }
            }
        } catch (DrmSession$DrmSessionException e4) {
            u(e4, e4.n);
        } catch (BehindLiveWindowException e5) {
            u(e5, 1002);
        } catch (IOException e6) {
            u(e6, 2000);
        } catch (RuntimeException e7) {
            ExoPlaybackException exoPlaybackException2 = new ExoPlaybackException(2, e7, ((e7 instanceof IllegalStateException) || (e7 instanceof IllegalArgumentException)) ? 1004 : 1000);
            l93.G("ExoPlayerImplInternal", "Playback error", exoPlaybackException2);
            u0(true, false);
            this.V = this.V.f(exoPlaybackException2);
        }
        F();
        return true;
    }

    public final void i(int i) {
        ez3[] ez3VarArr = this.n;
        int iC = ez3VarArr[i].c();
        ez3 ez3Var = ez3VarArr[i];
        kq kqVar = (kq) ez3Var.e;
        xl0 xl0Var = this.B;
        ez3Var.a(kqVar, xl0Var);
        kq kqVar2 = (kq) ez3Var.f;
        if (kqVar2 != null) {
            boolean z = (kqVar2.u == 0 || ez3Var.d == 3) ? false : true;
            ez3Var.a(kqVar2, xl0Var);
            ez3Var.i(false);
            if (z) {
                kq kqVar3 = (kq) ez3Var.e;
                kqVar2.getClass();
                kqVar2.c(17, kqVar3);
            }
        }
        ez3Var.d = 0;
        H(i, false);
        this.i0 -= iC;
    }

    public final void i0(boolean z) throws Throwable {
        if (!z) {
            p41 p41Var = this.T;
            yp4 yp4Var = this.u;
            if (p41Var != null && this.S && !yp4Var.a.hasMessages(37)) {
                this.U++;
            }
            int i = this.U;
            if (i > 0) {
                this.L.d(new a0(this, i));
            }
            this.U = 0;
            this.S = false;
            yp4Var.f(37);
            p41 p41Var2 = this.T;
            if (p41Var2 != null) {
                X(p41Var2);
                this.T = null;
                this.S = false;
            }
        }
        this.R = z;
        e();
    }

    @Override // defpackage.ca4
    public final void j(da4 da4Var) {
        this.u.b(9, (no2) da4Var).b();
    }

    public final void j0(i74 i74Var) {
        this.Q = i74Var;
        e();
    }

    /* JADX WARN: Code duplicated, block: B:116:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:118:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:152:0x026a  */
    /* JADX WARN: Code duplicated, block: B:155:0x0270  */
    /* JADX WARN: Code duplicated, block: B:157:0x0278  */
    /* JADX WARN: Code duplicated, block: B:161:0x0284  */
    /* JADX WARN: Code duplicated, block: B:175:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:178:0x02da  */
    /* JADX WARN: Code duplicated, block: B:181:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:184:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:188:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:191:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:194:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:210:0x027e A[EDGE_INSN: B:210:0x027e->B:159:0x027e BREAK  A[LOOP:1: B:153:0x026b->B:158:0x027b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x027b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:94:0x015c  */
    public final void k() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean zJ;
        boolean z4;
        ph3 ph3Var;
        int i;
        int i2;
        ez3[] ez3VarArr;
        ph3 ph3Var2;
        this.D.getClass();
        long jUptimeMillis = SystemClock.uptimeMillis();
        this.u.f(2);
        if (!this.O) {
            z0();
        }
        int i3 = this.V.e;
        if (i3 == 1 || i3 == 4) {
            return;
        }
        if (this.O) {
            z0();
        }
        oo2 oo2Var = this.F.i;
        if (oo2Var == null) {
            V(jUptimeMillis);
            return;
        }
        Trace.beginSection("doSomeWork");
        B0();
        if (oo2Var.e) {
            this.D.getClass();
            this.l0 = f35.Q(SystemClock.elapsedRealtime());
            oo2Var.a.k(this.A, this.V.s - this.z);
            z = true;
            z2 = true;
            int i4 = 0;
            while (true) {
                ez3[] ez3VarArr2 = this.n;
                if (i4 >= ez3VarArr2.length) {
                    break;
                }
                ez3 ez3Var = ez3VarArr2[i4];
                if (ez3Var.c() == 0) {
                    H(i4, false);
                } else {
                    long j = this.k0;
                    long j2 = this.l0;
                    kq kqVar = (kq) ez3Var.f;
                    kq kqVar2 = (kq) ez3Var.e;
                    if (ez3.h(kqVar2)) {
                        kqVar2.A(j, j2);
                    }
                    if (kqVar != null && kqVar.u != 0) {
                        kqVar.A(j, j2);
                    }
                    if (z) {
                        kq kqVar3 = (kq) ez3Var.f;
                        kq kqVar4 = (kq) ez3Var.e;
                        boolean zM = ez3.h(kqVar4) ? kqVar4.m() : true;
                        if (kqVar3 != null && kqVar3.u != 0) {
                            zM &= kqVar3.m();
                        }
                        if (zM) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    kq kqVarD = ez3Var.d(oo2Var);
                    boolean z5 = kqVarD == null || kqVarD.l() || kqVarD.o() || kqVarD.m();
                    H(i4, z5);
                    z2 = z2 && z5;
                    if (!z5) {
                        G(i4);
                    }
                }
                i4++;
            }
        } else {
            oo2Var.a.h();
            z = true;
            z2 = true;
        }
        long j3 = oo2Var.g.e;
        long j4 = -9223372036854775807L;
        boolean z6 = z && oo2Var.e && (j3 == -9223372036854775807L || j3 <= this.V.s);
        if (z6 && this.Z) {
            this.Z = false;
            int i5 = this.V.n;
            this.W.e(0);
            A0(this.N.c(this.V.e, false), i5, 5, false);
        }
        if (!z6 || !oo2Var.g.j) {
            ph3 ph3Var3 = this.V;
            if (ph3Var3.e == 2) {
                ro2 ro2Var = this.F;
                if (this.i0 != 0) {
                    if (!z2) {
                        zJ = false;
                    } else if (ph3Var3.g) {
                        oo2 oo2Var2 = ro2Var.i;
                        long j5 = s0(ph3Var3.a, oo2Var2.g.a) ? this.H.h : -9223372036854775807L;
                        oo2 oo2Var3 = ro2Var.l;
                        boolean z7 = oo2Var3.g() && oo2Var3.g.j;
                        boolean z8 = oo2Var3.g.a.b() && !oo2Var3.e;
                        if (z7 || z8) {
                            zJ = true;
                        } else {
                            long jQ = q(oo2Var3.d());
                            cd2 cd2Var = this.s;
                            ik3 ik3Var = this.J;
                            cu4 cu4Var = this.V.a;
                            mt2 mt2Var = oo2Var2.g.a;
                            long j6 = this.k0 - oo2Var2.p;
                            float f = this.B.i().a;
                            boolean z9 = this.V.l;
                            zJ = cd2Var.j(new bd2(ik3Var, cu4Var, mt2Var, j6, jQ, f, this.a0, j5));
                        }
                    } else {
                        zJ = true;
                    }
                    if (zJ) {
                        n0(3);
                        this.o0 = null;
                        if (r0()) {
                            D0(false, false);
                            xl0 xl0Var = this.B;
                            z3 = true;
                            xl0Var.s = true;
                            xl0Var.n.g();
                            t0();
                        }
                    }
                    if (this.V.e == 2) {
                        i2 = 0;
                        while (true) {
                            ez3VarArr = this.n;
                            if (i2 < ez3VarArr.length) {
                                break;
                            }
                            if (ez3VarArr[i2].d(oo2Var) != null) {
                                G(i2);
                            }
                            i2++;
                        }
                        ph3Var2 = this.V;
                        if (ph3Var2.g && ph3Var2.r < 500000 && A(this.F.l) && r0()) {
                            long j7 = this.p0;
                            vp4 vp4Var = this.D;
                            if (j7 == -9223372036854775807L) {
                                vp4Var.getClass();
                                this.p0 = SystemClock.elapsedRealtime();
                            } else {
                                vp4Var.getClass();
                                if (SystemClock.elapsedRealtime() - this.p0 >= WaveRetry.POLL_MS) {
                                    throw new StuckPlayerException(0, 4000);
                                }
                            }
                        } else {
                            this.p0 = -9223372036854775807L;
                        }
                    } else {
                        this.p0 = -9223372036854775807L;
                    }
                    if (r0() || this.V.e != 3) {
                        z4 = false;
                    } else {
                        z4 = z3;
                    }
                    if (this.h0 || !this.g0 || !z4) {
                        z3 = false;
                    }
                    ph3Var = this.V;
                    if (ph3Var.p != z3) {
                        this.V = ph3Var.i(z3);
                    }
                    this.g0 = false;
                    if (!z3 && (i = this.V.e) != 4 && (z4 || i == 2 || (i == 3 && this.i0 != 0))) {
                        V(jUptimeMillis);
                    }
                    Trace.endSection();
                }
                zJ = C();
                if (zJ) {
                    n0(3);
                    this.o0 = null;
                    if (r0()) {
                        D0(false, false);
                        xl0 xl0Var2 = this.B;
                        z3 = true;
                        xl0Var2.s = true;
                        xl0Var2.n.g();
                        t0();
                    }
                }
                if (this.V.e == 2) {
                    i2 = 0;
                    while (true) {
                        ez3VarArr = this.n;
                        if (i2 < ez3VarArr.length) {
                            break;
                            break;
                        } else {
                            if (ez3VarArr[i2].d(oo2Var) != null) {
                                G(i2);
                            }
                            i2++;
                        }
                    }
                    ph3Var2 = this.V;
                    if (ph3Var2.g) {
                        this.p0 = -9223372036854775807L;
                    } else {
                        this.p0 = -9223372036854775807L;
                    }
                } else {
                    this.p0 = -9223372036854775807L;
                }
                if (r0()) {
                    z4 = false;
                } else {
                    z4 = false;
                }
                if (this.h0) {
                    z3 = false;
                } else {
                    z3 = false;
                }
                ph3Var = this.V;
                if (ph3Var.p != z3) {
                    this.V = ph3Var.i(z3);
                }
                this.g0 = false;
                if (!z3) {
                    V(jUptimeMillis);
                }
                Trace.endSection();
            }
            j4 = -9223372036854775807L;
            z3 = true;
            if (this.V.e == 3 && (this.i0 != 0 ? !z2 : !C())) {
                D0(r0(), false);
                n0(2);
                if (this.a0) {
                    for (oo2 oo2Var4 = this.F.i; oo2Var4 != null; oo2Var4 = oo2Var4.m) {
                        for (t41 t41Var : (t41[]) oo2Var4.o.q) {
                            if (t41Var != null) {
                                t41Var.s();
                            }
                        }
                    }
                    ul0 ul0Var = this.H;
                    long j8 = ul0Var.h;
                    if (j8 != j4) {
                        long j9 = j8 + ul0Var.b;
                        ul0Var.h = j9;
                        long j10 = ul0Var.g;
                        if (j10 != j4 && j9 > j10) {
                            ul0Var.h = j10;
                        }
                        ul0Var.l = j4;
                    }
                }
                v0();
            }
            if (this.V.e == 2) {
                i2 = 0;
                while (true) {
                    ez3VarArr = this.n;
                    if (i2 < ez3VarArr.length) {
                        break;
                        break;
                    } else {
                        if (ez3VarArr[i2].d(oo2Var) != null) {
                            G(i2);
                        }
                        i2++;
                    }
                }
                ph3Var2 = this.V;
                if (ph3Var2.g) {
                    this.p0 = -9223372036854775807L;
                } else {
                    this.p0 = -9223372036854775807L;
                }
            } else {
                this.p0 = -9223372036854775807L;
            }
            if (r0()) {
                z4 = false;
            } else {
                z4 = false;
            }
            if (this.h0) {
                z3 = false;
            } else {
                z3 = false;
            }
            ph3Var = this.V;
            if (ph3Var.p != z3) {
                this.V = ph3Var.i(z3);
            }
            this.g0 = false;
            if (!z3) {
                V(jUptimeMillis);
            }
            Trace.endSection();
        }
        n0(4);
        v0();
        z3 = true;
        if (this.V.e == 2) {
            i2 = 0;
            while (true) {
                ez3VarArr = this.n;
                if (i2 < ez3VarArr.length) {
                    break;
                    break;
                } else {
                    if (ez3VarArr[i2].d(oo2Var) != null) {
                        G(i2);
                    }
                    i2++;
                }
            }
            ph3Var2 = this.V;
            if (ph3Var2.g) {
                this.p0 = -9223372036854775807L;
            } else {
                this.p0 = -9223372036854775807L;
            }
        } else {
            this.p0 = -9223372036854775807L;
        }
        if (r0()) {
            z4 = false;
        } else {
            z4 = false;
        }
        if (this.h0) {
            z3 = false;
        } else {
            z3 = false;
        }
        ph3Var = this.V;
        if (ph3Var.p != z3) {
            this.V = ph3Var.i(z3);
        }
        this.g0 = false;
        if (!z3) {
            V(jUptimeMillis);
        }
        Trace.endSection();
    }

    public final void k0(n84 n84Var) {
        this.P = n84Var;
    }

    public final void l(oo2 oo2Var, int i, boolean z, long j) {
        ez3 ez3Var = this.n[i];
        boolean zG = ez3Var.g();
        kq kqVar = (kq) ez3Var.e;
        if (zG) {
            return;
        }
        boolean z2 = oo2Var == this.F.i;
        ew4 ew4Var = oo2Var.o;
        dz3 dz3Var = ((dz3[]) ew4Var.p)[i];
        t41 t41Var = ((t41[]) ew4Var.q)[i];
        boolean z3 = r0() && this.V.e == 3;
        boolean z4 = !z && z3;
        this.i0++;
        q44 q44Var = oo2Var.c[i];
        long j2 = oo2Var.p;
        mt2 mt2Var = oo2Var.g.a;
        kq kqVar2 = (kq) ez3Var.f;
        int length = t41Var != null ? t41Var.length() : 0;
        tb1[] tb1VarArr = new tb1[length];
        for (int i2 = 0; i2 < length; i2++) {
            t41Var.getClass();
            tb1VarArr[i2] = t41Var.g(i2);
        }
        int i3 = ez3Var.d;
        xl0 xl0Var = this.B;
        if (i3 == 0 || i3 == 2 || i3 == 4) {
            ez3Var.a = true;
            rr2.w(kqVar.u == 0);
            kqVar.q = dz3Var;
            kqVar.D = mt2Var;
            kqVar.u = 1;
            kqVar.q(z4, z2);
            kqVar.B(tb1VarArr, q44Var, j, j2, mt2Var);
            kqVar.C(j, z4, true);
            xl0Var.a(kqVar);
        } else {
            ez3Var.b = true;
            kqVar2.getClass();
            rr2.w(kqVar2.u == 0);
            kqVar2.q = dz3Var;
            kqVar2.D = mt2Var;
            kqVar2.u = 1;
            kqVar2.q(z4, z2);
            kqVar2.B(tb1VarArr, q44Var, j, j2, mt2Var);
            kqVar2.C(j, z4, true);
            xl0Var.a(kqVar2);
        }
        k41 k41Var = new k41(this);
        kq kqVarD = ez3Var.d(oo2Var);
        kqVarD.getClass();
        kqVarD.c(11, k41Var);
        if (z3 && z2) {
            ez3Var.m();
        }
    }

    public final void l0(boolean z) {
        this.e0 = z;
        cu4 cu4Var = this.V.a;
        ro2 ro2Var = this.F;
        ro2Var.h = z;
        int iS = ro2Var.s(cu4Var);
        if ((iS & 1) != 0) {
            W(true);
        } else if ((iS & 2) != 0) {
            h();
        }
        v(false);
    }

    public final void m(boolean[] zArr, long j) {
        ez3[] ez3VarArr;
        q41 q41Var;
        long j2;
        oo2 oo2Var = this.F.j;
        ew4 ew4Var = oo2Var.o;
        int i = 0;
        while (true) {
            ez3VarArr = this.n;
            if (i >= ez3VarArr.length) {
                break;
            }
            if (!ew4Var.n(i)) {
                ez3VarArr[i].k();
            }
            i++;
        }
        int i2 = 0;
        while (i2 < ez3VarArr.length) {
            if (ew4Var.n(i2) && ez3VarArr[i2].d(oo2Var) == null) {
                q41Var = this;
                j2 = j;
                q41Var.l(oo2Var, i2, zArr[i2], j2);
            } else {
                q41Var = this;
                j2 = j;
            }
            i2++;
            this = q41Var;
            j = j2;
        }
    }

    public final void m0(pd4 pd4Var) throws Throwable {
        this.W.e(1);
        fo1 fo1Var = this.G;
        int size = ((ArrayList) fo1Var.c).size();
        if (pd4Var.b.length != size) {
            pd4Var = new pd4(new Random(pd4Var.a.nextLong())).a(0, size);
        }
        fo1Var.k = pd4Var;
        w(fo1Var.f(), false);
    }

    public final long n(cu4 cu4Var, Object obj, long j) {
        zt4 zt4Var = this.y;
        int i = cu4Var.g(obj, zt4Var).c;
        bu4 bu4Var = this.x;
        cu4Var.n(i, bu4Var);
        if (bu4Var.e != -9223372036854775807L && bu4Var.a() && bu4Var.h) {
            return f35.Q(f35.B(bu4Var.f) - bu4Var.e) - (j + zt4Var.e);
        }
        return -9223372036854775807L;
    }

    public final void n0(int i) {
        ph3 ph3Var = this.V;
        if (ph3Var.e != i) {
            if (i != 2) {
                this.p0 = -9223372036854775807L;
            }
            if (i != 3 && ph3Var.p) {
                this.V = ph3Var.i(false);
            }
            this.V = this.V.h(i);
        }
    }

    public final long o(oo2 oo2Var) {
        if (oo2Var == null) {
            return 0L;
        }
        long jMax = oo2Var.p;
        if (!oo2Var.e) {
            return jMax;
        }
        int i = 0;
        while (true) {
            ez3[] ez3VarArr = this.n;
            if (i >= ez3VarArr.length) {
                return jMax;
            }
            if (ez3VarArr[i].d(oo2Var) != null) {
                kq kqVarD = ez3VarArr[i].d(oo2Var);
                Objects.requireNonNull(kqVarD);
                long j = kqVarD.z;
                if (j == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                jMax = Math.max(j, jMax);
            }
            i++;
        }
    }

    public final void o0(c55 c55Var) {
        for (ez3 ez3Var : this.n) {
            kq kqVar = (kq) ez3Var.e;
            int i = kqVar.o;
            if (i == 2 || i == 4) {
                kqVar.c(7, c55Var);
                kq kqVar2 = (kq) ez3Var.f;
                if (kqVar2 != null) {
                    kqVar2.c(7, c55Var);
                }
            }
        }
    }

    public final Pair p(cu4 cu4Var) {
        if (cu4Var.p()) {
            return Pair.create(ph3.u, 0L);
        }
        Pair pairI = cu4Var.i(this.x, this.y, cu4Var.a(this.e0), -9223372036854775807L);
        mt2 mt2VarQ = this.F.q(cu4Var, pairI.first, 0L);
        long jLongValue = ((Long) pairI.second).longValue();
        if (mt2VarQ.b()) {
            Object obj = mt2VarQ.a;
            zt4 zt4Var = this.y;
            cu4Var.g(obj, zt4Var);
            jLongValue = mt2VarQ.c == zt4Var.f(mt2VarQ.b) ? zt4Var.g.b : 0L;
        }
        return Pair.create(mt2VarQ, Long.valueOf(jLongValue));
    }

    public final void p0(Object obj, q90 q90Var) {
        for (ez3 ez3Var : this.n) {
            kq kqVar = (kq) ez3Var.e;
            if (kqVar.o == 2) {
                int i = ez3Var.d;
                if (i == 4 || i == 1) {
                    kq kqVar2 = (kq) ez3Var.f;
                    kqVar2.getClass();
                    kqVar2.c(1, obj);
                } else {
                    kqVar.c(1, obj);
                }
            }
        }
        int i2 = this.V.e;
        if (i2 == 3 || i2 == 2) {
            this.u.g(2);
        }
        if (q90Var != null) {
            q90Var.d();
        }
    }

    public final long q(long j) {
        oo2 oo2Var = this.F.l;
        if (oo2Var == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.k0 - oo2Var.p));
    }

    public final void q0(float f) {
        this.t0 = f;
        float f2 = f * this.N.g;
        for (ez3 ez3Var : this.n) {
            kq kqVar = (kq) ez3Var.e;
            if (kqVar.o == 1) {
                kqVar.c(2, Float.valueOf(f2));
                kq kqVar2 = (kq) ez3Var.f;
                if (kqVar2 != null) {
                    kqVar2.c(2, Float.valueOf(f2));
                }
            }
        }
    }

    public final void r(int i) {
        ph3 ph3Var = this.V;
        A0(i, ph3Var.n, ph3Var.m, ph3Var.l);
    }

    public final boolean r0() {
        ph3 ph3Var = this.V;
        return ph3Var.l && ph3Var.n == 0;
    }

    public final void s() {
        q0(this.t0);
    }

    public final boolean s0(cu4 cu4Var, mt2 mt2Var) {
        if (mt2Var.b() || cu4Var.p()) {
            return false;
        }
        int i = cu4Var.g(mt2Var.a, this.y).c;
        bu4 bu4Var = this.x;
        cu4Var.n(i, bu4Var);
        return bu4Var.a() && bu4Var.h && bu4Var.e != -9223372036854775807L;
    }

    public final void t(no2 no2Var) {
        ro2 ro2Var = this.F;
        oo2 oo2Var = ro2Var.l;
        if (oo2Var != null && oo2Var.a == no2Var) {
            ro2Var.n(this.k0);
            D();
            return;
        }
        oo2 oo2Var2 = ro2Var.m;
        if (oo2Var2 == null || oo2Var2.a != no2Var) {
            return;
        }
        E();
    }

    public final void t0() {
        oo2 oo2Var = this.F.i;
        if (oo2Var == null) {
            return;
        }
        ew4 ew4Var = oo2Var.o;
        int i = 0;
        while (true) {
            ez3[] ez3VarArr = this.n;
            if (i >= ez3VarArr.length) {
                return;
            }
            if (ew4Var.n(i)) {
                ez3VarArr[i].m();
            }
            i++;
        }
    }

    public final void u(IOException iOException, int i) {
        ExoPlaybackException exoPlaybackException = new ExoPlaybackException(0, iOException, i);
        oo2 oo2Var = this.F.i;
        if (oo2Var != null) {
            exoPlaybackException = exoPlaybackException.b(oo2Var.g.a);
        }
        l93.G("ExoPlayerImplInternal", "Playback error", exoPlaybackException);
        u0(false, false);
        this.V = this.V.f(exoPlaybackException);
    }

    public final void u0(boolean z, boolean z2) {
        P(z || !this.f0, false, true, false);
        this.W.e(z2 ? 1 : 0);
        this.s.c(this.J);
        this.N.c(1, this.V.l);
        n0(1);
    }

    public final void v(boolean z) {
        oo2 oo2Var = this.F.l;
        mt2 mt2Var = oo2Var == null ? this.V.b : oo2Var.g.a;
        boolean zEquals = this.V.k.equals(mt2Var);
        if (!zEquals) {
            this.V = this.V.c(mt2Var);
        }
        ph3 ph3Var = this.V;
        ph3Var.q = oo2Var == null ? ph3Var.s : oo2Var.d();
        ph3 ph3Var2 = this.V;
        ph3Var2.r = q(ph3Var2.q);
        if ((!zEquals || z) && oo2Var != null && oo2Var.e) {
            x0(oo2Var.g.a, oo2Var.n, oo2Var.o);
        }
    }

    public final void v0() {
        xl0 xl0Var = this.B;
        xl0Var.s = false;
        zq2 zq2Var = xl0Var.n;
        if (zq2Var.p) {
            zq2Var.f(zq2Var.j());
            zq2Var.p = false;
        }
        for (ez3 ez3Var : this.n) {
            kq kqVar = (kq) ez3Var.f;
            kq kqVar2 = (kq) ez3Var.e;
            if (ez3.h(kqVar2)) {
                ez3.b(kqVar2);
            }
            if (kqVar != null && kqVar.u != 0) {
                ez3.b(kqVar);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:234:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:235:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:240:0x0408  */
    /* JADX WARN: Code duplicated, block: B:242:0x0412 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:248:0x0427  */
    /* JADX WARN: Code duplicated, block: B:250:0x042a  */
    /* JADX WARN: Code duplicated, block: B:251:0x042c  */
    /* JADX WARN: Code duplicated, block: B:254:0x0438  */
    /* JADX WARN: Code duplicated, block: B:256:0x043e  */
    /* JADX WARN: Code duplicated, block: B:260:0x045f  */
    /* JADX WARN: Code duplicated, block: B:267:0x0483  */
    /* JADX WARN: Code duplicated, block: B:268:0x0485  */
    /* JADX WARN: Code duplicated, block: B:271:0x0490  */
    /* JADX WARN: Code duplicated, block: B:273:0x0498  */
    /* JADX WARN: Code duplicated, block: B:275:0x04a2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:281:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:283:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:284:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:287:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:289:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:293:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:95:0x020c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17, types: [int] */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21, types: [int] */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8, types: [cu4] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v13, types: [long] */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15, types: [p41] */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r12v29 */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v10 */
    /* JADX WARN: Type inference failed for: r20v15 */
    /* JADX WARN: Type inference failed for: r20v16 */
    /* JADX WARN: Type inference failed for: r20v20 */
    /* JADX WARN: Type inference failed for: r20v21 */
    /* JADX WARN: Type inference failed for: r20v23 */
    /* JADX WARN: Type inference failed for: r20v24 */
    /* JADX WARN: Type inference failed for: r20v25 */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r20v7 */
    /* JADX WARN: Type inference failed for: r20v8 */
    /* JADX WARN: Type inference failed for: r20v9 */
    /* JADX WARN: Type inference failed for: r24v1 */
    /* JADX WARN: Type inference failed for: r24v10 */
    /* JADX WARN: Type inference failed for: r24v11 */
    /* JADX WARN: Type inference failed for: r24v12 */
    /* JADX WARN: Type inference failed for: r24v13 */
    /* JADX WARN: Type inference failed for: r24v14 */
    /* JADX WARN: Type inference failed for: r24v15 */
    /* JADX WARN: Type inference failed for: r24v16 */
    /* JADX WARN: Type inference failed for: r24v17 */
    /* JADX WARN: Type inference failed for: r24v18 */
    /* JADX WARN: Type inference failed for: r24v19 */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r24v20 */
    /* JADX WARN: Type inference failed for: r24v21 */
    /* JADX WARN: Type inference failed for: r24v22 */
    /* JADX WARN: Type inference failed for: r24v23 */
    /* JADX WARN: Type inference failed for: r24v3, types: [long] */
    /* JADX WARN: Type inference failed for: r24v4 */
    /* JADX WARN: Type inference failed for: r24v5 */
    /* JADX WARN: Type inference failed for: r24v6 */
    /* JADX WARN: Type inference failed for: r24v7 */
    /* JADX WARN: Type inference failed for: r24v8 */
    /* JADX WARN: Type inference failed for: r24v9, types: [long] */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v10 */
    /* JADX WARN: Type inference failed for: r26v11 */
    /* JADX WARN: Type inference failed for: r26v12 */
    /* JADX WARN: Type inference failed for: r26v13 */
    /* JADX WARN: Type inference failed for: r26v14 */
    /* JADX WARN: Type inference failed for: r26v15 */
    /* JADX WARN: Type inference failed for: r26v16 */
    /* JADX WARN: Type inference failed for: r26v17 */
    /* JADX WARN: Type inference failed for: r26v18 */
    /* JADX WARN: Type inference failed for: r26v19 */
    /* JADX WARN: Type inference failed for: r26v20 */
    /* JADX WARN: Type inference failed for: r26v21 */
    /* JADX WARN: Type inference failed for: r26v22 */
    /* JADX WARN: Type inference failed for: r26v23 */
    /* JADX WARN: Type inference failed for: r26v24 */
    /* JADX WARN: Type inference failed for: r26v25 */
    /* JADX WARN: Type inference failed for: r26v26 */
    /* JADX WARN: Type inference failed for: r26v3 */
    /* JADX WARN: Type inference failed for: r26v4 */
    /* JADX WARN: Type inference failed for: r26v5 */
    /* JADX WARN: Type inference failed for: r26v6 */
    /* JADX WARN: Type inference failed for: r26v7 */
    /* JADX WARN: Type inference failed for: r26v8 */
    /* JADX WARN: Type inference failed for: r26v9 */
    /* JADX WARN: Type inference failed for: r2v10, types: [cu4] */
    /* JADX WARN: Type inference failed for: r2v15, types: [ph3] */
    /* JADX WARN: Type inference failed for: r2v32, types: [ro2] */
    /* JADX WARN: Type inference failed for: r43v0, types: [q41] */
    /* JADX WARN: Type inference failed for: r5v44, types: [long] */
    /* JADX WARN: Type inference failed for: r5v55, types: [long] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14, types: [int] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v28, types: [cu4] */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void w(cu4 cu4Var, boolean z) throws Throwable {
        mt2 mt2Var;
        long j;
        cu4 cu4Var2;
        bu4 bu4Var;
        int i;
        int iA;
        long jK;
        ?? r26;
        long j2;
        boolean z2;
        boolean z3;
        boolean z4;
        int iA2;
        boolean z5;
        long j3;
        zt4 zt4Var;
        long j4;
        long jLongValue;
        boolean z6;
        mt2 mt2Var2;
        long jMin;
        long j5;
        long j6;
        o41 o41Var;
        int i2;
        boolean z7;
        long jLongValue2;
        boolean z8;
        boolean z9;
        boolean z10;
        long j7;
        ?? r24;
        ?? r20;
        ?? r11;
        mt2 mt2Var3;
        ?? r25;
        ?? r12;
        ?? r21;
        ?? r27;
        long j8;
        mt2 mt2Var4;
        Object obj;
        ?? r9;
        long j9;
        ?? r10;
        boolean z11;
        char c;
        ?? r28;
        ?? r29;
        ?? r22;
        ?? r13;
        ?? r8;
        cu4 cu4Var3;
        oo2 oo2Var;
        ?? r210;
        ?? r211;
        boolean z12;
        p41 p41Var;
        long j10;
        mt2 mt2Var5;
        Object obj2;
        boolean z13;
        long j11;
        ?? r14;
        ?? r212;
        ?? r213;
        ph3 ph3Var = this.V;
        p41 p41Var2 = this.j0;
        ro2 ro2Var = this.F;
        int i3 = this.d0;
        boolean z14 = this.e0;
        bu4 bu4Var2 = this.x;
        zt4 zt4Var2 = this.y;
        if (cu4Var.p()) {
            r26 = 0;
            r20 = 0;
            r24 = 0;
            cu4Var2 = cu4Var;
            o41Var = new o41(ph3.u, 0L, -9223372036854775807L, false, true, false);
        } else {
            mt2 mt2Var6 = ph3Var.b;
            Object obj3 = mt2Var6.a;
            cu4 cu4Var4 = ph3Var.a;
            boolean zP = cu4Var4.p();
            boolean z15 = zP || cu4Var4.g(mt2Var6.a, zt4Var2).f;
            long j12 = (ph3Var.b.b() || z15) ? ph3Var.c : ph3Var.s;
            if (p41Var2 != null) {
                mt2Var = mt2Var6;
                j = 1;
                cu4Var2 = cu4Var;
                Pair pairT = T(cu4Var2, p41Var2, true, i3, z14, bu4Var2, zt4Var2);
                if (pairT == null) {
                    iA = cu4Var2.a(z14);
                    j7 = j12;
                    z10 = true;
                    z8 = false;
                    z9 = false;
                } else {
                    long j13 = p41Var2.c;
                    Object obj4 = pairT.first;
                    if (j13 == -9223372036854775807L) {
                        iA = cu4Var2.g(obj4, zt4Var2).c;
                        jLongValue2 = j12;
                        z7 = false;
                    } else {
                        obj3 = obj4;
                        iA = -1;
                        z7 = true;
                        jLongValue2 = ((Long) pairT.second).longValue();
                    }
                    z8 = ph3Var.e == 4;
                    z9 = z7;
                    z10 = false;
                    j7 = jLongValue2;
                }
                z3 = z10;
                z2 = z8;
                z4 = z9;
                long j14 = j7;
                bu4Var = bu4Var2;
                j2 = j14;
                i = -1;
            } else {
                mt2Var = mt2Var6;
                j = 1;
                cu4Var2 = cu4Var;
                if (ph3Var.a.p()) {
                    iA = cu4Var2.a(z14);
                    bu4Var = bu4Var2;
                } else if (cu4Var2.b(obj3) == -1) {
                    int iU = U(bu4Var2, zt4Var2, i3, z14, obj3, ph3Var.a, cu4Var2);
                    bu4Var = bu4Var2;
                    if (iU == -1) {
                        cu4Var2 = cu4Var2;
                        zt4Var2 = zt4Var2;
                        iA2 = cu4Var2.a(z14);
                        z5 = true;
                    } else {
                        cu4Var2 = cu4Var2;
                        zt4Var2 = zt4Var2;
                        iA2 = iU;
                        z5 = false;
                    }
                    z3 = z5;
                    obj3 = obj3;
                    iA = iA2;
                    i = -1;
                    j3 = j12;
                    z2 = false;
                    z4 = false;
                    j2 = j3;
                } else {
                    bu4Var = bu4Var2;
                    if (j12 == -9223372036854775807L) {
                        int i4 = cu4Var2.g(obj3, zt4Var2).c;
                        obj3 = obj3;
                        iA = i4;
                    } else if (z15) {
                        ph3Var.a.g(mt2Var.a, zt4Var2);
                        if (ph3Var.a.m(zt4Var2.c, bu4Var, 0L).m == ph3Var.a.b(mt2Var.a)) {
                            Pair pairI = cu4Var2.i(bu4Var, zt4Var2, cu4Var2.g(obj3, zt4Var2).c, j12 + zt4Var2.e);
                            obj3 = pairI.first;
                            jK = ((Long) pairI.second).longValue();
                        } else if (cu4Var2.g(obj3, zt4Var2).d != -9223372036854775807L) {
                            r26 = 0;
                            obj3 = obj3;
                            jK = f35.k(j12, 0L, zt4Var2.d - 1);
                        } else {
                            obj3 = obj3;
                            jK = j12;
                        }
                        j2 = jK;
                        i = -1;
                        iA = -1;
                        z2 = false;
                        z3 = false;
                        z4 = true;
                    } else {
                        obj3 = obj3;
                        i = -1;
                        iA = -1;
                        z2 = false;
                        z3 = false;
                        j3 = j12;
                        z4 = false;
                        j2 = j3;
                    }
                }
                i = -1;
                z2 = false;
                z3 = false;
                j3 = j12;
                z4 = false;
                j2 = j3;
            }
            if (iA != i) {
                zt4Var = zt4Var2;
                Pair pairI2 = cu4Var2.i(bu4Var, zt4Var, iA, -9223372036854775807L);
                obj3 = pairI2.first;
                j4 = -9223372036854775807L;
                jLongValue = ((Long) pairI2.second).longValue();
            } else {
                zt4Var = zt4Var2;
                j4 = j2;
                jLongValue = j2;
            }
            mt2 mt2VarQ = ro2Var.q(cu4Var2, obj3, jLongValue);
            int i5 = mt2VarQ.e;
            boolean z16 = i5 == i || ((i2 = mt2Var.e) != i && i5 >= i2);
            boolean zEquals = mt2Var.a.equals(obj3);
            boolean z17 = zEquals && !mt2Var.b() && !mt2VarQ.b() && z16;
            zt4 zt4VarG = cu4Var2.g(obj3, zt4Var);
            if (z15 || j12 != j4) {
                z6 = false;
            } else {
                Object obj5 = mt2Var.a;
                int i6 = mt2Var.c;
                int i7 = mt2Var.b;
                if (obj5.equals(mt2VarQ.a) && (!(mt2Var.b() && zt4VarG.h(i7)) ? mt2VarQ.b() && zt4VarG.h(mt2VarQ.b) : !(zt4VarG.e(i7, i6) == 4 || zt4VarG.e(i7, i6) == 2))) {
                    z6 = true;
                } else {
                    z6 = false;
                }
            }
            if (z17 || z6) {
                mt2VarQ = mt2Var;
            }
            long j15 = jLongValue;
            if (!mt2VarQ.b()) {
                if (zEquals && mt2Var.b()) {
                    x5 x5VarA = cu4Var2.g(obj3, zt4Var).g.a(mt2Var.b);
                    long j16 = x5VarA.j;
                    long j17 = ph3Var.c;
                    if (j17 != -9223372036854775807L) {
                        mt2Var2 = mt2Var;
                        long j18 = x5VarA.a;
                        if (j18 == Long.MIN_VALUE || j18 + j16 > j17) {
                        }
                    } else {
                        j15 = jLongValue;
                        mt2Var2 = mt2Var;
                    }
                    j15 = jLongValue;
                    j15 = jLongValue;
                    j15 = jLongValue;
                    int i8 = x5VarA.b;
                    int i9 = mt2Var2.c;
                    j15 = jLongValue;
                    if (i8 > i9 && x5VarA.f[i9] == 2) {
                        long j19 = cu4Var2.g(obj3, zt4Var).d;
                        if (j19 != -9223372036854775807L) {
                            j15 = jLongValue;
                            jMin = Math.min(j19 - j, jLongValue + j16);
                        } else {
                            j15 = jLongValue;
                            jMin = jLongValue + j16;
                        }
                        long j20 = jMin;
                        j5 = j20;
                        j6 = j20;
                    }
                }
                o41Var = new o41(mt2VarQ, j6, j5, z2, z3, z4);
                r20 = zP;
                r24 = j12;
            } else if (mt2VarQ.equals(mt2Var)) {
                j15 = ph3Var.s;
            } else {
                cu4Var2.g(mt2VarQ.a, zt4Var);
                j15 = mt2VarQ.c == zt4Var.f(mt2VarQ.b) ? zt4Var.g.b : 0L;
            }
            j15 = jLongValue;
            j15 = jLongValue;
            j15 = jLongValue;
            j15 = jLongValue;
            j6 = j15;
            j5 = j4;
            o41Var = new o41(mt2VarQ, j6, j5, z2, z3, z4);
            r20 = zP;
            r24 = j12;
        }
        mt2 mt2Var7 = o41Var.a;
        ?? r15 = o41Var.c;
        boolean z18 = o41Var.d;
        long jY = o41Var.b;
        boolean z19 = (this.V.b.equals(mt2Var7) && jY == this.V.s) ? false : true;
        try {
            if (o41Var.e) {
                try {
                    z11 = true;
                    if (this.V.e != 1) {
                        c = 4;
                        try {
                            n0(4);
                        } catch (Throwable th) {
                            th = th;
                            r11 = cu4Var2;
                            mt2Var3 = mt2Var7;
                            r21 = z11;
                            r27 = c;
                            r25 = r15;
                            r12 = 0;
                        }
                    } else {
                        c = 4;
                    }
                    P(false, false, false, true);
                } catch (Throwable th2) {
                    th = th2;
                    z11 = true;
                    c = 4;
                    r11 = cu4Var2;
                    mt2Var3 = mt2Var7;
                    r21 = z11;
                    r27 = c;
                    r25 = r15;
                    r12 = 0;
                }
            } else {
                z11 = true;
                c = 4;
            }
            ez3[] ez3VarArr = this.n;
            int length = ez3VarArr.length;
            ?? r16 = 0;
            while (r16 < length) {
                try {
                    ez3 ez3Var = ez3VarArr[r16];
                    kq kqVar = (kq) ez3Var.e;
                    if (!Objects.equals(kqVar.C, cu4Var2)) {
                        kqVar.C = cu4Var2;
                        kqVar.y();
                    }
                    kq kqVar2 = (kq) ez3Var.f;
                    if (kqVar2 != null && !Objects.equals(kqVar2.C, cu4Var2)) {
                        kqVar2.C = cu4Var2;
                        kqVar2.y();
                    }
                    r16++;
                } catch (Throwable th3) {
                    th = th3;
                    r11 = cu4Var2;
                    mt2Var3 = mt2Var7;
                    r27 = c;
                    r25 = r15;
                    r12 = 0;
                    r21 = 1;
                }
            }
            try {
                if (z19) {
                    r16 = cu4Var2;
                    r26 = c;
                    r24 = r15;
                    p41Var = null;
                    p41Var = null;
                    r13 = 0;
                    r15 = 0;
                    z12 = true;
                    z12 = true;
                    r22 = 1;
                    r20 = 1;
                    if (r16.p()) {
                        r213 = r24;
                        r212 = r26;
                        r213 = r24;
                        r212 = r26;
                        mt2Var3 = mt2Var7;
                        r211 = r213;
                        r210 = r212;
                    } else {
                        for (oo2 oo2Var2 = this.F.i; oo2Var2 != null; oo2Var2 = oo2Var2.m) {
                            if (oo2Var2.g.a.equals(mt2Var7)) {
                                r213 = r24;
                                r212 = r26;
                                oo2Var2.g = this.F.i(r16, oo2Var2.g);
                                oo2Var2.k();
                            } else {
                                r213 = r24;
                                r212 = r26;
                            }
                        }
                        try {
                            r213 = r24;
                            r212 = r26;
                            ro2 ro2Var2 = this.F;
                            mt2Var3 = mt2Var7;
                            try {
                                jY = Y(mt2Var3, jY, ro2Var2.i != ro2Var2.j, z18);
                                r211 = r24;
                                r210 = r26;
                            } catch (Throwable th4) {
                                th = th4;
                                jY = jY;
                                r8 = r16;
                                r29 = r24;
                                r28 = r26;
                                r11 = r8;
                                r12 = r13;
                                r21 = r22;
                                r25 = r29;
                                r27 = r28;
                                ph3 ph3Var2 = this.V;
                                cu4 cu4Var5 = ph3Var2.a;
                                mt2 mt2Var8 = ph3Var2.b;
                                if (o41Var.f) {
                                    j8 = jY;
                                } else {
                                    j8 = -9223372036854775807L;
                                }
                                mt2Var4 = mt2Var3;
                                C0(r11, mt2Var4, cu4Var5, mt2Var8, j8, false);
                                if (z19) {
                                    ph3 ph3Var3 = this.V;
                                    obj = ph3Var3.b.a;
                                    cu4 cu4Var6 = ph3Var3.a;
                                    if (z19) {
                                        r9 = 0;
                                    } else {
                                        r9 = 0;
                                    }
                                    if (r9 != 0) {
                                        j9 = jY;
                                    } else {
                                        j9 = this.V.d;
                                    }
                                    if (r11.b(obj) == -1) {
                                        r10 = r27;
                                    } else {
                                        r10 = 3;
                                    }
                                    this.V = z(mt2Var4, jY, r25, j9, r9, r10);
                                } else {
                                    ph3 ph3Var4 = this.V;
                                    obj = ph3Var4.b.a;
                                    cu4 cu4Var7 = ph3Var4.a;
                                    if (z19) {
                                        r9 = 0;
                                    } else {
                                        r9 = 0;
                                    }
                                    if (r9 != 0) {
                                        j9 = jY;
                                    } else {
                                        j9 = this.V.d;
                                    }
                                    if (r11.b(obj) == -1) {
                                        r10 = r27;
                                    } else {
                                        r10 = 3;
                                    }
                                    this.V = z(mt2Var4, jY, r25, j9, r9, r10);
                                }
                                Q();
                                S(r11, this.V.a);
                                this.V = this.V.j(r11);
                                if (!r11.p()) {
                                    this.j0 = r12;
                                }
                                v(false);
                                this.u.g(2);
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            mt2Var3 = mt2Var7;
                            r8 = r16;
                            r13 = r15;
                            r22 = r20;
                            r29 = r24;
                            r28 = r26;
                            r11 = r8;
                            r12 = r13;
                            r21 = r22;
                            r25 = r29;
                            r27 = r28;
                            ph3 ph3Var5 = this.V;
                            cu4 cu4Var8 = ph3Var5.a;
                            mt2 mt2Var9 = ph3Var5.b;
                            if (o41Var.f) {
                                j8 = jY;
                            } else {
                                j8 = -9223372036854775807L;
                            }
                            mt2Var4 = mt2Var3;
                            C0(r11, mt2Var4, cu4Var8, mt2Var9, j8, false);
                            if (z19) {
                                ph3 ph3Var6 = this.V;
                                obj = ph3Var6.b.a;
                                cu4 cu4Var9 = ph3Var6.a;
                                if (z19) {
                                    r9 = 0;
                                } else {
                                    r9 = 0;
                                }
                                if (r9 != 0) {
                                    j9 = jY;
                                } else {
                                    j9 = this.V.d;
                                }
                                if (r11.b(obj) == -1) {
                                    r10 = r27;
                                } else {
                                    r10 = 3;
                                }
                                this.V = z(mt2Var4, jY, r25, j9, r9, r10);
                            } else {
                                ph3 ph3Var7 = this.V;
                                obj = ph3Var7.b.a;
                                cu4 cu4Var10 = ph3Var7.a;
                                if (z19) {
                                    r9 = 0;
                                } else {
                                    r9 = 0;
                                }
                                if (r9 != 0) {
                                    j9 = jY;
                                } else {
                                    j9 = this.V.d;
                                }
                                if (r11.b(obj) == -1) {
                                    r10 = r27;
                                } else {
                                    r10 = 3;
                                }
                                this.V = z(mt2Var4, jY, r25, j9, r9, r10);
                            }
                            Q();
                            S(r11, this.V.a);
                            this.V = this.V.j(r11);
                            if (!r11.p()) {
                                this.j0 = r12;
                            }
                            v(false);
                            this.u.g(2);
                            throw th;
                        }
                    }
                    ph3 ph3Var8 = this.V;
                    cu4 cu4Var11 = ph3Var8.a;
                    mt2 mt2Var10 = ph3Var8.b;
                    if (o41Var.f) {
                        j10 = jY;
                    } else {
                        j10 = -9223372036854775807L;
                    }
                    mt2Var5 = mt2Var3;
                    C0(cu4Var, mt2Var5, cu4Var11, mt2Var10, j10, false);
                    if (z19) {
                        ph3 ph3Var9 = this.V;
                        obj2 = ph3Var9.b.a;
                        cu4 cu4Var12 = ph3Var9.a;
                        if (z19) {
                            z13 = false;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            j11 = jY;
                        } else {
                            j11 = this.V.d;
                        }
                        if (cu4Var.b(obj2) == -1) {
                            r14 = r210;
                        } else {
                            r14 = 3;
                        }
                        this.V = z(mt2Var5, jY, r211, j11, z13, r14);
                    } else {
                        ph3 ph3Var10 = this.V;
                        obj2 = ph3Var10.b.a;
                        cu4 cu4Var13 = ph3Var10.a;
                        if (z19) {
                            z13 = false;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            j11 = jY;
                        } else {
                            j11 = this.V.d;
                        }
                        if (cu4Var.b(obj2) == -1) {
                            r14 = r210;
                        } else {
                            r14 = 3;
                        }
                        this.V = z(mt2Var5, jY, r211, j11, z13, r14);
                    }
                    Q();
                    S(cu4Var, this.V.a);
                    this.V = this.V.j(cu4Var);
                    if (!cu4Var.p()) {
                        this.j0 = p41Var;
                    }
                    v(false);
                    this.u.g(2);
                    return;
                }
                try {
                    oo2 oo2Var3 = this.F.j;
                    try {
                        char c2 = c;
                        try {
                            r26 = c2;
                            r24 = r15;
                            r15 = 0;
                            p41Var = null;
                            p41Var = null;
                            p41Var = null;
                            r20 = 1;
                            z12 = true;
                            z12 = true;
                            z12 = true;
                            try {
                                int iT = this.F.t(cu4Var, this.k0, oo2Var3 == null ? 0L : o(oo2Var3), (!f() || (oo2Var = this.F.k) == null) ? 0L : o(oo2Var));
                                if ((iT & 1) != 0) {
                                    W(false);
                                    r213 = r24;
                                    r212 = r26;
                                } else if ((iT & 2) != 0) {
                                    r213 = r24;
                                    r212 = r26;
                                    h();
                                    r213 = r24;
                                    r212 = r26;
                                }
                                r213 = r24;
                                r212 = r26;
                                r213 = r24;
                                r212 = r26;
                                mt2Var3 = mt2Var7;
                                r211 = r213;
                                r210 = r212;
                                ph3 ph3Var11 = this.V;
                                cu4 cu4Var14 = ph3Var11.a;
                                mt2 mt2Var11 = ph3Var11.b;
                                if (o41Var.f) {
                                    j10 = jY;
                                } else {
                                    j10 = -9223372036854775807L;
                                }
                                mt2Var5 = mt2Var3;
                                C0(cu4Var, mt2Var5, cu4Var14, mt2Var11, j10, false);
                                if (z19 || r211 != this.V.c) {
                                    ph3 ph3Var12 = this.V;
                                    obj2 = ph3Var12.b.a;
                                    cu4 cu4Var15 = ph3Var12.a;
                                    if (z19 || !z || cu4Var15.p() || cu4Var15.g(obj2, this.y).f) {
                                        z13 = false;
                                    } else {
                                        z13 = z12;
                                    }
                                    if (z13) {
                                        j11 = jY;
                                    } else {
                                        j11 = this.V.d;
                                    }
                                    if (cu4Var.b(obj2) == -1) {
                                        r14 = r210;
                                    } else {
                                        r14 = 3;
                                    }
                                    this.V = z(mt2Var5, jY, r211, j11, z13, r14);
                                }
                                Q();
                                S(cu4Var, this.V.a);
                                this.V = this.V.j(cu4Var);
                                if (!cu4Var.p()) {
                                    this.j0 = p41Var;
                                }
                                v(false);
                                this.u.g(2);
                                return;
                            } catch (Throwable th6) {
                                th = th6;
                                r16 = cu4Var;
                                mt2Var3 = mt2Var7;
                                r8 = r16;
                                r13 = r15;
                                r22 = r20;
                                r29 = r24;
                                r28 = r26;
                                r11 = r8;
                                r12 = r13;
                                r21 = r22;
                                r25 = r29;
                                r27 = r28;
                                ph3 ph3Var13 = this.V;
                                cu4 cu4Var16 = ph3Var13.a;
                                mt2 mt2Var12 = ph3Var13.b;
                                if (o41Var.f) {
                                    j8 = jY;
                                } else {
                                    j8 = -9223372036854775807L;
                                }
                                mt2Var4 = mt2Var3;
                                C0(r11, mt2Var4, cu4Var16, mt2Var12, j8, false);
                                if (z19) {
                                    ph3 ph3Var14 = this.V;
                                    obj = ph3Var14.b.a;
                                    cu4 cu4Var17 = ph3Var14.a;
                                    if (z19) {
                                        r9 = 0;
                                    } else {
                                        r9 = 0;
                                    }
                                    if (r9 != 0) {
                                        j9 = jY;
                                    } else {
                                        j9 = this.V.d;
                                    }
                                    if (r11.b(obj) == -1) {
                                        r10 = r27;
                                    } else {
                                        r10 = 3;
                                    }
                                    this.V = z(mt2Var4, jY, r25, j9, r9, r10);
                                } else {
                                    ph3 ph3Var15 = this.V;
                                    obj = ph3Var15.b.a;
                                    cu4 cu4Var18 = ph3Var15.a;
                                    if (z19) {
                                        r9 = 0;
                                    } else {
                                        r9 = 0;
                                    }
                                    if (r9 != 0) {
                                        j9 = jY;
                                    } else {
                                        j9 = this.V.d;
                                    }
                                    if (r11.b(obj) == -1) {
                                        r10 = r27;
                                    } else {
                                        r10 = 3;
                                    }
                                    this.V = z(mt2Var4, jY, r25, j9, r9, r10);
                                }
                                Q();
                                S(r11, this.V.a);
                                this.V = this.V.j(r11);
                                if (!r11.p()) {
                                    this.j0 = r12;
                                }
                                v(false);
                                this.u.g(2);
                                throw th;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            r16 = cu4Var;
                            r26 = c2;
                            r24 = r15;
                            r15 = 0;
                            r20 = 1;
                            mt2Var3 = mt2Var7;
                            r8 = r16;
                            r13 = r15;
                            r22 = r20;
                            r29 = r24;
                            r28 = r26;
                            r11 = r8;
                            r12 = r13;
                            r21 = r22;
                            r25 = r29;
                            r27 = r28;
                            ph3 ph3Var16 = this.V;
                            cu4 cu4Var19 = ph3Var16.a;
                            mt2 mt2Var13 = ph3Var16.b;
                            if (o41Var.f) {
                                j8 = jY;
                            } else {
                                j8 = -9223372036854775807L;
                            }
                            mt2Var4 = mt2Var3;
                            C0(r11, mt2Var4, cu4Var19, mt2Var13, j8, false);
                            if (z19) {
                                ph3 ph3Var17 = this.V;
                                obj = ph3Var17.b.a;
                                cu4 cu4Var110 = ph3Var17.a;
                                if (z19) {
                                    r9 = 0;
                                } else {
                                    r9 = 0;
                                }
                                if (r9 != 0) {
                                    j9 = jY;
                                } else {
                                    j9 = this.V.d;
                                }
                                if (r11.b(obj) == -1) {
                                    r10 = r27;
                                } else {
                                    r10 = 3;
                                }
                                this.V = z(mt2Var4, jY, r25, j9, r9, r10);
                            } else {
                                ph3 ph3Var18 = this.V;
                                obj = ph3Var18.b.a;
                                cu4 cu4Var111 = ph3Var18.a;
                                if (z19) {
                                    r9 = 0;
                                } else {
                                    r9 = 0;
                                }
                                if (r9 != 0) {
                                    j9 = jY;
                                } else {
                                    j9 = this.V.d;
                                }
                                if (r11.b(obj) == -1) {
                                    r10 = r27;
                                } else {
                                    r10 = 3;
                                }
                                this.V = z(mt2Var4, jY, r25, j9, r9, r10);
                            }
                            Q();
                            S(r11, this.V.a);
                            this.V = this.V.j(r11);
                            if (!r11.p()) {
                                this.j0 = r12;
                            }
                            v(false);
                            this.u.g(2);
                            throw th;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        cu4Var3 = cu4Var;
                        r26 = c;
                        r16 = cu4Var3;
                        r24 = r15;
                        r15 = 0;
                        r20 = 1;
                        mt2Var3 = mt2Var7;
                        r8 = r16;
                        r13 = r15;
                        r22 = r20;
                        r29 = r24;
                        r28 = r26;
                        r11 = r8;
                        r12 = r13;
                        r21 = r22;
                        r25 = r29;
                        r27 = r28;
                        ph3 ph3Var19 = this.V;
                        cu4 cu4Var112 = ph3Var19.a;
                        mt2 mt2Var14 = ph3Var19.b;
                        if (o41Var.f) {
                            j8 = jY;
                        } else {
                            j8 = -9223372036854775807L;
                        }
                        mt2Var4 = mt2Var3;
                        C0(r11, mt2Var4, cu4Var112, mt2Var14, j8, false);
                        if (z19) {
                            ph3 ph3Var110 = this.V;
                            obj = ph3Var110.b.a;
                            cu4 cu4Var113 = ph3Var110.a;
                            if (z19) {
                                r9 = 0;
                            } else {
                                r9 = 0;
                            }
                            if (r9 != 0) {
                                j9 = jY;
                            } else {
                                j9 = this.V.d;
                            }
                            if (r11.b(obj) == -1) {
                                r10 = r27;
                            } else {
                                r10 = 3;
                            }
                            this.V = z(mt2Var4, jY, r25, j9, r9, r10);
                        } else {
                            ph3 ph3Var111 = this.V;
                            obj = ph3Var111.b.a;
                            cu4 cu4Var114 = ph3Var111.a;
                            if (z19) {
                                r9 = 0;
                            } else {
                                r9 = 0;
                            }
                            if (r9 != 0) {
                                j9 = jY;
                            } else {
                                j9 = this.V.d;
                            }
                            if (r11.b(obj) == -1) {
                                r10 = r27;
                            } else {
                                r10 = 3;
                            }
                            this.V = z(mt2Var4, jY, r25, j9, r9, r10);
                        }
                        Q();
                        S(r11, this.V.a);
                        this.V = this.V.j(r11);
                        if (!r11.p()) {
                            this.j0 = r12;
                        }
                        v(false);
                        this.u.g(2);
                        throw th;
                    }
                } catch (Throwable th9) {
                    th = th9;
                    cu4Var3 = cu4Var2;
                }
            } catch (Throwable th10) {
                th = th10;
            }
        } catch (Throwable th11) {
            th = th11;
            r11 = cu4Var2;
            mt2Var3 = mt2Var7;
            r25 = r15;
            r12 = 0;
            r21 = 1;
            r27 = 4;
        }
        ph3 ph3Var112 = this.V;
        cu4 cu4Var115 = ph3Var112.a;
        mt2 mt2Var15 = ph3Var112.b;
        if (o41Var.f) {
            j8 = jY;
        } else {
            j8 = -9223372036854775807L;
        }
        mt2Var4 = mt2Var3;
        C0(r11, mt2Var4, cu4Var115, mt2Var15, j8, false);
        if (z19 || r25 != this.V.c) {
            ph3 ph3Var113 = this.V;
            obj = ph3Var113.b.a;
            cu4 cu4Var116 = ph3Var113.a;
            if (z19 || !z || cu4Var116.p() || cu4Var116.g(obj, this.y).f) {
                r9 = 0;
            } else {
                r9 = r21;
            }
            if (r9 != 0) {
                j9 = jY;
            } else {
                j9 = this.V.d;
            }
            if (r11.b(obj) == -1) {
                r10 = r27;
            } else {
                r10 = 3;
            }
            this.V = z(mt2Var4, jY, r25, j9, r9, r10);
        }
        Q();
        S(r11, this.V.a);
        this.V = this.V.j(r11);
        if (!r11.p()) {
            this.j0 = r12;
        }
        v(false);
        this.u.g(2);
        throw th;
    }

    public final void w0() {
        oo2 oo2Var = this.F.l;
        boolean z = this.c0 || (oo2Var != null && oo2Var.a.f());
        ph3 ph3Var = this.V;
        if (z != ph3Var.g) {
            this.V = ph3Var.b(z);
        }
    }

    public final void x(no2 no2Var) {
        oo2 oo2Var;
        q41 q41Var;
        ro2 ro2Var = this.F;
        oo2 oo2Var2 = ro2Var.l;
        xl0 xl0Var = this.B;
        if (oo2Var2 != null && oo2Var2.a == no2Var) {
            oo2Var2.getClass();
            if (!oo2Var2.e) {
                float f = xl0Var.i().a;
                ph3 ph3Var = this.V;
                oo2Var2.f(f, ph3Var.a, ph3Var.l);
            }
            x0(oo2Var2.g.a, oo2Var2.n, oo2Var2.o);
            if (oo2Var2 == ro2Var.i) {
                R(true, oo2Var2.g.b);
                m(new boolean[this.n.length], ro2Var.j.e());
                oo2Var2.h = true;
                ph3 ph3Var2 = this.V;
                mt2 mt2Var = ph3Var2.b;
                long j = oo2Var2.g.b;
                q41Var = this;
                q41Var.V = z(mt2Var, j, ph3Var2.c, j, false, 5);
            } else {
                q41Var = this;
            }
            q41Var.D();
            return;
        }
        int i = 0;
        while (true) {
            if (i >= ro2Var.q.size()) {
                oo2Var = null;
                break;
            }
            oo2Var = (oo2) ro2Var.q.get(i);
            if (oo2Var.a == no2Var) {
                break;
            } else {
                i++;
            }
        }
        if (oo2Var != null) {
            rr2.w(!oo2Var.e);
            float f2 = xl0Var.i().a;
            ph3 ph3Var3 = this.V;
            oo2Var.f(f2, ph3Var3.a, ph3Var3.l);
            oo2 oo2Var3 = ro2Var.m;
            if (oo2Var3 == null || oo2Var3.a != no2Var) {
                return;
            }
            E();
        }
    }

    public final void x0(mt2 mt2Var, tv4 tv4Var, ew4 ew4Var) {
        ro2 ro2Var = this.F;
        oo2 oo2Var = ro2Var.l;
        oo2Var.getClass();
        oo2 oo2Var2 = ro2Var.i;
        long j = this.k0;
        long j2 = oo2Var.p;
        if (oo2Var != oo2Var2) {
            j -= j2;
            j2 = oo2Var.g.b;
        }
        long j3 = j - j2;
        long jQ = q(oo2Var.d());
        long j4 = s0(this.V.a, oo2Var.g.a) ? this.H.h : -9223372036854775807L;
        cu4 cu4Var = this.V.a;
        float f = this.B.i().a;
        boolean z = this.V.l;
        this.s.f(new bd2(this.J, cu4Var, mt2Var, j3, jQ, f, this.a0, j4), tv4Var, (t41[]) ew4Var.q);
    }

    public final void y(qh3 qh3Var, float f, boolean z, boolean z2) {
        int i;
        if (z) {
            if (z2) {
                this.W.e(1);
            }
            this.V = this.V.g(qh3Var);
        }
        float f2 = qh3Var.a;
        oo2 oo2Var = this.F.i;
        while (true) {
            i = 0;
            if (oo2Var == null) {
                break;
            }
            t41[] t41VarArr = (t41[]) oo2Var.o.q;
            int length = t41VarArr.length;
            while (i < length) {
                t41 t41Var = t41VarArr[i];
                if (t41Var != null) {
                    t41Var.p(f2);
                }
                i++;
            }
            oo2Var = oo2Var.m;
        }
        ez3[] ez3VarArr = this.n;
        int length2 = ez3VarArr.length;
        while (i < length2) {
            ez3 ez3Var = ez3VarArr[i];
            float f3 = qh3Var.a;
            ((kq) ez3Var.e).D(f, f3);
            kq kqVar = (kq) ez3Var.f;
            if (kqVar != null) {
                kqVar.D(f, f3);
            }
            i++;
        }
    }

    public final void y0(int i, int i2, List list) throws Throwable {
        this.W.e(1);
        fo1 fo1Var = this.G;
        fo1Var.getClass();
        ArrayList arrayList = (ArrayList) fo1Var.c;
        rr2.l(i >= 0 && i <= i2 && i2 <= arrayList.size());
        rr2.l(list.size() == i2 - i);
        for (int i3 = i; i3 < i2; i3++) {
            ((bu2) arrayList.get(i3)).a.s((gn2) list.get(i3 - i));
        }
        w(fo1Var.f(), false);
    }

    public final ph3 z(mt2 mt2Var, long j, long j2, long j3, boolean z, int i) {
        gy3 gy3VarF;
        boolean z2;
        this.n0 = (!this.n0 && j == this.V.s && mt2Var.equals(this.V.b)) ? false : true;
        Q();
        ph3 ph3Var = this.V;
        tv4 tv4Var = ph3Var.h;
        ew4 ew4Var = ph3Var.i;
        List list = ph3Var.j;
        if (this.G.a) {
            oo2 oo2Var = this.F.i;
            tv4Var = oo2Var == null ? tv4.d : oo2Var.n;
            ew4Var = oo2Var == null ? this.r : oo2Var.o;
            t41[] t41VarArr = (t41[]) ew4Var.q;
            uw1 uw1Var = new uw1(4);
            boolean z3 = false;
            for (t41 t41Var : t41VarArr) {
                if (t41Var != null) {
                    qv2 qv2Var = t41Var.g(0).l;
                    if (qv2Var == null) {
                        uw1Var.c(new qv2(new pv2[0]));
                    } else {
                        uw1Var.c(qv2Var);
                        z3 = true;
                    }
                }
            }
            if (z3) {
                gy3VarF = uw1Var.f();
            } else {
                vw1 vw1Var = yw1.o;
                gy3VarF = gy3.r;
            }
            list = gy3VarF;
            if (oo2Var != null) {
                po2 po2Var = oo2Var.g;
                if (po2Var.c != j2) {
                    oo2Var.g = po2Var.a(j2);
                }
            }
            ez3[] ez3VarArr = this.n;
            ro2 ro2Var = this.F;
            oo2 oo2Var2 = ro2Var.i;
            if (oo2Var2 == ro2Var.j && oo2Var2 != null) {
                ew4 ew4Var2 = oo2Var2.o;
                int i2 = 0;
                boolean z4 = false;
                while (true) {
                    if (i2 >= ez3VarArr.length) {
                        z2 = true;
                        break;
                    }
                    if (ew4Var2.n(i2)) {
                        if (((kq) ez3VarArr[i2].e).o != 1) {
                            z2 = false;
                            break;
                        }
                        if (((dz3[]) ew4Var2.p)[i2].a != 0) {
                            z4 = true;
                        }
                    }
                    i2++;
                }
                boolean z5 = z4 && z2;
                if (z5 != this.h0) {
                    this.h0 = z5;
                    if (!z5 && this.V.p) {
                        this.u.g(2);
                    }
                }
            }
        } else if (!mt2Var.equals(ph3Var.b)) {
            tv4Var = tv4.d;
            ew4Var = this.r;
            list = gy3.r;
        }
        ew4 ew4Var3 = ew4Var;
        List list2 = list;
        tv4 tv4Var2 = tv4Var;
        if (z) {
            n41 n41Var = this.W;
            if (!n41Var.e || n41Var.c == 5) {
                n41Var.d = true;
                n41Var.e = true;
                n41Var.c = i;
            } else {
                rr2.l(i == 5);
            }
        }
        ph3 ph3Var2 = this.V;
        return ph3Var2.d(mt2Var, j, j2, j3, q(ph3Var2.q), tv4Var2, ew4Var3, list2);
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0202  */
    /* JADX WARN: Code duplicated, block: B:117:0x0235 A[EDGE_INSN: B:117:0x0235->B:247:0x043e BREAK  A[LOOP:6: B:127:0x024a->B:133:0x0263]] */
    /* JADX WARN: Code duplicated, block: B:202:0x0399  */
    /* JADX WARN: Code duplicated, block: B:204:0x039e  */
    /* JADX WARN: Code duplicated, block: B:211:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:227:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:314:0x0531  */
    public final void z0() {
        oo2 oo2Var;
        int i;
        int i2;
        int length;
        int i3;
        kq kqVar;
        boolean zN;
        kq kqVar2;
        byte b;
        int i4;
        int i5;
        oo2 oo2Var2;
        oo2 oo2Var3;
        boolean z;
        boolean z2;
        oo2 oo2Var4;
        oo2 oo2Var5;
        boolean z3;
        ew4 ew4Var;
        oo2 oo2Var6;
        int i6;
        if (this.V.a.p() || !this.G.a) {
            return;
        }
        this.F.n(this.k0);
        ro2 ro2Var = this.F;
        oo2 oo2Var7 = ro2Var.l;
        if (oo2Var7 == null || (!oo2Var7.g.j && oo2Var7.g() && ro2Var.l.g.e != -9223372036854775807L && ro2Var.n < 100)) {
            ro2 ro2Var2 = this.F;
            long j = this.k0;
            ph3 ph3Var = this.V;
            oo2 oo2Var8 = ro2Var2.l;
            po2 po2VarE = oo2Var8 == null ? ro2Var2.e(ph3Var.a, ph3Var.b, ph3Var.c, ph3Var.s) : ro2Var2.d(ph3Var.a, oo2Var8, j);
            if (po2VarE != null) {
                ro2 ro2Var3 = this.F;
                oo2 oo2Var9 = ro2Var3.l;
                long j2 = oo2Var9 == null ? 1000000000000L : (oo2Var9.p + oo2Var9.g.e) - po2VarE.b;
                int i7 = 0;
                while (true) {
                    if (i7 >= ro2Var3.q.size()) {
                        oo2Var = null;
                        break;
                    }
                    po2 po2Var = ((oo2) ro2Var3.q.get(i7)).g;
                    long j3 = po2Var.e;
                    long j4 = po2VarE.e;
                    if ((j3 == -9223372036854775807L || j3 == j4) && po2Var.b == po2VarE.b && po2Var.a.equals(po2VarE.a)) {
                        oo2Var = (oo2) ro2Var3.q.remove(i7);
                        break;
                    }
                    i7++;
                }
                if (oo2Var == null) {
                    q41 q41Var = (q41) ro2Var3.e.o;
                    kq[] kqVarArr = q41Var.o;
                    pn0 pn0Var = q41Var.q;
                    r20 r20VarG = q41Var.s.g(q41Var.J);
                    fo1 fo1Var = q41Var.G;
                    ew4 ew4Var2 = q41Var.r;
                    q41Var.q0.getClass();
                    oo2Var = new oo2(kqVarArr, j2, pn0Var, r20VarG, fo1Var, po2VarE, ew4Var2);
                } else {
                    oo2Var.g = po2VarE;
                    oo2Var.p = j2;
                }
                oo2 oo2Var10 = ro2Var3.l;
                if (oo2Var10 == null) {
                    ro2Var3.i = oo2Var;
                    ro2Var3.j = oo2Var;
                    ro2Var3.k = oo2Var;
                } else if (oo2Var != oo2Var10.m) {
                    oo2Var10.b();
                    oo2Var10.m = oo2Var;
                    oo2Var10.c();
                }
                ro2Var3.o = null;
                ro2Var3.l = oo2Var;
                ro2Var3.n++;
                ro2Var3.m();
                if (!oo2Var.d) {
                    long j5 = po2VarE.b;
                    oo2Var.d = true;
                    oo2Var.a.m(this, j5);
                } else if (oo2Var.e) {
                    this.u.b(8, oo2Var.a).b();
                }
                if (this.F.i == oo2Var) {
                    R(true, po2VarE.b);
                }
                v(false);
            }
        }
        if (this.c0) {
            this.c0 = A(this.F.l);
            w0();
        } else {
            D();
        }
        ro2 ro2Var4 = this.F;
        if (!this.Z && this.M && !this.s0 && !f() && (oo2Var4 = ro2Var4.k) != null && oo2Var4 == ro2Var4.j && (oo2Var5 = oo2Var4.m) != null && (z3 = oo2Var5.e)) {
            rr2.w(z3);
            if (((long) ((oo2Var5.e() - this.k0) / this.B.i().a)) <= 10000000) {
                oo2 oo2Var11 = ro2Var4.k;
                oo2Var11.getClass();
                ro2Var4.k = oo2Var11.m;
                ro2Var4.m();
                ro2Var4.k.getClass();
                ez3[] ez3VarArr = this.n;
                oo2 oo2Var12 = ro2Var4.k;
                if (oo2Var12 != null) {
                    ew4 ew4Var3 = oo2Var12.o;
                    oo2 oo2Var13 = oo2Var12;
                    int i8 = 0;
                    while (i8 < ez3VarArr.length) {
                        if (ew4Var3.n(i8)) {
                            ez3 ez3Var = ez3VarArr[i8];
                            if (((kq) ez3Var.f) == null || ez3Var.f()) {
                                ew4Var = ew4Var3;
                                oo2Var6 = oo2Var13;
                            } else {
                                ez3 ez3Var2 = ez3VarArr[i8];
                                rr2.w(!ez3Var2.f());
                                if (ez3.h((kq) ez3Var2.e)) {
                                    i6 = 3;
                                } else {
                                    kq kqVar3 = (kq) ez3Var2.f;
                                    i6 = (kqVar3 == null || kqVar3.u == 0) ? 2 : 4;
                                }
                                ez3Var2.d = i6;
                                oo2Var6 = oo2Var13;
                                ew4Var = ew4Var3;
                                l(oo2Var6, i8, false, oo2Var6.e());
                            }
                        } else {
                            ew4Var = ew4Var3;
                            oo2Var6 = oo2Var13;
                        }
                        i8++;
                        oo2Var13 = oo2Var6;
                        ez3VarArr = ez3VarArr;
                        ew4Var3 = ew4Var;
                    }
                    oo2 oo2Var14 = oo2Var13;
                    if (f()) {
                        this.r0 = oo2Var14.a.l();
                        if (!oo2Var14.g()) {
                            ro2Var4.o(oo2Var14);
                            v(false);
                            D();
                        }
                    }
                }
            }
        }
        boolean z4 = this.M;
        ez3[] ez3VarArr2 = this.n;
        ro2 ro2Var5 = this.F;
        oo2 oo2Var15 = ro2Var5.j;
        if (oo2Var15 == null) {
            i = 2;
            break;
        }
        if (oo2Var15.m != null && !this.Z) {
            if (!oo2Var15.e) {
                i = 2;
                break;
            }
            int i9 = 0;
            while (true) {
                if (i9 < ez3VarArr2.length) {
                    ez3 ez3Var3 = ez3VarArr2[i9];
                    if (ez3Var3.e(oo2Var15, (kq) ez3Var3.e) && ez3Var3.e(oo2Var15, (kq) ez3Var3.f)) {
                        i9++;
                    }
                } else if (!f() || ro2Var5.k != ro2Var5.j) {
                    oo2 oo2Var16 = oo2Var15.m;
                    if (oo2Var16.e || this.k0 >= oo2Var16.e()) {
                        oo2 oo2Var17 = oo2Var15.m;
                        boolean z5 = oo2Var17.e;
                        if (z5) {
                            rr2.w(z5);
                            if (((long) ((oo2Var17.e() - this.k0) / this.B.i().a)) > 10000000) {
                                break;
                            }
                        }
                        ew4 ew4Var4 = oo2Var15.o;
                        oo2 oo2Var18 = ro2Var5.k;
                        oo2 oo2Var19 = ro2Var5.j;
                        if (oo2Var18 == oo2Var19) {
                            oo2Var19.getClass();
                            ro2Var5.k = oo2Var19.m;
                        }
                        oo2 oo2Var20 = ro2Var5.j;
                        oo2Var20.getClass();
                        ro2Var5.j = oo2Var20.m;
                        ro2Var5.m();
                        oo2 oo2Var21 = ro2Var5.j;
                        oo2Var21.getClass();
                        ew4 ew4Var5 = oo2Var21.o;
                        cu4 cu4Var = this.V.a;
                        C0(cu4Var, oo2Var21.g.a, cu4Var, oo2Var15.g.a, -9223372036854775807L, false);
                        if (!oo2Var21.e || ((!z4 || this.r0 == -9223372036854775807L) && oo2Var21.a.l() == -9223372036854775807L)) {
                            i2 = 2;
                            length = ez3VarArr2.length;
                            i3 = 0;
                            while (i3 < length) {
                                ez3 ez3Var4 = ez3VarArr2[i3];
                                long jE = oo2Var21.e();
                                kqVar = (kq) ez3Var4.e;
                                int i10 = ez3Var4.c;
                                zN = ew4Var4.n(i10);
                                boolean zN2 = ew4Var5.n(i10);
                                kqVar2 = (kq) ez3Var4.f;
                                if (kqVar2 != null || (i4 = ez3Var4.d) == 3 || (i4 == 0 && ez3.h(kqVar))) {
                                    kqVar2 = kqVar;
                                }
                                if (zN || kqVar2.A) {
                                    b = -2;
                                } else {
                                    int i11 = kqVar.o;
                                    b = -2;
                                    boolean z6 = i11 == -2;
                                    dz3 dz3Var = ((dz3[]) ew4Var4.p)[i10];
                                    dz3 dz3Var2 = ((dz3[]) ew4Var5.p)[i10];
                                    if (!zN2 || !Objects.equals(dz3Var2, dz3Var) || z6 || ez3Var4.f()) {
                                        ez3.l(kqVar2, jE);
                                    }
                                }
                                i3++;
                                i2 = 2;
                            }
                        } else {
                            this.r0 = -9223372036854775807L;
                            boolean z7 = z4 && !this.s0;
                            if (z7) {
                                for (int i12 = 0; i12 < ez3VarArr2.length; i12++) {
                                    boolean zN3 = ew4Var5.n(i12);
                                    t41[] t41VarArr = (t41[]) ew4Var5.q;
                                    if (zN3 && ((kq) ez3VarArr2[i12].e).o != -2 && !lw2.a(t41VarArr[i12].m().n, t41VarArr[i12].m().k) && !ez3VarArr2[i12].f()) {
                                        z7 = false;
                                        break;
                                    }
                                }
                            }
                            if (z7) {
                                i2 = 2;
                                length = ez3VarArr2.length;
                                i3 = 0;
                                while (i3 < length) {
                                    ez3 ez3Var5 = ez3VarArr2[i3];
                                    long jE2 = oo2Var21.e();
                                    kqVar = (kq) ez3Var5.e;
                                    int i13 = ez3Var5.c;
                                    zN = ew4Var4.n(i13);
                                    boolean zN4 = ew4Var5.n(i13);
                                    kqVar2 = (kq) ez3Var5.f;
                                    if (kqVar2 != null) {
                                        kqVar2 = kqVar;
                                    } else {
                                        kqVar2 = kqVar;
                                    }
                                    if (zN) {
                                        b = -2;
                                    } else {
                                        b = -2;
                                    }
                                    i3++;
                                    i2 = 2;
                                }
                            } else {
                                long jE3 = oo2Var21.e();
                                for (ez3 ez3Var6 : ez3VarArr2) {
                                    kq kqVar4 = (kq) ez3Var6.f;
                                    kq kqVar5 = (kq) ez3Var6.e;
                                    if (ez3.h(kqVar5) && (i5 = ez3Var6.d) != 4) {
                                        if (i5 != 2) {
                                            ez3.l(kqVar5, jE3);
                                        }
                                    }
                                    if (kqVar4 != null && kqVar4.u != 0 && ez3Var6.d != 3) {
                                        ez3.l(kqVar4, jE3);
                                    }
                                }
                                i2 = 2;
                                if (!oo2Var21.g()) {
                                    ro2Var5.o(oo2Var21);
                                    v(false);
                                    D();
                                }
                            }
                        }
                        i = i2;
                        break;
                    }
                }
                i = 2;
                break;
            }
        }
        i = 2;
        if (oo2Var15.g.j || this.Z) {
            for (ez3 ez3Var7 : ez3VarArr2) {
                if (ez3Var7.d(oo2Var15) != null) {
                    kq kqVarD = ez3Var7.d(oo2Var15);
                    kqVarD.getClass();
                    if (kqVarD.l()) {
                        long j6 = oo2Var15.g.e;
                        long j7 = (j6 == -9223372036854775807L || j6 == Long.MIN_VALUE) ? -9223372036854775807L : oo2Var15.p + j6;
                        kq kqVarD2 = ez3Var7.d(oo2Var15);
                        kqVarD2.getClass();
                        ez3.l(kqVarD2, j7);
                    }
                }
            }
        }
        ro2 ro2Var6 = this.F;
        oo2 oo2Var22 = ro2Var6.j;
        if (oo2Var22 != null && ro2Var6.i != oo2Var22 && !oo2Var22.h) {
            ez3[] ez3VarArr3 = this.n;
            ew4 ew4Var6 = oo2Var22.o;
            boolean z8 = true;
            for (int i14 = 0; i14 < ez3VarArr3.length; i14++) {
                int iC = ez3VarArr3[i14].c();
                ez3 ez3Var8 = ez3VarArr3[i14];
                xl0 xl0Var = this.B;
                int iJ = ez3Var8.j((kq) ez3Var8.e, oo2Var22, ew4Var6, xl0Var);
                int iJ2 = ez3Var8.j((kq) ez3Var8.f, oo2Var22, ew4Var6, xl0Var);
                if (iJ == 1) {
                    iJ = iJ2;
                }
                if ((iJ & 2) != 0 && (z2 = this.h0) && z2) {
                    this.h0 = false;
                    if (this.V.p) {
                        this.u.g(i);
                    }
                }
                this.i0 -= iC - ez3VarArr3[i14].c();
                z8 &= (iJ & 1) != 0;
            }
            if (z8) {
                for (int i15 = 0; i15 < ez3VarArr3.length; i15++) {
                    if (ew4Var6.n(i15) && ez3VarArr3[i15].d(oo2Var22) == null) {
                        l(oo2Var22, i15, false, oo2Var22.e());
                    }
                }
            }
            if (z8) {
                ro2Var6.j.h = true;
            }
        }
        ez3[] ez3VarArr4 = this.n;
        ro2 ro2Var7 = this.F;
        boolean z9 = false;
        while (r0() && !this.Z && (oo2Var2 = ro2Var7.i) != null && (oo2Var3 = oo2Var2.m) != null && this.k0 >= oo2Var3.e() && oo2Var3.h) {
            if (z9) {
                F();
            }
            this.s0 = false;
            oo2 oo2VarA = ro2Var7.a();
            oo2VarA.getClass();
            if (this.V.b.a.equals(oo2VarA.g.a.a)) {
                mt2 mt2Var = this.V.b;
                if (mt2Var.b == -1) {
                    mt2 mt2Var2 = oo2VarA.g.a;
                    if (mt2Var2.b != -1 || mt2Var.e == mt2Var2.e) {
                        z = false;
                    } else {
                        z = true;
                    }
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            po2 po2Var2 = oo2VarA.g;
            boolean z10 = z;
            mt2 mt2Var3 = po2Var2.a;
            long j8 = po2Var2.b;
            this.V = z(mt2Var3, j8, po2Var2.c, j8, !z10, 0);
            Q();
            B0();
            if (f() && oo2VarA == ro2Var7.k) {
                for (ez3 ez3Var9 : ez3VarArr4) {
                    int i16 = ez3Var9.d;
                    if (i16 == 3 || i16 == 4) {
                        boolean z11 = i16 == 4;
                        kq kqVar6 = (kq) ez3Var9.e;
                        kq kqVar7 = (kq) ez3Var9.f;
                        if (z11) {
                            kqVar7.getClass();
                            kqVar7.c(17, kqVar6);
                        } else {
                            kqVar7.getClass();
                            kqVar6.c(17, kqVar7);
                        }
                        ez3Var9.d = ez3Var9.d == 4 ? 0 : 1;
                    } else if (i16 == i) {
                        ez3Var9.d = 0;
                    }
                }
            }
            if (this.V.e == 3) {
                t0();
            }
            ew4 ew4Var7 = ro2Var7.i.o;
            for (int i17 = 0; i17 < ez3VarArr4.length; i17++) {
                if (ew4Var7.n(i17)) {
                    ez3 ez3Var10 = ez3VarArr4[i17];
                    kq kqVar8 = (kq) ez3Var10.f;
                    kq kqVar9 = (kq) ez3Var10.e;
                    if (ez3.h(kqVar9)) {
                        kqVar9.e();
                    } else if (kqVar8 != null && kqVar8.u != 0) {
                        kqVar8.e();
                    }
                }
            }
            z9 = true;
        }
        this.q0.getClass();
    }
}
