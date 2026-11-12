package defpackage;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import androidx.preference.Preference;
import com.eddyizm.tempus.homemusic.HubFragment;
import com.eddyizm.tempus.homemusic.HubUpdater;
import com.eddyizm.tempus.subsonic.models.Child;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bs1 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    public /* synthetic */ bs1(Object obj, Object obj2, boolean z, int i) {
        this.n = i;
        this.p = obj;
        this.q = obj2;
        this.o = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object s14Var;
        int i = this.n;
        boolean z = this.o;
        Object obj = this.q;
        Object obj2 = this.p;
        switch (i) {
            case 0:
                HubFragment hubFragment = (HubFragment) obj2;
                String str = (String) obj;
                List list = HubFragment.y0;
                boolean z2 = this.o;
                if (z2) {
                    try {
                        rr1.m();
                    } catch (Throwable th) {
                        s14Var = new s14(th);
                    }
                }
                String strC = rr1.c();
                rr1.h();
                s14Var = strC;
                io1.b.post(new b41(hubFragment, s14Var, str, z2, 1));
                break;
            case 1:
                vb4 vb4Var = (vb4) obj2;
                Preference preference = (Preference) obj;
                if (vb4Var.y()) {
                    bu.g = z;
                    Preference preferenceH0 = vb4Var.h0("homemusic_check_update");
                    preference.A(z && (preferenceH0 != null && preferenceH0.K));
                    break;
                }
                break;
            case 2:
                ConcurrentHashMap concurrentHashMap = ot1.a;
                ot1.g((Context) obj2, ot1.h((String) obj), z);
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                HubUpdater.check$lambda$0$1((Activity) obj2, z, (Serializable) obj);
                break;
            case 4:
                ic2 ic2Var = (ic2) obj2;
                List list2 = (List) obj;
                try {
                    if (ic2Var.isDone()) {
                        try {
                            if (!u52.c().a) {
                                bo2.g(new yn2((bj2) ic2Var.get()), list2, z);
                                break;
                            }
                        } catch (InterruptedException e) {
                            e = e;
                        }
                    }
                } catch (InterruptedException | ExecutionException e2) {
                    e = e2;
                }
                e.printStackTrace();
                break;
            default:
                ic2 ic2Var2 = (ic2) obj2;
                Child child = (Child) obj;
                try {
                    if (ic2Var2.isDone()) {
                        try {
                            if (!u52.c().a) {
                                Log.e("MediaManager", "enqueue");
                                rs1.i(Collections.singletonList(child));
                                bj2 bj2Var = (bj2) ic2Var2.get();
                                int iO0 = bj2Var.o0();
                                int i2 = 9;
                                if (!z || iO0 == -1) {
                                    vs3.b.execute(new gk(new vs3(), ((bj2) ic2Var2.get()).Q0(), child, i2));
                                    bj2 bj2Var2 = (bj2) ic2Var2.get();
                                    gn2 gn2VarK = gi1.K(child);
                                    bj2Var2.c1();
                                    rk2 rk2Var = bj2Var2.d;
                                    if (rk2Var.Y()) {
                                        rk2Var.U0(gn2VarK);
                                    } else {
                                        l93.q0("MediaController", "The controller is not connected. Ignoring addMediaItem().");
                                    }
                                } else {
                                    vs3.b.execute(new gk(new vs3(), iO0 + 1, child, i2));
                                    bo2.i(new yn2(bj2Var), bj2Var, Collections.singletonList(gi1.K(child)));
                                }
                            }
                        } catch (InterruptedException e3) {
                            e = e3;
                            e.printStackTrace();
                            return;
                        }
                    }
                } catch (InterruptedException | ExecutionException e4) {
                    e = e4;
                }
                break;
        }
    }

    public /* synthetic */ bs1(Object obj, boolean z, Object obj2, int i) {
        this.n = i;
        this.p = obj;
        this.o = z;
        this.q = obj2;
    }
}
