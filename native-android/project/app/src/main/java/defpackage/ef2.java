package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ef2 extends cf2 implements pi2 {
    public final f63 H;
    public long I;
    public LinkedHashMap J;
    public final ff2 K;
    public vi2 L;
    public final p03 M;

    public ef2(f63 r3) {
        this.H = r3;
        this.I = 0;
        this.K = new ff2(this);
        p03 r4 = r73.a;
        this.M = new p03();
    }

    public static final void p0(ef2 r6, vi2 r7) {
        if (r7 == null) goto L4;
        int r0 = r7.d();
        long r2 = ((long) r0) << 32;
        r6.Q((((long) r7.b()) & 4294967295L) | r2);
    L6:
        if (h12.c(r6.L, r7) == true) goto L20;
        if (r7 == null) goto L20;
        LinkedHashMap r1 = r6.J;
        if (r1 == null) goto L13;
        if (r1.isEmpty() == true) goto L13;
    L15:
        if (h12.c(r7.a(), r6.J) == true) goto L20;
        if2 r3 = r6.H.H.R.q;
        r3.getClass();
        r3.D.f();
        LinkedHashMap r4 = r6.J;
        if (r4 != null) goto L19;
        r4 = new LinkedHashMap();
        r6.J = r4;
    L19:
        r4.clear();
        r4.putAll(r7.a());
    L13:
        if (r7.a().isEmpty() == false) goto L15;
    L20:
        r6.L = r7;
        return;
    L4:
        r6.Q(0);
        goto L6
    }

    @Override // defpackage.oo0
    public final float J() {
        return this.H.J();
    }

    @Override // defpackage.cf2, defpackage.wi2
    public final boolean K() {
        return true;
    }

    @Override // defpackage.jg3
    public final void N(long r1, float r3, if1 r4) {
        r0(r1);
        if (this.A == false) goto L5;
        return;
    L5:
        q0();
    }

    @Override // defpackage.cf2
    public final cf2 d0() {
        f63 r0 = this.H.I;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.y0();
    }

    @Override // defpackage.cf2
    public final q62 e0() {
        return this.K;
    }

    @Override // defpackage.cf2
    public final boolean f0() {
        if (this.L == null) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // defpackage.oo0
    public final float g() {
        return this.H.g();
    }

    @Override // defpackage.cf2
    public final c72 g0() {
        return this.H.H;
    }

    @Override // defpackage.wi2
    public final r62 getLayoutDirection() {
        return this.H.H.K;
    }

    @Override // defpackage.cf2
    public final vi2 h0() {
        vi2 r0 = this.L;
        if (r0 == null) goto L6;
        return r0;
    L6:
        throw xa3.l("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // defpackage.cf2
    public final cf2 i0() {
        f63 r0 = this.H.J;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.y0();
    }

    @Override // defpackage.cf2
    public final long j0() {
        return this.I;
    }

    @Override // defpackage.cf2
    public final void n0() {
        N(this.I, 0.0f, null);
    }

    public void q0() {
        h0().c();
    }

    public final void r0(long r3) {
        if (g02.a(this.I, r3) == true) goto L9;
        this.I = r3;
        f63 r4 = this.H;
        if2 r5 = r4.H.R.q;
        if (r5 == null) goto L7;
        r5.b0();
    L7:
        cf2.l0(r4);
    L9:
        if (this.B == true) goto L12;
        b0(h0());
        return;
    }

    public final long s0(ef2 r5, boolean r6) {
        long r0 = 0;
    L4:
        if (this.equals(r5) == true) goto L10;
        if (this.y == false) goto L8;
        if (r6 == false) goto L8;
    L9:
        f63 r4 = this.H.J;
        r4.getClass();
        ef2 this = r4.y0();
        this.getClass();
    L8:
        r0 = g02.c(r0, this.I);
        goto L9
    L10:
        return r0;
    }

    @Override // defpackage.jg3, defpackage.pi2
    public final Object t() {
        this.H.t();
        return null;
    }
}
