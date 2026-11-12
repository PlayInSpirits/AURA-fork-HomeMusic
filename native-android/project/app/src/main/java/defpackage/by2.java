package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class by2 implements gf1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ y00 o;

    public /* synthetic */ by2(y00 r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // defpackage.gf1
    public final Object invoke() {
        int r0 = this.n;
        y00 r1 = this.o;
        switch(r0) {
            case 0: goto L10;
            default: goto L4;
        };
    L4:
        Object r2 = r1.g();
        if ((r2 instanceof i10) == false) goto L9;
        r2 = null;
    L9:
        return (fw4) r2;
    L10:
        Object r3 = r1.g();
        if ((r3 instanceof i10) == false) goto L15;
        r3 = null;
    L15:
        return (cy2) r3;
    }
}
