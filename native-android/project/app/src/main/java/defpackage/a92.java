package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class a92 extends sk4 {
    public final vd0 s;

    public a92(ne0 r2, wf1 r3) {
        super(r2, false);
        this.s = ya4.i(this, this, r3);
    }

    @Override // defpackage.a32
    public final void Y() {
        uc5.T(ya4.x(this.s), j15.a);     // Catch: Throwable -> L5
        return;
    L5:
        th = move-exception;
        resumeWith(new s14(th));
        throw th;
    }
}
