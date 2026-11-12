package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class sl4 implements rl4 {
    public final fl n;

    public sl4() {
        this.n = new fl(0);
    }

    public final boolean e(int r1) {
        if ((this.n.get() & r1) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public final void f(int r4) {
    L2:
        fl r0 = this.n;
        int r1 = r0.get();
        if ((r1 & r4) != 0) goto L7;
        if (r0.compareAndSet(r1, r1 | r4) == false) goto L2;
        return;
    }
}
