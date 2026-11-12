package defpackage;

import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b1 implements ListIterator, x32 {
    public int n;
    public int o;

    public b1(int r1, int r2) {
        this.n = r1;
        this.o = r2;
    }

    @Override // java.util.ListIterator
    public void add(Object r1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        if (this.n >= this.o) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.n <= 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.n;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.n - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(Object r1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
