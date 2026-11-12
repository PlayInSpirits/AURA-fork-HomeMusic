package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class s11 {
    public final String a;
    public final boolean b;

    public s11(String str, boolean z) {
        str.getClass();
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s11)) {
            return false;
        }
        s11 s11Var = (s11) obj;
        return h12.c(this.a, s11Var.a) && this.b == s11Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Entry(mediaId=" + this.a + ", rec=" + this.b + ")";
    }
}
