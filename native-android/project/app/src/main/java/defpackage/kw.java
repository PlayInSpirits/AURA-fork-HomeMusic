package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kw extends gb3 implements Serializable {
    public final eg1 n;
    public final gb3 o;

    public kw(eg1 eg1Var, gb3 gb3Var) {
        this.n = eg1Var;
        this.o = gb3Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        eg1 eg1Var = this.n;
        return this.o.compare(eg1Var.mo77apply(obj), eg1Var.mo77apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kw)) {
            return false;
        }
        kw kwVar = (kw) obj;
        return this.n.equals(kwVar.n) && this.o.equals(kwVar.o);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.n, this.o});
    }

    public final String toString() {
        return this.o + ".onResultOf(" + this.n + ")";
    }
}
