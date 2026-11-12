package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;
import android.os.SystemClock;
import com.eddyizm.tempus.service.MediaService;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wp extends ConnectivityManager.NetworkCallback {
    public int a;
    public final /* synthetic */ MediaService b;

    public wp(MediaService r1) {
        this.b = r1;
        this.a = e03.d();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network r9, NetworkCapabilities r10) {
        MediaService r0 = this.b;
        Handler r1 = r0.B;
        r9.getClass();
        r10.getClass();
        boolean r11 = jp1.a();
        jp1.a.set(null);
        boolean r2 = jp1.a();
        Pattern r3 = e03.a;
        int r4 = 1;
        boolean r5 = false;
        if (r10.hasTransport(1) == false) goto L6;
        int r12 = 1;
    L10:
        if (r12 != this.a) goto L14;
        if (r2 == r11) goto L22;
        r1.post(new sp(r0, 1));
        return;
    L22:
        return;
    L14:
        this.a = r12;
        if (r12 == 1) goto L17;
        if (r12 == 0) goto L17;
    L18:
        if (r5 == false) goto L20;
        e03.c.set(new d03(r12, SystemClock.elapsedRealtime()));
    L20:
        r1.post(new pm(r0, r5, r4));
        return;
    L17:
        r5 = true;
        goto L18
    L6:
        if (r10.hasTransport(0) == false) goto L8;
        r12 = 0;
        goto L10
    L8:
        r12 = -2;
        goto L10
    }
}
