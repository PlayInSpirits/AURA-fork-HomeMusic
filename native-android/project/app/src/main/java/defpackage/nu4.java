package defpackage;

import java.util.concurrent.ExecutionException;
import kotlin.KotlinNullPointerException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nu4 implements Runnable {
    public final /* synthetic */ int n;
    public final ic2 o;
    public final cz p;

    public /* synthetic */ nu4(ic2 r1, cz r2, int r3) {
        this.n = r3;
        this.o = r1;
        this.p = r2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        cz r2 = this.p;
        ic2 r3 = this.o;
        switch(r0) {
            case 0: goto L17;
            default: goto L5;
        };
    L5:
        if (r3.isCancelled() == false) goto L34;
        r2.r(null);
        return;
    L34:
        r2.resumeWith(g2.e(r3));     // Catch: ExecutionException -> L9
        return;
    L9:
        e = move-exception;
        Throwable r4 = e.getCause();
        if (r4 == null) goto L14;
        r2.resumeWith(new s14(r4));
        return;
    L14:
        KotlinNullPointerException r5 = new KotlinNullPointerException();
        h12.M(r5, h12.class.getName());
        throw r5;
    L17:
        if (r3.isCancelled() == false) goto L19;
        r2.r(null);
        return;
    L19:
        boolean r1 = false;
    L33:
        Object r6 = r3.get();     // Catch: Throwable -> L26 InterruptedException -> L32
    L21:
        if (r1 == false) goto L23;
        Thread.currentThread().interrupt();     // Catch: ExecutionException -> L24
    L23:
        r2.resumeWith(r6);     // Catch: ExecutionException -> L24
        return;
    L24:
        e = move-exception;
        Throwable r7 = e.getCause();
        r7.getClass();
        r2.resumeWith(new s14(r7));
        return;
    L32:
        r1 = true;
    L26:
        th = move-exception;
        if (r1 == false) goto L29;
        Thread.currentThread().interrupt();     // Catch: ExecutionException -> L24
    L29:
        throw th;     // Catch: ExecutionException -> L24
    }
}
