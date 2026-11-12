package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xe2 implements Cloneable {
    public /* synthetic */ boolean n;
    public /* synthetic */ long[] o;
    public /* synthetic */ Object[] p;
    public /* synthetic */ int q;

    public xe2(int r3) {
        if (r3 != 0) goto L6;
        this.o = su3.b;
        this.p = su3.c;
        return;
    L6:
        int r4 = r3 * 8;
        int r0 = 4;
    L8:
        if (r0 >= 32) goto L13;
        int r1 = (1 << r0) - 12;
        if (r4 <= r1) goto L11;
        r0 = r0 + 1;
        goto L8
    L11:
        r4 = r1;
    L13:
        int r5 = r4 / 8;
        this.o = new long[r5];
        this.p = new Object[r5];
    }

    public final void a() {
        int r0 = this.q;
        Object[] r1 = this.p;
        int r3 = 0;
    L3:
        if (r3 >= r0) goto L5;
        r1[r3] = null;
        r3 = r3 + 1;
        goto L3
    L5:
        this.q = 0;
        this.n = false;
    }

    public final Object b(long r3) {
        int r4 = su3.i(this.o, this.q, r3);
        if (r4 < 0) goto L8;
        Object r2 = this.p[r4];
        if (r2 == ud3.b) goto L10;
        return r2;
    L10:
        return null;
    L8:
        return null;
    }

    public final int c(long r10) {
        if (this.n == false) goto L14;
        int r0 = this.q;
        long[] r1 = this.o;
        Object[] r2 = this.p;
        int r4 = 0;
        int r5 = 0;
    L5:
        if (r4 >= r0) goto L12;
        Object r6 = r2[r4];
        if (r6 == ud3.b) goto L11;
        if (r4 == r5) goto L10;
        r1[r5] = r1[r4];
        r2[r5] = r6;
        r2[r4] = null;
    L10:
        r5 = r5 + 1;
    L11:
        r4 = r4 + 1;
        goto L5
    L12:
        this.n = false;
        this.q = r5;
    L14:
        return su3.i(this.o, this.q, r10);
    }

    public final Object clone() {
        Object r0 = super.clone();
        r0.getClass();
        xe2 r1 = (xe2) r0;
        r1.o = (long[]) this.o.clone();
        r1.p = (Object[]) this.p.clone();
        return r1;
    }

    public final boolean d() {
        if (h() != 0) goto L6;
        return true;
    L6:
        return false;
    }

    public final long e(int r10) {
        if (r10 < 0) goto L18;
        int r0 = this.q;
        if (r10 >= r0) goto L18;
        if (this.n == false) goto L17;
        long[] r1 = this.o;
        Object[] r2 = this.p;
        int r4 = 0;
        int r5 = 0;
    L8:
        if (r4 >= r0) goto L15;
        Object r6 = r2[r4];
        if (r6 == ud3.b) goto L14;
        if (r4 == r5) goto L13;
        r1[r5] = r1[r4];
        r2[r5] = r6;
        r2[r4] = null;
    L13:
        r5 = r5 + 1;
    L14:
        r4 = r4 + 1;
        goto L8
    L15:
        this.n = false;
        this.q = r5;
    L17:
        return this.o[r10];
    L18:
        kf2.n(f34.f(r10, "Expected index to be within 0..size()-1, but was "));
        return 0;
    }

    public final void f(long r11, Object r13) {
        Object r0 = ud3.b;
        int r1 = su3.i(this.o, this.q, r11);
        if (r1 < 0) goto L6;
        this.p[r1] = r13;
        return;
    L6:
        int r2 = ~r1;
        int r3 = this.q;
        if (r2 >= r3) goto L13;
        Object[] r4 = this.p;
        if (r4[r2] != r0) goto L13;
        this.o[r2] = r11;
        r4[r2] = r13;
        return;
    L13:
        if (this.n == false) goto L25;
        long[] r5 = this.o;
        if (r3 < r5.length) goto L25;
        Object[] r6 = this.p;
        int r7 = 0;
        int r8 = 0;
    L17:
        if (r7 >= r3) goto L24;
        Object r9 = r6[r7];
        if (r9 == r0) goto L23;
        if (r7 == r8) goto L22;
        r5[r8] = r5[r7];
        r6[r8] = r9;
        r6[r7] = null;
    L22:
        r8 = r8 + 1;
    L23:
        r7 = r7 + 1;
        goto L17
    L24:
        this.n = false;
        this.q = r8;
        r2 = ~su3.i(this.o, r8, r11);
    L25:
        int r10 = this.q;
        if (r10 < this.o.length) goto L35;
        int r12 = (r10 + 1) * 8;
        int r14 = 4;
    L29:
        if (r14 >= 32) goto L34;
        int r15 = (1 << r14) - 12;
        if (r12 <= r15) goto L32;
        r14 = r14 + 1;
        goto L29
    L32:
        r12 = r15;
    L34:
        int r16 = r12 / 8;
        this.o = Arrays.copyOf(this.o, r16);
        this.p = Arrays.copyOf(this.p, r16);
    L35:
        int r17 = this.q;
        if ((r17 - r2) == 0) goto L38;
        long[] r18 = this.o;
        int r19 = r2 + 1;
        ti.a0(r18, r18, r19, r2, r17);
        Object[] r20 = this.p;
        ti.Z(r19, r2, this.q, r20, r20);
    L38:
        this.o[r2] = r11;
        this.p[r2] = r13;
        this.q++;
    }

    public final void g(long r3) {
        int r4 = su3.i(this.o, this.q, r3);
        if (r4 < 0) goto L8;
        Object[] r5 = this.p;
        Object r0 = r5[r4];
        Object r1 = ud3.b;
        if (r0 == r1) goto L9;
        r5[r4] = r1;
        this.n = true;
        return;
    L9:
        return;
    }

    public final int h() {
        if (this.n == false) goto L14;
        int r0 = this.q;
        long[] r1 = this.o;
        Object[] r2 = this.p;
        int r4 = 0;
        int r5 = 0;
    L5:
        if (r4 >= r0) goto L12;
        Object r6 = r2[r4];
        if (r6 == ud3.b) goto L11;
        if (r4 == r5) goto L10;
        r1[r5] = r1[r4];
        r2[r5] = r6;
        r2[r4] = null;
    L10:
        r5 = r5 + 1;
    L11:
        r4 = r4 + 1;
        goto L5
    L12:
        this.n = false;
        this.q = r5;
    L14:
        return this.q;
    }

    public final Object i(int r11) {
        if (r11 < 0) goto L19;
        int r1 = this.q;
        if (r11 >= r1) goto L19;
        if (this.n == false) goto L18;
        long[] r2 = this.o;
        Object[] r3 = this.p;
        int r5 = 0;
        int r6 = 0;
    L9:
        if (r5 >= r1) goto L16;
        Object r7 = r3[r5];
        if (r7 == ud3.b) goto L15;
        if (r5 == r6) goto L14;
        r2[r6] = r2[r5];
        r3[r6] = r7;
        r3[r5] = null;
    L14:
        r6 = r6 + 1;
    L15:
        r5 = r5 + 1;
        goto L9
    L16:
        this.n = false;
        this.q = r6;
    L18:
        return this.p[r11];
    L19:
        kf2.n(f34.f(r11, "Expected index to be within 0..size()-1, but was "));
        return null;
    }

    public final String toString() {
        if (h() > 0) goto L6;
        return "{}";
    L6:
        StringBuilder r1 = new StringBuilder(this.q * 28);
        r1.append('{');
        int r0 = this.q;
        int r2 = 0;
    L7:
        if (r2 >= r0) goto L15;
        if (r2 <= 0) goto L10;
        r1.append(", ");
    L10:
        r1.append(e(r2));
        r1.append('=');
        Object r3 = i(r2);
        if (r3 == r1) goto L13;
        r1.append(r3);
    L14:
        r2 = r2 + 1;
        goto L7
    L13:
        r1.append("(this Map)");
        goto L14
    L15:
        r1.append('}');
        return r1.toString();
    }

    public /* synthetic */ xe2(Object r1) {
        this(10);
    }
}
