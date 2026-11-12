package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class es2 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ ls2 o;

    public /* synthetic */ es2(ls2 r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        ls2 r3 = this.o;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        f35.W(r3.g.l, new es2(r3, 0));
        return;
    L6:
        r3.O();
    }
}
