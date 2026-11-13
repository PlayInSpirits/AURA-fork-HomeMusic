package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class d80 {
    public final int a;
    public final Integer b;

    public d80(int i, gb gbVar, Integer num) {
        this.a = i;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d80)) {
            return false;
        }
        d80 d80Var = (d80) obj;
        return this.a == d80Var.a && h12.c(null, null) && h12.c(this.b, d80Var.b);
    }

    public final int hashCode() {
        int hashCode = ((Integer.hashCode(this.a) * 31) + 0) * 31;
        Integer num = this.b;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "ComposeStackTraceFrame(groupKey=" + this.a + ", sourceInfo=" + ((Object) null) + ", groupOffset=" + this.b + ")";
    }
}
