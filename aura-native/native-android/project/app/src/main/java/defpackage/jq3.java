package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.Log;
import android.view.Surface;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.database.AppDatabase;
import com.eddyizm.tempus.database.AppDatabase_Impl;
import com.eddyizm.tempus.model.InternetRadioStationCache;
import com.eddyizm.tempus.service.MediaService;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jq3 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ jq3(hh3 hh3Var, k03 k03Var) {
        this.n = 2;
        this.o = k03Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        int i = this.n;
        Object[] objArr = 0;
        boolean z2 = true;
        int i2 = 0;
        Object obj = this.o;
        switch (i) {
            case 0:
                lq3 lq3Var = (lq3) obj;
                ea2 ea2Var = lq3Var.s;
                if (lq3Var.o == 0) {
                    lq3Var.p = true;
                    ea2Var.d(q92.ON_PAUSE);
                }
                if (lq3Var.n == 0 && lq3Var.p) {
                    ea2Var.d(q92.ON_STOP);
                    lq3Var.q = true;
                    return;
                }
                return;
            case 1:
                xl.E((s24) ((ns3) obj).o, false, true, new k52(29));
                return;
            case 2:
                k03 k03Var = (k03) obj;
                List list = (List) ((List) xl.E((AppDatabase_Impl) AppDatabase.y().z().o, true, false, new or1(25))).stream().map(new hu3(0)).collect(Collectors.toList());
                if (list.isEmpty()) {
                    return;
                }
                list.sort(Comparator.comparing(new hu3(2), String.CASE_INSENSITIVE_ORDER));
                k03Var.i(list);
                return;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                AppDatabase appDatabaseY = AppDatabase.y();
                xl.E((AppDatabase_Impl) appDatabaseY.z().o, false, true, new or1(27));
                List<InternetRadioStationCache> list2 = (List) ((List) obj).stream().map(new hu3(1)).collect(Collectors.toList());
                c12 c12VarZ = appDatabaseY.z();
                xl.E((AppDatabase_Impl) c12VarZ.o, false, true, new o(13, c12VarZ, list2));
                for (InternetRadioStationCache internetRadioStationCache : list2) {
                    if (internetRadioStationCache.getCoverArtUrl() != null && !internetRadioStationCache.getCoverArtUrl().isEmpty()) {
                        xt3.b(internetRadioStationCache.getId(), internetRadioStationCache.getCoverArtUrl());
                    }
                }
                return;
            case 4:
                gn2 gn2Var = (gn2) obj;
                try {
                    App appB = App.b();
                    Context applicationContext = appB != null ? appB.getApplicationContext() : null;
                    rr2.v("Context must be provided if MediaSource.Factory is not set.", applicationContext != null);
                    sk0 sk0Var = new sk0();
                    synchronized (sk0Var) {
                        sk0Var.b = 260;
                    }
                    aw2 aw2Var = new aw2(new hw2(gn2Var, new dm0(applicationContext, sk0Var)));
                    try {
                        tv4 tv4Var = (tv4) aw2Var.b().get(20L, TimeUnit.SECONDS);
                        ArrayList arrayList = new ArrayList();
                        if (tv4Var != null) {
                            for (int i3 = 0; i3 < tv4Var.a; i3++) {
                                sv4 sv4VarA = tv4Var.a(i3);
                                for (int i4 = 0; i4 < sv4VarA.a; i4++) {
                                    qv2 qv2Var = sv4VarA.d[i4].l;
                                    if (qv2Var != null) {
                                        arrayList.add(qv2Var);
                                    }
                                }
                            }
                        }
                        ArrayList arrayListE = jz3.e(arrayList);
                        if (jz3.m(arrayListE) == 0.0f && jz3.j(arrayListE) == 0.0f) {
                            z2 = false;
                        }
                        if (z2) {
                            jz3.b.put(gn2Var.a, arrayListE);
                        }
                        Log.d("ReplayGainUtil", "Prefetched " + gn2Var.a + " trackGain=" + jz3.m(arrayListE) + " valid=" + z2);
                        jz3.g.post(new ur2(18, gn2Var, arrayListE));
                        aw2Var.close();
                        return;
                    } catch (Throwable th) {
                        try {
                            aw2Var.close();
                            break;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    Log.d("ReplayGainUtil", "Prefetch failed for " + gn2Var.a + ": " + th3);
                    jz3.c.remove(gn2Var.a);
                    return;
                }
            case 5:
                t24 t24Var = (t24) obj;
                Object[] objArr2 = t24Var.c > 0;
                if (t24Var.o.compareAndSet(false, true) && objArr2 == true) {
                    fu.G(t24Var.l.h(), t24Var.r, null, new x24(t24Var, objArr == true ? 1 : 0, i2), 2);
                    return;
                }
                return;
            case 6:
                ((yk) obj).a();
                return;
            case 7:
                bk bkVar = (bk) obj;
                bkVar.p = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) bkVar.r;
                o65 o65Var = sideSheetBehavior.v;
                if (o65Var != null && o65Var.g()) {
                    bkVar.c(bkVar.o);
                    return;
                } else {
                    if (sideSheetBehavior.u == 2) {
                        sideSheetBehavior.x(bkVar.o);
                        return;
                    }
                    return;
                }
            case 8:
                yf4 yf4Var = (yf4) obj;
                boolean z3 = yf4Var.f;
                if (!z3 || (z = yf4Var.g)) {
                    return;
                }
                if (((!z3 || z) ? 0L : Math.max(0L, yf4Var.e - System.currentTimeMillis())) > 0) {
                    vj3 vj3Var = yf4Var.h;
                    if (vj3Var != null) {
                        vj3Var.a.x0();
                    }
                    jq3 jq3Var = new jq3(8, yf4Var);
                    yf4Var.b = jq3Var;
                    yf4Var.a.postDelayed(jq3Var, 1000L);
                    return;
                }
                yf4Var.f = false;
                yf4Var.b = null;
                yf4.b();
                vj3 vj3Var2 = yf4Var.h;
                if (vj3Var2 != null) {
                    vj3Var2.a.x0();
                }
                zh0 zh0Var = yf4Var.i;
                if (zh0Var != null) {
                    yf4 yf4VarC = yf4.c();
                    yf4VarC.c = false;
                    yf4VarC.a.post(new pb0(yf4VarC, ((MediaService) zh0Var.o).p().a(), new float[]{1.0f}, 6));
                    return;
                }
                return;
            case 9:
                ni4 ni4Var = (ni4) ((o7) obj).b;
                Iterator it = ni4Var.z.iterator();
                while (it.hasNext()) {
                    int iIntValue = ((Integer) it.next()).intValue();
                    if (iIntValue >= 0 && iIntValue < ni4Var.v.f.size()) {
                        ni4Var.e(iIntValue, "payload_playback");
                    }
                }
                return;
            case 10:
                sj4 sj4Var = (sj4) obj;
                Surface surface = sj4Var.u;
                if (surface != null) {
                    Iterator it2 = sj4Var.n.iterator();
                    while (it2.hasNext()) {
                        ((d41) it2.next()).n.t1(null);
                    }
                }
                SurfaceTexture surfaceTexture = sj4Var.t;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                if (surface != null) {
                    surface.release();
                }
                sj4Var.t = null;
                sj4Var.u = null;
                return;
            case 11:
                int[] iArr = SwipeRefreshLayout.a0;
                ((SwipeRefreshLayout) obj).l();
                return;
            default:
                j55 j55Var = (j55) obj;
                j55Var.n.postVsyncCallback(j55Var);
                return;
        }
    }

    public /* synthetic */ jq3(int i, Object obj) {
        this.n = i;
        this.o = obj;
    }
}
