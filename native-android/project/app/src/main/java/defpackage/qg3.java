package defpackage;

import android.util.Log;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class qg3 {
    public static volatile qg3 a;
    public static final Logger b = null;

    static {
        qg3 r2 = null;
        if (au0.J() == false) goto L28;
        Iterator r0 = dc.b.entrySet().iterator();
    L6:
        if (r0.hasNext() == false) goto L18;
        Map.Entry r3 = (Map.Entry) r0.next();
        String r4 = (String) r3.getKey();
        String r5 = (String) r3.getValue();
        Logger r6 = Logger.getLogger(r4);
        if (dc.a.add(r6) == false) goto L6;
        r6.setUseParentHandlers(false);
        if (Log.isLoggable(r5, 3) == false) goto L13;
        Level r7 = Level.FINE;
    L16:
        r6.setLevel(r7);
        r6.addHandler(ec.a);
        goto L6
    L13:
        if (Log.isLoggable(r5, 4) == false) goto L15;
        r7 = Level.INFO;
        goto L16
    L15:
        r7 = Level.WARNING;
        goto L16
    L18:
        if (s9.d == false) goto L20;
        qg3 r1 = new s9();
    L21:
        if (r1 == null) goto L23;
    L68:
        a = r1;
        b = Logger.getLogger(o83.class.getName());
        return;
    L23:
        if (rc.d == false) goto L25;
        r2 = new rc();
    L25:
        r2.getClass();
    L26:
        r1 = r2;
        goto L68
    L20:
        r1 = null;
        goto L21
    L28:
        if ("Conscrypt".equals(Security.getProviders()[0].getName()) == false) goto L36;
        if (bb0.d == false) goto L32;
        r1 = new bb0();
    L33:
        if (r1 == null) goto L36;
    L32:
        r1 = null;
    L36:
        if ("BC".equals(Security.getProviders()[0].getName()) == false) goto L44;
        if (cu.d == false) goto L40;
        r1 = new cu();
    L41:
        if (r1 == null) goto L44;
    L40:
        r1 = null;
    L44:
        if ("OpenJSSE".equals(Security.getProviders()[0].getName()) == false) goto L52;
        if (m93.d == false) goto L48;
        r1 = new m93();
    L49:
        if (r1 == null) goto L52;
    L48:
        r1 = null;
    L52:
        if (r22.c == false) goto L54;
        r1 = new r22();
    L55:
        if (r1 != null) goto L68;
        String r8 = System.getProperty("java.specification.version", "unknown");
        r8.getClass();     // Catch: NumberFormatException -> L71
        if (Integer.parseInt(r8) < 9) goto L72;
    L65:
        if (r2 != null) goto L26;
        r1 = new qg3();
    L72:
        Class<?> r9 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);     // Catch: Throwable -> L70
        Class<?> r10 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);     // Catch: Throwable -> L70
        Class<?> r11 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);     // Catch: Throwable -> L70
        Class<?> r12 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);     // Catch: Throwable -> L70
        Method r13 = r9.getMethod("put", new Class[]{SSLSocket.class, r10});     // Catch: Throwable -> L70
        Method r14 = r9.getMethod("get", new Class[]{SSLSocket.class});     // Catch: Throwable -> L70
        Method r15 = r9.getMethod("remove", new Class[]{SSLSocket.class});     // Catch: Throwable -> L70
        r13.getClass();     // Catch: Throwable -> L70
        r14.getClass();     // Catch: Throwable -> L70
        r15.getClass();     // Catch: Throwable -> L70
        r11.getClass();     // Catch: Throwable -> L70
        r12.getClass();     // Catch: Throwable -> L70
        r2 = new q22(r13, r14, r15, r11, r12);     // Catch: Throwable -> L70
        goto L65
    L54:
        r1 = null;
        goto L55
    }

    public static void i(String r1, int r2, Throwable r3) {
        if (r2 != 5) goto L5;
        Level r4 = Level.WARNING;
    L6:
        b.log(r4, r1, r3);
        return;
    L5:
        r4 = Level.INFO;
        goto L6
    }

    public void a(SSLSocket r1) {
    }

    public rr2 b(X509TrustManager r2) {
        r2.getClass();
        return new jr(c(r2));
    }

    public ny4 c(X509TrustManager r2) {
        r2.getClass();
        X509Certificate[] r3 = r2.getAcceptedIssuers();
        r3.getClass();
        return new or((X509Certificate[]) Arrays.copyOf(r3, r3.length));
    }

    public void d(SSLSocket r1, String r2, List r3) {
        r3.getClass();
    }

    public void e(Socket r1, InetSocketAddress r2, int r3) {
        r2.getClass();
        r1.connect(r2, r3);
    }

    public String f(SSLSocket r1) {
        return null;
    }

    public Object g() {
        if (b.isLoggable(Level.FINE) == true) goto L5;
        return null;
    L5:
        return new Throwable("response.body().close()");
    }

    public boolean h(String r1) {
        r1.getClass();
        return true;
    }

    public void j(Object r1, String r2) {
        if (r1 != null) goto L4;
        r2 = r2.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
    L4:
        i(r2, 5, (Throwable) r1);
    }

    public SSLContext k() {
        SSLContext r0 = SSLContext.getInstance("TLS");
        r0.getClass();
        return r0;
    }

    public SSLSocketFactory l(X509TrustManager r3) {
        SSLContext r2 = k();     // Catch: GeneralSecurityException -> L4
        r2.init(null, new TrustManager[]{r3}, null);     // Catch: GeneralSecurityException -> L4
        SSLSocketFactory r4 = r2.getSocketFactory();     // Catch: GeneralSecurityException -> L4
        r4.getClass();     // Catch: GeneralSecurityException -> L4
        return r4;
    L4:
        e = move-exception;
        throw new AssertionError("No System TLS: " + e, e);
    }

    public X509TrustManager m() {
        TrustManagerFactory r3 = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        r3.init(null);
        TrustManager[] r4 = r3.getTrustManagers();
        r4.getClass();
        if (r4.length != 1) goto L8;
        TrustManager r1 = r4[0];
        if ((r1 instanceof X509TrustManager) == false) goto L8;
        r1.getClass();
        return (X509TrustManager) r1;
    L8:
        String r5 = Arrays.toString(r4);
        r5.getClass();
        nz2.f("Unexpected default trust managers: ".concat(r5));
        return null;
    }

    public final String toString() {
        return getClass().getSimpleName();
    }
}
