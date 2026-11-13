package defpackage;

import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class m11 implements r51 {
    public static final om0 J = new om0(25);
    public boolean A;
    public q04 B;
    public int C;
    public boolean D;
    public GlideException E;
    public boolean F;
    public o11 G;
    public xi0 H;
    public volatile boolean I;
    public final i11 p;
    public final io3 q;
    public final i11 s;
    public final li1 t;
    public final li1 u;
    public final li1 v;
    public n11 x;
    public boolean y;
    public boolean z;
    public final l11 n = new l11(new ArrayList(2));
    public final ul4 o = new ul4();
    public final AtomicInteger w = new AtomicInteger();
    public final om0 r = J;

    public m11(li1 li1Var, li1 li1Var2, li1 li1Var3, li1 li1Var4, i11 i11Var, i11 i11Var2, i61 i61Var) {
        this.t = li1Var;
        this.u = li1Var2;
        this.v = li1Var4;
        this.s = i11Var;
        this.p = i11Var2;
        this.q = i61Var;
    }

    public final synchronized void a(cf4 cf4Var, Executor executor) {
        try {
            this.o.a();
            this.n.n.add(new k11(cf4Var, executor));
            int i = 1;
            if (this.D) {
                d(1);
                executor.execute(new j11(this, cf4Var, i));
            } else if (this.F) {
                d(1);
                executor.execute(new j11(this, cf4Var, 0));
            } else {
                h12.d("Cannot add callbacks to a cancelled EngineJob", !this.I);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void b() {
        o11 o11Var;
        synchronized (this) {
            try {
                this.o.a();
                h12.d("Not yet complete!", e());
                int decrementAndGet = this.w.decrementAndGet();
                h12.d("Can't decrement below 0", decrementAndGet >= 0);
                if (decrementAndGet == 0) {
                    o11Var = this.G;
                    f();
                } else {
                    o11Var = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (o11Var != null) {
            o11Var.c();
        }
    }

    @Override // defpackage.r51
    public final ul4 c() {
        return this.o;
    }

    public final synchronized void d(int i) {
        o11 o11Var;
        h12.d("Not yet complete!", e());
        if (this.w.getAndAdd(i) == 0 && (o11Var = this.G) != null) {
            o11Var.a();
        }
    }

    public final boolean e() {
        return this.F || this.D || this.I;
    }

    public final synchronized void f() {
        boolean b;
        if (this.x == null) {
            throw new IllegalArgumentException();
        }
        this.n.n.clear();
        this.x = null;
        this.G = null;
        this.B = null;
        this.F = false;
        this.I = false;
        this.D = false;
        xi0 xi0Var = this.H;
        yl ylVar = xi0Var.t;
        synchronized (ylVar) {
            ylVar.a = true;
            b = ylVar.b();
        }
        if (b) {
            xi0Var.k();
        }
        this.H = null;
        this.E = null;
        this.C = 0;
        this.q.a(this);
    }

    public final synchronized void g(cf4 cf4Var) {
        try {
            this.o.a();
            this.n.n.remove(new k11(cf4Var, fh0.h));
            if (this.n.n.isEmpty()) {
                if (!e()) {
                    this.I = true;
                    xi0 xi0Var = this.H;
                    xi0Var.O = true;
                    uh0 uh0Var = xi0Var.M;
                    if (uh0Var != null) {
                        uh0Var.cancel();
                    }
                    i11 i11Var = this.s;
                    n11 n11Var = this.x;
                    synchronized (i11Var) {
                        gp3 gp3Var = i11Var.a;
                        gp3Var.getClass();
                        HashMap hashMap = (HashMap) (this.A ? gp3Var.p : gp3Var.o);
                        if (this == hashMap.get(n11Var)) {
                            hashMap.remove(n11Var);
                        }
                    }
                }
                if (!this.D) {
                    if (this.F) {
                    }
                }
                if (this.w.get() == 0) {
                    f();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
