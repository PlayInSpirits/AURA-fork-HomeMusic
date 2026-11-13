package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class bk4 {
    public bk4() {
        super();
    }

    public float a;
    public double b;

    public final long a(float f, float f2, long j) {
        float f3 = f - this.a;
        double d = j / 1000.0d;
        double d2 = this.b;
        double d3 = f3;
        double d4 = (d2 * d3) + f2;
        double d5 = (-d2) * d;
        double d6 = (d * d4) + d3;
        double exp = Math.exp(d5) * d6;
        double exp2 = (Math.exp(d5) * d4) + (Math.exp(d5) * d6 * (-this.b));
        return (Float.floatToRawIntBits((float) exp2) & 4294967295L) | (Float.floatToRawIntBits((float) (exp + this.a)) << 32);
    }
}
