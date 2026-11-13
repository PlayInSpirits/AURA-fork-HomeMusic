package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class k60 implements w21 {
    public static final String s = cx.i("CommandHandler");
    public final Context n;
    public final HashMap o = new HashMap();
    public final Object p = new Object();
    public final xi4 q;
    public final qr2 r;

    public k60(Context context, xi4 xi4Var, qr2 qr2Var) {
        this.n = context;
        this.q = xi4Var;
        this.r = qr2Var;
    }

    public static rc5 c(Intent intent) {
        return new rc5(intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0), intent.getStringExtra("KEY_WORKSPEC_ID"));
    }

    public static void d(Intent intent, rc5 rc5Var) {
        intent.putExtra("KEY_WORKSPEC_ID", rc5Var.a);
        intent.putExtra("KEY_WORKSPEC_GENERATION", rc5Var.b);
    }

    public final void a(Intent intent, int i, tp4 tp4Var) {
        List<gl4> list;
        String action = intent.getAction();
        int i2 = 3;
        int i3 = 0;
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            cx.f().b(s, "Handling constraints changed " + intent);
            Context context = this.n;
            pc0 pc0Var = new pc0(context, this.q, i, tp4Var);
            ArrayList f = tp4Var.r.c.A().f();
            String str = ob0.a;
            int size = f.size();
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            int i4 = 0;
            while (i4 < size) {
                Object obj = f.get(i4);
                i4++;
                mc0 mc0Var = ((dd5) obj).j;
                z |= mc0Var.e;
                z2 |= mc0Var.c;
                z3 |= mc0Var.f;
                z4 |= mc0Var.a != 1;
                if (z && z2 && z3 && z4) {
                    break;
                }
            }
            String str2 = ConstraintProxyUpdateReceiver.a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z2).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z3).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z4);
            context.sendBroadcast(intent2);
            ArrayList arrayList = new ArrayList(f.size());
            pc0Var.a.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            int size2 = f.size();
            int i5 = 0;
            while (i5 < size2) {
                Object obj2 = f.get(i5);
                i5++;
                dd5 dd5Var = (dd5) obj2;
                if (currentTimeMillis >= dd5Var.a() && (!dd5Var.c() || pc0Var.c.c(dd5Var))) {
                    arrayList.add(dd5Var);
                }
            }
            int size3 = arrayList.size();
            while (i3 < size3) {
                Object obj3 = arrayList.get(i3);
                i3++;
                dd5 dd5Var2 = (dd5) obj3;
                String str3 = dd5Var2.a;
                rc5 m = q05.m(dd5Var2);
                Intent intent3 = new Intent(context, (Class<?>) SystemAlarmService.class);
                intent3.setAction("ACTION_DELAY_MET");
                d(intent3, m);
                cx.f().b(pc0.d, "Creating a delay_met command for workSpec with id (" + str3 + ")");
                ((vc5) tp4Var.o.q).execute(new eh(tp4Var, intent3, pc0Var.b, i2));
            }
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            cx.f().b(s, "Handling reschedule " + intent + ", " + i);
            tp4Var.r.d();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
            cx.f().d(s, "Invalid request for " + action + " , requires KEY_WORKSPEC_ID .");
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            Context context2 = this.n;
            rc5 c = c(intent);
            cx f2 = cx.f();
            String str4 = s;
            f2.b(str4, "Handling schedule work for " + c);
            WorkDatabase workDatabase = tp4Var.r.c;
            workDatabase.c();
            try {
                dd5 h = workDatabase.A().h(c.a);
                if (h == null) {
                    cx.f().k(str4, "Skipping scheduling " + c + " because it's no longer in the DB");
                    return;
                }
                if (f34.c(h.b)) {
                    cx.f().k(str4, "Skipping scheduling " + c + "because it is finished.");
                    return;
                }
                long a = h.a();
                if (h.c()) {
                    cx.f().b(str4, "Opportunistically setting an alarm for " + c + "at " + a);
                    o6.b(context2, workDatabase, c, a);
                    Intent intent4 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                    intent4.setAction("ACTION_CONSTRAINTS_CHANGED");
                    ((vc5) tp4Var.o.q).execute(new eh(tp4Var, intent4, i, i2));
                } else {
                    cx.f().b(str4, "Setting up Alarms for " + c + "at " + a);
                    o6.b(context2, workDatabase, c, a);
                }
                workDatabase.t();
                return;
            } finally {
                workDatabase.o();
            }
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            synchronized (this.p) {
                try {
                    rc5 c2 = c(intent);
                    cx f3 = cx.f();
                    String str5 = s;
                    f3.b(str5, "Handing delay met for " + c2);
                    if (this.o.containsKey(c2)) {
                        cx.f().b(str5, "WorkSpec " + c2 + " is is already being handled for ACTION_DELAY_MET");
                    } else {
                        co0 co0Var = new co0(this.n, i, tp4Var, this.r.w(c2));
                        this.o.put(c2, co0Var);
                        co0Var.e();
                    }
                } finally {
                }
            }
            return;
        }
        if (!"ACTION_STOP_WORK".equals(action)) {
            if (!"ACTION_EXECUTION_COMPLETED".equals(action)) {
                cx.f().k(s, "Ignoring intent " + intent);
                return;
            }
            rc5 c3 = c(intent);
            boolean z5 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
            cx.f().b(s, "Handling onExecutionCompleted " + intent + ", " + i);
            b(c3, z5);
            return;
        }
        qr2 qr2Var = this.r;
        Bundle extras2 = intent.getExtras();
        String string = extras2.getString("KEY_WORKSPEC_ID");
        if (extras2.containsKey("KEY_WORKSPEC_GENERATION")) {
            int i6 = extras2.getInt("KEY_WORKSPEC_GENERATION");
            ArrayList arrayList2 = new ArrayList(1);
            gl4 s2 = qr2Var.s(new rc5(i6, string));
            list = arrayList2;
            if (s2 != null) {
                arrayList2.add(s2);
                list = arrayList2;
            }
        } else {
            list = qr2Var.t(string);
        }
        for (gl4 gl4Var : list) {
            cx.f().b(s, "Handing stopWork work for " + string);
            rm3 rm3Var = tp4Var.w;
            rm3Var.getClass();
            gl4Var.getClass();
            rm3Var.R(gl4Var, -512);
            rc5 rc5Var = gl4Var.a;
            Context context3 = this.n;
            WorkDatabase workDatabase2 = tp4Var.r.c;
            String str6 = o6.a;
            bq4 x = workDatabase2.x();
            zp4 k = x.k(rc5Var);
            if (k != null) {
                o6.a(context3, rc5Var, k.c);
                cx.f().b(o6.a, "Removing SystemIdInfo for workSpecId (" + rc5Var + ")");
                String str7 = rc5Var.a;
                int i7 = rc5Var.b;
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) x.n;
                workDatabase_Impl.b();
                aq4 aq4Var = (aq4) x.p;
                df1 a2 = aq4Var.a();
                a2.h(1, str7);
                a2.c(2, i7);
                try {
                    workDatabase_Impl.c();
                    try {
                        a2.b();
                        workDatabase_Impl.t();
                        workDatabase_Impl.o();
                    } catch (Throwable th) {
                        workDatabase_Impl.o();
                        throw th;
                    }
                } finally {
                    aq4Var.h(a2);
                }
            }
            tp4Var.b(rc5Var, false);
        }
    }

    @Override // defpackage.w21
    public final void b(rc5 rc5Var, boolean z) {
        synchronized (this.p) {
            try {
                co0 co0Var = (co0) this.o.remove(rc5Var);
                this.r.s(rc5Var);
                if (co0Var != null) {
                    co0Var.f(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
