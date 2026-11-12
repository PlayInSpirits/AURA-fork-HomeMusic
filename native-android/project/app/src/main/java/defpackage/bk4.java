package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bk4 {
    public float a;
    public double b;

    public final long a(float f, float f2, long j) {
        float f3 = f - this.a;
        double d = j / 1000.0d;
        double d2 = this.b;
        double d3 = f3;
        double d4 = (d2 * d3) + ((double) f2);
        double d5 = (-d2) * d;
        double d6 = (d * d4) + d3;
        double dExp = Math.exp(d5) * d6;
        return (((long) Float.floatToRawIntBits((float) ((Math.exp(d5) * d4) + (Math.exp(d5) * d6 * (-this.b))))) & 4294967295L) | (Float.floatToRawIntBits((float) (dExp + ((double) this.a))) << 32);
    }
}
