package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ue4 extends Thread {
    public final /* synthetic */ ve4 n;

    public ue4(ve4 r1) {
        this.n = r1;
        super("ExoPlayer:SimpleDecoder");
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ve4 r1 = this.n;
    L10:
        if (r1.k() == true) goto L10;
        return;
    L7:
        e = move-exception;
        throw new IllegalStateException(e);
    }
}
