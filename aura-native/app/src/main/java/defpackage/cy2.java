package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class cy2 {
    public final long a;
    public final long b;
    public final boolean c;

    public cy2(long j, long j2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    public final cy2 a(cy2 cy2Var) {
        return new cy2(g83.e(this.a, cy2Var.a), Math.max(this.b, cy2Var.b), this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cy2)) {
            return false;
        }
        cy2 cy2Var = (cy2) obj;
        return g83.b(this.a, cy2Var.a) && this.b == cy2Var.b && this.c == cy2Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xa3.b(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "MouseWheelScrollDelta(value=" + g83.g(this.a) + ", timeMillis=" + this.b + ", shouldApplyImmediately=" + this.c + ")";
    }
}
