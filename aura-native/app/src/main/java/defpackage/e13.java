package defpackage;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class e13 implements ListIterator, x32 {
    public final List n;
    public int o;

    public e13(List list, int i) {
        this.n = list;
        this.o = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        this.n.add(this.o, obj);
        this.o++;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.o < this.n.size();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.o > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.o;
        this.o = i + 1;
        return this.n.get(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.o;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.o - 1;
        this.o = i;
        return this.n.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.o - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.o - 1;
        this.o = i;
        this.n.remove(i);
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        this.n.set(this.o, obj);
    }
}
