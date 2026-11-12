package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class m60 implements Iterator {
    public int n;
    public int o;
    public int p;
    public final /* synthetic */ p60 q;
    public final /* synthetic */ int r;
    public final /* synthetic */ p60 s;

    public m60(p60 p60Var, int i) {
        this.r = i;
        this.s = p60Var;
        this.q = p60Var;
        this.n = p60Var.r;
        this.o = p60Var.isEmpty() ? -1 : 0;
        this.p = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.o >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object o60Var;
        p60 p60Var = this.q;
        if (p60Var.r != this.n) {
            kf2.c();
            return null;
        }
        if (!hasNext()) {
            tb4.k();
            return null;
        }
        int i = this.o;
        this.p = i;
        int i2 = this.r;
        p60 p60Var2 = this.s;
        switch (i2) {
            case 0:
                o60Var = p60Var2.j()[i];
                break;
            case 1:
                o60Var = new o60(p60Var2, i);
                break;
            default:
                o60Var = p60Var2.k()[i];
                break;
        }
        int i3 = this.o + 1;
        if (i3 >= p60Var.s) {
            i3 = -1;
        }
        this.o = i3;
        return o60Var;
    }

    @Override // java.util.Iterator
    public final void remove() {
        p60 p60Var = this.q;
        if (p60Var.r != this.n) {
            kf2.c();
            return;
        }
        rr2.v("no calls to next() since the last call to remove()", this.p >= 0);
        this.n += 32;
        p60Var.remove(p60Var.j()[this.p]);
        this.o--;
        this.p = -1;
    }
}
