package defpackage;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pk0 extends l21 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final pk0 y = null;
    public static final long z = 0;

    static {
        pk0 r0 = new pk0();
        y = r0;
        r0.c0(false);
        Long r1 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000);     // Catch: SecurityException -> L5
    L6:
        long r2 = r1.longValue();
        z = TimeUnit.MILLISECONDS.toNanos(r2);
        return;
    L5:
        r1 = 1000L;
        goto L6
    }

    @Override // defpackage.l21, defpackage.ao0
    public final as0 F(long r3, gu4 r5, ne0 r6) {
        long r0 = 0;
        if (r3 <= 0) goto L10;
        if (r3 < 9223372036854L) goto L8;
        r0 = Long.MAX_VALUE;
        goto L10
    L8:
        r0 = 1000000 * r3;
    L10:
        if (r0 >= 4611686018427387903L) goto L14;
        long r4 = System.nanoTime();
        i21 r7 = new i21(r0 + r4, r5);
        q0(r4, r7);
        return r7;
    L14:
        return k63.n;
    }

    @Override // defpackage.l21
    public final void h0(Runnable r3) {
        if (debugStatus == 4) goto L7;
        super.h0(r3);
        return;
    L7:
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // defpackage.l21
    public final Thread l0() {
        Thread r0 = _thread;
        if (r0 != null) goto L15;
        monitor-enter(this);
        Thread r1 = _thread;     // Catch: Throwable -> L9
        if (r1 != null) goto L11;
        r1 = new Thread(this, "kotlinx.coroutines.DefaultExecutor");     // Catch: Throwable -> L9
        _thread = r1;     // Catch: Throwable -> L9
        r1.setContextClassLoader(y.getClass().getClassLoader());     // Catch: Throwable -> L9
        r1.setDaemon(true);     // Catch: Throwable -> L9
        r1.start();     // Catch: Throwable -> L9
    L11:
        monitor-exit(this);
        return r1;
    L9:
        th = move-exception;
        throw th;
    L15:
        return r0;
    }

    @Override // defpackage.l21
    public final void n0(long r1, j21 r3) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // java.lang.Runnable
    public final void run() {
        it4.a.set(this);
        monitor-enter(this);     // Catch: Throwable -> L26
        int r0 = debugStatus;     // Catch: Throwable -> L53
        if (r0 == 2) goto L10;
        if (r0 == 3) goto L10;
        boolean r1 = false;
    L11:
        if (r1 == false) goto L17;
        monitor-exit(this);     // Catch: Throwable -> L26
        _thread = null;
        t0();
        if (m0() == true) goto L69;
        l0();
        return;
    L69:
        return;
    L17:
        debugStatus = 1;     // Catch: Throwable -> L53
        notifyAll();     // Catch: Throwable -> L53
        monitor-exit(this);     // Catch: Throwable -> L26
        long r9 = Long.MAX_VALUE;
    L20:
        Thread.interrupted();     // Catch: Throwable -> L26
        long r11 = d0();     // Catch: Throwable -> L26
        if (r11 != Long.MAX_VALUE) goto L37;
        long r15 = System.nanoTime();     // Catch: Throwable -> L26
        if (r9 == Long.MAX_VALUE) goto L25;
    L28:
        long r16 = r9 - r15;
        if (r16 <= 0) goto L30;
        if (r11 <= r16) goto L39;
        r11 = r16;
    L39:
        if (r11 <= 0) goto L20;
        int r2 = debugStatus;     // Catch: Throwable -> L26
        if (r2 == 2) goto L45;
        if (r2 == 3) goto L45;
        boolean r3 = false;
    L46:
        if (r3 == true) goto L47;
        LockSupport.parkNanos(this, r11);     // Catch: Throwable -> L26
        goto L20
    L47:
        _thread = null;
        t0();
        if (m0() == true) goto L71;
        l0();
        return;
    L71:
        return;
    L45:
        r3 = true;
        goto L46
    L30:
        _thread = null;
        t0();
        if (m0() == true) goto L70;
        l0();
        return;
    L70:
        return;
    L25:
        r9 = z + r15;
        goto L28
    L37:
        r9 = Long.MAX_VALUE;
        goto L39
    L10:
        r1 = true;
    L53:
        th = move-exception;
        throw th;     // Catch: Throwable -> L26
    L26:
        th = move-exception;
        _thread = null;
        t0();
        if (m0() == true) goto L59;
        l0();
    L59:
        throw th;
    }

    @Override // defpackage.l21, defpackage.g21
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    public final synchronized void t0() {
        monitor-enter(this);
        int r0 = debugStatus;     // Catch: Throwable -> L16
        if (r0 == 2) goto L9;
        if (r0 == 3) goto L9;
        boolean r1 = false;
    L10:
        if (r1 == true) goto L13;
        monitor-exit(this);
        return;
    L13:
        debugStatus = 3;     // Catch: Throwable -> L16
        p0();     // Catch: Throwable -> L16
        notifyAll();     // Catch: Throwable -> L16
        monitor-exit(this);
        return;
    L9:
        r1 = true;
    L16:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.pe0
    public final String toString() {
        return "DefaultExecutor";
    }
}
