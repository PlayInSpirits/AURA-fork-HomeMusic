package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class e24 extends gb3 implements Serializable {
    public final gb3 n;

    public e24(gb3 r1) {
        this.n = r1;
    }

    @Override // defpackage.gb3
    public final gb3 a() {
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
        if ((r2 instanceof e24) == true) goto L8;
        return false;
    L8:
        return this.n.equals(((e24) r2).n);
    }

    public final int hashCode() {
        return -this.n.hashCode();
    }

    public final String toString() {
        return this.n + ".reverse()";
    }
}
