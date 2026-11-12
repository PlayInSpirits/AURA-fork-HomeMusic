package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class h90 extends gb3 implements Serializable {
    public final Comparator[] n;

    public h90(kw r3, kw r4) {
        this.n = new Comparator[]{r3, r4};
    }

    @Override // java.util.Comparator
    public final int compare(Object r5, Object r6) {
        int r1 = 0;
    L3:
        Comparator[] r2 = this.n;
        if (r1 >= r2.length) goto L9;
        int r3 = r2[r1].compare(r5, r6);
        if (r3 != 0) goto L7;
        r1 = r1 + 1;
        goto L3
    L7:
        return r3;
    L9:
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object r2) {
        if (r2 != this) goto L6;
        return true;
    L6:
        if ((r2 instanceof h90) == true) goto L8;
        return false;
    L8:
        return Arrays.equals(this.n, ((h90) r2).n);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.n);
    }

    public final String toString() {
        return b11.q(new StringBuilder("Ordering.compound("), Arrays.toString(this.n), ")");
    }
}
