package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class f1 extends AbstractMap {
    public transient d1 n;
    public transient s1 o;
    public final transient Map p;
    public final /* synthetic */ q1 q;

    public f1(q1 q1Var, Map map) {
        this.q = q1Var;
        this.p = map;
    }

    public final sw1 a(Map.Entry entry) {
        Object key = entry.getKey();
        return new sw1(key, this.q.k(key, (Collection) entry.getValue()));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        q1 q1Var = this.q;
        if (this.p == q1Var.r) {
            q1Var.clear();
            return;
        }
        e1 e1Var = new e1(this);
        while (e1Var.hasNext()) {
            e1Var.next();
            e1Var.remove();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.p;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        d1 d1Var = this.n;
        if (d1Var != null) {
            return d1Var;
        }
        d1 d1Var2 = new d1(this, 0);
        this.n = d1Var2;
        return d1Var2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.p.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Map map = this.p;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        return this.q.k(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.p.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        return this.q.keySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Collection collection = (Collection) this.p.remove(obj);
        if (collection == null) {
            return null;
        }
        q1 q1Var = this.q;
        Collection collectionI = q1Var.i();
        collectionI.addAll(collection);
        q1Var.s -= collection.size();
        collection.clear();
        return collectionI;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.p.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.p.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        s1 s1Var = this.o;
        if (s1Var != null) {
            return s1Var;
        }
        s1 s1Var2 = new s1(this);
        this.o = s1Var2;
        return s1Var2;
    }
}
