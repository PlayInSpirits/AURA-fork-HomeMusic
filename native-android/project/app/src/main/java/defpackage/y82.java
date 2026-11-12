package defpackage;

import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class y82 {
    public final Object a;
    public final String b;
    public volatile Logger c;

    public y82(Class r2) {
        this.a = new Object();
        this.b = r2.getName();
    }

    public final Logger a() {
        Logger r0 = this.c;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Object r1 = this.a;
        monitor-enter(r1);
        Logger r2 = this.c;     // Catch: Throwable -> L11
        if (r2 == null) goto L13;
        monitor-exit(r1);     // Catch: Throwable -> L11
        return r2;
    L13:
        Logger r3 = Logger.getLogger(this.b);     // Catch: Throwable -> L11
        this.c = r3;     // Catch: Throwable -> L11
        monitor-exit(r1);     // Catch: Throwable -> L11
        return r3;
    L11:
        th = move-exception;
        throw th;
    }
}
