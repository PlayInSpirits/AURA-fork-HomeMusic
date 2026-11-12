package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
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

    public static bx1 b(Map r2) {
        if ((r2 instanceof bx1) == true) goto L5;
    L8:
        Set r3 = r2.entrySet();
        if ((r3 instanceof Collection) == false) goto L11;
        int r0 = r3.size();
    L12:
        ue1 r1 = new ue1(r0);
        r1.y(r3);
        return r1.d(true);
    L11:
        r0 = 4;
        goto L12
    L5:
        if ((r2 instanceof SortedMap) == true) goto L8;
        return (bx1) r2;
    }

    public abstract iy3 c();

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
        return f().contains(r1);
    }

    public abstract jy3 d();

    public abstract rw1 e();

    @Override // java.util.Map
    public final Set entrySet() {
        jx1 r0 = this.n;
        if (r0 != null) goto L6;
        iy3 r1 = c();
        this.n = r1;
        return r1;
    L6:
        return r0;
    }

    @Override // java.util.Map
    public final boolean equals(Object r1) {
        return vr1.o(r1, this);
    }

    public rw1 f() {
        rw1 r0 = this.p;
        if (r0 != null) goto L6;
        rw1 r1 = e();
        this.p = r1;
        return r1;
    L6:
        return r0;
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
        jx1 r0 = this.n;
        if (r0 != null) goto L6;
        r0 = c();
        this.n = r0;
    L6:
        return j51.x(r0);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        if (size() != 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.Map
    public final Set keySet() {
        jx1 r0 = this.o;
        if (r0 != null) goto L6;
        jy3 r1 = d();
        this.o = r1;
        return r1;
    L6:
        return r0;
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
        int r0 = size();
        uc5.f(r0, "size");
        StringBuilder r1 = new StringBuilder((int) Math.min(((long) r0) * 8, 1073741824));
        r1.append('{');
        Iterator r6 = entrySet().iterator();
        boolean r2 = true;
    L4:
        if (r6.hasNext() == false) goto L9;
        Map.Entry r3 = (Map.Entry) r6.next();
        if (r2 == true) goto L8;
        r1.append(", ");
    L8:
        r1.append(r3.getKey());
        r1.append('=');
        r1.append(r3.getValue());
        r2 = false;
        goto L4
    L9:
        r1.append('}');
        return r1.toString();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Collection values() {
        return f();
    }
}
