package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class b61 implements Map.Entry, x32 {
    public final Object n;
    public final da2 o;
    public b61 p;
    public b61 q;
    public boolean r;

    public b61(aa2 aa2Var, da2 da2Var) {
        this.n = aa2Var;
        this.o = da2Var;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b61) {
            b61 b61Var = (b61) obj;
            return h12.c(this.n, b61Var.n) && this.o == b61Var.o;
        }
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
        Object obj = this.n;
        return this.o.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        return "Entry(key=" + this.n + ", value=" + this.o + ")";
    }
}
