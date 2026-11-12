package defpackage;

import java.util.Arrays;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wf3 extends y1 {
    public final Object[] n;
    public final Object[] o;
    public final int p;
    public final int q;

    public wf3(Object[] r1, Object[] r2, int r3, int r4) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
        this.q = r4;
        if (a() <= 32) goto L5;
        boolean r5 = true;
    L6:
        if (r5 == true) goto L8;
        oo3.a("Trie-based persistent vector should have at least 33 elements, got " + a());
    L8:
        int r0 = r2.length;
        return;
    L5:
        r5 = false;
        goto L6
    }

    public static Object[] j(Object[] r4, int r5, int r6, Object r7, t3 r8) {
        int r0 = uc5.t(r6, r5);
        if (r5 != 0) goto L9;
        if (r0 != 0) goto L6;
        Object[] r9 = new Object[32];
    L7:
        ti.Z(r0 + 1, r0, 31, r4, r9);
        r8.a = r4[31];
        r9[r0] = r7;
        return r9;
    L6:
        r9 = Arrays.copyOf(r4, 32);
        goto L7
    L9:
        Object[] r2 = Arrays.copyOf(r4, 32);
        int r10 = r5 - 5;
        Object r3 = r4[r0];
        r3.getClass();
        r2[r0] = j((Object[]) r3, r10, r6, r7, r8);
    L10:
        r0 = r0 + 1;
        if (r0 >= 32) goto L15;
        if (r2[r0] == null) goto L15;
        Object r11 = r4[r0];
        r11.getClass();
        r2[r0] = j((Object[]) r11, r10, 0, r8.a, r8);
    L15:
        return r2;
    }

    public static Object[] l(Object[] r4, int r5, int r6, t3 r7) {
        int r0 = uc5.t(r6, r5);
        if (r5 != 5) goto L5;
        r7.a = r4[r0];
        Object[] r8 = null;
    L6:
        if (r8 != null) goto L9;
        if (r0 != 0) goto L9;
        return null;
    L9:
        Object[] r9 = Arrays.copyOf(r4, 32);
        r9[r0] = r8;
        return r9;
    L5:
        Object r3 = r4[r0];
        r3.getClass();
        r8 = l((Object[]) r3, r5 - 5, r6, r7);
        goto L6
    }

    public static Object[] r(int r2, int r3, Object r4, Object[] r5) {
        int r0 = uc5.t(r3, r2);
        Object[] r6 = Arrays.copyOf(r5, 32);
        if (r2 != 0) goto L6;
        r6[r0] = r4;
        return r6;
    L6:
        Object r1 = r6[r0];
        r1.getClass();
        r6[r0] = r(r2 - 5, r3, r4, (Object[]) r1);
        return r6;
    }

    @Override // defpackage.y
    public final int a() {
        return this.p;
    }

    @Override // defpackage.y1
    public final y1 b(int r4, Object r5) {
        int r0 = this.p;
        uo.i(r4, r0);
        if (r4 == r0) goto L5;
        int r1 = q();
        Object[] r2 = this.n;
        if (r4 >= r1) goto L9;
        t3 r3 = new t3(null);
        Object[] r6 = j(r2, this.q, r4, r5, r3);
        return k(0, r3.a, r6);
    L9:
        return k(r4 - r1, r5, r2);
    L5:
        return d(r5);
    }

    @Override // defpackage.y1
    public final y1 d(Object r6) {
        int r0 = q();
        int r1 = this.p;
        int r2 = r1 - r0;
        Object[] r3 = this.n;
        Object[] r4 = this.o;
        if (r2 >= 32) goto L6;
        Object[] r5 = Arrays.copyOf(r4, 32);
        r5[r2] = r6;
        return new wf3(r3, r5, r1 + 1, this.q);
    L6:
        Object[] r7 = new Object[32];
        r7[0] = r6;
        return m(r3, r4, r7);
    }

    @Override // defpackage.y1
    public final xf3 f() {
        Object[] r1 = this.o;
        int r2 = this.q;
        return new xf3(this, this.n, r1, r2);
    }

    @Override // defpackage.y1
    public final y1 g(x1 r5) {
        Object[] r1 = this.o;
        int r2 = this.q;
        xf3 r0 = new xf3(this, this.n, r1, r2);
        r0.z(r5);
        return r0.d();
    }

    @Override // java.util.List
    public final Object get(int r3) {
        uo.e(r3, a());
        if (q() > r3) goto L5;
        Object[] r2 = this.o;
    L10:
        return r2[r3 & 31];
    L5:
        Object[] r0 = this.n;
        int r4 = this.q;
    L6:
        if (r4 <= 0) goto L8;
        Object[] r1 = r0[uc5.t(r3, r4)];
        r1.getClass();
        r0 = r1;
        r4 = r4 - 5;
        goto L6
    L8:
        r2 = r0;
        goto L10
    }

    @Override // defpackage.y1
    public final y1 h(int r7) {
        uo.e(r7, a());
        int r0 = q();
        int r1 = this.q;
        Object[] r2 = this.n;
        if (r7 < r0) goto L7;
        return p(r2, r0, r1, r7 - r0);
    L7:
        return p(o(r2, r1, r7, new t3(this.o[0])), r0, r1, 0);
    }

    @Override // defpackage.y1
    public final y1 i(int r5, Object r6) {
        int r0 = this.p;
        uo.e(r5, r0);
        int r1 = q();
        Object[] r2 = this.n;
        Object[] r3 = this.o;
        int r4 = this.q;
        if (r1 > r5) goto L7;
        Object[] r7 = Arrays.copyOf(r3, 32);
        r7[r5 & 31] = r6;
        return new wf3(r2, r7, r0, r4);
    L7:
        return new wf3(r(r4, r5, r6, r2), r3, r0, r4);
    }

    public final wf3 k(int r7, Object r8, Object[] r9) {
        int r0 = q();
        int r1 = this.p;
        int r2 = r1 - r0;
        Object[] r3 = this.o;
        Object[] r4 = Arrays.copyOf(r3, 32);
        if (r2 >= 32) goto L6;
        ti.Z(r7 + 1, r7, r2, r3, r4);
        r4[r7] = r8;
        return new wf3(r9, r4, r1 + 1, this.q);
    L6:
        Object r5 = r3[31];
        ti.Z(r7 + 1, r7, r2 - 1, r3, r4);
        r4[r7] = r8;
        Object[] r10 = new Object[32];
        r10[0] = r5;
        return m(r9, r4, r10);
    }

    @Override // defpackage.a1, java.util.List
    public final ListIterator listIterator(int r8) {
        uo.i(r8, this.p);
        int r4 = (this.q / 5) + 1;
        return new yf3(r8, this.p, r4, this.n, this.o);
    }

    public final wf3 m(Object[] r6, Object[] r7, Object[] r8) {
        int r0 = this.p;
        int r1 = r0 >> 5;
        int r3 = this.q;
        if (r1 <= (1 << r3)) goto L7;
        Object[] r2 = new Object[32];
        r2[0] = r6;
        int r4 = r3 + 5;
        return new wf3(n(r4, r2, r7), r8, r0 + 1, r4);
    L7:
        return new wf3(n(r3, r6, r7), r8, r0 + 1, r3);
    }

    public final Object[] n(int r4, Object[] r5, Object[] r6) {
        int r0 = uc5.t(a() - 1, r4);
        if (r5 == null) goto L5;
        Object[] r7 = Arrays.copyOf(r5, 32);
    L7:
        if (r4 != 5) goto L10;
        r7[r0] = r6;
        return r7;
    L10:
        r7[r0] = n(r4 - 5, (Object[]) r7[r0], r6);
        return r7;
    L5:
        r7 = new Object[32];
        goto L7
    }

    public final Object[] o(Object[] r6, int r7, int r8, t3 r9) {
        int r0 = uc5.t(r8, r7);
        int r1 = 31;
        if (r7 != 0) goto L10;
        if (r0 != 0) goto L6;
        Object[] r5 = new Object[32];
    L7:
        ti.Z(r0, r0 + 1, 32, r6, r5);
        r5[31] = r9.a;
        r9.a = r6[r0];
        return r5;
    L6:
        r5 = Arrays.copyOf(r6, 32);
        goto L7
    L10:
        if (r6[31] != null) goto L12;
        r1 = uc5.t(q() - 1, r7);
    L12:
        Object[] r10 = Arrays.copyOf(r6, 32);
        int r11 = r7 - 5;
        int r2 = r0 + 1;
        if (r2 > r1) goto L17;
    L14:
        Object r3 = r10[r1];
        r3.getClass();
        r10[r1] = o((Object[]) r3, r11, 0, r9);
        if (r1 == r2) goto L17;
        r1 = r1 - 1;
    L17:
        Object r4 = r10[r0];
        r4.getClass();
        r10[r0] = o((Object[]) r4, r11, r8, r9);
        return r10;
    }

    public final y1 p(Object[] r7, int r8, int r9, int r10) {
        int r0 = this.p - r8;
        if (r0 != 1) goto L16;
        if (r9 == 0) goto L6;
        t3 r6 = new t3(null);
        Object[] r11 = l(r7, r9, r8 - 1, r6);
        r11.getClass();
        Object r12 = r6.a;
        r12.getClass();
        Object[] r13 = (Object[]) r12;
        if (r11[1] != null) goto L15;
        Object r14 = r11[0];
        r14.getClass();
        return new wf3((Object[]) r14, r13, r8, r9 - 5);
    L15:
        return new wf3(r11, r13, r8, r9);
    L6:
        if (r7.length != 33) goto L9;
        r7 = Arrays.copyOf(r7, 32);
    L9:
        return new og4(r7);
    L16:
        Object[] r15 = this.o;
        Object[] r2 = Arrays.copyOf(r15, 32);
        int r4 = r0 - 1;
        if (r10 >= r4) goto L19;
        ti.Z(r10, r10 + 1, r0, r15, r2);
    L19:
        r2[r4] = null;
        return new wf3(r7, r2, (r8 + r0) - 1, r9);
    }

    public final int q() {
        return (this.p - 1) & (-32);
    }
}
