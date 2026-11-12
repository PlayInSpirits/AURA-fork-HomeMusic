package defpackage;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class f24 implements ListIterator, x32 {
    public final /* synthetic */ int n = 1;
    public final Object o;
    public final /* synthetic */ Object p;

    public f24(tg2 tg2Var, int i) {
        this.p = tg2Var;
        List list = (List) tg2Var.o;
        if (i >= 0 && i <= tg2Var.a()) {
            this.o = list.listIterator(tg2Var.a() - i);
            return;
        }
        StringBuilder sbJ = f34.j(i, "Position index ", " must be in range [");
        sbJ.append(new j02(0, tg2Var.a(), 1));
        sbJ.append("].");
        throw new IndexOutOfBoundsException(sbJ.toString());
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.n) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.n;
        Object obj = this.o;
        switch (i) {
            case 0:
                return ((ListIterator) obj).hasPrevious();
            default:
                return ((hx3) obj).n < ((dn4) this.p).q - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        int i = this.n;
        Object obj = this.o;
        switch (i) {
            case 0:
                return ((ListIterator) obj).hasNext();
            default:
                return ((hx3) obj).n >= 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.n;
        Object obj = this.o;
        switch (i) {
            case 0:
                return ((ListIterator) obj).previous();
            default:
                hx3 hx3Var = (hx3) obj;
                int i2 = hx3Var.n + 1;
                dn4 dn4Var = (dn4) this.p;
                rr2.d(i2, dn4Var.q);
                hx3Var.n = i2;
                return dn4Var.get(i2);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        int i = this.n;
        Object obj = this.o;
        switch (i) {
            case 0:
                return (((tg2) this.p).size() - 1) - ((ListIterator) obj).previousIndex();
            default:
                return ((hx3) obj).n + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.n;
        Object obj = this.o;
        switch (i) {
            case 0:
                return ((ListIterator) obj).next();
            default:
                hx3 hx3Var = (hx3) obj;
                int i2 = hx3Var.n;
                dn4 dn4Var = (dn4) this.p;
                rr2.d(i2, dn4Var.q);
                hx3Var.n = i2 - 1;
                return dn4Var.get(i2);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i = this.n;
        Object obj = this.o;
        switch (i) {
            case 0:
                return (((tg2) this.p).size() - 1) - ((ListIterator) obj).nextIndex();
            default:
                return ((hx3) obj).n;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.n) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.n) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    public f24(hx3 hx3Var, dn4 dn4Var) {
        this.o = hx3Var;
        this.p = dn4Var;
    }
}
