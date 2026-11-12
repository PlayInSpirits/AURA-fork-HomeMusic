package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zf3 extends b1 {
    public final xf3 p;
    public int q;
    public wx4 r;
    public int s;

    public zf3(xf3 r2, int r3) {
        super(r3, r2.u);
        this.p = r2;
        this.q = r2.f();
        this.s = -1;
        b();
    }

    public final void a() {
        if (this.q != this.p.f()) goto L5;
        return;
    L5:
        kf2.c();
    }

    @Override // defpackage.b1, java.util.ListIterator
    public final void add(Object r3) {
        a();
        int r0 = this.n;
        xf3 r1 = this.p;
        r1.add(r0, r3);
        this.n++;
        this.o = r1.a();
        this.q = r1.f();
        this.s = -1;
        b();
    }

    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final void b() {
        xf3 r0 = this.p;
        Object[] r1 = r0.s;
        if (r1 != null) goto L6;
        this.r = null;
        return;
    L6:
        int r2 = (r0.u - 1) & (-32);
        int r4 = this.n;
        if (r4 <= r2) goto L9;
        r4 = r2;
    L9:
        int r3 = (r0.q / 5) + 1;
        wx4 r5 = this.r;
        if (r5 != null) goto L13;
        this.r = new wx4(r1, r4, r2, r3);
        return;
    L13:
        r5.n = r4;
        r5.o = r2;
        r5.p = r3;
        if (r5.q.length >= r3) goto L16;
        r5.q = new Object[r3];
    L16:
        ?? r6 = 0;
        r5.q[0] = r1;
        if (r4 != r2) goto L19;
        r6 = 1;
    L19:
        r5.r = r6;
        r5.b(r4 - r6, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        if (hasNext() == false) goto L14;
        int r0 = this.n;
        this.s = r0;
        wx4 r1 = this.r;
        xf3 r2 = this.p;
        if (r1 != null) goto L9;
        Object[] r3 = r2.t;
        this.n = r0 + 1;
        return r3[r0];
    L9:
        if (r1.hasNext() == false) goto L12;
        this.n++;
        return r1.next();
    L12:
        Object[] r4 = r2.t;
        int r5 = this.n;
        this.n = r5 + 1;
        return r4[r5 - r1.o];
    L14:
        tb4.k();
        return null;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        if (hasPrevious() == false) goto L14;
        int r0 = this.n;
        this.s = r0 - 1;
        wx4 r1 = this.r;
        xf3 r2 = this.p;
        if (r1 != null) goto L8;
        Object[] r3 = r2.t;
        int r4 = r0 - 1;
        this.n = r4;
        return r3[r4];
    L8:
        int r5 = r1.o;
        if (r0 <= r5) goto L12;
        Object[] r6 = r2.t;
        int r7 = r0 - 1;
        this.n = r7;
        return r6[r7 - r5];
    L12:
        this.n = r0 - 1;
        return r1.previous();
    L14:
        tb4.k();
        return null;
    }

    @Override // defpackage.b1, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int r0 = this.s;
        if (r0 == (-1)) goto L9;
        xf3 r2 = this.p;
        r2.b(r0);
        int r1 = this.s;
        if (r1 >= this.n) goto L7;
        this.n = r1;
    L7:
        this.o = r2.a();
        this.q = r2.f();
        this.s = -1;
        b();
        return;
    L9:
        tb4.a();
    }

    @Override // defpackage.b1, java.util.ListIterator
    public final void set(Object r3) {
        a();
        int r0 = this.s;
        if (r0 == (-1)) goto L6;
        xf3 r1 = this.p;
        r1.set(r0, r3);
        this.q = r1.f();
        b();
        return;
    L6:
        tb4.a();
    }
}
