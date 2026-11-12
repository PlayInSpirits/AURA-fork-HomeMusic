package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bt4 {
    public static final ct4[] b = null;
    public static final long c = 0;
    public final long a;

    static {
        b = new ct4[]{new ct4(0), new ct4(4294967296L), new ct4(8589934592L)};
        c = su3.z(0, Float.NaN);
    }

    public /* synthetic */ bt4(long r1) {
        this.a = r1;
    }

    public static final boolean a(long r0, long r2) {
        if (r0 != r2) goto L6;
        return true;
    L6:
        return false;
    }

    public static final long b(long r2) {
        ct4[] r3 = b;
        return r3[(int) ((r2 & 1095216660480L) >>> 32)].a;
    }

    public static final float c(long r2) {
        return Float.intBitsToFloat((int) (r2 & 4294967295L));
    }

    public static String d(long r4) {
        long r0 = b(r4);
        if (ct4.a(r0, 0) == false) goto L7;
        return "Unspecified";
    L7:
        if (ct4.a(r0, 4294967296L) == false) goto L11;
        return c(r4) + ".sp";
    L11:
        if (ct4.a(r0, 8589934592L) == true) goto L13;
        return "Invalid";
    L13:
        return c(r4) + ".em";
    }

    public final boolean equals(Object r3) {
        if ((r3 instanceof bt4) == false) goto L11;
        long r0 = ((bt4) r3).a;
        if (this.a == r0) goto L9;
        return false;
    L9:
        return true;
    L11:
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return d(this.a);
    }
}
