package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ve3 extends bf3 {
    public final float c;
    public final float d;

    public ve3(float r2, float r3) {
        super(3);
        this.c = r2;
        this.d = r3;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof ve3) == true) goto L8;
        return false;
    L8:
        ve3 r6 = (ve3) r5;
        if (Float.compare(this.c, r6.c) == 0) goto L12;
        return false;
    L12:
        if (Float.compare(this.d, r6.d) == 0) goto L14;
        return false;
    L14:
        return true;
    }

    public final int hashCode() {
        int r0 = Float.hashCode(this.c) * 31;
        return Float.hashCode(this.d) + r0;
    }

    public final String toString() {
        return xa3.f("RelativeMoveTo(dx=", this.c, ", dy=", this.d, ")");
    }
}
