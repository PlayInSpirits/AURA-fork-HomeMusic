package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class o84 {
    public static final o84 c = new o84(0, 0);
    public final long a;
    public final long b;

    public o84(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o84.class == obj.getClass()) {
            o84 o84Var = (o84) obj;
            if (this.a == o84Var.a && this.b == o84Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[timeUs=");
        sb.append(this.a);
        sb.append(", position=");
        return b11.p(sb, this.b, "]");
    }
}
