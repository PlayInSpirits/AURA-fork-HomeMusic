package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vv extends b1 {
    public final /* synthetic */ int p;
    public final Object q;

    public vv(Object[] r2, int r3, int r4) {
        this.p = 0;
        super(r3, r4);
        this.q = r2;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int r0 = this.p;
        Object r2 = this.q;
        switch(r0) {
            case 0: goto L10;
            default: goto L5;
        };
    L5:
        if (hasNext() == false) goto L7;
        this.n++;
        return r2;
    L7:
        tb4.k();
        return null;
    L10:
        if (hasNext() == false) goto L12;
        int r1 = this.n;
        this.n = r1 + 1;
        return ((Object[]) r2)[r1];
    L12:
        tb4.k();
        return null;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int r0 = this.p;
        Object r2 = this.q;
        switch(r0) {
            case 0: goto L10;
            default: goto L5;
        };
    L5:
        if (hasPrevious() == false) goto L7;
        this.n--;
        return r2;
    L7:
        tb4.k();
        return null;
    L10:
        if (hasPrevious() == false) goto L12;
        int r1 = this.n - 1;
        this.n = r1;
        return ((Object[]) r2)[r1];
    L12:
        tb4.k();
        return null;
    }

    public vv(int r2, Object r3) {
        this.p = 1;
        super(r2, 1);
        this.q = r3;
    }
}
