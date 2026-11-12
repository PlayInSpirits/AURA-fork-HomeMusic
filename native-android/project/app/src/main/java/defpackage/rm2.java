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
import java.util.Iterator;
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

    public rm2(int r3) {
        this.n = r3;
        int r0 = 0;
        switch(r3) {
            case 6: goto L15;
            case 14: goto L12;
            case 15: goto L10;
            case 16: goto L8;
            case 28: goto L6;
            default: goto L4;
        };
    L4:
        this.o = g12.a(0, 16, wv.o);
        return;
    L6:
        this.o = new qf2();
        return;
    L8:
        this.o = AppDatabase.y().F();
        return;
    L10:
        this.o = uc5.B(Boolean.FALSE);
        return;
    L12:
        this.o = new LinkedHashSet();
        return;
    L15:
        if (Build.VERSION.SDK_INT < 28) goto L17;
        Object r4 = new tv1();
    L18:
        this.o = r4;
        return;
    L17:
        r4 = new hh3(r0);
        goto L18
    }

    @Override // defpackage.u55
    public int a(View r1) {
        nw3 r0 = (nw3) r1.getLayoutParams();
        return mw3.C(r1) - ((ViewGroup.MarginLayoutParams) r0).topMargin;
    }

    @Override // defpackage.mo2
    public void b(no2 r4) {
        bw2 r0 = ((dw2) this.o).d.s.d;
        tv4 r5 = r4.n();
        ((dw2) this.o).d.q.getClass();
        hw2 r1 = r0.a;
        Object r2 = r1.p;
        monitor-enter(r2);
        lb4 r3 = r1.r;     // Catch: Throwable -> L8
        r3.getClass();     // Catch: Throwable -> L8
        r3.l(new cw2(r5));     // Catch: Throwable -> L8
        monitor-exit(r2);     // Catch: Throwable -> L8
        ((dw2) this.o).d.s.a();
        return;
    L8:
        th = move-exception;
        throw th;
    }

    public long c(long r3) {
        qf2 r2 = (qf2) this.o;
        r2.getClass();
        if (k45.b(r3) > 0.0f) goto L5;
    L7:
        cz1.b("maximumVelocity should be a positive value. You specified=".concat(k45.f(r3)));
    L9:
        return e35.h(r2.a.b(k45.b(r3)), r2.b.b(k45.c(r3)));
    L5:
        if (k45.c(r3) <= 0.0f) goto L7;
        goto L7
    }

    @Override // defpackage.u55
    public int d() {
        return ((mw3) this.o).H();
    }

    public Object e(q02 r1, vd0 r2) {
        Object r0 = ((cd4) this.o).b(r1, r2);
        if (r0 != xe0.n) goto L6;
        return r0;
    L6:
        return j15.a;
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
    public c81 get(int r1) {
        return ((d81[]) this.o)[r1];
    }

    @Override // defpackage.f4
    public boolean h(View r3) {
        ss0 r2 = (ss0) this.o;
        int r4 = ((ViewPager2) r3).getCurrentItem() + 1;
        ViewPager2 r5 = (ViewPager2) r2.q;
        if (r5.E == false) goto L5;
        r5.d(r4, true);
    L5:
        return true;
    }

    public void i(int r2) {
        RecyclerView r1 = (RecyclerView) this.o;
        View r0 = r1.getChildAt(r2);
        if (r0 == null) goto L5;
        r1.r(r0);
        r0.clearAnimation();
    L5:
        r1.removeViewAt(r2);
    }

    @Override // defpackage.ca4
    public void j(da4 r1) {
        no2 r2 = (no2) r1;
        ((dw2) this.o).d.s.c.a(3).b();
    }

    @Override // defpackage.u55
    public int k() {
        mw3 r1 = (mw3) this.o;
        return r1.o - r1.E();
    }

    public void l(q02 r1) {
        ((cd4) this.o).q(r1);
    }

    @Override // defpackage.bi0
    public ci0 m() {
        return new jm4(((kx) this.o).a());
    }

    @Override // defpackage.wo4
    public void n(vo4 r7) {
        xo4 r6 = (xo4) this.o;
        int r0 = r6.q.length;
        int r2 = 1;
    L3:
        if (r2 >= r0) goto L21;
        int r3 = r6.q[r2];
        if (r3 != 1) goto L7;
        r7.c(r2, r6.r[r2]);
    L20:
        r2 = r2 + 1;
        goto L3
    L7:
        if (r3 != 2) goto L9;
        r7.d(r6.s[r2], r2);
        goto L20
    L9:
        if (r3 != 3) goto L11;
        String r4 = r6.t[r2];
        r4.getClass();
        r7.h(r2, r4);
        goto L20
    L11:
        if (r3 != 4) goto L13;
        byte[] r5 = r6.u[r2];
        r5.getClass();
        r7.x(r2, r5);
        goto L20
    L13:
        if (r3 != 5) goto L20;
        r7.e(r2);
        goto L20
    }

    @Override // retrofit2.Callback
    public void onFailure(Call r2, Throwable r3) {
        switch(this.n) {
            case 9: goto L15;
            case 10: goto L13;
            case 11: goto L11;
            case 19: goto L9;
            default: goto L4;
        };
    L4:
        Exception r4 = new Exception(r3.getMessage());
        boolean r5 = r3 instanceof IOException;
        SystemCallback r1 = (SystemCallback) this.o;
        if (r5 == false) goto L7;
        r1.onNetworkFailure(r4);
        return;
    L7:
        r1.onError(r4);
        return;
    L9:
        Log.e("SongRepository", "fetchSingleTrackThenSimilar.onFailure()", r3);
        return;
    L11:
        ((gu3) this.o).g.k("Network error: " + r3.getMessage());
        return;
    L13:
        Log.e("QueueRepository", "syncBookmarks failed", r3);
        new Handler(Looper.getMainLooper()).post((zo1) this.o);
        return;
    L15:
        Log.e("PodcastEpisodeBottomSheetViewModel", "deletePodcastEpisode network error", r3);
    }

    @Override // defpackage.av4
    public boolean onMenuItemClick(MenuItem r2) {
        return ((cv4) this.o).e.onMenuItemSelected(0, r2);
    }

    @Override // com.eddyizm.tempus.interfaces.DialogClickCallback
    public void onNegativeClick() {
        vb4 r2 = (vb4) this.o;
        r2.h0("download_storage").w(R.string.download_storage_internal_dialog_negative_button);
        r2.m0();
    }

    @Override // com.eddyizm.tempus.interfaces.DialogClickCallback
    public void onNeutralClick() {
        vb4 r2 = (vb4) this.o;
        r2.h0("download_storage").w(R.string.download_storage_directory_dialog_neutral_button);
        r2.m0();
    }

    @Override // com.eddyizm.tempus.interfaces.DialogClickCallback
    public void onPositiveClick() {
        vb4 r2 = (vb4) this.o;
        r2.h0("download_storage").w(R.string.download_storage_external_dialog_positive_button);
        r2.m0();
    }

    @Override // retrofit2.Callback
    public void onResponse(Call r20, Response r21) {
        switch(this.n) {
            case 9: goto L83;
            case 10: goto L41;
            case 11: goto L27;
            case 19: goto L20;
            default: goto L4;
        };
    L4:
        SystemCallback r0 = (SystemCallback) this.o;
        if (r21.body() != null) goto L7;
        r0.onError(new Exception(String.valueOf(r21.code())));
        return;
    L7:
        if (((ApiResponse) r21.body()).getSubsonicResponse().getStatus().equals(ResponseStatus.FAILED) == false) goto L14;
        Error r1 = ((ApiResponse) r21.body()).getSubsonicResponse().getError();
        if (r1 == null) goto L11;
        String r2 = r1.getCode() + " - " + r1.getMessage();
    L12:
        r0.onError(new Exception(r2));
        return;
    L11:
        r2 = "Unknown server error";
        goto L12
    L14:
        if (((ApiResponse) r21.body()).getSubsonicResponse().getStatus().equals(ResponseStatus.OK) == false) goto L16;
        r0.onSuccess(r21.raw().n.a.h("p"), r21.raw().n.a.h("t"), r21.raw().n.a.h("s"));
        return;
    L16:
        r0.onError(new Exception("Empty response"));
        return;
    L27:
        gu3 r3 = (gu3) this.o;
        if (r21.isSuccessful() == true) goto L30;
    L39:
        r3.g.k("HTTP error: " + r21.code());
        return;
    L30:
        if (r21.body() == null) goto L39;
        ApiResponse r4 = (ApiResponse) r21.body();
        if (r4.getSubsonicResponse() == null) goto L114;
        String r5 = r4.getSubsonicResponse().getStatus();
        if ("ok".equals(r5) == false) goto L37;
        r3.f.k(Boolean.TRUE);
        return;
    L37:
        if ("failed".equals(r5) == false) goto L116;
        gu3.c(r3, r4);
        return;
    L116:
        return;
    L114:
        return;
    L41:
        zo1 r6 = (zo1) this.o;
        if (r21.isSuccessful() == true) goto L44;
    L80:
        new Handler(Looper.getMainLooper()).post(r6);
        return;
    L44:
        if (r21.body() == null) goto L80;
        if (((ApiResponse) r21.body()).getSubsonicResponse() == null) goto L80;
        if (((ApiResponse) r21.body()).getSubsonicResponse().getBookmarks() == null) goto L50;
        List<Bookmark> r7 = ((ApiResponse) r21.body()).getSubsonicResponse().getBookmarks().getBookmarks();
    L51:
        if (r7 == null) goto L80;
        HashMap r8 = new HashMap();
        Iterator<Bookmark> r9 = r7.iterator();
    L54:
        if (r9.hasNext() == false) goto L69;
        Bookmark r10 = r9.next();
        Child r11 = r10.getEntry();
        if (r11 == null) goto L54;
        if (r11.getId() == null) goto L54;
        if (r10.getPosition() <= 0) goto L54;
        if (r10.getChanged() == null) goto L66;
        long r12 = r10.getChanged().getTime();
    L67:
        r8.put(r11.getId(), new sp3(r11.getId(), r10.getPosition(), r11.getTitle(), r11.getAlbum(), r11.getArtist(), r11.getAlbumId(), r11.getCoverArtId(), r11.getType(), r12));
        goto L54
    L66:
        r12 = System.currentTimeMillis();
        goto L67
    L69:
        if (r8.isEmpty() == true) goto L80;
        Map r13 = ud3.A();
        Iterator r14 = r8.entrySet().iterator();
    L73:
        if (r14.hasNext() == false) goto L79;
        Map.Entry r15 = (Map.Entry) r14.next();
        String r16 = (String) r15.getKey();
        sp3 r17 = (sp3) r15.getValue();
        sp3 r18 = (sp3) r13.get(r16);
        if (r18 == null) goto L78;
        if (r17.i < r18.i) goto L73;
    L78:
        r13.put(r16, r17);
        goto L73
    L79:
        ud3.N0(r13);
        goto L80
    L50:
        r7 = null;
        goto L51
    L20:
        if (r21.isSuccessful() == true) goto L22;
        return;
    L22:
        if (r21.body() == null) goto L112;
        Child r19 = ((ApiResponse) r21.body()).getSubsonicResponse().getSong();
        if (r19 == null) goto L113;
        ((wi4) this.o).a(Collections.singletonList(r19));
        return;
    L113:
        return;
    L112:
        return;
    L83:
        if (r21.isSuccessful() == true) goto L85;
    L91:
        Log.e("PodcastEpisodeBottomSheetViewModel", "deletePodcastEpisode failed with code: " + r21.code());
        return;
    L85:
        if (r21.body() == null) goto L91;
        if (((ApiResponse) r21.body()).getSubsonicResponse() == null) goto L91;
        if ("ok".equals(((ApiResponse) r21.body()).getSubsonicResponse().getStatus()) == false) goto L91;
        Application r22 = ((gn3) this.o).b;
        r22.getClass();
        Toast.makeText(r22, "Podcast episode deleted", 0).show();
    }

    @Override // defpackage.lm3
    public void onSuccess() {
        ((wl3) this.o).h.i(Integer.valueOf(R.string.playlist_editor_dialog_action_save_success));
    }

    @Override // defpackage.cq0
    public boolean p(float r2) {
        if (r2 != 0.0f) goto L6;
        return false;
    L6:
        t();
        ((NestedScrollView) this.o).j((int) r2);
        return true;
    }

    @Override // defpackage.u55
    public View q(int r1) {
        return ((mw3) this.o).u(r1);
    }

    @Override // defpackage.u55
    public int r(View r1) {
        nw3 r0 = (nw3) r1.getLayoutParams();
        return mw3.y(r1) + ((ViewGroup.MarginLayoutParams) r0).bottomMargin;
    }

    @Override // defpackage.cq0
    public float s() {
        return -((NestedScrollView) this.o).getVerticalScrollFactorCompat();
    }

    @Override // defpackage.cq0
    public void t() {
        ((NestedScrollView) this.o).q.abortAnimation();
    }

    public /* synthetic */ rm2(int r1, boolean r2) {
        this.n = r1;
    }

    public rm2(oo0 r3) {
        this.n = 20;
        float r1 = xj4.a;
        yx0 r0 = new yx0();
        r0.a = r1;
        float r4 = r3.g();
        float r2 = a81.a;
        r0.b = ((r4 * 386.0878f) * 160.0f) * 0.84f;
        this.o = r0;
    }

    public rm2(long[] r6) {
        this.n = 18;
        if (r6 == null) goto L18;
        long[] r7 = Arrays.copyOf(r6, r6.length);
        l03 r0 = new l03(r7.length);
        int r1 = r0.b;
        if (r1 >= 0) goto L7;
        kf2.h("");
        throw null;
    L7:
        if (r7.length == 0) goto L19;
        int r2 = r7.length + r1;
        long[] r3 = r0.a;
        if (r3.length >= r2) goto L12;
        r0.a = Arrays.copyOf(r3, Math.max(r2, (r3.length * 3) / 2));
    L12:
        long[] r4 = r0.a;
        int r5 = r0.b;
        if (r1 == r5) goto L15;
        ti.a0(r4, r4, r7.length + r1, r1, r5);
    L15:
        ti.a0(r7, r4, r1, 0, r7.length);
        r0.b += r7.length;
    L19:
        this.o = r0;
        return;
    L18:
        r0 = new l03();
        goto L19
    }

    public /* synthetic */ rm2(int r1, Object r2) {
        this.n = r1;
        this.o = r2;
    }

    public rm2(Notification r2) {
        this.n = 1;
        r2.getClass();
        this.o = r2;
    }

    public rm2(ye5 r10) {
        this.n = 24;
        SynchronousQueue r7 = new SynchronousQueue();
        this.o = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, r7, r10);
    }

    public rm2(ce r6, float r7) {
        this.n = 27;
        int r0 = r6.b();
        d81[] r1 = new d81[r0];
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L5;
        r1[r2] = new d81(r7, r6.a(r2));
        r2 = r2 + 1;
        goto L3
    L5:
        this.o = r1;
    }
}
