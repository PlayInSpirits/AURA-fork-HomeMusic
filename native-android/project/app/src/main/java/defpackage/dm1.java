package defpackage;

import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dm1 implements ListIterator, x32 {
    public final /* synthetic */ int n;
    public int o;
    public int p;
    public int q;
    public final Object r;

    public dm1(rh4 r2, int r3) {
        this.n = 3;
        this.r = r2;
        this.o = r3 - 1;
        this.p = -1;
        this.q = rr2.H(r2);
    }

    public void a() {
        if (qb2.d(((pb2) this.r).r) != this.q) goto L5;
        return;
    L5:
        kf2.c();
    }

    @Override // java.util.ListIterator
    public final void add(Object r5) {
        int r0 = this.n;
        Object r2 = this.r;
        switch(r0) {
            case 0: goto L11;
            case 1: goto L8;
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        c();
        rh4 r3 = (rh4) r2;
        r3.add(this.o + 1, r5);
        this.p = -1;
        this.o++;
        this.q = rr2.H(r3);
        return;
    L6:
        b();
        qb2 r4 = (qb2) r2;
        int r1 = this.o;
        this.o = r1 + 1;
        r4.add(r1, r5);
        this.p = -1;
        this.q = qb2.d(r4);
        return;
    L8:
        a();
        pb2 r6 = (pb2) r2;
        int r7 = this.o;
        this.o = r7 + 1;
        r6.add(r7, r5);
        this.p = -1;
        this.q = pb2.d(r6);
        return;
    L11:
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void b() {
        if (qb2.d((qb2) this.r) != this.q) goto L5;
        return;
    L5:
        kf2.c();
    }

    public void c() {
        if (rr2.H((rh4) this.r) != this.q) goto L5;
        return;
    L5:
        kf2.c();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int r0 = this.n;
        Object r1 = this.r;
        switch(r0) {
            case 0: goto L17;
            case 1: goto L13;
            case 2: goto L9;
            default: goto L5;
        };
    L5:
        if (this.o < (((rh4) r1).size() - 1)) goto L7;
        return false;
    L7:
        return true;
    L9:
        if (this.o < ((qb2) r1).o) goto L11;
        return false;
    L11:
        return true;
    L13:
        if (this.o < ((pb2) r1).p) goto L15;
        return false;
    L15:
        return true;
    L17:
        if (this.o < this.q) goto L19;
        return false;
    L19:
        return true;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch(this.n) {
            case 0: goto L20;
            case 1: goto L15;
            case 2: goto L10;
            default: goto L5;
        };
    L5:
        if (this.o < 0) goto L7;
        return true;
    L7:
        return false;
    L10:
        if (this.o <= 0) goto L12;
        return true;
    L12:
        return false;
    L15:
        if (this.o <= 0) goto L17;
        return true;
    L17:
        return false;
    L20:
        if (this.o <= this.p) goto L22;
        return true;
    L22:
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int r0 = this.n;
        Object r2 = this.r;
        switch(r0) {
            case 0: goto L16;
            case 1: goto L11;
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        c();
        int r1 = this.o + 1;
        this.p = r1;
        rh4 r3 = (rh4) r2;
        rr2.d(r1, r3.size());
        Object r4 = r3.get(r1);
        this.o = r1;
        return r4;
    L6:
        b();
        int r5 = this.o;
        qb2 r6 = (qb2) r2;
        if (r5 >= r6.o) goto L9;
        this.o = r5 + 1;
        this.p = r5;
        return r6.n[r5];
    L9:
        tb4.k();
        return null;
    L11:
        a();
        int r7 = this.o;
        pb2 r8 = (pb2) r2;
        if (r7 >= r8.p) goto L14;
        this.o = r7 + 1;
        this.p = r7;
        return r8.n[r8.o + r7];
    L14:
        tb4.k();
        return null;
    L16:
        q03 r9 = ((fm1) r2).n;
        int r10 = this.o;
        this.o = r10 + 1;
        Object r11 = r9.f(r10);
        r11.getClass();
        return (cx2) r11;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch(this.n) {
            case 0: goto L11;
            case 1: goto L9;
            case 2: goto L7;
            default: goto L5;
        };
    L5:
        return this.o + 1;
    L7:
        return this.o;
    L9:
        return this.o;
    L11:
        return this.o - this.p;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int r0 = this.n;
        Object r2 = this.r;
        switch(r0) {
            case 0: goto L16;
            case 1: goto L11;
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        c();
        rh4 r3 = (rh4) r2;
        rr2.d(this.o, r3.size());
        int r1 = this.o;
        this.p = r1;
        Object r4 = r3.get(r1);
        this.o--;
        return r4;
    L6:
        b();
        int r5 = this.o;
        if (r5 <= 0) goto L9;
        int r6 = r5 - 1;
        this.o = r6;
        this.p = r6;
        return ((qb2) r2).n[r6];
    L9:
        tb4.k();
        return null;
    L11:
        a();
        int r7 = this.o;
        if (r7 <= 0) goto L14;
        int r8 = r7 - 1;
        this.o = r8;
        this.p = r8;
        pb2 r9 = (pb2) r2;
        return r9.n[r9.o + r8];
    L14:
        tb4.k();
        return null;
    L16:
        q03 r10 = ((fm1) r2).n;
        int r11 = this.o - 1;
        this.o = r11;
        Object r12 = r10.f(r11);
        r12.getClass();
        return (cx2) r12;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch(this.n) {
            case 0: goto L11;
            case 1: goto L9;
            case 2: goto L6;
            default: goto L5;
        };
    L6:
        int r1 = this.o;
    L8:
        return r1 - 1;
    L9:
        r1 = this.o;
        goto L8
    L5:
        return this.o;
    L11:
        return (this.o - this.p) - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int r0 = this.n;
        Object r3 = this.r;
        switch(r0) {
            case 0: goto L17;
            case 1: goto L11;
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        c();
        rh4 r4 = (rh4) r3;
        r4.remove(this.p);
        this.o--;
        this.p = -1;
        this.q = rr2.H(r4);
        return;
    L6:
        qb2 r5 = (qb2) r3;
        b();
        int r1 = this.p;
        if (r1 == (-1)) goto L9;
        r5.b(r1);
        this.o = this.p;
        this.p = -1;
        this.q = qb2.d(r5);
        return;
    L9:
        kf2.o("Call next() or previous() before removing element from the iterator.");
        return;
    L11:
        pb2 r6 = (pb2) r3;
        a();
        int r2 = this.p;
        if (r2 == (-1)) goto L14;
        r6.b(r2);
        this.o = this.p;
        this.p = -1;
        this.q = pb2.d(r6);
        return;
    L14:
        kf2.o("Call next() or previous() before removing element from the iterator.");
        return;
    L17:
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final void set(Object r5) {
        int r0 = this.n;
        Object r3 = this.r;
        switch(r0) {
            case 0: goto L20;
            case 1: goto L14;
            case 2: goto L9;
            default: goto L4;
        };
    L4:
        rh4 r4 = (rh4) r3;
        c();
        int r1 = this.p;
        if (r1 < 0) goto L7;
        r4.set(r1, r5);
        this.q = rr2.H(r4);
        return;
    L7:
        kf2.o("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
        return;
    L9:
        b();
        int r6 = this.p;
        if (r6 == (-1)) goto L12;
        ((qb2) r3).set(r6, r5);
        return;
    L12:
        kf2.o("Call next() or previous() before replacing element from the iterator.");
        return;
    L14:
        a();
        int r7 = this.p;
        if (r7 == (-1)) goto L17;
        ((pb2) r3).set(r7, r5);
        return;
    L17:
        kf2.o("Call next() or previous() before replacing element from the iterator.");
        return;
    L20:
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public dm1(qb2 r2, int r3) {
        this.n = 2;
        this.r = r2;
        this.o = r3;
        this.p = -1;
        this.q = qb2.d(r2);
    }

    public dm1(fm1 r2, int r3, int r4) {
        this.n = 0;
        if ((r4 & 1) == 0) goto L5;
        r3 = 0;
    L5:
        this(r2, r3, 0, r2.n.b);
    }

    public dm1(fm1 r2, int r3, int r4, int r5) {
        this.n = 0;
        this.r = r2;
        this.o = r3;
        this.p = r4;
        this.q = r5;
    }

    public dm1(pb2 r2, int r3) {
        this.n = 1;
        this.r = r2;
        this.o = r3;
        this.p = -1;
        this.q = pb2.d(r2);
    }
}
