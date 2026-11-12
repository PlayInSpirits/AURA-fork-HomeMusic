package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wx4 extends b1 {
    public int p;
    public Object[] q;
    public boolean r;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public wx4(Object[] r3, int r4, int r5, int r6) {
        super(r4, r5);
        this.p = r6;
        Object[] r7 = new Object[r6];
        this.q = r7;
        if (r4 != r5) goto L5;
        ?? r8 = 1;
    L6:
        this.r = r8;
        r7[0] = r3;
        b(r4 - r8, 1);
        return;
    L5:
        r8 = 0;
        goto L6
    }

    public final Object a() {
        int r0 = this.n & 31;
        Object r2 = this.q[this.p - 1];
        r2.getClass();
        return ((Object[]) r2)[r0];
    }

    public final void b(int r5, int r6) {
        int r0 = (this.p - r6) * 5;
    L4:
        if (r6 >= this.p) goto L6;
        Object[] r1 = this.q;
        Object r2 = r1[r6 - 1];
        r2.getClass();
        r1[r6] = ((Object[]) r2)[uc5.t(r5, r0)];
        r0 = r0 - 5;
        r6 = r6 + 1;
        goto L4
    }

    public final void c(int r3) {
        int r0 = 0;
    L4:
        if (uc5.t(this.n, r0) != r3) goto L6;
        r0 = r0 + 5;
        goto L4
    L6:
        if (r0 <= 0) goto L10;
        b(this.n, ((this.p - 1) - (r0 / 5)) + 1);
        return;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (hasNext() == false) goto L10;
        Object r0 = a();
        int r1 = this.n + 1;
        this.n = r1;
        if (r1 != this.o) goto L8;
        this.r = true;
        return r0;
    L8:
        c(0);
        return r0;
    L10:
        tb4.k();
        return null;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious() == false) goto L10;
        this.n--;
        if (this.r == false) goto L8;
        this.r = false;
        return a();
    L8:
        c(31);
        return a();
    L10:
        tb4.k();
        return null;
    }
}
