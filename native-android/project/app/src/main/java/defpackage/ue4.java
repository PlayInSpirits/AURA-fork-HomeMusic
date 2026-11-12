package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ue4 extends Thread {
    public final /* synthetic */ ve4 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ue4(ve4 ve4Var) {
        super("ExoPlayer:SimpleDecoder");
        this.n = ve4Var;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        do {
            try {
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        } while (this.n.k());
    }
}
