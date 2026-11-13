package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class s62 {
    public final int a;
    public final int b;
    public final boolean c;

    public s62(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s62)) {
            return false;
        }
        s62 s62Var = (s62) obj;
        return this.a == s62Var.a && this.b == s62Var.b && this.c == s62Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + f34.d(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder t = b11.t("BidiRun(start=", ", end=", this.a, this.b, ", isRtl=");
        t.append(this.c);
        t.append(")");
        return t.toString();
    }
}
