package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class z03 implements b42, Set, x32 {
    public final x03 n;
    public final x03 o;

    public z03(x03 x03Var) {
        this.n = x03Var;
        this.o = x03Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.o.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        x03 x03Var = this.o;
        int i = x03Var.d;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            x03Var.k(it.next());
        }
        return i != x03Var.d;
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
        if (obj == null || z03.class != obj.getClass()) {
            return false;
        }
        return this.n.equals(((z03) obj).n);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.n.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.n.g();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new bh1(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.o.l(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        x03 x03Var = this.o;
        int i = x03Var.d;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            x03Var.i(it.next());
        }
        return i != x03Var.d;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        x03 x03Var = this.o;
        Object[] objArr = x03Var.b;
        int i = x03Var.d;
        long[] jArr = x03Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (!q40.s0(collection, objArr[i5])) {
                                x03Var.m(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return i != x03Var.d;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.n.d;
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
