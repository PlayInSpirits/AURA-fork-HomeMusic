package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class z13 {
    public final h33 a;
    public final boolean b;
    public final boolean c;
    public final Object d;

    public z13(h33 h33Var, boolean z, Object obj, boolean z2) {
        if (!h33Var.a && z) {
            kf2.e(h33Var.b().concat(" does not allow nullable values"));
            throw null;
        }
        if (!z && z2 && obj == null) {
            nz2.k(h33Var.b(), " has null value but is not nullable.", "Argument with type ");
            throw null;
        }
        this.a = h33Var;
        this.b = z;
        this.d = obj;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !z13.class.equals(obj.getClass())) {
            return false;
        }
        z13 z13Var = (z13) obj;
        if (this.b != z13Var.b || this.c != z13Var.c || !this.a.equals(z13Var.a)) {
            return false;
        }
        Object obj2 = z13Var.d;
        Object obj3 = this.d;
        if (obj3 != null) {
            return obj3.equals(obj2);
        }
        return obj2 == null;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31;
        Object obj = this.d;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(z13.class.getSimpleName());
        sb.append(" Type: " + this.a);
        sb.append(" Nullable: " + this.b);
        if (this.c) {
            sb.append(" DefaultValue: " + this.d);
        }
        return sb.toString();
    }
}
