package defpackage;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class u42 implements NsdManager.ResolveListener {
    public final /* synthetic */ Handler a;
    public final /* synthetic */ fx3 b;
    public final /* synthetic */ fx3 c;
    public final /* synthetic */ f9 d;
    public final /* synthetic */ nc1 e;

    public u42(Handler r1, fx3 r2, fx3 r3, f9 r4, nc1 r5) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.e = r5;
    }

    @Override // android.net.nsd.NsdManager.ResolveListener
    public final void onResolveFailed(NsdServiceInfo r4, int r5) {
        r4.getClass();
        v6 r6 = new v6(this.b, this.c, this.d, 23);
        this.a.post(r6);
    }

    @Override // android.net.nsd.NsdManager.ResolveListener
    public final void onServiceResolved(NsdServiceInfo r7) {
        r7.getClass();
        t6 r0 = new t6(this.c, this.e, r7, this.d, 11);
        this.a.post(r0);
    }
}
