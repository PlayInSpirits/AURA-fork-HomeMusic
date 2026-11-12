package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class l84 {
    public final o84 a;
    public final o84 b;

    public l84(o84 o84Var, o84 o84Var2) {
        this.a = o84Var;
        this.b = o84Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l84.class == obj.getClass()) {
            l84 l84Var = (l84) obj;
            if (this.a.equals(l84Var.a) && this.b.equals(l84Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[");
        o84 o84Var = this.a;
        sb.append(o84Var);
        o84 o84Var2 = this.b;
        if (o84Var.equals(o84Var2)) {
            str = "";
        } else {
            str = ", " + o84Var2;
        }
        return b11.q(sb, str, "]");
    }
}
