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
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class gk2 extends kq {
    public static final byte[] T0 = null;
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

    static {
        T0 = new byte[]{0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    }

    public gk2(Context r3, int r4, zj2 r5, float r6) {
        kf2 r0 = kf2.p;
        super(r4);
        this.F = r3.getApplicationContext();
        this.G = r5;
        this.H = r0;
        this.I = r6;
        this.Q = new AtomicInteger();
        this.J = new cj0(0, 0);
        this.K = new cj0(0, 0);
        this.L = new cj0(2, 0);
        pr r7 = new pr(2, 0);
        r7.z = 32;
        this.M = r7;
        this.N = new MediaCodec.BufferInfo();
        this.Y = 1.0f;
        this.Z = 1.0f;
        this.X = -9223372036854775807L;
        this.O = new ArrayDeque();
        this.K0 = fk2.f;
        r7.t(0);
        r7.r.order(ByteOrder.nativeOrder());
        j83 r8 = new j83();
        r8.p = im.a;
        r8.o = 0;
        r8.n = 2;
        this.P = r8;
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
        this.P0 = 0;
        int r9 = jx1.p;
        this.S0 = ny3.w;
        h40 r10 = h40.b;
        this.Q0 = r10;
        this.R0 = r10;
    }

    @Override // defpackage.kq
    public void A(long r12, long r14) {
        boolean r1 = false;
        if (this.H0 == false) goto L5;
        this.H0 = false;
        l0();
    L5:
        ExoPlaybackException r0 = this.I0;
        if (r0 == null) goto L84;
        this.I0 = null;
        throw r0;
    L84:
    L14:
        e = move-exception;
        throw b(e, this.R, false, f35.y(e.getErrorCode()));
    L12:
        e = move-exception;
        boolean r13 = e instanceof MediaCodec.CodecException;
        if (r13 == true) goto L66;
        StackTraceElement[] r15 = e.getStackTrace();
        if (r15.length > 0) goto L65;
    L79:
        throw e;
    L65:
        if (r15[0].getClassName().equals("android.media.MediaCodec") == false) goto L79;
    L66:
        b0(e);
        if (r13 == true) goto L69;
    L71:
        if (r1 == false) goto L73;
        o0();
    L73:
        MediaCodecDecoderException r16 = K(e, this.h0);
        if (r16.n != 1101) goto L76;
        int r17 = 4006;
    L78:
        throw b(r16, this.R, r1, r17);
    L76:
        r17 = 4003;
        goto L78
    L69:
        if (((MediaCodec.CodecException) e).isRecoverable() == false) goto L71;
        r1 = true;
        goto L71
    L9:
        if (this.F0 == false) goto L17;
        p0();     // Catch: IllegalStateException -> L12 MediaCodec.CryptoException -> L14
        return;
    L17:
        if (this.R == null) goto L19;
    L21:
        Y();     // Catch: IllegalStateException -> L12 MediaCodec.CryptoException -> L14
        if (this.t0 == false) goto L29;
        Trace.beginSection("bypassRender");     // Catch: IllegalStateException -> L12 MediaCodec.CryptoException -> L14
    L25:
        if (I(r12, r14) == true) goto L25;
        Trace.endSection();     // Catch: IllegalStateException -> L12 MediaCodec.CryptoException -> L14
    L55:
        bj0 r18 = this.J0;     // Catch: IllegalStateException -> L12 MediaCodec.CryptoException -> L14
        monitor-enter(r18);     // Catch: IllegalStateException -> L12 MediaCodec.CryptoException -> L14
        monitor-exit(r18);     // Catch: IllegalStateException -> L12 MediaCodec.CryptoException -> L14
        return;
    L29:
        if (this.a0 == null) goto L54;
        this.t.getClass();     // Catch: IllegalStateException -> L12 MediaCodec.CryptoException -> L14
        long r2 = SystemClock.elapsedRealtime();     // Catch: IllegalStateException -> L12 MediaCodec.CryptoException -> L14
        Trace.beginSection("drainAndFeed");     // Catch: IllegalStateException -> L12 MediaCodec.CryptoException -> L14
    L32:
        if (L(r12, r14) == false) goto L43;
        long r7 = this.X;     // Catch: IllegalStateException -> L12 MediaCodec.CryptoException -> L14
        if (r7 == (-9223372036854775807L)) goto L39;
        this.t.getClass();     // Catch: IllegalStateException -> L12 MediaCodec.CryptoException -> L14
        if ((SystemClock.elapsedRealtime() - r2) < r7) goto L39;
        boolean r4 = false;
    L40:
        if (r4 == false) goto L43;
    L39:
        r4 = true;
    L43:
        if (M() == false) goto L53;
        long r19 = this.X;     // Catch: IllegalStateException -> L12 MediaCodec.CryptoException -> L14
        if (r19 == (-9223372036854775807L)) goto L50;
        this.t.getClass();     // Catch: IllegalStateException -> L12 MediaCodec.CryptoException -> L14
        if ((SystemClock.elapsedRealtime() - r2) < r19) goto L50;
        boolean r110 = false;
    L51:
        if (r110 == false) goto L53;
    L50:
        r110 = true;
    L53:
        Trace.endSection();     // Catch: IllegalStateException -> L12 MediaCodec.CryptoException -> L14
        goto L55
    L54:
        bj0 r111 = this.J0;     // Catch: IllegalStateException -> L12 MediaCodec.CryptoException -> L14
        int r112 = r111.d;     // Catch: IllegalStateException -> L12 MediaCodec.CryptoException -> L14
        q44 r3 = this.v;     // Catch: IllegalStateException -> L12 MediaCodec.CryptoException -> L14
        r3.getClass();     // Catch: IllegalStateException -> L12 MediaCodec.CryptoException -> L14
        r111.d = r112 + r3.u(r12 - this.x);     // Catch: IllegalStateException -> L12 MediaCodec.CryptoException -> L14
        n0(1);     // Catch: IllegalStateException -> L12 MediaCodec.CryptoException -> L14
        goto L55
    L19:
        if (n0(2) == true) goto L21;
    }

    public abstract int A0(kf2 r1, tb1 r2);

    public final boolean B0(tb1 r6) {
        if (this.a0 != null) goto L5;
    L25:
        return true;
    L5:
        if (this.z0 == 3) goto L25;
        if (this.u == 0) goto L25;
        float r0 = this.Z;
        r6.getClass();
        tb1[] r3 = this.w;
        r3.getClass();
        float r7 = Q(r0, r6, r3);
        float r1 = this.e0;
        if (r1 == r7) goto L25;
        if (r7 != (-1.0f)) goto L21;
        if (this.A0 == false) goto L17;
        this.y0 = 1;
        this.z0 = 3;
        return false;
    L17:
        o0();
        Y();
        return false;
    L21:
        if (r1 == (-1.0f)) goto L23;
    L24:
        Bundle r2 = new Bundle();
        r2.putFloat("operating-rate", r7);
        ak2 r4 = this.a0;
        r4.getClass();
        r4.c(r2);
        this.e0 = r7;
        goto L25
    L23:
        if (r7 <= this.I) goto L25;
        goto L24
    }

    public final void C0() {
        pw0 r0 = this.U;
        r0.getClass();
        se1 r1 = r0.h();
        if (r1 != null) goto L11;
    L9:
        t0(this.U);
        this.y0 = 0;
        this.z0 = 0;
        return;
    L11:
        MediaCrypto r2 = this.W;     // Catch: MediaCryptoException -> L6
        r2.getClass();     // Catch: MediaCryptoException -> L6
        r2.setMediaDrmSession(r1.b);     // Catch: MediaCryptoException -> L6
    L6:
        e = move-exception;
        throw b(e, this.R, false, 6006);
    }

    @Override // defpackage.kq
    public void D(float r1, float r2) {
        this.Y = r1;
        this.Z = r2;
        B0(this.b0);
    }

    public final void D0(long r2) {
        tb1 r3 = (tb1) this.K0.d.f(r2);
        if (r3 == null) goto L5;
    L9:
        if (r3 == null) goto L12;
        this.S = r3;
    L15:
        tb1 r4 = this.S;
        r4.getClass();
        g0(r4, this.c0);
        this.d0 = false;
        this.M0 = false;
        return;
    L12:
        if (this.d0 == true) goto L14;
        return;
    L14:
        if (this.S != null) goto L15;
        return;
    L5:
        if (this.M0 == false) goto L9;
        if (this.c0 == null) goto L9;
        r3 = (tb1) this.K0.d.e();
        goto L9
    }

    @Override // defpackage.kq
    public final int E(tb1 r4) {
        return A0(this.H, r4);
    L4:
        e = move-exception;
        throw b(e, r4, false, 4002);
    }

    @Override // defpackage.kq
    public final int F() {
        return 8;
    }

    public final void H(MediaFormat r5) {
        if (Build.VERSION.SDK_INT < 29) goto L25;
        Iterator r4 = this.Q0.a.entrySet().iterator();
    L6:
        if (r4.hasNext() == false) goto L46;
        Map.Entry r0 = (Map.Entry) r4.next();
        String r1 = (String) r0.getKey();
        Object r2 = r0.getValue();
        if (r2 == null) goto L9;
        if ((r2 instanceof Integer) == true) goto L12;
        if ((r2 instanceof Long) == true) goto L15;
        if ((r2 instanceof Float) == true) goto L18;
        if ((r2 instanceof String) == true) goto L21;
        if ((r2 instanceof ByteBuffer) == false) goto L6;
        r5.setByteBuffer(r1, (ByteBuffer) r2);
        goto L6
    L21:
        r5.setString(r1, (String) r2);
        goto L6
    L18:
        r5.setFloat(r1, ((Float) r2).floatValue());
        goto L6
    L15:
        r5.setLong(r1, ((Long) r2).longValue());
        goto L6
    L12:
        r5.setInteger(r1, ((Integer) r2).intValue());
        goto L6
    L9:
        r5.setString(r1, null);
        goto L6
    L46:
        return;
    }

    public final boolean I(long r25, long r27) {
        rr2.w(!this.F0);
        pr r1 = this.M;
        if (r1.w() == false) goto L8;
        ByteBuffer r6 = r1.r;
        int r7 = this.q0;
        int r9 = r1.y;
        long r10 = r1.t;
        boolean r12 = X(this.y, r1.x);
        boolean r13 = r1.d(4);
        tb1 r14 = this.S;
        r14.getClass();
        pr r15 = r1;
        if (m0(r25, r27, null, r6, r7, 0, r9, r10, r12, r13, r14) == false) goto L7;
        i0(r15.x);
        r15.r();
    L10:
        if (this.E0 == false) goto L13;
        this.F0 = true;
        return false;
    L13:
        boolean r2 = this.u0;
        cj0 r3 = this.L;
        if (r2 == false) goto L17;
        rr2.w(r15.v(r3));
        this.u0 = false;
    L17:
        if (this.v0 == true) goto L19;
    L24:
        rr2.w(!this.E0);
        gp3 r4 = this.p;
        r4.d();
        r3.r();
    L25:
        r3.r();
        int r5 = z(r4, r3, 0);
        if (r5 == (-5)) goto L116;
        if (r5 != (-4)) goto L30;
        if (r3.d(4) == true) goto L38;
        this.D0 = Math.max(this.D0, r3.t);
        if (l() == false) goto L42;
    L43:
        T().e = this.D0;
    L44:
        byte[] r8 = null;
        if (this.G0 == false) goto L52;
        tb1 r11 = this.R;
        r11.getClass();
        this.S = r11;
        if (Objects.equals(r11.n, "audio/opus") == true) goto L49;
    L51:
        g0(this.S, null);
        this.G0 = false;
        goto L52
    L49:
        if (this.S.q.isEmpty() == true) goto L51;
        byte[] r16 = (byte[]) this.S.q.get(0);
        int r17 = (r16[10] & 255) | ((r16[11] & 255) << 8);
        sb1 r18 = this.S.a();
        r18.H = r17;
        this.S = new tb1(r18);
    L52:
        r3.u();
        tb1 r19 = this.S;
        if (r19 != null) goto L55;
    L107:
        r15 = r15;
    L109:
        if (r15.w() == true) goto L111;
        r15 = r15;
    L114:
        if (r15.v(r3) == true) goto L25;
    L115:
        this.u0 = true;
    L118:
        if (r15.w() == false) goto L121;
        r15.u();
    L121:
        if (r15.w() == false) goto L123;
        return true;
    L123:
        if (this.E0 == false) goto L125;
        return true;
    L125:
        if (this.v0 == true) goto L143;
        return false;
    L143:
        return true;
    L111:
        long r20 = this.y;
        r15 = r15;
        if (X(r20, r15.x) != X(r20, r3.t)) goto L115;
    L55:
        if (Objects.equals(r19.n, "audio/opus") == false) goto L107;
        if (r3.d(268435456) == false) goto L60;
        r3.p = this.S;
        V(r3);
    L60:
        if ((this.y - r3.t) > 80000) goto L107;
        List r21 = this.S.q;
        j83 r22 = this.P;
        r22.getClass();
        r3.r.getClass();
        if ((r3.r.limit() - r3.r.position()) == 0) goto L107;
        if (r22.n == 2) goto L67;
    L71:
        ByteBuffer r23 = r3.r;
        int r24 = r23.position();
        int r110 = r23.limit();
        int r111 = r110 - r24;
        int r112 = (r111 + 255) / 255;
        int r113 = (r112 + 27) + r111;
        if (r22.n != 2) goto L77;
        if (r8 == null) goto L75;
        int r26 = r8.length + 28;
    L76:
        r113 = (r26 + 44) + r113;
    L79:
        if (((ByteBuffer) r22.p).capacity() >= r113) goto L81;
        r22.p = ByteBuffer.allocate(r113).order(ByteOrder.LITTLE_ENDIAN);
    L82:
        ByteBuffer r114 = (ByteBuffer) r22.p;
        if (r22.n != 2) goto L88;
        if (r8 == null) goto L86;
        j83.n(r114, 0, 0, 1, true);
        ByteBuffer r28 = r114;
        r28.put(ji2.p(r8.length));
        r28.put(r8);
        r28.putInt(22, f35.o(r28.arrayOffset(), r8.length + 28, 0, r28.array()));
        r28.position(r8.length + 28);
    L87:
        r28.put(j83.r);
    L89:
        byte r29 = r23.get(0);
        if (r23.limit() <= 1) goto L92;
        byte r115 = r23.get(1);
    L93:
        int r116 = r22.o + ((int) ((su3.t(r29, r115) * 48000) / 1000000));
        r22.o = r116;
        j83.n(r28, r116, r22.n, r112, false);
        int r30 = 0;
    L94:
        if (r30 >= r112) goto L100;
        if (r111 < 255) goto L98;
        r28.put((byte) -1);
        r111 = r111 - 255;
    L99:
        r30 = r30 + 1;
        goto L94
    L98:
        r28.put((byte) r111);
        r111 = 0;
    L100:
        if (r24 >= r110) goto L102;
        r28.put(r23.get(r24));
        r24 = r24 + 1;
        goto L100
    L102:
        r23.position(r23.limit());
        r28.flip();
        if (r22.n != 2) goto L105;
        r28.putInt(r26 + 66, f35.o((r28.arrayOffset() + r26) + 44, r28.limit() - r28.position(), 0, r28.array()));
    L106:
        r22.n++;
        r22.p = r28;
        r3.r();
        r3.t(((ByteBuffer) r22.p).remaining());
        r3.r.put((ByteBuffer) r22.p);
        r3.u();
        goto L109
    L105:
        r28.putInt(22, f35.o(r28.arrayOffset(), r28.limit() - r28.position(), 0, r28.array()));
        goto L106
    L92:
        r115 = 0;
        goto L93
    L86:
        r28 = r114;
        r28.put(j83.q);
        goto L87
    L88:
        r15 = r15;
        r28 = r114;
        goto L89
    L81:
        ((ByteBuffer) r22.p).clear();
        goto L82
    L75:
        r26 = 47;
        goto L76
    L77:
        r26 = 0;
        goto L79
    L67:
        if (r21.size() != 1) goto L69;
    L70:
        r8 = (byte[]) r21.get(0);
        goto L71
    L69:
        if (r21.size() != 3) goto L71;
    L42:
        if (this.K.d(536870912) == false) goto L44;
    L38:
        this.E0 = true;
        T().e = this.D0;
        goto L118
    L30:
        if (r5 == (-3)) goto L32;
        tb4.a();
        return false;
    L32:
        if (l() == false) goto L118;
        T().e = this.D0;
        goto L118
    L116:
        f0(r4);
        goto L118
    L19:
        if (r15.w() == false) goto L21;
        return true;
    L21:
        this.t0 = false;
        q0();
        this.v0 = false;
        Y();
        if (this.t0 == true) goto L24;
        return false;
    L7:
        return false;
    L8:
        r15 = r1;
        goto L10
    }

    public abstract ej0 J(dk2 r1, tb1 r2, tb1 r3);

    public MediaCodecDecoderException K(IllegalStateException r1, dk2 r2) {
        return new MediaCodecDecoderException(r1, r2);
    }

    public final boolean L(long r20, long r22) {
        ak2 r5 = this.a0;
        r5.getClass();
        int r1 = this.q0;
        MediaCodec.BufferInfo r8 = this.N;
        if (r1 >= 0) goto L79;
        int r2 = r5.n(r8);
        if (r2 < 0) goto L8;
        r8.presentationTimeUs -= this.P0;
        if (this.l0 == false) goto L69;
        this.l0 = false;
        r5.g(r2);
        return true;
    L69:
        if (r8.size == 0) goto L71;
    L74:
        this.q0 = r2;
        ByteBuffer r3 = r5.t(r2);
        this.r0 = r3;
        if (r3 == null) goto L77;
        r3.position(r8.offset);
        this.r0.limit(r8.offset + r8.size);
    L77:
        D0(r8.presentationTimeUs);
        goto L79
    L71:
        if ((r8.flags & 4) == 0) goto L74;
        l0();
        return false;
    L8:
        if (r2 != (-2)) goto L51;
        this.C0 = true;
        ak2 r4 = this.a0;
        r4.getClass();
        MediaFormat r6 = r4.h();
        if (this.i0 == 0) goto L18;
        if (r6.getInteger("width") != 32) goto L18;
        if (r6.getInteger("height") != 32) goto L18;
        this.l0 = true;
        return true;
    L18:
        if (Build.VERSION.SDK_INT >= 29) goto L20;
    L48:
        this.c0 = r6;
        this.d0 = true;
        return true;
    L20:
        if (this.S0.isEmpty() == true) goto L48;
        jx1 r7 = this.S0;
        h40 r9 = h40.b;
        HashMap r10 = new HashMap();
        Iterator r11 = r7.iterator();
    L24:
        if (r11.hasNext() == false) goto L44;
        String r12 = (String) r11.next();
        if (r6.containsKey(r12) == false) goto L24;
        int r13 = kz.b(r6, r12);
        if (r13 != 1) goto L29;
        r10.put(r12, Integer.valueOf(r6.getInteger(r12)));
        goto L24
    L29:
        if (r13 != 2) goto L31;
        r10.put(r12, Long.valueOf(r6.getLong(r12)));
        goto L24
    L31:
        if (r13 != 3) goto L32;
        r10.put(r12, Float.valueOf(r6.getFloat(r12)));
        goto L24
    L32:
        if (r13 != 4) goto L34;
        r10.put(r12, r6.getString(r12));
        goto L24
    L34:
        if (r13 != 5) goto L24;
        ByteBuffer r14 = r6.getByteBuffer(r12);
        if (r14 == null) goto L38;
        ByteBuffer r15 = ByteBuffer.allocate(r14.remaining());
        r15.put(r14.duplicate());
        r15.flip();
        r10.put(r12, r15);
        goto L24
    L38:
        r10.put(r12, null);
        goto L24
    L44:
        h40 r16 = new h40(r10);
        if (r16.equals(this.R0) == true) goto L48;
        this.R0 = r16;
        d0(r16);
        goto L48
    L51:
        if (this.m0 == true) goto L53;
    L57:
        long r17 = this.n0;
        if (r17 == (-9223372036854775807L)) goto L130;
        long r18 = r17 + 100;
        this.t.getClass();
        if (r18 >= System.currentTimeMillis()) goto L130;
        l0();
        return false;
    L130:
        return false;
    L53:
        if (this.E0 == false) goto L55;
    L56:
        l0();
        goto L57
    L55:
        if (this.y0 != 2) goto L57;
    L79:
        if (this.O0 == false) goto L81;
    L84:
        boolean r19 = true;
    L85:
        long r21 = this.K0.e;
        if (r21 != (-9223372036854775807L)) goto L88;
    L90:
        boolean r110 = false;
    L91:
        this.s0 = r110;
        ByteBuffer r23 = this.r0;
        int r24 = this.q0;
        int r25 = r8.flags;
        long r111 = r8.presentationTimeUs;
        tb1 r112 = this.S;
        r112.getClass();
        if (m0(r20, r22, r5, r23, r24, r25, 1, r111, r19, r110, r112) == false) goto L131;
        i0(r8.presentationTimeUs);
        if ((r8.flags & 4) == 0) goto L96;
        boolean r26 = true;
    L97:
        if (r26 == false) goto L99;
    L103:
        this.q0 = -1;
        this.r0 = null;
        if (r26 == true) goto L106;
        return true;
    L106:
        l0();
        return false;
    L99:
        if (this.B0 == false) goto L103;
        if (this.s0 == false) goto L103;
        this.t.getClass();
        this.n0 = System.currentTimeMillis();
        goto L103
    L96:
        r26 = false;
        goto L97
    L131:
        return false;
    L88:
        if (r21 > r8.presentationTimeUs) goto L90;
        r110 = true;
        goto L91
    L81:
        if (r8.presentationTimeUs < this.y) goto L84;
        r19 = false;
        goto L85
    }

    public final boolean M() {
        ak2 r2 = this.a0;
        if (r2 != null) goto L5;
    L109:
        return false;
    L5:
        if (this.y0 == 2) goto L109;
        if (this.E0 == true) goto L109;
        int r0 = this.p0;
        cj0 r10 = this.K;
        if (r0 >= 0) goto L16;
        int r1 = r2.m();
        this.p0 = r1;
        if (r1 < 0) goto L109;
        r10.r = r2.q(r1);
        r10.r();
    L16:
        if (this.y0 != 1) goto L24;
        if (this.m0 == true) goto L21;
        this.B0 = true;
        r2.f(this.p0, 0, 4, 0);
        this.p0 = -1;
        r10.r = null;
    L21:
        this.y0 = 2;
        return false;
    L24:
        if (this.k0 == false) goto L28;
        this.k0 = false;
        ByteBuffer r3 = r10.r;
        r3.getClass();
        r3.put(T0);
        r2.f(this.p0, 38, 0, 0);
        this.p0 = -1;
        r10.r = null;
        this.A0 = true;
        return true;
    L28:
        if (this.x0 != 1) goto L34;
        int r4 = 0;
    L30:
        tb1 r5 = this.b0;
        r5.getClass();
        if (r4 >= r5.q.size()) goto L33;
        byte[] r6 = (byte[]) this.b0.q.get(r4);
        ByteBuffer r7 = r10.r;
        r7.getClass();
        r7.put(r6);
        r4 = r4 + 1;
        goto L30
    L33:
        this.x0 = 2;
    L34:
        ByteBuffer r8 = r10.r;
        r8.getClass();
        int r9 = r8.position();
        gp3 r11 = this.p;
        r11.d();
        r2.k(new ws1(12, this, r11));     // Catch: DecoderInputBuffer$InsufficientCapacityException -> L106
        int r12 = this.Q.get();
        if (r12 != (-3)) goto L43;
        if (l() == false) goto L109;
        T().e = this.D0;
        return false;
    L43:
        if (r12 != (-5)) goto L50;
        if (this.x0 != 2) goto L47;
        r10.r();
        this.x0 = 1;
    L47:
        f0(r11);
        return true;
    L50:
        if (r10.d(4) == false) goto L64;
        T().e = this.D0;
        if (this.x0 != 2) goto L54;
        r10.r();
        this.x0 = 1;
    L54:
        this.E0 = true;
        if (this.A0 == true) goto L59;
        l0();
        return false;
    L59:
        if (this.m0 == true) goto L109;
        this.B0 = true;
        r2.f(this.p0, 0, 4, 0);
        this.p0 = -1;
        r10.r = null;
        return false;
    L64:
        if (this.A0 == false) goto L66;
    L71:
        long r13 = r10.t;
        if (v0(r10) == false) goto L74;
    L73:
        return true;
    L74:
        boolean r14 = r10.d(1073741824);
        if (r14 == false) goto L84;
        fg0 r15 = r10.q;
        if (r9 != 0) goto L80;
        r15.getClass();
        goto L84
    L80:
        if (r15.d != null) goto L82;
        int[] r16 = new int[1];
        r15.d = r16;
        r15.i.numBytesOfClearData = r16;
    L82:
        int[] r17 = r15.d;
        r17[0] = r17[0] + r9;
    L84:
        if (this.G0 == false) goto L86;
        tu r18 = T().d;
        tb1 r19 = this.R;
        r19.getClass();
        r18.a(r13, r19);
        this.G0 = false;
    L86:
        this.D0 = Math.max(this.D0, r13);
        if (l() == false) goto L89;
    L90:
        T().e = this.D0;
    L91:
        r10.u();
        if (r10.d(268435456) == false) goto L95;
        V(r10);
    L95:
        if (this.O0 == false) goto L100;
        long r20 = this.D0;
        if (r13 > r20) goto L99;
        this.P0 = ((r20 - r13) + 1) + this.P0;
    L99:
        this.D0 = r13;
        this.O0 = false;
    L100:
        k0(r10);
        int r21 = P(r10);
        long r22 = r13 + this.P0;
        int r23 = this.p0;
        if (r14 == false) goto L103;
        r2.e(r23, r10.q, r22, r21);
    L104:
        this.p0 = -1;
        r10.r = null;
        this.A0 = true;
        this.x0 = 0;
        this.J0.c++;
        return true;
    L103:
        ByteBuffer r24 = r10.r;
        r24.getClass();
        r2.f(r23, r24.limit(), r21, r22);
        goto L104
    L89:
        if (r10.d(536870912) == false) goto L91;
    L66:
        if (r10.d(1) == true) goto L71;
        r10.r();
        if (this.x0 != 2) goto L73;
        this.x0 = 1;
        return true;
    L106:
        e = move-exception;
        b0(e);
        n0(0);
        N();
        return true;
    }

    public final void N() {
        ak2 r0 = this.a0;     // Catch: Throwable -> L5
        r0.getClass();     // Catch: Throwable -> L5
        r0.flush();     // Catch: Throwable -> L5
        r0();
        return;
    L5:
        th = move-exception;
        r0();
        throw th;
    }

    public final List O(boolean r5) {
        tb1 r0 = this.R;
        r0.getClass();
        kf2 r1 = this.H;
        ArrayList r2 = R(r1, r0, r5);
        if (r2.isEmpty() == false) goto L9;
        if (r5 == false) goto L9;
        ArrayList r4 = R(r1, r0, false);
        if (r4.isEmpty() == true) goto L8;
        l93.q0("MediaCodecRenderer", "Drm session requires secure decoder for " + r0.n + ", but no secure decoder available. Trying to proceed with " + r4 + ".");
    L8:
        return r4;
    L9:
        return r2;
    }

    public int P(cj0 r1) {
        return 0;
    }

    public abstract float Q(float r1, tb1 r2, tb1[] r3);

    public abstract ArrayList R(kf2 r1, tb1 r2, boolean r3);

    public long S(long r1, long r3) {
        return super.f(r1, r3);
    }

    public final fk2 T() {
        ArrayDeque r0 = this.O;
        if (r0.isEmpty() == true) goto L7;
        return (fk2) r0.getLast();
    L7:
        return this.K0;
    }

    public abstract ml3 U(dk2 r1, tb1 r2, MediaCrypto r3, float r4);

    public abstract void V(cj0 r1);

    public final void W(dk2 r13, MediaCrypto r14) {
        this.h0 = r13;
        tb1 r1 = this.R;
        r1.getClass();
        String r7 = r13.a;
        float r2 = this.Z;
        tb1[] r3 = this.w;
        r3.getClass();
        float r4 = Q(r2, r1, r3);
        if (r4 > this.I) goto L5;
        r4 = -1.0f;
    L5:
        this.t.getClass();
        long r5 = SystemClock.elapsedRealtime();
        ml3 r15 = U(r13, r1, r14, r4);
        int r6 = Build.VERSION.SDK_INT;
        if (r6 < 31) goto L71;
        ik3 r8 = this.s;
        r8.getClass();
        LogSessionId r9 = r8.a();
        go2.d();
        if (go2.w(r9) == true) goto L71;
        ((MediaFormat) r15.b).setString("log-session-id", hd0.p(r9));
    L71:
        Trace.beginSection("createCodec:" + r7);     // Catch: Throwable -> L68
        ak2 r16 = this.G.a(r15);     // Catch: Throwable -> L68
        this.a0 = r16;     // Catch: Throwable -> L68
        r16.w(new om1(8, this));     // Catch: Throwable -> L68
        Trace.endSection();
        this.t.getClass();
        long r10 = SystemClock.elapsedRealtime();
        if (r13.e(this.F, r1) == true) goto L14;
        String r17 = tb1.c(r1);
        Locale r0 = Locale.US;
        l93.q0("MediaCodecRenderer", f34.h("Format exceeds selected codec's capabilities [", r17, ", ", r7, "]"));
    L14:
        this.e0 = r4;
        this.b0 = r1;
        boolean r11 = false;
        if (r6 <= 25) goto L17;
    L27:
        int r12 = 0;
    L28:
        this.i0 = r12;
        if (r6 == 29) goto L31;
    L33:
        boolean r18 = false;
    L34:
        this.j0 = r18;
        String r19 = r13.a;
        if (r6 <= 25) goto L37;
    L38:
        if (r6 > 29) goto L52;
        if ("OMX.broadcom.video_decoder.tunnel".equals(r19) == false) goto L42;
    L57:
        r11 = true;
    L58:
        this.m0 = r11;
        this.a0.getClass();
        if (this.u != 2) goto L61;
        this.t.getClass();
        this.o0 = SystemClock.elapsedRealtime() + 1000;
    L61:
        this.J0.a++;
        long r110 = r10 - r5;
        if (r6 >= 31) goto L64;
    L66:
        c0(r10, r110, r7);
        return;
    L64:
        if (this.S0.isEmpty() == true) goto L66;
        ak2 r20 = this.a0;
        r20.getClass();
        r20.u(new ArrayList(this.S0));
        goto L66
    L42:
        if ("OMX.broadcom.video_decoder.tunnel.secure".equals(r19) == true) goto L57;
        if ("OMX.bcm.vdec.avc.tunnel".equals(r19) == true) goto L57;
        if ("OMX.bcm.vdec.avc.tunnel.secure".equals(r19) == true) goto L57;
        if ("OMX.bcm.vdec.hevc.tunnel".equals(r19) == true) goto L57;
        if ("OMX.bcm.vdec.hevc.tunnel.secure".equals(r19) == true) goto L57;
    L52:
        if ("Amazon".equals(Build.MANUFACTURER) == false) goto L58;
        if ("AFTS".equals(Build.MODEL) == false) goto L58;
        if (r13.f == false) goto L58;
    L37:
        if ("OMX.rk.video_decoder.avc".equals(r19) == true) goto L57;
    L31:
        if ("c2.android.aac.decoder".equals(r7) == false) goto L33;
        r18 = true;
        goto L34
    L17:
        if ("OMX.Exynos.avc.dec.secure".equals(r7) == false) goto L27;
        String r21 = Build.MODEL;
        if (r21.startsWith("SM-T585") == false) goto L21;
    L26:
        r12 = 2;
        goto L28
    L21:
        if (r21.startsWith("SM-A510") == true) goto L26;
        if (r21.startsWith("SM-A520") == true) goto L26;
        if (r21.startsWith("SM-J700") == false) goto L27;
    L68:
        th = move-exception;
        Trace.endSection();
        throw th;
    }

    public final boolean X(long r2, long r4) {
        if (r4 >= r2) goto L13;
        tb1 r1 = this.S;
        if (r1 != null) goto L7;
        return true;
    L7:
        if (Objects.equals(r1.n, "audio/opus") == true) goto L9;
        return true;
    L9:
        if ((r2 - r4) <= 80000) goto L17;
        return true;
    L17:
        return false;
    L13:
        return false;
    }

    public final void Y() {
        if (this.a0 == null) goto L5;
        return;
    L5:
        if (this.t0 == true) goto L74;
        tb1 r0 = this.R;
        if (r0 == null) goto L77;
        String r1 = r0.n;
        boolean r4 = true;
        if (this.U == null) goto L12;
    L23:
        t0(this.U);
        if (this.T != null) goto L26;
    L72:
        pw0 r2 = this.T;     // Catch: MediaCodecRenderer$DecoderInitializationException -> L54
        if (r2 != null) goto L50;
    L59:
        r4 = false;
    L60:
        Z(this.W, r4);     // Catch: MediaCodecRenderer$DecoderInitializationException -> L54
    L61:
        MediaCrypto r3 = this.W;
        if (r3 != null) goto L64;
        return;
    L64:
        if (this.a0 != null) goto L76;
        r3.release();
        this.W = null;
        return;
    L76:
        return;
    L50:
        if (r2.getState() != 3) goto L52;
    L56:
        pw0 r5 = this.T;     // Catch: MediaCodecRenderer$DecoderInitializationException -> L54
        r1.getClass();     // Catch: MediaCodecRenderer$DecoderInitializationException -> L54
        if (r5.f(r1) == false) goto L59;
    L52:
        if (this.T.getState() != 4) goto L59;
    L54:
        e = move-exception;
        throw b(e, r0, false, 4001);
    L26:
        if (this.W != null) goto L28;
        boolean r6 = true;
    L29:
        rr2.w(r6);
        pw0 r7 = this.T;
        se1 r8 = r7.h();
        if (se1.c == false) goto L38;
        if (r8 == null) goto L38;
        int r9 = r7.getState();
        if (r9 == 1) goto L36;
        if (r9 == 4) goto L38;
    L36:
        DrmSession$DrmSessionException r10 = r7.g();
        r10.getClass();
        throw b(r10, this.R, false, r10.n);
    L38:
        if (r8 == null) goto L40;
        this.W = new MediaCrypto(r8.a, r8.b);     // Catch: MediaCryptoException -> L44
    L44:
        e = move-exception;
        throw b(e, this.R, false, 6006);
    L40:
        if (r7.g() == null) goto L61;
    L28:
        r6 = false;
        goto L29
    L12:
        if (z0(r0) == false) goto L23;
        this.t0 = false;
        q0();
        boolean r11 = "audio/mp4a-latm".equals(r1);
        pr r12 = this.M;
        if (r11 == false) goto L16;
    L20:
        r12.getClass();
        r12.z = 32;
    L21:
        this.t0 = true;
        return;
    L16:
        if ("audio/mpeg".equals(r1) == true) goto L20;
        if ("audio/opus".equals(r1) == true) goto L20;
        r12.getClass();
        r12.z = 1;
        goto L21
    L77:
        return;
    }

    public final void Z(MediaCrypto r21, boolean r22) {
        tb1 r9 = this.R;
        r9.getClass();
        if (this.f0 != null) goto L14;
        List r0 = O(r22);     // Catch: MediaCodecUtil$DecoderQueryException -> L7
        this.f0 = new ArrayDeque();     // Catch: MediaCodecUtil$DecoderQueryException -> L7
        ArrayList r1 = (ArrayList) r0;     // Catch: MediaCodecUtil$DecoderQueryException -> L7
        if (r1.isEmpty() == true) goto L9;
        this.f0.add((dk2) r1.get(0));     // Catch: MediaCodecUtil$DecoderQueryException -> L7
    L9:
        this.g0 = null;     // Catch: MediaCodecUtil$DecoderQueryException -> L7
    L7:
        e = move-exception;
        throw new MediaCodecRenderer$DecoderInitializationException(r9, e, r22, -49998);
    L14:
        if (this.f0.isEmpty() == true) goto L44;
        ArrayDeque r11 = this.f0;
        r11.getClass();
    L17:
        if (this.a0 != null) goto L41;
        dk2 r7 = (dk2) r11.peekFirst();
        r7.getClass();
        if (a0(r9) == false) goto L23;
        if (x0(r7) == false) goto L56;
        W(r7, r21);     // Catch: Exception -> L27
    L27:
        e = move-exception;
        l93.r0("MediaCodecRenderer", "Failed to initialize decoder: " + r7, e);
        r11.removeFirst();
        String r3 = "Decoder init failed: " + r7.a + ", " + r9;
        String r5 = r9.n;
        if ((e instanceof MediaCodec.CodecException) == false) goto L31;
        String r8 = ((MediaCodec.CodecException) e).getDiagnosticInfo();
    L32:
        MediaCodecRenderer$DecoderInitializationException r2 = new MediaCodecRenderer$DecoderInitializationException(r3, e, r5, r22, r7, r8);
        b0(r2);
        MediaCodecRenderer$DecoderInitializationException r4 = this.g0;
        if (r4 != null) goto L35;
        this.g0 = r2;
    L37:
        if (r11.isEmpty() == false) goto L17;
        throw this.g0;
    L35:
        this.g0 = new MediaCodecRenderer$DecoderInitializationException(r4.getMessage(), r4.getCause(), r4.n, r4.o, r4.p, r4.q);
        goto L37
    L31:
        r8 = null;
        goto L32
    L56:
        return;
    L23:
        return;
    L41:
        this.f0 = null;
        return;
    L44:
        throw new MediaCodecRenderer$DecoderInitializationException(r9, null, r22, -49999);
    }

    public boolean a0(tb1 r1) {
        return true;
    }

    public abstract void b0(Exception r1);

    @Override // defpackage.kq, defpackage.rk3
    public void c(int r5, Object r6) {
        if (r5 != 11) goto L5;
        k41 r7 = (k41) r6;
        r7.getClass();
        this.V = r7;
        return;
    L5:
        if (r5 == 21) goto L33;
        if (r5 != 22) goto L88;
        int r8 = Build.VERSION.SDK_INT;
        if (r8 < 29) goto L85;
        r6.getClass();
        jx1 r9 = (jx1) r6;
        if (this.S0.equals(r9) == false) goto L15;
        return;
    L15:
        if (r8 < 31) goto L30;
        HashSet r10 = new HashSet(r9);
        HashSet r0 = new HashSet();
        o15 r1 = this.S0.h();
    L18:
        if (r1.hasNext() == false) goto L22;
        String r2 = (String) r1.next();
        if (r10.remove(r2) == true) goto L18;
        r0.add(r2);
        goto L18
    L22:
        ak2 r3 = this.a0;
        if (r3 == null) goto L30;
        if (r0.isEmpty() == true) goto L28;
        r3.x(new ArrayList(r0));
    L28:
        if (r10.isEmpty() == true) goto L30;
        r3.u(new ArrayList(r10));
    L30:
        this.S0 = r9;
        return;
    L85:
        return;
    L88:
        return;
    L33:
        if (Build.VERSION.SDK_INT < 29) goto L86;
        r6.getClass();
        h40 r11 = (h40) r6;
        this.Q0 = r11;
        ak2 r4 = this.a0;
        if (r4 == null) goto L87;
        Bundle r12 = new Bundle();
        Iterator r13 = r11.a.entrySet().iterator();
    L38:
        if (r13.hasNext() == false) goto L57;
        Map.Entry r14 = (Map.Entry) r13.next();
        String r15 = (String) r14.getKey();
        Object r16 = r14.getValue();
        if (r16 == null) goto L38;
        if ((r16 instanceof Integer) == true) goto L44;
        if ((r16 instanceof Long) == true) goto L47;
        if ((r16 instanceof Float) == true) goto L50;
        if ((r16 instanceof String) == true) goto L53;
        if ((r16 instanceof ByteBuffer) == false) goto L38;
        ByteBuffer r17 = (ByteBuffer) r16;
        byte[] r18 = new byte[r17.remaining()];
        r17.duplicate().get(r18);
        r12.putByteArray(r15, r18);
        goto L38
    L53:
        r12.putString(r15, (String) r16);
        goto L38
    L50:
        r12.putFloat(r15, ((Float) r16).floatValue());
        goto L38
    L47:
        r12.putLong(r15, ((Long) r16).longValue());
        goto L38
    L44:
        r12.putInt(r15, ((Integer) r16).intValue());
        goto L38
    L57:
        r4.c(r12);
        return;
    L87:
        return;
    }

    public abstract void c0(long r1, long r3, String r5);

    public abstract void d0(h40 r1);

    public abstract void e0(String r1);

    @Override // defpackage.kq
    public final long f(long r1, long r3) {
        return S(r1, r3);
    }

    public ej0 f0(gp3 r13) {
        this.G0 = true;
        tb1 r1 = (tb1) r13.p;
        r1.getClass();
        String r2 = r1.n;
        if (r2 == null) goto L123;
        if (r2.equals("video/av01") == true) goto L9;
        if (r2.equals("video/x-vnd.on2.vp9") == true) goto L9;
    L11:
        tb1 r9 = r1;
    L12:
        pw0 r14 = (pw0) r13.o;
        pw0.b(this.U, r14);
        this.U = r14;
        this.R = r9;
        if (this.t0 == false) goto L16;
        this.v0 = true;
        return null;
    L16:
        ak2 r15 = this.a0;
        if (r15 != null) goto L20;
        this.f0 = null;
        Y();
        return null;
    L20:
        dk2 r3 = this.h0;
        r3.getClass();
        tb1 r8 = this.b0;
        r8.getClass();
        pw0 r4 = this.T;
        pw0 r5 = this.U;
        if (r4 == r5) goto L54;
        if (r5 == null) goto L117;
        if (r4 == null) goto L117;
        if (r5.h() == null) goto L117;
        if (r4.h() == null) goto L117;
        if (se1.class.equals(se1.class) == false) goto L117;
        if (r5.a().equals(r4.a()) == false) goto L117;
        UUID r10 = ax.e;
        if (r10.equals(r4.a()) == true) goto L117;
        if (r10.equals(r5.a()) == true) goto L117;
        if (r3.f == true) goto L54;
        if (r5.getState() == 2) goto L117;
        if (r5.getState() != 3) goto L49;
    L50:
        String r6 = r9.n;
        r6.getClass();
        if (r5.f(r6) == false) goto L54;
    L49:
        if (r5.getState() != 4) goto L54;
    L117:
        if (this.A0 == false) goto L119;
        this.y0 = 1;
        this.z0 = 3;
    L121:
        return new ej0(r3.a, r8, r9, 0, 128);
    L119:
        o0();
        Y();
    L54:
        if (this.U == this.T) goto L56;
        boolean r7 = true;
    L57:
        ej0 r11 = J(r3, r8, r9);
        int r12 = r11.d;
        if (r12 == 0) goto L104;
        int r16 = 16;
        if (r12 == 1) goto L94;
        if (r12 == 2) goto L75;
        if (r12 == 3) goto L64;
        tb4.a();
        return null;
    L64:
        if (B0(r9) == false) goto L108;
        this.b0 = r9;
        if (r7 == true) goto L69;
    L107:
        r16 = 0;
        goto L108
    L69:
        if (this.A0 == false) goto L71;
        this.y0 = 1;
        this.z0 = 2;
        goto L107
    L71:
        C0();
    L108:
        if (r12 != 0) goto L110;
    L115:
        return r11;
    L110:
        if (this.a0 != r15) goto L114;
        if (this.z0 != 3) goto L115;
    L114:
        return new ej0(r3.a, r8, r9, 0, r16);
    L75:
        if (B0(r9) == false) goto L108;
        this.w0 = true;
        this.x0 = 1;
        int r17 = this.i0;
        if (r17 == 2) goto L86;
        if (r17 == 1) goto L81;
    L85:
        boolean r18 = false;
    L87:
        this.k0 = r18;
        this.b0 = r9;
        if (r7 == false) goto L107;
        if (this.A0 == false) goto L92;
        this.y0 = 1;
        this.z0 = 2;
        goto L107
    L92:
        C0();
        goto L107
    L81:
        if (r9.u != r8.u) goto L85;
        if (r9.v != r8.v) goto L85;
    L86:
        r18 = true;
        goto L87
    L94:
        if (B0(r9) == false) goto L108;
        this.b0 = r9;
        boolean r19 = this.A0;
        if (r7 == false) goto L101;
        if (r19 == false) goto L100;
        this.y0 = 1;
        this.z0 = 2;
        goto L107
    L100:
        C0();
        goto L107
    L101:
        if (r19 == false) goto L107;
        this.y0 = 1;
        this.z0 = 1;
        goto L107
    L104:
        if (this.A0 == false) goto L106;
        this.y0 = 1;
        this.z0 = 3;
        goto L107
    L106:
        o0();
        Y();
        goto L107
    L56:
        r7 = false;
    L9:
        if (r1.q.isEmpty() == true) goto L11;
        sb1 r20 = r1.a();
        r20.p = null;
        r9 = new tb1(r20);
        goto L12
    L123:
        throw b(new IllegalArgumentException("Sample MIME type is null."), r1, false, 4005);
    }

    public abstract void g0(tb1 r1, MediaFormat r2);

    public void h0() {
    }

    public void i0(long r4) {
        this.L0 = r4;
    L3:
        ArrayDeque r0 = this.O;
        if (r0.isEmpty() == true) goto L8;
        if (r4 < ((fk2) r0.peek()).a) goto L11;
        fk2 r1 = (fk2) r0.poll();
        r1.getClass();
        u0(r1);
        j0();
        goto L3
    L11:
        return;
    }

    public abstract void j0();

    public void k0(cj0 r1) {
    }

    public final void l0() {
        int r0 = this.z0;
        if (r0 != 1) goto L5;
        N();
        return;
    L5:
        if (r0 != 2) goto L7;
        N();
        C0();
        return;
    L7:
        if (r0 == 3) goto L10;
        this.F0 = true;
        p0();
        return;
    L10:
        o0();
        Y();
    }

    public abstract boolean m0(long r1, long r3, ak2 r5, ByteBuffer r6, int r7, int r8, int r9, long r10, boolean r12, boolean r13, tb1 r14);

    public final boolean n0(int r6) {
        gp3 r0 = this.p;
        r0.d();
        cj0 r1 = this.J;
        r1.r();
        int r7 = z(r0, r1, r6 | 4);
        if (r7 != (-5)) goto L7;
        f0(r0);
        return true;
    L7:
        if (r7 == (-4)) goto L9;
        return false;
    L9:
        if (r1.d(4) == false) goto L14;
        this.E0 = true;
        l0();
        return false;
    L14:
        return false;
    }

    public final void o0() {
        ak2 r1 = this.a0;     // Catch: Throwable -> L7
        if (r1 == null) goto L9;
        r1.a();     // Catch: Throwable -> L7
        this.J0.b++;     // Catch: Throwable -> L7
        dk2 r2 = this.h0;     // Catch: Throwable -> L7
        r2.getClass();     // Catch: Throwable -> L7
        e0(r2.a);     // Catch: Throwable -> L7
    L9:
        this.a0 = null;
        MediaCrypto r3 = this.W;     // Catch: Throwable -> L14
        if (r3 == null) goto L16;
        r3.release();     // Catch: Throwable -> L14
    L16:
        this.W = null;
        t0(null);
        s0();
        return;
    L14:
        th = move-exception;
        this.W = null;
        t0(null);
        s0();
        throw th;
    L7:
        th = move-exception;
        this.a0 = null;
        MediaCrypto r4 = this.W;     // Catch: Throwable -> L25
        if (r4 == null) goto L27;
        r4.release();     // Catch: Throwable -> L25
    L27:
        this.W = null;
        t0(null);
        s0();
        throw th;
    L25:
        th = move-exception;
        this.W = null;
        t0(null);
        s0();
        throw th;
    }

    @Override // defpackage.kq
    public void p() {
        this.R = null;
        u0(fk2.f);
        this.O.clear();
        if (this.t0 == false) goto L7;
        this.t0 = false;
        q0();
        return;
    L7:
        if (this.a0 != null) goto L10;
        return;
    L10:
        if (y0() == false) goto L14;
        o0();
        return;
    L14:
        if (w0() == false) goto L17;
        N();
        return;
    L17:
        this.O0 = true;
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
        j83 r3 = this.P;
        r3.getClass();
        r3.p = im.a;
        r3.o = 0;
        r3.n = 2;
    }

    @Override // defpackage.kq
    public void r(long r1, boolean r3, boolean r4) {
        ArrayDeque r2 = this.O;
        if (r2.isEmpty() == true) goto L5;
        this.K0 = (fk2) r2.getLast();
    L5:
        r2.clear();
        if (r4 == true) goto L8;
        return;
    L8:
        this.E0 = false;
        this.F0 = false;
        this.H0 = false;
        if (this.t0 == false) goto L12;
        q0();
    L22:
        if (this.K0.d.h() <= 0) goto L24;
        this.G0 = true;
    L24:
        this.K0.d.b();
        return;
    L12:
        if (this.a0 == null) goto L22;
        if (y0() == false) goto L18;
        o0();
        Y();
        goto L22
    L18:
        if (w0() == false) goto L20;
        N();
        goto L22
    L20:
        this.O0 = true;
        goto L22
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
        this.P0 = 0;
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

    public final void t0(pw0 r2) {
        pw0.b(this.T, r2);
        this.T = r2;
    }

    public final void u0(fk2 r5) {
        this.K0 = r5;
        if (r5.c == (-9223372036854775807L)) goto L6;
        this.M0 = true;
        h0();
        return;
    }

    public boolean v0(cj0 r1) {
        return false;
    }

    public boolean w0() {
        return true;
    }

    @Override // defpackage.kq
    public void x(tb1[] r12, long r13, long r15, mt2 r17) {
        if (this.K0.c != (-9223372036854775807L)) goto L8;
        u0(new fk2(-9223372036854775807L, r13, r15));
        if (this.N0 == false) goto L22;
        j0();
        return;
    L22:
        return;
    L8:
        ArrayDeque r14 = this.O;
        if (r14.isEmpty() == false) goto L20;
        long r0 = this.D0;
        if (r0 == (-9223372036854775807L)) goto L16;
        long r4 = this.L0;
        if (r4 == (-9223372036854775807L)) goto L20;
        if (r4 < r0) goto L20;
    L16:
        u0(new fk2(-9223372036854775807L, r13, r15));
        if (this.K0.c == (-9223372036854775807L)) goto L23;
        j0();
        return;
    L23:
        return;
    L20:
        r14.add(new fk2(this.D0, r13, r15));
    }

    public boolean x0(dk2 r1) {
        return true;
    }

    public boolean y0() {
        int r0 = this.z0;
        if (r0 != 3) goto L5;
    L17:
        return true;
    L5:
        if (this.j0 == false) goto L9;
        if (this.C0 == false) goto L17;
    L9:
        if (r0 == 2) goto L18;
        return false;
    L18:
        C0();     // Catch: ExoPlaybackException -> L12
        return false;
    L12:
        e = move-exception;
        l93.r0("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
        return true;
    }

    public boolean z0(tb1 r1) {
        return false;
    }
}
