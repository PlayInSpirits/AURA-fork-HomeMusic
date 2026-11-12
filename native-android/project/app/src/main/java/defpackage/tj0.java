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
import androidx.media3.exoplayer.audio.AudioSink$ConfigurationException;
import androidx.media3.exoplayer.audio.AudioSink$InitializationException;
import androidx.media3.exoplayer.audio.AudioSink$WriteException;
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
    public static final AtomicInteger c0 = null;
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

    static {
        c0 = new AtomicInteger();
    }

    public tj0(au r9) {
        Context r0 = (Context) r9.b;
        if (r0 != null) goto L5;
        Context r1 = null;
    L6:
        this.a = r1;
        this.u = il.i;
        this.b = (qp4) r9.d;
        this.i = 0;
        this.r = (dn) r9.f;
        g10 r10 = new g10();
        this.c = r10;
        ky4 r2 = new ky4();
        r2.m = f35.b;
        this.d = r2;
        this.e = new pu4();
        this.f = new ou4();
        this.g = yw1.p(r2, r10);
        this.H = 1.0f;
        this.Q = 0;
        this.S = new xn();
        qh3 r3 = qh3.d;
        this.w = new rj0(r3, 0, 0);
        this.x = r3;
        this.y = false;
        this.h = new ArrayDeque();
        this.k = new sj0();
        this.l = new sj0();
        int r4 = -1;
        if (Build.VERSION.SDK_INT < 34) goto L14;
        if (r0 == null) goto L14;
        int r11 = bn.c(r0);
        if (r11 == 0) goto L14;
        if (r11 == (-1)) goto L14;
        r4 = r11;
    L14:
        this.U = r4;
        return;
    L5:
        r1 = r0.getApplicationContext();
        goto L6
    }

    public static int k(int r10, ByteBuffer r11) {
        byte r3 = 0;
        if (r10 == 20) goto L107;
        if (r10 == 30) goto L82;
        int r0 = 3;
        switch(r10) {
            case 5: goto L72;
            case 6: goto L72;
            case 7: goto L82;
            case 8: goto L82;
            case 9: goto L40;
            case 10: goto L104;
            case 11: goto L38;
            case 12: goto L38;
            default: goto L9;
        };
    L38:
        return 2048;
    L40:
        int r12 = r11.position();
        String r2 = f35.a;
        int r13 = r11.getInt(r12);
        if (r11.order() == ByteOrder.BIG_ENDIAN) goto L45;
        r13 = Integer.reverseBytes(r13);
    L45:
        if ((r13 & (-2097152)) != (-2097152)) goto L48;
        int r14 = (r13 >>> 19) & 3;
        if (r14 == 1) goto L48;
        int r4 = (r13 >>> 17) & 3;
        if (r4 == 0) goto L48;
        int r5 = (r13 >>> 12) & 15;
        int r15 = (r13 >>> 10) & 3;
        if (r5 == 0) goto L48;
        if (r5 == 15) goto L48;
        if (r15 == 3) goto L48;
        int r16 = 1152;
        if (r4 == 1) goto L64;
        if (r4 == 2) goto L67;
        if (r4 != 3) goto L62;
        r16 = 384;
        goto L67
    L62:
        nz2.c();
        return 0;
    L67:
        if (r16 == (-1)) goto L69;
        return r16;
    L69:
        nz2.c();
        return 0;
    L64:
        if (r14 == 3) goto L67;
        r16 = 576;
    L48:
        r16 = -1;
        goto L67
    L104:
        return 1024;
    L9:
        switch(r10) {
            case 14: goto L16;
            case 15: goto L14;
            case 16: goto L125;
            case 17: goto L12;
            case 18: goto L72;
            default: goto L10;
        };
    L10:
        kf2.o(f34.f(r10, "Unexpected audio encoding: "));
        return 0;
    L12:
        byte[] r17 = new byte[16];
        int r1 = r11.position();
        r11.get(r17);
        r11.position(r1);
        return hw.D(new h00(16, r17)).c;
    L14:
        return 512;
    L16:
        int r18 = r11.position();
        int r6 = r11.limit() - 10;
        int r7 = r18;
    L17:
        if (r7 > r6) goto L26;
        String r8 = f35.a;
        int r9 = r11.getInt(r7 + 4);
        if (r11.order() == ByteOrder.BIG_ENDIAN) goto L23;
        r9 = Integer.reverseBytes(r9);
    L23:
        if ((r9 & (-2)) == (-126718022)) goto L24;
        r7 = r7 + 1;
        goto L17
    L24:
        int r19 = r7 - r18;
    L27:
        if (r19 != (-1)) goto L30;
        return 0;
    L30:
        if ((r11.get((r11.position() + r19) + 7) & 255) != 187) goto L32;
        r3 = 1;
    L32:
        int r110 = r11.position() + r19;
        if (r3 == 0) goto L35;
        int r20 = 9;
    L37:
        return (40 << ((r11.get(r110 + r20) >> 4) & 7)) * 16;
    L35:
        r20 = 8;
        goto L37
    L26:
        r19 = -1;
        goto L27
    L125:
        return 1024;
    L72:
        if (((r11.get(r11.position() + 5) & 248) >> 3) > 10) goto L74;
        return 1536;
    L74:
        if (((r11.get(r11.position() + 4) & 192) >> 6) == 3) goto L78;
        r0 = (r11.get(r11.position() + 4) & 48) >> 4;
    L78:
        return fu.n[r0] * 256;
    L82:
        if (r11.getInt(0) != (-233094848)) goto L84;
        return 1024;
    L84:
        if (r11.getInt(0) != (-398277519)) goto L87;
        return 1024;
    L87:
        if (r11.getInt(0) != 622876772) goto L90;
        return 4096;
    L90:
        int r111 = r11.position();
        byte r21 = r11.get(r111);
        if (r21 == (-2)) goto L101;
        if (r21 != (-1)) goto L94;
        int r22 = (r11.get(r111 + 4) & 7) << 4;
        byte r112 = r11.get(r111 + 7);
    L99:
        int r113 = r112 & 60;
    L103:
        return (((r113 >> 2) | r22) + 1) * 32;
    L94:
        if (r21 == 31) goto L98;
        r22 = (r11.get(r111 + 4) & 1) << 6;
        byte r114 = r11.get(r111 + 5);
    L96:
        r113 = r114 & 252;
        goto L103
    L98:
        r22 = (r11.get(r111 + 5) & 7) << 4;
        r112 = r11.get(r111 + 6);
        goto L99
    L101:
        r22 = (r11.get(r111 + 5) & 1) << 6;
        r114 = r11.get(r111 + 4);
        goto L96
    L107:
        if ((r11.get(5) & 2) != 0) goto L109;
        int r23 = 0;
    L116:
        int r115 = (r11.get(r23 + 26) + 27) + r23;
        byte r24 = r11.get(r115);
        if ((r11.limit() - r115) <= 1) goto L120;
        r3 = r11.get(r115 + 1);
    L120:
        return (int) ((su3.t(r24, r3) * 48000) / 1000000);
    L109:
        byte r116 = r11.get(26);
        int r25 = 28;
        int r26 = 28;
        int r27 = 0;
    L110:
        if (r27 >= r116) goto L112;
        r26 = r26 + r11.get(r27 + 27);
        r27 = r27 + 1;
        goto L110
    L112:
        byte r117 = r11.get(r26 + 26);
        int r28 = 0;
    L113:
        if (r28 >= r117) goto L115;
        r25 = r25 + r11.get((r26 + 27) + r28);
        r28 = r28 + 1;
        goto L113
    L115:
        r23 = r26 + r25;
        goto L116
    }

    public final void A(ByteBuffer r19) {
        if (this.K != null) goto L5;
        boolean r1 = true;
    L6:
        rr2.w(r1);
        if (r19.hasRemaining() == true) goto L10;
        return;
    L10:
        if (qj0.a(this.p) == false) goto L14;
        int r2 = (int) f35.a0(f35.Q(20), ((em) this.p.e).b, 1000000, RoundingMode.UP);
        long r3 = l();
        long r4 = r2;
        if (r3 >= r4) goto L14;
        qj0 r6 = this.p;
        int r7 = ((em) r6.e).a;
        int r8 = r6.b;
        int r5 = (int) r3;
        ByteBuffer r9 = ByteBuffer.allocateDirect(r19.remaining()).order(ByteOrder.nativeOrder());
        int r10 = r19.position();
    L17:
        if (r19.hasRemaining() == false) goto L75;
        if (r5 >= r2) goto L75;
        if (r7 == 2) goto L44;
        if (r7 == 3) goto L43;
        if (r7 == 4) goto L38;
        if (r7 == 21) goto L37;
        if (r7 == 22) goto L35;
        if (r7 == 268435456) goto L34;
        if (r7 != 1342177280) goto L28;
        int r12 = ((r19.get() & 255) << 24) | ((r19.get() & 255) << 16);
        int r13 = (r19.get() & 255) << 8;
    L30:
        int r14 = r12 | r13;
    L45:
        int r11 = (int) ((((long) r14) * ((long) r5)) / r4);
        if (r7 != 2) goto L48;
        r9.put((byte) (r11 >> 16));
        r9.put((byte) (r11 >> 24));
    L73:
        if (r19.position() != (r10 + r8)) goto L17;
        r5 = r5 + 1;
        r10 = r19.position();
        goto L17
    L48:
        if (r7 != 3) goto L50;
        r9.put((byte) (r11 >> 24));
        goto L73
    L50:
        if (r7 == 4) goto L67;
        if (r7 != 21) goto L53;
        r9.put((byte) (r11 >> 8));
        r9.put((byte) (r11 >> 16));
        r9.put((byte) (r11 >> 24));
        goto L73
    L53:
        if (r7 != 22) goto L55;
        r9.put((byte) r11);
        r9.put((byte) (r11 >> 8));
        r9.put((byte) (r11 >> 16));
        r9.put((byte) (r11 >> 24));
        goto L73
    L55:
        if (r7 != 268435456) goto L57;
        r9.put((byte) (r11 >> 24));
        r9.put((byte) (r11 >> 16));
        goto L73
    L57:
        if (r7 != 1342177280) goto L59;
        r9.put((byte) (r11 >> 24));
        r9.put((byte) (r11 >> 16));
        r9.put((byte) (r11 >> 8));
        goto L73
    L59:
        if (r7 != 1610612736) goto L61;
        r9.put((byte) (r11 >> 24));
        r9.put((byte) (r11 >> 16));
        r9.put((byte) (r11 >> 8));
        r9.put((byte) r11);
        goto L73
    L61:
        tb4.a();
        return;
    L67:
        if (r11 >= 0) goto L69;
        r9.putFloat((-r11) / (-2.14748365E9f));
        goto L73
    L69:
        r9.putFloat(r11 / 2.14748365E9f);
        goto L73
    L28:
        if (r7 != 1610612736) goto L31;
        r12 = (((r19.get() & 255) << 24) | ((r19.get() & 255) << 16)) | ((r19.get() & 255) << 8);
        r13 = r19.get() & 255;
        goto L30
    L31:
        tb4.a();
        return;
    L34:
        r12 = (r19.get() & 255) << 24;
        r13 = (r19.get() & 255) << 16;
        goto L30
    L35:
        r12 = ((r19.get() & 255) | ((r19.get() & 255) << 8)) | ((r19.get() & 255) << 16);
        byte r15 = r19.get();
    L36:
        r13 = (r15 & 255) << 24;
        goto L30
    L37:
        r12 = ((r19.get() & 255) << 8) | ((r19.get() & 255) << 16);
        r15 = r19.get();
        goto L36
    L38:
        float r16 = f35.i(r19.getFloat(), -1.0f, 1.0f);
        if (r16 >= 0.0f) goto L42;
        float r17 = (-r16) * (-2.14748365E9f);
    L41:
        r14 = (int) r17;
        goto L45
    L42:
        r17 = r16 * 2.14748365E9f;
        goto L41
    L43:
        r14 = (r19.get() & 255) << 24;
        goto L45
    L44:
        r12 = (r19.get() & 255) << 16;
        r15 = r19.get();
    L75:
        r9.put(r19);
        r9.flip();
    L76:
        this.K = r9;
        return;
    L14:
        r9 = r19;
        goto L76
    L5:
        r1 = false;
        goto L6
    }

    public final void B(qh3 r8) {
        this.x = new qh3(f35.i(r8.a, 0.1f, 8.0f), f35.i(r8.b, 0.1f, 8.0f));
        if (C() == false) goto L6;
        x();
        return;
    L6:
        rj0 r1 = new rj0(r8, -9223372036854775807L, -9223372036854775807L);
        if (p() == false) goto L10;
        this.v = r1;
        return;
    L10:
        this.w = r1;
    }

    public final boolean C() {
        qj0 r0 = this.p;
        if (r0 != null) goto L5;
        return false;
    L5:
        if (((em) r0.e).j == false) goto L10;
        return true;
    L10:
        return false;
    }

    public final void a(long r10) {
        boolean r0 = C();
        boolean r1 = false;
        qp4 r2 = this.b;
        if (r0 == false) goto L5;
        qh3 r3 = qh3.d;
    L24:
        qh3 r4 = r3;
        if (this.V == false) goto L29;
    L31:
        this.y = r1;
        long r5 = Math.max(0, r10);
        qj0 r11 = this.p;
        this.h.add(new rj0(r4, r5, f35.Y(((em) r11.e).b, l())));
        fm r12 = (fm) this.p.f;
        this.q = r12;
        r12.a();
        rm r13 = this.n;
        if (r13 == null) goto L35;
        r13.d(this.y);
        return;
    L35:
        return;
    L29:
        if (qj0.a(this.p) == false) goto L31;
        int r6 = ((tb1) this.p.c).H;
        r1 = this.y;
        ((wd4) r2.b).o = r1;
        goto L31
    L5:
        if (this.V == false) goto L7;
    L22:
        r3 = qh3.d;
    L23:
        this.x = r3;
        goto L24
    L7:
        if (qj0.a(this.p) == false) goto L22;
        int r7 = ((tb1) this.p.c).H;
        r3 = this.x;
        bj4 r8 = (bj4) r2.c;
        float r9 = r3.a;
        r8.getClass();
        if (r9 <= 0.0f) goto L11;
        boolean r14 = true;
    L12:
        rr2.l(r14);
        if (r8.c == r9) goto L15;
        r8.c = r9;
        r8.i = true;
    L15:
        float r15 = r3.b;
        if (r15 <= 0.0f) goto L18;
        boolean r16 = true;
    L19:
        rr2.l(r16);
        if (r8.d == r15) goto L23;
        r8.d = r15;
        r8.i = true;
        goto L23
    L18:
        r16 = false;
        goto L19
    L11:
        r14 = false;
        goto L12
    }

    public final an b(em r10) {
        return this.r.a(r10);
    L4:
        e = move-exception;
        AudioSink$InitializationException r1 = new AudioSink$InitializationException(r10.b, r10.c, r10.a, r10.f, (tb1) this.p.c, r10.e, e);
        rm r9 = this.n;
        if (r9 == null) goto L11;
        r9.g(r1);
        throw r1;
    L11:
        throw r1;
    }

    public final void c(tb1 r14, int[] r15) {
        if (this.s == null) goto L5;
    L10:
        String r0 = r14.n;
        int r2 = r14.F;
        int r3 = r14.H;
        if ("audio/raw".equals(r0) == false) goto L33;
        rr2.l(f35.L(r3));
        int r1 = f35.t(r3) * r2;
        uw1 r4 = new uw1(4);
        r4.d(this.g);
        r4.c(this.e);
        im[] r5 = (im[]) this.b.a;
        int r6 = r5.length;
        gh0.f(r6, r5);
        r4.e(r6);
        System.arraycopy(r5, 0, r4.a, r4.b, r6);
        r4.b += r6;
        fm r7 = new fm(r4.f());
        if (r7.equals(this.q) == false) goto L15;
        r7 = this.q;
    L15:
        int r8 = r14.I;
        int r9 = r14.J;
        ky4 r10 = this.d;
        r10.i = r8;
        r10.j = r9;
        this.c.i = r15;
        gm r16 = new gm(r14.G, r2, r3);
        yw1 r11 = r7.a;     // Catch: AudioProcessor$UnhandledAudioFormatException -> L30
        if (r16.equals(gm.e) == true) goto L29;
        int r12 = 0;
    L20:
        if (r12 >= r11.size()) goto L26;
        im r13 = (im) r11.get(r12);     // Catch: AudioProcessor$UnhandledAudioFormatException -> L30
        gm r17 = r13.f(r16);     // Catch: AudioProcessor$UnhandledAudioFormatException -> L30
        if (r13.b() == false) goto L25;
        rr2.w(!r17.equals(gm.e));     // Catch: AudioProcessor$UnhandledAudioFormatException -> L30
        r16 = r17;
    L25:
        r12 = r12 + 1;
        goto L20
    L26:
        int r18 = r16.b;
        int r19 = r16.c;
        sb1 r20 = r14.a();
        r20.G = r19;
        r20.F = r16.a;
        r20.E = r18;
        tb1 r21 = new tb1(r20);
        int r22 = r1;
        int r110 = f35.t(r19) * r18;
    L27:
        fm r111 = r7;
        am r112 = i(r21);
        tb1 r23 = r112.a;
        em r113 = this.r.c(r112);     // Catch: AudioOutputProvider$ConfigurationException -> L50
        boolean r114 = r113.e;
        if (r113.a == 0) goto L49;
        if (r113.c == 0) goto L47;
        this.X = false;
        qj0 r24 = new qj0(r14, r21, r22, r110, r113, r111);
        if (p() == false) goto L44;
        this.o = r24;
        return;
    L44:
        this.p = r24;
        return;
    L47:
        throw new AudioSink$ConfigurationException("Invalid output channel config (isOffload=" + r114 + ")", r23);
    L49:
        throw new AudioSink$ConfigurationException("Invalid output encoding (isOffload=" + r114 + ")", r23);
    L50:
        e = move-exception;
        throw new AudioSink$ConfigurationException(e, r14);
    L29:
        throw new AudioProcessor$UnhandledAudioFormatException(r16);     // Catch: AudioProcessor$UnhandledAudioFormatException -> L30
    L30:
        e = move-exception;
        throw new AudioSink$ConfigurationException(e, r14);
    L33:
        r7 = new fm(gy3.r);
        r21 = r14;
        r22 = -1;
        r110 = -1;
        goto L27
    L5:
        if (this.a == null) goto L10;
        oj0 r25 = new oj0(this);
        this.s = r25;
        dn r26 = this.r;
        r26.f();
        if (r26.e != null) goto L9;
        tc2 r27 = new tc2(Thread.currentThread());
        r26.e = r27;
        r27.i = false;
    L9:
        r26.e.a(r25);
        goto L10
    }

    public final void d(long r10) {
        if (this.K == null) goto L65;
        sj0 r0 = this.l;
        if (((Exception) r0.c) != null) goto L9;
    L14:
        int r1 = this.K.remaining();
        boolean r4 = true;
        boolean r11 = this.t.d(this.J, r10, this.K);     // Catch: AudioOutput$WriteException -> L42
        this.W = SystemClock.elapsedRealtime();
        r0.c = null;
        r0.a = -9223372036854775807L;
        r0.b = -9223372036854775807L;
        if (this.t.c() == false) goto L30;
        if (this.C <= 0) goto L22;
        this.Y = false;
    L22:
        if (this.O == false) goto L30;
        rm r2 = this.n;
        if (r2 == null) goto L30;
        if (r11 == true) goto L30;
        if (this.Y == true) goto L30;
        r2.o();
    L30:
        if (qj0.a(this.p) == false) goto L32;
        this.B += (long) (r1 - this.K.remaining());
    L32:
        if (r11 == true) goto L34;
        return;
    L34:
        if (qj0.a(this.p) == false) goto L36;
    L40:
        this.K = null;
        return;
    L36:
        if (this.K == this.I) goto L39;
        r4 = false;
    L39:
        rr2.w(r4);
        this.C = (((long) this.D) * ((long) this.J)) + this.C;
    L42:
        e = move-exception;
        boolean r12 = e.o;
        if (r12 == true) goto L46;
    L54:
        r4 = false;
    L55:
        AudioSink$WriteException r3 = new AudioSink$WriteException(e.n, (tb1) this.p.c, r4);
        rm r9 = this.n;
        if (r9 == null) goto L58;
        r9.g(r3);
    L58:
        if (r12 == true) goto L61;
        r0.e(r3);
        return;
    L61:
        throw r3;
    L46:
        if (l() > 0) goto L55;
        if (this.t.c() == false) goto L54;
        if (((em) this.p.e).e == false) goto L55;
        this.X = true;
        goto L55
    L9:
        if (c0.get() <= 0) goto L12;
        return;
    L12:
        if (SystemClock.elapsedRealtime() >= r0.b) goto L14;
        return;
    }

    public final boolean e() {
        if (this.q.d() == true) goto L7;
        d(Long.MIN_VALUE);
        if (this.K == null) goto L19;
    L20:
        return false;
    L19:
        return true;
    L7:
        fm r0 = this.q;
        if (r0.d() == true) goto L10;
    L13:
        u(Long.MIN_VALUE);
        if (this.q.c() == false) goto L20;
        ByteBuffer r6 = this.K;
        if (r6 == null) goto L19;
        if (r6.hasRemaining() == true) goto L20;
    L10:
        if (r0.d == true) goto L13;
        r0.d = true;
        ((im) r0.b.get(0)).g();
        goto L13
    }

    public final void f() {
        if (p() == false) goto L30;
        this.z = 0;
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.Y = false;
        this.D = 0;
        this.w = new rj0(this.x, 0, 0);
        this.G = 0;
        this.v = null;
        this.h.clear();
        this.I = null;
        this.J = 0;
        this.K = null;
        this.M = false;
        this.L = false;
        this.N = false;
        this.d.o = 0;
        fm r0 = (fm) this.p.f;
        this.q = r0;
        r0.a();
        this.j = null;
        qj0 r1 = this.o;
        if (r1 == null) goto L7;
        this.p = r1;
        this.o = null;
    L7:
        c0.incrementAndGet();
        an r2 = this.t;
        if (r2.e.d.getPlayState() != 3) goto L11;
        r2.a.pause();
    L11:
        if (Build.VERSION.SDK_INT >= 29) goto L13;
    L15:
        bq4 r4 = r2.d;
        if (r4 == null) goto L18;
        AudioTrack r5 = (AudioTrack) r4.n;
        wm r6 = (wm) r4.q;
        r6.getClass();
        r5.removeOnRoutingChangedListener(r6);
        r4.q = null;
        r2.d = null;
    L18:
        AudioTrack r7 = r2.a;
        tc2 r3 = r2.i;
        Handler r8 = f35.p(null);
        Object r9 = an.r;
        monitor-enter(r9);
    L23:
        th = move-exception;
        throw th;
    L21:
        if (an.s != null) goto L25;
        an.s = Executors.newSingleThreadScheduledExecutor(new ps3(1));     // Catch: Throwable -> L23
    L25:
        an.t++;     // Catch: Throwable -> L23
        an.s.schedule(new v6(r7, r8, r3, 2), 20, TimeUnit.MILLISECONDS);     // Catch: Throwable -> L23
        monitor-exit(r9);     // Catch: Throwable -> L23
        this.t = null;
        goto L30
    L13:
        if (r2.c() == false) goto L15;
        jv3 r10 = r2.h;
        r10.getClass();
        z9.q(((an) r10.p).a, (zm) r10.o);
        ((Handler) r10.n).removeCallbacksAndMessages(null);
    L30:
        sj0 r11 = this.l;
        r11.c = null;
        r11.a = -9223372036854775807L;
        r11.b = -9223372036854775807L;
        sj0 r12 = this.k;
        r12.c = null;
        r12.a = -9223372036854775807L;
        r12.b = -9223372036854775807L;
        this.Z = 0;
        this.a0 = 0;
        Handler r13 = this.b0;
        if (r13 == null) goto L36;
        r13.removeCallbacksAndMessages(null);
        return;
    }

    public final long g() {
        if (p() == true) goto L7;
        return -9223372036854775807L;
    L7:
        if (qj0.a(this.p) == false) goto L10;
        qj0 r0 = this.p;
        return f35.Y(((em) r0.e).b, this.t.a.getBufferSizeInFrames());
    L10:
        long r1 = this.t.a.getBufferSizeInFrames();
        int r8 = wr1.w(((em) this.p.e).a);
        if (r8 == (-2147483647)) goto L13;
        boolean r2 = true;
    L14:
        rr2.w(r2);
        return f35.a0(r1, 1000000, r8, RoundingMode.DOWN);
    L13:
        r2 = false;
        goto L14
    }

    public final long h() {
        if (p() == true) goto L5;
        return Long.MIN_VALUE;
    L5:
        if (this.F == true) goto L37;
        long r0 = this.t.a();
        qj0 r2 = this.p;
        long r1 = Math.min(r0, f35.Y(((em) r2.e).b, l()));
    L8:
        ArrayDeque r3 = this.h;
        if (r3.isEmpty() == true) goto L13;
        if (r1 < ((rj0) r3.getFirst()).c) goto L13;
        this.w = (rj0) r3.remove();
    L13:
        rj0 r4 = this.w;
        long r6 = r1 - r4.c;
        long r5 = f35.A(r6, r4.a.a);
        boolean r7 = r3.isEmpty();
        qp4 r8 = this.b;
        if (r7 == false) goto L25;
        bj4 r9 = (bj4) r8.c;
        if (r9.b() == true) goto L18;
    L24:
        rj0 r10 = this.w;
        long r11 = r10.b + r6;
        r10.d = r6 - r5;
    L26:
        long r12 = ((wd4) r8.b).q;
        long r13 = f35.Y(((em) this.p.e).b, r12) + r11;
        long r14 = this.Z;
        if (r12 <= r14) goto L32;
        long r15 = f35.Y(((em) this.p.e).b, r12 - r14);
        this.Z = r12;
        this.a0 += r15;
        if (this.b0 != null) goto L31;
        this.b0 = new Handler(Looper.myLooper());
    L31:
        this.b0.removeCallbacksAndMessages(null);
        this.b0.postDelayed(new a0(17, this), 100);
    L32:
        return r13;
    L18:
        if (r9.n < 1024) goto L23;
        long r16 = r9.m;
        aj4 r17 = r9.j;
        r17.getClass();
        long r18 = r16 - ((long) (r17.i.o() * (r17.j * r17.b)));
        int r19 = r9.h.a;
        int r20 = r9.g.a;
        long r110 = r9.n;
        if (r19 != r20) goto L22;
        r6 = f35.a0(r6, r18, r110, RoundingMode.DOWN);
        goto L24
    L22:
        r6 = f35.a0(r6, r18 * ((long) r19), r110 * ((long) r20), RoundingMode.DOWN);
        goto L24
    L23:
        r6 = (long) (((double) r9.c) * r6);
        goto L24
    L25:
        rj0 r21 = this.w;
        r11 = (r21.b + r5) + r21.d;
        goto L26
    L37:
        return Long.MIN_VALUE;
    }

    public final am i(tb1 r2) {
        am r0 = new am(r2);
        r0.b = this.u;
        if (this.i == 0) goto L5;
        boolean r3 = true;
    L6:
        r0.d = r3;
        r0.c = this.T;
        r0.e = this.Q;
        r0.g = this.V;
        r0.h = -1;
        r0.f = this.U;
        return new am(r0);
    L5:
        r3 = false;
        goto L6
    }

    public final int j(tb1 r6) {
        if (f35.L(r6.H) == true) goto L5;
    L7:
        boolean r0 = false;
    L8:
        int r5 = this.r.b(i(r6)).d;
        if (r5 == 1) goto L15;
        if (r5 == 2) goto L12;
        return 0;
    L12:
        if (r0 == true) goto L15;
        return 2;
    L15:
        return 1;
    L5:
        if (r6.H == 2) goto L7;
        sb1 r7 = r6.a();
        r7.G = 2;
        r6 = new tb1(r7);
        r0 = true;
        goto L8
    }

    public final long l() {
        if (qj0.a(this.p) == false) goto L7;
        long r0 = this.B;
        long r2 = this.p.b;
        return ((r0 + r2) - 1) / r2;
    L7:
        return this.C;
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
        /*  JADX ERROR: Simple mode code generation failed
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x01d6: MOVE (r18v0 ?? I:??[long, double]) = (0 ??[long, double]) A[DECLARE_VAR] (LINE:471) in method: tj0.m(int, long, java.nio.ByteBuffer):boolean, file: classes.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
            	at jadx.core.codegen.MethodGen.generateSimpleCode(MethodGen.java:348)
            	at jadx.core.codegen.MethodGen.addSimpleMethodCode(MethodGen.java:316)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:279)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.ArgType.getPrimitiveType()" because "type" is null
            	at jadx.core.codegen.ClassGen.useType(ClassGen.java:564)
            	at jadx.core.codegen.InsnGen.useType(InsnGen.java:269)
            	at jadx.core.codegen.InsnGen.declareVar(InsnGen.java:166)
            	at jadx.core.codegen.InsnGen.declareVar(InsnGen.java:159)
            	at jadx.core.codegen.InsnGen.assignVar(InsnGen.java:152)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:299)
            	... 11 more
            */
        /*
            Method dump skipped, instruction units count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tj0.m(int, long, java.nio.ByteBuffer):boolean");
    }

    public final boolean n() {
        if (p() == true) goto L5;
        return false;
    L5:
        if (Build.VERSION.SDK_INT >= 29) goto L7;
    L10:
        long r0 = l();
        long r3 = this.t.a();
        an r10 = this.t;
        r10.getClass();
        if (r0 <= f35.a0(r3, r10.a.getSampleRate(), 1000000, RoundingMode.UP)) goto L17;
        return true;
    L17:
        return false;
    L7:
        if (this.t.c() == false) goto L10;
        if (this.N == false) goto L10;
        return false;
    }

    public final boolean o() {
        sj0 r0 = this.k;
        boolean r2 = false;
        if (((Exception) r0.c) == null) goto L62;
        if (c0.get() <= 0) goto L9;
    L10:
        return false;
    L9:
        if (SystemClock.elapsedRealtime() < r0.b) goto L10;
    L62:
        an r1 = b((em) this.p.e);     // Catch: AudioSink$InitializationException -> L14
    L19:
        this.t = r1;
        pj0 r3 = new pj0(this, (em) this.p.e);
        this.j = r3;
        r1.i.a(r3);
        if (this.t.c() == false) goto L27;
        qj0 r4 = this.p;
        if (((em) r4.e).k == false) goto L27;
        an r5 = this.t;
        tb1 r6 = (tb1) r4.c;
        int r7 = r6.I;
        int r8 = r6.J;
        if (Build.VERSION.SDK_INT >= 29) goto L26;
        r5.getClass();
        goto L27
    L26:
        z9.o(r5.a, r7, r8);
    L27:
        ik3 r9 = this.m;
        if (r9 == null) goto L36;
        an r10 = this.t;
        r10.getClass();
        if (Build.VERSION.SDK_INT < 31) goto L36;
        LogSessionId r11 = r9.a();
        go2.d();
        if (go2.w(r11) == true) goto L36;
        db.t(r10.a, r11);
    L36:
        if (p() == false) goto L38;
        an r12 = this.t;
        r12.a.setVolume(this.H);
    L38:
        this.S.getClass();
        AudioDeviceInfo r13 = this.T;
        if (r13 == null) goto L41;
        this.t.a.setPreferredDevice(r13);
    L41:
        this.F = true;
        int r14 = this.t.a.getAudioSessionId();
        if (r14 == this.Q) goto L44;
        r2 = true;
    L44:
        this.Q = r14;
        rm r15 = this.n;
        if (r15 == null) goto L52;
        int r16 = ((em) this.p.e).a;
        r15.j(new pa(15));
        if (r2 == false) goto L52;
        this.R = true;
        qj0 r17 = this.p;
        dm r18 = ((em) r17.e).a();
        r18.h = this.Q;
        this.p = new qj0((tb1) r17.c, (tb1) r17.d, r17.a, r17.b, new em(r18), (fm) r17.f);
        qj0 r19 = this.o;
        if (r19 == null) goto L51;
        dm r20 = ((em) r19.e).a();
        r20.h = this.Q;
        this.o = new qj0((tb1) r19.c, (tb1) r19.d, r19.a, r19.b, new em(r20), (fm) r19.f);
    L51:
        this.n.b(this.Q);
    L52:
        return true;
    L14:
        e = move-exception;
        em r21 = (em) this.p.e;
        if (r21.f <= 1000000) goto L56;
        dm r22 = r21.a();
        r22.f = 1000000;
        em r110 = new em(r22);
        r1 = b(r110);     // Catch: AudioSink$InitializationException -> L53
        qj0 r23 = this.p;     // Catch: AudioSink$InitializationException -> L53
        this.p = new qj0((tb1) r23.c, (tb1) r23.d, r23.a, r23.b, r110, (fm) r23.f);     // Catch: AudioSink$InitializationException -> L53
    L53:
        e = move-exception;
        e.addSuppressed(e);
    L56:
        if (((em) this.p.e).e == false) goto L64;
        this.X = true;
        throw e;
    L64:
        throw e;
    }

    public final boolean p() {
        if (this.t == null) goto L6;
        return true;
    L6:
        return false;
    }

    public final void q() {
        this.O = false;
        if (p() == false) goto L13;
        an r6 = this.t;
        en r1 = r6.e;
        r1.k = 0;
        r1.t = 0;
        r1.s = 0;
        r1.l = 0;
        r1.y = -9223372036854775807L;
        r1.z = -9223372036854775807L;
        if (r1.u != (-9223372036854775807L)) goto L7;
        r1.h.a(0);
    L7:
        r1.w = r1.a();
        if (r6.j == true) goto L10;
    L11:
        r6.a.pause();
        return;
    L10:
        if (r6.c() == true) goto L11;
        return;
    }

    public final void r() {
        this.O = true;
        if (p() == false) goto L13;
        an r5 = this.t;
        en r0 = r5.e;
        if (r0.u == (-9223372036854775807L)) goto L7;
        r0.b.getClass();
        r0.u = f35.Q(SystemClock.elapsedRealtime());
    L7:
        long r1 = r0.a();
        r0.j = f35.Y(r0.e, r1);
        r0.h.a(0);
        if (r5.j == true) goto L10;
    L11:
        r5.a.play();
        return;
    L10:
        if (r5.c() == true) goto L11;
        return;
    }

    public final void s() {
        if (this.M == true) goto L12;
        this.M = true;
        if (this.t.c() == false) goto L7;
        this.N = false;
    L7:
        an r7 = this.t;
        if (r7.j == true) goto L13;
        r7.j = true;
        en r0 = r7.e;
        long r3 = r7.b();
        r0.w = r0.a();
        r0.b.getClass();
        r0.u = f35.Q(SystemClock.elapsedRealtime());
        r0.x = r3;
        r7.a.stop();
        r7.o = 0;
        return;
    L13:
        return;
    }

    public final void t() {
        if (this.L == false) goto L5;
        return;
    L5:
        if (p() == true) goto L7;
        return;
    L7:
        if (e() == false) goto L12;
        s();
        this.L = true;
        return;
    }

    public final void u(long r4) {
        d(r4);
        if (this.K == null) goto L6;
        return;
    L6:
        if (this.q.d() == true) goto L12;
        ByteBuffer r0 = this.I;
        if (r0 == null) goto L36;
        A(r0);
        d(r4);
        return;
    L36:
        return;
    L12:
        if (this.q.c() == true) goto L50;
    L13:
        fm r1 = this.q;
        if (r1.d() == true) goto L16;
        ByteBuffer r2 = im.a;
    L21:
        if (r2.hasRemaining() == false) goto L25;
        A(r2);
        d(r4);
        if (this.K == null) goto L13;
        return;
    L25:
        ByteBuffer r3 = this.I;
        if (r3 == null) goto L52;
        if (r3.hasRemaining() == false) goto L53;
        fm r5 = this.q;
        ByteBuffer r6 = this.I;
        if (r5.d() == false) goto L12;
        if (r5.d == true) goto L12;
        r5.e(r6);
        goto L12
    L53:
        return;
    L52:
        return;
    L16:
        ByteBuffer r7 = r1.c[r1.b()];
        if (r7.hasRemaining() == false) goto L19;
        r2 = r7;
        goto L21
    L19:
        r1.e(im.a);
        r2 = r1.c[r1.b()];
        goto L21
    }

    public final void v() {
        if (this.p == null) goto L12;
        qj0 r0 = this.o;
        if (r0 == null) goto L14;
        this.p = r0;
        this.o = null;
    L14:
        em r7 = this.r.c(i((tb1) this.p.d));     // Catch: AudioOutputProvider$ConfigurationException -> L9
        qj0 r1 = this.p;
        this.p = new qj0((tb1) r1.c, (tb1) r1.d, r1.a, r1.b, r7, (fm) r1.f);
    L9:
        e = move-exception;
        throw new IllegalStateException(new AudioSink$ConfigurationException(e, (tb1) this.p.c));
    L12:
        f();
    }

    public final void w() {
        f();
        vw1 r0 = this.g.m(0);
    L4:
        if (r0.hasNext() == false) goto L6;
        ((im) r0.next()).reset();
        goto L4
    L6:
        this.e.reset();
        this.f.reset();
        fm r1 = this.q;
        if (r1 == null) goto L13;
        yw1 r2 = r1.a;
        int r3 = 0;
    L10:
        if (r3 >= r2.size()) goto L12;
        im r4 = (im) r2.get(r3);
        hm r5 = hm.b;
        r4.flush();
        r4.reset();
        r3 = r3 + 1;
        goto L10
    L12:
        r1.b.clear();
        r1.c = new ByteBuffer[0];
        gm r6 = gm.e;
        r1.d = false;
    L13:
        this.O = false;
        this.X = false;
    }

    public final void x() {
        if (p() == false) goto L13;
        an r0 = this.t;
        qh3 r1 = this.x;
        AudioTrack r2 = r0.a;
        r2.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(r1.a).setPitch(r1.b).setAudioFallbackMode(2));     // Catch: IllegalArgumentException -> L7
    L9:
        en r3 = r0.e;
        r3.i = r2.getPlaybackParams().getSpeed();
        r3.h.a(0);
        r3.k = 0;
        r3.t = 0;
        r3.s = 0;
        r3.l = 0;
        r3.y = -9223372036854775807L;
        r3.z = -9223372036854775807L;
        PlaybackParams r4 = this.t.a.getPlaybackParams();
        this.x = new qh3(r4.getSpeed(), r4.getPitch());
        return;
    L7:
        e = move-exception;
        l93.r0("AudioTrackAudioOutput", "Failed to set playback params", e);
        goto L9
    }

    public final void y(int r3) {
        boolean r1 = false;
        if (this.R == false) goto L8;
        if (this.Q != r3) goto L14;
        this.R = false;
        goto L8
    L14:
        return;
    L8:
        if (this.Q == r3) goto L15;
        this.Q = r3;
        if (r3 == 0) goto L12;
        r1 = true;
    L12:
        this.P = r1;
        v();
        return;
    }

    public final void z(xn r2) {
        if (this.S.equals(r2) == false) goto L5;
        return;
    L5:
        r2.getClass();
        if (this.t == null) goto L8;
        this.S.getClass();
    L8:
        this.S = r2;
    }
}
