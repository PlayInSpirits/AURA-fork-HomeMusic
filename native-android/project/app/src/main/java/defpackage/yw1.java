package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class yw1 extends rw1 implements List, RandomAccess {
    public static final vw1 o = null;

    static {
        o = new vw1(gy3.r, 0);
    }

    public static gy3 i(int r1, Object[] r2) {
        if (r1 != 0) goto L6;
        return gy3.r;
    L6:
        return new gy3(r1, r2);
    }

    public static uw1 j() {
        return new uw1(4);
    }

    public static yw1 k(Collection r1) {
        if ((r1 instanceof rw1) == false) goto L8;
        yw1 r2 = ((rw1) r1).a();
        if (r2.g() == false) goto L10;
        Object[] r3 = r2.toArray(rw1.n);
        return i(r3.length, r3);
    L10:
        return r2;
    L8:
        Object[] r4 = r1.toArray();
        gh0.f(r4.length, r4);
        return i(r4.length, r4);
    }

    public static gy3 l(Object[] r1) {
        if (r1.length == 0) goto L5;
        Object[] r2 = (Object[]) r1.clone();
        gh0.f(r2.length, r2);
        return i(r2.length, r2);
    L5:
        return gy3.r;
    }

    public static gy3 n(Long r0, Long r1, Long r2, Long r3, Long r4) {
        Object[] r5 = {r0, r1, r2, r3, r4};
        gh0.f(5, r5);
        return i(5, r5);
    }

    public static gy3 o(Object r1) {
        Object[] r2 = {r1};
        gh0.f(1, r2);
        return i(1, r2);
    }

    public static gy3 p(Object r0, Object r1) {
        Object[] r2 = {r0, r1};
        gh0.f(2, r2);
        return i(2, r2);
    }

    public static gy3 q(Comparator r2, Collection r3) {
        r2.getClass();
        if ((r3 instanceof Collection) == false) goto L5;
        Collection r4 = r3;
    L10:
        Object[] r5 = r4.toArray();
        gh0.f(r5.length, r5);
        Arrays.sort(r5, r2);
        return i(r5.length, r5);
    L5:
        Iterator r6 = r3.iterator();
        ArrayList r0 = new ArrayList();
        r6.getClass();
    L7:
        if (r6.hasNext() == false) goto L9;
        r0.add(r6.next());
        goto L7
    L9:
        r4 = r0;
        goto L10
    }

    @Override // defpackage.rw1
    public final yw1 a() {
        return this;
    }

    @Override // java.util.List
    public final void add(int r1, Object r2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int r1, Collection r2) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.rw1
    public int b(int r5, Object[] r6) {
        int r0 = size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L6;
        r6[r5 + r1] = get(r1);
        r1 = r1 + 1;
        goto L3
    L6:
        return r5 + r0;
    }

    @Override // defpackage.rw1, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object r1) {
        if (indexOf(r1) < 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object r7) {
        if (r7 != this) goto L6;
    L19:
        return true;
    L6:
        if ((r7 instanceof List) == false) goto L28;
        List r8 = (List) r7;
        int r1 = size();
        if (r1 != r8.size()) goto L28;
        if ((r8 instanceof RandomAccess) == false) goto L20;
        int r3 = 0;
    L14:
        if (r3 >= r1) goto L19;
        if (si0.s(get(r3), r8.get(r3)) == false) goto L28;
        r3 = r3 + 1;
        goto L14
    L20:
        Iterator r6 = iterator();
        Iterator r9 = r8.iterator();
    L22:
        if (r6.hasNext() == false) goto L30;
        if (r9.hasNext() == false) goto L28;
        if (si0.s(r6.next(), r9.next()) == true) goto L22;
    L30:
        return !r9.hasNext();
    L28:
        return false;
    }

    @Override // defpackage.rw1
    public final o15 h() {
        return m(0);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int r0 = size();
        int r1 = 1;
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L5;
        int r3 = get(r2).hashCode();
        r1 = ~(~(r3 + (r1 * 31)));
        r2 = r2 + 1;
        goto L3
    L5:
        return r1;
    }

    @Override // java.util.List
    public final int indexOf(Object r5) {
        if (r5 != null) goto L5;
        return -1;
    L5:
        int r1 = size();
        int r2 = 0;
    L6:
        if (r2 >= r1) goto L11;
        if (r5.equals(get(r2)) == true) goto L9;
        r2 = r2 + 1;
        goto L6
    L9:
        return r2;
    L11:
        return -1;
    }

    @Override // defpackage.rw1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return m(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object r4) {
        if (r4 != null) goto L5;
        return -1;
    L5:
        int r1 = size() - 1;
    L6:
        if (r1 < 0) goto L11;
        if (r4.equals(get(r1)) == true) goto L9;
        r1 = r1 - 1;
        goto L6
    L9:
        return r1;
    L11:
        return -1;
    }

    public ListIterator listIterator() {
        return m(0);
    }

    public final vw1 m(int r2) {
        rr2.t(r2, size());
        if (isEmpty() == false) goto L7;
        return o;
    L7:
        return new vw1(this, r2);
    }

    public yw1 r(int r2, int r3) {
        rr2.u(r2, r3, size());
        int r4 = r3 - r2;
        if (r4 != size()) goto L5;
        return this;
    L5:
        if (r4 != 0) goto L9;
        return gy3.r;
    L9:
        return new ww1(this, r2, r4);
    }

    @Override // java.util.List
    public final Object remove(int r1) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int r1, Object r2) {
        throw new UnsupportedOperationException();
    }

    public /* bridge */ /* synthetic */ List subList(int r1, int r2) {
        return r(r1, r2);
    }

    public /* bridge */ /* synthetic */ ListIterator listIterator(int r1) {
        return m(r1);
    }
}
