package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class te3 extends bf3 {
    public final float c;

    public te3(float r2) {
        super(3);
        this.c = r2;
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof te3) == true) goto L9;
        return false;
    L9:
        if (Float.compare(this.c, ((te3) r4).c) == 0) goto L11;
        return false;
    L11:
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.c);
    }

    public final String toString() {
        return "RelativeHorizontalTo(dx=" + this.c + ")";
    }
}
