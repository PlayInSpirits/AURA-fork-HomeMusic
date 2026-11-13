package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class qb3 {
    public final long a;
    public final ac3 b;

    public qb3() {
        long c = e35.c(4284900966L);
        ac3 b = q05.b(3);
        this.a = c;
        this.b = b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!qb3.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        qb3 qb3Var = (qb3) obj;
        return x40.c(this.a, qb3Var.a) && h12.c(this.b, qb3Var.b);
    }

    public final int hashCode() {
        int i = x40.h;
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "OverscrollConfiguration(glowColor=" + x40.h(this.a) + ", drawPadding=" + this.b + ")";
    }
}
