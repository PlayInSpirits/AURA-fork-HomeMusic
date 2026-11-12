package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class f44 implements Map.Entry {
    public final Object n;
    public final Object o;
    public f44 p;
    public f44 q;

    public f44(Object r1, Object r2) {
        this.n = r1;
        this.o = r2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object r3) {
        if (r3 != this) goto L5;
        return true;
    L5:
        if ((r3 instanceof f44) == false) goto L17;
        f44 r4 = (f44) r3;
        if (this.n.equals(r4.n) == true) goto L10;
        return false;
    L10:
        if (this.o.equals(r4.o) == false) goto L16;
        return true;
    L16:
        return false;
    L17:
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
        int r0 = this.n.hashCode();
        return this.o.hashCode() ^ r0;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object r1) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.n + "=" + this.o;
    }
}
