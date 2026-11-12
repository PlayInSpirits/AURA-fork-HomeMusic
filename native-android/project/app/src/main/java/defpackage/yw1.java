package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class yw1 extends rw1 implements List, RandomAccess {
    public static final vw1 o = new vw1(gy3.r, 0);

    public static gy3 i(int i, Object[] objArr) {
        return i == 0 ? gy3.r : new gy3(i, objArr);
    }

    public static uw1 j() {
        return new uw1(4);
    }

    public static yw1 k(Collection collection) {
        if (!(collection instanceof rw1)) {
            Object[] array = collection.toArray();
            gh0.f(array.length, array);
            return i(array.length, array);
        }
        yw1 yw1VarA = ((rw1) collection).a();
        if (!yw1VarA.g()) {
            return yw1VarA;
        }
        Object[] array2 = yw1VarA.toArray(rw1.n);
        return i(array2.length, array2);
    }

    public static gy3 l(Object[] objArr) {
        if (objArr.length == 0) {
            return gy3.r;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        gh0.f(objArr2.length, objArr2);
        return i(objArr2.length, objArr2);
    }

    public static gy3 n(Long l, Long l2, Long l3, Long l4, Long l5) {
        Object[] objArr = {l, l2, l3, l4, l5};
        gh0.f(5, objArr);
        return i(5, objArr);
    }

    public static gy3 o(Object obj) {
        Object[] objArr = {obj};
        gh0.f(1, objArr);
        return i(1, objArr);
    }

    public static gy3 p(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        gh0.f(2, objArr);
        return i(2, objArr);
    }

    public static gy3 q(Comparator comparator, Collection collection) {
        Collection collection2;
        comparator.getClass();
        if (collection instanceof Collection) {
            collection2 = collection;
        } else {
            Iterator it = collection.iterator();
            ArrayList arrayList = new ArrayList();
            it.getClass();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            collection2 = arrayList;
        }
        Object[] array = collection2.toArray();
        gh0.f(array.length, array);
        Arrays.sort(array, comparator);
        return i(array.length, array);
    }

    @Override // defpackage.rw1
    public final yw1 a() {
        return this;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.rw1
    public int b(int i, Object[] objArr) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // defpackage.rw1, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (!(list instanceof RandomAccess)) {
                        Iterator it = iterator();
                        Iterator it2 = list.iterator();
                        while (it.hasNext()) {
                            if (it2.hasNext() && si0.s(it.next(), it2.next())) {
                            }
                        }
                        return !it2.hasNext();
                    }
                    for (int i = 0; i < size; i++) {
                        if (si0.s(get(i), list.get(i))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.rw1
    /* JADX INFO: renamed from: h */
    public final o15 iterator() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~(get(i2).hashCode() + (i * 31)));
        }
        return i;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.rw1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final vw1 listIterator(int i) {
        rr2.t(i, size());
        return isEmpty() ? o : new vw1(this, i);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public yw1 subList(int i, int i2) {
        rr2.u(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        return i3 == 0 ? gy3.r : new ww1(this, i, i3);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }
}
