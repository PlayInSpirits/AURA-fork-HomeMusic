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
    public static final String w = cx.i("SystemFgDispatcher");
    public final sc5 n;
    public final bq4 o;
    public final Object p = new Object();
    public rc5 q;
    public final LinkedHashMap r;
    public final HashMap s;
    public final HashMap t;
    public final c52 u;
    public SystemForegroundService v;

    public wp4(Context context) {
        sc5 sc5VarB = sc5.b(context);
        this.n = sc5VarB;
        this.o = sc5VarB.d;
        this.q = null;
        this.r = new LinkedHashMap();
        this.t = new HashMap();
        this.s = new HashMap();
        this.u = new c52(sc5VarB.j);
        sc5VarB.f.a(this);
    }

    public static Intent c(Context context, rc5 rc5Var, mb1 mb1Var) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", rc5Var.a);
        intent.putExtra("KEY_GENERATION", rc5Var.b);
        intent.putExtra("KEY_NOTIFICATION_ID", mb1Var.a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", mb1Var.b);
        intent.putExtra("KEY_NOTIFICATION", mb1Var.c);
        return intent;
    }

    @Override // defpackage.c93
    public final void a(dd5 dd5Var, tc0 tc0Var) {
        if (tc0Var instanceof sc0) {
            String str = dd5Var.a;
            cx.f().b(w, "Constraints unmet for WorkSpec " + str);
            rc5 rc5VarM = q05.m(dd5Var);
            int i = ((sc0) tc0Var).a;
            sc5 sc5Var = this.n;
            sc5Var.d.h(new am4(sc5Var.f, new gl4(rc5VarM), true, i));
        }
    }

    @Override // defpackage.w21
    public final void b(rc5 rc5Var, boolean z) {
        Map.Entry entry;
        synchronized (this.p) {
            try {
                s22 s22Var = ((dd5) this.s.remove(rc5Var)) != null ? (s22) this.t.remove(rc5Var) : null;
                if (s22Var != null) {
                    s22Var.f(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        mb1 mb1Var = (mb1) this.r.remove(rc5Var);
        if (rc5Var.equals(this.q)) {
            if (this.r.size() > 0) {
                Iterator it = this.r.entrySet().iterator();
                Object next = it.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.q = (rc5) entry.getKey();
                if (this.v != null) {
                    mb1 mb1Var2 = (mb1) entry.getValue();
                    SystemForegroundService systemForegroundService = this.v;
                    int i = mb1Var2.a;
                    int i2 = mb1Var2.b;
                    Notification notification = mb1Var2.c;
                    systemForegroundService.getClass();
                    int i3 = Build.VERSION.SDK_INT;
                    if (i3 >= 31) {
                        yh.q(systemForegroundService, i, notification, i2);
                    } else if (i3 >= 29) {
                        yh.p(systemForegroundService, i, notification, i2);
                    } else {
                        systemForegroundService.startForeground(i, notification);
                    }
                    this.v.q.cancel(mb1Var2.a);
                }
            } else {
                this.q = null;
            }
        }
        SystemForegroundService systemForegroundService2 = this.v;
        if (mb1Var == null || systemForegroundService2 == null) {
            return;
        }
        cx.f().b(w, "Removing Notification (id: " + mb1Var.a + ", workSpecId: " + rc5Var + ", notificationType: " + mb1Var.b);
        systemForegroundService2.q.cancel(mb1Var.a);
    }

    public final void d(Intent intent) {
        if (this.v == null) {
            kf2.o("handleNotify was called on the destroyed dispatcher");
            return;
        }
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        rc5 rc5Var = new rc5(intent.getIntExtra("KEY_GENERATION", 0), stringExtra);
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        cx.f().b(w, "Notifying with (id:" + intExtra + ", workSpecId: " + stringExtra + ", notificationType :" + intExtra2 + ")");
        if (notification == null) {
            kf2.n("Notification passed in the intent was null.");
            return;
        }
        mb1 mb1Var = new mb1(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.r;
        linkedHashMap.put(rc5Var, mb1Var);
        mb1 mb1Var2 = (mb1) linkedHashMap.get(this.q);
        if (mb1Var2 == null) {
            this.q = rc5Var;
        } else {
            this.v.q.notify(intExtra, notification);
            if (Build.VERSION.SDK_INT >= 29) {
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    i |= ((mb1) ((Map.Entry) it.next()).getValue()).b;
                }
                mb1Var = new mb1(mb1Var2.a, mb1Var2.c, i);
            } else {
                mb1Var = mb1Var2;
            }
        }
        SystemForegroundService systemForegroundService = this.v;
        int i2 = mb1Var.a;
        int i3 = mb1Var.b;
        Notification notification2 = mb1Var.c;
        systemForegroundService.getClass();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 31) {
            yh.q(systemForegroundService, i2, notification2, i3);
        } else if (i4 >= 29) {
            yh.p(systemForegroundService, i2, notification2, i3);
        } else {
            systemForegroundService.startForeground(i2, notification2);
        }
    }

    public final void e() {
        this.v = null;
        synchronized (this.p) {
            try {
                Iterator it = this.t.values().iterator();
                while (it.hasNext()) {
                    ((s22) it.next()).f(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.n.f.f(this);
    }

    public final void f(int i) {
        cx.f().g(w, "Foreground service timed out, FGS type: " + i);
        for (Map.Entry entry : this.r.entrySet()) {
            if (((mb1) entry.getValue()).b == i) {
                rc5 rc5Var = (rc5) entry.getKey();
                sc5 sc5Var = this.n;
                sc5Var.d.h(new am4(sc5Var.f, new gl4(rc5Var), true, -128));
            }
        }
        SystemForegroundService systemForegroundService = this.v;
        if (systemForegroundService != null) {
            systemForegroundService.o = true;
            cx.f().b(SystemForegroundService.r, "Shutting down.");
            if (Build.VERSION.SDK_INT >= 26) {
                systemForegroundService.stopForeground(true);
            }
            systemForegroundService.stopSelf();
        }
    }
}
