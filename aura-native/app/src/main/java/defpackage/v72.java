package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class v72 {
    public final int a;
    public final int b;

    public v72(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (!(i >= 0)) {
            fz1.a("negative start index");
        }
        if (i2 >= i) {
            return;
        }
        fz1.a("end index greater than start");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v72)) {
            return false;
        }
        v72 v72Var = (v72) obj;
        return this.a == v72Var.a && this.b == v72Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return b11.n("Interval(start=", ", end=", this.a, this.b, ")");
    }
}
