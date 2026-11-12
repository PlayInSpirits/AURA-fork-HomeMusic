package defpackage;

import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.MediaRouter2$TransferCallback;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yo2 extends MediaRouter2$TransferCallback {
    public final /* synthetic */ zo2 a;

    public yo2(zo2 r1) {
        this.a = r1;
    }

    public final void onStop(MediaRouter2.RoutingController r3) {
        zo2 r2 = this.a;
        r2.E = null;
        oq2 r0 = (oq2) r2.x.remove(r3);
        if (r0 == null) goto L12;
        ui1 r4 = (ui1) r2.w.o;
        if (r0 != r4.d) goto L10;
        wq2 r5 = r4.c();
        if (r4.g() == r5) goto L14;
        r4.j(r5, 2, true);
        return;
    L14:
        return;
    L10:
        int r6 = ui1.B;
        return;
    L12:
        Log.w("MR2Provider", "onStop: No matching routeController found. routingController=" + r3);
    }

    public final void onTransfer(MediaRouter2.RoutingController r11, MediaRouter2.RoutingController r12) {
        zo2 r10 = this.a;
        wq2 r0 = null;
        r10.E = null;
        r10.x.remove(r11);
        if (r12 != to2.c(r10.v)) goto L8;
        ui1 r13 = (ui1) r10.w.o;
        wq2 r14 = r13.c();
        if (r13.g() == r14) goto L31;
        r13.j(r14, 3, true);
        return;
    L31:
        return;
    L8:
        List r15 = to2.l(r12);
        if (r15.isEmpty() == false) goto L12;
        Log.w("MR2Provider", "Selected routes are empty. This shouldn't happen.");
        return;
    L12:
        int r3 = 0;
        String r16 = to2.i(l3.g(r15.get(0)));
        r10.x.put(r12, new vo2(r10, r12, r16));
        ui1 r4 = (ui1) r10.w.o;
        ArrayList r5 = r4.h;
        int r6 = r5.size();
    L13:
        if (r3 >= r6) goto L20;
        Object r7 = r5.get(r3);
        r3 = r3 + 1;
        wq2 r8 = (wq2) r7;
        if (r8.c() != r4.q) goto L13;
        if (TextUtils.equals(r16, r8.b) == false) goto L13;
        r0 = r8;
    L20:
        if (r0 != null) goto L22;
        Log.w("AxMediaRouter", "onSelectRoute: The target RouteInfo is not found for descriptorId=" + r16);
    L23:
        r10.j(r12);
        return;
    L22:
        r4.j(r0, 3, true);
        goto L23
    }

    public final void onTransferFailure(MediaRoute2Info r2) {
        this.a.E = null;
        Log.w("MR2Provider", "Transfer failed. requestedRoute=" + r2);
    }
}
