package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class mx0 implements Comparable {
    public static final om0 n = new om0(13);
    public static final long o = e35.u(4611686018427387903L);
    public static final long p = e35.u(-4611686018427387903L);

    public static final long a(long j, long j2) {
        long j3 = j2 / 1000000;
        long jI = e35.i(j, j3);
        if (-4611686018426L > jI || jI >= 4611686018427L) {
            return e35.u(jI);
        }
        long j4 = ((jI * 1000000) + (j2 - (j3 * 1000000))) << 1;
        int i = nx0.a;
        return j4;
    }

    public static final long b(long j, long j2) {
        int i = ((int) j) & 1;
        if (i != (((int) j2) & 1)) {
            return i == 1 ? a(j >> 1, j2 >> 1) : a(j2 >> 1, j >> 1);
        }
        if (i == 0) {
            long j3 = (j >> 1) + (j2 >> 1);
            if (-4611686018426999999L > j3 || j3 >= 4611686018427000000L) {
                return e35.u(j3 / 1000000);
            }
            long j4 = j3 << 1;
            int i2 = nx0.a;
            return j4;
        }
        long jI = e35.i(j >> 1, j2 >> 1);
        if (jI == 9223372036854759646L) {
            kf2.n("Summing infinite durations of different signs yields an undefined result.");
            return 0L;
        }
        if (jI == 4611686018427387903L || jI == -4611686018427387903L) {
            return e35.u(jI);
        }
        if (-4611686018426L > jI || jI >= 4611686018427L) {
            return e35.u(gb.n(jI, -4611686018427387903L, 4611686018427387903L));
        }
        long j5 = (jI * 1000000) << 1;
        int i3 = nx0.a;
        return j5;
    }

    public static final long c(long j, ox0 ox0Var) {
        if (j == o) {
            return Long.MAX_VALUE;
        }
        if (j == p) {
            return Long.MIN_VALUE;
        }
        return ox0Var.n.convert(j >> 1, ((((int) j) & 1) == 0 ? ox0.NANOSECONDS : ox0.MILLISECONDS).n);
    }
}
