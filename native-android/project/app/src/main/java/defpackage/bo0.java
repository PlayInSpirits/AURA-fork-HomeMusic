package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bo0 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ co0 o;

    public /* synthetic */ bo0(co0 r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        co0 r1 = this.o;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        co0.c(r1);
        return;
    L6:
        co0.b(r1);
    }
}
