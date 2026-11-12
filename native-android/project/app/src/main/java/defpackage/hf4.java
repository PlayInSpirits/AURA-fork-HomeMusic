package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hf4 extends bq {
    public final ii0 h;
    public final bi0 i;
    public final tb1 j;
    public final i80 l;
    public final bf4 n;
    public final gn2 o;
    public rw4 p;
    public final long k = -9223372036854775807L;
    public final boolean m = true;

    public hf4(fn2 fn2Var, bi0 bi0Var, i80 i80Var) {
        bn2 bn2Var;
        this.i = bi0Var;
        this.l = i80Var;
        boolean z = true;
        um2 um2Var = new um2();
        xm2 xm2Var = new xm2();
        List list = Collections.EMPTY_LIST;
        gy3 gy3Var = gy3.r;
        zm2 zm2Var = new zm2();
        cn2 cn2Var = cn2.d;
        Uri uri = Uri.EMPTY;
        String string = fn2Var.a.toString();
        string.getClass();
        yw1 yw1VarK = yw1.k(yw1.o(fn2Var));
        if (((Uri) xm2Var.e) != null && ((UUID) xm2Var.d) == null) {
            z = false;
        }
        rr2.w(z);
        if (uri != null) {
            bn2Var = new bn2(uri, null, ((UUID) xm2Var.d) != null ? new ym2(xm2Var) : null, null, list, null, yw1VarK, -9223372036854775807L);
        } else {
            bn2Var = null;
        }
        gn2 gn2Var = new gn2(string, new wm2(um2Var), bn2Var, new an2(zm2Var), do2.K, cn2Var);
        this.o = gn2Var;
        sb1 sb1Var = new sb1();
        String str = fn2Var.b;
        sb1Var.m = lw2.m(str == null ? "text/x-unknown" : str);
        sb1Var.d = fn2Var.c;
        sb1Var.e = fn2Var.d;
        sb1Var.f = fn2Var.e;
        sb1Var.b = fn2Var.f;
        String str2 = fn2Var.g;
        sb1Var.a = str2 != null ? str2 : null;
        this.j = new tb1(sb1Var);
        Map map = Collections.EMPTY_MAP;
        Uri uri2 = fn2Var.a;
        rr2.s(uri2, "The uri must be set.");
        this.h = new ii0(uri2, 0L, 1, null, map, 0L, -1L, null, 1);
        this.n = new bf4(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, 0L, 0L, true, false, false, null, gn2Var, null);
    }

    @Override // defpackage.bq
    public final no2 b(mt2 mt2Var, n9 n9Var, long j) {
        return new gf4(this.h, this.i, this.p, this.j, this.k, this.l, new ue1((CopyOnWriteArrayList) this.c.q, 0, mt2Var, 8), this.m, null);
    }

    @Override // defpackage.bq
    public final gn2 h() {
        return this.o;
    }

    @Override // defpackage.bq
    public final void j() {
    }

    @Override // defpackage.bq
    public final void l(rw4 rw4Var) {
        this.p = rw4Var;
        m(this.n);
    }

    @Override // defpackage.bq
    public final void n(no2 no2Var) {
        ((gf4) no2Var).v.p(null);
    }

    @Override // defpackage.bq
    public final void p() {
    }
}
