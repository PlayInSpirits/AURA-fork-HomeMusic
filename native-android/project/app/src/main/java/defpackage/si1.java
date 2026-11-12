package defpackage;

import android.app.Application;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.util.Log;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.webkit.CookieManager;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.eddyizm.tempus.homemusic.WaveRetry;
import com.eddyizm.tempus.interfaces.MediaIndexCallback;
import com.eddyizm.tempus.interfaces.PlaylistCallback;
import com.eddyizm.tempus.radiobrowser.RadioBrowserCountry;
import com.eddyizm.tempus.subsonic.base.ApiResponse;
import com.eddyizm.tempus.ui.fragment.PlaylistPageFragment;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class si1 implements be0, zy3, PointerInputEventHandler, eh2, rm, er2, ou2, MediaIndexCallback, PlaylistCallback, Callback, f4 {
    public final /* synthetic */ int n;
    public Object o;

    public si1(int i) {
        this.n = i;
        switch (i) {
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                this.o = yw1.j();
                break;
            case 5:
                this.o = new LinkedHashMap(0, 0.75f, true);
                break;
            case 11:
                this.o = new rw2(500L);
                break;
            case 23:
                this.o = new Region();
                break;
            case 25:
                this.o = new nk1();
                break;
            case 27:
                this.o = new SparseArray();
                break;
            default:
                this.o = new ConcurrentHashMap();
                break;
        }
    }

    private final void J(Call call, Throwable th) {
    }

    private final void K(qu2 qu2Var) {
    }

    public void C(b6 b6Var) {
        RecyclerView recyclerView = (RecyclerView) this.o;
        int i = b6Var.a;
        if (i == 1) {
            recyclerView.A.Z(b6Var.b, b6Var.d);
            return;
        }
        if (i == 2) {
            recyclerView.A.c0(b6Var.b, b6Var.d);
        } else if (i == 4) {
            recyclerView.A.d0(b6Var.b, b6Var.d);
        } else {
            if (i != 8) {
                return;
            }
            recyclerView.A.b0(b6Var.b, b6Var.d);
        }
    }

    public cx3 D(int i) {
        RecyclerView recyclerView = (RecyclerView) this.o;
        int iK = recyclerView.s.k();
        cx3 cx3Var = null;
        for (int i2 = 0; i2 < iK; i2++) {
            cx3 cx3VarN = RecyclerView.N(recyclerView.s.j(i2));
            if (cx3VarN != null && !cx3VarN.j() && cx3VarN.c == i) {
                if (!((ArrayList) recyclerView.s.r).contains(cx3VarN.a)) {
                    cx3Var = cx3VarN;
                    break;
                }
                cx3Var = cx3VarN;
            }
        }
        if (cx3Var != null) {
            if (!((ArrayList) recyclerView.s.r).contains(cx3Var.a)) {
                return cx3Var;
            }
            if (RecyclerView.Q0) {
                Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
            }
        }
        return null;
    }

    public List E(String str) {
        if (str == null) {
            return null;
        }
        return (List) ((nk1) this.o).f(str, new TypeToken<List<? extends String>>() { // from class: com.eddyizm.tempus.database.converter.StringListConverter$fromString$listType$1
        }.getType());
    }

    public void F(int i, int i2, Object obj) {
        int i3;
        int i4;
        RecyclerView recyclerView = (RecyclerView) this.o;
        int iK = recyclerView.s.k();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < iK; i6++) {
            View viewJ = recyclerView.s.j(i6);
            cx3 cx3VarN = RecyclerView.N(viewJ);
            if (cx3VarN != null && !cx3VarN.q() && (i4 = cx3VarN.c) >= i && i4 < i5) {
                cx3VarN.a(2);
                if (obj == null) {
                    cx3VarN.a(1024);
                } else if ((1024 & cx3VarN.j) == 0) {
                    if (cx3VarN.k == null) {
                        ArrayList arrayList = new ArrayList();
                        cx3VarN.k = arrayList;
                        cx3VarN.l = Collections.unmodifiableList(arrayList);
                    }
                    cx3VarN.k.add(obj);
                }
                ((nw3) viewJ.getLayoutParams()).c = true;
            }
        }
        hm2 hm2Var = recyclerView.p;
        ArrayList arrayList2 = (ArrayList) hm2Var.f;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            cx3 cx3Var = (cx3) arrayList2.get(size);
            if (cx3Var != null && (i3 = cx3Var.c) >= i && i3 < i5) {
                cx3Var.a(2);
                hm2Var.g(size);
            }
        }
        recyclerView.y0 = true;
    }

    public void G(int i, int i2) {
        RecyclerView recyclerView = (RecyclerView) this.o;
        int iK = recyclerView.s.k();
        for (int i3 = 0; i3 < iK; i3++) {
            cx3 cx3VarN = RecyclerView.N(recyclerView.s.j(i3));
            if (cx3VarN != null && !cx3VarN.q() && cx3VarN.c >= i) {
                if (RecyclerView.Q0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert attached child " + i3 + " holder " + cx3VarN + " now at position " + (cx3VarN.c + i2));
                }
                cx3VarN.n(i2, false);
                recyclerView.u0.f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.p.f;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            cx3 cx3Var = (cx3) arrayList.get(i4);
            if (cx3Var != null && cx3Var.c >= i) {
                if (RecyclerView.Q0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert cached " + i4 + " holder " + cx3Var + " now at position " + (cx3Var.c + i2));
                }
                cx3Var.n(i2, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.x0 = true;
    }

    public void H(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = (RecyclerView) this.o;
        int iK = recyclerView.s.k();
        int i10 = -1;
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i11 = 0; i11 < iK; i11++) {
            cx3 cx3VarN = RecyclerView.N(recyclerView.s.j(i11));
            if (cx3VarN != null && (i9 = cx3VarN.c) >= i4 && i9 <= i3) {
                if (RecyclerView.Q0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove attached child " + i11 + " holder " + cx3VarN);
                }
                if (cx3VarN.c == i) {
                    cx3VarN.n(i2 - i, false);
                } else {
                    cx3VarN.n(i5, false);
                }
                recyclerView.u0.f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.p.f;
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i10 = 1;
        }
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            cx3 cx3Var = (cx3) arrayList.get(i12);
            if (cx3Var != null && (i8 = cx3Var.c) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    cx3Var.n(i2 - i, false);
                } else {
                    cx3Var.n(i10, false);
                }
                if (RecyclerView.Q0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove cached child " + i12 + " holder " + cx3Var);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.x0 = true;
    }

    public void I(Bundle bundle, Bundle bundle2) {
        Bundle bundle3 = new Bundle(bundle);
        bundle3.putAll(bundle2);
        ((lb4) this.o).l(new ab4(-1, bundle3));
    }

    public void L(k02 k02Var) {
        ((Region) this.o).set(k02Var.a, k02Var.b, k02Var.c, k02Var.d);
    }

    @Override // defpackage.rm
    public void a(long j) {
        bk2 bk2Var = (bk2) this.o;
        bk2Var.g1 = true;
        xc5 xc5Var = bk2Var.V0;
        Handler handler = (Handler) xc5Var.o;
        if (handler != null) {
            handler.post(new mm(xc5Var, j, 0));
        }
    }

    @Override // defpackage.zy3
    public void accept(Object obj, Object obj2) {
        GetCredentialRequest getCredentialRequest = (GetCredentialRequest) this.o;
        t02 t02Var = new t02((cr4) obj2);
        fu1 fu1Var = (fu1) ((hu1) ((sv1) obj).e());
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
        int i = bi5.a;
        parcelObtain.writeStrongBinder(t02Var);
        parcelObtain.writeInt(1);
        getCredentialRequest.writeToParcel(parcelObtain, 0);
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            fu1Var.e.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain.recycle();
            parcelObtain2.recycle();
        }
    }

    @Override // defpackage.rm
    public void b(int i) {
        ns3 ns3Var;
        bk2 bk2Var = (bk2) this.o;
        if (Build.VERSION.SDK_INT >= 35 && (ns3Var = bk2Var.X0) != null) {
            ns3Var.f(i);
        }
        xc5 xc5Var = bk2Var.V0;
        Handler handler = (Handler) xc5Var.o;
        if (handler != null) {
            handler.post(new ul(i, 1, xc5Var));
        }
    }

    @Override // defpackage.rm
    public void d(boolean z) {
        xc5 xc5Var = ((bk2) this.o).V0;
        Handler handler = (Handler) xc5Var.o;
        if (handler != null) {
            handler.post(new pm(xc5Var, z, 0));
        }
    }

    @Override // defpackage.rm
    public void f(pa paVar) {
        xc5 xc5Var = ((bk2) this.o).V0;
        Handler handler = (Handler) xc5Var.o;
        if (handler != null) {
            handler.post(new nm(xc5Var, paVar, 0));
        }
    }

    @Override // defpackage.rm
    public void g(Exception exc) {
        l93.G("MediaCodecAudioRenderer", "Audio sink error", exc);
        xc5 xc5Var = ((bk2) this.o).V0;
        Handler handler = (Handler) xc5Var.o;
        if (handler != null) {
            handler.post(new jm(xc5Var, exc, 1));
        }
    }

    @Override // defpackage.f4
    public boolean h(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.o;
        if (!swipeDismissBehavior.w(view)) {
            return false;
        }
        WeakHashMap weakHashMap = j65.a;
        boolean z = view.getLayoutDirection() == 1;
        int i = swipeDismissBehavior.r;
        view.offsetLeftAndRight((!(i == 0 && z) && (i != 1 || z)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(0.0f);
        zg5 zg5Var = swipeDismissBehavior.o;
        if (zg5Var != null) {
            zg5Var.y(view);
        }
        return true;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public Object invoke(sn3 sn3Var, vd0 vd0Var) {
        Object objJ = te5.j(new p(sn3Var, (lm0) this.o, null, 10), vd0Var);
        return objJ == xe0.n ? objJ : j15.a;
    }

    @Override // defpackage.rm
    public void j(pa paVar) {
        xc5 xc5Var = ((bk2) this.o).V0;
        Handler handler = (Handler) xc5Var.o;
        if (handler != null) {
            handler.post(new nm(xc5Var, paVar, 1));
        }
    }

    @Override // defpackage.ou2
    public boolean m(qu2 qu2Var, MenuItem menuItem) {
        switch (this.n) {
            case 12:
                q33 q33Var = ((BottomNavigationView) this.o).r;
                return (q33Var == null || q33Var.a(menuItem)) ? false : true;
            default:
                return false;
        }
    }

    @Override // defpackage.rm
    public void n() {
        ((bk2) this.o).f1 = true;
    }

    @Override // defpackage.rm
    public void o() {
        k41 k41Var = ((bk2) this.o).V;
        if (k41Var != null) {
            k41Var.a.g0 = true;
        }
    }

    @Override // retrofit2.Callback
    public void onFailure(Call call, Throwable th) {
        switch (this.n) {
            case WaveRetry.MAX_FAILURES /* 16 */:
                Application application = ((um3) this.o).b;
                application.getClass();
                Toast.makeText(application, "Network error: " + th.getMessage(), 1).show();
                break;
            case 17:
            default:
                ((mb4) this.o).onError(new Exception(th.getMessage()));
                break;
            case 18:
                break;
            case 19:
                ((gu3) this.o).g.k("Network error: " + th.getMessage());
                break;
        }
    }

    @Override // com.eddyizm.tempus.interfaces.MediaIndexCallback
    public void onRecovery(int i) {
        xk3 xk3Var = (xk3) this.o;
        int iD = xk3Var.d();
        lo loVar = xk3Var.u;
        if (iD < i) {
            ((TextView) loVar.k).setAlpha(0.2f);
            ((TextView) loVar.j).setAlpha(0.2f);
            ((ConstraintLayout) loVar.m).setAlpha(0.2f);
        } else {
            ((TextView) loVar.k).setAlpha(1.0f);
            ((TextView) loVar.j).setAlpha(1.0f);
            ((ConstraintLayout) loVar.m).setAlpha(1.0f);
        }
    }

    @Override // com.eddyizm.tempus.interfaces.PlaylistCallback
    public void onRenamed(String str) {
        PlaylistPageFragment playlistPageFragment = (PlaylistPageFragment) this.o;
        playlistPageFragment.n0.e.setName(str);
        yd1 yd1Var = playlistPageFragment.l0;
        if (yd1Var != null) {
            yd1Var.a.setTitle(str);
            playlistPageFragment.l0.j.setText(str);
        }
    }

    @Override // retrofit2.Callback
    public void onResponse(Call call, Response response) {
        switch (this.n) {
            case WaveRetry.MAX_FAILURES /* 16 */:
                um3 um3Var = (um3) this.o;
                if (response.code() == 501) {
                    Application application = um3Var.b;
                    application.getClass();
                    Toast.makeText(application, "Podcasts are not supported by this server", 1).show();
                } else if (!response.isSuccessful() || response.body() == null) {
                    um3Var.getClass();
                    String str = "HTTP error: " + response.code();
                    if (response.errorBody() != null) {
                        try {
                            String strString = response.errorBody().string();
                            if (!strString.isEmpty()) {
                                str = str + " - " + strString;
                            }
                        } catch (IOException e) {
                            Log.e("PodcastChannelBottomSheetViewModel", "Error reading error body", e);
                        }
                    }
                    Application application2 = um3Var.b;
                    application2.getClass();
                    Toast.makeText(application2, str, 1).show();
                } else if ("ok".equals(((ApiResponse) response.body()).getSubsonicResponse().getStatus())) {
                    Application application3 = um3Var.b;
                    application3.getClass();
                    Toast.makeText(application3, "Podcast channel deleted", 0).show();
                }
                break;
            case 17:
            default:
                mb4 mb4Var = (mb4) this.o;
                if (response.isSuccessful() && response.body() != null && ((ApiResponse) response.body()).getSubsonicResponse() != null) {
                    if (((ApiResponse) response.body()).getSubsonicResponse().getError() != null) {
                        mb4Var.onError(new Exception(((ApiResponse) response.body()).getSubsonicResponse().getError().getMessage()));
                    } else if (((ApiResponse) response.body()).getSubsonicResponse().getScanStatus() != null) {
                        mb4Var.onSuccess(((ApiResponse) response.body()).getSubsonicResponse().getScanStatus().isScanning(), ((ApiResponse) response.body()).getSubsonicResponse().getScanStatus().getCount().longValue());
                    }
                    break;
                }
                break;
            case 18:
                eu3 eu3Var = (eu3) this.o;
                ArrayList arrayList = eu3Var.K0;
                if (eu3Var.y() && eu3Var.J0 != null && response.isSuccessful() && response.body() != null) {
                    arrayList.clear();
                    for (RadioBrowserCountry radioBrowserCountry : (List) response.body()) {
                        if (radioBrowserCountry.stationCount > 0) {
                            arrayList.add(radioBrowserCountry.name);
                        }
                    }
                    Collections.sort(arrayList, String.CASE_INSENSITIVE_ORDER);
                    if (((ListView) eu3Var.J0.g).getVisibility() == 0) {
                        eu3Var.o0(((TextInputEditText) eu3Var.J0.e).getText() != null ? ((TextInputEditText) eu3Var.J0.e).getText().toString() : "");
                    }
                    break;
                }
                break;
            case 19:
                gu3 gu3Var = (gu3) this.o;
                if (!response.isSuccessful() || response.body() == null) {
                    gu3Var.g.k("HTTP error: " + response.code());
                } else {
                    ApiResponse apiResponse = (ApiResponse) response.body();
                    String status = apiResponse.getSubsonicResponse().getStatus();
                    if ("ok".equals(status)) {
                        gu3Var.f.k(Boolean.TRUE);
                    } else if ("failed".equals(status)) {
                        gu3.c(gu3Var, apiResponse);
                    }
                }
                break;
        }
    }

    @Override // defpackage.be0
    public void p(gr1 gr1Var, List list) {
        CookieManager cookieManager;
        Object objPutIfAbsent;
        gr1Var.getClass();
        try {
            cookieManager = CookieManager.getInstance();
        } catch (Throwable th) {
            Log.w("HubClient", "WebView cookie store unavailable", th);
            cookieManager = null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ae0 ae0Var = (ae0) it.next();
            if (cookieManager != null) {
                cookieManager.setCookie(gr1Var.i, ae0Var.toString());
            } else {
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.o;
                String str = gr1Var.d;
                Object concurrentHashMap2 = concurrentHashMap.get(str);
                if (concurrentHashMap2 == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(str, (concurrentHashMap2 = new ConcurrentHashMap()))) != null) {
                    concurrentHashMap2 = objPutIfAbsent;
                }
                ((Map) concurrentHashMap2).put(ae0Var.a, ae0Var);
            }
        }
    }

    @Override // defpackage.rm
    public void q(int i, long j, long j2) {
        xc5 xc5Var = ((bk2) this.o).V0;
        Handler handler = (Handler) xc5Var.o;
        if (handler != null) {
            handler.post(new lm(xc5Var, i, j, j2, 0));
        }
    }

    @Override // defpackage.rm
    public void s() {
        ((bk2) this.o).t();
    }

    @Override // defpackage.rm
    public void u() {
        ((bk2) this.o).d1 = true;
    }

    @Override // defpackage.be0
    public List w(gr1 gr1Var) {
        CookieManager cookieManager;
        Collection collectionValues;
        boolean zE;
        gr1Var.getClass();
        String str = gr1Var.d;
        ArrayList arrayList = null;
        try {
            cookieManager = CookieManager.getInstance();
        } catch (Throwable th) {
            Log.w("HubClient", "WebView cookie store unavailable", th);
            cookieManager = null;
        }
        if (cookieManager == null) {
            Map map = (Map) ((ConcurrentHashMap) this.o).get(str);
            if (map != null && (collectionValues = map.values()) != null) {
                arrayList = new ArrayList();
                for (Object obj : collectionValues) {
                    ae0 ae0Var = (ae0) obj;
                    String str2 = ae0Var.d;
                    if (ae0Var.i) {
                        zE = h12.c(str, str2);
                    } else {
                        Pattern pattern = ae0.k;
                        zE = l93.E(str, str2);
                    }
                    if (zE) {
                        String str3 = ae0Var.e;
                        String strB = gr1Var.b();
                        if (strB.equals(str3) || (xm4.k0(strB, str3, false) && (xm4.e0(str3, "/", false) || strB.charAt(str3.length()) == '/'))) {
                            if (!ae0Var.f || gr1Var.f()) {
                                arrayList.add(obj);
                            }
                        }
                    }
                }
            }
            if (arrayList != null) {
                return arrayList;
            }
        } else {
            String cookie = cookieManager.getCookie(gr1Var.i);
            if (cookie != null) {
                List<String> listD0 = qm4.D0(cookie, new char[]{';'});
                ArrayList arrayList2 = new ArrayList();
                for (String str4 : listD0) {
                    Pattern pattern2 = ae0.k;
                    ae0 ae0VarT = l93.T(gr1Var, qm4.K0(str4).toString());
                    if (ae0VarT != null) {
                        arrayList2.add(ae0VarT);
                    }
                }
                return arrayList2;
            }
        }
        return u01.n;
    }

    @Override // defpackage.rm
    public void x() {
        k41 k41Var = ((bk2) this.o).V;
        if (k41Var != null) {
            k41Var.a();
        }
    }

    @Override // defpackage.ou2
    public void y(qu2 qu2Var) {
        switch (this.n) {
            case 12:
                break;
            default:
                cv4 cv4Var = (cv4) this.o;
                boolean zP = cv4Var.d.a.p();
                Window.Callback callback = cv4Var.e;
                if (zP) {
                    callback.onPanelClosed(108, qu2Var);
                } else if (callback.onPreparePanel(0, null, qu2Var)) {
                    callback.onMenuOpened(108, qu2Var);
                }
                break;
        }
    }

    @Override // defpackage.er2
    public void z(int i, String str, jn2 jn2Var) {
        Bundle bundle;
        pn2 pn2Var = (pn2) this.o;
        int i2 = 4;
        if (jn2Var == null || (bundle = jn2Var.a) == null) {
            if (str == null) {
                kf2.n("parentId cannot be null in notifyChildrenChanged");
                return;
            }
            bq4 bq4Var = pn2Var.n;
            bq4Var.getClass();
            bq4Var.p(str, null);
            ((pn2) bq4Var.q).t.post(new pb0(bq4Var, str, null, i2));
            return;
        }
        String str2 = f35.a;
        if (str == null) {
            kf2.n("parentId cannot be null in notifyChildrenChanged");
            return;
        }
        bq4 bq4Var2 = pn2Var.n;
        bq4Var2.getClass();
        bq4Var2.p(str, bundle);
        ((pn2) bq4Var2.q).t.post(new pb0(bq4Var2, str, bundle, i2));
    }

    public /* synthetic */ si1(int i, boolean z) {
        this.n = i;
    }

    public /* synthetic */ si1(int i, Object obj) {
        this.n = i;
        this.o = obj;
    }

    public si1(lj2 lj2Var, va4 va4Var, Bundle bundle, lb4 lb4Var) {
        this.n = 7;
        this.o = lb4Var;
    }
}
