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

    public f1(q1 r1, Map r2) {
        this.q = r1;
        this.p = r2;
    }

    public final sw1 a(Map.Entry r2) {
        Object r0 = r2.getKey();
        Collection r3 = (Collection) r2.getValue();
        return new sw1(r0, this.q.k(r0, r3));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        q1 r0 = this.q;
        Map r1 = r0.r;
        if (this.p != r1) goto L6;
        r0.clear();
        return;
    L6:
        e1 r2 = new e1(this);
    L8:
        if (r2.hasNext() == false) goto L10;
        r2.next();
        r2.remove();
        goto L8
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object r1) {
        Map r0 = this.p;
        r0.getClass();
        return r0.containsKey(r1);
    L5:
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        d1 r0 = this.n;
        if (r0 != null) goto L6;
        d1 r1 = new d1(this, 0);
        this.n = r1;
        return r1;
    L6:
        return r0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object r1) {
        if (this != r1) goto L4;
        return true;
    L4:
        if (this.p.equals(r1) == true) goto L10;
        return false;
    L10:
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object r3) {
        Map r0 = this.p;
        r0.getClass();
        Object r1 = r0.get(r3);     // Catch: Throwable -> L5
    L6:
        Collection r2 = (Collection) r1;
        if (r2 != null) goto L10;
        return null;
    L10:
        return this.q.k(r3, r2);
    L5:
        r1 = null;
        goto L6
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
    public final Object remove(Object r4) {
        Collection r5 = (Collection) this.p.remove(r4);
        if (r5 != null) goto L6;
        return null;
    L6:
        q1 r3 = this.q;
        Collection r0 = r3.i();
        r0.addAll(r5);
        r3.s -= r5.size();
        r5.clear();
        return r0;
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
        s1 r0 = this.o;
        if (r0 != null) goto L6;
        s1 r1 = new s1(this);
        this.o = r1;
        return r1;
    L6:
        return r0;
    }
}
