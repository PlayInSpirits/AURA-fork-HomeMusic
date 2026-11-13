package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class yx0 {
    public yx0() {
        super();
    }

    public float a;
    public float b;

    public z71 a(float f) {
        double b = b(f);
        double d = a81.a;
        double d2 = d - 1.0d;
        return new z71(f, (float) (Math.exp((d / d2) * b) * this.a * this.b), (long) (Math.exp(b / d2) * 1000.0d));
    }

    public double b(float f) {
        float[] fArr = yb.a;
        return Math.log((Math.abs(f) * 0.35f) / (this.a * this.b));
    }
}
