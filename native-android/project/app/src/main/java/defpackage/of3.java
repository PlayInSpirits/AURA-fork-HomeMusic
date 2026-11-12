package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class of3 implements Iterator, x32 {
    public final yx4[] n;
    public int o;
    public boolean p;

    public of3(xx4 r3, yx4[] r4) {
        this.n = r4;
        this.p = true;
        r4[0].a(r3.d, Integer.bitCount(r3.a) * 2, 0);
        this.o = 0;
        a();
    }

    public final void a() {
        int r0 = this.o;
        yx4[] r1 = this.n;
        yx4 r2 = r1[r0];
        if (r2.p >= r2.o) goto L6;
        return;
    L6:
        if ((-1) >= r0) goto L18;
        int r4 = b(r0);
        if (r4 != (-1)) goto L12;
        yx4 r5 = r1[r0];
        int r6 = r5.p;
        Object[] r7 = r5.n;
        if (r6 >= r7.length) goto L12;
        int r8 = r7.length;
        r5.p = r6 + 1;
        r4 = b(r0);
    L12:
        if (r4 != (-1)) goto L13;
        if (r0 <= 0) goto L17;
        yx4 r3 = r1[r0 - 1];
        int r9 = r3.p;
        int r10 = r3.n.length;
        r3.p = r9 + 1;
    L17:
        r1[r0].a(xx4.e.d, 0, 0);
        r0 = r0 - 1;
        goto L6
    L13:
        this.o = r4;
        return;
    L18:
        this.p = false;
    }

    public final int b(int r5) {
        yx4[] r0 = this.n;
        yx4 r1 = r0[r5];
        int r2 = r1.p;
        if (r2 >= r1.o) goto L5;
        return r5;
    L5:
        Object[] r3 = r1.n;
        if (r2 >= r3.length) goto L13;
        int r4 = r3.length;
        Object r6 = r3[r2];
        r6.getClass();
        xx4 r7 = (xx4) r6;
        if (r5 != 6) goto L10;
        yx4 r8 = r0[r5 + 1];
        Object[] r9 = r7.d;
        r8.a(r9, r9.length, 0);
    L12:
        return b(r5 + 1);
    L10:
        r0[r5 + 1].a(r7.d, Integer.bitCount(r7.a) * 2, 0);
        goto L12
    L13:
        return -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.p;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (this.p == false) goto L6;
        Object r0 = this.n[this.o].next();
        a();
        return r0;
    L6:
        tb4.k();
        return null;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
