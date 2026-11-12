package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wn0 implements uh4 {
    public final vn0 a;
    public uh4 b;

    public wn0(vn0 r1) {
        this.a = r1;
    }

    @Override // defpackage.uh4
    public final boolean a() {
        return true;
    }

    @Override // defpackage.uh4
    public final boolean b(SSLSocket r1) {
        return this.a.b(r1);
    }

    @Override // defpackage.uh4
    public final String c(SSLSocket r1) {
        uh4 r0 = e(r1);
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.c(r1);
    }

    @Override // defpackage.uh4
    public final void d(SSLSocket r1, String r2, List r3) {
        r3.getClass();
        uh4 r0 = e(r1);
        if (r0 == null) goto L6;
        r0.d(r1, r2, r3);
        return;
    }

    public final synchronized uh4 e(SSLSocket r2) {
        monitor-enter(this);
    L8:
        th = move-exception;
        throw th;
    L4:
        if (this.b == null) goto L6;
    L10:
        uh4 r3 = this.b;     // Catch: Throwable -> L8
        monitor-exit(this);
        return r3;
    L6:
        if (this.a.b(r2) == false) goto L10;
        this.b = this.a.g(r2);     // Catch: Throwable -> L8
        goto L10
    }
}
