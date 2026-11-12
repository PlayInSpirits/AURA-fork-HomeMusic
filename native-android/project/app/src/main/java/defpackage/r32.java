package defpackage;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class r32 implements Closeable {
    public boolean n;
    public int o;
    public final ReentrantLock p = new ReentrantLock();
    public final RandomAccessFile q;

    public r32(RandomAccessFile randomAccessFile) {
        this.q = randomAccessFile;
    }

    public final w61 b(long j) {
        ReentrantLock reentrantLock = this.p;
        reentrantLock.lock();
        try {
            if (this.n) {
                throw new IllegalStateException("closed");
            }
            this.o++;
            reentrantLock.unlock();
            return new w61(this, j);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.p;
        reentrantLock.lock();
        try {
            if (this.n) {
                reentrantLock.unlock();
                return;
            }
            this.n = true;
            if (this.o != 0) {
                reentrantLock.unlock();
                return;
            }
            reentrantLock.unlock();
            synchronized (this) {
                this.q.close();
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long size() {
        long length;
        ReentrantLock reentrantLock = this.p;
        reentrantLock.lock();
        try {
            if (this.n) {
                throw new IllegalStateException("closed");
            }
            reentrantLock.unlock();
            synchronized (this) {
                length = this.q.length();
            }
            return length;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
