package com.eddyizm.tempus.ui.fragment;

import android.content.ComponentName;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SearchView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import app.homemusic.R;
import com.eddyizm.tempus.interfaces.ClickCallback;
import com.eddyizm.tempus.service.MediaService;
import com.eddyizm.tempus.subsonic.models.AlbumID3;
import com.eddyizm.tempus.subsonic.models.ArtistID3;
import com.eddyizm.tempus.subsonic.models.Genre;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.aj2;
import defpackage.au;
import defpackage.b11;
import defpackage.b75;
import defpackage.bd1;
import defpackage.bj2;
import defpackage.bl2;
import defpackage.bo2;
import defpackage.bq4;
import defpackage.cb4;
import defpackage.e75;
import defpackage.eg0;
import defpackage.ei4;
import defpackage.f35;
import defpackage.fi0;
import defpackage.g12;
import defpackage.gb;
import defpackage.gh0;
import defpackage.i30;
import defpackage.jx3;
import defpackage.jz4;
import defpackage.k03;
import defpackage.kc1;
import defpackage.kf2;
import defpackage.kx3;
import defpackage.le1;
import defpackage.li3;
import defpackage.mb0;
import defpackage.nc1;
import defpackage.ni4;
import defpackage.nz2;
import defpackage.o;
import defpackage.oi4;
import defpackage.p6;
import defpackage.pi4;
import defpackage.qi4;
import defpackage.rb0;
import defpackage.ri4;
import defpackage.rm3;
import defpackage.s7;
import defpackage.sb0;
import defpackage.si4;
import defpackage.sk2;
import defpackage.so1;
import defpackage.ss2;
import defpackage.ti4;
import defpackage.u7;
import defpackage.ui4;
import defpackage.uo;
import defpackage.up0;
import defpackage.v13;
import defpackage.v23;
import defpackage.vo1;
import defpackage.w7;
import defpackage.wb0;
import defpackage.wd1;
import defpackage.wn1;
import defpackage.wo1;
import defpackage.x7;
import defpackage.xc5;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class SongListPageFragment extends kc1 implements ClickCallback {
    public up0 l0;
    public MainActivity m0;
    public ui4 n0;
    public li3 o0;
    public ni4 p0;
    public bl2 q0;
    public boolean r0;
    public int s0;

    public SongListPageFragment() {
        this.r0 = true;
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
        r4.setOnQueryTextListener(new w7(this, r4, 6));
        r4.setPadding(-32, 0, 0, 0);
    }

    @Override // defpackage.kc1
    public final View H(LayoutInflater r24, ViewGroup r25, Bundle r26) {
        this.m0 = (MainActivity) l();
        View r0 = r24.inflate(R.layout.fragment_song_list_page, r25, false);
        int r2 = R.id.album_info_sector;
        ConstraintLayout r12 = (ConstraintLayout) uo.s(r0, R.id.album_info_sector);
        if (r12 == null) goto L92;
        r2 = R.id.app_bar_layout;
        AppBarLayout r13 = (AppBarLayout) uo.s(r0, R.id.app_bar_layout);
        if (r13 == null) goto L92;
        r2 = R.id.page_subtitle_label;
        TextView r14 = (TextView) uo.s(r0, R.id.page_subtitle_label);
        if (r14 == null) goto L92;
        r2 = R.id.page_title_label;
        TextView r15 = (TextView) uo.s(r0, R.id.page_title_label);
        if (r15 == null) goto L92;
        r2 = R.id.song_list_recycler_view;
        RecyclerView r16 = (RecyclerView) uo.s(r0, R.id.song_list_recycler_view);
        if (r16 == null) goto L92;
        r2 = R.id.song_list_shuffle_image_view;
        Button r17 = (Button) uo.s(r0, R.id.song_list_shuffle_image_view);
        if (r17 == null) goto L92;
        r2 = R.id.song_list_sort_image_view;
        Button r18 = (Button) uo.s(r0, R.id.song_list_sort_image_view);
        if (r18 == null) goto L92;
        r2 = R.id.swipe_song_list_to_refresh;
        SwipeRefreshLayout r19 = (SwipeRefreshLayout) uo.s(r0, R.id.swipe_song_list_to_refresh);
        if (r19 == null) goto L92;
        r2 = R.id.toolbar;
        MaterialToolbar r20 = (MaterialToolbar) uo.s(r0, R.id.toolbar);
        if (r20 == null) goto L92;
        LinearLayout r11 = (LinearLayout) r0;
        this.l0 = new up0(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20);
        nc1 r1 = X();
        e75 r3 = r1.d();
        b75 r4 = gh0.r(r1);
        bq4 r5 = new bq4(r3, r4, b11.e(r1, r4));
        i30 r6 = kx3.a(ui4.class);
        String r7 = r6.b();
        if (r7 == null) goto L90;
        this.n0 = (ui4) r5.l(r6, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r7));
        nc1 r8 = X();
        e75 r9 = r8.d();
        b75 r10 = gh0.r(r8);
        bq4 r21 = new bq4(r9, r10, b11.e(r8, r10));
        i30 r22 = kx3.a(li3.class);
        String r23 = r22.b();
        if (r23 == null) goto L88;
        this.o0 = (li3) r21.l(r22, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r23));
        Bundle r27 = this.s;
        if (r27 != null) goto L33;
        MainActivity r28 = this.m0;
        if (r28 == null) goto L87;
        v23 r29 = r28.T;
        if (r29 == null) goto L87;
        r29.o();
        return r11;
    L87:
        return r11;
    L33:
        if (r27.getString("MEDIA_RECENTLY_PLAYED") == null) goto L36;
        ui4 r30 = this.n0;
        r30.e = "MEDIA_RECENTLY_PLAYED";
        r30.f = s(R.string.song_list_page_recently_played);
        ((TextView) this.l0.d).setText(R.string.song_list_page_recently_played);
    L78:
        this.m0.o((MaterialToolbar) this.l0.i);
        if (this.m0.n() == null) goto L81;
        this.m0.n().f0(true);
        this.m0.n().g0();
    L81:
        ((MaterialToolbar) this.l0.i).setNavigationOnClickListener(new pi4(this, 0));
        ((AppBarLayout) this.l0.b).a(new u7(10, this));
        this.n0.c().e(v(), new oi4(this, 1));
        RecyclerView r31 = (RecyclerView) this.l0.e;
        Z();
        r31.setLayoutManager(new LinearLayoutManager(1));
        ((RecyclerView) this.l0.e).setHasFixedSize(true);
        ni4 r32 = new ni4(v(), this, true, false, null);
        this.p0 = r32;
        ((RecyclerView) this.l0.e).setAdapter(r32);
        final ni4 r33 = this.p0;
        MaterialToolbar r34 = (MaterialToolbar) this.l0.i;
        final boolean r35 = "MEDIA_STARRED".equals(this.n0.e);
        final String r36 = v13.c(this.n0.e);
        final ei4 r37 = new ei4(1, this);
        final si4 r38 = new si4(this, 1);
        r33.getClass();
        final rm3 r110 = new rm3(20);
        final Context r39 = r34.getContext();
        MaterialToolbar r111 = new MaterialToolbar(r39);
        r111.setBackgroundColor(g12.s(r34.getContext(), R.attr.colorSurface, -16777216));
        r111.setNavigationIcon(R.drawable.ic_close);
        r111.setNavigationContentDescription(R.string.homemusic_selection_close);
        r111.m(R.menu.homemusic_song_selection);
        r111.setVisibility(8);
        ViewParent r40 = r34.getParent();
        r40.getClass();
        ViewGroup r41 = (ViewGroup) r40;
        r41.addView(r111, r41.indexOfChild(r34) + 1, new ViewGroup.LayoutParams(-1, r34.getLayoutParams().height));
        bd1 r42 = new bd1(2, r110);
        X().i().a(v(), r42);
        r110.o = new vo1(r110, r111, r34, r42, r39, r35, r33);
        r111.setNavigationOnClickListener(new p6(18, r110));
        r111.setOnMenuItemClickListener(new so1(this, r110, r33, r35, r38, r39, r37, r36));
        if (r35 == false) goto L84;
        q().a0("homemusic_remove_from_liked", v(), new eg0(r33, this, r38, 2));
    L84:
        le1 r43 = v();
        r43.e();
        r43.r.a(new wo1(0, r110));
        jz4.h(r110, r111, r34, r42, r39, r35, r33);
        r33.B = r110;
        this.p0.A = this.q0;
        j0();
        int r44 = this.s0 + 1;
        this.s0 = r44;
        this.n0.c().e(v(), new ri4(r44, 1, this));
        RecyclerView r45 = (RecyclerView) this.l0.e;
        r45.j(new ti4(this, (LinearLayoutManager) r45.getLayoutManager()));
        ((RecyclerView) this.l0.e).setOnTouchListener(new s7(10, this));
        ((Button) this.l0.g).setOnClickListener(new pi4(this, 2));
        ((SwipeRefreshLayout) this.l0.h).setOnRefreshListener(new ss2(19, this));
        if ("MEDIA_STARRED".equals(this.n0.e) == false) goto L87;
        si4 r46 = new si4(this, 0);
        jx3 r47 = new jx3();
        k03 r48 = wn1.a;
        r47.n = r48.d();
        r48.e(v(), new wd1(new o(10, r47, r46), 1));
        goto L87
    L36:
        if (r27.getString("MEDIA_MOST_PLAYED") == null) goto L39;
        ui4 r49 = this.n0;
        r49.e = "MEDIA_MOST_PLAYED";
        r49.f = s(R.string.song_list_page_most_played);
        ((TextView) this.l0.d).setText(R.string.song_list_page_most_played);
        goto L78
    L39:
        if (r27.getString("MEDIA_RECENTLY_ADDED") == null) goto L42;
        ui4 r50 = this.n0;
        r50.e = "MEDIA_RECENTLY_ADDED";
        r50.f = s(R.string.song_list_page_recently_added);
        ((TextView) this.l0.d).setText(R.string.song_list_page_recently_added);
        goto L78
    L42:
        if (r27.getString("MEDIA_BY_GENRE") == null) goto L45;
        ui4 r51 = this.n0;
        r51.e = "MEDIA_BY_GENRE";
        r51.g = (Genre) r27.getParcelable("GENRE_OBJECT");
        ui4 r52 = this.n0;
        r52.f = r52.g.getGenre();
        ((TextView) this.l0.d).setText(this.n0.g.getGenre());
        goto L78
    L45:
        if (r27.getString("MEDIA_BY_ARTIST") == null) goto L48;
        ui4 r53 = this.n0;
        r53.e = "MEDIA_BY_ARTIST";
        r53.h = (ArtistID3) r27.getParcelable("ARTIST_OBJECT");
        ui4 r54 = this.n0;
        r54.f = t(R.string.song_list_page_top, new Object[]{r54.h.getName()});
        ((TextView) this.l0.d).setText(t(R.string.song_list_page_top, new Object[]{this.n0.h.getName()}));
        goto L78
    L48:
        if (r27.getString("MEDIA_BY_GENRES") == null) goto L51;
        ui4 r55 = this.n0;
        r55.e = "MEDIA_BY_GENRES";
        r55.k = r27.getStringArrayList("filters_list");
        this.n0.l = r27.getStringArrayList("filter_name_list");
        ui4 r56 = this.n0;
        r56.f = TextUtils.join(", ", r56.l);
        ((TextView) this.l0.d).setText(TextUtils.join(", ", this.n0.l));
        goto L78
    L51:
        if (r27.getString("MEDIA_BY_YEAR") == null) goto L54;
        ui4 r57 = this.n0;
        r57.e = "MEDIA_BY_YEAR";
        r57.m = r27.getInt("year_object");
        ui4 r58 = this.n0;
        r58.f = t(R.string.song_list_page_year, new Object[]{Integer.valueOf(r58.m)});
        ((TextView) this.l0.d).setText(t(R.string.song_list_page_year, new Object[]{Integer.valueOf(this.n0.m)}));
        goto L78
    L54:
        if (r27.getString("MEDIA_STARRED") == null) goto L73;
        ui4 r59 = this.n0;
        r59.e = "MEDIA_STARRED";
        r59.f = s(R.string.song_list_page_starred);
        ((TextView) this.l0.d).setText(R.string.song_list_page_starred);
        up0 r60 = this.l0;
        ConstraintLayout r61 = (ConstraintLayout) r60.a;
        TextView r62 = (TextView) r60.d;
        k03 r63 = wn1.a;
        Context r64 = r61.getContext();
        Resources r65 = r64.getResources();
        float r66 = r65.getDisplayMetrics().density;
        int r67 = (int) (Math.min(r65.getConfiguration().screenWidthDp - 128, (r65.getConfiguration().screenHeightDp * 2) / 5) * r66);
        int r68 = (r67 * 14) / 52;
        Drawable r112 = r64.getDrawable(R.drawable.bg_homemusic_liked);
        r112.getClass();
        Drawable r113 = r112.mutate();
        r113.getClass();
        if ((r113 instanceof GradientDrawable) == false) goto L58;
        GradientDrawable r114 = (GradientDrawable) r113;
    L59:
        if (r114 == null) goto L61;
        r114.setCornerRadius(12.0f * r66);
    L61:
        ImageView r69 = new ImageView(r64);
        r69.setId(View.generateViewId());
        r69.setBackground(r113);
        r69.setImageResource(R.drawable.ic_favorite);
        r69.setImageTintList(ColorStateList.valueOf(-1));
        r69.setPadding(r68, r68, r68, r68);
        r69.setElevation(6.0f * r66);
        r69.setImportantForAccessibility(2);
        r61.addView(r69, new mb0(r67, r67));
        r61.getLayoutParams().height = -2;
        wb0 r70 = new wb0();
        r70.b(r61);
        r70.c(r69.getId(), 3, 3, (int) (8.0f * r66));
        int r71 = r69.getId();
        r70.c(r71, 1, 1, 0);
        r70.c(r71, 2, 2, 0);
        Integer r72 = Integer.valueOf(r71);
        HashMap r73 = r70.c;
        rb0 r74 = (rb0) r73.get(r72);
        if (r74 == null) goto L64;
        r74.d.w = 0.5f;
    L64:
        int r75 = r62.getId();
        int r76 = r69.getId();
        if (r73.containsKey(Integer.valueOf(r75)) == true) goto L67;
        r73.put(Integer.valueOf(r75), new rb0());
    L67:
        rb0 r77 = (rb0) r73.get(Integer.valueOf(r75));
        if (r77 == null) goto L71;
        sb0 r78 = r77.d;
        r78.m = r76;
        r78.l = -1;
        r78.p = -1;
        r78.q = -1;
        r78.r = -1;
    L71:
        r70.a(r61);
        r61.setConstraintSet(null);
        r61.requestLayout();
        goto L78
    L58:
        r114 = null;
        goto L59
    L73:
        if (r27.getString("MEDIA_DOWNLOADED") == null) goto L76;
        ui4 r79 = this.n0;
        r79.e = "MEDIA_DOWNLOADED";
        r79.f = s(R.string.song_list_page_downloaded);
        ((TextView) this.l0.d).setText(s(R.string.song_list_page_downloaded));
        goto L78
    L76:
        if (r27.getParcelable("ALBUM_OBJECT") == null) goto L78;
        this.n0.i = (AlbumID3) r27.getParcelable("ALBUM_OBJECT");
        ui4 r80 = this.n0;
        r80.e = "MEDIA_FROM_ALBUM";
        r80.f = r80.i.getName();
        ((TextView) this.l0.d).setText(this.n0.i.getName());
        goto L78
    L88:
        kf2.n("Local and anonymous classes can not be ViewModels");
        return null;
    L90:
        kf2.n("Local and anonymous classes can not be ViewModels");
        return null;
    L92:
        nz2.n("Missing required view with ID: ".concat(r0.getResources().getResourceName(r2)));
        return null;
    }

    @Override // defpackage.kc1
    public final void J() {
        this.R = true;
        this.l0 = null;
    }

    @Override // defpackage.kc1
    public final void P() {
        this.R = true;
        ni4 r0 = this.p0;
        r0.A = this.q0;
        if ("MEDIA_STARRED".equals(this.n0.e) == false) goto L6;
        i0();
        return;
    }

    @Override // defpackage.kc1
    public final void R() {
        this.R = true;
        Context r2 = Z();
        cb4 r3 = new cb4(Z(), new ComponentName(Z(), MediaService.class));
        Bundle r4 = Bundle.EMPTY;
        aj2 r5 = new aj2();
        Looper r6 = f35.x();
        bl2 r7 = new bl2(r6);
        if (r3.a.e() == false) goto L6;
        xc5 r0 = new xc5(4, new fi0(new x7(r2)));
    L7:
        b11.w(r7, new bj2(r2, r3, r4, r5, r6, r7, r0), new Handler(r6));
        this.q0 = r7;
        bo2.j(r7, this.o0);
        this.o0.b.e(v(), new oi4(this, 0));
        this.o0.c.e(v(), new oi4(this, 2));
        return;
    L6:
        r0 = null;
        goto L7
    }

    @Override // defpackage.kc1
    public final void S() {
        sk2.Z0(this.q0);
        this.R = true;
    }

    public final void h0(View r2) {
        ((InputMethodManager) X().getSystemService("input_method")).hideSoftInputFromWindow(r2.getWindowToken(), 0);
    }

    public final void i0() {
        final int r0 = this.s0 + 1;
        this.s0 = r0;
        if ("MEDIA_STARRED".equals(this.n0.e) == false) goto L6;
        wn1.a(new qi4(this, r0));
        return;
    L6:
        le1 r1 = v();
        this.n0.c().e(r1, new ri4(r0, 0, this));
    }

    public final void j0() {
        if (this.p0 == null) goto L12;
        String r0 = (String) this.o0.b.d();
        Boolean r1 = (Boolean) this.o0.c.d();
        ni4 r2 = this.p0;
        if (r1 != null) goto L7;
    L9:
        boolean r3 = false;
    L10:
        r2.s(r0, r3);
        return;
    L7:
        if (r1.booleanValue() == false) goto L9;
        r3 = true;
        goto L10
    }

    public final void k0(List r6) {
        if (r6 == null) goto L44;
        String r0 = this.n0.e;
        r0.getClass();
        byte r2 = -1;
        switch(r0.hashCode()) {
            case -1749690986: goto L24;
            case -241049756: goto L20;
            case 1434555764: goto L16;
            case 1594154365: goto L12;
            case 2022304170: goto L8;
            default: goto L28;
        };
    L8:
        if (r0.equals("MEDIA_BY_YEAR") == false) goto L28;
        r2 = 4;
        goto L28
    L12:
        if (r0.equals("MEDIA_BY_GENRES") == false) goto L28;
        r2 = 3;
        goto L28
    L16:
        if (r0.equals("MEDIA_BY_ARTIST") == false) goto L28;
        r2 = 2;
        goto L28
    L20:
        if (r0.equals("MEDIA_STARRED") == false) goto L28;
        r2 = 1;
        goto L28
    L24:
        if (r0.equals("MEDIA_BY_GENRE") == false) goto L28;
        r2 = 0;
    L28:
        switch(r2) {
            case 0: goto L38;
            case 1: goto L36;
            case 2: goto L36;
            case 3: goto L36;
            case 4: goto L30;
            default: goto L29;
        };
    L29:
        return;
    L30:
        TextView r3 = (TextView) this.l0.c;
        int r4 = r6.size();
        int r5 = this.n0.n;
        if (r4 >= r5) goto L33;
        String r7 = t(R.string.generic_list_page_count, new Object[]{Integer.valueOf(r6.size())});
    L34:
        r3.setText(r7);
        return;
    L33:
        r7 = t(R.string.generic_list_page_count_unknown, new Object[]{Integer.valueOf(r5)});
        goto L34
    L36:
        ((TextView) this.l0.c).setText(t(R.string.generic_list_page_count, new Object[]{Integer.valueOf(r6.size())}));
        return;
    L38:
        TextView r8 = (TextView) this.l0.c;
        int r9 = r6.size();
        int r10 = this.n0.o;
        if (r9 >= r10) goto L41;
        String r11 = t(R.string.generic_list_page_count, new Object[]{Integer.valueOf(r6.size())});
    L42:
        r8.setText(r11);
        return;
    L41:
        r11 = t(R.string.generic_list_page_count_unknown, new Object[]{Integer.valueOf(r10)});
        goto L42
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onMediaClick(Bundle r4) {
        h0(a0());
        bo2.q(this.q0, r4.getParcelableArrayList("TRACKS_OBJECT"), r4.getInt("ITEM_POSITION"), v13.c(this.n0.e));
        ((au) this.m0.V.n).d(true);
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onMediaLongClick(Bundle r3) {
        if ("MEDIA_STARRED".equals(this.n0.e) == false) goto L5;
        r3.putBoolean("homemusic_song_sheet_from_liked", true);
    L5:
        gb.x(a0()).m(R.id.songBottomSheetDialog, r3, null);
    }
}
