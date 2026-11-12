package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class po2 {
    public final mt2 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    public po2(mt2 r8, long r9, long r11, long r13, long r15, boolean r17, boolean r18, boolean r19, boolean r20, boolean r21) {
        boolean r4 = true;
        if (r21 == false) goto L7;
        if (r19 == true) goto L7;
        boolean r6 = false;
    L8:
        rr2.l(r6);
        if (r20 == false) goto L13;
        if (r19 == true) goto L13;
        boolean r7 = false;
    L14:
        rr2.l(r7);
        if (r18 == false) goto L21;
        if (r19 == true) goto L20;
        if (r20 == true) goto L20;
        if (r21 == false) goto L21;
    L20:
        r4 = false;
    L21:
        rr2.l(r4);
        this.a = r8;
        this.b = r9;
        this.c = r11;
        this.d = r13;
        this.e = r15;
        this.f = r17;
        this.g = r18;
        this.h = r19;
        this.i = r20;
        this.j = r21;
        return;
    L13:
        r7 = true;
    L7:
        r6 = true;
        goto L8
    }

    public final po2 a(long r18) {
        if (r18 != this.c) goto L5;
        return this;
    L5:
        boolean r15 = this.i;
        boolean r1 = this.j;
        return new po2(this.a, this.b, r18, this.d, this.e, this.f, this.g, this.h, r15, r1);
    }

    public final po2 b(long r18) {
        if (r18 != this.b) goto L5;
        return this;
    L5:
        boolean r15 = this.i;
        boolean r1 = this.j;
        return new po2(this.a, r18, this.c, this.d, this.e, this.f, this.g, this.h, r15, r1);
    }

    public final boolean equals(Object r7) {
        if (this != r7) goto L6;
        return true;
    L6:
        if (r7 != null) goto L8;
    L31:
        return false;
    L8:
        if (po2.class != r7.getClass()) goto L31;
        po2 r8 = (po2) r7;
        if (this.b != r8.b) goto L31;
        if (this.c != r8.c) goto L31;
        if (this.d != r8.d) goto L31;
        if (this.e != r8.e) goto L31;
        if (this.f != r8.f) goto L31;
        if (this.g != r8.g) goto L31;
        if (this.h != r8.h) goto L31;
        if (this.i != r8.i) goto L31;
        if (this.j != r8.j) goto L31;
        if (Objects.equals(this.a, r8.a) == false) goto L31;
        return true;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.a.hashCode() + 527) * 31) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + (this.j ? 1 : 0);
    }
}
