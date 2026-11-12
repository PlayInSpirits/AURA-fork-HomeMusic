package defpackage;

import android.util.Pair;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qw2 implements q84 {
    public final long[] a;
    public final long[] b;
    public final long c;

    public qw2(long j, long[] jArr, long[] jArr2) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j == -9223372036854775807L ? f35.Q(jArr2[jArr2.length - 1]) : j;
    }

    public static Pair h(long j, long[] jArr, long[] jArr2) {
        int iF = f35.f(jArr, j, true);
        long j2 = jArr[iF];
        long j3 = jArr2[iF];
        int i = iF + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((j4 == j2 ? 0.0d : (j - j2) / (j4 - j2)) * (jArr2[i] - j3))) + j3));
    }

    @Override // defpackage.q84
    public final long a() {
        return -1L;
    }

    @Override // defpackage.m84
    public final boolean b() {
        return true;
    }

    @Override // defpackage.q84
    public final long c(long j) {
        return f35.Q(((Long) h(j, this.a, this.b).second).longValue());
    }

    @Override // defpackage.m84
    public final l84 e(long j) {
        Pair pairH = h(f35.i0(f35.k(j, 0L, this.c)), this.b, this.a);
        o84 o84Var = new o84(f35.Q(((Long) pairH.first).longValue()), ((Long) pairH.second).longValue());
        return new l84(o84Var, o84Var);
    }

    @Override // defpackage.q84
    public final int f() {
        return -2147483647;
    }

    @Override // defpackage.m84
    public final long g() {
        return this.c;
    }
}
