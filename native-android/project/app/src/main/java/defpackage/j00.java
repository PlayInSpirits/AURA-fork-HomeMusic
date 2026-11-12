package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class j00 extends vn4 implements Comparable {
    public long y;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        j00 j00Var = (j00) obj;
        if (d(4) != j00Var.d(4)) {
            return d(4) ? 1 : -1;
        }
        long j = this.t - j00Var.t;
        if (j == 0) {
            j = this.y - j00Var.y;
            if (j == 0) {
                return 0;
            }
        }
        return j > 0 ? 1 : -1;
    }
}
