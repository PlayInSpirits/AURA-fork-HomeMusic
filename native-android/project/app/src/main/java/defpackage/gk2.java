package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import androidx.media3.decoder.DecoderInputBuffer$InsufficientCapacityException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$DecoderInitializationException;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class gk2 extends kq {
    public static final byte[] T0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public boolean A0;
    public boolean B0;
    public boolean C0;
    public long D0;
    public boolean E0;
    public final Context F;
    public boolean F0;
    public final zj2 G;
    public boolean G0;
    public final kf2 H;
    public boolean H0;
    public final float I;
    public ExoPlaybackException I0;
    public final cj0 J;
    public bj0 J0;
    public final cj0 K;
    public fk2 K0;
    public final cj0 L;
    public long L0;
    public final pr M;
    public boolean M0;
    public final MediaCodec.BufferInfo N;
    public boolean N0;
    public final ArrayDeque O;
    public boolean O0;
    public final j83 P;
    public long P0;
    public final AtomicInteger Q;
    public h40 Q0;
    public tb1 R;
    public h40 R0;
    public tb1 S;
    public jx1 S0;
    public pw0 T;
    public pw0 U;
    public k41 V;
    public MediaCrypto W;
    public final long X;
    public float Y;
    public float Z;
    public ak2 a0;
    public tb1 b0;
    public MediaFormat c0;
    public boolean d0;
    public float e0;
    public ArrayDeque f0;
    public MediaCodecRenderer$DecoderInitializationException g0;
    public dk2 h0;
    public int i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public long n0;
    public long o0;
    public int p0;
    public int q0;
    public ByteBuffer r0;
    public boolean s0;
    public boolean t0;
    public boolean u0;
    public boolean v0;
    public boolean w0;
    public int x0;
    public int y0;
    public int z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gk2(Context context, int i, zj2 zj2Var, float f) {
        super(i);
        kf2 kf2Var = kf2.p;
        this.F = context.getApplicationContext();
        this.G = zj2Var;
        this.H = kf2Var;
        this.I = f;
        this.Q = new AtomicInteger();
        this.J = new cj0(0, 0);
        this.K = new cj0(0, 0);
        this.L = new cj0(2, 0);
        pr prVar = new pr(2, 0);
        prVar.z = 32;
        this.M = prVar;
        this.N = new MediaCodec.BufferInfo();
        this.Y = 1.0f;
        this.Z = 1.0f;
        this.X = -9223372036854775807L;
        this.O = new ArrayDeque();
        this.K0 = fk2.f;
        prVar.t(0);
        prVar.r.order(ByteOrder.nativeOrder());
        j83 j83Var = new j83();
        j83Var.p = im.a;
        j83Var.o = 0;
        j83Var.n = 2;
        this.P = j83Var;
        this.e0 = -1.0f;
        this.i0 = 0;
        this.x0 = 0;
        this.p0 = -1;
        this.q0 = -1;
        this.o0 = -9223372036854775807L;
        this.D0 = -9223372036854775807L;
        this.L0 = -9223372036854775807L;
        this.n0 = -9223372036854775807L;
        this.y0 = 0;
        this.z0 = 0;
        this.J0 = new bj0();
        this.O0 = false;
        this.P0 = 0L;
        int i2 = jx1.p;
        this.S0 = ny3.w;
        h40 h40Var = h40.b;
        this.Q0 = h40Var;
        this.R0 = h40Var;
    }

    @Override // defpackage.kq
    public void A(long j, long j2) throws ExoPlaybackException {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (this.H0) {
            this.H0 = false;
            l0();
        }
        ExoPlaybackException exoPlaybackException = this.I0;
        if (exoPlaybackException != null) {
            this.I0 = null;
            throw exoPlaybackException;
        }
        try {
            if (this.F0) {
                p0();
                return;
            }
            if (this.R != null || n0(2)) {
                Y();
                if (this.t0) {
                    Trace.beginSection("bypassRender");
                    while (I(j, j2)) {
                    }
                    Trace.endSection();
                } else if (this.a0 != null) {
                    this.t.getClass();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    Trace.beginSection("drainAndFeed");
                    while (L(j, j2)) {
                        long j3 = this.X;
                        if (j3 != -9223372036854775807L) {
                            this.t.getClass();
                            z2 = SystemClock.elapsedRealtime() - jElapsedRealtime < j3;
                        }
                        if (!z2) {
                            break;
                        }
                    }
                    while (M()) {
                        long j4 = this.X;
                        if (j4 != -9223372036854775807L) {
                            this.t.getClass();
                            z = SystemClock.elapsedRealtime() - jElapsedRealtime < j4;
                        }
                        if (!z) {
                            break;
                        }
                    }
                    Trace.endSection();
                } else {
                    bj0 bj0Var = this.J0;
                    int i = bj0Var.d;
                    q44 q44Var = this.v;
                    q44Var.getClass();
                    bj0Var.d = i + q44Var.u(j - this.x);
                    n0(1);
                }
                synchronized (this.J0) {
                }
            }
        } catch (MediaCodec.CryptoException e) {
            throw b(e, this.R, false, f35.y(e.getErrorCode()));
        } catch (IllegalStateException e2) {
            boolean z4 = e2 instanceof MediaCodec.CodecException;
            if (!z4) {
                StackTraceElement[] stackTrace = e2.getStackTrace();
                if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                    throw e2;
                }
            }
            b0(e2);
            if (z4 && ((MediaCodec.CodecException) e2).isRecoverable()) {
                z3 = true;
            }
            if (z3) {
                o0();
            }
            MediaCodecDecoderException mediaCodecDecoderExceptionK = K(e2, this.h0);
            throw b(mediaCodecDecoderExceptionK, this.R, z3, mediaCodecDecoderExceptionK.n == 1101 ? 4006 : 4003);
        }
    }

    public abstract int A0(kf2 kf2Var, tb1 tb1Var);

    public final boolean B0(tb1 tb1Var) throws ExoPlaybackException {
        if (this.a0 != null && this.z0 != 3 && this.u != 0) {
            float f = this.Z;
            tb1Var.getClass();
            tb1[] tb1VarArr = this.w;
            tb1VarArr.getClass();
            float fQ = Q(f, tb1Var, tb1VarArr);
            float f2 = this.e0;
            if (f2 != fQ) {
                if (fQ == -1.0f) {
                    if (this.A0) {
                        this.y0 = 1;
                        this.z0 = 3;
                        return false;
                    }
                    o0();
                    Y();
                    return false;
                }
                if (f2 != -1.0f || fQ > this.I) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", fQ);
                    ak2 ak2Var = this.a0;
                    ak2Var.getClass();
                    ak2Var.c(bundle);
                    this.e0 = fQ;
                }
            }
        }
        return true;
    }

    public final void C0() throws ExoPlaybackException {
        pw0 pw0Var = this.U;
        pw0Var.getClass();
        se1 se1VarH = pw0Var.h();
        if (se1VarH != null) {
            try {
                MediaCrypto mediaCrypto = this.W;
                mediaCrypto.getClass();
                mediaCrypto.setMediaDrmSession(se1VarH.b);
            } catch (MediaCryptoException e) {
                throw b(e, this.R, false, 6006);
            }
        }
        t0(this.U);
        this.y0 = 0;
        this.z0 = 0;
    }

    @Override // defpackage.kq
    public void D(float f, float f2) throws ExoPlaybackException {
        this.Y = f;
        this.Z = f2;
        B0(this.b0);
    }

    public final void D0(long j) {
        tb1 tb1Var = (tb1) this.K0.d.f(j);
        if (tb1Var == null && this.M0 && this.c0 != null) {
            tb1Var = (tb1) this.K0.d.e();
        }
        if (tb1Var != null) {
            this.S = tb1Var;
        } else if (!this.d0 || this.S == null) {
            return;
        }
        tb1 tb1Var2 = this.S;
        tb1Var2.getClass();
        g0(tb1Var2, this.c0);
        this.d0 = false;
        this.M0 = false;
    }

    @Override // defpackage.kq
    public final int E(tb1 tb1Var) throws ExoPlaybackException {
        try {
            return A0(this.H, tb1Var);
        } catch (MediaCodecUtil$DecoderQueryException e) {
            throw b(e, tb1Var, false, 4002);
        }
    }

    @Override // defpackage.kq
    public final int F() {
        return 8;
    }

    public final void H(MediaFormat mediaFormat) {
        if (Build.VERSION.SDK_INT >= 29) {
            for (Map.Entry entry : this.Q0.a.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value == null) {
                    mediaFormat.setString(str, null);
                } else if (value instanceof Integer) {
                    mediaFormat.setInteger(str, ((Integer) value).intValue());
                } else if (value instanceof Long) {
                    mediaFormat.setLong(str, ((Long) value).longValue());
                } else if (value instanceof Float) {
                    mediaFormat.setFloat(str, ((Float) value).floatValue());
                } else if (value instanceof String) {
                    mediaFormat.setString(str, (String) value);
                } else if (value instanceof ByteBuffer) {
                    mediaFormat.setByteBuffer(str, (ByteBuffer) value);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x02f3  */
    public final boolean I(long j, long j2) throws ExoPlaybackException {
        pr prVar;
        int length;
        ByteBuffer byteBuffer;
        rr2.w(!this.F0);
        pr prVar2 = this.M;
        if (prVar2.w()) {
            ByteBuffer byteBuffer2 = prVar2.r;
            int i = this.q0;
            int i2 = prVar2.y;
            long j3 = prVar2.t;
            boolean zX = X(this.y, prVar2.x);
            boolean zD = prVar2.d(4);
            tb1 tb1Var = this.S;
            tb1Var.getClass();
            prVar = prVar2;
            if (!m0(j, j2, null, byteBuffer2, i, 0, i2, j3, zX, zD, tb1Var)) {
                return false;
            }
            i0(prVar.x);
            prVar.r();
        } else {
            prVar = prVar2;
        }
        if (this.E0) {
            this.F0 = true;
            return false;
        }
        boolean z = this.u0;
        cj0 cj0Var = this.L;
        if (z) {
            rr2.w(prVar.v(cj0Var));
            this.u0 = false;
        }
        if (this.v0) {
            if (prVar.w()) {
                return true;
            }
            this.t0 = false;
            q0();
            this.v0 = false;
            Y();
            if (!this.t0) {
                return false;
            }
        }
        rr2.w(!this.E0);
        gp3 gp3Var = this.p;
        gp3Var.d();
        cj0Var.r();
        while (true) {
            cj0Var.r();
            int iZ = z(gp3Var, cj0Var, 0);
            if (iZ == -5) {
                f0(gp3Var);
                break;
            }
            if (iZ != -4) {
                if (iZ != -3) {
                    tb4.a();
                    return false;
                }
                if (!l()) {
                    break;
                }
                T().e = this.D0;
                break;
            }
            if (cj0Var.d(4)) {
                this.E0 = true;
                T().e = this.D0;
                break;
            }
            this.D0 = Math.max(this.D0, cj0Var.t);
            if (l() || this.K.d(536870912)) {
                T().e = this.D0;
            }
            byte[] bArr = null;
            if (this.G0) {
                tb1 tb1Var2 = this.R;
                tb1Var2.getClass();
                this.S = tb1Var2;
                if (Objects.equals(tb1Var2.n, "audio/opus") && !this.S.q.isEmpty()) {
                    byte[] bArr2 = (byte[]) this.S.q.get(0);
                    int i3 = (bArr2[10] & 255) | ((bArr2[11] & 255) << 8);
                    sb1 sb1VarA = this.S.a();
                    sb1VarA.H = i3;
                    this.S = new tb1(sb1VarA);
                }
                g0(this.S, null);
                this.G0 = false;
            }
            cj0Var.u();
            tb1 tb1Var3 = this.S;
            if (tb1Var3 == null || !Objects.equals(tb1Var3.n, "audio/opus")) {
                prVar = prVar;
            } else {
                if (cj0Var.d(268435456)) {
                    cj0Var.p = this.S;
                    V(cj0Var);
                }
                if (this.y - cj0Var.t <= 80000) {
                    List list = this.S.q;
                    j83 j83Var = this.P;
                    j83Var.getClass();
                    cj0Var.r.getClass();
                    if (cj0Var.r.limit() - cj0Var.r.position() == 0) {
                        prVar = prVar;
                    } else {
                        if (j83Var.n == 2 && (list.size() == 1 || list.size() == 3)) {
                            bArr = (byte[]) list.get(0);
                        }
                        ByteBuffer byteBuffer3 = cj0Var.r;
                        int iPosition = byteBuffer3.position();
                        int iLimit = byteBuffer3.limit();
                        int i4 = iLimit - iPosition;
                        int i5 = (i4 + 255) / 255;
                        int i6 = i5 + 27 + i4;
                        if (j83Var.n == 2) {
                            length = bArr != null ? bArr.length + 28 : 47;
                            i6 = length + 44 + i6;
                        } else {
                            length = 0;
                        }
                        if (((ByteBuffer) j83Var.p).capacity() < i6) {
                            j83Var.p = ByteBuffer.allocate(i6).order(ByteOrder.LITTLE_ENDIAN);
                        } else {
                            ((ByteBuffer) j83Var.p).clear();
                        }
                        ByteBuffer byteBuffer4 = (ByteBuffer) j83Var.p;
                        if (j83Var.n == 2) {
                            if (bArr != null) {
                                j83.n(byteBuffer4, 0L, 0, 1, true);
                                byteBuffer = byteBuffer4;
                                byteBuffer.put(ji2.p(bArr.length));
                                byteBuffer.put(bArr);
                                byteBuffer.putInt(22, f35.o(byteBuffer.arrayOffset(), bArr.length + 28, 0, byteBuffer.array()));
                                byteBuffer.position(bArr.length + 28);
                            } else {
                                byteBuffer = byteBuffer4;
                                byteBuffer.put(j83.q);
                            }
                            byteBuffer.put(j83.r);
                        } else {
                            prVar = prVar;
                            byteBuffer = byteBuffer4;
                        }
                        int iT = j83Var.o + ((int) ((su3.t(byteBuffer3.get(0), byteBuffer3.limit() > 1 ? byteBuffer3.get(1) : (byte) 0) * 48000) / 1000000));
                        j83Var.o = iT;
                        j83.n(byteBuffer, iT, j83Var.n, i5, false);
                        for (int i7 = 0; i7 < i5; i7++) {
                            if (i4 >= 255) {
                                byteBuffer.put((byte) -1);
                                i4 -= 255;
                            } else {
                                byteBuffer.put((byte) i4);
                                i4 = 0;
                            }
                        }
                        while (iPosition < iLimit) {
                            byteBuffer.put(byteBuffer3.get(iPosition));
                            iPosition++;
                        }
                        byteBuffer3.position(byteBuffer3.limit());
                        byteBuffer.flip();
                        if (j83Var.n == 2) {
                            byteBuffer.putInt(length + 66, f35.o(byteBuffer.arrayOffset() + length + 44, byteBuffer.limit() - byteBuffer.position(), 0, byteBuffer.array()));
                        } else {
                            byteBuffer.putInt(22, f35.o(byteBuffer.arrayOffset(), byteBuffer.limit() - byteBuffer.position(), 0, byteBuffer.array()));
                        }
                        j83Var.n++;
                        j83Var.p = byteBuffer;
                        cj0Var.r();
                        cj0Var.t(((ByteBuffer) j83Var.p).remaining());
                        cj0Var.r.put((ByteBuffer) j83Var.p);
                        cj0Var.u();
                    }
                } else {
                    prVar = prVar;
                }
            }
            if (prVar.w()) {
                long j4 = this.y;
                prVar = prVar;
                if (X(j4, prVar.x) == X(j4, cj0Var.t)) {
                }
                this.u0 = true;
                break;
            }
            prVar = prVar;
            if (!prVar.v(cj0Var)) {
                this.u0 = true;
                break;
            }
        }
        if (prVar.w()) {
            prVar.u();
        }
        return prVar.w() || this.E0 || this.v0;
    }

    public abstract ej0 J(dk2 dk2Var, tb1 tb1Var, tb1 tb1Var2);

    public MediaCodecDecoderException K(IllegalStateException illegalStateException, dk2 dk2Var) {
        return new MediaCodecDecoderException(illegalStateException, dk2Var);
    }

    public final boolean L(long j, long j2) throws ExoPlaybackException {
        ak2 ak2Var = this.a0;
        ak2Var.getClass();
        int i = this.q0;
        MediaCodec.BufferInfo bufferInfo = this.N;
        if (i < 0) {
            int iN = ak2Var.n(bufferInfo);
            if (iN < 0) {
                if (iN != -2) {
                    if (this.m0 && (this.E0 || this.y0 == 2)) {
                        l0();
                    }
                    long j3 = this.n0;
                    if (j3 != -9223372036854775807L) {
                        long j4 = j3 + 100;
                        this.t.getClass();
                        if (j4 < System.currentTimeMillis()) {
                            l0();
                            return false;
                        }
                    }
                    return false;
                }
                this.C0 = true;
                ak2 ak2Var2 = this.a0;
                ak2Var2.getClass();
                MediaFormat mediaFormatH = ak2Var2.h();
                if (this.i0 != 0 && mediaFormatH.getInteger("width") == 32 && mediaFormatH.getInteger("height") == 32) {
                    this.l0 = true;
                    return true;
                }
                if (Build.VERSION.SDK_INT >= 29 && !this.S0.isEmpty()) {
                    jx1<String> jx1Var = this.S0;
                    h40 h40Var = h40.b;
                    HashMap map = new HashMap();
                    for (String str : jx1Var) {
                        if (mediaFormatH.containsKey(str)) {
                            int valueTypeForKey = mediaFormatH.getValueTypeForKey(str);
                            if (valueTypeForKey == 1) {
                                map.put(str, Integer.valueOf(mediaFormatH.getInteger(str)));
                            } else if (valueTypeForKey == 2) {
                                map.put(str, Long.valueOf(mediaFormatH.getLong(str)));
                            } else if (valueTypeForKey == 3) {
                                map.put(str, Float.valueOf(mediaFormatH.getFloat(str)));
                            } else if (valueTypeForKey == 4) {
                                map.put(str, mediaFormatH.getString(str));
                            } else if (valueTypeForKey == 5) {
                                ByteBuffer byteBuffer = mediaFormatH.getByteBuffer(str);
                                if (byteBuffer == null) {
                                    map.put(str, null);
                                } else {
                                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
                                    byteBufferAllocate.put(byteBuffer.duplicate());
                                    byteBufferAllocate.flip();
                                    map.put(str, byteBufferAllocate);
                                }
                            }
                        }
                    }
                    h40 h40Var2 = new h40(map);
                    if (!h40Var2.equals(this.R0)) {
                        this.R0 = h40Var2;
                        d0(h40Var2);
                    }
                }
                this.c0 = mediaFormatH;
                this.d0 = true;
                return true;
            }
            bufferInfo.presentationTimeUs -= this.P0;
            if (this.l0) {
                this.l0 = false;
                ak2Var.g(iN);
                return true;
            }
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                l0();
                return false;
            }
            this.q0 = iN;
            ByteBuffer byteBufferT = ak2Var.t(iN);
            this.r0 = byteBufferT;
            if (byteBufferT != null) {
                byteBufferT.position(bufferInfo.offset);
                this.r0.limit(bufferInfo.offset + bufferInfo.size);
            }
            D0(bufferInfo.presentationTimeUs);
        }
        boolean z = this.O0 || bufferInfo.presentationTimeUs < this.y;
        long j5 = this.K0.e;
        boolean z2 = j5 != -9223372036854775807L && j5 <= bufferInfo.presentationTimeUs;
        this.s0 = z2;
        ByteBuffer byteBuffer2 = this.r0;
        int i2 = this.q0;
        int i3 = bufferInfo.flags;
        long j6 = bufferInfo.presentationTimeUs;
        tb1 tb1Var = this.S;
        tb1Var.getClass();
        if (!m0(j, j2, ak2Var, byteBuffer2, i2, i3, 1, j6, z, z2, tb1Var)) {
            return false;
        }
        i0(bufferInfo.presentationTimeUs);
        boolean z3 = (bufferInfo.flags & 4) != 0;
        if (!z3 && this.B0 && this.s0) {
            this.t.getClass();
            this.n0 = System.currentTimeMillis();
        }
        this.q0 = -1;
        this.r0 = null;
        if (!z3) {
            return true;
        }
        l0();
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:103:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:112:0x0091 A[EDGE_INSN: B:112:0x0091->B:33:0x0091 BREAK  A[LOOP:0: B:30:0x006f->B:32:0x007c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0032  */
    /* JADX WARN: Code duplicated, block: B:20:0x0037  */
    /* JADX WARN: Code duplicated, block: B:23:0x0049  */
    /* JADX WARN: Code duplicated, block: B:25:0x004d  */
    /* JADX WARN: Code duplicated, block: B:27:0x006a  */
    /* JADX WARN: Code duplicated, block: B:29:0x006e  */
    /* JADX WARN: Code duplicated, block: B:32:0x007c A[LOOP:0: B:30:0x006f->B:32:0x007c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00da  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:63:0x010b  */
    /* JADX WARN: Code duplicated, block: B:71:0x011f  */
    /* JADX WARN: Code duplicated, block: B:74:0x0128  */
    /* JADX WARN: Code duplicated, block: B:76:0x0130  */
    /* JADX WARN: Code duplicated, block: B:78:0x0134  */
    /* JADX WARN: Code duplicated, block: B:79:0x0138  */
    /* JADX WARN: Code duplicated, block: B:81:0x013c  */
    /* JADX WARN: Code duplicated, block: B:85:0x014f  */
    /* JADX WARN: Code duplicated, block: B:88:0x016d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0175  */
    /* JADX WARN: Code duplicated, block: B:93:0x0188  */
    /* JADX WARN: Code duplicated, block: B:96:0x018f  */
    /* JADX WARN: Code duplicated, block: B:98:0x0195  */
    public final boolean M() throws ExoPlaybackException {
        int iPosition;
        gp3 gp3Var;
        int i;
        long j;
        boolean zD;
        int iP;
        long j2;
        int i2;
        long j3;
        fg0 fg0Var;
        int i3;
        tb1 tb1Var;
        ak2 ak2Var = this.a0;
        if (ak2Var != null && this.y0 != 2 && !this.E0) {
            int i4 = this.p0;
            cj0 cj0Var = this.K;
            if (i4 < 0) {
                int iM = ak2Var.m();
                this.p0 = iM;
                if (iM >= 0) {
                    cj0Var.r = ak2Var.q(iM);
                    cj0Var.r();
                    if (this.y0 == 1) {
                        if (!this.m0) {
                            this.B0 = true;
                            ak2Var.f(this.p0, 0, 4, 0L);
                            this.p0 = -1;
                            cj0Var.r = null;
                        }
                        this.y0 = 2;
                        return false;
                    }
                    if (this.k0) {
                        this.k0 = false;
                        ByteBuffer byteBuffer = cj0Var.r;
                        byteBuffer.getClass();
                        byteBuffer.put(T0);
                        ak2Var.f(this.p0, 38, 0, 0L);
                        this.p0 = -1;
                        cj0Var.r = null;
                        this.A0 = true;
                        return true;
                    }
                    if (this.x0 == 1) {
                        i3 = 0;
                        while (true) {
                            tb1Var = this.b0;
                            tb1Var.getClass();
                            if (i3 < tb1Var.q.size()) {
                                break;
                            }
                            byte[] bArr = (byte[]) this.b0.q.get(i3);
                            ByteBuffer byteBuffer2 = cj0Var.r;
                            byteBuffer2.getClass();
                            byteBuffer2.put(bArr);
                            i3++;
                        }
                        this.x0 = 2;
                    }
                    ByteBuffer byteBuffer3 = cj0Var.r;
                    byteBuffer3.getClass();
                    iPosition = byteBuffer3.position();
                    gp3Var = this.p;
                    gp3Var.d();
                    try {
                        ak2Var.k(new ws1(12, this, gp3Var));
                        i = this.Q.get();
                        if (i == -3) {
                            if (l()) {
                                T().e = this.D0;
                                return false;
                            }
                        } else {
                            if (i == -5) {
                                if (this.x0 == 2) {
                                    cj0Var.r();
                                    this.x0 = 1;
                                }
                                f0(gp3Var);
                                return true;
                            }
                            if (cj0Var.d(4)) {
                                if (!this.A0 || cj0Var.d(1)) {
                                    j = cj0Var.t;
                                    if (!v0(cj0Var)) {
                                        zD = cj0Var.d(1073741824);
                                        if (zD) {
                                            fg0Var = cj0Var.q;
                                            if (iPosition == 0) {
                                                fg0Var.getClass();
                                            } else {
                                                if (fg0Var.d == null) {
                                                    int[] iArr = new int[1];
                                                    fg0Var.d = iArr;
                                                    fg0Var.i.numBytesOfClearData = iArr;
                                                }
                                                int[] iArr2 = fg0Var.d;
                                                iArr2[0] = iArr2[0] + iPosition;
                                            }
                                        }
                                        if (this.G0) {
                                            tu tuVar = T().d;
                                            tb1 tb1Var2 = this.R;
                                            tb1Var2.getClass();
                                            tuVar.a(j, tb1Var2);
                                            this.G0 = false;
                                        }
                                        this.D0 = Math.max(this.D0, j);
                                        if (l() || cj0Var.d(536870912)) {
                                            T().e = this.D0;
                                        }
                                        cj0Var.u();
                                        if (cj0Var.d(268435456)) {
                                            V(cj0Var);
                                        }
                                        if (this.O0) {
                                            j3 = this.D0;
                                            if (j <= j3) {
                                                this.P0 = (j3 - j) + 1 + this.P0;
                                            }
                                            this.D0 = j;
                                            this.O0 = false;
                                        }
                                        k0(cj0Var);
                                        iP = P(cj0Var);
                                        j2 = j + this.P0;
                                        i2 = this.p0;
                                        if (zD) {
                                            ak2Var.e(i2, cj0Var.q, j2, iP);
                                        } else {
                                            ByteBuffer byteBuffer4 = cj0Var.r;
                                            byteBuffer4.getClass();
                                            ak2Var.f(i2, byteBuffer4.limit(), iP, j2);
                                        }
                                        this.p0 = -1;
                                        cj0Var.r = null;
                                        this.A0 = true;
                                        this.x0 = 0;
                                        this.J0.c++;
                                        return true;
                                    }
                                } else {
                                    cj0Var.r();
                                    if (this.x0 == 2) {
                                        this.x0 = 1;
                                        return true;
                                    }
                                }
                                return true;
                            }
                            T().e = this.D0;
                            if (this.x0 == 2) {
                                cj0Var.r();
                                this.x0 = 1;
                            }
                            this.E0 = true;
                            if (!this.A0) {
                                l0();
                                return false;
                            }
                            if (!this.m0) {
                                this.B0 = true;
                                ak2Var.f(this.p0, 0, 4, 0L);
                                this.p0 = -1;
                                cj0Var.r = null;
                                return false;
                            }
                        }
                    } catch (DecoderInputBuffer$InsufficientCapacityException e) {
                        b0(e);
                        n0(0);
                        N();
                        return true;
                    }
                }
            } else {
                if (this.y0 == 1) {
                    if (!this.m0) {
                        this.B0 = true;
                        ak2Var.f(this.p0, 0, 4, 0L);
                        this.p0 = -1;
                        cj0Var.r = null;
                    }
                    this.y0 = 2;
                    return false;
                }
                if (this.k0) {
                    this.k0 = false;
                    ByteBuffer byteBuffer5 = cj0Var.r;
                    byteBuffer5.getClass();
                    byteBuffer5.put(T0);
                    ak2Var.f(this.p0, 38, 0, 0L);
                    this.p0 = -1;
                    cj0Var.r = null;
                    this.A0 = true;
                    return true;
                }
                if (this.x0 == 1) {
                    i3 = 0;
                    while (true) {
                        tb1Var = this.b0;
                        tb1Var.getClass();
                        if (i3 < tb1Var.q.size()) {
                            break;
                            break;
                        }
                        byte[] bArr2 = (byte[]) this.b0.q.get(i3);
                        ByteBuffer byteBuffer6 = cj0Var.r;
                        byteBuffer6.getClass();
                        byteBuffer6.put(bArr2);
                        i3++;
                    }
                    this.x0 = 2;
                }
                ByteBuffer byteBuffer7 = cj0Var.r;
                byteBuffer7.getClass();
                iPosition = byteBuffer7.position();
                gp3Var = this.p;
                gp3Var.d();
                ak2Var.k(new ws1(12, this, gp3Var));
                i = this.Q.get();
                if (i == -3) {
                    if (l()) {
                        T().e = this.D0;
                        return false;
                    }
                } else {
                    if (i == -5) {
                        if (this.x0 == 2) {
                            cj0Var.r();
                            this.x0 = 1;
                        }
                        f0(gp3Var);
                        return true;
                    }
                    if (cj0Var.d(4)) {
                        if (this.A0) {
                            j = cj0Var.t;
                            if (!v0(cj0Var)) {
                                zD = cj0Var.d(1073741824);
                                if (zD) {
                                    fg0Var = cj0Var.q;
                                    if (iPosition == 0) {
                                        fg0Var.getClass();
                                    } else {
                                        if (fg0Var.d == null) {
                                            int[] iArr3 = new int[1];
                                            fg0Var.d = iArr3;
                                            fg0Var.i.numBytesOfClearData = iArr3;
                                        }
                                        int[] iArr4 = fg0Var.d;
                                        iArr4[0] = iArr4[0] + iPosition;
                                    }
                                }
                                if (this.G0) {
                                    tu tuVar2 = T().d;
                                    tb1 tb1Var3 = this.R;
                                    tb1Var3.getClass();
                                    tuVar2.a(j, tb1Var3);
                                    this.G0 = false;
                                }
                                this.D0 = Math.max(this.D0, j);
                                if (l()) {
                                    T().e = this.D0;
                                } else {
                                    T().e = this.D0;
                                }
                                cj0Var.u();
                                if (cj0Var.d(268435456)) {
                                    V(cj0Var);
                                }
                                if (this.O0) {
                                    j3 = this.D0;
                                    if (j <= j3) {
                                        this.P0 = (j3 - j) + 1 + this.P0;
                                    }
                                    this.D0 = j;
                                    this.O0 = false;
                                }
                                k0(cj0Var);
                                iP = P(cj0Var);
                                j2 = j + this.P0;
                                i2 = this.p0;
                                if (zD) {
                                    ak2Var.e(i2, cj0Var.q, j2, iP);
                                } else {
                                    ByteBuffer byteBuffer8 = cj0Var.r;
                                    byteBuffer8.getClass();
                                    ak2Var.f(i2, byteBuffer8.limit(), iP, j2);
                                }
                                this.p0 = -1;
                                cj0Var.r = null;
                                this.A0 = true;
                                this.x0 = 0;
                                this.J0.c++;
                                return true;
                            }
                        } else {
                            j = cj0Var.t;
                            if (!v0(cj0Var)) {
                                zD = cj0Var.d(1073741824);
                                if (zD) {
                                    fg0Var = cj0Var.q;
                                    if (iPosition == 0) {
                                        fg0Var.getClass();
                                    } else {
                                        if (fg0Var.d == null) {
                                            int[] iArr5 = new int[1];
                                            fg0Var.d = iArr5;
                                            fg0Var.i.numBytesOfClearData = iArr5;
                                        }
                                        int[] iArr6 = fg0Var.d;
                                        iArr6[0] = iArr6[0] + iPosition;
                                    }
                                }
                                if (this.G0) {
                                    tu tuVar3 = T().d;
                                    tb1 tb1Var4 = this.R;
                                    tb1Var4.getClass();
                                    tuVar3.a(j, tb1Var4);
                                    this.G0 = false;
                                }
                                this.D0 = Math.max(this.D0, j);
                                if (l()) {
                                    T().e = this.D0;
                                } else {
                                    T().e = this.D0;
                                }
                                cj0Var.u();
                                if (cj0Var.d(268435456)) {
                                    V(cj0Var);
                                }
                                if (this.O0) {
                                    j3 = this.D0;
                                    if (j <= j3) {
                                        this.P0 = (j3 - j) + 1 + this.P0;
                                    }
                                    this.D0 = j;
                                    this.O0 = false;
                                }
                                k0(cj0Var);
                                iP = P(cj0Var);
                                j2 = j + this.P0;
                                i2 = this.p0;
                                if (zD) {
                                    ak2Var.e(i2, cj0Var.q, j2, iP);
                                } else {
                                    ByteBuffer byteBuffer9 = cj0Var.r;
                                    byteBuffer9.getClass();
                                    ak2Var.f(i2, byteBuffer9.limit(), iP, j2);
                                }
                                this.p0 = -1;
                                cj0Var.r = null;
                                this.A0 = true;
                                this.x0 = 0;
                                this.J0.c++;
                                return true;
                            }
                        }
                        return true;
                    }
                    T().e = this.D0;
                    if (this.x0 == 2) {
                        cj0Var.r();
                        this.x0 = 1;
                    }
                    this.E0 = true;
                    if (!this.A0) {
                        l0();
                        return false;
                    }
                    if (!this.m0) {
                        this.B0 = true;
                        ak2Var.f(this.p0, 0, 4, 0L);
                        this.p0 = -1;
                        cj0Var.r = null;
                        return false;
                    }
                }
            }
        }
        return false;
    }

    public final void N() {
        try {
            ak2 ak2Var = this.a0;
            ak2Var.getClass();
            ak2Var.flush();
        } finally {
            r0();
        }
    }

    public final List O(boolean z) {
        tb1 tb1Var = this.R;
        tb1Var.getClass();
        kf2 kf2Var = this.H;
        ArrayList arrayListR = R(kf2Var, tb1Var, z);
        if (!arrayListR.isEmpty() || !z) {
            return arrayListR;
        }
        ArrayList arrayListR2 = R(kf2Var, tb1Var, false);
        if (!arrayListR2.isEmpty()) {
            l93.q0("MediaCodecRenderer", "Drm session requires secure decoder for " + tb1Var.n + ", but no secure decoder available. Trying to proceed with " + arrayListR2 + ".");
        }
        return arrayListR2;
    }

    public int P(cj0 cj0Var) {
        return 0;
    }

    public abstract float Q(float f, tb1 tb1Var, tb1[] tb1VarArr);

    public abstract ArrayList R(kf2 kf2Var, tb1 tb1Var, boolean z);

    public long S(long j, long j2) {
        return super.f(j, j2);
    }

    public final fk2 T() {
        ArrayDeque arrayDeque = this.O;
        return !arrayDeque.isEmpty() ? (fk2) arrayDeque.getLast() : this.K0;
    }

    public abstract ml3 U(dk2 dk2Var, tb1 tb1Var, MediaCrypto mediaCrypto, float f);

    public abstract void V(cj0 cj0Var);

    /* JADX WARN: Code duplicated, block: B:27:0x00d1  */
    public final void W(dk2 dk2Var, MediaCrypto mediaCrypto) {
        int i;
        this.h0 = dk2Var;
        tb1 tb1Var = this.R;
        tb1Var.getClass();
        String str = dk2Var.a;
        float f = this.Z;
        tb1[] tb1VarArr = this.w;
        tb1VarArr.getClass();
        float fQ = Q(f, tb1Var, tb1VarArr);
        if (fQ <= this.I) {
            fQ = -1.0f;
        }
        this.t.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        ml3 ml3VarU = U(dk2Var, tb1Var, mediaCrypto, fQ);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            ik3 ik3Var = this.s;
            ik3Var.getClass();
            LogSessionId logSessionIdA = ik3Var.a();
            LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
            if (!logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                ((MediaFormat) ml3VarU.b).setString("log-session-id", logSessionIdA.getStringId());
            }
        }
        try {
            Trace.beginSection("createCodec:" + str);
            ak2 ak2VarA = this.G.a(ml3VarU);
            this.a0 = ak2VarA;
            ak2VarA.w(new om1(8, this));
            Trace.endSection();
            this.t.getClass();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            if (!dk2Var.e(this.F, tb1Var)) {
                String strC = tb1.c(tb1Var);
                Locale locale = Locale.US;
                l93.q0("MediaCodecRenderer", f34.h("Format exceeds selected codec's capabilities [", strC, ", ", str, "]"));
            }
            this.e0 = fQ;
            this.b0 = tb1Var;
            boolean z = false;
            if (i2 > 25 || !"OMX.Exynos.avc.dec.secure".equals(str)) {
                i = 0;
            } else {
                String str2 = Build.MODEL;
                if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                    i = 2;
                } else {
                    i = 0;
                }
            }
            this.i0 = i;
            this.j0 = i2 == 29 && "c2.android.aac.decoder".equals(str);
            String str3 = dk2Var.a;
            if ((i2 <= 25 && "OMX.rk.video_decoder.avc".equals(str3)) || ((i2 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str3) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str3) || "OMX.bcm.vdec.avc.tunnel".equals(str3) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str3) || "OMX.bcm.vdec.hevc.tunnel".equals(str3) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str3))) || ("Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && dk2Var.f))) {
                z = true;
            }
            this.m0 = z;
            this.a0.getClass();
            if (this.u == 2) {
                this.t.getClass();
                this.o0 = SystemClock.elapsedRealtime() + 1000;
            }
            this.J0.a++;
            long j = jElapsedRealtime2 - jElapsedRealtime;
            if (i2 >= 31 && !this.S0.isEmpty()) {
                ak2 ak2Var = this.a0;
                ak2Var.getClass();
                ak2Var.u(new ArrayList(this.S0));
            }
            c0(jElapsedRealtime2, j, str);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final boolean X(long j, long j2) {
        if (j2 >= j) {
            return false;
        }
        tb1 tb1Var = this.S;
        return tb1Var == null || !Objects.equals(tb1Var.n, "audio/opus") || j - j2 > 80000;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0084 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0086  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a7 A[Catch: MediaCodecRenderer$DecoderInitializationException -> 0x00b7, TryCatch #1 {MediaCodecRenderer$DecoderInitializationException -> 0x00b7, blocks: (B:47:0x00a3, B:49:0x00a7, B:51:0x00ae, B:56:0x00b9, B:60:0x00c6), top: B:72:0x00a3 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:70:0x008d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final void Y() throws ExoPlaybackException {
        tb1 tb1Var;
        pw0 pw0Var;
        if (this.a0 != null || this.t0 || (tb1Var = this.R) == null) {
            return;
        }
        String str = tb1Var.n;
        boolean z = true;
        if (this.U == null && z0(tb1Var)) {
            this.t0 = false;
            q0();
            boolean zEquals = "audio/mp4a-latm".equals(str);
            pr prVar = this.M;
            if (zEquals || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                prVar.getClass();
                prVar.z = 32;
            } else {
                prVar.getClass();
                prVar.z = 1;
            }
            this.t0 = true;
            return;
        }
        t0(this.U);
        if (this.T == null) {
            try {
                pw0Var = this.T;
                if (pw0Var == null && (pw0Var.getState() == 3 || this.T.getState() == 4)) {
                    pw0 pw0Var2 = this.T;
                    str.getClass();
                    if (!pw0Var2.f(str)) {
                        z = false;
                    }
                } else {
                    z = false;
                }
                Z(this.W, z);
            } catch (MediaCodecRenderer$DecoderInitializationException e) {
                throw b(e, tb1Var, false, 4001);
            }
        } else {
            rr2.w(this.W == null);
            pw0 pw0Var3 = this.T;
            se1 se1VarH = pw0Var3.h();
            if (!se1.c || se1VarH == null) {
                if (se1VarH == null) {
                    try {
                        this.W = new MediaCrypto(se1VarH.a, se1VarH.b);
                    } catch (MediaCryptoException e2) {
                        throw b(e2, this.R, false, 6006);
                    }
                } else if (pw0Var3.g() != null) {
                }
                pw0Var = this.T;
                if (pw0Var == null) {
                    z = false;
                } else {
                    z = false;
                }
                Z(this.W, z);
            } else {
                int state = pw0Var3.getState();
                if (state == 1) {
                    DrmSession$DrmSessionException drmSession$DrmSessionExceptionG = pw0Var3.g();
                    drmSession$DrmSessionExceptionG.getClass();
                    throw b(drmSession$DrmSessionExceptionG, this.R, false, drmSession$DrmSessionExceptionG.n);
                }
                if (state == 4) {
                    if (se1VarH == null) {
                        this.W = new MediaCrypto(se1VarH.a, se1VarH.b);
                    } else if (pw0Var3.g() != null) {
                    }
                    pw0Var = this.T;
                    if (pw0Var == null) {
                        z = false;
                    } else {
                        z = false;
                    }
                    Z(this.W, z);
                }
            }
        }
        MediaCrypto mediaCrypto = this.W;
        if (mediaCrypto == null || this.a0 != null) {
            return;
        }
        mediaCrypto.release();
        this.W = null;
    }

    public final void Z(MediaCrypto mediaCrypto, boolean z) throws MediaCodecRenderer$DecoderInitializationException {
        tb1 tb1Var = this.R;
        tb1Var.getClass();
        if (this.f0 == null) {
            try {
                List listO = O(z);
                this.f0 = new ArrayDeque();
                ArrayList arrayList = (ArrayList) listO;
                if (!arrayList.isEmpty()) {
                    this.f0.add((dk2) arrayList.get(0));
                }
                this.g0 = null;
            } catch (MediaCodecUtil$DecoderQueryException e) {
                throw new MediaCodecRenderer$DecoderInitializationException(tb1Var, e, z, -49998);
            }
        }
        if (this.f0.isEmpty()) {
            throw new MediaCodecRenderer$DecoderInitializationException(tb1Var, null, z, -49999);
        }
        ArrayDeque arrayDeque = this.f0;
        arrayDeque.getClass();
        while (this.a0 == null) {
            dk2 dk2Var = (dk2) arrayDeque.peekFirst();
            dk2Var.getClass();
            if (!a0(tb1Var) || !x0(dk2Var)) {
                return;
            }
            try {
                W(dk2Var, mediaCrypto);
            } catch (Exception e2) {
                l93.r0("MediaCodecRenderer", "Failed to initialize decoder: " + dk2Var, e2);
                arrayDeque.removeFirst();
                MediaCodecRenderer$DecoderInitializationException mediaCodecRenderer$DecoderInitializationException = new MediaCodecRenderer$DecoderInitializationException("Decoder init failed: " + dk2Var.a + ", " + tb1Var, e2, tb1Var.n, z, dk2Var, e2 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e2).getDiagnosticInfo() : null);
                b0(mediaCodecRenderer$DecoderInitializationException);
                MediaCodecRenderer$DecoderInitializationException mediaCodecRenderer$DecoderInitializationException2 = this.g0;
                if (mediaCodecRenderer$DecoderInitializationException2 == null) {
                    this.g0 = mediaCodecRenderer$DecoderInitializationException;
                } else {
                    this.g0 = new MediaCodecRenderer$DecoderInitializationException(mediaCodecRenderer$DecoderInitializationException2.getMessage(), mediaCodecRenderer$DecoderInitializationException2.getCause(), mediaCodecRenderer$DecoderInitializationException2.n, mediaCodecRenderer$DecoderInitializationException2.o, mediaCodecRenderer$DecoderInitializationException2.p, mediaCodecRenderer$DecoderInitializationException2.q);
                }
                if (arrayDeque.isEmpty()) {
                    throw this.g0;
                }
            }
        }
        this.f0 = null;
    }

    public boolean a0(tb1 tb1Var) {
        return true;
    }

    public abstract void b0(Exception exc);

    @Override // defpackage.kq, defpackage.rk3
    public void c(int i, Object obj) {
        int i2;
        if (i == 11) {
            k41 k41Var = (k41) obj;
            k41Var.getClass();
            this.V = k41Var;
            return;
        }
        if (i != 21) {
            if (i == 22 && (i2 = Build.VERSION.SDK_INT) >= 29) {
                obj.getClass();
                jx1 jx1Var = (jx1) obj;
                if (this.S0.equals(jx1Var)) {
                    return;
                }
                if (i2 >= 31) {
                    HashSet hashSet = new HashSet(jx1Var);
                    HashSet hashSet2 = new HashSet();
                    o15 it = this.S0.iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        if (!hashSet.remove(str)) {
                            hashSet2.add(str);
                        }
                    }
                    ak2 ak2Var = this.a0;
                    if (ak2Var != null) {
                        if (!hashSet2.isEmpty()) {
                            ak2Var.x(new ArrayList(hashSet2));
                        }
                        if (!hashSet.isEmpty()) {
                            ak2Var.u(new ArrayList(hashSet));
                        }
                    }
                }
                this.S0 = jx1Var;
                return;
            }
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            obj.getClass();
            h40 h40Var = (h40) obj;
            this.Q0 = h40Var;
            ak2 ak2Var2 = this.a0;
            if (ak2Var2 != null) {
                Bundle bundle = new Bundle();
                for (Map.Entry entry : h40Var.a.entrySet()) {
                    String str2 = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value != null) {
                        if (value instanceof Integer) {
                            bundle.putInt(str2, ((Integer) value).intValue());
                        } else if (value instanceof Long) {
                            bundle.putLong(str2, ((Long) value).longValue());
                        } else if (value instanceof Float) {
                            bundle.putFloat(str2, ((Float) value).floatValue());
                        } else if (value instanceof String) {
                            bundle.putString(str2, (String) value);
                        } else if (value instanceof ByteBuffer) {
                            ByteBuffer byteBuffer = (ByteBuffer) value;
                            byte[] bArr = new byte[byteBuffer.remaining()];
                            byteBuffer.duplicate().get(bArr);
                            bundle.putByteArray(str2, bArr);
                        }
                    }
                }
                ak2Var2.c(bundle);
            }
        }
    }

    public abstract void c0(long j, long j2, String str);

    public abstract void d0(h40 h40Var);

    public abstract void e0(String str);

    @Override // defpackage.kq
    public final long f(long j, long j2) {
        return S(j, j2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ce, code lost:
    
        if (r4.f(r2) != false) goto L116;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ej0 f0(gp3 gp3Var) throws ExoPlaybackException {
        tb1 tb1Var;
        int i;
        this.G0 = true;
        tb1 tb1Var2 = (tb1) gp3Var.p;
        tb1Var2.getClass();
        String str = tb1Var2.n;
        if (str == null) {
            throw b(new IllegalArgumentException("Sample MIME type is null."), tb1Var2, false, 4005);
        }
        if ((str.equals("video/av01") || str.equals("video/x-vnd.on2.vp9")) && !tb1Var2.q.isEmpty()) {
            sb1 sb1VarA = tb1Var2.a();
            sb1VarA.p = null;
            tb1Var = new tb1(sb1VarA);
        } else {
            tb1Var = tb1Var2;
        }
        pw0 pw0Var = (pw0) gp3Var.o;
        pw0.b(this.U, pw0Var);
        this.U = pw0Var;
        this.R = tb1Var;
        if (this.t0) {
            this.v0 = true;
            return null;
        }
        ak2 ak2Var = this.a0;
        if (ak2Var == null) {
            this.f0 = null;
            Y();
            return null;
        }
        dk2 dk2Var = this.h0;
        dk2Var.getClass();
        tb1 tb1Var3 = this.b0;
        tb1Var3.getClass();
        pw0 pw0Var2 = this.T;
        pw0 pw0Var3 = this.U;
        if (pw0Var2 != pw0Var3) {
            if (pw0Var3 != null && pw0Var2 != null && pw0Var3.h() != null && pw0Var2.h() != null && se1.class.equals(se1.class) && pw0Var3.a().equals(pw0Var2.a())) {
                UUID uuid = ax.e;
                if (!uuid.equals(pw0Var2.a()) && !uuid.equals(pw0Var3.a())) {
                    if (!dk2Var.f) {
                        if (pw0Var3.getState() != 2) {
                            if (pw0Var3.getState() == 3 || pw0Var3.getState() == 4) {
                                String str2 = tb1Var.n;
                                str2.getClass();
                            }
                        }
                    }
                }
            }
            if (this.A0) {
                this.y0 = 1;
                this.z0 = 3;
            } else {
                o0();
                Y();
            }
            return new ej0(dk2Var.a, tb1Var3, tb1Var, 0, 128);
        }
        boolean z = this.U != this.T;
        ej0 ej0VarJ = J(dk2Var, tb1Var3, tb1Var);
        int i2 = ej0VarJ.d;
        if (i2 != 0) {
            i = 16;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        tb4.a();
                        return null;
                    }
                    if (B0(tb1Var)) {
                        this.b0 = tb1Var;
                        if (z) {
                            if (this.A0) {
                                this.y0 = 1;
                                this.z0 = 2;
                            } else {
                                C0();
                            }
                        }
                    }
                } else if (B0(tb1Var)) {
                    this.w0 = true;
                    this.x0 = 1;
                    int i3 = this.i0;
                    this.k0 = i3 == 2 || (i3 == 1 && tb1Var.u == tb1Var3.u && tb1Var.v == tb1Var3.v);
                    this.b0 = tb1Var;
                    if (z) {
                        if (this.A0) {
                            this.y0 = 1;
                            this.z0 = 2;
                        } else {
                            C0();
                        }
                    }
                }
            } else if (B0(tb1Var)) {
                this.b0 = tb1Var;
                boolean z2 = this.A0;
                if (z) {
                    if (z2) {
                        this.y0 = 1;
                        this.z0 = 2;
                    } else {
                        C0();
                    }
                } else if (z2) {
                    this.y0 = 1;
                    this.z0 = 1;
                }
            }
            return (i2 != 0 || (this.a0 == ak2Var && this.z0 != 3)) ? ej0VarJ : new ej0(dk2Var.a, tb1Var3, tb1Var, 0, i);
        }
        if (this.A0) {
            this.y0 = 1;
            this.z0 = 3;
        } else {
            o0();
            Y();
        }
        i = 0;
        if (i2 != 0) {
        }
    }

    public abstract void g0(tb1 tb1Var, MediaFormat mediaFormat);

    public void h0() {
    }

    public void i0(long j) {
        this.L0 = j;
        while (true) {
            ArrayDeque arrayDeque = this.O;
            if (arrayDeque.isEmpty() || j < ((fk2) arrayDeque.peek()).a) {
                return;
            }
            fk2 fk2Var = (fk2) arrayDeque.poll();
            fk2Var.getClass();
            u0(fk2Var);
            j0();
        }
    }

    public abstract void j0();

    public void k0(cj0 cj0Var) {
    }

    public final void l0() throws ExoPlaybackException {
        int i = this.z0;
        if (i == 1) {
            N();
            return;
        }
        if (i == 2) {
            N();
            C0();
        } else if (i != 3) {
            this.F0 = true;
            p0();
        } else {
            o0();
            Y();
        }
    }

    public abstract boolean m0(long j, long j2, ak2 ak2Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, tb1 tb1Var);

    public final boolean n0(int i) throws ExoPlaybackException {
        gp3 gp3Var = this.p;
        gp3Var.d();
        cj0 cj0Var = this.J;
        cj0Var.r();
        int iZ = z(gp3Var, cj0Var, i | 4);
        if (iZ == -5) {
            f0(gp3Var);
            return true;
        }
        if (iZ != -4 || !cj0Var.d(4)) {
            return false;
        }
        this.E0 = true;
        l0();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o0() {
        try {
            ak2 ak2Var = this.a0;
            if (ak2Var != null) {
                ak2Var.a();
                this.J0.b++;
                dk2 dk2Var = this.h0;
                dk2Var.getClass();
                e0(dk2Var.a);
            }
            this.a0 = null;
            try {
                MediaCrypto mediaCrypto = this.W;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.W = null;
                t0(null);
                s0();
            }
        } catch (Throwable th) {
            this.a0 = null;
            try {
                MediaCrypto mediaCrypto2 = this.W;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
                this.W = null;
                t0(null);
                s0();
            }
        }
    }

    @Override // defpackage.kq
    public void p() {
        this.R = null;
        u0(fk2.f);
        this.O.clear();
        if (this.t0) {
            this.t0 = false;
            q0();
        } else {
            if (this.a0 == null) {
                return;
            }
            if (y0()) {
                o0();
            } else if (w0()) {
                N();
            } else {
                this.O0 = true;
            }
        }
    }

    public abstract void p0();

    public final void q0() {
        this.D0 = -9223372036854775807L;
        T().e = -9223372036854775807L;
        this.L0 = -9223372036854775807L;
        this.v0 = false;
        this.M.r();
        this.L.r();
        this.u0 = false;
        j83 j83Var = this.P;
        j83Var.getClass();
        j83Var.p = im.a;
        j83Var.o = 0;
        j83Var.n = 2;
    }

    @Override // defpackage.kq
    public void r(long j, boolean z, boolean z2) throws ExoPlaybackException {
        ArrayDeque arrayDeque = this.O;
        if (!arrayDeque.isEmpty()) {
            this.K0 = (fk2) arrayDeque.getLast();
        }
        arrayDeque.clear();
        if (z2) {
            this.E0 = false;
            this.F0 = false;
            this.H0 = false;
            if (this.t0) {
                q0();
            } else if (this.a0 != null) {
                if (y0()) {
                    o0();
                    Y();
                } else if (w0()) {
                    N();
                } else {
                    this.O0 = true;
                }
            }
            if (this.K0.d.h() > 0) {
                this.G0 = true;
            }
            this.K0.d.b();
        }
    }

    public void r0() {
        this.p0 = -1;
        this.K.r = null;
        this.q0 = -1;
        this.r0 = null;
        this.D0 = -9223372036854775807L;
        T().e = -9223372036854775807L;
        this.L0 = -9223372036854775807L;
        this.o0 = -9223372036854775807L;
        this.B0 = false;
        this.n0 = -9223372036854775807L;
        this.A0 = false;
        this.k0 = false;
        this.l0 = false;
        this.s0 = false;
        this.y0 = 0;
        this.z0 = 0;
        this.x0 = this.w0 ? 1 : 0;
        this.O0 = false;
        this.P0 = 0L;
    }

    public final void s0() {
        r0();
        this.I0 = null;
        this.f0 = null;
        this.h0 = null;
        this.b0 = null;
        this.c0 = null;
        this.d0 = false;
        this.C0 = false;
        this.e0 = -1.0f;
        this.i0 = 0;
        this.j0 = false;
        this.m0 = false;
        this.w0 = false;
        this.x0 = 0;
    }

    public final void t0(pw0 pw0Var) {
        pw0.b(this.T, pw0Var);
        this.T = pw0Var;
    }

    public final void u0(fk2 fk2Var) {
        this.K0 = fk2Var;
        if (fk2Var.c != -9223372036854775807L) {
            this.M0 = true;
            h0();
        }
    }

    public boolean v0(cj0 cj0Var) {
        return false;
    }

    public boolean w0() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r4 >= r0) goto L16;
     */
    @Override // defpackage.kq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void x(tb1[] tb1VarArr, long j, long j2, mt2 mt2Var) {
        if (this.K0.c == -9223372036854775807L) {
            u0(new fk2(-9223372036854775807L, j, j2));
            if (this.N0) {
                j0();
                return;
            }
            return;
        }
        ArrayDeque arrayDeque = this.O;
        if (arrayDeque.isEmpty()) {
            long j3 = this.D0;
            if (j3 != -9223372036854775807L) {
                long j4 = this.L0;
                if (j4 != -9223372036854775807L) {
                }
            }
            u0(new fk2(-9223372036854775807L, j, j2));
            if (this.K0.c != -9223372036854775807L) {
                j0();
                return;
            }
            return;
        }
        arrayDeque.add(new fk2(this.D0, j, j2));
    }

    public boolean x0(dk2 dk2Var) {
        return true;
    }

    public boolean y0() {
        int i = this.z0;
        if (i == 3 || (this.j0 && !this.C0)) {
            return true;
        }
        if (i != 2) {
            return false;
        }
        try {
            C0();
            return false;
        } catch (ExoPlaybackException e) {
            l93.r0("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
            return true;
        }
    }

    public boolean z0(tb1 tb1Var) {
        return false;
    }
}
