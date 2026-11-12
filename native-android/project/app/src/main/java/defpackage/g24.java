package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g24 implements ks0 {
    public final /* synthetic */ int n;
    public final /* synthetic */ k24 o;

    public /* synthetic */ g24(k24 r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // defpackage.ks0
    public final double b(double r9) {
        int r0 = this.n;
        k24 r8 = this.o;
        switch(r0) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return r8.n.b(gb.k(r9, r8.e, r8.f));
    L7:
        return gb.k(r8.k.b(r9), r8.e, r8.f);
    }
}
