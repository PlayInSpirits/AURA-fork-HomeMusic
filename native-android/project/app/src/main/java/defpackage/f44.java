package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class f44 implements Map.Entry {
    public final Object n;
    public final Object o;
    public f44 p;
    public f44 q;

    public f44(Object obj, Object obj2) {
        this.n = obj;
        this.o = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f44)) {
            return false;
        }
        f44 f44Var = (f44) obj;
        return this.n.equals(f44Var.n) && this.o.equals(f44Var.o);
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
        return this.o.hashCode() ^ this.n.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.n + "=" + this.o;
    }
}
