package com.eddyizm.tempus.ui.fragment;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import app.homemusic.R;
import com.eddyizm.tempus.interfaces.ClickCallback;
import com.eddyizm.tempus.service.MediaService;
import com.eddyizm.tempus.subsonic.models.ArtistID3;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.a0;
import defpackage.aj2;
import defpackage.au;
import defpackage.b11;
import defpackage.b75;
import defpackage.bj2;
import defpackage.bl2;
import defpackage.bo2;
import defpackage.bq4;
import defpackage.c12;
import defpackage.cb4;
import defpackage.d8;
import defpackage.e75;
import defpackage.ek1;
import defpackage.f35;
import defpackage.fi0;
import defpackage.gb;
import defpackage.gh0;
import defpackage.i30;
import defpackage.j8;
import defpackage.kc1;
import defpackage.kf2;
import defpackage.kx3;
import defpackage.l7;
import defpackage.le1;
import defpackage.li3;
import defpackage.n61;
import defpackage.nc1;
import defpackage.ni4;
import defpackage.nz2;
import defpackage.oj;
import defpackage.pa;
import defpackage.pj;
import defpackage.qj;
import defpackage.s6;
import defpackage.sc1;
import defpackage.sk2;
import defpackage.uo;
import defpackage.ut4;
import defpackage.v23;
import defpackage.v8;
import defpackage.wj;
import defpackage.x7;
import defpackage.xc5;
import defpackage.xg0;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class ArtistPageFragment extends kc1 implements ClickCallback {
    public sc1 l0;
    public MainActivity m0;
    public wj n0;
    public li3 o0;
    public ni4 p0;
    public v8 q0;
    public l7 r0;
    public s6 s0;
    public bl2 t0;
    public int u0;
    public int v0;
    public final Handler w0;
    public final a0 x0;

    public ArtistPageFragment() {
        this.u0 = 2;
        this.v0 = 20;
        this.w0 = new Handler(Looper.getMainLooper());
        this.x0 = new a0(6, this);
    }

    public static void h0(ArtistPageFragment r4, Button r5, int r6) {
        if (r5.getText() == null) goto L5;
        String r0 = r5.getText().toString();
    L6:
        if (r0 != null) goto L8;
        return;
    L8:
        if (r0.isEmpty() == true) goto L30;
        float r1 = r5.getPaint().measureText(r0);
        int r2 = ((r5.getWidth() - r5.getPaddingLeft()) - r5.getPaddingRight()) - ((int) ((48.0f * r4.Z().getResources().getDisplayMetrics().density) + 0.5f));
        if (r2 > 0) goto L13;
    L21:
        r5.setText("");
        r5.setContentDescription(r4.s(r6));     // Catch: Exception -> L24
        return;
    L13:
        if (r1 > r2) goto L21;
        if (r5.getContentDescription() != null) goto L18;
    L19:
        r5.setContentDescription(r4.s(r6));     // Catch: Exception -> L24
        return;
    L18:
        if (r5.getContentDescription().length() == 0) goto L19;
        return;
    L31:
        return;
    L30:
        return;
    L5:
        r0 = null;
        goto L6
    }

    @Override // defpackage.kc1
    public final View H(LayoutInflater r32, ViewGroup r33, Bundle r34) {
        this.m0 = (MainActivity) l();
        View r0 = r32.inflate(R.layout.fragment_artist_page, r33, false);
        int r1 = R.id.album_page_button_layout;
        if (((LinearLayout) uo.s(r0, R.id.album_page_button_layout)) == null) goto L117;
        r1 = R.id.all_albums_recycler_view;
        RecyclerView r9 = (RecyclerView) uo.s(r0, R.id.all_albums_recycler_view);
        if (r9 == null) goto L117;
        r1 = R.id.anim_toolbar;
        MaterialToolbar r10 = (MaterialToolbar) uo.s(r0, R.id.anim_toolbar);
        if (r10 == null) goto L117;
        r1 = R.id.appbar;
        if (((AppBarLayout) uo.s(r0, R.id.appbar)) == null) goto L117;
        r1 = R.id.appears_on_recycler_view;
        RecyclerView r11 = (RecyclerView) uo.s(r0, R.id.appears_on_recycler_view);
        if (r11 == null) goto L117;
        r1 = R.id.appears_on_see_all_text_view;
        TextView r12 = (TextView) uo.s(r0, R.id.appears_on_see_all_text_view);
        if (r12 == null) goto L117;
        r1 = R.id.artist_backdrop_image_view;
        ImageView r13 = (ImageView) uo.s(r0, R.id.artist_backdrop_image_view);
        if (r13 == null) goto L117;
        r1 = R.id.artist_page_all_albums_sectors;
        if (((LinearLayout) uo.s(r0, R.id.artist_page_all_albums_sectors)) == null) goto L117;
        r1 = R.id.artist_page_appears_on_sector;
        LinearLayout r14 = (LinearLayout) uo.s(r0, R.id.artist_page_appears_on_sector);
        if (r14 == null) goto L117;
        r1 = R.id.artist_page_bio_sector;
        LinearLayout r15 = (LinearLayout) uo.s(r0, R.id.artist_page_bio_sector);
        if (r15 == null) goto L117;
        r1 = R.id.artist_page_radio_button;
        Button r16 = (Button) uo.s(r0, R.id.artist_page_radio_button);
        if (r16 == null) goto L117;
        Button r17 = (Button) uo.s(r0, R.id.artist_page_shuffle_button);
        if (r17 == null) goto L116;
        int r5 = R.id.artist_page_top_songs_sector;
        LinearLayout r18 = (LinearLayout) uo.s(r0, R.id.artist_page_top_songs_sector);
        if (r18 == null) goto L115;
        r5 = R.id.artist_page_wave_button;
        if (((Button) uo.s(r0, R.id.artist_page_wave_button)) == null) goto L115;
        int r7 = R.id.bio_more_text_view_clickable;
        TextView r19 = (TextView) uo.s(r0, R.id.bio_more_text_view_clickable);
        if (r19 == null) goto L111;
        r7 = R.id.bio_text_view;
        TextView r20 = (TextView) uo.s(r0, R.id.bio_text_view);
        if (r20 == null) goto L111;
        r7 = R.id.bottom_button_divider;
        View r21 = uo.s(r0, R.id.bottom_button_divider);
        if (r21 == null) goto L111;
        if (((ToggleButton) uo.s(r0, R.id.button_favorite)) != null) goto L39;
        r5 = R.id.button_favorite;
        goto L115
    L39:
        if (((Button) uo.s(r0, R.id.button_more_options)) != null) goto L41;
        r7 = R.id.button_more_options;
        goto L111
    L41:
        if (((Button) uo.s(r0, R.id.button_toggle_bio)) == null) goto L112;
        r7 = R.id.collapsing_toolbar;
        CollapsingToolbarLayout r22 = (CollapsingToolbarLayout) uo.s(r0, R.id.collapsing_toolbar);
        if (r22 == null) goto L111;
        r7 = R.id.fragment_artist_page_nested_scroll_view;
        if (((NestedScrollView) uo.s(r0, R.id.fragment_artist_page_nested_scroll_view)) == null) goto L111;
        r7 = R.id.item_song_placeholder_1;
        View r23 = uo.s(r0, R.id.item_song_placeholder_1);
        if (r23 == null) goto L111;
        c12.f(r23);
        r7 = R.id.item_song_placeholder_2;
        View r24 = uo.s(r0, R.id.item_song_placeholder_2);
        if (r24 == null) goto L111;
        c12.f(r24);
        r7 = R.id.item_song_placeholder_3;
        View r25 = uo.s(r0, R.id.item_song_placeholder_3);
        if (r25 == null) goto L111;
        c12.f(r25);
        CoordinatorLayout r8 = (CoordinatorLayout) r0;
        r7 = R.id.most_streamed_song_recycler_container;
        LinearLayout r26 = (LinearLayout) uo.s(r0, R.id.most_streamed_song_recycler_container);
        if (r26 == null) goto L111;
        r7 = R.id.most_streamed_song_recycler_empty;
        TextView r27 = (TextView) uo.s(r0, R.id.most_streamed_song_recycler_empty);
        if (r27 == null) goto L111;
        r7 = R.id.most_streamed_song_recycler_placeholder;
        ShimmerFrameLayout r28 = (ShimmerFrameLayout) uo.s(r0, R.id.most_streamed_song_recycler_placeholder);
        if (r28 == null) goto L111;
        r7 = R.id.most_streamed_song_recycler_view;
        RecyclerView r29 = (RecyclerView) uo.s(r0, R.id.most_streamed_song_recycler_view);
        if (r29 == null) goto L111;
        r7 = R.id.most_streamed_song_text_view_clickable;
        TextView r210 = (TextView) uo.s(r0, R.id.most_streamed_song_text_view_clickable);
        if (r210 == null) goto L111;
        r7 = R.id.similar_artist_sector;
        LinearLayout r211 = (LinearLayout) uo.s(r0, R.id.similar_artist_sector);
        if (r211 == null) goto L111;
        r7 = R.id.similar_artists_recycler_view;
        RecyclerView r212 = (RecyclerView) uo.s(r0, R.id.similar_artists_recycler_view);
        if (r212 == null) goto L111;
        r7 = R.id.upper_button_divider;
        View r30 = uo.s(r0, R.id.upper_button_divider);
        if (r30 == null) goto L111;
        this.l0 = new sc1(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r26, r27, r28, r29, r210, r211, r212, r30);
        nc1 r31 = X();
        e75 r35 = r31.d();
        b75 r110 = gh0.r(r31);
        bq4 r111 = new bq4(r35, r110, b11.e(r31, r110));
        i30 r36 = kx3.a(wj.class);
        String r37 = r36.b();
        if (r37 == null) goto L109;
        this.n0 = (wj) r111.l(r36, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r37));
        nc1 r38 = X();
        e75 r39 = r38.d();
        b75 r112 = gh0.r(r38);
        bq4 r113 = new bq4(r39, r112, b11.e(r38, r112));
        i30 r40 = kx3.a(li3.class);
        String r41 = r40.b();
        if (r41 == null) goto L107;
        this.o0 = (li3) r113.l(r40, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r41));
        Bundle r42 = this.s;
        if (r42 == null) goto L75;
        ArtistID3 r43 = (ArtistID3) r42.getParcelable("ARTIST_OBJECT");
    L76:
        if (r43 != null) goto L83;
        MainActivity r2 = this.m0;
        if (r2 == null) goto L82;
        v23 r3 = r2.T;
        if (r3 == null) goto L82;
        r3.o();
    L82:
        return r8;
    L83:
        ut4.c().b(Z());
        ut4 r44 = ut4.c();
        Context r114 = Z();
        if (r44.h == true) goto L86;
        r44.b(r114);
    L86:
        this.u0 = r44.b;
        ut4 r45 = ut4.c();
        Context r115 = Z();
        if (r45.h == true) goto L89;
        r45.b(r115);
    L89:
        this.v0 = r45.c;
        wj r46 = this.n0;
        r46.e = r43;
        le1 r47 = v();
        pa r116 = r46.c;
        String r117 = r46.e.getId();
        r116.getClass();
        int r118 = 6;
        pa.v(r117).e(r47, new d8(r118, r46));
        int r119 = 1;
        this.l0.t.setOnClickListener(new pj(this, r119));
        ToggleButton r6 = (ToggleButton) r8.findViewById(R.id.button_favorite);
        String r48 = this.n0.e.getId();
        if (this.n0.e.getStarred() == null) goto L92;
        boolean r49 = true;
    L93:
        r6.setChecked(n61.f(3, r48, r49));
        int r50 = 2;
        r6.setOnClickListener(new pj(this, r50));
        ((Button) r8.findViewById(R.id.button_toggle_bio)).setOnClickListener(new pj(this, 3));
        int r51 = 4;
        ((Button) r8.findViewById(R.id.button_more_options)).setOnClickListener(new pj(this, r51));
        Button r4 = (Button) r8.findViewById(R.id.artist_page_shuffle_button);
        Button r52 = (Button) r8.findViewById(R.id.artist_page_radio_button);
        if (r4 == null) goto L97;
        if (r52 == null) goto L97;
        r8.getViewTreeObserver().addOnGlobalLayoutListener(new qj(this, r4, r52, r8));
    L97:
        this.m0.o(this.l0.c);
        if (this.m0.n() == null) goto L100;
        this.m0.n().f0(true);
    L100:
        this.l0.o.setTitle(this.n0.e.getName());
        this.l0.c.setNavigationOnClickListener(new pj(this, r118));
        this.l0.o.setExpandedTitleColor(r().getColor(R.color.white, null));
        wj r53 = this.n0;
        r53.c(r53.e.getId()).e(v(), new oj(this, r119));
        this.l0.j.setOnClickListener(new pj(this, 7));
        View r54 = this.l0.a.findViewById(R.id.artist_page_wave_button);
        String r55 = this.n0.e.getId();
        int r56 = 5;
        if (r55 != null) goto L103;
    L105:
        this.l0.i.setOnClickListener(new pj(this, 8));
        RecyclerView r57 = this.l0.s;
        Z();
        r57.setLayoutManager(new LinearLayoutManager(1));
        ni4 r58 = new ni4(v(), this, true, true, null);
        this.p0 = r58;
        this.l0.s.setAdapter(r58);
        this.p0.A = this.t0;
        i0();
        wj r59 = this.n0;
        pa r60 = r59.c;
        String r61 = r59.e.getName();
        r60.getClass();
        pa.z(20, r61).e(v(), new oj(this, r50));
        this.l0.q.setOnClickListener(new pj(this, 0));
        RecyclerView r62 = this.l0.b;
        Z();
        r62.setLayoutManager(new LinearLayoutManager(1));
        this.l0.b.setHasFixedSize(true);
        this.l0.b.setNestedScrollingEnabled(false);
        v8 r63 = new v8(Z(), this);
        this.q0 = r63;
        this.l0.b.setAdapter(r63);
        this.n0.g.e(v(), new oj(this, r51));
        RecyclerView r64 = this.l0.d;
        Z();
        r64.setLayoutManager(new LinearLayoutManager(0));
        this.l0.d.setHasFixedSize(true);
        this.l0.d.setNestedScrollingEnabled(false);
        l7 r65 = new l7(this, true);
        this.r0 = r65;
        this.l0.d.setAdapter(r65);
        this.n0.f.e(v(), new oj(this, r56));
        RecyclerView r66 = this.l0.v;
        Z();
        r66.setLayoutManager(new GridLayoutManager(this.u0));
        this.l0.v.i(new ek1(this.u0, this.v0));
        this.l0.v.setHasFixedSize(true);
        s6 r67 = new s6(this);
        this.s0 = r67;
        this.l0.v.setAdapter(r67);
        wj r68 = this.n0;
        r68.c(r68.e.getId()).e(v(), new oj(this, r118));
        new xg0(0).a(this.l0.v);
        return r8;
    L103:
        if (r55.trim().isEmpty() == true) goto L105;
        r54.setVisibility(0);
        r54.setOnClickListener(new j8(r56, this, r55));
        goto L105
    L92:
        r49 = false;
        goto L93
    L75:
        r43 = null;
        goto L76
    L107:
        kf2.n("Local and anonymous classes can not be ViewModels");
        return null;
    L109:
        kf2.n("Local and anonymous classes can not be ViewModels");
        return null;
    L112:
        r1 = R.id.button_toggle_bio;
    L111:
        r1 = r7;
    L115:
        r1 = r5;
        goto L117
    L116:
        r1 = R.id.artist_page_shuffle_button;
    L117:
        nz2.n("Missing required view with ID: ".concat(r0.getResources().getResourceName(r1)));
        return null;
    }

    @Override // defpackage.kc1
    public final void J() {
        this.R = true;
        this.w0.removeCallbacks(this.x0);
        this.l0 = null;
    }

    @Override // defpackage.kc1
    public final void P() {
        this.R = true;
        ni4 r0 = this.p0;
        if (r0 == null) goto L6;
        r0.A = this.t0;
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
        fi0 r8 = new fi0(new x7(r2));
        xc5 r0 = new xc5(4, r8);
    L7:
        b11.w(r7, new bj2(r2, r3, r4, r5, r6, r7, r0), new Handler(r6));
        this.t0 = r7;
        bo2.j(r7, this.o0);
        this.o0.b.e(v(), new oj(this, 0));
        this.o0.c.e(v(), new oj(this, 3));
        return;
    L6:
        r0 = null;
        goto L7
    }

    @Override // defpackage.kc1
    public final void S() {
        sk2.Z0(this.t0);
        this.w0.removeCallbacks(this.x0);
        this.R = true;
    }

    public final void i0() {
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

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onAlbumClick(Bundle r3) {
        gb.x(a0()).m(R.id.albumPageFragment, r3, null);
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onAlbumLongClick(Bundle r3) {
        gb.x(a0()).m(R.id.albumBottomSheetDialog, r3, null);
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onArtistClick(Bundle r3) {
        gb.x(a0()).m(R.id.artistPageFragment, r3, null);
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onArtistLongClick(Bundle r3) {
        gb.x(a0()).m(R.id.artistBottomSheetDialog, r3, null);
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onMediaClick(Bundle r4) {
        bo2.q(this.t0, r4.getParcelableArrayList("TRACKS_OBJECT"), r4.getInt("ITEM_POSITION"), "artist");
        ((au) this.m0.V.n).d(true);
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onMediaLongClick(Bundle r3) {
        gb.x(a0()).m(R.id.songBottomSheetDialog, r3, null);
    }
}
