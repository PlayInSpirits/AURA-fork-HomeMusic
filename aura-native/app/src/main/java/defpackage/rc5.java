package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class rc5 {
    public final String a;
    public final int b;

    public rc5(int i, String str) {
        str.getClass();
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rc5)) {
            return false;
        }
        rc5 rc5Var = (rc5) obj;
        return h12.c(this.a, rc5Var.a) && this.b == rc5Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WorkGenerationalId(workSpecId=" + this.a + ", generation=" + this.b + ')';
    }
}
