package defpackage;

import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rw2 extends sj0 {
    @Override // defpackage.sj0
    public final void c(Object r1, Object r2) {
        sw2 r3 = (sw2) r1;
        r3.getClass();
        ArrayDeque r0 = sw2.b;
        monitor-enter(r0);
        r0.offer(r3);     // Catch: Throwable -> L7
        monitor-exit(r0);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }
}
