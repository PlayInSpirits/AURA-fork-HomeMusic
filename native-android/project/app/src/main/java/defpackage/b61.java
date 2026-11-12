package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class b61 implements Map.Entry, x32 {
    public final Object n;
    public final da2 o;
    public b61 p;
    public b61 q;
    public boolean r;

    public b61(aa2 r1, da2 r2) {
        this.n = r1;
        this.o = r2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b61) == false) goto L10;
        b61 r6 = (b61) r5;
        if (h12.c(this.n, r6.n) == false) goto L10;
        if (this.o == r6.o) goto L14;
        return false;
    L14:
        return true;
    L10:
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.n;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.o;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object r0 = this.n;
        if (r0 != null) goto L5;
        int r1 = 0;
    L6:
        int r2 = this.o.hashCode();
        return r2 + (r1 * 31);
    L5:
        r1 = r0.hashCode();
        goto L6
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object r1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        return "Entry(key=" + this.n + ", value=" + this.o + ")";
    }
}
