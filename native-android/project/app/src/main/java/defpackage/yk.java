package defpackage;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yk implements ak2 {
    public final /* synthetic */ int n;
    public int o;
    public boolean p;
    public Object q;
    public Object r;
    public Object s;
    public Object t;

    public yk() {
        this.n = 2;
        this.q = new Object();
        this.r = new oi(0);
    }

    public static void b(yk ykVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        ns3 ns3Var;
        LoudnessCodecController loudnessCodecController;
        cl clVar = (cl) ykVar.r;
        MediaCodec mediaCodec = (MediaCodec) ykVar.q;
        HandlerThread handlerThread = clVar.b;
        rr2.w(clVar.c == null);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(clVar, handler);
        clVar.c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i);
        Trace.endSection();
        ((ck2) ykVar.s).start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (ns3Var = (ns3) ykVar.t) != null && ((loudnessCodecController = (LoudnessCodecController) ns3Var.q) == null || loudnessCodecController.addMediaCodec(mediaCodec))) {
            rr2.w(((HashSet) ns3Var.o).add(mediaCodec));
        }
        ykVar.o = 1;
    }

    public static String o(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // defpackage.ak2
    public void a() {
        ns3 ns3Var;
        ns3 ns3Var2;
        ArrayList arrayList;
        switch (this.n) {
            case 0:
                try {
                    if (this.o == 1) {
                        ((ck2) this.s).shutdown();
                        cl clVar = (cl) this.r;
                        synchronized (clVar.a) {
                            clVar.m = true;
                            clVar.b.quit();
                            clVar.a();
                        }
                    }
                    this.o = 2;
                    if (this.p) {
                        return;
                    }
                    try {
                        int i = Build.VERSION.SDK_INT;
                        if (i >= 30 && i < 33) {
                            ((MediaCodec) this.q).stop();
                            break;
                        }
                        return;
                    } finally {
                        if (Build.VERSION.SDK_INT >= 35 && (ns3Var2 = (ns3) this.t) != null) {
                            ns3Var2.e((MediaCodec) this.q);
                        }
                        ((MediaCodec) this.q).release();
                        this.p = true;
                    }
                } catch (Throwable th) {
                    if (!this.p) {
                        try {
                            int i2 = Build.VERSION.SDK_INT;
                            if (i2 >= 30 && i2 < 33) {
                                ((MediaCodec) this.q).stop();
                            }
                        } finally {
                            if (Build.VERSION.SDK_INT >= 35 && (ns3Var = (ns3) this.t) != null) {
                                ns3Var.e((MediaCodec) this.q);
                            }
                            ((MediaCodec) this.q).release();
                            this.p = true;
                        }
                        break;
                    }
                    throw th;
                }
                break;
            default:
                synchronized (this.q) {
                    try {
                        this.p = true;
                        arrayList = new ArrayList(((oi) this.r).values());
                        ((oi) this.r).clear();
                        if (((sl2) this.s) != null) {
                            Handler handler = (Handler) this.t;
                            handler.getClass();
                            handler.post((sl2) this.s);
                            this.s = null;
                            this.t = null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    ((ea4) obj).q();
                }
                return;
        }
    }

    @Override // defpackage.ak2
    public void c(Bundle bundle) {
        ((ck2) this.s).c(bundle);
    }

    public boolean d(int i, int i2) {
        bx2 bx2Var = (bx2) ((q03) this.r).f(this.o + i);
        bx2 bx2Var2 = (bx2) ((q03) this.s).f(this.o + i2);
        return h12.c(bx2Var, bx2Var2) || bx2Var.getClass() == bx2Var2.getClass();
    }

    @Override // defpackage.ak2
    public void e(int i, fg0 fg0Var, long j, int i2) {
        ((ck2) this.s).e(i, fg0Var, j, i2);
    }

    @Override // defpackage.ak2
    public void f(int i, int i2, int i3, long j) {
        ((ck2) this.s).f(i, i2, i3, j);
    }

    @Override // defpackage.ak2
    public void flush() {
        ((ck2) this.s).flush();
        ((MediaCodec) this.q).flush();
        cl clVar = (cl) this.r;
        synchronized (clVar.a) {
            clVar.l++;
            Handler handler = clVar.c;
            String str = f35.a;
            handler.post(new a0(7, clVar));
        }
        ((MediaCodec) this.q).start();
    }

    @Override // defpackage.ak2
    public void g(int i) {
        ((MediaCodec) this.q).releaseOutputBuffer(i, false);
    }

    @Override // defpackage.ak2
    public MediaFormat h() {
        MediaFormat mediaFormat;
        cl clVar = (cl) this.r;
        synchronized (clVar.a) {
            try {
                mediaFormat = clVar.h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    @Override // defpackage.ak2
    public void i() {
        ((MediaCodec) this.q).detachOutputSurface();
    }

    public ea4 j(Object obj) {
        ea4 ea4Var;
        synchronized (this.q) {
            try {
                int iS = s();
                ea4Var = new ea4(iS, obj);
                if (this.p) {
                    ea4Var.q();
                } else {
                    ((oi) this.r).put(Integer.valueOf(iS), ea4Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ea4Var;
    }

    @Override // defpackage.ak2
    public void k(ws1 ws1Var) {
        cl clVar = (cl) this.r;
        k6 k6Var = new k6(3, this, ws1Var);
        synchronized (clVar.a) {
            clVar.b();
            k6Var.run();
        }
    }

    @Override // defpackage.ak2
    public void l(int i, long j) {
        ((MediaCodec) this.q).releaseOutputBuffer(i, j);
    }

    @Override // defpackage.ak2
    public int m() {
        ((ck2) this.s).j();
        cl clVar = (cl) this.r;
        synchronized (clVar.a) {
            try {
                clVar.b();
                int i = -1;
                if (clVar.l > 0 || clVar.m) {
                    return -1;
                }
                b30 b30Var = clVar.d;
                int i2 = b30Var.a;
                int i3 = b30Var.b;
                if (!(i2 == i3)) {
                    if (i2 == i3) {
                        throw new ArrayIndexOutOfBoundsException();
                    }
                    i = b30Var.c[i2];
                    b30Var.a = (i2 + 1) & b30Var.d;
                }
                return i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ak2
    public int n(MediaCodec.BufferInfo bufferInfo) {
        ((ck2) this.s).j();
        cl clVar = (cl) this.r;
        synchronized (clVar.a) {
            try {
                clVar.b();
                if (clVar.l > 0 || clVar.m) {
                    return -1;
                }
                b30 b30Var = clVar.e;
                int i = b30Var.a;
                int i2 = b30Var.b;
                if (i == i2) {
                    return -1;
                }
                if (i == i2) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                int i3 = b30Var.c[i];
                b30Var.a = b30Var.d & (i + 1);
                if (i3 >= 0) {
                    clVar.h.getClass();
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) clVar.f.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (i3 == -2) {
                    clVar.h = (MediaFormat) clVar.g.remove();
                }
                return i3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ak2
    public void p(int i) {
        ((MediaCodec) this.q).setVideoScalingMode(i);
    }

    @Override // defpackage.ak2
    public ByteBuffer q(int i) {
        return ((MediaCodec) this.q).getInputBuffer(i);
    }

    @Override // defpackage.ak2
    public void r(Surface surface) {
        ((MediaCodec) this.q).setOutputSurface(surface);
    }

    public int s() {
        int i;
        synchronized (this.q) {
            i = this.o;
            this.o = i + 1;
        }
        return i;
    }

    @Override // defpackage.ak2
    public ByteBuffer t(int i) {
        return ((MediaCodec) this.q).getOutputBuffer(i);
    }

    @Override // defpackage.ak2
    public void u(ArrayList arrayList) {
        ((MediaCodec) this.q).subscribeToVendorParameters(arrayList);
    }

    @Override // defpackage.ak2
    public void v(nk2 nk2Var, Handler handler) {
        ((MediaCodec) this.q).setOnFrameRenderedListener(new wk(this, nk2Var, 0), handler);
    }

    @Override // defpackage.ak2
    public boolean w(om1 om1Var) {
        cl clVar = (cl) this.r;
        synchronized (clVar.a) {
            clVar.o = om1Var;
        }
        return true;
    }

    @Override // defpackage.ak2
    public void x(ArrayList arrayList) {
        ((MediaCodec) this.q).unsubscribeFromVendorParameters(arrayList);
    }

    public void y(int i, Object obj) {
        synchronized (this.q) {
            try {
                ea4 ea4Var = (ea4) ((oi) this.r).remove(Integer.valueOf(i));
                if (ea4Var != null) {
                    if (ea4Var.v.getClass() == obj.getClass()) {
                        ea4Var.l(obj);
                    } else {
                        l93.q0("SequencedFutureManager", "Type mismatch, expected " + ea4Var.v.getClass() + ", but was " + obj.getClass());
                    }
                }
                if (((sl2) this.s) != null && ((oi) this.r).isEmpty()) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public yk(MediaCodec mediaCodec, HandlerThread handlerThread, ck2 ck2Var, ns3 ns3Var) {
        this.n = 0;
        this.q = mediaCodec;
        this.r = new cl(handlerThread);
        this.s = ck2Var;
        this.t = ns3Var;
        this.o = 0;
    }

    public yk(w12 w12Var, cx2 cx2Var, int i, q03 q03Var, q03 q03Var2, boolean z) {
        this.n = 1;
        this.t = w12Var;
        this.q = cx2Var;
        this.o = i;
        this.r = q03Var;
        this.s = q03Var2;
        this.p = z;
    }
}
