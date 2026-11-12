package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gn0 extends nn0 implements Comparable {
    public final int r;
    public final int s;

    public gn0(int i, sv4 sv4Var, int i2, jn0 jn0Var, int i3) {
        int i4;
        super(i, sv4Var, i2);
        this.r = kq.n(i3, jn0Var.B0) ? 1 : 0;
        tb1 tb1Var = this.q;
        int i5 = tb1Var.u;
        int i6 = -1;
        if (i5 != -1 && (i4 = tb1Var.v) != -1) {
            i6 = i5 * i4;
        }
        this.s = i6;
    }

    @Override // defpackage.nn0
    public final int a() {
        return this.r;
    }

    @Override // defpackage.nn0
    public final /* bridge */ /* synthetic */ boolean b(nn0 nn0Var) {
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.s, ((gn0) obj).s);
    }
}
