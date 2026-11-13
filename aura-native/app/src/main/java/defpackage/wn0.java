package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class wn0 implements uh4 {
    public final vn0 a;
    public uh4 b;

    public wn0(vn0 vn0Var) {
        this.a = vn0Var;
    }

    @Override // defpackage.uh4
    public final boolean a() {
        return true;
    }

    @Override // defpackage.uh4
    public final boolean b(SSLSocket sSLSocket) {
        return this.a.b(sSLSocket);
    }

    @Override // defpackage.uh4
    public final String c(SSLSocket sSLSocket) {
        uh4 e = e(sSLSocket);
        if (e != null) {
            return e.c(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.uh4
    public final void d(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        uh4 e = e(sSLSocket);
        if (e != null) {
            e.d(sSLSocket, str, list);
        }
    }

    public final synchronized uh4 e(SSLSocket sSLSocket) {
        try {
            if (this.b == null && this.a.b(sSLSocket)) {
                this.b = this.a.g(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }
}
