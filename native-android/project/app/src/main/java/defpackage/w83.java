package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class w83 {
    public final v83 a;
    public final ba2 b;

    public w83(ba2 ba2Var, v83 v83Var) {
        v83Var.getClass();
        this.a = v83Var;
        this.b = ba2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w83)) {
            return false;
        }
        w83 w83Var = (w83) obj;
        return h12.c(this.a, w83Var.a) && h12.c(this.b, w83Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ba2 ba2Var = this.b;
        return iHashCode + (ba2Var == null ? 0 : ba2Var.hashCode());
    }

    public final String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.a + ", owner=" + this.b + ')';
    }
}
