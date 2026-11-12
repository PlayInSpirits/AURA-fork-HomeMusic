package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ri5 extends ki5 {
    public static final ri5 t = null;
    public final transient ei5 s;

    static {
        xh5 r1 = ei5.o;
        t = new ri5(pi5.r, ni5.o);
    }

    public ri5(ei5 r1, Comparator r2) {
        super(r2);
        this.s = r1;
    }

    @Override // defpackage.wh5
    public final int a(Object[] r1) {
        return this.s.a(r1);
    }

    @Override // defpackage.wh5
    public final int b() {
        return this.s.b();
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object r2) {
        int r3 = o(r2, true);
        ei5 r1 = this.s;
        if (r3 != r1.size()) goto L7;
        return null;
    L7:
        return r1.get(r3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object r3) {
        if (r3 != null) goto L10;
    L8:
        return false;
    L10:
        if (Collections.binarySearch(this.s, r3, this.q) < 0) goto L8;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection r7) {
        if ((r7 instanceof mi5) == false) goto L5;
        r7 = ((mi5) r7).c();
    L5:
        Comparator r1 = this.q;
        if (si0.a0(r1, r7) == false) goto L28;
        if (r7.size() <= 1) goto L28;
        xh5 r6 = this.s.k(0);
        Iterator r8 = r7.iterator();
        if (r6.hasNext() == false) goto L26;
        Object r3 = r8.next();
        Object r4 = r6.next();
    L30:
        int r5 = r1.compare(r4, r3);     // Catch: Throwable -> L29
        if (r5 < 0) goto L17;
        if (r5 != 0) goto L26;
        if (r8.hasNext() == false) goto L23;
        r3 = r8.next();     // Catch: Throwable -> L29
        goto L30
    L23:
        return true;
    L17:
        if (r6.hasNext() == false) goto L26;
        r4 = r6.next();     // Catch: Throwable -> L29
    L26:
        return false;
    L28:
        return super.containsAll(r7);
    }

    @Override // defpackage.wh5
    public final int d() {
        return this.s.d();
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return this.s.g().k(0);
    }

    @Override // defpackage.wh5
    public final o15 e() {
        return this.s.k(0);
    }

    @Override // defpackage.gi5, java.util.Collection, java.util.Set
    public final boolean equals(Object r5) {
        if (r5 != this) goto L5;
        return true;
    L5:
        if ((r5 instanceof Set) == false) goto L26;
        Set r6 = (Set) r5;
        ei5 r0 = this.s;
        if (r0.size() != r6.size()) goto L26;
        if (isEmpty() == true) goto L36;
        Comparator r3 = this.q;
        if (si0.a0(r3, r6) == false) goto L28;
        Iterator r4 = r6.iterator();
        xh5 r7 = r0.k(0);     // Catch: Throwable -> L29
    L18:
        if (r7.hasNext() == false) goto L37;
        Object r1 = r7.next();     // Catch: Throwable -> L29
        Object r2 = r4.next();     // Catch: Throwable -> L29
        if (r2 == null) goto L26;
        if (r3.compare(r1, r2) == 0) goto L18;
    L37:
        return true;
    L28:
        return containsAll(r6);
    L36:
        return true;
    L26:
        return false;
    }

    @Override // defpackage.wh5
    public final Object[] f() {
        return this.s.f();
    }

    @Override // defpackage.ki5, java.util.SortedSet
    public final Object first() {
        if (isEmpty() == false) goto L5;
        tb4.k();
        return null;
    L5:
        return this.s.get(0);
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object r2) {
        int r3 = n(r2, true) - 1;
        if (r3 != (-1)) goto L7;
        return null;
    L7:
        return this.s.get(r3);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object r2) {
        int r3 = o(r2, false);
        ei5 r1 = this.s;
        if (r3 != r1.size()) goto L7;
        return null;
    L7:
        return r1.get(r3);
    }

    @Override // defpackage.gi5
    public final ei5 i() {
        return this.s;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final /* synthetic */ Iterator iterator() {
        return this.s.k(0);
    }

    @Override // defpackage.ki5, java.util.SortedSet
    public final Object last() {
        if (isEmpty() == true) goto L6;
        ei5 r1 = this.s;
        return r1.get(r1.size() - 1);
    L6:
        tb4.k();
        return null;
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object r2) {
        int r3 = n(r2, false) - 1;
        if (r3 != (-1)) goto L7;
        return null;
    L7:
        return this.s.get(r3);
    }

    public final int n(Object r2, boolean r3) {
        r2.getClass();
        int r1 = Collections.binarySearch(this.s, r2, this.q);
        if (r1 < 0) goto L8;
        if (r3 == true) goto L6;
        return r1;
    L6:
        return r1 + 1;
    L8:
        return ~r1;
    }

    public final int o(Object r2, boolean r3) {
        r2.getClass();
        int r1 = Collections.binarySearch(this.s, r2, this.q);
        if (r1 < 0) goto L9;
        if (r3 == false) goto L7;
        return r1;
    L7:
        return r1 + 1;
    L9:
        return ~r1;
    }

    public final ri5 p(int r3, int r4) {
        ei5 r0 = this.s;
        if (r3 == 0) goto L5;
    L8:
        Comparator r2 = this.q;
        if (r3 >= r4) goto L13;
        return new ri5(r0.h(r3, r4), r2);
    L13:
        return ki5.m(r2);
    L5:
        if (r4 == r0.size()) goto L7;
        r3 = 0;
        goto L8
    L7:
        return this;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.s.size();
    }
}
