package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o6 {
    public static final String a = null;

    static {
        a = cx.i("Alarms");
    }

    public static void a(Context r4, rc5 r5, int r6) {
        AlarmManager r0 = (AlarmManager) r4.getSystemService("alarm");
        String r1 = k60.s;
        Intent r2 = new Intent(r4, SystemAlarmService.class);
        r2.setAction("ACTION_DELAY_MET");
        k60.d(r2, r5);
        PendingIntent r7 = PendingIntent.getService(r4, r6, r2, 603979776);
        if (r7 == null) goto L7;
        if (r0 == null) goto L8;
        cx.f().b(a, "Cancelling existing alarm with (workSpecId, systemId) (" + r5 + ", " + r6 + ")");
        r0.cancel(r7);
        return;
    L8:
        return;
    }

    public static void b(Context r9, WorkDatabase r10, rc5 r11, long r12) {
        bq4 r0 = r10.x();
        zp4 r1 = r0.k(r11);
        if (r1 == null) goto L8;
        int r13 = r1.c;
        a(r9, r11, r13);
        AlarmManager r2 = (AlarmManager) r9.getSystemService("alarm");
        String r3 = k60.s;
        Intent r4 = new Intent(r9, SystemAlarmService.class);
        r4.setAction("ACTION_DELAY_MET");
        k60.d(r4, r11);
        PendingIntent r14 = PendingIntent.getService(r9, r13, r4, 201326592);
        if (r2 == null) goto L12;
        r2.setExact(0, r12, r14);
        return;
    L12:
        return;
    L8:
        int r8 = 1;
        Object r15 = r10.r(new tp(r8, new rv1(r10, 0)));
        r15.getClass();
        int r16 = ((Number) r15).intValue();
        r0.n(new zp4(r11.a, r11.b, r16));
        AlarmManager r5 = (AlarmManager) r9.getSystemService("alarm");
        String r6 = k60.s;
        Intent r7 = new Intent(r9, SystemAlarmService.class);
        r7.setAction("ACTION_DELAY_MET");
        k60.d(r7, r11);
        PendingIntent r17 = PendingIntent.getService(r9, r16, r7, 201326592);
        if (r5 == null) goto L13;
        r5.setExact(0, r12, r17);
        return;
    }
}
