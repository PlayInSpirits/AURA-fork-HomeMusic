package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kd3 implements Serializable {
    public final Object n;
    public final Object o;

    public kd3(Object r1, Object r2) {
        this.n = r1;
        this.o = r2;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof kd3) == true) goto L8;
        return false;
    L8:
        kd3 r6 = (kd3) r5;
        if (h12.c(this.n, r6.n) == true) goto L12;
        return false;
    L12:
        if (h12.c(this.o, r6.o) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public final int hashCode() {
        int r0 = 0;
        Object r1 = this.n;
        if (r1 != null) goto L5;
        int r2 = 0;
    L6:
        int r3 = r2 * 31;
        Object r4 = this.o;
        if (r4 == null) goto L11;
        r0 = r4.hashCode();
    L11:
        return r3 + r0;
    L5:
        r2 = r1.hashCode();
        goto L6
    }

    public final String toString() {
        return "(" + this.n + ", " + this.o + ')';
    }
}
