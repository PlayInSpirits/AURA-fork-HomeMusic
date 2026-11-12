package defpackage;

import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class t9 implements uh4 {
    @Override // defpackage.uh4
    public final boolean a() {
        qg3 r1 = qg3.a;
        if (au0.J() == true) goto L5;
        return false;
    L5:
        if (Build.VERSION.SDK_INT < 29) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // defpackage.uh4
    public final boolean b(SSLSocket r1) {
        return k3.e(r1);
    }

    @Override // defpackage.uh4
    public final String c(SSLSocket r1) {
        String r0 = yj1.d(r1);     // Catch: UnsupportedOperationException -> L11
        if (r0 != null) goto L5;
        boolean r2 = true;
    L6:
        if (r2 == true) goto L9;
        return r0;
    L9:
        return null;
    L5:
        r2 = r0.equals("");     // Catch: UnsupportedOperationException -> L11
    L14:
        return null;
    }

    @Override // defpackage.uh4
    public final void d(SSLSocket r1, String r2, List r3) {
        r3.getClass();
        k3.d(r1);     // Catch: IllegalArgumentException -> L5
        SSLParameters r0 = r1.getSSLParameters();     // Catch: IllegalArgumentException -> L5
        qg3 r4 = qg3.a;     // Catch: IllegalArgumentException -> L5
        yj1.o(r0, (String[]) au0.a(r3).toArray(new String[0]));     // Catch: IllegalArgumentException -> L5
        r1.setSSLParameters(r0);     // Catch: IllegalArgumentException -> L5
        return;
    L5:
        e = move-exception;
        throw new IOException("Android internal error", e);
    }
}
