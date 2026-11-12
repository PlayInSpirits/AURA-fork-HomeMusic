package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ob0 extends BroadcastReceiver {
    public static final String a = null;

    static {
        a = cx.i("ConstraintProxy");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context r3, Intent r4) {
        cx.f().b(a, "onReceive : " + r4);
        String r2 = k60.s;
        Intent r5 = new Intent(r3, SystemAlarmService.class);
        r5.setAction("ACTION_CONSTRAINTS_CHANGED");
        r3.startService(r5);
    }
}
