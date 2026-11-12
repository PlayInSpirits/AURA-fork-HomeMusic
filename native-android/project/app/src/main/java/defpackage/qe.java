package defpackage;

import android.app.Notification;
import android.app.job.JobParameters;
import android.content.Context;
import android.widget.EdgeEffect;
import androidx.work.impl.background.systemjob.SystemJobService;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class qe {
    public static EdgeEffect a(Context r2) {
        return new EdgeEffect(r2, null);
    L5:
        return new EdgeEffect(r2);
    }

    public static float b(EdgeEffect r0) {
        return r0.getDistance();
    L4:
        return 0.0f;
    }

    public static int c(JobParameters r1) {
        int r2 = r1.getStopReason();
        String r0 = SystemJobService.r;
        switch(r2) {
            case 0: goto L6;
            case 1: goto L6;
            case 2: goto L6;
            case 3: goto L6;
            case 4: goto L6;
            case 5: goto L6;
            case 6: goto L6;
            case 7: goto L6;
            case 8: goto L6;
            case 9: goto L6;
            case 10: goto L6;
            case 11: goto L6;
            case 12: goto L6;
            case 13: goto L6;
            case 14: goto L6;
            case 15: goto L6;
            default: goto L4;
        };
    L4:
        return -512;
    L6:
        return r2;
    }

    public static float d(EdgeEffect r0, float r1, float r2) {
        return r0.onPullDistance(r1, r2);
    L4:
        r0.onPull(r1, r2);
        return 0.0f;
    }

    public static void e(Notification.Action.Builder r1) {
        r1.setAuthenticationRequired(false);
    }

    public static void f(Notification.Builder r0, int r1) {
        r0.setForegroundServiceBehavior(r1);
    }
}
