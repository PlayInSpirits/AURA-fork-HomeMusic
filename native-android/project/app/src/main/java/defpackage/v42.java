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

    public v42(Handler handler, fx3 fx3Var, f9 f9Var, LinkedHashMap linkedHashMap, ArrayAdapter arrayAdapter) {
        this.a = handler;
        this.b = fx3Var;
        this.c = f9Var;
        this.d = linkedHashMap;
        this.e = arrayAdapter;
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public final void onDiscoveryStarted(String str) {
        str.getClass();
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public final void onDiscoveryStopped(String str) {
        str.getClass();
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public final void onServiceFound(NsdServiceInfo nsdServiceInfo) {
        nsdServiceInfo.getClass();
        this.a.post(new mr(this.b, this.d, nsdServiceInfo, this.e, this.c, 5));
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public final void onServiceLost(NsdServiceInfo nsdServiceInfo) {
        nsdServiceInfo.getClass();
        this.a.post(new t6(this.b, this.d, nsdServiceInfo, this.e, 12));
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public final void onStartDiscoveryFailed(String str, int i) {
        str.getClass();
        this.a.post(new ws1(7, this.b, this.c));
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public final void onStopDiscoveryFailed(String str, int i) {
        str.getClass();
    }
}
