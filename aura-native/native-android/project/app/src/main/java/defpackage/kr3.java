package defpackage;

import android.net.Uri;
import android.os.Looper;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kr3 extends bq {
    public final bi0 h;
    public final ss2 i;
    public final ww0 j;
    public final i80 k;
    public final int l;
    public final tb1 m;
    public boolean n = true;
    public long o = -9223372036854775807L;
    public boolean p;
    public boolean q;
    public boolean r;
    public rw4 s;
    public gn2 t;

    public kr3(gn2 gn2Var, bi0 bi0Var, ss2 ss2Var, ww0 ww0Var, i80 i80Var, int i, tb1 tb1Var) {
        this.t = gn2Var;
        this.h = bi0Var;
        this.i = ss2Var;
        this.j = ww0Var;
        this.k = i80Var;
        this.l = i;
        this.m = tb1Var;
    }

    @Override // defpackage.bq
    public final boolean a(gn2 gn2Var) {
        bn2 bn2Var = h().b;
        bn2Var.getClass();
        bn2 bn2Var2 = gn2Var.b;
        return bn2Var2 != null && bn2Var2.a.equals(bn2Var.a) && bn2Var2.h == bn2Var.h && Objects.equals(bn2Var2.f, bn2Var.f);
    }

    @Override // defpackage.bq
    public final no2 b(mt2 mt2Var, n9 n9Var, long j) {
        ci0 ci0VarM = this.h.m();
        rw4 rw4Var = this.s;
        if (rw4Var != null) {
            ci0VarM.c(rw4Var);
        }
        bn2 bn2Var = h().b;
        bn2Var.getClass();
        Uri uri = bn2Var.a;
        this.g.getClass();
        return new hr3(uri, ci0VarM, new z05((n51) this.i.o), this.j, new sw0(this.d.c, 0, mt2Var), this.k, new ue1((CopyOnWriteArrayList) this.c.q, 0, mt2Var, 8), this, n9Var, bn2Var.f, this.l, this.m, f35.Q(bn2Var.h), null);
    }

    @Override // defpackage.bq
    public final synchronized gn2 h() {
        return this.t;
    }

    @Override // defpackage.bq
    public final void j() {
    }

    @Override // defpackage.bq
    public final void l(rw4 rw4Var) {
        this.s = rw4Var;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        ik3 ik3Var = this.g;
        ik3Var.getClass();
        ww0 ww0Var = this.j;
        ww0Var.e(looperMyLooper, ik3Var);
        ww0Var.b();
        t();
    }

    @Override // defpackage.bq
    public final void n(no2 no2Var) {
        hr3 hr3Var = (hr3) no2Var;
        if (hr3Var.L) {
            for (p44 p44Var : hr3Var.I) {
                p44Var.j();
                pw0 pw0Var = p44Var.h;
                if (pw0Var != null) {
                    pw0Var.d(p44Var.e);
                    p44Var.h = null;
                    p44Var.g = null;
                }
            }
        }
        hr3Var.z.p(hr3Var);
        hr3Var.E.removeCallbacksAndMessages(null);
        hr3Var.F = null;
        hr3Var.d0 = true;
    }

    @Override // defpackage.bq
    public final void p() {
        this.j.a();
    }

    @Override // defpackage.bq
    public final synchronized void s(gn2 gn2Var) {
        this.t = gn2Var;
    }

    public final void t() {
        long j = this.o;
        boolean z = this.p;
        boolean z2 = this.q;
        gn2 gn2VarH = h();
        cu4 bf4Var = new bf4(-9223372036854775807L, -9223372036854775807L, j, j, 0L, 0L, z, false, false, null, gn2VarH, z2 ? gn2VarH.c : null);
        if (this.n) {
            bf4Var = new ir3(bf4Var);
        }
        m(bf4Var);
    }

    public final void u(long j, m84 m84Var, boolean z) {
        if (this.r && m84Var.d()) {
            return;
        }
        this.r = !m84Var.d();
        if (j == -9223372036854775807L) {
            j = this.o;
        }
        boolean zB = m84Var.b();
        if (!this.n && this.o == j && this.p == zB && this.q == z) {
            return;
        }
        this.o = j;
        this.p = zB;
        this.q = z;
        this.n = false;
        t();
    }
}
