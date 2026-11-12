package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ex0 implements Iterator, x32 {
    public final /* synthetic */ int n;
    public int o;
    public final Iterator p;

    public ex0(fx0 r1, byte r2) {
        this.n = 1;
        this.o = r1.c;
        this.p = r1.b.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int r0 = this.n;
        Iterator r1 = this.p;
        switch(r0) {
            case 0: goto L12;
            default: goto L5;
        };
    L5:
        if (this.o > 0) goto L7;
    L9:
        return false;
    L7:
        if (r1.hasNext() == false) goto L9;
        return true;
    L12:
        if (this.o <= 0) goto L17;
        if (r1.hasNext() == false) goto L17;
        r1.next();
        this.o--;
    L17:
        return r1.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int r0 = this.n;
        Iterator r1 = this.p;
        switch(r0) {
            case 0: goto L10;
            default: goto L4;
        };
    L4:
        int r2 = this.o;
        if (r2 == 0) goto L7;
        this.o = r2 - 1;
        return r1.next();
    L7:
        tb4.k();
        return null;
    L10:
        if (this.o <= 0) goto L15;
        if (r1.hasNext() == false) goto L15;
        r1.next();
        this.o--;
    L15:
        return r1.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch(this.n) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    L7:
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public ex0(fx0 r2) {
        this.n = 0;
        this.p = r2.b.iterator();
        this.o = r2.c;
    }
}
