package defpackage;

import android.os.HandlerThread;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class xk implements go4 {
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;

    public /* synthetic */ xk(int i, int i2) {
        this.n = i2;
        this.o = i;
    }

    @Override // defpackage.go4
    public final Object get() {
        int i = this.n;
        int i2 = this.o;
        switch (i) {
            case 0:
                return new HandlerThread(yk.o(i2, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(yk.o(i2, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
