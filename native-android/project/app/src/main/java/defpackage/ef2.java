package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ef2 extends cf2 implements pi2 {
    public final f63 H;
    public LinkedHashMap J;
    public vi2 L;
    public final p03 M;
    public long I = 0;
    public final ff2 K = new ff2(this);

    public ef2(f63 f63Var) {
        this.H = f63Var;
        p03 p03Var = r73.a;
        this.M = new p03();
    }

    public static final void p0(ef2 ef2Var, vi2 vi2Var) {
        LinkedHashMap linkedHashMap;
        if (vi2Var != null) {
            ef2Var.Q((((long) vi2Var.b()) & 4294967295L) | (((long) vi2Var.d()) << 32));
        } else {
            ef2Var.Q(0L);
        }
        if (!h12.c(ef2Var.L, vi2Var) && vi2Var != null && ((((linkedHashMap = ef2Var.J) != null && !linkedHashMap.isEmpty()) || !vi2Var.a().isEmpty()) && !h12.c(vi2Var.a(), ef2Var.J))) {
            if2 if2Var = ef2Var.H.H.R.q;
            if2Var.getClass();
            if2Var.D.f();
            LinkedHashMap linkedHashMap2 = ef2Var.J;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                ef2Var.J = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(vi2Var.a());
        }
        ef2Var.L = vi2Var;
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
    public final void N(long j, float f, if1 if1Var) {
        r0(j);
        if (this.A) {
            return;
        }
        q0();
    }

    @Override // defpackage.cf2
    public final cf2 d0() {
        f63 f63Var = this.H.I;
        if (f63Var != null) {
            return f63Var.y0();
        }
        return null;
    }

    @Override // defpackage.cf2
    public final q62 e0() {
        return this.K;
    }

    @Override // defpackage.cf2
    public final boolean f0() {
        return this.L != null;
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
        vi2 vi2Var = this.L;
        if (vi2Var != null) {
            return vi2Var;
        }
        throw xa3.l("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // defpackage.cf2
    public final cf2 i0() {
        f63 f63Var = this.H.J;
        if (f63Var != null) {
            return f63Var.y0();
        }
        return null;
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

    public final void r0(long j) {
        if (!g02.a(this.I, j)) {
            this.I = j;
            f63 f63Var = this.H;
            if2 if2Var = f63Var.H.R.q;
            if (if2Var != null) {
                if2Var.b0();
            }
            cf2.l0(f63Var);
        }
        if (this.B) {
            return;
        }
        b0(h0());
    }

    public final long s0(ef2 ef2Var, boolean z) {
        long jC = 0;
        while (!this.equals(ef2Var)) {
            if (!this.y || !z) {
                jC = g02.c(jC, this.I);
            }
            f63 f63Var = this.H.J;
            f63Var.getClass();
            this = f63Var.y0();
            this.getClass();
        }
        return jC;
    }

    @Override // defpackage.jg3, defpackage.pi2
    public final Object t() {
        this.H.t();
        return null;
    }
}
