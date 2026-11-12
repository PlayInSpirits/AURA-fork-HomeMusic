package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kw extends gb3 implements Serializable {
    public final eg1 n;
    public final gb3 o;

    public kw(eg1 r1, gb3 r2) {
        this.n = r1;
        this.o = r2;
    }

    @Override // java.util.Comparator
    public final int compare(Object r2, Object r3) {
        eg1 r0 = this.n;
        Object r4 = r0.mo77apply(r2);
        Object r5 = r0.mo77apply(r3);
        return this.o.compare(r4, r5);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object r3) {
        if (r3 != this) goto L5;
        return true;
    L5:
        if ((r3 instanceof kw) == false) goto L12;
        kw r4 = (kw) r3;
        if (this.n.equals(r4.n) == true) goto L9;
        return false;
    L9:
        if (this.o.equals(r4.o) == false) goto L16;
        return true;
    L16:
        return false;
    L12:
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.n, this.o});
    }

    public final String toString() {
        return this.o + ".onResultOf(" + this.n + ")";
    }
}
