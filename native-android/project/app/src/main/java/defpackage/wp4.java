package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wp4 implements c93, w21 {
    public static final String w = null;
    public final sc5 n;
    public final bq4 o;
    public final Object p;
    public rc5 q;
    public final LinkedHashMap r;
    public final HashMap s;
    public final HashMap t;
    public final c52 u;
    public SystemForegroundService v;

    static {
        w = cx.i("SystemFgDispatcher");
    }

    public wp4(Context r3) {
        this.p = new Object();
        sc5 r4 = sc5.b(r3);
        this.n = r4;
        this.o = r4.d;
        this.q = null;
        this.r = new LinkedHashMap();
        this.t = new HashMap();
        this.s = new HashMap();
        this.u = new c52(r4.j);
        r4.f.a(this);
    }

    public static Intent c(Context r2, rc5 r3, mb1 r4) {
        Intent r0 = new Intent(r2, SystemForegroundService.class);
        r0.setAction("ACTION_START_FOREGROUND");
        r0.putExtra("KEY_WORKSPEC_ID", r3.a);
        r0.putExtra("KEY_GENERATION", r3.b);
        r0.putExtra("KEY_NOTIFICATION_ID", r4.a);
        r0.putExtra("KEY_FOREGROUND_SERVICE_TYPE", r4.b);
        r0.putExtra("KEY_NOTIFICATION", r4.c);
        return r0;
    }

    @Override // defpackage.c93
    public final void a(dd5 r5, tc0 r6) {
        if ((r6 instanceof sc0) == false) goto L6;
        String r0 = r5.a;
        cx.f().b(w, "Constraints unmet for WorkSpec " + r0);
        rc5 r7 = q05.m(r5);
        int r8 = ((sc0) r6).a;
        sc5 r4 = this.n;
        r4.d.h(new am4(r4.f, new gl4(r7), true, r8));
        return;
    }

    @Override // defpackage.w21
    public final void b(rc5 r8, boolean r9) {
        Object r10 = this.p;
        monitor-enter(r10);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (((dd5) this.s.remove(r8)) == null) goto L9;
        s22 r0 = (s22) this.t.remove(r8);     // Catch: Throwable -> L7
    L10:
        if (r0 == null) goto L12;
        r0.f(null);     // Catch: Throwable -> L7
    L12:
        monitor-exit(r10);     // Catch: Throwable -> L7
        mb1 r11 = (mb1) this.r.remove(r8);
        if (r8.equals(this.q) == true) goto L16;
    L32:
        SystemForegroundService r7 = this.v;
        if (r11 == null) goto L42;
        if (r7 == null) goto L43;
        cx.f().b(w, "Removing Notification (id: " + r11.a + ", workSpecId: " + r8 + ", notificationType: " + r11.b);
        r7.q.cancel(r11.a);
        return;
    L43:
        return;
    L42:
        return;
    L16:
        if (this.r.size() <= 0) goto L31;
        Iterator r1 = this.r.entrySet().iterator();
        Object r2 = r1.next();
    L18:
        Map.Entry r3 = (Map.Entry) r2;
        if (r1.hasNext() == false) goto L21;
        r2 = r1.next();
        goto L18
    L21:
        this.q = (rc5) r3.getKey();
        if (this.v == null) goto L32;
        mb1 r4 = (mb1) r3.getValue();
        SystemForegroundService r5 = this.v;
        int r6 = r4.a;
        int r12 = r4.b;
        Notification r13 = r4.c;
        r5.getClass();
        int r14 = Build.VERSION.SDK_INT;
        if (r14 < 31) goto L27;
        yh.q(r5, r6, r13, r12);
    L30:
        SystemForegroundService r15 = this.v;
        r15.q.cancel(r4.a);
        goto L32
    L27:
        if (r14 < 29) goto L29;
        yh.p(r5, r6, r13, r12);
        goto L30
    L29:
        r5.startForeground(r6, r13);
        goto L30
    L31:
        this.q = null;
        goto L32
    L9:
        r0 = null;
        goto L10
    }

    public final void d(Intent r9) {
        if (this.v == null) goto L28;
        int r1 = 0;
        int r0 = r9.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int r2 = r9.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String r3 = r9.getStringExtra("KEY_WORKSPEC_ID");
        rc5 r5 = new rc5(r9.getIntExtra("KEY_GENERATION", 0), r3);
        Notification r10 = (Notification) r9.getParcelableExtra("KEY_NOTIFICATION");
        cx.f().b(w, "Notifying with (id:" + r0 + ", workSpecId: " + r3 + ", notificationType :" + r2 + ")");
        if (r10 == null) goto L26;
        mb1 r4 = new mb1(r0, r10, r2);
        LinkedHashMap r6 = this.r;
        r6.put(r5, r4);
        mb1 r7 = (mb1) r6.get(this.q);
        if (r7 != null) goto L9;
        this.q = r5;
    L17:
        SystemForegroundService r8 = this.v;
        int r11 = r4.a;
        int r12 = r4.b;
        Notification r13 = r4.c;
        r8.getClass();
        int r14 = Build.VERSION.SDK_INT;
        if (r14 < 31) goto L21;
        yh.q(r8, r11, r13, r12);
        return;
    L21:
        if (r14 < 29) goto L24;
        yh.p(r8, r11, r13, r12);
        return;
    L24:
        r8.startForeground(r11, r13);
        return;
    L9:
        this.v.q.notify(r0, r10);
        if (Build.VERSION.SDK_INT < 29) goto L16;
        Iterator r15 = r6.entrySet().iterator();
    L13:
        if (r15.hasNext() == false) goto L15;
        r1 = r1 | ((mb1) ((Map.Entry) r15.next()).getValue()).b;
        goto L13
    L15:
        r4 = new mb1(r7.a, r7.c, r1);
        goto L17
    L16:
        r4 = r7;
        goto L17
    L26:
        kf2.n("Notification passed in the intent was null.");
        return;
    L28:
        kf2.o("handleNotify was called on the destroyed dispatcher");
    }

    public final void e() {
        this.v = null;
        Object r1 = this.p;
        monitor-enter(r1);
        Iterator r2 = this.t.values().iterator();     // Catch: Throwable -> L8
    L6:
        if (r2.hasNext() == false) goto L10;
        ((s22) r2.next()).f(null);     // Catch: Throwable -> L8
        goto L6
    L10:
        monitor-exit(r1);     // Catch: Throwable -> L8
        this.n.f.f(this);
        return;
    L8:
        th = move-exception;
        throw th;
    }

    public final void f(int r8) {
        cx.f().g(w, "Foreground service timed out, FGS type: " + r8);
        Iterator r0 = this.r.entrySet().iterator();
    L4:
        if (r0.hasNext() == false) goto L8;
        Map.Entry r1 = (Map.Entry) r0.next();
        if (((mb1) r1.getValue()).b != r8) goto L4;
        rc5 r2 = (rc5) r1.getKey();
        sc5 r3 = this.n;
        r3.d.h(new am4(r3.f, new gl4(r2), true, -128));
        goto L4
    L8:
        SystemForegroundService r7 = this.v;
        if (r7 == null) goto L20;
        r7.o = true;
        cx.f().b(SystemForegroundService.r, "Shutting down.");
        if (Build.VERSION.SDK_INT < 26) goto L13;
        r7.stopForeground(true);
    L13:
        r7.stopSelf();
        return;
    }
}
