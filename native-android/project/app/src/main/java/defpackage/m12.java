package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class m12 extends AbstractList implements RandomAccess, Serializable {
    public final int[] n;
    public final int o;
    public final int p;

    public m12(int r1, int r2, int[] r3) {
        this.n = r3;
        this.o = r1;
        this.p = r2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object r3) {
        if ((r3 instanceof Integer) == false) goto L8;
        int r4 = ((Integer) r3).intValue();
        int r0 = this.o;
        int r1 = this.p;
        if (jz4.y(this.n, r4, r0, r1) == (-1)) goto L10;
        return true;
    L10:
        return false;
    L8:
        return false;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object r8) {
        if (r8 != this) goto L6;
        return true;
    L6:
        if ((r8 instanceof m12) == false) goto L18;
        m12 r9 = (m12) r8;
        int r1 = size();
        if (r9.size() == r1) goto L10;
        return false;
    L10:
        int r2 = 0;
    L11:
        if (r2 >= r1) goto L16;
        if (this.n[this.o + r2] != r9.n[r9.o + r2]) goto L14;
        r2 = r2 + 1;
        goto L11
    L14:
        return false;
    L16:
        return true;
    L18:
        return super.equals(r8);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int r2) {
        rr2.q(r2, size());
        int r0 = this.o + r2;
        return Integer.valueOf(this.n[r0]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int r0 = 1;
        int r1 = this.o;
    L4:
        if (r1 >= this.p) goto L6;
        r0 = (r0 * 31) + this.n[r1];
        r1 = r1 + 1;
        goto L4
    L6:
        return r0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object r3) {
        if ((r3 instanceof Integer) == false) goto L8;
        int r4 = ((Integer) r3).intValue();
        int r0 = this.p;
        int[] r1 = this.n;
        int r2 = this.o;
        int r5 = jz4.y(r1, r4, r2, r0);
        if (r5 >= 0) goto L7;
        return -1;
    L7:
        return r5 - r2;
    L8:
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object r5) {
        if ((r5 instanceof Integer) == false) goto L15;
        int r6 = ((Integer) r5).intValue();
        int r0 = this.p;
    L5:
        r0 = r0 - 1;
        int r2 = this.o;
        if (r0 < r2) goto L11;
        if (this.n[r0] != r6) goto L5;
    L12:
        if (r0 < 0) goto L15;
        return r0 - r2;
    L11:
        r0 = -1;
    L15:
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int r2, Object r3) {
        Integer r4 = (Integer) r3;
        rr2.q(r2, size());
        int r0 = this.o + r2;
        int[] r1 = this.n;
        int r5 = r1[r0];
        r4.getClass();
        r1[r0] = r4.intValue();
        return Integer.valueOf(r5);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.p - this.o;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int r3, int r4) {
        rr2.u(r3, r4, size());
        if (r3 == r4) goto L5;
        int r1 = this.o;
        return new m12(r3 + r1, r1 + r4, this.n);
    L5:
        return Collections.EMPTY_LIST;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder r0 = new StringBuilder(size() * 5);
        r0.append('[');
        int[] r1 = this.n;
        int r2 = this.o;
        r0.append(r1[r2]);
    L3:
        r2 = r2 + 1;
        if (r2 >= this.p) goto L6;
        r0.append(", ");
        r0.append(r1[r2]);
        goto L3
    L6:
        r0.append(']');
        return r0.toString();
    }
}
