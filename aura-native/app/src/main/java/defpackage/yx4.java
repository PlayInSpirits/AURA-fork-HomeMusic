package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class yx4 implements Iterator, x32 {
    public Object[] n = xx4.e.d;
    public int o;
    public int p;

    public final void a(Object[] objArr, int i, int i2) {
        this.n = objArr;
        this.o = i;
        this.p = i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.p < this.o;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
