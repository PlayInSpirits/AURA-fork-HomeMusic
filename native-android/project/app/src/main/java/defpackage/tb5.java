package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tb5 extends sb5 {
    @Override // defpackage.sb5, defpackage.su3
    public final void C(boolean z) {
        this.g.setSystemBarsAppearance(z ? 16 : 0, 16);
    }

    @Override // defpackage.sb5, defpackage.su3
    public final void D(boolean z) {
        this.g.setSystemBarsAppearance(z ? 8 : 0, 8);
    }

    @Override // defpackage.sb5, defpackage.su3
    public final void E(int i) {
        this.g.setSystemBarsBehavior(i);
    }

    @Override // defpackage.sb5, defpackage.su3
    public final boolean y() {
        return (this.g.getSystemBarsAppearance() & 8) != 0;
    }
}
