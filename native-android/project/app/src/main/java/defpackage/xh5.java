package defpackage;

import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xh5 extends o15 implements ListIterator {
    public final int o;
    public int p;
    public final ei5 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xh5(ei5 ei5Var, int i) {
        super(1);
        int size = ei5Var.size();
        if (i < 0 || i > size) {
            kf2.h(fu.S("index", i, size));
            throw null;
        }
        this.o = size;
        this.p = i;
        this.q = ei5Var;
    }

    public final Object a(int i) {
        return this.q.get(i);
    }

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
