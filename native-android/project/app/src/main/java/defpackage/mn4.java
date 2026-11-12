package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mn4 implements Collection, x32 {
    public final /* synthetic */ int n;
    public final Object o;

    public mn4() {
        this.n = 0;
        int r0 = fb3.a;
        this.o = new r03(6);
    }

    @Override // java.util.Collection
    public final boolean add(Object r2) {
        switch(this.n) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    L7:
        return ((r03) this.o).a(r2);
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection r1) {
        switch(this.n) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    L7:
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        switch(this.n) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        ((r03) this.o).b();
        return;
    L5:
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object r2) {
        switch(this.n) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return ((w03) this.o).d(r2);
    L7:
        return ((r03) this.o).c(r2);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection r5) {
        int r0 = this.n;
        Object r4 = this.o;
        switch(r0) {
            case 0: goto L13;
            default: goto L4;
        };
    L4:
        r5.getClass();
        Collection r6 = r5;
        if (r6.isEmpty() == true) goto L12;
        Iterator r7 = r6.iterator();
    L9:
        if (r7.hasNext() == false) goto L12;
        w03 r3 = (w03) r4;
        if (r3.d(r7.next()) == true) goto L9;
        return false;
    L12:
        return true;
    L13:
        Iterator r8 = r5.iterator();
    L15:
        if (r8.hasNext() == false) goto L20;
        r03 r9 = (r03) r4;
        if (r9.c(r8.next()) == true) goto L15;
        return false;
    L20:
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        switch(this.n) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return ((w03) this.o).i();
    L7:
        if (((r03) this.o).g != 0) goto L9;
        return true;
    L9:
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch(this.n) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        r03 r3 = (r03) this.o;
        r3.getClass();
        return new bh1(new t03(r3));
    L5:
        return si0.C(new q11(this, null, 3));
    }

    @Override // java.util.Collection
    public final boolean remove(Object r2) {
        switch(this.n) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    L7:
        return ((r03) this.o).g(r2);
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection r2) {
        switch(this.n) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    L7:
        return ((r03) this.o).g(r2);
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate r1) {
        switch(this.n) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    L7:
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection r2) {
        switch(this.n) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    L7:
        return ((r03) this.o).i(r2);
    }

    @Override // java.util.Collection
    public final int size() {
        switch(this.n) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return ((w03) this.o).e;
    L7:
        return ((r03) this.o).g;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] r2) {
        switch(this.n) {
            case 0: goto L7;
            default: goto L4;
        };
    L4:
        r2.getClass();
        return zz1.J(this, r2);
    L7:
        return zz1.J(this, r2);
    }

    public mn4(w03 r2) {
        this.n = 1;
        r2.getClass();
        this.o = r2;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        switch(this.n) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return zz1.I(this);
    L7:
        return zz1.I(this);
    }
}
