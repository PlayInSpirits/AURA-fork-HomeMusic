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

    public ki5(Comparator comparator) {
        this.q = comparator;
    }

    public static ri5 m(Comparator comparator) {
        if (ni5.o == comparator) {
            return ri5.t;
        }
        xh5 xh5Var = ei5.o;
        return new ri5(pi5.r, comparator);
    }

    public final void addFirst(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final void addLast(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.q;
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
    public final SortedSet headSet(Object obj) {
        obj.getClass();
        ri5 ri5Var = (ri5) this;
        return ri5Var.p(0, ri5Var.n(obj, false));
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final ki5 descendingSet() {
        ki5 ki5VarM = this.r;
        if (ki5VarM == null) {
            ri5 ri5Var = (ri5) this;
            Comparator comparatorReverseOrder = Collections.reverseOrder(ri5Var.q);
            ki5VarM = ri5Var.isEmpty() ? m(comparatorReverseOrder) : new ri5(ri5Var.s.g(), comparatorReverseOrder);
            this.r = ki5VarM;
            ki5VarM.r = this;
        }
        return ki5VarM;
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final ri5 subSet(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        if (this.q.compare(obj, obj2) > 0) {
            nz2.c();
            return null;
        }
        ri5 ri5Var = (ri5) this;
        ri5 ri5VarP = ri5Var.p(ri5Var.o(obj, z), ri5Var.s.size());
        return ri5VarP.p(0, ri5VarP.n(obj2, z2));
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
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        obj.getClass();
        ri5 ri5Var = (ri5) this;
        return ri5Var.p(ri5Var.o(obj, true), ri5Var.s.size());
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        obj.getClass();
        ri5 ri5Var = (ri5) this;
        return ri5Var.p(0, ri5Var.n(obj, z));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        obj.getClass();
        ri5 ri5Var = (ri5) this;
        return ri5Var.p(ri5Var.o(obj, z), ri5Var.s.size());
    }
}
