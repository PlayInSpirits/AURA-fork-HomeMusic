package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n55 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ rf2 o;
    public final /* synthetic */ bj0 p;

    public /* synthetic */ n55(rf2 r1, bj0 r2, int r3) {
        this.n = r3;
        this.o = r1;
        this.p = r2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.n) {
            case 0: goto L9;
            default: goto L4;
        };
    L4:
        rf2 r0 = this.o;
        bj0 r2 = this.p;
        monitor-enter(r2);
        monitor-exit(r2);
        o55 r1 = (o55) r0.o;
        String r3 = f35.a;
        r1.k(r2);
        return;
    L9:
        rf2 r4 = this.o;
        bj0 r5 = this.p;
        o55 r6 = (o55) r4.o;
        String r7 = f35.a;
        r6.l(r5);
    }
}
