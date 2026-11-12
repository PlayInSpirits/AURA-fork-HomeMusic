package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ou implements ui2 {
    public final hs a;
    public final boolean b;

    public ou(hs hsVar, boolean z) {
        this.a = hsVar;
        this.b = z;
    }

    @Override // defpackage.ui2
    public final vi2 a(final cf2 cf2Var, final List list, long j) {
        boolean zIsEmpty = list.isEmpty();
        v01 v01Var = v01.n;
        if (zIsEmpty) {
            return cf2Var.v(nc0.j(j), nc0.i(j), v01Var, new or1(24));
        }
        long j2 = this.b ? j : j & (-8589934589L);
        if (list.size() == 1) {
            final pi2 pi2Var = (pi2) list.get(0);
            pi2Var.t();
            final jg3 jg3VarR = pi2Var.r(j2);
            final int iMax = Math.max(nc0.j(j), jg3VarR.n);
            final int iMax2 = Math.max(nc0.i(j), jg3VarR.o);
            return cf2Var.v(iMax, iMax2, v01Var, new if1() { // from class: mu
                @Override // defpackage.if1
                public final Object invoke(Object obj) {
                    lu.a((ig3) obj, jg3VarR, pi2Var, cf2Var.getLayoutDirection(), iMax, iMax2, this.a);
                    return j15.a;
                }
            });
        }
        final jg3[] jg3VarArr = new jg3[list.size()];
        final hx3 hx3Var = new hx3();
        hx3Var.n = nc0.j(j);
        final hx3 hx3Var2 = new hx3();
        hx3Var2.n = nc0.i(j);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            pi2 pi2Var2 = (pi2) list.get(i);
            pi2Var2.t();
            jg3 jg3VarR2 = pi2Var2.r(j2);
            jg3VarArr[i] = jg3VarR2;
            hx3Var.n = Math.max(hx3Var.n, jg3VarR2.n);
            hx3Var2.n = Math.max(hx3Var2.n, jg3VarR2.o);
        }
        return cf2Var.v(hx3Var.n, hx3Var2.n, v01Var, new if1() { // from class: nu
            @Override // defpackage.if1
            public final Object invoke(Object obj) {
                ig3 ig3Var = (ig3) obj;
                jg3[] jg3VarArr2 = jg3VarArr;
                int length = jg3VarArr2.length;
                int i2 = 0;
                int i3 = 0;
                while (i3 < length) {
                    int i4 = i2;
                    jg3 jg3Var = jg3VarArr2[i3];
                    jg3Var.getClass();
                    lu.a(ig3Var, jg3Var, (pi2) list.get(i4), cf2Var.getLayoutDirection(), hx3Var.n, hx3Var2.n, this.a);
                    i3++;
                    i2 = i4 + 1;
                }
                return j15.a;
            }
        });
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ou)) {
            return false;
        }
        ou ouVar = (ou) obj;
        return this.a.equals(ouVar.a) && this.b == ouVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxMeasurePolicy(alignment=" + this.a + ", propagateMinConstraints=" + this.b + ")";
    }
}
