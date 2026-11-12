package defpackage;

import android.os.Trace;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ri2 {
    public final c72 a;
    public final i61 b;
    public boolean c;
    public boolean d;
    public final rm3 e;
    public final f13 f;
    public final long g;
    public final f13 h;
    public nc0 i;

    public ri2(c72 r4) {
        this.a = r4;
        this.b = new i61(4);
        this.e = new rm3(16);
        this.f = new f13(new c72[16]);
        this.g = 1;
        this.h = new f13(new qi2[16]);
    }

    public static final boolean a(ri2 r4, c72 r5, boolean r6) {
        c72 r0 = r4.a;
        boolean r1 = r5.Z;
        f72 r2 = r5.R;
        boolean r3 = false;
        if (r1 == false) goto L6;
    L50:
        return r3;
    L6:
        if (k(r5) == false) goto L50;
        if (r5 != r0) goto L9;
        nc0 r7 = r4.i;
        r7.getClass();
    L10:
        if (r6 == false) goto L21;
        if (r2.e == false) goto L14;
        r3 = c(r5, r7);
    L14:
        if (r3 == true) goto L18;
        if (r2.f == true) goto L18;
    L49:
        r4.e();
    L18:
        if (h12.c(r5.I(), Boolean.TRUE) == false) goto L49;
        r5.J();
        goto L49
    L21:
        if (r5.q() == false) goto L24;
        r3 = d(r5, r7);
    L24:
        if (r5.p() == false) goto L49;
        if (r5 == r0) goto L33;
        c72 r8 = r5.t();
        if (r8 == null) goto L49;
        if (r8.H() != true) goto L49;
        if (r2.p.D == false) goto L49;
    L33:
        if (r5 == r0) goto L35;
        r5.S();
    L46:
        rm3 r9 = r4.e;
        r9.getClass();
        if (r5.Y <= 0) goto L49;
        ((f13) r9.n).b(r5);
        r5.X = true;
        goto L49
    L35:
        if (r5.N != a72.p) goto L37;
        r5.f();
    L37:
        c72 r10 = r5.t();
        if (r10 == null) goto L43;
        iz1 r11 = (iz1) r10.Q.d;
        if (r11 == null) goto L43;
        ig3 r12 = r11.C;
        if (r12 == null) goto L43;
    L44:
        ig3.k(r12, r2.p);
    L43:
        r12 = ((ra) h12.L(r5)).getPlacementScope();
        goto L44
    L9:
        r7 = null;
        goto L10
    }

    public static boolean c(c72 r5, nc0 r6) {
        c72 r0 = r5.u;
        f72 r1 = r5.R;
        if (r0 != null) goto L5;
        return false;
    L5:
        if (r6 == null) goto L9;
        if (r0 == null) goto L8;
        if2 r2 = r1.q;
        r2.getClass();
        boolean r7 = r2.e0(r6.a);
    L16:
        c72 r3 = r5.t();
        if (r7 == false) goto L30;
        if (r3 == null) goto L30;
        if (r3.u != null) goto L24;
        c72.W(r3, false, 3);
        return r7;
    L24:
        if (r5.s() != a72.n) goto L28;
        c72.U(r3, false, 3);
        return r7;
    L28:
        if (r5.s() != a72.o) goto L30;
        r3.T(false);
    L30:
        return r7;
    L8:
        r7 = false;
        goto L16
    L9:
        if2 r8 = r1.q;
        if (r8 == null) goto L12;
        nc0 r4 = r8.z;
    L13:
        if (r4 == null) goto L8;
        if (r0 == null) goto L8;
        r8.getClass();
        r7 = r8.e0(r4.a);
        goto L16
    L12:
        r4 = null;
        goto L13
    }

    public static boolean d(c72 r4, nc0 r5) {
        if (r5 == null) goto L4;
        boolean r6 = r4.O(r5);
    L5:
        c72 r0 = r4.t();
        if (r6 == false) goto L15;
        if (r0 == null) goto L15;
        if (r4.r() != a72.n) goto L13;
        c72.W(r0, false, 3);
        return r6;
    L13:
        if (r4.r() != a72.o) goto L15;
        r0.V(false);
    L15:
        return r6;
    L4:
        r6 = c72.P(r4);
        goto L5
    }

    public static boolean i(c72 r3) {
        if (r3.R.e == true) goto L5;
        return false;
    L5:
        if (r3.s() != a72.p) goto L12;
        if2 r4 = r3.R.q;
        if (r4 == null) goto L15;
        d72 r5 = r4.D;
        if (r5 != null) goto L11;
        return false;
    L11:
        if (r5.e() == true) goto L12;
        return false;
    L15:
        return false;
    L12:
        return true;
    }

    public static boolean j(c72 r2) {
        if (r2.q() == true) goto L5;
        return false;
    L5:
        if (r2.r() == a72.p) goto L7;
    L14:
        r2 = r2.t();
        if (r2 == null) goto L28;
        if (r2.H() == false) goto L5;
        return true;
    L28:
        return false;
    L7:
        if (r2.R.p.H.e() == true) goto L14;
        c72 r0 = r2.t();
        if (r0 == null) goto L11;
        y62 r1 = r0.R.d;
    L13:
        if (r1 == y62.n) goto L14;
        return false;
    L11:
        r1 = null;
        goto L13
    }

    public static boolean k(c72 r4) {
        f72 r0 = r4.R;
        if (r4.H() == false) goto L5;
    L23:
        return true;
    L5:
        if (r0.p.D == true) goto L23;
        if (j(r4) == true) goto L23;
        if (h12.c(r4.I(), Boolean.TRUE) == true) goto L23;
        if (i(r4) == true) goto L23;
        if (r0.p.H.e() == true) goto L23;
        if2 r5 = r0.q;
        if (r5 == null) goto L21;
        d72 r6 = r5.D;
        if (r6 != null) goto L19;
        return false;
    L19:
        if (r6.e() == true) goto L23;
        return false;
    L21:
        return false;
    }

    public final void b(boolean r3) {
        rm3 r0 = this.e;
        if (r3 == false) goto L8;
        f13 r4 = (f13) r0.n;
        c72 r2 = this.a;
        if (r2.Y <= 0) goto L8;
        r4.g();
        r4.b(r2);
        r2.X = true;
    L8:
        if (((f13) r0.n).p == 0) goto L16;
        Trace.beginSection("Compose:onPositionedCallbacks");
        r0.C();     // Catch: Throwable -> L13
        Trace.endSection();
        return;
    L13:
        th = move-exception;
        Trace.endSection();
        throw th;
    }

    public final void e() {
        f13 r7 = this.h;
        int r0 = r7.p;
        if (r0 == 0) goto L19;
        Object[] r1 = r7.n;
        int r2 = 0;
    L5:
        if (r2 >= r0) goto L13;
        qi2 r3 = (qi2) r1[r2];
        if (r3.a.G() == false) goto L12;
        boolean r4 = r3.b;
        c72 r5 = r3.a;
        boolean r6 = r3.c;
        if (r4 == true) goto L11;
        c72.W(r5, r6, 2);
        goto L12
    L11:
        c72.U(r5, r6, 2);
    L12:
        r2 = r2 + 1;
        goto L5
    L13:
        r7.g();
        return;
    }

    public final void f(c72 r6) {
        f13 r7 = r6.y();
        Object[] r0 = r7.n;
        int r8 = r7.p;
        int r1 = 0;
    L3:
        if (r1 >= r8) goto L13;
        c72 r2 = (c72) r0[r1];
        if (h12.c(r2.I(), Boolean.TRUE) == false) goto L12;
        if (r2.Z == true) goto L12;
        if (this.b.f(r2) == false) goto L11;
        r2.J();
    L11:
        f(r2);
    L12:
        r1 = r1 + 1;
        goto L3
    }

    public final void g(c72 r2, boolean r3) {
        if (this.c == true) goto L5;
        cz1.b("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
    L5:
        if (r3 == false) goto L7;
        boolean r0 = r2.R.e;
    L8:
        if (r0 == false) goto L10;
        cz1.a("node not yet measured");
    L10:
        h(r2, r3);
        return;
    L7:
        r0 = r2.q();
        goto L8
    }

    public final void h(c72 r8, boolean r9) {
        f13 r0 = r8.y();
        Object[] r1 = r0.n;
        int r2 = r0.p;
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L40;
        c72 r4 = (c72) r1[r3];
        a72 r5 = a72.n;
        if (r9 == false) goto L7;
    L11:
        if (r9 == false) goto L39;
        if (r4.s() == r5) goto L20;
        if2 r6 = r4.R.q;
        if (r6 == null) goto L39;
        d72 r7 = r6.D;
        if (r7 == null) goto L39;
        if (r7.e() != true) goto L39;
    L20:
        boolean r10 = h12.A(r4);
        f72 r11 = r4.R;
        if (r10 == false) goto L29;
        if (r9 == true) goto L29;
        if (r11.e == true) goto L26;
    L28:
        g(r4, true);
        goto L29
    L26:
        if (this.b.f(r4) == false) goto L28;
        o(r4, true);
    L29:
        if (r9 == false) goto L31;
        boolean r12 = r11.e;
    L32:
        if (r12 == false) goto L34;
        o(r4, r9);
    L34:
        if (r9 == false) goto L36;
        boolean r13 = r11.e;
    L37:
        if (r13 == true) goto L39;
        h(r4, r9);
        goto L39
    L36:
        r13 = r4.q();
        goto L37
    L31:
        r12 = r4.q();
    L39:
        r3 = r3 + 1;
        goto L3
    L7:
        if (r4.r() == r5) goto L20;
        if (r4.R.p.H.e() == false) goto L11;
    L40:
        if (r9 == false) goto L42;
        boolean r14 = r8.R.e;
    L43:
        if (r14 == false) goto L53;
        o(r8, r9);
        return;
    L53:
        return;
    L42:
        r14 = r8.q();
        goto L43
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v2, types: [cx2] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9, types: [cx2] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [f13] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [f13] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v4 */
    public final boolean l(gf1 r17) {
        i61 r0 = this.b;
        c72 r2 = this.a;
        if (r2.G() == true) goto L6;
        cz1.a("performMeasureAndLayout called with unattached root");
    L6:
        if (r2.H() == true) goto L9;
        cz1.a("performMeasureAndLayout called with unplaced root");
    L9:
        if (this.c == false) goto L11;
        cz1.a("performMeasureAndLayout called during measure layout");
    L11:
        int r4 = 0;
        if (this.i == null) goto L57;
        this.c = true;
        this.d = true;
        boolean r3 = r0.o();     // Catch: Throwable -> L25
        d34 r6 = (d34) r0.o;
        if (r3 == false) goto L51;
        boolean r5 = false;
    L18:
        d34 r7 = (d34) r0.q;     // Catch: Throwable -> L25
        d34 r8 = (d34) r0.p;     // Catch: Throwable -> L25
        if (((cj4) r6.o).isEmpty() == true) goto L28;
        c72 r9 = (c72) ((cj4) r6.o).first();     // Catch: Throwable -> L25
        r6.H(r9);     // Catch: Throwable -> L25
        if (r9.u == null) goto L23;
        boolean r10 = true;
    L24:
        boolean r11 = false;
    L37:
        if (r11 == false) goto L39;
        boolean r12 = a(this, r9, r10);     // Catch: Throwable -> L25
    L45:
        if (r9 != r2) goto L18;
        if (r12 == false) goto L18;
        r5 = true;
        goto L18
    L39:
        r12 = o(r9, r10);     // Catch: Throwable -> L25
        if (r9.R.f == false) goto L43;
        r0.c(r9, n12.o);     // Catch: Throwable -> L25
    L43:
        if (r9.p() == false) goto L45;
        r0.c(r9, n12.q);     // Catch: Throwable -> L25
        goto L45
    L23:
        r10 = false;
        goto L24
    L28:
        if (((cj4) r8.o).isEmpty() == true) goto L35;
        r9 = (c72) ((cj4) r8.o).first();     // Catch: Throwable -> L25
        r8.H(r9);     // Catch: Throwable -> L25
        if (r9.u == null) goto L32;
        r10 = true;
    L33:
        r11 = true;
        goto L37
    L32:
        r10 = false;
        goto L33
    L35:
        if (((cj4) r7.o).isEmpty() == true) goto L48;
        c72 r13 = (c72) ((cj4) r7.o).first();     // Catch: Throwable -> L25
        r7.H(r13);     // Catch: Throwable -> L25
        r11 = true;
        r9 = r13;
        r10 = false;
        goto L37
    L48:
        if (r17 == null) goto L52;
        r17.invoke();     // Catch: Throwable -> L25
    L52:
        this.c = false;
        this.d = false;
    L58:
        f13 r1 = this.f;
        Object[] r14 = r1.n;
        int r15 = r1.p;
        int r16 = 0;
    L59:
        if (r16 >= r15) goto L100;
        w12 r18 = ((c72) r14[r16]).Q;
        iz1 r19 = (iz1) r18.d;
        boolean r110 = g63.f(4194304);
        if (r110 == false) goto L63;
        cx2 r111 = r19.n0;
    L66:
        k52 r112 = f63.h0;
        cx2 r20 = r19.D0(r110);
    L67:
        if (r20 == null) goto L99;
        if ((r20.q & 4194304) == 0) goto L99;
        if ((r20.p & 4194304) == 0) goto L97;
        ?? r113 = r20;
        ?? r114 = 0;
    L73:
        if (r113 == 0) goto L97;
        if ((r113 instanceof o62) == false) goto L78;
        ((o62) r113).e((iz1) r18.d);
    L96:
        ?? r115 = j51.c(r114);
    L95:
        r4 = 0;
        r113 = r115;
        r114 = r114;
        goto L73
    L78:
        if ((r113.p & 4194304) == 0) goto L96;
        if ((r113 instanceof fo0) == false) goto L96;
        cx2 r116 = ((fo0) r113).C;
        int r117 = r4;
        r115 = r113;
        r114 = r114;
    L82:
        if (r116 == null) goto L94;
        if ((r116.p & 4194304) == 0) goto L93;
        r117 = r117 + 1;
        r114 = r114;
        if (r117 != 1) goto L88;
        r115 = r116;
        goto L93
    L88:
        if (r114 != 0) goto L90;
        r114 = new f13(new cx2[16]);
    L90:
        if (r115 == 0) goto L92;
        r114.b(r115);
        r115 = 0;
    L92:
        r114.b(r116);
    L93:
        r116 = r116.s;
        r115 = r115;
        r114 = r114;
        goto L82
    L94:
        if (r117 != 1) goto L96;
    L97:
        if (r20 == r111) goto L99;
        r20 = r20.s;
        r4 = 0;
    L99:
        r16 = r16 + 1;
        r4 = 0;
        goto L59
    L63:
        r111 = r19.n0.r;
        if (r111 != null) goto L66;
    L100:
        r1.g();
        return r5;
    L51:
        r5 = false;
    L25:
        th = move-exception;
        throw th;     // Catch: Throwable -> L54
    L54:
        th = move-exception;
        this.c = false;
        this.d = false;
        throw th;
    L57:
        r5 = false;
        goto L58
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2, types: [cx2] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [cx2] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [f13] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [f13] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v6 */
    public final void m(c72 r13, long r14) {
        if (r13.Z == false) goto L5;
        return;
    L5:
        c72 r0 = this.a;
        if (r13 != r0) goto L10;
        cz1.a("measureAndLayout called on root");
    L10:
        if (r0.G() == true) goto L13;
        cz1.a("performMeasureAndLayout called with unattached root");
    L13:
        if (r0.H() == true) goto L16;
        cz1.a("performMeasureAndLayout called with unplaced root");
    L16:
        if (this.c == false) goto L19;
        cz1.a("performMeasureAndLayout called during measure layout");
    L19:
        if (this.i == null) goto L43;
        this.c = true;
        this.d = false;
        i61 r1 = this.b;     // Catch: Throwable -> L28
        ((d34) r1.o).H(r13);     // Catch: Throwable -> L28
        ((d34) r1.p).H(r13);     // Catch: Throwable -> L28
        ((d34) r1.q).H(r13);     // Catch: Throwable -> L28
        if (c(r13, new nc0(r14)) == true) goto L26;
        if (r13.R.f == true) goto L26;
    L30:
        f(r13);     // Catch: Throwable -> L28
        d(r13, new nc0(r14));     // Catch: Throwable -> L28
        if (r13.p() == true) goto L33;
    L37:
        e();     // Catch: Throwable -> L28
        this.c = false;
        this.d = false;
        goto L43
    L33:
        if (r13.H() == false) goto L37;
        r13.S();     // Catch: Throwable -> L28
        rm3 r15 = this.e;     // Catch: Throwable -> L28
        r15.getClass();     // Catch: Throwable -> L28
        if (r13.Y <= 0) goto L37;
        ((f13) r15.n).b(r13);     // Catch: Throwable -> L28
        r13.X = true;     // Catch: Throwable -> L28
    L26:
        if (h12.c(r13.I(), Boolean.TRUE) == false) goto L30;
        r13.J();     // Catch: Throwable -> L28
    L28:
        th = move-exception;
        throw th;     // Catch: Throwable -> L40
    L40:
        th = move-exception;
        this.c = false;
        this.d = false;
        throw th;
    L43:
        f13 r12 = this.f;
        Object[] r16 = r12.n;
        int r17 = r12.p;
        int r18 = 0;
    L44:
        if (r18 >= r17) goto L85;
        w12 r2 = ((c72) r16[r18]).Q;
        iz1 r3 = (iz1) r2.d;
        boolean r5 = g63.f(4194304);
        if (r5 == false) goto L48;
        cx2 r6 = r3.n0;
    L51:
        k52 r7 = f63.h0;
        cx2 r4 = r3.D0(r5);
    L52:
        if (r4 == null) goto L84;
        if ((r4.q & 4194304) == 0) goto L84;
        if ((r4.p & 4194304) == 0) goto L82;
        ?? r8 = r4;
        ?? r9 = 0;
    L58:
        if (r8 == 0) goto L82;
        if ((r8 instanceof o62) == true) goto L61;
        if ((r8.p & 4194304) == 0) goto L81;
        if ((r8 instanceof fo0) == false) goto L81;
        cx2 r10 = ((fo0) r8).C;
        int r11 = 0;
        r8 = r8;
        r9 = r9;
    L67:
        if (r10 == null) goto L79;
        if ((r10.p & 4194304) == 0) goto L78;
        r11 = r11 + 1;
        r9 = r9;
        if (r11 != 1) goto L73;
        r8 = r10;
        goto L78
    L73:
        if (r9 != 0) goto L75;
        r9 = new f13(new cx2[16]);
    L75:
        if (r8 == 0) goto L77;
        r9.b(r8);
        r8 = 0;
    L77:
        r9.b(r10);
    L78:
        r10 = r10.s;
        r8 = r8;
        r9 = r9;
        goto L67
    L79:
        if (r11 == 1) goto L58;
    L81:
        r8 = j51.c(r9);
        goto L58
    L61:
        ((o62) r8).e((iz1) r2.d);
    L82:
        if (r4 == r6) goto L84;
        r4 = r4.s;
    L84:
        r18 = r18 + 1;
        goto L44
    L48:
        r6 = r3.n0.r;
        if (r6 != null) goto L51;
    L85:
        r12.g();
    }

    public final void n() {
        i61 r0 = this.b;
        if (r0.o() == false) goto L36;
        c72 r1 = this.a;
        if (r1.G() == true) goto L8;
        cz1.a("performMeasureAndLayout called with unattached root");
    L8:
        if (r1.H() == true) goto L11;
        cz1.a("performMeasureAndLayout called with unplaced root");
    L11:
        if (this.c == false) goto L14;
        cz1.a("performMeasureAndLayout called during measure layout");
    L14:
        if (this.i == null) goto L41;
        this.c = true;
        this.d = false;
    L26:
        th = move-exception;
        throw th;     // Catch: Throwable -> L33
    L33:
        th = move-exception;
        this.c = false;
        this.d = false;
        throw th;
    L17:
        if (((cj4) ((d34) r0.q).o).isEmpty() == false) goto L19;
    L21:
        boolean r2 = false;
    L22:
        if (r2 == true) goto L24;
    L29:
        q(r1, false);     // Catch: Throwable -> L26
        this.c = false;
        this.d = false;
        return;
    L24:
        if (r1.u == null) goto L28;
        q(r1, true);     // Catch: Throwable -> L26
        goto L29
    L28:
        p(r1);     // Catch: Throwable -> L26
        goto L29
    L19:
        if (((cj4) ((d34) r0.o).o).isEmpty() == true) goto L21;
        r2 = true;
        goto L22
    L41:
        return;
    }

    public final boolean o(c72 r3, boolean r4) {
        boolean r1 = false;
        if (r3.Z == false) goto L6;
    L19:
        return r1;
    L6:
        if (k(r3) == false) goto L19;
        if (r3 != this.a) goto L10;
        nc0 r0 = this.i;
        r0.getClass();
    L11:
        if (r4 == false) goto L16;
        if (r3.R.e == false) goto L18;
        r1 = c(r3, r0);
    L18:
        e();
        goto L19
    L16:
        if (r3.q() == false) goto L18;
        r1 = d(r3, r0);
        goto L18
    L10:
        r0 = null;
        goto L11
    }

    public final void p(c72 r6) {
        f13 r7 = r6.y();
        Object[] r0 = r7.n;
        int r8 = r7.p;
        int r1 = 0;
    L3:
        if (r1 >= r8) goto L13;
        c72 r2 = (c72) r0[r1];
        if (r2.r() == a72.n) goto L9;
        if (r2.R.p.H.e() == true) goto L9;
    L12:
        r1 = r1 + 1;
    L9:
        if (h12.A(r2) == false) goto L11;
        q(r2, true);
        goto L12
    L11:
        p(r2);
        goto L12
    }

    public final void q(c72 r2, boolean r3) {
        if (r2.Z == false) goto L6;
        return;
    L6:
        if (r2 != this.a) goto L8;
        nc0 r1 = this.i;
        r1.getClass();
    L9:
        if (r3 == false) goto L12;
        c(r2, r1);
        return;
    L12:
        d(r2, r1);
        return;
    L8:
        r1 = null;
        goto L9
    }

    public final boolean r(c72 r5, boolean r6) {
        int r0 = r5.R.d.ordinal();
        if (r0 != 0) goto L5;
    L35:
        return false;
    L5:
        if (r0 == 1) goto L35;
        if (r0 != 2) goto L9;
    L34:
        qi2 r1 = new qi2(r5, false, r6);
        this.h.b(r1);
        goto L35
    L9:
        if (r0 == 3) goto L34;
        if (r0 == 4) goto L13;
        er1.n();
        return false;
    L13:
        if (r5.q() == false) goto L16;
        if (r6 == false) goto L35;
    L16:
        r5.R.p.E = true;
        if (r5.Z == true) goto L35;
        if (r5.H() == false) goto L22;
    L23:
        c72 r7 = r5.t();
        if (r7 != null) goto L26;
    L28:
        this.b.c(r5, n12.p);
    L30:
        if (this.d == true) goto L35;
        return true;
    L26:
        if (r7.q() != true) goto L28;
    L22:
        if (j(r5) == false) goto L35;
        goto L23
    }

    public final void s(long r3) {
        nc0 r0 = this.i;
        if (r0 != null) goto L5;
        boolean r1 = false;
    L6:
        if (r1 == false) goto L8;
        return;
    L8:
        if (this.c == false) goto L10;
        cz1.a("updateRootConstraints called while measuring");
    L10:
        this.i = new nc0(r3);
        c72 r4 = this.a;
        boolean r5 = r4.G();
        f72 r2 = r4.R;
        if (r5 == false) goto L23;
        c72 r6 = r4.u;
        if (r6 == null) goto L16;
        r2.e = true;
    L16:
        r2.p.E = true;
        if (r6 == null) goto L19;
        n12 r7 = n12.n;
    L20:
        this.b.c(r4, r7);
        return;
    L19:
        r7 = n12.p;
        goto L20
    L23:
        return;
    L5:
        r1 = nc0.b(r0.a, r3);
        goto L6
    }
}
