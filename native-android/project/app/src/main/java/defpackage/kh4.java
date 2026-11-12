package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kh4 extends tl4 {
    public float c;

    public kh4(long j, float f) {
        super(j);
        this.c = f;
    }

    @Override // defpackage.tl4
    public final void a(tl4 tl4Var) {
        tl4Var.getClass();
        this.c = ((kh4) tl4Var).c;
    }

    @Override // defpackage.tl4
    public final tl4 b(long j) {
        return new kh4(j, this.c);
    }
}
