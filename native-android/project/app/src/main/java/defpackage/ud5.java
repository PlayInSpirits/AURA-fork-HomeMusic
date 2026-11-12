package defpackage;

import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ud5 {
    public static final String a = null;

    static {
        a = cx.i("WorkerWrapper");
    }

    public static final Object a(ic2 r3, oc2 r4, ep4 r5) {
    L16:
        e = move-exception;
        Throwable r6 = e.getCause();
        r6.getClass();
        throw r6;
    L3:
        int r1 = 0;
        if (r3.isDone() == true) goto L20;
        cz r0 = new cz(1, ya4.x(r5));
        r0.u();
        r3.f(new nu4(r3, r0, r1), fq0.n);
        r0.w(new br0(4, r4, r3));
        return r0.q();
    L20:
        Object r7 = r3.get();     // Catch: Throwable -> L9 InterruptedException -> L13
    L6:
        if (r1 == 0) goto L8;
        Thread.currentThread().interrupt();     // Catch: ExecutionException -> L16
    L8:
        return r7;
    L13:
        r1 = 1;
    L9:
        th = move-exception;
        if (r1 == 0) goto L12;
        Thread.currentThread().interrupt();     // Catch: ExecutionException -> L16
    L12:
        throw th;     // Catch: ExecutionException -> L16
    }
}
