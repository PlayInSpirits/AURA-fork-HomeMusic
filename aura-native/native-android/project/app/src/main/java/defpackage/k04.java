package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class k04 extends jw2 {
    public final /* synthetic */ int c = 1;
    public final Context d;

    public k04(Context context) {
        super(9, 10);
        this.d = context;
    }

    @Override // defpackage.jw2
    public final void a(we1 we1Var) {
        int i = this.c;
        Context context = this.d;
        we1Var.getClass();
        switch (i) {
            case 0:
                if (this.b >= 10) {
                    we1Var.s(new Object[]{"reschedule_needed", 1});
                    return;
                } else {
                    context.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                    return;
                }
            default:
                we1Var.q("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
                if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                    long j = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                    long j2 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
                    we1Var.b();
                    try {
                        we1Var.s(new Object[]{"last_cancel_all_time_ms", Long.valueOf(j)});
                        we1Var.s(new Object[]{"reschedule_needed", Long.valueOf(j2)});
                        sharedPreferences.edit().clear().apply();
                        we1Var.H();
                        we1Var.n();
                    } catch (Throwable th) {
                        we1Var.n();
                        throw th;
                    }
                }
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
                if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                    int i2 = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                    int i3 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                    we1Var.b();
                    try {
                        we1Var.s(new Object[]{"next_job_scheduler_id", Integer.valueOf(i2)});
                        we1Var.s(new Object[]{"next_alarm_manager_id", Integer.valueOf(i3)});
                        sharedPreferences2.edit().clear().apply();
                        we1Var.H();
                        return;
                    } finally {
                        we1Var.n();
                    }
                }
                return;
        }
    }

    public k04(Context context, int i, int i2) {
        super(i, i2);
        this.d = context;
    }
}
