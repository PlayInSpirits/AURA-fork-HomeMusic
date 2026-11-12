package defpackage;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.Spliterators;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class rw1 extends AbstractCollection implements Serializable {
    public static final Object[] n = null;

    static {
        n = new Object[0];
    }

    public yw1 a() {
        if (isEmpty() == false) goto L6;
        vw1 r1 = yw1.o;
        return gy3.r;
    L6:
        Object[] r2 = toArray(n);
        vw1 r0 = yw1.o;
        return yw1.i(r2.length, r2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object r1) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection r1) {
        throw new UnsupportedOperationException();
    }

    public int b(int r3, Object[] r4) {
        o15 r2 = h();
    L4:
        if (r2.hasNext() == false) goto L6;
        r4[r3] = r2.next();
        r3 = r3 + 1;
        goto L4
    L6:
        return r3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean contains(Object r1);

    public Object[] d() {
        return null;
    }

    public int e() {
        throw new UnsupportedOperationException();
    }

    public int f() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean g();

    public abstract o15 h();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return h();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object r1) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection r1) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection r1) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Spliterator spliterator() {
        return Spliterators.spliterator(this, 1296);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] r4) {
        r4.getClass();
        int r0 = size();
        if (r4.length >= r0) goto L14;
        Object[] r1 = d();
        if (r1 == null) goto L9;
        return Arrays.copyOfRange(r1, f(), e(), r4.getClass());
    L9:
        if (r4.length == 0) goto L12;
        r4 = Arrays.copyOf(r4, 0);
    L12:
        r4 = Arrays.copyOf(r4, r0);
    L16:
        b(0, r4);
        return r4;
    L14:
        if (r4.length <= r0) goto L16;
        r4[r0] = null;
        goto L16
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(n);
    }
}
