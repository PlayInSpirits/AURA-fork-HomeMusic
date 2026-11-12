package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ox2 extends n0 implements Runnable {
    public final Runnable u;

    public ox2(Runnable runnable) {
        runnable.getClass();
        this.u = runnable;
    }

    @Override // defpackage.u0
    public final String j() {
        return "task=[" + this.u + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.u.run();
        } catch (Throwable th) {
            m(th);
            throw th;
        }
    }
}
