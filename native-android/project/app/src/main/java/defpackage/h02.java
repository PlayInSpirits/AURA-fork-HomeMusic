package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class h02 implements Iterable, x32 {
    public final int n;
    public final int o;
    public final int p;

    public h02(int r2, int r3, int r4) {
        if (r4 != 0) goto L5;
        kf2.n("Step must be non-zero.");
        throw null;
    L5:
        if (r4 == Integer.MIN_VALUE) goto L8;
        this.n = r2;
        this.o = q05.n(r2, r3, r4);
        this.p = r4;
        return;
    L8:
        kf2.n("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        throw null;
    }

    public boolean equals(Object r3) {
        if ((r3 instanceof h02) == true) goto L5;
        return false;
    L5:
        if (isEmpty() == true) goto L7;
    L8:
        h02 r4 = (h02) r3;
        int r0 = r4.n;
        if (this.n == r0) goto L11;
        return false;
    L11:
        if (this.o == r4.o) goto L13;
        return false;
    L13:
        if (this.p != r4.p) goto L21;
        return true;
    L21:
        return false;
    L7:
        if (((h02) r3).isEmpty() == false) goto L8;
        return true;
    }

    public int hashCode() {
        if (isEmpty() == false) goto L7;
        return -1;
    L7:
        return (((this.n * 31) + this.o) * 31) + this.p;
    }

    public boolean isEmpty() {
        int r2 = this.o;
        int r3 = this.p;
        int r4 = this.n;
        if (r3 <= 0) goto L7;
        if (r4 <= r2) goto L6;
        return true;
    L6:
        return false;
    L7:
        if (r4 >= r2) goto L9;
        return true;
    L9:
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int r1 = this.o;
        int r2 = this.p;
        return new i02(this.n, r1, r2);
    }

    public String toString() {
        int r1 = this.o;
        int r2 = this.p;
        int r4 = this.n;
        if (r2 <= 0) goto L7;
        StringBuilder r3 = new StringBuilder();
        r3.append(r4);
        r3.append("..");
        r3.append(r1);
        r3.append(" step ");
        r3.append(r2);
    L6:
        return r3.toString();
    L7:
        r3 = new StringBuilder();
        r3.append(r4);
        r3.append(" downTo ");
        r3.append(r1);
        r3.append(" step ");
        r3.append(-r2);
        goto L6
    }
}
