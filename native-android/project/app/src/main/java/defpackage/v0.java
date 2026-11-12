package defpackage;

import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v0 extends o15 implements ListIterator {
    public final int o;
    public int p;

    public v0(int i, int i2) {
        super(0);
        rr2.t(i2, i);
        this.o = i;
        this.p = i2;
    }

    public abstract Object a(int i);

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.p < this.o;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.p > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            tb4.k();
            return null;
        }
        int i = this.p;
        this.p = i + 1;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.p;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            tb4.k();
            return null;
        }
        int i = this.p - 1;
        this.p = i;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.p - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
