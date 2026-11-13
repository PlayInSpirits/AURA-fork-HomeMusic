package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class c13 implements List, y32 {
    public final f13 n;

    public c13(f13 f13Var) {
        this.n = f13Var;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        this.n.b(obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        f13 f13Var = this.n;
        return f13Var.e(f13Var.p, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.n.g();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.n.h(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.n.h(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        g13.a(this, i);
        return this.n.n[i];
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.n.i(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.n.p == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new e13(this, 0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        f13 f13Var = this.n;
        Object[] objArr = f13Var.n;
        for (int i = f13Var.p - 1; i >= 0; i--) {
            if (h12.c(obj, objArr[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new e13(this, 0);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        g13.a(this, i);
        return this.n.k(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        f13 f13Var = this.n;
        int i = f13Var.p;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            f13Var.j(it.next());
        }
        return i != f13Var.p;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        f13 f13Var = this.n;
        int i = f13Var.p;
        for (int i2 = i - 1; -1 < i2; i2--) {
            if (!collection.contains(f13Var.n[i2])) {
                f13Var.k(i2);
            }
        }
        return i != f13Var.p;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        g13.a(this, i);
        Object[] objArr = this.n.n;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.n.p;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        g13.b(i, i2, this);
        return new d13(i, i2, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return zz1.I(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return zz1.J(this, objArr);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        this.n.a(i, obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new e13(this, i);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return this.n.e(i, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.n.j(obj);
    }
}
