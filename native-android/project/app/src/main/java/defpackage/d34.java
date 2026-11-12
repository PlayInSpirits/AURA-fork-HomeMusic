package defpackage;

import android.content.ClipData;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.media.audiofx.Equalizer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.provider.MediaStore;
import android.util.Log;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import app.homemusic.R;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.database.AppDatabase;
import com.eddyizm.tempus.interfaces.StarCallback;
import com.eddyizm.tempus.model.Favorite;
import com.eddyizm.tempus.subsonic.base.ApiResponse;
import com.eddyizm.tempus.subsonic.models.ResponseStatus;
import com.google.android.gms.common.internal.a;
import com.google.android.material.appbar.MaterialToolbar;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class d34 implements st4, ou2, Callback, j4, pp, r83, v11, su2, n20, yy, o73, id0, ex4, q51 {
    public static d34 p;
    public static final e34 q = null;
    public static final d34 r = null;
    public static final String[] s = null;
    public static long t;
    public final /* synthetic */ int n;
    public Object o;

    static {
        q = new e34(0, false, false, 0, 0);
        int r2 = 1;
        r = new d34(r2, new float[]{0.8951f, -0.7502f, 0.0389f, 0.2664f, 1.7135f, -0.0685f, -0.1614f, 0.0367f, 1.0296f});
        s = new String[]{"_data"};
    }

    public d34(int r2) {
        this.n = r2;
        switch(r2) {
            case 25: goto L8;
            case 28: goto L6;
            default: goto L4;
        };
    L4:
        this.o = new cj4(ya4.a);
        return;
    L6:
        this.o = null;
        return;
    L8:
        this.o = AppDatabase.y().x();
    }

    public static synchronized d34 E() {
        monitor-enter(d34.class);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (p != null) goto L9;
        p = new d34(0, false);     // Catch: Throwable -> L7
    L9:
        d34 r1 = p;     // Catch: Throwable -> L7
        monitor-exit(d34.class);
        return r1;
    }

    public static l61 G(String r1, String r2, boolean r3, String r4) {
        l61 r5 = n61.g(1, r1, r3);
        l61 r6 = n61.g(2, r2, r3);
        l61 r7 = n61.g(3, r4, r3);
        if (r5 == null) goto L5;
        return r5;
    L5:
        if (r6 == null) goto L7;
        return r6;
    L7:
        return r7;
    }

    public static void I(String r4, String r5, String r6, StarCallback r7) {
        l61 r0 = G(r4, r5, true, r6);
        gp3 r1 = App.f(false).e();
        r1.getClass();
        Log.d("MediaAnnotationClient", "star()");
        ((zi2) r1.p).c(((pn4) r1.o).f(), r4, r5, r6).enqueue(new xc5(8, r0, r7));
    }

    public static void K(String r4, String r5, String r6, StarCallback r7) {
        l61 r1 = G(r4, r5, false, r6);
        gp3 r0 = App.f(false).e();
        r0.getClass();
        Log.d("MediaAnnotationClient", "unstar()");
        ((zi2) r0.p).b(((pn4) r0.o).f(), r4, r5, r6).enqueue(new hd5(8, r1, r7));
    }

    public static void r(l61 r3, StarCallback r4) {
        HashMap r0 = n61.a;
        monitor-enter(n61.class);
        if (r3 != null) goto L22;
    L15:
        boolean r1 = false;
    L16:
        monitor-exit(n61.class);
        if (r1 == false) goto L20;
        r4.onError();
        return;
    L20:
        n61.l(r3);
        return;
    L22:
        l61 r2 = (l61) n61.a.get(r3.a);     // Catch: Throwable -> L12
    L6:
        if (r2 == null) goto L10;
        if (r2.e == false) goto L10;
        r2 = r2.c;     // Catch: Throwable -> L12
    L10:
        if (r2 != r3) goto L15;
        r1 = true;
    L12:
        th = move-exception;
        throw th;
    }

    public static boolean w(Response r1) {
        if (r1.body() != null) goto L5;
        return false;
    L5:
        if (((ApiResponse) r1.body()).getSubsonicResponse() != null) goto L7;
        return false;
    L7:
        if (ResponseStatus.FAILED.equals(((ApiResponse) r1.body()).getSubsonicResponse().getStatus()) == false) goto L13;
        return true;
    L13:
        return false;
    }

    @Override // defpackage.o73
    public Object A() {
        Type r4 = (Type) this.o;
        if ((r4 instanceof ParameterizedType) == false) goto L10;
        Type r0 = ((ParameterizedType) r4).getActualTypeArguments()[0];
        if ((r0 instanceof Class) == true) goto L7;
        kf2.f(r4, "Invalid EnumSet type: ");
        return null;
    L7:
        return EnumSet.noneOf((Class) r0);
    L10:
        kf2.f(r4, "Invalid EnumSet type: ");
        return null;
    }

    public void B(c72 r2) {
        if (r2.G() == true) goto L5;
        cz1.b("DepthSortedSet.add called on an unattached node");
    L5:
        ((cj4) this.o).add(r2);
    }

    public void C(Favorite r6) {
        long r0 = r6.getTimestamp();
        App.a().getSharedPreferences("homemusic_favorite_retries", 0).edit().remove(String.valueOf(r0)).apply();
        i61 r5 = (i61) this.o;
        new Thread(new o61(r5, r6, 0)).start();
    }

    public kl4 D() {
        tz0 r0 = tz0.a();
        if (r0.b() == 1) goto L5;
        zd3 r1 = uc5.B(Boolean.FALSE);
        r0.g(new hl0(r1, this));
        return r1;
    L5:
        return new ow1(true);
    }

    public void F() {
        ((mc1) this.o).D.P();
    }

    public boolean H(c72 r2) {
        if (r2.G() == true) goto L6;
        cz1.b("DepthSortedSet.remove called on an unattached node");
    L6:
        return ((cj4) this.o).remove(r2);
    }

    public void J(String r10, String r11, boolean r12, String r13) {
        int r0 = 1;
        n61.k(1, r10, r12);
        n61.k(2, r11, r12);
        n61.k(3, r13, r12);
        l61 r1 = G(r10, r11, r12, r13);
        long r2 = Math.max(System.currentTimeMillis(), t + 1);
        t = r2;
        if (r1 == null) goto L6;
        App.a().getSharedPreferences("homemusic_favorite_retries", 0).edit().putString(String.valueOf(r2), r1.f.d).apply();
    L6:
        new Thread(new o61((i61) this.o, new Favorite(t, r10, r11, r13, r12), r0)).start();
    }

    @Override // defpackage.su2
    public void a(qu2 r1, MenuItem r2) {
        ((uz) this.o).s.removeCallbacksAndMessages(r1);
    }

    @Override // defpackage.v11
    public short b() {
        Equalizer r0 = (Equalizer) this.o;
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getNumberOfBands();
    }

    @Override // defpackage.id0
    public ld0 build() {
        return new ld0(new zh0(db.f((ContentInfo.Builder) this.o)));
    }

    @Override // defpackage.id0
    public void c(Uri r1) {
        hd0.u((ContentInfo.Builder) this.o, r1);
    }

    @Override // defpackage.v11
    public short[] d() {
        Equalizer r0 = (Equalizer) this.o;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.getBandLevelRange();
    }

    @Override // defpackage.j4
    public boolean e() {
        bg r0 = (bg) this.o;
        r0.G();
        l93 r1 = r0.A;
        if (r1 != null) goto L5;
        return false;
    L5:
        if ((r1.I() & 4) == 0) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // defpackage.v11
    public boolean f(Context r5, int r6) {
        int r0 = 0;
        if (r6 == (-1)) goto L17;
        if (r6 == 0) goto L17;
        Context r7 = r5.getApplicationContext();
        r7.getClass();
        Context r8 = r7.getApplicationContext();
        r8.getClass();
        o(r8, r6);
        if (r6 == 0) goto L11;
        if (r6 == (-1)) goto L11;
        Equalizer r9 = new Equalizer(0, r6);     // Catch: Exception -> L10
        boolean r10 = true;
        r9.setEnabled(true);     // Catch: Exception -> L10
        this.o = r9;     // Catch: Exception -> L10
    L12:
        if (r10 == false) goto L16;
        App.b().getClass();
        setEnabled(App.c().getBoolean("equalizer_enabled", false));
        short r11 = b();
        short[] r1 = ud3.q(r11);
    L14:
        if (r0 >= r11) goto L16;
        v((short) r0, r1[r0]);
        r0 = r0 + 1;
    L16:
        return r10;
    L10:
        this.o = null;
    L11:
        r10 = false;
    L17:
        return false;
    }

    @Override // defpackage.q51
    public Object g() {
        lv4 r8 = (lv4) this.o;
        return new m11((li1) r8.n, (li1) r8.o, (li1) r8.p, (li1) r8.q, (i11) r8.r, (i11) r8.s, (i61) r8.t);
    }

    @Override // defpackage.j4
    public Context h() {
        return ((bg) this.o).D();
    }

    @Override // defpackage.id0
    public void i(int r1) {
        db.v((ContentInfo.Builder) this.o, r1);
    }

    @Override // defpackage.yy
    public void j(Typeface r1) {
        k40 r0 = (k40) this.o;
        if (r0.o(r1) == false) goto L6;
        r0.i(false);
        return;
    }

    @Override // defpackage.pp
    public void k(ka0 r2) {
        if (r2.o != 0) goto L5;
        boolean r0 = true;
    L6:
        a r1 = (a) this.o;
        if (r0 == false) goto L10;
        r1.j0(null, r1.J);
        return;
    L10:
        c05 r3 = r1.B;
        if (r3 == null) goto L14;
        ((hj1) r3.n).m(r2);
        return;
    L14:
        return;
    L5:
        r0 = false;
        goto L6
    }

    @Override // defpackage.su2
    public void l(qu2 r10, tu2 r11) {
        uz r0 = (uz) this.o;
        Handler r1 = r0.s;
        tz r2 = null;
        r1.removeCallbacksAndMessages(null);
        ArrayList r3 = r0.u;
        int r4 = r3.size();
        int r5 = 0;
    L4:
        if (r5 >= r4) goto L9;
        if (r10 == ((tz) r3.get(r5)).b) goto L10;
        r5 = r5 + 1;
    L10:
        if (r5 != (-1)) goto L12;
        return;
    L12:
        int r6 = r5 + 1;
        if (r6 >= r3.size()) goto L15;
        r2 = (tz) r3.get(r6);
    L15:
        r1.postAtTime(new sz(this, r2, r11, r10, 0), r10, SystemClock.uptimeMillis() + 200);
        return;
    L9:
        r5 = -1;
        goto L10
    }

    @Override // defpackage.ou2
    public boolean m(qu2 r4, MenuItem r5) {
        b5 r3 = ((ActionMenuView) this.o).N;
        if (r3 == null) goto L16;
        Toolbar r6 = (Toolbar) ((om1) r3).o;
        Iterator r0 = ((CopyOnWriteArrayList) r6.T.p).iterator();
    L6:
        if (r0.hasNext() == false) goto L10;
        if (((cd1) r0.next()).a.o(r5) == false) goto L6;
        boolean r7 = true;
    L14:
        if (r7 == false) goto L16;
        return true;
    L10:
        av4 r8 = r6.V;
        if (r8 == null) goto L13;
        r7 = r8.onMenuItemClick(r5);
        goto L14
    L13:
        r7 = false;
    L16:
        return false;
    }

    @Override // defpackage.v11
    public Integer n(short r1) {
        Equalizer r0 = (Equalizer) this.o;
        if (r0 != null) goto L5;
        return null;
    L5:
        return Integer.valueOf(r0.getCenterFreq(r1) / 1000);
    }

    @Override // defpackage.v11
    public void o(Context r1, int r2) {
        Equalizer r3 = (Equalizer) this.o;
        if (r3 == null) goto L5;
        r3.release();
    L5:
        this.o = null;
    }

    @Override // retrofit2.Callback
    public void onFailure(Call r1, Throwable r2) {
        switch(this.n) {
            case 4: goto L6;
            default: goto L4;
        };
    L4:
        ((r8) this.o).onLoadYear(-1);
        return;
    L6:
        ((x7) this.o).onLoadYear(-1);
    }

    @Override // retrofit2.Callback
    public void onResponse(Call r2, Response r3) {
        switch(this.n) {
            case 4: goto L16;
            default: goto L5;
        };
    L16:
        x7 r1 = (x7) this.o;
        if (r3.isSuccessful() == true) goto L19;
        return;
    L19:
        if (r3.body() != null) goto L21;
        return;
    L21:
        if (((ApiResponse) r3.body()).getSubsonicResponse().getAlbumList2() != null) goto L23;
        return;
    L23:
        if (((ApiResponse) r3.body()).getSubsonicResponse().getAlbumList2().getAlbums() != null) goto L25;
        return;
    L25:
        if (((ApiResponse) r3.body()).getSubsonicResponse().getAlbumList2().getAlbums().isEmpty() == false) goto L27;
    L29:
        r1.onLoadYear(-1);
        return;
    L27:
        if (((ApiResponse) r3.body()).getSubsonicResponse().getAlbumList2().getAlbums().isEmpty() == true) goto L29;
        r1.onLoadYear(((ApiResponse) r3.body()).getSubsonicResponse().getAlbumList2().getAlbums().get(0).getYear());
        return;
    L5:
        if (r3.isSuccessful() == true) goto L7;
        return;
    L7:
        if (r3.body() != null) goto L9;
        return;
    L9:
        if (((ApiResponse) r3.body()).getSubsonicResponse().getAlbumList2() != null) goto L11;
        return;
    L11:
        if (((ApiResponse) r3.body()).getSubsonicResponse().getAlbumList2().getAlbums() != null) goto L13;
        return;
    L13:
        if (((ApiResponse) r3.body()).getSubsonicResponse().getAlbumList2().getAlbums().isEmpty() == true) goto L35;
        ((r8) this.o).onLoadYear(((ApiResponse) r3.body()).getSubsonicResponse().getAlbumList2().getAlbums().get(0).getYear());
        return;
    }

    @Override // defpackage.st4
    public Cursor p(Uri r7) {
        String r8 = r7.getLastPathSegment();
        String[] r2 = s;
        return ((ContentResolver) this.o).query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, r2, "kind = 1 AND image_id = ?", new String[]{r8}, null);
    }

    @Override // defpackage.j4
    public void q(Drawable r1, int r2) {
        bg r0 = (bg) this.o;
        r0.G();
        l93 r3 = r0.A;
        if (r3 == null) goto L6;
        r3.i0(r1);
        r3.h0(r2);
        return;
    }

    @Override // defpackage.ex4
    public cx4 s(int r2) {
        if (r2 != 5) goto L7;
        return z53.n;
    L7:
        if (((om0) this.o) != null) goto L10;
        this.o = new om0(11);
    L10:
        return (om0) this.o;
    }

    @Override // defpackage.v11
    public void setEnabled(boolean r1) {
        Equalizer r0 = (Equalizer) this.o;
        if (r0 == null) goto L6;
        r0.setEnabled(r1);
        return;
    }

    @Override // defpackage.id0
    public void setExtras(Bundle r1) {
        hd0.v((ContentInfo.Builder) this.o, r1);
    }

    @Override // defpackage.j4
    public Drawable t() {
        Context r3 = ((bg) this.o).D();
        TypedArray r0 = r3.obtainStyledAttributes(null, new int[]{R.attr.homeAsUpIndicator});
        if (r0.hasValue(0) == false) goto L7;
        int r2 = r0.getResourceId(0, 0);
        if (r2 == 0) goto L7;
        Drawable r4 = zz1.r(r3, r2);
    L8:
        r0.recycle();
        return r4;
    L7:
        r4 = r0.getDrawable(0);
        goto L8
    }

    public String toString() {
        switch(this.n) {
            case 1: goto L8;
            case 21: goto L7;
            default: goto L5;
        };
    L8:
        return "Bradford";
    L5:
        return super.toString();
    L7:
        return ((cj4) this.o).toString();
    }

    @Override // defpackage.j4
    public void u(int r1) {
        bg r0 = (bg) this.o;
        r0.G();
        l93 r2 = r0.A;
        if (r2 == null) goto L6;
        r2.h0(r1);
        return;
    }

    @Override // defpackage.v11
    public void v(short r1, short r2) {
        Equalizer r0 = (Equalizer) this.o;
        if (r0 == null) goto L6;
        r0.setBandLevel(r1, r2);
        return;
    }

    @Override // defpackage.r83
    public pb5 x(View r2, pb5 r3) {
        yt r1 = (yt) this.o;
        xt r4 = r1.A;
        if (r4 == null) goto L5;
        r1.t.j0.remove(r4);
    L5:
        xt r5 = new xt(r1.w, r3);
        r1.A = r5;
        r5.e(r1.getWindow());
        r1.t.w(r1.A);
        return r3;
    }

    @Override // defpackage.ou2
    public void y(qu2 r1) {
        ou2 r0 = ((ActionMenuView) this.o).I;
        if (r0 == null) goto L6;
        r0.y(r1);
        return;
    }

    @Override // defpackage.v11
    public Short z(short r1) {
        Equalizer r0 = (Equalizer) this.o;
        if (r0 != null) goto L5;
        return null;
    L5:
        return Short.valueOf(r0.getBandLevel(r1));
    }

    public /* synthetic */ d34(int r1, boolean r2) {
        this.n = r1;
    }

    public d34(zg5 r2) {
        this.n = 29;
        this.o = Collections.unmodifiableMap(new HashMap((HashMap) r2.n));
    }

    public d34(LinearLayout r1, MaterialToolbar r2) {
        this.n = 27;
        this.o = r2;
    }

    public /* synthetic */ d34(int r1, Object r2) {
        this.n = r1;
        this.o = r2;
    }

    public d34(int r13, int r14, int r15, int r16, boolean r17, boolean r18, rm2 r19) {
        this.n = 16;
        gr4 r2 = gr4.l;
        fz0 r0 = fz0.L;
        TimeUnit r10 = TimeUnit.MINUTES;
        r10.getClass();
        r2.getClass();
        this.o = new dv3(r2, r10, r0, new ea0(r2, r13, r14, r15, r16, r17, r18, r19));
    }

    public d34(ClipData r2, int r3) {
        this.n = 18;
        this.o = db.e(r2, r3);
    }
}
