package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class e24 extends gb3 implements Serializable {
    public final gb3 n;

    public e24(gb3 gb3Var) {
        this.n = gb3Var;
    }

    @Override // defpackage.gb3
    public final gb3 a() {
        return this.n;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.n.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e24) {
            return this.n.equals(((e24) obj).n);
        }
        return false;
    }

    public final int hashCode() {
        return -this.n.hashCode();
    }

    public final String toString() {
        return this.n + ".reverse()";
    }
}
