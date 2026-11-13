package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class kb2 implements Iterator {
    public mb2 n;
    public mb2 o = null;
    public int p;
    public final /* synthetic */ nb2 q;
    public final /* synthetic */ int r;

    public kb2(nb2 nb2Var, int i) {
        this.r = i;
        this.q = nb2Var;
        this.n = nb2Var.s.q;
        this.p = nb2Var.r;
    }

    public final Object a() {
        return b();
    }

    public final mb2 b() {
        mb2 mb2Var = this.n;
        nb2 nb2Var = this.q;
        if (mb2Var == nb2Var.s) {
            tb4.k();
            return null;
        }
        if (nb2Var.r != this.p) {
            kf2.c();
            return null;
        }
        this.n = mb2Var.q;
        this.o = mb2Var;
        return mb2Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.n != this.q.s;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.r) {
            case 1:
                return b().s;
            default:
                return a();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        mb2 mb2Var = this.o;
        if (mb2Var == null) {
            tb4.a();
            return;
        }
        nb2 nb2Var = this.q;
        nb2Var.c(mb2Var, true);
        this.o = null;
        this.p = nb2Var.r;
    }
}
