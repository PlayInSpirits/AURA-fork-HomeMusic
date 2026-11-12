package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yf3 extends b1 {
    public final Object[] p;
    public final wx4 q;

    public yf3(int r1, int r2, int r3, Object[] r4, Object[] r5) {
        super(r1, r2);
        this.p = r5;
        int r6 = (r2 - 1) & (-32);
        if (r1 <= r6) goto L5;
        r1 = r6;
    L5:
        this.q = new wx4(r4, r1, r6, r3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (hasNext() == false) goto L10;
        wx4 r0 = this.q;
        if (r0.hasNext() == false) goto L8;
        this.n++;
        return r0.next();
    L8:
        int r1 = this.n;
        this.n = r1 + 1;
        return this.p[r1 - r0.o];
    L10:
        tb4.k();
        return null;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious() == false) goto L10;
        int r0 = this.n;
        wx4 r1 = this.q;
        int r2 = r1.o;
        if (r0 <= r2) goto L8;
        int r3 = r0 - 1;
        this.n = r3;
        return this.p[r3 - r2];
    L8:
        this.n = r0 - 1;
        return r1.previous();
    L10:
        tb4.k();
        return null;
    }
}
