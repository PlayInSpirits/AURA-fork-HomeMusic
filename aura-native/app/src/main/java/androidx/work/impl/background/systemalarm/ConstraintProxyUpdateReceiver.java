package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.cx;
import defpackage.pb0;
import defpackage.sc5;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {
    public static final String a = cx.i("ConstrntProxyUpdtRecvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            sc5.b(context).d.h(new pb0(intent, context, goAsync()));
            return;
        }
        cx.f().b(a, "Ignoring unknown action " + action);
    }
}
