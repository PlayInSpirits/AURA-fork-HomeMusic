package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class f45 extends d45 {
    public final float A;
    public final String n;
    public final List o;
    public final int p;
    public final uo q;
    public final float r;
    public final uo s;
    public final float t;
    public final float u;
    public final int v;
    public final int w;
    public final float x;
    public final float y;
    public final float z;

    public f45(String r1, List r2, int r3, uo r4, float r5, uo r6, float r7, float r8, int r9, int r10, float r11, float r12, float r13, float r14) {
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
        this.x = r11;
        this.y = r12;
        this.z = r13;
        this.A = r14;
    }

    public final boolean equals(Object r3) {
        if (this == r3) goto L44;
        if (r3 != null) goto L6;
        return false;
    L6:
        if (f45.class != r3.getClass()) goto L55;
        f45 r4 = (f45) r3;
        if (this.n.equals(r4.n) == true) goto L12;
        return false;
    L12:
        if (h12.c(this.q, r4.q) == true) goto L15;
        return false;
    L15:
        if (this.r == r4.r) goto L17;
        return false;
    L17:
        if (h12.c(this.s, r4.s) == true) goto L20;
        return false;
    L20:
        if (this.t == r4.t) goto L22;
        return false;
    L22:
        if (this.u == r4.u) goto L24;
        return false;
    L24:
        if (this.v == r4.v) goto L26;
        return false;
    L26:
        if (this.w == r4.w) goto L28;
        return false;
    L28:
        if (this.x == r4.x) goto L30;
        return false;
    L30:
        if (this.y == r4.y) goto L32;
        return false;
    L32:
        if (this.z == r4.z) goto L34;
        return false;
    L34:
        if (this.A == r4.A) goto L36;
        return false;
    L36:
        if (this.p == r4.p) goto L38;
        return false;
    L38:
        if (h12.c(this.o, r4.o) == false) goto L59;
        return true;
    L59:
        return false;
    L55:
        return false;
    L44:
        return true;
    }

    public final int hashCode() {
        int r2 = (this.o.hashCode() + (this.n.hashCode() * 31)) * 31;
        int r0 = 0;
        uo r3 = this.q;
        if (r3 == null) goto L5;
        int r4 = r3.hashCode();
    L6:
        int r5 = b11.d((r2 + r4) * 31, this.r, 31);
        uo r6 = this.s;
        if (r6 == null) goto L10;
        r0 = r6.hashCode();
    L10:
        return Integer.hashCode(this.p) + b11.d(b11.d(b11.d(b11.d(f34.d(this.w, f34.d(this.v, b11.d(b11.d((r5 + r0) * 31, this.t, 31), this.u, 31), 31), 31), this.x, 31), this.y, 31), this.z, 31), this.A, 31);
    L5:
        r4 = 0;
        goto L6
    }
}
