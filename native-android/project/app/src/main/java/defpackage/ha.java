package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ha implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;

    public /* synthetic */ ha(int r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // defpackage.if1
    public final Object invoke(Object r2) {
        int r0 = this.n;
        int r1 = this.o;
        ba1 r3 = (ba1) r2;
        switch(r0) {
            case 0: goto L8;
            case 1: goto L7;
            default: goto L4;
        };
    L4:
        boolean r4 = r3.y0(r1);
    L6:
        return Boolean.valueOf(r4);
    L7:
        r4 = r3.y0(r1);
        goto L6
    L8:
        r4 = r3.y0(r1);
        goto L6
    }
}
