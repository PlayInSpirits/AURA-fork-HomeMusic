package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ni implements Collection {
    public final /* synthetic */ oi n;

    public ni(oi oiVar) {
        this.n = oiVar;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.n.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.n.a(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.n.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new ki(this.n, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        oi oiVar = this.n;
        int iA = oiVar.a(obj);
        if (iA < 0) {
            return false;
        }
        oiVar.h(iA);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        oi oiVar = this.n;
        int i = oiVar.p;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (collection.contains(oiVar.j(i2))) {
                oiVar.h(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        oi oiVar = this.n;
        int i = oiVar.p;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (!collection.contains(oiVar.j(i2))) {
                oiVar.h(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.n.p;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        oi oiVar = this.n;
        int i = oiVar.p;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = oiVar.j(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        oi oiVar = this.n;
        int i = oiVar.p;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = oiVar.j(i2);
        }
        return objArr;
    }
}
