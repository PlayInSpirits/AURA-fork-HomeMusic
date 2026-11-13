package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class r53 extends xb0 {
    public final ConnectivityManager f;
    public final oy1 g;

    public r53(bq4 bq4Var, Context context) {
        super(bq4Var, context);
        Object systemService = this.b.getSystemService("connectivity");
        systemService.getClass();
        this.f = (ConnectivityManager) systemService;
        this.g = new oy1(1, this);
    }

    @Override // defpackage.xb0
    public final Object a() {
        return s53.a(this.f);
    }

    @Override // defpackage.xb0
    public final void c() {
        try {
            cx.f().b(s53.a, "Registering network callback");
            ConnectivityManager connectivityManager = this.f;
            oy1 oy1Var = this.g;
            connectivityManager.getClass();
            oy1Var.getClass();
            connectivityManager.registerDefaultNetworkCallback(oy1Var);
        } catch (IllegalArgumentException e) {
            cx.f().e(s53.a, "Received exception while registering network callback", e);
        } catch (SecurityException e2) {
            cx.f().e(s53.a, "Received exception while registering network callback", e2);
        }
    }

    @Override // defpackage.xb0
    public final void d() {
        try {
            cx.f().b(s53.a, "Unregistering network callback");
            ConnectivityManager connectivityManager = this.f;
            oy1 oy1Var = this.g;
            connectivityManager.getClass();
            oy1Var.getClass();
            connectivityManager.unregisterNetworkCallback(oy1Var);
        } catch (IllegalArgumentException e) {
            cx.f().e(s53.a, "Received exception while unregistering network callback", e);
        } catch (SecurityException e2) {
            cx.f().e(s53.a, "Received exception while unregistering network callback", e2);
        }
    }
}
