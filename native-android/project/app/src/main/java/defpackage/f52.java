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

    public /* synthetic */ f52(LanReceiverService r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        LanReceiverService r6 = this.o;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        boolean r1 = LanReceiverService.y;
        r6.stopSelf();
        return;
    L6:
        boolean r2 = LanReceiverService.y;
        int r3 = 1;
        ServerSocket r4 = fz0.j0.e().getServerSocketFactory().createServerSocket(0);     // Catch: Exception -> L10
        r4.getClass();     // Catch: Exception -> L10
        SSLServerSocket r5 = (SSLServerSocket) r4;     // Catch: Exception -> L10
        r5.setNeedClientAuth(true);     // Catch: Exception -> L10
        r6.r = r5;     // Catch: Exception -> L10
        if (r6.o == true) goto L12;
        r5.close();     // Catch: Exception -> L10
        return;
    L12:
        NsdManager r7 = r6.t;     // Catch: Exception -> L10
        if (r7 == null) goto L21;
        NsdServiceInfo r8 = new NsdServiceInfo();     // Catch: Exception -> L10
        r8.setServiceName("Tempus ".concat(kb4.M(r6)));     // Catch: Exception -> L10
        r8.setServiceType("_tempus-lan._tcp.");     // Catch: Exception -> L10
        r8.setPort(r5.getLocalPort());     // Catch: Exception -> L10
        r7.registerService(r8, 1, r6.x);     // Catch: Exception -> L10
    L16:
        if (r6.o == false) goto L36;
        Socket r9 = r5.accept();     // Catch: Exception -> L10
        r9.getClass();     // Catch: Exception -> L10
        SSLSocket r10 = (SSLSocket) r9;     // Catch: Exception -> L10
        r10.setSoTimeout(15000);     // Catch: Exception -> L10
        r6.s.add(r10);     // Catch: Exception -> L10
        r6.p.execute(new ws1(8, r6, r10));     // Catch: Exception -> L10 RejectedExecutionException -> L20
    L20:
        r6.s.remove(r10);     // Catch: Exception -> L10
        r10.close();     // Catch: Exception -> L10
        goto L16
    L36:
        return;
    L21:
        h12.Q("nsd");     // Catch: Exception -> L10
        throw null;     // Catch: Exception -> L10
    L10:
        e = move-exception;
        w42.a.a("Receiver listener failed", e);
        if (r6.o == false) goto L35;
        String r11 = r6.getString(R.string.lan_connection_error);
        r11.getClass();
        LanReceiverService.z = r11;
        r6.n.post(new f52(r6, r3));
        return;
    }
}
