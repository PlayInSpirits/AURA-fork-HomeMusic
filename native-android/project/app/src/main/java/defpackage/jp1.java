package defpackage;

import android.net.ConnectivityManager;
import android.os.SystemClock;
import com.eddyizm.tempus.App;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jp1 {
    public static final AtomicReference a = null;

    static {
        a = new AtomicReference();
    }

    public static final boolean a() {
        if (xa3.u("homemusic_traffic_economy", true) == true) goto L5;
        return false;
    L5:
        if (b() == false) goto L9;
        return true;
    L9:
        return false;
    }

    public static final boolean b() {
        long r0 = SystemClock.elapsedRealtime();
        AtomicReference r2 = a;
        ip1 r3 = (ip1) r2.get();
        if (r3 != null) goto L5;
    L8:
        Object r4 = App.a().getSystemService("connectivity");
        if ((r4 instanceof ConnectivityManager) == false) goto L11;
        ConnectivityManager r5 = (ConnectivityManager) r4;
    L12:
        if (r5 == null) goto L14;
        boolean r6 = r5.isActiveNetworkMetered();
    L15:
        r2.set(new ip1(r6, r0));
        return r6;
    L14:
        r6 = true;
        goto L15
    L11:
        r5 = null;
        goto L12
    L5:
        if ((r0 - r3.b) >= 2000) goto L8;
        return r3.a;
    }
}
