package defpackage;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ht extends c0 {
    public final Thread s;
    public final g21 t;

    public ht(ne0 r2, Thread r3, g21 r4) {
        super(r2, true);
        this.s = r3;
        this.t = r4;
    }

    @Override // defpackage.a32
    public final void l(Object r1) {
        Thread r2 = Thread.currentThread();
        Thread r0 = this.s;
        if (h12.c(r2, r0) == true) goto L6;
        LockSupport.unpark(r0);
        return;
    }
}
