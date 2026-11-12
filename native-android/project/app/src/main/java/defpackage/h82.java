package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h82 implements gf1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ lm0 o;

    public /* synthetic */ h82(lm0 r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // defpackage.gf1
    public final Object invoke() {
        int r0 = this.n;
        lm0 r1 = this.o;
        switch(r0) {
            case 0: goto L9;
            case 1: goto L7;
            default: goto L5;
        };
    L5:
        return Boolean.valueOf(r1.k.a());
    L7:
        return Integer.valueOf(r1.n());
    L9:
        return Integer.valueOf(r1.n());
    }
}
