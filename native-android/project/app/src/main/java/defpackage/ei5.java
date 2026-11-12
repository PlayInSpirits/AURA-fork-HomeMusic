package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ei5 extends wh5 implements List, RandomAccess {
    public static final xh5 o = null;

    static {
        o = new xh5(pi5.r, 0);
    }

    public static pi5 i(int r1, Object[] r2) {
        if (r1 != 0) goto L6;
        return pi5.r;
    L6:
        return new pi5(r1, r2);
    }

    public static pi5 j(Object[] r3) {
        if (r3.length == 0) goto L5;
        Object[] r4 = (Object[]) r3.clone();
        int r0 = r4.length;
        int r1 = 0;
    L7:
        if (r1 >= r0) goto L14;
        if (r4[r1] == null) goto L11;
        r1 = r1 + 1;
        goto L7
    L11:
        nz2.n(f34.f(r1, "at index "));
        return null;
    L14:
        return i(r0, r4);
    L5:
        return pi5.r;
    }

    @Override // defpackage.wh5
    public int a(Object[] r4) {
        int r0 = size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        r4[r1] = get(r1);
        r1 = r1 + 1;
        goto L3
    L5:
        return r0;
    }

    @Override // java.util.List
    public final void add(int r1, Object r2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int r1, Collection r2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object r1) {
        if (indexOf(r1) < 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // defpackage.wh5
    public final o15 e() {
        return k(0);
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object r6) {
        if (r6 != this) goto L5;
        return true;
    L5:
        if ((r6 instanceof List) == false) goto L31;
        List r7 = (List) r6;
        int r0 = size();
        if (r0 != r7.size()) goto L31;
        if ((r7 instanceof RandomAccess) == false) goto L18;
        int r2 = 0;
    L13:
        if (r2 >= r0) goto L39;
        if (bu.H(get(r2), r7.get(r2)) == false) goto L31;
        r2 = r2 + 1;
        goto L13
    L39:
        return true;
    L18:
        xh5 r5 = k(0);
        Iterator r8 = r7.iterator();
    L20:
        if (r5.hasNext() == false) goto L28;
        if (r8.hasNext() == false) goto L31;
        if (bu.H(r5.next(), r8.next()) == true) goto L20;
    L28:
        if (r8.hasNext() == true) goto L31;
        return true;
    L31:
        return false;
    }

    public ei5 g() {
        if (size() > 1) goto L6;
        return this;
    L6:
        return new ci5(this);
    }

    public ei5 h(int r2, int r3) {
        fu.R(r2, r3, size());
        int r4 = r3 - r2;
        if (r4 != size()) goto L5;
        return this;
    L5:
        if (r4 != 0) goto L9;
        return pi5.r;
    L9:
        return new di5(this, r2, r4);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int r0 = size();
        int r1 = 0;
        int r2 = 1;
    L3:
        if (r1 >= r0) goto L5;
        r2 = (r2 * 31) + get(r1).hashCode();
        r1 = r1 + 1;
        goto L3
    L5:
        return r2;
    }

    public int indexOf(Object r5) {
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

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return k(0);
    }

    public final xh5 k(int r2) {
        int r0 = size();
        if (r2 < 0) goto L11;
        if (r2 > r0) goto L11;
        if (isEmpty() == false) goto L10;
        return o;
    L10:
        return new xh5(this, r2);
    L11:
        kf2.h(fu.S("index", r2, r0));
        return null;
    }

    public int lastIndexOf(Object r4) {
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

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return k(0);
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
        return h(r1, r2);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int r1) {
        return k(r1);
    }
}
