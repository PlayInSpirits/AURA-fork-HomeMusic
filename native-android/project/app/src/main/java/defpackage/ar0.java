package defpackage;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ar0 implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final synchronized Thread newThread(Runnable r3) {
        monitor-enter(this);
        Thread r0 = new Thread(r3, "glide-disk-lru-cache-thread");     // Catch: Throwable -> L6
        r0.setPriority(1);     // Catch: Throwable -> L6
        monitor-exit(this);
        return r0;
    L6:
        th = move-exception;
        throw th;
    }
}
