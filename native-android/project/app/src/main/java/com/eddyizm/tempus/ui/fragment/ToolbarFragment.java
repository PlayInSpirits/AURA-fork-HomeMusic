package com.eddyizm.tempus.ui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.mediarouter.app.MediaRouteActionProvider;
import androidx.viewpager2.widget.ViewPager2;
import app.homemusic.AURAVersion;
import app.homemusic.R;
import com.eddyizm.tempus.database.AppDatabase;
import com.eddyizm.tempus.subsonic.models.MusicFolder;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.b11;
import defpackage.b75;
import defpackage.bj3;
import defpackage.bq4;
import defpackage.c52;
import defpackage.cp2;
import defpackage.dv4;
import defpackage.e5;
import defpackage.e75;
import defpackage.g7;
import defpackage.gh0;
import defpackage.hd5;
import defpackage.i30;
import defpackage.ie1;
import defpackage.k03;
import defpackage.kc1;
import defpackage.kf2;
import defpackage.kx3;
import defpackage.le1;
import defpackage.n92;
import defpackage.nc1;
import defpackage.nz2;
import defpackage.o54;
import defpackage.om0;
import defpackage.oo4;
import defpackage.rq2;
import defpackage.s24;
import defpackage.ud3;
import defpackage.uo;
import defpackage.vf2;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class ToolbarFragment extends kc1 {
    public ie1 l0;
    public MainActivity m0;
    public n92 n0;
    public vf2 o0;
    public final ArrayList p0;
    public String q0;

    public ToolbarFragment() {
        this.p0 = new ArrayList();
    }

    @Override // defpackage.kc1
    public final void F(Bundle r1) {
        super.F(r1);
        d0();
    }

    @Override // defpackage.kc1
    public final void G(Menu r3, MenuInflater r4) {
        r4.inflate(R.menu.main_page_menu, r3);
        Context r2 = Z();
        MenuItem r0 = r3.findItem(R.id.media_route_menu_item);
        if (r0 == null) goto L7;
        r0.setTitle(R.string.upnp_route_menu_title);
        View r1 = r0.getActionView();
        if ((r1 instanceof cp2) == false) goto L7;
        ((cp2) r1).setRemoteIndicatorDrawable(r2.getDrawable(R.drawable.ic_cast_audio));
    L7:
        MenuItem r5 = r3.findItem(R.id.media_route_menu_item);
        if (r5 == null) goto L36;
        MediaRouteActionProvider r6 = null;
        if ((r5 instanceof oo4) == false) goto L13;
        e5 r7 = ((oo4) r5).b();
    L15:
        if ((r7 instanceof MediaRouteActionProvider) == false) goto L17;
        r6 = (MediaRouteActionProvider) r7;
    L17:
        if (r6 != null) goto L20;
        Log.w("UpnpRouteSetup", "route item has no MediaRouteActionProvider, leaving it alone");
        return;
    L20:
        c52 r8 = new c52();
        rq2 r9 = r6.c;
        if (r9 == null) goto L32;
        r8.a(r9.b());
        r8.b("com.eddyizm.tempus.UPNP");
        rq2 r10 = r8.d();
        if (r10 != null) goto L25;
        kf2.n("selector must not be null");
        return;
    L25:
        if (r6.c.equals(r10) == true) goto L34;
        r6.c = r10;
        cp2 r11 = r6.e;
        if (r11 == null) goto L35;
        r11.setRouteSelector(r10);
        return;
    L35:
        return;
    L34:
        return;
    L32:
        kf2.n("selector must not be null");
        return;
    L13:
        Log.w("MenuItemCompat", "getActionProvider: item does not implement SupportMenuItem; returning null");
        r7 = null;
        goto L15
    }

    @Override // defpackage.kc1
    public final View H(LayoutInflater r6, ViewGroup r7, Bundle r8) {
        this.m0 = (MainActivity) l();
        View r9 = r6.inflate(R.layout.fragment_toolbar, r7, false);
        AppBarLayout r10 = (AppBarLayout) r9;
        int r11 = R.id.toolbar;
        if (((MaterialToolbar) uo.s(r9, R.id.toolbar)) == null) goto L18;
        r11 = R.id.toolbar_music_library_text_view;
        TextView r0 = (TextView) uo.s(r9, R.id.toolbar_music_library_text_view);
        if (r0 == null) goto L18;
        r11 = R.id.toolbar_title_container;
        LinearLayout r2 = (LinearLayout) uo.s(r9, R.id.toolbar_title_container);
        if (r2 == null) goto L18;
        this.l0 = new ie1(r10, r0, r2);
        nc1 r12 = X();
        e75 r13 = r12.d();
        b75 r1 = gh0.r(r12);
        bq4 r3 = new bq4(r13, r1, b11.e(r12, r1));
        i30 r14 = kx3.a(n92.class);
        String r15 = r14.b();
        if (r15 == null) goto L16;
        this.n0 = (n92) r3.l(r14, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r15));
        nc1 r16 = X();
        e75 r17 = r16.d();
        b75 r4 = gh0.r(r16);
        bq4 r5 = new bq4(r17, r4, b11.e(r16, r4));
        i30 r18 = kx3.a(vf2.class);
        String r19 = r18.b();
        if (r19 == null) goto L14;
        this.o0 = (vf2) r5.l(r18, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r19));
        return r10;
    L14:
        kf2.n("Local and anonymous classes can not be ViewModels");
        return null;
    L16:
        kf2.n("Local and anonymous classes can not be ViewModels");
        return null;
    L18:
        nz2.n("Missing required view with ID: ".concat(r9.getResources().getResourceName(r11)));
        return null;
    }

    @Override // defpackage.kc1
    public final void J() {
        this.R = true;
        this.l0 = null;
    }

    @Override // defpackage.kc1
    public final boolean N(MenuItem r5) {
        if (r5.getItemId() != R.id.action_search) goto L7;
        AURAVersion.pendingSearch = true;
        this.m0.T.m(R.id.hubFragment, null, null);
        return true;
    L7:
        if (r5.getItemId() != R.id.action_settings) goto L10;
        this.m0.T.m(R.id.settingsFragment, null, null);
        return true;
    L10:
        return false;
    }

    @Override // defpackage.kc1
    public final void P() {
        this.R = true;
        h0();
    }

    @Override // defpackage.kc1
    public final void T(View r4, Bundle r5) {
        if ((this.I instanceof DownloadFragment) == false) goto L5;
        return;
    L5:
        this.l0.a.setOnClickListener(new bj3(16, this));
        n92 r6 = this.n0;
        le1 r7 = v();
        k03 r0 = r6.h;
        final int r2 = 0;
        if (r0.d() != null) goto L8;
        r6.c.getClass();
        om0.X().e(r7, new g7(r0, 0));
    L8:
        r0.e(v(), new dv4(this, r2));
        final int r1 = 1;
        this.o0.d.e(v(), new dv4(this, r1));
        final int r3 = 2;
        ((s24) AppDatabase.y().G().n).i().a(new String[]{"server"}, new o54(14)).e(v(), new dv4(this, r3));
    }

    public final void h0() {
        if (this.l0 == null) goto L64;
        ArrayList r0 = this.p0;
        boolean r2 = true;
        int r3 = 0;
        if (r0.size() <= 1) goto L8;
    L9:
        kc1 r1 = this.I;
        if ((r1 instanceof DownloadFragment) == false) goto L12;
    L18:
        boolean r4 = false;
    L19:
        if (r4 == true) goto L27;
        String r5 = this.q0;
        if (r5 == null) goto L27;
        if ((this.I instanceof DownloadFragment) == true) goto L27;
        if (r5.equalsIgnoreCase(s(R.string.app_name)) == true) goto L27;
    L28:
        this.l0.a.setClickable(r4);
        TextView r6 = this.l0.b;
        if (r4 == true) goto L33;
        if (r2 == true) goto L33;
        int r7 = 8;
    L34:
        r6.setVisibility(r7);
        TextView r8 = this.l0.b;
        if (r4 == false) goto L37;
        int r9 = R.drawable.ic_expand_more_small;
    L38:
        r8.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, r9, 0);
        if (r2 == false) goto L42;
        this.l0.b.setText(this.q0);
        return;
    L42:
        if (r4 == true) goto L44;
        return;
    L44:
        String r10 = ud3.k();
        if (r10 != null) goto L47;
        r10 = null;
    L55:
        TextView r11 = this.l0.b;
        if (r10 != null) goto L59;
        r10 = s(R.string.settings_music_library_all);
    L59:
        r11.setText(r10);
        return;
    L47:
        int r12 = r0.size();
    L48:
        if (r3 >= r12) goto L55;
        Object r13 = r0.get(r3);
        r3 = r3 + 1;
        MusicFolder r14 = (MusicFolder) r13;
        if (r10.equals(r14.getId()) == false) goto L48;
        if (r14.getName() == null) goto L54;
        r10 = r14.getName();
        goto L55
    L54:
        r10 = r14.getId();
        goto L55
    L37:
        r9 = 0;
    L33:
        r7 = 0;
    L27:
        r2 = false;
        goto L28
    L12:
        if ((r1 instanceof HomeFragment) == false) goto L17;
        hd5 r15 = ((HomeFragment) r1).l0;
        if (r15 == null) goto L18;
        if (((ViewPager2) r15.p).getCurrentItem() != 0) goto L18;
    L17:
        r4 = true;
        goto L19
    L8:
        if (ud3.k() == null) goto L18;
    }
}
