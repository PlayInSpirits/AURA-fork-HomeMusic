package defpackage;

import android.content.ClipData;
import android.content.ContentResolver;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.ContentInfo;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.drawerlayout.widget.DrawerLayout;
import com.eddyizm.tempus.database.AppDatabase;
import com.eddyizm.tempus.subsonic.base.ApiResponse;
import com.eddyizm.tempus.subsonic.models.IndexID3;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class zh0 implements st4, r83, fv2, Callback, d14, qn4, o73, kd0, yh0, f4, f51, p5, jj1 {
    public static final sw p = new sw(1);
    public static final String[] q = {"_data"};
    public final /* synthetic */ int n;
    public Object o;

    public zh0(int i) {
        this.n = i;
        switch (i) {
            case 2:
                if (Build.VERSION.SDK_INT < 26) {
                    this.o = new w3(this);
                } else {
                    this.o = new x3(this);
                }
                break;
            case 13:
                this.o = AppDatabase.y().v();
                break;
            case 26:
                break;
            case 27:
                this.o = new ef1(5, 1.0f, false);
                break;
            default:
                this.o = new HashMap();
                break;
        }
    }

    public static void B(List list) {
        Iterator it = list.iterator();
        if (it.hasNext()) {
            throw xa3.d(it);
        }
    }

    public static zh0 E(be3 be3Var) {
        String str;
        be3Var.O(2);
        int iA = be3Var.A();
        int i = iA >> 1;
        int iA2 = ((be3Var.A() >> 3) & 31) | ((iA & 1) << 5);
        if (i == 4 || i == 5 || i == 7 || i == 8) {
            str = "dvhe";
        } else if (i == 9) {
            str = "dvav";
        } else {
            if (i != 10) {
                return null;
            }
            str = "dav1";
        }
        StringBuilder sbI = xa3.i(str);
        sbI.append(i < 10 ? ".0" : ".");
        sbI.append(i);
        sbI.append(iA2 < 10 ? ".0" : ".");
        sbI.append(iA2);
        return new zh0(20, sbI.toString());
    }

    @Override // defpackage.o73
    public Object A() {
        switch (this.n) {
            case 15:
                Class cls = (Class) this.o;
                try {
                    return w15.a.a(cls);
                } catch (Exception e) {
                    throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e);
                }
            default:
                Type type = (Type) this.o;
                if (!(type instanceof ParameterizedType)) {
                    kf2.f(type, "Invalid EnumMap type: ");
                    return null;
                }
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return new EnumMap((Class) type2);
                }
                kf2.f(type, "Invalid EnumMap type: ");
                return null;
        }
    }

    public v3 C(int i) {
        return null;
    }

    public void D(nq2 nq2Var, sp2 sp2Var, Collection collection) {
        ui1 ui1Var = (ui1) this.o;
        if (nq2Var != ui1Var.w || sp2Var == null) {
            if (nq2Var == ui1Var.d) {
                if (sp2Var != null) {
                    ui1Var.n(ui1Var.c, sp2Var);
                }
                tq2 tq2VarA = ui1Var.c.a();
                if (tq2VarA != null) {
                    tq2VarA.o(collection);
                    return;
                }
                return;
            }
            return;
        }
        vq2 vq2Var = ui1Var.v.a;
        String strD = sp2Var.d();
        tq2 tq2Var = new tq2(vq2Var, strD, ui1Var.b(vq2Var, strD));
        tq2Var.i(sp2Var);
        if (ui1Var.c == tq2Var) {
            return;
        }
        nq2 nq2Var2 = ui1Var.w;
        wq2 wq2Var = ui1Var.v;
        uq2 uq2Var = ui1Var.e;
        if (uq2Var != null) {
            uq2Var.a();
            ui1Var.e = null;
        }
        uq2 uq2Var2 = new uq2(ui1Var, tq2Var, nq2Var2, 3, true, wq2Var, collection);
        ui1Var.e = uq2Var2;
        uq2Var2.b();
        ui1Var.v = null;
        ui1Var.w = null;
    }

    public boolean F(int i, int i2, Bundle bundle) {
        return false;
    }

    @Override // defpackage.fv2
    public void a(qu2 qu2Var, boolean z) {
        ((bg) this.o).v(qu2Var);
    }

    @Override // defpackage.f51
    public int b() {
        return ((ExtendedFloatingActionButton) this.o).getCollapsedSize();
    }

    @Override // defpackage.yh0
    public void c() {
    }

    @Override // defpackage.f51
    public int d() {
        return ((ExtendedFloatingActionButton) this.o).getCollapsedSize();
    }

    @Override // defpackage.qn4
    public int e(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // defpackage.kd0
    public ClipData f() {
        return ((ContentInfo) this.o).getClip();
    }

    @Override // defpackage.jj1
    public void g(String str, String str2) {
        str.getClass();
        fo1 fo1Var = (fo1) this.o;
        if (fo1Var.c()) {
            jo joVar = new jo(fo1Var, str, str2, 4);
            do1 do1Var = new do1(0, str);
            fo1Var.r(true);
            io1.a.execute(new v6(do1Var, fo1Var, joVar, 10));
        }
    }

    @Override // defpackage.f4
    public boolean h(View view) {
        DrawerLayout drawerLayout = (DrawerLayout) this.o;
        if (!DrawerLayout.m(view) || drawerLayout.i(view) == 2) {
            return false;
        }
        drawerLayout.c(view, true);
        return true;
    }

    @Override // defpackage.p5
    public void i(Object obj) {
        Map map = (Map) obj;
        ld1 ld1Var = (ld1) this.o;
        ArrayList arrayList = new ArrayList(map.values());
        int[] iArr = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
        }
        gd1 gd1Var = (gd1) ld1Var.E.pollFirst();
        if (gd1Var == null) {
            Log.w("FragmentManager", "No permissions were requested for " + this);
        } else {
            String str = gd1Var.n;
            if (ld1Var.c.u(str) == null) {
                Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
            }
        }
    }

    @Override // defpackage.f51
    public int j() {
        return ((ExtendedFloatingActionButton) this.o).getCollapsedPadding();
    }

    @Override // defpackage.qn4
    public long k(int i) {
        rr2.l(i == 0);
        return 0L;
    }

    @Override // defpackage.yh0
    public Object l() {
        return this.o;
    }

    @Override // defpackage.qn4
    public List m(long j) {
        return j >= 0 ? (List) this.o : Collections.EMPTY_LIST;
    }

    @Override // defpackage.qn4
    public int n() {
        return 1;
    }

    @Override // defpackage.f51
    public ViewGroup.LayoutParams o() {
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) this.o;
        return new ViewGroup.LayoutParams(extendedFloatingActionButton.getCollapsedSize(), extendedFloatingActionButton.getCollapsedSize());
    }

    @Override // retrofit2.Callback
    public void onFailure(Call call, Throwable th) {
        ((hj) this.o).c.k(kb4.h(null));
    }

    @Override // retrofit2.Callback
    public void onResponse(Call call, Response response) {
        k03 k03Var = ((hj) this.o).c;
        if (!response.isSuccessful() || response.body() == null || ((ApiResponse) response.body()).getSubsonicResponse().getArtists() == null) {
            k03Var.k(kb4.h(null));
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<IndexID3> it = ((ApiResponse) response.body()).getSubsonicResponse().getArtists().getIndices().iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().getArtists());
        }
        k03Var.k(kb4.h(arrayList));
    }

    @Override // defpackage.st4
    public Cursor p(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        return ((ContentResolver) this.o).query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, q, "kind = 1 AND video_id = ?", new String[]{lastPathSegment}, null);
    }

    @Override // defpackage.d14
    public q04 q(q04 q04Var, db3 db3Var) {
        Resources resources = (Resources) this.o;
        if (q04Var == null) {
            return null;
        }
        return new at(resources, q04Var);
    }

    @Override // defpackage.kd0
    public int r() {
        return ((ContentInfo) this.o).getFlags();
    }

    @Override // defpackage.f51
    public int s() {
        return ((ExtendedFloatingActionButton) this.o).getCollapsedPadding();
    }

    @Override // defpackage.kd0
    public ContentInfo t() {
        return (ContentInfo) this.o;
    }

    public String toString() {
        switch (this.n) {
            case 17:
                return "ContentInfoCompat{" + ((ContentInfo) this.o) + "}";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.kd0
    public int u() {
        return ((ContentInfo) this.o).getSource();
    }

    @Override // defpackage.jj1
    public void v(String str) {
        fo1 fo1Var = (fo1) this.o;
        if (fo1Var.c()) {
            fo1Var.r(false);
            fo1Var.t(str);
        }
    }

    @Override // defpackage.fv2
    public boolean w(qu2 qu2Var) {
        Window.Callback callback = ((bg) this.o).y.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, qu2Var);
        return true;
    }

    @Override // defpackage.r83
    public pb5 x(View view, pb5 pb5Var) {
        pb5 pb5Var2;
        switch (this.n) {
            case 5:
                AppBarLayout appBarLayout = (AppBarLayout) this.o;
                WeakHashMap weakHashMap = j65.a;
                pb5Var2 = appBarLayout.getFitsSystemWindows() ? pb5Var : null;
                if (!Objects.equals(appBarLayout.t, pb5Var2)) {
                    appBarLayout.t = pb5Var2;
                    appBarLayout.setWillNotDraw(!(appBarLayout.I != null && appBarLayout.getTopInset() > 0));
                    appBarLayout.requestLayout();
                }
                return pb5Var;
            default:
                CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) this.o;
                WeakHashMap weakHashMap2 = j65.a;
                pb5Var2 = collapsingToolbarLayout.getFitsSystemWindows() ? pb5Var : null;
                if (!Objects.equals(collapsingToolbarLayout.N, pb5Var2)) {
                    collapsingToolbarLayout.N = pb5Var2;
                    collapsingToolbarLayout.requestLayout();
                }
                return pb5Var.a.c();
        }
    }

    public void y(int i, v3 v3Var, String str, Bundle bundle) {
    }

    public v3 z(int i) {
        return null;
    }

    public /* synthetic */ zh0(int i, Object obj) {
        this.n = i;
        this.o = obj;
    }

    public zh0(TextView textView) {
        this.n = 22;
        this.o = new j01(textView);
    }

    public zh0(ContentInfo contentInfo) {
        this.n = 17;
        contentInfo.getClass();
        this.o = hd0.m(contentInfo);
    }
}
