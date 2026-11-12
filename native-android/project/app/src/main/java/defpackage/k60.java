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

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
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

    /* JADX WARN: Bottom block not found for handler: all -> 0x0389 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Intent intent, int i, tp4 tp4Var) {
        List<gl4> listT;
        ArrayList arrayList;
        String action = intent.getAction();
        int i2 = 3;
        int i3 = 0;
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            cx.f().b(s, "Handling constraints changed " + intent);
            Context context = this.n;
            pc0 pc0Var = new pc0(context, this.q, i, tp4Var);
            ArrayList arrayListF = tp4Var.r.c.A().f();
            String str = ob0.a;
            int size = arrayListF.size();
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayListF.get(i4);
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
            ArrayList arrayList2 = new ArrayList(arrayListF.size());
            pc0Var.a.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            int size2 = arrayListF.size();
            int i5 = 0;
            while (i5 < size2) {
                Object obj2 = arrayListF.get(i5);
                i5++;
                dd5 dd5Var = (dd5) obj2;
                if (jCurrentTimeMillis >= dd5Var.a() && (!dd5Var.c() || pc0Var.c.c(dd5Var))) {
                    arrayList2.add(dd5Var);
                }
            }
            int size3 = arrayList2.size();
            while (i3 < size3) {
                Object obj3 = arrayList2.get(i3);
                i3++;
                dd5 dd5Var2 = (dd5) obj3;
                String str3 = dd5Var2.a;
                rc5 rc5VarM = q05.m(dd5Var2);
                Intent intent3 = new Intent(context, (Class<?>) SystemAlarmService.class);
                intent3.setAction("ACTION_DELAY_MET");
                d(intent3, rc5VarM);
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
            rc5 rc5VarC = c(intent);
            cx cxVarF = cx.f();
            String str4 = s;
            cxVarF.b(str4, "Handling schedule work for " + rc5VarC);
            WorkDatabase workDatabase = tp4Var.r.c;
            workDatabase.c();
            try {
                dd5 dd5VarH = workDatabase.A().h(rc5VarC.a);
                if (dd5VarH == null) {
                    cx.f().k(str4, "Skipping scheduling " + rc5VarC + " because it's no longer in the DB");
                    return;
                }
                if (f34.c(dd5VarH.b)) {
                    cx.f().k(str4, "Skipping scheduling " + rc5VarC + "because it is finished.");
                    return;
                }
                long jA = dd5VarH.a();
                if (dd5VarH.c()) {
                    cx.f().b(str4, "Opportunistically setting an alarm for " + rc5VarC + "at " + jA);
                    o6.b(context2, workDatabase, rc5VarC, jA);
                    Intent intent4 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                    intent4.setAction("ACTION_CONSTRAINTS_CHANGED");
                    ((vc5) tp4Var.o.q).execute(new eh(tp4Var, intent4, i, i2));
                } else {
                    cx.f().b(str4, "Setting up Alarms for " + rc5VarC + "at " + jA);
                    o6.b(context2, workDatabase, rc5VarC, jA);
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
                    rc5 rc5VarC2 = c(intent);
                    cx cxVarF2 = cx.f();
                    String str5 = s;
                    cxVarF2.b(str5, "Handing delay met for " + rc5VarC2);
                    if (this.o.containsKey(rc5VarC2)) {
                        cx.f().b(str5, "WorkSpec " + rc5VarC2 + " is is already being handled for ACTION_DELAY_MET");
                    } else {
                        co0 co0Var = new co0(this.n, i, tp4Var, this.r.w(rc5VarC2));
                        this.o.put(rc5VarC2, co0Var);
                        co0Var.e();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        if (!"ACTION_STOP_WORK".equals(action)) {
            if (!"ACTION_EXECUTION_COMPLETED".equals(action)) {
                cx.f().k(s, "Ignoring intent " + intent);
                return;
            }
            rc5 rc5VarC3 = c(intent);
            boolean z5 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
            cx.f().b(s, "Handling onExecutionCompleted " + intent + ", " + i);
            b(rc5VarC3, z5);
            return;
        }
        qr2 qr2Var = this.r;
        Bundle extras2 = intent.getExtras();
        String string = extras2.getString("KEY_WORKSPEC_ID");
        if (extras2.containsKey("KEY_WORKSPEC_GENERATION")) {
            int i6 = extras2.getInt("KEY_WORKSPEC_GENERATION");
            arrayList = new ArrayList(1);
            gl4 gl4VarS = qr2Var.s(new rc5(i6, string));
            if (gl4VarS != null) {
                listT = arrayList;
                arrayList.add(gl4VarS);
                listT = arrayList;
            }
        } else {
            listT = qr2Var.t(string);
        }
        listT = arrayList;
        for (gl4 gl4Var : listT) {
            cx.f().b(s, "Handing stopWork work for " + string);
            rm3 rm3Var = tp4Var.w;
            rm3Var.getClass();
            gl4Var.getClass();
            rm3Var.R(gl4Var, -512);
            rc5 rc5Var = gl4Var.a;
            Context context3 = this.n;
            WorkDatabase workDatabase2 = tp4Var.r.c;
            String str6 = o6.a;
            bq4 bq4VarX = workDatabase2.x();
            zp4 zp4VarK = bq4VarX.k(rc5Var);
            if (zp4VarK != null) {
                o6.a(context3, rc5Var, zp4VarK.c);
                cx.f().b(o6.a, "Removing SystemIdInfo for workSpecId (" + rc5Var + ")");
                String str7 = rc5Var.a;
                int i7 = rc5Var.b;
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) bq4VarX.n;
                workDatabase_Impl.b();
                aq4 aq4Var = (aq4) bq4VarX.p;
                df1 df1VarA = aq4Var.a();
                df1VarA.h(1, str7);
                df1VarA.c(2, i7);
                workDatabase_Impl.c();
                try {
                    df1VarA.b();
                    workDatabase_Impl.t();
                    workDatabase_Impl.o();
                    aq4Var.h(df1VarA);
                } catch (Throwable th2) {
                    workDatabase_Impl.o();
                    throw th2;
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
