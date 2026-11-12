package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class r11 implements Set, x32 {
    public final /* synthetic */ int n;
    public final w03 o;

    public r11(w03 r1, int r2) {
        this.n = r2;
        r1.getClass();
        switch(r2) {
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        this.o = r1;
        return;
    L6:
        this.o = r1;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object r1) {
        switch(this.n) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    L7:
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
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

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        switch(this.n) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    L7:
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object r2) {
        int r0 = this.n;
        w03 r1 = this.o;
        switch(r0) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return r1.c(r2);
    L7:
        if ((r2 instanceof Map.Entry) == true) goto L9;
        return false;
    L9:
        Map.Entry r3 = (Map.Entry) r2;
        return h12.c(r1.g(r3.getKey()), r3.getValue());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection r5) {
        int r0 = this.n;
        w03 r4 = this.o;
        r5.getClass();
        switch(r0) {
            case 0: goto L13;
            default: goto L4;
        };
    L4:
        Collection r6 = r5;
        if (r6.isEmpty() == true) goto L12;
        Iterator r7 = r6.iterator();
    L9:
        if (r7.hasNext() == false) goto L12;
        if (r4.c(r7.next()) == true) goto L9;
        return false;
    L12:
        return true;
    L13:
        Collection r8 = r5;
        if (r8.isEmpty() == true) goto L21;
        Iterator r9 = r8.iterator();
    L18:
        if (r9.hasNext() == false) goto L21;
        Map.Entry r1 = (Map.Entry) r9.next();
        if (h12.c(r4.g(r1.getKey()), r1.getValue()) == true) goto L18;
        return false;
    L21:
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        switch(this.n) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return this.o.i();
    L7:
        return this.o.i();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        vd0 r1 = null;
        switch(this.n) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return si0.C(new q11(this, r1, 1));
    L7:
        return si0.C(new q11(this, r1, 0));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object r1) {
        switch(this.n) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    L7:
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection r1) {
        switch(this.n) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    L7:
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection r1) {
        switch(this.n) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    L7:
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        switch(this.n) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return this.o.e;
    L7:
        return this.o.e;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] r2) {
        switch(this.n) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        r2.getClass();
        return zz1.J(this, r2);
    L6:
        r2.getClass();
        return zz1.J(this, r2);
    }

    @Override // java.util.Set, java.util.Collection
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
