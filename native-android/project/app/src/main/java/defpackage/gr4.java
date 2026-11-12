package defpackage;

import java.util.ArrayList;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gr4 {
    public static final Logger k = null;
    public static final gr4 l = null;
    public final rm2 a;
    public final Logger b;
    public final ReentrantLock c;
    public final Condition d;
    public int e;
    public boolean f;
    public long g;
    public final ArrayList h;
    public final ArrayList i;
    public final g5 j;

    static {
        Logger r0 = Logger.getLogger(gr4.class.getName());
        r0.getClass();
        k = r0;
        l = new gr4(new rm2(new ye5(b11.q(new StringBuilder(), ze5.c, " TaskRunner"), true)));
    }

    public gr4(rm2 r2) {
        Logger r0 = k;
        r0.getClass();
        this.a = r2;
        this.b = r0;
        ReentrantLock r3 = new ReentrantLock();
        this.c = r3;
        Condition r4 = r3.newCondition();
        r4.getClass();
        this.d = r4;
        this.e = 10000;
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new g5(29, this);
    }

    public static final void a(gr4 r6, ar4 r7) {
        ReentrantLock r0 = r6.c;
        Thread r1 = Thread.currentThread();
        String r2 = r1.getName();
        r1.setName(r7.a);
        long r3 = r7.a();     // Catch: Throwable -> L11
        r0.lock();
        r6.b(r7, r3);     // Catch: Throwable -> L8
        r0.unlock();
        r1.setName(r2);
        return;
    L8:
        th = move-exception;
        r0.unlock();
        throw th;
    L11:
        th = move-exception;
        r0.lock();
        r6.b(r7, -1);     // Catch: Throwable -> L16
        r0.unlock();
        r1.setName(r2);
        throw th;
    L16:
        th = move-exception;
        r0.unlock();
        throw th;
    }

    public final void b(ar4 r5, long r6) {
        tl1 r0 = ze5.a;
        fr4 r1 = r5.c;
        r1.getClass();
        if (r1.d != r5) goto L14;
        boolean r2 = r1.f;
        r1.f = false;
        r1.d = null;
        this.h.remove(r1);
        if (r6 == (-1)) goto L11;
        if (r2 == true) goto L11;
        if (r1.c == true) goto L11;
        r1.f(r5, r6, true);
    L11:
        if (r1.e.isEmpty() == true) goto L16;
        this.i.add(r1);
        return;
    L16:
        return;
    L14:
        kf2.o("Check failed.");
    }

    public final ar4 c() {
        tl1 r0 = ze5.a;
    L3:
        ArrayList r1 = this.i;
        if (r1.isEmpty() == true) goto L5;
        long r4 = System.nanoTime();
        int r2 = r1.size();
        long r7 = Long.MAX_VALUE;
        int r10 = 0;
        ar4 r9 = null;
    L8:
        if (r10 >= r2) goto L16;
        Object r14 = r1.get(r10);
        r10 = r10 + 1;
        ar4 r15 = (ar4) ((fr4) r14).e.get(0);
        long r16 = r4;
        ar4 r17 = null;
        long r3 = Math.max(0, r15.d - r16);
        if (r3 <= 0) goto L13;
        r7 = Math.min(r3, r7);
    L12:
        r4 = r16;
        goto L8
    L13:
        if (r9 != null) goto L14;
        r9 = r15;
        goto L12
    L14:
        boolean r5 = true;
    L17:
        ArrayList r6 = this.h;
        if (r9 != null) goto L19;
        boolean r8 = this.f;
        Condition r11 = this.d;
        if (r8 == true) goto L30;
        this.f = true;
        this.g = r16 + r7;
        tl1 r12 = ze5.a;     // Catch: Throwable -> L38 InterruptedException -> L41
        if (r7 <= 0) goto L40;
        r11.awaitNanos(r7);     // Catch: Throwable -> L38 InterruptedException -> L41
    L40:
        this.f = false;
    L41:
        tl1 r13 = ze5.a;     // Catch: Throwable -> L38
        int r18 = r6.size() - 1;     // Catch: Throwable -> L38
    L43:
        if ((-1) >= r18) goto L45;
        ((fr4) r6.get(r18)).b();     // Catch: Throwable -> L38
        r18 = r18 - 1;     // Catch: Throwable -> L38
        goto L43
    L45:
        int r19 = r1.size() - 1;     // Catch: Throwable -> L38
    L46:
        if ((-1) >= r19) goto L40;
        fr4 r20 = (fr4) r1.get(r19);     // Catch: Throwable -> L38
        r20.b();     // Catch: Throwable -> L38
        if (r20.e.isEmpty() == false) goto L50;
        r1.remove(r19);     // Catch: Throwable -> L38
    L50:
        r19 = r19 - 1;
    L38:
        th = move-exception;
        this.f = false;
        throw th;
    L30:
        if (r7 >= (this.g - r16)) goto L70;
        r11.signal();
        return r17;
    L70:
        return r17;
    L19:
        tl1 r21 = ze5.a;
        r9.d = -1;
        fr4 r22 = r9.c;
        r22.getClass();
        r22.e.remove(r9);
        r1.remove(r22);
        r22.d = r9;
        r6.add(r22);
        if (r5 == false) goto L22;
    L25:
        g5 r23 = this.j;
        r23.getClass();
        ((ThreadPoolExecutor) this.a.o).execute(r23);
    L26:
        return r9;
    L22:
        if (this.f == true) goto L26;
        if (r1.isEmpty() == true) goto L26;
    L16:
        r16 = r4;
        r17 = null;
        r5 = false;
        goto L17
    L5:
        return null;
    }

    public final void d(fr4 r3) {
        r3.getClass();
        tl1 r0 = ze5.a;
        if (r3.d != null) goto L11;
        boolean r1 = r3.e.isEmpty();
        ArrayList r2 = this.i;
        if (r1 == true) goto L9;
        byte[] r4 = xe5.a;
        r2.getClass();
        if (r2.contains(r3) == true) goto L11;
        r2.add(r3);
        goto L11
    L9:
        r2.remove(r3);
    L11:
        if (this.f == false) goto L14;
        this.d.signal();
        return;
    L14:
        g5 r5 = this.j;
        r5.getClass();
        ((ThreadPoolExecutor) this.a.o).execute(r5);
    }

    public final fr4 e() {
        ReentrantLock r0 = this.c;
        r0.lock();
        int r1 = this.e;     // Catch: Throwable -> L6
        this.e = r1 + 1;     // Catch: Throwable -> L6
        r0.unlock();
        return new fr4(this, f34.f(r1, "Q"));
    L6:
        th = move-exception;
        r0.unlock();
        throw th;
    }
}
