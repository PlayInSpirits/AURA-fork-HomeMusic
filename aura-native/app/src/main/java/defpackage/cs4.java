package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class cs4 {
    public static final cs4 c = new cs4(su3.v(0), su3.v(0));
    public final long a;
    public final long b;

    public cs4(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cs4)) {
            return false;
        }
        cs4 cs4Var = (cs4) obj;
        return bt4.a(this.a, cs4Var.a) && bt4.a(this.b, cs4Var.b);
    }

    public final int hashCode() {
        ct4[] ct4VarArr = bt4.b;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return f34.h("TextIndent(firstLine=", bt4.d(this.a), ", restLine=", bt4.d(this.b), ")");
    }
}
