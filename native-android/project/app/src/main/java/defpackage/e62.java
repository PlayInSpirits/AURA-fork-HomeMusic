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

    public /* synthetic */ e62(h62 r1, long r2, NsdServiceInfo r4, int r5) {
        this.n = r5;
        this.o = r1;
        this.p = r2;
        this.q = r4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        NsdServiceInfo r2 = this.q;
        long r3 = this.p;
        h62 r6 = this.o;
        switch(r0) {
            case 0: goto L27;
            case 1: goto L23;
            case 2: goto L12;
            default: goto L5;
        };
    L12:
        boolean r1 = r6.l0(r3);
        LinkedHashMap r4 = r6.G0;
        if (r1 == false) goto L33;
        r4.remove(r2.getServiceName());
        r6.n0();
        if (r4.isEmpty() == true) goto L17;
        return;
    L17:
        if (r6.O0 == false) goto L19;
        return;
    L19:
        if (r6.N0 == true) goto L36;
        r6.s0(R.string.lan_searching);
        return;
    L36:
        return;
    L33:
        return;
    L5:
        if (r6.l0(r3) == false) goto L30;
        r6.G0.put(r2.getServiceName(), new c62(r2, SystemClock.elapsedRealtime()));
        r6.n0();
        if (r6.O0 == false) goto L9;
        return;
    L9:
        if (r6.N0 == true) goto L32;
        r6.s0(R.string.lan_devices_found);
        return;
    L32:
        return;
    L30:
        return;
    L23:
        if (r6.l0(r3) == false) goto L37;
        r6.N0 = false;
        r6.k0(r2);
        return;
    L37:
        return;
    L27:
        if (r6.l0(r3) == false) goto L38;
        r6.N0 = false;
        r6.G0.remove(r2.getServiceName());
        r6.n0();
        r6.s0(R.string.lan_connection_error);
        return;
    }
}
