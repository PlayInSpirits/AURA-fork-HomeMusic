package defpackage;

import android.os.HandlerThread;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xk implements go4 {
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;

    public /* synthetic */ xk(int r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // defpackage.go4
    public final Object get() {
        int r0 = this.n;
        int r2 = this.o;
        switch(r0) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return new HandlerThread(yk.o(r2, "ExoPlayer:MediaCodecQueueingThread:"));
    L7:
        return new HandlerThread(yk.o(r2, "ExoPlayer:MediaCodecAsyncAdapter:"));
    }
}
