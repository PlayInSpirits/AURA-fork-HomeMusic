package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class i21 extends j21 {
    public final gu4 p;

    public i21(long j, gu4 gu4Var) {
        super(j);
        this.p = gu4Var;
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
