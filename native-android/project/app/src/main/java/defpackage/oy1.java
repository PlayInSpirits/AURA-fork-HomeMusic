package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class oy1 extends ConnectivityManager.NetworkCallback {
    public static final /* synthetic */ int c = 0;
    public final /* synthetic */ int a;
    public final Object b;

    public oy1(br0 r2) {
        this.a = 0;
        this.b = r2;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network r2) {
        switch(this.a) {
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        super.onAvailable(r2);
        return;
    L6:
        lf4 r3 = new lf4(this, true);
        e35.C().post(r3);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network r4, NetworkCapabilities r5) {
        int r0 = this.a;
        Object r1 = this.b;
        switch(r0) {
            case 0: goto L12;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        super.onCapabilitiesChanged(r4, r5);
        return;
    L6:
        r4.getClass();
        r5.getClass();
        cx.f().b(s53.a, "Network capabilities changed: " + r5);
        r53 r2 = (r53) r1;
        if (Build.VERSION.SDK_INT < 28) goto L9;
        q53 r3 = new q53(r5.hasCapability(12), r5.hasCapability(16), !r5.hasCapability(11), r5.hasCapability(18));
    L10:
        r2.b(r3);
        return;
    L9:
        r3 = s53.a(r2.f);
        goto L10
    L12:
        r4.getClass();
        r5.getClass();
        cx.f().b(lc5.a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        ((br0) r1).invoke(rc0.a);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network r3) {
        int r0 = this.a;
        Object r1 = this.b;
        switch(r0) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        lf4 r4 = new lf4(this, false);
        e35.C().post(r4);
        return;
    L6:
        r3.getClass();
        cx.f().b(s53.a, "Network connection lost");
        r53 r2 = (r53) r1;
        r2.b(s53.a(r2.f));
        return;
    L8:
        r3.getClass();
        cx.f().b(lc5.a, "NetworkRequestConstraintController onLost callback");
        ((br0) r1).invoke(new sc0(7));
    }

    public /* synthetic */ oy1(int r1, Object r2) {
        this.a = r1;
        this.b = r2;
    }
}
