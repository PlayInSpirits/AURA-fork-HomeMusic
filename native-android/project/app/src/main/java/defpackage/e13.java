package defpackage;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class e13 implements ListIterator, x32 {
    public final List n;
    public int o;

    public e13(List r1, int r2) {
        this.n = r1;
        this.o = r2;
    }

    @Override // java.util.ListIterator
    public final void add(Object r3) {
        this.n.add(this.o, r3);
        this.o++;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        if (this.o >= this.n.size()) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.o <= 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int r0 = this.o;
        this.o = r0 + 1;
        return this.n.get(r0);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.o;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int r0 = this.o - 1;
        this.o = r0;
        return this.n.get(r0);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.o - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int r0 = this.o - 1;
        this.o = r0;
        this.n.remove(r0);
    }

    @Override // java.util.ListIterator
    public final void set(Object r2) {
        this.n.set(this.o, r2);
    }
}
