package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class q60 implements Iterator {
    public int n;
    public int o;
    public int p;
    public final /* synthetic */ r60 q;

    public q60(r60 r60Var) {
        this.q = r60Var;
        this.n = r60Var.q;
        this.o = r60Var.isEmpty() ? -1 : 0;
        this.p = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.o >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        r60 r60Var = this.q;
        if (r60Var.q != this.n) {
            kf2.c();
            return null;
        }
        if (!hasNext()) {
            tb4.k();
            return null;
        }
        int i = this.o;
        this.p = i;
        Object obj = r60Var.e()[i];
        int i2 = this.o + 1;
        if (i2 >= r60Var.r) {
            i2 = -1;
        }
        this.o = i2;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        r60 r60Var = this.q;
        if (r60Var.q != this.n) {
            kf2.c();
            return;
        }
        rr2.v("no calls to next() since the last call to remove()", this.p >= 0);
        this.n += 32;
        r60Var.remove(r60Var.e()[this.p]);
        this.o--;
        this.p = -1;
    }
}
