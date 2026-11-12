package defpackage;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class l1 extends g1 implements SortedSet {
    public final /* synthetic */ sz2 p;

    public l1(sz2 r1, SortedMap r2) {
        this.p = r1;
        super(r1, r2);
    }

    public SortedMap a() {
        return (SortedMap) this.n;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return a().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return a().firstKey();
    }

    public SortedSet headSet(Object r3) {
        SortedMap r4 = a().headMap(r3);
        return new l1(this.p, r4);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return a().lastKey();
    }

    public SortedSet subSet(Object r3, Object r4) {
        SortedMap r5 = a().subMap(r3, r4);
        return new l1(this.p, r5);
    }

    public SortedSet tailSet(Object r3) {
        SortedMap r4 = a().tailMap(r3);
        return new l1(this.p, r4);
    }
}
