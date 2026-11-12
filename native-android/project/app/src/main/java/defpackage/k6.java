package defpackage;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioRouting;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import app.homemusic.R;
import com.eddyizm.tempus.homemusic.HubMixToday;
import com.eddyizm.tempus.homemusic.WaveRetry;
import com.eddyizm.tempus.model.Queue;
import com.eddyizm.tempus.service.MediaService;
import com.eddyizm.tempus.subsonic.models.ArtistID3;
import com.eddyizm.tempus.viewmodel.b;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.function.IntConsumer;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k6 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    public /* synthetic */ k6(ArrayList arrayList, pj4 pj4Var, xm0 xm0Var) {
        this.n = 20;
        this.o = arrayList;
        this.p = pj4Var;
    }

    /* JADX WARN: Code duplicated, block: B:196:0x053d  */
    /* JADX WARN: Code duplicated, block: B:198:0x0554  */
    /* JADX WARN: Code duplicated, block: B:199:0x0557  */
    /* JADX WARN: Code duplicated, block: B:203:0x055d  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        ql qlVar;
        sp3 sp3Var;
        long jMax;
        a00 a00Var;
        int i;
        boolean z;
        Object s14Var;
        Object s14Var2;
        int iO0 = -1;
        Queue queueA = null;
        int i2 = 1;
        int i3 = 0;
        switch (this.n) {
            case 0:
                ((g60) this.o).q((rw1) this.p);
                return;
            case 1:
                uo.p((lb) this.o, (LongSparseArray) this.p);
                return;
            case 2:
                ia4 ia4Var = (ia4) this.o;
                try {
                    ((Runnable) this.p).run();
                    return;
                } finally {
                    ia4Var.a();
                }
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                yk ykVar = (yk) this.o;
                ws1 ws1Var = (ws1) this.p;
                ((ck2) ykVar.s).j();
                cl clVar = (cl) ykVar.r;
                synchronized (clVar.a) {
                    clVar.b();
                    ws1Var.run();
                    break;
                }
                return;
            case 4:
                Context context = (Context) this.o;
                q90 q90Var = (q90) this.p;
                xl.a = (AudioManager) context.getSystemService("audio");
                q90Var.d();
                return;
            case 5:
                xc5 xc5Var = (xc5) this.o;
                String str = (String) this.p;
                qm qmVar = (qm) xc5Var.p;
                String str2 = f35.a;
                qmVar.q(str);
                return;
            case 6:
                xc5 xc5Var2 = (xc5) this.o;
                h40 h40Var = (h40) this.p;
                qm qmVar2 = (qm) xc5Var2.p;
                String str3 = f35.a;
                qmVar2.K(h40Var);
                return;
            case 7:
                bq4 bq4Var = (bq4) this.o;
                AudioDeviceInfo routedDevice = ((AudioRouting) this.p).getRoutedDevice();
                if (routedDevice != null) {
                    ((Handler) bq4Var.p).post(new k6(8, bq4Var, routedDevice));
                    return;
                }
                return;
            case 8:
                bq4 bq4Var2 = (bq4) this.o;
                AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) this.p;
                if (((wm) bq4Var2.q) == null || (qlVar = ((dn) ((zh0) bq4Var2.o).o).h) == null || audioDeviceInfo.equals(qlVar.h)) {
                    return;
                }
                qlVar.h = audioDeviceInfo;
                qlVar.a(nl.b(qlVar.a, qlVar.i, audioDeviceInfo));
                return;
            case 9:
                c6 c6Var = (c6) this.o;
                Object objMo77apply = ((ij0) this.p).mo77apply(c6Var.f);
                c6Var.f = objMo77apply;
                wo woVar = new wo(c6Var, objMo77apply, i2);
                yp4 yp4Var = (yp4) c6Var.c;
                if (yp4Var.a.getLooper().getThread().isAlive()) {
                    yp4Var.d(woVar);
                    return;
                }
                return;
            case 10:
                MediaService mediaService = (MediaService) this.o;
                qi3 qi3Var = (qi3) this.p;
                while (ra0.b()) {
                    if (mediaService.D) {
                        return;
                    } else {
                        Thread.sleep(25L);
                    }
                }
                String strU = ud3.u();
                vs3 vs3Var = new vs3();
                List listB = vs3Var.b();
                if (listB == null || listB.isEmpty()) {
                    return;
                }
                ArrayList arrayListM = gi1.M(listB);
                if (arrayListM.isEmpty()) {
                    return;
                }
                try {
                    queueA = vs3Var.a();
                    break;
                } catch (Exception unused) {
                }
                hx3 hx3Var = new hx3();
                ix3 ix3Var = new ix3();
                if (queueA != null) {
                    String id = queueA.getId();
                    while (i3 < arrayListM.size()) {
                        if (((gn2) arrayListM.get(i3)).a.equals(id)) {
                            iO0 = i3;
                            if (iO0 >= 0) {
                                hx3Var.n = iO0;
                                WeakReference weakReference = bo2.a;
                                String id2 = queueA.getId();
                                id2.getClass();
                                sp3Var = (sp3) ud3.A().get(id2);
                                if (sp3Var != null) {
                                    jMax = sp3Var.b;
                                } else {
                                    jMax = 0;
                                }
                                if (jMax == 0) {
                                    jMax = Math.max(0L, queueA.getPlayingChanged());
                                }
                                ix3Var.n = jMax;
                            }
                        } else {
                            i3++;
                        }
                    }
                    if (iO0 >= 0) {
                        hx3Var.n = iO0;
                        WeakReference weakReference2 = bo2.a;
                        String id3 = queueA.getId();
                        id3.getClass();
                        sp3Var = (sp3) ud3.A().get(id3);
                        if (sp3Var != null) {
                            jMax = sp3Var.b;
                        } else {
                            jMax = 0;
                        }
                        if (jMax == 0) {
                            jMax = Math.max(0L, queueA.getPlayingChanged());
                        }
                        ix3Var.n = jMax;
                    }
                }
                mediaService.B.post(new up(mediaService, qi3Var, strU, arrayListM, hx3Var, ix3Var, 0));
                return;
            case 11:
                ((pq) this.o).f((kn2) this.p, false);
                return;
            case 12:
                au auVar = (au) this.o;
                vf2 vf2Var = (vf2) this.p;
                auVar.g = null;
                vf2Var.getClass();
                auVar.d(vf2.c());
                return;
            case 13:
                sc5 sc5Var = (sc5) this.o;
                String string = ((UUID) this.p).toString();
                string.getClass();
                wr1.h(sc5Var, string);
                return;
            case 14:
                String str4 = (String) this.o;
                vz vzVar = (vz) this.p;
                b00 b00Var = b00.a;
                kd3 kd3VarB = b00.b();
                if (h12.c(kd3VarB != null ? (String) kd3VarB.n : null, str4)) {
                    synchronized (b00Var) {
                        a00Var = (a00) b00.f.remove(vzVar.f);
                    }
                    if (a00Var != null) {
                        n61.a(a00Var.c);
                    }
                    boolean zF = n61.f(1, "hub:".concat(vzVar.c), vzVar.e);
                    if (vzVar.d && zF) {
                        Map mapX = lg2.X(new kd3("ref", vzVar.c), new kd3("star", Boolean.TRUE));
                        nk1 nk1Var = rr1.c;
                        WebView webView = hw.g;
                        if (webView != null) {
                            webView.evaluateJavascript(f34.h("window.dispatchEvent(new CustomEvent(", nk1Var.j("hm:hub-download"), ", {detail: ", nk1Var.j(mapX), "}));"), null);
                        }
                    }
                    Map mapX2 = lg2.X(new kd3("ref", vzVar.c), new kd3("star", Boolean.valueOf(zF)));
                    nk1 nk1Var2 = rr1.c;
                    WebView webView2 = hw.g;
                    if (webView2 != null) {
                        webView2.evaluateJavascript(f34.h("window.dispatchEvent(new CustomEvent(", nk1Var2.j("hm:hub-favorite"), ", {detail: ", nk1Var2.j(mapX2), "}));"), null);
                        return;
                    }
                    return;
                }
                return;
            case 15:
                nc1 nc1Var = (nc1) this.o;
                nc1Var.n.a(new d70(i3, (a93) this.p, nc1Var));
                return;
            case WaveRetry.MAX_FAILURES /* 16 */:
                List<hp> list = (List) this.o;
                xb0 xb0Var = (xb0) this.p;
                for (hp hpVar : list) {
                    Object obj = xb0Var.e;
                    ip ipVar = hpVar.a;
                    Object sc0Var = ipVar.e(obj) ? new sc0(ipVar.d()) : rc0.a;
                    rq3 rq3Var = hpVar.b;
                    rq3Var.getClass();
                    rq3Var.d(sc0Var);
                }
                return;
            case 17:
                ye4 ye4Var = (ye4) this.o;
                String str5 = (String) this.p;
                TextInputLayout textInputLayout = ye4Var.n;
                SimpleDateFormat simpleDateFormat = ye4Var.p;
                Context context2 = textInputLayout.getContext();
                textInputLayout.setError(context2.getString(R.string.mtrl_picker_invalid_format) + "\n" + String.format(context2.getString(R.string.mtrl_picker_invalid_format_use), str5.replace(' ', (char) 160)) + "\n" + String.format(context2.getString(R.string.mtrl_picker_invalid_format_example), simpleDateFormat.format(new Date(a35.d().getTimeInMillis())).replace(' ', (char) 160)));
                ze4 ze4Var = ye4Var.x;
                ye4Var.w.getError();
                ze4Var.getClass();
                ye4Var.v.a();
                return;
            case 18:
                jk0 jk0Var = (jk0) this.o;
                tb1 tb1Var = (tb1) this.p;
                kk0 kk0Var = jk0Var.q;
                if (kk0Var.p == 0 || jk0Var.p) {
                    return;
                }
                Looper looper = kk0Var.t;
                looper.getClass();
                jk0Var.o = kk0Var.g(looper, jk0Var.n, tb1Var, false);
                kk0Var.n.add(jk0Var);
                return;
            case 19:
                zk0 zk0Var = (zk0) this.o;
                Uri uri = (Uri) this.p;
                zk0Var.v = false;
                zk0Var.e(uri);
                return;
            case 20:
                ArrayList arrayList = (ArrayList) this.o;
                pj4 pj4Var = (pj4) this.p;
                if (arrayList.contains(pj4Var)) {
                    arrayList.remove(pj4Var);
                    View view = pj4Var.c.T;
                    int i4 = pj4Var.a;
                    view.getClass();
                    f34.a(view, i4);
                    return;
                }
                return;
            case 21:
                ((tn0) ((gp3) this.o).p).h.a((s55) this.p);
                return;
            case 22:
                vt0.a((vt0) this.p, ((ut0) this.o).b.l);
                return;
            case 23:
                ((IntConsumer) this.o).accept(((List) this.p).size());
                return;
            case 24:
                i41 i41Var = (i41) this.o;
                n41 n41Var = (n41) this.p;
                int i5 = i41Var.K - n41Var.b;
                i41Var.K = i5;
                if (n41Var.e) {
                    i41Var.L = n41Var.c;
                    i41Var.M = true;
                }
                if (i5 == 0) {
                    cu4 cu4Var = ((ph3) n41Var.f).a;
                    if (!i41Var.p0.a.p() && cu4Var.p()) {
                        i41Var.q0 = -1;
                        i41Var.r0 = 0L;
                    }
                    if (!cu4Var.p()) {
                        List listAsList = Arrays.asList(((tm3) cu4Var).k);
                        rr2.w(listAsList.size() == i41Var.q.size());
                        for (int i6 = 0; i6 < listAsList.size(); i6++) {
                            ((f41) i41Var.q.get(i6)).c = (cu4) listAsList.get(i6);
                        }
                    }
                    long j = -9223372036854775807L;
                    if (i41Var.M) {
                        boolean z2 = ((ph3) n41Var.f).a.p() && i41Var.p0.a.p();
                        boolean zEquals = ((ph3) n41Var.f).b.equals(i41Var.p0.b);
                        boolean z3 = ((ph3) n41Var.f).d == i41Var.p0.s;
                        if (z2 || (zEquals && z3)) {
                            i2 = 0;
                        }
                        if (i2 != 0) {
                            iO0 = i41Var.o0();
                            if (cu4Var.p() || ((ph3) n41Var.f).b.b()) {
                                j = ((ph3) n41Var.f).d;
                            } else {
                                ph3 ph3Var = (ph3) n41Var.f;
                                mt2 mt2Var = ph3Var.b;
                                long j2 = ph3Var.d;
                                Object obj2 = mt2Var.a;
                                zt4 zt4Var = i41Var.p;
                                cu4Var.g(obj2, zt4Var);
                                j = j2 + zt4Var.e;
                            }
                        }
                        i = iO0;
                        z = i2;
                    } else {
                        i = -1;
                        z = 0;
                    }
                    long j3 = j;
                    i41Var.M = false;
                    i41Var.x1((ph3) n41Var.f, 1, z, i41Var.L, j3, i, false);
                    return;
                }
                return;
            case 25:
                ((zk0) ((pm1) ((ln1) this.o).p.o).o.q.get(((nm1) this.p).m)).d(true);
                return;
            case 26:
                cp1 cp1Var = (cp1) this.o;
                View view2 = (View) this.p;
                try {
                    s14Var = (HubMixToday) rr1.d(new or1(i3), new or1(i2));
                    break;
                } catch (Throwable th) {
                    s14Var = new s14(th);
                }
                Throwable thA = bb3.a(s14Var);
                if (thA != null) {
                    Log.w("HomeMixCards", "mix: " + thA.getMessage());
                }
                io1.b.post(new v6(cp1Var, (HubMixToday) (s14Var instanceof s14 ? null : s14Var), view2, 13));
                return;
            case 27:
                cp1 cp1Var2 = (cp1) this.o;
                ArtistID3 artistID3 = (ArtistID3) this.p;
                if (cp1Var2.l0 == null || !cp1Var2.y()) {
                    return;
                }
                FrameLayout frameLayout = (FrameLayout) cp1Var2.m0.R.c;
                int[] iArr = qg4.E;
                qg4 qg4VarH = qg4.h(frameLayout, frameLayout.getResources().getText(R.string.artist_adapter_radio_station_starting), 0);
                qg4VarH.e(cp1Var2.m0.u());
                qg4VarH.j();
                if (cp1Var2.F0 != null) {
                    b bVar = cp1Var2.n0;
                    le1 le1VarV = cp1Var2.v();
                    k03 k03Var = bVar.z;
                    k03Var.k(Collections.EMPTY_LIST);
                    pa paVar = bVar.e;
                    String name = artistID3.getName();
                    paVar.getClass();
                    pa.z(10, name).e(le1VarV, new g7(k03Var, i3));
                    k03Var.e(cp1Var2.v(), new xo1(cp1Var2, 21));
                    return;
                }
                return;
            case 28:
                String str6 = (String) this.o;
                try {
                    s14Var2 = (bj2) ((ic2) this.p).get();
                    break;
                } catch (Throwable th2) {
                    s14Var2 = new s14(th2);
                }
                boolean z4 = s14Var2 instanceof s14;
                Object obj3 = s14Var2;
                if (z4) {
                    obj3 = null;
                }
                bj2 bj2Var = (bj2) obj3;
                if (bj2Var == null) {
                    return;
                }
                gn2 gn2VarA = bj2Var.a();
                if (h12.c(gn2VarA != null ? gn2VarA.a : null, str6)) {
                    if (bj2Var.f0()) {
                        bj2Var.c0();
                        return;
                    } else {
                        bj2Var.c();
                        return;
                    }
                }
                return;
            default:
                fx3 fx3Var = (fx3) this.o;
                String str7 = (String) this.p;
                ExecutorService executorService = ur1.a;
                if (fx3Var.n) {
                    ur1.d(str7);
                    return;
                }
                try {
                    String strF = rs1.f();
                    Map.Entry entry = (Map.Entry) q40.v0(rr1.x(str7).entrySet());
                    rr1.d(new qs0((String) entry.getKey(), (String) entry.getValue(), strF, i2), new or1(19));
                    return;
                } catch (Exception e) {
                    Log.w("HubDislikes", "undislike " + str7 + ": " + e.getMessage());
                    ur1.d(str7);
                    return;
                }
        }
    }

    public /* synthetic */ k6(int i, Object obj, Object obj2) {
        this.n = i;
        this.o = obj;
        this.p = obj2;
    }
}
