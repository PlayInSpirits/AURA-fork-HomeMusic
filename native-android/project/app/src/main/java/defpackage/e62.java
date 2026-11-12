package defpackage;

import android.net.nsd.NsdServiceInfo;
import android.os.SystemClock;
import app.homemusic.R;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e62 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ h62 o;
    public final /* synthetic */ long p;
    public final /* synthetic */ NsdServiceInfo q;

    public /* synthetic */ e62(h62 h62Var, long j, NsdServiceInfo nsdServiceInfo, int i) {
        this.n = i;
        this.o = h62Var;
        this.p = j;
        this.q = nsdServiceInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        NsdServiceInfo nsdServiceInfo = this.q;
        long j = this.p;
        h62 h62Var = this.o;
        switch (i) {
            case 0:
                if (h62Var.l0(j)) {
                    h62Var.N0 = false;
                    h62Var.G0.remove(nsdServiceInfo.getServiceName());
                    h62Var.n0();
                    h62Var.s0(R.string.lan_connection_error);
                }
                break;
            case 1:
                if (h62Var.l0(j)) {
                    h62Var.N0 = false;
                    h62Var.k0(nsdServiceInfo);
                }
                break;
            case 2:
                boolean zL0 = h62Var.l0(j);
                LinkedHashMap linkedHashMap = h62Var.G0;
                if (zL0) {
                    linkedHashMap.remove(nsdServiceInfo.getServiceName());
                    h62Var.n0();
                    if (linkedHashMap.isEmpty() && !h62Var.O0 && !h62Var.N0) {
                        h62Var.s0(R.string.lan_searching);
                        break;
                    }
                }
                break;
            default:
                if (h62Var.l0(j)) {
                    h62Var.G0.put(nsdServiceInfo.getServiceName(), new c62(nsdServiceInfo, SystemClock.elapsedRealtime()));
                    h62Var.n0();
                    if (!h62Var.O0 && !h62Var.N0) {
                        h62Var.s0(R.string.lan_devices_found);
                        break;
                    }
                }
                break;
        }
    }
}
