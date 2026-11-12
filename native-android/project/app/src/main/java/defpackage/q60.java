package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class q60 implements Iterator {
    public int n;
    public int o;
    public int p;
    public final /* synthetic */ r60 q;

    public q60(r60 r2) {
        this.q = r2;
        this.n = r2.q;
        if (r2.isEmpty() == false) goto L5;
        int r3 = -1;
    L6:
        this.o = r3;
        this.p = -1;
        return;
    L5:
        r3 = 0;
        goto L6
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.o < 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        r60 r0 = this.q;
        if (r0.q == this.n) goto L5;
        kf2.c();
        return null;
    L5:
        if (hasNext() == false) goto L12;
        int r1 = this.o;
        this.p = r1;
        Object r2 = r0.e()[r1];
        int r3 = this.o + 1;
        if (r3 < r0.r) goto L10;
        r3 = -1;
    L10:
        this.o = r3;
        return r2;
    L12:
        tb4.k();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        r60 r0 = this.q;
        if (r0.q == this.n) goto L5;
        kf2.c();
        return;
    L5:
        if (this.p < 0) goto L7;
        boolean r1 = true;
    L8:
        rr2.v("no calls to next() since the last call to remove()", r1);
        this.n += 32;
        r0.remove(r0.e()[this.p]);
        this.o--;
        this.p = -1;
        return;
    L7:
        r1 = false;
        goto L8
    }
}
