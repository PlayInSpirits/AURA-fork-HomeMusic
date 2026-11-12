package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.PlaybackException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lk3 {
    public static final lk3 H = null;
    public static final String I = null;
    public static final String J = null;
    public static final String K = null;
    public static final String L = null;
    public static final String M = null;
    public static final String N = null;
    public static final String O = null;
    public static final String P = null;
    public static final String Q = null;
    public static final String R = null;
    public static final String S = null;
    public static final String T = null;
    public static final String U = null;
    public static final String V = null;
    public static final String W = null;
    public static final String X = null;
    public static final String Y = null;
    public static final String Z = null;
    public static final String a0 = null;
    public static final String b0 = null;
    public static final String c0 = null;
    public static final String d0 = null;
    public static final String e0 = null;
    public static final String f0 = null;
    public static final String g0 = null;
    public static final String h0 = null;
    public static final String i0 = null;
    public static final String j0 = null;
    public static final String k0 = null;
    public static final String l0 = null;
    public static final String m0 = null;
    public static final String n0 = null;
    public static final String o0 = null;
    public static final String p0 = null;
    public final int A;
    public final do2 B;
    public final long C;
    public final long D;
    public final long E;
    public final jw4 F;
    public final cw4 G;
    public final PlaybackException a;
    public final int b;
    public final za4 c;
    public final pi3 d;
    public final pi3 e;
    public final int f;
    public final qh3 g;
    public final int h;
    public final boolean i;
    public final cu4 j;
    public final int k;
    public final s55 l;
    public final do2 m;
    public final float n;
    public final float o;
    public final int p;
    public final il q;
    public final jg0 r;
    public final hp0 s;
    public final int t;
    public final boolean u;
    public final boolean v;
    public final int w;
    public final boolean x;
    public final boolean y;
    public final int z;

    static {
        za4 r3 = za4.l;
        pi3 r4 = za4.k;
        qh3 r7 = qh3.d;
        s55 r10 = s55.d;
        yt4 r11 = cu4.a;
        do2 r13 = do2.K;
        H = new lk3(null, 0, r3, r4, r4, 0, r7, 0, false, r10, r11, 0, r13, 1.0f, 1.0f, il.i, 0, jg0.d, hp0.e, 0, false, false, 1, 0, 1, false, false, r13, 5000, 15000, 3000, jw4.b, cw4.J);
        String r0 = f35.a;
        I = Integer.toString(1, 36);
        J = Integer.toString(2, 36);
        K = Integer.toString(3, 36);
        L = Integer.toString(4, 36);
        M = Integer.toString(5, 36);
        N = Integer.toString(6, 36);
        O = Integer.toString(7, 36);
        P = Integer.toString(33, 36);
        Q = Integer.toString(8, 36);
        R = Integer.toString(9, 36);
        S = Integer.toString(10, 36);
        T = Integer.toString(11, 36);
        U = Integer.toString(12, 36);
        V = Integer.toString(13, 36);
        W = Integer.toString(14, 36);
        X = Integer.toString(15, 36);
        Y = Integer.toString(16, 36);
        Z = Integer.toString(17, 36);
        a0 = Integer.toString(18, 36);
        b0 = Integer.toString(19, 36);
        c0 = Integer.toString(20, 36);
        d0 = Integer.toString(21, 36);
        e0 = Integer.toString(22, 36);
        f0 = Integer.toString(23, 36);
        g0 = Integer.toString(24, 36);
        h0 = Integer.toString(25, 36);
        i0 = Integer.toString(26, 36);
        j0 = Integer.toString(27, 36);
        k0 = Integer.toString(28, 36);
        l0 = Integer.toString(29, 36);
        m0 = Integer.toString(30, 36);
        n0 = Integer.toString(31, 36);
        o0 = Integer.toString(32, 36);
        p0 = Integer.toString(34, 36);
    }

    public lk3(PlaybackException r1, int r2, za4 r3, pi3 r4, pi3 r5, int r6, qh3 r7, int r8, boolean r9, s55 r10, cu4 r11, int r12, do2 r13, float r14, float r15, il r16, int r17, jg0 r18, hp0 r19, int r20, boolean r21, boolean r22, int r23, int r24, int r25, boolean r26, boolean r27, do2 r28, long r29, long r31, long r33, jw4 r35, cw4 r36) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.e = r5;
        this.f = r6;
        this.g = r7;
        this.h = r8;
        this.i = r9;
        this.l = r10;
        this.j = r11;
        this.k = r12;
        this.m = r13;
        this.n = r14;
        this.o = r15;
        this.p = r17;
        this.q = r16;
        this.r = r18;
        this.s = r19;
        this.t = r20;
        this.u = r21;
        this.v = r22;
        this.w = r23;
        this.z = r24;
        this.A = r25;
        this.x = r26;
        this.y = r27;
        this.B = r28;
        this.C = r29;
        this.D = r31;
        this.E = r33;
        this.F = r35;
        this.G = r36;
    }

    public static lk3 r(int r43, Bundle r44) {
        IBinder r2 = r44.getBinder(o0);
        if ((r2 instanceof kk3) == true) goto L5;
        Bundle r3 = r44.getBundle(a0);
        Throwable r4 = null;
        if (r3 != null) goto L9;
        PlaybackException r7 = null;
    L23:
        int r8 = r44.getInt(c0, 0);
        Bundle r5 = r44.getBundle(b0);
        if (r5 != null) goto L27;
        za4 r6 = za4.l;
    L26:
        za4 r9 = r6;
        Bundle r10 = r44.getBundle(d0);
        if (r10 != null) goto L32;
        pi3 r11 = za4.k;
    L31:
        pi3 r12 = r11;
        Bundle r13 = r44.getBundle(e0);
        if (r13 != null) goto L37;
        pi3 r14 = za4.k;
    L36:
        pi3 r15 = r14;
        int r16 = r44.getInt(f0, 0);
        Bundle r17 = r44.getBundle(I);
        if (r17 != null) goto L41;
        qh3 r18 = qh3.d;
    L42:
        int r19 = r44.getInt(J, 0);
        boolean r110 = r44.getBoolean(K, false);
        Bundle r20 = r44.getBundle(L);
        if (r20 != null) goto L45;
        cu4 r21 = cu4.a;
    L60:
        int r22 = r44.getInt(n0, 0);
        Bundle r23 = r44.getBundle(M);
        if (r23 != null) goto L63;
        s55 r24 = s55.d;
    L64:
        Bundle r25 = r44.getBundle(N);
        if (r25 != null) goto L67;
        do2 r26 = do2.K;
    L68:
        float r27 = r44.getFloat(O, 1.0f);
        float r28 = r44.getFloat(P, 1.0f);
        int r29 = r44.getInt(p0, 0);
        Bundle r30 = r44.getBundle(Q);
        if (r30 != null) goto L72;
        il r31 = il.i;
    L71:
        il r210 = r31;
        Bundle r32 = r44.getBundle(g0);
        if (r32 != null) goto L76;
        jg0 r33 = jg0.d;
        r26 = r26;
        r27 = r27;
        r24 = r24;
    L85:
        Bundle r34 = r44.getBundle(R);
        if (r34 != null) goto L88;
        hp0 r35 = hp0.e;
    L95:
        int r36 = r44.getInt(S, 0);
        boolean r211 = r44.getBoolean(T, false);
        boolean r212 = r44.getBoolean(U, false);
        int r213 = r44.getInt(V, 1);
        int r37 = r44.getInt(W, 0);
        int r38 = r44.getInt(X, 1);
        boolean r39 = r44.getBoolean(Y, false);
        boolean r310 = r44.getBoolean(Z, false);
        Bundle r40 = r44.getBundle(h0);
        if (r40 != null) goto L99;
        do2 r41 = do2.K;
    L98:
        do2 r311 = r41;
        if (r43 >= 4) goto L104;
        long r42 = 0;
    L103:
        hp0 r111 = r35;
        long r312 = r44.getLong(i0, r42);
        if (r43 >= 4) goto L108;
        long r45 = 0;
    L109:
        long r46 = r44.getLong(j0, r45);
        if (r43 >= 4) goto L112;
        long r47 = 0;
    L113:
        long r313 = r44.getLong(k0, r47);
        Bundle r48 = r44.getBundle(m0);
        if (r48 != null) goto L116;
        jw4 r49 = jw4.b;
    L121:
        Bundle r1 = r44.getBundle(l0);
        if (r1 != null) goto L125;
        cw4 r50 = cw4.J;
    L127:
        return new lk3(r7, r8, r9, r12, r15, r16, r18, r19, r110, r24, r21, r22, r26, r27, r28, r210, r29, r33, r111, r36, r211, r212, r213, r37, r38, r39, r310, r311, r312, r46, r313, r49, r50);
    L125:
        r50 = cw4.b(r1);
        goto L127
    L116:
        ArrayList r51 = r48.getParcelableArrayList(jw4.c);
        if (r51 != null) goto L119;
        gy3 r52 = gy3.r;
    L120:
        r49 = new jw4(r52);
        goto L121
    L119:
        r52 = hw.f(new tb4(12), r51);
        goto L120
    L112:
        r47 = 3000;
        goto L113
    L108:
        r45 = 15000;
        goto L109
    L104:
        r42 = 5000;
        goto L103
    L99:
        r41 = do2.b(r40);
        goto L98
    L88:
        int r53 = r34.getInt(hp0.f, 0);
        int r54 = r34.getInt(hp0.g, 0);
        int r55 = r34.getInt(hp0.h, 0);
        String r56 = r34.getString(hp0.i);
        x20 r57 = new x20(r53);
        r57.b = r54;
        r57.c = r55;
        if (r53 != 0) goto L93;
        if (r56 == null) goto L93;
        boolean r58 = false;
    L94:
        rr2.l(r58);
        r57.d = r56;
        r35 = r57.b();
    L93:
        r58 = true;
        goto L94
    L76:
        ArrayList r59 = r32.getParcelableArrayList(jg0.e);
        if (r59 != null) goto L79;
        gy3 r60 = gy3.r;
    L84:
        r33 = new jg0(r32.getLong(jg0.f), r60);
        goto L85
    L79:
        uw1 r61 = yw1.j();
        int r62 = 0;
    L81:
        if (r62 >= r59.size()) goto L83;
        Bundle r63 = (Bundle) r59.get(r62);
        r63.getClass();
        r61.c(ig0.a(r63));
        r62 = r62 + 1;
        goto L81
    L83:
        r60 = r61.f();
        goto L84
    L72:
        r31 = il.a(r30);
        goto L71
    L67:
        r26 = do2.b(r25);
        goto L68
    L63:
        r24 = new s55(r23.getInt(s55.e, 0), r23.getFloat(s55.g, 1.0f), r23.getInt(s55.f, 0));
        goto L64
    L45:
        tb4 r64 = new tb4(7);
        IBinder r65 = r20.getBinder(cu4.b);
        if (r65 != null) goto L48;
        vw1 r66 = yw1.o;
        gy3 r67 = gy3.r;
    L49:
        tb4 r68 = new tb4(8);
        IBinder r69 = r20.getBinder(cu4.c);
        if (r69 != null) goto L52;
        vw1 r70 = yw1.o;
        gy3 r71 = gy3.r;
    L53:
        int[] r72 = r20.getIntArray(cu4.d);
        if (r72 != null) goto L59;
        int r73 = r67.q;
        int[] r74 = new int[r73];
        int r75 = 0;
    L56:
        if (r75 >= r73) goto L58;
        r74[r75] = r75;
        r75 = r75 + 1;
        goto L56
    L58:
        r72 = r74;
    L59:
        r21 = new au4(r67, r71, r72);
        goto L60
    L52:
        r71 = hw.f(r68, iw.a(r69));
        goto L53
    L48:
        r67 = hw.f(r64, iw.a(r65));
        goto L49
    L41:
        r18 = new qh3(r17.getFloat(qh3.e, 1.0f), r17.getFloat(qh3.f, 1.0f));
        goto L42
    L37:
        r14 = pi3.c(r13);
        goto L36
    L32:
        r11 = pi3.c(r10);
        goto L31
    L27:
        r6 = za4.b(r5);
        goto L26
    L9:
        String r76 = r3.getString(PlaybackException.s);
        String r77 = r3.getString(PlaybackException.t);
        String r78 = r3.getString(PlaybackException.u);
        if (TextUtils.isEmpty(r77) == false) goto L128;
    L16:
        Throwable r79 = r4;
        int r80 = r3.getInt(PlaybackException.q, 1000);
        Bundle r81 = f35.n(r3.getBundle(PlaybackException.v));
        if (r81 != null) goto L22;
        r81 = Bundle.EMPTY;
    L22:
        r7 = new PlaybackException(r76, r79, r80, r81, r3.getLong(PlaybackException.r, SystemClock.elapsedRealtime()));
        goto L23
    L128:
        Class<?> r82 = Class.forName(r77, true, PlaybackException.class.getClassLoader());     // Catch: Throwable -> L17
        if (Throwable.class.isAssignableFrom(r82) == false) goto L14;
        r4 = (Throwable) r82.getConstructor(new Class[]{String.class}).newInstance(new Object[]{r78});     // Catch: Throwable -> L17
    L14:
        if (r4 != null) goto L16;
        r4 = new RemoteException(r78);
    L17:
        r4 = new RemoteException(r78);
        goto L16
    L5:
        return ((kk3) r2).e;
    }

    public final lk3 a(il r41) {
        cu4 r11 = this.j;
        boolean r1 = r11.p();
        za4 r3 = this.c;
        if (r1 == false) goto L5;
    L8:
        boolean r2 = true;
    L9:
        rr2.w(r2);
        return new lk3(this.a, this.b, r3, this.d, this.e, this.f, this.g, this.h, this.i, this.l, r11, this.k, this.m, this.n, this.o, r41, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    L5:
        if (r3.a.b < r11.o()) goto L8;
        r2 = false;
        goto L9
    }

    public final lk3 b(jw4 r42) {
        cu4 r11 = this.j;
        boolean r1 = r11.p();
        za4 r3 = this.c;
        if (r1 == false) goto L5;
    L8:
        boolean r2 = true;
    L9:
        rr2.w(r2);
        return new lk3(this.a, this.b, r3, this.d, this.e, this.f, this.g, this.h, this.i, this.l, r11, this.k, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, r42, this.G);
    L5:
        if (r3.a.b < r11.o()) goto L8;
        r2 = false;
        goto L9
    }

    public final lk3 c(int r38, boolean r39) {
        cu4 r11 = this.j;
        boolean r1 = r11.p();
        za4 r3 = this.c;
        if (r1 == false) goto L5;
    L8:
        boolean r2 = true;
    L9:
        rr2.w(r2);
        return new lk3(this.a, this.b, r3, this.d, this.e, this.f, this.g, this.h, this.i, this.l, r11, this.k, this.m, this.n, this.o, this.q, this.p, this.r, this.s, r38, r39, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    L5:
        if (r3.a.b < r11.o()) goto L8;
        r2 = false;
        goto L9
    }

    public final lk3 d(int r42, int r43, boolean r44) {
        boolean r2 = false;
        int r4 = this.A;
        if (r4 != 3) goto L7;
        if (r44 == false) goto L7;
        if (r43 != 0) goto L7;
        boolean r30 = true;
    L8:
        cu4 r15 = this.j;
        boolean r1 = r15.p();
        za4 r7 = this.c;
        if (r1 == false) goto L11;
    L12:
        r2 = true;
    L13:
        rr2.w(r2);
        return new lk3(this.a, this.b, r7, this.d, this.e, this.f, this.g, this.h, this.i, this.l, r15, this.k, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, r44, r42, r43, r4, r30, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    L11:
        if (r7.a.b >= r15.o()) goto L13;
    L7:
        r30 = false;
        goto L8
    }

    public final lk3 e(qh3 r41) {
        cu4 r11 = this.j;
        boolean r1 = r11.p();
        za4 r3 = this.c;
        if (r1 == false) goto L5;
    L8:
        boolean r2 = true;
    L9:
        rr2.w(r2);
        return new lk3(this.a, this.b, r3, this.d, this.e, this.f, r41, this.h, this.i, this.l, r11, this.k, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    L5:
        if (r3.a.b < r11.o()) goto L8;
        r2 = false;
        goto L9
    }

    public final lk3 f(int r42, PlaybackException r43) {
        boolean r2 = false;
        boolean r4 = this.v;
        int r5 = this.z;
        if (r42 != 3) goto L7;
        if (r4 == false) goto L7;
        if (r5 != 0) goto L7;
        boolean r30 = true;
    L8:
        cu4 r15 = this.j;
        boolean r1 = r15.p();
        za4 r7 = this.c;
        if (r1 == false) goto L11;
    L12:
        r2 = true;
    L13:
        rr2.w(r2);
        return new lk3(r43, this.b, r7, this.d, this.e, this.f, this.g, this.h, this.i, this.l, r15, this.k, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, r4, this.w, r5, r42, r30, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    L11:
        if (r7.a.b >= r15.o()) goto L13;
    L7:
        r30 = false;
        goto L8
    }

    public final lk3 g(do2 r41) {
        cu4 r11 = this.j;
        boolean r1 = r11.p();
        za4 r3 = this.c;
        if (r1 == false) goto L5;
    L8:
        boolean r2 = true;
    L9:
        rr2.w(r2);
        return new lk3(this.a, this.b, r3, this.d, this.e, this.f, this.g, this.h, this.i, this.l, r11, this.k, r41, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    L5:
        if (r3.a.b < r11.o()) goto L8;
        r2 = false;
        goto L9
    }

    public final lk3 h(pi3 r38, pi3 r39, int r40) {
        cu4 r11 = this.j;
        boolean r1 = r11.p();
        za4 r3 = this.c;
        if (r1 == false) goto L5;
    L8:
        boolean r2 = true;
    L9:
        rr2.w(r2);
        return new lk3(this.a, this.b, r3, r38, r39, r40, this.g, this.h, this.i, this.l, r11, this.k, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    L5:
        if (r3.a.b < r11.o()) goto L8;
        r2 = false;
        goto L9
    }

    public final lk3 i(int r41) {
        cu4 r11 = this.j;
        boolean r1 = r11.p();
        za4 r3 = this.c;
        if (r1 == false) goto L5;
    L8:
        boolean r2 = true;
    L9:
        rr2.w(r2);
        return new lk3(this.a, this.b, r3, this.d, this.e, this.f, this.g, r41, this.i, this.l, r11, this.k, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    L5:
        if (r3.a.b < r11.o()) goto L8;
        r2 = false;
        goto L9
    }

    public final lk3 j(za4 r43) {
        cu4 r11 = this.j;
        if (r11.p() == false) goto L5;
    L8:
        boolean r1 = true;
    L9:
        rr2.w(r1);
        return new lk3(this.a, this.b, r43, this.d, this.e, this.f, this.g, this.h, this.i, this.l, r11, this.k, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    L5:
        if (r43.a.b < r11.o()) goto L8;
        r1 = false;
        goto L9
    }

    public final lk3 k(boolean r41) {
        cu4 r11 = this.j;
        boolean r1 = r11.p();
        za4 r3 = this.c;
        if (r1 == false) goto L5;
    L8:
        boolean r2 = true;
    L9:
        rr2.w(r2);
        return new lk3(this.a, this.b, r3, this.d, this.e, this.f, this.g, this.h, r41, this.l, r11, this.k, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    L5:
        if (r3.a.b < r11.o()) goto L8;
        r2 = false;
        goto L9
    }

    public final lk3 l(cu4 r40) {
        boolean r1 = r40.p();
        za4 r5 = this.c;
        if (r1 == false) goto L5;
    L8:
        boolean r2 = true;
    L9:
        rr2.w(r2);
        return new lk3(this.a, this.b, r5, this.d, this.e, this.f, this.g, this.h, this.i, this.l, r40, this.k, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    L5:
        if (r5.a.b < r40.o()) goto L8;
        r2 = false;
        goto L9
    }

    public final lk3 m(xs3 r40, int r41) {
        za4 r14 = this.c;
        pi3 r3 = r14.a;
        za4 r1 = new za4(new pi3(r3.a, r41, r3.c, r3.d, r3.e, r3.f, r3.g, r3.h, r3.i), r14.b, r14.c, r14.d, r14.e, r14.f, r14.g, r14.h, r14.i, r14.j);
        if (r40.p() == false) goto L5;
    L8:
        boolean r2 = true;
    L9:
        rr2.w(r2);
        return new lk3(this.a, this.b, r1, this.d, this.e, this.f, this.g, this.h, this.i, this.l, r40, 0, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    L5:
        if (r1.a.b < r40.o()) goto L8;
        r2 = false;
        goto L9
    }

    public final lk3 n(cu4 r40, za4 r41, int r42) {
        if (r40.p() == false) goto L5;
    L8:
        boolean r1 = true;
    L9:
        rr2.w(r1);
        return new lk3(this.a, this.b, r41, this.d, this.e, this.f, this.g, this.h, this.i, this.l, r40, r42, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    L5:
        if (r41.a.b < r40.o()) goto L8;
        r1 = false;
        goto L9
    }

    public final lk3 o(cw4 r42) {
        cu4 r11 = this.j;
        boolean r1 = r11.p();
        za4 r3 = this.c;
        if (r1 == false) goto L5;
    L8:
        boolean r2 = true;
    L9:
        rr2.w(r2);
        return new lk3(this.a, this.b, r3, this.d, this.e, this.f, this.g, this.h, this.i, this.l, r11, this.k, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, r42);
    L5:
        if (r3.a.b < r11.o()) goto L8;
        r2 = false;
        goto L9
    }

    public final lk3 p(float r40) {
        if (r40 == 0.0f) goto L5;
        float r17 = r40;
    L6:
        cu4 r13 = this.j;
        boolean r1 = r13.p();
        za4 r5 = this.c;
        if (r1 == false) goto L9;
    L12:
        boolean r2 = true;
    L13:
        rr2.w(r2);
        return new lk3(this.a, this.b, r5, this.d, this.e, this.f, this.g, this.h, this.i, this.l, r13, this.k, this.m, r40, r17, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    L9:
        if (r5.a.b < r13.o()) goto L12;
        r2 = false;
        goto L13
    L5:
        r17 = this.n;
        goto L6
    }

    public final lk3 q(mi3 r43, boolean r44, boolean r45) {
        boolean r2 = r43.a(16);
        boolean r3 = r43.a(17);
        za4 r4 = this.c;
        za4 r8 = r4.a(r2, r3);
        pi3 r9 = this.d.b(r2, r3);
        pi3 r10 = this.e.b(r2, r3);
        boolean r5 = true;
        cu4 r7 = this.j;
        if (r3 == true) goto L16;
        if (r2 == false) goto L16;
        if (r7.p() == true) goto L16;
        int r6 = r4.a.b;
        if (r7.o() == 1) goto L15;
        bu4 r11 = r7.m(r6, new bu4(), 0);
        uw1 r12 = yw1.j();
        int r13 = r11.m;
    L11:
        int r14 = r11.n;
        if (r13 > r14) goto L14;
        zt4 r15 = r7.f(r13, new zt4(), true);
        r15.c = 0;
        r12.c(r15);
        r13 = r13 + 1;
        goto L11
    L14:
        r11.n = r14 - r11.m;
        r11.m = 0;
        r7 = new au4(yw1.o(r11), r12.f(), new int[]{0});
    L15:
        cu4 r16 = r7;
        if (r43.a(18) == true) goto L23;
        do2 r17 = do2.K;
    L22:
        do2 r18 = r17;
        if (r43.a(22) == true) goto L27;
        float r19 = 1.0f;
        float r20 = 1.0f;
    L29:
        if (r43.a(21) == true) goto L32;
        il r21 = il.i;
    L31:
        il r22 = r21;
        if (r43.a(28) == true) goto L37;
        jg0 r23 = jg0.d;
    L36:
        jg0 r24 = r23;
        if (r43.a(23) == true) goto L41;
        int r25 = 0;
        boolean r26 = false;
    L43:
        if (r43.a(18) == true) goto L46;
        do2 r27 = do2.K;
    L45:
        do2 r33 = r27;
        if (r45 == false) goto L49;
    L53:
        jw4 r1 = jw4.b;
    L52:
        jw4 r40 = r1;
        if (r16.p() == false) goto L57;
    L60:
        rr2.w(r5);
        return new lk3(this.a, this.b, r8, r9, r10, this.f, this.g, this.h, this.i, this.l, r16, this.k, r18, r19, r20, r22, this.p, r24, this.s, r25, r26, this.v, this.w, this.z, this.A, this.x, this.y, r33, this.C, this.D, this.E, r40, this.G);
    L57:
        if (r8.a.b < r16.o()) goto L60;
        r5 = false;
        goto L60
    L49:
        if (r43.a(30) == false) goto L53;
        r1 = this.F;
        goto L52
    L46:
        r27 = this.B;
        goto L45
    L41:
        r25 = this.t;
        r26 = this.u;
        goto L43
    L37:
        r23 = this.r;
        goto L36
    L32:
        r21 = this.q;
        goto L31
    L27:
        r19 = this.n;
        r20 = this.o;
        goto L29
    L23:
        r17 = this.m;
    L16:
        if (r44 == true) goto L18;
        if (r3 == true) goto L15;
    L18:
        r7 = cu4.a;
        goto L15
    }

    public final gn2 s() {
        cu4 r0 = this.j;
        if (r0.p() == false) goto L7;
        return null;
    L7:
        return r0.m(this.c.a.b, new bu4(), 0).b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r29v0 */
    /* JADX WARN: Type inference failed for: r29v1 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public final Bundle t(int r35) {
        Bundle r2 = new Bundle();
        PlaybackException r3 = this.a;
        if (r3 == null) goto L8;
        Bundle r4 = new Bundle();
        r4.putInt(PlaybackException.q, r3.n);
        r4.putLong(PlaybackException.r, r3.o);
        r4.putString(PlaybackException.s, r3.getMessage());
        r4.putBundle(PlaybackException.v, r3.p);
        Throwable r5 = r3.getCause();
        if (r5 == null) goto L7;
        r4.putString(PlaybackException.t, r5.getClass().getName());
        r4.putString(PlaybackException.u, r5.getMessage());
    L7:
        r2.putBundle(a0, r4);
    L8:
        int r6 = this.b;
        if (r6 == 0) goto L11;
        r2.putInt(c0, r6);
    L11:
        za4 r7 = this.c;
        if (r35 >= 3) goto L14;
    L15:
        r2.putBundle(b0, r7.c(r35));
    L16:
        pi3 r8 = this.d;
        if (r35 >= 3) goto L19;
    L20:
        r2.putBundle(d0, r8.d(r35));
    L21:
        pi3 r9 = this.e;
        if (r35 >= 3) goto L24;
    L25:
        r2.putBundle(e0, r9.d(r35));
    L26:
        int r10 = this.f;
        if (r10 == 0) goto L29;
        r2.putInt(f0, r10);
    L29:
        qh3 r11 = qh3.d;
        qh3 r12 = this.g;
        if (r12.equals(r11) == true) goto L32;
        Bundle r13 = new Bundle();
        r13.putFloat(qh3.e, r12.a);
        r13.putFloat(qh3.f, r12.b);
        r2.putBundle(I, r13);
    L32:
        int r14 = this.h;
        if (r14 == 0) goto L35;
        r2.putInt(J, r14);
    L35:
        boolean r15 = this.i;
        if (r15 == false) goto L38;
        r2.putBoolean(K, r15);
    L38:
        yt4 r16 = cu4.a;
        cu4 r17 = this.j;
        boolean r18 = false;
        long r19 = 0;
        if (r17.equals(r16) == true) goto L143;
        ArrayList r20 = new ArrayList();
        int r21 = r17.o();
        bu4 r110 = new bu4();
        int r111 = 0;
    L42:
        if (r111 >= r21) goto L84;
        bu4 r112 = r17.m(r111, r110, r19);
        r112.getClass();
        Bundle r113 = new Bundle();
        long r114 = r19;
        if (gn2.g.equals(r112.b) == true) goto L46;
        r113.putBundle(bu4.s, r112.b.c(false));
    L46:
        long r22 = r112.d;
        if (r22 == (-9223372036854775807L)) goto L50;
        r113.putLong(bu4.t, r22);
    L50:
        long r23 = r112.e;
        if (r23 == r12) goto L53;
        r113.putLong(bu4.u, r23);
    L53:
        long r24 = r112.f;
        if (r24 == r12) goto L56;
        r113.putLong(bu4.v, r24);
    L56:
        boolean r25 = r112.g;
        if (r25 == false) goto L59;
        r113.putBoolean(bu4.w, r25);
    L59:
        boolean r26 = r112.h;
        if (r26 == false) goto L62;
        r113.putBoolean(bu4.x, r26);
    L62:
        an2 r27 = r112.i;
        if (r27 == null) goto L65;
        r113.putBundle(bu4.y, r27.c());
    L65:
        boolean r28 = r112.j;
        if (r28 == false) goto L68;
        r113.putBoolean(bu4.z, r28);
    L68:
        long r29 = r112.k;
        if (r29 == r114) goto L71;
        r113.putLong(bu4.A, r29);
    L71:
        long r30 = r112.l;
        if (r30 == (-9223372036854775807(0x8000000000000001, double:-4.9E-324))) goto L74;
        r113.putLong(bu4.B, r30);
    L74:
        int r31 = r112.m;
        if (r31 == 0) goto L77;
        r113.putInt(bu4.C, r31);
    L77:
        int r32 = r112.n;
        if (r32 == 0) goto L80;
        r113.putInt(bu4.D, r32);
    L80:
        long r33 = r112.o;
        if (r33 == r114) goto L83;
        r113.putLong(bu4.E, r33);
    L83:
        r20.add(r113);
        r111 = r111 + 1;
        r19 = r114;
        goto L42
    L84:
        long r115 = r19;
        ArrayList r34 = new ArrayList();
        int r36 = r17.h();
        zt4 r116 = new zt4();
        int r117 = 0;
    L85:
        if (r117 >= r36) goto L135;
        zt4 r118 = r17.f(r117, r116, r18);
        r118.getClass();
        Bundle r119 = new Bundle();
        int r120 = r118.c;
        if (r120 == 0) goto L89;
        r119.putInt(zt4.h, r120);
    L89:
        long r121 = r118.d;
        if (r121 == (-9223372036854775807L)) goto L93;
        r119.putLong(zt4.i, r121);
    L93:
        long r122 = r118.e;
        if (r122 == r115) goto L96;
        r119.putLong(zt4.j, r122);
    L96:
        boolean r37 = r118.f;
        if (r37 == false) goto L100;
        r119.putBoolean(zt4.k, r37);
    L100:
        if (r118.g.equals(z5.f) == true) goto L133;
        String r38 = zt4.l;
        z5 r123 = r118.g;
        r123.getClass();
        Bundle r124 = new Bundle();
        ArrayList<? extends Parcelable> r125 = new ArrayList();
        x5[] r39 = r123.e;
        int r40 = r39.length;
        ?? r41 = r18;
    L102:
        if (r41 >= r40) goto L120;
        ?? r210 = r41;
        x5 r42 = r39[r210 == true ? 1 : 0];
        r42.getClass();
        int r211 = r40;
        Bundle r43 = new Bundle();
        zt4 r212 = r116;
        r43.putLong(x5.m, r42.a);
        r43.putInt(x5.n, r42.b);
        r43.putInt(x5.t, r42.c);
        r43.putParcelableArrayList(x5.o, new ArrayList(Arrays.asList(r42.d)));
        String r0 = x5.u;
        ArrayList<? extends Parcelable> r1 = new ArrayList();
        gn2[] r126 = r42.e;
        int r213 = r117;
        int r127 = r126.length;
        ?? r128 = r18;
    L104:
        Bundle r214 = null;
        if (r128 >= r127) goto L112;
        ?? r215 = r128;
        gn2 r129 = r126[r215 == true ? 1 : 0];
        if (r129 == null) goto L111;
        r214 = r129.c(true);
    L111:
        r1.add(r214);
        r127 = r127;
        r128 = (r215 == true ? 1 : 0) + 1;
        goto L104
    L112:
        r43.putParcelableArrayList(r0, r1);
        r43.putIntArray(x5.p, r42.f);
        r43.putLongArray(x5.q, r42.g);
        r43.putLong(x5.r, r42.j);
        r43.putBoolean(x5.s, r42.k);
        r43.putStringArrayList(x5.v, new ArrayList(Arrays.asList(r42.h)));
        String r44 = x5.x;
        ArrayList<? extends Parcelable> r45 = new ArrayList();
        y5[] r130 = r42.i;
        int r131 = r130.length;
        ?? r132 = r18;
    L113:
        if (r132 >= r131) goto L119;
        ?? r216 = r132;
        y5 r133 = r130[r216 == true ? 1 : 0];
        if (r133 != null) goto L117;
        Bundle r134 = null;
    L118:
        r45.add(r134);
        r131 = r131;
        r2 = r2;
        r17 = r17;
        r20 = r20;
        r132 = (r216 == true ? 1 : 0) + 1;
        goto L113
    L117:
        r134 = new Bundle();
        r134.putLong(y5.d, r133.a);
        r134.putLong(y5.e, r133.b);
        r134.putString(y5.f, r133.c);
        goto L118
    L119:
        r43.putParcelableArrayList(r44, r45);
        r43.putBoolean(x5.w, r42.l);
        r125.add(r43);
        r40 = r211;
        r116 = r212;
        r117 = r213;
        r41 = (r210 == true ? 1 : 0) + 1;
        goto L102
    L120:
        Bundle r310 = r2;
        ArrayList r311 = r20;
        cu4 r312 = r17;
        zt4 r217 = r116;
        int r218 = r117;
        if (r125.isEmpty() == true) goto L123;
        r124.putParcelableArrayList(z5.h, r125);
    L123:
        long r46 = r123.b;
        if (r46 == r115) goto L126;
        r124.putLong(z5.i, r46);
    L126:
        long r47 = r123.c;
        if (r47 == (-9223372036854775807L)) goto L129;
        r124.putLong(z5.j, r47);
    L129:
        int r48 = r123.d;
        if (r48 == 0) goto L132;
        r124.putInt(z5.k, r48);
    L132:
        r119.putBundle(r38, r124);
    L134:
        r34.add(r119);
        r117 = r218 + 1;
        r18 = r18;
        r36 = r36;
        r116 = r217;
        r2 = r310;
        r17 = r312;
        r20 = r311;
        goto L85
    L133:
        r310 = r2;
        r311 = r20;
        r312 = r17;
        r217 = r116;
        r218 = r117;
        goto L134
    L135:
        Bundle r313 = r2;
        ArrayList r314 = r20;
        cu4 r315 = r17;
        boolean r219 = r18;
        int[] r49 = new int[r21];
        boolean r135 = true;
        if (r21 <= 0) goto L138;
        r49[r219 ? 1 : 0] = r315.a(true);
    L138:
        int r50 = 1;
    L139:
        if (r50 >= r21) goto L141;
        r49[r50] = r315.e(r49[r50 - 1], r219 ? 1 : 0, r135);
        r50 = r50 + 1;
        r135 = true;
        r219 = false;
        goto L139
    L141:
        Bundle r51 = new Bundle();
        r51.putBinder(cu4.b, new iw(r314));
        r51.putBinder(cu4.c, new iw(r34));
        r51.putIntArray(cu4.d, r49);
        r2 = r313;
        r2.putBundle(L, r51);
    L144:
        int r52 = this.k;
        if (r52 == 0) goto L147;
        r2.putInt(n0, r52);
    L147:
        s55 r53 = s55.d;
        s55 r54 = this.l;
        if (r54.equals(r53) == true) goto L159;
        Bundle r55 = new Bundle();
        int r56 = r54.a;
        if (r56 == 0) goto L152;
        r55.putInt(s55.e, r56);
    L152:
        int r57 = r54.b;
        if (r57 == 0) goto L155;
        r55.putInt(s55.f, r57);
    L155:
        float r58 = r54.c;
        if (r58 == 1.0f) goto L158;
        r55.putFloat(s55.g, r58);
    L158:
        r2.putBundle(M, r55);
    L159:
        do2 r59 = do2.K;
        do2 r60 = this.m;
        if (r60.equals(r59) == true) goto L162;
        r2.putBundle(N, r60.c());
    L162:
        float r61 = this.n;
        if (r61 == 1.0f) goto L165;
        r2.putFloat(O, r61);
    L165:
        float r62 = this.o;
        if (r62 == 1.0f) goto L168;
        r2.putFloat(P, r62);
    L168:
        int r63 = this.p;
        if (r63 == 0) goto L171;
        r2.putInt(p0, r63);
    L171:
        il r64 = il.i;
        il r65 = this.q;
        if (r65.equals(r64) == true) goto L174;
        r2.putBundle(Q, r65.d());
    L174:
        jg0 r66 = jg0.d;
        jg0 r67 = this.r;
        if (r67.equals(r66) == true) goto L192;
        Bundle r68 = new Bundle();
        String r69 = jg0.e;
        gy3 r70 = r67.a;
        uw1 r71 = yw1.j();
        int r72 = 0;
    L178:
        if (r72 >= r70.q) goto L184;
        if (((ig0) r70.get(r72)).d != null) goto L183;
        r71.c((ig0) r70.get(r72));
    L183:
        r72 = r72 + 1;
        goto L178
    L184:
        gy3 r73 = r71.f();
        ArrayList<? extends Parcelable> r74 = new ArrayList(r73.q);
        vw1 r75 = r73.m(0);
    L186:
        if (r75.hasNext() == false) goto L191;
        ig0 r76 = (ig0) r75.next();
        Bundle r77 = r76.b();
        Bitmap r78 = r76.d;
        if (r78 == null) goto L190;
        r77.putParcelable(ig0.w, r78);
    L190:
        r74.add(r77);
        goto L186
    L191:
        r68.putParcelableArrayList(r69, r74);
        r68.putLong(jg0.f, r67.b);
        r2.putBundle(g0, r68);
    L192:
        hp0 r79 = hp0.e;
        hp0 r80 = this.s;
        if (r80.equals(r79) == true) goto L207;
        Bundle r81 = new Bundle();
        int r82 = r80.a;
        if (r82 == 0) goto L197;
        r81.putInt(hp0.f, r82);
    L197:
        int r83 = r80.b;
        if (r83 == 0) goto L200;
        r81.putInt(hp0.g, r83);
    L200:
        int r84 = r80.c;
        if (r84 == 0) goto L203;
        r81.putInt(hp0.h, r84);
    L203:
        String r85 = r80.d;
        if (r85 == null) goto L206;
        r81.putString(hp0.i, r85);
    L206:
        r2.putBundle(R, r81);
    L207:
        int r86 = this.t;
        if (r86 == 0) goto L210;
        r2.putInt(S, r86);
    L210:
        boolean r87 = this.u;
        if (r87 == false) goto L213;
        r2.putBoolean(T, r87);
    L213:
        boolean r88 = this.v;
        if (r88 == false) goto L216;
        r2.putBoolean(U, r88);
    L216:
        int r89 = this.w;
        if (r89 == 1) goto L219;
        r2.putInt(V, r89);
    L219:
        int r90 = this.z;
        if (r90 == 0) goto L222;
        r2.putInt(W, r90);
    L222:
        int r91 = this.A;
        if (r91 == 1) goto L225;
        r2.putInt(X, r91);
    L225:
        boolean r92 = this.x;
        if (r92 == false) goto L228;
        r2.putBoolean(Y, r92);
    L228:
        boolean r93 = this.y;
        if (r93 == false) goto L231;
        r2.putBoolean(Z, r93);
    L231:
        do2 r94 = do2.K;
        do2 r95 = this.B;
        if (r95.equals(r94) == true) goto L235;
        r2.putBundle(h0, r95.c());
    L235:
        if (r35 >= 6) goto L237;
        long r96 = r115;
    L238:
        long r97 = this.C;
        if (r97 == r96) goto L241;
        r2.putLong(i0, r97);
    L241:
        if (r35 >= 6) goto L243;
        long r98 = r115;
    L244:
        long r99 = this.D;
        if (r99 == r98) goto L247;
        r2.putLong(j0, r99);
    L247:
        if (r35 >= 6) goto L249;
        long r100 = r115;
    L250:
        long r101 = this.E;
        if (r101 == r100) goto L253;
        r2.putLong(k0, r101);
    L253:
        jw4 r102 = jw4.b;
        jw4 r103 = this.F;
        if (r103.equals(r102) == true) goto L256;
        Bundle r104 = new Bundle();
        r104.putParcelableArrayList(jw4.c, hw.N(r103.a, new tb4(11)));
        r2.putBundle(m0, r104);
    L256:
        cw4 r105 = cw4.J;
        cw4 r106 = this.G;
        if (r106.equals(r105) == true) goto L259;
        r2.putBundle(l0, r106.c());
    L259:
        return r2;
    L249:
        r100 = 3000;
        goto L250
    L243:
        r98 = 15000;
        goto L244
    L237:
        r96 = 5000;
        goto L238
    L143:
        r115 = 0;
        goto L144
    L24:
        if (za4.k.a(r9) == true) goto L26;
    L19:
        if (za4.k.a(r8) == true) goto L21;
    L14:
        if (r7.equals(za4.l) == true) goto L16;
        goto L15
    }
}
