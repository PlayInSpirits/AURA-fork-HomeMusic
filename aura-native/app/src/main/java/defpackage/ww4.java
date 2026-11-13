package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ww4 implements Lock {
    public ww4() {
        super();
    }

    @Override // java.util.concurrent.locks.Lock
    public final Condition newCondition() {
        throw new UnsupportedOperationException("Should not be called");
    }

    @Override // java.util.concurrent.locks.Lock
    public final boolean tryLock() {
        return true;
    }

    @Override // java.util.concurrent.locks.Lock
    public final boolean tryLock(long j, TimeUnit timeUnit) {
        return true;
    }

    @Override // java.util.concurrent.locks.Lock
    public final void lock() {
    }

    @Override // java.util.concurrent.locks.Lock
    public final void lockInterruptibly() {
    }

    @Override // java.util.concurrent.locks.Lock
    public final void unlock() {
    }
}
