package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class j04 extends ConnectivityManager.NetworkCallback {
    public boolean a;
    public boolean b;
    public final /* synthetic */ hq1 c;

    public j04(hq1 r1) {
        this.c = r1;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network r3) {
        ((Handler) this.c.e).post(new i04(this, 0));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onBlockedStatusChanged(Network r2, boolean r3) {
        if (r3 == true) goto L5;
        ((Handler) this.c.e).post(new i04(this, 1));
        return;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network r3, NetworkCapabilities r4) {
        boolean r5 = r4.hasCapability(16);
        boolean r6 = this.a;
        int r0 = 1;
        hq1 r1 = this.c;
        if (r6 == true) goto L5;
    L10:
        this.a = true;
        this.b = r5;
        ((Handler) r1.e).post(new i04(this, 0));
        return;
    L5:
        if (this.b != r5) goto L10;
        if (r5 == false) goto L12;
        ((Handler) r1.e).post(new i04(this, r0));
        return;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network r3) {
        ((Handler) this.c.e).post(new i04(this, 0));
    }
}
