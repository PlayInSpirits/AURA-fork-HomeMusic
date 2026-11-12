package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ed4 extends ConnectivityManager.NetworkCallback {
    public static final ed4 a = new ed4();
    public static final Object b = new Object();
    public static final LinkedHashMap c = new LinkedHashMap();

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        List<Map.Entry> listQ0;
        network.getClass();
        networkCapabilities.getClass();
        cx.f().b(lc5.a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        synchronized (b) {
            listQ0 = q40.Q0(c.entrySet());
        }
        for (Map.Entry entry : listQ0) {
            ((if1) entry.getValue()).invoke(((NetworkRequest) entry.getKey()).canBeSatisfiedBy(networkCapabilities) ? rc0.a : new sc0(7));
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        List listQ0;
        network.getClass();
        cx.f().b(lc5.a, "NetworkRequestConstraintController onLost callback");
        synchronized (b) {
            listQ0 = q40.Q0(c.values());
        }
        Iterator it = listQ0.iterator();
        while (it.hasNext()) {
            ((if1) it.next()).invoke(new sc0(7));
        }
    }
}
