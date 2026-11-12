package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bk4 {
    public float a;
    public double b;

    public final long a(float r7, float r8, long r9) {
        float r10 = r7 - this.a;
        double r11 = r9 / 1000.0d;
        double r0 = this.b;
        double r12 = r10;
        double r4 = (r0 * r12) + ((double) r8);
        double r1 = (-r0) * r11;
        double r13 = (r11 * r4) + r12;
        double r14 = Math.exp(r1) * r13;
        double r15 = (Math.exp(r1) * r4) + ((Math.exp(r1) * r13) * (-this.b));
        long r16 = Float.floatToRawIntBits((float) (r14 + ((double) this.a)));
        return (((long) Float.floatToRawIntBits((float) r15)) & 4294967295L) | (r16 << 32);
    }
}
