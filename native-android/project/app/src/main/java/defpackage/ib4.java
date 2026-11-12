package defpackage;

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ib4 extends hb4 implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.n).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator r0 = this.n.iterator();
        r0.getClass();
        ro3 r3 = this.o;
        r3.getClass();
    L4:
        if (r0.hasNext() == false) goto L8;
        Object r1 = r0.next();
        if (r3.apply(r1) == false) goto L4;
        return r1;
    L8:
        tb4.k();
        return null;
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object r3) {
        return new ib4(((SortedSet) this.n).headSet(r3), this.o);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet r0 = (SortedSet) this.n;
    L3:
        Object r1 = r0.last();
        if (this.o.apply(r1) == true) goto L5;
        r0 = r0.headSet(r1);
        goto L3
    L5:
        return r1;
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object r3, Object r4) {
        return new ib4(((SortedSet) this.n).subSet(r3, r4), this.o);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object r3) {
        return new ib4(((SortedSet) this.n).tailSet(r3), this.o);
    }
}
