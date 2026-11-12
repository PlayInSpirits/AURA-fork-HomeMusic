package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class u95 implements Comparable {
    public final int n;
    public final q95 o;

    public u95(int r1, q95 r2) {
        this.n = r1;
        this.o = r2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object r1) {
        return Integer.compare(this.n, ((u95) r1).n);
    }
}
