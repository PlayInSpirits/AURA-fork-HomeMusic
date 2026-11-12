package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ds2 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ ls2 o;
    public final /* synthetic */ al3 p;

    public /* synthetic */ ds2(ls2 r1, al3 r2, int r3) {
        this.n = r3;
        this.o = r1;
        this.p = r2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        al3 r1 = this.p;
        ls2 r3 = this.o;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        r3.m.v(r3.H(r1));
        return;
    L6:
        r3.m.v(r3.H(r1));
        lr0 r4 = r3.i;
        if (r1.o().a(17) == false) goto L9;
        cu4 r2 = r1.x0();
    L10:
        r4.y(r2);
        return;
    L9:
        r2 = cu4.a;
        goto L10
    }
}
