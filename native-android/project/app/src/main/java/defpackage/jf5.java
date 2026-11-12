package defpackage;

import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jf5 extends BroadcastReceiver {
    public Context a;
    public final wo0 b;

    public jf5(wo0 r1) {
        this.b = r1;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context r3, Intent r4) {
        Uri r5 = r4.getData();
        if (r5 == null) goto L5;
        String r6 = r5.getSchemeSpecificPart();
    L7:
        if ("com.google.android.gms".equals(r6) == false) goto L22;
        wo0 r7 = this.b;
        df5 r0 = (df5) ((qf5) r7.o).p;
        r0.p.set(null);
        zw2 r1 = r0.t.A;
        r1.sendMessage(r1.obtainMessage(3));
        AlertDialog r8 = (AlertDialog) r7.n;
        if (r8.isShowing() == false) goto L11;
        r8.dismiss();
    L11:
        monitor-enter(this);
        Context r9 = this.a;     // Catch: Throwable -> L15
        if (r9 == null) goto L17;
        r9.unregisterReceiver(this);     // Catch: Throwable -> L15
    L17:
        this.a = null;     // Catch: Throwable -> L15
        monitor-exit(this);
        return;
    L15:
        th = move-exception;
        throw th;
    L22:
        return;
    L5:
        r6 = null;
        goto L7
    }
}
