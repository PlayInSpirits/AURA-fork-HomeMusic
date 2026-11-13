package defpackage;

import android.app.Notification;
import android.app.job.JobParameters;
import android.content.Context;
import android.widget.EdgeEffect;
import androidx.work.impl.background.systemjob.SystemJobService;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class qe {
    public static EdgeEffect a(Context context) {
        try {
            return new EdgeEffect(context, null);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    public static float b(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public static int c(JobParameters jobParameters) {
        int stopReason = jobParameters.getStopReason();
        String str = SystemJobService.r;
        switch (stopReason) {
            case 0:
            case 1:
            case 2:
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return stopReason;
            default:
                return -512;
        }
    }

    public static float d(EdgeEffect edgeEffect, float f, float f2) {
        try {
            return edgeEffect.onPullDistance(f, f2);
        } catch (Throwable unused) {
            edgeEffect.onPull(f, f2);
            return 0.0f;
        }
    }

    public static void e(Notification.Action.Builder builder) {
        builder.setAuthenticationRequired(false);
    }

    public static void f(Notification.Builder builder, int i) {
        builder.setForegroundServiceBehavior(i);
    }
}
