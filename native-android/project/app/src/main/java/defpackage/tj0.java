package defpackage;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import androidx.media3.exoplayer.audio.AudioOutput$WriteException;
import androidx.media3.exoplayer.audio.AudioOutputProvider$ConfigurationException;
import androidx.media3.exoplayer.audio.AudioOutputProvider$InitializationException;
import androidx.media3.exoplayer.audio.AudioSink$ConfigurationException;
import androidx.media3.exoplayer.audio.AudioSink$InitializationException;
import androidx.media3.exoplayer.audio.AudioSink$WriteException;
import com.eddyizm.tempus.homemusic.WaveRetry;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tj0 implements sm {
    public static final AtomicInteger c0 = new AtomicInteger();
    public long A;
    public long B;
    public long C;
    public int D;
    public boolean E;
    public boolean F;
    public long G;
    public float H;
    public ByteBuffer I;
    public int J;
    public ByteBuffer K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public int Q;
    public boolean R;
    public xn S;
    public AudioDeviceInfo T;
    public int U;
    public boolean V;
    public long W;
    public boolean X;
    public boolean Y;
    public long Z;
    public final Context a;
    public long a0;
    public final qp4 b;
    public Handler b0;
    public final g10 c;
    public final ky4 d;
    public final pu4 e;
    public final ou4 f;
    public final gy3 g;
    public final ArrayDeque h;
    public int i;
    public pj0 j;
    public final sj0 k;
    public final sj0 l;
    public ik3 m;
    public rm n;
    public qj0 o;
    public qj0 p;
    public fm q;
    public dn r;
    public oj0 s;
    public an t;
    public il u;
    public rj0 v;
    public rj0 w;
    public qh3 x;
    public boolean y;
    public long z;

    public tj0(au auVar) {
        int deviceId;
        Context context = (Context) auVar.b;
        this.a = context == null ? null : context.getApplicationContext();
        this.u = il.i;
        this.b = (qp4) auVar.d;
        this.i = 0;
        this.r = (dn) auVar.f;
        g10 g10Var = new g10();
        this.c = g10Var;
        ky4 ky4Var = new ky4();
        ky4Var.m = f35.b;
        this.d = ky4Var;
        this.e = new pu4();
        this.f = new ou4();
        this.g = yw1.p(ky4Var, g10Var);
        this.H = 1.0f;
        this.Q = 0;
        this.S = new xn();
        qh3 qh3Var = qh3.d;
        this.w = new rj0(qh3Var, 0L, 0L);
        this.x = qh3Var;
        this.y = false;
        this.h = new ArrayDeque();
        this.k = new sj0();
        this.l = new sj0();
        int i = -1;
        if (Build.VERSION.SDK_INT >= 34 && context != null && (deviceId = context.getDeviceId()) != 0 && deviceId != -1) {
            i = deviceId;
        }
        this.U = i;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00c0  */
    public static int k(int i, ByteBuffer byteBuffer) {
        int i2;
        int i3;
        byte b;
        int i4;
        byte b2;
        int i5;
        int i6;
        int i7;
        int i8;
        if (i == 20) {
            if ((byteBuffer.get(5) & 2) == 0) {
                i2 = 0;
            } else {
                byte b3 = byteBuffer.get(26);
                int i9 = 28;
                int i10 = 28;
                for (int i11 = 0; i11 < b3; i11++) {
                    i10 += byteBuffer.get(i11 + 27);
                }
                byte b4 = byteBuffer.get(i10 + 26);
                for (int i12 = 0; i12 < b4; i12++) {
                    i9 += byteBuffer.get(i10 + 27 + i12);
                }
                i2 = i10 + i9;
            }
            int i13 = byteBuffer.get(i2 + 26) + 27 + i2;
            return (int) ((su3.t(byteBuffer.get(i13), byteBuffer.limit() - i13 > 1 ? byteBuffer.get(i13 + 1) : (byte) 0) * 48000) / 1000000);
        }
        if (i != 30) {
            switch (i) {
                case 5:
                case 6:
                    break;
                case 7:
                case 8:
                    break;
                case 9:
                    int iPosition = byteBuffer.position();
                    String str = f35.a;
                    int iReverseBytes = byteBuffer.getInt(iPosition);
                    if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                        iReverseBytes = Integer.reverseBytes(iReverseBytes);
                    }
                    if ((iReverseBytes & (-2097152)) != -2097152 || (i6 = (iReverseBytes >>> 19) & 3) == 1 || (i7 = (iReverseBytes >>> 17) & 3) == 0) {
                        i5 = -1;
                    } else {
                        int i14 = (iReverseBytes >>> 12) & 15;
                        int i15 = (iReverseBytes >>> 10) & 3;
                        if (i14 == 0 || i14 == 15 || i15 == 3) {
                            i5 = -1;
                        } else {
                            i5 = 1152;
                            if (i7 != 1) {
                                if (i7 != 2) {
                                    if (i7 != 3) {
                                        nz2.c();
                                        return 0;
                                    }
                                    i5 = 384;
                                }
                            } else if (i6 != 3) {
                                i5 = 576;
                            }
                        }
                    }
                    if (i5 != -1) {
                        return i5;
                    }
                    nz2.c();
                    return 0;
                case 10:
                    return 1024;
                case 11:
                case 12:
                    return 2048;
                default:
                    switch (i) {
                        case 14:
                            int iPosition2 = byteBuffer.position();
                            int iLimit = byteBuffer.limit() - 10;
                            int i16 = iPosition2;
                            while (true) {
                                if (i16 <= iLimit) {
                                    String str2 = f35.a;
                                    int iReverseBytes2 = byteBuffer.getInt(i16 + 4);
                                    if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                        iReverseBytes2 = Integer.reverseBytes(iReverseBytes2);
                                    }
                                    if ((iReverseBytes2 & (-2)) == -126718022) {
                                        i8 = i16 - iPosition2;
                                    } else {
                                        i16++;
                                    }
                                } else {
                                    i8 = -1;
                                }
                            }
                            if (i8 == -1) {
                                return 0;
                            }
                            return (40 << ((byteBuffer.get((byteBuffer.position() + i8) + (((byteBuffer.get((byteBuffer.position() + i8) + 7) & 255) == 187 ? (byte) 1 : (byte) 0) != 0 ? 9 : 8)) >> 4) & 7)) * 16;
                        case 15:
                            return 512;
                        case WaveRetry.MAX_FAILURES /* 16 */:
                            return 1024;
                        case 17:
                            byte[] bArr = new byte[16];
                            int iPosition3 = byteBuffer.position();
                            byteBuffer.get(bArr);
                            byteBuffer.position(iPosition3);
                            return hw.D(new h00(16, bArr)).c;
                        case 18:
                            break;
                        default:
                            kf2.o(f34.f(i, "Unexpected audio encoding: "));
                            return 0;
                    }
                    break;
            }
            if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
                return fu.n[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
            }
            return 1536;
        }
        if (byteBuffer.getInt(0) == -233094848 || byteBuffer.getInt(0) == -398277519) {
            return 1024;
        }
        if (byteBuffer.getInt(0) == 622876772) {
            return 4096;
        }
        int iPosition4 = byteBuffer.position();
        byte b5 = byteBuffer.get(iPosition4);
        if (b5 != -2) {
            if (b5 == -1) {
                i3 = (byteBuffer.get(iPosition4 + 4) & 7) << 4;
                b2 = byteBuffer.get(iPosition4 + 7);
            } else if (b5 != 31) {
                i3 = (byteBuffer.get(iPosition4 + 4) & 1) << 6;
                b = byteBuffer.get(iPosition4 + 5);
            } else {
                i3 = (byteBuffer.get(iPosition4 + 5) & 7) << 4;
                b2 = byteBuffer.get(iPosition4 + 6);
            }
            i4 = b2 & 60;
            return (((i4 >> 2) | i3) + 1) * 32;
        }
        i3 = (byteBuffer.get(iPosition4 + 5) & 1) << 6;
        b = byteBuffer.get(iPosition4 + 4);
        i4 = b & 252;
        return (((i4 >> 2) | i3) + 1) * 32;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0149  */
    /* JADX WARN: Code duplicated, block: B:49:0x014c  */
    /* JADX WARN: Code duplicated, block: B:51:0x014f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0151  */
    /* JADX WARN: Code duplicated, block: B:54:0x0155  */
    /* JADX WARN: Code duplicated, block: B:56:0x0159  */
    /* JADX WARN: Code duplicated, block: B:58:0x015d  */
    /* JADX WARN: Code duplicated, block: B:60:0x0161  */
    /* JADX WARN: Code duplicated, block: B:63:0x017d  */
    /* JADX WARN: Code duplicated, block: B:64:0x0190  */
    /* JADX WARN: Code duplicated, block: B:65:0x019d  */
    /* JADX WARN: Code duplicated, block: B:66:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:67:0x01c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:69:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:70:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:71:0x01df  */
    /* JADX WARN: Code duplicated, block: B:81:0x0179 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x01f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0061 A[SYNTHETIC] */
    public final void A(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferOrder;
        int i;
        byte b;
        int i2;
        int i3;
        int i4;
        rr2.w(this.K == null);
        if (byteBuffer.hasRemaining()) {
            if (qj0.a(this.p)) {
                int iA0 = (int) f35.a0(f35.Q(20L), ((em) this.p.e).b, 1000000L, RoundingMode.UP);
                long jL = l();
                long j = iA0;
                if (jL >= j) {
                    byteBufferOrder = byteBuffer;
                } else {
                    qj0 qj0Var = this.p;
                    int i5 = ((em) qj0Var.e).a;
                    int i6 = qj0Var.b;
                    int i7 = (int) jL;
                    byteBufferOrder = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
                    int iPosition = byteBuffer.position();
                    while (byteBuffer.hasRemaining() && i7 < iA0) {
                        if (i5 != 2) {
                            if (i5 == 3) {
                                i3 = (byteBuffer.get() & 255) << 24;
                            } else if (i5 == 4) {
                                float fI = f35.i(byteBuffer.getFloat(), -1.0f, 1.0f);
                                i3 = (int) (fI < 0.0f ? (-fI) * (-2.14748365E9f) : fI * 2.14748365E9f);
                            } else if (i5 != 21) {
                                if (i5 == 22) {
                                    i = (byteBuffer.get() & 255) | ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
                                    b = byteBuffer.get();
                                } else if (i5 == 268435456) {
                                    i = (byteBuffer.get() & 255) << 24;
                                    i2 = (byteBuffer.get() & 255) << 16;
                                } else if (i5 == 1342177280) {
                                    i = ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16);
                                    i2 = (byteBuffer.get() & 255) << 8;
                                } else if (i5 != 1610612736) {
                                    tb4.a();
                                    return;
                                } else {
                                    i = ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) << 8);
                                    i2 = byteBuffer.get() & 255;
                                }
                                i3 = i | i2;
                            } else {
                                i = ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
                                b = byteBuffer.get();
                            }
                            i4 = (int) ((((long) i3) * ((long) i7)) / j);
                            if (i5 != 2) {
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 24));
                            } else if (i5 != 3) {
                                byteBufferOrder.put((byte) (i4 >> 24));
                            } else if (i5 != 4) {
                                if (i5 != 21) {
                                    byteBufferOrder.put((byte) (i4 >> 8));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                } else if (i5 != 22) {
                                    byteBufferOrder.put((byte) i4);
                                    byteBufferOrder.put((byte) (i4 >> 8));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                } else if (i5 != 268435456) {
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                } else if (i5 != 1342177280) {
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                    byteBufferOrder.put((byte) (i4 >> 8));
                                } else {
                                    if (i5 == 1610612736) {
                                        tb4.a();
                                        return;
                                    }
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                    byteBufferOrder.put((byte) (i4 >> 8));
                                    byteBufferOrder.put((byte) i4);
                                }
                            } else if (i4 < 0) {
                                byteBufferOrder.putFloat((-i4) / (-2.14748365E9f));
                            } else {
                                byteBufferOrder.putFloat(i4 / 2.14748365E9f);
                            }
                            if (byteBuffer.position() == iPosition + i6) {
                                i7++;
                                iPosition = byteBuffer.position();
                            }
                        } else {
                            i = (byteBuffer.get() & 255) << 16;
                            b = byteBuffer.get();
                        }
                        i2 = (b & 255) << 24;
                        i3 = i | i2;
                        i4 = (int) ((((long) i3) * ((long) i7)) / j);
                        if (i5 != 2) {
                            byteBufferOrder.put((byte) (i4 >> 16));
                            byteBufferOrder.put((byte) (i4 >> 24));
                        } else if (i5 != 3) {
                            byteBufferOrder.put((byte) (i4 >> 24));
                        } else if (i5 != 4) {
                            if (i5 != 21) {
                                byteBufferOrder.put((byte) (i4 >> 8));
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 24));
                            } else if (i5 != 22) {
                                byteBufferOrder.put((byte) i4);
                                byteBufferOrder.put((byte) (i4 >> 8));
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 24));
                            } else if (i5 != 268435456) {
                                byteBufferOrder.put((byte) (i4 >> 24));
                                byteBufferOrder.put((byte) (i4 >> 16));
                            } else if (i5 != 1342177280) {
                                byteBufferOrder.put((byte) (i4 >> 24));
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 8));
                            } else {
                                if (i5 == 1610612736) {
                                    tb4.a();
                                    return;
                                }
                                byteBufferOrder.put((byte) (i4 >> 24));
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 8));
                                byteBufferOrder.put((byte) i4);
                            }
                        } else if (i4 < 0) {
                            byteBufferOrder.putFloat((-i4) / (-2.14748365E9f));
                        } else {
                            byteBufferOrder.putFloat(i4 / 2.14748365E9f);
                        }
                        if (byteBuffer.position() == iPosition + i6) {
                            i7++;
                            iPosition = byteBuffer.position();
                        }
                    }
                    byteBufferOrder.put(byteBuffer);
                    byteBufferOrder.flip();
                }
            } else {
                byteBufferOrder = byteBuffer;
            }
            this.K = byteBufferOrder;
        }
    }

    public final void B(qh3 qh3Var) {
        this.x = new qh3(f35.i(qh3Var.a, 0.1f, 8.0f), f35.i(qh3Var.b, 0.1f, 8.0f));
        if (C()) {
            x();
            return;
        }
        rj0 rj0Var = new rj0(qh3Var, -9223372036854775807L, -9223372036854775807L);
        if (p()) {
            this.v = rj0Var;
        } else {
            this.w = rj0Var;
        }
    }

    public final boolean C() {
        qj0 qj0Var = this.p;
        return qj0Var != null && ((em) qj0Var.e).j;
    }

    public final void a(long j) {
        qh3 qh3Var;
        boolean zC = C();
        boolean z = false;
        qp4 qp4Var = this.b;
        if (zC) {
            qh3Var = qh3.d;
        } else {
            if (this.V || !qj0.a(this.p)) {
                qh3Var = qh3.d;
            } else {
                int i = ((tb1) this.p.c).H;
                qh3Var = this.x;
                bj4 bj4Var = (bj4) qp4Var.c;
                float f = qh3Var.a;
                bj4Var.getClass();
                rr2.l(f > 0.0f);
                if (bj4Var.c != f) {
                    bj4Var.c = f;
                    bj4Var.i = true;
                }
                float f2 = qh3Var.b;
                rr2.l(f2 > 0.0f);
                if (bj4Var.d != f2) {
                    bj4Var.d = f2;
                    bj4Var.i = true;
                }
            }
            this.x = qh3Var;
        }
        qh3 qh3Var2 = qh3Var;
        if (!this.V && qj0.a(this.p)) {
            int i2 = ((tb1) this.p.c).H;
            z = this.y;
            ((wd4) qp4Var.b).o = z;
        }
        this.y = z;
        this.h.add(new rj0(qh3Var2, Math.max(0L, j), f35.Y(((em) this.p.e).b, l())));
        fm fmVar = (fm) this.p.f;
        this.q = fmVar;
        fmVar.a();
        rm rmVar = this.n;
        if (rmVar != null) {
            rmVar.d(this.y);
        }
    }

    public final an b(em emVar) throws AudioSink$InitializationException {
        try {
            return this.r.a(emVar);
        } catch (AudioOutputProvider$InitializationException e) {
            AudioSink$InitializationException audioSink$InitializationException = new AudioSink$InitializationException(emVar.b, emVar.c, emVar.a, emVar.f, (tb1) this.p.c, emVar.e, e);
            rm rmVar = this.n;
            if (rmVar == null) {
                throw audioSink$InitializationException;
            }
            rmVar.g(audioSink$InitializationException);
            throw audioSink$InitializationException;
        }
    }

    public final void c(tb1 tb1Var, int[] iArr) throws AudioSink$ConfigurationException {
        fm fmVar;
        tb1 tb1Var2;
        int i;
        int iT;
        if (this.s == null && this.a != null) {
            oj0 oj0Var = new oj0(this);
            this.s = oj0Var;
            dn dnVar = this.r;
            dnVar.f();
            if (dnVar.e == null) {
                tc2 tc2Var = new tc2(Thread.currentThread());
                dnVar.e = tc2Var;
                tc2Var.i = false;
            }
            dnVar.e.a(oj0Var);
        }
        String str = tb1Var.n;
        int i2 = tb1Var.F;
        int i3 = tb1Var.H;
        if ("audio/raw".equals(str)) {
            rr2.l(f35.L(i3));
            int iT2 = f35.t(i3) * i2;
            uw1 uw1Var = new uw1(4);
            uw1Var.d(this.g);
            uw1Var.c(this.e);
            im[] imVarArr = (im[]) this.b.a;
            int length = imVarArr.length;
            gh0.f(length, imVarArr);
            uw1Var.e(length);
            System.arraycopy(imVarArr, 0, uw1Var.a, uw1Var.b, length);
            uw1Var.b += length;
            fmVar = new fm(uw1Var.f());
            if (fmVar.equals(this.q)) {
                fmVar = this.q;
            }
            int i4 = tb1Var.I;
            int i5 = tb1Var.J;
            ky4 ky4Var = this.d;
            ky4Var.i = i4;
            ky4Var.j = i5;
            this.c.i = iArr;
            gm gmVar = new gm(tb1Var.G, i2, i3);
            try {
                yw1 yw1Var = fmVar.a;
                if (gmVar.equals(gm.e)) {
                    throw new AudioProcessor$UnhandledAudioFormatException(gmVar);
                }
                for (int i6 = 0; i6 < yw1Var.size(); i6++) {
                    im imVar = (im) yw1Var.get(i6);
                    gm gmVarF = imVar.f(gmVar);
                    if (imVar.b()) {
                        rr2.w(!gmVarF.equals(gm.e));
                        gmVar = gmVarF;
                    }
                }
                int i7 = gmVar.b;
                int i8 = gmVar.c;
                sb1 sb1VarA = tb1Var.a();
                sb1VarA.G = i8;
                sb1VarA.F = gmVar.a;
                sb1VarA.E = i7;
                tb1Var2 = new tb1(sb1VarA);
                i = iT2;
                iT = f35.t(i8) * i7;
            } catch (AudioProcessor$UnhandledAudioFormatException e) {
                throw new AudioSink$ConfigurationException(e, tb1Var);
            }
        } else {
            fmVar = new fm(gy3.r);
            tb1Var2 = tb1Var;
            i = -1;
            iT = -1;
        }
        fm fmVar2 = fmVar;
        am amVarI = i(tb1Var2);
        tb1 tb1Var3 = amVarI.a;
        try {
            em emVarC = this.r.c(amVarI);
            boolean z = emVarC.e;
            if (emVarC.a == 0) {
                throw new AudioSink$ConfigurationException("Invalid output encoding (isOffload=" + z + ")", tb1Var3);
            }
            if (emVarC.c == 0) {
                throw new AudioSink$ConfigurationException("Invalid output channel config (isOffload=" + z + ")", tb1Var3);
            }
            this.X = false;
            qj0 qj0Var = new qj0(tb1Var, tb1Var2, i, iT, emVarC, fmVar2);
            if (p()) {
                this.o = qj0Var;
            } else {
                this.p = qj0Var;
            }
        } catch (AudioOutputProvider$ConfigurationException e2) {
            throw new AudioSink$ConfigurationException(e2, tb1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00c9  */
    public final void d(long j) throws AudioSink$WriteException {
        rm rmVar;
        if (this.K == null) {
            return;
        }
        sj0 sj0Var = this.l;
        if (((Exception) sj0Var.c) != null && (c0.get() > 0 || SystemClock.elapsedRealtime() < sj0Var.b)) {
            return;
        }
        int iRemaining = this.K.remaining();
        boolean z = true;
        try {
            boolean zD = this.t.d(this.J, j, this.K);
            this.W = SystemClock.elapsedRealtime();
            sj0Var.c = null;
            sj0Var.a = -9223372036854775807L;
            sj0Var.b = -9223372036854775807L;
            if (this.t.c()) {
                if (this.C > 0) {
                    this.Y = false;
                }
                if (this.O && (rmVar = this.n) != null && !zD && !this.Y) {
                    rmVar.o();
                }
            }
            if (qj0.a(this.p)) {
                this.B += (long) (iRemaining - this.K.remaining());
            }
            if (zD) {
                if (!qj0.a(this.p)) {
                    rr2.w(this.K == this.I);
                    this.C = (((long) this.D) * ((long) this.J)) + this.C;
                }
                this.K = null;
            }
        } catch (AudioOutput$WriteException e) {
            boolean z2 = e.o;
            if (!z2) {
                z = false;
            } else if (l() <= 0) {
                if (!this.t.c()) {
                    z = false;
                } else if (((em) this.p.e).e) {
                    this.X = true;
                }
            }
            AudioSink$WriteException audioSink$WriteException = new AudioSink$WriteException(e.n, (tb1) this.p.c, z);
            rm rmVar2 = this.n;
            if (rmVar2 != null) {
                rmVar2.g(audioSink$WriteException);
            }
            if (z2) {
                throw audioSink$WriteException;
            }
            sj0Var.e(audioSink$WriteException);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0043 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0044 A[RETURN] */
    public final boolean e() throws AudioSink$WriteException {
        ByteBuffer byteBuffer;
        if (!this.q.d()) {
            d(Long.MIN_VALUE);
            if (this.K == null) {
                return true;
            }
            return false;
        }
        fm fmVar = this.q;
        if (fmVar.d() && !fmVar.d) {
            fmVar.d = true;
            ((im) fmVar.b.get(0)).g();
        }
        u(Long.MIN_VALUE);
        if (!this.q.c() || ((byteBuffer = this.K) != null && byteBuffer.hasRemaining())) {
            return false;
        }
        return true;
    }

    public final void f() {
        if (p()) {
            this.z = 0L;
            this.A = 0L;
            this.B = 0L;
            this.C = 0L;
            this.Y = false;
            this.D = 0;
            this.w = new rj0(this.x, 0L, 0L);
            this.G = 0L;
            this.v = null;
            this.h.clear();
            this.I = null;
            this.J = 0;
            this.K = null;
            this.M = false;
            this.L = false;
            this.N = false;
            this.d.o = 0L;
            fm fmVar = (fm) this.p.f;
            this.q = fmVar;
            fmVar.a();
            this.j = null;
            qj0 qj0Var = this.o;
            if (qj0Var != null) {
                this.p = qj0Var;
                this.o = null;
            }
            c0.incrementAndGet();
            an anVar = this.t;
            if (anVar.e.d.getPlayState() == 3) {
                anVar.a.pause();
            }
            if (Build.VERSION.SDK_INT >= 29 && anVar.c()) {
                jv3 jv3Var = anVar.h;
                jv3Var.getClass();
                ((an) jv3Var.p).a.unregisterStreamEventCallback((zm) jv3Var.o);
                ((Handler) jv3Var.n).removeCallbacksAndMessages(null);
            }
            bq4 bq4Var = anVar.d;
            if (bq4Var != null) {
                AudioTrack audioTrack = (AudioTrack) bq4Var.n;
                wm wmVar = (wm) bq4Var.q;
                wmVar.getClass();
                audioTrack.removeOnRoutingChangedListener(wmVar);
                bq4Var.q = null;
                anVar.d = null;
            }
            AudioTrack audioTrack2 = anVar.a;
            tc2 tc2Var = anVar.i;
            Handler handlerP = f35.p(null);
            synchronized (an.r) {
                try {
                    if (an.s == null) {
                        an.s = Executors.newSingleThreadScheduledExecutor(new ps3(1));
                    }
                    an.t++;
                    an.s.schedule(new v6(audioTrack2, handlerP, tc2Var, 2), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.t = null;
        }
        sj0 sj0Var = this.l;
        sj0Var.c = null;
        sj0Var.a = -9223372036854775807L;
        sj0Var.b = -9223372036854775807L;
        sj0 sj0Var2 = this.k;
        sj0Var2.c = null;
        sj0Var2.a = -9223372036854775807L;
        sj0Var2.b = -9223372036854775807L;
        this.Z = 0L;
        this.a0 = 0L;
        Handler handler = this.b0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public final long g() {
        if (!p()) {
            return -9223372036854775807L;
        }
        if (qj0.a(this.p)) {
            return f35.Y(((em) this.p.e).b, this.t.a.getBufferSizeInFrames());
        }
        long bufferSizeInFrames = this.t.a.getBufferSizeInFrames();
        int iW = wr1.w(((em) this.p.e).a);
        rr2.w(iW != -2147483647);
        return f35.a0(bufferSizeInFrames, 1000000L, iW, RoundingMode.DOWN);
    }

    public final long h() {
        ArrayDeque arrayDeque;
        long j;
        if (!p() || this.F) {
            return Long.MIN_VALUE;
        }
        long jMin = Math.min(this.t.a(), f35.Y(((em) this.p.e).b, l()));
        while (true) {
            arrayDeque = this.h;
            if (arrayDeque.isEmpty() || jMin < ((rj0) arrayDeque.getFirst()).c) {
                break;
            }
            this.w = (rj0) arrayDeque.remove();
        }
        rj0 rj0Var = this.w;
        long jA0 = jMin - rj0Var.c;
        long jA = f35.A(jA0, rj0Var.a.a);
        boolean zIsEmpty = arrayDeque.isEmpty();
        qp4 qp4Var = this.b;
        if (zIsEmpty) {
            bj4 bj4Var = (bj4) qp4Var.c;
            if (bj4Var.b()) {
                if (bj4Var.n >= 1024) {
                    long j2 = bj4Var.m;
                    aj4 aj4Var = bj4Var.j;
                    aj4Var.getClass();
                    long jO = j2 - ((long) (aj4Var.i.o() * (aj4Var.j * aj4Var.b)));
                    int i = bj4Var.h.a;
                    int i2 = bj4Var.g.a;
                    long j3 = bj4Var.n;
                    jA0 = i == i2 ? f35.a0(jA0, jO, j3, RoundingMode.DOWN) : f35.a0(jA0, jO * ((long) i), j3 * ((long) i2), RoundingMode.DOWN);
                } else {
                    jA0 = (long) (((double) bj4Var.c) * jA0);
                }
            }
            rj0 rj0Var2 = this.w;
            j = rj0Var2.b + jA0;
            rj0Var2.d = jA0 - jA;
        } else {
            rj0 rj0Var3 = this.w;
            j = rj0Var3.b + jA + rj0Var3.d;
        }
        long j4 = ((wd4) qp4Var.b).q;
        long jY = f35.Y(((em) this.p.e).b, j4) + j;
        long j5 = this.Z;
        if (j4 > j5) {
            long jY2 = f35.Y(((em) this.p.e).b, j4 - j5);
            this.Z = j4;
            this.a0 += jY2;
            if (this.b0 == null) {
                this.b0 = new Handler(Looper.myLooper());
            }
            this.b0.removeCallbacksAndMessages(null);
            this.b0.postDelayed(new a0(17, this), 100L);
        }
        return jY;
    }

    public final am i(tb1 tb1Var) {
        am amVar = new am(tb1Var);
        amVar.b = this.u;
        amVar.d = this.i != 0;
        amVar.c = this.T;
        amVar.e = this.Q;
        amVar.g = this.V;
        amVar.h = -1;
        amVar.f = this.U;
        return new am(amVar);
    }

    public final int j(tb1 tb1Var) {
        boolean z;
        if (!f35.L(tb1Var.H) || tb1Var.H == 2) {
            z = false;
        } else {
            sb1 sb1VarA = tb1Var.a();
            sb1VarA.G = 2;
            tb1Var = new tb1(sb1VarA);
            z = true;
        }
        int i = this.r.b(i(tb1Var)).d;
        if (i != 1) {
            if (i != 2) {
                return 0;
            }
            if (!z) {
                return 2;
            }
        }
        return 1;
    }

    public final long l() {
        if (!qj0.a(this.p)) {
            return this.C;
        }
        long j = this.B;
        long j2 = this.p.b;
        return ((j + j2) - 1) / j2;
    }

    /* JADX WARN: Failed to calculate best type for var: r18v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v0 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r18v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v0 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r18v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v1 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v0 ??, new type: long
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    public final boolean m(int r21, long r22, java.nio.ByteBuffer r24) {
        /*
            Method dump skipped, instruction units count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tj0.m(int, long, java.nio.ByteBuffer):boolean");
    }

    public final boolean n() {
        if (!p()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29 && this.t.c() && this.N) {
            return false;
        }
        long jL = l();
        long jA = this.t.a();
        an anVar = this.t;
        anVar.getClass();
        return jL > f35.a0(jA, (long) anVar.a.getSampleRate(), 1000000L, RoundingMode.UP);
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0182  */
    /* JADX WARN: Code duplicated, block: B:64:? A[SYNTHETIC] */
    public final boolean o() throws AudioSink$InitializationException {
        an anVarB;
        sj0 sj0Var = this.k;
        if (((Exception) sj0Var.c) != null && (c0.get() > 0 || SystemClock.elapsedRealtime() < sj0Var.b)) {
            return false;
        }
        try {
            anVarB = b((em) this.p.e);
        } catch (AudioSink$InitializationException e) {
            em emVar = (em) this.p.e;
            if (emVar.f > 1000000) {
                dm dmVarA = emVar.a();
                dmVarA.f = 1000000;
                em emVar2 = new em(dmVarA);
                try {
                    anVarB = b(emVar2);
                    qj0 qj0Var = this.p;
                    this.p = new qj0((tb1) qj0Var.c, (tb1) qj0Var.d, qj0Var.a, qj0Var.b, emVar2, (fm) qj0Var.f);
                } catch (AudioSink$InitializationException e2) {
                    e.addSuppressed(e2);
                    if (!((em) this.p.e).e) {
                        throw e;
                    }
                    this.X = true;
                    throw e;
                }
            }
            if (!((em) this.p.e).e) {
                throw e;
            }
            this.X = true;
            throw e;
        }
        this.t = anVarB;
        pj0 pj0Var = new pj0(this, (em) this.p.e);
        this.j = pj0Var;
        anVarB.i.a(pj0Var);
        if (this.t.c()) {
            qj0 qj0Var2 = this.p;
            if (((em) qj0Var2.e).k) {
                an anVar = this.t;
                tb1 tb1Var = (tb1) qj0Var2.c;
                int i = tb1Var.I;
                int i2 = tb1Var.J;
                if (Build.VERSION.SDK_INT < 29) {
                    anVar.getClass();
                } else {
                    anVar.a.setOffloadDelayPadding(i, i2);
                }
            }
        }
        ik3 ik3Var = this.m;
        if (ik3Var != null) {
            an anVar2 = this.t;
            anVar2.getClass();
            if (Build.VERSION.SDK_INT >= 31) {
                LogSessionId logSessionIdA = ik3Var.a();
                LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
                if (!logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                    anVar2.a.setLogSessionId(logSessionIdA);
                }
            }
        }
        if (p()) {
            this.t.a.setVolume(this.H);
        }
        this.S.getClass();
        AudioDeviceInfo audioDeviceInfo = this.T;
        if (audioDeviceInfo != null) {
            this.t.a.setPreferredDevice(audioDeviceInfo);
        }
        this.F = true;
        int audioSessionId = this.t.a.getAudioSessionId();
        boolean z = audioSessionId != this.Q;
        this.Q = audioSessionId;
        rm rmVar = this.n;
        if (rmVar != null) {
            int i3 = ((em) this.p.e).a;
            rmVar.j(new pa(15));
            if (z) {
                this.R = true;
                qj0 qj0Var3 = this.p;
                dm dmVarA2 = ((em) qj0Var3.e).a();
                dmVarA2.h = this.Q;
                this.p = new qj0((tb1) qj0Var3.c, (tb1) qj0Var3.d, qj0Var3.a, qj0Var3.b, new em(dmVarA2), (fm) qj0Var3.f);
                qj0 qj0Var4 = this.o;
                if (qj0Var4 != null) {
                    dm dmVarA3 = ((em) qj0Var4.e).a();
                    dmVarA3.h = this.Q;
                    this.o = new qj0((tb1) qj0Var4.c, (tb1) qj0Var4.d, qj0Var4.a, qj0Var4.b, new em(dmVarA3), (fm) qj0Var4.f);
                }
                this.n.b(this.Q);
            }
        }
        return true;
    }

    public final boolean p() {
        return this.t != null;
    }

    public final void q() {
        this.O = false;
        if (p()) {
            an anVar = this.t;
            en enVar = anVar.e;
            enVar.k = 0L;
            enVar.t = 0;
            enVar.s = 0;
            enVar.l = 0L;
            enVar.y = -9223372036854775807L;
            enVar.z = -9223372036854775807L;
            if (enVar.u == -9223372036854775807L) {
                enVar.h.a(0);
            }
            enVar.w = enVar.a();
            if (!anVar.j || anVar.c()) {
                anVar.a.pause();
            }
        }
    }

    public final void r() {
        this.O = true;
        if (p()) {
            an anVar = this.t;
            en enVar = anVar.e;
            if (enVar.u != -9223372036854775807L) {
                enVar.b.getClass();
                enVar.u = f35.Q(SystemClock.elapsedRealtime());
            }
            enVar.j = f35.Y(enVar.e, enVar.a());
            enVar.h.a(0);
            if (!anVar.j || anVar.c()) {
                anVar.a.play();
            }
        }
    }

    public final void s() {
        if (this.M) {
            return;
        }
        this.M = true;
        if (this.t.c()) {
            this.N = false;
        }
        an anVar = this.t;
        if (anVar.j) {
            return;
        }
        anVar.j = true;
        en enVar = anVar.e;
        long jB = anVar.b();
        enVar.w = enVar.a();
        enVar.b.getClass();
        enVar.u = f35.Q(SystemClock.elapsedRealtime());
        enVar.x = jB;
        anVar.a.stop();
        anVar.o = 0;
    }

    public final void t() {
        if (!this.L && p() && e()) {
            s();
            this.L = true;
        }
    }

    public final void u(long j) throws AudioSink$WriteException {
        ByteBuffer byteBuffer;
        d(j);
        if (this.K != null) {
            return;
        }
        if (!this.q.d()) {
            ByteBuffer byteBuffer2 = this.I;
            if (byteBuffer2 != null) {
                A(byteBuffer2);
                d(j);
                return;
            }
            return;
        }
        while (!this.q.c()) {
            do {
                fm fmVar = this.q;
                if (fmVar.d()) {
                    ByteBuffer byteBuffer3 = fmVar.c[fmVar.b()];
                    if (byteBuffer3.hasRemaining()) {
                        byteBuffer = byteBuffer3;
                    } else {
                        fmVar.e(im.a);
                        byteBuffer = fmVar.c[fmVar.b()];
                    }
                } else {
                    byteBuffer = im.a;
                }
                if (byteBuffer.hasRemaining()) {
                    A(byteBuffer);
                    d(j);
                } else {
                    ByteBuffer byteBuffer4 = this.I;
                    if (byteBuffer4 == null || !byteBuffer4.hasRemaining()) {
                        return;
                    }
                    fm fmVar2 = this.q;
                    ByteBuffer byteBuffer5 = this.I;
                    if (fmVar2.d() && !fmVar2.d) {
                        fmVar2.e(byteBuffer5);
                    }
                }
            } while (this.K == null);
            return;
        }
    }

    public final void v() {
        if (this.p != null) {
            qj0 qj0Var = this.o;
            if (qj0Var != null) {
                this.p = qj0Var;
                this.o = null;
            }
            try {
                em emVarC = this.r.c(i((tb1) this.p.d));
                qj0 qj0Var2 = this.p;
                this.p = new qj0((tb1) qj0Var2.c, (tb1) qj0Var2.d, qj0Var2.a, qj0Var2.b, emVarC, (fm) qj0Var2.f);
            } catch (AudioOutputProvider$ConfigurationException e) {
                throw new IllegalStateException(new AudioSink$ConfigurationException(e, (tb1) this.p.c));
            }
        }
        f();
    }

    public final void w() {
        f();
        vw1 vw1VarListIterator = this.g.listIterator(0);
        while (vw1VarListIterator.hasNext()) {
            ((im) vw1VarListIterator.next()).reset();
        }
        this.e.reset();
        this.f.reset();
        fm fmVar = this.q;
        if (fmVar != null) {
            yw1 yw1Var = fmVar.a;
            for (int i = 0; i < yw1Var.size(); i++) {
                im imVar = (im) yw1Var.get(i);
                hm hmVar = hm.b;
                imVar.flush();
                imVar.reset();
            }
            fmVar.b.clear();
            fmVar.c = new ByteBuffer[0];
            gm gmVar = gm.e;
            fmVar.d = false;
        }
        this.O = false;
        this.X = false;
    }

    public final void x() {
        if (p()) {
            an anVar = this.t;
            qh3 qh3Var = this.x;
            AudioTrack audioTrack = anVar.a;
            try {
                audioTrack.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(qh3Var.a).setPitch(qh3Var.b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                l93.r0("AudioTrackAudioOutput", "Failed to set playback params", e);
            }
            en enVar = anVar.e;
            enVar.i = audioTrack.getPlaybackParams().getSpeed();
            enVar.h.a(0);
            enVar.k = 0L;
            enVar.t = 0;
            enVar.s = 0;
            enVar.l = 0L;
            enVar.y = -9223372036854775807L;
            enVar.z = -9223372036854775807L;
            PlaybackParams playbackParams = this.t.a.getPlaybackParams();
            this.x = new qh3(playbackParams.getSpeed(), playbackParams.getPitch());
        }
    }

    public final void y(int i) {
        if (this.R) {
            if (this.Q != i) {
                return;
            } else {
                this.R = false;
            }
        }
        if (this.Q != i) {
            this.Q = i;
            this.P = i != 0;
            v();
        }
    }

    public final void z(xn xnVar) {
        if (this.S.equals(xnVar)) {
            return;
        }
        xnVar.getClass();
        if (this.t != null) {
            this.S.getClass();
        }
        this.S = xnVar;
    }
}
