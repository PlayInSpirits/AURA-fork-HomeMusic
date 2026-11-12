package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class nf3 implements Map, x32 {
    public static final nf3 p = null;
    public final xx4 n;
    public final int o;

    static {
        p = new nf3(xx4.e, 0);
    }

    public nf3(xx4 r1, int r2) {
        this.n = r1;
        this.o = r2;
    }

    public final nf3 a(Object r4, ob2 r5) {
        if (r4 == null) goto L5;
        int r1 = r4.hashCode();
    L6:
        x7 r6 = this.n.u(r4, r1, r5, 0);
        if (r6 != null) goto L10;
        return this;
    L10:
        return new nf3((xx4) r6.p, this.o + r6.o);
    L5:
        r1 = 0;
        goto L6
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object r3) {
        if (r3 == null) goto L5;
        int r1 = r3.hashCode();
    L7:
        return this.n.d(r1, 0, r3);
    L5:
        r1 = 0;
        goto L7
    }

    @Override // java.util.Map
    public boolean containsValue(Object r3) {
        Set r2 = entrySet();
        if (r2.isEmpty() == false) goto L5;
        return false;
    L5:
        Iterator r4 = r2.iterator();
    L7:
        if (r4.hasNext() == false) goto L12;
        if (h12.c(((Map.Entry) r4.next()).getValue(), r3) == false) goto L7;
        return true;
    L12:
        return false;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return new tf3(this, 0);
    }

    @Override // java.util.Map
    public final boolean equals(Object r6) {
        if (r6 != this) goto L6;
        return true;
    L6:
        if ((r6 instanceof Map) == true) goto L8;
        return false;
    L8:
        Map r7 = (Map) r6;
        int r1 = r7.size();
        if (this.o == r1) goto L11;
        return false;
    L11:
        Set r8 = r7.entrySet();
        if ((r8 instanceof Collection) == true) goto L14;
    L16:
        Iterator r9 = r8.iterator();
    L18:
        if (r9.hasNext() == false) goto L29;
        Map.Entry r2 = (Map.Entry) r9.next();
        if (r2 == null) goto L28;
        Object r3 = r2.getKey();
        Object r4 = r2.getValue();
        Object r5 = get(r3);
        if (h12.c(r4, r5) == false) goto L28;
        if (r5 != null) goto L18;
        if (containsKey(r3) == true) goto L18;
    L28:
        return false;
    L29:
        return true;
    L14:
        if (r8.isEmpty() == false) goto L16;
        return true;
    }

    @Override // java.util.Map
    public Object get(Object r3) {
        if (r3 == null) goto L5;
        int r1 = r3.hashCode();
    L7:
        return this.n.g(r1, 0, r3);
    L5:
        r1 = 0;
        goto L7
    }

    @Override // java.util.Map
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        if (this.o != 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.Map
    public final Set keySet() {
        return new tf3(this, 1);
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
    public final Object remove(Object r1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.o;
    }

    public final String toString() {
        return q40.B0(entrySet(), ", ", "{", "}", new x(1, this), 24);
    }

    @Override // java.util.Map
    public final Collection values() {
        return new ug2(1, this);
    }
}
