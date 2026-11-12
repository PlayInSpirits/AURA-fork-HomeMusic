package defpackage;

import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import com.eddyizm.tempus.service.DownloaderService;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dh3 {
    public static final int d;
    public final int a;
    public final ComponentName b;
    public final JobScheduler c;

    static {
        d = (Build.VERSION.SDK_INT >= 26 ? 16 : 0) | 15;
    }

    public dh3(DownloaderService downloaderService) {
        Context applicationContext = downloaderService.getApplicationContext();
        this.a = 1;
        this.b = new ComponentName(applicationContext, (Class<?>) ch3.class);
        JobScheduler jobScheduler = (JobScheduler) applicationContext.getSystemService("jobscheduler");
        jobScheduler.getClass();
        this.c = jobScheduler;
    }
}
