package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m55 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ rf2 o;
    public final /* synthetic */ long p;
    public final /* synthetic */ int q;

    public /* synthetic */ m55(rf2 r2, int r3, long r4) {
        this.n = 0;
        this.o = r2;
        this.q = r3;
        this.p = r4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        int r1 = this.q;
        long r2 = this.p;
        rf2 r4 = this.o;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        o55 r5 = (o55) r4.o;
        String r3 = f35.a;
        r5.i(r1, r2);
        return;
    L6:
        o55 r6 = (o55) r4.o;
        String r7 = f35.a;
        r6.m(r1, r2);
    }

    public /* synthetic */ m55(rf2 r2, long r3, int r5) {
        this.n = 1;
        this.o = r2;
        this.p = r3;
        this.q = r5;
    }
}
