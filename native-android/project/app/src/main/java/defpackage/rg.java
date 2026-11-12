package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rg extends vb1 {
    public final /* synthetic */ yg w;
    public final /* synthetic */ bh x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rg(bh bhVar, bh bhVar2, yg ygVar) {
        super(bhVar2);
        this.x = bhVar;
        this.w = ygVar;
    }

    @Override // defpackage.vb1
    public final nd4 b() {
        return this.w;
    }

    @Override // defpackage.vb1
    public final boolean c() {
        bh bhVar = this.x;
        if (bhVar.getInternalPopup().b()) {
            return true;
        }
        bhVar.s.n(bhVar.getTextDirection(), bhVar.getTextAlignment());
        return true;
    }
}
