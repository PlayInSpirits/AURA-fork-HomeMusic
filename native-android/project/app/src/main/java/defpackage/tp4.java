package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tp4 implements w21 {
    public static final String x = null;
    public final Context n;
    public final bq4 o;
    public final jd5 p;
    public final pq3 q;
    public final sc5 r;
    public final k60 s;
    public final ArrayList t;
    public Intent u;
    public SystemAlarmService v;
    public final rm3 w;

    static {
        x = cx.i("SystemAlarmDispatcher");
    }

    public tp4(SystemAlarmService r6) {
        Context r0 = r6.getApplicationContext();
        this.n = r0;
        qr2 r2 = new qr2(new nh0(1));
        sc5 r7 = sc5.b(r6);
        r90 r1 = r7.b;
        this.r = r7;
        this.s = new k60(r0, r1.d, r2);
        this.p = new jd5(r1.g);
        pq3 r3 = r7.f;
        this.q = r3;
        bq4 r8 = r7.d;
        this.o = r8;
        this.w = new rm3(r3, r8);
        r3.a(this);
        this.t = new ArrayList();
        this.u = null;
    }

    public static void c() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) goto L5;
        return;
    L5:
        kf2.o("Needs to be invoked on the main thread.");
    }

    public final void a(Intent r7, int r8) {
        cx r0 = cx.f();
        String r1 = x;
        r0.b(r1, "Adding command " + r7 + " (" + r8 + ")");
        c();
        String r2 = r7.getAction();
        if (TextUtils.isEmpty(r2) == false) goto L7;
        cx.f().k(r1, "Unknown command. Ignoring");
        return;
    L7:
        if ("ACTION_CONSTRAINTS_CHANGED".equals(r2) == false) goto L22;
        c();
        ArrayList r3 = this.t;
        monitor-enter(r3);
        ArrayList r4 = this.t;     // Catch: Throwable -> L16
        int r5 = r4.size();     // Catch: Throwable -> L16
        int r6 = 0;
    L11:
        if (r6 >= r5) goto L18;
        Object r9 = r4.get(r6);     // Catch: Throwable -> L16
        r6 = r6 + 1;     // Catch: Throwable -> L16
        if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) r9).getAction()) == false) goto L11;
        monitor-exit(r3);     // Catch: Throwable -> L16
        return;
    L18:
        monitor-exit(r3);     // Catch: Throwable -> L16
    L16:
        th = move-exception;
        throw th;
    L22:
        r7.putExtra("KEY_START_ID", r8);
        ArrayList r10 = this.t;
        monitor-enter(r10);
        boolean r11 = this.t.isEmpty();     // Catch: Throwable -> L27
        this.t.add(r7);     // Catch: Throwable -> L27
        if (r11 == false) goto L29;
        d();     // Catch: Throwable -> L27
    L29:
        monitor-exit(r10);     // Catch: Throwable -> L27
        return;
    L27:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.w21
    public final void b(rc5 r6, boolean r7) {
        vc5 r0 = (vc5) this.o.q;
        String r2 = k60.s;
        Intent r3 = new Intent(this.n, SystemAlarmService.class);
        r3.setAction("ACTION_EXECUTION_COMPLETED");
        r3.putExtra("KEY_NEEDS_RESCHEDULE", r7);
        k60.d(r3, r6);
        r0.execute(new eh(this, r3, 0, 3));
    }

    public final void d() {
        c();
        PowerManager.WakeLock r0 = y85.a(this.n, "ProcessCommand");
        r0.acquire();     // Catch: Throwable -> L6
        this.r.d.h(new sp4(this, 0));     // Catch: Throwable -> L6
        r0.release();
        return;
    L6:
        th = move-exception;
        r0.release();
        throw th;
    }
}
