package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class uk extends fu4 {
    public static final ReentrantLock h = null;
    public static final Condition i = null;
    public static final long j = 0;
    public static final long k = 0;
    public static uk l;
    public int e;
    public uk f;
    public long g;

    static {
        ReentrantLock r0 = new ReentrantLock();
        h = r0;
        Condition r1 = r0.newCondition();
        r1.getClass();
        i = r1;
        j = 60000;
        k = TimeUnit.MILLISECONDS.toNanos(60000);
    }

    public final void h() {
        long r0 = this.c;
        boolean r2 = this.a;
        if (r0 != 0) goto L6;
        if (r2 == true) goto L6;
        return;
    L6:
        ReentrantLock r3 = h;
        r3.lock();
    L12:
        th = move-exception;
        r3.unlock();
        throw th;
    L8:
        if (this.e != 0) goto L15;
        this.e = 1;     // Catch: Throwable -> L12
        pa.p(this, r0, r2);     // Catch: Throwable -> L12
        r3.unlock();
        return;
    L15:
        throw new IllegalStateException("Unbalanced enter/exit");     // Catch: Throwable -> L12
    }

    public final boolean i() {
        ReentrantLock r0 = h;
        r0.lock();
        int r1 = this.e;     // Catch: Throwable -> L20
        boolean r2 = false;
        this.e = 0;     // Catch: Throwable -> L20
        if (r1 != 1) goto L16;
        uk r3 = l;     // Catch: Throwable -> L20
    L6:
        if (r3 == null) goto L14;
        uk r4 = r3.f;     // Catch: Throwable -> L20
        if (r4 == this) goto L9;
        r3 = r4;
        goto L6
    L9:
        r3.f = this.f;     // Catch: Throwable -> L20
        this.f = null;     // Catch: Throwable -> L20
        r0.unlock();
        return false;
    L14:
        throw new IllegalStateException("node was not found in the queue");     // Catch: Throwable -> L20
    L16:
        if (r1 != 2) goto L18;
        r2 = true;
    L18:
        r0.unlock();
        return r2;
    L20:
        th = move-exception;
        r0.unlock();
        throw th;
    }

    public void j() {
    }
}
