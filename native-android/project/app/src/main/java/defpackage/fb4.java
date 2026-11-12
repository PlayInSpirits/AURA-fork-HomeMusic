package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fb4 extends w1 implements Serializable {
    public static final fb4 o = null;
    public final ag2 n;

    static {
        o = new fb4(ag2.A);
    }

    public fb4() {
        this.n = new ag2();
    }

    @Override // defpackage.w1
    public final int a() {
        return this.n.v;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object r1) {
        if (this.n.a(r1) < 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection r2) {
        r2.getClass();
        this.n.c();
        return super.addAll(r2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.n.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object r1) {
        return this.n.containsKey(r1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.n.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        ag2 r2 = this.n;
        r2.getClass();
        return new xf2(r2, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object r1) {
        ag2 r0 = this.n;
        r0.c();
        int r2 = r0.g(r1);
        if (r2 >= 0) goto L6;
        return false;
    L6:
        r0.k(r2);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection r2) {
        r2.getClass();
        this.n.c();
        return super.removeAll(r2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection r2) {
        r2.getClass();
        this.n.c();
        return super.retainAll(r2);
    }

    public fb4(ag2 r1) {
        r1.getClass();
        this.n = r1;
    }
}
