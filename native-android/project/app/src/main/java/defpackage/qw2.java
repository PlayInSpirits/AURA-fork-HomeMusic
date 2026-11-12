package defpackage;

import android.util.Pair;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qw2 implements q84 {
    public final long[] a;
    public final long[] b;
    public final long c;

    public qw2(long r3, long[] r5, long[] r6) {
        this.a = r5;
        this.b = r6;
        if (r3 != (-9223372036854775807L)) goto L6;
        r3 = f35.Q(r6[r6.length - 1]);
    L6:
        this.c = r3;
    }

    public static Pair h(long r10, long[] r12, long[] r13) {
        int r1 = f35.f(r12, r10, true);
        long r2 = r12[r1];
        long r4 = r13[r1];
        int r3 = r1 + 1;
        if (r3 == r12.length) goto L5;
        long r6 = r12[r3];
        long r14 = r13[r3];
        if (r6 != r2) goto L9;
        double r0 = 0.0d;
    L11:
        return Pair.create(Long.valueOf(r10), Long.valueOf(((long) (r0 * (r14 - r4))) + r4));
    L9:
        r0 = (r10 - r2) / (r6 - r2);
        goto L11
    L5:
        return Pair.create(Long.valueOf(r2), Long.valueOf(r4));
    }

    @Override // defpackage.q84
    public final long a() {
        return -1;
    }

    @Override // defpackage.m84
    public final boolean b() {
        return true;
    }

    @Override // defpackage.q84
    public final long c(long r2) {
        return f35.Q(((Long) h(r2, this.a, this.b).second).longValue());
    }

    @Override // defpackage.m84
    public final l84 e(long r7) {
        Pair r6 = h(f35.i0(f35.k(r7, 0, this.c)), this.b, this.a);
        o84 r2 = new o84(f35.Q(((Long) r6.first).longValue()), ((Long) r6.second).longValue());
        return new l84(r2, r2);
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
