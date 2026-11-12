package com.eddyizm.tempus.ui.fragment;

import android.content.ComponentName;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import app.homemusic.R;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.interfaces.ClickCallback;
import com.eddyizm.tempus.service.MediaService;
import com.eddyizm.tempus.subsonic.models.AlbumID3;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.a0;
import defpackage.aj2;
import defpackage.au;
import defpackage.au0;
import defpackage.b11;
import defpackage.b75;
import defpackage.bj2;
import defpackage.bl2;
import defpackage.bo2;
import defpackage.bq4;
import defpackage.cb4;
import defpackage.d7;
import defpackage.d8;
import defpackage.e75;
import defpackage.f35;
import defpackage.fi0;
import defpackage.fl3;
import defpackage.g8;
import defpackage.gb;
import defpackage.gh0;
import defpackage.gi1;
import defpackage.gp3;
import defpackage.hu3;
import defpackage.i30;
import defpackage.k03;
import defpackage.k8;
import defpackage.kc1;
import defpackage.kf2;
import defpackage.kx3;
import defpackage.l8;
import defpackage.le1;
import defpackage.li3;
import defpackage.n61;
import defpackage.n8;
import defpackage.nc1;
import defpackage.ni4;
import defpackage.nz2;
import defpackage.ou3;
import defpackage.ov;
import defpackage.pc1;
import defpackage.pn4;
import defpackage.q8;
import defpackage.rv2;
import defpackage.sk2;
import defpackage.ud3;
import defpackage.uo;
import defpackage.v23;
import defpackage.x7;
import defpackage.xc5;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class AlbumPageFragment extends kc1 implements ClickCallback {
    public pc1 l0;
    public MainActivity m0;
    public n8 n0;
    public li3 o0;
    public ni4 p0;
    public bl2 q0;
    public k03 r0;
    public g8 s0;

    public AlbumPageFragment() {
    }

    @Override // defpackage.kc1
    public final void F(Bundle r1) {
        super.F(r1);
        d0();
    }

    @Override // defpackage.kc1
    public final void G(Menu r1, MenuInflater r2) {
        r2.inflate(R.menu.album_page_menu, r1);
    }

    @Override // defpackage.kc1
    public final View H(LayoutInflater r25, ViewGroup r26, Bundle r27) {
        this.m0 = (MainActivity) l();
        final int r2 = 0;
        View r1 = r25.inflate(R.layout.fragment_album_page, r26, false);
        int r3 = R.id.album_artist_label;
        TextView r7 = (TextView) uo.s(r1, R.id.album_artist_label);
        if (r7 == null) goto L86;
        r3 = R.id.album_bio_label;
        if (((TextView) uo.s(r1, R.id.album_bio_label)) == null) goto L86;
        r3 = R.id.album_cover_image_view;
        ImageView r8 = (ImageView) uo.s(r1, R.id.album_cover_image_view);
        if (r8 == null) goto L86;
        r3 = R.id.album_detail_view;
        ConstraintLayout r9 = (ConstraintLayout) uo.s(r1, R.id.album_detail_view);
        if (r9 == null) goto L86;
        r3 = R.id.album_genres_textview;
        TextView r10 = (TextView) uo.s(r1, R.id.album_genres_textview);
        if (r10 == null) goto L86;
        NestedScrollView r5 = (NestedScrollView) uo.s(r1, R.id.album_info_scroll_view);
        int r6 = R.id.album_info_sector;
        if (((ConstraintLayout) uo.s(r1, R.id.album_info_sector)) == null) goto L85;
        r6 = R.id.album_name_label;
        TextView r11 = (TextView) uo.s(r1, R.id.album_name_label);
        if (r11 == null) goto L85;
        r6 = R.id.album_notes_textview;
        TextView r12 = (TextView) uo.s(r1, R.id.album_notes_textview);
        if (r12 == null) goto L85;
        r6 = R.id.album_other_info_button;
        FrameLayout r13 = (FrameLayout) uo.s(r1, R.id.album_other_info_button);
        if (r13 == null) goto L85;
        r6 = R.id.album_page_button_layout;
        if (((LinearLayout) uo.s(r1, R.id.album_page_button_layout)) == null) goto L85;
        r6 = R.id.album_page_play_button;
        Button r14 = (Button) uo.s(r1, R.id.album_page_play_button);
        if (r14 == null) goto L85;
        r6 = R.id.album_page_shuffle_button;
        Button r15 = (Button) uo.s(r1, R.id.album_page_shuffle_button);
        if (r15 == null) goto L85;
        r6 = R.id.album_release_year_label;
        TextView r16 = (TextView) uo.s(r1, R.id.album_release_year_label);
        if (r16 == null) goto L85;
        r6 = R.id.album_release_years_textview;
        TextView r17 = (TextView) uo.s(r1, R.id.album_release_years_textview);
        if (r17 == null) goto L85;
        r6 = R.id.album_song_count_duration_textview;
        TextView r18 = (TextView) uo.s(r1, R.id.album_song_count_duration_textview);
        if (r18 == null) goto L85;
        r6 = R.id.anim_toolbar;
        MaterialToolbar r19 = (MaterialToolbar) uo.s(r1, R.id.anim_toolbar);
        if (r19 == null) goto L85;
        r6 = R.id.app_bar_layout;
        if (((AppBarLayout) uo.s(r1, R.id.app_bar_layout)) == null) goto L85;
        r6 = R.id.bottom_button_divider;
        View r20 = uo.s(r1, R.id.bottom_button_divider);
        if (r20 == null) goto L85;
        if (((ToggleButton) uo.s(r1, R.id.button_favorite)) == null) goto L84;
        int r21 = R.id.song_recycler_view;
        RecyclerView r22 = (RecyclerView) uo.s(r1, R.id.song_recycler_view);
        if (r22 == null) goto L83;
        r21 = R.id.upper_button_divider;
        View r23 = uo.s(r1, R.id.upper_button_divider);
        if (r23 == null) goto L83;
        LinearLayout r24 = (LinearLayout) r1;
        this.l0 = new pc1(r24, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r22, r23);
        nc1 r28 = X();
        e75 r29 = r28.d();
        b75 r30 = gh0.r(r28);
        bq4 r31 = new bq4(r29, r30, b11.e(r28, r30));
        i30 r32 = kx3.a(n8.class);
        String r33 = r32.b();
        if (r33 == null) goto L81;
        this.n0 = (n8) r31.l(r32, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r33));
        nc1 r34 = X();
        e75 r35 = r34.d();
        b75 r36 = gh0.r(r34);
        bq4 r110 = new bq4(r35, r36, b11.e(r34, r36));
        i30 r37 = kx3.a(li3.class);
        String r38 = r37.b();
        if (r38 == null) goto L79;
        this.o0 = (li3) r110.l(r37, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r38));
        Bundle r39 = this.s;
        if (r39 != null) goto L56;
        Log.e("AlbumPageFragment", "Arguments are null after process restoration.");
        MainActivity r0 = this.m0;
        if (r0 == null) goto L63;
        v23 r4 = r0.T;
        if (r4 == null) goto L63;
        r4.o();
        return r24;
    L63:
        return r24;
    L56:
        AlbumID3 r40 = (AlbumID3) r39.getParcelable("ALBUM_OBJECT");
        if (r40 != null) goto L64;
        MainActivity r41 = this.m0;
        if (r41 == null) goto L63;
        v23 r42 = r41.T;
        if (r42 == null) goto L63;
        r42.o();
        goto L63
    L64:
        n8 r43 = this.n0;
        le1 r44 = v();
        r43.getClass();
        r43.f = r40.getId();
        r43.h.i(r40);
        r43.g = r40.getArtistId();
        rv2 r45 = r43.c;
        String r111 = r43.f;
        r45.getClass();
        r43.i = rv2.l(r111);
        final int r112 = 2;
        rv2.j(r40.getId()).e(r44, new d8(r112, r43));
        ToggleButton r46 = (ToggleButton) r24.findViewById(R.id.button_favorite);
        String r47 = r40.getId();
        final int r48 = 1;
        if (r40.getStarred() == null) goto L67;
        boolean r49 = true;
    L68:
        r46.setChecked(n61.f(2, r47, r49));
        final int r50 = 3;
        r46.setOnClickListener(new k8(this, r50));
        this.n0.h.e(v(), new d8(r48, r46));
        this.m0.o((MaterialToolbar) this.l0.n);
        if (this.m0.n() == null) goto L71;
        this.m0.n().f0(true);
        this.m0.n().g0();
    L71:
        this.n0.h.e(v(), new g8(this, 7));
        ((MaterialToolbar) this.l0.n).setNavigationOnClickListener(new k8(this, r2));
        Drawable r51 = ((MaterialToolbar) this.l0.n).getOverflowIcon();
        Objects.requireNonNull(r51);
        r51.setTint(Z().getResources().getColor(R.color.titleTextColor, null));
        ((FrameLayout) this.l0.k).setOnClickListener(new k8(this, r48));
        App.b().getClass();
        if (App.c().getBoolean("album_detail", false) == false) goto L74;
        this.l0.a.setVisibility(0);
    L74:
        this.l0.c.setOnClickListener(new k8(this, r112));
        n8 r52 = this.n0;
        rv2 r53 = r52.c;
        String r54 = r52.f;
        r53.getClass();
        k03 r55 = new k03();
        gp3 r56 = App.f(false).c();
        r56.getClass();
        Log.d("BrowsingClient", "getAlbumInfo2()");
        ((ov) r56.p).d(((pn4) r56.o).f(), r54).enqueue(new q8(r55, r2));
        r55.e(v(), new g8(this, r48));
        this.n0.i.e(v(), new g8(this, r112));
        this.n0.h.e(v(), new g8(this, 8));
        RecyclerView r57 = (RecyclerView) this.l0.q;
        Z();
        r57.setLayoutManager(new LinearLayoutManager(1));
        ((RecyclerView) this.l0.q).setHasFixedSize(true);
        ((RecyclerView) this.l0.q).setClipToPadding(false);
        ((RecyclerView) this.l0.q).post(new a0(r50, this));
        if (((LinearLayout) this.l0.b).findViewById(R.id.album_info_scroll_view) == null) goto L77;
        ((RecyclerView) this.l0.q).j(new l8((NestedScrollView) ((LinearLayout) this.l0.b).findViewById(R.id.album_info_scroll_view), 0));
    L77:
        this.n0.h.e(v(), new g8(this, 6));
        return r24;
    L67:
        r49 = false;
        goto L68
    L79:
        kf2.n("Local and anonymous classes can not be ViewModels");
        return null;
    L81:
        kf2.n("Local and anonymous classes can not be ViewModels");
        return null;
    L83:
        r3 = r21;
        goto L86
    L84:
        r3 = R.id.button_favorite;
    L85:
        r3 = r6;
    L86:
        nz2.n("Missing required view with ID: ".concat(r1.getResources().getResourceName(r3)));
        return null;
    }

    @Override // defpackage.kc1
    public final void J() {
        i0();
        this.R = true;
        this.l0 = null;
    }

    @Override // defpackage.kc1
    public final boolean N(MenuItem r6) {
        if (r6.getItemId() != R.id.action_rate_album) goto L6;
        Bundle r7 = new Bundle();
        r7.putParcelable("ALBUM_OBJECT", ((AlbumID3) this.n0.h.d()).strippedForNav());
        ou3 r0 = new ou3();
        r0.c0(r7);
        r0.m0(X().k(), null);
        return true;
    L6:
        boolean r4 = false;
        if (r6.getItemId() != R.id.action_download_album) goto L20;
        List r8 = (List) this.n0.i.d();
        if (r8 != null) goto L11;
    L43:
        return true;
    L11:
        if (r8.isEmpty() == true) goto L43;
        if (ud3.o() != null) goto L17;
        au0.w(Z()).a(gi1.H(r8), (List) r8.stream().map(new hu3(6)).collect(Collectors.toList()), false);
        return true;
    L17:
        r8.forEach(new d7(1, this));
        return true;
    L20:
        if (r6.getItemId() != R.id.action_add_to_playlist) goto L29;
        List r9 = (List) this.n0.i.d();
        if (r9 == null) goto L43;
        if (r9.isEmpty() == true) goto L43;
        Bundle r1 = new Bundle();
        r1.putParcelableArrayList("TRACKS_OBJECT", new ArrayList(r9));
        fl3 r10 = new fl3();
        r10.c0(r1);
        r10.m0(X().k(), null);
        return true;
    L29:
        if (r6.getItemId() == R.id.action_play_next) goto L35;
        if (r6.getItemId() == R.id.action_add_to_queue) goto L35;
        return false;
    L35:
        if (r6.getItemId() != R.id.action_play_next) goto L37;
        r4 = true;
    L37:
        List r11 = (List) this.n0.i.d();
        if (r11 == null) goto L43;
        if (r11.isEmpty() == true) goto L43;
        bo2.e(this.q0, r11, r4);
        ((au) this.m0.V.n).d(true);
        goto L43
    }

    @Override // defpackage.kc1
    public final void P() {
        this.R = true;
        ni4 r0 = this.p0;
        if (r0 == null) goto L6;
        r0.A = this.q0;
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
        int r9 = 4;
        if (r3.a.e() == false) goto L6;
        xc5 r0 = new xc5(4, new fi0(new x7(r2)));
    L7:
        b11.w(r7, new bj2(r2, r3, r4, r5, r6, r7, r0), new Handler(r6));
        this.q0 = r7;
        bo2.j(r7, this.o0);
        this.o0.b.e(v(), new g8(this, 0));
        this.o0.c.e(v(), new g8(this, r9));
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

    public final void h0() {
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

    public final void i0() {
        k03 r0 = this.r0;
        if (r0 == null) goto L7;
        g8 r1 = this.s0;
        if (r1 == null) goto L7;
        r0.j(r1);
    L7:
        this.r0 = null;
        this.s0 = null;
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onMediaClick(Bundle r4) {
        bo2.q(this.q0, r4.getParcelableArrayList("TRACKS_OBJECT"), r4.getInt("ITEM_POSITION"), "album");
        ((au) this.m0.V.n).d(true);
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onMediaLongClick(Bundle r3) {
        gb.x(a0()).m(R.id.songBottomSheetDialog, r3, null);
    }
}
