package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xb {
    public final float a;
    public final float b;

    public xb(float r1, float r2) {
        this.a = r1;
        this.b = r2;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof xb) == true) goto L8;
        return false;
    L8:
        xb r6 = (xb) r5;
        if (Float.compare(this.a, r6.a) == 0) goto L12;
        return false;
    L12:
        if (Float.compare(this.b, r6.b) == 0) goto L14;
        return false;
    L14:
        return true;
    }

    public final int hashCode() {
        int r0 = Float.hashCode(this.a) * 31;
        return Float.hashCode(this.b) + r0;
    }

    public final String toString() {
        return xa3.f("FlingResult(distanceCoefficient=", this.a, ", velocityCoefficient=", this.b, ")");
    }
}
