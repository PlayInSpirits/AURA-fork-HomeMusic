package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ez3 {
    public boolean a;
    public boolean b;
    public int c;
    public int d;
    public Object e;
    public Object f;

    public static void b(kq r3) {
        int r0 = r3.u;
        if (r0 == 2) goto L5;
        return;
    L5:
        if (r0 != 2) goto L7;
        boolean r1 = true;
    L8:
        rr2.w(r1);
        r3.u = 1;
        r3.w();
        return;
    L7:
        r1 = false;
        goto L8
    }

    public static boolean h(kq r0) {
        if (r0.u == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public static void l(kq r1, long r2) {
        r1.A = true;
        if ((r1 instanceof ts4) == false) goto L6;
        ts4 r3 = (ts4) r1;
        rr2.w(r3.A);
        r3.X = r2;
        return;
    }

    public void a(kq r4, xl0 r5) {
        boolean r2 = true;
        if (((kq) this.e) != r4) goto L5;
    L8:
        boolean r3 = true;
    L9:
        rr2.w(r3);
        if (h(r4) == true) goto L13;
        return;
    L13:
        if (r4 != r5.p) goto L15;
        r5.q = null;
        r5.p = null;
        r5.r = true;
    L15:
        b(r4);
        if (r4.u == 1) goto L19;
        r2 = false;
    L19:
        rr2.w(r2);
        r4.p.d();
        r4.u = 0;
        r4.v = null;
        r4.w = null;
        r4.A = false;
        r4.p();
        r4.D = null;
        return;
    L5:
        if (((kq) this.f) == r4) goto L8;
        r3 = false;
        goto L9
    }

    public int c() {
        boolean r0 = h((kq) this.e);
        kq r1 = (kq) this.f;
        if (r1 != null) goto L5;
    L7:
        int r2 = 0;
    L9:
        return (r0 ? 1 : 0) + r2;
    L5:
        if (h(r1) == false) goto L7;
        r2 = 1;
        goto L9
    }

    public kq d(oo2 r4) {
        if (r4 == null) goto L15;
        q44 r5 = r4.c[this.c];
        if (r5 == null) goto L15;
        kq r1 = (kq) this.e;
        if (r1.v != r5) goto L10;
        return r1;
    L10:
        kq r3 = (kq) this.f;
        if (r3 == null) goto L15;
        if (r3.v != r5) goto L15;
        return r3;
    L15:
        return null;
    }

    public boolean e(oo2 r6, kq r7) {
        int r5 = this.c;
        if (r7 == null) goto L37;
        q44 r0 = r6.c[r5];
        q44 r1 = r7.v;
        if (r1 == null) goto L30;
        if (r1 != r0) goto L23;
        if (r0 != null) goto L10;
        return true;
    L10:
        if (r7.l() == true) goto L34;
        oo2 r2 = r6.m;
        if (r6.g.g == false) goto L23;
        if (r2 == null) goto L23;
        if (r2.e == false) goto L23;
        if ((r7 instanceof ts4) == false) goto L19;
        return true;
    L19:
        if ((r7 instanceof yv2) == false) goto L21;
        return true;
    L21:
        if (r7.z < r2.e()) goto L23;
        return true;
    L34:
        return true;
    L23:
        oo2 r8 = r6.m;
        if (r8 != null) goto L26;
        return false;
    L26:
        if (r8.c[r5] == r7.v) goto L39;
        return false;
    L39:
        return true;
    L30:
        return true;
    L37:
        return true;
    }

    public boolean f() {
        int r1 = this.d;
        if (r1 != 2) goto L5;
        return true;
    L5:
        if (r1 != 4) goto L8;
        return true;
    L8:
        if (r1 == 3) goto L15;
        return false;
    L15:
        return true;
    }

    public boolean g() {
        int r0 = this.d;
        if (r0 == 0) goto L16;
        if (r0 == 2) goto L16;
        if (r0 == 4) goto L16;
        kq r2 = (kq) this.f;
        r2.getClass();
        if (r2.u == 0) goto L13;
        return true;
    L13:
        return false;
    L16:
        return h((kq) this.e);
    }

    public void i(boolean r4) {
        boolean r0 = true;
        if (r4 == false) goto L13;
        if (this.a == false) goto L20;
        kq r5 = (kq) this.e;
        if (r5.u == 0) goto L10;
        r0 = false;
    L10:
        rr2.w(r0);
        r5.p.d();
        r5.u();
        this.a = false;
        return;
    L20:
        return;
    L13:
        if (this.b == false) goto L21;
        kq r6 = (kq) this.f;
        r6.getClass();
        if (r6.u == 0) goto L18;
        r0 = false;
    L18:
        rr2.w(r0);
        r6.p.d();
        r6.u();
        this.b = false;
        return;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int j(kq r12, oo2 r13, ew4 r14, xl0 r15) {
        kq r4 = (kq) this.e;
        int r5 = this.c;
        if (r12 != null) goto L5;
    L47:
        return 1;
    L5:
        if (r12.u == 0) goto L47;
        if (r12 != r4) goto L13;
        int r7 = this.d;
        if (r7 != 2) goto L10;
    L11:
        return 1;
    L10:
        if (r7 == 4) goto L11;
    L13:
        if (r12 == ((kq) this.f)) goto L15;
    L17:
        boolean r10 = false;
        int r11 = 0;
        if (r12.v == r13.c[r5]) goto L20;
        Object[] r8 = true;
    L21:
        boolean r9 = r14.n(r5);
        if (r9 == false) goto L26;
        if (r8 == false) goto L47;
    L26:
        if (r12.A == true) goto L37;
        t41 r0 = ((t41[]) r14.q)[r5];
        if (r0 == null) goto L30;
        int r3 = r0.length();
    L31:
        tb1[] r1 = new tb1[r3];
    L32:
        if (r11 >= r3) goto L34;
        r0.getClass();
        r1[r11] = r0.g(r11);
        r11 = r11 + 1;
        goto L32
    L34:
        q44 r2 = r13.c[r5];
        r2.getClass();
        r12.B(r1, r2, r13.e(), r13.p, r13.g.a);
        return 3;
    L30:
        r3 = 0;
        goto L31
    L37:
        if (r12.m() == false) goto L46;
        a(r12, r15);
        if (r9 == true) goto L41;
    L42:
        if (r12 != r4) goto L44;
        r10 = true;
    L44:
        i(r10);
        return 1;
    L41:
        if (f() == false) goto L47;
    L46:
        return 0;
    L20:
        r8 = false;
        goto L21
    L15:
        if (this.d != 3) goto L17;
        return 1;
    }

    public void k() {
        if (h((kq) this.e) == true) goto L5;
        i(true);
    L5:
        kq r0 = (kq) this.f;
        if (r0 != null) goto L8;
        return;
    L8:
        if (r0.u == 0) goto L10;
        return;
    L10:
        i(false);
    }

    public void m() {
        kq r0 = (kq) this.e;
        int r1 = r0.u;
        boolean r3 = false;
        if (r1 == 1) goto L5;
    L10:
        kq r2 = (kq) this.f;
        if (r2 == null) goto L20;
        int r4 = r2.u;
        if (r4 == 1) goto L15;
        return;
    L15:
        if (this.d == 3) goto L22;
        if (r4 != 1) goto L18;
        r3 = true;
    L18:
        rr2.w(r3);
        r2.u = 2;
        r2.v();
        return;
    L22:
        return;
    L20:
        return;
    L5:
        if (this.d == 4) goto L10;
        if (r1 != 1) goto L8;
        r3 = true;
    L8:
        rr2.w(r3);
        r0.u = 2;
        r0.v();
    }
}
