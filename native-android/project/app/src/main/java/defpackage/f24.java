package defpackage;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class f24 implements ListIterator, x32 {
    public final /* synthetic */ int n;
    public final Object o;
    public final /* synthetic */ Object p;

    public f24(tg2 r4, int r5) {
        this.n = 0;
        this.p = r4;
        List r1 = (List) r4.o;
        if (r5 >= 0) goto L5;
    L8:
        StringBuilder r6 = f34.j(r5, "Position index ", " must be in range [");
        r6.append(new j02(0, r4.a(), 1));
        r6.append("].");
        throw new IndexOutOfBoundsException(r6.toString());
    L5:
        if (r5 > r4.a()) goto L8;
        this.o = r1.listIterator(r4.a() - r5);
    }

    @Override // java.util.ListIterator
    public final void add(Object r1) {
        switch(this.n) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        throw new IllegalStateException("Cannot modify a state list through an iterator");
    L7:
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int r0 = this.n;
        Object r1 = this.o;
        switch(r0) {
            case 0: goto L10;
            default: goto L5;
        };
    L5:
        if (((hx3) r1).n < (((dn4) this.p).q - 1)) goto L11;
        return false;
    L11:
        return true;
    L10:
        return ((ListIterator) r1).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        int r0 = this.n;
        Object r1 = this.o;
        switch(r0) {
            case 0: goto L10;
            default: goto L5;
        };
    L5:
        if (((hx3) r1).n < 0) goto L7;
        return true;
    L7:
        return false;
    L10:
        return ((ListIterator) r1).hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int r0 = this.n;
        Object r1 = this.o;
        switch(r0) {
            case 0: goto L7;
            default: goto L4;
        };
    L4:
        hx3 r2 = (hx3) r1;
        int r3 = r2.n + 1;
        dn4 r4 = (dn4) this.p;
        rr2.d(r3, r4.q);
        r2.n = r3;
        return r4.get(r3);
    L7:
        return ((ListIterator) r1).previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        int r0 = this.n;
        Object r1 = this.o;
        switch(r0) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        tg2 r2 = (tg2) this.p;
        return (r2.size() - 1) - ((ListIterator) r1).previousIndex();
    L5:
        return ((hx3) r1).n + 1;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int r0 = this.n;
        Object r1 = this.o;
        switch(r0) {
            case 0: goto L7;
            default: goto L4;
        };
    L4:
        hx3 r2 = (hx3) r1;
        int r3 = r2.n;
        dn4 r4 = (dn4) this.p;
        rr2.d(r3, r4.q);
        r2.n = r3 - 1;
        return r4.get(r3);
    L7:
        return ((ListIterator) r1).next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int r0 = this.n;
        Object r1 = this.o;
        switch(r0) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        tg2 r2 = (tg2) this.p;
        return (r2.size() - 1) - ((ListIterator) r1).nextIndex();
    L5:
        return ((hx3) r1).n;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch(this.n) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        throw new IllegalStateException("Cannot modify a state list through an iterator");
    L7:
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final void set(Object r1) {
        switch(this.n) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        throw new IllegalStateException("Cannot modify a state list through an iterator");
    L7:
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public f24(hx3 r2, dn4 r3) {
        this.n = 1;
        this.o = r2;
        this.p = r3;
    }
}
