package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class la2 extends pe0 implements ao0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater u = AtomicIntegerFieldUpdater.newUpdater(la2.class, "runningWorkers$volatile");
    public final /* synthetic */ ao0 p;
    public final pe0 q;
    public final int r;
    private volatile /* synthetic */ int runningWorkers$volatile;
    public final ae2 s;
    public final Object t;

    /* JADX WARN: Multi-variable type inference failed */
    public la2(pe0 pe0Var, int i) {
        ao0 ao0Var = pe0Var instanceof ao0 ? (ao0) pe0Var : null;
        this.p = ao0Var == null ? qk0.a : ao0Var;
        this.q = pe0Var;
        this.r = i;
        this.s = new ae2();
        this.t = new Object();
    }

    @Override // defpackage.ao0
    public final as0 F(long j, gu4 gu4Var, ne0 ne0Var) {
        return this.p.F(j, gu4Var, ne0Var);
    }

    @Override // defpackage.ao0
    public final void H(long j, cz czVar) {
        this.p.H(j, czVar);
    }

    @Override // defpackage.pe0
    public final void W(ne0 ne0Var, Runnable runnable) {
        Runnable runnableA0;
        this.s.a(runnable);
        if (u.get(this) >= this.r || !b0() || (runnableA0 = a0()) == null) {
            return;
        }
        this.q.W(this, new lg1(this, runnableA0, false, 17));
    }

    @Override // defpackage.pe0
    public final void X(ne0 ne0Var, Runnable runnable) {
        Runnable runnableA0;
        this.s.a(runnable);
        if (u.get(this) >= this.r || !b0() || (runnableA0 = a0()) == null) {
            return;
        }
        this.q.X(this, new lg1(this, runnableA0, false, 17));
    }

    public final Runnable a0() {
        while (true) {
            Runnable runnable = (Runnable) this.s.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.t) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = u;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.s.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean b0() {
        synchronized (this.t) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = u;
            if (atomicIntegerFieldUpdater.get(this) >= this.r) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // defpackage.pe0
    public final String toString() {
        return this.q + ".limitedParallelism(" + this.r + ')';
    }
}
