package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class gz1 {
    public static final long a = 0;
    public static final /* synthetic */ int b = 0;

    static {
        a = a(Float.NaN, Float.NaN);
    }

    public static long a(float r4, float r5) {
        long r0 = Float.floatToRawIntBits(r4);
        return (((long) Float.floatToRawIntBits(r5)) & 4294967295L) | (r0 << 32);
    }

    public static String b(long r3) {
        return xa3.f("InlineDensity(density=", Float.intBitsToFloat((int) (r3 >> 32)), ", fontScale=", Float.intBitsToFloat((int) (r3 & 4294967295L)), ")");
    }
}
