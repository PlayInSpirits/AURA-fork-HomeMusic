package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.eddyizm.tempus.model.Queue;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.ui.activity.MainActivity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutionException;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gk implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    public /* synthetic */ gk(Object obj, int i, Object obj2, int i2) {
        this.n = i2;
        this.p = obj;
        this.o = i;
        this.q = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ab4 ab4Var;
        int i = this.n;
        int i2 = 0;
        Object obj = this.q;
        int size = this.o;
        Object obj2 = this.p;
        switch (i) {
            case 0:
                Bundle bundle = (Bundle) obj;
                v23 v23Var = ((MainActivity) ((c12) obj2).o).T;
                if (v23Var != null) {
                    if (v23Var.g() == null || v23Var.g().u != size) {
                        v23Var.m(size, bundle, null);
                    } else {
                        v23Var.m(size, bundle, new y23(true, false, -1, false, false, -1, -1, -1, -1));
                    }
                    break;
                }
                break;
            case 1:
                j70 j70Var = (j70) obj2;
                Serializable serializable = (Serializable) ((zh0) obj).o;
                String str = (String) j70Var.a.get(Integer.valueOf(size));
                if (str != null) {
                    u5 u5Var = (u5) j70Var.e.get(str);
                    if ((u5Var != null ? u5Var.a : null) == null) {
                        j70Var.g.remove(str);
                        j70Var.f.put(str, serializable);
                    } else {
                        p5 p5Var = u5Var.a;
                        if (j70Var.d.remove(str)) {
                            p5Var.i(serializable);
                        }
                    }
                    break;
                }
                break;
            case 2:
                ((j70) obj2).a(size, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) obj));
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                ((sq3) ((ip0) obj2).c).e(size, obj);
                break;
            case 4:
                sw0 sw0Var = (sw0) obj2;
                ((tw0) obj).p(sw0Var.a, sw0Var.b, size);
                break;
            case 5:
                qc2 qc2Var = (qc2) obj;
                for (sc2 sc2Var : (CopyOnWriteArraySet) obj2) {
                    if (!sc2Var.d) {
                        if (size != -1) {
                            sc2Var.b.b(size);
                        }
                        sc2Var.c = true;
                        qc2Var.invoke(sc2Var.a);
                    }
                }
                break;
            case 6:
                bm2 bm2Var = (bm2) obj2;
                try {
                    ab4Var = (ab4) ((ic2) obj).get();
                    rr2.s(ab4Var, "SessionResult must not be null");
                } catch (InterruptedException e) {
                    e = e;
                    l93.r0("MCImplBase", "Session operation failed", e);
                    ab4Var = new ab4(-1);
                } catch (CancellationException e2) {
                    l93.r0("MCImplBase", "Session operation cancelled", e2);
                    ab4Var = new ab4(1);
                } catch (ExecutionException e3) {
                    e = e3;
                    l93.r0("MCImplBase", "Session operation failed", e);
                    ab4Var = new ab4(-1);
                }
                pu1 pu1Var = bm2Var.D;
                if (pu1Var != null) {
                    try {
                        pu1Var.a(bm2Var.c, size, ab4Var.b());
                    } catch (RemoteException unused) {
                        l93.q0("MCImplBase", "Error in sending");
                        return;
                    }
                    break;
                }
                break;
            case 7:
                ic2 ic2Var = (ic2) obj2;
                List list = (List) obj;
                try {
                    if (ic2Var.isDone()) {
                        Log.e("MediaManager", "remove");
                        if (((bj2) ic2Var.get()).Q0() > 1 && ((bj2) ic2Var.get()).o0() != size) {
                            ((bj2) ic2Var.get()).N(size);
                            if (size != -1) {
                                try {
                                    list.remove(size);
                                    new vs3().c(list, true, 0);
                                } catch (InterruptedException e4) {
                                    e = e4;
                                }
                            }
                            break;
                        }
                    }
                } catch (InterruptedException | ExecutionException e5) {
                    e = e5;
                }
                e.printStackTrace();
                break;
            case 8:
                Pair pair = (Pair) obj;
                ((nj0) ((zt2) obj2).o.i).p(((Integer) pair.first).intValue(), (mt2) pair.second, size);
                break;
            default:
                Child child = (Child) obj;
                ns3 ns3Var = ((vs3) obj2).a;
                new ArrayList();
                List listC = ns3Var.c();
                if (size < 0) {
                    size = 0;
                } else if (size > listC.size()) {
                    size = listC.size();
                }
                listC.add(size, new Queue(child));
                for (int i3 = 0; i3 < listC.size(); i3++) {
                    ((Queue) listC.get(i3)).setTrackOrder(i3);
                }
                xl.E((s24) ns3Var.o, false, true, new ls3(ns3Var, listC, i2));
                break;
        }
    }

    public /* synthetic */ gk(Object obj, Object obj2, int i, int i2) {
        this.n = i2;
        this.p = obj;
        this.q = obj2;
        this.o = i;
    }
}
