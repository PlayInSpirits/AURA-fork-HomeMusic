package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dd2 {
    public final int a;
    public final long b;

    public dd2(int i, long j) {
        rr2.l(j >= 0);
        this.a = i;
        this.b = j;
    }

    public static dd2 a(l51 l51Var, be3 be3Var) {
        l51Var.n(be3Var.a, 0, 8);
        be3Var.N(0);
        return new dd2(be3Var.m(), be3Var.r(), false);
    }

    public /* synthetic */ dd2(int i, long j, boolean z) {
        this.a = i;
        this.b = j;
    }
}
