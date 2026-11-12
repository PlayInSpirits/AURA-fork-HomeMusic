package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements Runnable {
    public final u0 n;
    public final ic2 o;

    public k0(u0 r1, ic2 r2) {
        this.n = r1;
        this.o = r2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.n.n != this) goto L10;
        Object r0 = u0.h(this.o);
        if (u0.s.h(this.n, this, r0) == false) goto L9;
        u0.d(this.n, false);
        return;
    L9:
        return;
    }
}
