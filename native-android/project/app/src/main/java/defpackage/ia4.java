package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ia4 implements Executor {
    public final /* synthetic */ int n;
    public final Executor o;
    public final ArrayDeque p;
    public Runnable q;
    public final Object r;

    public ia4(Executor r1, int r2) {
        this.n = r2;
        switch(r2) {
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        this.o = r1;
        this.p = new ArrayDeque();
        this.r = new Object();
        return;
    L6:
        r1.getClass();
        this.o = r1;
        this.p = new ArrayDeque();
        this.r = new Object();
    }

    public final void a() {
        switch(this.n) {
            case 0: goto L27;
            case 1: goto L15;
            default: goto L4;
        };
    L4:
        Object r0 = this.r;
        monitor-enter(r0);
        Runnable r1 = (Runnable) this.p.poll();     // Catch: Throwable -> L9
        this.q = r1;     // Catch: Throwable -> L9
        if (r1 == null) goto L11;
        ((of) this.o).execute(r1);     // Catch: Throwable -> L9
    L11:
        monitor-exit(r0);     // Catch: Throwable -> L9
        return;
    L9:
        th = move-exception;
        throw th;
    L15:
        Object r2 = this.r;
        monitor-enter(r2);
        Object r3 = this.p.poll();     // Catch: Throwable -> L21
        Runnable r4 = (Runnable) r3;     // Catch: Throwable -> L21
        this.q = r4;     // Catch: Throwable -> L21
        if (r3 == null) goto L23;
        this.o.execute(r4);     // Catch: Throwable -> L21
    L23:
        monitor-exit(r2);
        return;
    L21:
        th = move-exception;
        throw th;
    L27:
        Runnable r5 = (Runnable) this.p.poll();
        this.q = r5;
        if (r5 == null) goto L35;
        this.o.execute(r5);
        return;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable r5) {
        switch(this.n) {
            case 0: goto L27;
            case 1: goto L15;
            default: goto L4;
        };
    L4:
        Object r0 = this.r;
        monitor-enter(r0);
        this.p.add(new k6(2, this, r5));     // Catch: Throwable -> L9
        if (this.q != null) goto L11;
        a();     // Catch: Throwable -> L9
    L11:
        monitor-exit(r0);     // Catch: Throwable -> L9
        return;
    L9:
        th = move-exception;
        throw th;
    L15:
        r5.getClass();
        Object r1 = this.r;
        monitor-enter(r1);
        this.p.offer(new ur2(r5, this));     // Catch: Throwable -> L21
        if (this.q != null) goto L23;
        a();     // Catch: Throwable -> L21
    L23:
        monitor-exit(r1);
        return;
    L21:
        th = move-exception;
        throw th;
    L27:
        Object r2 = this.r;
        monitor-enter(r2);
        this.p.add(new lg1(27, this, r5));     // Catch: Throwable -> L32
        if (this.q != null) goto L34;
        a();     // Catch: Throwable -> L32
    L34:
        monitor-exit(r2);     // Catch: Throwable -> L32
        return;
    L32:
        th = move-exception;
        throw th;
    }

    public ia4(of r2) {
        this.n = 2;
        this.r = new Object();
        this.p = new ArrayDeque();
        this.o = r2;
    }
}
