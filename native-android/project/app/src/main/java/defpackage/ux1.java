package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ux1 implements m84 {
    public final te2 a;
    public final te2 b;
    public long c;

    public ux1(long j, long[] jArr, long[] jArr2) {
        rr2.l(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length <= 0 || jArr2[0] <= 0) {
            this.a = new te2(length);
            this.b = new te2(length);
        } else {
            int i = length + 1;
            te2 te2Var = new te2(i);
            this.a = te2Var;
            te2 te2Var2 = new te2(i);
            this.b = te2Var2;
            te2Var.a(0L);
            te2Var2.a(0L);
        }
        this.a.b(jArr);
        this.b.b(jArr2);
        this.c = j;
    }

    @Override // defpackage.m84
    public final boolean b() {
        return this.b.b > 0;
    }

    @Override // defpackage.m84
    public final l84 e(long j) {
        te2 te2Var = this.b;
        if (te2Var.b == 0) {
            o84 o84Var = o84.c;
            return new l84(o84Var, o84Var);
        }
        int iC = f35.c(te2Var, j);
        long jD = te2Var.d(iC);
        te2 te2Var2 = this.a;
        o84 o84Var2 = new o84(jD, te2Var2.d(iC));
        if (jD == j || iC == te2Var.b - 1) {
            return new l84(o84Var2, o84Var2);
        }
        int i = iC + 1;
        return new l84(o84Var2, new o84(te2Var.d(i), te2Var2.d(i)));
    }

    @Override // defpackage.m84
    public final long g() {
        return this.c;
    }
}
