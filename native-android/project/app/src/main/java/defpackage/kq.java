package defpackage;

import androidx.media3.exoplayer.ExoPlaybackException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class kq implements rk3 {
    public boolean A;
    public boolean B;
    public mt2 D;
    public pn0 E;
    public final int o;
    public dz3 q;
    public int r;
    public ik3 s;
    public vp4 t;
    public int u;
    public q44 v;
    public tb1[] w;
    public long x;
    public long y;
    public final Object n = new Object();
    public final gp3 p = new gp3(9, false);
    public long z = Long.MIN_VALUE;
    public cu4 C = cu4.a;

    public kq(int i) {
        this.o = i;
    }

    public static int a(int i, int i2, int i3, int i4) {
        return i | i2 | i3 | 128 | i4;
    }

    public static boolean n(int i, boolean z) {
        int i2 = i & 7;
        if (i2 != 4) {
            return z && i2 == 3;
        }
        return true;
    }

    public abstract void A(long j, long j2);

    public final void B(tb1[] tb1VarArr, q44 q44Var, long j, long j2, mt2 mt2Var) {
        rr2.w(!this.A);
        this.v = q44Var;
        this.D = mt2Var;
        if (this.z == Long.MIN_VALUE) {
            this.z = j;
        }
        this.w = tb1VarArr;
        this.x = j2;
        x(tb1VarArr, j, j2, mt2Var);
    }

    public final void C(long j, boolean z, boolean z2) {
        this.A = false;
        this.y = j;
        this.z = j;
        if (!z2) {
            q44 q44Var = this.v;
            q44Var.getClass();
            z2 = q44Var.u(j - this.x) != 0;
        }
        r(j, z, z2);
    }

    public void D(float f, float f2) {
    }

    public abstract int E(tb1 tb1Var);

    public int F() {
        return 0;
    }

    public boolean G(long j) {
        return false;
    }

    public final ExoPlaybackException b(Throwable th, tb1 tb1Var, boolean z, int i) {
        int iE;
        if (tb1Var == null || this.B) {
            iE = 4;
        } else {
            this.B = true;
            try {
                iE = E(tb1Var) & 7;
                this.B = false;
            } catch (ExoPlaybackException unused) {
                this.B = false;
                iE = 4;
            } catch (Throwable th2) {
                this.B = false;
                throw th2;
            }
        }
        return new ExoPlaybackException(1, th, i, h(), this.r, tb1Var, tb1Var == null ? 4 : iE, this.D, z);
    }

    @Override // defpackage.rk3
    public void c(int i, Object obj) {
    }

    public void e() {
    }

    public long f(long j, long j2) {
        if (this.u == 1) {
            return (o() || m()) ? 1000000L : 10000L;
        }
        return 10000L;
    }

    public yj2 g() {
        return null;
    }

    public abstract String h();

    public final boolean l() {
        return this.z == Long.MIN_VALUE;
    }

    public abstract boolean m();

    public abstract boolean o();

    public abstract void p();

    public void q(boolean z, boolean z2) {
    }

    public abstract void r(long j, boolean z, boolean z2);

    public void s() {
    }

    public final void t() {
        pn0 pn0Var;
        synchronized (this.n) {
            pn0Var = this.E;
        }
        if (pn0Var != null) {
            synchronized (pn0Var.c) {
                pn0Var.f.getClass();
            }
        }
    }

    public void u() {
    }

    public void v() {
    }

    public void w() {
    }

    public void x(tb1[] tb1VarArr, long j, long j2, mt2 mt2Var) {
    }

    public void y() {
    }

    public final int z(gp3 gp3Var, cj0 cj0Var, int i) {
        q44 q44Var = this.v;
        q44Var.getClass();
        int iT = q44Var.t(gp3Var, cj0Var, i);
        if (iT == -4) {
            if (cj0Var.d(4)) {
                this.z = Long.MIN_VALUE;
                return this.A ? -4 : -3;
            }
            long j = cj0Var.t + this.x;
            cj0Var.t = j;
            this.z = Math.max(this.z, j);
            return iT;
        }
        if (iT == -5) {
            tb1 tb1Var = (tb1) gp3Var.p;
            tb1Var.getClass();
            long j2 = tb1Var.s;
            if (j2 != Long.MAX_VALUE) {
                sb1 sb1VarA = tb1Var.a();
                sb1VarA.r = j2 + this.x;
                gp3Var.p = new tb1(sb1VarA);
            }
        }
        return iT;
    }
}
