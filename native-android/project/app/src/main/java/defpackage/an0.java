package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class an0 implements ThreadFactory {
    public final /* synthetic */ int a;
    public final AtomicInteger b;

    public an0(int r2) {
        this.a = r2;
        switch(r2) {
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        this.b = new AtomicInteger(0);
        return;
    L6:
        this.b = new AtomicInteger(1);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable r4) {
        int r0 = this.a;
        AtomicInteger r3 = this.b;
        switch(r0) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        Thread r1 = new Thread(r4);
        r1.setName("arch_disk_io_" + r3.getAndIncrement());
        return r1;
    L5:
        return new Thread(r4, "ModernAsyncTask #" + r3.getAndIncrement());
    }
}
