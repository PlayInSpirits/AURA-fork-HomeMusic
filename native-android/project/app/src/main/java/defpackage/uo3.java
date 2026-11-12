package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class uo3 implements ro3, Serializable {
    public final to3 n;

    public uo3(to3 to3Var) {
        this.n = to3Var;
    }

    @Override // defpackage.ro3
    public final boolean apply(Object obj) {
        return !Object.class.equals(obj);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof uo3) {
            return this.n.equals(((uo3) obj).n);
        }
        return false;
    }

    public final int hashCode() {
        return ~this.n.hashCode();
    }

    public final String toString() {
        return "Predicates.not(" + this.n + ")";
    }
}
