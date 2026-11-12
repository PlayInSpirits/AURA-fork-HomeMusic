package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class pf3 extends of3 {
    public final lf3 q;
    public Object r;
    public boolean s;
    public int t;

    public pf3(lf3 r2, yx4[] r3) {
        super(r2.o, r3);
        this.q = r2;
        this.t = r2.q;
    }

    public final void c(int r6, xx4 r7, Object r8, int r9) {
        int r0 = r9 * 5;
        yx4[] r2 = this.n;
        if (r0 <= 30) goto L10;
        yx4 r10 = r2[r9];
        Object[] r11 = r7.d;
        r10.a(r11, r11.length, 0);
    L5:
        yx4 r12 = r2[r9];
        if (h12.c(r12.n[r12.p], r8) == true) goto L8;
        r2[r9].p += 2;
        goto L5
    L8:
        this.o = r9;
        return;
    L10:
        int r1 = 1 << si0.A(r6, r0);
        if (r7.h(r1) == false) goto L14;
        r2[r9].a(r7.d, Integer.bitCount(r7.a) * 2, r7.f(r1));
        this.o = r9;
        return;
    L14:
        int r3 = r7.t(r1);
        xx4 r4 = r7.s(r3);
        r2[r9].a(r7.d, Integer.bitCount(r7.a) * 2, r3);
        c(r6, r4, r8, r9 + 1);
    }

    @Override // defpackage.of3, java.util.Iterator
    public final Object next() {
        if (this.q.q == this.t) goto L5;
        kf2.c();
        return null;
    L5:
        if (this.p == false) goto L8;
        yx4 r0 = this.n[this.o];
        this.r = r0.n[r0.p];
        this.s = true;
        return super.next();
    L8:
        tb4.k();
        return null;
    }

    @Override // defpackage.of3, java.util.Iterator
    public final void remove() {
        if (this.s == false) goto L17;
        boolean r0 = this.p;
        lf3 r2 = this.q;
        if (r0 == false) goto L14;
        if (r0 == false) goto L12;
        yx4 r1 = this.n[this.o];
        Object r3 = r1.n[r1.p];
        jz4.f(r2).remove(this.r);
        if (r3 == null) goto L10;
        int r4 = r3.hashCode();
    L11:
        c(r4, r2.o, r3, 0);
    L15:
        this.r = null;
        this.s = false;
        this.t = r2.q;
        return;
    L10:
        r4 = 0;
        goto L11
    L12:
        tb4.k();
        return;
    L14:
        jz4.f(r2).remove(this.r);
        goto L15
    L17:
        tb4.a();
    }
}
