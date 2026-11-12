package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yf2 implements Map.Entry, z32 {
    public final ag2 n;
    public final int o;
    public final int p;

    public yf2(ag2 ag2Var, int i) {
        ag2Var.getClass();
        this.n = ag2Var;
        this.o = i;
        this.p = ag2Var.u;
    }

    public final void a() {
        if (this.n.u != this.p) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return h12.c(entry.getKey(), getKey()) && h12.c(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        a();
        return this.n.n[this.o];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        Object[] objArr = this.n.o;
        objArr.getClass();
        return objArr[this.o];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        ag2 ag2Var = this.n;
        ag2Var.c();
        Object[] objArr = ag2Var.o;
        if (objArr == null) {
            int length = ag2Var.n.length;
            if (length < 0) {
                kf2.n("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            ag2Var.o = objArr;
        }
        int i = this.o;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
