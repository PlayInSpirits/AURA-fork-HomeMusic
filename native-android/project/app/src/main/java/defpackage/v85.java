package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v85 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ Object q;

    public /* synthetic */ v85(Object r1, boolean r2, boolean r3, int r4) {
        this.n = r4;
        this.q = r1;
        this.o = r2;
        this.p = r3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        boolean r1 = this.p;
        boolean r2 = this.o;
        y10 r3 = (y10) this.q;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ((rf2) r3.d).n(r2, r1);
        return;
    L6:
        xc5.l((xc5) r3.d, r2, r1);
    }
}
