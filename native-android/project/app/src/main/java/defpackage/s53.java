package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s53 {
    public static final String a = null;

    static {
        a = cx.i("NetworkStateTracker");
    }

    public static final q53 a(ConnectivityManager r8) {
        r8.getClass();
        NetworkInfo r0 = r8.getActiveNetworkInfo();
        boolean r1 = true;
        if (r0 != null) goto L5;
    L7:
        boolean r3 = false;
    L24:
        NetworkCapabilities r4 = r8.getNetworkCapabilities(r8.getActiveNetwork());     // Catch: SecurityException -> L12
        if (r4 == null) goto L14;
        boolean r5 = r4.hasCapability(16);     // Catch: SecurityException -> L12
    L16:
        boolean r9 = r8.isActiveNetworkMetered();
        if (r0 != null) goto L19;
    L21:
        r1 = false;
    L23:
        return new q53(r3, r5, r9, r1);
    L19:
        if (r0.isRoaming() == true) goto L21;
    L14:
        r5 = false;
    L12:
        e = move-exception;
        cx.f().e(a, "Unable to validate active network", e);
        goto L14
    L5:
        if (r0.isConnected() == false) goto L7;
        r3 = true;
        goto L24
    }
}
