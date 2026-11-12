package defpackage;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Handler;
import android.os.Message;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wk implements MediaCodec.OnFrameRenderedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ nk2 b;

    public /* synthetic */ wk(ak2 r1, nk2 r2, int r3) {
        this.a = r3;
        this.b = r2;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec r3, long r4, long r6) {
        int r5 = this.a;
        nk2 r2 = this.b;
        switch(r5) {
            case 0: goto L9;
            default: goto L4;
        };
    L4:
        Handler r7 = r2.n;
        if (Build.VERSION.SDK_INT >= 30) goto L7;
        r7.sendMessageAtFrontOfQueue(Message.obtain(r7, 0, (int) (r4 >> 32), (int) r4));
        return;
    L7:
        r2.a(r4);
        return;
    L9:
        Handler r8 = r2.n;
        if (Build.VERSION.SDK_INT >= 30) goto L12;
        r8.sendMessageAtFrontOfQueue(Message.obtain(r8, 0, (int) (r4 >> 32), (int) r4));
        return;
    L12:
        r2.a(r4);
    }
}
