package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ki implements Iterator, x32 {
    public int n;
    public int o;
    public boolean p;
    public final /* synthetic */ int q;
    public final /* synthetic */ Object r;

    public ki(oi r1, int r2) {
        this.q = r2;
        switch(r2) {
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        this.r = r1;
        this(r1.p);
        return;
    L6:
        this.r = r1;
        this(r1.p);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.o >= this.n) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext() == false) goto L11;
        int r0 = this.o;
        int r1 = this.q;
        Object r2 = this.r;
        switch(r1) {
            case 0: goto L8;
            case 1: goto L7;
            default: goto L6;
        };
    L6:
        Object r3 = ((qi) r2).o[r0];
    L9:
        this.o++;
        this.p = true;
        return r3;
    L7:
        r3 = ((oi) r2).j(r0);
        goto L9
    L8:
        r3 = ((oi) r2).f(r0);
        goto L9
    L11:
        tb4.k();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.p == false) goto L11;
        int r0 = this.o - 1;
        this.o = r0;
        int r1 = this.q;
        Object r2 = this.r;
        switch(r1) {
            case 0: goto L8;
            case 1: goto L7;
            default: goto L6;
        };
    L6:
        ((qi) r2).a(r0);
    L9:
        this.n--;
        this.p = false;
        return;
    L7:
        ((oi) r2).h(r0);
        goto L9
    L8:
        ((oi) r2).h(r0);
        goto L9
    L11:
        kf2.o("Call next() before removing an element.");
    }

    public ki(qi r2) {
        this.q = 2;
        this.r = r2;
        this(r2.p);
    }

    public ki(int r1) {
        this.n = r1;
    }
}
