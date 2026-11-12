package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kd3 implements Serializable {
    public final Object n;
    public final Object o;

    public kd3(Object obj, Object obj2) {
        this.n = obj;
        this.o = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kd3)) {
            return false;
        }
        kd3 kd3Var = (kd3) obj;
        return h12.c(this.n, kd3Var.n) && h12.c(this.o, kd3Var.o);
    }

    public final int hashCode() {
        Object obj = this.n;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.o;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.n + ", " + this.o + ')';
    }
}
