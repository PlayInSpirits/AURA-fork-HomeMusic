package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rg extends vb1 {
    public final /* synthetic */ yg w;
    public final /* synthetic */ bh x;

    public rg(bh r1, bh r2, yg r3) {
        this.x = r1;
        this.w = r3;
        super(r2);
    }

    @Override // defpackage.vb1
    public final nd4 b() {
        return this.w;
    }

    @Override // defpackage.vb1
    public final boolean c() {
        bh r2 = this.x;
        if (r2.getInternalPopup().b() == true) goto L7;
        r2.s.n(r2.getTextDirection(), r2.getTextAlignment());
        return true;
    L7:
        return true;
    }
}
