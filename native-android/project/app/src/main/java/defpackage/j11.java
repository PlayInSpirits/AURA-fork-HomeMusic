package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class j11 implements Runnable {
    public final /* synthetic */ int n;
    public final cf4 o;
    public final /* synthetic */ m11 p;

    public /* synthetic */ j11(m11 r1, cf4 r2, int r3) {
        this.n = r3;
        this.p = r1;
        this.o = r2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.n) {
            case 0: goto L28;
            default: goto L4;
        };
    L4:
        cf4 r0 = this.o;
        r0.b.a();
        Object r1 = r0.c;
        monitor-enter(r1);
        m11 r2 = this.p;     // Catch: Throwable -> L22
        monitor-enter(r2);     // Catch: Throwable -> L22
        l11 r3 = this.p.n;     // Catch: Throwable -> L13
        cf4 r4 = this.o;     // Catch: Throwable -> L13
        if (r3.n.contains(new k11(r4, fh0.h)) == false) goto L18;
        this.p.G.a();     // Catch: Throwable -> L13
        m11 r5 = this.p;     // Catch: Throwable -> L13
        cf4 r6 = this.o;     // Catch: Throwable -> L13
        r5.getClass();     // Catch: Throwable -> L13
        r6.i(r5.G, r5.C);     // Catch: Throwable -> L15
        this.p.g(this.o);     // Catch: Throwable -> L13
        goto L18
    L15:
        th = move-exception;
        throw new ly(th);     // Catch: Throwable -> L13
    L18:
        this.p.b();     // Catch: Throwable -> L13
        monitor-exit(r2);     // Catch: Throwable -> L13
        monitor-exit(r1);     // Catch: Throwable -> L22
        return;
    L13:
        th = move-exception;
        throw th;     // Catch: Throwable -> L22
    L22:
        th = move-exception;
        throw th;
    L28:
        cf4 r7 = this.o;
        r7.b.a();
        Object r8 = r7.c;
        monitor-enter(r8);
        m11 r9 = this.p;     // Catch: Throwable -> L46
        monitor-enter(r9);     // Catch: Throwable -> L46
        l11 r10 = this.p.n;     // Catch: Throwable -> L40
        cf4 r11 = this.o;     // Catch: Throwable -> L40
        if (r10.n.contains(new k11(r11, fh0.h)) == false) goto L42;
        m11 r12 = this.p;     // Catch: Throwable -> L40
        cf4 r13 = this.o;     // Catch: Throwable -> L40
        r12.getClass();     // Catch: Throwable -> L40
        r13.h(r12.E, 5);     // Catch: Throwable -> L37
    L37:
        th = move-exception;
        throw new ly(th);     // Catch: Throwable -> L40
    L42:
        this.p.b();     // Catch: Throwable -> L40
        monitor-exit(r9);     // Catch: Throwable -> L40
        monitor-exit(r8);     // Catch: Throwable -> L46
        return;
    L40:
        th = move-exception;
        throw th;     // Catch: Throwable -> L46
    L46:
        th = move-exception;
        throw th;
    }
}
