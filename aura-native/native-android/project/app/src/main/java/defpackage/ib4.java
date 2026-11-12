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
        Iterator it = this.n.iterator();
        it.getClass();
        ro3 ro3Var = this.o;
        ro3Var.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (ro3Var.apply(next)) {
                return next;
            }
        }
        tb4.k();
        return null;
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new ib4(((SortedSet) this.n).headSet(obj), this.o);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSetHeadSet = (SortedSet) this.n;
        while (true) {
            Object objLast = sortedSetHeadSet.last();
            if (this.o.apply(objLast)) {
                return objLast;
            }
            sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new ib4(((SortedSet) this.n).subSet(obj, obj2), this.o);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new ib4(((SortedSet) this.n).tailSet(obj), this.o);
    }
}
