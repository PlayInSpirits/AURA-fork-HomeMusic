package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hn0 implements Comparable {
    public final boolean n;
    public final boolean o;

    public hn0(tb1 r3, int r4) {
        boolean r0 = true;
        if ((r3.e & 1) != 0) goto L6;
        r0 = false;
    L6:
        this.n = r0;
        this.o = kq.n(r4, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object r4) {
        hn0 r5 = (hn0) r4;
        boolean r0 = this.o;
        boolean r1 = r5.o;
        return v60.a.c(r0, r1).c(this.n, r5.n).e();
    }
}
