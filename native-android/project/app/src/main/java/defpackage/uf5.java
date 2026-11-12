package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class uf5 extends zw2 {
    public final Context b;
    public final /* synthetic */ ej1 c;

    public uf5(ej1 r2, Context r3) {
        this.c = r2;
        if (Looper.myLooper() != null) goto L5;
        Looper r4 = Looper.getMainLooper();
    L6:
        super(r4, 2);
        this.b = r3.getApplicationContext();
        return;
    L5:
        r4 = Looper.myLooper();
        goto L6
    }

    @Override // defpackage.zw2, android.os.Handler
    public final void handleMessage(Message r5) {
        int r6 = r5.what;
        if (r6 == 1) goto L6;
        Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + r6);
        return;
    L6:
        int r7 = fj1.a;
        ej1 r1 = this.c;
        Context r4 = this.b;
        int r8 = r1.b(r4, r7);
        int r2 = lj1.e;
        if (r8 != 1) goto L9;
    L15:
        Intent r0 = r1.a(r8, r4, "n");
        if (r0 != null) goto L18;
        PendingIntent r3 = null;
    L19:
        r1.f(r4, r8, r3);
        return;
    L18:
        r3 = PendingIntent.getActivity(r4, 0, r0, 201326592);
        goto L19
    L9:
        if (r8 == 2) goto L15;
        if (r8 == 3) goto L15;
        if (r8 == 9) goto L15;
    }
}
