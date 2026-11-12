package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qt0 implements Runnable {
    public final /* synthetic */ int n;
    public final ss0 o;
    public final String p;

    public /* synthetic */ qt0(ss0 r1, String r2, int r3) {
        this.n = r3;
        this.o = r1;
        this.p = r2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.n) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        xl.E((s24) this.o.n, false, true, new rs0(2, this.p));
        return;
    L6:
        xl.E((s24) this.o.n, false, true, new rs0(1, this.p));
    }
}
