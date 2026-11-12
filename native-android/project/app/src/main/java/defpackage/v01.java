package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class v01 implements Map, Serializable, x32 {
    public static final v01 n = null;

    static {
        n = new v01();
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object r1) {
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object r1) {
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return z01.n;
    }

    @Override // java.util.Map
    public final boolean equals(Object r1) {
        if ((r1 instanceof Map) == true) goto L5;
        return false;
    L5:
        if (((Map) r1).isEmpty() == false) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object r1) {
        return null;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return 0;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return z01.n;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object r1, Object r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map r1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object r1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return 0;
    }

    public final String toString() {
        return "{}";
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return u01.n;
    }

    @Override // java.util.Map
    public final boolean remove(Object r1, Object r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
