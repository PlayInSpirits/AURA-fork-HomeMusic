package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class oy1 extends ConnectivityManager.NetworkCallback {
    public static final /* synthetic */ int c = 0;
    public final /* synthetic */ int a;
    public final Object b;

    public oy1(br0 br0Var) {
        this.a = 0;
        this.b = br0Var;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        switch (this.a) {
            case 2:
                e35.C().post(new lf4(this, true));
                break;
            default:
                super.onAvailable(network);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                network.getClass();
                networkCapabilities.getClass();
                cx.f().b(lc5.a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
                ((br0) obj).invoke(rc0.a);
                break;
            case 1:
                network.getClass();
                networkCapabilities.getClass();
                cx.f().b(s53.a, "Network capabilities changed: " + networkCapabilities);
                r53 r53Var = (r53) obj;
                r53Var.b(Build.VERSION.SDK_INT >= 28 ? new q53(networkCapabilities.hasCapability(12), networkCapabilities.hasCapability(16), !networkCapabilities.hasCapability(11), networkCapabilities.hasCapability(18)) : s53.a(r53Var.f));
                break;
            default:
                super.onCapabilitiesChanged(network, networkCapabilities);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                network.getClass();
                cx.f().b(lc5.a, "NetworkRequestConstraintController onLost callback");
                ((br0) obj).invoke(new sc0(7));
                break;
            case 1:
                network.getClass();
                cx.f().b(s53.a, "Network connection lost");
                r53 r53Var = (r53) obj;
                r53Var.b(s53.a(r53Var.f));
                break;
            default:
                e35.C().post(new lf4(this, false));
                break;
        }
    }

    public /* synthetic */ oy1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
