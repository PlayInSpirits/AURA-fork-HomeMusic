package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class bx1 implements Map, Serializable {
    public transient jx1 n;
    public transient jx1 o;
    public transient rw1 p;

    public static ue1 a() {
        return new ue1(4);
    }

    public static bx1 b(Map map) {
        if ((map instanceof bx1) && !(map instanceof SortedMap)) {
            return (bx1) map;
        }
        Set setEntrySet = map.entrySet();
        ue1 ue1Var = new ue1(setEntrySet instanceof Collection ? setEntrySet.size() : 4);
        ue1Var.y(setEntrySet);
        return ue1Var.d(true);
    }

    public abstract iy3 c();

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public abstract jy3 d();

    public abstract rw1 e();

    @Override // java.util.Map
    public final Set entrySet() {
        jx1 jx1Var = this.n;
        if (jx1Var != null) {
            return jx1Var;
        }
        iy3 iy3VarC = c();
        this.n = iy3VarC;
        return iy3VarC;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return vr1.o(obj, this);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public rw1 values() {
        rw1 rw1Var = this.p;
        if (rw1Var != null) {
            return rw1Var;
        }
        rw1 rw1VarE = e();
        this.p = rw1VarE;
        return rw1VarE;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        jx1 jx1VarC = this.n;
        if (jx1VarC == null) {
            jx1VarC = c();
            this.n = jx1VarC;
        }
        return j51.x(jx1VarC);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        jx1 jx1Var = this.o;
        if (jx1Var != null) {
            return jx1Var;
        }
        jy3 jy3VarD = d();
        this.o = jy3VarD;
        return jy3VarD;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        uc5.f(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }
}
