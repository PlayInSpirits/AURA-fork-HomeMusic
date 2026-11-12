package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class b45 extends d45 implements Iterable, x32 {
    public final String n;
    public final float o;
    public final float p;
    public final float q;
    public final float r;
    public final float s;
    public final float t;
    public final float u;
    public final List v;
    public final List w;

    public b45(String r1, float r2, float r3, float r4, float r5, float r6, float r7, float r8, List r9, ArrayList r10) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
        this.q = r4;
        this.r = r5;
        this.s = r6;
        this.t = r7;
        this.u = r8;
        this.v = r9;
        this.w = r10;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L34:
        return false;
    L8:
        if ((r5 instanceof b45) == false) goto L34;
        b45 r6 = (b45) r5;
        String r2 = r6.n;
        if (h12.c(this.n, r2) == true) goto L14;
        return false;
    L14:
        if (this.o != r6.o) goto L34;
        if (this.p != r6.p) goto L34;
        if (this.q != r6.q) goto L34;
        if (this.r != r6.r) goto L34;
        if (this.s != r6.s) goto L34;
        if (this.t != r6.t) goto L34;
        if (this.u != r6.u) goto L34;
        if (h12.c(this.v, r6.v) == true) goto L31;
        return false;
    L31:
        if (h12.c(this.w, r6.w) == true) goto L33;
        return false;
    L33:
        return true;
    }

    public final int hashCode() {
        int r0 = b11.d(b11.d(b11.d(b11.d(b11.d(b11.d(b11.d(this.n.hashCode() * 31, this.o, 31), this.p, 31), this.q, 31), this.r, 31), this.s, 31), this.t, 31), this.u, 31);
        int r2 = (this.v.hashCode() + r0) * 31;
        return this.w.hashCode() + r2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new rf3(this);
    }
}
