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
import android.util.AttributeSet;
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
    public static final e34 q = new e34(0, false, false, 0, 0);
    public static final d34 r = new d34(1, new float[]{0.8951f, -0.7502f, 0.0389f, 0.2664f, 1.7135f, -0.0685f, -0.1614f, 0.0367f, 1.0296f});
    public static final String[] s = {"_data"};
    public static long t;
    public final /* synthetic */ int n;
    public Object o;

    public d34(int i) {
        this.n = i;
        switch (i) {
            case 25:
                this.o = AppDatabase.y().x();
                break;
            case 28:
                this.o = null;
                break;
            default:
                this.o = new cj4(ya4.a);
                break;
        }
    }

    public static synchronized d34 E() {
        try {
            if (p == null) {
                p = new d34(0, false);
            }
        } catch (Throwable th) {
            throw th;
        }
        return p;
    }

    public static l61 G(String str, String str2, boolean z, String str3) {
        l61 l61VarG = n61.g(1, str, z);
        l61 l61VarG2 = n61.g(2, str2, z);
        l61 l61VarG3 = n61.g(3, str3, z);
        if (l61VarG != null) {
            return l61VarG;
        }
        return l61VarG2 != null ? l61VarG2 : l61VarG3;
    }

    public static void I(String str, String str2, String str3, StarCallback starCallback) {
        l61 l61VarG = G(str, str2, true, str3);
        gp3 gp3VarE = App.f(false).e();
        gp3VarE.getClass();
        Log.d("MediaAnnotationClient", "star()");
        ((zi2) gp3VarE.p).c(((pn4) gp3VarE.o).f(), str, str2, str3).enqueue(new xc5(8, l61VarG, starCallback));
    }

    public static void K(String str, String str2, String str3, StarCallback starCallback) {
        l61 l61VarG = G(str, str2, false, str3);
        gp3 gp3VarE = App.f(false).e();
        gp3VarE.getClass();
        Log.d("MediaAnnotationClient", "unstar()");
        ((zi2) gp3VarE.p).b(((pn4) gp3VarE.o).f(), str, str2, str3).enqueue(new hd5(8, l61VarG, starCallback));
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0021  */
    public static void r(l61 l61Var, StarCallback starCallback) {
        boolean z;
        HashMap map = n61.a;
        synchronized (n61.class) {
            if (l61Var != null) {
                l61 l61Var2 = (l61) n61.a.get(l61Var.a);
                while (l61Var2 != null && l61Var2.e) {
                    l61Var2 = l61Var2.c;
                }
                if (l61Var2 == l61Var) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
        }
        if (z) {
            starCallback.onError();
        } else {
            n61.l(l61Var);
        }
    }

    public static boolean w(Response response) {
        return (response.body() == null || ((ApiResponse) response.body()).getSubsonicResponse() == null || !ResponseStatus.FAILED.equals(((ApiResponse) response.body()).getSubsonicResponse().getStatus())) ? false : true;
    }

    @Override // defpackage.o73
    public Object A() {
        Type type = (Type) this.o;
        if (!(type instanceof ParameterizedType)) {
            kf2.f(type, "Invalid EnumSet type: ");
            return null;
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return EnumSet.noneOf((Class) type2);
        }
        kf2.f(type, "Invalid EnumSet type: ");
        return null;
    }

    public void B(c72 c72Var) {
        if (!c72Var.G()) {
            cz1.b("DepthSortedSet.add called on an unattached node");
        }
        ((cj4) this.o).add(c72Var);
    }

    public void C(Favorite favorite) {
        App.a().getSharedPreferences("homemusic_favorite_retries", 0).edit().remove(String.valueOf(favorite.getTimestamp())).apply();
        new Thread(new o61((i61) this.o, favorite, 0)).start();
    }

    public kl4 D() {
        tz0 tz0VarA = tz0.a();
        if (tz0VarA.b() == 1) {
            return new ow1(true);
        }
        zd3 zd3VarB = uc5.B(Boolean.FALSE);
        tz0VarA.g(new hl0(zd3VarB, this));
        return zd3VarB;
    }

    public void F() {
        ((mc1) this.o).D.P();
    }

    public boolean H(c72 c72Var) {
        if (!c72Var.G()) {
            cz1.b("DepthSortedSet.remove called on an unattached node");
        }
        return ((cj4) this.o).remove(c72Var);
    }

    public void J(String str, String str2, boolean z, String str3) {
        int i = 1;
        n61.k(1, str, z);
        n61.k(2, str2, z);
        n61.k(3, str3, z);
        l61 l61VarG = G(str, str2, z, str3);
        long jMax = Math.max(System.currentTimeMillis(), t + 1);
        t = jMax;
        if (l61VarG != null) {
            App.a().getSharedPreferences("homemusic_favorite_retries", 0).edit().putString(String.valueOf(jMax), l61VarG.f.d).apply();
        }
        new Thread(new o61((i61) this.o, new Favorite(t, str, str2, str3, z), i)).start();
    }

    @Override // defpackage.su2
    public void a(qu2 qu2Var, MenuItem menuItem) {
        ((uz) this.o).s.removeCallbacksAndMessages(qu2Var);
    }

    @Override // defpackage.v11
    public short b() {
        Equalizer equalizer = (Equalizer) this.o;
        if (equalizer != null) {
            return equalizer.getNumberOfBands();
        }
        return (short) 0;
    }

    @Override // defpackage.id0
    public ld0 build() {
        return new ld0(new zh0(((ContentInfo.Builder) this.o).build()));
    }

    @Override // defpackage.id0
    public void c(Uri uri) {
        ((ContentInfo.Builder) this.o).setLinkUri(uri);
    }

    @Override // defpackage.v11
    public short[] d() {
        Equalizer equalizer = (Equalizer) this.o;
        if (equalizer != null) {
            return equalizer.getBandLevelRange();
        }
        return null;
    }

    @Override // defpackage.j4
    public boolean e() {
        bg bgVar = (bg) this.o;
        bgVar.G();
        l93 l93Var = bgVar.A;
        return (l93Var == null || (l93Var.I() & 4) == 0) ? false : true;
    }

    @Override // defpackage.v11
    public boolean f(Context context, int i) {
        boolean z;
        if (i == -1 || i == 0) {
            return false;
        }
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        Context applicationContext2 = applicationContext.getApplicationContext();
        applicationContext2.getClass();
        o(applicationContext2, i);
        if (i == 0 || i == -1) {
            z = false;
        } else {
            try {
                Equalizer equalizer = new Equalizer(0, i);
                z = true;
                equalizer.setEnabled(true);
                this.o = equalizer;
            } catch (Exception unused) {
                this.o = null;
                z = false;
            }
        }
        if (z) {
            App.b().getClass();
            setEnabled(App.c().getBoolean("equalizer_enabled", false));
            short sB = b();
            short[] sArrQ = ud3.q(sB);
            for (int i2 = 0; i2 < sB; i2++) {
                v((short) i2, sArrQ[i2]);
            }
        }
        return z;
    }

    @Override // defpackage.q51
    public Object g() {
        lv4 lv4Var = (lv4) this.o;
        return new m11((li1) lv4Var.n, (li1) lv4Var.o, (li1) lv4Var.p, (li1) lv4Var.q, (i11) lv4Var.r, (i11) lv4Var.s, (i61) lv4Var.t);
    }

    @Override // defpackage.j4
    public Context h() {
        return ((bg) this.o).D();
    }

    @Override // defpackage.id0
    public void i(int i) {
        ((ContentInfo.Builder) this.o).setFlags(i);
    }

    @Override // defpackage.yy
    public void j(Typeface typeface) {
        k40 k40Var = (k40) this.o;
        if (k40Var.o(typeface)) {
            k40Var.i(false);
        }
    }

    @Override // defpackage.pp
    public void k(ka0 ka0Var) {
        boolean z = ka0Var.o == 0;
        a aVar = (a) this.o;
        if (z) {
            aVar.j0(null, aVar.J);
            return;
        }
        c05 c05Var = aVar.B;
        if (c05Var != null) {
            ((hj1) c05Var.n).m(ka0Var);
        }
    }

    @Override // defpackage.su2
    public void l(qu2 qu2Var, tu2 tu2Var) {
        uz uzVar = (uz) this.o;
        Handler handler = uzVar.s;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = uzVar.u;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (qu2Var == ((tz) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        handler.postAtTime(new sz(this, i2 < arrayList.size() ? (tz) arrayList.get(i2) : null, tu2Var, qu2Var, 0), qu2Var, SystemClock.uptimeMillis() + 200);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003c A[RETURN] */
    @Override // defpackage.ou2
    public boolean m(qu2 qu2Var, MenuItem menuItem) {
        boolean zOnMenuItemClick;
        b5 b5Var = ((ActionMenuView) this.o).N;
        if (b5Var != null) {
            Toolbar toolbar = (Toolbar) ((om1) b5Var).o;
            Iterator it = ((CopyOnWriteArrayList) toolbar.T.p).iterator();
            while (it.hasNext()) {
                if (((cd1) it.next()).a.o(menuItem)) {
                    zOnMenuItemClick = true;
                    if (zOnMenuItemClick) {
                        return true;
                    }
                }
            }
            av4 av4Var = toolbar.V;
            zOnMenuItemClick = av4Var != null ? av4Var.onMenuItemClick(menuItem) : false;
            if (zOnMenuItemClick) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.v11
    public Integer n(short s2) {
        Equalizer equalizer = (Equalizer) this.o;
        if (equalizer != null) {
            return Integer.valueOf(equalizer.getCenterFreq(s2) / 1000);
        }
        return null;
    }

    @Override // defpackage.v11
    public void o(Context context, int i) {
        Equalizer equalizer = (Equalizer) this.o;
        if (equalizer != null) {
            equalizer.release();
        }
        this.o = null;
    }

    @Override // retrofit2.Callback
    public void onFailure(Call call, Throwable th) {
        switch (this.n) {
            case 4:
                ((x7) this.o).onLoadYear(-1);
                break;
            default:
                ((r8) this.o).onLoadYear(-1);
                break;
        }
    }

    @Override // retrofit2.Callback
    public void onResponse(Call call, Response response) {
        switch (this.n) {
            case 4:
                x7 x7Var = (x7) this.o;
                if (response.isSuccessful() && response.body() != null && ((ApiResponse) response.body()).getSubsonicResponse().getAlbumList2() != null && ((ApiResponse) response.body()).getSubsonicResponse().getAlbumList2().getAlbums() != null) {
                    if (((ApiResponse) response.body()).getSubsonicResponse().getAlbumList2().getAlbums().isEmpty() || ((ApiResponse) response.body()).getSubsonicResponse().getAlbumList2().getAlbums().isEmpty()) {
                        x7Var.onLoadYear(-1);
                    } else {
                        x7Var.onLoadYear(((ApiResponse) response.body()).getSubsonicResponse().getAlbumList2().getAlbums().get(0).getYear());
                    }
                    break;
                }
                break;
            default:
                if (response.isSuccessful() && response.body() != null && ((ApiResponse) response.body()).getSubsonicResponse().getAlbumList2() != null && ((ApiResponse) response.body()).getSubsonicResponse().getAlbumList2().getAlbums() != null && !((ApiResponse) response.body()).getSubsonicResponse().getAlbumList2().getAlbums().isEmpty()) {
                    ((r8) this.o).onLoadYear(((ApiResponse) response.body()).getSubsonicResponse().getAlbumList2().getAlbums().get(0).getYear());
                    break;
                }
                break;
        }
    }

    @Override // defpackage.st4
    public Cursor p(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        return ((ContentResolver) this.o).query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, s, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, null);
    }

    @Override // defpackage.j4
    public void q(Drawable drawable, int i) {
        bg bgVar = (bg) this.o;
        bgVar.G();
        l93 l93Var = bgVar.A;
        if (l93Var != null) {
            l93Var.i0(drawable);
            l93Var.h0(i);
        }
    }

    @Override // defpackage.ex4
    public cx4 s(int i) {
        if (i == 5) {
            return z53.n;
        }
        if (((om0) this.o) == null) {
            this.o = new om0(11);
        }
        return (om0) this.o;
    }

    @Override // defpackage.v11
    public void setEnabled(boolean z) {
        Equalizer equalizer = (Equalizer) this.o;
        if (equalizer != null) {
            equalizer.setEnabled(z);
        }
    }

    @Override // defpackage.id0
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.o).setExtras(bundle);
    }

    @Override // defpackage.j4
    public Drawable t() {
        int resourceId;
        Context contextD = ((bg) this.o).D();
        TypedArray typedArrayObtainStyledAttributes = contextD.obtainStyledAttributes((AttributeSet) null, new int[]{R.attr.homeAsUpIndicator});
        Drawable drawable = (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : zz1.r(contextD, resourceId);
        typedArrayObtainStyledAttributes.recycle();
        return drawable;
    }

    public String toString() {
        switch (this.n) {
            case 1:
                return "Bradford";
            case 21:
                return ((cj4) this.o).toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.j4
    public void u(int i) {
        bg bgVar = (bg) this.o;
        bgVar.G();
        l93 l93Var = bgVar.A;
        if (l93Var != null) {
            l93Var.h0(i);
        }
    }

    @Override // defpackage.v11
    public void v(short s2, short s3) {
        Equalizer equalizer = (Equalizer) this.o;
        if (equalizer != null) {
            equalizer.setBandLevel(s2, s3);
        }
    }

    @Override // defpackage.r83
    public pb5 x(View view, pb5 pb5Var) {
        yt ytVar = (yt) this.o;
        xt xtVar = ytVar.A;
        if (xtVar != null) {
            ytVar.t.j0.remove(xtVar);
        }
        xt xtVar2 = new xt(ytVar.w, pb5Var);
        ytVar.A = xtVar2;
        xtVar2.e(ytVar.getWindow());
        ytVar.t.w(ytVar.A);
        return pb5Var;
    }

    @Override // defpackage.ou2
    public void y(qu2 qu2Var) {
        ou2 ou2Var = ((ActionMenuView) this.o).I;
        if (ou2Var != null) {
            ou2Var.y(qu2Var);
        }
    }

    @Override // defpackage.v11
    public Short z(short s2) {
        Equalizer equalizer = (Equalizer) this.o;
        if (equalizer != null) {
            return Short.valueOf(equalizer.getBandLevel(s2));
        }
        return null;
    }

    public /* synthetic */ d34(int i, boolean z) {
        this.n = i;
    }

    public d34(zg5 zg5Var) {
        this.n = 29;
        this.o = Collections.unmodifiableMap(new HashMap((HashMap) zg5Var.n));
    }

    public d34(LinearLayout linearLayout, MaterialToolbar materialToolbar) {
        this.n = 27;
        this.o = materialToolbar;
    }

    public /* synthetic */ d34(int i, Object obj) {
        this.n = i;
        this.o = obj;
    }

    public d34(int i, int i2, int i3, int i4, boolean z, boolean z2, rm2 rm2Var) {
        this.n = 16;
        gr4 gr4Var = gr4.l;
        fz0 fz0Var = fz0.L;
        TimeUnit timeUnit = TimeUnit.MINUTES;
        timeUnit.getClass();
        gr4Var.getClass();
        this.o = new dv3(gr4Var, timeUnit, fz0Var, new ea0(gr4Var, i, i2, i3, i4, z, z2, rm2Var));
    }

    public d34(ClipData clipData, int i) {
        this.n = 18;
        this.o = db.e(clipData, i);
    }
}
