package defpackage;

import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class lj0 implements qc2, xl2, gt2, it2, wc0 {
    public final /* synthetic */ int n;
    public final /* synthetic */ long o;
    public final /* synthetic */ Object p;

    public /* synthetic */ lj0(long j, Object obj, int i) {
        this.p = obj;
        this.n = i;
        this.o = j;
    }

    @Override // defpackage.wc0
    public void accept(Object obj) {
        ao4 ao4Var = (ao4) this.p;
        lg0 lg0Var = (lg0) obj;
        ao4Var.h.getClass();
        byte[] y = i80.y(lg0Var.a, lg0Var.c);
        be3 be3Var = ao4Var.c;
        be3Var.getClass();
        be3Var.L(y.length, y);
        ao4Var.a.e(y.length, be3Var);
        long j = lg0Var.b;
        tb1 tb1Var = ao4Var.h;
        long j2 = this.o;
        if (j == -9223372036854775807L) {
            rr2.w(tb1Var.s == Long.MAX_VALUE);
        } else {
            long j3 = tb1Var.s;
            j2 = j3 == Long.MAX_VALUE ? j2 + j : j + j3;
        }
        ao4Var.a.a(j2, this.n | 1, y.length, 0, null);
    }

    @Override // defpackage.xl2
    public void d(pu1 pu1Var, int i) {
        bm2 bm2Var = (bm2) this.p;
        pu1Var.S(bm2Var.c, i, this.n, this.o);
    }

    @Override // defpackage.gt2
    public void e(al3 al3Var, fr2 fr2Var) {
        kt2 kt2Var = (kt2) this.p;
        al3Var.n(kt2Var.L0(fr2Var, al3Var, this.n), this.o);
    }

    @Override // defpackage.it2
    public Object h(tn2 tn2Var, fr2 fr2Var, int i) {
        List list = (List) this.p;
        int i2 = this.n;
        return tn2Var.x(fr2Var, list, i2 == -1 ? tn2Var.s.o0() : i2, i2 == -1 ? tn2Var.s.M0() : this.o);
    }

    @Override // defpackage.qc2
    public void invoke(Object obj) {
        q9 q9Var = (q9) this.p;
        ho2 ho2Var = (ho2) obj;
        HashMap hashMap = ho2Var.h;
        HashMap hashMap2 = ho2Var.i;
        mt2 mt2Var = q9Var.d;
        if (mt2Var != null) {
            String c = ho2Var.c.c(q9Var.b, mt2Var);
            Long l = (Long) hashMap2.get(c);
            Long l2 = (Long) hashMap.get(c);
            hashMap2.put(c, Long.valueOf((l == null ? 0L : l.longValue()) + this.o));
            hashMap.put(c, Long.valueOf((l2 != null ? l2.longValue() : 0L) + this.n));
        }
    }

    public /* synthetic */ lj0(q9 q9Var, int i, long j, long j2) {
        this.p = q9Var;
        this.n = i;
        this.o = j;
    }

    public /* synthetic */ lj0(ao4 ao4Var, long j, int i) {
        this.p = ao4Var;
        this.o = j;
        this.n = i;
    }
}
