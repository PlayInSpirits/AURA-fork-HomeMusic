package com.eddyizm.tempus.ui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.SearchView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import app.homemusic.R;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.interfaces.ClickCallback;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.b11;
import defpackage.b75;
import defpackage.bq4;
import defpackage.e75;
import defpackage.ek1;
import defpackage.gb;
import defpackage.gh0;
import defpackage.i30;
import defpackage.kc1;
import defpackage.kf2;
import defpackage.kx3;
import defpackage.lv4;
import defpackage.m7;
import defpackage.n7;
import defpackage.nc1;
import defpackage.nz2;
import defpackage.q7;
import defpackage.r7;
import defpackage.s7;
import defpackage.t7;
import defpackage.u7;
import defpackage.uo;
import defpackage.ut4;
import defpackage.w7;
import defpackage.y7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class AlbumCatalogueFragment extends kc1 implements ClickCallback {
    public lv4 l0;
    public MainActivity m0;
    public y7 n0;
    public int o0;
    public int p0;
    public q7 q0;
    public String r0;
    public List s0;

    public AlbumCatalogueFragment() {
        this.o0 = 2;
        this.p0 = 20;
    }

    @Override // defpackage.kc1
    public final void F(Bundle r4) {
        super.F(r4);
        d0();
        App.b().getClass();
        String r1 = "ALBUM_ORDER_BY_NAME";
        String r5 = App.c().getString("album_sort_order", "ALBUM_ORDER_BY_NAME");
        if (r5 == null) goto L6;
        r1 = r5;
    L6:
        this.r0 = r1;
        nc1 r6 = X();
        e75 r0 = r6.d();
        b75 r2 = gh0.r(r6);
        bq4 r3 = new bq4(r0, r2, b11.e(r6, r2));
        i30 r7 = kx3.a(y7.class);
        String r8 = r7.b();
        if (r8 == null) goto L10;
        y7 r9 = (y7) r3.l(r7, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r8));
        this.n0 = r9;
        r9.e = 0;
        r9.f = 1;
        r9.c.k(new ArrayList());
        r9.c();
        return;
    L10:
        kf2.n("Local and anonymous classes can not be ViewModels");
    }

    @Override // defpackage.kc1
    public final void G(Menu r2, MenuInflater r3) {
        r3.inflate(R.menu.toolbar_menu, r2);
        SearchView r4 = (SearchView) r2.findItem(R.id.action_search).getActionView();
        r4.setImeOptions(6);
        r4.setOnQueryTextListener(new w7(this, r4, 0));
        r4.setPadding(-32, 0, 0, 0);
    }

    @Override // defpackage.kc1
    public final View H(LayoutInflater r11, ViewGroup r12, Bundle r13) {
        this.m0 = (MainActivity) l();
        final int r0 = 0;
        View r14 = r11.inflate(R.layout.fragment_album_catalogue, r12, false);
        int r15 = R.id.album_catalogue_recycler_view;
        RecyclerView r3 = (RecyclerView) uo.s(r14, R.id.album_catalogue_recycler_view);
        if (r3 == null) goto L29;
        r15 = R.id.album_info_sector;
        ConstraintLayout r4 = (ConstraintLayout) uo.s(r14, R.id.album_info_sector);
        if (r4 == null) goto L29;
        r15 = R.id.album_list_progress_loader;
        ProgressBar r5 = (ProgressBar) uo.s(r14, R.id.album_list_progress_loader);
        if (r5 == null) goto L29;
        r15 = R.id.album_list_sort_image_view;
        Button r6 = (Button) uo.s(r14, R.id.album_list_sort_image_view);
        if (r6 == null) goto L29;
        r15 = R.id.albumListSortTextView;
        TextView r7 = (TextView) uo.s(r14, R.id.albumListSortTextView);
        if (r7 == null) goto L29;
        r15 = R.id.app_bar_layout;
        AppBarLayout r8 = (AppBarLayout) uo.s(r14, R.id.app_bar_layout);
        if (r8 == null) goto L29;
        r15 = R.id.sort_container;
        if (((LinearLayout) uo.s(r14, R.id.sort_container)) == null) goto L29;
        r15 = R.id.toolbar;
        MaterialToolbar r9 = (MaterialToolbar) uo.s(r14, R.id.toolbar);
        if (r9 == null) goto L29;
        LinearLayout r2 = (LinearLayout) r14;
        this.l0 = new lv4(r2, r3, r4, r5, r6, r7, r8, r9);
        ut4.c().b(Z());
        ut4 r16 = ut4.c();
        Context r17 = Z();
        if (r16.h == true) goto L21;
        r16.b(r17);
    L21:
        this.o0 = r16.b;
        ut4 r18 = ut4.c();
        Context r19 = Z();
        if (r18.h == true) goto L24;
        r18.b(r19);
    L24:
        this.p0 = r18.c;
        this.m0.o((MaterialToolbar) this.l0.t);
        final int r110 = 1;
        if (this.m0.n() == null) goto L27;
        this.m0.n().f0(true);
        this.m0.n().g0();
    L27:
        ((MaterialToolbar) this.l0.t).setNavigationOnClickListener(new t7(this, r110));
        ((AppBarLayout) this.l0.s).a(new u7(r0, this));
        RecyclerView r111 = (RecyclerView) this.l0.n;
        Z();
        r111.setLayoutManager(new GridLayoutManager(this.o0));
        ((RecyclerView) this.l0.n).i(new ek1(this.o0, this.p0));
        ((RecyclerView) this.l0.n).setHasFixedSize(true);
        q7 r112 = new q7(this);
        this.q0 = r112;
        r112.p = 2;
        r112.n.g();
        ((RecyclerView) this.l0.n).setAdapter(this.q0);
        this.n0.c.e(v(), new r7(this, r110));
        ((RecyclerView) this.l0.n).setOnTouchListener(new s7(r0, this));
        ((Button) this.l0.r).setOnClickListener(new t7(this, r0));
        this.n0.d.e(v(), new r7(this, r0));
        return r2;
    L29:
        nz2.n("Missing required view with ID: ".concat(r14.getResources().getResourceName(r15)));
        return null;
    }

    @Override // defpackage.kc1
    public final void I() {
        this.R = true;
        this.n0.f = 2;
    }

    @Override // defpackage.kc1
    public final void J() {
        this.R = true;
        this.l0 = null;
    }

    @Override // defpackage.kc1
    public final void P() {
        this.R = true;
        String r1 = "ALBUM_ORDER_BY_NAME";
        String r0 = b11.m("album_sort_order", "ALBUM_ORDER_BY_NAME");
        if (r0 == null) goto L7;
        r1 = r0;
    L7:
        if (r1.equals(this.r0) == true) goto L10;
        this.r0 = r1;
    L10:
        if (this.s0 == null) goto L15;
        String r2 = this.r0;
        if (r2 == null) goto L15;
        h0(r2);
        return;
    L15:
        Log.d("AlbumCatalogueFragment", "onResume - Cannot re-sort, missing data");
    }

    public final void h0(String r10) {
        List r0 = this.s0;
        if (r0 == null) goto L54;
        q7 r1 = this.q0;
        r1.getClass();
        r1.t = new ArrayList(r0);
        r1.s = new ArrayList(r0);
        r1.d();
        if (r10 == null) goto L53;
        q7 r9 = this.q0;
        List r2 = r9.s;
        if (r2 == null) goto L55;
        byte r8 = -1;
        switch(r10.hashCode()) {
            case -1987032272: goto L38;
            case -1687333910: goto L34;
            case -1031702909: goto L30;
            case -569472142: goto L26;
            case -569140956: goto L22;
            case -519941048: goto L18;
            case 2136821358: goto L14;
            default: goto L41;
        };
    L41:
        Comparator r11 = String.CASE_INSENSITIVE_ORDER;
        switch(r8) {
            case 0: goto L50;
            case 1: goto L49;
            case 2: goto L48;
            case 3: goto L47;
            case 4: goto L46;
            case 5: goto L45;
            case 6: goto L44;
            default: goto L51;
        };
    L44:
        r2.sort(Comparator.comparing(new m7(1), r11).thenComparing(new m7(2)));
        goto L51
    L45:
        r2.sort(Comparator.comparing(new m7(5)));
        Collections.reverse(r9.s);
        goto L51
    L46:
        r2.sort(Comparator.comparing(new m7(2)));
        goto L51
    L47:
        r2.sort(Comparator.comparing(new m7(0), r11));
        goto L51
    L48:
        r2.sort(Comparator.comparing(new m7(4), Comparator.nullsLast(new n7(0))));
        Collections.reverse(r9.s);
        goto L51
    L49:
        Collections.shuffle(r2);
        goto L51
    L50:
        r2.sort(Comparator.comparing(new m7(3), Comparator.nullsLast(new n7(0))));
        Collections.reverse(r9.s);
    L51:
        r9.d();
        return;
    L14:
        if (r10.equals("ALBUM_ORDER_BY_ARTIST") == false) goto L41;
        r8 = 6;
        goto L41
    L18:
        if (r10.equals("ALBUM_ORDER_BY_MOST_PLAYED") == false) goto L41;
        r8 = 5;
        goto L41
    L22:
        if (r10.equals("ALBUM_ORDER_BY_YEAR") == false) goto L41;
        r8 = 4;
        goto L41
    L26:
        if (r10.equals("ALBUM_ORDER_BY_NAME") == false) goto L41;
        r8 = 3;
        goto L41
    L30:
        if (r10.equals("ALBUM_ORDER_BY_RECENTLY_PLAYED") == false) goto L41;
        r8 = 2;
        goto L41
    L34:
        if (r10.equals("ALBUM_ORDER_BY_RANDOM") == false) goto L41;
        r8 = 1;
        goto L41
    L38:
        if (r10.equals("ALBUM_ORDER_BY_RECENTLY_ADDED") == false) goto L41;
        r8 = 0;
        goto L41
    L55:
        return;
    L53:
        return;
    }

    public final void i0(View r2) {
        ((InputMethodManager) X().getSystemService("input_method")).hideSoftInputFromWindow(r2.getWindowToken(), 0);
    }

    public final void j0() {
        if (this.l0 != null) goto L5;
        return;
    L5:
        String r0 = this.r0;
        String r2 = "";
        if (r0 == null) goto L48;
        byte r4 = -1;
        switch(r0.hashCode()) {
            case -1987032272: goto L36;
            case -1687333910: goto L32;
            case -1031702909: goto L28;
            case -569472142: goto L24;
            case -569140956: goto L20;
            case -519941048: goto L16;
            case 2136821358: goto L12;
            default: goto L39;
        };
    L39:
        switch(r4) {
            case 0: goto L47;
            case 1: goto L46;
            case 2: goto L45;
            case 3: goto L44;
            case 4: goto L43;
            case 5: goto L42;
            case 6: goto L41;
            default: goto L48;
        };
    L41:
        r2 = s(R.string.menu_group_by_artist);
        goto L48
    L42:
        r2 = s(R.string.menu_sort_most_played);
        goto L48
    L43:
        r2 = s(R.string.menu_sort_year);
        goto L48
    L44:
        r2 = s(R.string.menu_sort_name);
        goto L48
    L45:
        r2 = s(R.string.menu_sort_recently_played);
        goto L48
    L46:
        r2 = s(R.string.menu_sort_random);
        goto L48
    L47:
        r2 = s(R.string.menu_sort_recently_added);
        goto L48
    L12:
        if (r0.equals("ALBUM_ORDER_BY_ARTIST") == false) goto L39;
        r4 = 6;
        goto L39
    L16:
        if (r0.equals("ALBUM_ORDER_BY_MOST_PLAYED") == false) goto L39;
        r4 = 5;
        goto L39
    L20:
        if (r0.equals("ALBUM_ORDER_BY_YEAR") == false) goto L39;
        r4 = 4;
        goto L39
    L24:
        if (r0.equals("ALBUM_ORDER_BY_NAME") == false) goto L39;
        r4 = 3;
        goto L39
    L28:
        if (r0.equals("ALBUM_ORDER_BY_RECENTLY_PLAYED") == false) goto L39;
        r4 = 2;
        goto L39
    L32:
        if (r0.equals("ALBUM_ORDER_BY_RANDOM") == false) goto L39;
        r4 = 1;
        goto L39
    L36:
        if (r0.equals("ALBUM_ORDER_BY_RECENTLY_ADDED") == false) goto L39;
        r4 = 0;
    L48:
        ((TextView) this.l0.p).setText(r2);
        ((TextView) this.l0.p).setVisibility(0);
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onAlbumClick(Bundle r4) {
        gb.x(a0()).m(R.id.albumPageFragment, r4, null);
        i0(a0());
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onAlbumLongClick(Bundle r3) {
        gb.x(a0()).m(R.id.albumBottomSheetDialog, r3, null);
    }
}
