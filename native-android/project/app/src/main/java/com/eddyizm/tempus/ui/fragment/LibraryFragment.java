package com.eddyizm.tempus.ui.fragment;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import app.homemusic.R;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.interfaces.ClickCallback;
import com.eddyizm.tempus.subsonic.models.MusicFolder;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.b11;
import defpackage.b75;
import defpackage.bq4;
import defpackage.cn;
import defpackage.d7;
import defpackage.e75;
import defpackage.g7;
import defpackage.gb;
import defpackage.gh0;
import defpackage.i30;
import defpackage.j92;
import defpackage.k03;
import defpackage.k92;
import defpackage.kc1;
import defpackage.kf2;
import defpackage.kx3;
import defpackage.l92;
import defpackage.le1;
import defpackage.mp1;
import defpackage.n92;
import defpackage.nc1;
import defpackage.nz2;
import defpackage.om1;
import defpackage.pa;
import defpackage.q7;
import defpackage.qm4;
import defpackage.qr2;
import defpackage.rn1;
import defpackage.rv2;
import defpackage.s6;
import defpackage.tn1;
import defpackage.uo;
import defpackage.vf2;
import defpackage.vg2;
import defpackage.vi;
import defpackage.wn1;
import defpackage.xa3;
import defpackage.xc1;
import defpackage.xg0;
import defpackage.y41;
import defpackage.zd0;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class LibraryFragment extends kc1 implements ClickCallback {
    public xc1 l0;
    public MainActivity m0;
    public om1 n0;
    public n92 o0;
    public vf2 p0;
    public s6 q0;
    public vi r0;
    public zd0 s0;
    public q7 t0;
    public MaterialToolbar u0;

    public LibraryFragment() {
    }

    @Override // defpackage.kc1
    public final View H(LayoutInflater r30, ViewGroup r31, Bundle r32) {
        MainActivity r1 = (MainActivity) l();
        this.m0 = r1;
        this.n0 = r1.U;
        final int r2 = 0;
        View r3 = r30.inflate(R.layout.fragment_library, r31, false);
        int r4 = R.id.album_catalogue_sample_text_view_refreshable;
        LinearLayout r7 = (LinearLayout) uo.s(r3, R.id.album_catalogue_sample_text_view_refreshable);
        if (r7 == null) goto L60;
        r4 = R.id.album_catalogue_text_view_clickable;
        TextView r8 = (TextView) uo.s(r3, R.id.album_catalogue_text_view_clickable);
        if (r8 == null) goto L60;
        r4 = R.id.album_recycler_view;
        RecyclerView r9 = (RecyclerView) uo.s(r3, R.id.album_recycler_view);
        if (r9 == null) goto L60;
        r4 = R.id.artist_catalogue_sample_text_view_refreshable;
        LinearLayout r10 = (LinearLayout) uo.s(r3, R.id.artist_catalogue_sample_text_view_refreshable);
        if (r10 == null) goto L60;
        r4 = R.id.artist_catalogue_text_view_clickable;
        TextView r11 = (TextView) uo.s(r3, R.id.artist_catalogue_text_view_clickable);
        if (r11 == null) goto L60;
        r4 = R.id.artist_recycler_view;
        RecyclerView r12 = (RecyclerView) uo.s(r3, R.id.artist_recycler_view);
        if (r12 == null) goto L60;
        r4 = R.id.fragment_library_nested_scroll_view;
        if (((NestedScrollView) uo.s(r3, R.id.fragment_library_nested_scroll_view)) == null) goto L60;
        r4 = R.id.genre_catalogue_sample_text_view_refreshable;
        LinearLayout r13 = (LinearLayout) uo.s(r3, R.id.genre_catalogue_sample_text_view_refreshable);
        if (r13 == null) goto L60;
        r4 = R.id.genre_catalogue_text_view_clickable;
        TextView r14 = (TextView) uo.s(r3, R.id.genre_catalogue_text_view_clickable);
        if (r14 == null) goto L60;
        r4 = R.id.genre_recycler_view;
        RecyclerView r15 = (RecyclerView) uo.s(r3, R.id.genre_recycler_view);
        if (r15 == null) goto L60;
        r4 = R.id.library_album_sector;
        LinearLayout r16 = (LinearLayout) uo.s(r3, R.id.library_album_sector);
        if (r16 == null) goto L60;
        r4 = R.id.library_artist_sector;
        LinearLayout r17 = (LinearLayout) uo.s(r3, R.id.library_artist_sector);
        if (r17 == null) goto L60;
        r4 = R.id.library_genres_sector;
        LinearLayout r18 = (LinearLayout) uo.s(r3, R.id.library_genres_sector);
        if (r18 == null) goto L60;
        r4 = R.id.library_liked_songs_count;
        TextView r19 = (TextView) uo.s(r3, R.id.library_liked_songs_count);
        if (r19 == null) goto L60;
        r4 = R.id.library_liked_songs_row;
        LinearLayout r20 = (LinearLayout) uo.s(r3, R.id.library_liked_songs_row);
        if (r20 == null) goto L60;
        r4 = R.id.library_linear_layout_container;
        if (((LinearLayout) uo.s(r3, R.id.library_linear_layout_container)) == null) goto L60;
        r4 = R.id.library_music_folder_sector;
        LinearLayout r21 = (LinearLayout) uo.s(r3, R.id.library_music_folder_sector);
        if (r21 == null) goto L60;
        r4 = R.id.library_playlist_sector;
        LinearLayout r22 = (LinearLayout) uo.s(r3, R.id.library_playlist_sector);
        if (r22 == null) goto L60;
        r4 = R.id.music_folder_hide_text_view_clickable;
        TextView r23 = (TextView) uo.s(r3, R.id.music_folder_hide_text_view_clickable);
        if (r23 == null) goto L60;
        r4 = R.id.music_folder_recycler_view;
        RecyclerView r24 = (RecyclerView) uo.s(r3, R.id.music_folder_recycler_view);
        if (r24 == null) goto L60;
        r4 = R.id.playlist_catalogue_sample_text_view_refreshable;
        LinearLayout r25 = (LinearLayout) uo.s(r3, R.id.playlist_catalogue_sample_text_view_refreshable);
        if (r25 == null) goto L60;
        r4 = R.id.playlist_catalogue_text_view_clickable;
        TextView r26 = (TextView) uo.s(r3, R.id.playlist_catalogue_text_view_clickable);
        if (r26 == null) goto L60;
        r4 = R.id.playlist_recycler_view;
        RecyclerView r27 = (RecyclerView) uo.s(r3, R.id.playlist_recycler_view);
        if (r27 == null) goto L60;
        r4 = R.id.swipe_library_to_refresh;
        SwipeRefreshLayout r28 = (SwipeRefreshLayout) uo.s(r3, R.id.swipe_library_to_refresh);
        if (r28 == null) goto L60;
        CoordinatorLayout r6 = (CoordinatorLayout) r3;
        this.l0 = new xc1(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28);
        nc1 r5 = X();
        e75 r29 = r5.d();
        b75 r33 = gh0.r(r5);
        bq4 r34 = new bq4(r29, r33, b11.e(r5, r33));
        i30 r35 = kx3.a(n92.class);
        String r36 = r35.b();
        if (r36 == null) goto L58;
        this.o0 = (n92) r34.l(r35, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r36));
        nc1 r37 = X();
        e75 r38 = r37.d();
        b75 r39 = gh0.r(r37);
        bq4 r40 = new bq4(r38, r39, b11.e(r37, r39));
        i30 r41 = kx3.a(vf2.class);
        String r42 = r41.b();
        if (r42 == null) goto L56;
        this.p0 = (vf2) r40.l(r41, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r42));
        this.o0.c();
        LinearLayout r43 = this.l0.o;
        k03 r44 = wn1.a;
        r43.setOnClickListener(new tn1(this, r2));
        final int r45 = 9;
        this.l0.r.setOnClickListener(new tn1(this, r45));
        final int r46 = 3;
        this.l0.c.setOnClickListener(new tn1(this, r46));
        final int r47 = 4;
        this.l0.f.setOnClickListener(new tn1(this, r47));
        final int r48 = 5;
        this.l0.i.setOnClickListener(new tn1(this, r48));
        final int r49 = 6;
        this.l0.t.setOnClickListener(new tn1(this, r49));
        final int r50 = 1;
        this.l0.b.setOnLongClickListener(new k92(this, r50));
        final int r51 = 7;
        this.l0.b.setOnClickListener(new tn1(this, r51));
        final int r52 = 2;
        this.l0.e.setOnLongClickListener(new k92(this, r52));
        final int r53 = 8;
        this.l0.e.setOnClickListener(new tn1(this, r53));
        this.l0.h.setOnLongClickListener(new k92(this, r46));
        this.l0.h.setOnClickListener(new tn1(this, r50));
        this.l0.s.setOnLongClickListener(new k92(this, r2));
        this.l0.s.setOnClickListener(new tn1(this, r52));
        return r6;
    L56:
        kf2.n("Local and anonymous classes can not be ViewModels");
        return null;
    L58:
        kf2.n("Local and anonymous classes can not be ViewModels");
        return null;
    L60:
        nz2.n("Missing required view with ID: ".concat(r3.getResources().getResourceName(r4)));
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
        new Handler().postDelayed(new l92(this, 0), 100);
        wn1.a(new d7(4, this.l0.n));
    }

    @Override // defpackage.kc1
    public final void R() {
        this.R = true;
        this.m0.J();
    }

    @Override // defpackage.kc1
    public final void T(View r10, Bundle r11) {
        MaterialToolbar r12 = (MaterialToolbar) this.l0.a.findViewById(R.id.toolbar);
        this.u0 = r12;
        this.m0.o(r12);
        this.n0.n(this.m0, this.u0);
        Drawable r13 = this.u0.getOverflowIcon();
        Objects.requireNonNull(r13);
        r13.setTint(Z().getResources().getColor(R.color.titleTextColor, null));
        this.l0.p.setVisibility(8);
        RecyclerView r14 = this.l0.d;
        Z();
        final int r0 = 0;
        r14.setLayoutManager(new LinearLayoutManager(0));
        final int r15 = 1;
        this.l0.d.setHasFixedSize(true);
        s6 r16 = new s6(this);
        this.q0 = r16;
        this.l0.d.setAdapter(r16);
        n92 r17 = this.o0;
        le1 r2 = v();
        k03 r3 = r17.j;
        if (r3.d() != null) goto L5;
        r17.d.getClass();
        rv2.m("random", 10, null, null).e(r2, new mp1(r17, r17.n, r3, 1));
    L5:
        final int r4 = 4;
        r3.e(v(), new j92(this, r4));
        new xg0(0).a(this.l0.d);
        RecyclerView r18 = this.l0.g;
        Z();
        r18.setLayoutManager(new LinearLayoutManager(0));
        this.l0.g.setHasFixedSize(true);
        Boolean r1 = Boolean.FALSE;
        vi r19 = new vi(this, r1, r1);
        this.r0 = r19;
        this.l0.g.setAdapter(r19);
        n92 r110 = this.o0;
        le1 r5 = v();
        k03 r6 = r110.k;
        final int r7 = 3;
        if (r6.d() != null) goto L8;
        pa r8 = r110.e;
        r8.getClass();
        k03 r9 = new k03();
        App.f(false).c().j().enqueue(new qr2(r7, r8, r9));
        r9.e(r5, new mp1(r110, r110.n, r6, 1));
    L8:
        r6.e(v(), new j92(this, r7));
        new xg0(0).a(this.l0.g);
        RecyclerView r111 = this.l0.j;
        Z();
        r111.setLayoutManager(new GridLayoutManager(3, 0));
        this.l0.j.setHasFixedSize(true);
        zd0 r112 = new zd0(this);
        this.s0 = r112;
        this.l0.j.setAdapter(r112);
        n92 r113 = this.o0;
        le1 r20 = v();
        k03 r21 = r113.l;
        if (r21.d() != null) goto L11;
        r113.f.getClass();
        y41.j(15, true).e(r20, new g7(r21, 0));
    L11:
        r21.e(v(), new j92(this, r15));
        new xg0(0).a(this.l0.j);
        RecyclerView r114 = this.l0.u;
        r114.getContext();
        r114.setLayoutManager(new LinearLayoutManager(0));
        r114.setHasFixedSize(true);
        r114.setPaddingRelative((int) (16.0f * r114.getResources().getDisplayMetrics().density), r114.getPaddingTop(), r114.getPaddingEnd(), r114.getPaddingBottom());
        q7 r22 = new q7(this, false);
        r114.setAdapter(r22);
        new xg0(0).a(r114);
        this.t0 = r22;
        n92 r115 = this.o0;
        le1 r23 = v();
        k03 r24 = r115.i;
        if (r24.d() != null) goto L14;
        r115.g.d(10, true).e(r23, new g7(r24, 0));
    L14:
        r24.e(v(), new j92(this, r0));
        this.l0.v.setOnRefreshListener(new cn(20, this));
        final int r25 = 2;
        this.p0.d.e(v(), new j92(this, r25));
    }

    public final void h0(MusicFolder r9) {
        if (r9 == null) goto L5;
        String r10 = r9.getName();
    L6:
        l92 r1 = new l92(this, 1);
        l92 r2 = new l92(this, 2);
        k03 r3 = wn1.a;
        Context r4 = Z();
        if (r10 != null) goto L9;
    L13:
        r10 = r4.getString(R.string.library_title_music_folder);
        r10.getClass();
    L14:
        vg2 r5 = new vg2(r4, 0);
        r5.p(R.string.homemusic_folders_hide_title);
        r5.a.f = r4.getString(R.string.homemusic_folders_hide_message, new Object[]{xa3.h("«", r10, "»")});
        r5.l(R.string.homemusic_folders_hide, new rn1(r1, this, r2, 0)).j(R.string.homemusic_cancel, null).h();
        return;
    L9:
        if (qm4.u0(r10) == false) goto L12;
        r10 = null;
    L12:
        if (r10 != null) goto L14;
    L5:
        r10 = null;
        goto L6
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
    public final void onGenreClick(Bundle r3) {
        gb.x(a0()).m(R.id.songListPageFragment, r3, null);
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onMusicFolderClick(Bundle r3) {
        gb.x(a0()).m(R.id.indexFragment, r3, null);
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onMusicFolderLongClick(Bundle r2) {
        h0((MusicFolder) r2.getParcelable("MUSIC_FOLDER_OBJECT"));
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onPlaylistClick(Bundle r3) {
        gb.x(a0()).m(R.id.playlistPageFragment, r3, null);
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onPlaylistLongClick(Bundle r3) {
        gb.x(a0()).m(R.id.playlistRowBottomSheetDialog, r3, null);
    }
}
