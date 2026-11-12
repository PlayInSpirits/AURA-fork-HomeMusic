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

    public final y42 a(NsdServiceInfo r13, String r14) {
        r42 r2 = r42.n;
        long r3 = SystemClock.elapsedRealtime();
        Socket r6 = fz0.j0.e().getSocketFactory().createSocket();     // Catch: Throwable -> L23 Exception -> L25
        r6.getClass();     // Catch: Throwable -> L23 Exception -> L25
        SSLSocket r7 = (SSLSocket) r6;     // Catch: Throwable -> L23 Exception -> L25
        this.a = r7;     // Catch: Throwable -> L23 Exception -> L25
        r7.setSoTimeout(15000);     // Catch: Throwable -> L17
        r42 r4 = r42.o;     // Catch: Throwable -> L17
        r7.connect(new InetSocketAddress(r13.getHost(), r13.getPort()), SmartSession.MAX_SONGS);     // Catch: Throwable -> L17
        r42 r5 = r42.p;     // Catch: Throwable -> L17
        r7.startHandshake();     // Catch: Throwable -> L17
        r42 r8 = r42.q;     // Catch: Throwable -> L17
        String r15 = fz0.m(r7);     // Catch: Throwable -> L17
        String r9 = fz0.l(r7);     // Catch: Throwable -> L17
        if (r15.equals(r9) == true) goto L30;
        r42 r10 = r42.r;     // Catch: Throwable -> L17
        JSONObject r16 = new JSONObject().put("command", "hello").put("name", r14);     // Catch: Throwable -> L17
        r16.getClass();     // Catch: Throwable -> L17
        fz0.p(r7, r16);     // Catch: Throwable -> L17
        JSONObject r17 = fz0.n(r7);     // Catch: Throwable -> L17
        if (r17.has("error") == true) goto L28;
        String r11 = fz0.d(r15, r9);     // Catch: Throwable -> L17
        if (r17.optBoolean("ok") == false) goto L13;
    L19:
        y42 r12 = new y42(r15, r11, r17.optBoolean("ok"));     // Catch: Throwable -> L17
        r7.close();     // Catch: Throwable -> L23 Exception -> L25
        this.a = null;
        return r12;
    L13:
        if (h12.c(r17.optString("pair"), r11) == true) goto L19;
        throw new IllegalArgumentException("Failed requirement.");     // Catch: Throwable -> L17
    L28:
        throw new IllegalArgumentException("Failed requirement.");     // Catch: Throwable -> L17
    L30:
        throw new IllegalArgumentException("Failed requirement.");     // Catch: Throwable -> L17
    L17:
        th = move-exception;
        throw th;     // Catch: Throwable -> L32
    L32:
        th = move-exception;
        q05.h(r7, th);     // Catch: Throwable -> L23 Exception -> L25
        throw th;     // Catch: Throwable -> L23 Exception -> L25
    L23:
        th = move-exception;
        this.a = null;
        throw th;
    L25:
        e = move-exception;
        w42.a.a("Controller pairing failed at " + r2 + " (" + (SystemClock.elapsedRealtime() - r3) + "ms)", e);     // Catch: Throwable -> L23
        throw new LanConnectionFailure(r2, e);     // Catch: Throwable -> L23
    }
}
