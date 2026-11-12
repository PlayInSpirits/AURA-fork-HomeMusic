package defpackage;

import android.os.SystemClock;
import androidx.media3.exoplayer.ExoPlaybackException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ph3 {
    public static final mt2 u = new mt2(new Object());
    public final cu4 a;
    public final mt2 b;
    public final long c;
    public final long d;
    public final int e;
    public final ExoPlaybackException f;
    public final boolean g;
    public final tv4 h;
    public final ew4 i;
    public final List j;
    public final mt2 k;
    public final boolean l;
    public final int m;
    public final int n;
    public final qh3 o;
    public final boolean p;
    public volatile long q;
    public volatile long r;
    public volatile long s;
    public volatile long t;

    public ph3(cu4 cu4Var, mt2 mt2Var, long j, long j2, int i, ExoPlaybackException exoPlaybackException, boolean z, tv4 tv4Var, ew4 ew4Var, List list, mt2 mt2Var2, boolean z2, int i2, int i3, qh3 qh3Var, long j3, long j4, long j5, long j6, boolean z3) {
        this.a = cu4Var;
        this.b = mt2Var;
        this.c = j;
        this.d = j2;
        this.e = i;
        this.f = exoPlaybackException;
        this.g = z;
        this.h = tv4Var;
        this.i = ew4Var;
        this.j = list;
        this.k = mt2Var2;
        this.l = z2;
        this.m = i2;
        this.n = i3;
        this.o = qh3Var;
        this.q = j3;
        this.r = j4;
        this.s = j5;
        this.t = j6;
        this.p = z3;
    }

    public static ph3 k(ew4 ew4Var) {
        yt4 yt4Var = cu4.a;
        tv4 tv4Var = tv4.d;
        gy3 gy3Var = gy3.r;
        qh3 qh3Var = qh3.d;
        mt2 mt2Var = u;
        return new ph3(yt4Var, mt2Var, -9223372036854775807L, 0L, 1, null, false, tv4Var, ew4Var, gy3Var, mt2Var, false, 1, 0, qh3Var, 0L, 0L, 0L, 0L, false);
    }

    public final ph3 a() {
        return new ph3(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, l(), SystemClock.elapsedRealtime(), this.p);
    }

    public final ph3 b(boolean z) {
        return new ph3(this.a, this.b, this.c, this.d, this.e, this.f, z, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final ph3 c(mt2 mt2Var) {
        return new ph3(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, mt2Var, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final ph3 d(mt2 mt2Var, long j, long j2, long j3, long j4, tv4 tv4Var, ew4 ew4Var, List list) {
        return new ph3(this.a, mt2Var, j2, j3, this.e, this.f, this.g, tv4Var, ew4Var, list, this.k, this.l, this.m, this.n, this.o, this.q, j4, j, SystemClock.elapsedRealtime(), this.p);
    }

    public final ph3 e(int i, int i2, boolean z) {
        return new ph3(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, z, i, i2, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final ph3 f(ExoPlaybackException exoPlaybackException) {
        return new ph3(this.a, this.b, this.c, this.d, this.e, exoPlaybackException, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final ph3 g(qh3 qh3Var) {
        return new ph3(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, qh3Var, this.q, this.r, this.s, this.t, this.p);
    }

    public final ph3 h(int i) {
        return new ph3(this.a, this.b, this.c, this.d, i, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final ph3 i(boolean z) {
        return new ph3(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, z);
    }

    public final ph3 j(cu4 cu4Var) {
        return new ph3(cu4Var, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final long l() {
        long j;
        long j2;
        if (!m()) {
            return this.s;
        }
        do {
            j = this.t;
            j2 = this.s;
        } while (j != this.t);
        return f35.Q(f35.i0(j2) + ((long) ((SystemClock.elapsedRealtime() - j) * this.o.a)));
    }

    public final boolean m() {
        return this.e == 3 && this.l && this.n == 0;
    }
}
