package defpackage;

import android.view.Choreographer;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dd implements Choreographer.FrameCallback {
    public final /* synthetic */ cz n;
    public final /* synthetic */ if1 o;

    public dd(cz r1, ed r2, if1 r3) {
        this.n = r1;
        this.o = r3;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long r2) {
        if1 r0 = this.o;
        Object r3 = r0.invoke(Long.valueOf(r2));     // Catch: Throwable -> L5
    L7:
        this.n.resumeWith(r3);
        return;
    L5:
        th = move-exception;
        r3 = new s14(th);
        goto L7
    }
}
