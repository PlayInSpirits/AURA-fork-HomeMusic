package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class eu implements uh4 {
    public static final du a = null;

    static {
        a = new du();
    }

    @Override // defpackage.uh4
    public final boolean a() {
        boolean r0 = cu.d;
        return cu.d;
    }

    @Override // defpackage.uh4
    public final boolean b(SSLSocket r1) {
        return false;
    }

    @Override // defpackage.uh4
    public final String c(SSLSocket r1) {
        String r0 = ((BCSSLSocket) r1).getApplicationProtocol();
        if (r0 != null) goto L5;
        boolean r2 = true;
    L6:
        if (r2 == false) goto L9;
        return null;
    L9:
        return r0;
    L5:
        r2 = r0.equals("");
        goto L6
    }

    @Override // defpackage.uh4
    public final void d(SSLSocket r1, String r2, List r3) {
        r3.getClass();
        if (b(r1) == false) goto L6;
        BCSSLSocket r4 = (BCSSLSocket) r1;
        BCSSLParameters r0 = r4.getParameters();
        qg3 r5 = qg3.a;
        r0.setApplicationProtocols((String[]) au0.a(r3).toArray(new String[0]));
        r4.setParameters(r0);
        return;
    }
}
