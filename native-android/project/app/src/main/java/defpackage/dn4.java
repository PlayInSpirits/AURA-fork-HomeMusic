package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dn4 implements List, y32 {
    public final rh4 n;
    public final int o;
    public int p;
    public int q;

    public dn4(rh4 r1, int r2, int r3) {
        this.n = r1;
        this.o = r2;
        this.p = rr2.H(r1);
        this.q = r3 - r2;
    }

    public final void a() {
        if (rr2.H(this.n) != this.p) goto L5;
        return;
    L5:
        kf2.c();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object r3) {
        a();
        int r0 = this.o + this.q;
        rh4 r1 = this.n;
        r1.add(r0, r3);
        this.q++;
        this.p = rr2.H(r1);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int r3, Collection r4) {
        a();
        int r5 = r3 + this.o;
        rh4 r0 = this.n;
        boolean r6 = r0.addAll(r5, r4);
        if (r6 == false) goto L5;
        int r1 = this.q;
        this.q = r4.size() + r1;
        this.p = rr2.H(r0);
    L5:
        return r6;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.q <= 0) goto L6;
        a();
        int r0 = this.q;
        int r1 = this.o;
        rh4 r2 = this.n;
        r2.e(r1, r0 + r1);
        this.q = 0;
        this.p = rr2.H(r2);
        return;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object r1) {
        if (indexOf(r1) < 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection r3) {
        Collection r4 = r3;
        if ((r4 instanceof Collection) == true) goto L5;
    L7:
        Iterator r5 = r4.iterator();
    L9:
        if (r5.hasNext() == false) goto L14;
        if (contains(r5.next()) == true) goto L9;
        return false;
    L14:
        return true;
    L5:
        if (r4.isEmpty() == false) goto L7;
        return true;
    }

    @Override // java.util.List
    public final Object get(int r2) {
        a();
        rr2.d(r2, this.q);
        int r0 = this.o + r2;
        return this.n.get(r0);
    }

    @Override // java.util.List
    public final int indexOf(Object r5) {
        a();
        int r0 = this.q;
        int r1 = this.o;
        Iterator r2 = gb.g0(r1, r0 + r1).iterator();
    L4:
        if (((i02) r2).p == false) goto L9;
        int r3 = ((b02) r2).nextInt();
        if (h12.c(r5, this.n.get(r3)) == false) goto L4;
        return r3 - r1;
    L9:
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        if (this.q != 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object r4) {
        a();
        int r0 = this.q;
        int r1 = this.o;
        int r2 = (r0 + r1) - 1;
    L3:
        if (r2 < r1) goto L9;
        if (h12.c(r4, this.n.get(r2)) == true) goto L7;
        r2 = r2 - 1;
        goto L3
    L7:
        return r2 - r1;
    L9:
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int r2) {
        a();
        hx3 r0 = new hx3();
        r0.n = r2 - 1;
        return new f24(r0, this);
    }

    @Override // java.util.List
    public final Object remove(int r3) {
        a();
        int r0 = this.o + r3;
        rh4 r4 = this.n;
        Object r1 = r4.remove(r0);
        this.q--;
        this.p = rr2.H(r4);
        return r1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection r4) {
        Iterator r5 = r4.iterator();
    L3:
        boolean r1 = false;
    L5:
        if (r5.hasNext() == false) goto L10;
        if (remove(r5.next()) == true) goto L9;
        if (r1 == false) goto L3;
    L9:
        r1 = true;
        goto L5
    L10:
        return r1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection r11) {
        a();
        rh4 r0 = this.n;
        int r1 = this.o;
        int r2 = this.q + r1;
        int r3 = r0.size();
    L3:
        Object r4 = rr2.b;
        monitor-enter(r4);
        ql4 r5 = r0.n;     // Catch: Throwable -> L26
        r5.getClass();     // Catch: Throwable -> L26
        ql4 r6 = (ql4) jh4.h(r5);     // Catch: Throwable -> L26
        int r7 = r6.d;     // Catch: Throwable -> L26
        y1 r8 = r6.c;     // Catch: Throwable -> L26
        monitor-exit(r4);
        r8.getClass();
        xf3 r9 = r8.f();
        r9.subList(r1, r2).retainAll(r11);
        y1 r10 = r9.d();
        if (h12.c(r10, r8) == true) goto L19;
        ql4 r12 = r0.n;
        r12.getClass();
        Object r13 = jh4.c;
        monitor-enter(r13);
        ch4 r14 = jh4.j();     // Catch: Throwable -> L16
        boolean r15 = rr2.e((ql4) jh4.w(r12, r0, r14), r7, r10, true);     // Catch: Throwable -> L16
        monitor-exit(r13);
        jh4.n(r14, r0);
        if (r15 == false) goto L3;
    L16:
        th = move-exception;
        throw th;
    L19:
        int r16 = r3 - r0.size();
        if (r16 <= 0) goto L22;
        this.p = rr2.H(this.n);
        this.q -= r16;
    L22:
        if (r16 <= 0) goto L24;
        return true;
    L24:
        return false;
    L26:
        th = move-exception;
        throw th;
    }

    @Override // java.util.List
    public final Object set(int r2, Object r3) {
        rr2.d(r2, this.q);
        a();
        int r4 = r2 + this.o;
        rh4 r0 = this.n;
        Object r5 = r0.set(r4, r3);
        this.p = rr2.H(r0);
        return r5;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.q;
    }

    @Override // java.util.List
    public final List subList(int r3, int r4) {
        if (r3 < 0) goto L7;
        if (r3 > r4) goto L7;
        if (r4 > this.q) goto L7;
    L8:
        a();
        int r1 = this.o;
        rh4 r2 = this.n;
        return new dn4(r2, r3 + r1, r4 + r1);
    L7:
        oo3.a("fromIndex or toIndex are out of bounds");
        goto L8
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return zz1.I(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] r1) {
        return zz1.J(this, r1);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object r1) {
        int r2 = indexOf(r1);
        if (r2 < 0) goto L6;
        remove(r2);
        return true;
    L6:
        return false;
    }

    @Override // java.util.List
    public final void add(int r2, Object r3) {
        a();
        int r0 = this.o + r2;
        rh4 r4 = this.n;
        r4.add(r0, r3);
        this.q++;
        this.p = rr2.H(r4);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection r2) {
        return addAll(this.q, r2);
    }
}
