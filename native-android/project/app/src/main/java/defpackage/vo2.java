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
    public final Handler k;
    public sp2 o;
    public final /* synthetic */ zo2 p;
    public final SparseArray j = new SparseArray();
    public final AtomicInteger l = new AtomicInteger(1);
    public final qa1 m = new qa1(19, this);
    public int n = -1;

    public vo2(zo2 zo2Var, MediaRouter2.RoutingController routingController, String str) {
        this.p = zo2Var;
        this.g = routingController;
        this.f = str;
        int i = zo2.F;
        Bundle controlHints = routingController.getControlHints();
        Messenger messenger = controlHints == null ? null : (Messenger) controlHints.getParcelable("androidx.mediarouter.media.KEY_MESSENGER");
        this.h = messenger;
        this.i = messenger != null ? new Messenger(new zk(this)) : null;
        this.k = new Handler(Looper.getMainLooper());
    }

    @Override // defpackage.oq2
    public final void d() {
        this.g.release();
    }

    @Override // defpackage.oq2
    public final void f(int i) {
        MediaRouter2.RoutingController routingController = this.g;
        if (routingController == null) {
            return;
        }
        routingController.setVolume(i);
        this.n = i;
        Handler handler = this.k;
        qa1 qa1Var = this.m;
        handler.removeCallbacks(qa1Var);
        handler.postDelayed(qa1Var, 1000L);
    }

    @Override // defpackage.oq2
    public final void i(int i) {
        MediaRouter2.RoutingController routingController = this.g;
        if (routingController == null) {
            return;
        }
        int volume = this.n;
        if (volume < 0) {
            volume = routingController.getVolume();
        }
        int iMax = Math.max(0, Math.min(volume + i, this.g.getVolumeMax()));
        this.n = iMax;
        this.g.setVolume(iMax);
        Handler handler = this.k;
        qa1 qa1Var = this.m;
        handler.removeCallbacks(qa1Var);
        handler.postDelayed(qa1Var, 1000L);
    }

    @Override // defpackage.nq2
    public final void m(String str) {
        if (str == null || str.isEmpty()) {
            Log.w("MR2Provider", "onAddMemberRoute: Ignoring null or empty routeId.");
            return;
        }
        MediaRoute2Info mediaRoute2InfoH = this.p.h(str);
        if (mediaRoute2InfoH == null) {
            Log.w("MR2Provider", "onAddMemberRoute: Specified route not found. routeId=".concat(str));
        } else {
            this.g.selectRoute(mediaRoute2InfoH);
        }
    }

    @Override // defpackage.nq2
    public final void n(String str) {
        if (str == null || str.isEmpty()) {
            Log.w("MR2Provider", "onRemoveMemberRoute: Ignoring null or empty routeId.");
            return;
        }
        MediaRoute2Info mediaRoute2InfoH = this.p.h(str);
        if (mediaRoute2InfoH == null) {
            Log.w("MR2Provider", "onRemoveMemberRoute: Specified route not found. routeId=".concat(str));
        } else {
            this.g.deselectRoute(mediaRoute2InfoH);
        }
    }

    @Override // defpackage.nq2
    public final void o(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            Log.w("MR2Provider", "onUpdateMemberRoutes: Ignoring null or empty routeIds.");
            return;
        }
        String str = (String) arrayList.get(0);
        zo2 zo2Var = this.p;
        MediaRoute2Info mediaRoute2InfoH = zo2Var.h(str);
        if (mediaRoute2InfoH != null) {
            zo2Var.v.transferTo(mediaRoute2InfoH);
            return;
        }
        Log.w("MR2Provider", "onUpdateMemberRoutes: Specified route not found. routeId=" + str);
    }
}
