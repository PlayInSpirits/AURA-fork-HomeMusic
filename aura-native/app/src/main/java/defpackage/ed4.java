package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ed4 extends ConnectivityManager.NetworkCallback {
    public ed4() {
        super();
    }

    public static final ed4 a = new ed4();
    public static final Object b = new Object();
    public static final LinkedHashMap c = new LinkedHashMap();

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        List<Map.Entry> Q0;
        boolean canBeSatisfiedBy;
        network.getClass();
        networkCapabilities.getClass();
        cx.f().b(lc5.a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        synchronized (b) {
            Q0 = q40.Q0(c.entrySet());
        }
        for (Map.Entry entry : Q0) {
            NetworkRequest networkRequest = (NetworkRequest) entry.getKey();
            if1 if1Var = (if1) entry.getValue();
            canBeSatisfiedBy = networkRequest.canBeSatisfiedBy(networkCapabilities);
            if1Var.invoke(canBeSatisfiedBy ? rc0.a : new sc0(7));
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        List Q0;
        network.getClass();
        cx.f().b(lc5.a, "NetworkRequestConstraintController onLost callback");
        synchronized (b) {
            Q0 = q40.Q0(c.values());
        }
        Iterator it = Q0.iterator();
        while (it.hasNext()) {
            ((if1) it.next()).invoke(new sc0(7));
        }
    }
}
