package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class a92 extends sk4 {
    public final vd0 s;

    public a92(ne0 ne0Var, wf1 wf1Var) {
        super(ne0Var, false);
        this.s = ya4.i(this, this, wf1Var);
    }

    @Override // defpackage.a32
    public final void Y() {
        try {
            uc5.T(ya4.x(this.s), j15.a);
        } catch (Throwable th) {
            resumeWith(new s14(th));
            throw th;
        }
    }
}
