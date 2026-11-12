package defpackage;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class g62 implements NsdManager.DiscoveryListener {
    public final /* synthetic */ h62 a;
    public final /* synthetic */ long b;

    public g62(h62 h62Var, long j) {
        this.a = h62Var;
        this.b = j;
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public final void onDiscoveryStarted(String str) {
        str.getClass();
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public final void onDiscoveryStopped(String str) {
        str.getClass();
        h62 h62Var = this.a;
        h62Var.D0.post(new sn1(h62Var, this.b, this));
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public final void onServiceFound(NsdServiceInfo nsdServiceInfo) {
        nsdServiceInfo.getClass();
        h62 h62Var = this.a;
        h62Var.D0.post(new e62(h62Var, this.b, nsdServiceInfo, 3));
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public final void onServiceLost(NsdServiceInfo nsdServiceInfo) {
        nsdServiceInfo.getClass();
        h62 h62Var = this.a;
        h62Var.D0.post(new e62(h62Var, this.b, nsdServiceInfo, 2));
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public final void onStartDiscoveryFailed(String str, int i) {
        str.getClass();
        h62 h62Var = this.a;
        h62Var.D0.post(new mm(h62Var, this.b, 4));
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public final void onStopDiscoveryFailed(String str, int i) {
        str.getClass();
        h62 h62Var = this.a;
        h62Var.D0.post(new sn1(h62Var, this.b, this));
    }
}
