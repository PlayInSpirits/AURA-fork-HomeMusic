package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sg2 {
    public final String a;
    public final j02 b;

    public sg2(String str, j02 j02Var) {
        this.a = str;
        this.b = j02Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sg2)) {
            return false;
        }
        sg2 sg2Var = (sg2) obj;
        return this.a.equals(sg2Var.a) && this.b.equals(sg2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.a + ", range=" + this.b + ')';
    }
}
