package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ex0 implements Iterator, x32 {
    public final /* synthetic */ int n = 0;
    public int o;
    public final Iterator p;

    public ex0(fx0 fx0Var, byte b) {
        this.o = fx0Var.c;
        this.p = fx0Var.b.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.n;
        Iterator it = this.p;
        switch (i) {
            case 0:
                break;
            default:
                return this.o > 0 && it.hasNext();
        }
        while (this.o > 0 && it.hasNext()) {
            it.next();
            this.o--;
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.n;
        Iterator it = this.p;
        switch (i) {
            case 0:
                break;
            default:
                int i2 = this.o;
                if (i2 != 0) {
                    this.o = i2 - 1;
                    return it.next();
                }
                tb4.k();
                return null;
        }
        while (this.o > 0 && it.hasNext()) {
            it.next();
            this.o--;
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.n) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public ex0(fx0 fx0Var) {
        this.p = fx0Var.b.iterator();
        this.o = fx0Var.c;
    }
}
