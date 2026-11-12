package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class cd5 {
    public String a;
    public int b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cd5)) {
            return false;
        }
        cd5 cd5Var = (cd5) obj;
        return h12.c(this.a, cd5Var.a) && this.b == cd5Var.b;
    }

    public final int hashCode() {
        return xa3.w(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "IdAndState(id=" + this.a + ", state=" + f34.q(this.b) + ')';
    }
}
