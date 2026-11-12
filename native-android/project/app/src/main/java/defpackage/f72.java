package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class f72 {
    public final c72 a;
    public boolean b;
    public boolean c;
    public y62 d;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public int l;
    public boolean m;
    public boolean n;
    public int o;
    public final ti2 p;
    public if2 q;

    public f72(c72 r1) {
        this.a = r1;
        this.d = y62.r;
        this.p = new ti2(this);
    }

    public final f63 a() {
        return (f63) this.a.Q.e;
    }

    public final void b() {
        y62 r0 = this.a.R.d;
        y62 r1 = y62.p;
        y62 r2 = y62.q;
        if (r0 == r1) goto L6;
        if (r0 == r2) goto L6;
    L9:
        if (r0 != r2) goto L18;
        if2 r3 = this.q;
        if (r3 != null) goto L13;
    L16:
        h(true);
        return;
    L13:
        if (r3.G != true) goto L16;
        i(true);
        return;
    L18:
        return;
    L6:
        if (this.p.K == false) goto L8;
        g(true);
        goto L9
    L8:
        f(true);
        goto L9
    }

    public final void c(long r4) {
        if2 r3 = this.q;
        if (r3 == null) goto L10;
        f72 r0 = r3.s;
        r0.d = y62.o;
        c72 r1 = r0.a;
        r0.e = false;
        r3.I = r4;
        wb3 r5 = ((ra) h12.L(r1)).getSnapshotObserver();
        gf2 r6 = r3.J;
        k52 r7 = r5.b;
        r5.a.e(r1, r7, r6);
        r0.f = true;
        r0.g = true;
        boolean r8 = h12.A(r1);
        ti2 r9 = r0.p;
        if (r8 == false) goto L7;
        r9.F = true;
        r9.G = true;
    L8:
        r0.d = y62.r;
        return;
    L7:
        r9.E = true;
        goto L8
    }

    public final void d(int r4) {
        int r0 = this.l;
        this.l = r4;
        boolean r1 = false;
        if (r0 != 0) goto L5;
        boolean r2 = true;
    L6:
        if (r4 != 0) goto L8;
        r1 = true;
    L8:
        if (r2 == r1) goto L20;
        c72 r3 = this.a.t();
        if (r3 == null) goto L12;
        f72 r5 = r3.R;
    L13:
        if (r5 == null) goto L21;
        int r6 = r5.l;
        if (r4 != 0) goto L18;
        r5.d(r6 - 1);
        return;
    L18:
        r5.d(r6 + 1);
        return;
    L21:
        return;
    L12:
        r5 = null;
        goto L13
    L20:
        return;
    L5:
        r2 = false;
        goto L6
    }

    public final void e(int r4) {
        int r0 = this.o;
        this.o = r4;
        boolean r1 = false;
        if (r0 != 0) goto L5;
        boolean r2 = true;
    L6:
        if (r4 != 0) goto L8;
        r1 = true;
    L8:
        if (r2 == r1) goto L20;
        c72 r3 = this.a.t();
        if (r3 == null) goto L12;
        f72 r5 = r3.R;
    L13:
        if (r5 == null) goto L21;
        int r6 = r5.o;
        if (r4 != 0) goto L18;
        r5.e(r6 - 1);
        return;
    L18:
        r5.e(r6 + 1);
        return;
    L21:
        return;
    L12:
        r5 = null;
        goto L13
    L20:
        return;
    L5:
        r2 = false;
        goto L6
    }

    public final void f(boolean r2) {
        if (this.k == r2) goto L15;
        this.k = r2;
        if (r2 == true) goto L7;
    L10:
        if (r2 == false) goto L12;
        return;
    L12:
        if (this.j == true) goto L17;
        d(this.l - 1);
        return;
    L17:
        return;
    L7:
        if (this.j == true) goto L10;
        d(this.l + 1);
        return;
    }

    public final void g(boolean r2) {
        if (this.j == r2) goto L15;
        this.j = r2;
        if (r2 == true) goto L7;
    L10:
        if (r2 == false) goto L12;
        return;
    L12:
        if (this.k == true) goto L17;
        d(this.l - 1);
        return;
    L17:
        return;
    L7:
        if (this.k == true) goto L10;
        d(this.l + 1);
        return;
    }

    public final void h(boolean r2) {
        if (this.n == r2) goto L15;
        this.n = r2;
        if (r2 == true) goto L7;
    L10:
        if (r2 == false) goto L12;
        return;
    L12:
        if (this.m == true) goto L17;
        e(this.o - 1);
        return;
    L17:
        return;
    L7:
        if (this.m == true) goto L10;
        e(this.o + 1);
        return;
    }

    public final void i(boolean r2) {
        if (this.m == r2) goto L15;
        this.m = r2;
        if (r2 == true) goto L7;
    L10:
        if (r2 == false) goto L12;
        return;
    L12:
        if (this.n == true) goto L17;
        e(this.o - 1);
        return;
    L17:
        return;
    L7:
        if (this.n == true) goto L10;
        e(this.o + 1);
        return;
    }

    public final void j() {
        this.p.s.a().t();
        if2 r1 = this.q;
        if (r1 == null) goto L6;
        ef2 r2 = r1.s.a().y0();
        r2.getClass();
        r2.t();
        return;
    }
}
