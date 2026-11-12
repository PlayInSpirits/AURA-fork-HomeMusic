package defpackage;

import android.content.Context;
import android.net.Uri;
import android.security.KeyChain;
import java.net.InetAddress;
import java.net.Socket;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509KeyManager;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class w30 implements X509KeyManager {
    public final /* synthetic */ Context a;

    public w30(Context r1) {
        this.a = r1;
    }

    @Override // javax.net.ssl.X509KeyManager
    public final String chooseClientAlias(String[] r1, Principal[] r2, Socket r3) {
        String r0 = b11.m("client_cert", null);
        if (r0 == null) goto L17;
        String r4 = ud3.D();
        if (r4 == null) goto L17;
        String r5 = Uri.parse(r4).getHost();
        if (r3 == null) goto L13;
        InetAddress r6 = r3.getInetAddress();
        if (r6 == null) goto L13;
        String r7 = r6.getHostName();
    L15:
        if (h12.c(r5, r7) == false) goto L17;
        return r0;
    L13:
        r7 = null;
    L17:
        return null;
    }

    @Override // javax.net.ssl.X509KeyManager
    public final /* bridge */ /* synthetic */ String chooseServerAlias(String r1, Principal[] r2, Socket r3) {
        return null;
    }

    @Override // javax.net.ssl.X509KeyManager
    public final X509Certificate[] getCertificateChain(String r3) {
        String r0 = b11.m("client_cert", null);
        if (h12.c(r3, r0) == false) goto L7;
        if (r0 == null) goto L7;
        return KeyChain.getCertificateChain(this.a, r0);
    L7:
        return null;
    }

    @Override // javax.net.ssl.X509KeyManager
    public final /* bridge */ /* synthetic */ String[] getClientAliases(String r1, Principal[] r2) {
        return null;
    }

    @Override // javax.net.ssl.X509KeyManager
    public final PrivateKey getPrivateKey(String r3) {
        String r0 = b11.m("client_cert", null);
        if (h12.c(r3, r0) == false) goto L7;
        if (r0 == null) goto L7;
        return KeyChain.getPrivateKey(this.a, r0);
    L7:
        return null;
    }

    @Override // javax.net.ssl.X509KeyManager
    public final /* bridge */ /* synthetic */ String[] getServerAliases(String r1, Principal[] r2) {
        return null;
    }
}
