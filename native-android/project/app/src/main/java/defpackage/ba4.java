package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ba4 implements Iterator, vd0, x32 {
    public int n;
    public Object o;
    public Iterator p;
    public vd0 q;

    public final RuntimeException a() {
        int r0 = this.n;
        if (r0 == 4) goto L11;
        if (r0 == 5) goto L9;
        return new IllegalStateException("Unexpected state of the iterator: " + this.n);
    L9:
        return new IllegalStateException("Iterator has failed.");
    L11:
        return new NoSuchElementException();
    }

    public final void b(vd0 r1, Object r2) {
        this.o = r2;
        this.n = 3;
        this.q = r1;
        r1.getClass();
    }

    @Override // defpackage.vd0
    public final ne0 getContext() {
        return q01.n;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
    L2:
        int r0 = this.n;
        if (r0 == 0) goto L21;
        if (r0 != 1) goto L6;
        Iterator r1 = this.p;
        r1.getClass();
        if (r1.hasNext() == true) goto L18;
        this.p = null;
        goto L21
    L18:
        this.n = 2;
        return true;
    L6:
        if (r0 != 2) goto L8;
    L15:
        return true;
    L8:
        if (r0 == 3) goto L15;
        if (r0 != 4) goto L14;
        return false;
    L14:
        throw a();
    L21:
        this.n = 5;
        vd0 r2 = this.q;
        r2.getClass();
        this.q = null;
        r2.resumeWith(j15.a);
        goto L2
    }

    @Override // java.util.Iterator
    public final Object next() {
        int r0 = this.n;
        if (r0 == 0) goto L17;
        if (r0 == 1) goto L17;
        if (r0 != 2) goto L9;
        this.n = 1;
        Iterator r4 = this.p;
        r4.getClass();
        return r4.next();
    L9:
        if (r0 != 3) goto L13;
        this.n = 0;
        Object r1 = this.o;
        this.o = null;
        return r1;
    L13:
        throw a();
    L17:
        if (hasNext() == true) goto L19;
        tb4.k();
        return null;
    L19:
        return next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // defpackage.vd0
    public final void resumeWith(Object r1) {
        kb4.X(r1);
        this.n = 4;
    }
}
