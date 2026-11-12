package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class s60 extends gb3 implements Serializable {
    public final n7 n;

    public s60(n7 r1) {
        this.n = r1;
    }

    @Override // java.util.Comparator
    public final int compare(Object r1, Object r2) {
        return this.n.compare(r1, r2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object r4) {
        if (r4 != this) goto L6;
        return true;
    L6:
        if ((r4 instanceof s60) == true) goto L8;
        return false;
    L8:
        if (this.n == ((s60) r4).n) goto L10;
        return false;
    L10:
        return true;
    }

    public final int hashCode() {
        return this.n.hashCode();
    }

    public final String toString() {
        return this.n.toString();
    }
}
