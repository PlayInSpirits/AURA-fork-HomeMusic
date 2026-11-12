package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dl0 extends uo implements Map {
    public final Map u;

    public dl0(Map map) {
        super(10);
        this.u = map;
    }

    @Override // java.util.Map
    public final void clear() {
        this.u.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && this.u.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        Iterator it = ((hb4) entrySet()).iterator();
        it.getClass();
        if (obj == null) {
            while (it.hasNext()) {
                if (((Map.Entry) it.next()).getValue() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(((Map.Entry) it.next()).getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return j51.s(this.u.entrySet(), new cl0(0));
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && vr1.o(obj, this);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.u.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return j51.x(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        Map map = this.u;
        return map.isEmpty() || (map.size() == 1 && map.containsKey(null));
    }

    @Override // java.util.Map
    public final Set keySet() {
        return j51.s(this.u.keySet(), new cl0(1));
    }

    @Override // defpackage.uo
    public final Object o() {
        return this.u;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return this.u.put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        this.u.putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return this.u.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        Map map = this.u;
        return map.size() - (map.containsKey(null) ? 1 : 0);
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.u.values();
    }
}
