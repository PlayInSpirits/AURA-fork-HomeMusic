package defpackage;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public class l1 extends g1 implements SortedSet {
    public final /* synthetic */ sz2 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(sz2 sz2Var, SortedMap sortedMap) {
        super(sz2Var, sortedMap);
        this.p = sz2Var;
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

    public SortedSet headSet(Object obj) {
        return new l1(this.p, a().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return a().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new l1(this.p, a().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new l1(this.p, a().tailMap(obj));
    }
}
