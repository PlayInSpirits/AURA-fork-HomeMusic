package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class t03 implements b42, Set, x32 {
    public final r03 n;
    public final r03 o;

    public t03(r03 r03Var) {
        r03Var.getClass();
        this.n = r03Var;
        this.o = r03Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.o.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        r03 r03Var = this.o;
        r03Var.getClass();
        int i = r03Var.g;
        for (Object obj : collection) {
            int iD = r03Var.d(obj);
            r03Var.b[iD] = obj;
            long[] jArr = r03Var.c;
            int i2 = r03Var.d;
            jArr[iD] = (((long) i2) & 2147483647L) | 4611686016279904256L;
            if (i2 != Integer.MAX_VALUE) {
                jArr[i2] = ((((long) iD) & 2147483647L) << 31) | (jArr[i2] & (-4611686016279904257L));
            }
            r03Var.d = iD;
            if (r03Var.e == Integer.MAX_VALUE) {
                r03Var.e = iD;
            }
        }
        return i != r03Var.g;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.o.b();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.n.c(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.n.c(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t03.class != obj.getClass()) {
            return false;
        }
        return h12.c(this.n, ((t03) obj).n);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.n.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.n.g == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new bh1(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.o.g(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int iNumberOfTrailingZeros;
        collection.getClass();
        r03 r03Var = this.o;
        r03Var.getClass();
        int i = r03Var.g;
        Iterator it = collection.iterator();
        while (true) {
            int i2 = 1;
            int i3 = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int iHashCode = (next != null ? next.hashCode() : 0) * (-862048943);
            int i4 = iHashCode ^ (iHashCode << 16);
            int i5 = i4 & 127;
            int i6 = r03Var.f;
            int i7 = (i4 >>> 7) & i6;
            while (true) {
                long[] jArr = r03Var.a;
                int i8 = i7 >> 3;
                int i9 = (i7 & 7) << 3;
                long j = ((jArr[i8 + i2] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
                long j2 = (((long) i5) * 72340172838076673L) ^ j;
                long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
                while (j3 != 0) {
                    iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i7) & i6;
                    int i10 = i2;
                    if (h12.c(r03Var.b[iNumberOfTrailingZeros], next)) {
                        break;
                    }
                    j3 &= j3 - 1;
                    i2 = i10;
                }
                int i11 = i2;
                if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                    iNumberOfTrailingZeros = -1;
                    break;
                }
                i3 += 8;
                i7 = (i7 + i3) & i6;
                i2 = i11;
            }
            if (iNumberOfTrailingZeros >= 0) {
                r03Var.h(iNumberOfTrailingZeros);
            }
        }
        return i != r03Var.g;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        return this.o.i(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.n.g;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return zz1.J(this, objArr);
    }

    public final String toString() {
        return this.n.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return zz1.I(this);
    }
}
