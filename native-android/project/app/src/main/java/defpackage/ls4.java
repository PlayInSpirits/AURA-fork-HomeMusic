package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ls4 {
    public final he a;
    public final zs4 b;
    public final List c;
    public final int d;
    public final boolean e;
    public final int f;
    public final oo0 g;
    public final r62 h;
    public final ha1 i;
    public final long j;

    public ls4(he r1, zs4 r2, List r3, int r4, boolean r5, int r6, oo0 r7, r62 r8, ha1 r9, long r10) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.e = r5;
        this.f = r6;
        this.g = r7;
        this.h = r8;
        this.i = r9;
        this.j = r10;
    }

    public final boolean equals(Object r3) {
        if (this != r3) goto L5;
        return true;
    L5:
        if ((r3 instanceof ls4) == false) goto L41;
        ls4 r4 = (ls4) r3;
        he r0 = r4.a;
        if (h12.c(this.a, r0) == true) goto L11;
        return false;
    L11:
        if (h12.c(this.b, r4.b) == true) goto L14;
        return false;
    L14:
        if (this.c.equals(r4.c) == true) goto L17;
        return false;
    L17:
        if (this.d == r4.d) goto L20;
        return false;
    L20:
        if (this.e == r4.e) goto L23;
        return false;
    L23:
        if (this.f == r4.f) goto L25;
        return false;
    L25:
        if (h12.c(this.g, r4.g) == true) goto L28;
        return false;
    L28:
        if (this.h == r4.h) goto L31;
        return false;
    L31:
        if (h12.c(this.i, r4.i) == true) goto L34;
        return false;
    L34:
        if (nc0.b(this.j, r4.j) == false) goto L50;
        return true;
    L50:
        return false;
    L41:
        return false;
    }

    public final int hashCode() {
        int r0 = this.a.hashCode() * 31;
        int r2 = (this.b.hashCode() + r0) * 31;
        int r1 = xa3.c((((this.c.hashCode() + r2) * 31) + this.d) * 31, 31, this.e);
        int r3 = f34.d(this.f, r1, 31);
        int r4 = (this.g.hashCode() + r3) * 31;
        int r5 = (this.h.hashCode() + r4) * 31;
        int r6 = (this.i.hashCode() + r5) * 31;
        return Long.hashCode(this.j) + r6;
    }

    public final String toString() {
        int r1 = this.f;
        if (r1 != 1) goto L6;
        String r0 = "Clip";
    L19:
        return "TextLayoutInput(text=" + this.a + ", style=" + this.b + ", placeholders=" + this.c + ", maxLines=" + this.d + ", softWrap=" + this.e + ", overflow=" + r0 + ", density=" + this.g + ", layoutDirection=" + this.h + ", fontFamilyResolver=" + this.i + ", constraints=" + nc0.k(this.j) + ")";
    L6:
        if (r1 != 2) goto L9;
        r0 = "Ellipsis";
        goto L19
    L9:
        if (r1 != 5) goto L12;
        r0 = "MiddleEllipsis";
        goto L19
    L12:
        if (r1 != 3) goto L15;
        r0 = "Visible";
        goto L19
    L15:
        if (r1 != 4) goto L17;
        r0 = "StartEllipsis";
        goto L19
    L17:
        r0 = "Invalid";
        goto L19
    }
}
