package defpackage;

import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class em0 implements m84 {
    public final /* synthetic */ fm0 a;

    public em0(fm0 fm0Var) {
        this.a = fm0Var;
    }

    @Override // defpackage.m84
    public final boolean b() {
        return true;
    }

    @Override // defpackage.m84
    public final l84 e(long j) {
        fm0 fm0Var = this.a;
        long j2 = (((long) fm0Var.q.i) * j) / 1000000;
        long j3 = fm0Var.o;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(j2);
        long j4 = fm0Var.p;
        o84 o84Var = new o84(j, f35.k((bigIntegerValueOf.multiply(BigInteger.valueOf(j4 - j3)).divide(BigInteger.valueOf(fm0Var.s)).longValue() + j3) - 30000, fm0Var.o, j4 - 1));
        return new l84(o84Var, o84Var);
    }

    @Override // defpackage.m84
    public final long g() {
        fm0 fm0Var = this.a;
        return (fm0Var.s * 1000000) / ((long) fm0Var.q.i);
    }
}
