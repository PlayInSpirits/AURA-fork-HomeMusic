package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class g71 implements Iterator, x32 {
    public final /* synthetic */ int n;
    public final Iterator o;
    public int p;
    public Object q;
    public final /* synthetic */ aa4 r;

    public g71(tq4 r2) {
        this.n = 1;
        this.r = r2;
        this.o = ((aa4) r2.b).iterator();
        this.p = -1;
    }

    public void a() {
        h71 r0 = (h71) this.r;
    L3:
        Iterator r1 = this.o;
        if (r1.hasNext() == false) goto L9;
        Object r2 = r1.next();
        if (((Boolean) r0.c.invoke(r2)).booleanValue() != r0.b) goto L3;
        this.q = r2;
        this.p = 1;
        return;
    L9:
        this.p = 0;
    }

    public void b() {
        Iterator r0 = this.o;
        if (r0.hasNext() == false) goto L8;
        Object r1 = r0.next();
        if (((Boolean) ((tq4) this.r).c.invoke(r1)).booleanValue() == false) goto L8;
        this.p = 1;
        this.q = r1;
        return;
    L8:
        this.p = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch(this.n) {
            case 0: goto L13;
            default: goto L5;
        };
    L5:
        if (this.p != (-1)) goto L8;
        b();
    L8:
        if (this.p == 1) goto L20;
        return false;
    L20:
        return true;
    L13:
        if (this.p != (-1)) goto L16;
        a();
    L16:
        if (this.p == 1) goto L21;
        return false;
    L21:
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch(this.n) {
            case 0: goto L13;
            default: goto L5;
        };
    L5:
        if (this.p != (-1)) goto L8;
        b();
    L8:
        if (this.p == 0) goto L10;
        Object r0 = this.q;
        this.q = null;
        this.p = -1;
        return r0;
    L10:
        tb4.k();
        return null;
    L13:
        if (this.p != (-1)) goto L16;
        a();
    L16:
        if (this.p == 0) goto L18;
        Object r1 = this.q;
        this.q = null;
        this.p = -1;
        return r1;
    L18:
        tb4.k();
        return null;
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

    public g71(h71 r2) {
        this.n = 0;
        this.r = r2;
        this.o = r2.a.iterator();
        this.p = -1;
    }
}
