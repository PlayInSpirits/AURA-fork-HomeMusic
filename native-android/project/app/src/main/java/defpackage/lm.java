package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lm implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;
    public final /* synthetic */ long p;
    public final /* synthetic */ long q;
    public final /* synthetic */ Object r;

    public /* synthetic */ lm(Object r1, int r2, long r3, long r5, int r7) {
        this.n = r7;
        this.r = r1;
        this.o = r2;
        this.p = r3;
        this.q = r5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        Object r1 = this.r;
        switch(r0) {
            case 0: goto L10;
            default: goto L4;
        };
    L4:
        nj0 r2 = ((bp) r1).b;
        ml3 r3 = r2.q;
        if (((yw1) r3.b).isEmpty() == false) goto L7;
        mt2 r4 = null;
    L8:
        q9 r5 = r2.X(r4);
        r2.b0(r5, 1006, new lj0(r5, this.o, this.p, this.q));
        return;
    L7:
        r4 = (mt2) te5.w((yw1) r3.b);
        goto L8
    L10:
        qm r6 = (qm) ((xc5) r1).p;
        String r7 = f35.a;
        r6.S(this.o, this.p, this.q);
    }
}
