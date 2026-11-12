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
import java.util.Iterator;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class om1 implements ca4, bi0, zy3, ka5, kg1, lm3, Callback, sq3, s21, ep3, u74, sn4, b5 {
    public final /* synthetic */ int n;
    public Object o;

    public om1(int r1, byte r2) {
        this.n = r1;
        switch(r1) {
            case 5: goto L10;
            case 12: goto L8;
            case 27: goto L6;
            default: goto L4;
        };
    L4:
        this.o = uc5.B(Boolean.FALSE);
        return;
    L6:
        this.o = new om0(1);
        return;
    L8:
        this.o = new HashMap();
        return;
    L10:
        this.o = AppDatabase.y().A();
    }

    private final void i(Call r1, Throwable r2) {
    }

    @Override // defpackage.s21
    public cv3 a() {
        gv3 r5 = (gv3) this.o;
        IOException r1 = null;
    L4:
        if (r5.x.m() == true) goto L31;
        q34 r2 = r5.w();     // Catch: IOException -> L15
        if (r2.c() == true) goto L23;
        p34 r3 = r2.f();     // Catch: IOException -> L15
        if (r3.b == null) goto L10;
    L12:
        boolean r4 = false;
    L13:
        if (r4 == false) goto L17;
        r3 = r2.g();     // Catch: IOException -> L15
    L17:
        q34 r6 = r3.b;     // Catch: IOException -> L15
        Throwable r7 = r3.c;     // Catch: IOException -> L15
        if (r7 != null) goto L21;
        if (r6 == null) goto L23;
        r5.B.addFirst(r6);     // Catch: IOException -> L15
        goto L4
    L21:
        throw r7;     // Catch: IOException -> L15
    L10:
        if (r3.c != null) goto L12;
        r4 = true;
    L23:
        return r2.e();
    L15:
        e = move-exception;
        if (r1 != null) goto L26;
        r1 = e;
    L28:
        if (r5.m(null) == true) goto L4;
        throw r1;
    L26:
        j51.d(r1, e);
        goto L28
    L31:
        mj0.i("Canceled");
        return null;
    }

    @Override // defpackage.zy3
    public void accept(Object r3, Object r4) {
        qh1 r2 = (qh1) this.o;
        w02 r0 = new w02((cr4) r4);
        av1 r5 = (av1) ((cv1) ((p14) r3).e());
        Parcel r6 = Parcel.obtain();
        r6.writeInterfaceToken("com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService");
        int r1 = yh5.a;
        r6.writeInt(1);
        r2.writeToParcel(r6, 0);
        r6.writeStrongBinder(r0);
        Parcel r7 = Parcel.obtain();
        r5.e.transact(2, r6, r7, 0);     // Catch: Throwable -> L6
        r7.readException();     // Catch: Throwable -> L6
        r6.recycle();
        r7.recycle();
        return;
    L6:
        th = move-exception;
        r6.recycle();
        r7.recycle();
        throw th;
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
    public void e(int r4, Object r5) {
        switch(r4) {
            case 1: goto L13;
            case 2: goto L12;
            case 3: goto L11;
            case 4: goto L10;
            case 5: goto L9;
            case 6: goto L8;
            case 7: goto L7;
            case 8: goto L6;
            case 9: goto L3;
            case 10: goto L5;
            case 11: goto L4;
            default: goto L3;
        };
    L3:
        String r0 = "";
    L15:
        if (r4 != 6) goto L17;
    L21:
        Log.e("ProfileInstaller", r0, (Throwable) r5);
    L22:
        ((ProfileInstallReceiver) this.o).setResultCode(r4);
        return;
    L17:
        if (r4 == 7) goto L21;
        if (r4 == 8) goto L21;
        Log.d("ProfileInstaller", r0);
        goto L22
    L4:
        r0 = "RESULT_DELETE_SKIP_FILE_SUCCESS";
        goto L15
    L5:
        r0 = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
        goto L15
    L6:
        r0 = "RESULT_PARSE_EXCEPTION";
        goto L15
    L7:
        r0 = "RESULT_IO_EXCEPTION";
        goto L15
    L8:
        r0 = "RESULT_BASELINE_PROFILE_NOT_FOUND";
        goto L15
    L9:
        r0 = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
        goto L15
    L10:
        r0 = "RESULT_NOT_WRITABLE";
        goto L15
    L11:
        r0 = "RESULT_UNSUPPORTED_ART_VERSION";
        goto L15
    L12:
        r0 = "RESULT_ALREADY_INSTALLED";
        goto L15
    L13:
        r0 = "RESULT_INSTALL_SUCCESS";
        goto L15
    }

    public void f(e10 r5, wd0 r6) {
        if ((r6 instanceof z73) == false) goto L7;
        z73 r0 = (z73) r6;
        int r1 = r0.p;
        if ((r1 & Integer.MIN_VALUE) == 0) goto L7;
        r0.p = r1 - Integer.MIN_VALUE;
    L8:
        Object r7 = r0.n;
        int r2 = r0.p;
        if (r2 == 0) goto L15;
        if (r2 == 1) goto L13;
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return;
    L13:
        kb4.X(r7);
        er1.a();
        return;
    L15:
        kb4.X(r7);
        nl4 r4 = (nl4) this.o;
        r0.p = 1;
        r4.a(r5, r0);
        return;
    L7:
        r0 = new z73(this, r6);
        goto L8
    }

    @Override // defpackage.lm3
    public void g() {
        sl3 r0 = (sl3) this.o;
        if (r0.y() == true) goto L5;
        return;
    L5:
        if (r0.n() == null) goto L9;
        r0.X().runOnUiThread(new ql3(this, 0));
        return;
    }

    @Override // defpackage.kg1
    public void h(Object r7) {
        bj2 r8 = (bj2) r7;
        li3 r0 = (li3) this.o;
        boolean r2 = false;
        int r3 = 1;
        String r5 = null;
        if (((bj2) bo2.a.get()) == r8) goto L15;
        r8.v(new j52(r3, this));
        if (r8.a() == null) goto L8;
        r5 = r8.a().a;
    L8:
        if (r8.g() == 3) goto L10;
    L12:
        r0.c(r5, r2);
        bo2.a = new WeakReference(r8);
        return;
    L10:
        if (r8.q() == false) goto L12;
        r2 = true;
        goto L12
    L15:
        if (r8.a() == null) goto L18;
        r5 = r8.a().a;
    L18:
        if (r8.g() == 3) goto L20;
    L22:
        r0.c(r5, r2);
        return;
    L20:
        if (r8.q() == false) goto L22;
        r2 = true;
        goto L22
    }

    @Override // defpackage.ca4
    public void j(da4 r1) {
        pm1 r0 = (pm1) this.o;
        r0.D.j(r0);
    }

    public void k() {
        pm1 r11 = (pm1) this.o;
        int r0 = r11.E - 1;
        r11.E = r0;
        if (r0 <= 0) goto L5;
        return;
    L5:
        ln1[] r1 = r11.G;
        int r2 = r1.length;
        int r3 = 0;
        int r4 = 0;
    L6:
        if (r3 >= r2) goto L8;
        ln1 r5 = r1[r3];
        r5.v();
        r4 = r4 + r5.V.a;
        r3 = r3 + 1;
        goto L6
    L8:
        sv4[] r6 = new sv4[r4];
        ln1[] r7 = r11.G;
        int r8 = r7.length;
        int r9 = 0;
        int r10 = 0;
    L9:
        if (r9 >= r8) goto L14;
        ln1 r12 = r7[r9];
        r12.v();
        int r13 = r12.V.a;
        int r14 = 0;
    L11:
        if (r14 >= r13) goto L13;
        r12.v();
        r6[r10] = r12.V.a(r14);
        r14 = r14 + 1;
        r10 = r10 + 1;
        goto L11
    L13:
        r9 = r9 + 1;
        goto L9
    L14:
        r11.F = new tv4(r6);
        r11.D.b(r11);
    }

    public void l(Object r5) {
        MediaBrowserService.Result r4 = (MediaBrowserService.Result) this.o;
        if ((r5 instanceof List) == false) goto L11;
        List r6 = (List) r5;
        ArrayList r0 = new ArrayList(r6.size());
        Iterator r7 = r6.iterator();
    L6:
        if (r7.hasNext() == false) goto L8;
        Parcel r2 = (Parcel) r7.next();
        r2.setDataPosition(0);
        r0.add((MediaBrowser.MediaItem) MediaBrowser.MediaItem.CREATOR.createFromParcel(r2));
        r2.recycle();
        goto L6
    L8:
        r4.sendResult(r0);
        return;
    L11:
        if ((r5 instanceof Parcel) == false) goto L14;
        Parcel r8 = (Parcel) r5;
        r8.setDataPosition(0);
        r4.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(r8));
        r8.recycle();
        return;
    L14:
        r4.sendResult(null);
    }

    @Override // defpackage.bi0
    public ci0 m() {
        return new j6(((bl0) this.o).m());
    }

    public void n(df r3, MaterialToolbar r4) {
        DrawerLayout r2 = (DrawerLayout) ((ss0) this.o).p;
        if (r3.getResources().getConfiguration().orientation != 2) goto L6;
        k4 r0 = new k4(r3, r2, r4);
        r2.a(r0);
        r0.e();
        return;
    }

    @Override // defpackage.kg1
    public void o(Throwable r2) {
        Log.e("MediaManager", "Failed to get MediaBrowser instance", r2);
    }

    @Override // retrofit2.Callback
    public void onFailure(Call r3, Throwable r4) {
        switch(this.n) {
            case 18: goto L17;
            case 19: goto L13;
            case 20: goto L4;
            case 21: goto L6;
            default: goto L4;
        };
    L4:
        ((nb4) this.o).onError(new Exception(r4.getMessage()));
        return;
    L6:
        eu3 r2 = (eu3) this.o;
        if (r2.y() == false) goto L15;
        w12 r5 = r2.J0;
        if (r5 == null) goto L16;
        ((ProgressBar) r5.h).setVisibility(8);
        ((TextView) r2.J0.d).setVisibility(0);
        Toast.makeText(r2.Z(), r2.t(R.string.radio_search_error, new Object[]{r4.getMessage()}), 0).show();
        return;
    L16:
        return;
    L15:
        return;
    L13:
        ((xm3) this.o).c("Network error: " + r4.getMessage());
        Log.e("PodcastChannelEditorViewModel", "Network error", r4);
        return;
    }

    @Override // defpackage.u74
    public boolean onQueryTextChange(String r2) {
        vb4 r1 = (vb4) ((SettingsFragment) this.o).m().C(R.id.settings_container);
        if (r1 == null) goto L7;
        r1.D0 = g12.I(r2).trim();
        r1.l0();
        return true;
    L7:
        return true;
    }

    @Override // defpackage.u74
    public boolean onQueryTextSubmit(String r2) {
        vb4 r1 = (vb4) ((SettingsFragment) this.o).m().C(R.id.settings_container);
        if (r1 == null) goto L7;
        r1.D0 = g12.I(r2).trim();
        r1.l0();
        return true;
    L7:
        return true;
    }

    @Override // retrofit2.Callback
    public void onResponse(Call r3, Response r4) {
        switch(this.n) {
            case 18: goto L52;
            case 19: goto L31;
            case 20: goto L4;
            case 21: goto L17;
            default: goto L4;
        };
    L4:
        nb4 r2 = (nb4) this.o;
        if (r4.isSuccessful() == true) goto L7;
        return;
    L7:
        if (r4.body() != null) goto L9;
        return;
    L9:
        if (((ApiResponse) r4.body()).getSubsonicResponse() != null) goto L11;
        return;
    L11:
        if (((ApiResponse) r4.body()).getSubsonicResponse().getError() == null) goto L14;
        r2.onError(new Exception(((ApiResponse) r4.body()).getSubsonicResponse().getError().getMessage()));
        return;
    L14:
        if (((ApiResponse) r4.body()).getSubsonicResponse().getScanStatus() == null) goto L68;
        r2.onSuccess(((ApiResponse) r4.body()).getSubsonicResponse().getScanStatus().isScanning(), ((ApiResponse) r4.body()).getSubsonicResponse().getScanStatus().getCount().longValue());
        return;
    L68:
        return;
    L17:
        eu3 r5 = (eu3) this.o;
        if (r5.y() == false) goto L69;
        w12 r6 = r5.J0;
        if (r6 == null) goto L71;
        ((ProgressBar) r6.h).setVisibility(8);
        if (r4.isSuccessful() == true) goto L25;
    L29:
        zd0 r7 = r5.L0;
        r7.r = Collections.EMPTY_LIST;
        r7.d();
        ((RecyclerView) r5.J0.i).setVisibility(8);
        ((TextView) r5.J0.d).setVisibility(0);
        return;
    L25:
        if (r4.body() == null) goto L29;
        if (((List) r4.body()).isEmpty() == true) goto L29;
        zd0 r8 = r5.L0;
        r8.r = (List) r4.body();
        r8.d();
        ((RecyclerView) r5.J0.i).setVisibility(0);
        ((TextView) r5.J0.d).setVisibility(8);
        return;
    L71:
        return;
    L69:
        return;
    L31:
        xm3 r9 = (xm3) this.o;
        if (r4.code() != 501) goto L35;
        Application r10 = r9.b;
        r10.getClass();
        r9.c(r10.getString(R.string.podcast_channel_not_supported_snackbar));
        return;
    L35:
        if (r4.isSuccessful() == true) goto L37;
    L41:
        r9.getClass();
        String r11 = "HTTP error: " + r4.code();
        if (r4.errorBody() != null) goto L62;
    L49:
        r9.c(r11);
        return;
    L62:
        String r12 = r4.errorBody().string();     // Catch: IOException -> L47
        if (r12.isEmpty() == true) goto L49;
        r11 = r11 + " - " + r12;     // Catch: IOException -> L47
    L47:
        e = move-exception;
        Log.e("PodcastChannelEditorViewModel", "Error reading error body", e);
        goto L49
    L37:
        if (r4.body() == null) goto L41;
        if ("ok".equals(((ApiResponse) r4.body()).getSubsonicResponse().getStatus()) == false) goto L73;
        r9.d.k(Boolean.TRUE);
        return;
    L73:
        return;
    L52:
        if (r4.isSuccessful() == true) goto L54;
        return;
    L54:
        if (r4.body() != null) goto L56;
        return;
    L56:
        if (((ApiResponse) r4.body()).getSubsonicResponse().getPlaylists() == null) goto L77;
        List<Playlist> r13 = ((ApiResponse) r4.body()).getSubsonicResponse().getPlaylists().getPlaylists();
        if (r13 != null) goto L60;
        r13 = new ArrayList();
    L60:
        mm3.h.i(r13);
        new Thread(new ur2(11, (mm3) this.o, r13)).start();
        return;
    }

    @Override // defpackage.lm3
    public void onSuccess() {
        sl3 r0 = (sl3) this.o;
        if (r0.y() == true) goto L5;
        return;
    L5:
        if (r0.n() == null) goto L9;
        r0.X().runOnUiThread(new ql3(this, 1));
        return;
    }

    public void p(boolean r2) {
        ss0 r1 = (ss0) this.o;
        if (r2 == false) goto L5;
        int r3 = 0;
    L6:
        ((BottomNavigationView) r1.n).setVisibility(r3);
        ((FrameLayout) r1.o).setVisibility(r3);
        return;
    L5:
        r3 = 8;
        goto L6
    }

    public void q(df r3, boolean r4) {
        Window r2 = r3.getWindow();
        om1 r0 = new om1(r2.getDecorView());
        int r5 = Build.VERSION.SDK_INT;
        if (r5 < 35) goto L6;
        su3 r6 = new tb5(r2, r0);
    L13:
        if (r4 == false) goto L16;
        r6.F(2);
        r6.F(1);
        r6.E(1);
        return;
    L16:
        r6.x(2);
        r6.x(1);
        r6.E(2);
        return;
    L6:
        if (r5 < 30) goto L9;
        r6 = new sb5(r2, r0);
        goto L13
    L9:
        if (r5 < 26) goto L11;
        r6 = new rb5(r2, r0);
        goto L13
    L11:
        r6 = new qb5(r2, r0);
        goto L13
    }

    @Override // defpackage.ep3
    public CharSequence r(Preference r5) {
        CharSequence r6 = ((ListPreference) r5).F();
        if (r6 != null) goto L6;
        return null;
    L6:
        nc1 r0 = ((vb4) this.o).X();
        monitor-enter(au0.class);
        se4 r1 = au0.B(r0);     // Catch: Throwable -> L18
        monitor-enter(r1);     // Catch: Throwable -> L18
        long r2 = r1.i;     // Catch: Throwable -> L15
        monitor-exit(r1);     // Catch: Throwable -> L18
        monitor-exit(au0.class);
        return ((vb4) this.o).t(R.string.settings_summary_streaming_cache_size, new Object[]{r6, String.valueOf(r2 / 1048576)});
    L15:
        th = move-exception;
        throw th;     // Catch: Throwable -> L18
    L18:
        th = move-exception;
        throw th;
    }

    public String toString() {
        switch(this.n) {
            case 10: goto L7;
            default: goto L5;
        };
    L5:
        return super.toString();
    L7:
        return "ProviderMetadata{ componentName=" + ((ComponentName) this.o).flattenToShortString() + " }";
    }

    public /* synthetic */ om1(int r1, Object r2) {
        this.n = r1;
        this.o = r2;
    }

    public /* synthetic */ om1(char r1, int r2) {
        this.n = r2;
    }

    public om1(View r3) {
        this.n = 26;
        if (Build.VERSION.SDK_INT < 30) goto L5;
        yh4 r0 = new yh4(r3);
        r0.b = r3;
        this.o = r0;
        return;
    L5:
        this.o = new sg3(r3);
    }

    public om1(WindowInsetsController r3) {
        this.n = 26;
        yh4 r0 = new yh4(null);
        r0.c = r3;
        this.o = r0;
    }

    public om1(Uri r3, ClipDescription r4, Uri r5) {
        this.n = 2;
        if (Build.VERSION.SDK_INT < 25) goto L5;
        this.o = new mz1(r3, r4, r5);
        return;
    L5:
        this.o = new c12(r3, r4, r5, 6);
    }

    public om1(int r2) {
        this.n = 14;
        this.o = ya4.a(new int[r2]);
    }
}
