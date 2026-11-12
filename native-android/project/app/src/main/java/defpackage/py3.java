package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class py3 extends e35 {
    public final e35 p;
    public final int q;

    public py3(e35 e35Var, int i) {
        this.p = e35Var;
        this.q = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof py3)) {
            return false;
        }
        py3 py3Var = (py3) obj;
        return py3Var.p.equals(this.p) && py3Var.q == this.q;
    }

    public final int hashCode() {
        return this.p.hashCode() + (this.q * 31);
    }
}
