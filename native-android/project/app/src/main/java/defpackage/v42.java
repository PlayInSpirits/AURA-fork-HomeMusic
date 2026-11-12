package defpackage;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.os.Handler;
import android.widget.ArrayAdapter;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class v42 implements NsdManager.DiscoveryListener {
    public final /* synthetic */ Handler a;
    public final /* synthetic */ fx3 b;
    public final /* synthetic */ f9 c;
    public final /* synthetic */ LinkedHashMap d;
    public final /* synthetic */ ArrayAdapter e;

    public v42(Handler r1, fx3 r2, f9 r3, LinkedHashMap r4, ArrayAdapter r5) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.e = r5;
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public final void onDiscoveryStarted(String r1) {
        r1.getClass();
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public final void onDiscoveryStopped(String r1) {
        r1.getClass();
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public final void onServiceFound(NsdServiceInfo r8) {
        r8.getClass();
        mr r0 = new mr(this.b, this.d, r8, this.e, this.c, 5);
        this.a.post(r0);
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public final void onServiceLost(NsdServiceInfo r7) {
        r7.getClass();
        fx3 r1 = this.b;
        LinkedHashMap r2 = this.d;
        ArrayAdapter r4 = this.e;
        t6 r0 = new t6(r1, r2, r7, r4, 12);
        this.a.post(r0);
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public final void onStartDiscoveryFailed(String r3, int r4) {
        r3.getClass();
        ws1 r5 = new ws1(7, this.b, this.c);
        this.a.post(r5);
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public final void onStopDiscoveryFailed(String r1, int r2) {
        r1.getClass();
    }
}
