package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class oe3 extends bf3 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public oe3(float r2, float r3, float r4, float r5) {
        super(1);
        this.c = r2;
        this.d = r3;
        this.e = r4;
        this.f = r5;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof oe3) == true) goto L8;
        return false;
    L8:
        oe3 r6 = (oe3) r5;
        if (Float.compare(this.c, r6.c) == 0) goto L12;
        return false;
    L12:
        if (Float.compare(this.d, r6.d) == 0) goto L15;
        return false;
    L15:
        if (Float.compare(this.e, r6.e) == 0) goto L18;
        return false;
    L18:
        if (Float.compare(this.f, r6.f) == 0) goto L20;
        return false;
    L20:
        return true;
    }

    public final int hashCode() {
        int r0 = b11.d(b11.d(Float.hashCode(this.c) * 31, this.d, 31), this.e, 31);
        return Float.hashCode(this.f) + r0;
    }

    public final String toString() {
        StringBuilder r0 = b11.r("QuadTo(x1=", this.c, ", y1=", this.d, ", x2=");
        r0.append(this.e);
        r0.append(", y2=");
        r0.append(this.f);
        r0.append(")");
        return r0.toString();
    }
}
