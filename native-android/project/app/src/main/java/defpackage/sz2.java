package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sz2 extends q1 implements vb2 {
    public transient rz2 t;

    @Override // defpackage.q1, defpackage.u1
    public final Map e() {
        Map map = this.r;
        if (map instanceof NavigableMap) {
            return new h1(this, (NavigableMap) map);
        }
        return map instanceof SortedMap ? new k1(this, (SortedMap) map) : new f1(this, map);
    }

    @Override // defpackage.q1, defpackage.u1
    public final Set g() {
        Map map = this.r;
        if (map instanceof NavigableMap) {
            return new i1(this, (NavigableMap) map);
        }
        return map instanceof SortedMap ? new l1(this, (SortedMap) map) : new g1(this, map);
    }

    @Override // defpackage.q1, defpackage.qz2
    public final Collection get(Object obj) {
        return (List) super.get(obj);
    }

    @Override // defpackage.q1
    public final Collection i() {
        return (List) this.t.get();
    }

    @Override // defpackage.q1
    public final Collection k(Object obj, Collection collection) {
        List list = (List) collection;
        return list instanceof RandomAccess ? new j1(this, obj, list, null) : new o1(this, obj, list, null);
    }
}
