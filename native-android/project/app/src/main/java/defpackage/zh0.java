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
    public static final sw p = null;
    public static final String[] q = null;
    public final /* synthetic */ int n;
    public Object o;

    static {
        p = new sw(1);
        q = new String[]{"_data"};
    }

    public zh0(int r4) {
        this.n = r4;
        switch(r4) {
            case 2: goto L13;
            case 13: goto L10;
            case 26: goto L9;
            case 27: goto L6;
            default: goto L4;
        };
    L4:
        this.o = new HashMap();
        return;
    L6:
        this.o = new ef1(5, 1.0f, false);
        return;
    L10:
        this.o = AppDatabase.y().v();
        return;
    L9:
        return;
    L13:
        if (Build.VERSION.SDK_INT < 26) goto L15;
        this.o = new x3(this);
        return;
    L15:
        this.o = new w3(this);
    }

    public static void B(List r1) {
        Iterator r2 = r1.iterator();
        if (r2.hasNext() == true) goto L6;
        return;
    L6:
        throw xa3.d(r2);
    }

    public static zh0 E(be3 r6) {
        r6.O(2);
        int r0 = r6.A();
        int r1 = r0 >> 1;
        int r7 = (r6.A() >> 3) & 31;
        int r8 = r7 | ((r0 & 1) << 5);
        if (r1 == 4) goto L17;
        if (r1 == 5) goto L17;
        if (r1 == 7) goto L17;
        if (r1 == 8) goto L17;
        if (r1 != 9) goto L13;
        String r2 = "dvav";
    L18:
        StringBuilder r3 = xa3.i(r2);
        String r4 = ".";
        if (r1 >= 10) goto L21;
        String r5 = ".0";
    L22:
        r3.append(r5);
        r3.append(r1);
        if (r8 >= 10) goto L25;
        r4 = ".0";
    L25:
        r3.append(r4);
        r3.append(r8);
        int r9 = 20;
        return new zh0(r9, r3.toString());
    L21:
        r5 = ".";
        goto L22
    L13:
        if (r1 != 10) goto L15;
        r2 = "dav1";
        goto L18
    L15:
        return null;
    L17:
        r2 = "dvhe";
        goto L18
    }

    @Override // defpackage.o73
    public Object A() {
        switch(this.n) {
            case 15: goto L12;
            default: goto L4;
        };
    L4:
        Type r4 = (Type) this.o;
        if ((r4 instanceof ParameterizedType) == false) goto L10;
        Type r0 = ((ParameterizedType) r4).getActualTypeArguments()[0];
        if ((r0 instanceof Class) == true) goto L20;
        kf2.f(r4, "Invalid EnumMap type: ");
        return null;
    L20:
        return new EnumMap((Class) r0);
    L10:
        kf2.f(r4, "Invalid EnumMap type: ");
        return null;
    L12:
        Class r5 = (Class) this.o;
        return w15.a.a(r5);
    L15:
        e = move-exception;
        throw new RuntimeException("Unable to create instance of " + r5 + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e);
    }

    public v3 C(int r1) {
        return null;
    }

    public void D(nq2 r9, sp2 r10, Collection r11) {
        ui1 r1 = (ui1) this.o;
        if (r9 != r1.w) goto L14;
        if (r10 == null) goto L14;
        vq2 r8 = r1.v.a;
        String r12 = r10.d();
        tq2 r2 = new tq2(r8, r12, r1.b(r8, r12));
        r2.i(r10);
        if (r1.c == r2) goto L23;
        nq2 r3 = r1.w;
        wq2 r6 = r1.v;
        uq2 r13 = r1.e;
        if (r13 == null) goto L11;
        r13.a();
        r1.e = null;
    L11:
        uq2 r0 = new uq2(r1, r2, r3, 3, true, r6, r11);
        r1.e = r0;
        r0.b();
        r1.v = null;
        r1.w = null;
        return;
    L23:
        return;
    L14:
        if (r9 != r1.d) goto L21;
        if (r10 == null) goto L17;
        r1.n(r1.c, r10);
    L17:
        tq2 r14 = r1.c.a();
        if (r14 == null) goto L22;
        r14.o(r11);
        return;
    L22:
        return;
    }

    public boolean F(int r1, int r2, Bundle r3) {
        return false;
    }

    @Override // defpackage.fv2
    public void a(qu2 r1, boolean r2) {
        ((bg) this.o).v(r1);
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
    public int e(long r3) {
        if (r3 >= 0) goto L6;
        return 0;
    L6:
        return -1;
    }

    @Override // defpackage.kd0
    public ClipData f() {
        return hd0.d((ContentInfo) this.o);
    }

    @Override // defpackage.jj1
    public void g(String r4, String r5) {
        r4.getClass();
        fo1 r3 = (fo1) this.o;
        if (r3.c() == true) goto L5;
        return;
    L5:
        jo r0 = new jo(r3, r4, r5, 4);
        do1 r6 = new do1(0, r4);
        r3.r(true);
        io1.a.execute(new v6(r6, r3, r0, 10));
    }

    @Override // defpackage.f4
    public boolean h(View r3) {
        DrawerLayout r2 = (DrawerLayout) this.o;
        if (DrawerLayout.m(r3) == true) goto L5;
        return false;
    L5:
        if (r2.i(r3) == 2) goto L10;
        r2.c(r3, true);
        return true;
    L10:
        return false;
    }

    @Override // defpackage.p5
    public void i(Object r6) {
        Map r7 = (Map) r6;
        ld1 r0 = (ld1) this.o;
        String[] r1 = (String[]) r7.keySet().toArray(new String[0]);
        ArrayList r2 = new ArrayList(r7.values());
        int[] r8 = new int[r2.size()];
        int r3 = 0;
    L4:
        if (r3 >= r2.size()) goto L10;
        if (((Boolean) r2.get(r3)).booleanValue() == false) goto L8;
        int r4 = 0;
    L9:
        r8[r3] = r4;
        r3 = r3 + 1;
        goto L4
    L8:
        r4 = -1;
        goto L9
    L10:
        gd1 r9 = (gd1) r0.E.pollFirst();
        if (r9 != null) goto L14;
        Log.w("FragmentManager", "No permissions were requested for " + this);
        return;
    L14:
        String r5 = r9.n;
        if (r0.c.u(r5) != null) goto L21;
        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + r5);
        return;
    }

    @Override // defpackage.f51
    public int j() {
        return ((ExtendedFloatingActionButton) this.o).getCollapsedPadding();
    }

    @Override // defpackage.qn4
    public long k(int r1) {
        if (r1 != 0) goto L4;
        boolean r0 = true;
    L5:
        rr2.l(r0);
        return 0;
    L4:
        r0 = false;
        goto L5
    }

    @Override // defpackage.yh0
    public Object l() {
        return this.o;
    }

    @Override // defpackage.qn4
    public List m(long r3) {
        if (r3 < 0) goto L7;
        return (List) this.o;
    L7:
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.qn4
    public int n() {
        return 1;
    }

    @Override // defpackage.f51
    public ViewGroup.LayoutParams o() {
        ExtendedFloatingActionButton r2 = (ExtendedFloatingActionButton) this.o;
        return new ViewGroup.LayoutParams(r2.getCollapsedSize(), r2.getCollapsedSize());
    }

    @Override // retrofit2.Callback
    public void onFailure(Call r1, Throwable r2) {
        ((hj) this.o).c.k(kb4.h(null));
    }

    @Override // retrofit2.Callback
    public void onResponse(Call r2, Response r3) {
        k03 r1 = ((hj) this.o).c;
        if (r3.isSuccessful() == true) goto L5;
    L14:
        r1.k(kb4.h(null));
        return;
    L5:
        if (r3.body() == null) goto L14;
        if (((ApiResponse) r3.body()).getSubsonicResponse().getArtists() == null) goto L14;
        ArrayList r4 = new ArrayList();
        Iterator<IndexID3> r5 = ((ApiResponse) r3.body()).getSubsonicResponse().getArtists().getIndices().iterator();
    L10:
        if (r5.hasNext() == false) goto L12;
        r4.addAll(r5.next().getArtists());
        goto L10
    L12:
        r1.k(kb4.h(r4));
    }

    @Override // defpackage.st4
    public Cursor p(Uri r7) {
        String r8 = r7.getLastPathSegment();
        String[] r2 = q;
        return ((ContentResolver) this.o).query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, r2, "kind = 1 AND video_id = ?", new String[]{r8}, null);
    }

    @Override // defpackage.d14
    public q04 q(q04 r1, db3 r2) {
        Resources r0 = (Resources) this.o;
        if (r1 != null) goto L7;
        return null;
    L7:
        return new at(r0, r1);
    }

    @Override // defpackage.kd0
    public int r() {
        return hd0.c((ContentInfo) this.o);
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
        switch(this.n) {
            case 17: goto L7;
            default: goto L5;
        };
    L5:
        return super.toString();
    L7:
        return "ContentInfoCompat{" + ((ContentInfo) this.o) + "}";
    }

    @Override // defpackage.kd0
    public int u() {
        return hd0.x((ContentInfo) this.o);
    }

    @Override // defpackage.jj1
    public void v(String r2) {
        fo1 r1 = (fo1) this.o;
        if (r1.c() == true) goto L5;
        return;
    L5:
        r1.r(false);
        r1.t(r2);
    }

    @Override // defpackage.fv2
    public boolean w(qu2 r2) {
        Window.Callback r1 = ((bg) this.o).y.getCallback();
        if (r1 == null) goto L7;
        r1.onMenuOpened(108, r2);
        return true;
    L7:
        return true;
    }

    @Override // defpackage.r83
    public pb5 x(View r2, pb5 r3) {
        pb5 r0 = null;
        switch(this.n) {
            case 5: goto L12;
            default: goto L4;
        };
    L4:
        CollapsingToolbarLayout r1 = (CollapsingToolbarLayout) this.o;
        WeakHashMap r4 = j65.a;
        if (r1.getFitsSystemWindows() == false) goto L8;
        r0 = r3;
    L8:
        if (Objects.equals(r1.N, r0) == true) goto L11;
        r1.N = r0;
        r1.requestLayout();
    L11:
        return r3.a.c();
    L12:
        AppBarLayout r5 = (AppBarLayout) this.o;
        WeakHashMap r6 = j65.a;
        if (r5.getFitsSystemWindows() == false) goto L16;
        r0 = r3;
    L16:
        if (Objects.equals(r5.t, r0) == true) goto L24;
        r5.t = r0;
        if (r5.I != null) goto L20;
    L22:
        boolean r7 = false;
    L23:
        r5.setWillNotDraw(!r7);
        r5.requestLayout();
        goto L24
    L20:
        if (r5.getTopInset() <= 0) goto L22;
        r7 = true;
    L24:
        return r3;
    }

    public void y(int r1, v3 r2, String r3, Bundle r4) {
    }

    public v3 z(int r1) {
        return null;
    }

    public /* synthetic */ zh0(int r1, Object r2) {
        this.n = r1;
        this.o = r2;
    }

    public zh0(TextView r2) {
        this.n = 22;
        this.o = new j01(r2);
    }

    public zh0(ContentInfo r2) {
        this.n = 17;
        r2.getClass();
        this.o = hd0.m(r2);
    }
}
