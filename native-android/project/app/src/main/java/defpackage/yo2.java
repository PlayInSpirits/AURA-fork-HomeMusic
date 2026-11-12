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

    public yo2(zo2 zo2Var) {
        this.a = zo2Var;
    }

    public final void onStop(MediaRouter2.RoutingController routingController) {
        zo2 zo2Var = this.a;
        zo2Var.E = null;
        oq2 oq2Var = (oq2) zo2Var.x.remove(routingController);
        if (oq2Var == null) {
            Log.w("MR2Provider", "onStop: No matching routeController found. routingController=" + routingController);
            return;
        }
        ui1 ui1Var = (ui1) zo2Var.w.o;
        if (oq2Var != ui1Var.d) {
            int i = ui1.B;
            return;
        }
        wq2 wq2VarC = ui1Var.c();
        if (ui1Var.g() != wq2VarC) {
            ui1Var.j(wq2VarC, 2, true);
        }
    }

    public final void onTransfer(MediaRouter2.RoutingController routingController, MediaRouter2.RoutingController routingController2) {
        zo2 zo2Var = this.a;
        wq2 wq2Var = null;
        zo2Var.E = null;
        zo2Var.x.remove(routingController);
        if (routingController2 == zo2Var.v.getSystemController()) {
            ui1 ui1Var = (ui1) zo2Var.w.o;
            wq2 wq2VarC = ui1Var.c();
            if (ui1Var.g() != wq2VarC) {
                ui1Var.j(wq2VarC, 3, true);
                return;
            }
            return;
        }
        List selectedRoutes = routingController2.getSelectedRoutes();
        if (selectedRoutes.isEmpty()) {
            Log.w("MR2Provider", "Selected routes are empty. This shouldn't happen.");
            return;
        }
        int i = 0;
        String id = l3.g(selectedRoutes.get(0)).getId();
        zo2Var.x.put(routingController2, new vo2(zo2Var, routingController2, id));
        ui1 ui1Var2 = (ui1) zo2Var.w.o;
        ArrayList arrayList = ui1Var2.h;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            wq2 wq2Var2 = (wq2) obj;
            if (wq2Var2.c() == ui1Var2.q && TextUtils.equals(id, wq2Var2.b)) {
                wq2Var = wq2Var2;
                break;
            }
        }
        if (wq2Var == null) {
            Log.w("AxMediaRouter", "onSelectRoute: The target RouteInfo is not found for descriptorId=" + id);
        } else {
            ui1Var2.j(wq2Var, 3, true);
        }
        zo2Var.j(routingController2);
    }

    public final void onTransferFailure(MediaRoute2Info mediaRoute2Info) {
        this.a.E = null;
        Log.w("MR2Provider", "Transfer failed. requestedRoute=" + mediaRoute2Info);
    }
}
