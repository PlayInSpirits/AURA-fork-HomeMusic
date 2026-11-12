package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import defpackage.cx;
import defpackage.gb;
import defpackage.i93;
import defpackage.j93;
import defpackage.mc5;
import defpackage.sc5;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    public static final String a = cx.i("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        cx cxVarF = cx.f();
        String str = a;
        cxVarF.b(str, "Requesting diagnostics");
        try {
            context.getClass();
            sc5 sc5VarB = sc5.b(context);
            List listO = gb.O((j93) new i93(DiagnosticsWorker.class).b());
            if (listO.isEmpty()) {
                throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
            }
            new mc5(sc5VarB, null, 2, listO, 0).a();
        } catch (IllegalStateException e) {
            cx.f().e(str, "WorkManager is not initialized", e);
        }
    }
}
