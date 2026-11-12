package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tc2 {
    public final Thread a;
    public final yp4 b;
    public final rc2 c;
    public final CopyOnWriteArraySet d;
    public final ArrayDeque e;
    public final ArrayDeque f;
    public final Object g;
    public boolean h;
    public boolean i;

    public tc2(CopyOnWriteArraySet r1, Looper r2, Thread r3, vp4 r4, rc2 r5, boolean r6) {
        this.a = r3;
        this.d = r1;
        this.c = r5;
        this.g = new Object();
        this.e = new ArrayDeque();
        this.f = new ArrayDeque();
        if (r2 == null) goto L7;
        if (r4 == null) goto L7;
        if (r5 == null) goto L7;
        this.b = r4.a(r2, new gt0(1, this));
    L8:
        this.i = r6;
        return;
    L7:
        this.b = null;
        goto L8
    }

    public final void a(Object r3) {
        r3.getClass();
        Object r0 = this.g;
        monitor-enter(r0);
    L8:
        th = move-exception;
        throw th;
    L5:
        if (this.h == false) goto L10;
        monitor-exit(r0);     // Catch: Throwable -> L8
        return;
    L10:
        this.d.add(new sc2(r3));     // Catch: Throwable -> L8
        monitor-exit(r0);     // Catch: Throwable -> L8
    }

    public final void b() {
        g();
        ArrayDeque r0 = this.f;
        if (r0.isEmpty() == false) goto L6;
        return;
    L6:
        if (this.c == null) goto L10;
        yp4 r1 = this.b;
        r1.getClass();
        Handler r2 = r1.a;
        if (r2.hasMessages(1) == true) goto L10;
        xp4 r3 = r1.a(1);
        Message r4 = r3.a;
        r4.getClass();
        r2.sendMessageAtFrontOfQueue(r4);
        r3.a();
    L10:
        ArrayDeque r5 = this.e;
        boolean r6 = r5.isEmpty();
        r5.addAll(r0);
        r0.clear();
        if (r6 == true) goto L14;
        return;
    L14:
        if (r5.isEmpty() == true) goto L19;
        ((Runnable) r5.peekFirst()).run();
        r5.removeFirst();
        goto L14
    }

    public final void c(int r4, qc2 r5) {
        g();
        gk r1 = new gk(new CopyOnWriteArraySet(this.d), r4, r5, 5);
        this.f.add(r1);
    }

    public final void d() {
        g();
        Object r0 = this.g;
        monitor-enter(r0);
        this.h = true;     // Catch: Throwable -> L17
        monitor-exit(r0);     // Catch: Throwable -> L17
        Iterator r1 = this.d.iterator();
    L9:
        if (r1.hasNext() == false) goto L15;
        sc2 r2 = (sc2) r1.next();
        rc2 r3 = this.c;
        r2.d = true;
        if (r3 == null) goto L9;
        if (r2.c == false) goto L9;
        r2.c = false;
        r3.f(r2.a, r2.b.f());
        goto L9
    L15:
        this.d.clear();
        return;
    L17:
        th = move-exception;
        throw th;
    }

    public final void e(oi3 r7) {
        g();
        CopyOnWriteArraySet r0 = this.d;
        Iterator r1 = r0.iterator();
    L4:
        if (r1.hasNext() == false) goto L13;
        sc2 r2 = (sc2) r1.next();
        if (r2.a.equals(r7) == false) goto L4;
        r2.d = true;
        rc2 r3 = this.c;
        if (r3 != null) goto L10;
    L12:
        r0.remove(r2);
        goto L4
    L10:
        if (r2.c == false) goto L12;
        r2.c = false;
        r3.f(r2.a, r2.b.f());
        goto L12
    }

    public final void f(int r1, qc2 r2) {
        c(r1, r2);
        b();
    }

    public final void g() {
        if (this.i == true) goto L6;
        return;
    L6:
        if (Thread.currentThread() != this.a) goto L8;
        boolean r1 = true;
    L9:
        rr2.w(r1);
        return;
    L8:
        r1 = false;
        goto L9
    }

    public tc2(Looper r8, vp4 r9, rc2 r10) {
        this(new CopyOnWriteArraySet(), r8, r8.getThread(), r9, r10, true);
    }

    public tc2(Thread r8) {
        this(new CopyOnWriteArraySet(), null, r8, null, null, true);
    }
}
