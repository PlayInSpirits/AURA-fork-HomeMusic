package defpackage;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.os.Handler;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class u42 implements NsdManager.ResolveListener {
    public final /* synthetic */ Handler a;
    public final /* synthetic */ fx3 b;
    public final /* synthetic */ fx3 c;
    public final /* synthetic */ f9 d;
    public final /* synthetic */ nc1 e;

    public u42(Handler handler, fx3 fx3Var, fx3 fx3Var2, f9 f9Var, nc1 nc1Var) {
        this.a = handler;
        this.b = fx3Var;
        this.c = fx3Var2;
        this.d = f9Var;
        this.e = nc1Var;
    }

    @Override // android.net.nsd.NsdManager.ResolveListener
    public final void onResolveFailed(NsdServiceInfo nsdServiceInfo, int i) {
        nsdServiceInfo.getClass();
        this.a.post(new v6(this.b, this.c, this.d, 23));
    }

    @Override // android.net.nsd.NsdManager.ResolveListener
    public final void onServiceResolved(NsdServiceInfo nsdServiceInfo) {
        nsdServiceInfo.getClass();
        this.a.post(new t6(this.c, this.e, nsdServiceInfo, this.d, 11));
    }
}
