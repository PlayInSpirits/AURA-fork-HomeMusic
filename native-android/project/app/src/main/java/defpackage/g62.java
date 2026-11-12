package defpackage;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class g62 implements NsdManager.DiscoveryListener {
    public final /* synthetic */ h62 a;
    public final /* synthetic */ long b;

    public g62(h62 r1, long r2) {
        this.a = r1;
        this.b = r2;
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public final void onDiscoveryStarted(String r1) {
        r1.getClass();
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public final void onDiscoveryStopped(String r5) {
        r5.getClass();
        h62 r6 = this.a;
        r6.D0.post(new sn1(r6, this.b, this));
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public final void onServiceFound(NsdServiceInfo r8) {
        r8.getClass();
        h62 r1 = this.a;
        Handler r6 = r1.D0;
        long r2 = this.b;
        r6.post(new e62(r1, r2, r8, 3));
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public final void onServiceLost(NsdServiceInfo r8) {
        r8.getClass();
        h62 r1 = this.a;
        Handler r6 = r1.D0;
        long r2 = this.b;
        r6.post(new e62(r1, r2, r8, 2));
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public final void onStartDiscoveryFailed(String r5, int r6) {
        r5.getClass();
        h62 r7 = this.a;
        Handler r8 = r7.D0;
        long r2 = this.b;
        r8.post(new mm(r7, r2, 4));
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public final void onStopDiscoveryFailed(String r4, int r5) {
        r4.getClass();
        h62 r6 = this.a;
        r6.D0.post(new sn1(r6, this.b, this));
    }
}
