package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class s60 extends gb3 implements Serializable {
    public final n7 n;

    public s60(n7 n7Var) {
        this.n = n7Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.n.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof s60) && this.n == ((s60) obj).n;
    }

    public final int hashCode() {
        return this.n.hashCode();
    }

    public final String toString() {
        return this.n.toString();
    }
}
