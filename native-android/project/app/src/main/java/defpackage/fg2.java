package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fg2 implements Map, x32 {
    public final w03 n;
    public r11 o;
    public r11 p;
    public mn4 q;

    public fg2(w03 r1) {
        r1.getClass();
        this.n = r1;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object compute(Object r1, BiFunction r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfAbsent(Object r1, Function r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfPresent(Object r1, BiFunction r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object r1) {
        return this.n.c(r1);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object r1) {
        return this.n.d(r1);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        r11 r0 = this.o;
        if (r0 == null) goto L5;
        return r0;
    L5:
        r11 r1 = new r11(this.n, 0);
        this.o = r1;
        return r1;
    }

    @Override // java.util.Map
    public final boolean equals(Object r3) {
        if (this != r3) goto L5;
        return true;
    L5:
        if (r3 != null) goto L7;
        return false;
    L7:
        if (fg2.class == r3.getClass()) goto L10;
        return false;
    L10:
        return h12.c(this.n, ((fg2) r3).n);
    }

    @Override // java.util.Map
    public final Object get(Object r1) {
        return this.n.g(r1);
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
        r11 r0 = this.p;
        if (r0 == null) goto L5;
        return r0;
    L5:
        r11 r1 = new r11(this.n, 1);
        this.p = r1;
        return r1;
    }

    @Override // java.util.Map
    public final Object merge(Object r1, Object r2, BiFunction r3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object put(Object r1, Object r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map r1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object putIfAbsent(Object r1, Object r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object r1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object replace(Object r1, Object r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction r1) {
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
        mn4 r0 = this.q;
        if (r0 == null) goto L5;
        return r0;
    L5:
        mn4 r1 = new mn4(this.n);
        this.q = r1;
        return r1;
    }

    @Override // java.util.Map
    public final boolean remove(Object r1, Object r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean replace(Object r1, Object r2, Object r3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
