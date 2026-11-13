package defpackage;

import java.net.Socket;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.X509ExtendedKeyManager;
import javax.net.ssl.X509KeyManager;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class x42 extends X509ExtendedKeyManager {
    public final String a;
    public final X509KeyManager b;

    public x42(X509KeyManager x509KeyManager) {
        x509KeyManager.getClass();
        this.a = "tempus-lan-v1";
        this.b = x509KeyManager;
    }

    @Override // javax.net.ssl.X509KeyManager
    public final String chooseClientAlias(String[] strArr, Principal[] principalArr, Socket socket) {
        if (strArr != null) {
            for (String str : strArr) {
                String[] clientAliases = getClientAliases(str, principalArr);
                String str2 = (clientAliases == null || clientAliases.length == 0) ? null : clientAliases[0];
                if (str2 != null) {
                    return str2;
                }
            }
        }
        return null;
    }

    @Override // javax.net.ssl.X509ExtendedKeyManager
    public final String chooseEngineClientAlias(String[] strArr, Principal[] principalArr, SSLEngine sSLEngine) {
        return chooseClientAlias(strArr, principalArr, null);
    }

    @Override // javax.net.ssl.X509ExtendedKeyManager
    public final String chooseEngineServerAlias(String str, Principal[] principalArr, SSLEngine sSLEngine) {
        return chooseServerAlias(str, principalArr, null);
    }

    @Override // javax.net.ssl.X509KeyManager
    public final String chooseServerAlias(String str, Principal[] principalArr, Socket socket) {
        String[] serverAliases = getServerAliases(str, principalArr);
        if (serverAliases == null || serverAliases.length == 0) {
            return null;
        }
        return serverAliases[0];
    }

    @Override // javax.net.ssl.X509KeyManager
    public final X509Certificate[] getCertificateChain(String str) {
        String str2 = this.a;
        if (h12.c(str, str2)) {
            return this.b.getCertificateChain(str2);
        }
        return null;
    }

    @Override // javax.net.ssl.X509KeyManager
    public final String[] getClientAliases(String str, Principal[] principalArr) {
        String[] clientAliases = this.b.getClientAliases(str, principalArr);
        if (clientAliases != null) {
            ArrayList arrayList = new ArrayList();
            for (String str2 : clientAliases) {
                if (h12.c(str2, this.a)) {
                    arrayList.add(str2);
                }
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            if (arrayList != null) {
                return (String[]) arrayList.toArray(new String[0]);
            }
        }
        return null;
    }

    @Override // javax.net.ssl.X509KeyManager
    public final PrivateKey getPrivateKey(String str) {
        String str2 = this.a;
        if (h12.c(str, str2)) {
            return this.b.getPrivateKey(str2);
        }
        return null;
    }

    @Override // javax.net.ssl.X509KeyManager
    public final String[] getServerAliases(String str, Principal[] principalArr) {
        String[] serverAliases = this.b.getServerAliases(str, principalArr);
        if (serverAliases != null) {
            ArrayList arrayList = new ArrayList();
            for (String str2 : serverAliases) {
                if (h12.c(str2, this.a)) {
                    arrayList.add(str2);
                }
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            if (arrayList != null) {
                return (String[]) arrayList.toArray(new String[0]);
            }
        }
        return null;
    }
}
