package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ne3 extends bf3 {
    public final float c;
    public final float d;

    public ne3(float f, float f2) {
        super(3);
        this.c = f;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ne3)) {
            return false;
        }
        ne3 ne3Var = (ne3) obj;
        return Float.compare(this.c, ne3Var.c) == 0 && Float.compare(this.d, ne3Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + (Float.hashCode(this.c) * 31);
    }

    public final String toString() {
        return xa3.f("MoveTo(x=", this.c, ", y=", this.d, ")");
    }
}
