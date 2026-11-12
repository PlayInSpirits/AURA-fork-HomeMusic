package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class x84 implements Comparable {
    public final long n;
    public final ii0 o;

    public x84(long r1, ii0 r3) {
        this.n = r1;
        this.o = r3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object r3) {
        return Long.compare(this.n, ((x84) r3).n);
    }
}
