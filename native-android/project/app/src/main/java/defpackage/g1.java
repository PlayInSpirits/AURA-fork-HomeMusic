package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class g1 extends jb4 {
    public final Map n;
    public final /* synthetic */ q1 o;

    public g1(q1 r1, Map r2) {
        this.o = r1;
        r2.getClass();
        this.n = r2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Iterator r2 = iterator();
    L3:
        e1 r0 = (e1) r2;
        if (r0.hasNext() == false) goto L6;
        r0.next();
        r0.remove();
        goto L3
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object r1) {
        return this.n.containsKey(r1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection r1) {
        return this.n.keySet().containsAll(r1);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object r1) {
        if (this != r1) goto L4;
        return true;
    L4:
        if (this.n.keySet().equals(r1) == true) goto L10;
        return false;
    L10:
        return true;
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.n.keySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.n.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new e1(this, this.n.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object r3) {
        Collection r4 = (Collection) this.n.remove(r3);
        if (r4 == null) goto L5;
        int r1 = r4.size();
        r4.clear();
        this.o.s -= r1;
    L6:
        if (r1 <= 0) goto L9;
        return true;
    L9:
        return false;
    L5:
        r1 = 0;
        goto L6
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.n.size();
    }
}
