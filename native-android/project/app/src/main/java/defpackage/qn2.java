package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qn2 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ tn2 o;
    public final /* synthetic */ mw1 p;
    public final /* synthetic */ fr2 q;
    public final /* synthetic */ int r;

    public /* synthetic */ qn2(tn2 r1, mw1 r2, fr2 r3, int r4, int r5) {
        this.n = r5;
        this.o = r1;
        this.p = r2;
        this.q = r3;
        this.r = r4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        int r1 = this.r;
        fr2 r2 = this.q;
        mw1 r3 = this.p;
        tn2 r4 = this.o;
        r4.getClass();
        switch(r0) {
            case 0: goto L8;
            default: goto L4;
        };
    L4:
        m92 r5 = (m92) tn2.E(r3);
        if (r5 == null) goto L12;
        r4.n(r2, r5);
        tn2.G(r1, r5);
        return;
    L12:
        return;
    L8:
        m92 r6 = (m92) tn2.E(r3);
        if (r6 == null) goto L13;
        r4.n(r2, r6);
        tn2.G(r1, r6);
        return;
    }
}
