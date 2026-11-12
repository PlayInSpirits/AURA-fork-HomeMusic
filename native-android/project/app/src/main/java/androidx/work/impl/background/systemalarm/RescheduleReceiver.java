package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.cx;
import defpackage.sc5;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    public static final String a = cx.i("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        cx.f().b(a, "Received intent " + intent);
        try {
            sc5 sc5VarB = sc5.b(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            synchronized (sc5.m) {
                try {
                    BroadcastReceiver.PendingResult pendingResult = sc5VarB.i;
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    sc5VarB.i = pendingResultGoAsync;
                    if (sc5VarB.h) {
                        pendingResultGoAsync.finish();
                        sc5VarB.i = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (IllegalStateException e) {
            cx.f().e(a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }
}
