package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a6 implements gg1, Serializable {
    public final Object n;
    public final Class o;
    public final String p;
    public final String q;
    public final boolean r;
    public final int s;
    public final int t;

    public a6(int r1, int r2, Class r3, Object r4, String r5, String r6) {
        this.n = r4;
        this.o = r3;
        this.p = r5;
        this.q = r6;
        this.r = false;
        this.s = r1;
        this.t = r2 >> 1;
    }

    public final boolean equals(Object r3) {
        if (this != r3) goto L5;
        return true;
    L5:
        if ((r3 instanceof a6) == false) goto L32;
        a6 r4 = (a6) r3;
        if (this.r == r4.r) goto L10;
        return false;
    L10:
        if (this.s == r4.s) goto L12;
        return false;
    L12:
        if (this.t == r4.t) goto L14;
        return false;
    L14:
        if (h12.c(this.n, r4.n) == true) goto L16;
        return false;
    L16:
        if (this.o.equals(r4.o) == true) goto L18;
        return false;
    L18:
        if (this.p.equals(r4.p) == true) goto L20;
        return false;
    L20:
        if (this.q.equals(r4.q) == false) goto L31;
        return true;
    L31:
        return false;
    L32:
        return false;
    }

    @Override // defpackage.gg1
    public final int getArity() {
        return this.s;
    }

    public final int hashCode() {
        Object r0 = this.n;
        if (r0 == null) goto L5;
        int r1 = r0.hashCode();
    L6:
        int r2 = this.o.hashCode();
        int r3 = (r2 + (r1 * 31)) * 31;
        int r4 = f34.e(this.p, r3, 31);
        int r5 = f34.e(this.q, r4, 31);
        if (this.r == false) goto L9;
        int r6 = 1231;
    L11:
        return ((((r5 + r6) * 31) + this.s) * 31) + this.t;
    L9:
        r6 = 1237;
        goto L11
    L5:
        r1 = 0;
        goto L6
    }

    public final String toString() {
        kx3.a.getClass();
        return lx3.a(this);
    }
}
