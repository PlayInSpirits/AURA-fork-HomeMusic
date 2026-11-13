package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class kg2 extends AbstractMap {
    public final Map n;
    public final jg2 o;

    public kg2(Map map, jg2 jg2Var) {
        map.getClass();
        this.n = map;
        this.o = jg2Var;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.n.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.n.containsKey(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new d1(this, 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map map = this.n;
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return this.o.g(obj, obj2);
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return this.n.keySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map map = this.n;
        if (map.containsKey(obj)) {
            return this.o.g(obj, map.remove(obj));
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.n.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return new s1(this);
    }
}
