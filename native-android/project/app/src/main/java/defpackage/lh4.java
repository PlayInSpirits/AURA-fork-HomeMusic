package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lh4 extends tl4 {
    public int c;

    public lh4(int i, long j) {
        super(j);
        this.c = i;
    }

    @Override // defpackage.tl4
    public final void a(tl4 tl4Var) {
        tl4Var.getClass();
        this.c = ((lh4) tl4Var).c;
    }

    @Override // defpackage.tl4
    public final tl4 b(long j) {
        return new lh4(this.c, j);
    }
}
