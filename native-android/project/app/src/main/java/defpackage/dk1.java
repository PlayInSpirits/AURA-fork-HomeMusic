package defpackage;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dk1 implements a64, c93, w21 {
    public static final String B = cx.i("GreedyScheduler");
    public final na4 A;
    public final Context n;
    public final do0 p;
    public boolean q;
    public final pq3 t;
    public final rm3 u;
    public final r90 v;
    public Boolean x;
    public final c52 y;
    public final bq4 z;
    public final HashMap o = new HashMap();
    public final Object r = new Object();
    public final qr2 s = new qr2(new nh0(1));
    public final HashMap w = new HashMap();

    public dk1(Context context, r90 r90Var, z40 z40Var, pq3 pq3Var, rm3 rm3Var, bq4 bq4Var) {
        this.n = context;
        hg3 hg3Var = r90Var.g;
        this.p = new do0(this, hg3Var, r90Var.d);
        hg3Var.getClass();
        na4 na4Var = new na4();
        na4Var.n = hg3Var;
        na4Var.o = rm3Var;
        na4Var.p = new Object();
        na4Var.q = new LinkedHashMap();
        this.A = na4Var;
        this.z = bq4Var;
        this.y = new c52(z40Var);
        this.v = r90Var;
        this.t = pq3Var;
        this.u = rm3Var;
    }

    @Override // defpackage.c93
    public final void a(dd5 dd5Var, tc0 tc0Var) {
        rc5 rc5VarM = q05.m(dd5Var);
        boolean z = tc0Var instanceof rc0;
        rm3 rm3Var = this.u;
        na4 na4Var = this.A;
        String str = B;
        qr2 qr2Var = this.s;
        if (z) {
            if (qr2Var.e(rc5VarM)) {
                return;
            }
            cx.f().b(str, "Constraints met: Scheduling work ID " + rc5VarM);
            gl4 gl4VarW = qr2Var.w(rc5VarM);
            na4Var.R(gl4VarW);
            rm3Var.getClass();
            rm3Var.Q(gl4VarW, null);
            return;
        }
        cx.f().b(str, "Constraints not met: Cancelling work ID " + rc5VarM);
        gl4 gl4VarS = qr2Var.s(rc5VarM);
        if (gl4VarS != null) {
            na4Var.i(gl4VarS);
            int i = ((sc0) tc0Var).a;
            rm3Var.getClass();
            rm3Var.R(gl4VarS, i);
        }
    }

    @Override // defpackage.w21
    public final void b(rc5 rc5Var, boolean z) {
        s22 s22Var;
        gl4 gl4VarS = this.s.s(rc5Var);
        if (gl4VarS != null) {
            this.A.i(gl4VarS);
        }
        synchronized (this.r) {
            s22Var = (s22) this.o.remove(rc5Var);
        }
        if (s22Var != null) {
            cx.f().b(B, "Stopping tracking for " + rc5Var);
            s22Var.f(null);
        }
        if (z) {
            return;
        }
        synchronized (this.r) {
            this.w.remove(rc5Var);
        }
    }

    @Override // defpackage.a64
    public final boolean c() {
        return false;
    }

    @Override // defpackage.a64
    public final void d(String str) {
        Runnable runnable;
        if (this.x == null) {
            this.x = Boolean.valueOf(nq3.a(this.n, this.v));
        }
        boolean zBooleanValue = this.x.booleanValue();
        String str2 = B;
        if (!zBooleanValue) {
            cx.f().g(str2, "Ignoring schedule request in non-main process");
            return;
        }
        if (!this.q) {
            this.t.a(this);
            this.q = true;
        }
        cx.f().b(str2, "Cancelling work ID " + str);
        do0 do0Var = this.p;
        if (do0Var != null && (runnable = (Runnable) do0Var.d.remove(str)) != null) {
            ((Handler) do0Var.b.o).removeCallbacks(runnable);
        }
        for (gl4 gl4Var : this.s.t(str)) {
            this.A.i(gl4Var);
            rm3 rm3Var = this.u;
            rm3Var.getClass();
            rm3Var.R(gl4Var, -512);
        }
    }

    @Override // defpackage.a64
    public final void e(dd5... dd5VarArr) {
        long jMax;
        if (this.x == null) {
            this.x = Boolean.valueOf(nq3.a(this.n, this.v));
        }
        if (!this.x.booleanValue()) {
            cx.f().g(B, "Ignoring schedule request in a secondary process");
            return;
        }
        if (!this.q) {
            this.t.a(this);
            this.q = true;
        }
        HashSet<dd5> hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (dd5 dd5Var : dd5VarArr) {
            if (!this.s.e(q05.m(dd5Var))) {
                synchronized (this.r) {
                    try {
                        rc5 rc5VarM = q05.m(dd5Var);
                        ck1 ck1Var = (ck1) this.w.get(rc5VarM);
                        if (ck1Var == null) {
                            int i = dd5Var.k;
                            this.v.d.getClass();
                            ck1Var = new ck1(i, System.currentTimeMillis());
                            this.w.put(rc5VarM, ck1Var);
                        }
                        jMax = (((long) Math.max((dd5Var.k - ck1Var.a) - 5, 0)) * 30000) + ck1Var.b;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                long jMax2 = Math.max(dd5Var.a(), jMax);
                this.v.d.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (dd5Var.b == 1) {
                    if (jCurrentTimeMillis < jMax2) {
                        do0 do0Var = this.p;
                        if (do0Var != null) {
                            hg3 hg3Var = do0Var.b;
                            HashMap map = do0Var.d;
                            Runnable runnable = (Runnable) map.remove(dd5Var.a);
                            if (runnable != null) {
                                ((Handler) hg3Var.o).removeCallbacks(runnable);
                            }
                            lg1 lg1Var = new lg1(do0Var, dd5Var, false, 8);
                            map.put(dd5Var.a, lg1Var);
                            do0Var.c.getClass();
                            ((Handler) hg3Var.o).postDelayed(lg1Var, jMax2 - System.currentTimeMillis());
                        }
                    } else if (dd5Var.c()) {
                        mc0 mc0Var = dd5Var.j;
                        if (mc0Var.d) {
                            cx.f().b(B, "Ignoring " + dd5Var + ". Requires device idle.");
                        } else if (mc0Var.i.isEmpty()) {
                            hashSet.add(dd5Var);
                            hashSet2.add(dd5Var.a);
                        } else {
                            cx.f().b(B, "Ignoring " + dd5Var + ". Requires ContentUri triggers.");
                        }
                    } else if (!this.s.e(q05.m(dd5Var))) {
                        cx.f().b(B, "Starting work for " + dd5Var.a);
                        qr2 qr2Var = this.s;
                        qr2Var.getClass();
                        gl4 gl4VarW = qr2Var.w(q05.m(dd5Var));
                        this.A.R(gl4VarW);
                        rm3 rm3Var = this.u;
                        rm3Var.getClass();
                        rm3Var.Q(gl4VarW, null);
                    }
                }
            }
        }
        synchronized (this.r) {
            try {
                if (!hashSet.isEmpty()) {
                    cx.f().b(B, "Starting tracking for " + TextUtils.join(",", hashSet2));
                    for (dd5 dd5Var2 : hashSet) {
                        rc5 rc5VarM2 = q05.m(dd5Var2);
                        if (!this.o.containsKey(rc5VarM2)) {
                            this.o.put(rc5VarM2, lc5.a(this.y, dd5Var2, (pe0) this.z.o, this));
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
