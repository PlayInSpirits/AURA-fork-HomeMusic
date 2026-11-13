package defpackage;

import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class jf5 extends BroadcastReceiver {
    public Context a;
    public final wo0 b;

    public jf5(wo0 wo0Var) {
        this.b = wo0Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            wo0 wo0Var = this.b;
            df5 df5Var = (df5) ((qf5) wo0Var.o).p;
            df5Var.p.set(null);
            zw2 zw2Var = df5Var.t.A;
            zw2Var.sendMessage(zw2Var.obtainMessage(3));
            AlertDialog alertDialog = (AlertDialog) wo0Var.n;
            if (alertDialog.isShowing()) {
                alertDialog.dismiss();
            }
            synchronized (this) {
                try {
                    Context context2 = this.a;
                    if (context2 != null) {
                        context2.unregisterReceiver(this);
                    }
                    this.a = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
