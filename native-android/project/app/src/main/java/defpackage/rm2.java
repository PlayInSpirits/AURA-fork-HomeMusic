package defpackage;

import android.app.Application;
import android.app.Notification;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import app.homemusic.R;
import com.eddyizm.tempus.database.AppDatabase;
import com.eddyizm.tempus.homemusic.WaveRetry;
import com.eddyizm.tempus.interfaces.DialogClickCallback;
import com.eddyizm.tempus.interfaces.SystemCallback;
import com.eddyizm.tempus.subsonic.base.ApiResponse;
import com.eddyizm.tempus.subsonic.models.Bookmark;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.subsonic.models.Error;
import com.eddyizm.tempus.subsonic.models.ResponseStatus;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rm2 implements mo2, cq0, lm3, Callback, u55, DialogClickCallback, bi0, wo4, av4, de, f4 {
    public final /* synthetic */ int n;
    public Object o;

    public rm2(int i) {
        this.n = i;
        int i2 = 0;
        switch (i) {
            case 6:
                this.o = Build.VERSION.SDK_INT >= 28 ? new tv1() : new hh3(i2);
                break;
            case 14:
                this.o = new LinkedHashSet();
                break;
            case 15:
                this.o = uc5.B(Boolean.FALSE);
                break;
            case WaveRetry.MAX_FAILURES /* 16 */:
                this.o = AppDatabase.y().F();
                break;
            case 28:
                this.o = new qf2();
                break;
            default:
                this.o = g12.a(0, 16, wv.o);
                break;
        }
    }

    @Override // defpackage.u55
    public int a(View view) {
        return mw3.C(view) - ((ViewGroup.MarginLayoutParams) ((nw3) view.getLayoutParams())).topMargin;
    }

    @Override // defpackage.mo2
    public void b(no2 no2Var) {
        bw2 bw2Var = ((dw2) this.o).d.s.d;
        tv4 tv4VarN = no2Var.n();
        ((dw2) this.o).d.q.getClass();
        hw2 hw2Var = bw2Var.a;
        synchronized (hw2Var.p) {
            lb4 lb4Var = hw2Var.r;
            lb4Var.getClass();
            lb4Var.l(new cw2(tv4VarN));
        }
        ((dw2) this.o).d.s.a();
    }

    public long c(long j) {
        qf2 qf2Var = (qf2) this.o;
        qf2Var.getClass();
        if (k45.b(j) <= 0.0f || k45.c(j) <= 0.0f) {
            cz1.b("maximumVelocity should be a positive value. You specified=".concat(k45.f(j)));
        }
        return e35.h(qf2Var.a.b(k45.b(j)), qf2Var.b.b(k45.c(j)));
    }

    @Override // defpackage.u55
    public int d() {
        return ((mw3) this.o).H();
    }

    public Object e(q02 q02Var, vd0 vd0Var) throws Throwable {
        Object objB = ((cd4) this.o).b(q02Var, vd0Var);
        return objB == xe0.n ? objB : j15.a;
    }

    @Override // defpackage.wo4
    public String f() {
        return ((xo4) this.o).o;
    }

    @Override // defpackage.lm3
    public void g() {
        ((wl3) this.o).h.i(Integer.valueOf(R.string.playlist_editor_dialog_action_save_failure));
    }

    @Override // defpackage.de
    public c81 get(int i) {
        return ((d81[]) this.o)[i];
    }

    @Override // defpackage.f4
    public boolean h(View view) {
        ss0 ss0Var = (ss0) this.o;
        int currentItem = ((ViewPager2) view).getCurrentItem() + 1;
        ViewPager2 viewPager2 = (ViewPager2) ss0Var.q;
        if (viewPager2.E) {
            viewPager2.d(currentItem, true);
        }
        return true;
    }

    public void i(int i) {
        RecyclerView recyclerView = (RecyclerView) this.o;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }

    @Override // defpackage.ca4
    public void j(da4 da4Var) {
        ((dw2) this.o).d.s.c.a(3).b();
    }

    @Override // defpackage.u55
    public int k() {
        mw3 mw3Var = (mw3) this.o;
        return mw3Var.o - mw3Var.E();
    }

    public void l(q02 q02Var) {
        ((cd4) this.o).q(q02Var);
    }

    @Override // defpackage.bi0
    public ci0 m() {
        return new jm4(((kx) this.o).m());
    }

    @Override // defpackage.wo4
    public void n(vo4 vo4Var) {
        xo4 xo4Var = (xo4) this.o;
        int length = xo4Var.q.length;
        for (int i = 1; i < length; i++) {
            int i2 = xo4Var.q[i];
            if (i2 == 1) {
                vo4Var.c(i, xo4Var.r[i]);
            } else if (i2 == 2) {
                vo4Var.d(xo4Var.s[i], i);
            } else if (i2 == 3) {
                String str = xo4Var.t[i];
                str.getClass();
                vo4Var.h(i, str);
            } else if (i2 == 4) {
                byte[] bArr = xo4Var.u[i];
                bArr.getClass();
                vo4Var.x(i, bArr);
            } else if (i2 == 5) {
                vo4Var.e(i);
            }
        }
    }

    @Override // retrofit2.Callback
    public void onFailure(Call call, Throwable th) {
        switch (this.n) {
            case 9:
                Log.e("PodcastEpisodeBottomSheetViewModel", "deletePodcastEpisode network error", th);
                break;
            case 10:
                Log.e("QueueRepository", "syncBookmarks failed", th);
                new Handler(Looper.getMainLooper()).post((zo1) this.o);
                break;
            case 11:
                ((gu3) this.o).g.k("Network error: " + th.getMessage());
                break;
            case 19:
                Log.e("SongRepository", "fetchSingleTrackThenSimilar.onFailure()", th);
                break;
            default:
                Exception exc = new Exception(th.getMessage());
                boolean z = th instanceof IOException;
                SystemCallback systemCallback = (SystemCallback) this.o;
                if (!z) {
                    systemCallback.onError(exc);
                } else {
                    systemCallback.onNetworkFailure(exc);
                }
                break;
        }
    }

    @Override // defpackage.av4
    public boolean onMenuItemClick(MenuItem menuItem) {
        return ((cv4) this.o).e.onMenuItemSelected(0, menuItem);
    }

    @Override // com.eddyizm.tempus.interfaces.DialogClickCallback
    public void onNegativeClick() {
        vb4 vb4Var = (vb4) this.o;
        vb4Var.h0("download_storage").w(R.string.download_storage_internal_dialog_negative_button);
        vb4Var.m0();
    }

    @Override // com.eddyizm.tempus.interfaces.DialogClickCallback
    public void onNeutralClick() {
        vb4 vb4Var = (vb4) this.o;
        vb4Var.h0("download_storage").w(R.string.download_storage_directory_dialog_neutral_button);
        vb4Var.m0();
    }

    @Override // com.eddyizm.tempus.interfaces.DialogClickCallback
    public void onPositiveClick() {
        vb4 vb4Var = (vb4) this.o;
        vb4Var.h0("download_storage").w(R.string.download_storage_external_dialog_positive_button);
        vb4Var.m0();
    }

    @Override // retrofit2.Callback
    public void onResponse(Call call, Response response) {
        Child song;
        switch (this.n) {
            case 9:
                if (!response.isSuccessful() || response.body() == null || ((ApiResponse) response.body()).getSubsonicResponse() == null || !"ok".equals(((ApiResponse) response.body()).getSubsonicResponse().getStatus())) {
                    Log.e("PodcastEpisodeBottomSheetViewModel", "deletePodcastEpisode failed with code: " + response.code());
                } else {
                    Application application = ((gn3) this.o).b;
                    application.getClass();
                    Toast.makeText(application, "Podcast episode deleted", 0).show();
                }
                break;
            case 10:
                zo1 zo1Var = (zo1) this.o;
                if (response.isSuccessful() && response.body() != null && ((ApiResponse) response.body()).getSubsonicResponse() != null) {
                    List<Bookmark> bookmarks = ((ApiResponse) response.body()).getSubsonicResponse().getBookmarks() != null ? ((ApiResponse) response.body()).getSubsonicResponse().getBookmarks().getBookmarks() : null;
                    if (bookmarks != null) {
                        HashMap map = new HashMap();
                        for (Bookmark bookmark : bookmarks) {
                            Child entry = bookmark.getEntry();
                            if (entry != null && entry.getId() != null && bookmark.getPosition() > 0) {
                                map.put(entry.getId(), new sp3(entry.getId(), bookmark.getPosition(), entry.getTitle(), entry.getAlbum(), entry.getArtist(), entry.getAlbumId(), entry.getCoverArtId(), entry.getType(), bookmark.getChanged() != null ? bookmark.getChanged().getTime() : System.currentTimeMillis()));
                            }
                        }
                        if (!map.isEmpty()) {
                            Map mapA = ud3.A();
                            for (Map.Entry entry2 : map.entrySet()) {
                                String str = (String) entry2.getKey();
                                sp3 sp3Var = (sp3) entry2.getValue();
                                sp3 sp3Var2 = (sp3) mapA.get(str);
                                if (sp3Var2 == null || sp3Var.i >= sp3Var2.i) {
                                    mapA.put(str, sp3Var);
                                }
                            }
                            ud3.N0(mapA);
                        }
                    }
                }
                new Handler(Looper.getMainLooper()).post(zo1Var);
                break;
            case 11:
                gu3 gu3Var = (gu3) this.o;
                if (!response.isSuccessful() || response.body() == null) {
                    gu3Var.g.k("HTTP error: " + response.code());
                } else {
                    ApiResponse apiResponse = (ApiResponse) response.body();
                    if (apiResponse.getSubsonicResponse() != null) {
                        String status = apiResponse.getSubsonicResponse().getStatus();
                        if ("ok".equals(status)) {
                            gu3Var.f.k(Boolean.TRUE);
                        } else if ("failed".equals(status)) {
                            gu3.c(gu3Var, apiResponse);
                        }
                    }
                }
                break;
            case 19:
                if (response.isSuccessful() && response.body() != null && (song = ((ApiResponse) response.body()).getSubsonicResponse().getSong()) != null) {
                    ((wi4) this.o).a(Collections.singletonList(song));
                    break;
                }
                break;
            default:
                SystemCallback systemCallback = (SystemCallback) this.o;
                if (response.body() == null) {
                    systemCallback.onError(new Exception(String.valueOf(response.code())));
                } else if (((ApiResponse) response.body()).getSubsonicResponse().getStatus().equals(ResponseStatus.FAILED)) {
                    Error error = ((ApiResponse) response.body()).getSubsonicResponse().getError();
                    systemCallback.onError(new Exception(error != null ? error.getCode() + " - " + error.getMessage() : "Unknown server error"));
                } else if (((ApiResponse) response.body()).getSubsonicResponse().getStatus().equals(ResponseStatus.OK)) {
                    systemCallback.onSuccess(response.raw().n.a.h("p"), response.raw().n.a.h("t"), response.raw().n.a.h("s"));
                } else {
                    systemCallback.onError(new Exception("Empty response"));
                }
                break;
        }
    }

    @Override // defpackage.lm3
    public void onSuccess() {
        ((wl3) this.o).h.i(Integer.valueOf(R.string.playlist_editor_dialog_action_save_success));
    }

    @Override // defpackage.cq0
    public boolean p(float f) {
        if (f == 0.0f) {
            return false;
        }
        t();
        ((NestedScrollView) this.o).j((int) f);
        return true;
    }

    @Override // defpackage.u55
    public View q(int i) {
        return ((mw3) this.o).u(i);
    }

    @Override // defpackage.u55
    public int r(View view) {
        return mw3.y(view) + ((ViewGroup.MarginLayoutParams) ((nw3) view.getLayoutParams())).bottomMargin;
    }

    @Override // defpackage.cq0
    public float s() {
        return -((NestedScrollView) this.o).getVerticalScrollFactorCompat();
    }

    @Override // defpackage.cq0
    public void t() {
        ((NestedScrollView) this.o).q.abortAnimation();
    }

    public /* synthetic */ rm2(int i, boolean z) {
        this.n = i;
    }

    public rm2(oo0 oo0Var) {
        this.n = 20;
        float f = xj4.a;
        yx0 yx0Var = new yx0();
        yx0Var.a = f;
        float fG = oo0Var.g();
        float f2 = a81.a;
        yx0Var.b = fG * 386.0878f * 160.0f * 0.84f;
        this.o = yx0Var;
    }

    public rm2(long[] jArr) {
        l03 l03Var;
        this.n = 18;
        if (jArr != null) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
            l03Var = new l03(jArrCopyOf.length);
            int i = l03Var.b;
            if (i >= 0) {
                if (jArrCopyOf.length != 0) {
                    int length = jArrCopyOf.length + i;
                    long[] jArr2 = l03Var.a;
                    if (jArr2.length < length) {
                        l03Var.a = Arrays.copyOf(jArr2, Math.max(length, (jArr2.length * 3) / 2));
                    }
                    long[] jArr3 = l03Var.a;
                    int i2 = l03Var.b;
                    if (i != i2) {
                        ti.a0(jArr3, jArr3, jArrCopyOf.length + i, i, i2);
                    }
                    ti.a0(jArrCopyOf, jArr3, i, 0, jArrCopyOf.length);
                    l03Var.b += jArrCopyOf.length;
                }
            } else {
                kf2.h("");
                throw null;
            }
        } else {
            l03Var = new l03();
        }
        this.o = l03Var;
    }

    public /* synthetic */ rm2(int i, Object obj) {
        this.n = i;
        this.o = obj;
    }

    public rm2(Notification notification) {
        this.n = 1;
        notification.getClass();
        this.o = notification;
    }

    public rm2(ye5 ye5Var) {
        this.n = 24;
        this.o = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), ye5Var);
    }

    public rm2(ce ceVar, float f) {
        this.n = 27;
        int iB = ceVar.b();
        d81[] d81VarArr = new d81[iB];
        for (int i = 0; i < iB; i++) {
            d81VarArr[i] = new d81(f, ceVar.a(i));
        }
        this.o = d81VarArr;
    }
}
