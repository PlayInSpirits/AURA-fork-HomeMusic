package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class co0 implements c93 {
    public static final String B = cx.i("DelayMetCommandHandler");
    public volatile sk4 A;
    public final Context n;
    public final int o;
    public final rc5 p;
    public final tp4 q;
    public final c52 r;
    public final Object s;
    public int t;
    public final ia4 u;
    public final vc5 v;
    public PowerManager.WakeLock w;
    public boolean x;
    public final gl4 y;
    public final pe0 z;

    public co0(Context context, int i, tp4 tp4Var, gl4 gl4Var) {
        this.n = context;
        this.o = i;
        this.q = tp4Var;
        this.p = gl4Var.a;
        this.y = gl4Var;
        z40 z40Var = tp4Var.r.j;
        bq4 bq4Var = tp4Var.o;
        this.u = (ia4) bq4Var.n;
        this.v = (vc5) bq4Var.q;
        this.z = (pe0) bq4Var.o;
        this.r = new c52(z40Var);
        this.x = false;
        this.t = 0;
        this.s = new Object();
    }

    public static void b(co0 co0Var) {
        int i = co0Var.o;
        vc5 vc5Var = co0Var.v;
        Context context = co0Var.n;
        tp4 tp4Var = co0Var.q;
        rc5 rc5Var = co0Var.p;
        String str = rc5Var.a;
        int i2 = co0Var.t;
        String str2 = B;
        if (i2 >= 2) {
            cx.f().b(str2, "Already stopped work for " + str);
            return;
        }
        co0Var.t = 2;
        cx.f().b(str2, "Stopping work for WorkSpec " + str);
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        k60.d(intent, rc5Var);
        vc5Var.execute(new eh(tp4Var, intent, i, 3));
        if (!tp4Var.q.e(rc5Var.a)) {
            cx.f().b(str2, "Processor does not have WorkSpec " + str + ". No need to reschedule");
            return;
        }
        cx.f().b(str2, "WorkSpec " + str + " needs to be rescheduled");
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_SCHEDULE_WORK");
        k60.d(intent2, rc5Var);
        vc5Var.execute(new eh(tp4Var, intent2, i, 3));
    }

    public static void c(co0 co0Var) {
        if (co0Var.t != 0) {
            cx.f().b(B, "Already started work for " + co0Var.p);
            return;
        }
        co0Var.t = 1;
        cx.f().b(B, "onAllConstraintsMet for " + co0Var.p);
        if (!co0Var.q.q.g(co0Var.y, null)) {
            co0Var.d();
            return;
        }
        jd5 jd5Var = co0Var.q.p;
        rc5 rc5Var = co0Var.p;
        synchronized (jd5Var.d) {
            cx.f().b(jd5.e, "Starting timer for " + rc5Var);
            jd5Var.a(rc5Var);
            id5 id5Var = new id5(jd5Var, rc5Var);
            jd5Var.b.put(rc5Var, id5Var);
            jd5Var.c.put(rc5Var, co0Var);
            ((Handler) jd5Var.a.o).postDelayed(id5Var, 600000L);
        }
    }

    @Override // defpackage.c93
    public final void a(dd5 dd5Var, tc0 tc0Var) {
        boolean z = tc0Var instanceof rc0;
        ia4 ia4Var = this.u;
        if (z) {
            ia4Var.execute(new bo0(this, 1));
        } else {
            ia4Var.execute(new bo0(this, 0));
        }
    }

    public final void d() {
        synchronized (this.s) {
            try {
                if (this.A != null) {
                    this.A.f(null);
                }
                this.q.p.a(this.p);
                PowerManager.WakeLock wakeLock = this.w;
                if (wakeLock != null && wakeLock.isHeld()) {
                    cx.f().b(B, "Releasing wakelock " + this.w + "for WorkSpec " + this.p);
                    this.w.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        String str = this.p.a;
        Context context = this.n;
        StringBuilder s = b11.s(str, " (");
        s.append(this.o);
        s.append(")");
        this.w = y85.a(context, s.toString());
        cx f = cx.f();
        String str2 = B;
        f.b(str2, "Acquiring wakelock " + this.w + "for WorkSpec " + str);
        this.w.acquire();
        dd5 h = this.q.r.c.A().h(str);
        if (h == null) {
            this.u.execute(new bo0(this, 0));
            return;
        }
        boolean c = h.c();
        this.x = c;
        if (c) {
            this.A = lc5.a(this.r, h, this.z, this);
        } else {
            cx.f().b(str2, "No constraints for ".concat(str));
            this.u.execute(new bo0(this, 1));
        }
    }

    public final void f(boolean z) {
        cx f = cx.f();
        StringBuilder sb = new StringBuilder("onExecuted ");
        rc5 rc5Var = this.p;
        sb.append(rc5Var);
        sb.append(", ");
        sb.append(z);
        f.b(B, sb.toString());
        d();
        int i = this.o;
        tp4 tp4Var = this.q;
        vc5 vc5Var = this.v;
        Context context = this.n;
        if (z) {
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_SCHEDULE_WORK");
            k60.d(intent, rc5Var);
            vc5Var.execute(new eh(tp4Var, intent, i, 3));
        }
        if (this.x) {
            Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
            vc5Var.execute(new eh(tp4Var, intent2, i, 3));
        }
    }
}
