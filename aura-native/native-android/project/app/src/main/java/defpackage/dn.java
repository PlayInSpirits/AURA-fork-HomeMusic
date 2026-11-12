package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import androidx.media3.exoplayer.audio.AudioOutputProvider$ConfigurationException;
import java.math.RoundingMode;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dn {
    public final Context a;
    public final fz0 b;
    public final wo0 c;
    public final zh0 d;
    public tc2 e;
    public vp4 f;
    public nl g;
    public ql h;
    public Looper i;
    public Context j;

    public dn(ss0 ss0Var) {
        Context context = (Context) ss0Var.n;
        this.a = context;
        wo0 wo0Var = (wo0) ss0Var.o;
        wo0Var.getClass();
        this.c = wo0Var;
        this.b = (fz0) ss0Var.p;
        this.g = (nl) ss0Var.q;
        this.d = context == null ? null : new zh0(8, this);
        this.f = vp4.a;
    }

    public final an a(em emVar) throws Exception {
        Context context;
        Context context2;
        try {
            int i = emVar.h;
            int i2 = emVar.i;
            if (i2 == -1 || (context2 = this.a) == null || Build.VERSION.SDK_INT < 34) {
                context = null;
            } else {
                Context context3 = this.j;
                if (context3 == null || context3.getDeviceId() != i2) {
                    this.j = context2.createDeviceContext(i2);
                }
                context = this.j;
                i = 0;
            }
            try {
                AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(emVar.d ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : emVar.g.c()).setAudioFormat(new AudioFormat.Builder().setSampleRate(emVar.b).setChannelMask(emVar.c).setEncoding(emVar.a).build()).setTransferMode(1).setBufferSizeInBytes(emVar.f).setSessionId(i);
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 29) {
                    sessionId.setOffloadedPlayback(emVar.e);
                }
                if (i3 >= 34 && context != null) {
                    sessionId.setContext(context);
                }
                AudioTrack audioTrackBuild = sessionId.build();
                if (audioTrackBuild.getState() == 1) {
                    return new an(audioTrackBuild, emVar, this.d, this.f);
                }
                try {
                    audioTrackBuild.release();
                } catch (Exception unused) {
                }
                throw new Exception() { // from class: androidx.media3.exoplayer.audio.AudioOutputProvider$InitializationException
                };
            } catch (IllegalArgumentException e) {
                e = e;
                throw new Exception(e) { // from class: androidx.media3.exoplayer.audio.AudioOutputProvider$InitializationException
                };
            }
        } catch (IllegalArgumentException | UnsupportedOperationException e2) {
            e = e2;
        }
    }

    public final cm b(am amVar) {
        e(amVar);
        tb1 tb1Var = amVar.a;
        il ilVar = amVar.b;
        zl zlVarV = this.c.v(tb1Var, ilVar);
        bm bmVar = new bm();
        String str = tb1Var.n;
        int i = tb1Var.H;
        int i2 = 0;
        if (!Objects.equals(str, "audio/raw") ? this.g.d(tb1Var, ilVar) != null : i == 2) {
            i2 = 2;
        }
        bmVar.a = i2;
        bmVar.b = zlVarV.a;
        bmVar.c = zlVarV.b;
        bmVar.d = zlVarV.c;
        return bmVar.a();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x008b  */
    /* JADX WARN: Code duplicated, block: B:23:0x008f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0096  */
    /* JADX WARN: Code duplicated, block: B:26:0x0098  */
    /* JADX WARN: Code duplicated, block: B:30:0x009f  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00db  */
    /* JADX WARN: Code duplicated, block: B:51:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:59:0x0100  */
    /* JADX WARN: Code duplicated, block: B:61:0x0111  */
    /* JADX WARN: Code duplicated, block: B:65:0x015e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0160  */
    public final em c(am amVar) {
        int iIntValue;
        char c;
        int iT;
        boolean z;
        boolean z2;
        int i;
        int iMax;
        int minBufferSize;
        boolean z3;
        double d;
        boolean z4;
        int iJ;
        int iW;
        boolean z5;
        int i2;
        int iW2;
        boolean z6;
        int iM;
        boolean z7;
        boolean z8;
        tb1 tb1Var = amVar.a;
        boolean z9 = amVar.d;
        il ilVar = amVar.b;
        e(amVar);
        String str = tb1Var.n;
        int i3 = tb1Var.G;
        int iIntValue2 = tb1Var.H;
        int i4 = tb1Var.F;
        if (!Objects.equals(str, "audio/raw")) {
            zl zlVarV = z9 ? this.c.v(tb1Var, ilVar) : zl.d;
            if (z9 && zlVarV.a) {
                str.getClass();
                int iC = lw2.c(str, tb1Var.k);
                int iS = f35.s(i4);
                boolean z10 = zlVarV.b;
                iIntValue2 = iC;
                iIntValue = iS;
                z = z10;
                iT = -1;
                c = 1;
                z2 = true;
            } else {
                Pair pairD = this.g.d(tb1Var, ilVar);
                if (pairD == null) {
                    throw new AudioOutputProvider$ConfigurationException("Unable to configure passthrough for: " + tb1Var);
                }
                iIntValue2 = ((Integer) pairD.first).intValue();
                iIntValue = ((Integer) pairD.second).intValue();
                c = 2;
                iT = -1;
                z = false;
            }
            i = tb1Var.j;
            if (Objects.equals(str, "audio/vnd.dts.hd;profile=lbr") && i == -1) {
                i = 768000;
            }
            iMax = amVar.h;
            if (iMax != -1) {
                z4 = true;
            } else {
                minBufferSize = AudioTrack.getMinBufferSize(i3, iIntValue, iIntValue2);
                if (minBufferSize != -2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                rr2.w(z3);
                if (iT == -1) {
                    iT = 1;
                }
                if (z2) {
                    d = 8.0d;
                } else {
                    d = 1.0d;
                }
                this.b.getClass();
                if (c != 0) {
                    z4 = true;
                    long j = i3;
                    long j2 = 250000 * j;
                    long j3 = iT;
                    iJ = f35.j(minBufferSize * 4, jz4.m((j2 * j3) / 1000000), jz4.m(((750000 * j) * j3) / 1000000));
                } else if (c != 1) {
                    z4 = true;
                    iW = wr1.w(iIntValue2);
                    if (iW != -2147483647) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    rr2.w(z5);
                    iJ = jz4.m((50000000 * ((long) iW)) / 1000000);
                } else {
                    if (c == 2) {
                        nz2.c();
                        return null;
                    }
                    if (iIntValue2 == 5) {
                        i2 = 500000;
                    } else if (iIntValue2 == 8) {
                        i2 = 1000000;
                    } else {
                        i2 = 250000;
                    }
                    if (i != -1) {
                        RoundingMode roundingMode = RoundingMode.CEILING;
                        iM = h12.m(i, 8);
                    } else {
                        iW2 = wr1.w(iIntValue2);
                        if (iW2 != -2147483647) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        rr2.w(z6);
                        iM = iW2;
                    }
                    z4 = true;
                    iJ = jz4.m((((long) i2) * ((long) iM)) / 1000000);
                }
                iMax = (((Math.max(minBufferSize, (int) (((double) iJ) * d)) + iT) - 1) / iT) * iT;
            }
            dm dmVar = new dm();
            il ilVar2 = il.i;
            dmVar.i = -1;
            dmVar.b = i3;
            dmVar.c = iIntValue;
            dmVar.a = iIntValue2;
            dmVar.f = iMax;
            dmVar.h = amVar.e;
            dmVar.g = ilVar;
            z7 = z4;
            if (c == z7) {
                z8 = z7;
            } else {
                z8 = false;
            }
            dmVar.e = z8;
            dmVar.d = amVar.g;
            dmVar.j = z2;
            dmVar.k = z;
            dmVar.i = amVar.f;
            return new em(dmVar);
        }
        rr2.l(f35.L(iIntValue2));
        iIntValue = f35.s(i4);
        iT = f35.t(iIntValue2) * i4;
        z = false;
        c = 0;
        z2 = false;
        i = tb1Var.j;
        if (Objects.equals(str, "audio/vnd.dts.hd;profile=lbr")) {
            i = 768000;
        }
        iMax = amVar.h;
        if (iMax != -1) {
            z4 = true;
        } else {
            minBufferSize = AudioTrack.getMinBufferSize(i3, iIntValue, iIntValue2);
            if (minBufferSize != -2) {
                z3 = true;
            } else {
                z3 = false;
            }
            rr2.w(z3);
            if (iT == -1) {
                iT = 1;
            }
            if (z2) {
                d = 8.0d;
            } else {
                d = 1.0d;
            }
            this.b.getClass();
            if (c != 0) {
                z4 = true;
                long j4 = i3;
                long j5 = 250000 * j4;
                long j6 = iT;
                iJ = f35.j(minBufferSize * 4, jz4.m((j5 * j6) / 1000000), jz4.m(((750000 * j4) * j6) / 1000000));
            } else if (c != 1) {
                z4 = true;
                iW = wr1.w(iIntValue2);
                if (iW != -2147483647) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                rr2.w(z5);
                iJ = jz4.m((50000000 * ((long) iW)) / 1000000);
            } else {
                if (c == 2) {
                    nz2.c();
                    return null;
                }
                if (iIntValue2 == 5) {
                    i2 = 500000;
                } else if (iIntValue2 == 8) {
                    i2 = 1000000;
                } else {
                    i2 = 250000;
                }
                if (i != -1) {
                    RoundingMode roundingMode2 = RoundingMode.CEILING;
                    iM = h12.m(i, 8);
                } else {
                    iW2 = wr1.w(iIntValue2);
                    if (iW2 != -2147483647) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    rr2.w(z6);
                    iM = iW2;
                }
                z4 = true;
                iJ = jz4.m((((long) i2) * ((long) iM)) / 1000000);
            }
            iMax = (((Math.max(minBufferSize, (int) (((double) iJ) * d)) + iT) - 1) / iT) * iT;
        }
        dm dmVar2 = new dm();
        il ilVar3 = il.i;
        dmVar2.i = -1;
        dmVar2.b = i3;
        dmVar2.c = iIntValue;
        dmVar2.a = iIntValue2;
        dmVar2.f = iMax;
        dmVar2.h = amVar.e;
        dmVar2.g = ilVar;
        z7 = z4;
        if (c == z7) {
            z8 = z7;
        } else {
            z8 = false;
        }
        dmVar2.e = z8;
        dmVar2.d = amVar.g;
        dmVar2.j = z2;
        dmVar2.k = z;
        dmVar2.i = amVar.f;
        return new em(dmVar2);
    }

    public final void d() {
        tc2 tc2Var = this.e;
        if (tc2Var != null) {
            tc2Var.d();
        }
        ql qlVar = this.h;
        if (qlVar != null) {
            Context context = qlVar.a;
            if (qlVar.j) {
                qlVar.g = null;
                xl.n(context).unregisterAudioDeviceCallback(qlVar.d);
                context.unregisterReceiver(qlVar.e);
                pl plVar = qlVar.f;
                if (plVar != null) {
                    plVar.a.unregisterContentObserver(plVar);
                }
                qlVar.j = false;
            }
        }
    }

    public final void e(am amVar) {
        Context context;
        nl nlVarC;
        AudioDeviceInfo audioDeviceInfo = amVar.c;
        il ilVar = amVar.b;
        f();
        ql qlVar = this.h;
        if (qlVar == null && (context = this.a) != null) {
            ql qlVar2 = new ql(context, new cn(0, this), ilVar, audioDeviceInfo);
            this.h = qlVar2;
            if (qlVar2.j) {
                nlVarC = qlVar2.g;
                nlVarC.getClass();
            } else {
                qlVar2.j = true;
                pl plVar = qlVar2.f;
                if (plVar != null) {
                    plVar.a.registerContentObserver(plVar.b, false, plVar);
                }
                Context context2 = qlVar2.a;
                AudioManager audioManagerN = xl.n(context2);
                ol olVar = qlVar2.d;
                Handler handler = qlVar2.c;
                audioManagerN.registerAudioDeviceCallback(olVar, handler);
                nlVarC = nl.c(context2, context2.registerReceiver(qlVar2.e, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), qlVar2.i, qlVar2.h);
                qlVar2.g = nlVarC;
            }
            this.g = nlVarC;
        } else if (qlVar != null) {
            if (audioDeviceInfo != null && !audioDeviceInfo.equals(qlVar.h)) {
                qlVar.h = audioDeviceInfo;
                qlVar.a(nl.b(qlVar.a, qlVar.i, audioDeviceInfo));
            }
            ql qlVar3 = this.h;
            if (!Objects.equals(ilVar, qlVar3.i)) {
                qlVar3.i = ilVar;
                qlVar3.a(nl.b(qlVar3.a, ilVar, qlVar3.h));
            }
        }
        this.g.getClass();
    }

    public final void f() {
        if (this.a == null) {
            return;
        }
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.i;
        boolean z = looper == null || looper == looperMyLooper;
        String name = looper == null ? "null" : looper.getThread().getName();
        String name2 = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null";
        if (z) {
            this.i = looperMyLooper;
        } else {
            kf2.o(gh0.s("AudioTrackAudioOutputProvider accessed on multiple threads: %s and %s", name, name2));
        }
    }
}
