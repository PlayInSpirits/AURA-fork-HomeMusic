package defpackage;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import app.homemusic.R;
import com.eddyizm.tempus.lan.LanReceiverService;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.RejectedExecutionException;
import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f52 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ LanReceiverService o;

    public /* synthetic */ f52(LanReceiverService lanReceiverService, int i) {
        this.n = i;
        this.o = lanReceiverService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        LanReceiverService lanReceiverService = this.o;
        switch (i) {
            case 0:
                boolean z = LanReceiverService.y;
                int i2 = 1;
                try {
                    ServerSocket serverSocketCreateServerSocket = fz0.j0.e().getServerSocketFactory().createServerSocket(0);
                    serverSocketCreateServerSocket.getClass();
                    SSLServerSocket sSLServerSocket = (SSLServerSocket) serverSocketCreateServerSocket;
                    sSLServerSocket.setNeedClientAuth(true);
                    lanReceiverService.r = sSLServerSocket;
                    if (!lanReceiverService.o) {
                        sSLServerSocket.close();
                        return;
                    }
                    NsdManager nsdManager = lanReceiverService.t;
                    if (nsdManager == null) {
                        h12.Q("nsd");
                        throw null;
                    }
                    NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
                    nsdServiceInfo.setServiceName("Tempus ".concat(kb4.M(lanReceiverService)));
                    nsdServiceInfo.setServiceType("_tempus-lan._tcp.");
                    nsdServiceInfo.setPort(sSLServerSocket.getLocalPort());
                    nsdManager.registerService(nsdServiceInfo, 1, lanReceiverService.x);
                    while (lanReceiverService.o) {
                        Socket socketAccept = sSLServerSocket.accept();
                        socketAccept.getClass();
                        SSLSocket sSLSocket = (SSLSocket) socketAccept;
                        sSLSocket.setSoTimeout(15000);
                        lanReceiverService.s.add(sSLSocket);
                        try {
                            lanReceiverService.p.execute(new ws1(8, lanReceiverService, sSLSocket));
                        } catch (RejectedExecutionException unused) {
                            lanReceiverService.s.remove(sSLSocket);
                            sSLSocket.close();
                        }
                    }
                    return;
                } catch (Exception e) {
                    w42.a.a("Receiver listener failed", e);
                    if (lanReceiverService.o) {
                        String string = lanReceiverService.getString(R.string.lan_connection_error);
                        string.getClass();
                        LanReceiverService.z = string;
                        lanReceiverService.n.post(new f52(lanReceiverService, i2));
                        return;
                    }
                    return;
                }
            default:
                boolean z2 = LanReceiverService.y;
                lanReceiverService.stopSelf();
                return;
        }
    }
}
