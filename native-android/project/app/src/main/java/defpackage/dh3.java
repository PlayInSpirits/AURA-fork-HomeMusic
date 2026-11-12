package defpackage;

import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import com.eddyizm.tempus.service.DownloaderService;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dh3 {
    public static final int d = 0;
    public final int a;
    public final ComponentName b;
    public final JobScheduler c;

    static {
        if (Build.VERSION.SDK_INT < 26) goto L5;
        int r0 = 16;
    L6:
        d = r0 | 15;
        return;
    L5:
        r0 = 0;
        goto L6
    }

    public dh3(DownloaderService r3) {
        Context r4 = r3.getApplicationContext();
        this.a = 1;
        this.b = new ComponentName(r4, ch3.class);
        JobScheduler r5 = (JobScheduler) r4.getSystemService("jobscheduler");
        r5.getClass();
        this.c = r5;
    }
}
