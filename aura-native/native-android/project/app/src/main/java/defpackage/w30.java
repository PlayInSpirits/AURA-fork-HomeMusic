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

    public w30(Context context) {
        this.a = context;
    }

    @Override // javax.net.ssl.X509KeyManager
    public final String chooseClientAlias(String[] strArr, Principal[] principalArr, Socket socket) {
        String strD;
        InetAddress inetAddress;
        String strM = b11.m("client_cert", null);
        if (strM != null && (strD = ud3.D()) != null) {
            if (h12.c(Uri.parse(strD).getHost(), (socket == null || (inetAddress = socket.getInetAddress()) == null) ? null : inetAddress.getHostName())) {
                return strM;
            }
        }
        return null;
    }

    @Override // javax.net.ssl.X509KeyManager
    public final /* bridge */ /* synthetic */ String chooseServerAlias(String str, Principal[] principalArr, Socket socket) {
        return null;
    }

    @Override // javax.net.ssl.X509KeyManager
    public final X509Certificate[] getCertificateChain(String str) {
        String strM = b11.m("client_cert", null);
        if (!h12.c(str, strM) || strM == null) {
            return null;
        }
        return KeyChain.getCertificateChain(this.a, strM);
    }

    @Override // javax.net.ssl.X509KeyManager
    public final /* bridge */ /* synthetic */ String[] getClientAliases(String str, Principal[] principalArr) {
        return null;
    }

    @Override // javax.net.ssl.X509KeyManager
    public final PrivateKey getPrivateKey(String str) {
        String strM = b11.m("client_cert", null);
        if (!h12.c(str, strM) || strM == null) {
            return null;
        }
        return KeyChain.getPrivateKey(this.a, strM);
    }

    @Override // javax.net.ssl.X509KeyManager
    public final /* bridge */ /* synthetic */ String[] getServerAliases(String str, Principal[] principalArr) {
        return null;
    }
}
