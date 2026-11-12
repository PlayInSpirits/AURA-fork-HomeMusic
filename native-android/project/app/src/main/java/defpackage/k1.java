package defpackage;

import java.util.Comparator;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class k1 extends f1 implements SortedMap {
    public SortedSet r;
    public final /* synthetic */ sz2 s;

    public k1(sz2 r1, SortedMap r2) {
        this.s = r1;
        super(r1, r2);
    }

    public SortedSet b() {
        return new l1(this.s, d());
    }

    public SortedSet c() {
        SortedSet r0 = this.r;
        if (r0 != null) goto L6;
        SortedSet r1 = b();
        this.r = r1;
        return r1;
    L6:
        return r0;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return d().comparator();
    }

    public SortedMap d() {
        return (SortedMap) this.p;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return d().firstKey();
    }

    public SortedMap headMap(Object r3) {
        SortedMap r4 = d().headMap(r3);
        return new k1(this.s, r4);
    }

    @Override // defpackage.f1, java.util.AbstractMap, java.util.Map
    public /* bridge */ /* synthetic */ Set keySet() {
        return c();
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return d().lastKey();
    }

    public SortedMap subMap(Object r3, Object r4) {
        SortedMap r5 = d().subMap(r3, r4);
        return new k1(this.s, r5);
    }

    public SortedMap tailMap(Object r3) {
        SortedMap r4 = d().tailMap(r3);
        return new k1(this.s, r4);
    }
}
