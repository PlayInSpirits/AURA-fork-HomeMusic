package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lo0 implements Iterator, x32 {
    public int n;
    public int o;
    public int p;
    public j02 q;
    public int r;
    public final /* synthetic */ mo0 s;

    public lo0(mo0 r2) {
        this.s = r2;
        this.n = -1;
        int r3 = gb.m(0, 0, r2.a.length());
        this.o = r3;
        this.p = r3;
    }

    public final void a() {
        mo0 r0 = this.s;
        CharSequence r1 = r0.a;
        int r2 = this.p;
        int r3 = 0;
        if (r2 >= 0) goto L6;
        this.n = 0;
        this.q = null;
        return;
    L6:
        int r4 = r0.b;
        if (r4 <= 0) goto L11;
        int r7 = this.r + 1;
        this.r = r7;
        if (r7 < r4) goto L11;
    L12:
        int r5 = this.o;
        r1.getClass();
        this.q = new j02(r5, r1.length() - 1, 1);
        this.p = -1;
    L20:
        this.n = 1;
        return;
    L11:
        if (r2 > r1.length()) goto L12;
        kd3 r6 = (kd3) r0.c.invoke(r1, Integer.valueOf(this.p));
        if (r6 != null) goto L16;
        int r8 = this.o;
        r1.getClass();
        this.q = new j02(r8, r1.length() - 1, 1);
        this.p = -1;
        goto L20
    L16:
        int r9 = ((Number) r6.n).intValue();
        int r10 = ((Number) r6.o).intValue();
        this.q = gb.g0(this.o, r9);
        int r11 = r9 + r10;
        this.o = r11;
        if (r10 != 0) goto L19;
        r3 = 1;
    L19:
        this.p = r11 + r3;
        goto L20
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.n != (-1)) goto L6;
        a();
    L6:
        if (this.n != 1) goto L8;
        return true;
    L8:
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.n != (-1)) goto L6;
        a();
    L6:
        if (this.n == 0) goto L9;
        j02 r0 = this.q;
        r0.getClass();
        this.q = null;
        this.n = -1;
        return r0;
    L9:
        tb4.k();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
