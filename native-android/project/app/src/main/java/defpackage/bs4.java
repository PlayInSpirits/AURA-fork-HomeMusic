package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bs4 {
    public static final bs4 c = null;
    public final float a;
    public final float b;

    static {
        c = new bs4(1.0f, 0.0f);
    }

    public bs4(float r1, float r2) {
        this.a = r1;
        this.b = r2;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof bs4) == true) goto L8;
        return false;
    L8:
        bs4 r6 = (bs4) r5;
        float r1 = r6.a;
        if (this.a == r1) goto L11;
    L13:
        return false;
    L11:
        if (this.b != r6.b) goto L13;
        return true;
    }

    public final int hashCode() {
        int r0 = Float.hashCode(this.a) * 31;
        return Float.hashCode(this.b) + r0;
    }

    public final String toString() {
        return xa3.f("TextGeometricTransform(scaleX=", this.a, ", skewX=", this.b, ")");
    }
}
