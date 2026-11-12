package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rf3 implements Iterator, x32 {
    public final /* synthetic */ int n;
    public final Iterator o;

    public rf3(lf3 r5) {
        this.n = 0;
        yx4[] r1 = new yx4[8];
        int r2 = 0;
    L3:
        if (r2 >= 8) goto L5;
        r1[r2] = new ay4(this);
        r2 = r2 + 1;
        goto L3
    L5:
        this.o = new pf3(r5, r1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch(this.n) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return this.o.hasNext();
    L7:
        return ((pf3) this.o).p;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch(this.n) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return (d45) this.o.next();
    L7:
        return (Map.Entry) ((pf3) this.o).next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch(this.n) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        ((pf3) this.o).remove();
        return;
    L5:
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public rf3(b45 r2) {
        this.n = 1;
        this.o = r2.w.iterator();
    }
}
