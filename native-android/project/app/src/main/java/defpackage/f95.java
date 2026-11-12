package defpackage;

import java.lang.ref.WeakReference;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class f95 extends q12 {
    public final s12 b;
    public final WeakReference c;

    public f95(s12 r2, y24 r3) {
        r3.getClass();
        super(r3.a);
        this.b = r2;
        this.c = new WeakReference(r3);
    }

    @Override // defpackage.q12
    public final void a(Set r3) {
        r3.getClass();
        q12 r0 = (q12) this.c.get();
        if (r0 != null) goto L15;
        s12 r4 = this.b;
        r4.getClass();
        ReentrantLock r1 = r4.d;
        r1.lock();
        d83 r2 = (d83) r4.c.remove(this);     // Catch: Throwable -> L12
        r1.unlock();
        if (r2 == null) goto L19;
        jy4 r5 = r4.b;
        int[] r6 = r2.b;
        r5.getClass();
        r6.getClass();
        if (r5.h.k(r6) == false) goto L20;
        g12.Q(new r12(r4, null, 1));
        return;
    L20:
        return;
    L19:
        return;
    L12:
        th = move-exception;
        r1.unlock();
        throw th;
    L15:
        r0.a(r3);
    }
}
