package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class it1 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ d7 o;
    public final /* synthetic */ String p;

    public /* synthetic */ it1(d7 r2, String r3) {
        this.n = 1;
        this.o = r2;
        this.p = r3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        String r1 = this.p;
        d7 r3 = this.o;
        switch(r0) {
            case 0: goto L11;
            default: goto L4;
        };
    L4:
        r3.accept(r1);
        return;
    L11:
        String r2 = jt1.b(r1);     // Catch: Exception -> L8
    L9:
        io1.b.post(new it1(r3, r2));
        return;
    L8:
        r2 = null;
        goto L9
    }

    public /* synthetic */ it1(String r2, d7 r3) {
        this.n = 0;
        this.p = r2;
        this.o = r3;
    }
}
