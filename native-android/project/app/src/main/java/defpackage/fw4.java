package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fw4 {
    public final long a;
    public final long b;
    public final boolean c;

    public fw4(long j, long j2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    public final fw4 a(fw4 fw4Var) {
        return new fw4(g83.e(this.a, fw4Var.a), Math.max(this.b, fw4Var.b), this.c || fw4Var.c);
    }
}
