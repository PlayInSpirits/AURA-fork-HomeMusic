package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import defpackage.cx;
import defpackage.ja2;
import defpackage.tp4;
import defpackage.y85;
import defpackage.z85;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class SystemAlarmService extends ja2 {
    public static final String q = cx.i("SystemAlarmService");
    public tp4 o;
    public boolean p;

    public final void a() {
        this.p = true;
        cx.f().b(q, "All commands completed in dispatcher");
        String str = y85.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (z85.a) {
            linkedHashMap.putAll(z85.b);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str2 = (String) entry.getValue();
            if (wakeLock != null && wakeLock.isHeld()) {
                cx.f().k(y85.a, "WakeLock held for " + str2);
            }
        }
        stopSelf();
    }

    @Override // defpackage.ja2, android.app.Service
    public final void onCreate() {
        super.onCreate();
        tp4 tp4Var = new tp4(this);
        this.o = tp4Var;
        if (tp4Var.v != null) {
            cx.f().d(tp4.x, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            tp4Var.v = this;
        }
        this.p = false;
    }

    @Override // defpackage.ja2, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.p = true;
        tp4 tp4Var = this.o;
        tp4Var.getClass();
        cx.f().b(tp4.x, "Destroying SystemAlarmDispatcher");
        tp4Var.q.f(tp4Var);
        tp4Var.v = null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.p) {
            cx.f().g(q, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            tp4 tp4Var = this.o;
            tp4Var.getClass();
            cx cxVarF = cx.f();
            String str = tp4.x;
            cxVarF.b(str, "Destroying SystemAlarmDispatcher");
            tp4Var.q.f(tp4Var);
            tp4Var.v = null;
            tp4 tp4Var2 = new tp4(this);
            this.o = tp4Var2;
            if (tp4Var2.v != null) {
                cx.f().d(str, "A completion listener for SystemAlarmDispatcher already exists.");
            } else {
                tp4Var2.v = this;
            }
            this.p = false;
        }
        if (intent == null) {
            return 3;
        }
        this.o.a(intent, i2);
        return 3;
    }
}
