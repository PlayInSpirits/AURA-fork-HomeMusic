package defpackage;

import java.math.RoundingMode;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class e95 implements m84 {
    public final uu a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;

    public e95(uu uuVar, int i, long j, long j2) {
        this.a = uuVar;
        this.b = i;
        this.c = j;
        long j3 = (j2 - j) / uuVar.p;
        this.d = j3;
        this.e = h(j3);
    }

    @Override // defpackage.m84
    public final boolean b() {
        return true;
    }

    @Override // defpackage.m84
    public final l84 e(long j) {
        uu uuVar = this.a;
        long j2 = this.d - 1;
        long k = f35.k((uuVar.o * j) / (this.b * 1000000), 0L, j2);
        int i = uuVar.p;
        long j3 = this.c;
        long h = h(k);
        o84 o84Var = new o84(h, (i * k) + j3);
        if (h >= j || k == j2) {
            return new l84(o84Var, o84Var);
        }
        long j4 = k + 1;
        return new l84(o84Var, new o84(h(j4), (i * j4) + j3));
    }

    @Override // defpackage.m84
    public final long g() {
        return this.e;
    }

    public final long h(long j) {
        long j2 = j * this.b;
        long j3 = this.a.o;
        String str = f35.a;
        return f35.a0(j2, 1000000L, j3, RoundingMode.DOWN);
    }
}
