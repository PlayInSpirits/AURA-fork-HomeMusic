package defpackage;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class q90 {
    public final vp4 a;
    public boolean b;

    public q90() {
        this(vp4.a);
    }

    public final synchronized void a() {
        monitor-enter(this);
    L13:
    L7:
        th = move-exception;
        throw th;
    L4:
        if (this.b == true) goto L9;
        this.a.getClass();     // Catch: Throwable -> L7
        wait();     // Catch: Throwable -> L7
        goto L13
    L9:
        monitor-exit(this);
    }

    public final synchronized void b() {
        monitor-enter(this);
        boolean r0 = false;
    L19:
    L8:
        th = move-exception;
        throw th;
    L5:
        if (this.b == true) goto L11;
        this.a.getClass();     // Catch: Throwable -> L8 InterruptedException -> L10
        wait();     // Catch: Throwable -> L8 InterruptedException -> L10
    L10:
        r0 = true;
        goto L19
    L11:
        if (r0 == false) goto L13;
        Thread.currentThread().interrupt();     // Catch: Throwable -> L8
    L13:
        monitor-exit(this);
    }

    public final synchronized boolean c(long r5) {
        monitor-enter(this);
        if (r5 > 0) goto L10;
        boolean r6 = this.b;     // Catch: Throwable -> L8
        monitor-exit(this);
        return r6;
    L10:
        this.a.getClass();     // Catch: Throwable -> L8
        long r0 = SystemClock.elapsedRealtime();     // Catch: Throwable -> L8
        long r7 = r5 + r0;     // Catch: Throwable -> L8
        if (r7 >= r0) goto L13;
        b();     // Catch: Throwable -> L8
    L24:
        boolean r8 = this.b;     // Catch: Throwable -> L8
        monitor-exit(this);
        return r8;
    L13:
        boolean r2 = false;
    L15:
        if (this.b == true) goto L22;
        if (r0 >= r7) goto L22;
        this.a.getClass();     // Catch: Throwable -> L8 InterruptedException -> L20
        wait(r7 - r0);     // Catch: Throwable -> L8 InterruptedException -> L20
    L21:
        this.a.getClass();     // Catch: Throwable -> L8
        r0 = SystemClock.elapsedRealtime();     // Catch: Throwable -> L8
    L20:
        r2 = true;
    L22:
        if (r2 == false) goto L24;
        Thread.currentThread().interrupt();     // Catch: Throwable -> L8
    L8:
        th = move-exception;
        throw th;
    }

    public final synchronized boolean d() {
        monitor-enter(this);
    L12:
        th = move-exception;
        throw th;
    L4:
        if (this.b == false) goto L9;
        monitor-exit(this);
        return false;
    L9:
        this.b = true;     // Catch: Throwable -> L12
        notifyAll();     // Catch: Throwable -> L12
        monitor-exit(this);
        return true;
    }

    public q90(vp4 r1) {
        this.a = r1;
    }
}
