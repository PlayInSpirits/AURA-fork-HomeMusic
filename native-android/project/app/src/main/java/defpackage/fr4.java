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

    public fr4(gr4 gr4Var, String str) {
        this.a = gr4Var;
        this.b = str;
        new ReentrantLock();
        this.e = new ArrayList();
    }

    public static void c(fr4 fr4Var, String str, gf1 gf1Var) {
        fr4Var.getClass();
        str.getClass();
        gf1Var.getClass();
        fr4Var.d(new gr0(str, gf1Var), 0L);
    }

    public final void a() {
        tl1 tl1Var = ze5.a;
        gr4 gr4Var = this.a;
        ReentrantLock reentrantLock = gr4Var.c;
        reentrantLock.lock();
        try {
            if (b()) {
                gr4Var.d(this);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean b() {
        ar4 ar4Var = this.d;
        if (ar4Var != null && ar4Var.b) {
            this.f = true;
        }
        ArrayList arrayList = this.e;
        boolean z = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((ar4) arrayList.get(size)).b) {
                Logger logger = this.a.b;
                ar4 ar4Var2 = (ar4) arrayList.get(size);
                if (logger.isLoggable(Level.FINE)) {
                    zz1.c(logger, ar4Var2, this, "canceled");
                }
                arrayList.remove(size);
                z = true;
            }
        }
        return z;
    }

    public final void d(ar4 ar4Var, long j) {
        ar4Var.getClass();
        gr4 gr4Var = this.a;
        ReentrantLock reentrantLock = gr4Var.c;
        reentrantLock.lock();
        try {
            if (!this.c) {
                if (f(ar4Var, j, false)) {
                    gr4Var.d(this);
                }
                reentrantLock.unlock();
                return;
            }
            boolean z = ar4Var.b;
            Logger logger = gr4Var.b;
            if (!z) {
                if (logger.isLoggable(Level.FINE)) {
                    zz1.c(logger, ar4Var, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
            if (logger.isLoggable(Level.FINE)) {
                zz1.c(logger, ar4Var, this, "schedule canceled (queue is shutdown)");
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0041 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0043  */
    /* JADX WARN: Code duplicated, block: B:20:0x004f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0065  */
    /* JADX WARN: Code duplicated, block: B:27:0x0075 A[LOOP:0: B:23:0x0063->B:27:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x007b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0084 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x0078 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0079 A[EDGE_INSN: B:39:0x0079->B:29:0x0079 BREAK  A[LOOP:0: B:23:0x0063->B:27:0x0075], SYNTHETIC] */
    public final boolean f(ar4 ar4Var, long j, boolean z) {
        int size;
        int size2;
        int i;
        Object obj;
        String strConcat;
        Logger logger = this.a.b;
        ar4Var.getClass();
        fr4 fr4Var = ar4Var.c;
        if (fr4Var != this) {
            if (fr4Var != null) {
                kf2.o("task is in multiple queues");
                return false;
            }
            ar4Var.c = this;
        }
        long jNanoTime = System.nanoTime();
        long j2 = jNanoTime + j;
        ArrayList arrayList = this.e;
        int iIndexOf = arrayList.indexOf(ar4Var);
        if (iIndexOf == -1) {
            ar4Var.d = j2;
            if (logger.isLoggable(Level.FINE)) {
                if (z) {
                    strConcat = "run again after ".concat(zz1.n(j2 - jNanoTime));
                } else {
                    strConcat = "scheduled after ".concat(zz1.n(j2 - jNanoTime));
                }
                zz1.c(logger, ar4Var, this, strConcat);
            }
            size = arrayList.size();
            size2 = 0;
            i = 0;
            while (true) {
                if (i < size) {
                    size2 = -1;
                    break;
                }
                obj = arrayList.get(i);
                i++;
                if (((ar4) obj).d - jNanoTime > j) {
                    break;
                }
                size2++;
            }
            if (size2 == -1) {
                size2 = arrayList.size();
            }
            arrayList.add(size2, ar4Var);
            if (size2 == 0) {
                return true;
            }
        } else if (ar4Var.d > j2) {
            arrayList.remove(iIndexOf);
            ar4Var.d = j2;
            if (logger.isLoggable(Level.FINE)) {
                if (z) {
                    strConcat = "run again after ".concat(zz1.n(j2 - jNanoTime));
                } else {
                    strConcat = "scheduled after ".concat(zz1.n(j2 - jNanoTime));
                }
                zz1.c(logger, ar4Var, this, strConcat);
            }
            size = arrayList.size();
            size2 = 0;
            i = 0;
            while (true) {
                if (i < size) {
                    size2 = -1;
                    break;
                }
                obj = arrayList.get(i);
                i++;
                if (((ar4) obj).d - jNanoTime > j) {
                    break;
                    break;
                }
                size2++;
            }
            if (size2 == -1) {
                size2 = arrayList.size();
            }
            arrayList.add(size2, ar4Var);
            if (size2 == 0) {
                return true;
            }
        } else if (logger.isLoggable(Level.FINE)) {
            zz1.c(logger, ar4Var, this, "already scheduled");
            return false;
        }
        return false;
    }

    public final void g() {
        tl1 tl1Var = ze5.a;
        gr4 gr4Var = this.a;
        ReentrantLock reentrantLock = gr4Var.c;
        reentrantLock.lock();
        try {
            this.c = true;
            if (b()) {
                gr4Var.d(this);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final String toString() {
        return this.b;
    }
}
