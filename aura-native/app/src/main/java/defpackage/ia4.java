package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
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
                    Object poll = this.p.poll();
                    Runnable runnable2 = (Runnable) poll;
                    this.q = runnable2;
                    if (poll != null) {
                        this.o.execute(runnable2);
                    }
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
                    } finally {
                    }
                }
                return;
            case 1:
                runnable.getClass();
                synchronized (this.r) {
                    this.p.offer(new ur2(runnable, this));
                    if (this.q == null) {
                        a();
                    }
                }
                return;
            default:
                synchronized (this.r) {
                    try {
                        this.p.add(new k6(2, this, runnable));
                        if (this.q == null) {
                            a();
                        }
                    } finally {
                    }
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
