package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ck0 extends cx2 implements rv0 {
    public final rm2 B;
    public boolean C;
    public boolean D;
    public boolean E;

    public ck0(rm2 r1) {
        this.B = r1;
    }

    @Override // defpackage.rv0
    public final void S(e72 r9) {
        r9.a();
        mz r2 = r9.n;
        if (this.C == false) goto L7;
        sv0.l(r9, x40.b(x40.b, 0.3f), r2.P(), 122);
        return;
    L7:
        if (this.D == false) goto L9;
    L12:
        sv0.l(r9, x40.b(x40.b, 0.1f), r2.P(), 122);
        return;
    L9:
        if (this.E == true) goto L12;
    }

    @Override // defpackage.cx2
    public final void i0() {
        vd0 r3 = null;
        fu.G(e0(), null, null, new ac0(this, r3, 1), 3);
    }
}
