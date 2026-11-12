package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
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

    public tc2(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, Thread thread, vp4 vp4Var, rc2 rc2Var, boolean z) {
        this.a = thread;
        this.d = copyOnWriteArraySet;
        this.c = rc2Var;
        this.g = new Object();
        this.e = new ArrayDeque();
        this.f = new ArrayDeque();
        if (looper == null || vp4Var == null || rc2Var == null) {
            this.b = null;
        } else {
            this.b = vp4Var.a(looper, new gt0(1, this));
        }
        this.i = z;
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.g) {
            try {
                if (this.h) {
                    return;
                }
                this.d.add(new sc2(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        g();
        ArrayDeque arrayDeque = this.f;
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (this.c != null) {
            yp4 yp4Var = this.b;
            yp4Var.getClass();
            Handler handler = yp4Var.a;
            if (!handler.hasMessages(1)) {
                xp4 xp4VarA = yp4Var.a(1);
                Message message = xp4VarA.a;
                message.getClass();
                handler.sendMessageAtFrontOfQueue(message);
                xp4VarA.a();
            }
        }
        ArrayDeque arrayDeque2 = this.e;
        boolean zIsEmpty = arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (zIsEmpty) {
            while (!arrayDeque2.isEmpty()) {
                ((Runnable) arrayDeque2.peekFirst()).run();
                arrayDeque2.removeFirst();
            }
        }
    }

    public final void c(int i, qc2 qc2Var) {
        g();
        this.f.add(new gk(new CopyOnWriteArraySet(this.d), i, qc2Var, 5));
    }

    public final void d() {
        g();
        synchronized (this.g) {
            this.h = true;
        }
        for (sc2 sc2Var : this.d) {
            rc2 rc2Var = this.c;
            sc2Var.d = true;
            if (rc2Var != null && sc2Var.c) {
                sc2Var.c = false;
                rc2Var.f(sc2Var.a, sc2Var.b.f());
            }
        }
        this.d.clear();
    }

    public final void e(oi3 oi3Var) {
        g();
        CopyOnWriteArraySet<sc2> copyOnWriteArraySet = this.d;
        for (sc2 sc2Var : copyOnWriteArraySet) {
            if (sc2Var.a.equals(oi3Var)) {
                sc2Var.d = true;
                rc2 rc2Var = this.c;
                if (rc2Var != null && sc2Var.c) {
                    sc2Var.c = false;
                    rc2Var.f(sc2Var.a, sc2Var.b.f());
                }
                copyOnWriteArraySet.remove(sc2Var);
            }
        }
    }

    public final void f(int i, qc2 qc2Var) {
        c(i, qc2Var);
        b();
    }

    public final void g() {
        if (this.i) {
            rr2.w(Thread.currentThread() == this.a);
        }
    }

    public tc2(Looper looper, vp4 vp4Var, rc2 rc2Var) {
        this(new CopyOnWriteArraySet(), looper, looper.getThread(), vp4Var, rc2Var, true);
    }

    public tc2(Thread thread) {
        this(new CopyOnWriteArraySet(), null, thread, null, null, true);
    }
}
