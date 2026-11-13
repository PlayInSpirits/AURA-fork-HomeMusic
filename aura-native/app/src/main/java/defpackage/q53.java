package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class q53 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public q53(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q53)) {
            return false;
        }
        q53 q53Var = (q53) obj;
        return this.a == q53Var.a && this.b == q53Var.b && this.c == q53Var.c && this.d == q53Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + xa3.c(xa3.c(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "NetworkState(isConnected=" + this.a + ", isValidated=" + this.b + ", isMetered=" + this.c + ", isNotRoaming=" + this.d + ')';
    }
}
