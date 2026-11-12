package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xf3 extends v1 implements Collection, y32 {
    public y1 n;
    public Object[] o;
    public Object[] p;
    public int q;
    public tv1 r;
    public Object[] s;
    public Object[] t;
    public int u;

    public xf3(y1 r1, Object[] r2, Object[] r3, int r4) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
        this.q = r4;
        this.r = new tv1();
        this.s = r2;
        this.t = r3;
        this.u = r1.a();
    }

    public static void e(Object[] r2, int r3, Iterator r4) {
    L3:
        if (r3 >= 32) goto L7;
        if (r4.hasNext() == false) goto L10;
        r2[r3] = r4.next();
        r3 = r3 + 1;
        goto L3
    L10:
        return;
    }

    public final Object[] A(Object[] r6, int r7, int r8, t3 r9) {
        int r0 = uc5.t(r8, r7);
        int r1 = 31;
        if (r7 != 0) goto L7;
        Object r10 = r6[r0];
        Object[] r5 = l(r6);
        ti.Z(r0, r0 + 1, 32, r6, r5);
        r5[31] = r9.a;
        r9.a = r10;
        return r5;
    L7:
        if (r6[31] != null) goto L9;
        r1 = uc5.t(C() - 1, r7);
    L9:
        Object[] r11 = l(r6);
        int r12 = r7 - 5;
        int r2 = r0 + 1;
        if (r2 > r1) goto L14;
    L11:
        Object r3 = r11[r1];
        r3.getClass();
        r11[r1] = A((Object[]) r3, r12, 0, r9);
        if (r1 == r2) goto L14;
        r1 = r1 - 1;
    L14:
        Object r4 = r11[r0];
        r4.getClass();
        r11[r0] = A((Object[]) r4, r12, r8, r9);
        return r11;
    }

    public final Object B(Object[] r7, int r8, int r9, int r10) {
        int r0 = this.u - r8;
        Object[] r1 = this.t;
        if (r0 != 1) goto L6;
        Object r11 = r1[0];
        r(r7, r8, r9);
        return r11;
    L6:
        Object r3 = r1[r10];
        Object[] r4 = l(r1);
        ti.Z(r10, r10 + 1, r0, r1, r4);
        r4[r0 - 1] = null;
        this.s = r7;
        this.t = r4;
        this.u = (r8 + r0) - 1;
        this.q = r9;
        return r3;
    }

    public final int C() {
        int r1 = this.u;
        if (r1 > 32) goto L7;
        return 0;
    L7:
        return (r1 - 1) & (-32);
    }

    public final Object[] D(Object[] r9, int r10, int r11, Object r12, t3 r13) {
        int r0 = uc5.t(r11, r10);
        Object[] r1 = l(r9);
        if (r10 != 0) goto L8;
        if (r1 == r9) goto L6;
        ((AbstractList) this).modCount++;
    L6:
        r13.a = r1[r0];
        r1[r0] = r12;
        return r1;
    L8:
        Object r14 = r1[r0];
        r14.getClass();
        r1[r0] = D((Object[]) r14, r10 - 5, r11, r12, r13);
        return r1;
    }

    public final void E(Collection r6, int r7, Object[] r8, int r9, Object[][] r10, int r11, Object[] r12) {
        int r0 = 1;
        if (r11 >= 1) goto L6;
        oo3.a("requires at least one nullBuffer");
    L6:
        Object[] r13 = l(r8);
        r10[0] = r13;
        int r2 = r7 & 31;
        int r14 = ((r6.size() + r7) - 1) & 31;
        int r3 = (r9 - r2) + r14;
        if (r3 >= 32) goto L9;
        ti.Z(r14 + 1, r2, r9, r13, r12);
    L14:
        Iterator r15 = r6.iterator();
        e(r13, r2, r15);
    L15:
        if (r0 >= r11) goto L17;
        Object[] r16 = n();
        e(r16, 0, r15);
        r10[r0] = r16;
        r0 = r0 + 1;
        goto L15
    L17:
        e(r12, 0, r15);
        return;
    L9:
        int r4 = r3 - 31;
        if (r11 != 1) goto L12;
        Object[] r5 = r13;
    L13:
        int r17 = r9 - r4;
        ti.Z(0, r17, r9, r13, r12);
        ti.Z(r14 + 1, r2, r17, r13, r5);
        r12 = r5;
        goto L14
    L12:
        r5 = n();
        r11 = r11 - 1;
        r10[r11] = r5;
        goto L13
    }

    public final int F() {
        int r1 = this.u;
        if (r1 > 32) goto L6;
        return r1;
    L6:
        return r1 - ((r1 - 1) & (-32));
    }

    @Override // defpackage.v1
    public final int a() {
        return this.u;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int r9, Object r10) {
        uo.i(r9, a());
        if (r9 != a()) goto L6;
        add(r10);
        return;
    L6:
        ((AbstractList) this).modCount++;
        int r0 = C();
        if (r9 < r0) goto L10;
        i(r9 - r0, r10, this.s);
        return;
    L10:
        t3 r7 = new t3(null);
        Object[] r3 = this.s;
        r3.getClass();
        i(0, r7.a, h(r3, this.q, r9, r10, r7));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int r14, Collection r15) {
        uo.i(r14, this.u);
        if (r14 != this.u) goto L7;
        return addAll(r15);
    L7:
        if (r15.isEmpty() == false) goto L9;
        return false;
    L9:
        ((AbstractList) this).modCount++;
        int r0 = (r14 >> 5) << 5;
        int r10 = ((r15.size() + (this.u - r0)) - 1) / 32;
        if (r10 != 0) goto L13;
        int r1 = r14 & 31;
        int r16 = ((r15.size() + r14) - 1) & 31;
        Object[] r2 = this.t;
        Object[] r3 = l(r2);
        ti.Z(r16 + 1, r1, F(), r2, r3);
        e(r3, r1, r15.iterator());
        this.t = r3;
        this.u = r15.size() + this.u;
        return true;
    L13:
        Object[][] r7 = new Object[r10][];
        int r9 = F();
        int r5 = r15.size() + this.u;
        if (r5 <= 32) goto L18;
        r5 = r5 - ((r5 - 1) & (-32));
    L18:
        if (r14 < C()) goto L20;
        Object[] r12 = n();
        Collection r6 = r15;
        E(r6, r14, this.t, r9, r7, r10, r12);
        r7 = r7;
    L24:
        this.s = t(this.s, r0, r7);
        this.t = r12;
        this.u = r6.size() + this.u;
        return true;
    L20:
        r6 = r15;
        Object[] r17 = this.t;
        if (r5 <= r9) goto L23;
        int r8 = r5 - r9;
        Object[] r11 = m(r8, r17);
        g(r6, r14, r8, r7, r10, r11);
        r7 = r7;
        r12 = r11;
        goto L24
    L23:
        r12 = n();
        int r4 = r9 - r5;
        ti.Z(0, r4, r9, r17, r12);
        int r13 = 32 - r4;
        Object[] r18 = m(r13, this.t);
        int r19 = r10 - 1;
        r7[r19] = r18;
        g(r6, r14, r13, r7, r19, r18);
        r6 = r6;
        goto L24
    }

    @Override // defpackage.v1
    public final Object b(int r6) {
        uo.e(r6, a());
        ((AbstractList) this).modCount++;
        int r0 = C();
        if (r6 >= r0) goto L5;
        t3 r1 = new t3(this.t[0]);
        Object[] r2 = this.s;
        r2.getClass();
        B(A(r2, this.q, r6, r1), r0, this.q, 0);
        return r1.a;
    L5:
        return B(this.s, r0, this.q, r6 - r0);
    }

    public final y1 d() {
        Object[] r0 = this.s;
        if (r0 == this.o) goto L5;
    L7:
        this.r = new tv1();
        this.o = r0;
        Object[] r1 = this.t;
        this.p = r1;
        if (r0 == null) goto L10;
        y1 r2 = new wf3(r0, r1, this.u, this.q);
    L14:
        this.n = r2;
        return r2;
    L10:
        if (r1.length != 0) goto L12;
        r2 = og4.o;
        goto L14
    L12:
        r2 = new og4(Arrays.copyOf(r1, this.u));
        goto L14
    L5:
        if (this.t != this.p) goto L7;
        r2 = this.n;
        goto L14
    }

    public final int f() {
        return ((AbstractList) this).modCount;
    }

    public final void g(Collection r10, int r11, int r12, Object[][] r13, int r14, Object[] r15) {
        if (this.s == null) goto L13;
        int r0 = r11 >> 5;
        b1 r1 = k(C() >> 5);
        int r3 = r14;
        Object[] r2 = r15;
    L6:
        if ((r1.n - 1) == r0) goto L8;
        Object[] r4 = (Object[]) r1.previous();
        ti.Z(0, 32 - r12, 32, r4, r2);
        r2 = m(r12, r4);
        r3 = r3 - 1;
        r13[r3] = r2;
        goto L6
    L8:
        Object[] r5 = (Object[]) r1.previous();
        int r7 = r14 - (((C() >> 5) - 1) - r0);
        if (r7 >= r14) goto L11;
        r15 = r13[r7];
        r15.getClass();
    L11:
        E(r10, r11, r5, 32, r13, r7, r15);
        return;
    L13:
        kf2.o("root is null");
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int r3) {
        uo.e(r3, a());
        if (C() > r3) goto L5;
        Object[] r2 = this.t;
    L10:
        return r2[r3 & 31];
    L5:
        Object[] r0 = this.s;
        r0.getClass();
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

    public final Object[] h(Object[] r8, int r9, int r10, Object r11, t3 r12) {
        int r0 = uc5.t(r10, r9);
        if (r9 != 0) goto L6;
        r12.a = r8[31];
        Object[] r7 = l(r8);
        ti.Z(r0 + 1, r0, 31, r8, r7);
        r7[r0] = r11;
        return r7;
    L6:
        Object[] r13 = l(r8);
        int r3 = r9 - 5;
        Object r14 = r13[r0];
        r14.getClass();
        r13[r0] = h((Object[]) r14, r3, r10, r11, r12);
    L7:
        r0 = r0 + 1;
        if (r0 >= 32) goto L12;
        Object r15 = r13[r0];
        if (r15 == null) goto L12;
        r13[r0] = h((Object[]) r15, r3, 0, r12.a, r12);
    L12:
        return r13;
    }

    public final void i(int r6, Object r7, Object[] r8) {
        int r0 = F();
        Object[] r1 = l(this.t);
        Object[] r2 = this.t;
        if (r0 >= 32) goto L6;
        ti.Z(r6 + 1, r6, r0, r2, r1);
        r1[r6] = r7;
        this.s = r8;
        this.t = r1;
        this.u++;
        return;
    L6:
        Object r3 = r2[31];
        ti.Z(r6 + 1, r6, 31, r2, r1);
        r1[r6] = r7;
        u(r8, r1, o(r3));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final boolean j(Object[] r3) {
        if (r3.length == 33) goto L5;
        return false;
    L5:
        if (r3[32] != this.r) goto L10;
        return true;
    L10:
        return false;
    }

    public final b1 k(int r4) {
        Object[] r0 = this.s;
        if (r0 == null) goto L10;
        int r1 = C() >> 5;
        uo.i(r4, r1);
        int r3 = this.q;
        if (r3 != 0) goto L9;
        return new vv(r4, r0);
    L9:
        return new wx4(r0, r4, r1, r3 / 5);
    L10:
        kf2.o("Invalid root");
        return null;
    }

    public final Object[] l(Object[] r4) {
        if (r4 != null) goto L6;
        return n();
    L6:
        if (j(r4) == false) goto L8;
        return r4;
    L8:
        Object[] r3 = n();
        int r0 = r4.length;
        if (r0 <= 32) goto L11;
        r0 = 32;
    L11:
        ti.c0(0, r0, 6, r4, r3);
        return r3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int r2) {
        uo.i(r2, this.u);
        return new zf3(this, r2);
    }

    public final Object[] m(int r3, Object[] r4) {
        if (j(r4) == false) goto L6;
        ti.Z(r3, 0, 32 - r3, r4, r4);
        return r4;
    L6:
        Object[] r2 = n();
        ti.Z(r3, 0, 32 - r3, r4, r2);
        return r2;
    }

    public final Object[] n() {
        Object[] r0 = new Object[33];
        r0[32] = this.r;
        return r0;
    }

    public final Object[] o(Object r3) {
        Object[] r0 = new Object[33];
        r0[0] = r3;
        r0[32] = this.r;
        return r0;
    }

    public final Object[] p(Object[] r4, int r5, int r6) {
        if (r6 >= 0) goto L5;
        oo3.a("shift should be positive");
    L5:
        if (r6 != 0) goto L7;
        return r4;
    L7:
        int r0 = uc5.t(r5, r6);
        Object r1 = r4[r0];
        r1.getClass();
        Object r7 = p((Object[]) r1, r5, r6 - 5);
        if (r0 >= 31) goto L16;
        int r8 = r0 + 1;
        if (r4[r8] == null) goto L16;
        if (j(r4) == false) goto L14;
        Arrays.fill(r4, r8, 32, null);
    L14:
        Object[] r2 = n();
        ti.Z(0, 0, r8, r4, r2);
        r4 = r2;
    L16:
        if (r7 == r4[r0]) goto L19;
        Object[] r3 = l(r4);
        r3[r0] = r7;
        return r3;
    L19:
        return r4;
    }

    public final Object[] q(Object[] r5, int r6, int r7, t3 r8) {
        int r0 = uc5.t(r7 - 1, r6);
        if (r6 != 5) goto L5;
        r8.a = r5[r0];
        Object[] r9 = null;
    L6:
        if (r9 != null) goto L9;
        if (r0 != 0) goto L9;
        return null;
    L9:
        Object[] r4 = l(r5);
        r4[r0] = r9;
        return r4;
    L5:
        Object r3 = r5[r0];
        r3.getClass();
        r9 = q((Object[]) r3, r6 - 5, r7, r8);
        goto L6
    }

    public final void r(Object[] r4, int r5, int r6) {
        if (r6 != 0) goto L9;
        this.s = null;
        if (r4 != null) goto L7;
        r4 = new Object[0];
    L7:
        this.t = r4;
        this.u = r5;
        this.q = r6;
        return;
    L9:
        t3 r2 = new t3(null);
        r4.getClass();
        Object[] r7 = q(r4, r6, r5, r2);
        r7.getClass();
        Object r1 = r2.a;
        r1.getClass();
        this.t = (Object[]) r1;
        this.u = r5;
        if (r7[1] != null) goto L13;
        this.s = (Object[]) r7[0];
        this.q = r6 - 5;
        return;
    L13:
        this.s = r7;
        this.q = r6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection r3) {
        return z(new x1(1, r3));
    }

    public final Object[] s(Object[] r5, int r6, int r7, Iterator r8) {
        if (r8.hasNext() == true) goto L6;
        oo3.a("invalid buffersIterator");
    L6:
        if (r7 < 0) goto L8;
        boolean r2 = true;
    L9:
        if (r2 == true) goto L11;
        oo3.a("negative shift");
    L11:
        if (r7 == 0) goto L13;
        Object[] r9 = l(r5);
        int r3 = uc5.t(r6, r7);
        int r10 = r7 - 5;
        r9[r3] = s((Object[]) r9[r3], r6, r10, r8);
    L15:
        r3 = r3 + 1;
        if (r3 >= 32) goto L20;
        if (r8.hasNext() == false) goto L20;
        r9[r3] = s((Object[]) r9[r3], 0, r10, r8);
    L20:
        return r9;
    L13:
        return (Object[]) r8.next();
    L8:
        r2 = false;
        goto L9
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int r9, Object r10) {
        uo.e(r9, a());
        if (C() > r9) goto L9;
        Object[] r0 = l(this.t);
        if (r0 == this.t) goto L7;
        ((AbstractList) this).modCount++;
    L7:
        int r11 = r9 & 31;
        Object r1 = r0[r11];
        r0[r11] = r10;
        this.t = r0;
        return r1;
    L9:
        t3 r7 = new t3(null);
        Object[] r3 = this.s;
        r3.getClass();
        this.s = D(r3, this.q, r9, r10, r7);
        return r7.a;
    }

    public final Object[] t(Object[] r5, int r6, Object[][] r7) {
        x0 r0 = new x0(r7);
        int r8 = r6 >> 5;
        int r1 = this.q;
        if (r8 >= (1 << r1)) goto L5;
        Object[] r9 = s(r5, r6, r1, r0);
    L7:
        if (r0.hasNext() == false) goto L9;
        this.q += 5;
        r9 = o(r9);
        int r10 = this.q;
        s(r9, 1 << r10, r10, r0);
        goto L7
    L9:
        return r9;
    L5:
        r9 = l(r5);
        goto L7
    }

    public final void u(Object[] r6, Object[] r7, Object[] r8) {
        int r0 = this.u;
        int r1 = r0 >> 5;
        int r2 = this.q;
        if (r1 <= (1 << r2)) goto L6;
        this.s = v(this.q + 5, o(r6), r7);
        this.t = r8;
        this.q += 5;
        this.u++;
        return;
    L6:
        if (r6 != null) goto L9;
        this.s = r7;
        this.t = r8;
        this.u = r0 + 1;
        return;
    L9:
        this.s = v(r2, r6, r7);
        this.t = r8;
        this.u++;
    }

    public final Object[] v(int r4, Object[] r5, Object[] r6) {
        int r0 = uc5.t(a() - 1, r4);
        Object[] r7 = l(r5);
        if (r4 != 5) goto L6;
        r7[r0] = r6;
        return r7;
    L6:
        r7[r0] = v(r4 - 5, (Object[]) r7[r0], r6);
        return r7;
    }

    public final int w(if1 r7, Object[] r8, int r9, int r10, t3 r11, ArrayList r12, ArrayList r13) {
        if (j(r8) == false) goto L5;
        r12.add(r8);
    L5:
        Object r0 = r11.a;
        r0.getClass();
        Object[] r1 = (Object[]) r0;
        Object[] r3 = r1;
        int r2 = 0;
    L6:
        if (r2 >= r9) goto L19;
        Object r4 = r8[r2];
        if (((Boolean) r7.invoke(r4)).booleanValue() == true) goto L18;
        if (r10 == 32) goto L12;
    L17:
        r3[r10] = r4;
        r10 = r10 + 1;
        goto L18
    L12:
        if (r12.isEmpty() == true) goto L15;
        Object[] r14 = (Object[]) r12.remove(r12.size() - 1);
    L14:
        r3 = r14;
        r10 = 0;
        goto L17
    L15:
        r14 = n();
    L18:
        r2 = r2 + 1;
        goto L6
    L19:
        r11.a = r3;
        if (r1 == r3) goto L22;
        r13.add(r1);
    L22:
        return r10;
    }

    public final int x(if1 r7, Object[] r8, int r9, t3 r10) {
        int r0 = 0;
        Object[] r2 = r8;
        int r3 = r9;
        boolean r1 = false;
    L3:
        if (r0 >= r9) goto L11;
        Object r4 = r8[r0];
        if (((Boolean) r7.invoke(r4)).booleanValue() == false) goto L8;
        if (r1 == true) goto L10;
        r2 = l(r8);
        r1 = true;
        r3 = r0;
    L10:
        r0 = r0 + 1;
        goto L3
    L8:
        if (r1 == false) goto L10;
        r2[r3] = r4;
        r3 = r3 + 1;
        goto L10
    L11:
        r10.a = r2;
        return r3;
    }

    public final int y(if1 r2, int r3, t3 r4) {
        int r5 = x(r2, this.t, r3, r4);
        Object r6 = r4.a;
        if (r5 != r3) goto L5;
        return r3;
    L5:
        r6.getClass();
        Object[] r7 = (Object[]) r6;
        Arrays.fill(r7, r5, r3, null);
        this.t = r7;
        this.u -= r3 - r5;
        return r5;
    }

    public final boolean z(if1 r16) {
        if1 r1 = r16;
        int r8 = F();
        Object[] r9 = null;
        t3 r5 = new t3(null);
        boolean r10 = false;
        if (this.s == null) goto L5;
        b1 r12 = k(0);
        int r0 = 32;
    L8:
        if (r0 != 32) goto L12;
        if (r12.hasNext() == false) goto L12;
        r0 = x(r1, (Object[]) r12.next(), 32, r5);
    L12:
        if (r0 != 32) goto L18;
        int r2 = y(r1, r8, r5);
        if (r2 != 0) goto L16;
        r(this.s, this.u, this.q);
    L16:
        if (r2 != r8) goto L6;
    L38:
        if (r10 == false) goto L40;
        ((AbstractList) this).modCount++;
    L40:
        return r10;
    L6:
        r10 = true;
        goto L38
    L18:
        int r14 = (r12.n - 1) << 5;
        ArrayList r7 = new ArrayList();
        ArrayList r6 = new ArrayList();
        int r4 = r0;
    L20:
        if (r12.hasNext() == false) goto L22;
        r4 = w(r1, (Object[]) r12.next(), 32, r4, r5, r6, r7);
        r1 = r16;
        goto L20
    L22:
        int r3 = w(r16, this.t, r8, r4, r5, r6, r7);
        Object r11 = r5.a;
        r11.getClass();
        Object[] r13 = (Object[]) r11;
        Arrays.fill(r13, r3, 32, null);
        boolean r15 = r7.isEmpty();
        Object[] r17 = this.s;
        if (r15 == false) goto L25;
        r17.getClass();
    L26:
        int r18 = r14 + (r7.size() << 5);
        if ((r18 & 31) == 0) goto L30;
        oo3.a("invalid size");
    L30:
        if (r18 != 0) goto L32;
        this.q = 0;
    L37:
        this.s = r9;
        this.t = r13;
        this.u = r18 + r3;
        goto L6
    L32:
        int r19 = r18 - 1;
    L33:
        int r20 = this.q;
        if ((r19 >> r20) != 0) goto L36;
        this.q = r20 - 5;
        Object[] r21 = r17[0];
        r21.getClass();
        r17 = r21;
        goto L33
    L36:
        r9 = p(r17, r19, r20);
        goto L37
    L25:
        r17 = s(r17, r14, this.q, r7.iterator());
        goto L26
    L5:
        if (y(r1, r8, r5) == r8) goto L38;
        goto L6
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object r4) {
        ((AbstractList) this).modCount++;
        int r0 = F();
        if (r0 >= 32) goto L5;
        Object[] r2 = l(this.t);
        r2[r0] = r4;
        this.t = r2;
        this.u = a() + 1;
    L6:
        return true;
    L5:
        u(this.s, this.t, o(r4));
        goto L6
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection r8) {
        if (r8.isEmpty() == false) goto L5;
        return false;
    L5:
        ((AbstractList) this).modCount++;
        int r0 = F();
        Iterator r3 = r8.iterator();
        if ((32 - r0) < r8.size()) goto L9;
        Object[] r1 = l(this.t);
        e(r1, r0, r3);
        this.t = r1;
        this.u = r8.size() + this.u;
        return true;
    L9:
        int r4 = ((r8.size() + r0) - 1) / 32;
        Object[][] r5 = new Object[r4][];
        Object[] r6 = l(this.t);
        e(r6, r0, r3);
        r5[0] = r6;
        int r2 = 1;
    L10:
        if (r2 >= r4) goto L12;
        Object[] r7 = n();
        e(r7, 0, r3);
        r5[r2] = r7;
        r2 = r2 + 1;
        goto L10
    L12:
        this.s = t(this.s, C(), r5);
        Object[] r9 = n();
        e(r9, 0, r3);
        this.t = r9;
        this.u = r8.size() + this.u;
        return true;
    }
}
