package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class hn0 implements Comparable {
    public final boolean n;
    public final boolean o;

    public hn0(tb1 tb1Var, int i) {
        this.n = (tb1Var.e & 1) != 0;
        this.o = kq.n(i, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        hn0 hn0Var = (hn0) obj;
        return v60.a.c(this.o, hn0Var.o).c(this.n, hn0Var.n).e();
    }
}
