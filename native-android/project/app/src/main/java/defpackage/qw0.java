package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qw0 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ sw0 o;
    public final /* synthetic */ tw0 p;

    public /* synthetic */ qw0(sw0 r1, tw0 r2, int r3) {
        this.n = r3;
        this.o = r1;
        this.p = r2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        tw0 r1 = this.p;
        sw0 r2 = this.o;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        r1.z(r2.a, r2.b);
        return;
    L6:
        r1.M(r2.a, r2.b);
    }
}
