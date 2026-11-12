package defpackage;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ht extends c0 {
    public final Thread s;
    public final g21 t;

    public ht(ne0 ne0Var, Thread thread, g21 g21Var) {
        super(ne0Var, true);
        this.s = thread;
        this.t = g21Var;
    }

    @Override // defpackage.a32
    public final void l(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.s;
        if (h12.c(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
