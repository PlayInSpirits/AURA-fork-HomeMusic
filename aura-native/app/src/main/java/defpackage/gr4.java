package defpackage;

import java.util.ArrayList;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Logger;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class gr4 {
    public static final Logger k;
    public static final gr4 l;
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
        Logger logger = Logger.getLogger(gr4.class.getName());
        logger.getClass();
        k = logger;
        l = new gr4(new rm2(new ye5(b11.q(new StringBuilder(), ze5.c, " TaskRunner"), true)));
    }

    public gr4(rm2 rm2Var) {
        Logger logger = k;
        logger.getClass();
        this.a = rm2Var;
        this.b = logger;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.c = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        newCondition.getClass();
        this.d = newCondition;
        this.e = 10000;
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new g5(29, this);
    }

    public static final void a(gr4 gr4Var, ar4 ar4Var) {
        ReentrantLock reentrantLock = gr4Var.c;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(ar4Var.a);
        try {
            long a = ar4Var.a();
            reentrantLock.lock();
            try {
                gr4Var.b(ar4Var, a);
                reentrantLock.unlock();
                currentThread.setName(name);
            } finally {
            }
        } catch (Throwable th) {
            reentrantLock.lock();
            try {
                gr4Var.b(ar4Var, -1L);
                reentrantLock.unlock();
                currentThread.setName(name);
                throw th;
            } finally {
            }
        }
    }

    public final void b(ar4 ar4Var, long j) {
        tl1 tl1Var = ze5.a;
        fr4 fr4Var = ar4Var.c;
        fr4Var.getClass();
        if (fr4Var.d != ar4Var) {
            kf2.o("Check failed.");
            return;
        }
        boolean z = fr4Var.f;
        fr4Var.f = false;
        fr4Var.d = null;
        this.h.remove(fr4Var);
        if (j != -1 && !z && !fr4Var.c) {
            fr4Var.f(ar4Var, j, true);
        }
        if (fr4Var.e.isEmpty()) {
            return;
        }
        this.i.add(fr4Var);
    }

    public final ar4 c() {
        long j;
        ar4 ar4Var;
        boolean z;
        tl1 tl1Var = ze5.a;
        while (true) {
            ArrayList arrayList = this.i;
            if (arrayList.isEmpty()) {
                return null;
            }
            long nanoTime = System.nanoTime();
            int size = arrayList.size();
            long j2 = Long.MAX_VALUE;
            int i = 0;
            ar4 ar4Var2 = null;
            while (true) {
                if (i >= size) {
                    j = nanoTime;
                    ar4Var = null;
                    z = false;
                    break;
                }
                Object obj = arrayList.get(i);
                i++;
                ar4 ar4Var3 = (ar4) ((fr4) obj).e.get(0);
                j = nanoTime;
                ar4Var = null;
                long max = Math.max(0L, ar4Var3.d - j);
                if (max > 0) {
                    j2 = Math.min(max, j2);
                } else {
                    if (ar4Var2 != null) {
                        z = true;
                        break;
                    }
                    ar4Var2 = ar4Var3;
                }
                nanoTime = j;
            }
            ArrayList arrayList2 = this.h;
            if (ar4Var2 != null) {
                tl1 tl1Var2 = ze5.a;
                ar4Var2.d = -1L;
                fr4 fr4Var = ar4Var2.c;
                fr4Var.getClass();
                fr4Var.e.remove(ar4Var2);
                arrayList.remove(fr4Var);
                fr4Var.d = ar4Var2;
                arrayList2.add(fr4Var);
                if (z || (!this.f && !arrayList.isEmpty())) {
                    g5 g5Var = this.j;
                    g5Var.getClass();
                    ((ThreadPoolExecutor) this.a.o).execute(g5Var);
                }
                return ar4Var2;
            }
            boolean z2 = this.f;
            Condition condition = this.d;
            if (z2) {
                if (j2 >= this.g - j) {
                    return ar4Var;
                }
                condition.signal();
                return ar4Var;
            }
            this.f = true;
            this.g = j + j2;
            try {
                try {
                    tl1 tl1Var3 = ze5.a;
                    if (j2 > 0) {
                        condition.awaitNanos(j2);
                    }
                } catch (InterruptedException unused) {
                    tl1 tl1Var4 = ze5.a;
                    for (int size2 = arrayList2.size() - 1; -1 < size2; size2--) {
                        ((fr4) arrayList2.get(size2)).b();
                    }
                    for (int size3 = arrayList.size() - 1; -1 < size3; size3--) {
                        fr4 fr4Var2 = (fr4) arrayList.get(size3);
                        fr4Var2.b();
                        if (fr4Var2.e.isEmpty()) {
                            arrayList.remove(size3);
                        }
                    }
                }
            } finally {
                this.f = false;
            }
        }
    }

    public final void d(fr4 fr4Var) {
        fr4Var.getClass();
        tl1 tl1Var = ze5.a;
        if (fr4Var.d == null) {
            boolean isEmpty = fr4Var.e.isEmpty();
            ArrayList arrayList = this.i;
            if (isEmpty) {
                arrayList.remove(fr4Var);
            } else {
                byte[] bArr = xe5.a;
                arrayList.getClass();
                if (!arrayList.contains(fr4Var)) {
                    arrayList.add(fr4Var);
                }
            }
        }
        if (this.f) {
            this.d.signal();
            return;
        }
        g5 g5Var = this.j;
        g5Var.getClass();
        ((ThreadPoolExecutor) this.a.o).execute(g5Var);
    }

    public final fr4 e() {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            int i = this.e;
            this.e = i + 1;
            reentrantLock.unlock();
            return new fr4(this, f34.f(i, "Q"));
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
