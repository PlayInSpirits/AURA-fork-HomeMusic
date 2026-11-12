package defpackage;

import java.util.AbstractList;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dm1 implements ListIterator, x32 {
    public final /* synthetic */ int n;
    public int o;
    public int p;
    public int q;
    public final Object r;

    public dm1(rh4 rh4Var, int i) {
        this.n = 3;
        this.r = rh4Var;
        this.o = i - 1;
        this.p = -1;
        this.q = rr2.H(rh4Var);
    }

    public void a() {
        if (((AbstractList) ((pb2) this.r).r).modCount == this.q) {
            return;
        }
        kf2.c();
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i = this.n;
        Object obj2 = this.r;
        switch (i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                a();
                pb2 pb2Var = (pb2) obj2;
                int i2 = this.o;
                this.o = i2 + 1;
                pb2Var.add(i2, obj);
                this.p = -1;
                this.q = ((AbstractList) pb2Var).modCount;
                return;
            case 2:
                b();
                qb2 qb2Var = (qb2) obj2;
                int i3 = this.o;
                this.o = i3 + 1;
                qb2Var.add(i3, obj);
                this.p = -1;
                this.q = ((AbstractList) qb2Var).modCount;
                return;
            default:
                c();
                rh4 rh4Var = (rh4) obj2;
                rh4Var.add(this.o + 1, obj);
                this.p = -1;
                this.o++;
                this.q = rr2.H(rh4Var);
                return;
        }
    }

    public void b() {
        if (((AbstractList) ((qb2) this.r)).modCount == this.q) {
            return;
        }
        kf2.c();
    }

    public void c() {
        if (rr2.H((rh4) this.r) == this.q) {
            return;
        }
        kf2.c();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.n;
        Object obj = this.r;
        switch (i) {
            case 0:
                return this.o < this.q;
            case 1:
                return this.o < ((pb2) obj).p;
            case 2:
                return this.o < ((qb2) obj).o;
            default:
                return this.o < ((rh4) obj).size() - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.n) {
            case 0:
                return this.o > this.p;
            case 1:
                return this.o > 0;
            case 2:
                return this.o > 0;
            default:
                return this.o >= 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.n;
        Object obj = this.r;
        switch (i) {
            case 0:
                q03 q03Var = ((fm1) obj).n;
                int i2 = this.o;
                this.o = i2 + 1;
                Object objF = q03Var.f(i2);
                objF.getClass();
                return (cx2) objF;
            case 1:
                a();
                int i3 = this.o;
                pb2 pb2Var = (pb2) obj;
                if (i3 >= pb2Var.p) {
                    tb4.k();
                    return null;
                }
                this.o = i3 + 1;
                this.p = i3;
                return pb2Var.n[pb2Var.o + i3];
            case 2:
                b();
                int i4 = this.o;
                qb2 qb2Var = (qb2) obj;
                if (i4 >= qb2Var.o) {
                    tb4.k();
                    return null;
                }
                this.o = i4 + 1;
                this.p = i4;
                return qb2Var.n[i4];
            default:
                c();
                int i5 = this.o + 1;
                this.p = i5;
                rh4 rh4Var = (rh4) obj;
                rr2.d(i5, rh4Var.size());
                Object obj2 = rh4Var.get(i5);
                this.o = i5;
                return obj2;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.n) {
            case 0:
                return this.o - this.p;
            case 1:
                return this.o;
            case 2:
                return this.o;
            default:
                return this.o + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.n;
        Object obj = this.r;
        switch (i) {
            case 0:
                q03 q03Var = ((fm1) obj).n;
                int i2 = this.o - 1;
                this.o = i2;
                Object objF = q03Var.f(i2);
                objF.getClass();
                return (cx2) objF;
            case 1:
                a();
                int i3 = this.o;
                if (i3 <= 0) {
                    tb4.k();
                    return null;
                }
                int i4 = i3 - 1;
                this.o = i4;
                this.p = i4;
                pb2 pb2Var = (pb2) obj;
                return pb2Var.n[pb2Var.o + i4];
            case 2:
                b();
                int i5 = this.o;
                if (i5 <= 0) {
                    tb4.k();
                    return null;
                }
                int i6 = i5 - 1;
                this.o = i6;
                this.p = i6;
                return ((qb2) obj).n[i6];
            default:
                c();
                rh4 rh4Var = (rh4) obj;
                rr2.d(this.o, rh4Var.size());
                int i7 = this.o;
                this.p = i7;
                Object obj2 = rh4Var.get(i7);
                this.o--;
                return obj2;
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        switch (this.n) {
            case 0:
                return (this.o - this.p) - 1;
            case 1:
                i = this.o;
                break;
            case 2:
                i = this.o;
                break;
            default:
                return this.o;
        }
        return i - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.n;
        Object obj = this.r;
        switch (i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                pb2 pb2Var = (pb2) obj;
                a();
                int i2 = this.p;
                if (i2 == -1) {
                    kf2.o("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                pb2Var.b(i2);
                this.o = this.p;
                this.p = -1;
                this.q = ((AbstractList) pb2Var).modCount;
                return;
            case 2:
                qb2 qb2Var = (qb2) obj;
                b();
                int i3 = this.p;
                if (i3 == -1) {
                    kf2.o("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                qb2Var.b(i3);
                this.o = this.p;
                this.p = -1;
                this.q = ((AbstractList) qb2Var).modCount;
                return;
            default:
                c();
                rh4 rh4Var = (rh4) obj;
                rh4Var.remove(this.p);
                this.o--;
                this.p = -1;
                this.q = rr2.H(rh4Var);
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        int i = this.n;
        Object obj2 = this.r;
        switch (i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                a();
                int i2 = this.p;
                if (i2 != -1) {
                    ((pb2) obj2).set(i2, obj);
                    return;
                } else {
                    kf2.o("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            case 2:
                b();
                int i3 = this.p;
                if (i3 != -1) {
                    ((qb2) obj2).set(i3, obj);
                    return;
                } else {
                    kf2.o("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            default:
                rh4 rh4Var = (rh4) obj2;
                c();
                int i4 = this.p;
                if (i4 < 0) {
                    kf2.o("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                    return;
                } else {
                    rh4Var.set(i4, obj);
                    this.q = rr2.H(rh4Var);
                    return;
                }
        }
    }

    public dm1(qb2 qb2Var, int i) {
        this.n = 2;
        this.r = qb2Var;
        this.o = i;
        this.p = -1;
        this.q = ((AbstractList) qb2Var).modCount;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public dm1(fm1 fm1Var, int i, int i2) {
        this(fm1Var, (i2 & 1) != 0 ? 0 : i, 0, fm1Var.n.b);
        this.n = 0;
    }

    public dm1(fm1 fm1Var, int i, int i2, int i3) {
        this.n = 0;
        this.r = fm1Var;
        this.o = i;
        this.p = i2;
        this.q = i3;
    }

    public dm1(pb2 pb2Var, int i) {
        this.n = 1;
        this.r = pb2Var;
        this.o = i;
        this.p = -1;
        this.q = ((AbstractList) pb2Var).modCount;
    }
}
