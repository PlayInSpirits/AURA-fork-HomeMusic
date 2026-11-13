package defpackage;

import android.net.ConnectivityManager;
import android.os.SystemClock;
import com.eddyizm.tempus.App;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class jp1 {
    public static final AtomicReference a = new AtomicReference();

    public static final boolean a() {
        return xa3.u("homemusic_traffic_economy", true) && b();
    }

    public static final boolean b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        AtomicReference atomicReference = a;
        ip1 ip1Var = (ip1) atomicReference.get();
        if (ip1Var != null && elapsedRealtime - ip1Var.b < 2000) {
            return ip1Var.a;
        }
        Object systemService = App.a().getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        boolean isActiveNetworkMetered = connectivityManager != null ? connectivityManager.isActiveNetworkMetered() : true;
        atomicReference.set(new ip1(isActiveNetworkMetered, elapsedRealtime));
        return isActiveNetworkMetered;
    }
}
