package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hz1 extends ef2 {
    @Override // defpackage.cf2
    public final int X(pp1 pp1Var) {
        if2 if2Var = this.H.H.R.q;
        if2Var.getClass();
        f72 f72Var = if2Var.s;
        y62 y62Var = f72Var.d;
        d72 d72Var = if2Var.D;
        if (y62Var == y62.o) {
            d72Var.d = true;
            if (d72Var.b) {
                f72Var.f = true;
                f72Var.g = true;
            }
        } else {
            d72Var.e = true;
        }
        hz1 hz1Var = if2Var.c().o0;
        Boolean boolValueOf = hz1Var != null ? Boolean.valueOf(hz1Var.B) : null;
        hz1 hz1Var2 = if2Var.c().o0;
        if (hz1Var2 != null) {
            hz1Var2.B = true;
        }
        if2Var.y();
        hz1 hz1Var3 = if2Var.c().o0;
        if (hz1Var3 != null) {
            hz1Var3.B = boolValueOf != null ? boolValueOf.booleanValue() : false;
        }
        Integer num = (Integer) d72Var.g.get(pp1Var);
        int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
        this.M.g(iIntValue, pp1Var);
        return iIntValue;
    }

    @Override // defpackage.ef2
    public final void q0() {
        if2 if2Var = this.H.H.R.q;
        if2Var.getClass();
        if2Var.c0();
    }

    @Override // defpackage.pi2
    public final jg3 r(long j) {
        R(j);
        f63 f63Var = this.H;
        f13 f13VarY = f63Var.H.y();
        Object[] objArr = f13VarY.n;
        int i = f13VarY.p;
        for (int i2 = 0; i2 < i; i2++) {
            if2 if2Var = ((c72) objArr[i2]).R.q;
            if2Var.getClass();
            if2Var.w = a72.p;
        }
        c72 c72Var = f63Var.H;
        ef2.p0(this, c72Var.I.a(this, c72Var.m(), j));
        return this;
    }
}
