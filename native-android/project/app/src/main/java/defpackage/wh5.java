package defpackage;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Spliterator;
import java.util.Spliterators;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class wh5 extends AbstractCollection implements Serializable {
    public static final Object[] n = null;

    static {
        n = new Object[0];
    }

    public int a(Object[] r4) {
        o15 r3 = e();
        int r0 = 0;
    L4:
        if (r3.hasNext() == false) goto L6;
        r4[r0] = r3.next();
        r0 = r0 + 1;
        goto L4
    L6:
        return r0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object r1) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection r1) {
        throw new UnsupportedOperationException();
    }

    public int b() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public int d() {
        throw new UnsupportedOperationException();
    }

    public abstract o15 e();

    public Object[] f() {
        return null;
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
        int r1 = r4.length;
        if (r1 >= r0) goto L11;
        Object[] r2 = f();
        if (r2 != null) goto L10;
        if (r1 == 0) goto L8;
        r4 = Arrays.copyOf(r4, 0);
    L8:
        r4 = Arrays.copyOf(r4, r0);
    L13:
        a(r4);
        return r4;
    L10:
        return Arrays.copyOfRange(r2, d(), b(), r4.getClass());
    L11:
        if (r1 <= r0) goto L13;
        r4[r0] = null;
        goto L13
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(n);
    }
}
