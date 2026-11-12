package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class em3 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ im3 o;
    public final /* synthetic */ String p;

    public /* synthetic */ em3(im3 r1, String r2, int r3) {
        this.n = r3;
        this.o = r1;
        this.p = r2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        String r1 = this.p;
        im3 r2 = this.o;
        switch(r0) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        r2.g(r1);
        return;
    L6:
        r2.g(r1);
        return;
    L8:
        r2.g(r1);
    }
}
