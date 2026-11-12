package defpackage;

import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ki5 extends gi5 implements NavigableSet, Iterable {
    public final transient Comparator q;
    public transient ki5 r;

    public ki5(Comparator r1) {
        this.q = r1;
    }

    public static ri5 m(Comparator r2) {
        if (ni5.o == r2) goto L7;
        xh5 r1 = ei5.o;
        return new ri5(pi5.r, r2);
    L7:
        return ri5.t;
    }

    public final void addFirst(Object r1) {
        throw new UnsupportedOperationException();
    }

    public final void addLast(Object r1) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.q;
    }

    @Override // java.util.NavigableSet
    public final /* bridge */ /* synthetic */ NavigableSet descendingSet() {
        return k();
    }

    @Override // java.util.SortedSet
    public abstract Object first();

    public final Object getFirst() {
        return first();
    }

    public final Object getLast() {
        return last();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet headSet(Object r2) {
        r2.getClass();
        ri5 r1 = (ri5) this;
        return r1.p(0, r1.n(r2, false));
    }

    public final ki5 k() {
        ki5 r0 = this.r;
        if (r0 != null) goto L9;
        ri5 r1 = (ri5) this;
        Comparator r2 = Collections.reverseOrder(r1.q);
        if (r1.isEmpty() == false) goto L7;
        r0 = m(r2);
    L8:
        this.r = r0;
        r0.r = this;
        goto L9
    L7:
        r0 = new ri5(r1.s.g(), r2);
    L9:
        return r0;
    }

    public final ri5 l(Object r2, boolean r3, Object r4, boolean r5) {
        r2.getClass();
        r4.getClass();
        if (this.q.compare(r2, r4) > 0) goto L6;
        ri5 r1 = (ri5) this;
        ri5 r6 = r1.p(r1.o(r2, r3), r1.s.size());
        return r6.p(0, r6.n(r4, r5));
    L6:
        nz2.c();
        return null;
    }

    @Override // java.util.SortedSet
    public abstract Object last();

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    public final Object removeFirst() {
        throw new UnsupportedOperationException();
    }

    public final Object removeLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object r3, Object r4) {
        return l(r3, true, r4, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet tailSet(Object r2) {
        r2.getClass();
        ri5 r1 = (ri5) this;
        return r1.p(r1.o(r2, true), r1.s.size());
    }

    @Override // java.util.NavigableSet
    public final /* bridge */ /* synthetic */ NavigableSet subSet(Object r1, boolean r2, Object r3, boolean r4) {
        return l(r1, r2, r3, r4);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object r2, boolean r3) {
        r2.getClass();
        ri5 r1 = (ri5) this;
        return r1.p(0, r1.n(r2, r3));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object r1, boolean r2) {
        r1.getClass();
        ri5 r0 = (ri5) this;
        return r0.p(r0.o(r1, r2), r0.s.size());
    }
}
