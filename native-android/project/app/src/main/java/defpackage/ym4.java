package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ym4 extends q05 {
    public final float d;
    public final float e;
    public final int f;
    public final int g;

    public ym4(float r1, float r2, int r3, int r4) {
        this.d = r1;
        this.e = r2;
        this.f = r3;
        this.g = r4;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof ym4) == true) goto L8;
        return false;
    L8:
        ym4 r6 = (ym4) r5;
        float r1 = r6.d;
        if (this.d == r1) goto L11;
    L17:
        return false;
    L11:
        if (this.e != r6.e) goto L17;
        if (this.f != r6.f) goto L17;
        if (this.g != r6.g) goto L17;
        return true;
    }

    public final int hashCode() {
        int r0 = b11.d(Float.hashCode(this.d) * 31, this.e, 31);
        int r1 = f34.d(this.f, r0, 31);
        return f34.d(this.g, r1, 31);
    }

    public final String toString() {
        String r0 = "Unknown";
        int r4 = this.f;
        if (r4 != 0) goto L5;
        String r5 = "Butt";
    L10:
        int r6 = this.g;
        if (r6 != 0) goto L13;
        r0 = "Miter";
    L17:
        StringBuilder r7 = b11.r("Stroke(width=", this.d, ", miter=", this.e, ", cap=");
        r7.append(r5);
        r7.append(", join=");
        r7.append(r0);
        r7.append(", pathEffect=null)");
        return r7.toString();
    L13:
        if (r6 != 1) goto L15;
        r0 = "Round";
        goto L17
    L15:
        if (r6 != 2) goto L17;
        r0 = "Bevel";
        goto L17
    L5:
        if (r4 != 1) goto L7;
        r5 = "Round";
        goto L10
    L7:
        if (r4 != 2) goto L9;
        r5 = "Square";
        goto L10
    L9:
        r5 = "Unknown";
        goto L10
    }
}
