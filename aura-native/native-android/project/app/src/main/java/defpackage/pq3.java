package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkerStoppedException;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pq3 {
    public static final String l = cx.i("Processor");
    public final Context b;
    public final r90 c;
    public final bq4 d;
    public final WorkDatabase e;
    public final HashMap g = new HashMap();
    public final HashMap f = new HashMap();
    public final HashSet i = new HashSet();
    public final ArrayList j = new ArrayList();
    public PowerManager.WakeLock a = null;
    public final Object k = new Object();
    public final HashMap h = new HashMap();

    public pq3(Context context, r90 r90Var, bq4 bq4Var, WorkDatabase workDatabase) {
        this.b = context;
        this.c = r90Var;
        this.d = bq4Var;
        this.e = workDatabase;
    }

    public static boolean d(String str, td5 td5Var, int i) {
        String str2 = l;
        if (td5Var == null) {
            cx.f().b(str2, "WorkerWrapper could not be found for " + str);
            return false;
        }
        td5Var.m.o(new WorkerStoppedException(i));
        cx.f().b(str2, "WorkerWrapper interrupted for " + str);
        return true;
    }

    public final void a(w21 w21Var) {
        synchronized (this.k) {
            this.j.add(w21Var);
        }
    }

    public final td5 b(String str) {
        td5 td5Var = (td5) this.f.remove(str);
        boolean z = td5Var != null;
        if (!z) {
            td5Var = (td5) this.g.remove(str);
        }
        this.h.remove(str);
        if (z) {
            synchronized (this.k) {
                try {
                    if (this.f.isEmpty()) {
                        Context context = this.b;
                        String str2 = wp4.w;
                        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                        intent.setAction("ACTION_STOP_FOREGROUND");
                        try {
                            this.b.startService(intent);
                        } catch (Throwable th) {
                            cx.f().e(l, "Unable to stop foreground service", th);
                        }
                        PowerManager.WakeLock wakeLock = this.a;
                        if (wakeLock != null) {
                            wakeLock.release();
                            this.a = null;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return td5Var;
    }

    public final td5 c(String str) {
        td5 td5Var = (td5) this.f.get(str);
        return td5Var == null ? (td5) this.g.get(str) : td5Var;
    }

    public final boolean e(String str) {
        boolean z;
        synchronized (this.k) {
            z = c(str) != null;
        }
        return z;
    }

    public final void f(w21 w21Var) {
        synchronized (this.k) {
            this.j.remove(w21Var);
        }
    }

    public final boolean g(gl4 gl4Var, z45 z45Var) {
        rc5 rc5Var = gl4Var.a;
        final String str = rc5Var.a;
        final ArrayList arrayList = new ArrayList();
        dd5 dd5Var = (dd5) this.e.r(new Callable() { // from class: oq3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                WorkDatabase workDatabase = this.a.e;
                hd5 hd5VarB = workDatabase.B();
                String str2 = str;
                arrayList.addAll(hd5VarB.j(str2));
                return workDatabase.A().h(str2);
            }
        });
        int i = 12;
        if (dd5Var == null) {
            cx.f().k(l, "Didn't find WorkSpec for id " + rc5Var);
            ((vc5) this.d.q).execute(new ur2(i, this, rc5Var));
            return false;
        }
        synchronized (this.k) {
            try {
                if (e(str)) {
                    Set set = (Set) this.h.get(str);
                    if (((gl4) set.iterator().next()).a.b == rc5Var.b) {
                        set.add(gl4Var);
                        cx.f().b(l, "Work " + rc5Var + " is already enqueued for processing");
                    } else {
                        ((vc5) this.d.q).execute(new ur2(i, this, rc5Var));
                    }
                    return false;
                }
                if (dd5Var.t != rc5Var.b) {
                    ((vc5) this.d.q).execute(new ur2(i, this, rc5Var));
                    return false;
                }
                td5 td5Var = new td5(new lv4(this.b, this.c, this.d, this, this.e, dd5Var, arrayList));
                pe0 pe0Var = (pe0) td5Var.d.o;
                t22 t22VarA = gb.a();
                pe0Var.getClass();
                ry ryVarR = bu.r(ya4.F(pe0Var, t22VarA), new qd5(td5Var, null, 1));
                ryVarR.o.f(new qo2(this, ryVarR, td5Var, 13), (vc5) this.d.q);
                this.g.put(str, td5Var);
                HashSet hashSet = new HashSet();
                hashSet.add(gl4Var);
                this.h.put(str, hashSet);
                cx.f().b(l, pq3.class.getSimpleName() + ": processing " + rc5Var);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
