package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class k04 extends jw2 {
    public final /* synthetic */ int c;
    public final Context d;

    public k04(Context r3) {
        this.c = 1;
        super(9, 10);
        this.d = r3;
    }

    @Override // defpackage.jw2
    public final void a(we1 r10) {
        int r0 = this.c;
        Context r4 = this.d;
        r10.getClass();
        switch(r0) {
            case 0: goto L29;
            default: goto L4;
        };
    L4:
        r10.q("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        SharedPreferences r9 = r4.getSharedPreferences("androidx.work.util.preferences", 0);
        if (r9.contains("reschedule_needed") == false) goto L7;
    L8:
        long r5 = 0;
        long r7 = r9.getLong("last_cancel_all_time_ms", 0);
        if (r9.getBoolean("reschedule_needed", false) == false) goto L11;
        r5 = 1;
    L11:
        r10.b();
        r10.s(new Object[]{"last_cancel_all_time_ms", Long.valueOf(r7)});     // Catch: Throwable -> L25
        r10.s(new Object[]{"reschedule_needed", Long.valueOf(r5)});     // Catch: Throwable -> L25
        r9.edit().clear().apply();     // Catch: Throwable -> L25
        r10.H();     // Catch: Throwable -> L25
        r10.n();
    L14:
        SharedPreferences r11 = r4.getSharedPreferences("androidx.work.util.id", 0);
        if (r11.contains("next_job_scheduler_id") == false) goto L17;
    L18:
        int r1 = r11.getInt("next_job_scheduler_id", 0);
        int r2 = r11.getInt("next_alarm_manager_id", 0);
        r10.b();
        r10.s(new Object[]{"next_job_scheduler_id", Integer.valueOf(r1)});     // Catch: Throwable -> L22
        r10.s(new Object[]{"next_alarm_manager_id", Integer.valueOf(r2)});     // Catch: Throwable -> L22
        r11.edit().clear().apply();     // Catch: Throwable -> L22
        r10.H();     // Catch: Throwable -> L22
        r10.n();
        return;
    L22:
        th = move-exception;
        r10.n();
        throw th;
    L17:
        if (r11.contains("next_job_scheduler_id") == true) goto L18;
        return;
    L25:
        th = move-exception;
        r10.n();
        throw th;
    L7:
        if (r9.contains("last_cancel_all_time_ms") == false) goto L14;
    L29:
        if (this.b < 10) goto L31;
        r10.s(new Object[]{"reschedule_needed", 1});
        return;
    L31:
        r4.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
    }

    public k04(Context r2, int r3, int r4) {
        this.c = 0;
        super(r3, r4);
        this.d = r2;
    }
}
