package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class si5 extends oi5 implements Serializable {
    public final oi5 n;

    public si5(oi5 r1) {
        this.n = r1;
    }

    @Override // defpackage.oi5
    public final oi5 a() {
        return this.n;
    }

    @Override // java.util.Comparator
    public final int compare(Object r1, Object r2) {
        return this.n.compare(r2, r1);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object r2) {
        if (r2 != this) goto L6;
        return true;
    L6:
        if ((r2 instanceof si5) == true) goto L8;
        return false;
    L8:
        return this.n.equals(((si5) r2).n);
    }

    public final int hashCode() {
        return -this.n.hashCode();
    }

    public final String toString() {
        return this.n.toString().concat(".reverse()");
    }
}
