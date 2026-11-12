package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class e53 extends cx2 implements rx4, y43 {
    public y43 B;
    public na4 C;
    public e53 D;
    public final String E;

    public e53(y43 r1, na4 r2) {
        this.B = r1;
        if (r2 != null) goto L5;
        r2 = new na4(10);
    L5:
        this.C = r2;
        this.E = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    @Override // defpackage.y43
    public final long R(int r7, long r8, long r10) {
        long r9 = this.B.R(r7, r8, r10);
        if (this.A == false) goto L6;
        e53 r6 = r0();
    L5:
        e53 r0 = r6;
        if (r0 == null) goto L9;
        long r11 = r0.R(r7, g83.e(r8, r9), g83.d(r10, r9));
    L11:
        return g83.e(r9, r11);
    L9:
        r11 = 0;
        goto L11
    L6:
        r6 = null;
        goto L5
    }

    @Override // defpackage.y43
    public final Object b0(long r13, long r15, vd0 r17) {
        if ((r17 instanceof c53) == false) goto L8;
        c53 r2 = (c53) r17;
        int r3 = r2.r;
        if ((r3 & Integer.MIN_VALUE) == 0) goto L8;
        r2.r = r3 - Integer.MIN_VALUE;
    L7:
        c53 r8 = r2;
        Object r1 = r8.p;
        int r4 = r8.r;
        e53 r9 = null;
        xe0 r11 = xe0.n;
        if (r4 == 0) goto L17;
        if (r4 == 1) goto L16;
        if (r4 != 2) goto L14;
        long r5 = r8.n;
        kb4.X(r1);
    L31:
        long r0 = ((k45) r1).a;
        long r6 = r5;
    L34:
        return new k45(k45.e(r6, r0));
    L14:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L16:
        long r7 = r8.o;
        long r10 = r8.n;
        kb4.X(r1);
    L21:
        r6 = ((k45) r1).a;
        boolean r12 = this.A;
        if (r12 == false) goto L25;
        if (r12 == false) goto L26;
        r9 = r0();
    L26:
        if (r9 == null) goto L32;
        long r14 = k45.e(r10, r6);
        long r16 = k45.d(r7, r6);
        r8.n = r6;
        r8.r = 2;
        r1 = r9.b0(r14, r16, r8);
        if (r1 != r11) goto L30;
    L29:
        return r11;
    L30:
        r5 = r6;
        goto L31
    L32:
        r0 = 0;
        goto L34
    L25:
        r9 = this.D;
        goto L26
    L17:
        kb4.X(r1);
        y43 r18 = this.B;
        r8.n = r13;
        r8.o = r15;
        r8.r = 1;
        r1 = r18.b0(r13, r15, r8);
        if (r1 == r11) goto L29;
        r10 = r13;
        r7 = r15;
    L8:
        r2 = new c53(this, (wd0) r17);
        goto L7
    }

    @Override // defpackage.rx4
    public final Object f() {
        return this.E;
    }

    @Override // defpackage.cx2
    public final void i0() {
        na4 r0 = this.C;
        r0.n = this;
        r0.o = null;
        this.D = null;
        r0.p = new wc(15, this);
        r0.q = e0();
    }

    @Override // defpackage.cx2
    public final void j0() {
        jx3 r0 = new jx3();
        gh0.I(this, new ea(1, r0));
        e53 r1 = (e53) ((rx4) r0.n);
        this.D = r1;
        na4 r2 = this.C;
        r2.o = r1;
        if (((e53) r2.n) != this) goto L6;
        r2.n = null;
        r2.q = null;
        r2.p = gb.c;
        return;
    }

    public final we0 q0() {
        e53 r0 = r0();
        if (r0 == null) goto L5;
        we0 r1 = r0.q0();
    L6:
        if (r1 == null) goto L13;
        s22 r2 = (s22) r1.e().K(fz0.h0);
        if (r2 == null) goto L10;
        boolean r3 = r2.b();
    L11:
        if (r3 != true) goto L13;
        return r1;
    L10:
        r3 = true;
    L13:
        we0 r4 = (we0) this.C.q;
        if (r4 == null) goto L16;
        return r4;
    L16:
        kf2.o("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    L5:
        r1 = null;
        goto L6
    }

    public final e53 r0() {
        rx4 r1 = null;
        if (this.A == true) goto L5;
        return null;
    L5:
        if (this.n.A == true) goto L7;
        cz1.b("visitAncestors called on an unattached node");
    L7:
        cx2 r0 = this.n.r;
        c72 r2 = j51.O(this);
    L8:
        if (r2 == null) goto L52;
        if ((((cx2) r2.Q.g).q & 262144) == 0) goto L45;
    L11:
        if (r0 == null) goto L45;
        if ((r0.p & 262144) == 0) goto L44;
        cx2 r3 = r0;
        f13 r5 = null;
    L15:
        if (r3 == null) goto L44;
        if ((r3 instanceof rx4) == false) goto L24;
        rx4 r6 = (rx4) r3;
        if (h12.c(this.E, r6.f()) == false) goto L24;
        if (e53.class != r6.getClass()) goto L24;
        r1 = r6;
    L24:
        if ((r3.p & 262144) == 0) goto L43;
        if ((r3 instanceof fo0) == false) goto L43;
        cx2 r7 = ((fo0) r3).C;
        int r8 = 0;
    L29:
        if (r7 == null) goto L41;
        if ((r7.p & 262144) == 0) goto L40;
        r8 = r8 + 1;
        if (r8 != 1) goto L35;
        r3 = r7;
        goto L40
    L35:
        if (r5 != null) goto L37;
        r5 = new f13(new cx2[16]);
    L37:
        if (r3 == null) goto L39;
        r5.b(r3);
        r3 = null;
    L39:
        r5.b(r7);
    L40:
        r7 = r7.s;
        goto L29
    L41:
        if (r8 == 1) goto L15;
    L43:
        r3 = j51.c(r5);
    L44:
        r0 = r0.r;
    L45:
        r2 = r2.t();
        if (r2 == null) goto L50;
        w12 r4 = r2.Q;
        if (r4 == null) goto L50;
        r0 = (sq4) r4.f;
    L50:
        r0 = null;
    L52:
        return (e53) r1;
    }

    @Override // defpackage.y43
    public final Object s(long r7, vd0 r9) {
        if ((r9 instanceof d53) == false) goto L7;
        d53 r0 = (d53) r9;
        int r1 = r0.q;
        if ((r1 & Integer.MIN_VALUE) == 0) goto L7;
        r0.q = r1 - Integer.MIN_VALUE;
    L8:
        Object r10 = r0.o;
        int r2 = r0.q;
        e53 r3 = null;
        xe0 r5 = xe0.n;
        if (r2 == 0) goto L16;
        if (r2 == 1) goto L15;
        if (r2 != 2) goto L13;
        long r6 = r0.n;
        kb4.X(r10);
    L30:
        return new k45(k45.e(r6, ((k45) r10).a));
    L13:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L15:
        r7 = r0.n;
        kb4.X(r10);
    L23:
        long r4 = ((k45) r10).a;
    L25:
        y43 r8 = this.B;
        long r11 = k45.d(r7, r4);
        r0.n = r4;
        r0.q = 2;
        r10 = r8.s(r11, r0);
        if (r10 != r5) goto L28;
    L27:
        return r5;
    L28:
        r6 = r4;
        goto L30
    L16:
        kb4.X(r10);
        if (this.A == false) goto L19;
        r3 = r0();
    L19:
        if (r3 == null) goto L24;
        r0.n = r7;
        r0.q = 1;
        r10 = r3.s(r7, r0);
        if (r10 != r5) goto L23;
    L24:
        r4 = 0;
    L7:
        r0 = new d53(this, (wd0) r9);
        goto L8
    }

    @Override // defpackage.y43
    public final long x(int r3, long r4) {
        if (this.A == false) goto L5;
        e53 r0 = r0();
    L6:
        if (r0 == null) goto L8;
        long r1 = r0.x(r3, r4);
    L10:
        return g83.e(r1, this.B.x(r3, g83.d(r4, r1)));
    L8:
        r1 = 0;
        goto L10
    L5:
        r0 = null;
        goto L6
    }
}
