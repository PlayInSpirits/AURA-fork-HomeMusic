package defpackage;

import android.app.Application;
import android.content.ClipDescription;
import android.content.ComponentName;
import android.media.browse.MediaBrowser;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.profileinstaller.ProfileInstallReceiver;
import androidx.recyclerview.widget.RecyclerView;
import app.homemusic.R;
import com.eddyizm.tempus.database.AppDatabase;
import com.eddyizm.tempus.subsonic.base.ApiResponse;
import com.eddyizm.tempus.subsonic.models.Playlist;
import com.eddyizm.tempus.ui.fragment.SettingsFragment;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class om1 implements ca4, bi0, zy3, ka5, kg1, lm3, Callback, sq3, s21, ep3, u74, sn4, b5 {
    public final /* synthetic */ int n;
    public Object o;

    public om1(int i, byte b) {
        this.n = i;
        switch (i) {
            case 5:
                this.o = AppDatabase.y().A();
                break;
            case 12:
                this.o = new HashMap();
                break;
            case 27:
                this.o = new om0(1);
                break;
            default:
                this.o = uc5.B(Boolean.FALSE);
                break;
        }
    }

    private final void i(Call call, Throwable th) {
    }

    @Override // defpackage.s21
    public cv3 a() throws Throwable {
        gv3 gv3Var = (gv3) this.o;
        IOException iOException = null;
        while (!gv3Var.x.m()) {
            try {
                q34 q34VarW = gv3Var.w();
                if (!q34VarW.c()) {
                    p34 p34VarF = q34VarW.f();
                    if (p34VarF.b == null && p34VarF.c == null) {
                        p34VarF = q34VarW.g();
                    }
                    q34 q34Var = p34VarF.b;
                    Throwable th = p34VarF.c;
                    if (th != null) {
                        throw th;
                    }
                    if (q34Var != null) {
                        gv3Var.B.addFirst(q34Var);
                    }
                }
                return q34VarW.e();
            } catch (IOException e) {
                if (iOException == null) {
                    iOException = e;
                } else {
                    j51.d(iOException, e);
                }
                if (!gv3Var.m(null)) {
                    throw iOException;
                }
            }
        }
        mj0.i("Canceled");
        return null;
    }

    @Override // defpackage.zy3
    public void accept(Object obj, Object obj2) {
        qh1 qh1Var = (qh1) this.o;
        w02 w02Var = new w02((cr4) obj2);
        av1 av1Var = (av1) ((cv1) ((p14) obj).e());
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService");
        int i = yh5.a;
        parcelObtain.writeInt(1);
        qh1Var.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(w02Var);
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            av1Var.e.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain.recycle();
            parcelObtain2.recycle();
        }
    }

    @Override // defpackage.sq3
    public void c() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // defpackage.s21
    public r34 d() {
        return (gv3) this.o;
    }

    @Override // defpackage.sq3
    public void e(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.o).setResultCode(i);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public void f(e10 e10Var, wd0 wd0Var) {
        z73 z73Var;
        if (wd0Var instanceof z73) {
            z73Var = (z73) wd0Var;
            int i = z73Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                z73Var.p = i - Integer.MIN_VALUE;
            } else {
                z73Var = new z73(this, wd0Var);
            }
        } else {
            z73Var = new z73(this, wd0Var);
        }
        Object obj = z73Var.n;
        int i2 = z73Var.p;
        if (i2 == 0) {
            kb4.X(obj);
            nl4 nl4Var = (nl4) this.o;
            z73Var.p = 1;
            nl4Var.a(e10Var, z73Var);
            return;
        }
        if (i2 != 1) {
            kf2.o("call to 'resume' before 'invoke' with coroutine");
        } else {
            kb4.X(obj);
            er1.a();
        }
    }

    @Override // defpackage.lm3
    public void g() {
        sl3 sl3Var = (sl3) this.o;
        if (!sl3Var.y() || sl3Var.n() == null) {
            return;
        }
        sl3Var.X().runOnUiThread(new ql3(this, 0));
    }

    @Override // defpackage.kg1
    public void h(Object obj) {
        String str;
        bj2 bj2Var = (bj2) obj;
        li3 li3Var = (li3) this.o;
        boolean z = false;
        int i = 1;
        if (((bj2) bo2.a.get()) == bj2Var) {
            str = bj2Var.a() != null ? bj2Var.a().a : null;
            if (bj2Var.g() == 3 && bj2Var.q()) {
                z = true;
            }
            li3Var.c(str, z);
            return;
        }
        bj2Var.v(new j52(i, this));
        str = bj2Var.a() != null ? bj2Var.a().a : null;
        if (bj2Var.g() == 3 && bj2Var.q()) {
            z = true;
        }
        li3Var.c(str, z);
        bo2.a = new WeakReference(bj2Var);
    }

    @Override // defpackage.ca4
    public void j(da4 da4Var) {
        pm1 pm1Var = (pm1) this.o;
        pm1Var.D.j(pm1Var);
    }

    public void k() {
        pm1 pm1Var = (pm1) this.o;
        int i = pm1Var.E - 1;
        pm1Var.E = i;
        if (i > 0) {
            return;
        }
        int i2 = 0;
        for (ln1 ln1Var : pm1Var.G) {
            ln1Var.v();
            i2 += ln1Var.V.a;
        }
        sv4[] sv4VarArr = new sv4[i2];
        int i3 = 0;
        for (ln1 ln1Var2 : pm1Var.G) {
            ln1Var2.v();
            int i4 = ln1Var2.V.a;
            int i5 = 0;
            while (i5 < i4) {
                ln1Var2.v();
                sv4VarArr[i3] = ln1Var2.V.a(i5);
                i5++;
                i3++;
            }
        }
        pm1Var.F = new tv4(sv4VarArr);
        pm1Var.D.b(pm1Var);
    }

    public void l(Object obj) {
        MediaBrowserService.Result result = (MediaBrowserService.Result) this.o;
        if (!(obj instanceof List)) {
            if (!(obj instanceof Parcel)) {
                result.sendResult(null);
                return;
            }
            Parcel parcel = (Parcel) obj;
            parcel.setDataPosition(0);
            result.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
            parcel.recycle();
            return;
        }
        List<Parcel> list = (List) obj;
        ArrayList arrayList = new ArrayList(list.size());
        for (Parcel parcel2 : list) {
            parcel2.setDataPosition(0);
            arrayList.add((MediaBrowser.MediaItem) MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel2));
            parcel2.recycle();
        }
        result.sendResult(arrayList);
    }

    @Override // defpackage.bi0
    public ci0 m() {
        return new j6(((bl0) this.o).m());
    }

    public void n(df dfVar, MaterialToolbar materialToolbar) {
        DrawerLayout drawerLayout = (DrawerLayout) ((ss0) this.o).p;
        if (dfVar.getResources().getConfiguration().orientation == 2) {
            k4 k4Var = new k4(dfVar, drawerLayout, materialToolbar);
            drawerLayout.a(k4Var);
            k4Var.e();
        }
    }

    @Override // defpackage.kg1
    public void o(Throwable th) {
        Log.e("MediaManager", "Failed to get MediaBrowser instance", th);
    }

    @Override // retrofit2.Callback
    public void onFailure(Call call, Throwable th) {
        w12 w12Var;
        switch (this.n) {
            case 18:
                break;
            case 19:
                ((xm3) this.o).c("Network error: " + th.getMessage());
                Log.e("PodcastChannelEditorViewModel", "Network error", th);
                break;
            case 20:
            default:
                ((nb4) this.o).onError(new Exception(th.getMessage()));
                break;
            case 21:
                eu3 eu3Var = (eu3) this.o;
                if (eu3Var.y() && (w12Var = eu3Var.J0) != null) {
                    ((ProgressBar) w12Var.h).setVisibility(8);
                    ((TextView) eu3Var.J0.d).setVisibility(0);
                    Toast.makeText(eu3Var.Z(), eu3Var.t(R.string.radio_search_error, th.getMessage()), 0).show();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.u74
    public boolean onQueryTextChange(String str) {
        vb4 vb4Var = (vb4) ((SettingsFragment) this.o).m().C(R.id.settings_container);
        if (vb4Var == null) {
            return true;
        }
        vb4Var.D0 = g12.I(str).trim();
        vb4Var.l0();
        return true;
    }

    @Override // defpackage.u74
    public boolean onQueryTextSubmit(String str) {
        vb4 vb4Var = (vb4) ((SettingsFragment) this.o).m().C(R.id.settings_container);
        if (vb4Var == null) {
            return true;
        }
        vb4Var.D0 = g12.I(str).trim();
        vb4Var.l0();
        return true;
    }

    @Override // retrofit2.Callback
    public void onResponse(Call call, Response response) {
        w12 w12Var;
        switch (this.n) {
            case 18:
                if (response.isSuccessful() && response.body() != null && ((ApiResponse) response.body()).getSubsonicResponse().getPlaylists() != null) {
                    List<Playlist> playlists = ((ApiResponse) response.body()).getSubsonicResponse().getPlaylists().getPlaylists();
                    if (playlists == null) {
                        playlists = new ArrayList<>();
                    }
                    mm3.h.i(playlists);
                    new Thread(new ur2(11, (mm3) this.o, playlists)).start();
                    break;
                }
                break;
            case 19:
                xm3 xm3Var = (xm3) this.o;
                if (response.code() == 501) {
                    Application application = xm3Var.b;
                    application.getClass();
                    xm3Var.c(application.getString(R.string.podcast_channel_not_supported_snackbar));
                } else if (!response.isSuccessful() || response.body() == null) {
                    xm3Var.getClass();
                    String str = "HTTP error: " + response.code();
                    if (response.errorBody() != null) {
                        try {
                            String strString = response.errorBody().string();
                            if (!strString.isEmpty()) {
                                str = str + " - " + strString;
                            }
                        } catch (IOException e) {
                            Log.e("PodcastChannelEditorViewModel", "Error reading error body", e);
                        }
                    }
                    xm3Var.c(str);
                } else if ("ok".equals(((ApiResponse) response.body()).getSubsonicResponse().getStatus())) {
                    xm3Var.d.k(Boolean.TRUE);
                }
                break;
            case 20:
            default:
                nb4 nb4Var = (nb4) this.o;
                if (response.isSuccessful() && response.body() != null && ((ApiResponse) response.body()).getSubsonicResponse() != null) {
                    if (((ApiResponse) response.body()).getSubsonicResponse().getError() != null) {
                        nb4Var.onError(new Exception(((ApiResponse) response.body()).getSubsonicResponse().getError().getMessage()));
                    } else if (((ApiResponse) response.body()).getSubsonicResponse().getScanStatus() != null) {
                        nb4Var.onSuccess(((ApiResponse) response.body()).getSubsonicResponse().getScanStatus().isScanning(), ((ApiResponse) response.body()).getSubsonicResponse().getScanStatus().getCount().longValue());
                    }
                    break;
                }
                break;
            case 21:
                eu3 eu3Var = (eu3) this.o;
                if (eu3Var.y() && (w12Var = eu3Var.J0) != null) {
                    ((ProgressBar) w12Var.h).setVisibility(8);
                    if (!response.isSuccessful() || response.body() == null || ((List) response.body()).isEmpty()) {
                        zd0 zd0Var = eu3Var.L0;
                        zd0Var.r = Collections.EMPTY_LIST;
                        zd0Var.d();
                        ((RecyclerView) eu3Var.J0.i).setVisibility(8);
                        ((TextView) eu3Var.J0.d).setVisibility(0);
                    } else {
                        zd0 zd0Var2 = eu3Var.L0;
                        zd0Var2.r = (List) response.body();
                        zd0Var2.d();
                        ((RecyclerView) eu3Var.J0.i).setVisibility(0);
                        ((TextView) eu3Var.J0.d).setVisibility(8);
                    }
                    break;
                }
                break;
        }
    }

    @Override // defpackage.lm3
    public void onSuccess() {
        sl3 sl3Var = (sl3) this.o;
        if (!sl3Var.y() || sl3Var.n() == null) {
            return;
        }
        sl3Var.X().runOnUiThread(new ql3(this, 1));
    }

    public void p(boolean z) {
        ss0 ss0Var = (ss0) this.o;
        int i = z ? 0 : 8;
        ((BottomNavigationView) ss0Var.n).setVisibility(i);
        ((FrameLayout) ss0Var.o).setVisibility(i);
    }

    public void q(df dfVar, boolean z) {
        su3 rb5Var;
        Window window = dfVar.getWindow();
        om1 om1Var = new om1(window.getDecorView());
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            rb5Var = new tb5(window, om1Var);
        } else if (i >= 30) {
            rb5Var = new sb5(window, om1Var);
        } else {
            rb5Var = i >= 26 ? new rb5(window, om1Var) : new qb5(window, om1Var);
        }
        if (z) {
            rb5Var.F(2);
            rb5Var.F(1);
            rb5Var.E(1);
        } else {
            rb5Var.x(2);
            rb5Var.x(1);
            rb5Var.E(2);
        }
    }

    @Override // defpackage.ep3
    public CharSequence r(Preference preference) {
        long j;
        CharSequence charSequenceF = ((ListPreference) preference).F();
        if (charSequenceF == null) {
            return null;
        }
        nc1 nc1VarX = ((vb4) this.o).X();
        synchronized (au0.class) {
            se4 se4VarB = au0.B(nc1VarX);
            synchronized (se4VarB) {
                j = se4VarB.i;
            }
        }
        return ((vb4) this.o).t(R.string.settings_summary_streaming_cache_size, charSequenceF, String.valueOf(j / 1048576));
    }

    public String toString() {
        switch (this.n) {
            case 10:
                return "ProviderMetadata{ componentName=" + ((ComponentName) this.o).flattenToShortString() + " }";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ om1(int i, Object obj) {
        this.n = i;
        this.o = obj;
    }

    public /* synthetic */ om1(char c, int i) {
        this.n = i;
    }

    public om1(View view) {
        this.n = 26;
        if (Build.VERSION.SDK_INT >= 30) {
            yh4 yh4Var = new yh4(view);
            yh4Var.b = view;
            this.o = yh4Var;
            return;
        }
        this.o = new sg3(view);
    }

    public om1(WindowInsetsController windowInsetsController) {
        this.n = 26;
        yh4 yh4Var = new yh4(null);
        yh4Var.c = windowInsetsController;
        this.o = yh4Var;
    }

    public om1(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.n = 2;
        if (Build.VERSION.SDK_INT >= 25) {
            this.o = new mz1(uri, clipDescription, uri2);
        } else {
            this.o = new c12(uri, clipDescription, uri2, 6);
        }
    }

    public om1(int i) {
        this.n = 14;
        this.o = ya4.a(new int[i]);
    }
}
