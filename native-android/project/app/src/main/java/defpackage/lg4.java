package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lg4 {
    public final ig4 a;
    public int[] b;
    public Object[] c;
    public ArrayList d;
    public HashMap e;
    public i03 f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public final o02 p;
    public final o02 q;
    public final o02 r;
    public i03 s;
    public int t;
    public int u;
    public int v;
    public boolean w;
    public h03 x;

    public lg4(ig4 r4) {
        this.a = r4;
        int[] r0 = r4.n;
        this.b = r0;
        Object[] r1 = r4.p;
        this.c = r1;
        this.d = r4.v;
        this.e = r4.w;
        this.f = r4.x;
        int r2 = r4.o;
        this.g = r2;
        this.h = (r0.length / 5) - r2;
        int r5 = r4.q;
        this.k = r5;
        this.l = r1.length - r5;
        this.m = r2;
        this.p = new o02();
        this.q = new o02();
        this.r = new o02();
        this.u = r2;
        this.v = -1;
    }

    public static int i(int r0, int r1, int r2, int r3) {
        if (r0 > r1) goto L4;
        return r0;
    L4:
        return -(((r3 - r2) - r0) + 1);
    }

    public static void z(lg4 r6) {
        int r0 = r6.v;
        int r1 = r6.r(r0);
        int[] r2 = r6.b;
        int r3 = (r1 * 5) + 1;
        int r4 = r2[r3];
        if ((r4 & 134217728) != 0) goto L10;
        int r5 = (r4 & (-134217729)) | 134217728;
        r2[r3] = r5;
        if ((67108864 & r5) == 0) goto L8;
        return;
    L8:
        r6.T(r6.E(r2, r0));
        return;
    }

    public final void A(ig4 r16, int r17) {
        if (this.n > 0) goto L7;
        l80.a("Check failed");
    L7:
        if (r17 == 0) goto L9;
    L16:
        lg4 r1 = r16.e();
        ud3.c0(r1, r17, this, true, true, false);     // Catch: Throwable -> L20
        r1.e(true);
        return;
    L20:
        th = move-exception;
        r1.e(false);
        throw th;
    L9:
        if (this.t != 0) goto L16;
        if (this.a.o != 0) goto L16;
        int[] r2 = r16.n;
        int r3 = r2[(r17 * 5) + 3];
        int r4 = r16.o;
        if (r3 != r4) goto L16;
        int[] r5 = this.b;
        Object[] r6 = this.c;
        ArrayList r7 = this.d;
        HashMap r8 = this.e;
        i03 r9 = this.f;
        Object[] r10 = r16.p;
        int r11 = r16.q;
        HashMap r12 = r16.w;
        i03 r13 = r16.x;
        this.b = r2;
        this.c = r10;
        this.d = r16.v;
        this.g = r4;
        this.h = (r2.length / 5) - r4;
        this.k = r11;
        this.l = r10.length - r11;
        this.m = r4;
        this.e = r12;
        this.f = r13;
        r16.n = r5;
        r16.o = 0;
        r16.p = r6;
        r16.q = 0;
        r16.v = r7;
        r16.w = r8;
        r16.x = r9;
    }

    public final void B(int r9) {
        int r0 = this.h;
        int r1 = this.g;
        if (r1 != r9) goto L5;
    L46:
        this.g = r9;
        return;
    L5:
        if (this.d.isEmpty() == true) goto L22;
        int r2 = this.h;
        int r3 = o() - r2;
        ArrayList r4 = this.d;
        if (r1 >= r9) goto L16;
        int r5 = kg4.a(r4, r1, r3);
    L10:
        if (r5 >= this.d.size()) goto L22;
        mg1 r6 = (mg1) this.d.get(r5);
        int r7 = r6.a;
        if (r7 >= 0) goto L22;
        int r8 = r7 + r3;
        if (r8 >= r9) goto L22;
        r6.a = r8;
        r5 = r5 + 1;
        goto L10
    L16:
        int r10 = kg4.a(r4, r9, r3);
    L18:
        if (r10 >= this.d.size()) goto L22;
        mg1 r11 = (mg1) this.d.get(r10);
        int r12 = r11.a;
        if (r12 < 0) goto L22;
        r11.a = -(r3 - r12);
        r10 = r10 + 1;
    L22:
        if (r0 <= 0) goto L27;
        int[] r13 = this.b;
        int r14 = r9 * 5;
        int r15 = r0 * 5;
        int r16 = r1 * 5;
        if (r9 >= r1) goto L26;
        ti.Y(r15 + r14, r14, r16, r13, r13);
        goto L27
    L26:
        ti.Y(r16, r16 + r15, r14 + r15, r13, r13);
    L27:
        if (r9 >= r1) goto L29;
        r1 = r9 + r0;
    L29:
        int r17 = o();
        if (r1 < r17) goto L33;
        l80.a("Check failed");
    L33:
        if (r1 >= r17) goto L46;
        int r18 = (r1 * 5) + 2;
        int r19 = this.b[r18];
        if (r19 <= (-2)) goto L37;
        int r20 = r19;
    L38:
        if (r20 < r9) goto L41;
        r20 = -((p() - r20) - (-2));
    L41:
        if (r20 == r19) goto L43;
        this.b[r18] = r20;
    L43:
        r1 = r1 + 1;
        if (r1 != r9) goto L33;
        r1 = r1 + r0;
        goto L33
    L37:
        r20 = (p() + r19) - (-2);
        goto L38
    }

    public final void C(int r8, int r9) {
        int r0 = this.l;
        int r1 = this.k;
        int r2 = this.m;
        if (r1 == r8) goto L8;
        Object[] r3 = this.c;
        if (r8 >= r1) goto L7;
        System.arraycopy(r3, r8, r3, r8 + r0, r1 - r8);
        goto L8
    L7:
        int r4 = r1 + r0;
        System.arraycopy(r3, r4, r3, r1, (r8 + r0) - r4);
    L8:
        int r10 = Math.min(r9 + 1, p());
        if (r2 == r10) goto L31;
        int r5 = this.c.length - r0;
        if (r10 >= r2) goto L21;
        int r6 = r(r10);
        int r7 = r(r2);
        int r11 = this.g;
    L13:
        if (r6 >= r7) goto L30;
        int r12 = (r6 * 5) + 4;
        int r13 = this.b[r12];
        if (r13 >= 0) goto L18;
        l80.a("Unexpected anchor value, expected a positive anchor");
    L18:
        this.b[r12] = -((r5 - r13) + 1);
        r6 = r6 + 1;
        if (r6 != r11) goto L13;
        r6 = r6 + this.h;
    L30:
        this.m = r10;
        goto L31
    L21:
        int r14 = r(r2);
        int r15 = r(r10);
    L22:
        if (r14 >= r15) goto L30;
        int r16 = (r14 * 5) + 4;
        int r17 = this.b[r16];
        if (r17 < 0) goto L27;
        l80.a("Unexpected anchor value, expected a negative anchor");
    L27:
        this.b[r16] = (r17 + r5) + 1;
        r14 = r14 + 1;
        if (r14 != this.g) goto L22;
        r14 = r14 + this.h;
    L31:
        this.k = r8;
    }

    public final Object D(int r4) {
        int r5 = r(r4);
        int[] r0 = this.b;
        if ((r0[(r5 * 5) + 1] & 1073741824) != 0) goto L5;
        return null;
    L5:
        return this.c[h(g(r0, r5))];
    }

    public final int E(int[] r1, int r2) {
        int r3 = r1[(r(r2) * 5) + 2];
        if (r3 <= (-2)) goto L6;
        return r3;
    L6:
        return (p() + r3) - (-2);
    }

    public final Object F(Object r5) {
        if (this.n <= 0) goto L5;
        x(1, this.v);
    L5:
        Object[] r0 = this.c;
        int r2 = this.i;
        this.i = r2 + 1;
        Object r1 = r0[h(r2)];
        if (this.i <= this.j) goto L9;
        l80.a("Writing to an invalid slot");
    L9:
        this.c[h(this.i - 1)] = r5;
        return r1;
    }

    public final void G() {
        h03 r0 = this.x;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.b == 0) goto L31;
        int r1 = ya4.M(r0);
        int r2 = r(r1);
        int r3 = r1 + 1;
        int r4 = u(r1) + r1;
    L7:
        int r5 = 0;
        if (r3 >= r4) goto L13;
        if ((this.b[(r(r3) * 5) + 1] & 201326592) != 0) goto L11;
        r3 = r3 + u(r3);
        goto L7
    L11:
        int r6 = 1;
    L14:
        int[] r7 = this.b;
        int r8 = (r2 * 5) + 1;
        int r9 = r7[r8];
        if ((67108864 & r9) == 0) goto L17;
        r5 = 1;
    L17:
        if (r5 == r6) goto L5;
        r7[r8] = (r6 << 26) | ((-67108865) & r9);
        int r10 = E(r7, r1);
        if (r10 < 0) goto L5;
        ya4.c(r0, r10);
        goto L5
    L13:
        r6 = 0;
        goto L14
    }

    public final boolean H() {
        if (this.n == 0) goto L6;
        l80.a("Cannot remove group while inserting");
    L6:
        int r0 = this.t;
        int r1 = this.i;
        int r2 = g(this.b, r(r0));
        int r3 = L();
        O(this.v);
        h03 r4 = this.x;
        if (r4 == null) goto L17;
    L8:
        int r5 = r4.b;
        if (r5 == 0) goto L17;
        if (r5 == 0) goto L15;
        if (r4.a[0] < r0) goto L17;
        ya4.M(r4);
        goto L8
    L15:
        kf2.m("IntList is empty.");
        return false;
    L17:
        boolean r6 = I(r0, this.t - r0);
        J(r2, this.i - r2, r0 - 1);
        this.t = r0;
        this.i = r1;
        this.o -= r3;
        return r6;
    }

    public final boolean I(int r10, int r11) {
        boolean r0 = false;
        if (r11 <= 0) goto L36;
        ArrayList r1 = this.d;
        B(r10);
        if (r1.isEmpty() == true) goto L25;
        HashMap r2 = this.e;
        int r4 = r10 + r11;
        int r3 = kg4.a(this.d, r4, o() - this.h);
        if (r3 < this.d.size()) goto L9;
        r3 = r3 - 1;
    L9:
        int r5 = r3 + 1;
        int r6 = 0;
    L10:
        if (r3 < 0) goto L21;
        mg1 r7 = (mg1) this.d.get(r3);
        int r8 = c(r7);
        if (r8 < r10) goto L21;
        if (r8 >= r4) goto L20;
        r7.a = Integer.MIN_VALUE;
        if (r2 == null) goto L17;
        tg1 r9 = (tg1) r2.remove(r7);
    L17:
        if (r6 != 0) goto L19;
        r6 = r3 + 1;
    L19:
        r5 = r3;
    L20:
        r3 = r3 - 1;
    L21:
        if (r5 >= r6) goto L23;
        r0 = true;
    L23:
        if (r0 == false) goto L25;
        this.d.subList(r5, r6).clear();
    L25:
        this.g = r10;
        this.h += r11;
        int r12 = this.m;
        if (r12 <= r10) goto L28;
        this.m = Math.max(r10, r12 - r11);
    L28:
        int r13 = this.u;
        if (r13 < this.g) goto L31;
        this.u = r13 - r11;
    L31:
        int r14 = this.v;
        if (r14 < 0) goto L36;
        if ((this.b[(r(r14) * 5) + 1] & 67108864) == 0) goto L36;
        T(r14);
    L36:
        return r0;
    }

    public final void J(int r3, int r4, int r5) {
        if (r4 <= 0) goto L7;
        int r0 = this.l;
        int r1 = r3 + r4;
        C(r1, r5);
        this.k = r3;
        this.l = r0 + r4;
        Arrays.fill(this.c, r3, r1, null);
        int r6 = this.j;
        if (r6 < r3) goto L8;
        this.j = r6 - r4;
        return;
    L8:
        return;
    }

    public final Object K(int r4, int r5, Object r6) {
        int r0 = N(this.b, r(r4));
        int r1 = g(this.b, r(r4 + 1));
        int r2 = r0 + r5;
        if (r2 < r0) goto L6;
        if (r2 >= r1) goto L6;
    L7:
        int r7 = h(r2);
        Object[] r3 = this.c;
        Object r8 = r3[r7];
        r3[r7] = r6;
        return r8;
    L6:
        l80.a("Write to an invalid slot index " + r5 + " for group " + r4);
        goto L7
    }

    public final int L() {
        int r0 = r(this.t);
        int r1 = this.t;
        int[] r2 = this.b;
        int r3 = r0 * 5;
        int r4 = r2[r3 + 3] + r1;
        this.t = r4;
        this.i = g(r2, r(r4));
        int r5 = this.b[r3 + 1];
        if ((1073741824 & r5) == 0) goto L6;
        return 1;
    L6:
        return r5 & 67108863;
    }

    public final void M() {
        int r0 = this.u;
        this.t = r0;
        this.i = g(this.b, r(r0));
    }

    public final int N(int[] r2, int r3) {
        if (r3 >= o()) goto L5;
        int r4 = kg4.b(r2, r3);
        int r5 = this.l;
        int r1 = this.c.length;
        if (r4 < 0) goto L9;
        return r4;
    L9:
        return ((r1 - r5) + r4) + 1;
    L5:
        return this.c.length - this.l;
    }

    public final tg1 O(int r3) {
        HashMap r0 = this.e;
        if (r0 == null) goto L8;
        mg1 r2 = R(r3);
        if (r2 == null) goto L8;
        return (tg1) r0.get(r2);
    L8:
        return null;
    }

    public final void P() {
        if (this.n == 0) goto L6;
        l80.a("Key must be supplied when inserting");
    L6:
        i80 r0 = j80.a;
        Q(r0, r0, false, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Q(Object r12, Object r13, boolean r14, int r15) {
        int r0 = this.v;
        if (this.n <= 0) goto L5;
        Object[] r1 = true;
    L6:
        this.r.c(this.o);
        i80 r4 = j80.a;
        if (r1 == false) goto L34;
        int r2 = this.t;
        int r5 = g(this.b, r(r2));
        w(1);
        this.i = r5;
        this.j = r5;
        int r6 = r(r2);
        if (r12 == r4) goto L11;
        int r7 = 1;
    L12:
        if (r14 == true) goto L15;
        if (r13 == r4) goto L15;
        int r8 = 1;
    L16:
        int r9 = i(r5, this.k, this.l, this.c.length);
        if (r9 >= 0) goto L19;
    L21:
        int[] r3 = this.b;
        int r10 = this.v;
        int r11 = r6 * 5;
        r3[r11] = r15;
        r3[r11 + 1] = (((r14 ? 1 : 0) << 30) | (r7 << 29)) | (r8 << 28);
        r3[r11 + 2] = r10;
        r3[r11 + 3] = 0;
        r3[r11 + 4] = r9;
        int r16 = ((r14 ? 1 : 0) + r7) + r8;
        if (r16 <= 0) goto L31;
        x(r16, r2);
        Object[] r17 = this.c;
        int r18 = this.i;
        if (r14 == false) goto L26;
        r17[r18] = r13;
        r18 = r18 + 1;
    L26:
        if (r7 == 0) goto L28;
        r17[r18] = r12;
        r18 = r18 + 1;
    L28:
        if (r8 == 0) goto L30;
        r17[r18] = r13;
        r18 = r18 + 1;
    L30:
        this.i = r18;
    L31:
        this.o = 0;
        int r19 = r2 + 1;
        this.v = r2;
        this.t = r19;
        if (r0 < 0) goto L40;
        O(r0);
    L40:
        this.u = r19;
        return;
    L19:
        if (this.m >= r2) goto L21;
        r9 = -(((this.c.length - this.l) - r9) + 1);
    L15:
        r8 = 0;
        goto L16
    L11:
        r7 = 0;
        goto L12
    L34:
        this.p.c(r0);
        this.q.c((o() - this.h) - this.u);
        int r110 = this.t;
        int r111 = r(r110);
        if (h12.c(r13, r4) == true) goto L39;
        if (r14 == false) goto L38;
        U(this.t, r13);
        goto L39
    L38:
        S(r13);
    L39:
        this.i = N(this.b, r111);
        this.j = g(this.b, r(this.t + 1));
        int[] r112 = this.b;
        int r113 = r111 * 5;
        this.o = r112[r113 + 1] & 67108863;
        this.v = r110;
        this.t = r110 + 1;
        r19 = r110 + r112[r113 + 3];
        goto L40
    L5:
        r1 = false;
        goto L6
    }

    public final mg1 R(int r3) {
        if (r3 >= 0) goto L5;
    L10:
        return null;
    L5:
        if (r3 >= p()) goto L10;
        ArrayList r1 = this.d;
        int r2 = kg4.e(r1, r3, p());
        if (r2 < 0) goto L10;
        return (mg1) r1.get(r2);
    }

    public final void S(Object r5) {
        int r0 = r(this.t);
        int r2 = (r0 * 5) + 1;
        if ((this.b[r2] & 268435456) != 0) goto L6;
        l80.a("Updating the data of a group that was not created with a data slot");
    L6:
        Object[] r1 = this.c;
        int[] r3 = this.b;
        int r4 = g(r3, r0);
        r1[h(Integer.bitCount(r3[r2] >> 29) + r4)] = r5;
    }

    public final void T(int r2) {
        if (r2 < 0) goto L8;
        h03 r0 = this.x;
        if (r0 != null) goto L6;
        r0 = new h03();
        this.x = r0;
    L6:
        ya4.c(r0, r2);
        return;
    }

    public final void U(int r4, Object r5) {
        int r0 = r(r4);
        int[] r1 = this.b;
        if (r0 < r1.length) goto L5;
    L7:
        l80.a("Updating the node of a group at " + r4 + " that was not created with as a node group");
    L8:
        this.c[h(g(this.b, r0))] = r5;
        return;
    L5:
        if ((r1[(r0 * 5) + 1] & 1073741824) == 0) goto L7;
        goto L7
    }

    public final void a(int r5) {
        if (r5 >= 0) goto L6;
        l80.a("Cannot seek backwards");
    L6:
        if (this.n <= 0) goto L9;
        oo3.b("Cannot call seek() while inserting");
    L9:
        if (r5 != 0) goto L11;
        return;
    L11:
        int r0 = this.t + r5;
        int r6 = this.v;
        if (r0 >= r6) goto L14;
    L16:
        l80.a("Cannot seek outside the current group (" + r6 + "-" + this.u + ")");
    L17:
        this.t = r0;
        int r7 = g(this.b, r(r0));
        this.i = r7;
        this.j = r7;
        return;
    L14:
        if (r0 > this.u) goto L16;
        goto L16
    }

    public final mg1 b(int r5) {
        ArrayList r0 = this.d;
        int r1 = kg4.e(r0, r5, p());
        if (r1 >= 0) goto L11;
        if (r5 <= this.g) goto L8;
        r5 = -(p() - r5);
    L8:
        mg1 r2 = new mg1(r5);
        r0.add(-(r1 + 1), r2);
        return r2;
    L11:
        return (mg1) r0.get(r1);
    }

    public final int c(mg1 r1) {
        int r2 = r1.a;
        if (r2 < 0) goto L5;
        return r2;
    L5:
        return p() + r2;
    }

    public final void d() {
        int r0 = this.n;
        this.n = r0 + 1;
        if (r0 != 0) goto L6;
        int r1 = (o() - this.h) - this.u;
        this.q.c(r1);
        return;
    }

    public final void e(boolean r8) {
        this.w = true;
        if (r8 == true) goto L5;
    L7:
        int[] r9 = this.b;
        int r0 = this.g;
        Object[] r1 = this.c;
        int r2 = this.k;
        ArrayList r3 = this.d;
        HashMap r4 = this.e;
        i03 r5 = this.f;
        ig4 r7 = this.a;
        if (r7.t == true) goto L11;
        oo3.a("Unexpected writer close()");
    L11:
        r7.t = false;
        r7.n = r9;
        r7.o = r0;
        r7.p = r1;
        r7.q = r2;
        r7.v = r3;
        r7.w = r4;
        r7.x = r5;
        return;
    L5:
        if (this.p.b != 0) goto L7;
        B(p());
        C(this.c.length - this.l, this.g);
        int r10 = this.k;
        int r6 = this.l + r10;
        Arrays.fill(this.c, r10, r6, null);
        G();
        goto L7
    }

    public final int f(int r2) {
        return g(this.b, r(r2));
    }

    public final int g(int[] r2, int r3) {
        if (r3 >= o()) goto L5;
        int r4 = r2[(r3 * 5) + 4];
        int r5 = this.l;
        int r1 = this.c.length;
        if (r4 < 0) goto L9;
        return r4;
    L9:
        return ((r1 - r5) + r4) + 1;
    L5:
        return this.c.length - this.l;
    }

    public final int h(int r2) {
        int r0 = this.l;
        if (r2 >= this.k) goto L5;
        int r1 = 0;
    L7:
        return (r0 * r1) + r2;
    L5:
        r1 = 1;
        goto L7
    }

    public final void j() {
        int r1 = 0;
        if (this.n <= 0) goto L5;
        boolean r0 = true;
    L6:
        int r3 = this.t;
        int r4 = this.u;
        int r5 = this.v;
        int r6 = r(r5);
        int r7 = this.o;
        int r8 = r3 - r5;
        int r10 = r6 * 5;
        int r11 = r10 + 1;
        if ((this.b[r11] & 1073741824) == 0) goto L9;
        boolean r9 = true;
    L10:
        o02 r13 = this.r;
        if (r0 == false) goto L32;
        i03 r2 = this.s;
        if (r2 == null) goto L20;
        q03 r12 = (q03) r2.b(r5);
        if (r12 == null) goto L20;
        Object[] r14 = r12.a;
        int r15 = r12.b;
        int r16 = 0;
    L17:
        if (r16 >= r15) goto L19;
        F(r14[r16]);
        r16 = r16 + 1;
        goto L17
    L19:
        q03 r17 = (q03) r2.g(r5);
    L20:
        int[] r18 = this.b;
        r18[r10 + 3] = r8;
        kg4.c(r6, r7, r18);
        int r19 = r13.b();
        if (r9 == false) goto L23;
        r7 = 1;
    L23:
        this.o = r19 + r7;
        int r20 = E(this.b, r5);
        this.v = r20;
        if (r20 >= 0) goto L26;
        int r21 = p();
    L27:
        if (r21 < 0) goto L30;
        r1 = g(this.b, r21);
    L30:
        this.i = r1;
        this.j = r1;
        return;
    L26:
        r21 = r(r20 + 1);
        goto L27
    L32:
        if (r3 == r4) goto L35;
        l80.a("Expected to be at the end of a group");
    L35:
        int[] r22 = this.b;
        int r110 = r10 + 3;
        int r23 = r22[r110];
        int r24 = r22[r11] & 67108863;
        r22[r110] = r8;
        kg4.c(r6, r7, r22);
        int r25 = this.p.b();
        this.u = (o() - this.h) - this.q.b();
        this.v = r25;
        int r26 = E(this.b, r5);
        int r27 = r13.b();
        this.o = r27;
        if (r26 != r25) goto L42;
        if (r9 == true) goto L40;
        r1 = r7 - r24;
    L40:
        this.o = r27 + r1;
        return;
    L42:
        int r28 = r8 - r23;
        if (r9 == false) goto L45;
        int r29 = 0;
    L46:
        if (r28 != 0) goto L48;
        if (r29 != 0) goto L48;
    L61:
        this.o += r29;
        return;
    L48:
        if (r26 == 0) goto L61;
        if (r26 == r25) goto L61;
        if (r29 != 0) goto L52;
        if (r28 == 0) goto L61;
    L52:
        int r30 = r(r26);
        if (r28 == 0) goto L55;
        int[] r31 = this.b;
        int r32 = (r30 * 5) + 3;
        r31[r32] = r31[r32] + r28;
    L55:
        if (r29 == 0) goto L57;
        int[] r33 = this.b;
        kg4.c(r30, (r33[(r30 * 5) + 1] & 67108863) + r29, r33);
    L57:
        int[] r34 = this.b;
        if ((r34[(r30 * 5) + 1] & 1073741824) == 0) goto L60;
        r29 = 0;
    L60:
        r26 = E(r34, r26);
        goto L48
    L45:
        r29 = r7 - r24;
        goto L46
    L9:
        r9 = false;
        goto L10
    L5:
        r0 = false;
        goto L6
    }

    public final void k() {
        if (this.n > 0) goto L6;
        oo3.b("Unbalanced begin/end insert");
    L6:
        int r0 = this.n - 1;
        this.n = r0;
        if (r0 == 0) goto L9;
        return;
    L9:
        if (this.r.b == this.p.b) goto L12;
        l80.a("startGroup/endGroup mismatch while inserting");
    L12:
        this.u = (o() - this.h) - this.q.b();
    }

    public final void l(int r5) {
        boolean r1 = false;
        if (this.n > 0) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == true) goto L8;
        l80.a("Cannot call ensureStarted() while inserting");
    L8:
        int r2 = this.v;
        if (r2 == r5) goto L18;
        if (r5 >= r2) goto L12;
    L14:
        if (r1 == true) goto L16;
        l80.a("Started group at " + r5 + " must be a subgroup of the group at " + r2);
    L16:
        int r3 = this.t;
        int r4 = this.i;
        int r6 = this.j;
        this.t = r5;
        P();
        this.t = r3;
        this.i = r4;
        this.j = r6;
        return;
    L12:
        if (r5 >= this.u) goto L14;
        r1 = true;
        goto L14
    L18:
        return;
    L5:
        r0 = false;
        goto L6
    }

    public final void m(int r3, int r4, int r5) {
        if (r3 < this.g) goto L6;
        r3 = -((p() - r3) + 2);
    L6:
        if (r5 >= r4) goto L8;
        this.b[(r(r5) * 5) + 2] = r3;
        int r0 = this.b[(r(r5) * 5) + 3] + r5;
        m(r5, r0, r5 + 1);
        r5 = r0;
        goto L6
    }

    public final void n(int r20, wf1 r21) {
        int r3 = E(this.b, r20);
        int r4 = p();
        int r5 = u(r20) + r20;
        int r7 = r20;
        j03 r8 = null;
        h03 r9 = null;
    L3:
        if (r7 >= r5) goto L77;
        int r10 = f(r7);
        int r11 = r7 + 1;
        int r12 = f(r11);
    L5:
        if (r10 >= r12) goto L36;
        Object r14 = this.c[h(r10)];
        if ((r14 instanceof wg1) == false) goto L31;
        wg1 r15 = (wg1) r14;
        if ((r15 instanceof wg1) == true) goto L12;
        r15 = null;
    L12:
        if (r15 == null) goto L32;
        int r6 = r15.b;
        if (r6 < 0) goto L31;
        int r16 = u(r7) + r7;
        int r17 = r11;
        int r13 = 0;
    L16:
        if (r17 >= r16) goto L25;
        if (r13 >= r6) goto L25;
        int r18 = r(r17);
        int r19 = r3;
        int[] r22 = this.b;
        int r110 = r18 * 5;
        r17 = r22[r110 + 3] + r17;
        if (r17 >= r16) goto L24;
        if ((r22[r110 + 1] & 536870912) != 0) goto L24;
        r13 = r13 + 1;
    L24:
        r3 = r19;
    L25:
        int r111 = r3;
        if (r8 != null) goto L28;
        int[] r23 = m02.a;
        r8 = new j03();
    L28:
        if (r9 != null) goto L30;
        r9 = new h03();
    L30:
        r8.a(r17);
        r9.a(r17);
        r9.a(r10);
    L35:
        r10 = r10 + 1;
        r3 = r111;
        goto L5
    L32:
        l80.b("Inconsistent composition");
        er1.a();
        return;
    L31:
        r111 = r3;
        r21.invoke(Integer.valueOf(r10), r14);
        goto L35
    L36:
        int r112 = r3;
        if (r11 >= r4) goto L39;
        r3 = E(this.b, r11);
    L40:
        if (r3 == r7) goto L75;
        int r24 = r112;
    L42:
        if (r9 == null) goto L71;
        if (r8 == null) goto L71;
        if (r8.f(r7) == false) goto L71;
        int r113 = r9.b;
        int r114 = r113 / 2;
        int r115 = 0;
        int r116 = 0;
    L47:
        if (r115 >= r114) goto L55;
        int r117 = r115 * 2;
        int r118 = r4;
        int r25 = r9.b(r117);
        if (r25 != r7) goto L51;
        int r26 = r9.b(r117 + 1);
        r21.invoke(Integer.valueOf(r26), this.c[h(r26)]);
    L54:
        r115 = r115 + 1;
        r21 = r21;
        r4 = r118;
        goto L47
    L51:
        if (r117 == r116) goto L53;
        int r2 = r116 + 1;
        r9.d(r116, r25);
        r116 = r116 + 2;
        r9.d(r2, r9.b(r117 + 1));
        goto L54
    L53:
        r116 = r116 + 2;
        goto L54
    L55:
        int r119 = r4;
        if (r116 == r113) goto L72;
        if (r116 < 0) goto L69;
        int r27 = r9.b;
        if (r116 > r27) goto L69;
        if (r113 < 0) goto L69;
        if (r113 > r27) goto L69;
        if (r113 < r116) goto L67;
        if (r113 == r116) goto L72;
        if (r113 >= r27) goto L66;
        int[] r28 = r9.a;
        ti.Y(r116, r113, r27, r28, r28);
    L66:
        r9.b -= r113 - r116;
        goto L72
    L67:
        kf2.n("The end index must be < start index");
        return;
    L69:
        kf2.h("Index must be between 0 and size");
        return;
    L72:
        if (r7 == r20) goto L76;
        if (r24 == r3) goto L76;
        r7 = r24;
        r4 = r119;
        r24 = E(this.b, r24);
        r21 = r21;
    L76:
        r7 = r11;
        r4 = r119;
    L71:
        r119 = r4;
        goto L72
    L75:
        r119 = r4;
        goto L76
    L39:
        r3 = -1;
        goto L40
    }

    public final int o() {
        return this.b.length / 5;
    }

    public final int p() {
        return o() - this.h;
    }

    public final Object q(int r5) {
        int r6 = r(r5);
        int[] r0 = this.b;
        int r1 = (r6 * 5) + 1;
        if ((r0[r1] & 268435456) == 0) goto L7;
        Object[] r2 = this.c;
        int r4 = g(r0, r6);
        return r2[Integer.bitCount(r0[r1] >> 29) + r4];
    L7:
        return j80.a;
    }

    public final int r(int r2) {
        int r0 = this.h;
        if (r2 >= this.g) goto L5;
        int r1 = 0;
    L7:
        return (r0 * r1) + r2;
    L5:
        r1 = 1;
        goto L7
    }

    public final int s(int r2) {
        return this.b[r(r2) * 5];
    }

    public final Object t(int r4) {
        int r5 = r(r4);
        int[] r0 = this.b;
        int r6 = r5 * 5;
        int r1 = r0[r6 + 1];
        if ((536870912 & r1) == 0) goto L6;
        Object[] r3 = this.c;
        int r7 = r0[r6 + 4];
        return r3[Integer.bitCount(r1 >> 30) + r7];
    L6:
        return null;
    }

    public final String toString() {
        int r0 = this.t;
        int r1 = this.u;
        int r2 = p();
        int r3 = this.g;
        int r7 = this.h + r3;
        StringBuilder r4 = b11.t("SlotWriter(current = ", " end=", r0, r1, " size = ");
        r4.append(r2);
        r4.append(" gap=");
        r4.append(r3);
        r4.append("-");
        return f34.i(r4, r7, ")");
    }

    public final int u(int r2) {
        return this.b[(r(r2) * 5) + 3];
    }

    public final boolean v(int r6, int r7) {
        if (r7 != this.v) goto L5;
        int r5 = this.u;
    L19:
        if (r6 <= r7) goto L23;
        if (r6 >= r5) goto L23;
        return true;
    L23:
        return false;
    L5:
        o02 r0 = this.p;
        if (r7 <= r0.a(0)) goto L9;
        int r8 = u(r7);
    L8:
        r5 = r8 + r7;
        goto L19
    L9:
        int[] r2 = r0.a;
        int r1 = Math.min(r2.length, r0.b);
        int r3 = 0;
    L10:
        if (r3 >= r1) goto L15;
        if (r2[r3] == r7) goto L16;
        r3 = r3 + 1;
    L16:
        if (r3 >= 0) goto L18;
        r8 = u(r7);
        goto L8
    L18:
        r5 = (o() - this.h) - this.q.a[r3];
        goto L19
    L15:
        r3 = -1;
        goto L16
    }

    public final void w(int r12) {
        if (r12 <= 0) goto L25;
        int r0 = this.t;
        B(r0);
        int r1 = this.g;
        int r2 = this.h;
        int[] r3 = this.b;
        int r4 = r3.length / 5;
        int r5 = r4 - r2;
        int r6 = 0;
        if (r2 >= r12) goto L6;
        int r7 = Math.max(Math.max(r4 * 2, r5 + r12), 32);
        int[] r8 = new int[r7 * 5];
        int r9 = r7 - r5;
        ti.Y(0, 0, r1 * 5, r3, r8);
        ti.Y((r1 + r9) * 5, (r2 + r1) * 5, r4 * 5, r3, r8);
        this.b = r8;
        r2 = r9;
    L6:
        int r10 = this.u;
        if (r10 < r1) goto L9;
        this.u = r10 + r12;
    L9:
        int r11 = r1 + r12;
        this.g = r11;
        this.h = r2 - r12;
        if (r5 <= 0) goto L12;
        int r13 = f(r0 + r12);
    L14:
        if (this.m < r1) goto L17;
        r6 = this.k;
    L17:
        int r14 = i(r13, r6, this.l, this.c.length);
        int r15 = r1;
    L18:
        if (r15 >= r11) goto L20;
        this.b[(r15 * 5) + 4] = r14;
        r15 = r15 + 1;
        goto L18
    L20:
        int r16 = this.m;
        if (r16 < r1) goto L26;
        this.m = r16 + r12;
        return;
    L26:
        return;
    L12:
        r13 = 0;
        goto L14
    }

    public final void x(int r10, int r11) {
        if (r10 <= 0) goto L15;
        C(this.i, r11);
        int r12 = this.k;
        int r0 = this.l;
        if (r0 >= r10) goto L9;
        Object[] r1 = this.c;
        int r2 = r1.length;
        int r3 = r2 - r0;
        int r4 = Math.max(Math.max(r2 * 2, r3 + r10), 32);
        Object[] r5 = new Object[r4];
        int r7 = 0;
    L6:
        if (r7 >= r4) goto L8;
        r5[r7] = null;
        r7 = r7 + 1;
        goto L6
    L8:
        int r6 = r4 - r3;
        int r8 = r0 + r12;
        System.arraycopy(r1, 0, r5, 0, r12);
        System.arraycopy(r1, r8, r5, r12 + r6, r2 - r8);
        this.c = r5;
        r0 = r6;
    L9:
        int r9 = this.j;
        if (r9 < r12) goto L12;
        this.j = r9 + r10;
    L12:
        this.k = r12 + r10;
        this.l = r0 - r10;
        return;
    }

    public final boolean y(int r2) {
        if ((this.b[(r(r2) * 5) + 1] & 1073741824) == 0) goto L5;
        return true;
    L5:
        return false;
    }
}
