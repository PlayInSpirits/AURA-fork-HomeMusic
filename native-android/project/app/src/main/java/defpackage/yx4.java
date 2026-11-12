package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class yx4 implements Iterator, x32 {
    public Object[] n;
    public int o;
    public int p;

    public yx4() {
        this.n = xx4.e.d;
    }

    public final void a(Object[] r1, int r2, int r3) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.p >= this.o) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
