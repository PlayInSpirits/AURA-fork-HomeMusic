package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u9 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ w9 o;

    public /* synthetic */ u9(w9 r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        w9 r5 = this.o;
        switch(r0) {
            case 0: goto L12;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        Uri r1 = w9.g;
        r5.a();
        return;
    L6:
        v9 r2 = r5.d;
        IntentFilter r3 = new IntentFilter("androidx.car.app.connection.action.CAR_CONNECTION_UPDATED");
        int r4 = Build.VERSION.SDK_INT;
        Context r6 = r5.a;
        if (r4 < 33) goto L9;
        j3.p(r6, r2, r3);
    L10:
        r5.a();
        return;
    L9:
        r6.registerReceiver(r2, r3);
        goto L10
    L12:
        r5.a.unregisterReceiver(r5.d);
    }
}
