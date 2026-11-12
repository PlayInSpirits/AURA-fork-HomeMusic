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

    public m60(p60 r1, int r2) {
        this.r = r2;
        this.s = r1;
        this.q = r1;
        this.n = r1.r;
        if (r1.isEmpty() == false) goto L5;
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
        p60 r0 = this.q;
        if (r0.r == this.n) goto L5;
        kf2.c();
        return null;
    L5:
        if (hasNext() == false) goto L17;
        int r1 = this.o;
        this.p = r1;
        int r2 = this.r;
        p60 r3 = this.s;
        switch(r2) {
            case 0: goto L10;
            case 1: goto L9;
            default: goto L8;
        };
    L8:
        Object r4 = r3.k()[r1];
    L11:
        int r5 = this.o + 1;
        if (r5 < r0.s) goto L15;
        r5 = -1;
    L15:
        this.o = r5;
        return r4;
    L9:
        r4 = new o60(r3, r1);
        goto L11
    L10:
        r4 = r3.j()[r1];
        goto L11
    L17:
        tb4.k();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        p60 r0 = this.q;
        if (r0.r == this.n) goto L5;
        kf2.c();
        return;
    L5:
        if (this.p < 0) goto L7;
        boolean r1 = true;
    L8:
        rr2.v("no calls to next() since the last call to remove()", r1);
        this.n += 32;
        r0.remove(r0.j()[this.p]);
        this.o--;
        this.p = -1;
        return;
    L7:
        r1 = false;
        goto L8
    }
}
