package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xb4 {
    public static final xb4 d = new xb4(e35.c(4278190080L), 0, 0.0f);
    public final long a;
    public final long b;
    public final float c;

    public xb4(long j, long j2, float f) {
        this.a = j;
        this.b = j2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xb4)) {
            return false;
        }
        xb4 xb4Var = (xb4) obj;
        return x40.c(this.a, xb4Var.a) && g83.b(this.b, xb4Var.b) && this.c == xb4Var.c;
    }

    public final int hashCode() {
        int i = x40.h;
        return Float.hashCode(this.c) + xa3.b(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbU = b11.u("Shadow(color=", x40.h(this.a), ", offset=", g83.g(this.b), ", blurRadius=");
        sbU.append(this.c);
        sbU.append(")");
        return sbU.toString();
    }
}
