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
    public static final String x = cx.i("SystemAlarmDispatcher");
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

    public tp4(SystemAlarmService systemAlarmService) {
        Context applicationContext = systemAlarmService.getApplicationContext();
        this.n = applicationContext;
        qr2 qr2Var = new qr2(new nh0(1));
        sc5 sc5VarB = sc5.b(systemAlarmService);
        r90 r90Var = sc5VarB.b;
        this.r = sc5VarB;
        this.s = new k60(applicationContext, r90Var.d, qr2Var);
        this.p = new jd5(r90Var.g);
        pq3 pq3Var = sc5VarB.f;
        this.q = pq3Var;
        bq4 bq4Var = sc5VarB.d;
        this.o = bq4Var;
        this.w = new rm3(pq3Var, bq4Var);
        pq3Var.a(this);
        this.t = new ArrayList();
        this.u = null;
    }

    public static void c() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        kf2.o("Needs to be invoked on the main thread.");
    }

    public final void a(Intent intent, int i) {
        cx cxVarF = cx.f();
        String str = x;
        cxVarF.b(str, "Adding command " + intent + " (" + i + ")");
        c();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            cx.f().k(str, "Unknown command. Ignoring");
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            c();
            synchronized (this.t) {
                try {
                    ArrayList arrayList = this.t;
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) obj).getAction())) {
                            return;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.t) {
            try {
                boolean zIsEmpty = this.t.isEmpty();
                this.t.add(intent);
                if (zIsEmpty) {
                    d();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // defpackage.w21
    public final void b(rc5 rc5Var, boolean z) {
        vc5 vc5Var = (vc5) this.o.q;
        String str = k60.s;
        Intent intent = new Intent(this.n, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        k60.d(intent, rc5Var);
        vc5Var.execute(new eh(this, intent, 0, 3));
    }

    public final void d() {
        c();
        PowerManager.WakeLock wakeLockA = y85.a(this.n, "ProcessCommand");
        try {
            wakeLockA.acquire();
            this.r.d.h(new sp4(this, 0));
        } finally {
            wakeLockA.release();
        }
    }
}
