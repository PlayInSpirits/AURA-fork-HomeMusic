package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class z71 {
    public final float a;
    public final float b;
    public final long c;

    public z71(float r1, float r2, long r3) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
    }

    public final boolean equals(Object r6) {
        if (this != r6) goto L6;
        return true;
    L6:
        if ((r6 instanceof z71) == true) goto L8;
        return false;
    L8:
        z71 r7 = (z71) r6;
        if (Float.compare(this.a, r7.a) == 0) goto L12;
        return false;
    L12:
        if (Float.compare(this.b, r7.b) == 0) goto L15;
        return false;
    L15:
        if (this.c == r7.c) goto L17;
        return false;
    L17:
        return true;
    }

    public final int hashCode() {
        int r0 = b11.d(Float.hashCode(this.a) * 31, this.b, 31);
        return Long.hashCode(this.c) + r0;
    }

    public final String toString() {
        return b11.p(b11.r("FlingInfo(initialVelocity=", this.a, ", distance=", this.b, ", duration="), this.c, ")");
    }
}
