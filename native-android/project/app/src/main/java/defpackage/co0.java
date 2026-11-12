package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class co0 implements c93 {
    public static final String B = null;
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

    static {
        B = cx.i("DelayMetCommandHandler");
    }

    public co0(Context r1, int r2, tp4 r3, gl4 r4) {
        this.n = r1;
        this.o = r2;
        this.q = r3;
        this.p = r4.a;
        this.y = r4;
        z40 r5 = r3.r.j;
        bq4 r6 = r3.o;
        this.u = (ia4) r6.n;
        this.v = (vc5) r6.q;
        this.z = (pe0) r6.o;
        this.r = new c52(r5);
        this.x = false;
        this.t = 0;
        this.s = new Object();
    }

    public static void b(co0 r11) {
        int r0 = r11.o;
        vc5 r1 = r11.v;
        Context r2 = r11.n;
        tp4 r3 = r11.q;
        rc5 r4 = r11.p;
        String r5 = r4.a;
        int r6 = r11.t;
        String r7 = B;
        if (r6 >= 2) goto L10;
        r11.t = 2;
        cx.f().b(r7, "Stopping work for WorkSpec " + r5);
        Intent r12 = new Intent(r2, SystemAlarmService.class);
        r12.setAction("ACTION_STOP_WORK");
        k60.d(r12, r4);
        r1.execute(new eh(r3, r12, r0, 3));
        if (r3.q.e(r4.a) == false) goto L8;
        cx.f().b(r7, "WorkSpec " + r5 + " needs to be rescheduled");
        Intent r13 = new Intent(r2, SystemAlarmService.class);
        r13.setAction("ACTION_SCHEDULE_WORK");
        k60.d(r13, r4);
        r1.execute(new eh(r3, r13, r0, 3));
        return;
    L8:
        cx.f().b(r7, "Processor does not have WorkSpec " + r5 + ". No need to reschedule");
        return;
    L10:
        cx.f().b(r7, "Already stopped work for " + r5);
    }

    public static void c(co0 r7) {
        if (r7.t != 0) goto L16;
        r7.t = 1;
        cx.f().b(B, "onAllConstraintsMet for " + r7.p);
        if (r7.q.q.g(r7.y, null) == false) goto L14;
        jd5 r0 = r7.q.p;
        rc5 r1 = r7.p;
        Object r3 = r0.d;
        monitor-enter(r3);
        cx.f().b(jd5.e, "Starting timer for " + r1);     // Catch: Throwable -> L11
        r0.a(r1);     // Catch: Throwable -> L11
        id5 r2 = new id5(r0, r1);     // Catch: Throwable -> L11
        r0.b.put(r1, r2);     // Catch: Throwable -> L11
        r0.c.put(r1, r7);     // Catch: Throwable -> L11
        ((Handler) r0.a.o).postDelayed(r2, 600000);     // Catch: Throwable -> L11
        monitor-exit(r3);     // Catch: Throwable -> L11
        return;
    L11:
        th = move-exception;
        throw th;
    L14:
        r7.d();
        return;
    L16:
        cx.f().b(B, "Already started work for " + r7.p);
    }

    @Override // defpackage.c93
    public final void a(dd5 r2, tc0 r3) {
        boolean r4 = r3 instanceof rc0;
        ia4 r5 = this.u;
        if (r4 == false) goto L6;
        r5.execute(new bo0(this, 1));
        return;
    L6:
        r5.execute(new bo0(this, 0));
    }

    public final void d() {
        Object r1 = this.s;
        monitor-enter(r1);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (this.A == null) goto L9;
        this.A.f(null);     // Catch: Throwable -> L7
    L9:
        this.q.p.a(this.p);     // Catch: Throwable -> L7
        PowerManager.WakeLock r2 = this.w;     // Catch: Throwable -> L7
        if (r2 != null) goto L12;
    L14:
        monitor-exit(r1);     // Catch: Throwable -> L7
        return;
    L12:
        if (r2.isHeld() == false) goto L14;
        cx.f().b(B, "Releasing wakelock " + this.w + "for WorkSpec " + this.p);     // Catch: Throwable -> L7
        this.w.release();     // Catch: Throwable -> L7
        goto L14
    }

    public final void e() {
        String r0 = this.p.a;
        Context r1 = this.n;
        StringBuilder r2 = b11.s(r0, " (");
        r2.append(this.o);
        r2.append(")");
        this.w = y85.a(r1, r2.toString());
        cx r3 = cx.f();
        String r4 = B;
        r3.b(r4, "Acquiring wakelock " + this.w + "for WorkSpec " + r0);
        this.w.acquire();
        dd5 r5 = this.q.r.c.A().h(r0);
        if (r5 != null) goto L6;
        this.u.execute(new bo0(this, 0));
        return;
    L6:
        boolean r6 = r5.c();
        this.x = r6;
        if (r6 == true) goto L10;
        cx.f().b(r4, "No constraints for ".concat(r0));
        this.u.execute(new bo0(this, 1));
        return;
    L10:
        this.A = lc5.a(this.r, r5, this.z, this);
    }

    public final void f(boolean r9) {
        cx r0 = cx.f();
        StringBuilder r1 = new StringBuilder("onExecuted ");
        rc5 r2 = this.p;
        r1.append(r2);
        r1.append(", ");
        r1.append(r9);
        String r3 = r1.toString();
        r0.b(B, r3);
        d();
        int r4 = this.o;
        tp4 r5 = this.q;
        vc5 r6 = this.v;
        Context r7 = this.n;
        if (r9 == false) goto L6;
        Intent r10 = new Intent(r7, SystemAlarmService.class);
        r10.setAction("ACTION_SCHEDULE_WORK");
        k60.d(r10, r2);
        r6.execute(new eh(r5, r10, r4, 3));
    L6:
        if (this.x == false) goto L9;
        Intent r8 = new Intent(r7, SystemAlarmService.class);
        r8.setAction("ACTION_CONSTRAINTS_CHANGED");
        r6.execute(new eh(r5, r8, r4, 3));
        return;
    }
}
