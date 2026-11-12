package defpackage;

import android.net.nsd.NsdServiceInfo;
import android.os.SystemClock;
import com.eddyizm.tempus.homemusic.SmartSession;
import com.eddyizm.tempus.lan.LanConnectionFailure;
import java.net.InetSocketAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class z42 {
    public volatile SSLSocket a;

    public final y42 a(NsdServiceInfo nsdServiceInfo, String str) {
        r42 r42Var = r42.n;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            try {
                Socket socketCreateSocket = fz0.j0.e().getSocketFactory().createSocket();
                socketCreateSocket.getClass();
                SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
                this.a = sSLSocket;
                try {
                    sSLSocket.setSoTimeout(15000);
                    r42 r42Var2 = r42.o;
                    sSLSocket.connect(new InetSocketAddress(nsdServiceInfo.getHost(), nsdServiceInfo.getPort()), SmartSession.MAX_SONGS);
                    r42 r42Var3 = r42.p;
                    sSLSocket.startHandshake();
                    r42 r42Var4 = r42.q;
                    String strM = fz0.m(sSLSocket);
                    String strL = fz0.l(sSLSocket);
                    if (strM.equals(strL)) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                    r42 r42Var5 = r42.r;
                    JSONObject jSONObjectPut = new JSONObject().put("command", "hello").put("name", str);
                    jSONObjectPut.getClass();
                    fz0.p(sSLSocket, jSONObjectPut);
                    JSONObject jSONObjectN = fz0.n(sSLSocket);
                    if (jSONObjectN.has("error")) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                    String strD = fz0.d(strM, strL);
                    if (!jSONObjectN.optBoolean("ok") && !h12.c(jSONObjectN.optString("pair"), strD)) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                    y42 y42Var = new y42(strM, strD, jSONObjectN.optBoolean("ok"));
                    sSLSocket.close();
                    this.a = null;
                    return y42Var;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        q05.h(sSLSocket, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                this.a = null;
                throw th3;
            }
        } catch (Exception e) {
            w42.a.a("Controller pairing failed at " + r42Var + " (" + (SystemClock.elapsedRealtime() - jElapsedRealtime) + "ms)", e);
            throw new LanConnectionFailure(r42Var, e);
        }
    }
}
