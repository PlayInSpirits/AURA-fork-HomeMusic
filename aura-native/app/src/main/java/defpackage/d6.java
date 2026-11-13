package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class d6 {
    public final long a;
    public final long b;

    public d6(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d6)) {
            return false;
        }
        d6 d6Var = (d6) obj;
        return this.a == d6Var.a && this.b == d6Var.b;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
