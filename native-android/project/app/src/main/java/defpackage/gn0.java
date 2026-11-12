package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gn0 extends nn0 implements Comparable {
    public final int r;
    public final int s;

    public gn0(int r1, sv4 r2, int r3, jn0 r4, int r5) {
        super(r1, r2, r3);
        this.r = kq.n(r5, r4.B0) ? 1 : 0;
        tb1 r6 = this.q;
        int r7 = r6.u;
        int r8 = -1;
        if (r7 == (-1)) goto L8;
        int r9 = r6.v;
        if (r9 == (-1)) goto L8;
        r8 = r7 * r9;
    L8:
        this.s = r8;
    }

    @Override // defpackage.nn0
    public final int a() {
        return this.r;
    }

    @Override // defpackage.nn0
    public final /* bridge */ /* synthetic */ boolean b(nn0 r1) {
        gn0 r2 = (gn0) r1;
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object r1) {
        return Integer.compare(this.s, ((gn0) r1).s);
    }
}
