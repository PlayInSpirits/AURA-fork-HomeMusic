package defpackage;

import android.os.ConditionVariable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class re4 extends Thread {
    public final /* synthetic */ ConditionVariable n;
    public final /* synthetic */ se4 o;

    public re4(se4 r1, ConditionVariable r2) {
        this.o = r1;
        this.n = r2;
        super("ExoPlayer:SimpleCacheInit");
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        se4 r0 = this.o;
        monitor-enter(r0);
        this.n.open();     // Catch: Throwable -> L7
        se4.a(this.o);     // Catch: Throwable -> L7
        this.o.b.getClass();     // Catch: Throwable -> L7
        monitor-exit(r0);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }
}
