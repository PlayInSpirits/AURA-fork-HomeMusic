package defpackage;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class cb0 implements vn0 {
    @Override // defpackage.vn0
    public final boolean b(SSLSocket r1) {
        if (bb0.d == true) goto L5;
        return false;
    L5:
        if (Conscrypt.isConscrypt(r1) == false) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // defpackage.vn0
    public final uh4 g(SSLSocket r1) {
        return new db0();
    }
}
