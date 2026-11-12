package defpackage;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class f62 implements NsdManager.ResolveListener {
    public final /* synthetic */ h62 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ NsdServiceInfo c;

    public f62(h62 r1, long r2, NsdServiceInfo r4) {
        this.a = r1;
        this.b = r2;
        this.c = r4;
    }

    @Override // android.net.nsd.NsdManager.ResolveListener
    public final void onResolveFailed(NsdServiceInfo r7, int r8) {
        r7.getClass();
        h62 r1 = this.a;
        r1.D0.post(new e62(r1, this.b, this.c, 0));
    }

    @Override // android.net.nsd.NsdManager.ResolveListener
    public final void onServiceResolved(NsdServiceInfo r8) {
        r8.getClass();
        h62 r1 = this.a;
        r1.D0.post(new e62(r1, this.b, r8, 1));
    }
}
