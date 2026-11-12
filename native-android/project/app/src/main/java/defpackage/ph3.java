package defpackage;

import android.os.SystemClock;
import androidx.media3.exoplayer.ExoPlaybackException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ph3 {
    public static final mt2 u = null;
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

    static {
        u = new mt2(new Object());
    }

    public ph3(cu4 r1, mt2 r2, long r3, long r5, int r7, ExoPlaybackException r8, boolean r9, tv4 r10, ew4 r11, List r12, mt2 r13, boolean r14, int r15, int r16, qh3 r17, long r18, long r20, long r22, long r24, boolean r26) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r5;
        this.e = r7;
        this.f = r8;
        this.g = r9;
        this.h = r10;
        this.i = r11;
        this.j = r12;
        this.k = r13;
        this.l = r14;
        this.m = r15;
        this.n = r16;
        this.o = r17;
        this.q = r18;
        this.r = r20;
        this.s = r22;
        this.t = r24;
        this.p = r26;
    }

    public static ph3 k(ew4 r27) {
        yt4 r1 = cu4.a;
        tv4 r10 = tv4.d;
        gy3 r12 = gy3.r;
        qh3 r17 = qh3.d;
        mt2 r2 = u;
        return new ph3(r1, r2, -9223372036854775807L, 0, 1, null, false, r10, r27, r12, r2, false, 1, 0, r17, 0, 0, 0, 0, false);
    }

    public final ph3 a() {
        return new ph3(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, l(), SystemClock.elapsedRealtime(), this.p);
    }

    public final ph3 b(boolean r30) {
        return new ph3(this.a, this.b, this.c, this.d, this.e, this.f, r30, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final ph3 c(mt2 r30) {
        return new ph3(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, r30, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final ph3 d(mt2 r28, long r29, long r31, long r33, long r35, tv4 r37, ew4 r38, List r39) {
        return new ph3(this.a, r28, r31, r33, this.e, this.f, this.g, r37, r38, r39, this.k, this.l, this.m, this.n, this.o, this.q, r35, r29, SystemClock.elapsedRealtime(), this.p);
    }

    public final ph3 e(int r28, int r29, boolean r30) {
        return new ph3(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, r30, r28, r29, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final ph3 f(ExoPlaybackException r30) {
        return new ph3(this.a, this.b, this.c, this.d, this.e, r30, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final ph3 g(qh3 r31) {
        return new ph3(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, r31, this.q, this.r, this.s, this.t, this.p);
    }

    public final ph3 h(int r30) {
        return new ph3(this.a, this.b, this.c, this.d, r30, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final ph3 i(boolean r32) {
        return new ph3(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, r32);
    }

    public final ph3 j(cu4 r30) {
        return new ph3(r30, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final long l() {
        if (m() == false) goto L5;
    L6:
        long r0 = this.t;
        long r2 = this.s;
        if (r0 != this.t) goto L6;
        return f35.Q(f35.i0(r2) + ((long) ((SystemClock.elapsedRealtime() - r0) * this.o.a)));
    L5:
        return this.s;
    }

    public final boolean m() {
        if (this.e == 3) goto L5;
        return false;
    L5:
        if (this.l == true) goto L7;
        return false;
    L7:
        if (this.n != 0) goto L13;
        return true;
    L13:
        return false;
    }
}
