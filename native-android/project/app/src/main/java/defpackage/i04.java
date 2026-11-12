package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i04 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ j04 o;

    public /* synthetic */ i04(j04 r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        j04 r1 = this.o;
        switch(r0) {
            case 0: goto L11;
            default: goto L4;
        };
    L4:
        hq1 r2 = r1.c;
        if (((j04) r2.g) != null) goto L7;
        return;
    L7:
        if ((r2.a & 3) == 0) goto L16;
        r2.j();
        return;
    L16:
        return;
    L11:
        hq1 r3 = r1.c;
        if (((j04) r3.g) == null) goto L17;
        r3.j();
        return;
    }
}
