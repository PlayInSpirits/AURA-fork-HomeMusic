package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class i21 extends j21 {
    public final gu4 p;

    public i21(long r1, gu4 r3) {
        super(r1);
        this.p = r3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.p.run();
    }

    @Override // defpackage.j21
    public final String toString() {
        return super.toString() + this.p;
    }
}
