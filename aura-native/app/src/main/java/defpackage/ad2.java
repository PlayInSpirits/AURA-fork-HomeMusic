package defpackage;

import android.os.Looper;
import java.util.Map;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class ad2 {
    public static final Object k = new Object();
    public final Object a;
    public final i44 b;
    public int c;
    public boolean d;
    public volatile Object e;
    public volatile Object f;
    public int g;
    public boolean h;
    public boolean i;
    public final g5 j;

    public ad2() {
        this.a = new Object();
        this.b = new i44();
        this.c = 0;
        Object obj = k;
        this.f = obj;
        this.j = new g5(18, this);
        this.e = obj;
        this.g = -1;
    }

    public static void a(String str) {
        ei.V().j.getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        kf2.o(xa3.h("Cannot invoke ", str, " on a background thread"));
    }

    public final void b(zc2 zc2Var) {
        if (zc2Var.o) {
            if (!zc2Var.e()) {
                zc2Var.a(false);
                return;
            }
            int i = zc2Var.p;
            int i2 = this.g;
            if (i >= i2) {
                return;
            }
            zc2Var.p = i2;
            zc2Var.n.b(this.e);
        }
    }

    public final void c(zc2 zc2Var) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (zc2Var != null) {
                b(zc2Var);
                zc2Var = null;
            } else {
                i44 i44Var = this.b;
                i44Var.getClass();
                g44 g44Var = new g44(i44Var);
                i44Var.p.put(g44Var, Boolean.FALSE);
                while (g44Var.hasNext()) {
                    b((zc2) ((Map.Entry) g44Var.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.h = false;
    }

    public final Object d() {
        Object obj = this.e;
        if (obj != k) {
            return obj;
        }
        return null;
    }

    public final void e(ba2 ba2Var, a83 a83Var) {
        a("observe");
        if (ba2Var.h().h == r92.n) {
            return;
        }
        yc2 yc2Var = new yc2(this, ba2Var, a83Var);
        zc2 zc2Var = (zc2) this.b.a(a83Var, yc2Var);
        if (zc2Var != null && !zc2Var.d(ba2Var)) {
            kf2.n("Cannot add the same observer with different lifecycles");
        } else {
            if (zc2Var != null) {
                return;
            }
            ba2Var.h().a(yc2Var);
        }
    }

    public final void f(a83 a83Var) {
        a("observeForever");
        xc2 xc2Var = new xc2(this, a83Var);
        zc2 zc2Var = (zc2) this.b.a(a83Var, xc2Var);
        if (zc2Var instanceof yc2) {
            kf2.n("Cannot add the same observer with different lifecycles");
        } else {
            if (zc2Var != null) {
                return;
            }
            xc2Var.a(true);
        }
    }

    public void i(Object obj) {
        boolean z;
        synchronized (this.a) {
            z = this.f == k;
            this.f = obj;
        }
        if (z) {
            ei.V().W(this.j);
        }
    }

    public void j(a83 a83Var) {
        a("removeObserver");
        zc2 zc2Var = (zc2) this.b.b(a83Var);
        if (zc2Var == null) {
            return;
        }
        zc2Var.c();
        zc2Var.a(false);
    }

    public void k(Object obj) {
        a("setValue");
        this.g++;
        this.e = obj;
        c(null);
    }

    public void g() {
    }

    public void h() {
    }

    public ad2(Object obj) {
        this.a = new Object();
        this.b = new i44();
        this.c = 0;
        this.f = k;
        this.j = new g5(18, this);
        this.e = obj;
        this.g = 0;
    }
}
