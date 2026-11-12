package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class db0 implements uh4 {
    public static final cb0 a = new cb0();

    @Override // defpackage.uh4
    public final boolean a() {
        boolean z = bb0.d;
        return bb0.d;
    }

    @Override // defpackage.uh4
    public final boolean b(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // defpackage.uh4
    public final String c(SSLSocket sSLSocket) {
        if (b(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.uh4
    public final void d(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        if (b(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            qg3 qg3Var = qg3.a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) au0.a(list).toArray(new String[0]));
        }
    }
}
