package defpackage;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class w61 implements ej4 {
    public final r32 n;
    public long o;
    public boolean p;

    public w61(r32 r1, long r2) {
        this.n = r1;
        this.o = r2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        r32 r0 = this.n;
        if (this.p == false) goto L5;
        return;
    L5:
        this.p = true;
        ReentrantLock r2 = r0.p;
        r2.lock();
        int r1 = r0.o - 1;     // Catch: Throwable -> L19
        r0.o = r1;     // Catch: Throwable -> L19
        if (r1 != 0) goto L21;
        if (r0.n == false) goto L21;
        r2.unlock();
        monitor-enter(r0);
        r0.q.close();     // Catch: Throwable -> L16
        monitor-exit(r0);
        return;
    L16:
        th = move-exception;
        throw th;
    L21:
        r2.unlock();
        return;
    L19:
        th = move-exception;
        r2.unlock();
        throw th;
    }

    @Override // defpackage.ej4
    public final long read(tv r17, long r18) {
        r17.getClass();
        if (this.p == true) goto L43;
        r32 r4 = this.n;
        long r7 = this.o;
        if (r18 < 0) goto L41;
        long r2 = r18 + r7;
        long r5 = r7;
    L8:
        if (r5 >= r2) goto L35;
        t84 r9 = r17.W(1);
        byte[] r12 = r9.a;
        int r13 = r9.c;
        long r19 = -1;
        int r10 = (int) Math.min(r2 - r5, 8192 - r13);
        monitor-enter(r4);
        r12.getClass();     // Catch: Throwable -> L21
        r4.q.seek(r5);     // Catch: Throwable -> L21
        int r11 = 0;
    L12:
        if (r11 >= r10) goto L23;
        int r14 = r4.q.read(r12, r13, r10 - r11);     // Catch: Throwable -> L21
        if (r14 == (-1)) goto L16;
        r11 = r11 + r14;
        goto L12
    L16:
        if (r11 != 0) goto L23;
        monitor-exit(r4);
        r11 = -1;
    L25:
        if (r11 == (-1)) goto L27;
        r9.c += r11;
        long r15 = r11;
        r5 = r5 + r15;
        r17.o += r15;
        goto L8
    L27:
        if (r9.b != r9.c) goto L30;
        r17.n = r9.a();
        a94.a(r9);
    L30:
        if (r7 != r5) goto L36;
        long r6 = -1;
    L38:
        if (r6 == r19) goto L40;
        this.o += r6;
    L40:
        return r6;
    L36:
        r6 = r5 - r7;
    L23:
        monitor-exit(r4);
    L21:
        th = move-exception;
        throw th;
    L35:
        r19 = -1;
        goto L36
    L41:
        kf2.e(b11.k("byteCount < 0: ", r18));
        return 0;
    L43:
        kf2.o("closed");
        return 0;
    }

    @Override // defpackage.ej4
    public final fu4 timeout() {
        return fu4.d;
    }
}
