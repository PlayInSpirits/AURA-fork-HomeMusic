package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sl2 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ bm2 o;

    public /* synthetic */ sl2(bm2 r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        bm2 r2 = this.o;
        switch(r0) {
            case 0: goto L8;
            default: goto L4;
        };
    L4:
        lk3 r1 = r2.H;
        if (r1 == null) goto L13;
        r2.o1(r1, jk3.c);
        return;
    L13:
        return;
    L8:
        yl2 r3 = r2.o;
        if (r3 == null) goto L11;
        r2.d.unbindService(r3);
        r2.o = null;
    L11:
        r2.c.e.clear();
    }
}
