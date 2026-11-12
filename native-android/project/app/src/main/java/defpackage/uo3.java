package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class uo3 implements ro3, Serializable {
    public final to3 n;

    public uo3(to3 r1) {
        this.n = r1;
    }

    @Override // defpackage.ro3
    public final boolean apply(Object r1) {
        return !Object.class.equals(r1);
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof uo3) == true) goto L5;
        return false;
    L5:
        return this.n.equals(((uo3) r2).n);
    }

    public final int hashCode() {
        return ~this.n.hashCode();
    }

    public final String toString() {
        return "Predicates.not(" + this.n + ")";
    }
}
