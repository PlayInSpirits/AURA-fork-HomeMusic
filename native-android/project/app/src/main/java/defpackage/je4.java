package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class je4 {
    public final Object a;
    public final long b;
    public final z5 c;
    public final boolean d;

    public je4(ie4 ie4Var) {
        this.a = ie4Var.a;
        this.b = ie4Var.b;
        this.c = ie4Var.c;
        this.d = ie4Var.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof je4)) {
            return false;
        }
        je4 je4Var = (je4) obj;
        return this.a.equals(je4Var.a) && this.b == je4Var.b && this.c.equals(je4Var.c) && this.d == je4Var.d;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() + 217) * 31;
        long j = this.b;
        return ((this.c.hashCode() + ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31)) * 31) + (this.d ? 1 : 0);
    }
}
