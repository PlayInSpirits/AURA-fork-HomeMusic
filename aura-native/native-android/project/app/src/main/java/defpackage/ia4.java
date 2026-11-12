package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ia4 implements Executor {
    public final /* synthetic */ int n;
    public final Executor o;
    public final ArrayDeque p;
    public Runnable q;
    public final Object r;

    public ia4(Executor executor, int i) {
        this.n = i;
        switch (i) {
            case 1:
                executor.getClass();
                this.o = executor;
                this.p = new ArrayDeque();
                this.r = new Object();
                break;
            default:
                this.o = executor;
                this.p = new ArrayDeque();
                this.r = new Object();
                break;
        }
    }

    public final void a() {
        switch (this.n) {
            case 0:
                Runnable runnable = (Runnable) this.p.poll();
                this.q = runnable;
                if (runnable != null) {
                    this.o.execute(runnable);
                    return;
                }
                return;
            case 1:
                synchronized (this.r) {
                    Object objPoll = this.p.poll();
                    Runnable runnable2 = (Runnable) objPoll;
                    this.q = runnable2;
                    if (objPoll != null) {
                        this.o.execute(runnable2);
                    }
                    break;
                }
                return;
            default:
                synchronized (this.r) {
                    try {
                        Runnable runnable3 = (Runnable) this.p.poll();
                        this.q = runnable3;
                        if (runnable3 != null) {
                            ((of) this.o).execute(runnable3);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.n) {
            case 0:
                synchronized (this.r) {
                    try {
                        this.p.add(new lg1(27, this, runnable));
                        if (this.q == null) {
                            a();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            case 1:
                runnable.getClass();
                synchronized (this.r) {
                    this.p.offer(new ur2(runnable, this));
                    if (this.q == null) {
                        a();
                    }
                    break;
                }
                return;
            default:
                synchronized (this.r) {
                    try {
                        this.p.add(new k6(2, this, runnable));
                        if (this.q == null) {
                            a();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
        }
    }

    public ia4(of ofVar) {
        this.n = 2;
        this.r = new Object();
        this.p = new ArrayDeque();
        this.o = ofVar;
    }
}
