package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yx0 {
    public float a;
    public float b;

    public z71 a(float r10) {
        double r0 = b(r10);
        double r2 = a81.a;
        double r4 = r2 - 1.0d;
        return new z71(r10, (float) (Math.exp((r2 / r4) * r0) * (this.a * this.b)), (long) (Math.exp(r0 / r4) * 1000.0d));
    }

    public double b(float r3) {
        float[] r0 = yb.a;
        float r1 = this.a * this.b;
        return Math.log(((double) (Math.abs(r3) * 0.35f)) / ((double) r1));
    }
}
