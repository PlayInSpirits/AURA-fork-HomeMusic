package defpackage;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vh5 extends oi5 implements Serializable {
    public final Comparator n;

    public vh5(Comparator r1) {
        r1.getClass();
        this.n = r1;
    }

    @Override // java.util.Comparator
    public final int compare(Object r1, Object r2) {
        return this.n.compare(r1, r2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object r2) {
        if (r2 != this) goto L6;
        return true;
    L6:
        if ((r2 instanceof vh5) == true) goto L8;
        return false;
    L8:
        return this.n.equals(((vh5) r2).n);
    }

    public final int hashCode() {
        return this.n.hashCode();
    }

    public final String toString() {
        return this.n.toString();
    }
}
