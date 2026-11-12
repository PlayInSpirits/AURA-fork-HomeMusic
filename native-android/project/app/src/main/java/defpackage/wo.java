package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wo implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ c6 o;
    public final /* synthetic */ Object p;

    public /* synthetic */ wo(c6 r1, Object r2, int r3) {
        this.n = r3;
        this.o = r1;
        this.p = r2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        Object r1 = this.p;
        c6 r2 = this.o;
        switch(r0) {
            case 0: goto L9;
            default: goto L4;
        };
    L4:
        int r3 = r2.a - 1;
        r2.a = r3;
        if (r3 != 0) goto L12;
        r2.C(r1);
        return;
    L12:
        return;
    L9:
        if (r2.a != 0) goto L13;
        r2.C(r1);
        return;
    }
}
