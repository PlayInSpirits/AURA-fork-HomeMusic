package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fs1 {
    public final int a;
    public final String b;

    public fs1(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fs1)) {
            return false;
        }
        fs1 fs1Var = (fs1) obj;
        return this.a == fs1Var.a && this.b.equals(fs1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Section(titleRes=" + this.a + ", root=" + this.b + ")";
    }
}
