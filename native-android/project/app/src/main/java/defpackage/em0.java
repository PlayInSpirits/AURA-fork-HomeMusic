package defpackage;

import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class em0 implements m84 {
    public final /* synthetic */ fm0 a;

    public em0(fm0 r1) {
        this.a = r1;
    }

    @Override // defpackage.m84
    public final boolean b() {
        return true;
    }

    @Override // defpackage.m84
    public final l84 e(long r13) {
        fm0 r12 = this.a;
        long r0 = (((long) r12.q.i) * r13) / 1000000;
        long r2 = r12.o;
        BigInteger r1 = BigInteger.valueOf(r0);
        long r4 = r12.p;
        o84 r3 = new o84(r13, f35.k((r1.multiply(BigInteger.valueOf(r4 - r2)).divide(BigInteger.valueOf(r12.s)).longValue() + r2) - 30000, r12.o, r4 - 1));
        return new l84(r3, r3);
    }

    @Override // defpackage.m84
    public final long g() {
        fm0 r5 = this.a;
        im4 r0 = r5.q;
        return (r5.s * 1000000) / ((long) r0.i);
    }
}
