package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class fi5 implements Map, Serializable {
    public static final Map.Entry[] o = null;
    public transient gi5 n;

    static {
        o = new Map.Entry[0];
    }

    public final gi5 a() {
        gi5 r0 = this.n;
        if (r0 != null) goto L9;
        ji5 r1 = (ji5) this;
        if (r1.isEmpty() == false) goto L7;
        r0 = qi5.w;
    L8:
        this.n = r0;
        goto L9
    L7:
        r0 = new ii5(r1);
    L9:
        return r0;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object r1) {
        if (get(r1) == null) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object r1) {
        return ((ji5) this).q.contains(r1);
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Set entrySet() {
        return a();
    }

    @Override // java.util.Map
    public final boolean equals(Object r2) {
        if (this != r2) goto L6;
        return true;
    L6:
        if ((r2 instanceof Map) == true) goto L10;
        return false;
    L10:
        return ((ji5) this).entrySet().equals(((Map) r2).entrySet());
    }

    @Override // java.util.Map
    public abstract Object get(Object r1);

    @Override // java.util.Map
    public final Object getOrDefault(Object r1, Object r2) {
        Object r0 = get(r1);
        if (r0 == null) goto L5;
        return r0;
    L5:
        return r2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return gh0.M(a());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        if (((ji5) this).size() != 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.Map
    public final Object put(Object r1, Object r2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map r1) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object r1) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        ji5 r5 = (ji5) this;
        int r0 = r5.size();
        if (r0 < 0) goto L13;
        StringBuilder r2 = new StringBuilder((int) Math.min(((long) r0) * 8, 1073741824));
        r2.append('{');
        Iterator r6 = r5.entrySet().iterator();
        boolean r1 = true;
    L6:
        if (r6.hasNext() == false) goto L11;
        Map.Entry r3 = (Map.Entry) r6.next();
        if (r1 == true) goto L10;
        r2.append(", ");
    L10:
        r2.append(r3.getKey());
        r2.append('=');
        r2.append(r3.getValue());
        r1 = false;
        goto L6
    L11:
        r2.append('}');
        return r2.toString();
    L13:
        kf2.n(f34.f(r0, "size cannot be negative but was: "));
        return null;
    }
}
