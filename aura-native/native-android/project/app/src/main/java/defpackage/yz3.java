package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Looper;
import com.bumptech.glide.load.engine.GlideException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yz3 implements zz3, Future, wq4 {
    public final int n;
    public final int o;
    public Object p;
    public pz3 q;
    public boolean r;
    public boolean s;
    public boolean t;
    public GlideException u;

    public yz3(int i, int i2) {
        this.n = i;
        this.o = i2;
    }

    @Override // defpackage.zz3
    public final synchronized boolean a(GlideException glideException) {
        this.t = true;
        this.u = glideException;
        notifyAll();
        return false;
    }

    @Override // defpackage.wq4
    public final void b(cf4 cf4Var) {
    }

    @Override // defpackage.wq4
    public final synchronized void c(Object obj, cx4 cx4Var) {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        synchronized (this) {
            try {
                if (isDone()) {
                    return false;
                }
                this.r = true;
                notifyAll();
                pz3 pz3Var = null;
                if (z) {
                    pz3 pz3Var2 = this.q;
                    this.q = null;
                    pz3Var = pz3Var2;
                }
                if (pz3Var != null) {
                    pz3Var.clear();
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.wq4
    public final void d(cf4 cf4Var) {
        cf4Var.m(this.n, this.o);
    }

    @Override // defpackage.wq4
    public final synchronized void e(pz3 pz3Var) {
        this.q = pz3Var;
    }

    @Override // defpackage.zz3
    public final synchronized void g(Object obj) {
        this.s = true;
        this.p = obj;
        notifyAll();
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        try {
            return o(null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.z92
    public final void h() {
    }

    @Override // defpackage.wq4
    public final synchronized void i(Drawable drawable) {
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isCancelled() {
        return this.r;
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isDone() {
        return this.r || this.s || this.t;
    }

    @Override // defpackage.z92
    public final void j() {
    }

    @Override // defpackage.wq4
    public final void k(Drawable drawable) {
    }

    @Override // defpackage.wq4
    public final synchronized pz3 l() {
        return this.q;
    }

    @Override // defpackage.wq4
    public final void m(Drawable drawable) {
    }

    @Override // defpackage.z92
    public final void n() {
    }

    public final synchronized Object o(Long l) {
        if (!isDone()) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                throw new IllegalArgumentException("You must call this method on a background thread");
            }
        }
        if (this.r) {
            throw new CancellationException();
        }
        if (this.t) {
            throw new ExecutionException(this.u);
        }
        if (this.s) {
            return this.p;
        }
        if (l == null) {
            wait(0L);
        } else if (l.longValue() > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jLongValue = l.longValue() + jCurrentTimeMillis;
            while (!isDone() && jCurrentTimeMillis < jLongValue) {
                wait(jLongValue - jCurrentTimeMillis);
                jCurrentTimeMillis = System.currentTimeMillis();
            }
        }
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        if (this.t) {
            throw new ExecutionException(this.u);
        }
        if (this.r) {
            throw new CancellationException();
        }
        if (this.s) {
            return this.p;
        }
        throw new TimeoutException();
    }

    public final String toString() {
        pz3 pz3Var;
        String str;
        String strQ = b11.q(new StringBuilder(), super.toString(), "[status=");
        synchronized (this) {
            try {
                pz3Var = null;
                if (this.r) {
                    str = "CANCELLED";
                } else if (this.t) {
                    str = "FAILURE";
                } else if (this.s) {
                    str = "SUCCESS";
                } else {
                    str = "PENDING";
                    pz3Var = this.q;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (pz3Var == null) {
            return b11.o(strQ, str, "]");
        }
        return strQ + str + ", request=[" + pz3Var + "]]";
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return o(Long.valueOf(timeUnit.toMillis(j)));
    }
}
