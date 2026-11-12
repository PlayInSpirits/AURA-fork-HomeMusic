package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fu3 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ gu3 o;

    public /* synthetic */ fu3(gu3 r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        gu3 r1 = this.o;
        switch(r0) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        r1.f.k(Boolean.TRUE);
        return;
    L6:
        r1.f.k(Boolean.TRUE);
        return;
    L8:
        r1.f.k(Boolean.TRUE);
    }
}
