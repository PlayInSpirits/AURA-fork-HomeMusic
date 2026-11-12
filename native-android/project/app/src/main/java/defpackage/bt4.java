package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bt4 {
    public static final ct4[] b = {new ct4(0), new ct4(4294967296L), new ct4(8589934592L)};
    public static final long c = su3.z(0, Float.NaN);
    public final long a;

    public /* synthetic */ bt4(long j) {
        this.a = j;
    }

    public static final boolean a(long j, long j2) {
        return j == j2;
    }

    public static final long b(long j) {
        return b[(int) ((j & 1095216660480L) >>> 32)].a;
    }

    public static final float c(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static String d(long j) {
        long jB = b(j);
        if (ct4.a(jB, 0L)) {
            return "Unspecified";
        }
        if (ct4.a(jB, 4294967296L)) {
            return c(j) + ".sp";
        }
        if (!ct4.a(jB, 8589934592L)) {
            return "Invalid";
        }
        return c(j) + ".em";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bt4) {
            return this.a == ((bt4) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return d(this.a);
    }
}
