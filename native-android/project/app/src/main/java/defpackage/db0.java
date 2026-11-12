package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class db0 implements uh4 {
    public static final cb0 a = null;

    static {
        a = new cb0();
    }

    @Override // defpackage.uh4
    public final boolean a() {
        boolean r0 = bb0.d;
        return bb0.d;
    }

    @Override // defpackage.uh4
    public final boolean b(SSLSocket r1) {
        return Conscrypt.isConscrypt(r1);
    }

    @Override // defpackage.uh4
    public final String c(SSLSocket r1) {
        if (b(r1) == true) goto L5;
        return null;
    L5:
        return Conscrypt.getApplicationProtocol(r1);
    }

    @Override // defpackage.uh4
    public final void d(SSLSocket r1, String r2, List r3) {
        r3.getClass();
        if (b(r1) == false) goto L6;
        Conscrypt.setUseSessionTickets(r1, true);
        qg3 r0 = qg3.a;
        Conscrypt.setApplicationProtocols(r1, (String[]) au0.a(r3).toArray(new String[0]));
        return;
    }
}
