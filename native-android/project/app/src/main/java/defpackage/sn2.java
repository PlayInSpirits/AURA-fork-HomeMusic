package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sn2 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ tn2 o;
    public final /* synthetic */ mw1 p;
    public final /* synthetic */ fr2 q;

    public /* synthetic */ sn2(tn2 r1, mw1 r2, fr2 r3, int r4) {
        this.n = r4;
        this.o = r1;
        this.p = r2;
        this.q = r3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        fr2 r1 = this.q;
        mw1 r2 = this.p;
        tn2 r3 = this.o;
        r3.getClass();
        switch(r0) {
            case 0: goto L8;
            default: goto L4;
        };
    L4:
        m92 r4 = (m92) tn2.E(r2);
        if (r4 == null) goto L12;
        r3.n(r1, r4);
        return;
    L12:
        return;
    L8:
        m92 r5 = (m92) tn2.E(r2);
        if (r5 == null) goto L13;
        r3.n(r1, r5);
        return;
    }
}
