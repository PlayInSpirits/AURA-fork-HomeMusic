package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xf2 extends zf2 implements Iterator, x32 {
    public final /* synthetic */ int r;

    public xf2(ag2 r1, int r2) {
        this.r = r2;
        r1.getClass();
        this.q = r1;
        this.o = -1;
        this.p = r1.u;
        e();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch(this.r) {
            case 0: goto L14;
            case 1: goto L9;
            default: goto L4;
        };
    L4:
        b();
        int r0 = this.n;
        ag2 r2 = (ag2) this.q;
        if (r0 >= r2.s) goto L7;
        this.n = r0 + 1;
        this.o = r0;
        Object[] r1 = r2.o;
        r1.getClass();
        Object r3 = r1[this.o];
        e();
        return r3;
    L7:
        tb4.k();
        return null;
    L9:
        b();
        int r4 = this.n;
        ag2 r5 = (ag2) this.q;
        if (r4 >= r5.s) goto L12;
        this.n = r4 + 1;
        this.o = r4;
        Object r6 = r5.n[r4];
        e();
        return r6;
    L12:
        tb4.k();
        return null;
    L14:
        b();
        int r7 = this.n;
        ag2 r8 = (ag2) this.q;
        if (r7 >= r8.s) goto L17;
        this.n = r7 + 1;
        this.o = r7;
        yf2 r9 = new yf2(r8, r7);
        e();
        return r9;
    L17:
        tb4.k();
        return null;
    }
}
