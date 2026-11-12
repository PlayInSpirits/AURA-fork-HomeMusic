package defpackage;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.LoudnessCodecController;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.audio.AudioSink$ConfigurationException;
import androidx.media3.exoplayer.audio.AudioSink$InitializationException;
import androidx.media3.exoplayer.audio.AudioSink$WriteException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bk2 extends gk2 implements yj2 {
    public final Context U0;
    public final xc5 V0;
    public final sm W0;
    public final ns3 X0;
    public int Y0;
    public boolean Z0;
    public tb1 a1;
    public tb1 b1;
    public long c1;
    public boolean d1;
    public boolean e1;
    public boolean f1;
    public boolean g1;
    public int h1;
    public boolean i1;
    public long j1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk2(Context context, zj2 zj2Var, Handler handler, qm qmVar, sm smVar) {
        super(context.getApplicationContext(), 1, zj2Var, 44100.0f);
        ns3 ns3Var = Build.VERSION.SDK_INT >= 35 ? new ns3(6) : null;
        this.U0 = context.getApplicationContext();
        this.W0 = smVar;
        this.X0 = ns3Var;
        this.h1 = -1000;
        this.V0 = new xc5(handler, qmVar);
        this.j1 = -9223372036854775807L;
        ((tj0) smVar).n = new si1(8, this);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005d  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a1  */
    @Override // defpackage.gk2
    public final int A0(kf2 kf2Var, tb1 tb1Var) {
        int iE0;
        gy3 gy3VarG;
        boolean z;
        boolean z2;
        int iA = kq.a(1, 0, 0, 0);
        String str = tb1Var.n;
        String str2 = tb1Var.n;
        if (!lw2.i(str)) {
            return kq.a(0, 0, 0, 0);
        }
        int i = tb1Var.O;
        boolean z3 = i != 0;
        boolean z4 = i == 0 || i == 2;
        int i2 = 8;
        sm smVar = this.W0;
        if (z4) {
            if (z3) {
                List listE = jk2.e(false, false, "audio/raw");
                if ((listE.isEmpty() ? null : (dk2) listE.get(0)) == null) {
                    iE0 = 0;
                }
            }
            iE0 = E0(tb1Var);
            if (((tj0) smVar).j(tb1Var) != 0) {
                return kq.a(4, 8, 32, iE0);
            }
        } else {
            iE0 = 0;
        }
        if (!"audio/raw".equals(str2) || ((tj0) smVar).j(tb1Var) != 0) {
            tj0 tj0Var = (tj0) smVar;
            if (tj0Var.j(f35.D(2, tb1Var.F, tb1Var.G)) != 0) {
                if (str2 == null) {
                    gy3VarG = gy3.r;
                } else if (tj0Var.j(tb1Var) != 0) {
                    List listE2 = jk2.e(false, false, "audio/raw");
                    dk2 dk2Var = listE2.isEmpty() ? null : (dk2) listE2.get(0);
                    if (dk2Var != null) {
                        gy3VarG = yw1.o(dk2Var);
                    } else {
                        gy3VarG = jk2.g(kf2Var, tb1Var, false, false);
                    }
                } else {
                    gy3VarG = jk2.g(kf2Var, tb1Var, false, false);
                }
                if (!gy3VarG.isEmpty()) {
                    if (!z4) {
                        return kq.a(2, 0, 0, 0);
                    }
                    dk2 dk2Var2 = (dk2) gy3VarG.get(0);
                    Context context = this.U0;
                    boolean zE = dk2Var2.e(context, tb1Var);
                    if (!zE) {
                        int i3 = 1;
                        while (true) {
                            if (i3 >= gy3VarG.q) {
                                z = zE;
                                z2 = true;
                                break;
                            }
                            dk2 dk2Var3 = (dk2) gy3VarG.get(i3);
                            if (dk2Var3.e(context, tb1Var)) {
                                z2 = false;
                                dk2Var2 = dk2Var3;
                                z = true;
                                break;
                            }
                            i3++;
                        }
                    } else {
                        z = zE;
                        z2 = true;
                        break;
                    }
                    int i4 = z ? 4 : 3;
                    if (z && dk2Var2.f(tb1Var)) {
                        i2 = 16;
                    }
                    return (dk2Var2.g ? 64 : 0) | i4 | i2 | 32 | (z2 ? 128 : 0) | iE0;
                }
            }
        }
        return iA;
    }

    public final int E0(tb1 tb1Var) {
        zl zlVarA;
        tj0 tj0Var = (tj0) this.W0;
        if (tj0Var.X) {
            zlVarA = zl.d;
        } else {
            cm cmVarB = tj0Var.r.b(tj0Var.i(tb1Var));
            yl ylVar = new yl();
            ylVar.a = cmVarB.a;
            ylVar.b = cmVarB.b;
            ylVar.c = cmVarB.c;
            zlVarA = ylVar.a();
        }
        if (!zlVarA.a) {
            return 0;
        }
        int i = zlVarA.b ? 1536 : 512;
        return zlVarA.c ? i | 2048 : i;
    }

    public final void F0() {
        m();
        long jH = ((tj0) this.W0).h();
        if (jH != Long.MIN_VALUE) {
            if (!this.d1) {
                jH = Math.max(this.c1, jH);
            }
            this.c1 = jH;
            this.d1 = false;
        }
    }

    @Override // defpackage.gk2
    public final ej0 J(dk2 dk2Var, tb1 tb1Var, tb1 tb1Var2) {
        ej0 ej0VarB = dk2Var.b(tb1Var, tb1Var2);
        int i = ej0VarB.e;
        if (this.U == null && z0(tb1Var2)) {
            i |= 32768;
        }
        "OMX.google.raw.decoder".equals(dk2Var.a);
        if (tb1Var2.o > this.Y0) {
            i |= 64;
        }
        int i2 = i;
        return new ej0(dk2Var.a, tb1Var, tb1Var2, i2 != 0 ? 0 : ej0VarB.d, i2);
    }

    @Override // defpackage.gk2
    public final float Q(float f, tb1 tb1Var, tb1[] tb1VarArr) {
        int iMax = -1;
        for (tb1 tb1Var2 : tb1VarArr) {
            int i = tb1Var2.G;
            if (i != -1) {
                iMax = Math.max(iMax, i);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002d  */
    @Override // defpackage.gk2
    public final ArrayList R(kf2 kf2Var, tb1 tb1Var, boolean z) {
        gy3 gy3VarG;
        if (tb1Var.n == null) {
            gy3VarG = gy3.r;
        } else if (((tj0) this.W0).j(tb1Var) != 0) {
            List listE = jk2.e(false, false, "audio/raw");
            dk2 dk2Var = listE.isEmpty() ? null : (dk2) listE.get(0);
            if (dk2Var != null) {
                gy3VarG = yw1.o(dk2Var);
            } else {
                gy3VarG = jk2.g(kf2Var, tb1Var, z, false);
            }
        } else {
            gy3VarG = jk2.g(kf2Var, tb1Var, z, false);
        }
        HashMap map = jk2.a;
        ArrayList arrayList = new ArrayList(gy3VarG);
        Collections.sort(arrayList, new w60(2, new ef0(10, this.U0, tb1Var)));
        return arrayList;
    }

    @Override // defpackage.gk2
    public final long S(long j, long j2) {
        tj0 tj0Var = (tj0) this.W0;
        boolean z = tj0Var.n() && this.j1 != -9223372036854775807L;
        if (this.i1) {
            long jG = tj0Var.g();
            if (this.g1 && z && jG != -9223372036854775807L) {
                return Math.max(10000L, (long) ((Math.min(jG, this.j1 - j) / (i() != null ? i().a : 1.0f)) / 2.0f));
            }
        } else if (z || this.F0) {
            return 1000000L;
        }
        return 10000L;
    }

    @Override // defpackage.gk2
    public final ml3 U(dk2 dk2Var, tb1 tb1Var, MediaCrypto mediaCrypto, float f) {
        tb1[] tb1VarArr = this.w;
        tb1VarArr.getClass();
        String str = dk2Var.a;
        "OMX.google.raw.decoder".equals(str);
        int iMax = tb1Var.o;
        String str2 = tb1Var.n;
        int i = tb1Var.F;
        if (tb1VarArr.length != 1) {
            for (tb1 tb1Var2 : tb1VarArr) {
                if (dk2Var.b(tb1Var, tb1Var2).d != 0) {
                    "OMX.google.raw.decoder".equals(str);
                    iMax = Math.max(iMax, tb1Var2.o);
                }
            }
        }
        this.Y0 = iMax;
        this.Z0 = str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
        String str3 = dk2Var.c;
        int i2 = this.Y0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str3);
        mediaFormat.setInteger("channel-count", i);
        int i3 = tb1Var.G;
        mediaFormat.setInteger("sample-rate", i3);
        e35.R(mediaFormat, tb1Var.q);
        e35.J(mediaFormat, "max-input-size", i2);
        mediaFormat.setInteger("priority", 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        if ("audio/ac4".equals(str2)) {
            Pair pairB = i40.b(tb1Var);
            if (pairB != null) {
                e35.J(mediaFormat, "profile", ((Integer) pairB.first).intValue());
                e35.J(mediaFormat, "level", ((Integer) pairB.second).intValue());
            }
            if (Build.VERSION.SDK_INT <= 28) {
                mediaFormat.setInteger("ac4-is-sync", 1);
            }
        }
        if (((tj0) this.W0).j(f35.D(4, i, i3)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i4 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.h1));
        }
        H(mediaFormat);
        this.b1 = (!"audio/raw".equals(dk2Var.b) || "audio/raw".equals(str2)) ? null : tb1Var;
        return new ml3(dk2Var, mediaFormat, tb1Var, (Object) null, mediaCrypto, this.X0);
    }

    @Override // defpackage.gk2
    public final void V(cj0 cj0Var) {
        tb1 tb1Var;
        qj0 qj0Var;
        int i = Build.VERSION.SDK_INT;
        if (i < 29 || (tb1Var = cj0Var.p) == null || !Objects.equals(tb1Var.n, "audio/opus") || !this.t0) {
            return;
        }
        ByteBuffer byteBuffer = cj0Var.u;
        byteBuffer.getClass();
        tb1 tb1Var2 = cj0Var.p;
        tb1Var2.getClass();
        int i2 = tb1Var2.I;
        if (byteBuffer.remaining() == 8) {
            int i3 = (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000);
            tj0 tj0Var = (tj0) this.W0;
            an anVar = tj0Var.t;
            if (anVar == null || !anVar.c() || (qj0Var = tj0Var.p) == null || !((em) qj0Var.e).k) {
                return;
            }
            an anVar2 = tj0Var.t;
            if (i < 29) {
                anVar2.getClass();
            } else {
                anVar2.a.setOffloadDelayPadding(i2, i3);
            }
        }
    }

    @Override // defpackage.gk2
    public final void b0(Exception exc) {
        l93.G("MediaCodecAudioRenderer", "Audio codec error", exc);
        xc5 xc5Var = this.V0;
        Handler handler = (Handler) xc5Var.o;
        if (handler != null) {
            handler.post(new jm(xc5Var, exc, 0));
        }
    }

    @Override // defpackage.gk2, defpackage.kq, defpackage.rk3
    public final void c(int i, Object obj) {
        ns3 ns3Var;
        sm smVar = this.W0;
        if (i == 2) {
            obj.getClass();
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
            ilVar.getClass();
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
            xn xnVar = (xn) obj;
            xnVar.getClass();
            ((tj0) smVar).z(xnVar);
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
        if (i == 16) {
            obj.getClass();
            this.h1 = ((Integer) obj).intValue();
            ak2 ak2Var = this.a0;
            if (ak2Var != null && Build.VERSION.SDK_INT >= 35) {
                Bundle bundle = new Bundle();
                bundle.putInt("importance", Math.max(0, -this.h1));
                ak2Var.c(bundle);
                return;
            }
            return;
        }
        if (i == 9) {
            obj.getClass();
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
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            ((tj0) smVar).y(iIntValue);
            if (Build.VERSION.SDK_INT < 35 || (ns3Var = this.X0) == null) {
                return;
            }
            ns3Var.f(iIntValue);
            return;
        }
        if (i == 19) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            tj0 tj0Var5 = (tj0) smVar;
            tj0Var5.getClass();
            if (iIntValue2 == 0 || iIntValue2 == -1) {
                iIntValue2 = -1;
            }
            if (tj0Var5.U == iIntValue2) {
                return;
            }
            tj0Var5.U = iIntValue2;
            tj0Var5.v();
            return;
        }
        if (i != 20) {
            super.c(i, obj);
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

    @Override // defpackage.gk2
    public final void c0(long j, long j2, String str) {
        xc5 xc5Var = this.V0;
        Handler handler = (Handler) xc5Var.o;
        if (handler != null) {
            handler.post(new om(xc5Var, str, j, j2, 0));
        }
    }

    @Override // defpackage.yj2
    public final void d(qh3 qh3Var) {
        ((tj0) this.W0).B(qh3Var);
    }

    @Override // defpackage.gk2
    public final void d0(h40 h40Var) {
        xc5 xc5Var = this.V0;
        Handler handler = (Handler) xc5Var.o;
        if (handler != null) {
            handler.post(new k6(6, xc5Var, h40Var));
        }
    }

    @Override // defpackage.gk2
    public final void e0(String str) {
        xc5 xc5Var = this.V0;
        Handler handler = (Handler) xc5Var.o;
        if (handler != null) {
            handler.post(new k6(5, xc5Var, str));
        }
    }

    @Override // defpackage.gk2
    public final ej0 f0(gp3 gp3Var) throws ExoPlaybackException {
        tb1 tb1Var = (tb1) gp3Var.p;
        tb1Var.getClass();
        this.a1 = tb1Var;
        ej0 ej0VarF0 = super.f0(gp3Var);
        xc5 xc5Var = this.V0;
        Handler handler = (Handler) xc5Var.o;
        if (handler != null) {
            handler.post(new v6(xc5Var, tb1Var, ej0VarF0, 1));
        }
        return ej0VarF0;
    }

    @Override // defpackage.kq
    public final yj2 g() {
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00ed A[Catch: AudioSink$ConfigurationException -> 0x00eb, TryCatch #0 {AudioSink$ConfigurationException -> 0x00eb, blocks: (B:36:0x00bf, B:39:0x00c7, B:41:0x00cb, B:43:0x00d4, B:47:0x00e5, B:50:0x00ed, B:54:0x00f7, B:55:0x00fc), top: B:59:0x00bf }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f6  */
    @Override // defpackage.gk2
    public final void g0(tb1 tb1Var, MediaFormat mediaFormat) throws ExoPlaybackException {
        int iC;
        tb1 tb1Var2 = this.b1;
        boolean z = true;
        int[] iArr = null;
        if (tb1Var2 != null) {
            tb1Var = tb1Var2;
        } else if (this.a0 != null) {
            mediaFormat.getClass();
            if ("audio/raw".equals(tb1Var.n)) {
                iC = tb1Var.H;
            } else if (mediaFormat.containsKey("pcm-encoding")) {
                iC = mediaFormat.getInteger("pcm-encoding");
            } else {
                iC = mediaFormat.containsKey("v-bits-per-sample") ? f35.C(mediaFormat.getInteger("v-bits-per-sample"), ByteOrder.LITTLE_ENDIAN) : 2;
            }
            sb1 sb1Var = new sb1();
            sb1Var.m = lw2.m("audio/raw");
            sb1Var.G = iC;
            sb1Var.H = tb1Var.I;
            sb1Var.I = tb1Var.J;
            sb1Var.k = tb1Var.l;
            sb1Var.a = tb1Var.a;
            sb1Var.b = tb1Var.b;
            sb1Var.c = yw1.k(tb1Var.c);
            sb1Var.d = tb1Var.d;
            sb1Var.e = tb1Var.e;
            sb1Var.f = tb1Var.f;
            sb1Var.E = mediaFormat.getInteger("channel-count");
            sb1Var.F = mediaFormat.getInteger("sample-rate");
            tb1Var = new tb1(sb1Var);
            if (this.Z0) {
                int i = tb1Var.F;
                if (i == 3) {
                    iArr = new int[]{0, 2, 1};
                } else if (i == 5) {
                    iArr = new int[]{0, 2, 1, 3, 4};
                } else if (i == 6) {
                    iArr = new int[]{0, 2, 1, 5, 3, 4};
                } else if (i == 7) {
                    iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                } else if (i == 8) {
                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                }
            }
        }
        try {
            int i2 = Build.VERSION.SDK_INT;
            sm smVar = this.W0;
            if (i2 >= 29) {
                if (this.t0) {
                    dz3 dz3Var = this.q;
                    dz3Var.getClass();
                    if (dz3Var.a != 0) {
                        dz3 dz3Var2 = this.q;
                        dz3Var2.getClass();
                        int i3 = dz3Var2.a;
                        tj0 tj0Var = (tj0) smVar;
                        tj0Var.getClass();
                        if (i2 < 29) {
                            z = false;
                        }
                        rr2.w(z);
                        tj0Var.i = i3;
                    } else {
                        tj0 tj0Var2 = (tj0) smVar;
                        tj0Var2.getClass();
                        if (i2 >= 29) {
                            z = false;
                        }
                        rr2.w(z);
                        tj0Var2.i = 0;
                    }
                } else {
                    tj0 tj0Var3 = (tj0) smVar;
                    tj0Var3.getClass();
                    if (i2 >= 29) {
                        z = false;
                    }
                    rr2.w(z);
                    tj0Var3.i = 0;
                }
            }
            ((tj0) smVar).c(tb1Var, iArr);
        } catch (AudioSink$ConfigurationException e) {
            throw b(e, e.n, false, 5001);
        }
    }

    @Override // defpackage.kq
    public final String h() {
        return "MediaCodecAudioRenderer";
    }

    @Override // defpackage.gk2
    public final void h0() {
        this.W0.getClass();
    }

    @Override // defpackage.yj2
    public final qh3 i() {
        return ((tj0) this.W0).x;
    }

    @Override // defpackage.yj2
    public final long j() {
        if (this.u == 2) {
            F0();
        }
        return this.c1;
    }

    @Override // defpackage.gk2
    public final void j0() {
        ((tj0) this.W0).E = true;
    }

    @Override // defpackage.yj2
    public final boolean k() {
        boolean z = this.f1;
        this.f1 = false;
        return z;
    }

    @Override // defpackage.kq
    public final boolean m() {
        if (!this.F0) {
            return false;
        }
        tj0 tj0Var = (tj0) this.W0;
        if (tj0Var.p()) {
            return tj0Var.L && !tj0Var.n();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0077  */
    @Override // defpackage.gk2
    public final boolean m0(long j, long j2, ak2 ak2Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, tb1 tb1Var) throws ExoPlaybackException {
        int i4;
        int i5;
        byteBuffer.getClass();
        this.j1 = -9223372036854775807L;
        if (this.b1 != null && (i2 & 2) != 0) {
            ak2Var.getClass();
            ak2Var.g(i);
            return true;
        }
        sm smVar = this.W0;
        if (z) {
            if (ak2Var != null) {
                ak2Var.g(i);
            }
            this.J0.f += i3;
            ((tj0) smVar).E = true;
            return true;
        }
        try {
            if (!((tj0) smVar).m(i3, j3, byteBuffer)) {
                this.j1 = j3;
                return false;
            }
            if (ak2Var != null) {
                ak2Var.g(i);
            }
            this.J0.e += i3;
            return true;
        } catch (AudioSink$InitializationException e) {
            tb1 tb1Var2 = this.a1;
            if (this.t0) {
                dz3 dz3Var = this.q;
                dz3Var.getClass();
                if (dz3Var.a != 0) {
                    i5 = 5004;
                } else {
                    i5 = 5001;
                }
            } else {
                i5 = 5001;
            }
            throw b(e, tb1Var2, e.n, i5);
        } catch (AudioSink$WriteException e2) {
            if (this.t0) {
                dz3 dz3Var2 = this.q;
                dz3Var2.getClass();
                if (dz3Var2.a != 0) {
                    i4 = 5003;
                } else {
                    i4 = 5002;
                }
            } else {
                i4 = 5002;
            }
            throw b(e2, tb1Var, e2.o, i4);
        }
    }

    @Override // defpackage.kq
    public final boolean o() {
        return ((tj0) this.W0).n();
    }

    @Override // defpackage.gk2, defpackage.kq
    public final void p() {
        xc5 xc5Var = this.V0;
        this.e1 = true;
        this.a1 = null;
        this.j1 = -9223372036854775807L;
        this.g1 = false;
        try {
            ((tj0) this.W0).f();
            try {
                super.p();
            } finally {
                xc5Var.o(this.J0);
            }
        } catch (Throwable th) {
            try {
                super.p();
                throw th;
            } finally {
                xc5Var.o(this.J0);
            }
        }
    }

    @Override // defpackage.gk2
    public final void p0() throws ExoPlaybackException {
        try {
            ((tj0) this.W0).t();
            long j = this.K0.e;
            if (j != -9223372036854775807L) {
                this.j1 = j;
            }
        } catch (AudioSink$WriteException e) {
            throw b(e, e.p, e.o, this.t0 ? 5003 : 5002);
        }
    }

    @Override // defpackage.kq
    public final void q(boolean z, boolean z2) {
        bj0 bj0Var = new bj0();
        this.J0 = bj0Var;
        xc5 xc5Var = this.V0;
        Handler handler = (Handler) xc5Var.o;
        if (handler != null) {
            handler.post(new km(xc5Var, bj0Var, 1));
        }
        dz3 dz3Var = this.q;
        dz3Var.getClass();
        boolean z3 = dz3Var.b;
        sm smVar = this.W0;
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

    @Override // defpackage.gk2, defpackage.kq
    public final void r(long j, boolean z, boolean z2) throws ExoPlaybackException {
        super.r(j, z, z2);
        ((tj0) this.W0).f();
        this.c1 = j;
        this.j1 = -9223372036854775807L;
        this.f1 = false;
        this.g1 = false;
        this.d1 = true;
    }

    @Override // defpackage.kq
    public final void s() {
        ns3 ns3Var;
        ((tj0) this.W0).r.d();
        if (Build.VERSION.SDK_INT < 35 || (ns3Var = this.X0) == null) {
            return;
        }
        ((HashSet) ns3Var.o).clear();
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) ns3Var.q;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    @Override // defpackage.kq
    public final void u() {
        sm smVar = this.W0;
        this.f1 = false;
        this.g1 = false;
        this.j1 = -9223372036854775807L;
        try {
            try {
                this.t0 = false;
                q0();
                o0();
                pw0.b(this.U, null);
                this.U = null;
                if (this.e1) {
                    this.e1 = false;
                    ((tj0) smVar).w();
                }
            } catch (Throwable th) {
                pw0.b(this.U, null);
                this.U = null;
                throw th;
            }
        } catch (Throwable th2) {
            if (this.e1) {
                this.e1 = false;
                ((tj0) smVar).w();
            }
            throw th2;
        }
    }

    @Override // defpackage.kq
    public final void v() {
        ((tj0) this.W0).r();
        this.i1 = true;
    }

    @Override // defpackage.kq
    public final void w() {
        F0();
        this.i1 = false;
        ((tj0) this.W0).q();
        this.g1 = false;
    }

    @Override // defpackage.gk2
    public final boolean z0(tb1 tb1Var) {
        dz3 dz3Var = this.q;
        dz3Var.getClass();
        if (dz3Var.a != 0) {
            int iE0 = E0(tb1Var);
            if ((iE0 & 512) != 0) {
                dz3 dz3Var2 = this.q;
                dz3Var2.getClass();
                if (dz3Var2.a == 2 || (iE0 & 1024) != 0 || (tb1Var.I == 0 && tb1Var.J == 0)) {
                    return true;
                }
            }
        }
        return ((tj0) this.W0).j(tb1Var) != 0;
    }
}
