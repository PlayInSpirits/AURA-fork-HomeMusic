package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hj4 implements w80, Iterable, x32 {
    public final ig4 n;
    public final int o;
    public final py3 p;

    public hj4(ig4 ig4Var, int i, tg1 tg1Var, py3 py3Var) {
        this.n = ig4Var;
        this.o = i;
        this.p = py3Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hj4)) {
            return false;
        }
        hj4 hj4Var = (hj4) obj;
        return hj4Var.o == this.o && hj4Var.n == this.n && hj4Var.p.equals(this.p);
    }

    public final int hashCode() {
        return this.p.hashCode() + ((this.n.hashCode() + (this.o * 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new gj4(this.n, this.o, null, this.p);
    }
}
