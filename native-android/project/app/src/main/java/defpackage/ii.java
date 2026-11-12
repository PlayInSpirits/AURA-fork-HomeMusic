package defpackage;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ii extends v1 {
    public static final Object[] q = null;
    public int n;
    public Object[] o;
    public int p;

    static {
        q = new Object[0];
    }

    public ii(int r1) {
        if (r1 != 0) goto L5;
        Object[] r2 = q;
    L7:
        this.o = r2;
        return;
    L5:
        if (r1 <= 0) goto L9;
        r2 = new Object[r1];
        goto L7
    L9:
        kf2.n(f34.f(r1, "Illegal Capacity: "));
        throw null;
    }

    @Override // defpackage.v1
    public final int a() {
        return this.p;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int r8, Object r9) {
        int r0 = this.p;
        if (r8 < 0) goto L31;
        if (r8 > r0) goto L31;
        if (r8 != r0) goto L8;
        addLast(r9);
        return;
    L8:
        if (r8 != 0) goto L11;
        addFirst(r9);
        return;
    L11:
        k();
        e(this.p + 1);
        int r1 = j(this.n + r8);
        int r2 = this.p;
        if (r8 >= ((r2 + 1) >> 1)) goto L24;
        if (r1 != 0) goto L15;
        Object[] r10 = this.o;
        r10.getClass();
        int r11 = r10.length - 1;
    L16:
        int r3 = this.n;
        if (r3 != 0) goto L19;
        Object[] r4 = this.o;
        r4.getClass();
        r3 = r4.length;
    L19:
        int r5 = r3 - 1;
        int r6 = this.n;
        Object[] r7 = this.o;
        if (r11 < r6) goto L22;
        r7[r5] = r7[r6];
        ti.Z(r6, r6 + 1, r11 + 1, r7, r7);
    L23:
        this.o[r11] = r9;
        this.n = r5;
    L29:
        this.p++;
        return;
    L22:
        ti.Z(r6 - 1, r6, r7.length, r7, r7);
        Object[] r12 = this.o;
        r12[r12.length - 1] = r12[0];
        ti.Z(0, 1, r11 + 1, r12, r12);
        goto L23
    L15:
        r11 = r1 - 1;
        goto L16
    L24:
        int r13 = j(r2 + this.n);
        Object[] r14 = this.o;
        if (r1 >= r13) goto L27;
        ti.Z(r1 + 1, r1, r13, r14, r14);
    L28:
        this.o[r1] = r9;
        goto L29
    L27:
        ti.Z(1, 0, r13, r14, r14);
        Object[] r15 = this.o;
        r15[0] = r15[r15.length - 1];
        ti.Z(r1 + 1, r1, r15.length - 1, r15, r15);
    L31:
        kf2.h(xa3.e(r8, r0, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int r9, Collection r10) {
        r10.getClass();
        int r0 = this.p;
        if (r9 < 0) goto L43;
        if (r9 > r0) goto L43;
        if (r10.isEmpty() == false) goto L9;
        return false;
    L9:
        if (r9 == this.p) goto L11;
        k();
        int r1 = this.p;
        e(r10.size() + r1);
        int r2 = this.n;
        int r3 = j(this.p + r2);
        int r4 = j(this.n + r9);
        int r5 = r10.size();
        if (r9 >= ((this.p + 1) >> 1)) goto L28;
        int r11 = this.n;
        int r6 = r11 - r5;
        Object[] r7 = this.o;
        if (r4 < r11) goto L22;
        if (r6 < 0) goto L18;
        ti.Z(r6, r11, r4, r7, r7);
    L26:
        this.n = r6;
        d(h(r4 - r5), r10);
        return true;
    L18:
        r6 = r6 + r7.length;
        int r8 = r4 - r11;
        int r12 = r7.length - r6;
        if (r12 < r8) goto L21;
        ti.Z(r6, r11, r4, r7, r7);
        goto L26
    L21:
        ti.Z(r6, r11, r11 + r12, r7, r7);
        Object[] r13 = this.o;
        ti.Z(0, this.n + r12, r4, r13, r13);
        goto L26
    L22:
        ti.Z(r6, r11, r7.length, r7, r7);
        Object[] r14 = this.o;
        if (r5 < r4) goto L25;
        ti.Z(r14.length - r5, 0, r4, r14, r14);
        goto L26
    L25:
        ti.Z(r14.length - r5, 0, r5, r14, r14);
        Object[] r15 = this.o;
        ti.Z(0, r5, r4, r15, r15);
        goto L26
    L28:
        int r16 = r4 + r5;
        Object[] r17 = this.o;
        if (r4 >= r3) goto L37;
        int r18 = r5 + r3;
        if (r18 > r17.length) goto L34;
        ti.Z(r16, r4, r3, r17, r17);
    L41:
        d(r4, r10);
        return true;
    L34:
        if (r16 < r17.length) goto L36;
        ti.Z(r16 - r17.length, r4, r3, r17, r17);
        goto L41
    L36:
        int r19 = r3 - (r18 - r17.length);
        ti.Z(0, r19, r3, r17, r17);
        Object[] r20 = this.o;
        ti.Z(r16, r4, r19, r20, r20);
        goto L41
    L37:
        ti.Z(r5, 0, r3, r17, r17);
        Object[] r21 = this.o;
        if (r16 < r21.length) goto L40;
        ti.Z(r16 - r21.length, r4, r21.length, r21, r21);
        goto L41
    L40:
        ti.Z(0, r21.length - r5, r21.length, r21, r21);
        Object[] r22 = this.o;
        ti.Z(r16, r4, r22.length - r5, r22, r22);
        goto L41
    L11:
        return addAll(r10);
    L43:
        kf2.h(xa3.e(r9, r0, "index: ", ", size: "));
        return false;
    }

    public final void addFirst(Object r3) {
        k();
        e(this.p + 1);
        int r0 = this.n;
        if (r0 != 0) goto L5;
        Object[] r1 = this.o;
        r1.getClass();
        r0 = r1.length;
    L5:
        int r2 = r0 - 1;
        this.n = r2;
        this.o[r2] = r3;
        this.p++;
    }

    public final void addLast(Object r4) {
        k();
        e(a() + 1);
        Object[] r0 = this.o;
        int r1 = this.n;
        r0[j(a() + r1)] = r4;
        this.p = a() + 1;
    }

    @Override // defpackage.v1
    public final Object b(int r9) {
        int r0 = this.p;
        if (r9 < 0) goto L25;
        if (r9 >= r0) goto L25;
        if (r9 == (a() - 1)) goto L8;
        if (r9 == 0) goto L11;
        k();
        int r1 = j(this.n + r9);
        Object[] r3 = this.o;
        Object r4 = r3[r1];
        int r5 = this.p >> 1;
        int r6 = this.n;
        if (r9 >= r5) goto L18;
        if (r1 < r6) goto L16;
        ti.Z(r6 + 1, r6, r1, r3, r3);
    L17:
        Object[] r10 = this.o;
        int r2 = this.n;
        r10[r2] = null;
        this.n = f(r2);
    L23:
        this.p--;
        return r4;
    L16:
        ti.Z(1, 0, r1, r3, r3);
        Object[] r11 = this.o;
        r11[0] = r11[r11.length - 1];
        int r7 = this.n;
        ti.Z(r7 + 1, r7, r11.length - 1, r11, r11);
        goto L17
    L18:
        int r12 = j((a() - 1) + r6);
        Object[] r8 = this.o;
        if (r1 > r12) goto L21;
        ti.Z(r1, r1 + 1, r12 + 1, r8, r8);
    L22:
        this.o[r12] = null;
        goto L23
    L21:
        ti.Z(r1, r1 + 1, r8.length, r8, r8);
        Object[] r13 = this.o;
        r13[r13.length - 1] = r13[0];
        ti.Z(0, 1, r12 + 1, r13, r13);
        goto L22
    L11:
        return removeFirst();
    L8:
        return removeLast();
    L25:
        kf2.h(xa3.e(r9, r0, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (isEmpty() == true) goto L5;
        k();
        int r0 = this.n;
        int r1 = j(a() + r0);
        i(this.n, r1);
    L5:
        this.n = 0;
        this.p = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object r1) {
        if (indexOf(r1) == (-1)) goto L6;
        return true;
    L6:
        return false;
    }

    public final void d(int r5, Collection r6) {
        Iterator r0 = r6.iterator();
        int r1 = this.o.length;
    L3:
        if (r5 >= r1) goto L7;
        if (r0.hasNext() == false) goto L7;
        this.o[r5] = r0.next();
        r5 = r5 + 1;
    L7:
        int r7 = this.n;
        int r2 = 0;
    L8:
        if (r2 >= r7) goto L12;
        if (r0.hasNext() == false) goto L12;
        this.o[r2] = r0.next();
        r2 = r2 + 1;
    L12:
        int r8 = this.p;
        this.p = r6.size() + r8;
    }

    public final void e(int r5) {
        if (r5 < 0) goto L23;
        Object[] r0 = this.o;
        if (r5 > r0.length) goto L7;
        return;
    L7:
        if (r0 == q) goto L9;
        int r1 = r0.length;
        int r2 = r1 + (r1 >> 1);
        if ((r2 - r5) >= 0) goto L17;
        r2 = r5;
    L17:
        if ((r2 - 2147483639) <= 0) goto L21;
        if (r5 <= 2147483639) goto L20;
        r2 = Integer.MAX_VALUE;
        goto L21
    L20:
        r2 = 2147483639;
    L21:
        Object[] r6 = new Object[r2];
        ti.Z(0, this.n, r0.length, r0, r6);
        Object[] r3 = this.o;
        int r4 = r3.length;
        int r7 = this.n;
        ti.Z(r4 - r7, 0, r7, r3, r6);
        this.n = 0;
        this.o = r6;
        return;
    L9:
        if (r5 >= 10) goto L11;
        r5 = 10;
    L11:
        this.o = new Object[r5];
        return;
    L23:
        kf2.o("Deque is too big.");
    }

    public final int f(int r1) {
        Object[] r0 = this.o;
        r0.getClass();
        if (r1 != (r0.length - 1)) goto L7;
        return 0;
    L7:
        return r1 + 1;
    }

    public final Object first() {
        if (isEmpty() == false) goto L5;
        kf2.m("ArrayDeque is empty.");
        return null;
    L5:
        return this.o[this.n];
    }

    public final Object g() {
        if (isEmpty() == false) goto L7;
        return null;
    L7:
        return this.o[j((size() - 1) + this.n)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int r3) {
        int r0 = a();
        if (r3 < 0) goto L7;
        if (r3 >= r0) goto L7;
        return this.o[j(this.n + r3)];
    L7:
        kf2.h(xa3.e(r3, r0, "index: ", ", size: "));
        return null;
    }

    public final int h(int r1) {
        if (r1 < 0) goto L4;
        return r1;
    L4:
        return r1 + this.o.length;
    }

    public final void i(int r4, int r5) {
        Object[] r0 = this.o;
        if (r4 >= r5) goto L6;
        ti.f0(r4, r5, null, r0);
        return;
    L6:
        ti.f0(r4, r0.length, null, r0);
        ti.f0(0, r5, null, this.o);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object r5) {
        int r0 = this.n;
        int r1 = j(a() + r0);
        int r2 = this.n;
        if (r2 >= r1) goto L12;
    L4:
        if (r2 >= r1) goto L36;
        if (h12.c(r5, this.o[r2]) == true) goto L7;
        r2 = r2 + 1;
        goto L4
    L7:
        int r4 = this.n;
    L9:
        return r2 - r4;
    L36:
        return -1;
    L12:
        if (isEmpty() == true) goto L27;
        r2 = this.n;
        if (r2 < r1) goto L35;
        int r3 = this.o.length;
    L16:
        if (r2 >= r3) goto L21;
        if (h12.c(r5, this.o[r2]) == true) goto L19;
        r2 = r2 + 1;
        goto L16
    L19:
        r4 = this.n;
        goto L9
    L21:
        int r6 = 0;
    L22:
        if (r6 >= r1) goto L37;
        if (h12.c(r5, this.o[r6]) == true) goto L25;
        r6 = r6 + 1;
        goto L22
    L25:
        r2 = r6 + this.o.length;
        r4 = this.n;
        goto L9
    L37:
        return -1;
    L35:
        return -1;
    L27:
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        if (a() != 0) goto L6;
        return true;
    L6:
        return false;
    }

    public final int j(int r2) {
        Object[] r1 = this.o;
        if (r2 >= r1.length) goto L5;
        return r2;
    L5:
        return r2 - r1.length;
    }

    public final void k() {
        ((AbstractList) this).modCount++;
    }

    public final Object last() {
        if (isEmpty() == false) goto L5;
        kf2.m("ArrayDeque is empty.");
        return null;
    L5:
        return this.o[j((size() - 1) + this.n)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object r5) {
        int r0 = j(this.p + this.n);
        int r1 = this.n;
        if (r1 >= r0) goto L14;
        int r2 = r0 - 1;
        if (r1 <= r2) goto L7;
    L31:
        return -1;
    L7:
        if (h12.c(r5, this.o[r2]) == true) goto L8;
        if (r2 == r1) goto L31;
        r2 = r2 - 1;
        goto L7
    L8:
        int r4 = this.n;
    L10:
        return r2 - r4;
    L14:
        if (isEmpty() == true) goto L31;
        if (this.n < r0) goto L31;
    L18:
        r0 = r0 - 1;
        Object[] r3 = this.o;
        if ((-1) >= r0) goto L24;
        if (h12.c(r5, r3[r0]) == false) goto L18;
        r2 = r0 + this.o.length;
        r4 = this.n;
        goto L10
    L24:
        r3.getClass();
        r2 = r3.length - 1;
        int r6 = this.n;
        if (r6 > r2) goto L31;
    L27:
        if (h12.c(r5, this.o[r2]) == true) goto L28;
        if (r2 == r6) goto L31;
        r2 = r2 - 1;
        goto L27
    L28:
        r4 = this.n;
        goto L10
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object r2) {
        int r3 = indexOf(r2);
        if (r3 != (-1)) goto L6;
        return false;
    L6:
        b(r3);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection r12) {
        r12.getClass();
        boolean r1 = false;
        r1 = false;
        int r2 = 0;
        r1 = false;
        if (isEmpty() == false) goto L5;
    L35:
        return r1;
    L5:
        if (this.o.length == 0) goto L35;
        int r0 = j(a() + this.n);
        int r3 = this.n;
        if (r3 >= r0) goto L18;
        int r5 = r3;
    L10:
        Object[] r6 = this.o;
        if (r3 >= r0) goto L17;
        Object r7 = r6[r3];
        if (r12.contains(r7) == true) goto L15;
        this.o[r5] = r7;
        r5 = r5 + 1;
    L16:
        r3 = r3 + 1;
        goto L10
    L15:
        r1 = true;
        goto L16
    L17:
        ti.f0(r5, r0, null, r6);
    L33:
        if (r1 == false) goto L35;
        k();
        this.p = h(r5 - this.n);
        goto L35
    L18:
        int r8 = this.o.length;
        boolean r9 = false;
        int r10 = r3;
    L19:
        if (r3 >= r8) goto L25;
        Object[] r11 = this.o;
        Object r13 = r11[r3];
        r11[r3] = null;
        if (r12.contains(r13) == true) goto L23;
        this.o[r10] = r13;
        r10 = r10 + 1;
    L24:
        r3 = r3 + 1;
        goto L19
    L23:
        r9 = true;
        goto L24
    L25:
        r5 = j(r10);
    L26:
        if (r2 >= r0) goto L32;
        Object[] r4 = this.o;
        Object r14 = r4[r2];
        r4[r2] = null;
        if (r12.contains(r14) == true) goto L30;
        this.o[r5] = r14;
        r5 = f(r5);
    L31:
        r2 = r2 + 1;
        goto L26
    L30:
        r9 = true;
        goto L31
    L32:
        r1 = r9;
        goto L33
    }

    public final Object removeFirst() {
        if (isEmpty() == true) goto L6;
        k();
        Object[] r0 = this.o;
        int r1 = this.n;
        Object r2 = r0[r1];
        r0[r1] = null;
        this.n = f(r1);
        this.p = a() - 1;
        return r2;
    L6:
        kf2.m("ArrayDeque is empty.");
        return null;
    }

    public final Object removeLast() {
        if (isEmpty() == true) goto L6;
        k();
        int r0 = j((size() - 1) + this.n);
        Object[] r1 = this.o;
        Object r2 = r1[r0];
        r1[r0] = null;
        this.p = a() - 1;
        return r2;
    L6:
        kf2.m("ArrayDeque is empty.");
        return null;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int r8, int r9) {
        h12.g(r8, r9, this.p);
        int r0 = r9 - r8;
        if (r0 != 0) goto L6;
        return;
    L6:
        if (r0 != this.p) goto L10;
        clear();
        return;
    L10:
        if (r0 != 1) goto L13;
        b(r8);
        return;
    L13:
        k();
        int r2 = this.p - r9;
        int r3 = this.n;
        if (r8 >= r2) goto L19;
        int r4 = j((r8 - 1) + r3);
        int r10 = j(this.n + (r9 - 1));
    L16:
        if (r8 <= 0) goto L18;
        int r1 = r4 + 1;
        int r5 = Math.min(r8, Math.min(r1, r10 + 1));
        Object[] r6 = this.o;
        int r11 = r10 - r5;
        int r7 = r4 - r5;
        ti.Z(r11 + 1, r7 + 1, r1, r6, r6);
        r4 = h(r7);
        r10 = h(r11);
        r8 = r8 - r5;
        goto L16
    L18:
        int r12 = j(this.n + r0);
        i(this.n, r12);
        this.n = r12;
    L24:
        this.p -= r0;
        return;
    L19:
        int r13 = j(r3 + r9);
        int r14 = j(this.n + r8);
        int r15 = this.p;
    L20:
        r15 = r15 - r9;
        if (r15 <= 0) goto L23;
        Object[] r16 = this.o;
        r9 = Math.min(r15, Math.min(r16.length - r13, r16.length - r14));
        Object[] r17 = this.o;
        int r18 = r13 + r9;
        ti.Z(r14, r13, r18, r17, r17);
        r13 = j(r18);
        r14 = j(r14 + r9);
        goto L20
    L23:
        int r19 = j(this.p + this.n);
        i(h(r19 - r0), r19);
        goto L24
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection r12) {
        r12.getClass();
        boolean r1 = false;
        r1 = false;
        int r2 = 0;
        r1 = false;
        if (isEmpty() == false) goto L5;
    L35:
        return r1;
    L5:
        if (this.o.length == 0) goto L35;
        int r0 = j(a() + this.n);
        int r3 = this.n;
        if (r3 >= r0) goto L18;
        int r5 = r3;
    L10:
        Object[] r6 = this.o;
        if (r3 >= r0) goto L17;
        Object r7 = r6[r3];
        if (r12.contains(r7) == false) goto L15;
        this.o[r5] = r7;
        r5 = r5 + 1;
    L16:
        r3 = r3 + 1;
        goto L10
    L15:
        r1 = true;
        goto L16
    L17:
        ti.f0(r5, r0, null, r6);
    L33:
        if (r1 == false) goto L35;
        k();
        this.p = h(r5 - this.n);
        goto L35
    L18:
        int r8 = this.o.length;
        boolean r9 = false;
        int r10 = r3;
    L19:
        if (r3 >= r8) goto L25;
        Object[] r11 = this.o;
        Object r13 = r11[r3];
        r11[r3] = null;
        if (r12.contains(r13) == false) goto L23;
        this.o[r10] = r13;
        r10 = r10 + 1;
    L24:
        r3 = r3 + 1;
        goto L19
    L23:
        r9 = true;
        goto L24
    L25:
        r5 = j(r10);
    L26:
        if (r2 >= r0) goto L32;
        Object[] r4 = this.o;
        Object r14 = r4[r2];
        r4[r2] = null;
        if (r12.contains(r14) == false) goto L30;
        this.o[r5] = r14;
        r5 = f(r5);
    L31:
        r2 = r2 + 1;
        goto L26
    L30:
        r9 = true;
        goto L31
    L32:
        r1 = r9;
        goto L33
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int r2, Object r3) {
        int r0 = a();
        if (r2 < 0) goto L7;
        if (r2 >= r0) goto L7;
        int r4 = j(this.n + r2);
        Object[] r1 = this.o;
        Object r5 = r1[r4];
        r1[r4] = r3;
        return r5;
    L7:
        kf2.h(xa3.e(r2, r0, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] r6) {
        r6.getClass();
        int r0 = r6.length;
        int r1 = this.p;
        if (r0 >= r1) goto L6;
        Object r7 = Array.newInstance(r6.getClass().getComponentType(), r1);
        r7.getClass();
        r6 = (Object[]) r7;
    L6:
        int r2 = this.n;
        int r3 = j(this.p + r2);
        int r4 = this.n;
        if (r4 >= r3) goto L10;
        ti.c0(r4, r3, 2, this.o, r6);
    L12:
        int r5 = this.p;
        if (r5 >= r6.length) goto L15;
        r6[r5] = null;
    L15:
        return r6;
    L10:
        if (isEmpty() == true) goto L12;
        Object[] r8 = this.o;
        ti.Z(0, this.n, r8.length, r8, r6);
        Object[] r9 = this.o;
        ti.Z(r9.length - this.n, 0, r3, r9, r6);
        goto L12
    }

    public ii() {
        this.o = q;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[a()]);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object r1) {
        addLast(r1);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection r3) {
        r3.getClass();
        if (r3.isEmpty() == false) goto L6;
        return false;
    L6:
        k();
        int r0 = a();
        e(r3.size() + r0);
        int r1 = this.n;
        d(j(a() + r1), r3);
        return true;
    }
}
