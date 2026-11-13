package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class fg2 implements Map, x32 {
    public final w03 n;
    public r11 o;
    public r11 p;
    public mn4 q;

    public fg2(w03 w03Var) {
        w03Var.getClass();
        this.n = w03Var;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.n.c(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.n.d(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        r11 r11Var = this.o;
        if (r11Var != null) {
            return r11Var;
        }
        r11 r11Var2 = new r11(this.n, 0);
        this.o = r11Var2;
        return r11Var2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fg2.class != obj.getClass()) {
            return false;
        }
        return h12.c(this.n, ((fg2) obj).n);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.n.g(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.n.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.n.i();
    }

    @Override // java.util.Map
    public final Set keySet() {
        r11 r11Var = this.p;
        if (r11Var != null) {
            return r11Var;
        }
        r11 r11Var2 = new r11(this.n, 1);
        this.p = r11Var2;
        return r11Var2;
    }

    @Override // java.util.Map
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.n.e;
    }

    public final String toString() {
        return this.n.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        mn4 mn4Var = this.q;
        if (mn4Var != null) {
            return mn4Var;
        }
        mn4 mn4Var2 = new mn4(this.n);
        this.q = mn4Var2;
        return mn4Var2;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
