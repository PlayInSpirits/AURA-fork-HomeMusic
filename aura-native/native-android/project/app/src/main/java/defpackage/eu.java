package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class eu implements uh4 {
    public static final du a = new du();

    @Override // defpackage.uh4
    public final boolean a() {
        boolean z = cu.d;
        return cu.d;
    }

    @Override // defpackage.uh4
    public final boolean b(SSLSocket sSLSocket) {
        return false;
    }

    @Override // defpackage.uh4
    public final String c(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // defpackage.uh4
    public final void d(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        if (b(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            qg3 qg3Var = qg3.a;
            parameters.setApplicationProtocols((String[]) au0.a(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
