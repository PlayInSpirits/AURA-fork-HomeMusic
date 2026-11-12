package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pj5 implements Iterator {
    public int n = 0;
    public final int o;
    public final /* synthetic */ rj5 p;

    public pj5(rj5 rj5Var) {
        this.p = rj5Var;
        this.o = rj5Var.e();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.n < this.o;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.n;
        if (i < this.o) {
            this.n = i + 1;
            return Byte.valueOf(this.p.b(i));
        }
        tb4.k();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
