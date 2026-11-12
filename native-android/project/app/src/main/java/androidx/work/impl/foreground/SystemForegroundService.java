package androidx.work.impl.foreground;

import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import defpackage.cx;
import defpackage.gp;
import defpackage.h12;
import defpackage.i80;
import defpackage.ia4;
import defpackage.ja2;
import defpackage.lg1;
import defpackage.sc5;
import defpackage.wp4;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class SystemForegroundService extends ja2 {
    public static final String r = cx.i("SystemFgService");
    public boolean o;
    public wp4 p;
    public NotificationManager q;

    public final void a() {
        this.q = (NotificationManager) getApplicationContext().getSystemService("notification");
        wp4 wp4Var = new wp4(getApplicationContext());
        this.p = wp4Var;
        if (wp4Var.v != null) {
            cx.f().d(wp4.w, "A callback already exists.");
        } else {
            wp4Var.v = this;
        }
    }

    @Override // defpackage.ja2, android.app.Service
    public final void onCreate() {
        super.onCreate();
        a();
    }

    @Override // defpackage.ja2, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.p.e();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        boolean z = this.o;
        boolean z2 = false;
        String str = r;
        if (z) {
            cx.f().g(str, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.p.e();
            a();
            this.o = false;
        }
        if (intent == null) {
            return 3;
        }
        wp4 wp4Var = this.p;
        wp4Var.getClass();
        String str2 = wp4.w;
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            cx.f().g(str2, "Started foreground service " + intent);
            wp4Var.o.h(new lg1(wp4Var, intent.getStringExtra("KEY_WORKSPEC_ID"), z2, 28));
            wp4Var.d(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            wp4Var.d(intent);
            return 3;
        }
        int i3 = 1;
        if (!"ACTION_CANCEL_WORK".equals(action)) {
            if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                return 3;
            }
            cx.f().g(str2, "Stopping foreground service");
            SystemForegroundService systemForegroundService = wp4Var.v;
            if (systemForegroundService == null) {
                return 3;
            }
            systemForegroundService.o = true;
            cx.f().b(str, "Shutting down.");
            if (Build.VERSION.SDK_INT >= 26) {
                systemForegroundService.stopForeground(true);
            }
            systemForegroundService.stopSelf();
            return 3;
        }
        cx.f().g(str2, "Stopping foreground work for " + intent);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return 3;
        }
        sc5 sc5Var = wp4Var.n;
        UUID uuidFromString = UUID.fromString(stringExtra);
        sc5Var.getClass();
        uuidFromString.getClass();
        i80 i80Var = sc5Var.b.m;
        ia4 ia4Var = (ia4) sc5Var.d.n;
        ia4Var.getClass();
        h12.D(i80Var, "CancelWorkById", ia4Var, new gp(i3, sc5Var, uuidFromString));
        return 3;
    }

    @Override // android.app.Service
    public final void onTimeout(int i) {
        if (Build.VERSION.SDK_INT >= 35) {
            return;
        }
        this.p.f(2048);
    }

    public final void onTimeout(int i, int i2) {
        this.p.f(i2);
    }
}
