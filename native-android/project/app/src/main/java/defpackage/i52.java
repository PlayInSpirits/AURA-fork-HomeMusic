package defpackage;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import app.homemusic.R;
import com.eddyizm.tempus.lan.LanReceiverService;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class i52 implements NsdManager.RegistrationListener {
    public final /* synthetic */ LanReceiverService a;

    public i52(LanReceiverService r1) {
        this.a = r1;
    }

    @Override // android.net.nsd.NsdManager.RegistrationListener
    public final void onRegistrationFailed(NsdServiceInfo r2, int r3) {
        r2.getClass();
        LanReceiverService r1 = this.a;
        String r4 = r1.getString(R.string.lan_discovery_error);
        r4.getClass();
        LanReceiverService.z = r4;
        r1.n.post(new f52(r1, 1));
    }

    @Override // android.net.nsd.NsdManager.RegistrationListener
    public final void onServiceRegistered(NsdServiceInfo r2) {
        r2.getClass();
        this.a.u = true;
        w42 r3 = w42.a;
        w42.b("Receiver advertised on local network");
        if (this.a.o == false) goto L13;
        return;
    L13:
        NsdManager r4 = this.a.t;     // Catch: Throwable -> L12
        if (r4 == null) goto L9;
        r4.unregisterService(this);     // Catch: Throwable -> L12
        return;
    L9:
        h12.Q("nsd");     // Catch: Throwable -> L12
        throw null;     // Catch: Throwable -> L12
    }

    @Override // android.net.nsd.NsdManager.RegistrationListener
    public final void onServiceUnregistered(NsdServiceInfo r1) {
        r1.getClass();
        this.a.u = false;
    }

    @Override // android.net.nsd.NsdManager.RegistrationListener
    public final void onUnregistrationFailed(NsdServiceInfo r1, int r2) {
        r1.getClass();
        this.a.u = false;
    }
}
