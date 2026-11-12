package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hg4 {
    public final ig4 a;
    public final int[] b;
    public final int c;
    public Object[] d;
    public final int e;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public final o02 j;
    public int k;
    public int l;
    public int m;
    public boolean n;

    public hg4(ig4 r3) {
        this.a = r3;
        this.b = r3.n;
        int r0 = r3.o;
        this.c = r0;
        this.d = r3.p;
        this.e = r3.q;
        this.h = r0;
        this.i = -1;
        this.j = new o02();
    }

    public final mg1 a(int r3) {
        ArrayList r0 = this.a.v;
        int r2 = kg4.e(r0, r3, this.c);
        if (r2 >= 0) goto L7;
        mg1 r1 = new mg1(r3);
        r0.add(-(r2 + 1), r1);
        return r1;
    L7:
        return (mg1) r0.get(r2);
    }

    public final Object b(int[] r3, int r4) {
        int r5 = r4 * 5;
        int r0 = r3[r5 + 1];
        if ((268435456 & r0) == 0) goto L11;
        Object[] r2 = this.d;
        if (r5 < r3.length) goto L7;
        int r6 = r3.length;
    L9:
        return r2[r6];
    L7:
        r6 = r3[r5 + 4] + Integer.bitCount(r0 >> 29);
        goto L9
    L11:
        return j80.a;
    }

    public final void c() {
        this.f = true;
        ig4 r0 = this.a;
        if (r0.r > 0) goto L6;
        l80.a("Unexpected reader close()");
    L6:
        r0.r--;
        this.d = new Object[0];
    }

    public final boolean d(int r2) {
        int[] r1 = this.b;
        if ((r1[(r2 * 5) + 1] & 67108864) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    public final void e() {
        if (this.k == 0) goto L5;
        return;
    L5:
        if (this.g == this.h) goto L8;
        l80.a("endGroup() not called at the end of a group");
    L8:
        int r0 = (this.i * 5) + 2;
        int[] r1 = this.b;
        int r2 = r1[r0];
        this.i = r2;
        int r3 = this.c;
        if (r2 >= 0) goto L11;
        int r4 = r3;
    L12:
        this.h = r4;
        int r5 = this.j.b();
        if (r5 >= 0) goto L16;
        this.l = 0;
        this.m = 0;
        return;
    L16:
        this.l = r5;
        if (r2 < (r3 - 1)) goto L19;
        int r6 = this.e;
    L20:
        this.m = r6;
        return;
    L19:
        r6 = r1[((r2 + 1) * 5) + 4];
        goto L20
    L11:
        r4 = r1[(r2 * 5) + 3] + r2;
        goto L12
    }

    public final Object f() {
        int r0 = this.g;
        if (r0 >= this.h) goto L7;
        return b(this.b, r0);
    L7:
        return 0;
    }

    public final int g() {
        int r0 = this.g;
        if (r0 >= this.h) goto L6;
        int[] r2 = this.b;
        return r2[r0 * 5];
    L6:
        return 0;
    }

    public final Object h(int r4, int r5) {
        int[] r0 = this.b;
        int r1 = kg4.b(r0, r4);
        int r6 = r4 + 1;
        if (r6 >= this.c) goto L5;
        int r7 = r0[(r6 * 5) + 4];
    L6:
        int r2 = r1 + r5;
        if (r2 >= r7) goto L11;
        return this.d[r2];
    L11:
        return j80.a;
    L5:
        r7 = this.e;
        goto L6
    }

    public final int i(int r1) {
        int[] r0 = this.b;
        return r0[r1 * 5];
    }

    public final boolean j(int r2) {
        int[] r1 = this.b;
        if ((r1[(r2 * 5) + 1] & 134217728) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    public final boolean k(int r2) {
        int[] r1 = this.b;
        if ((r1[(r2 * 5) + 1] & 536870912) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    public final boolean l(int r2) {
        int[] r1 = this.b;
        if ((r1[(r2 * 5) + 1] & 1073741824) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    public final Object m() {
        if (this.k > 0) goto L9;
        int r0 = this.l;
        if (r0 >= this.m) goto L9;
        this.n = true;
        Object[] r1 = this.d;
        this.l = r0 + 1;
        return r1[r0];
    L9:
        this.n = false;
        return j80.a;
    }

    public final Object n(int r4) {
        int r5 = r4 * 5;
        int[] r1 = this.b;
        int r0 = r1[r5 + 1] & 1073741824;
        if (r0 == 0) goto L9;
        if (r0 == 0) goto L8;
        return this.d[r1[r5 + 4]];
    L8:
        return j80.a;
    L9:
        return null;
    }

    public final int o(int r1) {
        int[] r0 = this.b;
        return r0[(r1 * 5) + 1] & 67108863;
    }

    public final Object p(int[] r3, int r4) {
        int r5 = r4 * 5;
        int r0 = r3[r5 + 1];
        if ((536870912 & r0) == 0) goto L6;
        Object[] r2 = this.d;
        int r6 = r3[r5 + 4];
        return r2[Integer.bitCount(r0 >> 30) + r6];
    L6:
        return null;
    }

    public final int q(int r1) {
        int[] r0 = this.b;
        return r0[(r1 * 5) + 2];
    }

    public final void r(int r4) {
        if (this.k == 0) goto L6;
        l80.a("Cannot reposition while in an empty region");
    L6:
        this.g = r4;
        int[] r0 = this.b;
        int r1 = this.c;
        if (r4 >= r1) goto L9;
        int r5 = r0[(r4 * 5) + 2];
    L11:
        if (r5 == this.i) goto L18;
        this.i = r5;
        if (r5 >= 0) goto L15;
        this.h = r1;
    L16:
        this.l = 0;
        this.m = 0;
        return;
    L15:
        this.h = r0[(r5 * 5) + 3] + r5;
        goto L16
    L18:
        return;
    L9:
        r5 = -1;
        goto L11
    }

    public final int s() {
        if (this.k == 0) goto L6;
        l80.a("Cannot skip while in an empty region");
    L6:
        int r0 = this.g;
        int r1 = r0 * 5;
        int[] r3 = this.b;
        int r2 = r3[r1 + 1];
        if ((1073741824 & r2) == 0) goto L9;
        int r4 = 1;
    L10:
        this.g = r3[r1 + 3] + r0;
        return r4;
    L9:
        r4 = r2 & 67108863;
        goto L10
    }

    public final void t() {
        if (this.k != 0) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == true) goto L8;
        l80.a("Cannot skip the enclosing group while in an empty region");
    L8:
        this.g = this.h;
        this.l = 0;
        this.m = 0;
        return;
    L5:
        r0 = false;
        goto L6
    }

    public final String toString() {
        int r0 = this.g;
        int r1 = g();
        int r2 = this.i;
        int r6 = this.h;
        StringBuilder r3 = b11.t("SlotReader(current=", ", key=", r0, r1, ", parent=");
        r3.append(r2);
        r3.append(", end=");
        r3.append(r6);
        r3.append(")");
        return r3.toString();
    }

    public final void u() {
        if (this.k > 0) goto L19;
        int r0 = this.i;
        int r1 = this.g;
        int r2 = r1 * 5;
        int[] r4 = this.b;
        if (r4[r2 + 2] == r0) goto L8;
        oo3.a("Invalid slot table detected");
    L8:
        int r3 = this.l;
        int r5 = this.m;
        o02 r6 = this.j;
        if (r3 != 0) goto L12;
        if (r5 != 0) goto L12;
        r6.c(-1);
    L13:
        this.i = r1;
        this.h = r4[r2 + 3] + r1;
        int r7 = r1 + 1;
        this.g = r7;
        this.l = kg4.b(r4, r1);
        if (r1 < (this.c - 1)) goto L16;
        int r8 = this.e;
    L17:
        this.m = r8;
        return;
    L16:
        r8 = r4[(r7 * 5) + 4];
    L12:
        r6.c(r3);
        goto L13
    }
}
