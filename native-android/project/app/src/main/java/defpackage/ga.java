package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ga implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ gf1 o;

    public /* synthetic */ ga(int r1, gf1 r2) {
        this.n = r1;
        this.o = r2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        gf1 r1 = this.o;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        r1.invoke();
        return;
    L6:
        r1.invoke();
    }
}
