package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ik1 implements Iterator, x32 {
    public final ig4 n;
    public final int o;
    public int p;
    public final int q;

    public ik1(ig4 ig4Var, int i, int i2) {
        this.n = ig4Var;
        this.o = i2;
        this.p = i;
        this.q = ig4Var.u;
        if (ig4Var.t) {
            kg4.f();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.p < this.o;
    }

    @Override // java.util.Iterator
    public final Object next() {
        ig4 ig4Var = this.n;
        int i = ig4Var.u;
        int i2 = this.q;
        if (i != i2) {
            kg4.f();
        }
        int i3 = this.p;
        this.p = ig4Var.n[(i3 * 5) + 3] + i3;
        return new jg4(ig4Var, i3, i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
