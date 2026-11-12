package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 extends k1 implements NavigableMap {
    public final /* synthetic */ sz2 t;

    public h1(sz2 r1, NavigableMap r2) {
        this.t = r1;
        super(r1, r2);
    }

    @Override // defpackage.k1
    public final SortedSet b() {
        return new i1(this.t, f());
    }

    @Override // defpackage.k1
    public final SortedSet c() {
        return (NavigableSet) super.c();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object r2) {
        Map.Entry r3 = f().ceilingEntry(r2);
        if (r3 != null) goto L7;
        return null;
    L7:
        return a(r3);
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object r1) {
        return f().ceilingKey(r1);
    }

    @Override // defpackage.k1
    public final /* bridge */ /* synthetic */ SortedMap d() {
        return f();
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return (NavigableSet) super.c();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        NavigableMap r1 = f().descendingMap();
        return new h1(this.t, r1);
    }

    public final sw1 e(Iterator r3) {
        if (r3.hasNext() == true) goto L6;
        return null;
    L6:
        Map.Entry r0 = (Map.Entry) r3.next();
        Collection r2 = this.t.i();
        r2.addAll((Collection) r0.getValue());
        r3.remove();
        return new sw1(r0.getKey(), Collections.unmodifiableList((List) r2));
    }

    public final NavigableMap f() {
        return (NavigableMap) ((SortedMap) this.p);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        Map.Entry r0 = f().firstEntry();
        if (r0 != null) goto L7;
        return null;
    L7:
        return a(r0);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object r2) {
        Map.Entry r3 = f().floorEntry(r2);
        if (r3 != null) goto L7;
        return null;
    L7:
        return a(r3);
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object r1) {
        return f().floorKey(r1);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object r3, boolean r4) {
        NavigableMap r5 = f().headMap(r3, r4);
        return new h1(this.t, r5);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object r2) {
        Map.Entry r3 = f().higherEntry(r2);
        if (r3 != null) goto L7;
        return null;
    L7:
        return a(r3);
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object r1) {
        return f().higherKey(r1);
    }

    @Override // defpackage.k1, defpackage.f1, java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return (NavigableSet) super.c();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        Map.Entry r0 = f().lastEntry();
        if (r0 != null) goto L7;
        return null;
    L7:
        return a(r0);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object r2) {
        Map.Entry r3 = f().lowerEntry(r2);
        if (r3 != null) goto L7;
        return null;
    L7:
        return a(r3);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object r1) {
        return f().lowerKey(r1);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.c();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        return e(((d1) entrySet()).iterator());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        return e(((d1) ((f1) descendingMap()).entrySet()).iterator());
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object r3, boolean r4, Object r5, boolean r6) {
        NavigableMap r7 = f().subMap(r3, r4, r5, r6);
        return new h1(this.t, r7);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object r3, boolean r4) {
        NavigableMap r5 = f().tailMap(r3, r4);
        return new h1(this.t, r5);
    }

    @Override // defpackage.k1, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap headMap(Object r2) {
        return headMap(r2, false);
    }

    @Override // defpackage.k1, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap subMap(Object r3, Object r4) {
        return subMap(r3, true, r4, false);
    }

    @Override // defpackage.k1, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap tailMap(Object r2) {
        return tailMap(r2, true);
    }
}
