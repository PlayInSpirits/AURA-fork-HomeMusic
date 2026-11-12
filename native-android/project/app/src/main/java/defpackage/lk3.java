package defpackage;

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Parcelable
 *  android.os.RemoteException
 *  android.os.SystemClock
 *  android.text.TextUtils
 */
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.PlaybackException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        Object object = za4.l;
        pi3 pi32 = za4.k;
        qh3 qh32 = qh3.d;
        s55 s552 = s55.d;
        yt4 yt42 = cu4.a;
        do2 do22 = do2.K;
        H = new lk3(null, 0, (za4)object, pi32, pi32, 0, qh32, 0, false, s552, yt42, 0, do22, 1.0f, 1.0f, il.i, 0, jg0.d, hp0.e, 0, false, false, 1, 0, 1, false, false, do22, 5000L, 15000L, 3000L, jw4.b, cw4.J);
        object = f35.a;
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

    public lk3(PlaybackException playbackException, int n16, za4 za42, pi3 pi32, pi3 pi33, int n17, qh3 qh32, int n18, boolean bl5, s55 s552, cu4 cu42, int n19, do2 do22, float f16, float f17, il il5, int n26, jg0 jg02, hp0 hp02, int n27, boolean bl6, boolean bl7, int n28, int n29, int n36, boolean bl8, boolean bl9, do2 do23, long l16, long l17, long l18, jw4 jw42, cw4 cw42) {
        this.a = playbackException;
        this.b = n16;
        this.c = za42;
        this.d = pi32;
        this.e = pi33;
        this.f = n17;
        this.g = qh32;
        this.h = n18;
        this.i = bl5;
        this.l = s552;
        this.j = cu42;
        this.k = n19;
        this.m = do22;
        this.n = f16;
        this.o = f17;
        this.p = n26;
        this.q = il5;
        this.r = jg02;
        this.s = hp02;
        this.t = n27;
        this.u = bl6;
        this.v = bl7;
        this.w = n28;
        this.z = n29;
        this.A = n36;
        this.x = bl8;
        this.y = bl9;
        this.B = do23;
        this.C = l16;
        this.D = l17;
        this.E = l18;
        this.F = jw42;
        this.G = cw42;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static lk3 r(int n16, Bundle object) {
        void var1_4;
        void var34_70;
        void var31_49;
        void var30_59;
        void var27_20;
        void var25_31;
        void var24_16;
        boolean bl5;
        int n17;
        int n18;
        Object object2;
        Object object3;
        Object object4;
        int n19;
        int n26;
        Object object5;
        int n27;
        Object object6;
        Object object7;
        Object object8;
        IBinder iBinder = object.getBinder(o0);
        if (iBinder instanceof kk3) {
            return ((kk3)iBinder).e;
        }
        Bundle bundle = object.getBundle(a0);
        Object var24_7 = null;
        Object var25_22 = null;
        if (bundle == null) {
            Object var24_8 = null;
        } else {
            void var25_26;
            void var24_12;
            block34: {
                object8 = bundle.getString(PlaybackException.s);
                object7 = bundle.getString(PlaybackException.t);
                object6 = bundle.getString(PlaybackException.u);
                if (!TextUtils.isEmpty((CharSequence)object7)) {
                    try {
                        void var25_24;
                        Class<?> clazz = Class.forName((String)object7, true, PlaybackException.class.getClassLoader());
                        if (Throwable.class.isAssignableFrom(clazz)) {
                            Throwable throwable = (Throwable)clazz.getConstructor(String.class).newInstance(object6);
                        }
                        void var24_10 = var25_24;
                        if (var25_24 != null) break block34;
                    }
                    catch (Throwable throwable) {
                        RemoteException remoteException = new RemoteException((String)object6);
                        break block34;
                    }
                    RemoteException remoteException = new RemoteException((String)object6);
                }
            }
            n27 = bundle.getInt(PlaybackException.q, 1000);
            Bundle bundle2 = f35.n(bundle.getBundle(PlaybackException.v));
            if (bundle2 == null) {
                Bundle bundle3 = Bundle.EMPTY;
            }
            PlaybackException playbackException = new PlaybackException((String)object8, (Throwable)var24_12, n27, (Bundle)var25_26, bundle.getLong(PlaybackException.r, SystemClock.elapsedRealtime()));
        }
        int n28 = object.getInt(c0, 0);
        Bundle bundle4 = object.getBundle(b0);
        if (bundle4 == null) {
            za4 za42 = za4.l;
        } else {
            za4 za43 = za4.b(bundle4);
        }
        object8 = object.getBundle(d0);
        object8 = object8 == null ? za4.k : pi3.c((Bundle)object8);
        Bundle bundle5 = object.getBundle(e0);
        if (bundle5 == null) {
            pi3 pi32 = za4.k;
        } else {
            pi3 pi33 = pi3.c(bundle5);
        }
        int n29 = object.getInt(f0, 0);
        object6 = object.getBundle(I);
        object6 = object6 == null ? qh3.d : new qh3(object6.getFloat(qh3.e, 1.0f), object6.getFloat(qh3.f, 1.0f));
        int n36 = object.getInt(J, 0);
        boolean bl6 = object.getBoolean(K, false);
        Bundle bundle6 = object.getBundle(L);
        if (bundle6 == null) {
            object7 = cu4.a;
        } else {
            void var31_44;
            void var30_55;
            object7 = new tb4(7);
            IBinder iBinder2 = bundle6.getBinder(cu4.b);
            if (iBinder2 == null) {
                object7 = yw1.o;
                object7 = gy3.r;
            } else {
                object7 = hw.f((eg1)object7, iw.a(iBinder2));
            }
            object5 = new tb4(8);
            IBinder iBinder3 = bundle6.getBinder(cu4.c);
            if (iBinder3 == null) {
                vw1 vw12 = yw1.o;
                gy3 gy32 = gy3.r;
            } else {
                gy3 gy33 = hw.f((eg1)object5, iw.a(iBinder3));
            }
            Object object9 = object5 = (Object)bundle6.getIntArray(cu4.d);
            if (object5 == null) {
                n26 = ((gy3)object7).q;
                int[] nArray = new int[n26];
                for (n27 = 0; n27 < n26; ++n27) {
                    nArray[n27] = n27;
                }
            }
            object7 = new au4((gy3)object7, (gy3)var30_55, (int[])var31_44);
        }
        n26 = object.getInt(n0, 0);
        Bundle bundle7 = object.getBundle(M);
        if (bundle7 == null) {
            s55 s552 = s55.d;
        } else {
            n27 = bundle7.getInt(s55.e, 0);
            n19 = bundle7.getInt(s55.f, 0);
            s55 s553 = new s55(n27, bundle7.getFloat(s55.g, 1.0f), n19);
        }
        Bundle bundle8 = object.getBundle(N);
        if (bundle8 == null) {
            do2 do22 = do2.K;
        } else {
            do2 do23 = do2.b(bundle8);
        }
        float f16 = object.getFloat(O, 1.0f);
        float f17 = object.getFloat(P, 1.0f);
        n19 = object.getInt(p0, 0);
        object5 = object.getBundle(Q);
        object5 = object5 == null ? il.i : il.a((Bundle)object5);
        Bundle bundle9 = object.getBundle(g0);
        if (bundle9 == null) {
            object4 = jg0.d;
        } else {
            object3 = bundle9.getParcelableArrayList(jg0.e);
            if (object3 == null) {
                object4 = gy3.r;
            } else {
                object4 = yw1.j();
                for (n27 = 0; n27 < object3.size(); ++n27) {
                    object2 = (Bundle)object3.get(n27);
                    object2.getClass();
                    ((pw1)object4).c(ig0.a((Bundle)object2));
                }
                object4 = ((uw1)object4).f();
            }
            object4 = new jg0(bundle9.getLong(jg0.f), (List)object4);
        }
        Bundle bundle10 = object.getBundle(R);
        if (bundle10 == null) {
            hp0 hp02 = hp0.e;
        } else {
            n27 = bundle10.getInt(hp0.f, 0);
            n18 = bundle10.getInt(hp0.g, 0);
            n17 = bundle10.getInt(hp0.h, 0);
            String string = bundle10.getString(hp0.i);
            object2 = new x20(n27);
            ((x20)object2).b = n18;
            ((x20)object2).c = n17;
            bl5 = n27 != 0 || string == null;
            rr2.l(bl5);
            ((x20)object2).d = string;
            hp0 hp03 = ((x20)object2).b();
        }
        n27 = object.getInt(S, 0);
        boolean bl7 = object.getBoolean(T, false);
        boolean bl8 = object.getBoolean(U, false);
        n17 = object.getInt(V, 1);
        int n37 = object.getInt(W, 0);
        n18 = object.getInt(X, 1);
        bl5 = object.getBoolean(Y, false);
        boolean bl9 = object.getBoolean(Z, false);
        object2 = object.getBundle(h0);
        object2 = object2 == null ? do2.K : do2.b((Bundle)object2);
        long l16 = n16 < 4 ? 0L : 5000L;
        long l17 = object.getLong(i0, l16);
        l16 = n16 < 4 ? 0L : 15000L;
        long l18 = object.getLong(j0, l16);
        l16 = n16 < 4 ? 0L : 3000L;
        l16 = object.getLong(k0, l16);
        object3 = object.getBundle(m0);
        if (object3 == null) {
            object3 = jw4.b;
        } else {
            object3 = (object3 = object3.getParcelableArrayList(jw4.c)) == null ? gy3.r : hw.f(new tb4(12), (List)object3);
            object3 = new jw4((List)object3);
        }
        Bundle bundle11 = object.getBundle(l0);
        if (bundle11 == null) {
            cw4 cw42 = cw4.J;
            return new lk3((PlaybackException)var24_16, n28, (za4)var25_31, (pi3)object8, (pi3)var27_20, n29, (qh3)object6, n36, bl6, (s55)var30_59, (cu4)object7, n26, (do2)var31_49, f16, f17, (il)object5, n19, (jg0)object4, (hp0)var34_70, n27, bl7, bl8, n17, n37, n18, bl5, bl9, (do2)object2, l17, l18, l16, (jw4)object3, (cw4)var1_4);
        }
        cw4 cw43 = cw4.b(bundle11);
        return new lk3((PlaybackException)var24_16, n28, (za4)var25_31, (pi3)object8, (pi3)var27_20, n29, (qh3)object6, n36, bl6, (s55)var30_59, (cu4)object7, n26, (do2)var31_49, f16, f17, (il)object5, n19, (jg0)object4, (hp0)var34_70, n27, bl7, bl8, n17, n37, n18, bl5, bl9, (do2)object2, l17, l18, l16, (jw4)object3, (cw4)var1_4);
    }

    public final lk3 a(il il5) {
        cu4 cu42 = this.j;
        boolean bl5 = cu42.p();
        za4 za42 = this.c;
        bl5 = bl5 || za42.a.b < cu42.o();
        rr2.w(bl5);
        return new lk3(this.a, this.b, za42, this.d, this.e, this.f, this.g, this.h, this.i, this.l, cu42, this.k, this.m, this.n, this.o, il5, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final lk3 b(jw4 jw42) {
        cu4 cu42 = this.j;
        boolean bl5 = cu42.p();
        za4 za42 = this.c;
        bl5 = bl5 || za42.a.b < cu42.o();
        rr2.w(bl5);
        return new lk3(this.a, this.b, za42, this.d, this.e, this.f, this.g, this.h, this.i, this.l, cu42, this.k, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, jw42, this.G);
    }

    public final lk3 c(int n16, boolean bl5) {
        cu4 cu42 = this.j;
        boolean bl6 = cu42.p();
        za4 za42 = this.c;
        bl6 = bl6 || za42.a.b < cu42.o();
        rr2.w(bl6);
        return new lk3(this.a, this.b, za42, this.d, this.e, this.f, this.g, this.h, this.i, this.l, cu42, this.k, this.m, this.n, this.o, this.q, this.p, this.r, this.s, n16, bl5, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final lk3 d(int n16, int n17, boolean bl5) {
        boolean bl6 = false;
        int n18 = this.A;
        boolean bl7 = n18 == 3 && bl5 && n17 == 0;
        cu4 cu42 = this.j;
        boolean bl8 = cu42.p();
        za4 za42 = this.c;
        if (bl8 || za42.a.b < cu42.o()) {
            bl6 = true;
        }
        rr2.w(bl6);
        return new lk3(this.a, this.b, za42, this.d, this.e, this.f, this.g, this.h, this.i, this.l, cu42, this.k, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, bl5, n16, n17, n18, bl7, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final lk3 e(qh3 qh32) {
        cu4 cu42 = this.j;
        boolean bl5 = cu42.p();
        za4 za42 = this.c;
        bl5 = bl5 || za42.a.b < cu42.o();
        rr2.w(bl5);
        return new lk3(this.a, this.b, za42, this.d, this.e, this.f, qh32, this.h, this.i, this.l, cu42, this.k, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final lk3 f(int n16, PlaybackException playbackException) {
        boolean bl5 = false;
        boolean bl6 = this.v;
        int n17 = this.z;
        boolean bl7 = n16 == 3 && bl6 && n17 == 0;
        cu4 cu42 = this.j;
        boolean bl8 = cu42.p();
        za4 za42 = this.c;
        if (bl8 || za42.a.b < cu42.o()) {
            bl5 = true;
        }
        rr2.w(bl5);
        return new lk3(playbackException, this.b, za42, this.d, this.e, this.f, this.g, this.h, this.i, this.l, cu42, this.k, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, bl6, this.w, n17, n16, bl7, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final lk3 g(do2 do22) {
        cu4 cu42 = this.j;
        boolean bl5 = cu42.p();
        za4 za42 = this.c;
        bl5 = bl5 || za42.a.b < cu42.o();
        rr2.w(bl5);
        return new lk3(this.a, this.b, za42, this.d, this.e, this.f, this.g, this.h, this.i, this.l, cu42, this.k, do22, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final lk3 h(pi3 pi32, pi3 pi33, int n16) {
        cu4 cu42 = this.j;
        boolean bl5 = cu42.p();
        za4 za42 = this.c;
        bl5 = bl5 || za42.a.b < cu42.o();
        rr2.w(bl5);
        return new lk3(this.a, this.b, za42, pi32, pi33, n16, this.g, this.h, this.i, this.l, cu42, this.k, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final lk3 i(int n16) {
        cu4 cu42 = this.j;
        boolean bl5 = cu42.p();
        za4 za42 = this.c;
        bl5 = bl5 || za42.a.b < cu42.o();
        rr2.w(bl5);
        return new lk3(this.a, this.b, za42, this.d, this.e, this.f, this.g, n16, this.i, this.l, cu42, this.k, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final lk3 j(za4 za42) {
        cu4 cu42 = this.j;
        boolean bl5 = cu42.p() || za42.a.b < cu42.o();
        rr2.w(bl5);
        return new lk3(this.a, this.b, za42, this.d, this.e, this.f, this.g, this.h, this.i, this.l, cu42, this.k, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final lk3 k(boolean bl5) {
        cu4 cu42 = this.j;
        boolean bl6 = cu42.p();
        za4 za42 = this.c;
        bl6 = bl6 || za42.a.b < cu42.o();
        rr2.w(bl6);
        return new lk3(this.a, this.b, za42, this.d, this.e, this.f, this.g, this.h, bl5, this.l, cu42, this.k, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final lk3 l(cu4 cu42) {
        boolean bl5 = cu42.p();
        za4 za42 = this.c;
        bl5 = bl5 || za42.a.b < cu42.o();
        rr2.w(bl5);
        return new lk3(this.a, this.b, za42, this.d, this.e, this.f, this.g, this.h, this.i, this.l, cu42, this.k, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final lk3 m(xs3 xs32, int n16) {
        za4 za42 = this.c;
        Object object = za42.a;
        object = new za4(new pi3(((pi3)object).a, n16, ((pi3)object).c, ((pi3)object).d, ((pi3)object).e, ((pi3)object).f, ((pi3)object).g, ((pi3)object).h, ((pi3)object).i), za42.b, za42.c, za42.d, za42.e, za42.f, za42.g, za42.h, za42.i, za42.j);
        boolean bl5 = xs32.p() || ((za4)object).a.b < xs32.o();
        rr2.w(bl5);
        return new lk3(this.a, this.b, (za4)object, this.d, this.e, this.f, this.g, this.h, this.i, this.l, xs32, 0, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final lk3 n(cu4 cu42, za4 za42, int n16) {
        boolean bl5 = cu42.p() || za42.a.b < cu42.o();
        rr2.w(bl5);
        return new lk3(this.a, this.b, za42, this.d, this.e, this.f, this.g, this.h, this.i, this.l, cu42, n16, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final lk3 o(cw4 cw42) {
        cu4 cu42 = this.j;
        boolean bl5 = cu42.p();
        za4 za42 = this.c;
        bl5 = bl5 || za42.a.b < cu42.o();
        rr2.w(bl5);
        return new lk3(this.a, this.b, za42, this.d, this.e, this.f, this.g, this.h, this.i, this.l, cu42, this.k, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, cw42);
    }

    public final lk3 p(float f16) {
        float f17 = f16 != 0.0f ? f16 : this.n;
        cu4 cu42 = this.j;
        boolean bl5 = cu42.p();
        za4 za42 = this.c;
        bl5 = bl5 || za42.a.b < cu42.o();
        rr2.w(bl5);
        return new lk3(this.a, this.b, za42, this.d, this.e, this.f, this.g, this.h, this.i, this.l, cu42, this.k, this.m, f16, f17, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final lk3 q(mi3 object, boolean bl5, boolean bl6) {
        float f16;
        float f17;
        Object object2;
        Object object3;
        int n16;
        boolean bl7 = ((mi3)object).a(16);
        boolean bl8 = ((mi3)object).a(17);
        Object object4 = this.c;
        za4 za42 = ((za4)object4).a(bl7, bl8);
        pi3 pi32 = this.d.b(bl7, bl8);
        pi3 pi33 = this.e.b(bl7, bl8);
        boolean bl9 = true;
        cu4 cu42 = this.j;
        if (!bl8 && bl7 && !cu42.p()) {
            n16 = ((za4)object4).a.b;
            if (cu42.o() != 1) {
                int n17;
                object3 = cu42.m(n16, new bu4(), 0L);
                object2 = yw1.j();
                for (n16 = ((bu4)object3).m; n16 <= (n17 = ((bu4)object3).n); ++n16) {
                    object4 = cu42.f(n16, new zt4(), true);
                    ((zt4)object4).c = 0;
                    ((pw1)object2).c(object4);
                }
                ((bu4)object3).n = n17 - ((bu4)object3).m;
                ((bu4)object3).m = 0;
                cu42 = new au4(yw1.o(object3), ((uw1)object2).f(), new int[]{0});
            }
        } else if (bl5 || !bl8) {
            cu42 = cu4.a;
        }
        object4 = !((mi3)object).a(18) ? do2.K : this.m;
        if (!((mi3)object).a(22)) {
            f17 = 1.0f;
            f16 = 1.0f;
        } else {
            f17 = this.n;
            f16 = this.o;
        }
        object3 = !((mi3)object).a(21) ? il.i : this.q;
        object2 = !((mi3)object).a(28) ? jg0.d : this.r;
        if (!((mi3)object).a(23)) {
            n16 = 0;
            bl5 = false;
        } else {
            n16 = this.t;
            bl5 = this.u;
        }
        do2 do22 = !((mi3)object).a(18) ? do2.K : this.B;
        object = !bl6 && ((mi3)object).a(30) ? this.F : jw4.b;
        bl6 = bl9;
        if (!cu42.p()) {
            bl6 = za42.a.b < cu42.o() ? bl9 : false;
        }
        rr2.w(bl6);
        return new lk3(this.a, this.b, za42, pi32, pi33, this.f, this.g, this.h, this.i, this.l, cu42, this.k, (do2)object4, f17, f16, (il)object3, this.p, (jg0)object2, this.s, n16, bl5, this.v, this.w, this.z, this.A, this.x, this.y, do22, this.C, this.D, this.E, (jw4)object, this.G);
    }

    public final gn2 s() {
        cu4 cu42 = this.j;
        if (cu42.p()) {
            return null;
        }
        return cu42.m((int)this.c.a.b, (bu4)new bu4(), (long)0L).b;
    }

    public final Bundle t(int n16) {
        long l16;
        float f16;
        Object object;
        Object object2;
        long l17;
        Object object3;
        Object object4;
        Object object5;
        boolean bl5;
        int n17;
        Object object6;
        Object object7 = new Bundle();
        Object object8 = this.a;
        if (object8 != null) {
            object6 = new Bundle();
            object6.putInt(PlaybackException.q, ((PlaybackException)object8).n);
            object6.putLong(PlaybackException.r, ((PlaybackException)object8).o);
            object6.putString(PlaybackException.s, ((Throwable)object8).getMessage());
            object6.putBundle(PlaybackException.v, ((PlaybackException)object8).p);
            object8 = ((Throwable)object8).getCause();
            if (object8 != null) {
                object6.putString(PlaybackException.t, object8.getClass().getName());
                object6.putString(PlaybackException.u, ((Throwable)object8).getMessage());
            }
            object7.putBundle(a0, (Bundle)object6);
        }
        if ((n17 = this.b) != 0) {
            object7.putInt(c0, n17);
        }
        object6 = this.c;
        if (n16 < 3 || !((za4)object6).equals(za4.l)) {
            object7.putBundle(b0, ((za4)object6).c(n16));
        }
        object6 = this.d;
        if (n16 < 3 || !za4.k.a((pi3)object6)) {
            object7.putBundle(d0, ((pi3)object6).d(n16));
        }
        object6 = this.e;
        if (n16 < 3 || !za4.k.a((pi3)object6)) {
            object7.putBundle(e0, ((pi3)object6).d(n16));
        }
        if ((n17 = this.f) != 0) {
            object7.putInt(f0, n17);
        }
        if (!((qh3)(object6 = this.g)).equals(object8 = qh3.d)) {
            object8 = new Bundle();
            object8.putFloat(qh3.e, ((qh3)object6).a);
            object8.putFloat(qh3.f, ((qh3)object6).b);
            object7.putBundle(I, (Bundle)object8);
        }
        if ((n17 = this.h) != 0) {
            object7.putInt(J, n17);
        }
        if (bl5 = this.i) {
            object7.putBoolean(K, bl5);
        }
        object6 = cu4.a;
        object8 = this.j;
        bl5 = ((cu4)object8).equals(object6);
        int n18 = 0;
        long l18 = 0L;
        if (!bl5) {
            int n19;
            object6 = new ArrayList();
            int n26 = ((cu4)object8).o();
            object5 = new bu4();
            for (n17 = 0; n17 < n26; ++n17) {
                object4 = ((cu4)object8).m(n17, (bu4)object5, l18);
                object4.getClass();
                object3 = new Bundle();
                if (!gn2.g.equals(((bu4)object4).b)) {
                    object3.putBundle(bu4.s, ((bu4)object4).b.c(false));
                }
                if ((l17 = ((bu4)object4).d) != -9223372036854775807L) {
                    object3.putLong(bu4.t, l17);
                }
                if ((l17 = ((bu4)object4).e) != -9223372036854775807L) {
                    object3.putLong(bu4.u, l17);
                }
                if ((l17 = ((bu4)object4).f) != -9223372036854775807L) {
                    object3.putLong(bu4.v, l17);
                }
                if (bl5 = ((bu4)object4).g) {
                    object3.putBoolean(bu4.w, bl5);
                }
                if (bl5 = ((bu4)object4).h) {
                    object3.putBoolean(bu4.x, bl5);
                }
                if ((object2 = ((bu4)object4).i) != null) {
                    object3.putBundle(bu4.y, ((an2)object2).c());
                }
                if (bl5 = ((bu4)object4).j) {
                    object3.putBoolean(bu4.z, bl5);
                }
                if ((l17 = ((bu4)object4).k) != l18) {
                    object3.putLong(bu4.A, l17);
                }
                if ((l17 = ((bu4)object4).l) != -9223372036854775807L) {
                    object3.putLong(bu4.B, l17);
                }
                if ((n19 = ((bu4)object4).m) != 0) {
                    object3.putInt(bu4.C, n19);
                }
                if ((n19 = ((bu4)object4).n) != 0) {
                    object3.putInt(bu4.D, n19);
                }
                if ((l17 = ((bu4)object4).o) != l18) {
                    object3.putLong(bu4.E, l17);
                }
                ((ArrayList)object6).add(object3);
            }
            object4 = new ArrayList();
            int n27 = ((cu4)object8).h();
            object2 = new zt4();
            n17 = n18;
            for (n19 = 0; n19 < n27; ++n19) {
                object5 = ((cu4)object8).f(n19, (zt4)object2, n17 != 0);
                object5.getClass();
                object3 = new Bundle();
                n18 = ((zt4)object5).c;
                if (n18 != 0) {
                    object3.putInt(zt4.h, n18);
                }
                if ((l17 = ((zt4)object5).d) != -9223372036854775807L) {
                    object3.putLong(zt4.i, l17);
                }
                if ((l17 = ((zt4)object5).e) != l18) {
                    object3.putLong(zt4.j, l17);
                }
                if (bl5 = ((zt4)object5).f) {
                    object3.putBoolean(zt4.k, bl5);
                }
                if (!((zt4)object5).g.equals(z5.f)) {
                    object = zt4.l;
                    z5 z56 = ((zt4)object5).g;
                    z56.getClass();
                    Bundle bundle = new Bundle();
                    ArrayList<Bundle> arrayList = new ArrayList<Bundle>();
                    x5[] x5Array = z56.e;
                    n18 = x5Array.length;
                    for (int i16 = n17; i16 < n18; ++i16) {
                        Object object9;
                        x5 x56 = x5Array[i16];
                        x56.getClass();
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong(x5.m, x56.a);
                        bundle2.putInt(x5.n, x56.b);
                        bundle2.putInt(x5.t, x56.c);
                        bundle2.putParcelableArrayList(x5.o, new ArrayList<Uri>(Arrays.asList(x56.d)));
                        Object object10 = x5.u;
                        Object object11 = new ArrayList<Object>();
                        Object[] objectArray = x56.e;
                        int n28 = objectArray.length;
                        int n29 = n17;
                        while (true) {
                            object5 = null;
                            if (n29 >= n28) break;
                            object9 = objectArray[n29];
                            if (object9 != null) {
                                object5 = ((gn2)object9).c(true);
                            }
                            ((ArrayList)object11).add(object5);
                            ++n29;
                        }
                        bundle2.putParcelableArrayList((String)object10, object11);
                        bundle2.putIntArray(x5.p, x56.f);
                        bundle2.putLongArray(x5.q, x56.g);
                        bundle2.putLong(x5.r, x56.j);
                        bundle2.putBoolean(x5.s, x56.k);
                        bundle2.putStringArrayList(x5.v, new ArrayList<String>(Arrays.asList(x56.h)));
                        object11 = x5.x;
                        object10 = new ArrayList();
                        objectArray = x56.i;
                        n28 = objectArray.length;
                        for (n29 = n17; n29 < n28; ++n29) {
                            object9 = objectArray[n29];
                            if (object9 == null) {
                                object5 = null;
                            } else {
                                object5 = new Bundle();
                                object5.putLong(y5.d, ((y5)object9).a);
                                object5.putLong(y5.e, ((y5)object9).b);
                                object5.putString(y5.f, ((y5)object9).c);
                            }
                            ((ArrayList)object10).add(object5);
                        }
                        bundle2.putParcelableArrayList((String)object11, (ArrayList)object10);
                        bundle2.putBoolean(x5.w, x56.l);
                        arrayList.add(bundle2);
                    }
                    object5 = object7;
                    object7 = object6;
                    object6 = object8;
                    if (!arrayList.isEmpty()) {
                        bundle.putParcelableArrayList(z5.h, arrayList);
                    }
                    if ((l17 = z56.b) != l18) {
                        bundle.putLong(z5.i, l17);
                    }
                    if ((l17 = z56.c) != -9223372036854775807L) {
                        bundle.putLong(z5.j, l17);
                    }
                    if ((n18 = z56.d) != 0) {
                        bundle.putInt(z5.k, n18);
                    }
                    object3.putBundle((String)object, bundle);
                    object8 = object5;
                } else {
                    object5 = object7;
                    object7 = object6;
                    object6 = object8;
                    object8 = object5;
                }
                ((ArrayList)object4).add(object3);
                object5 = object8;
                object8 = object6;
                object6 = object7;
                object7 = object5;
            }
            object2 = new int[n26];
            if (n26 > 0) {
                object2[n17] = ((cu4)object8).a(true);
            }
            for (n19 = 1; n19 < n26; ++n19) {
                object2[n19] = ((cu4)object8).e((int)object2[n19 - 1], n17, true);
                n17 = 0;
            }
            object8 = new Bundle();
            object8.putBinder(cu4.b, (IBinder)new iw((List)object6));
            object8.putBinder(cu4.c, (IBinder)new iw((List)object4));
            object8.putIntArray(cu4.d, (int[])object2);
            object6 = L;
            object7.putBundle((String)object6, (Bundle)object8);
        } else {
            l18 = 0L;
        }
        n17 = this.k;
        if (n17 != 0) {
            object7.putInt(n0, n17);
        }
        if (!((s55)(object6 = this.l)).equals(object8 = s55.d)) {
            object8 = new Bundle();
            n17 = ((s55)object6).a;
            if (n17 != 0) {
                object8.putInt(s55.e, n17);
            }
            if ((n17 = ((s55)object6).b) != 0) {
                object8.putInt(s55.f, n17);
            }
            if ((f16 = ((s55)object6).c) != 1.0f) {
                object8.putFloat(s55.g, f16);
            }
            object7.putBundle(M, (Bundle)object8);
        }
        if (!((do2)(object8 = this.m)).equals(object6 = do2.K)) {
            object7.putBundle(N, ((do2)object8).c());
        }
        if ((f16 = this.n) != 1.0f) {
            object7.putFloat(O, f16);
        }
        if ((f16 = this.o) != 1.0f) {
            object7.putFloat(P, f16);
        }
        if ((n17 = this.p) != 0) {
            object7.putInt(p0, n17);
        }
        if (!((il)(object6 = this.q)).equals(object8 = il.i)) {
            object7.putBundle(Q, ((il)object6).d());
        }
        if (!(object6 = this.r).equals(object8 = jg0.d)) {
            object8 = new Bundle();
            object2 = jg0.e;
            object5 = ((jg0)object6).a;
            object4 = yw1.j();
            for (n17 = 0; n17 < ((gy3)object5).q; ++n17) {
                if (((ig0)((gy3)object5).get((int)n17)).d != null) continue;
                ((pw1)object4).c((ig0)((gy3)object5).get(n17));
            }
            object4 = ((uw1)object4).f();
            object5 = new ArrayList(((gy3)object4).q);
            object3 = ((yw1)object4).m(0);
            while (((v0)object3).hasNext()) {
                object = (ig0)((v0)object3).next();
                object4 = ((ig0)object).b();
                object = ((ig0)object).d;
                if (object != null) {
                    object4.putParcelable(ig0.w, (Parcelable)object);
                }
                ((ArrayList)object5).add(object4);
            }
            object8.putParcelableArrayList((String)object2, (ArrayList)object5);
            object8.putLong(jg0.f, ((jg0)object6).b);
            object7.putBundle(g0, (Bundle)object8);
        }
        if (!((hp0)(object6 = this.s)).equals(object8 = hp0.e)) {
            object8 = new Bundle();
            n17 = ((hp0)object6).a;
            if (n17 != 0) {
                object8.putInt(hp0.f, n17);
            }
            if ((n17 = ((hp0)object6).b) != 0) {
                object8.putInt(hp0.g, n17);
            }
            if ((n17 = ((hp0)object6).c) != 0) {
                object8.putInt(hp0.h, n17);
            }
            if ((object6 = ((hp0)object6).d) != null) {
                object8.putString(hp0.i, (String)object6);
            }
            object7.putBundle(R, (Bundle)object8);
        }
        if ((n17 = this.t) != 0) {
            object7.putInt(S, n17);
        }
        if (bl5 = this.u) {
            object7.putBoolean(T, bl5);
        }
        if (bl5 = this.v) {
            object7.putBoolean(U, bl5);
        }
        if ((n17 = this.w) != 1) {
            object7.putInt(V, n17);
        }
        if ((n17 = this.z) != 0) {
            object7.putInt(W, n17);
        }
        if ((n17 = this.A) != 1) {
            object7.putInt(X, n17);
        }
        if (bl5 = this.x) {
            object7.putBoolean(Y, bl5);
        }
        if (bl5 = this.y) {
            object7.putBoolean(Z, bl5);
        }
        if (!((do2)(object8 = this.B)).equals(object6 = do2.K)) {
            object7.putBundle(h0, ((do2)object8).c());
        }
        if ((l16 = this.C) != (l17 = n16 < 6 ? l18 : 5000L)) {
            object7.putLong(i0, l16);
        }
        if ((l16 = this.D) != (l17 = n16 < 6 ? l18 : 15000L)) {
            object7.putLong(j0, l16);
        }
        if (n16 >= 6) {
            l18 = 3000L;
        }
        l17 = this.E;
        if (l17 != l18) {
            object7.putLong(k0, l17);
        }
        if (!((jw4)(object6 = this.F)).equals(object8 = jw4.b)) {
            object8 = new Bundle();
            object8.putParcelableArrayList(jw4.c, hw.N(((jw4)object6).a, new tb4(11)));
            object7.putBundle(m0, (Bundle)object8);
        }
        if (!((cw4)(object6 = this.G)).equals(object8 = cw4.J)) {
            object7.putBundle(l0, ((cw4)object6).c());
        }
        return object7;
    }
}

