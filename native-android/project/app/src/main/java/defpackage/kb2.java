package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kb2 implements Iterator {
    public mb2 n;
    public mb2 o;
    public int p;
    public final /* synthetic */ nb2 q;
    public final /* synthetic */ int r;

    public kb2(nb2 r1, int r2) {
        this.r = r2;
        this.q = r1;
        this.n = r1.s.q;
        this.o = null;
        this.p = r1.r;
    }

    public final Object a() {
        return b();
    }

    public final mb2 b() {
        mb2 r0 = this.n;
        nb2 r1 = this.q;
        if (r0 != r1.s) goto L5;
        tb4.k();
        return null;
    L5:
        if (r1.r != this.p) goto L8;
        this.n = r0.q;
        this.o = r0;
        return r0;
    L8:
        kf2.c();
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.n == this.q.s) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch(this.r) {
            case 1: goto L7;
            default: goto L5;
        };
    L5:
        return a();
    L7:
        return b().s;
    }

    @Override // java.util.Iterator
    public final void remove() {
        mb2 r0 = this.o;
        if (r0 == null) goto L6;
        nb2 r2 = this.q;
        r2.c(r0, true);
        this.o = null;
        this.p = r2.r;
        return;
    L6:
        tb4.a();
    }
}
