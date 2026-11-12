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
    public static final lk3 H;
    public static final String I;
    public static final String J;
    public static final String K;
    public static final String L;
    public static final String M;
    public static final String N;
    public static final String O;
    public static final String P;
    public static final String Q;
    public static final String R;
    public static final String S;
    public static final String T;
    public static final String U;
    public static final String V;
    public static final String W;
    public static final String X;
    public static final String Y;
    public static final String Z;
    public static final String a0;
    public static final String b0;
    public static final String c0;
    public static final String d0;
    public static final String e0;
    public static final String f0;
    public static final String g0;
    public static final String h0;
    public static final String i0;
    public static final String j0;
    public static final String k0;
    public static final String l0;
    public static final String m0;
    public static final String n0;
    public static final String o0;
    public static final String p0;
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
        za4 za4Var = za4.l;
        pi3 pi3Var = za4.k;
        qh3 qh3Var = qh3.d;
        s55 s55Var = s55.d;
        yt4 yt4Var = cu4.a;
        do2 do2Var = do2.K;
        H = new lk3(null, 0, za4Var, pi3Var, pi3Var, 0, qh3Var, 0, false, s55Var, yt4Var, 0, do2Var, 1.0f, 1.0f, il.i, 0, jg0.d, hp0.e, 0, false, false, 1, 0, 1, false, false, do2Var, 5000L, 15000L, 3000L, jw4.b, cw4.J);
        String str = f35.a;
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

    public lk3(PlaybackException playbackException, int i, za4 za4Var, pi3 pi3Var, pi3 pi3Var2, int i2, qh3 qh3Var, int i3, boolean z, s55 s55Var, cu4 cu4Var, int i4, do2 do2Var, float f, float f2, il ilVar, int i5, jg0 jg0Var, hp0 hp0Var, int i6, boolean z2, boolean z3, int i7, int i8, int i9, boolean z4, boolean z5, do2 do2Var2, long j, long j2, long j3, jw4 jw4Var, cw4 cw4Var) {
        this.a = playbackException;
        this.b = i;
        this.c = za4Var;
        this.d = pi3Var;
        this.e = pi3Var2;
        this.f = i2;
        this.g = qh3Var;
        this.h = i3;
        this.i = z;
        this.l = s55Var;
        this.j = cu4Var;
        this.k = i4;
        this.m = do2Var;
        this.n = f;
        this.o = f2;
        this.p = i5;
        this.q = ilVar;
        this.r = jg0Var;
        this.s = hp0Var;
        this.t = i6;
        this.u = z2;
        this.v = z3;
        this.w = i7;
        this.z = i8;
        this.A = i9;
        this.x = z4;
        this.y = z5;
        this.B = do2Var2;
        this.C = j;
        this.D = j2;
        this.E = j3;
        this.F = jw4Var;
        this.G = cw4Var;
    }

    public static lk3 r(int i, Bundle bundle) {
        PlaybackException playbackException;
        gy3 gy3VarF;
        gy3 gy3VarF2;
        cu4 au4Var;
        gy3 gy3VarF3;
        jg0 jg0Var;
        hp0 hp0VarB;
        jw4 jw4Var;
        IBinder binder = bundle.getBinder(o0);
        if (binder instanceof kk3) {
            return ((kk3) binder).e;
        }
        Bundle bundle2 = bundle.getBundle(a0);
        Throwable remoteException = null;
        if (bundle2 == null) {
            playbackException = null;
        } else {
            String string = bundle2.getString(PlaybackException.s);
            String string2 = bundle2.getString(PlaybackException.t);
            String string3 = bundle2.getString(PlaybackException.u);
            if (!TextUtils.isEmpty(string2)) {
                try {
                    Class<?> cls = Class.forName(string2, true, PlaybackException.class.getClassLoader());
                    remoteException = Throwable.class.isAssignableFrom(cls) ? (Throwable) cls.getConstructor(String.class).newInstance(string3) : null;
                    if (remoteException == null) {
                        remoteException = new RemoteException(string3);
                    }
                } catch (Throwable unused) {
                    remoteException = new RemoteException(string3);
                }
            }
            Throwable th = remoteException;
            int i2 = bundle2.getInt(PlaybackException.q, 1000);
            Bundle bundleN = f35.n(bundle2.getBundle(PlaybackException.v));
            if (bundleN == null) {
                bundleN = Bundle.EMPTY;
            }
            playbackException = new PlaybackException(string, th, i2, bundleN, bundle2.getLong(PlaybackException.r, SystemClock.elapsedRealtime()));
        }
        int i3 = bundle.getInt(c0, 0);
        Bundle bundle3 = bundle.getBundle(b0);
        za4 za4VarB = bundle3 == null ? za4.l : za4.b(bundle3);
        Bundle bundle4 = bundle.getBundle(d0);
        pi3 pi3VarC = bundle4 == null ? za4.k : pi3.c(bundle4);
        Bundle bundle5 = bundle.getBundle(e0);
        pi3 pi3VarC2 = bundle5 == null ? za4.k : pi3.c(bundle5);
        int i4 = bundle.getInt(f0, 0);
        Bundle bundle6 = bundle.getBundle(I);
        qh3 qh3Var = bundle6 == null ? qh3.d : new qh3(bundle6.getFloat(qh3.e, 1.0f), bundle6.getFloat(qh3.f, 1.0f));
        int i5 = bundle.getInt(J, 0);
        boolean z = bundle.getBoolean(K, false);
        Bundle bundle7 = bundle.getBundle(L);
        if (bundle7 == null) {
            au4Var = cu4.a;
        } else {
            tb4 tb4Var = new tb4(7);
            IBinder binder2 = bundle7.getBinder(cu4.b);
            if (binder2 == null) {
                vw1 vw1Var = yw1.o;
                gy3VarF = gy3.r;
            } else {
                gy3VarF = hw.f(tb4Var, iw.a(binder2));
            }
            tb4 tb4Var2 = new tb4(8);
            IBinder binder3 = bundle7.getBinder(cu4.c);
            if (binder3 == null) {
                vw1 vw1Var2 = yw1.o;
                gy3VarF2 = gy3.r;
            } else {
                gy3VarF2 = hw.f(tb4Var2, iw.a(binder3));
            }
            int[] intArray = bundle7.getIntArray(cu4.d);
            if (intArray == null) {
                int i6 = gy3VarF.q;
                int[] iArr = new int[i6];
                for (int i7 = 0; i7 < i6; i7++) {
                    iArr[i7] = i7;
                }
                intArray = iArr;
            }
            au4Var = new au4(gy3VarF, gy3VarF2, intArray);
        }
        int i8 = bundle.getInt(n0, 0);
        Bundle bundle8 = bundle.getBundle(M);
        s55 s55Var = bundle8 == null ? s55.d : new s55(bundle8.getInt(s55.e, 0), bundle8.getFloat(s55.g, 1.0f), bundle8.getInt(s55.f, 0));
        Bundle bundle9 = bundle.getBundle(N);
        do2 do2VarB = bundle9 == null ? do2.K : do2.b(bundle9);
        float f = bundle.getFloat(O, 1.0f);
        float f2 = bundle.getFloat(P, 1.0f);
        int i9 = bundle.getInt(p0, 0);
        Bundle bundle10 = bundle.getBundle(Q);
        il ilVarA = bundle10 == null ? il.i : il.a(bundle10);
        Bundle bundle11 = bundle.getBundle(g0);
        if (bundle11 == null) {
            jg0Var = jg0.d;
            do2VarB = do2VarB;
            f = f;
            s55Var = s55Var;
        } else {
            ArrayList parcelableArrayList = bundle11.getParcelableArrayList(jg0.e);
            if (parcelableArrayList == null) {
                gy3VarF3 = gy3.r;
            } else {
                uw1 uw1VarJ = yw1.j();
                for (int i10 = 0; i10 < parcelableArrayList.size(); i10++) {
                    Bundle bundle12 = (Bundle) parcelableArrayList.get(i10);
                    bundle12.getClass();
                    uw1VarJ.c(ig0.a(bundle12));
                }
                gy3VarF3 = uw1VarJ.f();
            }
            jg0Var = new jg0(bundle11.getLong(jg0.f), gy3VarF3);
        }
        Bundle bundle13 = bundle.getBundle(R);
        if (bundle13 == null) {
            hp0VarB = hp0.e;
        } else {
            int i11 = bundle13.getInt(hp0.f, 0);
            int i12 = bundle13.getInt(hp0.g, 0);
            int i13 = bundle13.getInt(hp0.h, 0);
            String string4 = bundle13.getString(hp0.i);
            x20 x20Var = new x20(i11);
            x20Var.b = i12;
            x20Var.c = i13;
            rr2.l(i11 != 0 || string4 == null);
            x20Var.d = string4;
            hp0VarB = x20Var.b();
        }
        int i14 = bundle.getInt(S, 0);
        boolean z2 = bundle.getBoolean(T, false);
        boolean z3 = bundle.getBoolean(U, false);
        int i15 = bundle.getInt(V, 1);
        int i16 = bundle.getInt(W, 0);
        int i17 = bundle.getInt(X, 1);
        boolean z4 = bundle.getBoolean(Y, false);
        boolean z5 = bundle.getBoolean(Z, false);
        Bundle bundle14 = bundle.getBundle(h0);
        do2 do2VarB2 = bundle14 == null ? do2.K : do2.b(bundle14);
        hp0 hp0Var = hp0VarB;
        long j = bundle.getLong(i0, i < 4 ? 0L : 5000L);
        long j2 = bundle.getLong(j0, i < 4 ? 0L : 15000L);
        long j3 = bundle.getLong(k0, i < 4 ? 0L : 3000L);
        Bundle bundle15 = bundle.getBundle(m0);
        if (bundle15 == null) {
            jw4Var = jw4.b;
        } else {
            ArrayList parcelableArrayList2 = bundle15.getParcelableArrayList(jw4.c);
            jw4Var = new jw4(parcelableArrayList2 == null ? gy3.r : hw.f(new tb4(12), parcelableArrayList2));
        }
        Bundle bundle16 = bundle.getBundle(l0);
        return new lk3(playbackException, i3, za4VarB, pi3VarC, pi3VarC2, i4, qh3Var, i5, z, s55Var, au4Var, i8, do2VarB, f, f2, ilVarA, i9, jg0Var, hp0Var, i14, z2, z3, i15, i16, i17, z4, z5, do2VarB2, j, j2, j3, jw4Var, bundle16 == null ? cw4.J : cw4.b(bundle16));
    }

    public final lk3 a(il ilVar) {
        cu4 cu4Var = this.j;
        boolean zP = cu4Var.p();
        za4 za4Var = this.c;
        rr2.w(zP || za4Var.a.b < cu4Var.o());
        return new lk3(this.a, this.b, za4Var, this.d, this.e, this.f, this.g, this.h, this.i, this.l, cu4Var, this.k, this.m, this.n, this.o, ilVar, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final lk3 b(jw4 jw4Var) {
        cu4 cu4Var = this.j;
        boolean zP = cu4Var.p();
        za4 za4Var = this.c;
        rr2.w(zP || za4Var.a.b < cu4Var.o());
        return new lk3(this.a, this.b, za4Var, this.d, this.e, this.f, this.g, this.h, this.i, this.l, cu4Var, this.k, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, jw4Var, this.G);
    }

    public final lk3 c(int i, boolean z) {
        cu4 cu4Var = this.j;
        boolean zP = cu4Var.p();
        za4 za4Var = this.c;
        rr2.w(zP || za4Var.a.b < cu4Var.o());
        return new lk3(this.a, this.b, za4Var, this.d, this.e, this.f, this.g, this.h, this.i, this.l, cu4Var, this.k, this.m, this.n, this.o, this.q, this.p, this.r, this.s, i, z, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final lk3 d(int i, int i2, boolean z) {
        int i3 = this.A;
        boolean z2 = i3 == 3 && z && i2 == 0;
        cu4 cu4Var = this.j;
        boolean zP = cu4Var.p();
        za4 za4Var = this.c;
        rr2.w(zP || za4Var.a.b < cu4Var.o());
        return new lk3(this.a, this.b, za4Var, this.d, this.e, this.f, this.g, this.h, this.i, this.l, cu4Var, this.k, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, z, i, i2, i3, z2, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final lk3 e(qh3 qh3Var) {
        cu4 cu4Var = this.j;
        boolean zP = cu4Var.p();
        za4 za4Var = this.c;
        rr2.w(zP || za4Var.a.b < cu4Var.o());
        return new lk3(this.a, this.b, za4Var, this.d, this.e, this.f, qh3Var, this.h, this.i, this.l, cu4Var, this.k, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final lk3 f(int i, PlaybackException playbackException) {
        boolean z = this.v;
        int i2 = this.z;
        boolean z2 = i == 3 && z && i2 == 0;
        cu4 cu4Var = this.j;
        boolean zP = cu4Var.p();
        za4 za4Var = this.c;
        rr2.w(zP || za4Var.a.b < cu4Var.o());
        return new lk3(playbackException, this.b, za4Var, this.d, this.e, this.f, this.g, this.h, this.i, this.l, cu4Var, this.k, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, z, this.w, i2, i, z2, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final lk3 g(do2 do2Var) {
        cu4 cu4Var = this.j;
        boolean zP = cu4Var.p();
        za4 za4Var = this.c;
        rr2.w(zP || za4Var.a.b < cu4Var.o());
        return new lk3(this.a, this.b, za4Var, this.d, this.e, this.f, this.g, this.h, this.i, this.l, cu4Var, this.k, do2Var, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final lk3 h(pi3 pi3Var, pi3 pi3Var2, int i) {
        cu4 cu4Var = this.j;
        boolean zP = cu4Var.p();
        za4 za4Var = this.c;
        rr2.w(zP || za4Var.a.b < cu4Var.o());
        return new lk3(this.a, this.b, za4Var, pi3Var, pi3Var2, i, this.g, this.h, this.i, this.l, cu4Var, this.k, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final lk3 i(int i) {
        cu4 cu4Var = this.j;
        boolean zP = cu4Var.p();
        za4 za4Var = this.c;
        rr2.w(zP || za4Var.a.b < cu4Var.o());
        return new lk3(this.a, this.b, za4Var, this.d, this.e, this.f, this.g, i, this.i, this.l, cu4Var, this.k, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final lk3 j(za4 za4Var) {
        cu4 cu4Var = this.j;
        rr2.w(cu4Var.p() || za4Var.a.b < cu4Var.o());
        return new lk3(this.a, this.b, za4Var, this.d, this.e, this.f, this.g, this.h, this.i, this.l, cu4Var, this.k, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final lk3 k(boolean z) {
        cu4 cu4Var = this.j;
        boolean zP = cu4Var.p();
        za4 za4Var = this.c;
        rr2.w(zP || za4Var.a.b < cu4Var.o());
        return new lk3(this.a, this.b, za4Var, this.d, this.e, this.f, this.g, this.h, z, this.l, cu4Var, this.k, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final lk3 l(cu4 cu4Var) {
        boolean zP = cu4Var.p();
        za4 za4Var = this.c;
        rr2.w(zP || za4Var.a.b < cu4Var.o());
        return new lk3(this.a, this.b, za4Var, this.d, this.e, this.f, this.g, this.h, this.i, this.l, cu4Var, this.k, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final lk3 m(xs3 xs3Var, int i) {
        za4 za4Var = this.c;
        pi3 pi3Var = za4Var.a;
        za4 za4Var2 = new za4(new pi3(pi3Var.a, i, pi3Var.c, pi3Var.d, pi3Var.e, pi3Var.f, pi3Var.g, pi3Var.h, pi3Var.i), za4Var.b, za4Var.c, za4Var.d, za4Var.e, za4Var.f, za4Var.g, za4Var.h, za4Var.i, za4Var.j);
        rr2.w(xs3Var.p() || za4Var2.a.b < xs3Var.o());
        return new lk3(this.a, this.b, za4Var2, this.d, this.e, this.f, this.g, this.h, this.i, this.l, xs3Var, 0, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final lk3 n(cu4 cu4Var, za4 za4Var, int i) {
        rr2.w(cu4Var.p() || za4Var.a.b < cu4Var.o());
        return new lk3(this.a, this.b, za4Var, this.d, this.e, this.f, this.g, this.h, this.i, this.l, cu4Var, i, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final lk3 o(cw4 cw4Var) {
        cu4 cu4Var = this.j;
        boolean zP = cu4Var.p();
        za4 za4Var = this.c;
        rr2.w(zP || za4Var.a.b < cu4Var.o());
        return new lk3(this.a, this.b, za4Var, this.d, this.e, this.f, this.g, this.h, this.i, this.l, cu4Var, this.k, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, cw4Var);
    }

    public final lk3 p(float f) {
        float f2 = f != 0.0f ? f : this.n;
        cu4 cu4Var = this.j;
        boolean zP = cu4Var.p();
        za4 za4Var = this.c;
        rr2.w(zP || za4Var.a.b < cu4Var.o());
        return new lk3(this.a, this.b, za4Var, this.d, this.e, this.f, this.g, this.h, this.i, this.l, cu4Var, this.k, this.m, f, f2, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final lk3 q(mi3 mi3Var, boolean z, boolean z2) {
        float f;
        float f2;
        int i;
        boolean z3;
        int i2;
        boolean zA = mi3Var.a(16);
        boolean zA2 = mi3Var.a(17);
        za4 za4Var = this.c;
        za4 za4VarA = za4Var.a(zA, zA2);
        pi3 pi3VarB = this.d.b(zA, zA2);
        pi3 pi3VarB2 = this.e.b(zA, zA2);
        boolean z4 = true;
        cu4 au4Var = this.j;
        if (!zA2 && zA && !au4Var.p()) {
            int i3 = za4Var.a.b;
            if (au4Var.o() != 1) {
                bu4 bu4VarM = au4Var.m(i3, new bu4(), 0L);
                uw1 uw1VarJ = yw1.j();
                int i4 = bu4VarM.m;
                while (true) {
                    i2 = bu4VarM.n;
                    if (i4 > i2) {
                        break;
                    }
                    zt4 zt4VarF = au4Var.f(i4, new zt4(), true);
                    zt4VarF.c = 0;
                    uw1VarJ.c(zt4VarF);
                    i4++;
                }
                bu4VarM.n = i2 - bu4VarM.m;
                bu4VarM.m = 0;
                au4Var = new au4(yw1.o(bu4VarM), uw1VarJ.f(), new int[]{0});
            }
        } else if (z || !zA2) {
            au4Var = cu4.a;
        }
        cu4 cu4Var = au4Var;
        do2 do2Var = !mi3Var.a(18) ? do2.K : this.m;
        if (mi3Var.a(22)) {
            f = this.n;
            f2 = this.o;
        } else {
            f = 1.0f;
            f2 = 1.0f;
        }
        il ilVar = !mi3Var.a(21) ? il.i : this.q;
        jg0 jg0Var = !mi3Var.a(28) ? jg0.d : this.r;
        if (mi3Var.a(23)) {
            i = this.t;
            z3 = this.u;
        } else {
            i = 0;
            z3 = false;
        }
        do2 do2Var2 = !mi3Var.a(18) ? do2.K : this.B;
        jw4 jw4Var = (z2 || !mi3Var.a(30)) ? jw4.b : this.F;
        if (!cu4Var.p() && za4VarA.a.b >= cu4Var.o()) {
            z4 = false;
        }
        rr2.w(z4);
        return new lk3(this.a, this.b, za4VarA, pi3VarB, pi3VarB2, this.f, this.g, this.h, this.i, this.l, cu4Var, this.k, do2Var, f, f2, ilVar, this.p, jg0Var, this.s, i, z3, this.v, this.w, this.z, this.A, this.x, this.y, do2Var2, this.C, this.D, this.E, jw4Var, this.G);
    }

    public final gn2 s() {
        cu4 cu4Var = this.j;
        if (cu4Var.p()) {
            return null;
        }
        return cu4Var.m(this.c.a.b, new bu4(), 0L).b;
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
    public final Bundle t(int i) {
        long j;
        Bundle bundle;
        ArrayList arrayList;
        cu4 cu4Var;
        zt4 zt4Var;
        int i2;
        Bundle bundle2;
        Bundle bundle3 = new Bundle();
        PlaybackException playbackException = this.a;
        if (playbackException != null) {
            Bundle bundle4 = new Bundle();
            bundle4.putInt(PlaybackException.q, playbackException.n);
            bundle4.putLong(PlaybackException.r, playbackException.o);
            bundle4.putString(PlaybackException.s, playbackException.getMessage());
            bundle4.putBundle(PlaybackException.v, playbackException.p);
            Throwable cause = playbackException.getCause();
            if (cause != null) {
                bundle4.putString(PlaybackException.t, cause.getClass().getName());
                bundle4.putString(PlaybackException.u, cause.getMessage());
            }
            bundle3.putBundle(a0, bundle4);
        }
        int i3 = this.b;
        if (i3 != 0) {
            bundle3.putInt(c0, i3);
        }
        za4 za4Var = this.c;
        if (i < 3 || !za4Var.equals(za4.l)) {
            bundle3.putBundle(b0, za4Var.c(i));
        }
        pi3 pi3Var = this.d;
        if (i < 3 || !za4.k.a(pi3Var)) {
            bundle3.putBundle(d0, pi3Var.d(i));
        }
        pi3 pi3Var2 = this.e;
        if (i < 3 || !za4.k.a(pi3Var2)) {
            bundle3.putBundle(e0, pi3Var2.d(i));
        }
        int i4 = this.f;
        if (i4 != 0) {
            bundle3.putInt(f0, i4);
        }
        qh3 qh3Var = qh3.d;
        qh3 qh3Var2 = this.g;
        if (!qh3Var2.equals(qh3Var)) {
            Bundle bundle5 = new Bundle();
            bundle5.putFloat(qh3.e, qh3Var2.a);
            bundle5.putFloat(qh3.f, qh3Var2.b);
            bundle3.putBundle(I, bundle5);
        }
        int i5 = this.h;
        if (i5 != 0) {
            bundle3.putInt(J, i5);
        }
        boolean z = this.i;
        if (z) {
            bundle3.putBoolean(K, z);
        }
        yt4 yt4Var = cu4.a;
        cu4 cu4Var2 = this.j;
        boolean z2 = false;
        long j2 = 0;
        if (cu4Var2.equals(yt4Var)) {
            j = 0;
        } else {
            ArrayList arrayList2 = new ArrayList();
            int iO = cu4Var2.o();
            bu4 bu4Var = new bu4();
            int i6 = 0;
            while (i6 < iO) {
                bu4 bu4VarM = cu4Var2.m(i6, bu4Var, j2);
                bu4VarM.getClass();
                Bundle bundle6 = new Bundle();
                long j3 = j2;
                if (!gn2.g.equals(bu4VarM.b)) {
                    bundle6.putBundle(bu4.s, bu4VarM.b.c(false));
                }
                long j4 = bu4VarM.d;
                if (j4 != -9223372036854775807L) {
                    bundle6.putLong(bu4.t, j4);
                }
                long j5 = bu4VarM.e;
                if (j5 != r12) {
                    bundle6.putLong(bu4.u, j5);
                }
                long j6 = bu4VarM.f;
                if (j6 != r12) {
                    bundle6.putLong(bu4.v, j6);
                }
                boolean z3 = bu4VarM.g;
                if (z3) {
                    bundle6.putBoolean(bu4.w, z3);
                }
                boolean z4 = bu4VarM.h;
                if (z4) {
                    bundle6.putBoolean(bu4.x, z4);
                }
                an2 an2Var = bu4VarM.i;
                if (an2Var != null) {
                    bundle6.putBundle(bu4.y, an2Var.c());
                }
                boolean z5 = bu4VarM.j;
                if (z5) {
                    bundle6.putBoolean(bu4.z, z5);
                }
                long j7 = bu4VarM.k;
                if (j7 != j3) {
                    bundle6.putLong(bu4.A, j7);
                }
                long j8 = bu4VarM.l;
                if (j8 != -9223372036854775807) {
                    bundle6.putLong(bu4.B, j8);
                }
                int i7 = bu4VarM.m;
                if (i7 != 0) {
                    bundle6.putInt(bu4.C, i7);
                }
                int i8 = bu4VarM.n;
                if (i8 != 0) {
                    bundle6.putInt(bu4.D, i8);
                }
                long j9 = bu4VarM.o;
                if (j9 != j3) {
                    bundle6.putLong(bu4.E, j9);
                }
                arrayList2.add(bundle6);
                i6++;
                j2 = j3;
            }
            j = j2;
            ArrayList arrayList3 = new ArrayList();
            int iH = cu4Var2.h();
            zt4 zt4Var2 = new zt4();
            int i9 = 0;
            while (i9 < iH) {
                zt4 zt4VarF = cu4Var2.f(i9, zt4Var2, z2);
                zt4VarF.getClass();
                Bundle bundle7 = new Bundle();
                int i10 = zt4VarF.c;
                if (i10 != 0) {
                    bundle7.putInt(zt4.h, i10);
                }
                long j10 = zt4VarF.d;
                if (j10 != -9223372036854775807L) {
                    bundle7.putLong(zt4.i, j10);
                }
                long j11 = zt4VarF.e;
                if (j11 != j) {
                    bundle7.putLong(zt4.j, j11);
                }
                boolean z6 = zt4VarF.f;
                if (z6) {
                    bundle7.putBoolean(zt4.k, z6);
                }
                if (zt4VarF.g.equals(z5.f)) {
                    bundle = bundle3;
                    arrayList = arrayList2;
                    cu4Var = cu4Var2;
                    zt4Var = zt4Var2;
                    i2 = i9;
                } else {
                    String str = zt4.l;
                    z5 z5Var = zt4VarF.g;
                    z5Var.getClass();
                    Bundle bundle8 = new Bundle();
                    ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>();
                    x5[] x5VarArr = z5Var.e;
                    int length = x5VarArr.length;
                    ?? r6 = z2;
                    while (r6 < length) {
                        ?? r23 = r6;
                        x5 x5Var = x5VarArr[r23 == true ? 1 : 0];
                        x5Var.getClass();
                        int i11 = length;
                        Bundle bundle9 = new Bundle();
                        zt4 zt4Var3 = zt4Var2;
                        bundle9.putLong(x5.m, x5Var.a);
                        bundle9.putInt(x5.n, x5Var.b);
                        bundle9.putInt(x5.t, x5Var.c);
                        bundle9.putParcelableArrayList(x5.o, new ArrayList<>(Arrays.asList(x5Var.d)));
                        String str2 = x5.u;
                        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
                        gn2[] gn2VarArr = x5Var.e;
                        int i12 = i9;
                        int length2 = gn2VarArr.length;
                        ?? r10 = z2;
                        while (true) {
                            Bundle bundleC = null;
                            if (r10 >= length2) {
                                break;
                            }
                            ?? r29 = r10;
                            gn2 gn2Var = gn2VarArr[r29 == true ? 1 : 0];
                            if (gn2Var != null) {
                                bundleC = gn2Var.c(true);
                            }
                            arrayList5.add(bundleC);
                            length2 = length2;
                            r10 = (r29 == true ? 1 : 0) + 1;
                        }
                        bundle9.putParcelableArrayList(str2, arrayList5);
                        bundle9.putIntArray(x5.p, x5Var.f);
                        bundle9.putLongArray(x5.q, x5Var.g);
                        bundle9.putLong(x5.r, x5Var.j);
                        bundle9.putBoolean(x5.s, x5Var.k);
                        bundle9.putStringArrayList(x5.v, new ArrayList<>(Arrays.asList(x5Var.h)));
                        String str3 = x5.x;
                        ArrayList<? extends Parcelable> arrayList6 = new ArrayList<>();
                        y5[] y5VarArr = x5Var.i;
                        int length3 = y5VarArr.length;
                        ?? r11 = z2;
                        while (r11 < length3) {
                            ?? r210 = r11;
                            y5 y5Var = y5VarArr[r210 == true ? 1 : 0];
                            if (y5Var == null) {
                                bundle2 = null;
                            } else {
                                bundle2 = new Bundle();
                                bundle2.putLong(y5.d, y5Var.a);
                                bundle2.putLong(y5.e, y5Var.b);
                                bundle2.putString(y5.f, y5Var.c);
                            }
                            arrayList6.add(bundle2);
                            length3 = length3;
                            bundle3 = bundle3;
                            cu4Var2 = cu4Var2;
                            arrayList2 = arrayList2;
                            r11 = (r210 == true ? 1 : 0) + 1;
                        }
                        bundle9.putParcelableArrayList(str3, arrayList6);
                        bundle9.putBoolean(x5.w, x5Var.l);
                        arrayList4.add(bundle9);
                        length = i11;
                        zt4Var2 = zt4Var3;
                        i9 = i12;
                        r6 = (r23 == true ? 1 : 0) + 1;
                    }
                    bundle = bundle3;
                    arrayList = arrayList2;
                    cu4Var = cu4Var2;
                    zt4Var = zt4Var2;
                    i2 = i9;
                    if (!arrayList4.isEmpty()) {
                        bundle8.putParcelableArrayList(z5.h, arrayList4);
                    }
                    long j12 = z5Var.b;
                    if (j12 != j) {
                        bundle8.putLong(z5.i, j12);
                    }
                    long j13 = z5Var.c;
                    if (j13 != -9223372036854775807L) {
                        bundle8.putLong(z5.j, j13);
                    }
                    int i13 = z5Var.d;
                    if (i13 != 0) {
                        bundle8.putInt(z5.k, i13);
                    }
                    bundle7.putBundle(str, bundle8);
                }
                arrayList3.add(bundle7);
                i9 = i2 + 1;
                z2 = z2;
                iH = iH;
                zt4Var2 = zt4Var;
                bundle3 = bundle;
                cu4Var2 = cu4Var;
                arrayList2 = arrayList;
            }
            Bundle bundle10 = bundle3;
            ArrayList arrayList7 = arrayList2;
            cu4 cu4Var3 = cu4Var2;
            boolean z7 = z2;
            int[] iArr = new int[iO];
            boolean z8 = true;
            if (iO > 0) {
                iArr[z7 ? 1 : 0] = cu4Var3.a(true);
            }
            int i14 = 1;
            while (i14 < iO) {
                iArr[i14] = cu4Var3.e(iArr[i14 - 1], z7 ? 1 : 0, z8);
                i14++;
                z8 = true;
                z7 = false;
            }
            Bundle bundle11 = new Bundle();
            bundle11.putBinder(cu4.b, new iw(arrayList7));
            bundle11.putBinder(cu4.c, new iw(arrayList3));
            bundle11.putIntArray(cu4.d, iArr);
            bundle3 = bundle10;
            bundle3.putBundle(L, bundle11);
        }
        int i15 = this.k;
        if (i15 != 0) {
            bundle3.putInt(n0, i15);
        }
        s55 s55Var = s55.d;
        s55 s55Var2 = this.l;
        if (!s55Var2.equals(s55Var)) {
            Bundle bundle12 = new Bundle();
            int i16 = s55Var2.a;
            if (i16 != 0) {
                bundle12.putInt(s55.e, i16);
            }
            int i17 = s55Var2.b;
            if (i17 != 0) {
                bundle12.putInt(s55.f, i17);
            }
            float f = s55Var2.c;
            if (f != 1.0f) {
                bundle12.putFloat(s55.g, f);
            }
            bundle3.putBundle(M, bundle12);
        }
        do2 do2Var = do2.K;
        do2 do2Var2 = this.m;
        if (!do2Var2.equals(do2Var)) {
            bundle3.putBundle(N, do2Var2.c());
        }
        float f2 = this.n;
        if (f2 != 1.0f) {
            bundle3.putFloat(O, f2);
        }
        float f3 = this.o;
        if (f3 != 1.0f) {
            bundle3.putFloat(P, f3);
        }
        int i18 = this.p;
        if (i18 != 0) {
            bundle3.putInt(p0, i18);
        }
        il ilVar = il.i;
        il ilVar2 = this.q;
        if (!ilVar2.equals(ilVar)) {
            bundle3.putBundle(Q, ilVar2.d());
        }
        jg0 jg0Var = jg0.d;
        jg0 jg0Var2 = this.r;
        if (!jg0Var2.equals(jg0Var)) {
            Bundle bundle13 = new Bundle();
            String str4 = jg0.e;
            gy3 gy3Var = jg0Var2.a;
            uw1 uw1VarJ = yw1.j();
            for (int i19 = 0; i19 < gy3Var.q; i19++) {
                if (((ig0) gy3Var.get(i19)).d == null) {
                    uw1VarJ.c((ig0) gy3Var.get(i19));
                }
            }
            gy3 gy3VarF = uw1VarJ.f();
            ArrayList<? extends Parcelable> arrayList8 = new ArrayList<>(gy3VarF.q);
            vw1 vw1VarListIterator = gy3VarF.listIterator(0);
            while (vw1VarListIterator.hasNext()) {
                ig0 ig0Var = (ig0) vw1VarListIterator.next();
                Bundle bundleB = ig0Var.b();
                Bitmap bitmap = ig0Var.d;
                if (bitmap != null) {
                    bundleB.putParcelable(ig0.w, bitmap);
                }
                arrayList8.add(bundleB);
            }
            bundle13.putParcelableArrayList(str4, arrayList8);
            bundle13.putLong(jg0.f, jg0Var2.b);
            bundle3.putBundle(g0, bundle13);
        }
        hp0 hp0Var = hp0.e;
        hp0 hp0Var2 = this.s;
        if (!hp0Var2.equals(hp0Var)) {
            Bundle bundle14 = new Bundle();
            int i20 = hp0Var2.a;
            if (i20 != 0) {
                bundle14.putInt(hp0.f, i20);
            }
            int i21 = hp0Var2.b;
            if (i21 != 0) {
                bundle14.putInt(hp0.g, i21);
            }
            int i22 = hp0Var2.c;
            if (i22 != 0) {
                bundle14.putInt(hp0.h, i22);
            }
            String str5 = hp0Var2.d;
            if (str5 != null) {
                bundle14.putString(hp0.i, str5);
            }
            bundle3.putBundle(R, bundle14);
        }
        int i23 = this.t;
        if (i23 != 0) {
            bundle3.putInt(S, i23);
        }
        boolean z9 = this.u;
        if (z9) {
            bundle3.putBoolean(T, z9);
        }
        boolean z10 = this.v;
        if (z10) {
            bundle3.putBoolean(U, z10);
        }
        int i24 = this.w;
        if (i24 != 1) {
            bundle3.putInt(V, i24);
        }
        int i25 = this.z;
        if (i25 != 0) {
            bundle3.putInt(W, i25);
        }
        int i26 = this.A;
        if (i26 != 1) {
            bundle3.putInt(X, i26);
        }
        boolean z11 = this.x;
        if (z11) {
            bundle3.putBoolean(Y, z11);
        }
        boolean z12 = this.y;
        if (z12) {
            bundle3.putBoolean(Z, z12);
        }
        do2 do2Var3 = do2.K;
        do2 do2Var4 = this.B;
        if (!do2Var4.equals(do2Var3)) {
            bundle3.putBundle(h0, do2Var4.c());
        }
        long j14 = i < 6 ? j : 5000L;
        long j15 = this.C;
        if (j15 != j14) {
            bundle3.putLong(i0, j15);
        }
        long j16 = i < 6 ? j : 15000L;
        long j17 = this.D;
        if (j17 != j16) {
            bundle3.putLong(j0, j17);
        }
        long j18 = i < 6 ? j : 3000L;
        long j19 = this.E;
        if (j19 != j18) {
            bundle3.putLong(k0, j19);
        }
        jw4 jw4Var = jw4.b;
        jw4 jw4Var2 = this.F;
        if (!jw4Var2.equals(jw4Var)) {
            Bundle bundle15 = new Bundle();
            bundle15.putParcelableArrayList(jw4.c, hw.N(jw4Var2.a, new tb4(11)));
            bundle3.putBundle(m0, bundle15);
        }
        cw4 cw4Var = cw4.J;
        cw4 cw4Var2 = this.G;
        if (!cw4Var2.equals(cw4Var)) {
            bundle3.putBundle(l0, cw4Var2.c());
        }
        return bundle3;
    }
}
