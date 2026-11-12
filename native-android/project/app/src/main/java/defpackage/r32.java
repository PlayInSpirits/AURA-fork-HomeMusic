package defpackage;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class r32 implements Closeable {
    public boolean n;
    public int o;
    public final ReentrantLock p;
    public final RandomAccessFile q;

    public r32(RandomAccessFile r2) {
        this.p = new ReentrantLock();
        this.q = r2;
    }

    public final w61 b(long r3) {
        ReentrantLock r0 = this.p;
        r0.lock();
    L8:
        th = move-exception;
        r0.unlock();
        throw th;
    L4:
        if (this.n == true) goto L11;
        this.o++;     // Catch: Throwable -> L8
        r0.unlock();
        return new w61(this, r3);
    L11:
        throw new IllegalStateException("closed");     // Catch: Throwable -> L8
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock r0 = this.p;
        r0.lock();
    L20:
        th = move-exception;
        r0.unlock();
        throw th;
    L4:
        if (this.n == false) goto L8;
        r0.unlock();
        return;
    L8:
        this.n = true;     // Catch: Throwable -> L20
        if (this.o == 0) goto L12;
        r0.unlock();
        return;
    L12:
        r0.unlock();
        monitor-enter(this);
        this.q.close();     // Catch: Throwable -> L17
        monitor-exit(this);
        return;
    L17:
        th = move-exception;
        throw th;
    }

    public final long size() {
        ReentrantLock r0 = this.p;
        r0.lock();
    L15:
        th = move-exception;
        r0.unlock();
        throw th;
    L4:
        if (this.n == true) goto L14;
        r0.unlock();
        monitor-enter(this);
        long r1 = this.q.length();     // Catch: Throwable -> L10
        monitor-exit(this);
        return r1;
    L10:
        th = move-exception;
        throw th;
    L14:
        throw new IllegalStateException("closed");     // Catch: Throwable -> L15
    }
}
