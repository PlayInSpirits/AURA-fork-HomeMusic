package defpackage;

import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qw4 extends p80 {
    public final gn2 k;
    public final jr3 l;
    public final long m;
    public kr3 n;
    public int o;

    public qw4(gn2 gn2Var, kx kxVar, jr3 jr3Var) {
        int i;
        gn2Var.getClass();
        this.k = gn2Var;
        this.l = jr3Var;
        this.m = -9223372036854775807L;
        this.o = 1;
        Bundle bundle = gn2Var.d.I;
        bn2 bn2Var = gn2Var.b;
        Uri uri = bn2Var != null ? bn2Var.a : null;
        if (h12.c(uri != null ? uri.getScheme() : null, "content")) {
            return;
        }
        if (!h12.c(uri != null ? uri.getScheme() : null, "file") && bundle != null && bundle.containsKey("duration") && (i = bundle.getInt("duration")) > 0) {
            this.m = f35.Q(((long) i) * 1000);
        }
    }

    @Override // defpackage.bq
    public final no2 b(mt2 mt2Var, n9 n9Var, long j) {
        n9Var.getClass();
        kr3 kr3Var = this.n;
        if (kr3Var != null) {
            return new pw4(this, kr3Var.b(mt2Var, n9Var, j), kr3Var, mt2Var, n9Var);
        }
        kf2.o("Source not ready");
        return null;
    }

    @Override // defpackage.bq
    public final gn2 h() {
        return this.k;
    }

    @Override // defpackage.bq
    public final void l(rw4 rw4Var) {
        this.j = rw4Var;
        this.i = f35.p(null);
        kr3 kr3VarD = this.l.d(this.k);
        this.n = kr3VarD;
        x(0, kr3VarD);
    }

    @Override // defpackage.bq
    public final void n(no2 no2Var) {
        no2Var.getClass();
        pw4 pw4Var = (pw4) no2Var;
        pw4Var.o.n(pw4Var.n);
        Integer num = pw4Var.u;
        if (num != null) {
            pw4Var.y.y(Integer.valueOf(num.intValue()));
        }
        pw4Var.u = null;
    }

    @Override // defpackage.p80, defpackage.bq
    public final void p() {
        super.p();
        this.n = null;
    }

    @Override // defpackage.p80
    public final mt2 t(Object obj, mt2 mt2Var) {
        mt2Var.getClass();
        return mt2Var;
    }

    @Override // defpackage.p80
    public final void w(Object obj, bq bqVar, cu4 cu4Var) {
        Integer num = (Integer) obj;
        cu4Var.getClass();
        if (num != null && num.intValue() == 0) {
            long j = this.m;
            if (j != -9223372036854775807L) {
                cu4Var = new sv2(1, j, cu4Var);
            }
            m(cu4Var);
        }
    }
}
