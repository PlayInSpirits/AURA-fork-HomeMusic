package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
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
        boolean isEmpty = this.o.isEmpty();
        boolean add = this.o.add(obj);
        if (add) {
            this.r.s++;
            if (isEmpty) {
                a();
            }
        }
        return add;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.o.addAll(collection);
        if (addAll) {
            this.r.s += this.o.size() - size;
            if (size == 0) {
                a();
            }
        }
        return addAll;
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
        boolean remove = this.o.remove(obj);
        if (remove) {
            q1 q1Var = this.r;
            q1Var.s--;
            d();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.o.removeAll(collection);
        if (removeAll) {
            this.r.s += this.o.size() - size;
            d();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean retainAll = this.o.retainAll(collection);
        if (retainAll) {
            this.r.s += this.o.size() - size;
            d();
        }
        return retainAll;
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
