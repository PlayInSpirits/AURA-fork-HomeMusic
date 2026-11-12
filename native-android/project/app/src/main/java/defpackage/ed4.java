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
    public static final ed4 a = null;
    public static final Object b = null;
    public static final LinkedHashMap c = null;

    static {
        a = new ed4();
        b = new Object();
        c = new LinkedHashMap();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network r3, NetworkCapabilities r4) {
        r3.getClass();
        r4.getClass();
        cx.f().b(lc5.a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        Object r2 = b;
        monitor-enter(r2);
        List r5 = q40.Q0(c.entrySet());     // Catch: Throwable -> L15
        monitor-exit(r2);
        Iterator r6 = r5.iterator();
    L8:
        if (r6.hasNext() == false) goto L14;
        Map.Entry r7 = (Map.Entry) r6.next();
        NetworkRequest r0 = (NetworkRequest) r7.getKey();
        if1 r8 = (if1) r7.getValue();
        if (xq2.x(r0, r4) == false) goto L12;
        Object r1 = rc0.a;
    L13:
        r8.invoke(r1);
        goto L8
    L12:
        r1 = new sc0(7);
        goto L13
    L14:
        return;
    L15:
        th = move-exception;
        throw th;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network r3) {
        r3.getClass();
        cx.f().b(lc5.a, "NetworkRequestConstraintController onLost callback");
        Object r2 = b;
        monitor-enter(r2);
        List r4 = q40.Q0(c.values());     // Catch: Throwable -> L11
        monitor-exit(r2);
        Iterator r5 = r4.iterator();
    L8:
        if (r5.hasNext() == false) goto L10;
        ((if1) r5.next()).invoke(new sc0(7));
        goto L8
    L10:
        return;
    L11:
        th = move-exception;
        throw th;
    }
}
