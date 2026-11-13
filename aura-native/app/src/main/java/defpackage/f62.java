package defpackage;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class f62 implements NsdManager.ResolveListener {
    public final /* synthetic */ h62 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ NsdServiceInfo c;

    public f62(h62 h62Var, long j, NsdServiceInfo nsdServiceInfo) {
        this.a = h62Var;
        this.b = j;
        this.c = nsdServiceInfo;
    }

    @Override // android.net.nsd.NsdManager.ResolveListener
    public final void onResolveFailed(NsdServiceInfo nsdServiceInfo, int i) {
        nsdServiceInfo.getClass();
        h62 h62Var = this.a;
        h62Var.D0.post(new e62(h62Var, this.b, this.c, 0));
    }

    @Override // android.net.nsd.NsdManager.ResolveListener
    public final void onServiceResolved(NsdServiceInfo nsdServiceInfo) {
        nsdServiceInfo.getClass();
        h62 h62Var = this.a;
        h62Var.D0.post(new e62(h62Var, this.b, nsdServiceInfo, 1));
    }
}
