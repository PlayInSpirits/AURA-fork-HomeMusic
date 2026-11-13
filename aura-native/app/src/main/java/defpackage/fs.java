package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class fs {
    public final float a;

    public fs(float f) {
        this.a = f;
    }

    public final int a(int i, int i2, r62 r62Var) {
        float f = (i2 - i) / 2.0f;
        r62 r62Var2 = r62.n;
        float f2 = this.a;
        if (r62Var != r62Var2) {
            f2 *= -1.0f;
        }
        return Math.round((1.0f + f2) * f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fs) && Float.compare(this.a, ((fs) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "Horizontal(bias=" + this.a + ")";
    }
}
