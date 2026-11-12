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
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class q41 implements Handler.Callback, mo2, dw4, c55 {
    public static final long u0 = 0;
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

    static {
        u0 = f35.i0(10000);
    }

    public q41(Context r14, kq[] r15, kq[] r16, pn0 r17, ew4 r18, cd2 r19, cp r20, int r21, boolean r22, nj0 r23, n84 r24, ul0 r25, long r26, Looper r28, vp4 r29, u31 r30, ik3 r31, final c55 r32, boolean r33) {
        p31 r7 = p31.a;
        this.r0 = -9223372036854775807L;
        this.E = r30;
        this.q = r17;
        this.r = r18;
        this.s = r19;
        this.t = r20;
        this.d0 = r21;
        this.e0 = r22;
        this.P = r24;
        this.H = r25;
        this.I = r26;
        boolean r11 = false;
        this.Y = false;
        this.D = r29;
        this.J = r31;
        this.q0 = r7;
        this.K = r23;
        this.t0 = 1.0f;
        this.Q = i74.b;
        this.O = r33;
        this.p0 = -9223372036854775807L;
        this.b0 = -9223372036854775807L;
        this.z = r19.i(r31);
        this.A = r19.d(r31);
        yt4 r2 = cu4.a;
        ph3 r3 = ph3.k(r18);
        this.V = r3;
        this.W = new n41(r3);
        this.o = new kq[r15.length];
        this.p = new boolean[r15.length];
        r17.getClass();
        this.n = new ez3[r15.length];
        int r4 = 0;
        boolean r8 = false;
    L4:
        if (r4 >= r15.length) goto L17;
        kq r9 = r15[r4];
        r9.r = r4;
        r9.s = r31;
        r9.t = r29;
        this.o[r4] = r9;
        kq r10 = this.o[r4];
        Object r12 = r10.n;
        monitor-enter(r12);
        r10.E = r17;     // Catch: Throwable -> L13
        monitor-exit(r12);     // Catch: Throwable -> L13
        kq r13 = r16[r4];
        if (r13 == null) goto L12;
        r13.r = r4;
        r13.s = r31;
        r13.t = r29;
        r8 = true;
    L12:
        ez3[] r27 = this.n;
        kq r110 = r15[r4];
        ez3 r111 = new ez3();
        r111.e = r110;
        r111.c = r4;
        r111.f = r13;
        r111.d = 0;
        r111.a = false;
        r111.b = false;
        r27[r4] = r111;
        r4 = r4 + 1;
    L13:
        th = move-exception;
        throw th;
    L17:
        this.M = r8;
        this.B = new xl0(this, r29);
        this.C = new ArrayList();
        this.x = new bu4();
        this.y = new zt4();
        if (r17.a != null) goto L20;
        boolean r0 = true;
    L21:
        rr2.w(r0);
        r17.a = this;
        r17.b = r20;
        this.n0 = true;
        yp4 r1 = r29.a(r28, null);
        this.L = r1;
        this.F = new ro2(r23, r1, new cn(12, this));
        this.G = new fo1(this, r23, r1, r31);
        gc r5 = new gc();
        this.v = r5;
        Object r6 = r5.b;
        monitor-enter(r6);
    L31:
        th = move-exception;
        throw th;
    L24:
        if (((Looper) r5.c) == null) goto L26;
    L33:
        r5.a++;     // Catch: Throwable -> L31
        Looper r34 = (Looper) r5.c;     // Catch: Throwable -> L31
        monitor-exit(r6);     // Catch: Throwable -> L31
        this.w = r34;
        yp4 r35 = r29.a(r34, this);
        this.u = r35;
        this.N = new tl(r14, r34, this);
        r35.b(35, new j41(this, r32)).b();
        return;
    L26:
        if (r5.a == 0) goto L28;
    L30:
        rr2.w(r11);     // Catch: Throwable -> L31
        HandlerThread r36 = new HandlerThread("ExoPlayer:Playback", -16);     // Catch: Throwable -> L31
        r5.d = r36;     // Catch: Throwable -> L31
        r36.start();     // Catch: Throwable -> L31
        r5.c = ((HandlerThread) r5.d).getLooper();     // Catch: Throwable -> L31
        goto L33
    L28:
        if (((HandlerThread) r5.d) != null) goto L30;
        r11 = true;
        goto L30
    L20:
        r0 = false;
        goto L21
    }

    public static boolean A(oo2 r6) {
        if (r6 != null) goto L23;
    L21:
        return false;
    L23:
        no2 r1 = r6.a;     // Catch: IOException -> L22
        if (r6.e == true) goto L7;
        r1.h();     // Catch: IOException -> L22
    L14:
        if (r6.e == true) goto L16;
        long r2 = 0;
    L18:
        if (r2 == Long.MIN_VALUE) goto L21;
        return true;
    L16:
        r2 = r1.d();
        goto L18
    L7:
        q44[] r3 = r6.c;     // Catch: IOException -> L22
        int r4 = r3.length;     // Catch: IOException -> L22
        int r5 = 0;
    L8:
        if (r5 >= r4) goto L14;
        q44 r7 = r3[r5];     // Catch: IOException -> L22
        if (r7 == null) goto L12;
        r7.s();     // Catch: IOException -> L22
    L12:
        r5 = r5 + 1;
        goto L8
    }

    public static Pair T(cu4 r9, p41 r10, boolean r11, int r12, boolean r13, bu4 r14, zt4 r15) {
        cu4 r0 = r10.a;
        if (r9.p() == false) goto L6;
        return null;
    L6:
        if (r0.p() == false) goto L8;
        cu4 r2 = r9;
    L31:
        Pair r16 = r2.i(r14, r15, r10.b, r10.c);     // Catch: IndexOutOfBoundsException -> L30
        if (r9.equals(r2) == false) goto L14;
    L21:
        return r16;
    L14:
        if (r9.b(r16.first) == (-1)) goto L23;
        if (r2.g(r16.first, r15).f == false) goto L21;
        if (r2.m(r15.c, r14, 0).m != r2.b(r16.first)) goto L21;
        return r9.i(r14, r15, r9.g(r16.first, r15).c, r10.c);
    L23:
        if (r11 == false) goto L28;
        int r6 = U(r14, r15, r12, r13, r16.first, r2, r9);
        if (r6 != (-1)) goto L27;
        return null;
    L27:
        return r9.i(r14, r15, r6, -9223372036854775807L);
    L28:
        return null;
    L35:
        return null;
    L8:
        r2 = r0;
        goto L31
    }

    public static int U(bu4 r12, zt4 r13, int r14, boolean r15, Object r16, cu4 r17, cu4 r18) {
        cu4 r1 = r17;
        Object r4 = r1.m(r1.g(r16, r13).c, r12, 0).a;
        int r5 = 0;
    L4:
        if (r5 >= r18.o()) goto L9;
        if (r18.m(r5, r12, 0).a.equals(r4) == true) goto L7;
        r5 = r5 + 1;
        goto L4
    L7:
        return r5;
    L9:
        int r0 = r1.b(r16);
        int r7 = r1.h();
        int r11 = -1;
        int r10 = 0;
    L10:
        if (r10 >= r7) goto L16;
        if (r11 != (-1)) goto L16;
        cu4 r6 = r1;
        int r2 = r6.d(r0, r13, r12, r14, r15);
        if (r2 == (-1)) goto L16;
        r11 = r18.b(r6.l(r2));
        r10 = r10 + 1;
        r1 = r6;
        r0 = r2;
    L16:
        if (r11 != (-1)) goto L19;
        return -1;
    L19:
        return r18.f(r11, r13, false).c;
    }

    public final void A0(int r7, int r8, int r9, boolean r10) {
        if (r10 == false) goto L6;
        if (r7 == (-1)) goto L6;
        boolean r11 = true;
    L8:
        if (r7 != (-1)) goto L10;
        r9 = 2;
    L12:
        boolean r0 = this.R;
        if (r7 != 0) goto L15;
        r8 = 1;
    L19:
        ph3 r12 = this.V;
        if (r12.l == r11) goto L22;
    L26:
        this.V = r12.e(r9, r8, r11);
        D0(false, false);
        ro2 r13 = this.F;
        oo2 r14 = r13.i;
    L27:
        if (r14 == null) goto L36;
        t41[] r15 = (t41[]) r14.o.q;
        int r1 = r15.length;
        int r4 = 0;
    L29:
        if (r4 >= r1) goto L34;
        t41 r5 = r15[r4];
        if (r5 == null) goto L33;
        r5.f(r11);
    L33:
        r4 = r4 + 1;
        goto L29
    L34:
        r14 = r14.m;
        goto L27
    L36:
        if (r0() == true) goto L42;
        v0();
        B0();
        ph3 r16 = this.V;
        if (r16.p == false) goto L40;
        this.V = r16.i(false);
    L40:
        r13.n(this.k0);
        return;
    L42:
        int r17 = this.V.e;
        yp4 r18 = this.u;
        if (r17 != 3) goto L46;
        xl0 r19 = this.B;
        r19.s = true;
        r19.n.g();
        t0();
        r18.g(2);
        return;
    L46:
        if (r17 != 2) goto L53;
        r18.g(2);
        return;
    L53:
        return;
    L22:
        if (r12.n != r8) goto L26;
        if (r12.m != r9) goto L26;
        return;
    L15:
        if (r8 != 1) goto L19;
        if (r0 == false) goto L18;
        r8 = 4;
        goto L19
    L18:
        r8 = 0;
        goto L19
    L10:
        if (r9 != 2) goto L12;
        r9 = 1;
    L6:
        r11 = false;
        goto L8
    }

    public final boolean B(int r5, mt2 r6) {
        ro2 r0 = this.F;
        oo2 r1 = r0.k;
        if (r1 != null) goto L5;
    L24:
        return false;
    L5:
        if (r1.g.a.equals(r6) == false) goto L24;
        ez3 r4 = this.n[r5];
        oo2 r7 = r0.k;
        int r8 = r4.d;
        if (r8 == 2) goto L12;
        if (r8 == 4) goto L12;
    L14:
        boolean r9 = false;
    L16:
        if (r4.d == 3) goto L18;
    L20:
        boolean r10 = false;
    L21:
        if (r9 == true) goto L23;
        if (r10 == false) goto L24;
    L23:
        return true;
    L18:
        if (r4.d(r7) != ((kq) r4.f)) goto L20;
        r10 = true;
    L12:
        if (r4.d(r7) != ((kq) r4.e)) goto L14;
        r9 = true;
        goto L16
    }

    public final void B0() {
        oo2 r1 = this.F.i;
        if (r1 != null) goto L6;
        return;
    L6:
        if (r1.e == false) goto L8;
        long r2 = r1.a.l();
    L9:
        int r14 = 1;
        if (r2 != (-9223372036854775807L)) goto L12;
        xl0 r3 = this.B;
        if (r1 == this.F.j) goto L20;
        boolean r4 = true;
    L21:
        zq2 r5 = r3.n;
        kq r6 = r3.p;
        if (r6 != null) goto L24;
    L47:
        r3.r = true;
        if (r3.s == false) goto L50;
        r5.g();
    L50:
        long r7 = r3.j();
        this.k0 = r7;
        long r8 = r7 - r1.p;
        long r9 = this.V.s;
        if (this.C.isEmpty() == true) goto L74;
        if (this.V.b.b() == true) goto L74;
        if (this.n0 == false) goto L58;
        this.n0 = false;
    L58:
        ph3 r10 = this.V;
        r10.a.b(r10.b.a);
        int r11 = Math.min(this.m0, this.C.size());
        if (r11 <= 0) goto L66;
        if (this.C.get(r11 - 1) == null) goto L66;
        kf2.k();
        return;
    L66:
        if (r11 < this.C.size()) goto L68;
    L72:
        this.m0 = r11;
        goto L74
    L68:
        if (this.C.get(r11) == null) goto L72;
        kf2.k();
        return;
    L74:
        if (this.B.k() == false) goto L76;
        boolean r12 = !this.W.e;
        ph3 r13 = this.V;
        this.V = z(r13.b, r8, r13.c, r8, r12, 6);
    L77:
        this.V.q = this.F.l.d();
        ph3 r15 = this.V;
        r15.r = q(r15.q);
        ph3 r16 = this.V;
        if (r16.l == true) goto L80;
        return;
    L80:
        if (r16.e == 3) goto L82;
        return;
    L82:
        if (s0(r16.a, r16.b) == false) goto L126;
        ph3 r17 = this.V;
        float r18 = 1.0f;
        if (r17.o.a != 1.0f) goto L127;
        ul0 r19 = this.H;
        long r20 = n(r17.a, r17.b.a, r17.s);
        long r21 = this.V.r;
        if (r19.c == (-9223372036854775807L)) goto L118;
        long r22 = r20 - r21;
        long r23 = r19.m;
        if (r23 != (-9223372036854775807L)) goto L91;
        r19.m = r22;
        r19.n = 0;
    L93:
        if (r19.l == (-9223372036854775807L)) goto L97;
        long r110 = 1000;
        if ((SystemClock.elapsedRealtime() - r19.l) >= 1000) goto L98;
        r18 = r19.k;
    L98:
        r19.l = SystemClock.elapsedRealtime();
        long r24 = (r19.n * 3) + r19.m;
        if (r19.h <= r24) goto L107;
        float r25 = f35.Q(r110);
        float r111 = 1.0E-7f;
        long[] r26 = {r24, r19.e, r19.h - (((long) ((r19.k - 1.0f) * r25)) + ((long) ((r19.i - 1.0f) * r25)))};
        long r27 = r26[0];
    L101:
        if (r14 >= 3) goto L106;
        long r112 = r26[r14];
        if (r112 <= r27) goto L105;
        r27 = r112;
    L105:
        r14 = r14 + 1;
        goto L101
    L106:
        r19.h = r27;
    L112:
        long r28 = r20 - r19.h;
        if (Math.abs(r28) >= r19.a) goto L115;
        r19.k = 1.0f;
    L116:
        r18 = r19.k;
        goto L118
    L115:
        r19.k = f35.i((r111 * r28) + 1.0f, r19.j, r19.i);
        goto L116
    L107:
        r111 = 1.0E-7f;
        long r29 = f35.k(r20 - ((long) (Math.max(0.0f, r19.k - 1.0f) / 1.0E-7f)), r19.h, r24);
        r19.h = r29;
        long r30 = r19.g;
        if (r30 == (-9223372036854775807L)) goto L112;
        if (r29 <= r30) goto L112;
        r19.h = r30;
        goto L112
    L97:
        r110 = 1000;
        goto L98
    L91:
        long r31 = Math.max(r22, (long) ((r22 * 9.999871E-4f) + (r23 * 0.999f)));
        r19.m = r31;
        r19.n = (long) ((9.999871E-4f * Math.abs(r22 - r31)) + (r19.n * 0.999f));
    L118:
        if (this.B.i().a == r18) goto L128;
        qh3 r32 = new qh3(r18, this.V.o.b);
        this.u.f(16);
        this.B.d(r32);
        y(this.V.o, this.B.i().a, false, false);
        return;
    L128:
        return;
    L127:
        return;
    L126:
        return;
    L76:
        ph3 r33 = this.V;
        r33.s = r8;
        r33.t = SystemClock.elapsedRealtime();
        goto L77
    L24:
        if (r6.m() == true) goto L47;
        if (r4 == false) goto L29;
        if (r3.p.u != 2) goto L47;
    L29:
        if (r3.p.o() == true) goto L34;
        if (r4 == true) goto L47;
        if (r3.p.l() == true) goto L47;
    L34:
        yj2 r34 = r3.q;
        r34.getClass();
        long r35 = r34.j();
        if (r3.r == true) goto L37;
    L44:
        r5.f(r35);
        qh3 r36 = r34.i();
        if (r36.equals((qh3) r5.r) == true) goto L50;
        r5.d(r36);
        r3.o.u.b(16, r36).b();
        goto L50
    L37:
        if (r35 < r5.j()) goto L39;
        r3.r = false;
        if (r3.s == false) goto L44;
        r5.g();
        goto L44
    L39:
        if (r5.p == false) goto L50;
        r5.f(r5.j());
        r5.p = false;
        goto L50
    L20:
        r4 = false;
        goto L21
    L12:
        if (r1.g() == true) goto L14;
        this.F.o(r1);
        v(false);
        D();
    L14:
        R(true, r2);
        if (r2 == this.V.s) goto L77;
        ph3 r37 = this.V;
        this.V = z(r37.b, r2, r37.c, r2, true, 5);
        goto L77
    L8:
        r2 = -9223372036854775807L;
        goto L9
    }

    public final boolean C() {
        oo2 r0 = this.F.i;
        long r1 = r0.g.e;
        if (r0.e == true) goto L5;
        return false;
    L5:
        if (r1 != (-9223372036854775807L)) goto L7;
        return true;
    L7:
        if (this.V.s >= r1) goto L9;
        return true;
    L9:
        if (r0() == true) goto L16;
        return true;
    L16:
        return false;
    }

    public final void C0(cu4 r9, mt2 r10, cu4 r11, mt2 r12, long r13, boolean r15) {
        boolean r0 = s0(r9, r10);
        Object r1 = r10.a;
        if (r0 == false) goto L5;
        zt4 r14 = this.y;
        int r2 = r9.g(r1, r14).c;
        bu4 r3 = this.x;
        r9.n(r2, r3);
        an2 r4 = r3.i;
        ul0 r5 = this.H;
        r5.getClass();
        r5.c = f35.Q(r4.a);
        r5.f = f35.Q(r4.b);
        r5.g = f35.Q(r4.c);
        float r6 = r4.d;
        if (r6 != (-3.4028235E38f)) goto L16;
        r6 = 0.97f;
    L16:
        r5.j = r6;
        float r7 = r4.e;
        if (r7 != (-3.4028235E38f)) goto L20;
        r7 = 1.03f;
    L20:
        r5.i = r7;
        if (r6 == 1.0f) goto L23;
    L25:
        r5.a();
        if (r13 == (-9223372036854775807L)) goto L29;
        r5.d = n(r9, r1, r13);
        r5.a();
        return;
    L29:
        Object r8 = r3.a;
        if (r11.p() == true) goto L32;
        Object r16 = r11.m(r11.g(r12.a, r14).c, r3, 0).a;
    L34:
        if (Objects.equals(r16, r8) == false) goto L38;
        if (r15 == true) goto L38;
        return;
    L38:
        r5.d = -9223372036854775807L;
        r5.a();
        return;
    L32:
        r16 = null;
        goto L34
    L23:
        if (r7 != 1.0f) goto L25;
        r5.c = -9223372036854775807L;
        goto L25
    L5:
        if (r10.b() == false) goto L7;
        qh3 r17 = qh3.d;
    L8:
        xl0 r18 = this.B;
        if (r18.i().equals(r17) == true) goto L37;
        this.u.f(16);
        r18.d(r17);
        y(this.V.o, r17.a, false, false);
        return;
    L37:
        return;
    L7:
        r17 = this.V.o;
        goto L8
    }

    public final void D() {
        boolean r6 = false;
        if (A(this.F.l) == true) goto L5;
        boolean r1 = false;
    L28:
        this.c0 = r1;
        if (r1 == false) goto L48;
        oo2 r2 = this.F.l;
        r2.getClass();
        od2 r7 = new od2();
        r7.a = this.k0 - r2.p;
        float r8 = this.B.i().a;
        if (r8 <= 0.0f) goto L33;
    L36:
        boolean r9 = true;
    L37:
        rr2.l(r9);
        r7.b = r8;
        long r10 = this.b0;
        if (r10 < 0) goto L40;
    L43:
        boolean r3 = true;
    L44:
        rr2.l(r3);
        r7.c = r10;
        pd2 r4 = new pd2(r7);
        if (r2.m != null) goto L47;
        r6 = true;
    L47:
        rr2.w(r6);
        r2.a.o(r4);
        goto L48
    L40:
        if (r10 == (-9223372036854775807L)) goto L43;
        r3 = false;
        goto L44
    L33:
        if (r8 == (-3.4028235E38f)) goto L36;
        r9 = false;
    L48:
        w0();
        return;
    L5:
        oo2 r5 = this.F.l;
        if (r5.e == true) goto L8;
        long r11 = 0;
    L9:
        long r15 = q(r11);
        oo2 r12 = this.F.i;
        long r13 = this.k0;
        long r14 = r5.p;
        if (r5 != r12) goto L12;
    L11:
        long r16 = r13 - r14;
        if (s0(this.V.a, r5.g.a) == false) goto L16;
        long r19 = this.H.h;
    L17:
        ik3 r17 = this.J;
        cu4 r18 = this.V.a;
        mt2 r110 = r5.g.a;
        float r20 = this.B.i().a;
        boolean r21 = this.V.l;
        bd2 r22 = new bd2(r17, r18, r110, r16, r15, r20, this.a0, r19);
        r1 = this.s.h(r22);
        oo2 r23 = this.F.i;
        if (r1 == true) goto L28;
        if (r23.e == false) goto L28;
        if (r15 >= 500000) goto L28;
        if (this.z <= 0) goto L26;
    L27:
        r23.a.k(false, this.V.s);
        r1 = this.s.h(r22);
        goto L28
    L26:
        if (this.A == false) goto L28;
    L16:
        r19 = -9223372036854775807L;
        goto L17
    L12:
        r13 = r13 - r14;
        r14 = r5.g.b;
        goto L11
    L8:
        r11 = r5.a.d();
        goto L9
    }

    public final void D0(boolean r1, boolean r2) {
        this.a0 = r1;
        if (r1 == false) goto L6;
        if (r2 == true) goto L6;
        this.D.getClass();
        long r3 = SystemClock.elapsedRealtime();
    L7:
        this.b0 = r3;
        return;
    L6:
        r3 = -9223372036854775807L;
        goto L7
    }

    public final void E() {
        ro2 r0 = this.F;
        r0.l();
        oo2 r1 = r0.m;
        if (r1 == null) goto L41;
        no2 r2 = r1.a;
        if (r1.d == false) goto L9;
        if (r1.e == true) goto L9;
        return;
    L9:
        if (r2.f() == true) goto L43;
        cu4 r5 = this.V.a;
        mt2 r6 = r1.g.a;
        if (r1.e == false) goto L13;
        long r7 = r2.q();
    L15:
        if (this.s.a(this.J, r5, r6, r7) == false) goto L44;
        boolean r3 = true;
        if (r1.d == true) goto L21;
        long r4 = r1.g.b;
        r1.d = true;
        r2.m(this, r4);
        return;
    L21:
        od2 r8 = new od2();
        r8.a = this.k0 - r1.p;
        float r9 = this.B.i().a;
        if (r9 <= 0.0f) goto L24;
    L27:
        boolean r10 = true;
    L28:
        rr2.l(r10);
        r8.b = r9;
        long r11 = this.b0;
        if (r11 < 0) goto L31;
    L34:
        boolean r12 = true;
    L35:
        rr2.l(r12);
        r8.c = r11;
        pd2 r13 = new pd2(r8);
        if (r1.m == null) goto L39;
        r3 = false;
    L39:
        rr2.w(r3);
        r2.o(r13);
        return;
    L31:
        if (r11 == (-9223372036854775807L)) goto L34;
        r12 = false;
        goto L35
    L24:
        if (r9 == (-3.4028235E38f)) goto L27;
        r10 = false;
        goto L28
    L44:
        return;
    L13:
        r7 = 0;
        goto L15
    L43:
        return;
    }

    public final void F() {
        n41 r0 = this.W;
        ph3 r1 = this.V;
        boolean r2 = r0.d;
        if (((ph3) r0.f) == r1) goto L5;
        boolean r3 = true;
    L6:
        boolean r4 = r2 | r3;
        r0.d = r4;
        r0.f = r1;
        if (r4 == false) goto L10;
        i41 r5 = this.E.o;
        r5.k.d(new k6(24, r5, r0));
        this.W = new n41(this.V);
        return;
    L10:
        return;
    L5:
        r3 = false;
        goto L6
    }

    public final void G(int r11) {
        ez3 r1 = this.n[r11];
        oo2 r0 = this.F.i;     // Catch: RuntimeException -> L5 Throwable -> L7
        r0.getClass();     // Catch: RuntimeException -> L5 Throwable -> L7
        kq r2 = r1.d(r0);     // Catch: RuntimeException -> L5 Throwable -> L7
        r2.getClass();     // Catch: RuntimeException -> L5 Throwable -> L7
        q44 r3 = r2.v;     // Catch: RuntimeException -> L5 Throwable -> L7
        r3.getClass();     // Catch: RuntimeException -> L5 Throwable -> L7
        r3.s();     // Catch: RuntimeException -> L5 Throwable -> L7
        return;
    L7:
        e = move-exception;
        int r4 = ((kq) r1.e).o;
        if (r4 != 3) goto L11;
    L14:
        ew4 r5 = this.F.i.o;
        l93.G("ExoPlayerImplInternal", "Disabling track due to error: ".concat(tb1.c(((t41[]) r5.q)[r11].m())), e);
        ew4 r6 = new ew4((dz3[]) ((dz3[]) r5.p).clone(), (t41[]) ((t41[]) r5.q).clone(), (jw4) r5.r, r5.s);
        ((dz3[]) r6.p)[r11] = null;
        ((t41[]) r6.q)[r11] = null;
        i(r11);
        oo2 r7 = this.F.i;
        r7.a(r6, this.V.s, false, new boolean[r7.j.length]);
        return;
    L11:
        if (r4 == 5) goto L14;
        throw e;
    }

    public final void H(int r3, boolean r4) {
        boolean[] r0 = this.p;
        if (r0[r3] == r4) goto L6;
        r0[r3] = r4;
        ul r1 = new ul(this, r3, r4);
        this.L.d(r1);
        return;
    }

    public final void I() {
        w(this.G.f(), true);
    }

    public final void J(m41 r9) {
        this.W.e(1);
        int r0 = r9.a;
        int r2 = r9.b;
        int r3 = r9.c;
        pd4 r10 = r9.d;
        fo1 r4 = this.G;
        ArrayList r5 = (ArrayList) r4.c;
        if (r0 < 0) goto L9;
        if (r0 > r2) goto L9;
        if (r2 > r5.size()) goto L9;
        if (r3 < 0) goto L9;
        boolean r7 = true;
    L10:
        rr2.l(r7);
        r4.k = r10;
        if (r0 == r2) goto L18;
        if (r0 == r3) goto L18;
        int r11 = Math.min(r0, r3);
        int r1 = Math.max(((r2 - r0) + r3) - 1, r2 - 1);
        int r8 = ((bu2) r5.get(r11)).d;
        f35.P(r5, r0, r2, r3);
    L15:
        if (r11 > r1) goto L17;
        bu2 r6 = (bu2) r5.get(r11);
        r6.d = r8;
        r8 = r8 + r6.a.o.e.o();
        r11 = r11 + 1;
        goto L15
    L17:
        cu4 r12 = r4.f();
    L19:
        w(r12, false);
        return;
    L18:
        r12 = r4.f();
    L9:
        r7 = false;
        goto L10
    }

    public final void K() {
        this.W.e(1);
        int r0 = 0;
        P(false, false, false, true);
        this.s.e(this.J);
        if (this.V.a.p() == false) goto L5;
        int r2 = 4;
    L6:
        n0(r2);
        ph3 r3 = this.V;
        boolean r4 = r3.l;
        A0(this.N.c(r3.e, r4), r3.n, r3.m, r4);
        rw4 r5 = this.t.z();
        fo1 r6 = this.G;
        ArrayList r7 = (ArrayList) r6.c;
        rr2.w(!r6.a);
        r6.l = r5;
    L8:
        if (r0 >= r7.size()) goto L10;
        bu2 r8 = (bu2) r7.get(r0);
        r6.l(r8);
        ((HashSet) r6.h).add(r8);
        r0 = r0 + 1;
        goto L8
    L10:
        r6.a = true;
        this.u.g(2);
        return;
    L5:
        r2 = 2;
        goto L6
    }

    public final void L(q90 r7) {
        gc r0 = this.v;
        yp4 r1 = this.u;
        P(true, false, true, false);     // Catch: Throwable -> L6
        M();     // Catch: Throwable -> L6
        this.s.b(this.J);     // Catch: Throwable -> L6
        tl r4 = this.N;     // Catch: Throwable -> L6
        r4.c = null;     // Catch: Throwable -> L6
        r4.a();     // Catch: Throwable -> L6
        r4.b(0);     // Catch: Throwable -> L6
        this.q.g();     // Catch: Throwable -> L6
        n0(1);     // Catch: Throwable -> L6
        r1.e();
        r0.c();
        r7.d();
        return;
    L6:
        th = move-exception;
        r1.e();
        r0.c();
        r7.d();
        throw th;
    }

    public final void M() {
        int r1 = 0;
    L4:
        if (r1 >= this.n.length) goto L25;
        kq r2 = this.o[r1];
        Object r3 = r2.n;
        monitor-enter(r3);
        r2.E = null;     // Catch: Throwable -> L22
        monitor-exit(r3);     // Catch: Throwable -> L22
        ez3 r4 = this.n[r1];
        kq r5 = (kq) r4.e;
        boolean r6 = true;
        if (r5.u != 0) goto L13;
        boolean r7 = true;
    L14:
        rr2.w(r7);
        r5.s();
        r4.a = false;
        kq r8 = (kq) r4.f;
        if (r8 == null) goto L21;
        if (r8.u == 0) goto L20;
        r6 = false;
    L20:
        rr2.w(r6);
        r8.s();
        r4.b = false;
    L21:
        r1 = r1 + 1;
        goto L4
    L13:
        r7 = false;
    L22:
        th = move-exception;
        throw th;
    }

    public final void N(int r5, int r6, pd4 r7) {
        boolean r1 = true;
        this.W.e(1);
        fo1 r0 = this.G;
        r0.getClass();
        if (r5 < 0) goto L8;
        if (r5 > r6) goto L8;
        if (r6 > ((ArrayList) r0.c).size()) goto L8;
    L9:
        rr2.l(r1);
        r0.k = r7;
        r0.o(r5, r6);
        w(r0.f(), false);
        return;
    L8:
        r1 = false;
        goto L9
    }

    public final void O() {
        float r1 = this.B.i().a;
        ro2 r2 = this.F;
        oo2 r3 = r2.i;
        oo2 r4 = r2.j;
        ew4 r5 = null;
        oo2 r11 = r3;
        boolean r6 = true;
    L3:
        if (r11 == null) goto L92;
        if (r11.e == false) goto L93;
        ph3 r7 = this.V;
        ew4 r12 = r11.j(r1, r7.a, r7.l);
        if (r11 != this.F.i) goto L10;
        ew4 r14 = r12;
    L11:
        ew4 r8 = r11.o;
        t41[] r9 = (t41[]) r12.q;
        if (r8 == null) goto L26;
        if (((t41[]) r8.q).length != r9.length) goto L26;
        int r10 = 0;
    L18:
        if (r10 >= r9.length) goto L23;
        if (r12.m(r8, r10) == false) goto L26;
        r10 = r10 + 1;
        goto L18
    L23:
        if (r11 != r4) goto L25;
        r6 = false;
    L25:
        r11 = r11.m;
        r5 = r14;
    L26:
        ro2 r13 = this.F;
        if (r6 == false) goto L66;
        oo2 r15 = r13.i;
        if ((r13.o(r15) & 1) == 0) goto L31;
        boolean r17 = true;
    L32:
        boolean[] r16 = new boolean[this.n.length];
        r14.getClass();
        long r18 = r15.a(r14, this.V.s, r17, r16);
        ph3 r19 = this.V;
        if (r19.e != 4) goto L35;
    L37:
        boolean r20 = false;
    L38:
        ph3 r21 = this.V;
        int r110 = 4;
        this.V = z(r21.b, r18, r21.c, r21.d, r20, 5);
        if (r20 == false) goto L41;
        R(true, r18);
    L41:
        h();
        boolean[] r22 = new boolean[this.n.length];
        int r23 = 0;
    L42:
        ez3[] r24 = this.n;
        if (r23 >= r24.length) goto L64;
        int r25 = r24[r23].c();
        r22[r23] = this.n[r23].g();
        ez3 r26 = this.n[r23];
        q44 r27 = r15.c[r23];
        xl0 r28 = this.B;
        long r29 = this.k0;
        boolean r30 = r16[r23];
        kq r111 = (kq) r26.e;
        if (ez3.h(r111) == true) goto L47;
    L51:
        kq r112 = (kq) r26.f;
        if (r112 == null) goto L61;
        if (ez3.h(r112) == false) goto L61;
        if (r27 == r112.v) goto L58;
        r26.a(r112, r28);
        goto L61
    L58:
        if (r30 == false) goto L61;
        r112.C(r29, false, true);
    L61:
        if ((r25 - this.n[r23].c()) <= 0) goto L63;
        H(r23, false);
    L63:
        this.i0 -= r25 - this.n[r23].c();
        r23 = r23 + 1;
        goto L42
    L47:
        if (r27 == r111.v) goto L49;
        r26.a(r111, r28);
        goto L51
    L49:
        if (r30 == false) goto L51;
        r111.C(r29, false, true);
        goto L51
    L64:
        m(r22, this.k0);
        r15.h = true;
    L65:
        int r31 = r110;
    L76:
        v(true);
        if (this.V.e == r31) goto L91;
        D();
        B0();
        this.u.g(2);
        return;
    L91:
        return;
    L35:
        if (r18 == r19.s) goto L37;
        r20 = true;
        goto L38
    L31:
        r17 = false;
        goto L32
    L66:
        r110 = 4;
        r13.o(r11);
        if (r11.e == false) goto L65;
        long r32 = Math.max(r11.g.b, this.k0 - r11.p);
        if (this.M == true) goto L71;
    L75:
        r31 = 4;
        r11.a(r12, r32, false, new boolean[r11.j.length]);
        goto L76
    L71:
        if (f() == false) goto L75;
        if (this.F.k != r11) goto L75;
        h();
        goto L75
    L10:
        r14 = r5;
        goto L11
    L93:
        return;
    }

    public final void P(boolean r36, boolean r37, boolean r38, boolean r39) {
        /*  JADX ERROR: Simple mode code generation failed
            java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            	at java.base/java.util.Objects.checkIndex(Objects.java:361)
            	at java.base/java.util.ArrayList.get(ArrayList.java:427)
            	at jadx.core.codegen.MethodGen.generateSimpleCode(MethodGen.java:354)
            	at jadx.core.codegen.MethodGen.addSimpleMethodCode(MethodGen.java:316)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:279)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            */
        /*
            Method dump skipped, instruction units count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q41.P(boolean, boolean, boolean, boolean):void");
    }

    public final void Q() {
        oo2 r0 = this.F.i;
        if (r0 != null) goto L5;
    L9:
        boolean r1 = false;
    L10:
        this.Z = r1;
        return;
    L5:
        if (r0.g.i == false) goto L9;
        if (this.Y == false) goto L9;
        r1 = true;
        goto L10
    }

    public final void R(boolean r8, long r9) {
        ro2 r0 = this.F;
        oo2 r1 = r0.i;
        if (r1 != null) goto L6;
        long r2 = 1000000000000L;
    L5:
        long r10 = r9 + r2;
        this.k0 = r10;
        this.B.n.f(r10);
        ez3[] r11 = this.n;
        int r12 = r11.length;
        int r3 = 0;
    L8:
        if (r3 >= r12) goto L13;
        ez3 r4 = r11[r3];
        long r5 = this.k0;
        kq r6 = r4.d(r1);
        if (r6 == null) goto L12;
        r6.C(r5, false, r8);
    L12:
        r3 = r3 + 1;
        goto L8
    L13:
        oo2 r7 = r0.i;
    L14:
        if (r7 == null) goto L22;
        t41[] r13 = (t41[]) r7.o.q;
        int r14 = r13.length;
        int r15 = 0;
    L16:
        if (r15 >= r14) goto L21;
        t41 r16 = r13[r15];
        if (r16 == null) goto L20;
        r16.r();
    L20:
        r15 = r15 + 1;
        goto L16
    L21:
        r7 = r7.m;
        goto L14
    L22:
        return;
    L6:
        r2 = r1.p;
        goto L5
    }

    public final void S(cu4 r1, cu4 r2) {
        if (r1.p() == true) goto L5;
    L7:
        ArrayList r0 = this.C;
        int r3 = r0.size() - 1;
        if (r3 >= 0) goto L11;
        Collections.sort(r0);
        return;
    L11:
        xa3.r(r0.get(r3));
        throw null;
    L5:
        if (r2.p() == false) goto L7;
    }

    public final void V(long r17) {
        int r2 = 0;
        if (this.R == false) goto L5;
        this.Q.getClass();
        boolean r1 = true;
    L6:
        ph3 r3 = this.V;
        long r4 = 1000;
        long r7 = u0;
        if (r1 == false) goto L34;
        if (r3.e == 3) goto L12;
        r4 = r7;
    L12:
        ez3[] r5 = this.n;
        int r6 = r5.length;
    L13:
        if (r2 >= r6) goto L24;
        ez3 r8 = r5[r2];
        long r9 = this.k0;
        long r11 = this.l0;
        kq r13 = (kq) r8.f;
        kq r10 = (kq) r8.e;
        if (ez3.h(r10) == false) goto L17;
        long r14 = r10.f(r9, r11);
    L18:
        if (r13 == null) goto L22;
        if (r13.u == 0) goto L22;
        r14 = Math.min(r14, r13.f(r9, r11));
    L22:
        r4 = Math.min(r4, f35.i0(r14));
        r2 = r2 + 1;
        goto L13
    L17:
        r14 = Long.MAX_VALUE;
        goto L18
    L24:
        if (this.V.m() == false) goto L39;
        oo2 r12 = this.F.i;
        if (r12 == null) goto L28;
        oo2 r15 = r12.m;
    L29:
        if (r15 == null) goto L39;
        if (((f35.Q(r4) * this.V.o.a) + this.k0) < r15.e()) goto L39;
        r4 = Math.min(r4, r7);
        goto L39
    L28:
        r15 = null;
    L39:
        this.u.a.sendEmptyMessageAtTime(2, r17 + r4);
        return;
    L34:
        if (r3.e == 3) goto L36;
    L38:
        r4 = r7;
        goto L39
    L36:
        if (r0() == true) goto L38;
    L5:
        r1 = false;
        goto L6
    }

    public final void W(boolean r12) {
        mt2 r2 = this.F.i.g.a;
        long r3 = Y(r2, this.V.s, true, false);
        if (r3 == this.V.s) goto L6;
        ph3 r11 = this.V;
        this.V = z(r2, r3, r11.c, r11.d, r12, 5);
        return;
    }

    public final void X(p41 r20) {
        q41 r1 = this;
        boolean r9 = true;
        if (r1.S == true) goto L5;
        r1.W.e(1);
        Pair r0 = T(r1.V.a, r20, true, r1.d0, r1.e0, r1.x, r1.y);
        if (r0 != null) goto L12;
        Pair r2 = r1.p(r1.V.a);
        mt2 r10 = (mt2) r2.first;
        long r11 = ((Long) r2.second).longValue();
        boolean r7 = !r1.V.a.p();
        long r17 = -9223372036854775807L;
        long r15 = 0;
        long r5 = -9223372036854775807L;
    L146:
    L127:
        th = th;
    L79:
        r10 = r10;
    L35:
        long r3 = r11;
    L129:
        r1.V = r1.z(r10, r3, r5, r3, r7, 2);
        throw th;
    L135:
        if (r1.V.a.p() == false) goto L36;
        r1.j0 = r20;     // Catch: Throwable -> L33
    L42:
        r7 = r7;
        mt2 r4 = r10;
        long r6 = r11;
    L116:
        int r12 = 2;
        long r8 = r6;
        r1 = this;
    L72:
        r1.V = r1.z(r4, r6, r5, r8, r7, r12);
        return;
    L36:
        ph3 r13 = r1.V;
        if (r0 == null) goto L39;
        if (r10.equals(r13.b) == true) goto L136;
        long r18 = r5;
        long r14 = r11;
    L140:
    L125:
        th = th;
        r5 = r18;
        goto L35
    L83:
        if (r1.R == false) goto L96;
        ez3[] r16 = r1.n;     // Catch: Throwable -> L92
        int r19 = r16.length;     // Catch: Throwable -> L92
        int r21 = 0;
    L85:
        if (r21 >= r19) goto L96;
        ez3 r22 = r16[r21];     // Catch: Throwable -> L92
        if (r22.g() == false) goto L94;
        if (((kq) r22.e).o != 2) goto L94;
        r1.S = true;     // Catch: Throwable -> L92
    L94:
        r21 = r21 + 1;
    L92:
        th = th;
    L76:
        r7 = r7;
        r3 = r11;
        r5 = r18;
    L96:
        if (r1.V.e != 4) goto L98;
        boolean r23 = true;
    L99:
        ro2 r24 = r1.F;     // Catch: Throwable -> L125
        if (r24.i == r24.j) goto L103;
        boolean r25 = true;
    L104:
        long r110 = r1.Y(r10, r14, r25, r23);     // Catch: Throwable -> L125
        if (r11 != r110) goto L109;
        r9 = false;
    L109:
        r7 = r9 | r7;
        ph3 r26 = r1.V;     // Catch: Throwable -> L123
        mt2 r27 = r10;
        cu4 r28 = r26.a;     // Catch: Throwable -> L120
        long r29 = r18;
        r1.C0(r28, r27, r28, r26.b, r29, true);     // Catch: Throwable -> L117
        r4 = r27;
        r5 = r29;
        r6 = r110;
    L117:
        th = th;
        r10 = r27;
        r5 = r29;
    L119:
        r3 = r110;
    L120:
        th = th;
        r10 = r27;
    L122:
        r5 = r18;
    L123:
        th = th;
        goto L122
    L103:
        r25 = false;
        goto L104
    L98:
        r23 = false;
        goto L99
    L136:
        oo2 r30 = r1.F.i;     // Catch: Throwable -> L77
        if (r30 != null) goto L49;
    L59:
        r14 = r11;
    L60:
        r18 = r5;
    L74:
        th = th;
        r7 = r7;
        r10 = r10;
        goto L76
    L63:
        if (f35.i0(r14) != f35.i0(r1.V.s)) goto L140;
        ph3 r31 = r1.V;     // Catch: Throwable -> L74
        int r32 = r31.e;     // Catch: Throwable -> L74
        if (r32 != 2) goto L67;
    L70:
        r6 = r31.s;     // Catch: Throwable -> L74
        r7 = r7;
        r4 = r10;
        r12 = 2;
        r8 = r6;
        r5 = r18;
        goto L72
    L67:
        if (r32 != 3) goto L140;
    L49:
        if (r30.e == false) goto L59;
        if (r11 == r15) goto L59;
        no2 r33 = r30.a;     // Catch: Throwable -> L33
        long r111 = r1.x.l;     // Catch: Throwable -> L33
        if (r1.R == true) goto L55;
    L57:
        r14 = r33.e(r11, r1.P);     // Catch: Throwable -> L33
        goto L60
    L55:
        if (r111 == r17) goto L57;
        r1.Q.getClass();     // Catch: Throwable -> L33
    L77:
        th = th;
        goto L79
    L39:
        if (r13.e == 1) goto L41;
        r1.n0(4);     // Catch: Throwable -> L33
    L41:
        r1.P(false, true, false, true);     // Catch: Throwable -> L33
    L33:
        th = th;
        r10 = r10;
        goto L35
    L12:
        Object r34 = r0.first;
        r11 = ((Long) r0.second).longValue();
        if (r20.c != (-9223372036854775807L)) goto L15;
        long r112 = -9223372036854775807L;
    L16:
        r10 = r1.F.q(r1.V.a, r34, r11);
        if (r10.b() == false) goto L25;
        r1.V.a.g(r10.a, r1.y);
        if (r1.y.f(r10.b) != r10.c) goto L21;
        r11 = r1.y.g.b;
    L22:
        x5 r35 = r1.y.g.a(r10.b);
        r15 = 0;
        r17 = -9223372036854775807L;
        r112 = Math.max(r112, r35.a + r35.j);
    L23:
        r7 = true;
    L24:
        r5 = r112;
        goto L146
    L21:
        r11 = 0;
        goto L22
    L25:
        r17 = -9223372036854775807L;
        r15 = 0;
        if (r20.c == (-9223372036854775807L)) goto L23;
        r7 = false;
        goto L24
    L15:
        r112 = r11;
        goto L16
    L5:
        if (r1.T == null) goto L7;
        r1.U++;
        r1.W.e(1);
    L7:
        r1.T = r20;
    }

    public final long Y(mt2 r10, long r11, boolean r13, boolean r14) {
        v0();
        boolean r1 = true;
        D0(false, true);
        if (r14 == false) goto L5;
    L6:
        n0(2);
    L7:
        oo2 r15 = this.F.i;
        oo2 r3 = r15;
    L8:
        if (r3 == null) goto L13;
        if (r10.equals(r3.g.a) == true) goto L13;
        r3 = r3.m;
    L13:
        if (r13 == true) goto L18;
        if (r15 != r3) goto L18;
        if (r3 != null) goto L17;
    L28:
        h();
        ro2 r12 = this.F;
        if (r3 == null) goto L61;
        r12.o(r3);
        if (r3.e == true) goto L34;
        r3.g = r3.g.b(r11);
    L60:
        R(r1, r11);
        D();
    L62:
        v(false);
        this.u.g(2);
        return r11;
    L34:
        if (r3.f == false) goto L60;
        if (this.R == false) goto L59;
        this.Q.getClass();
        if (this.V.a.p() == true) goto L59;
        if (r3.g.a.equals(this.V.b) == false) goto L59;
        long r16 = r3.p + r11;
        ez3[] r17 = this.n;
        int r4 = r17.length;
        int r5 = 0;
        boolean r6 = true;
    L43:
        if (r5 >= r4) goto L54;
        ez3 r7 = r17[r5];
        if (r7.g() == false) goto L53;
        kq r8 = r7.d(r3);
        if (r8 != null) goto L49;
    L51:
        boolean r9 = false;
    L52:
        r6 = r6 & r9;
        goto L53
    L49:
        if (r8.G(r16) == false) goto L51;
        r9 = true;
    L53:
        r5 = r5 + 1;
        goto L43
    L54:
        if (r6 == false) goto L59;
        no2 r18 = r3.a;
        long r19 = this.V.s;
        n84 r20 = n84.c;
        if (r18.e(r19, r20) != r3.a.e(r11, r20)) goto L59;
        r1 = false;
    L59:
        r11 = r3.a.i(r11);
        r3.a.k(this.A, r11 - this.z);
        goto L60
    L61:
        r12.b();
        R(true, r11);
        goto L62
    L17:
        if ((r3.p + r11) >= 0) goto L28;
    L18:
        int r110 = 0;
    L20:
        if (r110 >= this.n.length) goto L22;
        i(r110);
        r110 = r110 + 1;
        goto L20
    L22:
        this.r0 = -9223372036854775807L;
        if (r3 == null) goto L28;
    L24:
        ro2 r111 = this.F;
        if (r111.i == r3) goto L27;
        r111.a();
        goto L24
    L27:
        r111.o(r3);
        r3.p = 1000000000000L;
        m(new boolean[this.n.length], this.F.j.e());
        r3.h = true;
        goto L28
    L5:
        if (this.V.e != 3) goto L7;
        goto L6
    }

    public final void Z(sk3 r6) {
        r6.getClass();
        yp4 r0 = this.u;
        if (r6.e != this.w) goto L18;
        monitor-enter(r6);
        monitor-exit(r6);
        r6.a.c(r6.c, r6.d);     // Catch: Throwable -> L15
        r6.a(true);
        int r5 = this.V.e;
        if (r5 == 3) goto L13;
        if (r5 == 2) goto L13;
        return;
    L13:
        r0.g(2);
        return;
    L15:
        th = move-exception;
        r6.a(true);
        throw th;
    L18:
        r0.b(15, r6).b();
    }

    public final void a(l41 r3, int r4) {
        this.W.e(1);
        fo1 r1 = this.G;
        if (r4 != (-1)) goto L5;
        r4 = ((ArrayList) r1.c).size();
    L5:
        w(r1.b(r4, r3.a, r3.b), false);
    }

    public final void a0(sk3 r4) {
        Looper r0 = r4.e;
        if (r0.getThread().isAlive() == true) goto L6;
        l93.q0("TAG", "Trying to send message on a dead thread.");
        r4.a(false);
        return;
    L6:
        this.D.a(r0, null).d(new a0(this, r4));
    }

    @Override // defpackage.mo2
    public final void b(no2 r2) {
        this.u.b(8, r2).b();
    }

    public final void b0(il r7, boolean r8) {
        pn0 r0 = this.q;
        if (r0.i.equals(r7) == true) goto L6;
        r0.i = r7;
        r0.e();
    L6:
        if (r8 == true) goto L9;
        r7 = null;
    L9:
        tl r9 = this.N;
        if (Objects.equals(r9.d, r7) == true) goto L28;
        r9.d = r7;
        boolean r1 = false;
        if (r7 != null) goto L14;
    L13:
        int r3 = 0;
    L23:
        r9.f = r3;
        if (r3 == 1) goto L26;
        if (r3 == 0) goto L26;
    L27:
        rr2.k("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", r1);
    L26:
        r1 = true;
        goto L27
    L14:
        int r2 = r7.c;
        r3 = 3;
        switch(r2) {
            case 0: goto L22;
            case 1: goto L21;
            case 2: goto L20;
            case 3: goto L13;
            case 4: goto L20;
            case 5: goto L23;
            case 6: goto L23;
            case 7: goto L23;
            case 8: goto L23;
            case 9: goto L23;
            case 10: goto L23;
            case 11: goto L19;
            case 12: goto L23;
            case 13: goto L23;
            case 14: goto L21;
            case 15: goto L16;
            case 16: goto L17;
            default: goto L16;
        };
    L16:
        xa3.m(r2, "Unidentified audio usage: ", "AudioFocusManager");
        goto L13
    L17:
        r3 = 4;
    L20:
        r3 = 2;
    L21:
        r3 = 1;
        goto L23
    L22:
        l93.q0("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
        goto L21
    L19:
        if (r7.a != 1) goto L23;
    L28:
        ph3 r10 = this.V;
        boolean r4 = r10.l;
        A0(r9.c(r10.e, r4), r10.n, r10.m, r4);
    }

    @Override // defpackage.dw4
    public final void c() {
        this.u.g(10);
    }

    public final void c0(boolean r3, q90 r4) {
        if (this.f0 == r3) goto L9;
        this.f0 = r3;
        if (r3 == true) goto L9;
        ez3[] r2 = this.n;
        int r5 = r2.length;
        int r0 = 0;
    L7:
        if (r0 >= r5) goto L9;
        r2[r0].k();
        r0 = r0 + 1;
    L9:
        if (r4 == null) goto L13;
        r4.d();
        return;
    }

    @Override // defpackage.c55
    public final void d(long r1, long r3, tb1 r5, MediaFormat r6) {
        if (this.S == false) goto L6;
        this.u.a(37).b();
        return;
    }

    public final void d0(l41 r8) {
        this.W.e(1);
        int r0 = r8.c;
        pd4 r1 = r8.b;
        ArrayList r2 = r8.a;
        if (r0 == (-1)) goto L5;
        tm3 r3 = new tm3(r2, r1);
        this.j0 = new p41(r8.c, r8.d, r3);
    L5:
        fo1 r9 = this.G;
        ArrayList r4 = (ArrayList) r9.c;
        r9.o(0, r4.size());
        w(r9.b(r4.size(), r2, r1), false);
    }

    public final void e() {
        ez3[] r0 = this.n;
        int r1 = r0.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L12;
        ez3 r3 = r0[r2];
        if (this.R == false) goto L7;
        i74 r4 = this.Q;
    L8:
        ((kq) r3.e).c(18, r4);
        kq r5 = (kq) r3.f;
        if (r5 == null) goto L11;
        r5.c(18, r4);
    L11:
        r2 = r2 + 1;
        goto L3
    L7:
        r4 = null;
        goto L8
    }

    public final void e0(boolean r2) {
        this.Y = r2;
        Q();
        if (this.Z == false) goto L8;
        ro2 r3 = this.F;
        if (r3.j == r3.i) goto L9;
        W(true);
        v(false);
        return;
    L9:
        return;
    }

    public final boolean f() {
        if (this.M == true) goto L5;
        return false;
    L5:
        ez3[] r4 = this.n;
        int r0 = r4.length;
        int r2 = 0;
    L6:
        if (r2 >= r0) goto L12;
        if (r4[r2].f() == true) goto L9;
        r2 = r2 + 1;
        goto L6
    L9:
        return true;
    L12:
        return false;
    }

    public final void f0(qh3 r3) {
        this.u.f(16);
        xl0 r0 = this.B;
        r0.d(r3);
        qh3 r4 = r0.i();
        y(r4, r4.a, true, true);
    }

    public final void g() {
        O();
        W(true);
    }

    public final void g0(p31 r3) {
        this.q0 = r3;
        cu4 r0 = this.V.a;
        ro2 r2 = this.F;
        r2.getClass();
        r3.getClass();
        if (r2.q.isEmpty() == true) goto L11;
        ArrayList r4 = new ArrayList();
        int r1 = 0;
    L6:
        if (r1 >= r2.q.size()) goto L8;
        ((oo2) r2.q.get(r1)).i();
        r1 = r1 + 1;
        goto L6
    L8:
        r2.q = r4;
        r2.m = null;
        r2.l();
        return;
    }

    public final void h() {
        if (this.M == true) goto L5;
        return;
    L5:
        if (f() == false) goto L33;
        ez3[] r0 = this.n;
        int r1 = r0.length;
        int r3 = 0;
    L8:
        if (r3 >= r1) goto L27;
        ez3 r4 = r0[r3];
        int r5 = r4.c();
        if (r4.f() == false) goto L26;
        int r6 = r4.d;
        int r7 = 1;
        if (r6 != 4) goto L15;
    L18:
        boolean r9 = true;
    L19:
        if (r6 == 4) goto L22;
        r7 = 0;
    L22:
        if (r9 == false) goto L24;
        kq r8 = (kq) r4.e;
    L25:
        r4.a(r8, this.B);
        r4.i(r9);
        r4.d = r7;
        goto L26
    L24:
        r8 = (kq) r4.f;
        r8.getClass();
        goto L25
    L15:
        if (r6 == 2) goto L18;
        r9 = false;
    L26:
        this.i0 -= r5 - r4.c();
        r3 = r3 + 1;
        goto L8
    L27:
        this.r0 = -9223372036854775807L;
        return;
    }

    public final void h0(int r3) {
        this.d0 = r3;
        cu4 r0 = this.V.a;
        ro2 r1 = this.F;
        r1.g = r3;
        int r4 = r1.s(r0);
        if ((r4 & 1) == 0) goto L6;
        W(true);
    L8:
        v(false);
        return;
    L6:
        if ((r4 & 2) == 0) goto L8;
        h();
        goto L8
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message r17) {
        int r3 = 1000;
    L15:
        e = move-exception;
        boolean r2 = e.n;
        int r5 = e.o;
        if (r5 != 1) goto L96;
        if (r2 == false) goto L95;
        int r4 = 3001;
    L94:
        r3 = r4;
    L100:
        u(e, r3);
    L148:
        F();
        return true;
    L95:
        r4 = 3003;
        goto L94
    L96:
        if (r5 != 4) goto L100;
        if (r2 == false) goto L99;
        r4 = 3002;
        goto L94
    L99:
        r4 = 3004;
    L13:
        e = move-exception;
        u(e, e.n);
    L19:
        e = e;
        int r6 = e.w;
        ro2 r7 = this.F;
        if (r6 != 1) goto L109;
        oo2 r8 = r7.j;
        if (r8 == null) goto L109;
        if (e.B != null) goto L109;
        e = e.b(r8.g.a);
    L109:
        int r9 = e.w;
        yp4 r15 = this.u;
        if (r9 != 1) goto L124;
        mt2 r10 = e.B;
        if (r10 == null) goto L124;
        if (B(e.y, r10) == false) goto L124;
        this.s0 = true;
        h();
        oo2 r0 = r7.h();
        oo2 r11 = r7.i;
        if (r11 == r0) goto L121;
    L117:
        if (r11 == null) goto L121;
        oo2 r12 = r11.m;
        if (r12 == r0) goto L121;
        r11 = r12;
    L121:
        r7.o(r11);
        if (this.V.e == 4) goto L148;
        D();
        r15.g(2);
    L124:
        ExoPlaybackException r13 = this.o0;
        if (r13 == null) goto L128;
        r13.addSuppressed(e);
        e = this.o0;
    L128:
        if (e.w != 1) goto L136;
        if (r7.i == r7.j) goto L136;
    L131:
        oo2 r14 = r7.i;
        if (r14 == r7.j) goto L134;
        r7.a();
        goto L131
    L134:
        rr2.r(r14);
        F();
        po2 r16 = r14.g;
        mt2 r18 = r16.a;
        long r19 = r16.b;
        this.V = z(r18, r19, r16.c, r19, true, 0);
    L136:
        if (e.C == true) goto L138;
    L147:
        l93.G("ExoPlayerImplInternal", "Playback error", e);
        u0(true, false);
        this.V = this.V.f(e);
        goto L148
    L138:
        if (this.o0 == null) goto L143;
        int r20 = e.n;
        if (r20 == 5004) goto L143;
        if (r20 != 5003) goto L147;
    L143:
        l93.r0("ExoPlayerImplInternal", "Recoverable renderer error", e);
        if (this.o0 != null) goto L146;
        this.o0 = e;
    L146:
        xp4 r1 = r15.b(25, e);
        Handler r21 = r15.a;
        Message r22 = r1.a;
        r22.getClass();
        r21.sendMessageAtFrontOfQueue(r22);
        r1.a();
    L17:
        e = move-exception;
        u(e, e.n);
    L11:
        e = move-exception;
        u(e, 1002);
    L9:
        e = move-exception;
        u(e, 2000);
    L7:
        e = move-exception;
        if ((e instanceof IllegalStateException) == false) goto L84;
    L85:
        r3 = 1004;
    L86:
        ExoPlaybackException r23 = new ExoPlaybackException(2, e, r3);
        l93.G("ExoPlayerImplInternal", "Playback error", r23);
        u0(true, false);
        this.V = this.V.f(r23);
        goto L148
    L84:
        if ((e instanceof IllegalArgumentException) == false) goto L86;
    L4:
        switch(r17.what) {
            case 1: goto L76;
            case 2: goto L74;
            case 3: goto L73;
            case 4: goto L72;
            case 5: goto L71;
            case 6: goto L70;
            case 7: goto L68;
            case 8: goto L67;
            case 9: goto L66;
            case 10: goto L65;
            case 11: goto L64;
            case 12: goto L60;
            case 13: goto L55;
            case 14: goto L53;
            case 15: goto L52;
            case 16: goto L51;
            case 17: goto L50;
            case 18: goto L49;
            case 19: goto L48;
            case 20: goto L47;
            case 21: goto L46;
            case 22: goto L45;
            case 23: goto L41;
            case 24: goto L5;
            case 25: goto L39;
            case 26: goto L38;
            case 27: goto L37;
            case 28: goto L36;
            case 29: goto L35;
            case 30: goto L34;
            case 31: goto L29;
            case 32: goto L28;
            case 33: goto L27;
            case 34: goto L26;
            case 35: goto L25;
            case 36: goto L24;
            case 37: goto L21;
            case 38: goto L6;
            default: goto L5;
        };     // Catch: RuntimeException -> L7 IOException -> L9 BehindLiveWindowException -> L11 DataSourceException -> L13 ParserException -> L15 DrmSession$DrmSessionException -> L17 ExoPlaybackException -> L19
    L5:
        return false;
    L6:
        j0((i74) r17.obj);     // Catch: RuntimeException -> L7 IOException -> L9 BehindLiveWindowException -> L11 DataSourceException -> L13 ParserException -> L15 DrmSession$DrmSessionException -> L17 ExoPlaybackException -> L19
        goto L148
    L21:
        this.S = false;     // Catch: RuntimeException -> L7 IOException -> L9 BehindLiveWindowException -> L11 DataSourceException -> L13 ParserException -> L15 DrmSession$DrmSessionException -> L17 ExoPlaybackException -> L19
        p41 r24 = this.T;     // Catch: RuntimeException -> L7 IOException -> L9 BehindLiveWindowException -> L11 DataSourceException -> L13 ParserException -> L15 DrmSession$DrmSessionException -> L17 ExoPlaybackException -> L19
        if (r24 == null) goto L148;
        X(r24);     // Catch: RuntimeException -> L7 IOException -> L9 BehindLiveWindowException -> L11 DataSourceException -> L13 ParserException -> L15 DrmSession$DrmSessionException -> L17 ExoPlaybackException -> L19
        this.T = null;     // Catch: RuntimeException -> L7 IOException -> L9 BehindLiveWindowException -> L11 DataSourceException -> L13 ParserException -> L15 DrmSession$DrmSessionException -> L17 ExoPlaybackException -> L19
        goto L148
    L24:
        i0(((Boolean) r17.obj).booleanValue());     // Catch: RuntimeException -> L7 IOException -> L9 BehindLiveWindowException -> L11 DataSourceException -> L13 ParserException -> L15 DrmSession$DrmSessionException -> L17 ExoPlaybackException -> L19
        goto L148
    L25:
        o0((c55) r17.obj);     // Catch: RuntimeException -> L7 IOException -> L9 BehindLiveWindowException -> L11 DataSourceException -> L13 ParserException -> L15 DrmSession$DrmSessionException -> L17 ExoPlaybackException -> L19
        goto L148
    L26:
        s();     // Catch: RuntimeException -> L7 IOException -> L9 BehindLiveWindowException -> L11 DataSourceException -> L13 ParserException -> L15 DrmSession$DrmSessionException -> L17 ExoPlaybackException -> L19
        goto L148
    L27:
        r(r17.arg1);     // Catch: RuntimeException -> L7 IOException -> L9 BehindLiveWindowException -> L11 DataSourceException -> L13 ParserException -> L15 DrmSession$DrmSessionException -> L17 ExoPlaybackException -> L19
        goto L148
    L28:
        q0(((Float) r17.obj).floatValue());     // Catch: RuntimeException -> L7 IOException -> L9 BehindLiveWindowException -> L11 DataSourceException -> L13 ParserException -> L15 DrmSession$DrmSessionException -> L17 ExoPlaybackException -> L19
        goto L148
    L29:
        il r25 = (il) r17.obj;     // Catch: RuntimeException -> L7 IOException -> L9 BehindLiveWindowException -> L11 DataSourceException -> L13 ParserException -> L15 DrmSession$DrmSessionException -> L17 ExoPlaybackException -> L19
        if (r17.arg1 == 0) goto L32;
        boolean r26 = true;
    L33:
        b0(r25, r26);     // Catch: RuntimeException -> L7 IOException -> L9 BehindLiveWindowException -> L11 DataSourceException -> L13 ParserException -> L15 DrmSession$DrmSessionException -> L17 ExoPlaybackException -> L19
        goto L148
    L32:
        r26 = false;
        goto L33
    L34:
        Pair r27 = (Pair) r17.obj;     // Catch: RuntimeException -> L7 IOException -> L9 BehindLiveWindowException -> L11 DataSourceException -> L13 ParserException -> L15 DrmSession$DrmSessionException -> L17 ExoPlaybackException -> L19
        p0(r27.first, (q90) r27.second);     // Catch: RuntimeException -> L7 IOException -> L9 BehindLiveWindowException -> L11 DataSourceException -> L13 ParserException -> L15 DrmSession$DrmSessionException -> L17 ExoPlaybackException -> L19
        goto L148
    L35:
        K();     // Catch: RuntimeException -> L7 IOException -> L9 BehindLiveWindowException -> L11 DataSourceException -> L13 ParserException -> L15 DrmSession$DrmSessionException -> L17 ExoPlaybackException -> L19
        goto L148
    L36:
        g0((p31) r17.obj);     // Catch: RuntimeException -> L7 IOException -> L9 BehindLiveWindowException -> L11 DataSourceException -> L13 ParserException -> L15 DrmSession$DrmSessionException -> L17 ExoPlaybackException -> L19
        goto L148
    L37:
        y0(r17.arg1, r17.arg2, (List) r17.obj);     // Catch: RuntimeException -> L7 IOException -> L9 BehindLiveWindowException -> L11 DataSourceException -> L13 ParserException -> L15 DrmSession$DrmSessionException -> L17 ExoPlaybackException -> L19
        goto L148
    L38:
        O();     // Catch: RuntimeException -> L7 IOException -> L9 BehindLiveWindowException -> L11 DataSourceException -> L13 ParserException -> L15 DrmSession$DrmSessionException -> L17 ExoPlaybackException -> L19
        W(true);     // Catch: RuntimeException -> L7 IOException -> L9 BehindLiveWindowException -> L11 DataSourceException -> L13 ParserException -> L15 DrmSession$DrmSessionException -> L17 ExoPlaybackException -> L19
        goto L148
    L39:
        g();     // Catch: RuntimeException -> L7 IOException -> L9 BehindLiveWindowException -> L11 DataSourceException -> L13 ParserException -> L15 DrmSession$DrmSessionException -> L17 ExoPlaybackException -> L19
        goto L148
    L45:
        I();     // Catch: RuntimeException -> L7 IOException -> L9 BehindLiveWindowException -> L11 DataSourceException -> L13 ParserException -> L15 DrmSession$DrmSessionException -> L17 ExoPlaybackException -> L19
        goto L148
    L46:
        m0((pd4) r17.obj);     // Catch: RuntimeException -> L7 IOException -> L9 BehindLiveWindowException -> L11 DataSourceException -> L13 ParserException -> L15 DrmSession$DrmSessionException -> L17 ExoPlaybackException -> L19
        goto L148
    L47:
        N(r17.arg1, r17.arg2, (pd4) r17.obj);     // Catch: RuntimeException -> L7 IOException -> L9 BehindLiveWindowException -> L11 DataSourceException -> L13 ParserException -> L15 DrmSession$DrmSessionException -> L17 ExoPlaybackException -> L19
        goto L148
    L48:
        J((m41) r17.obj);     // Catch: RuntimeException -> L7 IOException -> L9 BehindLiveWindowException -> L11 DataSourceException -> L13 ParserException -> L15 DrmSession$DrmSessionException -> L17 ExoPlaybackException -> L19
        goto L148
    L49:
        a((l41) r17.obj, r17.arg1);     // Catch: RuntimeException -> L7 IOException -> L9 BehindLiveWindowException -> L11 DataSourceException -> L13 ParserException -> L15 DrmSession$DrmSessionException -> L17 ExoPlaybackException -> L19
        goto L148
    L50:
        d0((l41) r17.obj);     // Catch: RuntimeException -> L7 IOException -> L9 BehindLiveWindowException -> L11 DataSourceException -> L13 ParserException -> L15 DrmSession$DrmSessionException -> L17 ExoPlaybackException -> L19
        goto L148
    L51:
        qh3 r28 = (qh3) r17.obj;     // Catch: RuntimeException -> L7 IOException -> L9 BehindLiveWindowException -> L11 DataSourceException -> L13 ParserException -> L15 DrmSession$DrmSessionException -> L17 ExoPlaybackException -> L19
        y(r28, r28.a, true, false);     // Catch: RuntimeException -> L7 IOException -> L9 BehindLiveWindowException -> L11 DataSourceException -> L13 ParserException -> L15 DrmSession$DrmSessionException -> L17 ExoPlaybackException -> L19
        goto L148
    L52:
        a0((sk3) r17.obj);     // Catch: RuntimeException -> L7 IOException -> L9 BehindLiveWindowException -> L11 DataSourceException -> L13 ParserException -> L15 DrmSession$DrmSessionException -> L17 ExoPlaybackException -> L19
        goto L148
    L53:
        Z((sk3) r17.obj);     // Catch: RuntimeException -> L7 IOException -> L9 BehindLiveWindowException -> L11 DataSourceException -> L13 ParserException -> L15 DrmSession$DrmSessionException -> L17 ExoPlaybackException -> L19
        goto L148
    L64:
        h0(r17.arg1);     // Catch: RuntimeException -> L7 IOException -> L9 BehindLiveWindowException -> L11 DataSourceException -> L13 ParserException -> L15 DrmSession$DrmSessionException -> L17 ExoPlaybackException -> L19
        goto L148
    L65:
        O();     // Catch: RuntimeException -> L7 IOException -> L9 BehindLiveWindowException -> L11 DataSourceException -> L13 ParserException -> L15 DrmSession$DrmSessionException -> L17 ExoPlaybackException -> L19
        goto L148
    L66:
        t((no2) r17.obj);     // Catch: RuntimeException -> L7 IOException -> L9 BehindLiveWindowException -> L11 DataSourceException -> L13 ParserException -> L15 DrmSession$DrmSessionException -> L17 ExoPlaybackException -> L19
        goto L148
    L67:
        x((no2) r17.obj);     // Catch: RuntimeException -> L7 IOException -> L9 BehindLiveWindowException -> L11 DataSourceException -> L13 ParserException -> L15 DrmSession$DrmSessionException -> L17 ExoPlaybackException -> L19
        goto L148
    L68:
        L((q90) r17.obj);     // Catch: RuntimeException -> L7 IOException -> L9 BehindLiveWindowException -> L11 DataSourceException -> L13 ParserException -> L15 DrmSession$DrmSessionException -> L17 ExoPlaybackException -> L19
        return true;
    L70:
        u0(false, true);     // Catch: RuntimeException -> L7 IOException -> L9 BehindLiveWindowException -> L11 DataSourceException -> L13 ParserException -> L15 DrmSession$DrmSessionException -> L17 ExoPlaybackException -> L19
        goto L148
    L71:
        k0((n84) r17.obj);     // Catch: RuntimeException -> L7 IOException -> L9 BehindLiveWindowException -> L11 DataSourceException -> L13 ParserException -> L15 DrmSession$DrmSessionException -> L17 ExoPlaybackException -> L19
        goto L148
    L72:
        f0((qh3) r17.obj);     // Catch: RuntimeException -> L7 IOException -> L9 BehindLiveWindowException -> L11 DataSourceException -> L13 ParserException -> L15 DrmSession$DrmSessionException -> L17 ExoPlaybackException -> L19
        goto L148
    L73:
        X((p41) r17.obj);     // Catch: RuntimeException -> L7 IOException -> L9 BehindLiveWindowException -> L11 DataSourceException -> L13 ParserException -> L15 DrmSession$DrmSessionException -> L17 ExoPlaybackException -> L19
        goto L148
    L74:
        k();     // Catch: RuntimeException -> L7 IOException -> L9 BehindLiveWindowException -> L11 DataSourceException -> L13 ParserException -> L15 DrmSession$DrmSessionException -> L17 ExoPlaybackException -> L19
        goto L148
    L41:
        if (r17.arg1 == 0) goto L43;
        boolean r29 = true;
    L44:
        e0(r29);     // Catch: RuntimeException -> L7 IOException -> L9 BehindLiveWindowException -> L11 DataSourceException -> L13 ParserException -> L15 DrmSession$DrmSessionException -> L17 ExoPlaybackException -> L19
        goto L148
    L43:
        r29 = false;
        goto L44
    L55:
        if (r17.arg1 == 0) goto L57;
        boolean r30 = true;
    L58:
        c0(r30, (q90) r17.obj);     // Catch: RuntimeException -> L7 IOException -> L9 BehindLiveWindowException -> L11 DataSourceException -> L13 ParserException -> L15 DrmSession$DrmSessionException -> L17 ExoPlaybackException -> L19
        goto L148
    L57:
        r30 = false;
        goto L58
    L60:
        if (r17.arg1 == 0) goto L62;
        boolean r31 = true;
    L63:
        l0(r31);     // Catch: RuntimeException -> L7 IOException -> L9 BehindLiveWindowException -> L11 DataSourceException -> L13 ParserException -> L15 DrmSession$DrmSessionException -> L17 ExoPlaybackException -> L19
        goto L148
    L62:
        r31 = false;
        goto L63
    L76:
        if (r17.arg1 == 0) goto L78;
        boolean r32 = true;
    L79:
        int r33 = r17.arg2;     // Catch: RuntimeException -> L7 IOException -> L9 BehindLiveWindowException -> L11 DataSourceException -> L13 ParserException -> L15 DrmSession$DrmSessionException -> L17 ExoPlaybackException -> L19
        this.W.e(1);     // Catch: RuntimeException -> L7 IOException -> L9 BehindLiveWindowException -> L11 DataSourceException -> L13 ParserException -> L15 DrmSession$DrmSessionException -> L17 ExoPlaybackException -> L19
        A0(this.N.c(this.V.e, r32), r33 >> 4, r33 & 15, r32);     // Catch: RuntimeException -> L7 IOException -> L9 BehindLiveWindowException -> L11 DataSourceException -> L13 ParserException -> L15 DrmSession$DrmSessionException -> L17 ExoPlaybackException -> L19
        goto L148
    L78:
        r32 = false;
        goto L79
    }

    public final void i(int r8) {
        ez3[] r0 = this.n;
        int r1 = r0[r8].c();
        ez3 r2 = r0[r8];
        kq r3 = (kq) r2.e;
        xl0 r4 = this.B;
        r2.a(r3, r4);
        kq r5 = (kq) r2.f;
        if (r5 != null) goto L5;
    L13:
        r2.d = 0;
        H(r8, false);
        this.i0 -= r1;
        return;
    L5:
        if (r5.u != 0) goto L7;
    L9:
        boolean r6 = false;
    L10:
        r2.a(r5, r4);
        r2.i(false);
        if (r6 == false) goto L13;
        kq r7 = (kq) r2.e;
        r5.getClass();
        r5.c(17, r7);
        goto L13
    L7:
        if (r2.d == 3) goto L9;
        r6 = true;
        goto L10
    }

    public final void i0(boolean r5) {
        if (r5 == true) goto L16;
        p41 r0 = this.T;
        yp4 r2 = this.u;
        if (r0 != null) goto L6;
    L10:
        int r1 = this.U;
        if (r1 <= 0) goto L13;
        this.L.d(new a0(this, r1));
    L13:
        this.U = 0;
        this.S = false;
        r2.f(37);
        p41 r3 = this.T;
        if (r3 == null) goto L16;
        X(r3);
        this.T = null;
        this.S = false;
        goto L16
    L6:
        if (this.S == false) goto L10;
        if (r2.a.hasMessages(37) == true) goto L10;
        this.U++;
    L16:
        this.R = r5;
        e();
    }

    @Override // defpackage.ca4
    public final void j(da4 r2) {
        yp4 r1 = this.u;
        r1.b(9, (no2) r2).b();
    }

    public final void j0(i74 r1) {
        this.Q = r1;
        e();
    }

    public final void k() {
        this.D.getClass();
        long r1 = SystemClock.uptimeMillis();
        this.u.f(2);
        if (this.O == true) goto L5;
        z0();
    L5:
        int r3 = this.V.e;
        if (r3 != 1) goto L8;
        return;
    L8:
        if (r3 != 4) goto L11;
        return;
    L11:
        if (this.O == false) goto L13;
        z0();
    L13:
        oo2 r4 = this.F.i;
        if (r4 != null) goto L17;
        V(r1);
        return;
    L17:
        Trace.beginSection("doSomeWork");
        B0();
        if (r4.e == false) goto L63;
        this.D.getClass();
        this.l0 = f35.Q(SystemClock.elapsedRealtime());
        r4.a.k(this.A, this.V.s - this.z);
        boolean r9 = true;
        boolean r10 = true;
        int r7 = 0;
    L20:
        ez3[] r11 = this.n;
        if (r7 >= r11.length) goto L64;
        ez3 r12 = r11[r7];
        if (r12.c() != 0) goto L25;
        H(r7, false);
    L62:
        r7 = r7 + 1;
        goto L20
    L25:
        long r13 = this.k0;
        long r14 = this.l0;
        kq r5 = (kq) r12.f;
        kq r6 = (kq) r12.e;
        if (ez3.h(r6) == false) goto L28;
        r6.A(r13, r14);
    L28:
        if (r5 != null) goto L30;
    L32:
        if (r9 == false) goto L43;
        kq r8 = (kq) r12.f;
        kq r15 = (kq) r12.e;
        if (ez3.h(r15) == false) goto L36;
        boolean r16 = r15.m();
    L37:
        if (r8 != null) goto L39;
    L41:
        if (r16 == false) goto L43;
        r9 = true;
    L44:
        kq r17 = r12.d(r4);
        if (r17 != null) goto L47;
    L54:
        boolean r18 = true;
    L55:
        H(r7, r18);
        if (r10 == false) goto L59;
        if (r18 == false) goto L59;
        r10 = true;
    L60:
        if (r18 == true) goto L62;
        G(r7);
    L59:
        r10 = false;
        goto L60
    L47:
        if (r17.l() == true) goto L54;
        if (r17.o() == true) goto L54;
        if (r17.m() == true) goto L54;
        r18 = false;
        goto L55
    L39:
        if (r8.u == 0) goto L41;
        r16 = r16 & r8.m();
        goto L41
    L36:
        r16 = true;
    L43:
        r9 = false;
        goto L44
    L30:
        if (r5.u == 0) goto L32;
        r5.A(r13, r14);
    L64:
        long r19 = r4.g.e;
        long r110 = -9223372036854775807L;
        if (r9 == true) goto L67;
    L73:
        boolean r20 = false;
    L74:
        if (r20 == false) goto L79;
        if (this.Z == false) goto L79;
        this.Z = false;
        int r21 = this.V.n;
        this.W.e(0);
        A0(this.N.c(this.V.e, false), r21, 5, false);
    L79:
        if (r20 == true) goto L81;
    L84:
        ph3 r22 = this.V;
        if (r22.e != 2) goto L120;
        ro2 r23 = this.F;
        if (this.i0 != 0) goto L90;
        boolean r24 = C();
    L115:
        if (r24 == false) goto L119;
        n0(3);
        this.o0 = null;
        if (r0() == true) goto L118;
    L83:
        boolean r25 = true;
    L151:
        if (this.V.e != 2) goto L175;
        int r26 = 0;
    L153:
        ez3[] r27 = this.n;
        if (r26 >= r27.length) goto L159;
        if (r27[r26].d(r4) == null) goto L158;
        G(r26);
    L158:
        r26 = r26 + 1;
        goto L153
    L159:
        ph3 r28 = this.V;
        if (r28.g == true) goto L175;
        if (r28.r >= 500000) goto L175;
        if (A(this.F.l) == false) goto L175;
        if (r0() == false) goto L175;
        long r29 = this.p0;
        vp4 r30 = this.D;
        if (r29 != (-9223372036854775807L)) goto L170;
        r30.getClass();
        this.p0 = SystemClock.elapsedRealtime();
    L177:
        if (r0() == true) goto L179;
    L181:
        boolean r31 = false;
    L183:
        if (this.h0 == true) goto L185;
    L188:
        r25 = false;
    L189:
        ph3 r32 = this.V;
        if (r32.p == r25) goto L192;
        this.V = r32.i(r25);
    L192:
        this.g0 = false;
        if (r25 == true) goto L204;
        int r33 = this.V.e;
        if (r33 == 4) goto L204;
        if (r31 == false) goto L199;
    L203:
        V(r1);
        goto L204
    L199:
        if (r33 == 2) goto L203;
        if (r33 != 3) goto L204;
        if (this.i0 != 0) goto L203;
    L204:
        Trace.endSection();
        return;
    L185:
        if (this.g0 == false) goto L188;
        if (r31 == false) goto L188;
    L179:
        if (this.V.e != 3) goto L181;
        r31 = r25;
        goto L183
    L170:
        r30.getClass();
        if ((SystemClock.elapsedRealtime() - this.p0) < WaveRetry.POLL_MS) goto L177;
        throw new StuckPlayerException(0, 4000);
    L175:
        this.p0 = -9223372036854775807L;
        goto L177
    L118:
        D0(false, false);
        xl0 r34 = this.B;
        r25 = true;
        r34.s = true;
        r34.n.g();
        t0();
    L119:
        r25 = true;
        if (this.V.e != 3) goto L151;
        if (this.i0 == 0) goto L126;
        if (r10 == true) goto L151;
    L129:
        D0(r0(), false);
        n0(2);
        if (this.a0 == false) goto L149;
        oo2 r35 = this.F.i;
    L132:
        if (r35 == null) goto L140;
        t41[] r36 = (t41[]) r35.o.q;
        int r37 = r36.length;
        int r111 = 0;
    L134:
        if (r111 >= r37) goto L139;
        t41 r112 = r36[r111];
        if (r112 == null) goto L138;
        r112.s();
    L138:
        r111 = r111 + 1;
        goto L134
    L139:
        r35 = r35.m;
        goto L132
    L140:
        ul0 r38 = this.H;
        long r39 = r38.h;
        if (r39 == r110) goto L149;
        long r40 = r39 + r38.b;
        r38.h = r40;
        long r113 = r38.g;
        if (r113 != r110) goto L146;
    L148:
        r38.l = r110;
        goto L149
    L146:
        if (r40 <= r113) goto L148;
        r38.h = r113;
    L149:
        v0();
        goto L151
    L126:
        if (C() == false) goto L129;
    L90:
        if (r10 == true) goto L93;
        r24 = false;
        goto L115
    L93:
        if (r22.g == true) goto L95;
    L94:
        r24 = true;
        goto L115
    L95:
        oo2 r41 = r23.i;
        if (s0(r22.a, r41.g.a) == false) goto L98;
        long r210 = this.H.h;
    L99:
        oo2 r42 = r23.l;
        if (r42.g() == true) goto L102;
    L104:
        boolean r43 = false;
    L106:
        if (r42.g.a.b() == true) goto L108;
    L110:
        boolean r114 = false;
    L111:
        if (r43 == true) goto L94;
        if (r114 == true) goto L94;
        long r211 = q(r42.d());
        cd2 r44 = this.s;
        ik3 r45 = this.J;
        cu4 r115 = this.V.a;
        mt2 r116 = r41.g.a;
        long r212 = this.k0 - r41.p;
        float r46 = this.B.i().a;
        boolean r47 = this.V.l;
        r24 = r44.j(new bd2(r45, r115, r116, r212, r211, r46, this.a0, r210));
        goto L115
    L108:
        if (r42.e == true) goto L110;
        r114 = true;
        goto L111
    L102:
        if (r42.g.j == false) goto L104;
        r43 = true;
        goto L106
    L98:
        r210 = -9223372036854775807L;
        goto L99
    L120:
        r110 = -9223372036854775807L;
        goto L119
    L81:
        if (r4.g.j == false) goto L84;
        n0(4);
        v0();
        goto L83
    L67:
        if (r4.e == false) goto L73;
        if (r19 != (-9223372036854775807L)) goto L71;
    L72:
        r20 = true;
        goto L74
    L71:
        if (r19 > this.V.s) goto L73;
    L63:
        r4.a.h();
        r9 = true;
        r10 = true;
        goto L64
    }

    public final void k0(n84 r1) {
        this.P = r1;
    }

    public final void l(oo2 r20, int r21, boolean r22, long r23) {
        ez3 r10 = this.n[r21];
        boolean r2 = r10.g();
        kq r3 = (kq) r10.e;
        if (r2 == false) goto L6;
        return;
    L6:
        if (r20 != this.F.i) goto L8;
        boolean r12 = true;
    L9:
        ew4 r4 = r20.o;
        dz3 r5 = ((dz3[]) r4.p)[r21];
        t41 r6 = ((t41[]) r4.q)[r21];
        if (r0() == true) goto L12;
    L14:
        boolean r13 = false;
    L15:
        if (r22 == true) goto L18;
        if (r13 == false) goto L18;
        boolean r14 = true;
    L19:
        this.i0++;
        q44 r7 = r20.c[r21];
        long r8 = r20.p;
        mt2 r9 = r20.g.a;
        kq r15 = (kq) r10.f;
        if (r6 == null) goto L23;
        int r11 = r6.length();
    L24:
        tb1[] r16 = new tb1[r11];
        int r17 = 0;
    L25:
        if (r17 >= r11) goto L27;
        r6.getClass();
        r16[r17] = r6.g(r17);
        r17 = r17 + 1;
        goto L25
    L27:
        int r18 = r10.d;
        xl0 r19 = this.B;
        if (r18 == 0) goto L39;
        if (r18 == 2) goto L39;
        if (r18 == 4) goto L39;
        r10.b = true;
        r15.getClass();
        if (r15.u != 0) goto L37;
        boolean r24 = true;
    L38:
        rr2.w(r24);
        r15.q = r5;
        r15.D = r9;
        r15.u = 1;
        r15.q(r14, r12);
        r15.B(r16, r7, r23, r8, r9);
        r15.C(r23, r14, true);
        r19.a(r15);
    L44:
        k41 r25 = new k41(this);
        kq r0 = r10.d(r20);
        r0.getClass();
        r0.c(11, r25);
        if (r13 == false) goto L50;
        if (r12 == false) goto L51;
        r10.m();
        return;
    L51:
        return;
    L50:
        return;
    L37:
        r24 = false;
    L39:
        r10.a = true;
        if (r3.u != 0) goto L42;
        boolean r110 = true;
    L43:
        rr2.w(r110);
        r3.q = r5;
        r3.D = r9;
        r3.u = 1;
        r3.q(r14, r12);
        r3.B(r16, r7, r23, r8, r9);
        r3.C(r23, r14, true);
        r19.a(r3);
        goto L44
    L42:
        r110 = false;
        goto L43
    L23:
        r11 = 0;
    L18:
        r14 = false;
        goto L19
    L12:
        if (this.V.e != 3) goto L14;
        r13 = true;
        goto L15
    L8:
        r12 = false;
        goto L9
    }

    public final void l0(boolean r3) {
        this.e0 = r3;
        cu4 r0 = this.V.a;
        ro2 r1 = this.F;
        r1.h = r3;
        int r4 = r1.s(r0);
        if ((r4 & 1) == 0) goto L6;
        W(true);
    L8:
        v(false);
        return;
    L6:
        if ((r4 & 2) == 0) goto L8;
        h();
        goto L8
    }

    public final void m(boolean[] r9, long r10) {
        oo2 r2 = this.F.j;
        ew4 r0 = r2.o;
        int r3 = 0;
    L3:
        ez3[] r7 = this.n;
        if (r3 >= r7.length) goto L9;
        if (r0.n(r3) == true) goto L8;
        r7[r3].k();
    L8:
        r3 = r3 + 1;
        goto L3
    L9:
        int r4 = 0;
    L11:
        if (r4 >= r7.length) goto L19;
        if (r0.n(r4) == true) goto L15;
    L16:
        q41 r1 = this;
        long r5 = r10;
    L18:
        r4 = r4 + 1;
        q41 this = r1;
        r10 = r5;
        goto L11
    L15:
        if (r7[r4].d(r2) != null) goto L16;
        r1 = this;
        r5 = r10;
        r1.l(r2, r4, r9[r4], r5);
        goto L18
    }

    public final void m0(pd4 r8) {
        this.W.e(1);
        fo1 r0 = this.G;
        int r1 = ((ArrayList) r0.c).size();
        if (r8.b.length == r1) goto L5;
        r8 = new pd4(new Random(r8.a.nextLong())).a(0, r1);
    L5:
        r0.k = r8;
        w(r0.f(), false);
    }

    public final long n(cu4 r4, Object r5, long r6) {
        zt4 r0 = this.y;
        int r7 = r4.g(r5, r0).c;
        bu4 r3 = this.x;
        r4.n(r7, r3);
        if (r3.e != (-9223372036854775807L)) goto L5;
    L11:
        return -9223372036854775807L;
    L5:
        if (r3.a() == false) goto L11;
        if (r3.h == false) goto L11;
        return f35.Q(f35.B(r3.f) - r3.e) - (r6 + r0.e);
    }

    public final void n0(int r4) {
        ph3 r0 = this.V;
        if (r0.e != r4) goto L5;
        return;
    L5:
        if (r4 == 2) goto L8;
        this.p0 = -9223372036854775807L;
    L8:
        if (r4 != 3) goto L10;
    L12:
        this.V = this.V.h(r4);
        return;
    L10:
        if (r0.p == false) goto L12;
        this.V = r0.i(false);
        goto L12
    }

    public final long o(oo2 r9) {
        if (r9 != null) goto L5;
        return 0;
    L5:
        long r0 = r9.p;
        if (r9.e == true) goto L8;
        return r0;
    L8:
        int r2 = 0;
    L9:
        ez3[] r3 = this.n;
        if (r2 >= r3.length) goto L18;
        if (r3[r2].d(r9) == null) goto L17;
        kq r4 = r3[r2].d(r9);
        Objects.requireNonNull(r4);
        long r5 = r4.z;
        if (r5 == Long.MIN_VALUE) goto L15;
        r0 = Math.max(r5, r0);
        goto L17
    L15:
        return Long.MIN_VALUE;
    L17:
        r2 = r2 + 1;
        goto L9
    L18:
        return r0;
    }

    public final void o0(c55 r7) {
        ez3[] r6 = this.n;
        int r0 = r6.length;
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L13;
        ez3 r2 = r6[r1];
        kq r3 = (kq) r2.e;
        int r4 = r3.o;
        if (r4 != 2) goto L7;
    L9:
        r3.c(7, r7);
        kq r5 = (kq) r2.f;
        if (r5 == null) goto L12;
        r5.c(7, r7);
    L12:
        r1 = r1 + 1;
        goto L3
    L7:
        if (r4 == 4) goto L9;
    }

    public final Pair p(cu4 r10) {
        long r1 = 0;
        if (r10.p() == true) goto L5;
        int r6 = r10.a(this.e0);
        zt4 r5 = this.y;
        Pair r11 = r10.i(this.x, r5, r6, -9223372036854775807L);
        mt2 r0 = this.F.q(r10, r11.first, 0);
        long r4 = ((Long) r11.second).longValue();
        if (r0.b() == false) goto L13;
        Object r12 = r0.a;
        zt4 r9 = this.y;
        r10.g(r12, r9);
        if (r0.c != r9.f(r0.b)) goto L11;
        r1 = r9.g.b;
    L11:
        r4 = r1;
    L13:
        return Pair.create(r0, Long.valueOf(r4));
    L5:
        return Pair.create(ph3.u, 0L);
    }

    public final void p0(Object r9, q90 r10) {
        ez3[] r0 = this.n;
        int r1 = r0.length;
        int r2 = 0;
    L4:
        if (r2 >= r1) goto L15;
        ez3 r4 = r0[r2];
        kq r5 = (kq) r4.e;
        if (r5.o != 2) goto L14;
        int r3 = r4.d;
        if (r3 == 4) goto L13;
        if (r3 == 1) goto L13;
        r5.c(1, r9);
    L13:
        kq r6 = (kq) r4.f;
        r6.getClass();
        r6.c(1, r9);
    L14:
        r2 = r2 + 1;
        goto L4
    L15:
        int r11 = this.V.e;
        if (r11 == 3) goto L18;
        if (r11 == 2) goto L18;
    L19:
        if (r10 == null) goto L26;
        r10.d();
        return;
    L26:
        return;
    L18:
        this.u.g(2);
        goto L19
    }

    public final long q(long r8) {
        oo2 r0 = this.F.l;
        if (r0 != null) goto L6;
        return 0;
    L6:
        return Math.max(0, r8 - (this.k0 - r0.p));
    }

    public final void q0(float r7) {
        this.t0 = r7;
        float r8 = r7 * this.N.g;
        ez3[] r6 = this.n;
        int r0 = r6.length;
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L11;
        ez3 r2 = r6[r1];
        kq r3 = (kq) r2.e;
        if (r3.o != 1) goto L10;
        r3.c(2, Float.valueOf(r8));
        kq r4 = (kq) r2.f;
        if (r4 == null) goto L10;
        r4.c(2, Float.valueOf(r8));
    L10:
        r1 = r1 + 1;
        goto L3
    }

    public final void r(int r4) {
        ph3 r0 = this.V;
        boolean r1 = r0.l;
        A0(r4, r0.n, r0.m, r1);
    }

    public final boolean r0() {
        ph3 r1 = this.V;
        if (r1.l == true) goto L5;
        return false;
    L5:
        if (r1.n != 0) goto L10;
        return true;
    L10:
        return false;
    }

    public final void s() {
        q0(this.t0);
    }

    public final boolean s0(cu4 r3, mt2 r4) {
        if (r4.b() == false) goto L5;
        return false;
    L5:
        if (r3.p() == true) goto L20;
        int r5 = r3.g(r4.a, this.y).c;
        bu4 r2 = this.x;
        r3.n(r5, r2);
        if (r2.a() == true) goto L10;
        return false;
    L10:
        if (r2.h == true) goto L12;
        return false;
    L12:
        if (r2.e == (-9223372036854775807L)) goto L19;
        return true;
    L19:
        return false;
    L20:
        return false;
    }

    public final void t(no2 r4) {
        ro2 r0 = this.F;
        oo2 r1 = r0.l;
        if (r1 != null) goto L5;
    L8:
        oo2 r2 = r0.m;
        if (r2 != null) goto L11;
        return;
    L11:
        if (r2.a != r4) goto L15;
        E();
        return;
    L15:
        return;
    L5:
        if (r1.a != r4) goto L8;
        r0.n(this.k0);
        D();
    }

    public final void t0() {
        oo2 r0 = this.F.i;
        if (r0 == null) goto L13;
        ew4 r1 = r0.o;
        int r2 = 0;
    L6:
        ez3[] r3 = this.n;
        if (r2 >= r3.length) goto L17;
        if (r1.n(r2) == false) goto L12;
        r3[r2].m();
    L12:
        r2 = r2 + 1;
        goto L6
    L17:
        return;
    }

    public final void u(IOException r3, int r4) {
        ExoPlaybackException r0 = new ExoPlaybackException(0, r3, r4);
        oo2 r5 = this.F.i;
        if (r5 == null) goto L5;
        r0 = r0.b(r5.g.a);
    L5:
        l93.G("ExoPlayerImplInternal", "Playback error", r0);
        u0(false, false);
        this.V = this.V.f(r0);
    }

    public final void u0(boolean r3, boolean r4) {
        if (r3 == false) goto L5;
    L8:
        boolean r5 = true;
    L9:
        P(r5, false, true, false);
        this.W.e(r4 ? 1 : 0);
        this.s.c(this.J);
        this.N.c(1, this.V.l);
        n0(1);
        return;
    L5:
        if (this.f0 == false) goto L8;
        r5 = false;
        goto L9
    }

    public final void v(boolean r6) {
        oo2 r0 = this.F.l;
        if (r0 != null) goto L5;
        mt2 r1 = this.V.b;
    L6:
        boolean r2 = this.V.k.equals(r1);
        if (r2 == true) goto L9;
        this.V = this.V.c(r1);
    L9:
        ph3 r3 = this.V;
        if (r0 != null) goto L12;
        long r4 = r3.s;
    L13:
        r3.q = r4;
        ph3 r5 = this.V;
        r5.r = q(r5.q);
        if (r2 == false) goto L16;
        if (r6 == true) goto L16;
        return;
    L16:
        if (r0 != null) goto L18;
        return;
    L18:
        if (r0.e == false) goto L23;
        x0(r0.g.a, r0.n, r0.o);
        return;
    L23:
        return;
    L12:
        r4 = r0.d();
        goto L13
    L5:
        r1 = r0.g.a;
        goto L6
    }

    public final void v0() {
        xl0 r0 = this.B;
        int r1 = 0;
        r0.s = false;
        zq2 r2 = r0.n;
        if (r2.p == false) goto L5;
        r2.f(r2.j());
        r2.p = false;
    L5:
        ez3[] r5 = this.n;
        int r3 = r5.length;
    L6:
        if (r1 >= r3) goto L15;
        ez3 r4 = r5[r1];
        kq r6 = (kq) r4.f;
        kq r7 = (kq) r4.e;
        if (ez3.h(r7) == false) goto L10;
        ez3.b(r7);
    L10:
        if (r6 == null) goto L14;
        if (r6.u == 0) goto L14;
        ez3.b(r6);
    L14:
        r1 = r1 + 1;
        goto L6
    }

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
    public final void w(cu4 r44, boolean r45) {
        ph3 r0 = this.V;
        p41 r3 = this.j0;
        ro2 r9 = this.F;
        int r4 = this.d0;
        boolean r5 = this.e0;
        bu4 r2 = this.x;
        zt4 r8 = this.y;
        if (r44.p() == false) goto L5;
        ?? r26 = 0;
        ?? r20 = 0;
        ?? r24 = 0;
        cu4 r6 = r44;
        o41 r10 = new o41(ph3.u, 0, -9223372036854775807L, false, true, false);
    L135:
        mt2 r11 = r10.a;
        ?? r12 = r10.c;
        boolean r7 = r10.d;
        long r14 = r10.b;
        if (this.V.b.equals(r11) == true) goto L138;
    L141:
        boolean r22 = true;
    L313:
        if (r10.e == true) goto L296;
        boolean r13 = true;
        char r15 = 4;
    L158:
        ez3[] r1 = this.n;     // Catch: Throwable -> L151
        int r16 = r1.length;     // Catch: Throwable -> L151
        ?? r17 = 0;
    L160:
        if (r17 >= r16) goto L306;
        ez3 r18 = r1[r17];     // Catch: Throwable -> L171
        kq r19 = (kq) r18.e;     // Catch: Throwable -> L171
        if (Objects.equals(r19.C, r6) == true) goto L164;
        r19.C = r6;     // Catch: Throwable -> L171
        r19.y();     // Catch: Throwable -> L171
    L164:
        kq r21 = (kq) r18.f;     // Catch: Throwable -> L171
        if (r21 == null) goto L169;
        if (Objects.equals(r21.C, r6) == true) goto L169;
        r21.C = r6;     // Catch: Throwable -> L171
        r21.y();     // Catch: Throwable -> L171
    L169:
        r17 = r17 + 1;
    L171:
        th = th;
        ?? r110 = r6;
        mt2 r23 = r11;
        ?? r27 = r15;
        ?? r25 = r12;
        ?? r111 = 0;
        ?? r28 = 1;
    L265:
        ph3 r29 = this.V;
        cu4 r30 = r29.a;
        mt2 r31 = r29.b;
        if (r10.f == false) goto L268;
        long r32 = r14;
    L269:
        mt2 r33 = r23;
        C0(r110, r33, r30, r31, r32, false);
        if (r22 == false) goto L272;
    L273:
        ph3 r34 = this.V;
        Object r35 = r34.b.a;
        cu4 r36 = r34.a;
        if (r22 == false) goto L281;
        if (r45 == false) goto L281;
        if (r36.p() == true) goto L281;
        if (r36.g(r35, this.y).f == true) goto L281;
        ?? r37 = r28;
    L282:
        if (r37 == 0) goto L284;
        long r38 = r14;
    L286:
        if (r110.b(r35) != (-1)) goto L289;
        ?? r112 = r27;
    L290:
        this.V = z(r33, r14, r25, r38, r37, r112);
    L291:
        Q();
        S(r110, this.V.a);
        this.V = this.V.j(r110);
        if (r110.p() == true) goto L294;
        this.j0 = r111;
    L294:
        v(false);
        this.u.g(2);
        throw th;
    L289:
        r112 = 3;
        goto L290
    L284:
        r38 = this.V.d;
    L281:
        r37 = 0;
        goto L282
    L272:
        if (r25 == this.V.c) goto L291;
    L268:
        r32 = -9223372036854775807L;
        goto L269
    L306:
        if (r22 == false) goto L315;
        r17 = r6;
        r26 = r15;
        r24 = r12;
        p41 r113 = null;
        r113 = null;
        ?? r114 = 0;
        r12 = 0;
        boolean r210 = true;
        r210 = true;
        ?? r211 = 1;
        r20 = 1;
        ?? r212 = r24;
        ?? r213 = r26;
        if (r17.p() == false) goto L214;
    L201:
        r23 = r11;
        ?? r214 = r212;
        ?? r215 = r213;
    L232:
        ph3 r39 = this.V;
        cu4 r40 = r39.a;
        mt2 r41 = r39.b;
        if (r10.f == false) goto L235;
        long r42 = r14;
    L236:
        mt2 r43 = r23;
        C0(r44, r43, r40, r41, r42, false);
        if (r22 == false) goto L239;
    L240:
        ph3 r46 = this.V;
        Object r47 = r46.b.a;
        cu4 r48 = r46.a;
        if (r22 == false) goto L248;
        if (r45 == false) goto L248;
        if (r48.p() == true) goto L248;
        if (r48.g(r47, this.y).f == true) goto L248;
        boolean r49 = r210;
    L249:
        if (r49 == false) goto L251;
        long r50 = r14;
    L253:
        if (r44.b(r47) != (-1)) goto L256;
        ?? r115 = r215;
    L257:
        this.V = z(r43, r14, r214, r50, r49, r115);
    L258:
        Q();
        S(r44, this.V.a);
        this.V = this.V.j(r44);
        if (r44.p() == true) goto L261;
        this.j0 = r113;
    L261:
        v(false);
        this.u.g(2);
        return;
    L256:
        r115 = 3;
        goto L257
    L251:
        r50 = this.V.d;
    L248:
        r49 = false;
        goto L249
    L239:
        if (r214 == this.V.c) goto L258;
    L235:
        r42 = -9223372036854775807L;
        goto L236
    L214:
        oo2 r51 = this.F.i;     // Catch: Throwable -> L195
    L215:
        if (r51 != null) goto L217;
        ro2 r52 = this.F;     // Catch: Throwable -> L230
        if (r52.i == r52.j) goto L225;
        boolean r53 = true;
    L224:
        r23 = r11;
        r14 = Y(r23, r14, r53, r7);     // Catch: Throwable -> L228
        r214 = r24;
        r215 = r26;
    L228:
        th = th;
        r14 = r14;
        ?? r54 = r17;
        ?? r216 = r24;
        ?? r217 = r26;
    L197:
        r110 = r54;
        r111 = r114;
        r28 = r211;
        r25 = r216;
        r27 = r217;
        goto L265
    L225:
        r53 = false;
    L230:
        th = th;
    L196:
        r23 = r11;
        r54 = r17;
        r114 = r12;
        r211 = r20;
        r216 = r24;
        r217 = r26;
        goto L197
    L217:
        if (r51.g.a.equals(r11) == false) goto L219;
        r51.g = this.F.i(r17, r51.g);     // Catch: Throwable -> L195
        r51.k();     // Catch: Throwable -> L195
    L219:
        r51 = r51.m;     // Catch: Throwable -> L195
        goto L215
    L315:
        oo2 r55 = this.F.j;     // Catch: Throwable -> L210
        if (r55 != null) goto L177;
        long r56 = 0;
    L178:
        if (f() == false) goto L185;
        oo2 r57 = this.F.k;     // Catch: Throwable -> L171
        if (r57 == null) goto L185;
        long r58 = o(r57);     // Catch: Throwable -> L171
    L304:
        char r59 = r15;
        r26 = r59;
        r24 = r12;
        r12 = 0;
        r113 = null;
        r113 = null;
        r113 = null;
        r20 = 1;
        r210 = true;
        r210 = true;
        r210 = true;
        int r60 = this.F.t(r44, this.k0, r56, r58);     // Catch: Throwable -> L202
        if ((r60 & 1) != 0) goto L194;
        r212 = r24;
        r213 = r26;
        if ((r60 & 2) == 0) goto L201;
        h();     // Catch: Throwable -> L195
        r212 = r24;
        r213 = r26;
        goto L201
    L194:
        W(false);     // Catch: Throwable -> L195
        r212 = r24;
        r213 = r26;
    L202:
        th = th;
        r17 = r44;
    L204:
        th = th;
        r17 = r44;
        r26 = r59;
    L206:
        r24 = r12;
        r12 = 0;
        r20 = 1;
    L207:
        th = th;
        cu4 r61 = r44;
    L209:
        r26 = r15;
        r17 = r61;
    L185:
        r58 = 0;
        goto L304
    L177:
        r56 = o(r55);     // Catch: Throwable -> L210
    L210:
        th = th;
        r61 = r6;
    L195:
        th = th;
    L151:
        th = th;
    L152:
        r110 = r6;
        r23 = r11;
        r28 = r13;
        r27 = r15;
        r25 = r12;
        r111 = 0;
        goto L265
    L296:
        r13 = true;
        if (this.V.e == 1) goto L153;
        r15 = 4;
        n0(4);     // Catch: Throwable -> L151
    L154:
        P(false, false, false, true);     // Catch: Throwable -> L151
        goto L158
    L153:
        r15 = 4;
    L155:
        th = th;
        r13 = true;
        r15 = 4;
    L263:
        th = th;
        r110 = r6;
        r23 = r11;
        r25 = r12;
        r111 = 0;
        r28 = 1;
        r27 = 4;
        goto L265
    L138:
        if (r14 != this.V.s) goto L141;
        r22 = false;
        goto L313
    L5:
        mt2 r62 = r0.b;
        Object r116 = r62.a;
        cu4 r63 = r0.a;
        boolean r218 = r63.p();
        if (r218 == false) goto L8;
    L11:
        boolean r117 = true;
    L13:
        if (r0.b.b() == true) goto L18;
        if (r117 == true) goto L18;
        long r118 = r0.s;
    L17:
        long r219 = r118;
        if (r3 == null) goto L33;
        mt2 r119 = r62;
        long r310 = 1;
        r6 = r44;
        Pair r64 = T(r6, r3, true, r4, r5, r2, r8);
        if (r64 != null) goto L23;
        int r65 = r6.a(r5);
        long r66 = r219;
        boolean r67 = true;
        boolean r120 = false;
        boolean r121 = false;
    L32:
        boolean r311 = r67;
        boolean r312 = r120;
        boolean r410 = r121;
        long r411 = r66;
        bu4 r68 = r2;
        long r69 = r411;
        int r70 = -1;
    L59:
        if (r65 == r70) goto L61;
        zt4 r71 = r8;
        Pair r72 = r6.i(r68, r71, r65, -9223372036854775807L);
        r116 = r72.first;
        long r220 = -9223372036854775807L;
        long r73 = ((Long) r72.second).longValue();
    L62:
        mt2 r74 = r9.q(r6, r116, r73);
        int r75 = r74.e;
        if (r75 == r70) goto L69;
        int r76 = r119.e;
        if (r76 == r70) goto L68;
        if (r75 >= r76) goto L69;
    L68:
        boolean r77 = false;
    L70:
        boolean r78 = r119.a.equals(r116);
        if (r78 == true) goto L73;
    L78:
        boolean r79 = false;
    L79:
        zt4 r80 = r6.g(r116, r71);
        if (r117 == false) goto L82;
    L95:
        boolean r81 = false;
    L101:
        if (r79 == true) goto L103;
        if (r81 == true) goto L103;
    L104:
        long r82 = r73;
        if (r74.b() == true) goto L107;
        if (r78 == true) goto L115;
    L109:
        long r313 = r82;
        long r314 = r220;
    L134:
        r10 = new o41(r74, r313, r314, r312, r311, r410);
        r20 = r218;
        r24 = r219;
        goto L135
    L115:
        r82 = r73;
        if (r119.b() == false) goto L109;
        x5 r83 = r6.g(r116, r71).g.a(r119.b);
        long r84 = r83.j;
        long r122 = r0.c;
        if (r122 == (-9223372036854775807L)) goto L124;
        mt2 r85 = r119;
        long r123 = r83.a;
        if (r123 == Long.MIN_VALUE) goto L125;
        r82 = r73;
        if ((r123 + r84) <= r122) goto L109;
    L125:
        int r124 = r83.b;
        int r86 = r85.c;
        r82 = r73;
        if (r124 <= r86) goto L109;
        r82 = r73;
        if (r83.f[r86] != 2) goto L109;
        long r87 = r6.g(r116, r71).d;
        if (r87 == (-9223372036854775807L)) goto L132;
        long r88 = Math.min(r87 - r310, r73 + r84);
    L133:
        long r315 = r88;
        r314 = r315;
        r313 = r315;
        goto L134
    L132:
        r88 = r73 + r84;
        goto L133
    L124:
        r85 = r119;
        goto L125
    L107:
        if (r74.equals(r119) == false) goto L110;
        r82 = r0.s;
        goto L109
    L110:
        r6.g(r74.a, r71);
        if (r74.c != r71.f(r74.b)) goto L113;
        r82 = r71.g.b;
        goto L109
    L113:
        r82 = 0;
    L103:
        r74 = r119;
        goto L104
    L82:
        if (r219 != r220) goto L95;
        Object r125 = r119.a;
        int r126 = r119.c;
        int r127 = r119.b;
        if (r125.equals(r74.a) == false) goto L95;
        if (r119.b() == false) goto L97;
        if (r80.h(r127) == false) goto L97;
        if (r80.e(r127, r126) == 4) goto L95;
        if (r80.e(r127, r126) == 2) goto L95;
    L94:
        r81 = true;
    L97:
        if (r74.b() == false) goto L95;
        if (r80.h(r74.b) == false) goto L95;
    L73:
        if (r119.b() == true) goto L78;
        if (r74.b() == true) goto L78;
        if (r77 == false) goto L78;
        r79 = true;
    L69:
        r77 = true;
        goto L70
    L61:
        r71 = r8;
        r220 = r69;
        r73 = r69;
        goto L62
    L23:
        long r89 = r3.c;
        Object r90 = r64.first;
        if (r89 != (-9223372036854775807L)) goto L26;
        r65 = r6.g(r90, r8).c;
        long r91 = r219;
        boolean r92 = false;
    L28:
        if (r0.e != 4) goto L30;
        r120 = true;
    L31:
        r121 = r92;
        r67 = false;
        r66 = r91;
        goto L32
    L30:
        r120 = false;
        goto L31
    L26:
        r116 = r90;
        r65 = -1;
        r92 = true;
        r91 = ((Long) r64.second).longValue();
        goto L28
    L33:
        r119 = r62;
        r310 = 1;
        r6 = r44;
        if (r0.a.p() == false) goto L40;
        r65 = r6.a(r5);
        r68 = r2;
    L36:
        r70 = -1;
    L37:
        r312 = false;
        r311 = false;
        long r93 = r219;
    L38:
        r410 = false;
        r69 = r93;
        goto L59
    L40:
        if (r6.b(r116) != (-1)) goto L46;
        int r94 = U(r2, r8, r4, r5, r116, r0.a, r6);
        r68 = r2;
        r6 = r6;
        r8 = r8;
        if (r94 != (-1)) goto L44;
        int r95 = r6.a(r5);
        boolean r96 = true;
    L45:
        r311 = r96;
        r116 = r116;
        r65 = r95;
        r70 = -1;
        r93 = r219;
        r312 = false;
        goto L38
    L44:
        r95 = r94;
        r96 = false;
        goto L45
    L46:
        r68 = r2;
        if (r219 != (-9223372036854775807L)) goto L49;
        int r97 = r6.g(r116, r8).c;
        r116 = r116;
        r65 = r97;
        goto L36
    L49:
        if (r117 == false) goto L58;
        r0.a.g(r119.a, r8);
        if (r0.a.m(r8.c, r68, 0).m != r0.a.b(r119.a)) goto L54;
        Pair r98 = r6.i(r68, r8, r6.g(r116, r8).c, r219 + r8.e);
        r116 = r98.first;
        long r99 = ((Long) r98.second).longValue();
    L57:
        r69 = r99;
        r70 = -1;
        r65 = -1;
        r312 = false;
        r311 = false;
        r410 = true;
        goto L59
    L54:
        if (r6.g(r116, r8).d == (-9223372036854775807L)) goto L56;
        r26 = 0;
        r116 = r116;
        r99 = f35.k(r219, 0, r8.d - 1);
        goto L57
    L56:
        r116 = r116;
        r99 = r219;
        goto L57
    L58:
        r116 = r116;
        r70 = -1;
        r65 = -1;
    L18:
        r118 = r0.c;
        goto L17
    L8:
        if (r63.g(r62.a, r8).f == true) goto L11;
        r117 = false;
        goto L13
    }

    public final void w0() {
        oo2 r0 = this.F.l;
        if (this.c0 == true) goto L9;
        if (r0 != null) goto L6;
    L8:
        boolean r1 = false;
    L10:
        ph3 r2 = this.V;
        if (r1 == r2.g) goto L14;
        this.V = r2.b(r1);
        return;
    L14:
        return;
    L6:
        if (r0.a.f() == false) goto L8;
    L9:
        r1 = true;
        goto L10
    }

    public final void x(no2 r13) {
        ro2 r0 = this.F;
        oo2 r1 = r0.l;
        xl0 r2 = this.B;
        if (r1 != null) goto L5;
    L15:
        int r12 = 0;
    L17:
        if (r12 >= r0.q.size()) goto L22;
        oo2 r4 = (oo2) r0.q.get(r12);
        if (r4.a == r13) goto L23;
        r12 = r12 + 1;
    L23:
        if (r4 == null) goto L32;
        rr2.w(!r4.e);
        float r14 = r2.i().a;
        ph3 r3 = this.V;
        r4.f(r14, r3.a, r3.l);
        oo2 r15 = r0.m;
        if (r15 != null) goto L27;
        return;
    L27:
        if (r15.a != r13) goto L34;
        E();
        return;
    L34:
        return;
    L32:
        return;
    L22:
        r4 = null;
        goto L23
    L5:
        if (r1.a != r13) goto L15;
        r1.getClass();
        if (r1.e == true) goto L9;
        float r16 = r2.i().a;
        ph3 r5 = this.V;
        r1.f(r16, r5.a, r5.l);
    L9:
        x0(r1.g.a, r1.n, r1.o);
        if (r1 != r0.i) goto L12;
        R(true, r1.g.b);
        m(new boolean[this.n.length], r0.j.e());
        r1.h = true;
        ph3 r17 = this.V;
        mt2 r6 = r17.b;
        long r7 = r1.g.b;
        q41 r8 = this;
        r8.V = z(r6, r7, r17.c, r7, false, 5);
    L13:
        r8.D();
        return;
    L12:
        r8 = this;
        goto L13
    }

    public final void x0(mt2 r18, tv4 r19, ew4 r20) {
        ro2 r1 = this.F;
        oo2 r2 = r1.l;
        r2.getClass();
        oo2 r3 = r1.i;
        long r4 = this.k0;
        long r5 = r2.p;
        if (r2 != r3) goto L5;
    L4:
        long r6 = r4 - r5;
        long r11 = q(r2.d());
        if (s0(this.V.a, r2.g.a) == false) goto L10;
        long r7 = this.H.h;
    L9:
        long r15 = r7;
        cu4 r8 = this.V.a;
        float r13 = this.B.i().a;
        boolean r9 = this.V.l;
        boolean r14 = this.a0;
        bd2 r10 = new bd2(this.J, r8, r18, r6, r11, r13, r14, r15);
        t41[] r12 = (t41[]) r20.q;
        this.s.f(r10, r19, r12);
        return;
    L10:
        r7 = -9223372036854775807L;
        goto L9
    L5:
        r4 = r4 - r5;
        r5 = r2.g.b;
        goto L4
    }

    public final void y(qh3 r5, float r6, boolean r7, boolean r8) {
        if (r7 == false) goto L6;
        if (r8 == false) goto L5;
        this.W.e(1);
    L5:
        this.V = this.V.g(r5);
    L6:
        float r9 = r5.a;
        oo2 r10 = this.F.i;
    L7:
        int r0 = 0;
        if (r10 == null) goto L16;
        t41[] r1 = (t41[]) r10.o.q;
        int r2 = r1.length;
    L10:
        if (r0 >= r2) goto L15;
        t41 r3 = r1[r0];
        if (r3 == null) goto L14;
        r3.p(r9);
    L14:
        r0 = r0 + 1;
        goto L10
    L15:
        r10 = r10.m;
        goto L7
    L16:
        ez3[] r4 = this.n;
        int r11 = r4.length;
    L17:
        if (r0 >= r11) goto L22;
        ez3 r12 = r4[r0];
        float r13 = r5.a;
        ((kq) r12.e).D(r6, r13);
        kq r14 = (kq) r12.f;
        if (r14 == null) goto L21;
        r14.D(r6, r13);
    L21:
        r0 = r0 + 1;
        goto L17
    }

    public final void y0(int r7, int r8, List r9) {
        boolean r1 = true;
        this.W.e(1);
        fo1 r0 = this.G;
        r0.getClass();
        ArrayList r2 = (ArrayList) r0.c;
        if (r7 < 0) goto L8;
        if (r7 > r8) goto L8;
        if (r8 > r2.size()) goto L8;
        boolean r4 = true;
    L9:
        rr2.l(r4);
        if (r9.size() == (r8 - r7)) goto L13;
        r1 = false;
    L13:
        rr2.l(r1);
        int r3 = r7;
    L14:
        if (r3 >= r8) goto L16;
        ((bu2) r2.get(r3)).a.s((gn2) r9.get(r3 - r7));
        r3 = r3 + 1;
        goto L14
    L16:
        w(r0.f(), false);
        return;
    L8:
        r4 = false;
        goto L9
    }

    public final ph3 z(mt2 r17, long r18, long r20, long r22, boolean r24, int r25) {
        if (this.n0 == false) goto L5;
    L10:
        boolean r3 = true;
    L11:
        this.n0 = r3;
        Q();
        ph3 r4 = this.V;
        tv4 r8 = r4.h;
        ew4 r9 = r4.i;
        List r10 = r4.j;
        if (this.G.a == false) goto L68;
        oo2 r5 = this.F.i;
        if (r5 != null) goto L16;
        r8 = tv4.d;
    L17:
        if (r5 != null) goto L19;
        r9 = this.r;
    L20:
        t41[] r11 = (t41[]) r9.q;
        uw1 r12 = new uw1(4);
        int r13 = r11.length;
        int r14 = 0;
        boolean r15 = false;
    L21:
        if (r14 >= r13) goto L29;
        t41 r16 = r11[r14];
        if (r16 == null) goto L28;
        qv2 r19 = r16.g(0).l;
        if (r19 != null) goto L27;
        r12.c(new qv2(new pv2[0]));
        goto L28
    L27:
        r12.c(r19);
        r15 = true;
    L28:
        r14 = r14 + 1;
        goto L21
    L29:
        if (r15 == false) goto L32;
        gy3 r6 = r12.f();
    L31:
        r10 = r6;
        if (r5 == null) goto L37;
        po2 r7 = r5.g;
        if (r7.c == r20) goto L37;
        r5.g = r7.a(r20);
    L37:
        ez3[] r21 = this.n;
        ro2 r23 = this.F;
        oo2 r110 = r23.i;
        if (r110 != r23.j) goto L66;
        if (r110 == null) goto L66;
        ew4 r26 = r110.o;
        int r111 = 0;
        boolean r112 = false;
    L43:
        if (r111 >= r21.length) goto L53;
        if (r26.n(r111) == false) goto L52;
        if (((kq) r21[r111].e).o != 1) goto L48;
        if (((dz3[]) r26.p)[r111].a == 0) goto L52;
        r112 = true;
        goto L52
    L48:
        boolean r113 = false;
    L54:
        if (r112 == false) goto L57;
        if (r113 == false) goto L57;
        boolean r114 = true;
    L59:
        if (r114 == this.h0) goto L66;
        this.h0 = r114;
        if (r114 == true) goto L66;
        if (this.V.p == false) goto L66;
        this.u.g(2);
    L57:
        r114 = false;
    L52:
        r111 = r111 + 1;
        goto L43
    L53:
        r113 = true;
    L66:
        ew4 r115 = r9;
        List r116 = r10;
        tv4 r117 = r8;
        if (r24 == false) goto L80;
        n41 r27 = this.W;
        if (r27.e == true) goto L74;
    L79:
        r27.d = true;
        r27.e = true;
        r27.c = r25;
        goto L80
    L74:
        if (r27.c == 5) goto L79;
        if (r25 != 5) goto L77;
        boolean r28 = true;
    L78:
        rr2.l(r28);
        goto L80
    L77:
        r28 = false;
    L80:
        ph3 r2 = this.V;
        return r2.d(r17, r18, r20, r22, q(r2.q), r117, r115, r116);
    L32:
        vw1 r29 = yw1.o;
        r6 = gy3.r;
        goto L31
    L19:
        r9 = r5.o;
        goto L20
    L16:
        r8 = r5.n;
        goto L17
    L68:
        if (r17.equals(r4.b) == true) goto L66;
        r8 = tv4.d;
        r9 = this.r;
        r10 = gy3.r;
        goto L66
    L5:
        if (r18 != this.V.s) goto L10;
        if (r17.equals(this.V.b) == false) goto L10;
        r3 = false;
        goto L11
    }

    public final void z0() {
        if (this.V.a.p() == false) goto L5;
        return;
    L5:
        if (this.G.a == false) goto L415;
        this.F.n(this.k0);
        ro2 r1 = this.F;
        oo2 r2 = r1.l;
        if (r2 != null) goto L10;
    L17:
        ro2 r12 = this.F;
        long r3 = this.k0;
        ph3 r4 = this.V;
        oo2 r5 = r12.l;
        if (r5 != null) goto L20;
        po2 r6 = r12.e(r4.a, r4.b, r4.c, r4.s);
    L21:
        if (r6 == null) goto L62;
        ro2 r7 = this.F;
        oo2 r8 = r7.l;
        if (r8 != null) goto L26;
        long r9 = 1000000000000L;
    L25:
        long r14 = r9;
        int r10 = 0;
    L29:
        if (r10 >= r7.q.size()) goto L40;
        po2 r11 = ((oo2) r7.q.get(r10)).g;
        long r13 = r11.e;
        long r15 = r6.e;
        if (r13 == (-9223372036854775807L)) goto L35;
        if (r13 == r15) goto L35;
    L39:
        r10 = r10 + 1;
    L35:
        if (r11.b != r6.b) goto L39;
        if (r11.a.equals(r6.a) == false) goto L39;
        oo2 r16 = (oo2) r7.q.remove(r10);
    L41:
        if (r16 != null) goto L43;
        q41 r17 = (q41) r7.e.o;
        kq[] r18 = r17.o;
        pn0 r19 = r17.q;
        r20 r110 = r17.s.g(r17.J);
        fo1 r20 = r17.G;
        ew4 r21 = r17.r;
        r17.q0.getClass();
        r16 = new oo2(r18, r14, r19, r110, r20, r6, r21);
    L44:
        oo2 r22 = r7.l;
        if (r22 != null) goto L47;
        r7.i = r16;
        r7.j = r16;
        r7.k = r16;
    L51:
        r7.o = null;
        r7.l = r16;
        r7.n++;
        r7.m();
        if (r16.d == true) goto L55;
        long r23 = r6.b;
        r16.d = true;
        r16.a.m(this, r23);
    L58:
        if (this.F.i != r16) goto L60;
        R(true, r6.b);
    L60:
        v(false);
        goto L62
    L55:
        if (r16.e == false) goto L58;
        this.u.b(8, r16.a).b();
        goto L58
    L47:
        if (r16 == r22.m) goto L51;
        r22.b();
        r22.m = r16;
        r22.c();
        goto L51
    L43:
        r16.g = r6;
        r16.p = r14;
        goto L44
    L40:
        r16 = null;
        goto L41
    L26:
        r9 = (r8.p + r8.g.e) - r6.b;
    L62:
        if (this.c0 == false) goto L64;
        this.c0 = A(this.F.l);
        w0();
    L65:
        ro2 r24 = this.F;
        if (this.Z == false) goto L68;
    L115:
        boolean r25 = this.M;
        ez3[] r26 = this.n;
        ro2 r27 = this.F;
        oo2 r28 = r27.j;
        if (r28 != null) goto L119;
    L117:
        int r111 = 2;
    L247:
        ro2 r29 = this.F;
        oo2 r30 = r29.j;
        if (r30 != null) goto L250;
    L287:
        ez3[] r112 = this.n;
        ro2 r113 = this.F;
        boolean r31 = false;
    L289:
        if (r0() == false) goto L359;
        if (this.Z == true) goto L359;
        oo2 r32 = r113.i;
        if (r32 == null) goto L359;
        oo2 r33 = r32.m;
        if (r33 == null) goto L359;
        if (this.k0 < r33.e()) goto L359;
        if (r33.h == false) goto L359;
        if (r31 == false) goto L305;
        F();
    L305:
        this.s0 = false;
        oo2 r114 = r113.a();
        r114.getClass();
        if (this.V.b.a.equals(r114.g.a.a) == false) goto L314;
        mt2 r34 = this.V.b;
        if (r34.b != (-1)) goto L314;
        mt2 r35 = r114.g.a;
        if (r35.b != (-1)) goto L314;
        if (r34.e == r35.e) goto L314;
        boolean r36 = true;
    L315:
        po2 r37 = r114.g;
        boolean r38 = r36;
        mt2 r39 = r37.a;
        long r40 = r37.b;
        this.V = z(r39, r40, r37.c, r40, !r38, 0);
        Q();
        B0();
        if (f() == false) goto L342;
        if (r114 != r113.k) goto L342;
        int r41 = r112.length;
        int r42 = 0;
    L320:
        if (r42 >= r41) goto L342;
        ez3 r43 = r112[r42];
        int r44 = r43.d;
        if (r44 == 3) goto L328;
        if (r44 == 4) goto L328;
        if (r44 != r111) goto L340;
        r43.d = 0;
    L340:
        r42 = r42 + 1;
    L328:
        if (r44 != 4) goto L330;
        boolean r45 = true;
    L331:
        kq r46 = (kq) r43.e;
        kq r47 = (kq) r43.f;
        if (r45 == false) goto L334;
        r47.getClass();
        r47.c(17, r46);
    L336:
        if (r43.d != 4) goto L338;
        int r48 = 0;
    L339:
        r43.d = r48;
        goto L340
    L338:
        r48 = 1;
        goto L339
    L334:
        r47.getClass();
        r46.c(17, r47);
        goto L336
    L330:
        r45 = false;
    L342:
        if (this.V.e != 3) goto L344;
        t0();
    L344:
        ew4 r49 = r113.i.o;
        int r50 = 0;
    L346:
        if (r50 >= r112.length) goto L358;
        if (r49.n(r50) == false) goto L357;
        ez3 r51 = r112[r50];
        kq r52 = (kq) r51.f;
        kq r53 = (kq) r51.e;
        if (ez3.h(r53) == false) goto L353;
        r53.e();
        goto L357
    L353:
        if (r52 == null) goto L357;
        if (r52.u == 0) goto L357;
        r52.e();
    L357:
        r50 = r50 + 1;
        goto L346
    L358:
        r31 = true;
    L314:
        r36 = false;
    L359:
        this.q0.getClass();
        return;
    L250:
        if (r29.i == r30) goto L287;
        if (r30.h == true) goto L287;
        ez3[] r54 = this.n;
        ew4 r55 = r30.o;
        int r56 = 0;
        boolean r57 = true;
    L256:
        if (r56 >= r54.length) goto L274;
        int r58 = r54[r56].c();
        ez3 r59 = r54[r56];
        xl0 r60 = this.B;
        int r115 = r59.j((kq) r59.e, r30, r55, r60);
        int r61 = r59.j((kq) r59.f, r30, r55, r60);
        if (r115 != 1) goto L261;
        r115 = r61;
    L261:
        if ((r115 & 2) == 0) goto L269;
        boolean r62 = this.h0;
        if (r62 == false) goto L269;
        if (r62 == false) goto L269;
        this.h0 = false;
        if (this.V.p == false) goto L269;
        this.u.g(r111);
    L269:
        this.i0 -= r58 - r54[r56].c();
        if ((r115 & 1) == 0) goto L272;
        boolean r63 = true;
    L273:
        r57 = r57 & r63;
        r56 = r56 + 1;
        goto L256
    L272:
        r63 = false;
        goto L273
    L274:
        if (r57 == false) goto L285;
        int r64 = 0;
    L277:
        if (r64 >= r54.length) goto L285;
        if (r55.n(r64) == false) goto L284;
        if (r54[r64].d(r30) != null) goto L284;
        l(r30, r64, false, r30.e());
    L284:
        r64 = r64 + 1;
    L285:
        if (r57 == false) goto L287;
        r29.j.h = true;
        goto L287
    L119:
        if (r28.m != null) goto L121;
    L122:
        r111 = 2;
        if (r28.g.j == false) goto L232;
    L233:
        int r65 = r26.length;
        int r66 = 0;
    L234:
        if (r66 >= r65) goto L247;
        ez3 r67 = r26[r66];
        if (r67.d(r28) == null) goto L246;
        kq r68 = r67.d(r28);
        r68.getClass();
        if (r68.l() == false) goto L246;
        long r69 = r28.g.e;
        if (r69 != (-9223372036854775807L)) goto L242;
    L244:
        long r116 = -9223372036854775807L;
    L245:
        kq r70 = r67.d(r28);
        r70.getClass();
        ez3.l(r70, r116);
        goto L246
    L242:
        if (r69 == Long.MIN_VALUE) goto L244;
        r116 = r28.p + r69;
    L246:
        r66 = r66 + 1;
        goto L234
    L232:
        if (this.Z == false) goto L247;
    L121:
        if (this.Z == true) goto L122;
        if (r28.e == false) goto L117;
        int r71 = 0;
    L128:
        if (r71 >= r26.length) goto L135;
        ez3 r72 = r26[r71];
        if (r72.e(r28, (kq) r72.e) == false) goto L117;
        if (r72.e(r28, (kq) r72.f) == false) goto L117;
        r71 = r71 + 1;
        goto L128
    L135:
        if (f() == true) goto L137;
    L139:
        oo2 r73 = r28.m;
        if (r73.e == false) goto L142;
    L144:
        oo2 r74 = r28.m;
        boolean r75 = r74.e;
        if (r75 == false) goto L149;
        rr2.w(r75);
        if (((long) ((r74.e() - this.k0) / this.B.i().a)) > 10000000) goto L117;
    L149:
        ew4 r117 = r28.o;
        oo2 r76 = r27.k;
        oo2 r77 = r27.j;
        if (r76 != r77) goto L152;
        r77.getClass();
        r27.k = r77.m;
    L152:
        oo2 r78 = r27.j;
        r78.getClass();
        r27.j = r78.m;
        r27.m();
        oo2 r118 = r27.j;
        r118.getClass();
        ew4 r79 = r118.o;
        cu4 r80 = this.V.a;
        C0(r80, r118.g.a, r80, r28.g.a, -9223372036854775807L, false);
        if (r118.e == false) goto L202;
        if (r25 == false) goto L158;
        if (this.r0 == (-9223372036854775807L)) goto L158;
    L159:
        this.r0 = -9223372036854775807L;
        if (r25 == true) goto L162;
    L164:
        boolean r81 = false;
    L165:
        if (r81 == false) goto L180;
        int r82 = 0;
    L168:
        if (r82 >= r26.length) goto L180;
        boolean r83 = r79.n(r82);
        t41[] r84 = (t41[]) r79.q;
        if (r83 == false) goto L179;
        if (((kq) r26[r82].e).o == (-2)) goto L179;
        if (lw2.a(r84[r82].m().n, r84[r82].m().k) == true) goto L179;
        if (r26[r82].f() == true) goto L179;
        r81 = false;
    L179:
        r82 = r82 + 1;
    L180:
        if (r81 == true) goto L202;
        long r85 = r118.e();
        int r86 = r26.length;
        int r87 = 0;
    L182:
        if (r87 >= r86) goto L198;
        ez3 r88 = r26[r87];
        kq r89 = (kq) r88.f;
        kq r90 = (kq) r88.e;
        if (ez3.h(r90) == false) goto L191;
        int r91 = r88.d;
        if (r91 == 4) goto L191;
        if (r91 == 2) goto L191;
        ez3.l(r90, r85);
    L191:
        if (r89 == null) goto L197;
        if (r89.u == 0) goto L197;
        if (r88.d == 3) goto L197;
        ez3.l(r89, r85);
    L197:
        r87 = r87 + 1;
        goto L182
    L198:
        int r92 = 2;
        if (r118.g() == true) goto L201;
        r27.o(r118);
        v(false);
        D();
    L201:
        r111 = r92;
        goto L247
    L162:
        if (this.s0 == true) goto L164;
        r81 = true;
    L158:
        if (r118.a.l() != (-9223372036854775807L)) goto L159;
    L202:
        r92 = 2;
        int r93 = r26.length;
        int r94 = 0;
    L203:
        if (r94 >= r93) goto L201;
        ez3 r95 = r26[r94];
        long r96 = r118.e();
        kq r97 = (kq) r95.e;
        int r98 = r95.c;
        boolean r119 = r117.n(r98);
        boolean r120 = r79.n(r98);
        kq r99 = (kq) r95.f;
        if (r99 == null) goto L211;
        int r121 = r95.d;
        if (r121 == 3) goto L211;
        if (r121 == 0) goto L210;
    L212:
        if (r119 == true) goto L214;
    L227:
        byte r100 = -2;
    L228:
        r94 = r94 + 1;
        r92 = 2;
        goto L203
    L214:
        if (r99.A == true) goto L227;
        int r101 = r97.o;
        r100 = -2;
        if (r101 != (-2)) goto L218;
        boolean r102 = true;
    L219:
        dz3 r122 = ((dz3[]) r117.p)[r98];
        dz3 r103 = ((dz3[]) r79.p)[r98];
        if (r120 == true) goto L222;
    L226:
        ez3.l(r99, r96);
        goto L228
    L222:
        if (Objects.equals(r103, r122) == false) goto L226;
        if (r102 == true) goto L226;
        if (r95.f() == false) goto L228;
    L218:
        r102 = false;
        goto L219
    L210:
        if (ez3.h(r97) == false) goto L212;
    L211:
        r99 = r97;
        goto L212
    L142:
        if (this.k0 >= r73.e()) goto L144;
    L137:
        if (r27.k != r27.j) goto L139;
    L68:
        if (this.M == false) goto L115;
        if (this.s0 == true) goto L115;
        if (f() == true) goto L115;
        oo2 r104 = r24.k;
        if (r104 == null) goto L115;
        if (r104 != r24.j) goto L115;
        oo2 r105 = r104.m;
        if (r105 == null) goto L115;
        boolean r106 = r105.e;
        if (r106 == false) goto L115;
        rr2.w(r106);
        if (((long) ((r105.e() - this.k0) / this.B.i().a)) > 10000000) goto L115;
        oo2 r107 = r24.k;
        r107.getClass();
        r24.k = r107.m;
        r24.m();
        r24.k.getClass();
        ez3[] r108 = this.n;
        oo2 r109 = r24.k;
        if (r109 == null) goto L115;
        ew4 r123 = r109.o;
        oo2 r124 = r109;
        int r125 = 0;
    L91:
        if (r125 >= r108.length) goto L110;
        if (r123.n(r125) == false) goto L108;
        ez3 r126 = r108[r125];
        if (((kq) r126.f) == null) goto L108;
        if (r126.f() == true) goto L108;
        ez3 r127 = r108[r125];
        rr2.w(!r127.f());
        if (ez3.h((kq) r127.e) == false) goto L101;
        int r128 = 3;
    L107:
        r127.d = r128;
        oo2 r129 = r124;
        ew4 r130 = r123;
        l(r129, r125, false, r129.e());
    L109:
        r125 = r125 + 1;
        r124 = r129;
        r108 = r108;
        r123 = r130;
        goto L91
    L101:
        kq r131 = (kq) r127.f;
        if (r131 != null) goto L104;
    L106:
        r128 = 2;
        goto L107
    L104:
        if (r131.u == 0) goto L106;
        r128 = 4;
    L108:
        r130 = r123;
        r129 = r124;
        goto L109
    L110:
        oo2 r132 = r124;
        if (f() == false) goto L115;
        this.r0 = r132.a.l();
        if (r132.g() == true) goto L115;
        r24.o(r132);
        v(false);
        D();
        goto L115
    L64:
        D();
        goto L65
    L20:
        r6 = r12.d(r4.a, r5, r3);
        goto L21
    L10:
        if (r2.g.j == true) goto L62;
        if (r2.g() == false) goto L62;
        if (r1.l.g.e == (-9223372036854775807L)) goto L62;
        if (r1.n >= 100) goto L62;
    }
}
