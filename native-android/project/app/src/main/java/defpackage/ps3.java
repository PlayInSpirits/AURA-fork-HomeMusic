package defpackage;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ps3 implements ThreadFactory {
    public final /* synthetic */ int a;

    public /* synthetic */ ps3(int r1) {
        this.a = r1;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable r2) {
        switch(this.a) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        Thread r1 = new Thread(r2, "queue-preloader");
        r1.setPriority(1);
        return r1;
    L5:
        return new Thread(r2, "ExoPlayer:AudioTrackReleaseThread");
    }
}
