package defpackage;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import app.homemusic.R;
import com.eddyizm.tempus.lan.LanReceiverService;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class i52 implements NsdManager.RegistrationListener {
    public final /* synthetic */ LanReceiverService a;

    public i52(LanReceiverService lanReceiverService) {
        this.a = lanReceiverService;
    }

    @Override // android.net.nsd.NsdManager.RegistrationListener
    public final void onRegistrationFailed(NsdServiceInfo nsdServiceInfo, int i) {
        nsdServiceInfo.getClass();
        LanReceiverService lanReceiverService = this.a;
        String string = lanReceiverService.getString(R.string.lan_discovery_error);
        string.getClass();
        LanReceiverService.z = string;
        lanReceiverService.n.post(new f52(lanReceiverService, 1));
    }

    @Override // android.net.nsd.NsdManager.RegistrationListener
    public final void onServiceRegistered(NsdServiceInfo nsdServiceInfo) {
        nsdServiceInfo.getClass();
        this.a.u = true;
        w42 w42Var = w42.a;
        w42.a.a("Receiver advertised on local network", null);
        if (this.a.o) {
            return;
        }
        try {
            NsdManager nsdManager = this.a.t;
            if (nsdManager != null) {
                nsdManager.unregisterService(this);
            } else {
                h12.Q("nsd");
                throw null;
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.net.nsd.NsdManager.RegistrationListener
    public final void onServiceUnregistered(NsdServiceInfo nsdServiceInfo) {
        nsdServiceInfo.getClass();
        this.a.u = false;
    }

    @Override // android.net.nsd.NsdManager.RegistrationListener
    public final void onUnregistrationFailed(NsdServiceInfo nsdServiceInfo, int i) {
        nsdServiceInfo.getClass();
        this.a.u = false;
    }
}
