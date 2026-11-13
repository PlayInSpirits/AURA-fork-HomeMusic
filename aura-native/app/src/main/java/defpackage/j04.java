package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class j04 extends ConnectivityManager.NetworkCallback {
    public boolean a;
    public boolean b;
    public final /* synthetic */ hq1 c;

    public j04(hq1 hq1Var) {
        this.c = hq1Var;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        ((Handler) this.c.e).post(new i04(this, 0));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onBlockedStatusChanged(Network network, boolean z) {
        if (z) {
            return;
        }
        ((Handler) this.c.e).post(new i04(this, 1));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        boolean hasCapability = networkCapabilities.hasCapability(16);
        boolean z = this.a;
        int i = 1;
        hq1 hq1Var = this.c;
        if (z && this.b == hasCapability) {
            if (hasCapability) {
                ((Handler) hq1Var.e).post(new i04(this, i));
            }
        } else {
            this.a = true;
            this.b = hasCapability;
            ((Handler) hq1Var.e).post(new i04(this, 0));
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        ((Handler) this.c.e).post(new i04(this, 0));
    }
}
