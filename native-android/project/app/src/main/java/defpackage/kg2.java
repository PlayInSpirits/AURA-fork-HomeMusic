package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kg2 extends AbstractMap {
    public final Map n;
    public final jg2 o;

    public kg2(Map r1, jg2 r2) {
        r1.getClass();
        this.n = r1;
        this.o = r2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.n.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object r1) {
        return this.n.containsKey(r1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new d1(this, 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object r3) {
        Map r0 = this.n;
        Object r1 = r0.get(r3);
        if (r1 != null) goto L10;
        if (r0.containsKey(r3) == true) goto L10;
        return null;
    L10:
        return this.o.g(r3, r1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return this.n.keySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object r3) {
        Map r0 = this.n;
        if (r0.containsKey(r3) == true) goto L5;
        return null;
    L5:
        return this.o.g(r3, r0.remove(r3));
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
