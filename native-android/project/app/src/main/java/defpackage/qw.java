package defpackage;

import java.io.IOException;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qw {
    public final ArrayDeque a;

    public qw(int r2) {
        switch(r2) {
            case 1: goto L5;
            default: goto L3;
        };
    L3:
        this.a = new ArrayDeque(0);
        return;
    L5:
        this.a = new ArrayDeque(16);
    }

    public synchronized void a(di1 r2) {
        monitor-enter(this);
        r2.b = null;     // Catch: Throwable -> L7
        r2.c = null;     // Catch: Throwable -> L7
        this.a.offer(r2);     // Catch: Throwable -> L7
        monitor-exit(this);
        return;
    L7:
        th = move-exception;
        throw th;
    }

    public void b() {
        ArrayDeque r0 = this.a;
        if (r0.isEmpty() == false) goto L6;
        return;
    L6:
        throw new IOException("data item not completed, stackSize: " + r0.size() + " scope: " + d());
    }

    public void c(long r5) {
        long r0 = d();
        if (r0 != r5) goto L5;
        return;
    L5:
        if (r0 == (-1)) goto L11;
        if (r0 != (-2)) goto L13;
        r0 = -2;
        goto L11
    L13:
        return;
    L11:
        throw new IOException("expected non-string scope or scope " + r5 + " but found " + r0);
    }

    public long d() {
        ArrayDeque r2 = this.a;
        if (r2.isEmpty() == false) goto L7;
        return 0;
    L7:
        return ((Long) r2.peek()).longValue();
    }
}
