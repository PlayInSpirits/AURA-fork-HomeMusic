package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class om implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ String o;
    public final /* synthetic */ long p;
    public final /* synthetic */ long q;
    public final /* synthetic */ Object r;

    public /* synthetic */ om(Object r1, String r2, long r3, long r5, int r7) {
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
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        o55 r2 = (o55) ((rf2) r1).o;
        String r3 = f35.a;
        r2.x(this.p, this.q, this.o);
        return;
    L6:
        qm r4 = (qm) ((xc5) r1).p;
        String r5 = f35.a;
        r4.V(this.p, this.q, this.o);
    }
}
