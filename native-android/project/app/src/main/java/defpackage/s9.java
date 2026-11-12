package defpackage;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import android.util.CloseGuard;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class s9 extends qg3 {
    public static final boolean d = false;
    public final ArrayList c;

    static {
        if (au0.J() == true) goto L5;
    L7:
        boolean r0 = false;
    L8:
        d = r0;
        return;
    L5:
        if (Build.VERSION.SDK_INT < 29) goto L7;
        r0 = true;
        goto L8
    }

    public s9() {
        if (au0.J() == true) goto L5;
    L7:
        t9 r0 = null;
    L8:
        int r5 = 0;
        ArrayList r1 = ti.i0(new uh4[]{r0, new wn0(uc.e), new wn0(db0.a), new wn0(eu.a)});
        ArrayList r2 = new ArrayList();
        int r3 = r1.size();
    L9:
        if (r5 >= r3) goto L13;
        Object r4 = r1.get(r5);
        r5 = r5 + 1;
        if (((uh4) r4).a() == false) goto L9;
        r2.add(r4);
        goto L9
    L13:
        this.c = r2;
        return;
    L5:
        if (Build.VERSION.SDK_INT < 29) goto L7;
        r0 = new t9();
        goto L8
    }

    @Override // defpackage.qg3
    public final rr2 b(X509TrustManager r3) {
        r3.getClass();
        ca r0 = null;
        X509TrustManagerExtensions r1 = new X509TrustManagerExtensions(r3);     // Catch: IllegalArgumentException -> L5
    L6:
        if (r1 == null) goto L8;
        r0 = new ca(r3, r1);
    L8:
        if (r0 == null) goto L11;
        return r0;
    L11:
        return super.b(r3);
    L5:
        r1 = null;
        goto L6
    }

    @Override // defpackage.qg3
    public final void d(SSLSocket r5, String r6, List r7) {
        r7.getClass();
        ArrayList r4 = this.c;
        int r0 = r4.size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L7;
        Object r2 = r4.get(r1);
        r1 = r1 + 1;
        if (((uh4) r2).b(r5) == false) goto L3;
    L8:
        uh4 r3 = (uh4) r2;
        if (r3 == null) goto L15;
        r3.d(r5, r6, r7);
        return;
    L15:
        return;
    L7:
        r2 = null;
        goto L8
    }

    @Override // defpackage.qg3
    public final String f(SSLSocket r6) {
        ArrayList r5 = this.c;
        int r0 = r5.size();
        int r1 = 0;
    L4:
        if (r1 >= r0) goto L8;
        Object r3 = r5.get(r1);
        r1 = r1 + 1;
        if (((uh4) r3).b(r6) == false) goto L4;
    L9:
        uh4 r4 = (uh4) r3;
        if (r4 != null) goto L12;
        return null;
    L12:
        return r4.c(r6);
    L8:
        r3 = null;
        goto L9
    }

    @Override // defpackage.qg3
    public final Object g() {
        if (Build.VERSION.SDK_INT < 30) goto L7;
        CloseGuard r2 = l3.k();
        l3.w(r2);
        return r2;
    L7:
        return super.g();
    }

    @Override // defpackage.qg3
    public final boolean h(String r1) {
        r1.getClass();
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(r1);
    }

    @Override // defpackage.qg3
    public final void j(Object r3, String r4) {
        if (Build.VERSION.SDK_INT < 30) goto L6;
        r3.getClass();
        l3.D(l3.l(r3));
        return;
    L6:
        super.j(r3, r4);
    }
}
