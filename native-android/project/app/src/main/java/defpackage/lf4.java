package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lf4 implements Runnable {
    public final /* synthetic */ boolean n;
    public final /* synthetic */ oy1 o;

    public lf4(oy1 r1, boolean r2) {
        this.o = r1;
        this.n = r2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e35.m();
        ll r0 = (ll) this.o.b;
        boolean r1 = r0.o;
        boolean r2 = this.n;
        r0.o = r2;
        if (r1 == r2) goto L6;
        ((kf4) r0.p).a(r2);
        return;
    }
}
