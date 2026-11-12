package defpackage;

import java.net.Socket;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.X509ExtendedKeyManager;
import javax.net.ssl.X509KeyManager;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class x42 extends X509ExtendedKeyManager {
    public final String a;
    public final X509KeyManager b;

    public x42(X509KeyManager r2) {
        r2.getClass();
        this.a = "tempus-lan-v1";
        this.b = r2;
    }

    @Override // javax.net.ssl.X509KeyManager
    public final String chooseClientAlias(String[] r6, Principal[] r7, Socket r8) {
        if (r6 == null) goto L16;
        int r0 = r6.length;
        int r2 = 0;
    L5:
        if (r2 >= r0) goto L16;
        String[] r3 = getClientAliases(r6[r2], r7);
        if (r3 != null) goto L9;
    L12:
        String r4 = null;
    L13:
        if (r4 != null) goto L15;
        r2 = r2 + 1;
        goto L5
    L15:
        return r4;
    L9:
        if (r3.length == 0) goto L12;
        r4 = r3[0];
    L16:
        return null;
    }

    @Override // javax.net.ssl.X509ExtendedKeyManager
    public final String chooseEngineClientAlias(String[] r1, Principal[] r2, SSLEngine r3) {
        return chooseClientAlias(r1, r2, null);
    }

    @Override // javax.net.ssl.X509ExtendedKeyManager
    public final String chooseEngineServerAlias(String r1, Principal[] r2, SSLEngine r3) {
        return chooseServerAlias(r1, r2, null);
    }

    @Override // javax.net.ssl.X509KeyManager
    public final String chooseServerAlias(String r1, Principal[] r2, Socket r3) {
        String[] r0 = getServerAliases(r1, r2);
        if (r0 != null) goto L5;
        return null;
    L5:
        if (r0.length != 0) goto L8;
        return null;
    L8:
        return r0[0];
    }

    @Override // javax.net.ssl.X509KeyManager
    public final X509Certificate[] getCertificateChain(String r2) {
        String r0 = this.a;
        if (h12.c(r2, r0) == true) goto L5;
        return null;
    L5:
        return this.b.getCertificateChain(r0);
    }

    @Override // javax.net.ssl.X509KeyManager
    public final String[] getClientAliases(String r7, Principal[] r8) {
        String[] r9 = this.b.getClientAliases(r7, r8);
        if (r9 == null) goto L17;
        ArrayList r0 = new ArrayList();
        int r1 = r9.length;
        int r3 = 0;
    L5:
        if (r3 >= r1) goto L11;
        String r4 = r9[r3];
        if (h12.c(r4, this.a) == false) goto L9;
        r0.add(r4);
    L9:
        r3 = r3 + 1;
        goto L5
    L11:
        if (r0.isEmpty() == false) goto L14;
        r0 = null;
    L14:
        if (r0 == null) goto L17;
        return (String[]) r0.toArray(new String[0]);
    L17:
        return null;
    }

    @Override // javax.net.ssl.X509KeyManager
    public final PrivateKey getPrivateKey(String r2) {
        String r0 = this.a;
        if (h12.c(r2, r0) == true) goto L5;
        return null;
    L5:
        return this.b.getPrivateKey(r0);
    }

    @Override // javax.net.ssl.X509KeyManager
    public final String[] getServerAliases(String r7, Principal[] r8) {
        String[] r9 = this.b.getServerAliases(r7, r8);
        if (r9 == null) goto L17;
        ArrayList r0 = new ArrayList();
        int r1 = r9.length;
        int r3 = 0;
    L5:
        if (r3 >= r1) goto L11;
        String r4 = r9[r3];
        if (h12.c(r4, this.a) == false) goto L9;
        r0.add(r4);
    L9:
        r3 = r3 + 1;
        goto L5
    L11:
        if (r0.isEmpty() == false) goto L14;
        r0 = null;
    L14:
        if (r0 == null) goto L17;
        return (String[]) r0.toArray(new String[0]);
    L17:
        return null;
    }
}
