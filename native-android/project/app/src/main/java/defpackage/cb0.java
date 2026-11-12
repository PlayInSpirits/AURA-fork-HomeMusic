package defpackage;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class cb0 implements vn0 {
    @Override // defpackage.vn0
    public final boolean b(SSLSocket sSLSocket) {
        return bb0.d && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // defpackage.vn0
    public final uh4 g(SSLSocket sSLSocket) {
        return new db0();
    }
}
