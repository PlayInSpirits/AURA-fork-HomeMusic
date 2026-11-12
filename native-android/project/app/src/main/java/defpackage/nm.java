package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nm implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ xc5 o;
    public final /* synthetic */ pa p;

    public /* synthetic */ nm(xc5 r1, pa r2, int r3) {
        this.n = r3;
        this.o = r1;
        this.p = r2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        pa r1 = this.p;
        xc5 r2 = this.o;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        qm r3 = (qm) r2.p;
        String r4 = f35.a;
        r3.j(r1);
        return;
    L6:
        qm r5 = (qm) r2.p;
        String r6 = f35.a;
        r5.f(r1);
    }
}
