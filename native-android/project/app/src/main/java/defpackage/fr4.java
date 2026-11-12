package defpackage;

import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fr4 {
    public final gr4 a;
    public final String b;
    public boolean c;
    public ar4 d;
    public final ArrayList e;
    public boolean f;

    public fr4(gr4 r1, String r2) {
        this.a = r1;
        this.b = r2;
        new ReentrantLock();
        this.e = new ArrayList();
    }

    public static void c(fr4 r1, String r2, gf1 r3) {
        r1.getClass();
        r2.getClass();
        r3.getClass();
        r1.d(new gr0(r2, r3), 0);
    }

    public static /* synthetic */ void e(fr4 r2, ar4 r3) {
        r2.d(r3, 0);
    }

    public final void a() {
        tl1 r0 = ze5.a;
        gr4 r1 = this.a;
        ReentrantLock r2 = r1.c;
        r2.lock();
    L7:
        th = move-exception;
        r2.unlock();
        throw th;
    L4:
        if (b() == false) goto L9;
        r1.d(this);     // Catch: Throwable -> L7
    L9:
        r2.unlock();
    }

    public final boolean b() {
        ar4 r0 = this.d;
        if (r0 != null) goto L5;
    L7:
        ArrayList r1 = this.e;
        int r2 = r1.size() - 1;
        boolean r3 = false;
    L9:
        if ((-1) >= r2) goto L17;
        if (((ar4) r1.get(r2)).b == false) goto L16;
        Logger r4 = this.a.b;
        ar4 r5 = (ar4) r1.get(r2);
        if (r4.isLoggable(Level.FINE) == false) goto L15;
        zz1.c(r4, r5, this, "canceled");
    L15:
        r1.remove(r2);
        r3 = true;
    L16:
        r2 = r2 - 1;
        goto L9
    L17:
        return r3;
    L5:
        if (r0.b == false) goto L7;
        this.f = true;
        goto L7
    }

    public final void d(ar4 r4, long r5) {
        r4.getClass();
        gr4 r0 = this.a;
        ReentrantLock r1 = r0.c;
        r1.lock();
    L12:
        th = move-exception;
        r1.unlock();
        throw th;
    L4:
        if (this.c == false) goto L22;
        boolean r6 = r4.b;     // Catch: Throwable -> L12
        Logger r7 = r0.b;
        if (r6 == false) goto L17;
        if (r7.isLoggable(Level.FINE) == false) goto L14;
        zz1.c(r7, r4, this, "schedule canceled (queue is shutdown)");     // Catch: Throwable -> L12
    L14:
        r1.unlock();
        return;
    L17:
        if (r7.isLoggable(Level.FINE) == false) goto L20;
        zz1.c(r7, r4, this, "schedule failed (queue is shutdown)");     // Catch: Throwable -> L12
    L20:
        throw new RejectedExecutionException();     // Catch: Throwable -> L12
    L22:
        if (f(r4, r5, false) == false) goto L24;
        r0.d(this);     // Catch: Throwable -> L12
    L24:
        r1.unlock();
    }

    public final boolean f(ar4 r12, long r13, boolean r15) {
        Logger r0 = this.a.b;
        r12.getClass();
        fr4 r1 = r12.c;
        if (r1 == this) goto L7;
        if (r1 != null) goto L36;
        r12.c = this;
        goto L7
    L36:
        kf2.o("task is in multiple queues");
        return false;
    L7:
        long r3 = System.nanoTime();
        long r5 = r3 + r13;
        ArrayList r2 = this.e;
        int r7 = r2.indexOf(r12);
        if (r7 != (-1)) goto L10;
    L16:
        r12.d = r5;
        if (r0.isLoggable(Level.FINE) == false) goto L22;
        if (r15 == false) goto L20;
        String r16 = "run again after ".concat(zz1.n(r5 - r3));
    L21:
        zz1.c(r0, r12, this, r16);
        goto L22
    L20:
        r16 = "scheduled after ".concat(zz1.n(r5 - r3));
    L22:
        int r11 = r2.size();
        int r17 = 0;
        int r4 = 0;
    L23:
        if (r4 >= r11) goto L28;
        Object r6 = r2.get(r4);
        r4 = r4 + 1;
        if ((((ar4) r6).d - r3) > r13) goto L29;
        r17 = r17 + 1;
    L29:
        if (r17 != (-1)) goto L31;
        r17 = r2.size();
    L31:
        r2.add(r17, r12);
        if (r17 != 0) goto L35;
        return true;
    L35:
        return false;
    L28:
        r17 = -1;
        goto L29
    L10:
        if (r12.d <= r5) goto L12;
        r2.remove(r7);
        goto L16
    L12:
        if (r0.isLoggable(Level.FINE) == false) goto L35;
        zz1.c(r0, r12, this, "already scheduled");
        return false;
    }

    public final void g() {
        tl1 r0 = ze5.a;
        gr4 r1 = this.a;
        ReentrantLock r2 = r1.c;
        r2.lock();
        this.c = true;     // Catch: Throwable -> L7
        if (b() == false) goto L9;
        r1.d(this);     // Catch: Throwable -> L7
    L9:
        r2.unlock();
        return;
    L7:
        th = move-exception;
        r2.unlock();
        throw th;
    }

    public final String toString() {
        return this.b;
    }
}
