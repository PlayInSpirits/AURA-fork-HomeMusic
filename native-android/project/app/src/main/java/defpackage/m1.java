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

    public m1(q1 r1, Object r2, Collection r3, m1 r4) {
        this.r = r1;
        this.n = r2;
        this.o = r3;
        this.p = r4;
        if (r4 != null) goto L5;
        Collection r5 = null;
    L6:
        this.q = r5;
        return;
    L5:
        r5 = r4.o;
        goto L6
    }

    public final void a() {
        m1 r0 = this.p;
        if (r0 == null) goto L6;
        r0.a();
        return;
    L6:
        this.r.r.put(this.n, this.o);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object r4) {
        b();
        boolean r0 = this.o.isEmpty();
        boolean r5 = this.o.add(r4);
        if (r5 == false) goto L7;
        this.r.s++;
        if (r0 == false) goto L7;
        a();
    L7:
        return r5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection r5) {
        if (r5.isEmpty() == false) goto L6;
        return false;
    L6:
        int r0 = size();
        boolean r6 = this.o.addAll(r5);
        if (r6 == false) goto L11;
        this.r.s += this.o.size() - r0;
        if (r0 != 0) goto L11;
        a();
    L11:
        return r6;
    }

    public final void b() {
        m1 r0 = this.p;
        if (r0 == null) goto L10;
        r0.b();
        if (r0.o == this.q) goto L17;
        kf2.c();
        return;
    L17:
        return;
    L10:
        if (this.o.isEmpty() == false) goto L15;
        Collection r1 = (Collection) this.r.r.get(this.n);
        if (r1 == null) goto L16;
        this.o = r1;
        return;
    L16:
        return;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int r0 = size();
        if (r0 != 0) goto L5;
        return;
    L5:
        this.o.clear();
        this.r.s -= r0;
        d();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object r1) {
        b();
        return this.o.contains(r1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection r1) {
        b();
        return this.o.containsAll(r1);
    }

    public final void d() {
        m1 r0 = this.p;
        if (r0 == null) goto L7;
        r0.d();
        return;
    L7:
        if (this.o.isEmpty() == false) goto L10;
        this.r.r.remove(this.n);
        return;
    }

    @Override // java.util.Collection
    public final boolean equals(Object r1) {
        if (r1 != this) goto L5;
        return true;
    L5:
        b();
        return this.o.equals(r1);
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
    public final boolean remove(Object r3) {
        b();
        boolean r4 = this.o.remove(r3);
        if (r4 == false) goto L5;
        this.r.s--;
        d();
    L5:
        return r4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection r4) {
        if (r4.isEmpty() == false) goto L6;
        return false;
    L6:
        int r0 = size();
        boolean r5 = this.o.removeAll(r4);
        if (r5 == false) goto L9;
        this.r.s += this.o.size() - r0;
        d();
    L9:
        return r5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection r4) {
        r4.getClass();
        int r0 = size();
        boolean r5 = this.o.retainAll(r4);
        if (r5 == false) goto L5;
        this.r.s += this.o.size() - r0;
        d();
    L5:
        return r5;
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
