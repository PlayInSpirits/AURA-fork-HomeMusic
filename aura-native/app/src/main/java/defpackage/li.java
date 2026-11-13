package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class li implements Set {
    public final /* synthetic */ oi n;

    public li(oi oiVar) {
        this.n = oiVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.n.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.n.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.n.k(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        oi oiVar = this.n;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            if (oiVar.p == set.size()) {
                return oiVar.k(set);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        oi oiVar = this.n;
        int i = 0;
        for (int i2 = oiVar.p - 1; i2 >= 0; i2--) {
            Object f = oiVar.f(i2);
            i += f == null ? 0 : f.hashCode();
        }
        return i;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.n.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new ki(this.n, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        oi oiVar = this.n;
        int d = oiVar.d(obj);
        if (d < 0) {
            return false;
        }
        oiVar.h(d);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.n.l(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        oi oiVar = this.n;
        int i = oiVar.p;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(oiVar.f(i2))) {
                oiVar.h(i2);
            }
        }
        return i != oiVar.p;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.n.p;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        oi oiVar = this.n;
        int i = oiVar.p;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = oiVar.f(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        oi oiVar = this.n;
        int i = oiVar.p;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = oiVar.f(i2);
        }
        return objArr;
    }
}
