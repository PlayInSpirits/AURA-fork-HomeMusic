package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class km implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ xc5 o;
    public final /* synthetic */ bj0 p;

    public /* synthetic */ km(xc5 r1, bj0 r2, int r3) {
        this.n = r3;
        this.o = r1;
        this.p = r2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.n) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        xc5 r0 = this.o;
        bj0 r2 = this.p;
        qm r1 = (qm) r0.p;
        String r3 = f35.a;
        r1.T(r2);
        return;
    L6:
        xc5 r4 = this.o;
        bj0 r5 = this.p;
        monitor-enter(r5);
        monitor-exit(r5);
        qm r6 = (qm) r4.p;
        String r7 = f35.a;
        r6.o(r5);
    }
}
