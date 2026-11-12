package defpackage;

import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w22 {
    public static final String a = null;

    static {
        a = cx.i("SystemJobScheduler");
    }

    public static final JobScheduler a(Context r2) {
        r2.getClass();
        Object r3 = r2.getSystemService("jobscheduler");
        r3.getClass();
        JobScheduler r4 = (JobScheduler) r3;
        if (Build.VERSION.SDK_INT < 34) goto L6;
        JobScheduler r5 = v22.d(r4);
        r5.getClass();
        return r5;
    L6:
        return r4;
    }
}
