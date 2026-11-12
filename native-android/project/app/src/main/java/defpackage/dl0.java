package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dl0 extends uo implements Map {
    public final Map u;

    public dl0(Map r2) {
        super(10);
        this.u = r2;
    }

    @Override // java.util.Map
    public final void clear() {
        this.u.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object r1) {
        if (r1 != null) goto L4;
        return false;
    L4:
        if (this.u.containsKey(r1) == false) goto L9;
        return true;
    L9:
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object r2) {
        Iterator r1 = ((hb4) entrySet()).iterator();
        r1.getClass();
        if (r2 != null) goto L10;
    L5:
        if (r1.hasNext() == false) goto L15;
        if (((Map.Entry) r1.next()).getValue() != null) goto L5;
        return true;
    L15:
        return false;
    L10:
        if (r1.hasNext() == false) goto L24;
        if (r2.equals(((Map.Entry) r1.next()).getValue()) == false) goto L10;
        return true;
    L24:
        return false;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return j51.s(this.u.entrySet(), new cl0(0));
    }

    @Override // java.util.Map
    public final boolean equals(Object r1) {
        if (r1 != null) goto L4;
        return false;
    L4:
        if (vr1.o(r1, this) == false) goto L9;
        return true;
    L9:
        return false;
    }

    @Override // java.util.Map
    public final Object get(Object r1) {
        if (r1 != null) goto L6;
        return null;
    L6:
        return (List) this.u.get(r1);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return j51.x(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        Map r2 = this.u;
        if (r2.isEmpty() == false) goto L5;
    L11:
        return true;
    L5:
        if (r2.size() == 1) goto L7;
        return false;
    L7:
        if (r2.containsKey(null) == true) goto L11;
        return false;
    }

    @Override // java.util.Map
    public final Set keySet() {
        return j51.s(this.u.keySet(), new cl0(1));
    }

    @Override // defpackage.uo
    public final Object o() {
        return this.u;
    }

    @Override // java.util.Map
    public final Object put(Object r1, Object r2) {
        return this.u.put(r1, r2);
    }

    @Override // java.util.Map
    public final void putAll(Map r1) {
        this.u.putAll(r1);
    }

    @Override // java.util.Map
    public final Object remove(Object r1) {
        return this.u.remove(r1);
    }

    @Override // java.util.Map
    public final int size() {
        Map r2 = this.u;
        return r2.size() - (r2.containsKey(null) ? 1 : 0);
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.u.values();
    }
}
