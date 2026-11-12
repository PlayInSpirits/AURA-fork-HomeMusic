package com.eddyizm.tempus.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.SearchView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import app.homemusic.R;
import com.eddyizm.tempus.interfaces.ClickCallback;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.b11;
import defpackage.b75;
import defpackage.b8;
import defpackage.bq4;
import defpackage.d8;
import defpackage.e75;
import defpackage.gb;
import defpackage.gh0;
import defpackage.i30;
import defpackage.k03;
import defpackage.kc1;
import defpackage.kf2;
import defpackage.kj;
import defpackage.kx3;
import defpackage.le1;
import defpackage.lj;
import defpackage.nc1;
import defpackage.nj;
import defpackage.nz2;
import defpackage.oc1;
import defpackage.os0;
import defpackage.s24;
import defpackage.s7;
import defpackage.ss0;
import defpackage.u7;
import defpackage.uo;
import defpackage.v23;
import defpackage.w7;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class ArtistListPageFragment extends kc1 implements ClickCallback {
    public oc1 l0;
    public MainActivity m0;
    public nj n0;
    public b8 o0;

    public ArtistListPageFragment() {
    }

    @Override // defpackage.kc1
    public final void F(Bundle r1) {
        super.F(r1);
        d0();
    }

    @Override // defpackage.kc1
    public final void G(Menu r2, MenuInflater r3) {
        r3.inflate(R.menu.toolbar_menu, r2);
        SearchView r4 = (SearchView) r2.findItem(R.id.action_search).getActionView();
        r4.setImeOptions(6);
        r4.setOnQueryTextListener(new w7(this, r4, 1));
        r4.setPadding(-32, 0, 0, 0);
    }

    @Override // defpackage.kc1
    public final View H(LayoutInflater r11, ViewGroup r12, Bundle r13) {
        this.m0 = (MainActivity) l();
        final int r0 = 0;
        View r14 = r11.inflate(R.layout.fragment_artist_list_page, r12, false);
        int r15 = R.id.app_bar_layout;
        AppBarLayout r3 = (AppBarLayout) uo.s(r14, R.id.app_bar_layout);
        if (r3 == null) goto L46;
        r15 = R.id.artist_info_sector;
        ConstraintLayout r4 = (ConstraintLayout) uo.s(r14, R.id.artist_info_sector);
        if (r4 == null) goto L46;
        r15 = R.id.artist_list_recycler_view;
        RecyclerView r5 = (RecyclerView) uo.s(r14, R.id.artist_list_recycler_view);
        if (r5 == null) goto L46;
        r15 = R.id.artist_list_sort_image_view;
        Button r6 = (Button) uo.s(r14, R.id.artist_list_sort_image_view);
        if (r6 == null) goto L46;
        r15 = R.id.page_subtitle_label;
        TextView r7 = (TextView) uo.s(r14, R.id.page_subtitle_label);
        if (r7 == null) goto L46;
        r15 = R.id.page_title_label;
        TextView r8 = (TextView) uo.s(r14, R.id.page_title_label);
        if (r8 == null) goto L46;
        r15 = R.id.toolbar;
        MaterialToolbar r9 = (MaterialToolbar) uo.s(r14, R.id.toolbar);
        if (r9 == null) goto L46;
        LinearLayout r2 = (LinearLayout) r14;
        this.l0 = new oc1(r2, r3, r4, r5, r6, r7, r8, r9);
        nc1 r16 = X();
        e75 r17 = r16.d();
        b75 r1 = gh0.r(r16);
        bq4 r10 = new bq4(r17, r1, b11.e(r16, r1));
        i30 r18 = kx3.a(nj.class);
        String r19 = r18.b();
        if (r19 == null) goto L44;
        this.n0 = (nj) r10.l(r18, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r19));
        Bundle r110 = this.s;
        if (r110 != null) goto L27;
        MainActivity r111 = this.m0;
        if (r111 == null) goto L25;
        v23 r112 = r111.T;
        if (r112 == null) goto L25;
        r112.o();
    L25:
        return r2;
    L27:
        if (r110.getString("ARTIST_STARRED") == null) goto L30;
        this.n0.e = "ARTIST_STARRED";
        this.l0.f.setText(R.string.artist_list_page_starred);
    L32:
        this.m0.o(this.l0.g);
        final int r113 = 1;
        if (this.m0.n() == null) goto L35;
        this.m0.n().f0(true);
        this.m0.n().g0();
    L35:
        this.l0.g.setNavigationOnClickListener(new kj(this, r113));
        this.l0.a.a(new u7(3, this));
        RecyclerView r114 = this.l0.c;
        Z();
        r114.setLayoutManager(new LinearLayoutManager(1));
        this.l0.c.setHasFixedSize(true);
        b8 r115 = new b8(this, 1);
        this.o0 = r115;
        this.l0.c.setAdapter(r115);
        nj r116 = this.n0;
        le1 r20 = v();
        r116.getClass();
        r116.f = new k03(new ArrayList());
        String r21 = r116.e;
        r21.getClass();
        if (r21.equals("ARTIST_STARRED") == false) goto L38;
        r116.f = r116.c.y(-1, false);
    L42:
        r116.f.e(v(), new d8(5, this));
        this.l0.c.setOnTouchListener(new s7(3, this));
        this.l0.d.setOnClickListener(new kj(this, r0));
        return r2;
    L38:
        if (r21.equals("ARTIST_DOWNLOADED") == false) goto L42;
        ss0 r117 = (ss0) r116.d.o;
        ((s24) r117.n).i().a(new String[]{"download"}, new os0(r117, 1)).e(r20, new lj(0));
        goto L42
    L30:
        if (r110.getString("ARTIST_DOWNLOADED") == null) goto L32;
        this.n0.e = "ARTIST_DOWNLOADED";
        this.l0.f.setText(R.string.artist_list_page_downloaded);
        goto L32
    L44:
        kf2.n("Local and anonymous classes can not be ViewModels");
        return null;
    L46:
        nz2.n("Missing required view with ID: ".concat(r14.getResources().getResourceName(r15)));
        return null;
    }

    @Override // defpackage.kc1
    public final void J() {
        this.R = true;
        this.l0 = null;
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onArtistClick(Bundle r3) {
        gb.x(a0()).m(R.id.artistPageFragment, r3, null);
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onArtistLongClick(Bundle r3) {
        gb.x(a0()).m(R.id.artistBottomSheetDialog, r3, null);
    }
}
