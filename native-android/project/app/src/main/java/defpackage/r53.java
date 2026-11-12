package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class r53 extends xb0 {
    public final ConnectivityManager f;
    public final oy1 g;

    public r53(bq4 r1, Context r2) {
        super(r1, r2);
        Object r3 = this.b.getSystemService("connectivity");
        r3.getClass();
        this.f = (ConnectivityManager) r3;
        this.g = new oy1(1, this);
    }

    @Override // defpackage.xb0
    public final Object a() {
        return s53.a(this.f);
    }

    @Override // defpackage.xb0
    public final void c() {
        cx.f().b(s53.a, "Registering network callback");     // Catch: SecurityException -> L5 IllegalArgumentException -> L7
        ConnectivityManager r1 = this.f;     // Catch: SecurityException -> L5 IllegalArgumentException -> L7
        oy1 r4 = this.g;     // Catch: SecurityException -> L5 IllegalArgumentException -> L7
        r1.getClass();     // Catch: SecurityException -> L5 IllegalArgumentException -> L7
        r4.getClass();     // Catch: SecurityException -> L5 IllegalArgumentException -> L7
        r1.registerDefaultNetworkCallback(r4);     // Catch: SecurityException -> L5 IllegalArgumentException -> L7
        return;
    L7:
        e = move-exception;
        cx.f().e(s53.a, "Received exception while registering network callback", e);
        return;
    L5:
        e = move-exception;
        cx.f().e(s53.a, "Received exception while registering network callback", e);
    }

    @Override // defpackage.xb0
    public final void d() {
        cx.f().b(s53.a, "Unregistering network callback");     // Catch: SecurityException -> L5 IllegalArgumentException -> L7
        ConnectivityManager r1 = this.f;     // Catch: SecurityException -> L5 IllegalArgumentException -> L7
        oy1 r4 = this.g;     // Catch: SecurityException -> L5 IllegalArgumentException -> L7
        r1.getClass();     // Catch: SecurityException -> L5 IllegalArgumentException -> L7
        r4.getClass();     // Catch: SecurityException -> L5 IllegalArgumentException -> L7
        r1.unregisterNetworkCallback(r4);     // Catch: SecurityException -> L5 IllegalArgumentException -> L7
        return;
    L7:
        e = move-exception;
        cx.f().e(s53.a, "Received exception while unregistering network callback", e);
        return;
    L5:
        e = move-exception;
        cx.f().e(s53.a, "Received exception while unregistering network callback", e);
    }
}
