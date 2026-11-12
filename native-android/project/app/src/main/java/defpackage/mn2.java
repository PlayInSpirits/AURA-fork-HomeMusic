package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mn2 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ lb4 o;
    public final /* synthetic */ ic2 p;

    public /* synthetic */ mn2(lb4 r1, ic2 r2, int r3) {
        this.n = r3;
        this.o = r1;
        this.p = r2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.n) {
            case 0: goto L8;
            default: goto L4;
        };
    L4:
        lb4 r0 = this.o;
        ic2 r2 = this.p;
        if ((r0.n instanceof f0) == false) goto L12;
        r2.cancel(false);
        return;
    L12:
        return;
    L8:
        lb4 r1 = this.o;
        ic2 r3 = this.p;
        if ((r1.n instanceof f0) == false) goto L13;
        r3.cancel(false);
        return;
    }
}
