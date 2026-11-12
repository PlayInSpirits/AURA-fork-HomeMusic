package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lh4 extends tl4 {
    public int c;

    public lh4(int r1, long r2) {
        super(r2);
        this.c = r1;
    }

    @Override // defpackage.tl4
    public final void a(tl4 r1) {
        r1.getClass();
        this.c = ((lh4) r1).c;
    }

    @Override // defpackage.tl4
    public final tl4 b(long r2) {
        return new lh4(this.c, r2);
    }
}
