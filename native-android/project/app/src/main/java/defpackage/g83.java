package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class g83 {
    public final long a;

    public /* synthetic */ g83(long r1) {
        this.a = r1;
    }

    public static long a(int r7, long r8) {
        float r2 = 0.0f;
        if ((r7 & 1) == 0) goto L5;
        float r0 = Float.intBitsToFloat((int) (r8 >> 32));
    L7:
        if ((r7 & 2) == 0) goto L10;
        r2 = Float.intBitsToFloat((int) (r8 & 4294967295L));
    L10:
        return (Float.floatToRawIntBits(r0) << 32) | (((long) Float.floatToRawIntBits(r2)) & 4294967295L);
    L5:
        r0 = 0.0f;
        goto L7
    }

    public static final boolean b(long r0, long r2) {
        if (r0 != r2) goto L6;
        return true;
    L6:
        return false;
    }

    public static final float c(long r3) {
        float r0 = Float.intBitsToFloat((int) (r3 >> 32));
        float r4 = Float.intBitsToFloat((int) (r3 & 4294967295L));
        return (float) Math.sqrt((r4 * r4) + (r0 * r0));
    }

    public static final long d(long r6, long r8) {
        float r1 = Float.intBitsToFloat((int) (r6 >> 32)) - Float.intBitsToFloat((int) (r8 >> 32));
        float r7 = Float.intBitsToFloat((int) (r6 & 4294967295L)) - Float.intBitsToFloat((int) (r8 & 4294967295L));
        return (Float.floatToRawIntBits(r1) << 32) | (Float.floatToRawIntBits(r7) & 4294967295L);
    }

    public static final long e(long r5, long r7) {
        float r2 = Float.intBitsToFloat((int) (r7 >> 32)) + Float.intBitsToFloat((int) (r5 >> 32));
        float r6 = Float.intBitsToFloat((int) (r7 & 4294967295L)) + Float.intBitsToFloat((int) (r5 & 4294967295L));
        long r8 = Float.floatToRawIntBits(r2);
        return (((long) Float.floatToRawIntBits(r6)) & 4294967295L) | (r8 << 32);
    }

    public static final long f(long r6, float r8) {
        float r1 = Float.intBitsToFloat((int) (r6 >> 32)) * r8;
        float r7 = Float.intBitsToFloat((int) (r6 & 4294967295L)) * r8;
        return (Float.floatToRawIntBits(r1) << 32) | (Float.floatToRawIntBits(r7) & 4294967295L);
    }

    public static String g(long r4) {
        if ((9223372034707292159L & r4) != 9205357640488583168L) goto L5;
        return "Offset.Unspecified";
    L5:
        return f34.h("Offset(", gh0.F(Float.intBitsToFloat((int) (r4 >> 32))), ", ", gh0.F(Float.intBitsToFloat((int) (r4 & 4294967295L))), ")");
    }

    public final boolean equals(Object r3) {
        if ((r3 instanceof g83) == false) goto L11;
        long r0 = ((g83) r3).a;
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
        return g(this.a);
    }
}
