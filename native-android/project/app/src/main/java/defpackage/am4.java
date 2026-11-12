package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class am4 implements Runnable {
    public final pq3 n;
    public final gl4 o;
    public final boolean p;
    public final int q;

    public am4(pq3 r1, gl4 r2, boolean r3, int r4) {
        r1.getClass();
        r2.getClass();
        this.n = r1;
        this.o = r2;
        this.p = r3;
        this.q = r4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean r0 = this.p;
        pq3 r1 = this.n;
        gl4 r2 = this.o;
        if (r0 == false) goto L12;
        int r3 = this.q;
        r1.getClass();
        String r4 = r2.a.a;
        Object r5 = r1.k;
        monitor-enter(r5);
        td5 r6 = r1.b(r4);     // Catch: Throwable -> L9
        monitor-exit(r5);     // Catch: Throwable -> L9
        boolean r7 = pq3.d(r4, r6, r3);
    L31:
        cx.f().b(cx.i("StopWorkRunnable"), "StopWorkRunnable for " + this.o.a.a + "; Processor.stopWork = " + r7);
        return;
    L9:
        th = move-exception;
        throw th;
    L12:
        int r8 = this.q;
        r1.getClass();
        String r9 = r2.a.a;
        Object r10 = r1.k;
        monitor-enter(r10);
    L19:
        th = move-exception;
        throw th;
    L15:
        if (r1.f.get(r9) == null) goto L21;
        cx.f().b(pq3.l, "Ignored stopWork. WorkerWrapper " + r9 + " is in foreground");     // Catch: Throwable -> L19
        monitor-exit(r10);     // Catch: Throwable -> L19
    L18:
        r7 = false;
        goto L31
    L21:
        Set r11 = (Set) r1.h.get(r9);     // Catch: Throwable -> L19
        if (r11 != null) goto L24;
    L29:
        monitor-exit(r10);     // Catch: Throwable -> L19
        goto L18
    L24:
        if (r11.contains(r2) == false) goto L29;
        td5 r12 = r1.b(r9);     // Catch: Throwable -> L19
        monitor-exit(r10);     // Catch: Throwable -> L19
        r7 = pq3.d(r9, r12, r8);
        goto L31
    }
}
