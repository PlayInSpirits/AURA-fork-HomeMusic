package defpackage;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class k1 extends f1 implements SortedMap {
    public SortedSet r;
    public final /* synthetic */ sz2 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(sz2 sz2Var, SortedMap sortedMap) {
        super(sz2Var, sortedMap);
        this.s = sz2Var;
    }

    public SortedSet b() {
        return new l1(this.s, d());
    }

    @Override // defpackage.f1, java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.r;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet sortedSetB = b();
        this.r = sortedSetB;
        return sortedSetB;
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

    public SortedMap headMap(Object obj) {
        return new k1(this.s, d().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return d().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new k1(this.s, d().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new k1(this.s, d().tailMap(obj));
    }
}
