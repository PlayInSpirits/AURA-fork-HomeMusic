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
    public int a = e03.d();
    public final /* synthetic */ MediaService b;

    public wp(MediaService mediaService) {
        this.b = mediaService;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        int i;
        MediaService mediaService = this.b;
        Handler handler = mediaService.B;
        network.getClass();
        networkCapabilities.getClass();
        boolean zA = jp1.a();
        jp1.a.set(null);
        boolean zA2 = jp1.a();
        Pattern pattern = e03.a;
        int i2 = 1;
        if (networkCapabilities.hasTransport(1)) {
            i = 1;
        } else {
            i = networkCapabilities.hasTransport(0) ? 0 : -2;
        }
        if (i == this.a) {
            if (zA2 != zA) {
                handler.post(new sp(mediaService, 1));
            }
        } else {
            this.a = i;
            boolean z = i == 1 || i == 0;
            if (z) {
                e03.c.set(new d03(i, SystemClock.elapsedRealtime()));
            }
            handler.post(new pm(mediaService, z, i2));
        }
    }
}
