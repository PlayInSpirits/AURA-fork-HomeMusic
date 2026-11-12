package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ie3 extends bf3 {
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final float h;
    public final float i;

    public ie3(float r2, float r3, float r4, boolean r5, boolean r6, float r7, float r8) {
        super(3);
        this.c = r2;
        this.d = r3;
        this.e = r4;
        this.f = r5;
        this.g = r6;
        this.h = r7;
        this.i = r8;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof ie3) == true) goto L8;
        return false;
    L8:
        ie3 r6 = (ie3) r5;
        if (Float.compare(this.c, r6.c) == 0) goto L12;
        return false;
    L12:
        if (Float.compare(this.d, r6.d) == 0) goto L15;
        return false;
    L15:
        if (Float.compare(this.e, r6.e) == 0) goto L18;
        return false;
    L18:
        if (this.f == r6.f) goto L21;
        return false;
    L21:
        if (this.g == r6.g) goto L24;
        return false;
    L24:
        if (Float.compare(this.h, r6.h) == 0) goto L27;
        return false;
    L27:
        if (Float.compare(this.i, r6.i) == 0) goto L29;
        return false;
    L29:
        return true;
    }

    public final int hashCode() {
        int r0 = b11.d(xa3.c(xa3.c(b11.d(b11.d(Float.hashCode(this.c) * 31, this.d, 31), this.e, 31), 31, this.f), 31, this.g), this.h, 31);
        return Float.hashCode(this.i) + r0;
    }

    public final String toString() {
        StringBuilder r0 = b11.r("ArcTo(horizontalEllipseRadius=", this.c, ", verticalEllipseRadius=", this.d, ", theta=");
        r0.append(this.e);
        r0.append(", isMoreThanHalf=");
        r0.append(this.f);
        r0.append(", isPositiveArc=");
        r0.append(this.g);
        r0.append(", arcStartX=");
        r0.append(this.h);
        r0.append(", arcStartY=");
        r0.append(this.i);
        r0.append(")");
        return r0.toString();
    }
}
