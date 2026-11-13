package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class o6 {
    public static final String a = cx.i("Alarms");

    public static void a(Context context, rc5 rc5Var, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        String str = k60.s;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        k60.d(intent, rc5Var);
        PendingIntent service = PendingIntent.getService(context, i, intent, 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        cx.f().b(a, "Cancelling existing alarm with (workSpecId, systemId) (" + rc5Var + ", " + i + ")");
        alarmManager.cancel(service);
    }

    public static void b(Context context, WorkDatabase workDatabase, rc5 rc5Var, long j) {
        bq4 x = workDatabase.x();
        zp4 k = x.k(rc5Var);
        if (k != null) {
            int i = k.c;
            a(context, rc5Var, i);
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            String str = k60.s;
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_DELAY_MET");
            k60.d(intent, rc5Var);
            PendingIntent service = PendingIntent.getService(context, i, intent, 201326592);
            if (alarmManager != null) {
                alarmManager.setExact(0, j, service);
                return;
            }
            return;
        }
        Object r = workDatabase.r(new tp(1, new rv1(workDatabase, 0)));
        r.getClass();
        int intValue = ((Number) r).intValue();
        x.n(new zp4(rc5Var.a, rc5Var.b, intValue));
        AlarmManager alarmManager2 = (AlarmManager) context.getSystemService("alarm");
        String str2 = k60.s;
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_DELAY_MET");
        k60.d(intent2, rc5Var);
        PendingIntent service2 = PendingIntent.getService(context, intValue, intent2, 201326592);
        if (alarmManager2 != null) {
            alarmManager2.setExact(0, j, service2);
        }
    }
}
