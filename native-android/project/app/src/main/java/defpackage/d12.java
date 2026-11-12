package defpackage;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class d12 extends AbstractOwnableSynchronizer implements Runnable {
    public final e12 n;

    public d12(e12 r1) {
        this.n = r1;
    }

    public static void a(d12 r0, Thread r1) {
        r0.setExclusiveOwnerThread(r1);
    }

    @Override // java.lang.Runnable
    public final void run() {
    }

    public final String toString() {
        return this.n.toString();
    }
}
