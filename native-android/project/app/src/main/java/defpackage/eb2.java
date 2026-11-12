package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class eb2 {
    public static boolean q;
    public int a;
    public boolean b;
    public int c;
    public final fq3 d;
    public int e;
    public int f;
    public pi[] g;
    public boolean h;
    public boolean[] i;
    public int j;
    public int k;
    public int l;
    public final yc5 m;
    public ai4[] n;
    public int o;
    public pi p;

    public eb2() {
        this.a = 1000;
        this.b = false;
        this.c = 0;
        this.e = 32;
        this.f = 32;
        this.h = false;
        this.i = new boolean[32];
        this.j = 1;
        this.k = 0;
        this.l = 32;
        this.n = new ai4[1000];
        this.o = 0;
        this.g = new pi[32];
        s();
        yc5 r0 = new yc5();
        r0.n = new jo3();
        r0.o = new jo3();
        r0.p = new ai4[32];
        this.m = r0;
        fq3 r2 = new fq3(r0);
        r2.f = new ai4[128];
        r2.g = new ai4[128];
        r2.h = 0;
        r2.i = new gp3(18, r2);
        this.d = r2;
        this.p = new pi(r0);
    }

    public static int n(Object r1) {
        ai4 r2 = ((hb0) r1).i;
        if (r2 != null) goto L5;
        return 0;
    L5:
        return (int) (r2.r + 0.5f);
    }

    public final ai4 a(int r6) {
        jo3 r0 = (jo3) this.m.o;
        int r1 = r0.o;
        Object r2 = null;
        if (r1 <= 0) goto L5;
        int r3 = r1 - 1;
        Object[] r4 = r0.n;
        Object r5 = r4[r3];
        r4[r3] = null;
        r0.o = r3;
        r2 = r5;
    L5:
        ai4 r7 = (ai4) r2;
        if (r7 != null) goto L8;
        r7 = new ai4(r6);
        r7.y = r6;
    L9:
        int r8 = this.o;
        int r9 = this.a;
        if (r8 < r9) goto L12;
        int r10 = r9 * 2;
        this.a = r10;
        this.n = (ai4[]) Arrays.copyOf(this.n, r10);
    L12:
        ai4[] r11 = this.n;
        int r12 = this.o;
        this.o = r12 + 1;
        r11[r12] = r7;
        return r7;
    L8:
        r7.c();
        r7.y = r6;
        goto L9
    }

    public final void b(ai4 r7, ai4 r8, int r9, float r10, ai4 r11, ai4 r12, int r13, int r14) {
        pi r0 = l();
        if (r8 != r11) goto L5;
        r0.d.g(r7, 1.0f);
        r0.d.g(r12, 1.0f);
        r0.d.g(r8, -2.0f);
    L22:
        if (r14 == 8) goto L24;
        r0.a(this, r14);
    L24:
        c(r0);
        return;
    L5:
        ji r3 = r0.d;
        if (r10 != 0.5f) goto L12;
        r3.g(r7, 1.0f);
        r0.d.g(r8, -1.0f);
        r0.d.g(r11, -1.0f);
        r0.d.g(r12, 1.0f);
        if (r9 > 0) goto L10;
        if (r13 <= 0) goto L22;
    L10:
        r0.b = (-r9) + r13;
        goto L22
    L12:
        if (r10 > 0.0f) goto L15;
        r3.g(r7, -1.0f);
        r0.d.g(r8, 1.0f);
        r0.b = r9;
        goto L22
    L15:
        if (r10 < 1.0f) goto L17;
        r3.g(r12, -1.0f);
        r0.d.g(r11, 1.0f);
        r0.b = -r13;
        goto L22
    L17:
        float r2 = 1.0f - r10;
        r3.g(r7, r2 * 1.0f);
        r0.d.g(r8, r2 * (-1.0f));
        r0.d.g(r11, (-1.0f) * r10);
        r0.d.g(r12, 1.0f * r10);
        if (r9 > 0) goto L20;
        if (r13 <= 0) goto L22;
    L20:
        r0.b = (r13 * r10) + ((-r9) * r2);
        goto L22
    }

    public final void c(pi r18) {
        if ((this.k + 1) < this.l) goto L5;
    L6:
        o();
    L8:
        if (r18.e == true) goto L127;
        ArrayList r2 = r18.c;
        if (this.g.length == 0) goto L40;
        boolean r5 = false;
    L13:
        if (r5 == true) goto L35;
        int r7 = r18.d.d();
        int r8 = 0;
    L15:
        if (r8 >= r7) goto L23;
        ai4 r9 = r18.d.e(r8);
        if (r9.p == (-1)) goto L19;
    L21:
        r2.add(r9);
    L22:
        r8 = r8 + 1;
        goto L15
    L19:
        if (r9.s == true) goto L21;
    L23:
        int r10 = r2.size();
        if (r10 > 0) goto L25;
        r5 = true;
        goto L13
    L25:
        int r11 = 0;
    L26:
        if (r11 >= r10) goto L32;
        ai4 r12 = (ai4) r2.get(r11);
        if (r12.s == false) goto L30;
        r18.h(this, r12, true);
    L31:
        r11 = r11 + 1;
        goto L26
    L30:
        r18.i(this, this.g[r12.p], true);
        goto L31
    L32:
        r2.clear();
        goto L13
    L35:
        if (r18.a == null) goto L40;
        if (r18.d.d() != 0) goto L40;
        r18.e = true;
        this.b = true;
    L40:
        if (r18.e() == true) goto L158;
        float r3 = r18.b;
        float r6 = 0.0f;
        if (r3 >= 0.0f) goto L49;
        r18.b = r3 * (-1.0f);
        ji r4 = r18.d;
        int r13 = r4.h;
        int r14 = 0;
    L45:
        if (r13 == (-1)) goto L49;
        if (r14 >= r4.a) goto L49;
        float[] r15 = r4.g;
        r15[r13] = r15[r13] * (-1.0f);
        r13 = r4.f[r13];
        r14 = r14 + 1;
    L49:
        int r16 = r18.d.d();
        float r17 = 0.0f;
        float r19 = 0.0f;
        ai4 r20 = null;
        ai4 r110 = null;
        int r21 = 0;
        boolean r111 = false;
        boolean r112 = false;
    L50:
        if (r21 >= r16) goto L87;
        float r113 = r18.d.f(r21);
        ai4 r22 = r18.d.e(r21);
        float r114 = r6;
        if (r22.y != 1) goto L68;
        if (r20 != null) goto L60;
        if (r22.x <= 1) goto L67;
    L57:
        r111 = false;
    L58:
        r20 = r22;
        r17 = r113;
    L86:
        r21 = r21 + 1;
        r6 = r114;
    L67:
        r111 = true;
        goto L58
    L60:
        if (r17 > r113) goto L62;
        if (r111 == true) goto L86;
        if (r22.x > 1) goto L86;
    L62:
        if (r22.x > 1) goto L57;
    L68:
        if (r20 != null) goto L86;
        if (r113 >= r114) goto L86;
        if (r110 != null) goto L78;
        if (r22.x <= 1) goto L85;
    L75:
        r112 = false;
    L76:
        r110 = r22;
        r19 = r113;
    L85:
        r112 = true;
        goto L76
    L78:
        if (r19 > r113) goto L80;
        if (r112 == true) goto L86;
        if (r22.x > 1) goto L86;
    L80:
        if (r22.x > 1) goto L75;
    L87:
        float r115 = r6;
        if (r20 != null) goto L91;
        r20 = r110;
    L91:
        if (r20 != null) goto L93;
        boolean r23 = true;
    L95:
        if (r18.d.d() != 0) goto L97;
        r18.e = true;
    L97:
        if (r23 == true) goto L99;
    L119:
        boolean r24 = false;
    L120:
        ai4 r25 = r18.a;
        if (r25 != null) goto L123;
        return;
    L123:
        if (r25.y != 1) goto L125;
    L128:
        if (r24 == true) goto L157;
        h(r18);
        return;
    L157:
        return;
    L125:
        if (r18.b >= r115) goto L128;
        return;
    L99:
        if ((this.j + 1) < this.f) goto L101;
        o();
    L101:
        ai4 r26 = a(3);
        int r27 = this.c + 1;
        this.c = r27;
        this.j++;
        r26.o = r27;
        yc5 r28 = this.m;
        ((ai4[]) r28.p)[r27] = r26;
        r18.a = r26;
        int r29 = this.k;
        h(r18);
        if (this.k != (r29 + 1)) goto L119;
        pi r30 = this.p;
        r30.a = null;
        r30.d.b();
        int r31 = 0;
    L105:
        if (r31 >= r18.d.d()) goto L107;
        r30.d.a(r18.d.e(r31), r18.d.f(r31), true);
        r31 = r31 + 1;
        goto L105
    L107:
        r(this.p);
        if (r26.p == (-1)) goto L110;
    L118:
        r24 = true;
        goto L120
    L110:
        if (r18.a != r26) goto L115;
        ai4 r32 = r18.f(null, r26);
        if (r32 == null) goto L115;
        r18.g(r32);
    L115:
        if (r18.e == true) goto L117;
        r18.a.e(this, r18);
    L117:
        ((jo3) r28.n).c(r18);
        this.k--;
        goto L118
    L93:
        r18.g(r20);
        r23 = false;
        goto L95
    L158:
        return;
    L127:
        r24 = false;
        goto L128
    L5:
        if ((this.j + 1) < this.f) goto L8;
        goto L6
    }

    public final void d(ai4 r5, int r6) {
        int r0 = r5.p;
        if (r0 != (-1)) goto L9;
        r5.d(this, r6);
        int r7 = 0;
    L6:
        if (r7 >= (this.c + 1)) goto L8;
        ai4 r8 = ((ai4[]) this.m.p)[r7];
        r7 = r7 + 1;
        goto L6
    L8:
        return;
    L9:
        if (r0 == (-1)) goto L24;
        pi r1 = this.g[r0];
        if (r1.e == false) goto L15;
        r1.b = r6;
        return;
    L15:
        if (r1.d.d() != 0) goto L18;
        r1.e = true;
        r1.b = r6;
        return;
    L18:
        pi r2 = l();
        if (r6 >= 0) goto L21;
        r2.b = r6 * (-1);
        r2.d.g(r5, 1.0f);
    L22:
        c(r2);
        return;
    L21:
        r2.b = r6;
        r2.d.g(r5, -1.0f);
        goto L22
    L24:
        pi r3 = l();
        r3.a = r5;
        float r9 = r6;
        r5.r = r9;
        r3.b = r9;
        r3.e = true;
        c(r3);
    }

    public final void e(ai4 r6, ai4 r7, int r8, int r9) {
        if (r9 == 8) goto L5;
    L10:
        pi r1 = l();
        boolean r2 = false;
        if (r8 == 0) goto L15;
        if (r8 >= 0) goto L14;
        r8 = r8 * (-1);
        r2 = true;
    L14:
        r1.b = r8;
    L15:
        ji r10 = r1.d;
        if (r2 == true) goto L18;
        r10.g(r6, -1.0f);
        r1.d.g(r7, 1.0f);
    L19:
        if (r9 == 8) goto L21;
        r1.a(this, r9);
    L21:
        c(r1);
        return;
    L18:
        r10.g(r6, 1.0f);
        r1.d.g(r7, -1.0f);
        goto L19
    L5:
        if (r7.s == false) goto L10;
        if (r6.p != (-1)) goto L10;
        r6.d(this, r7.r + r8);
    }

    public final void f(ai4 r4, ai4 r5, int r6, int r7) {
        pi r0 = l();
        ai4 r1 = m();
        r1.q = 0;
        r0.b(r4, r5, r1, r6);
        if (r7 == 8) goto L5;
        int r8 = (int) (r0.d.c(r1) * (-1.0f));
        r0.d.g(j(r7), r8);
    L5:
        c(r0);
    }

    public final void g(ai4 r4, ai4 r5, int r6, int r7) {
        pi r0 = l();
        ai4 r1 = m();
        r1.q = 0;
        r0.c(r4, r5, r1, r6);
        if (r7 == 8) goto L5;
        int r8 = (int) (r0.d.c(r1) * (-1.0f));
        r0.d.g(j(r7), r8);
    L5:
        c(r0);
    }

    public final void h(pi r8) {
        if (r8.e == false) goto L5;
        r8.a.d(this, r8.b);
    L7:
        if (this.b == false) goto L38;
        int r0 = 0;
    L10:
        if (r0 >= this.k) goto L29;
        if (this.g[r0] != null) goto L14;
        System.out.println("WTF");
    L14:
        pi r1 = this.g[r0];
        if (r1 == null) goto L28;
        if (r1.e == false) goto L28;
        r1.a.d(this, r1.b);
        ((jo3) this.m.n).c(r1);
        this.g[r0] = null;
        int r2 = r0 + 1;
        int r3 = r2;
    L19:
        int r4 = this.k;
        if (r2 >= r4) goto L25;
        pi[] r5 = this.g;
        int r6 = r2 - 1;
        pi r7 = r5[r2];
        r5[r6] = r7;
        ai4 r9 = r7.a;
        if (r9.p != r2) goto L24;
        r9.p = r6;
    L24:
        r3 = r2;
        r2 = r2 + 1;
        goto L19
    L25:
        if (r3 >= r4) goto L27;
        this.g[r3] = null;
    L27:
        this.k = r4 - 1;
        r0 = r0 - 1;
    L28:
        r0 = r0 + 1;
        goto L10
    L29:
        this.b = false;
        return;
    L38:
        return;
    L5:
        pi[] r10 = this.g;
        int r11 = this.k;
        r10[r11] = r8;
        ai4 r12 = r8.a;
        r12.p = r11;
        this.k = r11 + 1;
        r12.e(this, r8);
        goto L7
    }

    public final void i() {
        int r0 = 0;
    L4:
        if (r0 >= this.k) goto L6;
        pi r1 = this.g[r0];
        ai4 r2 = r1.a;
        r2.r = r1.b;
        r0 = r0 + 1;
        goto L4
    }

    public final ai4 j(int r5) {
        if ((this.j + 1) < this.f) goto L5;
        o();
    L5:
        ai4 r0 = a(4);
        float[] r1 = r0.u;
        int r2 = this.c + 1;
        this.c = r2;
        this.j++;
        r0.o = r2;
        r0.q = r5;
        ((ai4[]) this.m.p)[r2] = r0;
        fq3 r4 = this.d;
        r4.i.o = r0;
        Arrays.fill(r1, 0.0f);
        r1[r0.q] = 1.0f;
        r4.j(r0);
        return r0;
    }

    public final ai4 k(Object r6) {
        if (r6 != null) goto L5;
        return null;
    L5:
        if ((this.j + 1) < this.f) goto L8;
        o();
    L8:
        if ((r6 instanceof hb0) == false) goto L24;
        hb0 r7 = (hb0) r6;
        ai4 r0 = r7.i;
        if (r0 != null) goto L12;
        r7.h();
        r0 = r7.i;
    L12:
        int r8 = r0.o;
        yc5 r3 = this.m;
        if (r8 != (-1)) goto L15;
    L20:
        if (r8 == (-1)) goto L22;
        r0.c();
    L22:
        int r9 = this.c + 1;
        this.c = r9;
        this.j++;
        r0.o = r9;
        r0.y = 1;
        ((ai4[]) r3.p)[r9] = r0;
        return r0;
    L15:
        if (r8 > this.c) goto L20;
        if (((ai4[]) r3.p)[r8] == null) goto L20;
        return r0;
    L24:
        return null;
    }

    public final pi l() {
        yc5 r5 = this.m;
        jo3 r0 = (jo3) r5.n;
        int r1 = r0.o;
        if (r1 <= 0) goto L5;
        int r2 = r1 - 1;
        Object[] r3 = r0.n;
        Object r4 = r3[r2];
        r3[r2] = null;
        r0.o = r2;
    L6:
        pi r6 = (pi) r4;
        if (r6 == null) goto L11;
        r6.a = null;
        r6.d.b();
        r6.b = 0.0f;
        r6.e = false;
        return r6;
    L11:
        return new pi(r5);
    L5:
        r4 = null;
        goto L6
    }

    public final ai4 m() {
        if ((this.j + 1) < this.f) goto L5;
        o();
    L5:
        ai4 r0 = a(3);
        int r1 = this.c + 1;
        this.c = r1;
        this.j++;
        r0.o = r1;
        ((ai4[]) this.m.p)[r1] = r0;
        return r0;
    }

    public final void o() {
        int r0 = this.e * 2;
        this.e = r0;
        this.g = (pi[]) Arrays.copyOf(this.g, r0);
        yc5 r1 = this.m;
        r1.p = (ai4[]) Arrays.copyOf((ai4[]) r1.p, this.e);
        int r2 = this.e;
        this.i = new boolean[r2];
        this.f = r2;
        this.l = r2;
    }

    public final void p() {
        fq3 r0 = this.d;
        if (r0.e() == false) goto L7;
        i();
        return;
    L7:
        if (this.h == false) goto L18;
        int r1 = 0;
    L10:
        if (r1 >= this.k) goto L16;
        if (this.g[r1].e == false) goto L13;
        r1 = r1 + 1;
        goto L10
    L13:
        q(r0);
        return;
    L16:
        i();
        return;
    L18:
        q(r0);
    }

    public final void q(fq3 r19) {
        int r2 = 0;
    L4:
        if (r2 >= this.k) goto L47;
        pi r3 = this.g[r2];
        int r5 = 1;
        if (r3.a.y == 1) goto L46;
        float r4 = 0.0f;
        if (r3.b >= 0.0f) goto L46;
        boolean r6 = false;
        int r7 = 0;
    L11:
        if (r6 == true) goto L47;
        r7 = r7 + r5;
        float r8 = Float.MAX_VALUE;
        int r9 = -1;
        int r10 = -1;
        int r11 = 0;
        int r12 = 0;
    L14:
        if (r11 >= this.k) goto L39;
        pi r13 = this.g[r11];
        if (r13.a.y == r5) goto L38;
        if (r13.e == true) goto L38;
        if (r13.b >= r4) goto L38;
        int r14 = r13.d.d();
        int r15 = 0;
    L24:
        if (r15 >= r14) goto L38;
        ai4 r16 = r13.d.e(r15);
        float r1 = r13.d.c(r16);
        if (r1 <= r4) goto L37;
        int r17 = 0;
    L30:
        if (r17 >= 9) goto L37;
        float r18 = r16.t[r17] / r1;
        if (r18 >= r8) goto L34;
        if (r17 != r12) goto L34;
    L35:
        r12 = r17;
        r10 = r16.o;
        r9 = r11;
        r8 = r18;
    L36:
        r17 = r17 + 1;
    L34:
        if (r17 <= r12) goto L36;
    L37:
        r15 = r15 + 1;
        r4 = 0.0f;
    L38:
        r11 = r11 + 1;
        r4 = 0.0f;
        r5 = 1;
        goto L14
    L39:
        if (r9 == (-1)) goto L41;
        pi r20 = this.g[r9];
        r20.a.p = -1;
        r20.g(((ai4[]) this.m.p)[r10]);
        ai4 r21 = r20.a;
        r21.p = r9;
        r21.e(this, r20);
    L43:
        if (r7 <= (this.j / 2)) goto L45;
        r6 = true;
    L45:
        r4 = 0.0f;
        r5 = 1;
        goto L11
    L41:
        r6 = true;
    L46:
        r2 = r2 + 1;
    L47:
        r(r19);
        i();
    }

    public final void r(pi r17) {
        int r2 = 0;
        int r3 = 0;
    L4:
        if (r3 >= this.j) goto L6;
        this.i[r3] = false;
        r3 = r3 + 1;
        goto L4
    L6:
        boolean r4 = false;
        int r5 = 0;
    L7:
        if (r4 == true) goto L53;
        r5 = r5 + 1;
        if (r5 >= (this.j * 2)) goto L71;
        ai4 r6 = r17.a;
        if (r6 == null) goto L14;
        this.i[r6.o] = true;
    L14:
        ai4 r7 = r17.d(this.i);
        if (r7 == null) goto L20;
        boolean[] r8 = this.i;
        int r9 = r7.o;
        if (r8[r9] == true) goto L72;
        r8[r9] = true;
        goto L20
    L72:
        return;
    L20:
        if (r7 == null) goto L51;
        float r10 = Float.MAX_VALUE;
        int r11 = r2;
        int r12 = -1;
    L23:
        if (r11 >= this.k) goto L49;
        pi r13 = this.g[r11];
        if (r13.a.y == 1) goto L48;
        if (r13.e == true) goto L48;
        ji r14 = r13.d;
        int r15 = r14.h;
        if (r15 == (-1)) goto L41;
        int r16 = r2;
    L34:
        if (r15 == (-1)) goto L41;
        if (r16 >= r14.a) goto L41;
        if (r14.e[r15] == r7.o) goto L39;
        r15 = r14.f[r15];
        r16 = r16 + 1;
        goto L34
    L39:
        boolean r18 = true;
    L42:
        if (r18 == false) goto L48;
        float r19 = r13.d.c(r7);
        if (r19 >= 0.0f) goto L48;
        float r110 = (-r13.b) / r19;
        if (r110 >= r10) goto L48;
        r12 = r11;
        r10 = r110;
    L41:
        r18 = false;
    L48:
        r11 = r11 + 1;
        r2 = 0;
        goto L23
    L49:
        if (r12 <= (-1)) goto L52;
        pi r20 = this.g[r12];
        r20.a.p = -1;
        r20.g(r7);
        ai4 r21 = r20.a;
        r21.p = r12;
        r21.e(this, r20);
    L52:
        r2 = 0;
        goto L7
    L51:
        r4 = true;
        goto L52
    L71:
        return;
    }

    public final void s() {
        int r0 = 0;
    L4:
        if (r0 >= this.k) goto L9;
        pi r1 = this.g[r0];
        if (r1 == null) goto L8;
        ((jo3) this.m.n).c(r1);
    L8:
        this.g[r0] = null;
        r0 = r0 + 1;
        goto L4
    }

    public final void t() {
        int r1 = 0;
    L3:
        yc5 r2 = this.m;
        ai4[] r3 = (ai4[]) r2.p;
        if (r1 >= r3.length) goto L9;
        ai4 r4 = r3[r1];
        if (r4 == null) goto L8;
        r4.c();
    L8:
        r1 = r1 + 1;
        goto L3
    L9:
        jo3 r5 = (jo3) r2.o;
        ai4[] r6 = this.n;
        int r7 = this.o;
        r5.getClass();
        if (r7 <= r6.length) goto L12;
        r7 = r6.length;
    L12:
        int r8 = 0;
    L13:
        if (r8 >= r7) goto L18;
        ai4 r9 = r6[r8];
        int r10 = r5.o;
        Object[] r11 = r5.n;
        if (r10 >= r11.length) goto L17;
        r11[r10] = r9;
        r5.o = r10 + 1;
    L17:
        r8 = r8 + 1;
        goto L13
    L18:
        this.o = 0;
        Arrays.fill((ai4[]) r2.p, null);
        this.c = 0;
        fq3 r12 = this.d;
        r12.h = 0;
        r12.b = 0.0f;
        this.j = 1;
        int r13 = 0;
    L20:
        if (r13 >= this.k) goto L22;
        pi r14 = this.g[r13];
        r13 = r13 + 1;
        goto L20
    L22:
        s();
        this.k = 0;
        this.p = new pi(r2);
    }
}
