package androidx.media3.decoder.ffmpeg;

import android.media.AudioDeviceInfo;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import androidx.media3.decoder.DecoderException;
import androidx.media3.decoder.SimpleDecoderOutputBuffer;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.audio.AudioSink$ConfigurationException;
import androidx.media3.exoplayer.audio.AudioSink$InitializationException;
import androidx.media3.exoplayer.audio.AudioSink$WriteException;
import defpackage.aj0;
import defpackage.an;
import defpackage.bj0;
import defpackage.cj0;
import defpackage.dn;
import defpackage.dz3;
import defpackage.ej0;
import defpackage.f35;
import defpackage.gp3;
import defpackage.ik3;
import defpackage.il;
import defpackage.jm;
import defpackage.k6;
import defpackage.km;
import defpackage.kq;
import defpackage.l93;
import defpackage.lw2;
import defpackage.mt2;
import defpackage.oj0;
import defpackage.om;
import defpackage.pw0;
import defpackage.qh3;
import defpackage.qm;
import defpackage.rj0;
import defpackage.rr2;
import defpackage.sb1;
import defpackage.sm;
import defpackage.tb1;
import defpackage.tb4;
import defpackage.tc2;
import defpackage.tj0;
import defpackage.v6;
import defpackage.ve4;
import defpackage.vp4;
import defpackage.xc5;
import defpackage.xn;
import defpackage.yj2;
import defpackage.yw1;
import defpackage.zi0;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends kq implements yj2 {
    public final xc5 F;
    public final sm G;
    public final cj0 H;
    public bj0 I;
    public tb1 J;
    public int K;
    public int L;
    public boolean M;
    public zi0 N;
    public cj0 O;
    public SimpleDecoderOutputBuffer P;
    public pw0 Q;
    public pw0 R;
    public int S;
    public boolean T;
    public boolean U;
    public long V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public long Z;
    public final long[] a0;
    public int b0;
    public boolean c0;
    public boolean d0;
    public boolean e0;
    public long f0;
    public long g0;
    public long h0;

    public b(Handler handler, qm qmVar, sm smVar) {
        super(1);
        this.F = new xc5(handler, qmVar);
        this.G = smVar;
        ((tj0) smVar).n = new aj0(this);
        this.H = new cj0(0, 0);
        this.S = 0;
        this.U = true;
        N(-9223372036854775807L);
        this.a0 = new long[10];
        this.f0 = -9223372036854775807L;
        this.g0 = -9223372036854775807L;
        this.h0 = -9223372036854775807L;
    }

    @Override // defpackage.kq
    public final void A(long j, long j2) throws ExoPlaybackException {
        if (this.Y) {
            try {
                ((tj0) this.G).t();
                this.h0 = this.g0;
                return;
            } catch (AudioSink$WriteException e) {
                throw b(e, e.p, e.o, 5002);
            }
        }
        if (this.J == null) {
            gp3 gp3Var = this.p;
            gp3Var.d();
            this.H.r();
            int iZ = z(gp3Var, this.H, 2);
            if (iZ != -5) {
                if (iZ == -4) {
                    rr2.w(this.H.d(4));
                    this.X = true;
                    try {
                        this.Y = true;
                        ((tj0) this.G).t();
                        this.h0 = this.g0;
                        return;
                    } catch (AudioSink$WriteException e2) {
                        throw b(e2, null, false, 5002);
                    }
                }
                return;
            }
            L(gp3Var);
        }
        K();
        if (this.N != null) {
            try {
                Trace.beginSection("drainAndFeed");
                while (I()) {
                }
                while (J()) {
                }
                Trace.endSection();
                synchronized (this.I) {
                }
            } catch (DecoderException e3) {
                l93.G("DecoderAudioRenderer", "Audio codec error", e3);
                xc5 xc5Var = this.F;
                Handler handler = (Handler) xc5Var.o;
                if (handler != null) {
                    handler.post(new jm(xc5Var, e3, 0));
                }
                throw b(e3, this.J, false, 4003);
            } catch (AudioSink$ConfigurationException e4) {
                throw b(e4, e4.n, false, 5001);
            } catch (AudioSink$InitializationException e5) {
                throw b(e5, e5.o, e5.n, 5001);
            } catch (AudioSink$WriteException e6) {
                throw b(e6, e6.p, e6.o, 5002);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004e  */
    @Override // defpackage.kq
    public final int E(tb1 tb1Var) {
        int i;
        String str = tb1Var.n;
        int i2 = tb1Var.G;
        int i3 = tb1Var.F;
        if (!lw2.i(str)) {
            return kq.a(0, 0, 0, 0);
        }
        String str2 = tb1Var.n;
        str2.getClass();
        if (!FfmpegLibrary.d() || !lw2.i(str2)) {
            i = 0;
        } else if (FfmpegLibrary.e(str2)) {
            tb1 tb1VarD = f35.D(2, i3, i2);
            sm smVar = this.G;
            i = 4;
            if (((tj0) smVar).j(tb1VarD) == 0) {
                if (((tj0) smVar).j(f35.D(4, i3, i2)) == 0) {
                    i = 1;
                }
            }
            if (tb1Var.O != 0) {
                i = 2;
            }
        } else {
            i = 1;
        }
        return i <= 2 ? kq.a(i, 0, 0, 0) : i | 168;
    }

    @Override // defpackage.kq
    public final int F() {
        return 8;
    }

    public final zi0 H(tb1 tb1Var) {
        Trace.beginSection("createFfmpegAudioDecoder");
        int i = tb1Var.o;
        int i2 = tb1Var.G;
        int i3 = tb1Var.F;
        if (i == -1) {
            i = 5760;
        }
        tb1 tb1VarD = f35.D(2, i3, i2);
        sm smVar = this.G;
        boolean zEquals = true;
        if (((tj0) smVar).j(tb1VarD) != 0) {
            zEquals = ((tj0) smVar).j(f35.D(4, i3, i2)) != 2 ? false : true ^ "audio/ac3".equals(tb1Var.n);
        }
        FfmpegAudioDecoder ffmpegAudioDecoder = new FfmpegAudioDecoder(i, tb1Var, zEquals);
        Trace.endSection();
        return ffmpegAudioDecoder;
    }

    public final boolean I() throws ExoPlaybackException, AudioSink$ConfigurationException {
        if (this.P == null) {
            SimpleDecoderOutputBuffer simpleDecoderOutputBuffer = (SimpleDecoderOutputBuffer) ((ve4) this.N).d();
            this.P = simpleDecoderOutputBuffer;
            if (simpleDecoderOutputBuffer == null) {
                return false;
            }
            int i = simpleDecoderOutputBuffer.q;
            if (i > 0) {
                this.I.f += i;
                ((tj0) this.G).E = true;
            }
            if (simpleDecoderOutputBuffer.d(134217728)) {
                long[] jArr = this.a0;
                ((tj0) this.G).E = true;
                if (this.b0 != 0) {
                    N(jArr[0]);
                    int i2 = this.b0 - 1;
                    this.b0 = i2;
                    System.arraycopy(jArr, 1, jArr, 0, i2);
                }
            }
        }
        if (this.P.d(4)) {
            if (this.S == 2) {
                M();
                K();
                this.U = true;
                return false;
            }
            this.P.s();
            this.P = null;
            try {
                this.Y = true;
                ((tj0) this.G).t();
                this.h0 = this.g0;
                return false;
            } catch (AudioSink$WriteException e) {
                throw b(e, e.p, e.o, 5002);
            }
        }
        this.h0 = -9223372036854775807L;
        if (this.U) {
            FfmpegAudioDecoder ffmpegAudioDecoder = (FfmpegAudioDecoder) this.N;
            ffmpegAudioDecoder.getClass();
            sb1 sb1Var = new sb1();
            sb1Var.m = lw2.m("audio/raw");
            sb1Var.E = ffmpegAudioDecoder.u;
            sb1Var.F = ffmpegAudioDecoder.v;
            sb1Var.G = ffmpegAudioDecoder.q;
            sb1 sb1VarA = new tb1(sb1Var).a();
            sb1VarA.H = this.K;
            sb1VarA.I = this.L;
            tb1 tb1Var = this.J;
            sb1VarA.k = tb1Var.l;
            sb1VarA.a = tb1Var.a;
            sb1VarA.b = tb1Var.b;
            sb1VarA.c = yw1.k(tb1Var.c);
            tb1 tb1Var2 = this.J;
            sb1VarA.d = tb1Var2.d;
            sb1VarA.e = tb1Var2.e;
            sb1VarA.f = tb1Var2.f;
            ((tj0) this.G).c(new tb1(sb1VarA), null);
            this.U = false;
        }
        sm smVar = this.G;
        SimpleDecoderOutputBuffer simpleDecoderOutputBuffer2 = this.P;
        if (!((tj0) smVar).m(1, simpleDecoderOutputBuffer2.p, simpleDecoderOutputBuffer2.t)) {
            this.h0 = this.P.p;
            return false;
        }
        this.I.e++;
        this.P.s();
        this.P = null;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0022  */
    /* JADX WARN: Code duplicated, block: B:16:0x0029  */
    /* JADX WARN: Code duplicated, block: B:18:0x003c  */
    /* JADX WARN: Code duplicated, block: B:20:0x004a  */
    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0050  */
    /* JADX WARN: Code duplicated, block: B:26:0x0056  */
    /* JADX WARN: Code duplicated, block: B:28:0x005b  */
    /* JADX WARN: Code duplicated, block: B:30:0x005f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0067  */
    /* JADX WARN: Code duplicated, block: B:34:0x007c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0080  */
    /* JADX WARN: Code duplicated, block: B:41:0x009f  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c4  */
    public final boolean J() throws ExoPlaybackException {
        gp3 gp3Var;
        int iZ;
        zi0 zi0Var = this.N;
        if (zi0Var != null && this.S != 2 && !this.X) {
            if (this.O == null) {
                cj0 cj0Var = (cj0) ((ve4) zi0Var).e();
                this.O = cj0Var;
                if (cj0Var != null) {
                    if (this.S == 1) {
                        cj0 cj0Var2 = this.O;
                        cj0Var2.o = 4;
                        ve4 ve4Var = (ve4) this.N;
                        ve4Var.getClass();
                        ve4Var.f(cj0Var2);
                        this.O = null;
                        this.S = 2;
                        return false;
                    }
                    gp3Var = this.p;
                    gp3Var.d();
                    iZ = z(gp3Var, this.O, 0);
                    if (iZ != -5) {
                        L(gp3Var);
                        return true;
                    }
                    if (iZ != -4) {
                        if (this.O.d(4)) {
                            this.X = true;
                            this.g0 = this.f0;
                            zi0 zi0Var2 = this.N;
                            cj0 cj0Var3 = this.O;
                            ve4 ve4Var2 = (ve4) zi0Var2;
                            ve4Var2.getClass();
                            ve4Var2.f(cj0Var3);
                            this.O = null;
                            return false;
                        }
                        if (!this.M) {
                            this.M = true;
                            this.O.a(134217728);
                        }
                        this.f0 = this.O.t;
                        if (l() || this.O.d(536870912)) {
                            this.g0 = this.f0;
                        }
                        this.O.u();
                        cj0 cj0Var4 = this.O;
                        cj0Var4.p = this.J;
                        ve4 ve4Var3 = (ve4) this.N;
                        ve4Var3.getClass();
                        ve4Var3.f(cj0Var4);
                        this.T = true;
                        this.I.c++;
                        this.O = null;
                        return true;
                    }
                    if (iZ == -3) {
                        tb4.a();
                        return false;
                    }
                    if (l()) {
                        this.g0 = this.f0;
                        return false;
                    }
                }
            } else {
                if (this.S == 1) {
                    cj0 cj0Var5 = this.O;
                    cj0Var5.o = 4;
                    ve4 ve4Var4 = (ve4) this.N;
                    ve4Var4.getClass();
                    ve4Var4.f(cj0Var5);
                    this.O = null;
                    this.S = 2;
                    return false;
                }
                gp3Var = this.p;
                gp3Var.d();
                iZ = z(gp3Var, this.O, 0);
                if (iZ != -5) {
                    L(gp3Var);
                    return true;
                }
                if (iZ != -4) {
                    if (this.O.d(4)) {
                        this.X = true;
                        this.g0 = this.f0;
                        zi0 zi0Var3 = this.N;
                        cj0 cj0Var6 = this.O;
                        ve4 ve4Var5 = (ve4) zi0Var3;
                        ve4Var5.getClass();
                        ve4Var5.f(cj0Var6);
                        this.O = null;
                        return false;
                    }
                    if (!this.M) {
                        this.M = true;
                        this.O.a(134217728);
                    }
                    this.f0 = this.O.t;
                    if (l()) {
                        this.g0 = this.f0;
                    } else {
                        this.g0 = this.f0;
                    }
                    this.O.u();
                    cj0 cj0Var7 = this.O;
                    cj0Var7.p = this.J;
                    ve4 ve4Var6 = (ve4) this.N;
                    ve4Var6.getClass();
                    ve4Var6.f(cj0Var7);
                    this.T = true;
                    this.I.c++;
                    this.O = null;
                    return true;
                }
                if (iZ == -3) {
                    tb4.a();
                    return false;
                }
                if (l()) {
                    this.g0 = this.f0;
                    return false;
                }
            }
        }
        return false;
    }

    public final void K() throws ExoPlaybackException {
        xc5 xc5Var = this.F;
        if (this.N != null) {
            return;
        }
        pw0 pw0Var = this.R;
        pw0.b(this.Q, pw0Var);
        this.Q = pw0Var;
        if (pw0Var != null && pw0Var.h() == null && this.Q.g() == null) {
            return;
        }
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            Trace.beginSection("createAudioDecoder");
            zi0 zi0VarH = H(this.J);
            this.N = zi0VarH;
            ((ve4) zi0VarH).b(this.y);
            Trace.endSection();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            String strO = ((FfmpegAudioDecoder) this.N).o();
            long j = jElapsedRealtime2 - jElapsedRealtime;
            Handler handler = (Handler) xc5Var.o;
            if (handler != null) {
                handler.post(new om(xc5Var, strO, jElapsedRealtime2, j, 0));
            }
            this.I.a++;
        } catch (DecoderException e) {
            l93.G("DecoderAudioRenderer", "Audio codec error", e);
            Handler handler2 = (Handler) xc5Var.o;
            if (handler2 != null) {
                handler2.post(new jm(xc5Var, e, 0));
            }
            throw b(e, this.J, false, 4001);
        } catch (OutOfMemoryError e2) {
            throw b(e2, this.J, false, 4001);
        }
    }

    public final void L(gp3 gp3Var) throws ExoPlaybackException {
        tb1 tb1Var = (tb1) gp3Var.p;
        tb1Var.getClass();
        pw0 pw0Var = (pw0) gp3Var.o;
        pw0.b(this.R, pw0Var);
        this.R = pw0Var;
        tb1 tb1Var2 = this.J;
        this.J = tb1Var;
        this.K = tb1Var.I;
        this.L = tb1Var.J;
        zi0 zi0Var = this.N;
        int i = 1;
        xc5 xc5Var = this.F;
        if (zi0Var == null) {
            K();
            tb1 tb1Var3 = this.J;
            Handler handler = (Handler) xc5Var.o;
            if (handler != null) {
                handler.post(new v6(xc5Var, tb1Var3, (Object) null, i));
                return;
            }
            return;
        }
        ej0 ej0Var = pw0Var != this.Q ? new ej0(((FfmpegAudioDecoder) zi0Var).o(), tb1Var2, tb1Var, 0, 128) : new ej0(((FfmpegAudioDecoder) zi0Var).o(), tb1Var2, tb1Var, 0, 1);
        if (ej0Var.d == 0) {
            if (this.T) {
                this.S = 1;
            } else {
                M();
                K();
                this.U = true;
            }
        }
        tb1 tb1Var4 = this.J;
        Handler handler2 = (Handler) xc5Var.o;
        if (handler2 != null) {
            handler2.post(new v6(xc5Var, tb1Var4, ej0Var, i));
        }
    }

    public final void M() {
        this.O = null;
        this.P = null;
        this.S = 0;
        this.T = false;
        this.f0 = -9223372036854775807L;
        this.g0 = -9223372036854775807L;
        zi0 zi0Var = this.N;
        if (zi0Var != null) {
            this.I.b++;
            ((FfmpegAudioDecoder) zi0Var).a();
            String strO = ((FfmpegAudioDecoder) this.N).o();
            xc5 xc5Var = this.F;
            Handler handler = (Handler) xc5Var.o;
            if (handler != null) {
                handler.post(new k6(5, xc5Var, strO));
            }
            this.N = null;
        }
        pw0.b(this.Q, null);
        this.Q = null;
    }

    public final void N(long j) {
        this.Z = j;
        if (j != -9223372036854775807L) {
            this.G.getClass();
        }
    }

    public final void O() {
        m();
        long jH = ((tj0) this.G).h();
        if (jH != Long.MIN_VALUE) {
            if (!this.W) {
                jH = Math.max(this.V, jH);
            }
            this.V = jH;
            this.W = false;
        }
    }

    @Override // defpackage.kq, defpackage.rk3
    public final void c(int i, Object obj) {
        sm smVar = this.G;
        if (i == 2) {
            float fFloatValue = ((Float) obj).floatValue();
            tj0 tj0Var = (tj0) smVar;
            if (tj0Var.H != fFloatValue) {
                tj0Var.H = fFloatValue;
                if (tj0Var.p()) {
                    tj0Var.t.a.setVolume(tj0Var.H);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 3) {
            il ilVar = (il) obj;
            tj0 tj0Var2 = (tj0) smVar;
            if (tj0Var2.u.equals(ilVar)) {
                return;
            }
            tj0Var2.u = ilVar;
            if (tj0Var2.V) {
                return;
            }
            tj0Var2.v();
            return;
        }
        if (i == 6) {
            ((tj0) smVar).z((xn) obj);
            return;
        }
        if (i == 12) {
            AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
            tj0 tj0Var3 = (tj0) smVar;
            tj0Var3.T = audioDeviceInfo;
            an anVar = tj0Var3.t;
            if (anVar != null) {
                anVar.a.setPreferredDevice(audioDeviceInfo);
                return;
            }
            return;
        }
        if (i == 9) {
            tj0 tj0Var4 = (tj0) smVar;
            tj0Var4.y = ((Boolean) obj).booleanValue();
            rj0 rj0Var = new rj0(tj0Var4.C() ? qh3.d : tj0Var4.x, -9223372036854775807L, -9223372036854775807L);
            if (tj0Var4.p()) {
                tj0Var4.v = rj0Var;
                return;
            } else {
                tj0Var4.w = rj0Var;
                return;
            }
        }
        if (i == 10) {
            ((tj0) smVar).y(((Integer) obj).intValue());
            return;
        }
        if (i == 19) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            tj0 tj0Var5 = (tj0) smVar;
            tj0Var5.getClass();
            if (iIntValue == 0 || iIntValue == -1) {
                iIntValue = -1;
            }
            if (tj0Var5.U == iIntValue) {
                return;
            }
            tj0Var5.U = iIntValue;
            tj0Var5.v();
            return;
        }
        if (i != 20) {
            return;
        }
        obj.getClass();
        dn dnVar = (dn) obj;
        tj0 tj0Var6 = (tj0) smVar;
        dn dnVar2 = tj0Var6.r;
        if (dnVar != dnVar2) {
            dnVar2.d();
            tj0Var6.r = dnVar;
            oj0 oj0Var = tj0Var6.s;
            if (oj0Var != null) {
                dnVar.f();
                if (dnVar.e == null) {
                    tc2 tc2Var = new tc2(Thread.currentThread());
                    dnVar.e = tc2Var;
                    tc2Var.i = false;
                }
                dnVar.e.a(oj0Var);
            }
            tj0Var6.v();
        }
    }

    @Override // defpackage.yj2
    public final void d(qh3 qh3Var) {
        ((tj0) this.G).B(qh3Var);
    }

    @Override // defpackage.kq
    public final long f(long j, long j2) {
        tj0 tj0Var = (tj0) this.G;
        boolean z = tj0Var.n() && this.h0 != -9223372036854775807L;
        if (this.e0) {
            long jG = tj0Var.g();
            if (this.d0 && z && jG != -9223372036854775807L) {
                return Math.max(10000L, (long) ((Math.min(jG, this.h0 - j) / (i() != null ? i().a : 1.0f)) / 2.0f));
            }
        } else if (z || this.Y) {
            return 1000000L;
        }
        return 10000L;
    }

    @Override // defpackage.kq
    public final yj2 g() {
        return this;
    }

    @Override // defpackage.kq
    public final String h() {
        return "FfmpegAudioRenderer";
    }

    @Override // defpackage.yj2
    public final qh3 i() {
        return ((tj0) this.G).x;
    }

    @Override // defpackage.yj2
    public final long j() {
        if (this.u == 2) {
            O();
        }
        return this.V;
    }

    @Override // defpackage.yj2
    public final boolean k() {
        boolean z = this.c0;
        this.c0 = false;
        return z;
    }

    @Override // defpackage.kq
    public final boolean m() {
        if (!this.Y) {
            return false;
        }
        tj0 tj0Var = (tj0) this.G;
        if (tj0Var.p()) {
            return tj0Var.L && !tj0Var.n();
        }
        return true;
    }

    @Override // defpackage.kq
    public final boolean o() {
        return ((tj0) this.G).n();
    }

    @Override // defpackage.kq
    public final void p() {
        xc5 xc5Var = this.F;
        this.J = null;
        this.U = true;
        N(-9223372036854775807L);
        this.c0 = false;
        this.d0 = false;
        this.h0 = -9223372036854775807L;
        try {
            pw0.b(this.R, null);
            this.R = null;
            M();
            ((tj0) this.G).w();
        } finally {
            xc5Var.o(this.I);
        }
    }

    @Override // defpackage.kq
    public final void q(boolean z, boolean z2) {
        bj0 bj0Var = new bj0();
        this.I = bj0Var;
        xc5 xc5Var = this.F;
        Handler handler = (Handler) xc5Var.o;
        if (handler != null) {
            handler.post(new km(xc5Var, bj0Var, 1));
        }
        dz3 dz3Var = this.q;
        dz3Var.getClass();
        boolean z3 = dz3Var.b;
        sm smVar = this.G;
        if (z3) {
            tj0 tj0Var = (tj0) smVar;
            rr2.w(tj0Var.P);
            if (!tj0Var.V) {
                tj0Var.V = true;
                tj0Var.v();
            }
        } else {
            tj0 tj0Var2 = (tj0) smVar;
            if (tj0Var2.V) {
                tj0Var2.V = false;
                tj0Var2.v();
            }
        }
        ik3 ik3Var = this.s;
        ik3Var.getClass();
        tj0 tj0Var3 = (tj0) smVar;
        tj0Var3.m = ik3Var;
        vp4 vp4Var = this.t;
        vp4Var.getClass();
        tj0Var3.r.f = vp4Var;
    }

    @Override // defpackage.kq
    public final void r(long j, boolean z, boolean z2) throws ExoPlaybackException {
        ((tj0) this.G).f();
        this.V = j;
        this.h0 = -9223372036854775807L;
        this.c0 = false;
        this.d0 = false;
        this.W = true;
        this.X = false;
        this.Y = false;
        if (this.N != null) {
            if (this.S != 0) {
                M();
                K();
                return;
            }
            this.O = null;
            SimpleDecoderOutputBuffer simpleDecoderOutputBuffer = this.P;
            if (simpleDecoderOutputBuffer != null) {
                simpleDecoderOutputBuffer.s();
                this.P = null;
            }
            zi0 zi0Var = this.N;
            zi0Var.getClass();
            ve4 ve4Var = (ve4) zi0Var;
            ve4Var.flush();
            ve4Var.b(this.y);
            this.T = false;
        }
    }

    @Override // defpackage.kq
    public final void v() {
        ((tj0) this.G).r();
        this.e0 = true;
    }

    @Override // defpackage.kq
    public final void w() {
        O();
        ((tj0) this.G).q();
        this.e0 = false;
        this.d0 = false;
    }

    @Override // defpackage.kq
    public final void x(tb1[] tb1VarArr, long j, long j2, mt2 mt2Var) {
        this.M = false;
        if (this.Z == -9223372036854775807L) {
            N(j2);
            return;
        }
        int i = this.b0;
        long[] jArr = this.a0;
        if (i == jArr.length) {
            l93.q0("DecoderAudioRenderer", "Too many stream changes, so dropping offset: " + jArr[this.b0 - 1]);
        } else {
            this.b0 = i + 1;
        }
        jArr[this.b0 - 1] = j2;
    }
}
