package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public class uk extends fu4 {
    public static final ReentrantLock h;
    public static final Condition i;
    public static final long j;
    public static final long k;
    public static uk l;
    public int e;
    public uk f;
    public long g;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        h = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        newCondition.getClass();
        i = newCondition;
        j = 60000L;
        k = TimeUnit.MILLISECONDS.toNanos(60000L);
    }

    public final void h() {
        long j2 = this.c;
        boolean z = this.a;
        if (j2 != 0 || z) {
            ReentrantLock reentrantLock = h;
            reentrantLock.lock();
            try {
                if (this.e != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.e = 1;
                pa.p(this, j2, z);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final boolean i() {
        ReentrantLock reentrantLock = h;
        reentrantLock.lock();
        try {
            int i2 = this.e;
            this.e = 0;
            if (i2 != 1) {
                return i2 == 2;
            }
            uk ukVar = l;
            while (ukVar != null) {
                uk ukVar2 = ukVar.f;
                if (ukVar2 == this) {
                    ukVar.f = this.f;
                    this.f = null;
                    return false;
                }
                ukVar = ukVar2;
            }
            throw new IllegalStateException("node was not found in the queue");
        } finally {
            reentrantLock.unlock();
        }
    }

    public void j() {
    }
}
