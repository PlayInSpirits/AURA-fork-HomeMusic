package defpackage;

import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vo2 extends nq2 {
    public final String f;
    public final MediaRouter2.RoutingController g;
    public final Messenger h;
    public final Messenger i;
    public final SparseArray j;
    public final Handler k;
    public final AtomicInteger l;
    public final qa1 m;
    public int n;
    public sp2 o;
    public final /* synthetic */ zo2 p;

    public vo2(zo2 r2, MediaRouter2.RoutingController r3, String r4) {
        this.p = r2;
        this.j = new SparseArray();
        this.l = new AtomicInteger(1);
        this.m = new qa1(19, this);
        this.n = -1;
        this.g = r3;
        this.f = r4;
        int r5 = zo2.F;
        Bundle r6 = to2.z(r3);
        Messenger r7 = null;
        if (r6 != null) goto L5;
        Messenger r8 = null;
    L6:
        this.h = r8;
        if (r8 == null) goto L10;
        r7 = new Messenger(new zk(this));
    L10:
        this.i = r7;
        this.k = new Handler(Looper.getMainLooper());
        return;
    L5:
        r8 = (Messenger) r6.getParcelable("androidx.mediarouter.media.KEY_MESSENGER");
        goto L6
    }

    @Override // defpackage.oq2
    public final void d() {
        to2.n(this.g);
    }

    @Override // defpackage.oq2
    public final void f(int r3) {
        MediaRouter2.RoutingController r0 = this.g;
        if (r0 != null) goto L5;
        return;
    L5:
        to2.o(r0, r3);
        this.n = r3;
        Handler r4 = this.k;
        qa1 r2 = this.m;
        r4.removeCallbacks(r2);
        r4.postDelayed(r2, 1000);
    }

    @Override // defpackage.oq2
    public final void i(int r3) {
        MediaRouter2.RoutingController r0 = this.g;
        if (r0 != null) goto L5;
        return;
    L5:
        int r1 = this.n;
        if (r1 >= 0) goto L8;
        r1 = to2.b(r0);
    L8:
        int r4 = Math.max(0, Math.min(r1 + r3, to2.y(this.g)));
        this.n = r4;
        to2.o(this.g, r4);
        Handler r5 = this.k;
        qa1 r2 = this.m;
        r5.removeCallbacks(r2);
        r5.postDelayed(r2, 1000);
    }

    @Override // defpackage.nq2
    public final void m(String r3) {
        if (r3 != null) goto L5;
    L13:
        Log.w("MR2Provider", "onAddMemberRoute: Ignoring null or empty routeId.");
        return;
    L5:
        if (r3.isEmpty() == true) goto L13;
        MediaRoute2Info r1 = this.p.h(r3);
        if (r1 != null) goto L11;
        Log.w("MR2Provider", "onAddMemberRoute: Specified route not found. routeId=".concat(r3));
        return;
    L11:
        to2.B(this.g, r1);
    }

    @Override // defpackage.nq2
    public final void n(String r3) {
        if (r3 != null) goto L5;
    L13:
        Log.w("MR2Provider", "onRemoveMemberRoute: Ignoring null or empty routeId.");
        return;
    L5:
        if (r3.isEmpty() == true) goto L13;
        MediaRoute2Info r1 = this.p.h(r3);
        if (r1 != null) goto L11;
        Log.w("MR2Provider", "onRemoveMemberRoute: Specified route not found. routeId=".concat(r3));
        return;
    L11:
        to2.p(this.g, r1);
    }

    @Override // defpackage.nq2
    public final void o(ArrayList r3) {
        if (r3.isEmpty() == false) goto L6;
        Log.w("MR2Provider", "onUpdateMemberRoutes: Ignoring null or empty routeIds.");
        return;
    L6:
        String r4 = (String) r3.get(0);
        zo2 r2 = this.p;
        MediaRoute2Info r0 = r2.h(r4);
        if (r0 != null) goto L10;
        Log.w("MR2Provider", "onUpdateMemberRoutes: Specified route not found. routeId=" + r4);
        return;
    L10:
        l3.v(r2.v, r0);
    }
}
