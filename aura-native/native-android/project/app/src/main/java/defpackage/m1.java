package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m1 extends AbstractCollection {
    public final Object n;
    public Collection o;
    public final m1 p;
    public final Collection q;
    public final /* synthetic */ q1 r;

    public m1(q1 q1Var, Object obj, Collection collection, m1 m1Var) {
        this.r = q1Var;
        this.n = obj;
        this.o = collection;
        this.p = m1Var;
        this.q = m1Var == null ? null : m1Var.o;
    }

    public final void a() {
        m1 m1Var = this.p;
        if (m1Var != null) {
            m1Var.a();
        } else {
            this.r.r.put(this.n, this.o);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        b();
        boolean zIsEmpty = this.o.isEmpty();
        boolean zAdd = this.o.add(obj);
        if (zAdd) {
            this.r.s++;
            if (zIsEmpty) {
                a();
            }
        }
        return zAdd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.o.addAll(collection);
        if (zAddAll) {
            this.r.s += this.o.size() - size;
            if (size == 0) {
                a();
            }
        }
        return zAddAll;
    }

    public final void b() {
        Collection collection;
        m1 m1Var = this.p;
        if (m1Var != null) {
            m1Var.b();
            if (m1Var.o == this.q) {
                return;
            }
            kf2.c();
            return;
        }
        if (!this.o.isEmpty() || (collection = (Collection) this.r.r.get(this.n)) == null) {
            return;
        }
        this.o = collection;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.o.clear();
        this.r.s -= size;
        d();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        b();
        return this.o.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        b();
        return this.o.containsAll(collection);
    }

    public final void d() {
        m1 m1Var = this.p;
        if (m1Var != null) {
            m1Var.d();
        } else if (this.o.isEmpty()) {
            this.r.r.remove(this.n);
        }
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        b();
        return this.o.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        b();
        return this.o.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        b();
        return new e1(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        b();
        boolean zRemove = this.o.remove(obj);
        if (zRemove) {
            this.r.s--;
            d();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.o.removeAll(collection);
        if (zRemoveAll) {
            this.r.s += this.o.size() - size;
            d();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.o.retainAll(collection);
        if (zRetainAll) {
            this.r.s += this.o.size() - size;
            d();
        }
        return zRetainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        b();
        return this.o.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        b();
        return this.o.toString();
    }
}
