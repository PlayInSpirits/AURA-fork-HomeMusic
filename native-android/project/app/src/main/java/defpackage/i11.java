package defpackage;

import android.os.SystemClock;
import android.util.Log;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class i11 {
    public static final boolean h = Log.isLoggable("Engine", 2);
    public final gp3 a;
    public final om0 b;
    public final pf2 c;
    public final lv4 d;
    public final xk0 e;
    public final ue1 f;
    public final ns3 g;

    public i11(pf2 pf2Var, e20 e20Var, li1 li1Var, li1 li1Var2, li1 li1Var3, li1 li1Var4) throws Throwable {
        this.c = pf2Var;
        sd0 sd0Var = new sd0(e20Var);
        ns3 ns3Var = new ns3(1);
        this.g = ns3Var;
        synchronized (this) {
            try {
                try {
                    synchronized (ns3Var) {
                        try {
                            ns3Var.q = this;
                        } catch (Throwable th) {
                            th = th;
                            while (true) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                        }
                    }
                    this.b = new om0(26);
                    this.a = new gp3(12);
                    this.d = new lv4(li1Var, li1Var2, li1Var3, li1Var4, this, this);
                    this.f = new ue1(sd0Var);
                    this.e = new xk0(6);
                    pf2Var.d = this;
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                throw th;
            }
        }
    }

    public static void c(String str, long j, n11 n11Var) {
        StringBuilder sbS = b11.s(str, " in ");
        sbS.append(ee2.a(j));
        sbS.append("ms, key: ");
        sbS.append(n11Var);
        Log.v("Engine", sbS.toString());
    }

    public static void f(q04 q04Var) {
        if (q04Var instanceof o11) {
            ((o11) q04Var).c();
        } else {
            kf2.n("Cannot release anything but an EngineResource");
        }
    }

    public final z05 a(ii1 ii1Var, Object obj, f42 f42Var, int i, int i2, Class cls, Class cls2, eq3 eq3Var, xq0 xq0Var, yx yxVar, boolean z, boolean z2, db3 db3Var, boolean z3, boolean z4, boolean z5, cf4 cf4Var, Executor executor) {
        long jElapsedRealtimeNanos;
        if (h) {
            int i3 = ee2.b;
            jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        } else {
            jElapsedRealtimeNanos = 0;
        }
        this.b.getClass();
        n11 n11Var = new n11(obj, f42Var, i, i2, yxVar, cls, cls2, db3Var);
        synchronized (this) {
            try {
                o11 o11VarB = b(n11Var, z3, jElapsedRealtimeNanos);
                if (o11VarB == null) {
                    return g(ii1Var, obj, f42Var, i, i2, cls, cls2, eq3Var, xq0Var, yxVar, z, z2, db3Var, z3, z4, z5, cf4Var, executor, n11Var, jElapsedRealtimeNanos);
                }
                cf4Var.i(o11VarB, 5);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final o11 b(n11 n11Var, boolean z, long j) {
        o11 o11Var;
        Object obj;
        i11 i11Var;
        n11 n11Var2;
        o11 o11Var2;
        if (z) {
            ns3 ns3Var = this.g;
            synchronized (ns3Var) {
                i5 i5Var = (i5) ((HashMap) ns3Var.o).get(n11Var);
                if (i5Var == null) {
                    o11Var = null;
                } else {
                    o11Var = (o11) i5Var.get();
                    if (o11Var == null) {
                        ns3Var.b(i5Var);
                    }
                }
            }
            if (o11Var != null) {
                o11Var.a();
            }
            if (o11Var != null) {
                if (h) {
                    c("Loaded resource from active resources", j, n11Var);
                }
                return o11Var;
            }
            pf2 pf2Var = this.c;
            synchronized (pf2Var) {
                of2 of2Var = (of2) ((LinkedHashMap) pf2Var.c).remove(n11Var);
                if (of2Var == null) {
                    obj = null;
                } else {
                    pf2Var.b -= (long) of2Var.b;
                    obj = of2Var.a;
                }
            }
            q04 q04Var = (q04) obj;
            if (q04Var == null) {
                i11Var = this;
                n11Var2 = n11Var;
                o11Var2 = null;
            } else if (q04Var instanceof o11) {
                o11Var2 = (o11) q04Var;
                i11Var = this;
                n11Var2 = n11Var;
            } else {
                i11Var = this;
                n11Var2 = n11Var;
                o11Var2 = new o11(q04Var, true, true, n11Var2, i11Var);
            }
            if (o11Var2 != null) {
                o11Var2.a();
                i11Var.g.a(n11Var2, o11Var2);
            }
            if (o11Var2 != null) {
                if (h) {
                    c("Loaded resource from cache", j, n11Var2);
                }
                return o11Var2;
            }
        }
        return null;
    }

    public final synchronized void d(m11 m11Var, n11 n11Var, o11 o11Var) {
        if (o11Var != null) {
            try {
                if (o11Var.n) {
                    this.g.a(n11Var, o11Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        gp3 gp3Var = this.a;
        gp3Var.getClass();
        HashMap map = (HashMap) (m11Var.A ? gp3Var.p : gp3Var.o);
        if (m11Var == map.get(n11Var)) {
            map.remove(n11Var);
        }
    }

    public final void e(f42 f42Var, o11 o11Var) {
        ns3 ns3Var = this.g;
        synchronized (ns3Var) {
            i5 i5Var = (i5) ((HashMap) ns3Var.o).remove(f42Var);
            if (i5Var != null) {
                i5Var.c = null;
                i5Var.clear();
            }
        }
        if (o11Var.n) {
        } else {
            this.e.k(o11Var, false);
        }
    }

    public final z05 g(ii1 ii1Var, Object obj, f42 f42Var, int i, int i2, Class cls, Class cls2, eq3 eq3Var, xq0 xq0Var, Map map, boolean z, boolean z2, db3 db3Var, boolean z3, boolean z4, boolean z5, cf4 cf4Var, Executor executor, n11 n11Var, long j) {
        li1 li1Var;
        gp3 gp3Var = this.a;
        m11 m11Var = (m11) ((HashMap) (z5 ? gp3Var.p : gp3Var.o)).get(n11Var);
        if (m11Var != null) {
            m11Var.a(cf4Var, executor);
            if (h) {
                c("Added to existing load", j, n11Var);
            }
            return new z05(this, cf4Var, m11Var);
        }
        m11 m11Var2 = (m11) ((i61) this.d.t).b();
        synchronized (m11Var2) {
            m11Var2.x = n11Var;
            m11Var2.y = z3;
            m11Var2.z = z4;
            m11Var2.A = z5;
        }
        ue1 ue1Var = this.f;
        xi0 xi0Var = (xi0) ((i61) ue1Var.q).b();
        int i3 = ue1Var.o;
        ue1Var.o = i3 + 1;
        wi0 wi0Var = xi0Var.n;
        sd0 sd0Var = xi0Var.q;
        wi0Var.c = ii1Var;
        wi0Var.d = obj;
        wi0Var.n = f42Var;
        wi0Var.e = i;
        wi0Var.f = i2;
        wi0Var.p = xq0Var;
        wi0Var.g = cls;
        wi0Var.h = sd0Var;
        wi0Var.k = cls2;
        wi0Var.o = eq3Var;
        wi0Var.i = db3Var;
        wi0Var.j = map;
        wi0Var.q = z;
        wi0Var.r = z2;
        xi0Var.u = ii1Var;
        xi0Var.v = f42Var;
        xi0Var.w = eq3Var;
        xi0Var.x = n11Var;
        xi0Var.y = i;
        xi0Var.z = i2;
        xi0Var.A = xq0Var;
        xi0Var.F = z5;
        xi0Var.B = db3Var;
        xi0Var.C = m11Var2;
        xi0Var.D = i3;
        xi0Var.R = 1;
        xi0Var.G = obj;
        gp3 gp3Var2 = this.a;
        gp3Var2.getClass();
        ((HashMap) (m11Var2.A ? gp3Var2.p : gp3Var2.o)).put(n11Var, m11Var2);
        m11Var2.a(cf4Var, executor);
        synchronized (m11Var2) {
            m11Var2.H = xi0Var;
            int iH = xi0Var.h(1);
            if (iH == 2 || iH == 3) {
                li1Var = m11Var2.t;
            } else {
                li1Var = m11Var2.z ? m11Var2.v : m11Var2.u;
            }
            li1Var.execute(xi0Var);
        }
        if (h) {
            c("Started new load", j, n11Var);
        }
        return new z05(this, cf4Var, m11Var2);
    }
}
