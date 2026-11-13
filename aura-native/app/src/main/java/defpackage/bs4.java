package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class bs4 {
    public static final bs4 c = new bs4(1.0f, 0.0f);
    public final float a;
    public final float b;

    public bs4(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bs4)) {
            return false;
        }
        bs4 bs4Var = (bs4) obj;
        return this.a == bs4Var.a && this.b == bs4Var.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return xa3.f("TextGeometricTransform(scaleX=", this.a, ", skewX=", this.b, ")");
    }
}
