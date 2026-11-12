package defpackage;

import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xs3 extends cu4 {
    public static final xs3 g;
    public static final Object h;
    public final yw1 e;
    public final ws3 f;

    static {
        vw1 vw1Var = yw1.o;
        g = new xs3(gy3.r, null);
        h = new Object();
    }

    public xs3(yw1 yw1Var, ws3 ws3Var) {
        this.e = yw1Var;
        this.f = ws3Var;
    }

    @Override // defpackage.cu4
    public final int b(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.cu4
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xs3)) {
            return false;
        }
        xs3 xs3Var = (xs3) obj;
        return Objects.equals(this.e, xs3Var.e) && Objects.equals(this.f, xs3Var.f);
    }

    @Override // defpackage.cu4
    public final zt4 f(int i, zt4 zt4Var, boolean z) {
        ws3 ws3VarS = s(i);
        Long lValueOf = Long.valueOf(ws3VarS.b);
        long jQ = f35.Q(ws3VarS.c);
        zt4Var.getClass();
        zt4Var.i(lValueOf, null, i, jQ, 0L, z5.f, false);
        return zt4Var;
    }

    @Override // defpackage.cu4
    public final int h() {
        return o();
    }

    @Override // defpackage.cu4
    public final int hashCode() {
        return Objects.hash(this.e, this.f);
    }

    @Override // defpackage.cu4
    public final Object l(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.cu4
    public final bu4 m(int i, bu4 bu4Var, long j) {
        ws3 ws3VarS = s(i);
        bu4Var.b(h, ws3VarS.a, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, true, false, null, 0L, f35.Q(ws3VarS.c), i, i, 0L);
        return bu4Var;
    }

    @Override // defpackage.cu4
    public final int o() {
        return this.e.size() + (this.f == null ? 0 : 1);
    }

    public final xs3 q(List list, int i) {
        uw1 uw1Var = new uw1(4);
        yw1 yw1Var = this.e;
        uw1Var.d(yw1Var.subList(0, i));
        for (int i2 = 0; i2 < list.size(); i2++) {
            uw1Var.c(new ws3((gn2) list.get(i2), -1L, -9223372036854775807L));
        }
        uw1Var.d(yw1Var.subList(i, yw1Var.size()));
        return new xs3(uw1Var.f(), this.f);
    }

    public final long r(int i) {
        if (i < 0) {
            return -1L;
        }
        yw1 yw1Var = this.e;
        if (i < yw1Var.size()) {
            return ((ws3) yw1Var.get(i)).b;
        }
        return -1L;
    }

    public final ws3 s(int i) {
        ws3 ws3Var;
        yw1 yw1Var = this.e;
        return (i != yw1Var.size() || (ws3Var = this.f) == null) ? (ws3) yw1Var.get(i) : ws3Var;
    }
}
