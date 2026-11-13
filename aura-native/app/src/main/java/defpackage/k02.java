package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class k02 {
    public static final k02 e = new k02(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public k02(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k02)) {
            return false;
        }
        k02 k02Var = (k02) obj;
        return this.a == k02Var.a && this.b == k02Var.b && this.c == k02Var.c && this.d == k02Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + f34.d(this.c, f34.d(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder t = b11.t("IntRect.fromLTRB(", ", ", this.a, this.b, ", ");
        t.append(this.c);
        t.append(", ");
        t.append(this.d);
        t.append(")");
        return t.toString();
    }
}
