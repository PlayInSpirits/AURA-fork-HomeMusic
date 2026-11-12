package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a6 implements gg1, Serializable {
    public final Object n;
    public final Class o;
    public final String p;
    public final String q;
    public final boolean r = false;
    public final int s;
    public final int t;

    public a6(int i, int i2, Class cls, Object obj, String str, String str2) {
        this.n = obj;
        this.o = cls;
        this.p = str;
        this.q = str2;
        this.s = i;
        this.t = i2 >> 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a6)) {
            return false;
        }
        a6 a6Var = (a6) obj;
        return this.r == a6Var.r && this.s == a6Var.s && this.t == a6Var.t && h12.c(this.n, a6Var.n) && this.o.equals(a6Var.o) && this.p.equals(a6Var.p) && this.q.equals(a6Var.q);
    }

    @Override // defpackage.gg1
    public final int getArity() {
        return this.s;
    }

    public final int hashCode() {
        Object obj = this.n;
        return ((((f34.e(this.q, f34.e(this.p, (this.o.hashCode() + ((obj != null ? obj.hashCode() : 0) * 31)) * 31, 31), 31) + (this.r ? 1231 : 1237)) * 31) + this.s) * 31) + this.t;
    }

    public final String toString() {
        kx3.a.getClass();
        return lx3.a(this);
    }
}
