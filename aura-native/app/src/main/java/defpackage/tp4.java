package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
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
        sc5 b = sc5.b(systemAlarmService);
        r90 r90Var = b.b;
        this.r = b;
        this.s = new k60(applicationContext, r90Var.d, qr2Var);
        this.p = new jd5(r90Var.g);
        pq3 pq3Var = b.f;
        this.q = pq3Var;
        bq4 bq4Var = b.d;
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
        cx f = cx.f();
        String str = x;
        f.b(str, "Adding command " + intent + " (" + i + ")");
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
                } finally {
                }
            }
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.t) {
            try {
                boolean isEmpty = this.t.isEmpty();
                this.t.add(intent);
                if (isEmpty) {
                    d();
                }
            } finally {
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
        PowerManager.WakeLock a = y85.a(this.n, "ProcessCommand");
        try {
            a.acquire();
            this.r.d.h(new sp4(this, 0));
        } finally {
            a.release();
        }
    }
}
