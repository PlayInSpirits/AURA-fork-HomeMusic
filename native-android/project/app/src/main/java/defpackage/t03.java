package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class t03 implements b42, Set, x32 {
    public final r03 n;
    public final r03 o;

    public t03(r03 r1) {
        r1.getClass();
        this.n = r1;
        this.o = r1;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object r1) {
        return this.o.a(r1);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection r13) {
        r13.getClass();
        r03 r12 = this.o;
        r12.getClass();
        int r0 = r12.g;
        Iterator r14 = r13.iterator();
    L4:
        if (r14.hasNext() == false) goto L12;
        Object r1 = r14.next();
        int r2 = r12.d(r1);
        r12.b[r2] = r1;
        long[] r3 = r12.c;
        int r4 = r12.d;
        r3[r2] = (((long) r4) & 2147483647L) | 4611686016279904256L;
        if (r4 == Integer.MAX_VALUE) goto L8;
        long r5 = (((long) r2) & 2147483647L) << 31;
        r3[r4] = r5 | (r3[r4] & (-4611686016279904257L));
    L8:
        r12.d = r2;
        if (r12.e != Integer.MAX_VALUE) goto L4;
        r12.e = r2;
        goto L4
    L12:
        if (r0 == r12.g) goto L15;
        return true;
    L15:
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.o.b();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object r1) {
        return this.n.c(r1);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection r3) {
        r3.getClass();
        Iterator r4 = r3.iterator();
    L4:
        if (r4.hasNext() == false) goto L9;
        Object r0 = r4.next();
        if (this.n.c(r0) == true) goto L4;
        return false;
    L9:
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object r3) {
        if (this != r3) goto L5;
        return true;
    L5:
        if (r3 != null) goto L7;
        return false;
    L7:
        if (t03.class == r3.getClass()) goto L10;
        return false;
    L10:
        return h12.c(this.n, ((t03) r3).n);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.n.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        if (this.n.g != 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new bh1(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object r1) {
        return this.o.g(r1);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection r19) {
        r19.getClass();
        r03 r1 = this.o;
        r1.getClass();
        int r2 = r1.g;
        Iterator r0 = r19.iterator();
    L3:
        int r4 = 1;
        int r5 = 0;
        if (r0.hasNext() == false) goto L24;
        Object r3 = r0.next();
        if (r3 == null) goto L8;
        int r6 = r3.hashCode();
    L9:
        int r7 = r6 * (-862048943);
        int r8 = r7 ^ (r7 << 16);
        int r9 = r8 & 127;
        int r10 = r1.f;
        int r11 = (r8 >>> 7) & r10;
    L10:
        long[] r12 = r1.a;
        int r13 = r11 >> 3;
        int r14 = (r11 & 7) << 3;
        long r15 = ((r12[r13 + r4] << (64 - r14)) & ((-r14) >> 63)) | (r12[r13] >>> r14);
        long r16 = (((long) r9) * 72340172838076673L) ^ r15;
        long r17 = ((~r16) & (r16 - 72340172838076673L)) & (-9187201950435737472L);
    L12:
        if (r17 == 0) goto L17;
        int r18 = ((Long.numberOfTrailingZeros(r17) >> 3) + r11) & r10;
        int r110 = r4;
        if (h12.c(r1.b[r18], r3) == true) goto L20;
        r17 = r17 & (r17 - 1);
        r4 = r110;
    L20:
        if (r18 < 0) goto L3;
        r1.h(r18);
        goto L3
    L17:
        int r111 = r4;
        if (((r15 & ((~r15) << 6)) & (-9187201950435737472L)) != 0) goto L19;
        r5 = r5 + 8;
        r11 = (r11 + r5) & r10;
        r4 = r111;
        goto L10
    L19:
        r18 = -1;
        goto L20
    L8:
        r6 = 0;
        goto L9
    L24:
        if (r2 == r1.g) goto L26;
        return true;
    L26:
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection r1) {
        r1.getClass();
        return this.o.i(r1);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.n.g;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] r1) {
        r1.getClass();
        return zz1.J(this, r1);
    }

    public final String toString() {
        return this.n.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return zz1.I(this);
    }
}
