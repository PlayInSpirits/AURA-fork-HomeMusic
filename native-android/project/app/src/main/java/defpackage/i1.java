package defpackage;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 extends l1 implements NavigableSet {
    public final /* synthetic */ sz2 q;

    public i1(sz2 r1, NavigableMap r2) {
        this.q = r1;
        super(r1, r2);
    }

    @Override // defpackage.l1
    public final /* bridge */ /* synthetic */ SortedMap a() {
        return b();
    }

    public final NavigableMap b() {
        return (NavigableMap) ((SortedMap) this.n);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object r1) {
        return b().ceilingKey(r1);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return ((g1) descendingSet()).iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        NavigableMap r1 = b().descendingMap();
        return new i1(this.q, r1);
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object r1) {
        return b().floorKey(r1);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object r3, boolean r4) {
        NavigableMap r5 = b().headMap(r3, r4);
        return new i1(this.q, r5);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object r1) {
        return b().higherKey(r1);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object r1) {
        return b().lowerKey(r1);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        e1 r1 = (e1) iterator();
        if (r1.hasNext() == false) goto L6;
        Object r0 = r1.next();
        r1.remove();
        return r0;
    L6:
        return null;
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        Iterator r1 = descendingIterator();
        if (r1.hasNext() == false) goto L6;
        Object r0 = r1.next();
        r1.remove();
        return r0;
    L6:
        return null;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object r3, boolean r4, Object r5, boolean r6) {
        NavigableMap r7 = b().subMap(r3, r4, r5, r6);
        return new i1(this.q, r7);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object r3, boolean r4) {
        NavigableMap r5 = b().tailMap(r3, r4);
        return new i1(this.q, r5);
    }

    @Override // defpackage.l1, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet headSet(Object r2) {
        return headSet(r2, false);
    }

    @Override // defpackage.l1, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet subSet(Object r3, Object r4) {
        return subSet(r3, true, r4, false);
    }

    @Override // defpackage.l1, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet tailSet(Object r2) {
        return tailSet(r2, true);
    }
}
