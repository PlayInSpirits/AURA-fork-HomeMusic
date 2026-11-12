package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class k45 {
    public final long a;

    public /* synthetic */ k45(long r1) {
        this.a = r1;
    }

    public static long a(long r4, float r6, float r7, int r8) {
        if ((r8 & 1) == 0) goto L6;
        r6 = Float.intBitsToFloat((int) (r4 >> 32));
    L6:
        if ((r8 & 2) == 0) goto L9;
        r7 = Float.intBitsToFloat((int) (r4 & 4294967295L));
    L9:
        return (Float.floatToRawIntBits(r6) << 32) | (((long) Float.floatToRawIntBits(r7)) & 4294967295L);
    }

    public static final float b(long r1) {
        return Float.intBitsToFloat((int) (r1 >> 32));
    }

    public static final float c(long r2) {
        return Float.intBitsToFloat((int) (r2 & 4294967295L));
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

    public static String f(long r3) {
        return xa3.f("(", b(r3), ", ", c(r3), ") px/sec");
    }

    public final boolean equals(Object r3) {
        if ((r3 instanceof k45) == false) goto L11;
        long r0 = ((k45) r3).a;
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
        return f(this.a);
    }
}
