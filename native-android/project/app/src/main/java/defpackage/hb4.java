package defpackage;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class hb4 extends AbstractCollection implements Set {
    public final Set n;
    public final ro3 o;

    public hb4(Set r1, ro3 r2) {
        this.n = r1;
        this.o = r2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object r2) {
        rr2.l(this.o.apply(r2));
        return this.n.add(r2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection r4) {
        Iterator r0 = r4.iterator();
    L4:
        if (r0.hasNext() == false) goto L7;
        Object r1 = r0.next();
        rr2.l(this.o.apply(r1));
        goto L4
    L7:
        return this.n.addAll(r4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Set r0 = this.n;
        boolean r1 = r0 instanceof RandomAccess;
        ro3 r5 = this.o;
        if (r1 == true) goto L5;
    L20:
        Iterator r2 = r0.iterator();
        r5.getClass();
    L22:
        if (r2.hasNext() == false) goto L38;
        if (r5.apply(r2.next()) == false) goto L22;
        r2.remove();
        goto L22
    L38:
        return;
    L5:
        if ((r0 instanceof List) == false) goto L20;
        List r3 = (List) r0;
        r5.getClass();
        int r4 = 0;
        int r6 = 0;
    L8:
        if (r4 >= r3.size()) goto L18;
        Object r7 = r3.get(r4);
        if (r5.apply(r7) == true) goto L17;
        if (r4 > r6) goto L27;
    L16:
        r6 = r6 + 1;
        goto L17
    L27:
        r3.set(r6, r7);     // Catch: IllegalArgumentException -> L14 UnsupportedOperationException -> L15
    L14:
        te5.N(r3, r5, r6, r4);
        return;
    L15:
        te5.N(r3, r5, r6, r4);
        return;
    L17:
        r4 = r4 + 1;
        goto L8
    L18:
        r3.subList(r6, r3.size()).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object r3) {
        Set r0 = this.n;
        r0.getClass();
        boolean r1 = r0.contains(r3);     // Catch: Throwable -> L5
    L6:
        if (r1 == true) goto L8;
        return false;
    L8:
        return this.o.apply(r3);
    L5:
        r1 = false;
        goto L6
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection r2) {
        Iterator r3 = r2.iterator();
    L4:
        if (r3.hasNext() == false) goto L9;
        if (contains(r3.next()) == true) goto L4;
        return false;
    L9:
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object r1) {
        return j51.r(this, r1);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return j51.x(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        Iterator r0 = this.n.iterator();
        ro3 r5 = this.o;
        rr2.s(r5, "predicate");
        boolean r1 = false;
        int r2 = 0;
    L4:
        if (r0.hasNext() == false) goto L9;
        if (r5.apply(r0.next()) == true) goto L11;
        r2 = r2 + 1;
    L11:
        if (r2 == (-1)) goto L14;
        r1 = true;
    L14:
        return true ^ r1;
    L9:
        r2 = -1;
        goto L11
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Iterator r0 = this.n.iterator();
        r0.getClass();
        ro3 r2 = this.o;
        r2.getClass();
        return new h22(r0, r2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object r2) {
        if (contains(r2) == true) goto L5;
        return false;
    L5:
        if (this.n.remove(r2) == false) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection r5) {
        Iterator r0 = this.n.iterator();
        boolean r1 = false;
    L4:
        if (r0.hasNext() == false) goto L10;
        Object r2 = r0.next();
        if (this.o.apply(r2) == false) goto L4;
        if (r5.contains(r2) == false) goto L4;
        r0.remove();
        r1 = true;
        goto L4
    L10:
        return r1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection r5) {
        Iterator r0 = this.n.iterator();
        boolean r1 = false;
    L4:
        if (r0.hasNext() == false) goto L10;
        Object r2 = r0.next();
        if (this.o.apply(r2) == false) goto L4;
        if (r5.contains(r2) == true) goto L4;
        r0.remove();
        r1 = true;
        goto L4
    L10:
        return r1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator r0 = this.n.iterator();
        int r1 = 0;
    L4:
        if (r0.hasNext() == false) goto L8;
        Object r2 = r0.next();
        if (this.o.apply(r2) == false) goto L4;
        r1 = r1 + 1;
        goto L4
    L8:
        return r1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Iterator r3 = iterator();
        ArrayList r0 = new ArrayList();
    L3:
        h22 r1 = (h22) r3;
        if (r1.hasNext() == false) goto L7;
        r0.add(r1.next());
        goto L3
    L7:
        return r0.toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] r4) {
        Iterator r3 = iterator();
        ArrayList r0 = new ArrayList();
    L3:
        h22 r1 = (h22) r3;
        if (r1.hasNext() == false) goto L7;
        r0.add(r1.next());
        goto L3
    L7:
        return r0.toArray(r4);
    }
}
